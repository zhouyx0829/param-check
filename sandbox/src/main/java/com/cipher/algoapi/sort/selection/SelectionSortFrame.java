package com.cipher.algoapi.sort.selection;

import com.cipher.algoapi.base.AlgoFrame;
import com.cipher.algoapi.base.AlgoVisHelper;

/**
 * @Author: CipherCui
 * @Description:
 * @Date: Created in 17:37 2018/9/15
 */
public class SelectionSortFrame extends AlgoFrame {

    public SelectionSortFrame(String title, int canvasWidth, int canvasHeight) {
        super(title, canvasWidth, canvasHeight);
    }

    @Override
    public void paint(AlgoVisHelper algoVisHelper, Object data) {
        SelectionSortData sortData = (SelectionSortData) data;
        int w = getCanvasWidth() / sortData.N();
        for (int i = 0; i < sortData.N(); i++) {
            if (i < sortData.orderedIndex) {
                algoVisHelper.setColor(AlgoVisHelper.Red);
            } else {
                algoVisHelper.setColor(AlgoVisHelper.Grey);
            }
            if (i == sortData.currentCompareIndex) {
                algoVisHelper.setColor(AlgoVisHelper.LightBlue);
            }
            if (i == sortData.currentMinIndex) {
                algoVisHelper.setColor(AlgoVisHelper.Indigo);
            }
            algoVisHelper.fillRectangle(i * w, getCanvasHeight() - sortData.get(i), w - 1, sortData.get(i));
        }
    }

}
