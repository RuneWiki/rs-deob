import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class class198 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "[I")
    public static int[] field3691 = new int[50];

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Ldc;")
    private static class37 field3696 = class185.method1233((byte) 86, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3697 = 0;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Ldc;")
    public static class37 field3699 = field3696;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Ldc;")
    public static class37 field3692 = class185.method1233((byte) 86, "titlebox");

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3693 = 0;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3698 = 0;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "[I")
    public static int[] field3701 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "J")
    public static long field3695;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1314(int arg0) {
        field3701 = null;
        if (arg0 < 56) {
            field3695 = 72L;
        }
        field3696 = null;
        field3699 = null;
        field3691 = null;
        field3692 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIIIIIIZI)Z")
    public static final boolean method1315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12) {
        field3694++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class177.field3340[var13][var40] = 0;
                class192.field3591[var13][var40] = 99999999;
            }
        }
        class177.field3340[arg4][arg3] = 99;
        int var14 = arg4;
        int var15 = arg3;
        class192.field3591[arg4][arg3] = 0;
        int var16 = 0;
        byte var17 = 0;
        class97.field1697[var17] = arg4;
        if (arg2 != -29517) {
            method1315(12, 31, 78, 70, -97, 24, 32, -16, 108, -4, 39, false, -31);
        }
        int var41 = var17 + 1;
        class145.field2777[var17] = arg3;
        int[][] var18 = class11.field143[class125.field2246].field3080;
        boolean var19 = false;
        label372: while (var16 != var41) {
            var15 = class145.field2777[var16];
            var14 = class97.field1697[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg8 == var14 && arg7 == var15) {
                var19 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && class11.field143[class125.field2246].method1103((byte) 89, arg6 - 1, arg1, arg8, var15, arg5, var14, arg7)) {
                    var19 = true;
                    break;
                }
                if (arg6 < 10 && class11.field143[class125.field2246].method1101(arg8, (byte) 69, var15, var14, arg7, arg1, arg6 - 1, arg5)) {
                    var19 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg9 != 0 && class11.field143[class125.field2246].method1088(arg7, arg8, var14, arg10, arg5, var15, arg12, arg9, (byte) -124)) {
                var19 = true;
                break;
            }
            int var31 = class192.field3591[var14][var15] + 1;
            if (var14 > 0 && class177.field3340[var14 - 1][var15] == 0 && (var18[var14 - 1][var15] & 0x12C010E) == 0 && (var18[var14 - 1][var15 + arg5 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (var32 >= arg5 - 1) {
                        class97.field1697[var41] = var14 - 1;
                        class145.field2777[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class177.field3340[var14 - 1][var15] = 2;
                        class192.field3591[var14 - 1][var15] = var31;
                        break;
                    }
                    if ((var18[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class177.field3340[var14 + 1][var15] == 0 && (var18[var14 + arg5][var15] & 0x12C0183) == 0 && (var18[arg5 + var14][arg5 + var15 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if (var33 >= arg5 - 1) {
                        class97.field1697[var41] = var14 + 1;
                        class145.field2777[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class177.field3340[var14 + 1][var15] = 8;
                        class192.field3591[var14 + 1][var15] = var31;
                        break;
                    }
                    if ((var18[arg5 + var14][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class177.field3340[var14][var15 - 1] == 0 && (var18[var14][var15 - 1] & 0x12C010E) == 0 && (var18[arg5 + var14 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (var34 >= arg5 - 1) {
                        class97.field1697[var41] = var14;
                        class145.field2777[var41] = var15 - 1;
                        class177.field3340[var14][var15 - 1] = 1;
                        var41 = var41 + 1 & 0xFFF;
                        class192.field3591[var14][var15 - 1] = var31;
                        break;
                    }
                    if ((var18[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class177.field3340[var14][var15 + 1] == 0 && (var18[var14][arg5 + var15] & 0x12C0138) == 0 && (var18[arg5 + var14 - 1][arg5 + var15] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if (var35 >= arg5 - 1) {
                        class97.field1697[var41] = var14;
                        class145.field2777[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class177.field3340[var14][var15 + 1] = 4;
                        class192.field3591[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((var18[var14 + var35][arg5 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class177.field3340[var14 - 1][var15 - 1] == 0 && (var18[var14 - 1][var15 + arg5 - 2] & 0x12C0138) == 0 && (var18[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var18[var14 + arg5 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (var36 >= arg5 - 1) {
                        class97.field1697[var41] = var14 - 1;
                        class145.field2777[var41] = var15 - 1;
                        class177.field3340[var14 - 1][var15 - 1] = 3;
                        class192.field3591[var14 - 1][var15 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var18[var14 - 1][var36 + var15 - 1] & 0x12C013E) != 0 || (var18[var36 + var14 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class177.field3340[var14 + 1][var15 - 1] == 0 && (var18[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var18[arg5 + var14][var15 - 1] & 0x12C0183) == 0 && (var18[var14 + arg5][arg5 + var15 - 1 - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (var37 >= arg5 - 1) {
                        class97.field1697[var41] = var14 + 1;
                        class145.field2777[var41] = var15 - 1;
                        class177.field3340[var14 + 1][var15 - 1] = 9;
                        class192.field3591[var14 + 1][var15 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var18[arg5 + var14][var37 + var15 - 1] & 0x12C01E3) != 0 || (var18[var14 + var37 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class177.field3340[var14 - 1][var15 + 1] == 0 && (var18[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var18[var14 - 1][arg5 + var15] & 0x12C0138) == 0 && (var18[var14][var15 + arg5] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (arg5 - 1 <= var38) {
                        class97.field1697[var41] = var14 - 1;
                        class145.field2777[var41] = var15 + 1;
                        class177.field3340[var14 - 1][var15 + 1] = 6;
                        class192.field3591[var14 - 1][var15 + 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var18[var14 - 1][var38 + var15 + 1] & 0x12C013E) != 0 || (var18[var38 + var14 - 1][arg5 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class177.field3340[var14 + 1][var15 + 1] == 0 && (var18[var14 + 1][arg5 + var15] & 0x12C0138) == 0 && (var18[var14 + arg5][var15 + arg5] & 0x12C01E0) == 0 && (var18[arg5 + var14][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < arg5 - 1; var39++) {
                    if ((var18[var14 + var39 + 1][arg5 + var15] & 0x12C01F8) != 0 || (var18[arg5 + var14][var15 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class97.field1697[var41] = var14 + 1;
                class145.field2777[var41] = var15 + 1;
                var41 = var41 + 1 & 0xFFF;
                class177.field3340[var14 + 1][var15 + 1] = 12;
                class192.field3591[var14 + 1][var15 + 1] = var31;
            }
        }
        class173.field3301 = 0;
        if (!var19) {
            if (!arg11) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg8 - var21; var23 <= arg8 + var21; var23++) {
                for (int var24 = arg7 - var21; var24 <= arg7 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class192.field3591[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var23 < arg8) {
                            var25 = arg8 - var23;
                        } else if (var23 > arg8 + arg10 - 1) {
                            var25 = var23 + 1 - arg10 - arg8;
                        }
                        if (var24 < arg7) {
                            var26 = arg7 - var24;
                        } else if (arg7 + arg9 - 1 < var24) {
                            var26 = var24 + 1 - arg7 - arg9;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class192.field3591[var23][var24] < var22) {
                            var20 = var27;
                            var15 = var24;
                            var14 = var23;
                            var22 = class192.field3591[var23][var24];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg4 == var14 && arg3 == var15) {
                return false;
            }
            class173.field3301 = 1;
        }
        byte var28 = 0;
        class97.field1697[var28] = var14;
        int var42 = var28 + 1;
        class145.field2777[var28] = var15;
        int var29;
        int var30 = var29 = class177.field3340[var14][var15];
        while (arg4 != var14 || arg3 != var15) {
            if (var29 != var30) {
                var29 = var30;
                class97.field1697[var42] = var14;
                class145.field2777[var42++] = var15;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            var30 = class177.field3340[var14][var15];
        }
        if (var42 > 0) {
            class30.method245(true, var42, class145.field2777, class97.field1697, arg0);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
