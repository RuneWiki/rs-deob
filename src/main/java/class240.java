import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class240 extends class265 {

    @OriginalMember(owner = "client!am", name = "T", descriptor = "Lwa;")
    public static class75 field4056 = class66.method560("welle2:", false);

    @OriginalMember(owner = "client!am", name = "R", descriptor = "[[I")
    public static int[][] field4054 = new int[5][5000];

    @OriginalMember(owner = "client!am", name = "Y", descriptor = "I")
    public static int field4061 = 0;

    @OriginalMember(owner = "client!am", name = "S", descriptor = "Lwa;")
    public static class75 field4055 = class66.method560("<img=0>", false);

    @OriginalMember(owner = "client!am", name = "X", descriptor = "Lwa;")
    public static class75 field4060 = class66.method560("n", false);

    @OriginalMember(owner = "client!am", name = "bb", descriptor = "Lwa;")
    public static class75 field4064 = class66.method560("Texturen geladen)3", false);

    @OriginalMember(owner = "client!am", name = "P", descriptor = "Lwa;")
    public static class75 field4052 = class66.method560("Wordpack geladen)3", false);

    @OriginalMember(owner = "client!am", name = "cb", descriptor = "Lwa;")
    public static class75 field4065 = class66.method560("name_icons", false);

    @OriginalMember(owner = "client!am", name = "eb", descriptor = "Lwa;")
    private static class75 field4067 = class66.method560("shake:", false);

    @OriginalMember(owner = "client!am", name = "V", descriptor = "Lwa;")
    public static class75 field4058 = field4067;

    @OriginalMember(owner = "client!am", name = "ab", descriptor = "Lwa;")
    public static class75 field4063 = field4067;

    @OriginalMember(owner = "client!am", name = "L", descriptor = "B")
    public byte field4048;

    @OriginalMember(owner = "client!am", name = "J", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!am", name = "M", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!am", name = "N", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!am", name = "O", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!am", name = "Q", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!am", name = "W", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!am", name = "Z", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!am", name = "db", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!am", name = "K", descriptor = "Lja;")
    public class60 field4047;

    @OriginalMember(owner = "client!am", name = "U", descriptor = "[[S")
    public static short[][] field4057;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)[B", line = 13)
    public final byte[] method1751(boolean arg0) {
        field4049++;
        if (!arg0) {
            method1752(115, 93, -76, 71, 75, -101, -4, false, 116, -44, -3, -40);
        }
        if (this.field4575 || this.field4047.field997.length - this.field4048 > this.field4047.field1012) {
            throw new RuntimeException();
        }
        return this.field4047.field997;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIIZIIII)Z", line = 34)
    public static final boolean method1752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        field4059++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class104.field1750[var12][var13] = 0;
                class43.field707[var12][var13] = 99999999;
            }
        }
        class104.field1750[arg9][arg4] = 99;
        class43.field707[arg9][arg4] = 0;
        int var14 = arg9;
        int var15 = arg4;
        byte var16 = 0;
        class263.field4567[var16] = arg9;
        int var32 = var16 + 1;
        class2.field10[var16] = arg4;
        int var17 = 0;
        boolean var18 = false;
        int[][] var19 = class286.field4931[class67.field1174].field1766;
        while (var32 != var17) {
            var14 = class263.field4567[var17];
            var15 = class2.field10[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg8 == var14 && arg6 == var15) {
                var18 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class286.field4931[class67.field1174].method817(var14, var15, arg11, 2, arg2 - 1, arg8, false, arg6)) {
                    var18 = true;
                    break;
                }
                if (arg2 < 10 && class286.field4931[class67.field1174].method823(var14, arg6, arg2 - 1, arg11, 5252, arg8, 2, var15)) {
                    var18 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg10 != 0 && class286.field4931[class67.field1174].method806(arg1, 2, var14, arg10, arg6, 2, arg8, arg3, var15)) {
                var18 = true;
                break;
            }
            int var20 = class43.field707[var14][var15] + 1;
            if (var14 > 0 && class104.field1750[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0) {
                class263.field4567[var32] = var14 - 1;
                class2.field10[var32] = var15;
                class104.field1750[var14 - 1][var15] = 2;
                var32 = var32 + 1 & 0xFFF;
                class43.field707[var14 - 1][var15] = var20;
            }
            if (var14 < 102 && class104.field1750[var14 + 1][var15] == 0 && (var19[var14 + 2][var15] & 0x12C0183) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C01E0) == 0) {
                class263.field4567[var32] = var14 + 1;
                class2.field10[var32] = var15;
                class104.field1750[var14 + 1][var15] = 8;
                class43.field707[var14 + 1][var15] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 > 0 && class104.field1750[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0) {
                class263.field4567[var32] = var14;
                class2.field10[var32] = var15 - 1;
                class104.field1750[var14][var15 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class43.field707[var14][var15 - 1] = var20;
            }
            if (var15 < 102 && class104.field1750[var14][var15 + 1] == 0 && (var19[var14][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 1][var15 + 2] & 0x12C01E0) == 0) {
                class263.field4567[var32] = var14;
                class2.field10[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class104.field1750[var14][var15 + 1] = 4;
                class43.field707[var14][var15 + 1] = var20;
            }
            if (var14 > 0 && var15 > 0 && class104.field1750[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14][var15 - 1] & 0x12C0183) == 0) {
                class263.field4567[var32] = var14 - 1;
                class2.field10[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class104.field1750[var14 - 1][var15 - 1] = 3;
                class43.field707[var14 - 1][var15 - 1] = var20;
            }
            if (var14 < 102 && var15 > 0 && class104.field1750[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 2][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 2][var15] & 0x12C01E0) == 0) {
                class263.field4567[var32] = var14 + 1;
                class2.field10[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class104.field1750[var14 + 1][var15 - 1] = 9;
                class43.field707[var14 + 1][var15 - 1] = var20;
            }
            if (var14 > 0 && var15 < 102 && class104.field1750[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14][var15 + 2] & 0x12C01E0) == 0) {
                class263.field4567[var32] = var14 - 1;
                class2.field10[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class104.field1750[var14 - 1][var15 + 1] = 6;
                class43.field707[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 102 && var15 < 102 && class104.field1750[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 2][var15 + 2] & 0x12C01E0) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C0183) == 0) {
                class263.field4567[var32] = var14 + 1;
                class2.field10[var32] = var15 + 1;
                class104.field1750[var14 + 1][var15 + 1] = 12;
                class43.field707[var14 + 1][var15 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class118.field1998 = 0;
        if (!var18) {
            if (!arg7) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg8 - var23; var24 <= (arg8 + var23); var24++) {
                for (int var25 = arg6 - var23; var25 <= arg6 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class43.field707[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (arg6 > var25) {
                            var26 = arg6 - var25;
                        } else if ((arg6 + arg10 - 1) < var25) {
                            var26 = -arg6 - arg10 - (-1 - var25);
                        }
                        if (var24 < arg8) {
                            var27 = arg8 - var24;
                        } else if ((arg8 + arg3 - 1) < var24) {
                            var27 = var24 + 1 - arg3 - arg8;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && var22 > class43.field707[var24][var25]) {
                            var21 = var28;
                            var15 = var25;
                            var14 = var24;
                            var22 = class43.field707[var24][var25];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg9 == var14 && arg4 == var15) {
                return false;
            }
            class118.field1998 = 1;
        }
        byte var29 = 0;
        if (arg5 != -11105) {
            method1755(72, 76, (byte) -104);
        }
        class263.field4567[var29] = var14;
        int var33 = var29 + 1;
        class2.field10[var29] = var15;
        int var30;
        int var31 = var30 = class104.field1750[var14][var15];
        while (arg9 != var14 || arg4 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class263.field4567[var33] = var14;
                class2.field10[var33++] = var15;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class104.field1750[var14][var15];
        }
        if (var33 > 0) {
            class111.method865(arg0, arg5 ^ 0xFFFFD49F, var33);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIII)I", line = 439)
    public static final int method1753(int arg0, int arg1, int arg2, int arg3) {
        field4050++;
        if (arg3 < 46) {
            return 64;
        }
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!am", name = "g", descriptor = "(I)V", line = 476)
    public static void method1754(int arg0) {
        field4060 = null;
        field4056 = null;
        field4058 = null;
        field4054 = (int[][]) null;
        field4057 = (short[][]) null;
        field4055 = null;
        field4065 = null;
        field4067 = null;
        field4063 = null;
        if (arg0 != 361) {
            field4057 = (short[][]) ((short[][]) null);
        }
        field4064 = null;
        field4052 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIB)I", line = 507)
    public static final int method1755(int arg0, int arg1, byte arg2) {
        field4066++;
        int var3 = class249.method1797(4, arg1 + 45365, (byte) -29, arg0 + 91923) - (128 - ((class249.method1797(2, arg1 + 10294, (byte) -102, arg0 + 37821) - 128 >> 1) + (class249.method1797(1, arg1, (byte) -125, arg0) - 128 >> 2)));
        if (arg2 != 76) {
            field4054 = (int[][]) ((int[][]) null);
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(I)I", line = 536)
    public final int method1756(int arg0) {
        field4046++;
        int var2 = -126 % ((arg0 - 75) / 38);
        return this.field4047 == null ? 0 : this.field4047.field1012 * 100 / (this.field4047.field997.length - this.field4048);
    }
}
