import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class217 {

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Z")
    public boolean field3714 = false;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "[[B")
    public static byte[][] field3706 = new byte[1000][];

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Lic;")
    public static class109 field3712 = new class109();

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Lwa;")
    public static class75 field3717 = class66.method560("Standort", false);

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "[I")
    public static int[] field3716 = new int[100];

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "Li;")
    public static class203 field3715 = new class203(128);

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field3720 = -2;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "Lwa;")
    public static class75 field3719 = class66.method560("Update)2Liste geladen)3", false);

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field3718 = 0;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public int field3705;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "J")
    public long field3704;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "Lpj;")
    public class171 field3707;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZIIIIIIIIII)Z", line = 6)
    public static final boolean method1592(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class104.field1750[var13][var14] = 0;
                class43.field707[var13][var14] = 99999999;
            }
        }
        field3713++;
        class104.field1750[arg4][arg1] = 99;
        class43.field707[arg4][arg1] = 0;
        int var15 = arg4;
        int var16 = arg1;
        byte var17 = 0;
        if (arg9 >= -6) {
            return false;
        }
        boolean var18 = false;
        class263.field4567[var17] = arg4;
        int var19 = 0;
        int var41 = var17 + 1;
        class2.field10[var17] = arg1;
        int[][] var20 = class286.field4931[class67.field1174].field1766;
        label398: while (var41 != var19) {
            var15 = class263.field4567[var19];
            var16 = class2.field10[var19];
            var19 = var19 + 1 & 0xFFF;
            if (arg8 == var15 && arg10 == var16) {
                var18 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && class286.field4931[class67.field1174].method817(var15, var16, arg3, arg12, arg0 - 1, arg8, false, arg10)) {
                    var18 = true;
                    break;
                }
                if (arg0 < 10 && class286.field4931[class67.field1174].method823(var15, arg10, arg0 - 1, arg3, 5252, arg8, arg12, var16)) {
                    var18 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg6 != 0 && class286.field4931[class67.field1174].method806(arg7, 2, var15, arg6, arg10, arg12, arg8, arg11, var16)) {
                var18 = true;
                break;
            }
            int var21 = class43.field707[var15][var16] + 1;
            if (var15 > 0 && class104.field1750[var15 - 1][var16] == 0 && (var20[var15 - 1][var16] & 0x12C010E) == 0 && (var20[var15 - 1][arg12 + var16 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if (var22 >= arg12 - 1) {
                        class263.field4567[var41] = var15 - 1;
                        class2.field10[var41] = var16;
                        class104.field1750[var15 - 1][var16] = 2;
                        var41 = var41 + 1 & 0xFFF;
                        class43.field707[var15 - 1][var16] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class104.field1750[var15 + 1][var16] == 0 && (var20[var15 + arg12][var16] & 0x12C0183) == 0 && (var20[var15 + arg12][var16 - (1 - arg12)] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if ((arg12 - 1) <= var23) {
                        class263.field4567[var41] = var15 + 1;
                        class2.field10[var41] = var16;
                        class104.field1750[var15 + 1][var16] = 8;
                        var41 = var41 + 1 & 0xFFF;
                        class43.field707[var15 + 1][var16] = var21;
                        break;
                    }
                    if ((var20[var15 + arg12][var16 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var16 > 0 && class104.field1750[var15][var16 - 1] == 0 && (var20[var15][var16 - 1] & 0x12C010E) == 0 && (var20[arg12 + var15 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (var24 >= (arg12 - 1)) {
                        class263.field4567[var41] = var15;
                        class2.field10[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class104.field1750[var15][var16 - 1] = 1;
                        class43.field707[var15][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var24][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var16 < 102 && class104.field1750[var15][var16 + 1] == 0 && (var20[var15][arg12 + var16] & 0x12C0138) == 0 && (var20[var15 + arg12 - 1][arg12 + var16] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if (arg12 - 1 <= var25) {
                        class263.field4567[var41] = var15;
                        class2.field10[var41] = var16 + 1;
                        class104.field1750[var15][var16 + 1] = 4;
                        class43.field707[var15][var16 + 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var15 + var25][arg12 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var16 > 0 && class104.field1750[var15 - 1][var16 - 1] == 0 && (var20[var15 - 1][arg12 + var16 - 1 - 1] & 0x12C0138) == 0 && (var20[var15 - 1][var16 - 1] & 0x12C010E) == 0 && (var20[var15 + arg12 - 1 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (var26 >= arg12 - 1) {
                        class263.field4567[var41] = var15 - 1;
                        class2.field10[var41] = var16 - 1;
                        class104.field1750[var15 - 1][var16 - 1] = 3;
                        var41 = var41 + 1 & 0xFFF;
                        class43.field707[var15 - 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var26 - 1] & 0x12C013E) != 0 || (var20[var15 + var26 - 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var16 > 0 && class104.field1750[var15 + 1][var16 - 1] == 0 && (var20[var15 + 1][var16 - 1] & 0x12C010E) == 0 && (var20[arg12 + var15][var16 - 1] & 0x12C0183) == 0 && (var20[arg12 + var15][var16 + arg12 - 1 - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if (arg12 - 1 <= var27) {
                        class263.field4567[var41] = var15 + 1;
                        class2.field10[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class104.field1750[var15 + 1][var16 - 1] = 9;
                        class43.field707[var15 + 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[arg12 + var15][var16 + var27 - 1] & 0x12C01E3) != 0 || (var20[var27 + var15 + 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var16 < 102 && class104.field1750[var15 - 1][var16 + 1] == 0 && (var20[var15 - 1][var16 + 1] & 0x12C010E) == 0 && (var20[var15 - 1][var16 + arg12] & 0x12C0138) == 0 && (var20[var15][arg12 + var16] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (arg12 - 1 <= var28) {
                        class263.field4567[var41] = var15 - 1;
                        class2.field10[var41] = var16 + 1;
                        class104.field1750[var15 - 1][var16 + 1] = 6;
                        var41 = var41 + 1 & 0xFFF;
                        class43.field707[var15 - 1][var16 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var28 + 1] & 0x12C013E) != 0 || (var20[var15 + var28 - 1][arg12 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var16 < 102 && class104.field1750[var15 + 1][var16 + 1] == 0 && (var20[var15 + 1][arg12 + var16] & 0x12C0138) == 0 && (var20[var15 + arg12][var16 + arg12] & 0x12C01E0) == 0 && (var20[var15 + arg12][var16 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < (arg12 - 1); var29++) {
                    if ((var20[var15 + var29 + 1][arg12 + var16] & 0x12C01F8) != 0 || (var20[var15 + arg12][var16 + var29 + 1] & 0x12C01E3) != 0) {
                        continue label398;
                    }
                }
                class263.field4567[var41] = var15 + 1;
                class2.field10[var41] = var16 + 1;
                class104.field1750[var15 + 1][var16 + 1] = 12;
                class43.field707[var15 + 1][var16 + 1] = var21;
                var41 = var41 + 1 & 0xFFF;
            }
        }
        class118.field1998 = 0;
        if (!var18) {
            if (!arg2) {
                return false;
            }
            int var30 = 1000;
            byte var31 = 10;
            int var32 = 100;
            for (int var33 = arg8 - var31; var33 <= arg8 + var31; var33++) {
                for (int var34 = arg10 - var31; var34 <= arg10 + var31; var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class43.field707[var33][var34] < 100) {
                        int var35 = 0;
                        int var36 = 0;
                        if (var33 < arg8) {
                            var36 = arg8 - var33;
                        } else if (var33 > arg8 + arg11 - 1) {
                            var36 = var33 + 1 - arg8 - arg11;
                        }
                        if (arg10 > var34) {
                            var35 = arg10 - var34;
                        } else if (var34 > arg10 + arg6 - 1) {
                            var35 = var34 + 1 - arg6 - arg10;
                        }
                        int var37 = var36 * var36 + (var35 * var35);
                        if (var37 < var30 || var30 == var37 && class43.field707[var33][var34] < var32) {
                            var16 = var34;
                            var30 = var37;
                            var15 = var33;
                            var32 = class43.field707[var33][var34];
                        }
                    }
                }
            }
            if (var30 == 1000) {
                return false;
            }
            if (arg4 == var15 && arg1 == var16) {
                return false;
            }
            class118.field1998 = 1;
        }
        byte var38 = 0;
        class263.field4567[var38] = var15;
        int var42 = var38 + 1;
        class2.field10[var38] = var16;
        int var39;
        int var40 = var39 = class104.field1750[var15][var16];
        while (arg4 != var15 || arg1 != var16) {
            if (var39 != var40) {
                var39 = var40;
                class263.field4567[var42] = var15;
                class2.field10[var42++] = var16;
            }
            if ((var40 & 0x2) != 0) {
                var15++;
            } else if ((var40 & 0x8) != 0) {
                var15--;
            }
            if ((var40 & 0x1) != 0) {
                var16++;
            } else if ((var40 & 0x4) != 0) {
                var16--;
            }
            var40 = class104.field1750[var15][var16];
        }
        if (var42 > 0) {
            class111.method865(arg5, 0, var42);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 503)
    public static void method1593(int arg0) {
        field3706 = (byte[][]) null;
        field3715 = null;
        field3712 = null;
        if (arg0 != -1) {
            method1592(-45, 89, true, 103, -46, 117, 10, 124, -123, 59, 8, 15, 1);
        }
        field3716 = null;
        field3719 = null;
        field3717 = null;
    }
}
