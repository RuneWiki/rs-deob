import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class113 extends class208 {

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Lve;")
    private static class255 field1908 = class87.method607(68, "Loaded textures");

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lve;")
    public static class255 field1905 = field1908;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "[F")
    public static float[] field1911 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "Lve;")
    public static class255 field1913 = class87.method607(108, ": ");

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "Lve;")
    public static class255 field1914 = class87.method607(24, " loggt sich ein)3");

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field1916 = 0;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field1918 = 0;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field1915 = 7759444;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "[I")
    public static int[] field1917 = new int[32];

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZIIIIIZIIIII)Z", line = 6)
    public static final boolean method858(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field1920++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class198.field3418[var13][var14] = 0;
                class239.field3983[var13][var14] = 99999999;
            }
        }
        int var15 = arg6;
        class198.field3418[arg6][arg0] = 99;
        byte var16 = 0;
        class239.field3983[arg6][arg0] = 0;
        boolean var17 = false;
        if (!arg7) {
            field1915 = 72;
        }
        class212.field3617[var16] = arg6;
        int var18 = 0;
        int var41 = var16 + 1;
        class90.field1535[var16] = arg0;
        int var19 = arg0;
        int[][] var20 = class310.field5292[client.field4039].field2743;
        label390: while (var41 != var18) {
            var19 = class90.field1535[var18];
            var15 = class212.field3617[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg8 == var15 && arg10 == var19) {
                var17 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class310.field5292[client.field4039].method1175(arg2, var15, arg11, arg8, arg3 - 1, arg10, (byte) -62, var19)) {
                    var17 = true;
                    break;
                }
                if (arg3 < 10 && class310.field5292[client.field4039].method1182(arg2, arg11, arg8, arg10, arg3 - 1, false, var15, var19)) {
                    var17 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg5 != 0 && class310.field5292[client.field4039].method1184(arg5, (byte) 0, var19, arg8, arg9, var15, arg10, arg4, arg11)) {
                var17 = true;
                break;
            }
            int var21 = class239.field3983[var15][var19] + 1;
            if (var15 > 0 && class198.field3418[var15 - 1][var19] == 0 && (var20[var15 - 1][var19] & 0x12C010E) == 0 && (var20[var15 - 1][arg11 + var19 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if (arg11 - 1 <= var22) {
                        class212.field3617[var41] = var15 - 1;
                        class90.field1535[var41] = var19;
                        class198.field3418[var15 - 1][var19] = 2;
                        class239.field3983[var15 - 1][var19] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var15 - 1][var19 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class198.field3418[var15 + 1][var19] == 0 && (var20[arg11 + var15][var19] & 0x12C0183) == 0 && (var20[arg11 + var15][arg11 + var19 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if (var23 >= arg11 - 1) {
                        class212.field3617[var41] = var15 + 1;
                        class90.field1535[var41] = var19;
                        class198.field3418[var15 + 1][var19] = 8;
                        var41 = var41 + 1 & 0xFFF;
                        class239.field3983[var15 + 1][var19] = var21;
                        break;
                    }
                    if ((var20[arg11 + var15][var19 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var19 > 0 && class198.field3418[var15][var19 - 1] == 0 && (var20[var15][var19 - 1] & 0x12C010E) == 0 && (var20[arg11 + var15 - 1][var19 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (var24 >= arg11 - 1) {
                        class212.field3617[var41] = var15;
                        class90.field1535[var41] = var19 - 1;
                        class198.field3418[var15][var19 - 1] = 1;
                        var41 = var41 + 1 & 0xFFF;
                        class239.field3983[var15][var19 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var24][var19 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var19 < 102 && class198.field3418[var15][var19 + 1] == 0 && (var20[var15][arg11 + var19] & 0x12C0138) == 0 && (var20[arg11 + var15 - 1][var19 + arg11] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if ((arg11 - 1) <= var25) {
                        class212.field3617[var41] = var15;
                        class90.field1535[var41] = var19 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class198.field3418[var15][var19 + 1] = 4;
                        class239.field3983[var15][var19 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var25][arg11 + var19] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var19 > 0 && class198.field3418[var15 - 1][var19 - 1] == 0 && (var20[var15 - 1][var19 - (1 - (arg11 - 1))] & 0x12C0138) == 0 && (var20[var15 - 1][var19 - 1] & 0x12C010E) == 0 && (var20[arg11 + var15 - 1 - 1][var19 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (arg11 - 1 <= var26) {
                        class212.field3617[var41] = var15 - 1;
                        class90.field1535[var41] = var19 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class198.field3418[var15 - 1][var19 - 1] = 3;
                        class239.field3983[var15 - 1][var19 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var19 + var26 - 1] & 0x12C013E) != 0 || (var20[var15 + var26 - 1][var19 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var19 > 0 && class198.field3418[var15 + 1][var19 - 1] == 0 && (var20[var15 + 1][var19 - 1] & 0x12C010E) == 0 && (var20[arg11 + var15][var19 - 1] & 0x12C0183) == 0 && (var20[var15 + arg11][var19 - (-arg11 - -1) - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if (arg11 - 1 <= var27) {
                        class212.field3617[var41] = var15 + 1;
                        class90.field1535[var41] = var19 - 1;
                        class198.field3418[var15 + 1][var19 - 1] = 9;
                        class239.field3983[var15 + 1][var19 - 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[arg11 + var15][var19 + var27 - 1] & 0x12C01E3) != 0 || (var20[var15 + var27 + 1][var19 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var19 < 102 && class198.field3418[var15 - 1][var19 + 1] == 0 && (var20[var15 - 1][var19 + 1] & 0x12C010E) == 0 && (var20[var15 - 1][arg11 + var19] & 0x12C0138) == 0 && (var20[var15][var19 + arg11] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (arg11 - 1 <= var28) {
                        class212.field3617[var41] = var15 - 1;
                        class90.field1535[var41] = var19 + 1;
                        class198.field3418[var15 - 1][var19 + 1] = 6;
                        class239.field3983[var15 - 1][var19 + 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var15 - 1][var19 + var28 + 1] & 0x12C013E) != 0 || (var20[var15 - (1 - var28)][arg11 + var19] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var19 < 102 && class198.field3418[var15 + 1][var19 + 1] == 0 && (var20[var15 + 1][arg11 + var19] & 0x12C0138) == 0 && (var20[arg11 + var15][arg11 + var19] & 0x12C01E0) == 0 && (var20[var15 + arg11][var19 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < (arg11 - 1); var29++) {
                    if ((var20[var15 + var29 + 1][arg11 + var19] & 0x12C01F8) != 0 || (var20[arg11 + var15][var19 + var29 + 1] & 0x12C01E3) != 0) {
                        continue label390;
                    }
                }
                class212.field3617[var41] = var15 + 1;
                class90.field1535[var41] = var19 + 1;
                var41 = var41 + 1 & 0xFFF;
                class198.field3418[var15 + 1][var19 + 1] = 12;
                class239.field3983[var15 + 1][var19 + 1] = var21;
            }
        }
        class160.field2701 = 0;
        if (!var17) {
            if (!arg1) {
                return false;
            }
            int var30 = 1000;
            int var31 = 100;
            byte var32 = 10;
            for (int var33 = arg8 - var32; var33 <= (arg8 + var32); var33++) {
                for (int var34 = arg10 - var32; var34 <= (arg10 + var32); var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class239.field3983[var33][var34] < 100) {
                        int var35 = 0;
                        int var36 = 0;
                        if (var34 < arg10) {
                            var36 = arg10 - var34;
                        } else if (arg5 + arg10 - 1 < var34) {
                            var36 = var34 + 1 - arg10 - arg5;
                        }
                        if (var33 < arg8) {
                            var35 = arg8 - var33;
                        } else if ((arg4 + arg8 - 1) < var33) {
                            var35 = var33 + 1 - (arg8 + arg4);
                        }
                        int var37 = var35 * var35 + (var36 * var36);
                        if (var37 < var30 || var30 == var37 && var31 > class239.field3983[var33][var34]) {
                            var31 = class239.field3983[var33][var34];
                            var30 = var37;
                            var15 = var33;
                            var19 = var34;
                        }
                    }
                }
            }
            if (var30 == 1000) {
                return false;
            }
            if (arg6 == var15 && arg0 == var19) {
                return false;
            }
            class160.field2701 = 1;
        }
        byte var38 = 0;
        class212.field3617[var38] = var15;
        int var42 = var38 + 1;
        class90.field1535[var38] = var19;
        int var39;
        int var40 = var39 = class198.field3418[var15][var19];
        while (arg6 != var15 || arg0 != var19) {
            if (var39 != var40) {
                class212.field3617[var42] = var15;
                class90.field1535[var42++] = var19;
                var39 = var40;
            }
            if ((var40 & 0x2) != 0) {
                var15++;
            } else if ((var40 & 0x8) != 0) {
                var15--;
            }
            if ((var40 & 0x1) != 0) {
                var19++;
            } else if ((var40 & 0x4) != 0) {
                var19--;
            }
            var40 = class198.field3418[var15][var19];
        }
        if (var42 > 0) {
            class124.method920(-31723, arg12, var42);
            return true;
        } else if (arg12 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V", line = 512)
    public static void method859(byte arg0) {
        field1908 = null;
        field1905 = null;
        field1913 = null;
        int var1 = -50 / ((73 - arg0) / 44);
        field1914 = null;
        field1917 = null;
        field1911 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()V", line = 533)
    public static final void method860() {
        for (int var0 = 0; var0 < class124.field2058; var0++) {
            class250 var1 = class253.field4262[var0];
            class112.method852(var1);
            class253.field4262[var0] = null;
        }
        class124.field2058 = 0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIII)I", line = 549)
    public static final int method861(byte arg0, int arg1, int arg2, int arg3) {
        field1919++;
        if (class106.field1783 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = 57 / ((61 - arg0) / 60);
        int var7 = arg1 & 0x7F;
        int var8 = arg3;
        int var9 = arg2 & 0x7F;
        if (arg3 < 3 && (class166.field2800[1][var4][var5] & 0x2) == 2) {
            var8 = arg3 + 1;
        }
        int var10 = (128 - var7) * class106.field1783[var8][var4][var5] + class106.field1783[var8][var4 + 1][var5] * var7 >> 7;
        int var11 = (128 - var7) * class106.field1783[var8][var4][var5 + 1] + class106.field1783[var8][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var9) * var10 + var9 * var11 >> 7;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)I", line = 584)
    public static final int method862(int arg0) {
        if (arg0 != -32263) {
            method859((byte) 43);
        }
        field1907++;
        return 16;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZI)Lve;", line = 601)
    public static final class255 method863(boolean arg0, int arg1) {
        field1912++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException();
        }
        class255 var2 = new class255();
        if (!arg0) {
            field1917 = (int[]) null;
        }
        var2.field4343 = 1;
        var2.field4297 = new byte[1];
        var2.field4297[0] = (byte) arg1;
        return var2;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(II)V", line = 656)
    public class113(int arg0, int arg1) {
        this.field1906 = arg0;
        this.field1909 = arg1;
    }
}
