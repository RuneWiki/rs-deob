import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class38 {

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field586 = 0;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field588 = 0;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Lok;")
    public static class41 field585 = class137.method956("::fps ", 45);

    @OriginalMember(owner = "client!w", name = "g", descriptor = "[I")
    public static int[] field587 = new int[50];

    @OriginalMember(owner = "client!w", name = "j", descriptor = "[J")
    public static long[] field590 = new long[256];

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lok;")
    private static class41 field591 = class137.method956("Hidden", 45);

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lok;")
    public static class41 field589 = field591;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lok;")
    public static class41 field594;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "[I")
    public static int[] field595;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZIIIIIIIIIII)Z", line = 13)
    public static final boolean method258(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class132.field1976[var13][var14] = 0;
                class97.field1426[var13][var14] = 99999999;
            }
        }
        class132.field1976[arg7][arg11] = 99;
        field583++;
        class97.field1426[arg7][arg11] = 0;
        if (arg0 != 19661187) {
            field593 = 48;
        }
        int var15 = arg7;
        int var16 = arg11;
        byte var17 = 0;
        class173.field2810[var17] = arg7;
        int var41 = var17 + 1;
        class138.field2068[var17] = arg11;
        int var18 = 0;
        boolean var19 = false;
        int[][] var20 = class222.field3548[class55.field807].field3570;
        label392: while (var41 != var18) {
            var16 = class138.field2068[var18];
            var15 = class173.field2810[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg2 == var15 && arg3 == var16) {
                var19 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && class222.field3548[class55.field807].method1601(arg12, 19661058, arg2, arg3, var15, var16, arg4, arg6 - 1)) {
                    var19 = true;
                    break;
                }
                if (arg6 < 10 && class222.field3548[class55.field807].method1602(arg12, arg6 - 1, (byte) 42, arg2, var15, arg3, arg4, var16)) {
                    var19 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg10 != 0 && class222.field3548[class55.field807].method1608(var15, arg0 - 19661155, arg2, arg9, var16, arg12, arg5, arg10, arg3)) {
                var19 = true;
                break;
            }
            int var21 = class97.field1426[var15][var16] + 1;
            if (var15 > 0 && class132.field1976[var15 - 1][var16] == 0 && (var20[var15 - 1][var16] & 0x12C010E) == 0 && (var20[var15 - 1][var16 + arg12 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if (var22 >= arg12 - 1) {
                        class173.field2810[var41] = var15 - 1;
                        class138.field2068[var41] = var16;
                        var41 = var41 + 1 & 0xFFF;
                        class132.field1976[var15 - 1][var16] = 2;
                        class97.field1426[var15 - 1][var16] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class132.field1976[var15 + 1][var16] == 0 && (var20[var15 + arg12][var16] & 0x12C0183) == 0 && (var20[arg12 + var15][arg12 + var16 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if ((arg12 - 1) <= var23) {
                        class173.field2810[var41] = var15 + 1;
                        class138.field2068[var41] = var16;
                        class132.field1976[var15 + 1][var16] = 8;
                        class97.field1426[var15 + 1][var16] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[arg12 + var15][var16 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var16 > 0 && class132.field1976[var15][var16 - 1] == 0 && (var20[var15][var16 - 1] & 0x12C010E) == 0 && (var20[var15 + arg12 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (var24 >= (arg12 - 1)) {
                        class173.field2810[var41] = var15;
                        class138.field2068[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class132.field1976[var15][var16 - 1] = 1;
                        class97.field1426[var15][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var24][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var16 < 102 && class132.field1976[var15][var16 + 1] == 0 && (var20[var15][arg12 + var16] & 0x12C0138) == 0 && (var20[var15 - (1 - arg12)][var16 + arg12] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if (arg12 - 1 <= var25) {
                        class173.field2810[var41] = var15;
                        class138.field2068[var41] = var16 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class132.field1976[var15][var16 + 1] = 4;
                        class97.field1426[var15][var16 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var25][arg12 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var16 > 0 && class132.field1976[var15 - 1][var16 - 1] == 0 && (var20[var15 - 1][var16 + arg12 - 1 - 1] & 0x12C0138) == 0 && (var20[var15 - 1][var16 - 1] & 0x12C010E) == 0 && (var20[var15 - (-arg12 - -1) - 1][var16 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if ((arg12 - 1) <= var26) {
                        class173.field2810[var41] = var15 - 1;
                        class138.field2068[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class132.field1976[var15 - 1][var16 - 1] = 3;
                        class97.field1426[var15 - 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var26 + var16 - 1] & 0x12C013E) != 0 || (var20[var15 + var26 - 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var16 > 0 && class132.field1976[var15 + 1][var16 - 1] == 0 && (var20[var15 + 1][var16 - 1] & 0x12C010E) == 0 && (var20[arg12 + var15][var16 - 1] & 0x12C0183) == 0 && (var20[arg12 + var15][var16 + arg12 - 1 - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if (var27 >= arg12 - 1) {
                        class173.field2810[var41] = var15 + 1;
                        class138.field2068[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class132.field1976[var15 + 1][var16 - 1] = 9;
                        class97.field1426[var15 + 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[arg12 + var15][var16 + var27 - 1] & 0x12C01E3) != 0 || (var20[var15 + var27 + 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var16 < 102 && class132.field1976[var15 - 1][var16 + 1] == 0 && (var20[var15 - 1][var16 + 1] & 0x12C010E) == 0 && (var20[var15 - 1][var16 + arg12] & 0x12C0138) == 0 && (var20[var15][arg12 + var16] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if ((arg12 - 1) <= var28) {
                        class173.field2810[var41] = var15 - 1;
                        class138.field2068[var41] = var16 + 1;
                        class132.field1976[var15 - 1][var16 + 1] = 6;
                        var41 = var41 + 1 & 0xFFF;
                        class97.field1426[var15 - 1][var16 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var28 + 1] & 0x12C013E) != 0 || (var20[var15 + var28 - 1][var16 + arg12] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var16 < 102 && class132.field1976[var15 + 1][var16 + 1] == 0 && (var20[var15 + 1][var16 + arg12] & 0x12C0138) == 0 && (var20[arg12 + var15][arg12 + var16] & 0x12C01E0) == 0 && (var20[var15 + arg12][var16 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < arg12 - 1; var29++) {
                    if ((var20[var15 + var29 + 1][arg12 + var16] & 0x12C01F8) != 0 || (var20[var15 + arg12][var16 + var29 + 1] & 0x12C01E3) != 0) {
                        continue label392;
                    }
                }
                class173.field2810[var41] = var15 + 1;
                class138.field2068[var41] = var16 + 1;
                class132.field1976[var15 + 1][var16 + 1] = 12;
                var41 = var41 + 1 & 0xFFF;
                class97.field1426[var15 + 1][var16 + 1] = var21;
            }
        }
        class292.field4732 = 0;
        if (!var19) {
            if (!arg1) {
                return false;
            }
            int var30 = 1000;
            int var31 = 100;
            byte var32 = 10;
            for (int var33 = arg2 - var32; var33 <= (arg2 + var32); var33++) {
                for (int var34 = arg3 - var32; var34 <= (arg3 + var32); var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class97.field1426[var33][var34] < 100) {
                        int var35 = 0;
                        if (var34 < arg3) {
                            var35 = arg3 - var34;
                        } else if (var34 > arg3 + arg10 - 1) {
                            var35 = var34 + 1 - arg3 - arg10;
                        }
                        int var36 = 0;
                        if (var33 < arg2) {
                            var36 = arg2 - var33;
                        } else if (arg2 + arg9 - 1 < var33) {
                            var36 = var33 + 1 - arg2 - arg9;
                        }
                        int var37 = var35 * var35 + var36 * var36;
                        if (var37 < var30 || var30 == var37 && class97.field1426[var33][var34] < var31) {
                            var31 = class97.field1426[var33][var34];
                            var15 = var33;
                            var16 = var34;
                            var30 = var37;
                        }
                    }
                }
            }
            if (var30 == 1000) {
                return false;
            }
            if (arg7 == var15 && arg11 == var16) {
                return false;
            }
            class292.field4732 = 1;
        }
        byte var38 = 0;
        class173.field2810[var38] = var15;
        int var42 = var38 + 1;
        class138.field2068[var38] = var16;
        int var39;
        int var40 = var39 = class132.field1976[var15][var16];
        while (arg7 != var15 || arg11 != var16) {
            if (var39 != var40) {
                class173.field2810[var42] = var15;
                var39 = var40;
                class138.field2068[var42++] = var16;
            }
            if ((var40 & 0x1) != 0) {
                var16++;
            } else if ((var40 & 0x4) != 0) {
                var16--;
            }
            if ((var40 & 0x2) != 0) {
                var15++;
            } else if ((var40 & 0x8) != 0) {
                var15--;
            }
            var40 = class132.field1976[var15][var16];
        }
        if (var42 > 0) {
            class296.method2042((byte) 92, arg8, var42);
            return true;
        } else if (arg8 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 512)
    public static void method259(byte arg0) {
        field589 = null;
        field594 = null;
        field587 = null;
        field591 = null;
        if (arg0 < 122) {
            field591 = (class41) null;
        }
        field585 = null;
        field590 = null;
        field595 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field590[var0] = var1;
        }
        field594 = class137.method956("Lade Titelbild )2 ", 45);
        field596 = 0;
        field595 = new int[50];
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B[B)[B", line = 539)
    public static final byte[] method260(byte arg0, byte[] arg1) {
        field592++;
        int var2 = arg1.length;
        if (arg0 != 61) {
            method259((byte) 34);
        }
        byte[] var3 = new byte[var2];
        class21.method144(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)Lok;", line = 577)
    public static final class41 method261(int arg0, int arg1) {
        field582++;
        return arg1 >= ~arg0 ? class232.field3669 : class1.method4(arg0, (byte) 98);
    }
}
