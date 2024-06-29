import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class151 extends class194 {

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public int field2649;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "[I")
    public static int[] field2645 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field2643 = 0;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "Lqk;")
    public static class207 field2648 = class24.method212(255, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "Lqk;")
    public static class207 field2650 = class24.method212(255, "<)4col> x");

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "Lpk;")
    public static class99 field2647;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(B)V")
    public static final void method1092(byte arg0) {
        if (arg0 >= -107) {
            field2643 = -121;
        }
        field2644++;
        for (class17 var1 = (class17) class167.field2933.method922((byte) 109); var1 != null; var1 = (class17) class167.field2933.method928(85)) {
            class18 var2 = var1.field263;
            if (class93.field1645 != var2.field283 || class160.field2844 > var2.field282) {
                var1.method1346((byte) -16);
            } else if (var2.field274 <= class160.field2844) {
                if (var2.field290 > 0) {
                    class256 var3 = class79.field1449[var2.field290 - 1];
                    if (var3 != null && var3.field5104 >= 0 && var3.field5104 < 13312 && var3.field5072 >= 0 && var3.field5072 < 13312) {
                        var2.method108(var3.field5072, var3.field5104, (byte) -39, class22.method139(var3.field5104, var3.field5072, 23979, var2.field283) - var2.field300, class160.field2844);
                    }
                }
                if (var2.field290 < 0) {
                    int var4 = -var2.field290 - 1;
                    class14 var5;
                    if (class19.field313 == var4) {
                        var5 = class202.field3565;
                    } else {
                        var5 = class169.field2953[var4];
                    }
                    if (var5 != null && var5.field5104 >= 0 && var5.field5104 < 13312 && var5.field5072 >= 0 && var5.field5072 < 13312) {
                        var2.method108(var5.field5072, var5.field5104, (byte) -39, class22.method139(var5.field5104, var5.field5072, 23979, var2.field283) - var2.field300, class160.field2844);
                    }
                }
                var2.method107(class20.field325, (byte) -66);
                class265.method1821(class93.field1645, (int) var2.field304, (int) var2.field306, (int) var2.field281, 60, var2, var2.field287, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V")
    public static final void method1093(int arg0) {
        if (arg0 != -23132) {
            field2648 = null;
        }
        for (class196 var1 = (class196) class250.field4527.method922((byte) 85); var1 != null; var1 = (class196) class250.field4527.method928(-56)) {
            if (var1.field3456 > 0) {
                var1.field3456--;
            }
            if (var1.field3456 != 0) {
                if (var1.field3438 > 0) {
                    var1.field3438--;
                }
                if (var1.field3438 == 0 && var1.field3448 >= 1 && var1.field3451 >= 1 && var1.field3448 <= 102 && var1.field3451 <= 102 && (var1.field3442 < 0 || class224.method1586(var1.field3439, var1.field3442, (byte) -47))) {
                    class106.method765(var1.field3451, var1.field3448, var1.field3445, var1.field3439, 127, var1.field3442, var1.field3450, var1.field3447);
                    var1.field3438 = -1;
                    if (var1.field3454 == var1.field3442 && var1.field3454 == -1) {
                        var1.method1346((byte) -16);
                    } else if (var1.field3454 == var1.field3442 && var1.field3458 == var1.field3450 && var1.field3459 == var1.field3439) {
                        var1.method1346((byte) -16);
                    }
                }
            } else if (var1.field3454 < 0 || class224.method1586(var1.field3459, var1.field3454, (byte) -119)) {
                class106.method765(var1.field3451, var1.field3448, var1.field3445, var1.field3459, 122, var1.field3454, var1.field3458, var1.field3447);
                var1.method1346((byte) -16);
            }
        }
        field2653++;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(BI)V")
    public static final void method1094(byte arg0, int arg1) {
        field2642++;
        if (arg0 != -3) {
            method1093(-120);
        }
        class90 var2 = class221.method1575(11, arg1, 1651481952);
        var2.method651(-27655);
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)V")
    public static void method1095(byte arg0) {
        field2647 = null;
        field2650 = null;
        field2648 = null;
        field2645 = null;
        if (arg0 != -26) {
            field2647 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public static final boolean method1096(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field2646++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class276.field4839[var12][var31] = 0;
                class25.field528[var12][var31] = 99999999;
            }
        }
        class276.field4839[arg0][arg2] = 99;
        int var13 = arg0;
        class25.field528[arg0][arg2] = 0;
        int var14 = arg2;
        int var15 = 0;
        boolean var16 = false;
        if (arg11 != 31585) {
            field2645 = null;
        }
        byte var17 = 0;
        class19.field315[var17] = arg0;
        int var32 = var17 + 1;
        class62.field1129[var17] = arg2;
        int[][] var18 = class133.field2303[class93.field1645].field2721;
        while (var15 != var32) {
            var14 = class62.field1129[var15];
            var13 = class19.field315[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg1 == var13 && arg7 == var14) {
                var16 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class133.field2303[class93.field1645].method1133(arg3 - 1, var14, arg4, arg1, 2, arg7, false, var13)) {
                    var16 = true;
                    break;
                }
                if (arg3 < 10 && class133.field2303[class93.field1645].method1130(var14, 2, -73, arg7, var13, arg1, arg3 - 1, arg4)) {
                    var16 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg8 != 0 && class133.field2303[class93.field1645].method1126(arg8, arg7, var14, false, arg6, 2, var13, arg5, arg1)) {
                var16 = true;
                break;
            }
            int var30 = class25.field528[var13][var14] + 1;
            if (var13 > 0 && class276.field4839[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class19.field315[var32] = var13 - 1;
                class62.field1129[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class276.field4839[var13 - 1][var14] = 2;
                class25.field528[var13 - 1][var14] = var30;
            }
            if (var13 < 102 && class276.field4839[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x12C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class19.field315[var32] = var13 + 1;
                class62.field1129[var32] = var14;
                class276.field4839[var13 + 1][var14] = 8;
                class25.field528[var13 + 1][var14] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && class276.field4839[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class19.field315[var32] = var13;
                class62.field1129[var32] = var14 - 1;
                class276.field4839[var13][var14 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class25.field528[var13][var14 - 1] = var30;
            }
            if (var14 < 102 && class276.field4839[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class19.field315[var32] = var13;
                class62.field1129[var32] = var14 + 1;
                class276.field4839[var13][var14 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class25.field528[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class276.field4839[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x12C0138) == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13][var14 - 1] & 0x12C0183) == 0) {
                class19.field315[var32] = var13 - 1;
                class62.field1129[var32] = var14 - 1;
                class276.field4839[var13 - 1][var14 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class25.field528[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 102 && var14 > 0 && class276.field4839[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var14] & 0x12C01E0) == 0) {
                class19.field315[var32] = var13 + 1;
                class62.field1129[var32] = var14 - 1;
                class276.field4839[var13 + 1][var14 - 1] = 9;
                class25.field528[var13 + 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 < 102 && class276.field4839[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13][var14 + 2] & 0x12C01E0) == 0) {
                class19.field315[var32] = var13 - 1;
                class62.field1129[var32] = var14 + 1;
                class276.field4839[var13 - 1][var14 + 1] = 6;
                class25.field528[var13 - 1][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && var14 < 102 && class276.field4839[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class19.field315[var32] = var13 + 1;
                class62.field1129[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class276.field4839[var13 + 1][var14 + 1] = 12;
                class25.field528[var13 + 1][var14 + 1] = var30;
            }
        }
        class140.field2423 = 0;
        if (!var16) {
            if (!arg10) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg1 - var21; var22 <= arg1 + var21; var22++) {
                for (int var23 = arg7 - var21; var23 <= arg7 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class25.field528[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (var22 < arg1) {
                            var24 = arg1 - var22;
                        } else if (var22 > (arg1 - (1 - arg6))) {
                            var24 = var22 + 1 - (arg1 + arg6);
                        }
                        if (var23 < arg7) {
                            var25 = arg7 - var23;
                        } else if (var23 > arg7 + arg8 - 1) {
                            var25 = var23 + 1 - arg7 - arg8;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var19 || var19 == var26 && class25.field528[var22][var23] < var20) {
                            var19 = var26;
                            var13 = var22;
                            var14 = var23;
                            var20 = class25.field528[var22][var23];
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg0 == var13 && arg2 == var14) {
                return false;
            }
            class140.field2423 = 1;
        }
        byte var27 = 0;
        class19.field315[var27] = var13;
        int var33 = var27 + 1;
        class62.field1129[var27] = var14;
        int var28;
        int var29 = var28 = class276.field4839[var13][var14];
        while (arg0 != var13 || arg2 != var14) {
            if (var28 != var29) {
                class19.field315[var33] = var13;
                class62.field1129[var33++] = var14;
                var28 = var29;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            var29 = class276.field4839[var13][var14];
        }
        if (var33 > 0) {
            class248.method1744(var33, (byte) 75, arg9);
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(II)V")
    public class151(int arg0, int arg1) {
        this.field2649 = arg1;
        this.field2652 = arg0;
    }
}
