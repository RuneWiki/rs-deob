import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class63 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lqt;")
    public static class459 field1089;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[I")
    public static int[] field1093;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "[[I")
    public static int[][] field1092;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field1090;

    static {
        new class44("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field1089 = new class459(41, 4);
        field1091 = 0;
        field1093 = new int[6];
        field1092 = new int[6][];
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLwn;)V", line = 13)
    public static final void method516(byte arg0, class519 arg1) {
        field1088++;
        int var2 = arg1.method3033(11790);
        if (arg0 < 94) {
            return;
        }
        class10.field100 = new class383[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class10.field100[var3] = new class383();
            class10.field100[var3].field5489 = arg1.method3033(11790);
            class10.field100[var3].field5487 = arg1.method3070(false);
        }
        class455.field6620 = arg1.method3033(11790);
        class22.field231 = arg1.method3033(11790);
        class400.field5684 = arg1.method3033(11790);
        class488.field7055 = new class219[class22.field231 + 1 - class455.field6620];
        for (int var4 = 0; var4 < class400.field5684; var4++) {
            int var5 = arg1.method3033(11790);
            class219 var6 = class488.field7055[var5] = new class219();
            var6.field1286 = arg1.method3072((byte) -126);
            var6.field1290 = arg1.method3053(-129);
            var6.field3347 = class455.field6620 + var5;
            var6.field3346 = arg1.method3070(false);
            var6.field3343 = arg1.method3070(false);
        }
        class247.field3693 = arg1.method3053(-129);
        class92.field1483 = true;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 60)
    public static void method517(int arg0) {
        field1089 = null;
        if (arg0 == -4) {
            field1093 = null;
            field1092 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 73)
    public static final void method518(int arg0) {
        field1090++;
        class270.method1755(-4872, false);
        class406.field5774 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class25.field363.length; var2++) {
            if (class213.field3209[var2] != -1 && class25.field363[var2] == null) {
                class25.field363[var2] = class76.field1243.method2037(0, (byte) 51, class213.field3209[var2]);
                if (class25.field363[var2] == null) {
                    var1 = false;
                    class406.field5774++;
                }
            }
            if (class333.field4938[var2] != -1 && class433.field6206[var2] == null) {
                class433.field6206[var2] = class76.field1243.method2039(0, class185.field2731[var2], class333.field4938[var2], (byte) -54);
                if (class433.field6206[var2] == null) {
                    class406.field5774++;
                    var1 = false;
                }
            }
            if (class457.field6639[var2] != -1 && class502.field7247[var2] == null) {
                class502.field7247[var2] = class76.field1243.method2037(0, (byte) 53, class457.field6639[var2]);
                if (class502.field7247[var2] == null) {
                    class406.field5774++;
                    var1 = false;
                }
            }
            if (class452.field6602[var2] != -1 && class259.field3837[var2] == null) {
                class259.field3837[var2] = class76.field1243.method2037(0, (byte) -125, class452.field6602[var2]);
                if (class259.field3837[var2] == null) {
                    var1 = false;
                    class406.field5774++;
                }
            }
            if (class299.field4461 != null && class511.field7430[var2] == null && class299.field4461[var2] != -1) {
                class511.field7430[var2] = class76.field1243.method2039(0, class185.field2731[var2], class299.field4461[var2], (byte) 91);
                if (class511.field7430[var2] == null) {
                    var1 = false;
                    class406.field5774++;
                }
            }
        }
        if (class136.field2109 == null) {
            if (class338.field5008 == null || !class312.field4655.method2012((byte) -1, class338.field5008.field2417 + "_staticelements")) {
                class136.field2109 = new class128(0);
            } else if (class312.field4655.method2046(class338.field5008.field2417 + "_staticelements", 0)) {
                class136.field2109 = class230.method1537(class338.field5008.field2417 + "_staticelements", class312.field4655, 115, class258.field3827);
            } else {
                var1 = false;
                class406.field5774++;
            }
        }
        if (!var1) {
            class477.field6951 = 1;
            return;
        }
        boolean var3 = true;
        class215.field3233 = 0;
        for (int var4 = 0; var4 < class25.field363.length; var4++) {
            byte[] var20 = class433.field6206[var4];
            if (var20 != null) {
                int var21 = (class475.field6929[var4] >> 8) * 64 - class82.field1315;
                int var22 = (class475.field6929[var4] & 0xFF) * 64 - class501.field7240;
                if (class251.field3738 != 0) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class177.method1235(class255.field3763, var22, class69.field1139, var20, var21, 0);
            }
            byte[] var23 = class259.field3837[var4];
            if (var23 != null) {
                int var24 = (class475.field6929[var4] >> 8) * 64 - class82.field1315;
                int var25 = (class475.field6929[var4] & 0xFF) * 64 - class501.field7240;
                if (class251.field3738 != 0) {
                    var25 = 10;
                    var24 = 10;
                }
                var3 &= class177.method1235(class255.field3763, var25, class69.field1139, var23, var24, 0);
            }
        }
        if (!var3) {
            class477.field6951 = 2;
            return;
        }
        if (class477.field6951 != 0) {
            class283.method1825(true, class406.field5775, class235.field3505.method426(class503.field7255, 74) + "<br>(100%)", 54);
        }
        class259.method1668(8101);
        class501.method2928(false);
        boolean var5 = false;
        if (class76.field1256.method182() && class220.field3371.field2567) {
            for (int var6 = 0; var6 < class25.field363.length; var6++) {
                if (class259.field3837[var6] != null || class502.field7247[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class220.field3371.field2571) {
            var7 = class406.field5778[class477.field6940];
        } else {
            var7 = class476.field6934[class477.field6940];
        }
        if (class76.field1256.method354()) {
            var7++;
        }
        class544.method3196(7, 4, class69.field1139, class255.field3763, var7, var5, class76.field1256.method303() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class19.field213[var8].method1129((byte) -43);
        }
        class27.method164(49);
        class303.method1936(false, (byte) 46);
        class384.method2339(0);
        class391.field5551 = null;
        class259.method1668(8101);
        System.gc();
        class270.method1755(-4872, true);
        class397.method2389((byte) -79);
        class413.field5844 = class220.field3371.method1213((byte) -35, class74.field1211);
        class226.field3412 = class220.field3371.field2567;
        class176.field2631 = class414.field5859 >= 96;
        class28.field395 = class220.field3371.method1215(class74.field1211, -4);
        class539.field7936 = !class220.field3371.field2582;
        class122.field1912 = class220.field3371.method1048(class74.field1211, -106) ? -1 : class10.field95;
        class392.field5574 = class74.field1211 == 1 || class220.field3371.field2586;
        class66.field1114 = class220.field3371.field2583;
        class41.field848 = new class431(4, class69.field1139, class255.field3763, false);
        if (class251.field3738 == 0) {
            class505.method2946(class41.field848, class25.field363, (byte) 105);
        } else {
            class332.method2106(class41.field848, class25.field363, -126);
        }
        class227.method1526(class69.field1139 >> 4, 86, class255.field3763 >> 4);
        class96.method729((byte) -74);
        if (var5) {
            class193.method1317(true);
            class55.field1004 = new class431(1, class69.field1139, class255.field3763, true);
            if (class251.field3738 == 0) {
                class505.method2946(class55.field1004, class502.field7247, (byte) 105);
                class270.method1755(-4872, true);
            } else {
                class332.method2106(class55.field1004, class502.field7247, -116);
                class270.method1755(-4872, true);
            }
            class55.field1004.method2516((byte) 36, 0, class41.field848.field6029[0]);
            class55.field1004.method2518(23350, class76.field1256, null, null);
            class193.method1317(false);
        }
        class41.field848.method2518(23350, class76.field1256, class19.field213, var5 ? class55.field1004.field6029 : null);
        if (class251.field3738 == 0) {
            class270.method1755(-4872, true);
            class475.method2817((byte) -58, class433.field6206, class41.field848);
            if (class511.field7430 != null) {
                class80.method613(13);
            }
        } else {
            class270.method1755(-4872, true);
            class423.method2508(class433.field6206, false, class41.field848);
        }
        class501.method2928(false);
        class270.method1755(-4872, true);
        class41.field848.method2522(var5 ? class477.field6942[0] : null, null, class76.field1256, 0);
        class41.field848.method2556(class76.field1256, 46);
        class270.method1755(-4872, true);
        if (var5) {
            class193.method1317(true);
            class270.method1755(-4872, true);
            if (class251.field3738 == 0) {
                class475.method2817((byte) -84, class259.field3837, class55.field1004);
            } else {
                class423.method2508(class259.field3837, false, class55.field1004);
            }
            class501.method2928(false);
            class270.method1755(-4872, true);
            class55.field1004.method2522(null, class393.field5594[0], class76.field1256, 0);
            class55.field1004.method2556(class76.field1256, 40);
            class270.method1755(-4872, true);
            class193.method1317(false);
        }
        int var9 = -82 % ((arg0 - 2) / 57);
        class393.method2372(-11044);
        int var10 = class41.field848.field6203;
        if (class123.field1944 < var10) {
            var10 = class123.field1944;
        }
        if (var10 < class123.field1944 - 1) {
            var10 = class123.field1944 - 1;
        }
        if (class220.field3371.method1048(class74.field1211, -94)) {
            class377.method2300(0);
        } else {
            class377.method2300(var10);
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var18 = 0; var18 < class69.field1139; var18++) {
                for (int var19 = 0; var19 < class255.field3763; var19++) {
                    class543.method3186(var18, var11, false, var19);
                }
            }
        }
        class311.method1975(255);
        class259.method1668(8101);
        class463.method2744(-1);
        class501.method2928(false);
        class193.field2806 = false;
        class167.method1194(31);
        if (class70.field1153 != null && class410.field5802 != null && class37.field799 == 10) {
            class420.field5963++;
            class228.method1528(true, class12.field127);
            class276.field4124.method3019(1057001181, 11648);
        }
        if (class251.field3738 == 0) {
            int var12 = (class473.field6897 - (class69.field1139 >> 4)) / 8;
            int var13 = ((class69.field1139 >> 4) + class473.field6897) / 8;
            int var14 = (class122.field1908 - (class255.field3763 >> 4)) / 8;
            int var15 = ((class255.field3763 >> 4) + class122.field1908) / 8;
            for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var12 > var16 || var16 > var13 || var14 > var17 || var17 > var15) {
                        class76.field1243.method2015("m" + var16 + "_" + var17, false);
                        class76.field1243.method2015("l" + var16 + "_" + var17, false);
                    }
                }
            }
        }
        if (class37.field799 == 3) {
            class170.method1206(1, 2);
        } else if (class37.field799 == 7) {
            class170.method1206(1, 6);
        } else {
            class170.method1206(1, 9);
            if (class410.field5802 != null) {
                class228.method1528(true, class450.field6578);
            }
        }
        class275.method1770(-1);
        class259.method1668(8101);
        class523.method3108((byte) -62);
    }
}
