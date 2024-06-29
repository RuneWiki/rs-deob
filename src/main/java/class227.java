import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class227 {

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Ld;")
    public static class142 field3508 = new class142();

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Lek;")
    public static class184 field3514 = null;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field3517 = 0;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "[I")
    public static int[] field3515 = new int[2048];

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "S")
    public static short field3519 = 32767;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field3518 = 0;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "F")
    public static float field3511;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 4)
    public static void method1610(byte arg0) {
        field3514 = null;
        field3508 = null;
        if (arg0 > 63) {
            field3515 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIIIZIIII)Z", line = 18)
    public static final boolean method1611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class248.field3717[var13][var14] = 0;
                class45.field696[var13][var14] = 99999999;
            }
        }
        field3507++;
        int var15 = arg4;
        int var16 = -125 / ((arg3 - 51) / 60);
        int var17 = arg2;
        byte var18 = 0;
        int var19 = 0;
        class248.field3717[arg4][arg2] = 99;
        boolean var20 = false;
        class45.field696[arg4][arg2] = 0;
        class101.field1548[var18] = arg4;
        int var42 = var18 + 1;
        class245.field3684[var18] = arg2;
        int[][] var21 = class90.field1309[class50.field775].field5037;
        label396: while (var42 != var19) {
            var17 = class245.field3684[var19];
            var15 = class101.field1548[var19];
            var19 = var19 + 1 & 0xFFF;
            if (arg6 == var15 && arg5 == var17) {
                var20 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class90.field1309[class50.field775].method2218(arg10 - 1, (byte) 89, var17, arg1, arg6, arg5, arg12, var15)) {
                    var20 = true;
                    break;
                }
                if (arg10 < 10 && class90.field1309[class50.field775].method2215(arg12, var17, var15, arg6, arg1, -123, arg10 - 1, arg5)) {
                    var20 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg7 != 0 && class90.field1309[class50.field775].method2206(arg12, false, arg7, arg6, arg0, arg5, var15, var17, arg11)) {
                var20 = true;
                break;
            }
            int var22 = class45.field696[var15][var17] + 1;
            if (var15 > 0 && class248.field3717[var15 - 1][var17] == 0 && (var21[var15 - 1][var17] & 0x12C010E) == 0 && (var21[var15 - 1][arg12 + var17 - 1] & 0x12C0138) == 0) {
                int var23 = 1;
                while (true) {
                    if (var23 >= (arg12 - 1)) {
                        class101.field1548[var42] = var15 - 1;
                        class245.field3684[var42] = var17;
                        class248.field3717[var15 - 1][var17] = 2;
                        class45.field696[var15 - 1][var17] = var22;
                        var42 = var42 + 1 & 0xFFF;
                        break;
                    }
                    if ((var21[var15 - 1][var17 + var23] & 0x12C013E) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var15 < 102 && class248.field3717[var15 + 1][var17] == 0 && (var21[arg12 + var15][var17] & 0x12C0183) == 0 && (var21[var15 + arg12][arg12 + var17 - 1] & 0x12C01E0) == 0) {
                int var24 = 1;
                while (true) {
                    if (arg12 - 1 <= var24) {
                        class101.field1548[var42] = var15 + 1;
                        class245.field3684[var42] = var17;
                        class248.field3717[var15 + 1][var17] = 8;
                        var42 = var42 + 1 & 0xFFF;
                        class45.field696[var15 + 1][var17] = var22;
                        break;
                    }
                    if ((var21[var15 + arg12][var17 + var24] & 0x12C01E3) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var17 > 0 && class248.field3717[var15][var17 - 1] == 0 && (var21[var15][var17 - 1] & 0x12C010E) == 0 && (var21[arg12 + var15 - 1][var17 - 1] & 0x12C0183) == 0) {
                int var25 = 1;
                while (true) {
                    if (var25 >= (arg12 - 1)) {
                        class101.field1548[var42] = var15;
                        class245.field3684[var42] = var17 - 1;
                        class248.field3717[var15][var17 - 1] = 1;
                        var42 = var42 + 1 & 0xFFF;
                        class45.field696[var15][var17 - 1] = var22;
                        break;
                    }
                    if ((var21[var15 + var25][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var17 < 102 && class248.field3717[var15][var17 + 1] == 0 && (var21[var15][arg12 + var17] & 0x12C0138) == 0 && (var21[arg12 + var15 - 1][arg12 + var17] & 0x12C01E0) == 0) {
                int var26 = 1;
                while (true) {
                    if ((arg12 - 1) <= var26) {
                        class101.field1548[var42] = var15;
                        class245.field3684[var42] = var17 + 1;
                        class248.field3717[var15][var17 + 1] = 4;
                        var42 = var42 + 1 & 0xFFF;
                        class45.field696[var15][var17 + 1] = var22;
                        break;
                    }
                    if ((var21[var15 + var26][arg12 + var17] & 0x12C01F8) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 > 0 && var17 > 0 && class248.field3717[var15 - 1][var17 - 1] == 0 && (var21[var15 - 1][var17 + arg12 - 1 - 1] & 0x12C0138) == 0 && (var21[var15 - 1][var17 - 1] & 0x12C010E) == 0 && (var21[arg12 + var15 - 1 - 1][var17 - 1] & 0x12C0183) == 0) {
                int var27 = 1;
                while (true) {
                    if (var27 >= arg12 - 1) {
                        class101.field1548[var42] = var15 - 1;
                        class245.field3684[var42] = var17 - 1;
                        var42 = var42 + 1 & 0xFFF;
                        class248.field3717[var15 - 1][var17 - 1] = 3;
                        class45.field696[var15 - 1][var17 - 1] = var22;
                        break;
                    }
                    if ((var21[var15 - 1][var17 + var27 - 1] & 0x12C013E) != 0 || (var21[var27 + var15 - 1][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 < 102 && var17 > 0 && class248.field3717[var15 + 1][var17 - 1] == 0 && (var21[var15 + 1][var17 - 1] & 0x12C010E) == 0 && (var21[arg12 + var15][var17 - 1] & 0x12C0183) == 0 && (var21[arg12 + var15][var17 - (-arg12 + 1) - 1] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if ((arg12 - 1) <= var28) {
                        class101.field1548[var42] = var15 + 1;
                        class245.field3684[var42] = var17 - 1;
                        var42 = var42 + 1 & 0xFFF;
                        class248.field3717[var15 + 1][var17 - 1] = 9;
                        class45.field696[var15 + 1][var17 - 1] = var22;
                        break;
                    }
                    if ((var21[var15 + arg12][var17 + var28 - 1] & 0x12C01E3) != 0 || (var21[var28 + var15 + 1][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 > 0 && var17 < 102 && class248.field3717[var15 - 1][var17 + 1] == 0 && (var21[var15 - 1][var17 + 1] & 0x12C010E) == 0 && (var21[var15 - 1][arg12 + var17] & 0x12C0138) == 0 && (var21[var15][var17 + arg12] & 0x12C01E0) == 0) {
                int var29 = 1;
                while (true) {
                    if (arg12 - 1 <= var29) {
                        class101.field1548[var42] = var15 - 1;
                        class245.field3684[var42] = var17 + 1;
                        var42 = var42 + 1 & 0xFFF;
                        class248.field3717[var15 - 1][var17 + 1] = 6;
                        class45.field696[var15 - 1][var17 + 1] = var22;
                        break;
                    }
                    if ((var21[var15 - 1][var17 + var29 + 1] & 0x12C013E) != 0 || (var21[var15 + var29 - 1][arg12 + var17] & 0x12C01F8) != 0) {
                        break;
                    }
                    var29++;
                }
            }
            if (var15 < 102 && var17 < 102 && class248.field3717[var15 + 1][var17 + 1] == 0 && (var21[var15 + 1][arg12 + var17] & 0x12C0138) == 0 && (var21[arg12 + var15][arg12 + var17] & 0x12C01E0) == 0 && (var21[arg12 + var15][var17 + 1] & 0x12C0183) == 0) {
                for (int var30 = 1; var30 < arg12 - 1; var30++) {
                    if ((var21[var15 + var30 + 1][arg12 + var17] & 0x12C01F8) != 0 || (var21[var15 + arg12][var30 + var17 + 1] & 0x12C01E3) != 0) {
                        continue label396;
                    }
                }
                class101.field1548[var42] = var15 + 1;
                class245.field3684[var42] = var17 + 1;
                var42 = var42 + 1 & 0xFFF;
                class248.field3717[var15 + 1][var17 + 1] = 12;
                class45.field696[var15 + 1][var17 + 1] = var22;
            }
        }
        class150.field2268 = 0;
        if (!var20) {
            if (!arg8) {
                return false;
            }
            int var31 = 1000;
            int var32 = 100;
            byte var33 = 10;
            for (int var34 = arg6 - var33; var34 <= arg6 + var33; var34++) {
                for (int var35 = arg5 - var33; var35 <= arg5 + var33; var35++) {
                    if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && class45.field696[var34][var35] < 100) {
                        int var36 = 0;
                        if (var35 < arg5) {
                            var36 = arg5 - var35;
                        } else if (arg7 + arg5 - 1 < var35) {
                            var36 = var35 + 1 - arg5 - arg7;
                        }
                        int var37 = 0;
                        if (var34 < arg6) {
                            var37 = arg6 - var34;
                        } else if (arg6 + arg0 - 1 < var34) {
                            var37 = var34 + 1 - arg6 - arg0;
                        }
                        int var38 = var36 * var36 + var37 * var37;
                        if (var38 < var31 || var31 == var38 && var32 > class45.field696[var34][var35]) {
                            var32 = class45.field696[var34][var35];
                            var17 = var35;
                            var31 = var38;
                            var15 = var34;
                        }
                    }
                }
            }
            if (var31 == 1000) {
                return false;
            }
            if (arg4 == var15 && arg2 == var17) {
                return false;
            }
            class150.field2268 = 1;
        }
        byte var39 = 0;
        class101.field1548[var39] = var15;
        int var43 = var39 + 1;
        class245.field3684[var39] = var17;
        int var40;
        int var41 = var40 = class248.field3717[var15][var17];
        while (arg4 != var15 || arg2 != var17) {
            if (var40 != var41) {
                class101.field1548[var43] = var15;
                class245.field3684[var43++] = var17;
                var40 = var41;
            }
            if ((var41 & 0x2) != 0) {
                var15++;
            } else if ((var41 & 0x8) != 0) {
                var15--;
            }
            if ((var41 & 0x1) != 0) {
                var17++;
            } else if ((var41 & 0x4) != 0) {
                var17--;
            }
            var41 = class248.field3717[var15][var17];
        }
        if (var43 > 0) {
            class118.method917(0, var43, arg9);
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIZZLlb;II)V", line = 509)
    public static final void method1612(int arg0, int arg1, boolean arg2, boolean arg3, class211 arg4, int arg5, int arg6) {
        class276.field4244 = arg4;
        class96.field1428 = arg5;
        class133.field2099 = arg0;
        field3506++;
        class41.field616 = 1;
        class178.field2660 = arg1;
        if (!arg3) {
            field3511 = -0.68485975F;
        }
        class128.field2024 = arg6;
        class6.field60 = arg2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)I", line = 539)
    public static final int method1613(int arg0, int arg1) {
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        if (arg1 != 18442) {
            field3515 = (int[]) null;
        }
        field3509++;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)I", line = 558)
    public static final int method1614(int arg0, int arg1) {
        field3520++;
        if (arg1 != 15653) {
            field3515 = (int[]) null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)[B", line = 574)
    public static final synchronized byte[] method1615(int arg0, int arg1) {
        field3510++;
        if (arg1 == 100 && class297.field4653 > 0) {
            byte[] var2 = class133.field2097[--class297.field4653];
            class133.field2097[class297.field4653] = null;
            return var2;
        } else if (arg1 == 5000 && class156.field2346 > 0) {
            byte[] var3 = class32.field405[--class156.field2346];
            class32.field405[class156.field2346] = null;
            return var3;
        } else if (~arg1 == arg0 && class235.field3601 > 0) {
            byte[] var4 = class277.field4250[--class235.field3601];
            class277.field4250[class235.field3601] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BJ)V", line = 610)
    public static final void method1616(byte arg0, long arg1) {
        field3513++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        if (arg0 != -112) {
            field3515 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILlb;II)Lom;", line = 626)
    public static final class70 method1617(int arg0, class211 arg1, int arg2, int arg3) {
        field3512++;
        if (class297.method2093(arg3, arg2, (byte) -61, arg1)) {
            if (arg0 != 0) {
                field3508 = (class142) null;
            }
            return class161.method1157((byte) -126);
        } else {
            return null;
        }
    }
}
