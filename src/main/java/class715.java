import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class715 extends class735 {

    @OriginalMember(owner = "client!vm", name = "F", descriptor = "I")
    private int field9849 = -1;

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
    public static int field9844 = 2;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public static int field9836;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    private int field9837;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
    public static int field9838;

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
    private int field9839;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "I")
    public static int field9840;

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "I")
    private int field9841;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
    public static int field9842;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "I")
    public static int field9845;

    @OriginalMember(owner = "client!vm", name = "C", descriptor = "I")
    public static int field9846;

    @OriginalMember(owner = "client!vm", name = "D", descriptor = "I")
    public static int field9847;

    @OriginalMember(owner = "client!vm", name = "E", descriptor = "I")
    public static int field9848;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3977(int arg0) {
        field9843++;
        if (arg0 != 1 || class95.field1472 == null) {
            return;
        }
        if (class618.field8597) {
            class406.method2425((byte) 119);
        }
        class677.field9437.method2272(53);
        class278.method1786();
        class420.method2468((byte) 8);
        class506.method2887(arg0 - 1);
        class203.method1453(arg0 ^ 0x65EC);
        class769.method4230(99);
        if (class288.field3973 != null) {
            class288.field3973.method2655(-93);
        }
        class370.method2250(-91);
        class338.method2113(38);
        class461.method2654(122);
        class393.method2381(3);
        class656.method3689(false, -201);
        for (int var1 = 0; var1 < 2048; var1++) {
            class771 var5 = class527.field7150[var1];
            if (var5 != null) {
                for (int var6 = 0; var6 < var5.field5310.length; var6++) {
                    var5.field5310[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class406.field5583; var2++) {
            class666 var3 = class491.field6712[var2].field10414;
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field5310.length; var4++) {
                    var3.field5310[var4] = null;
                }
            }
        }
        class160.field2574 = null;
        class417.field5701 = null;
        class95.field1472.method594(0);
        class95.field1472 = null;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V", line = 84)
    public static final void method3978(int arg0) {
        if (class408.field5596 >= 0) {
            long var1 = class197.method1423(1);
            class408.field5596 = (int) ((long) class408.field5596 - (var1 - class704.field9678));
            if (class408.field5596 <= 0) {
                class789.field10819 = class744.field10271.field538;
                class408.field5596 = -1;
                class177.field2786 = class744.field10271.field519;
                class408.field5594 = class744.field10271.field527;
                class524.field7126 = class744.field10271.field525;
                class449.field6155 = class744.field10271.field537;
                class714.field9834 = class744.field10271.field532;
                class454.field6197 = class744.field10271.field521;
                class339.field4580 = class744.field10271.field524;
                class65.field932 = class744.field10271.field534;
                class563.field7981 = class744.field10271.field531;
            } else {
                int var3 = (class408.field5596 << 8) / class248.field3504;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class339.field4580 = ((class7.field155 & 0xFF00FF) * var3 + ((class744.field10271.field524 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class7.field155 & 0xFF00) * var3 + (class744.field10271.field524 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class454.field6197 = (class744.field10271.field521 - class640.field8809) * var6 + class640.field8809;
                class563.field7981 = (class744.field10271.field531 - class111.field1923) * var6 + class111.field1923;
                class789.field10819 = (class744.field10271.field538 - class423.field5797) * var6 + class423.field5797;
                class714.field9834 = ((class287.field3958 & 0xFF00FF) * var3 + (class744.field10271.field532 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class287.field3958 & 0xFF00) * var3 + (class744.field10271.field532 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class177.field2786 = (class744.field10271.field519 - class519.field7046) * var6 + class519.field7046;
                class524.field7126 = (class744.field10271.field525 - class480.field6474) * var6 + class480.field6474;
                class65.field932 = (class744.field10271.field534 - class682.field9502) * var6 + class682.field9502;
                class449.field6155 = class565.field7992 * var3 + class744.field10271.field537 * var4 >> 8;
                if (class65.field916 != class744.field10271.field527) {
                    class408.field5594 = class205.field3095.method535(class65.field916, class744.field10271.field527, var6, class408.field5594);
                }
            }
            class704.field9678 = var1;
        }
        if (arg0 == 1) {
            field9846++;
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V", line = 141)
    public static final void method3979(int arg0) {
        class43 var1 = class770.field10617;
        synchronized (class770.field10617) {
            if (arg0 != 1) {
                method3979(101);
            }
            class770.field10617.method272(20);
        }
        field9847++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIIIIIII)V", line = 156)
    public static final void method3980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field9836++;
        if (arg3 != 3) {
            return;
        }
        if (arg2 == arg6 && arg7 == arg8 && arg1 == arg5 && arg0 == arg4) {
            class676.method3814(arg9, arg4, arg5, arg6, arg7, -126);
            return;
        }
        int var10 = arg6;
        int var11 = arg7;
        int var12 = arg6 * 3;
        int var13 = arg7 * 3;
        int var14 = arg2 * 3;
        int var15 = arg8 * 3;
        int var16 = arg1 * 3;
        int var17 = arg0 * 3;
        int var18 = var14 + arg5 - var16 - arg6;
        int var19 = arg4 + var15 - var17 - arg7;
        int var20 = var12 + var16 - var14 - var14;
        int var21 = var17 + var13 - (var15 + var15);
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var31 >> 12) + arg6;
            int var34 = (var28 + var30 + var32 >> 12) + arg7;
            class676.method3814(arg9, var34, var33, var10, var11, arg3 ^ 0xB);
            var10 = var33;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILfca;)V", line = 231)
    public final void method627(int arg0, class93 arg1) {
        if (arg0 != 5) {
            method3982(-84, (byte) -102, 103);
        }
        field9848++;
        this.field9849 = arg1.method763(arg0 + 90);
        this.field9841 = arg1.method773(3);
        this.field9837 = arg1.method793((byte) 89);
        this.field9839 = arg1.method793((byte) 20);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V", line = 260)
    public static final void method3981(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class633.field8766 = true;
        class453.field6186 = class112.field2107.method493() > 0;
        class637.field8792 = arg15;
        class434.field5912 = arg1 >> class654.field9055;
        class111.field1920 = arg3 >> class654.field9055;
        class14.field218 = arg1;
        class758.field10451 = arg3;
        class692.field9609 = arg2;
        class116.field2126 = class434.field5912 - class389.field5342;
        if (class116.field2126 < 0) {
            class43.field688 = -class116.field2126;
            class116.field2126 = 0;
        } else {
            class43.field688 = 0;
        }
        class779.field10731 = class111.field1920 - class389.field5342;
        if (class779.field10731 < 0) {
            class78.field1109 = -class779.field10731;
            class779.field10731 = 0;
        } else {
            class78.field1109 = 0;
        }
        class427.field5830 = class434.field5912 + class389.field5342;
        if (class427.field5830 > class441.field5980) {
            class427.field5830 = class441.field5980;
        }
        class374.field5072 = class389.field5342 + class111.field1920;
        if (class374.field5072 > class375.field5083) {
            class374.field5072 = class375.field5083;
        }
        boolean[][] var19 = class641.field8883;
        boolean[][] var20 = class657.field9097;
        if (class637.field8792) {
            for (int var21 = 0; var21 < class389.field5342 + class389.field5342 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class389.field5342 + class389.field5342 + 2; var24++) {
                    if (var24 > 1) {
                        class534.field7232[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class434.field5912 + var21 - class389.field5342;
                    int var26 = class111.field1920 + var24 - class389.field5342;
                    if (var25 >= 0 && var26 >= 0 && var25 < class441.field5980 && var26 < class375.field5083) {
                        int var27 = var25 << class654.field9055;
                        int var28 = var26 << class654.field9055;
                        int var29 = class142.field2418[class142.field2418.length - 1].method1897((byte) -34, var26, var25) - (0x3E8 << class654.field9055 - 7);
                        int var30 = class178.field2805 == null ? class142.field2418[0].method1897((byte) -34, var26, var25) + class365.field4955 : class178.field2805[0].method1897((byte) -34, var26, var25) + class365.field4955;
                        var23 = arg16 >= 0 ? class112.field2107.method529(var27, var29, var28, var27, var30, var28, arg16) : class112.field2107.method518(var27, var29, var28, var27, var30, var28);
                        class657.field9097[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class657.field9097[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class534.field7232[var24 - 1] & class534.field7232[var24] & var22 & var23;
                        class641.field8883[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class534.field7232[class389.field5342 + class389.field5342] = var22;
                class534.field7232[class389.field5342 + class389.field5342 + 1] = var23;
            }
            if (arg16 >= 0) {
                class633.field8766 = false;
            } else {
                class389.field5345 = arg5;
                class748.field10326 = arg6;
                class340.field4591 = arg7;
                class573.field8168 = arg8;
                class521.field7065 = arg9;
                class410.method2432(-80, class112.field2107, arg10);
            }
        } else {
            if (class101.field1642 == null) {
                class101.field1642 = new boolean[class441.field5980 + class441.field5980 + 1][class441.field5980 + class375.field5083 + 1];
            }
            for (int var32 = 0; var32 < class101.field1642.length; var32++) {
                for (int var42 = 0; var42 < class101.field1642[0].length; var42++) {
                    class101.field1642[var32][var42] = true;
                }
            }
            class657.field9097 = class101.field1642;
            class641.field8883 = class101.field1642;
            class116.field2126 = 0;
            class779.field10731 = 0;
            class427.field5830 = class441.field5980;
            class374.field5072 = class375.field5083;
            class633.field8766 = false;
        }
        class503.method2876(true, class112.field2107);
        if (!class677.field9437.field5086) {
            class239 var33 = class677.field9437.field5078;
            for (class186 var34 = (class186) var33.method1597((byte) 126); var34 != null; var34 = (class186) var33.method1601(74)) {
                var34.method731((byte) 39);
                class287.method1839(var34, 8792);
            }
        }
        if (class453.field6186) {
            for (int var35 = 0; var35 < class155.field2534; var35++) {
                class98.field1601[var35].method1435(arg14, 0, arg0);
            }
        }
        if (class120.field2186) {
            class559.field7939 = class112.field2107.method496();
            class112.field2107.method580(class429.field5857);
            int var36 = (class429.field5857[2] - class429.field5857[0]) / class360.field4913;
            for (int var37 = 0; var37 < class360.field4913 - 1; var37++) {
                class324.field4438[var37] = (var37 + 1) * var36 + class720.field9895[var37];
            }
            for (int var38 = 0; var38 < class34.field571.length; var38++) {
                class34.field571[var38].method2529();
            }
        }
        if (class1.field1 != null) {
            if (class120.field2186) {
                class298.method1918(0);
            }
            class5.method29(true);
            class112.field2107.method520(-1, 1583160, 40, 127);
            class248.method1644(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class120.field2186) {
                class618.method3487();
            }
            class112.field2107.method553();
            class5.method29(false);
        }
        class248.method1644(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class120.field2186) {
            for (int var39 = 0; var39 < class62.field856; var39++) {
                class686.field9545[var39] = class580.field8201[var39];
            }
            class298.method1918(0);
            for (int var40 = 0; var40 < class34.field571.length; var40++) {
                class34.field571[var40].method2529();
            }
        }
        if (class120.field2186) {
            class618.method3487();
            for (int var41 = 0; var41 < class62.field856; var41++) {
                class580.field8201[var41] = class686.field9545[var41];
            }
            if (class341.field4602 == 2) {
                int var10002;
                if (class62.field854[0] < class62.field854[1]) {
                    if (class720.field9895[0] + class324.field4438[0] > class429.field5857[0]) {
                        var10002 = class720.field9895[0]++;
                    }
                } else if (class62.field854[0] > class62.field854[1] && class720.field9895[0] + class324.field4438[0] < class429.field5857[2]) {
                    var10002 = class720.field9895[0]--;
                }
            }
        }
        if (!class637.field8792) {
            class641.field8883 = var19;
            class657.field9097 = var20;
        }
        class451.method2614();
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(IBI)Z", line = 539)
    public static final boolean method3982(int arg0, byte arg1, int arg2) {
        field9842++;
        if (arg1 > -113) {
            return false;
        } else {
            return (arg2 & 0x21) != 0;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lrh;Z)V", line = 550)
    public final void method624(class280 arg0, boolean arg1) {
        if (arg1) {
            method3981(68, -15, 114, 41, null, null, null, null, null, null, 93, (byte) 48, -90, 117, true, true, 85, -60, true);
        }
        arg0.method1795(this.field9841, this.field9849, this.field9839, (byte) 125, this.field9837);
        field9845++;
    }
}
