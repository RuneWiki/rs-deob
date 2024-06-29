import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public abstract class class356 extends class665 {

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "Lnea;")
    public static class664 field5112 = new class664(67, 8);

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "F")
    public static float field5110;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "Lwr;")
    public static class421 field5111;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)I")
    public abstract int method1030(int arg0);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
    public static void method2173(byte arg0) {
        field5112 = null;
        if (arg0 < -86) {
            field5111 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)I")
    public abstract int method1029(byte arg0);

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(Z)J")
    public abstract long method1028(boolean arg0);

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(B)I")
    public abstract int method1032(byte arg0);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V")
    public static final void method2174(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15) {
        class443.field6452 = class682.field9618.method173() > 0;
        class539.field7551 = arg15;
        class435.field6354 = arg1 >> class310.field4593;
        class612.field8575 = arg3 >> class310.field4593;
        class55.field1071 = arg1;
        class628.field8790 = arg3;
        class688.field9688 = arg2;
        class39.field645 = class435.field6354 - class196.field2802;
        if (class39.field645 < 0) {
            class88.field1478 = -class39.field645;
            class39.field645 = 0;
        } else {
            class88.field1478 = 0;
        }
        class112.field1694 = class612.field8575 - class196.field2802;
        if (class112.field1694 < 0) {
            class344.field5034 = -class112.field1694;
            class112.field1694 = 0;
        } else {
            class344.field5034 = 0;
        }
        class316.field4673 = class435.field6354 + class196.field2802;
        if (class316.field4673 > class302.field4492) {
            class316.field4673 = class302.field4492;
        }
        class431.field6318 = class612.field8575 + class196.field2802;
        if (class431.field6318 > class8.field82) {
            class431.field6318 = class8.field82;
        }
        boolean[][] var16 = class260.field3949;
        boolean[][] var17 = class535.field7505;
        if (class539.field7551) {
            for (int var18 = 0; var18 < class196.field2802 + class196.field2802 + 2; var18++) {
                for (int var21 = 0; var21 < class196.field2802 + class196.field2802 + 2; var21++) {
                    int var22 = class435.field6354 + var18 - class196.field2802;
                    int var23 = class612.field8575 + var21 - class196.field2802;
                    if (var22 >= 0 && var23 >= 0 && var22 < class302.field4492 && var23 < class8.field82) {
                        int var24 = var22 << class310.field4593;
                        int var25 = var23 << class310.field4593;
                        int var26 = class420.field6108[class420.field6108.length - 1].method432(var22, false, var23) - (0x3E8 << class310.field4593 - 7);
                        int var27 = class499.field7071 == null ? class420.field6108[0].method432(var22, false, var23) + class437.field6392 : class499.field7071[0].method432(var22, false, var23) + class437.field6392;
                        class535.field7505[var18][var21] = class682.field9618.method180(var24, var26, var25, var24, var27, var25);
                    } else {
                        class535.field7505[var18][var21] = false;
                    }
                }
            }
            for (int var19 = 0; var19 < class196.field2802 + class196.field2802 + 1; var19++) {
                for (int var20 = 0; var20 < class196.field2802 + class196.field2802 + 1; var20++) {
                    class260.field3949[var19][var20] = class535.field7505[var19][var20] || class535.field7505[var19 + 1][var20] || class535.field7505[var19][var20 + 1] || class535.field7505[var19 + 1][var20 + 1];
                }
            }
            class23.field317 = arg5;
            class573.field8064 = arg6;
            class533.field7477 = arg7;
            class473.field6759 = arg8;
            class596.field8427 = arg9;
            class7.method42(class682.field9618, -6871, arg10);
        } else {
            if (class517.field7296 == null) {
                class517.field7296 = new boolean[class302.field4492 + class302.field4492 + 1][class8.field82 + class302.field4492 + 1];
                for (int var28 = 0; var28 < class517.field7296.length; var28++) {
                    for (int var29 = 0; var29 < class517.field7296[0].length; var29++) {
                        class517.field7296[var28][var29] = true;
                    }
                }
            }
            class535.field7505 = class517.field7296;
            class260.field3949 = class517.field7296;
            class39.field645 = 0;
            class112.field1694 = 0;
            class316.field4673 = class302.field4492;
            class431.field6318 = class8.field82;
            class266.field4020 = 0;
        }
        class111.method862(class682.field9618, -1011);
        for (class549 var30 = (class549) class380.field5378.method2417(false); var30 != null; var30 = (class549) class380.field5378.method2414(true)) {
            var30.method3414(0);
            class333.method2097(var30, -1);
        }
        if (class443.field6452) {
            for (int var31 = 0; var31 < class258.field3938; var31++) {
                class580.field8172[var31].method2913(arg14, arg0, true);
            }
        }
        if (class520.field7337) {
            class601.field8507 = class682.field9618.method145();
            class682.field9618.method204(class383.field5414);
            int var32 = (class383.field5414[2] - class383.field5414[0]) / class519.field7319;
            for (int var33 = 0; var33 < class519.field7319 - 1; var33++) {
                class665.field9385[var33] = (var33 + 1) * var32 + class279.field4216[var33];
            }
            for (int var34 = 0; var34 < class513.field7248.length; var34++) {
                class513.field7248[var34].method3053();
            }
        }
        if (class634.field8979 != null) {
            if (class520.field7337) {
                class73.method697(0);
            }
            class668.method3700(true);
            class682.field9618.method133(-1, 1583160, 40, 127);
            class704.method3921(true, arg4, arg10, arg11);
            if (class520.field7337) {
                class497.method2874();
            }
            class682.field9618.method121();
            class668.method3700(false);
        }
        class704.method3921(false, arg4, arg10, arg11);
        if (class520.field7337) {
            for (int var35 = 0; var35 < class41.field685; var35++) {
                class639.field9024[var35] = class691.field9724[var35];
            }
            class73.method697(0);
            for (int var36 = 0; var36 < class513.field7248.length; var36++) {
                class513.field7248[var36].method3053();
            }
        }
        if (class520.field7337) {
            class497.method2874();
            for (int var37 = 0; var37 < class41.field685; var37++) {
                class691.field9724[var37] = class639.field9024[var37];
            }
            if (class179.field2550 == 2) {
                int var10002;
                if (class298.field4460[0] < class298.field4460[1]) {
                    if (class665.field9385[0] + class279.field4216[0] > class383.field5414[0]) {
                        var10002 = class279.field4216[0]++;
                    }
                } else if (class298.field4460[0] > class298.field4460[1] && class665.field9385[0] + class279.field4216[0] < class383.field5414[2]) {
                    var10002 = class279.field4216[0]--;
                }
            }
        }
        if (!class539.field7551) {
            class260.field3949 = var16;
            class535.field7505 = var17;
        }
        class44.method469();
    }

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "(B)I")
    public abstract int method1031(byte arg0);
}
