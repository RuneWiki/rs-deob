package deob;

@ObfuscatedName("j")
public final class class11 {

    @ObfuscatedName("j.f")
    public static int[][][] field103 = new int[4][105][105];

    @ObfuscatedName("j.i")
    public static byte[][][] field86 = new byte[4][104][104];

    @ObfuscatedName("j.u")
    public static int field87 = 99;

    @ObfuscatedName("j.z")
    public static final int[] field91 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("j.x")
    public static final int[] field102 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("j.g")
    public static final int[] field93 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("j.b")
    public static final int[] field94 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("j.k")
    public static final int[] field85 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("j.t")
    public static final int[] field96 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("j.c")
    public static int field89 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("j.e")
    public static int field98 = (int) (Math.random() * 33.0D) - 16;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.f(IIIII)V")
    public static final void method234(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field220[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field103[0][var5][var4] = field103[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field103[0][var5][var4] = field103[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field103[0][var5][var4] = field103[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field103[0][var5][var4] = field103[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.i([BIIII[Ldl;I)V")
    public static final void method197(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class118[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1863[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class154 var9 = new class154(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method1402(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("x.u([BIIIIIII[Ldl;I)V")
    public static final void method178(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1863[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class154 var11 = new class154(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var18 = var13 & 0x7;
                        int var19 = var14 & 0x7;
                        int var21 = arg7 & 0x3;
                        int var22;
                        if (var21 == 0) {
                            var22 = var18;
                        } else if (var21 == 1) {
                            var22 = var19;
                        } else if (var21 == 2) {
                            var22 = 7 - var18;
                        } else {
                            var22 = 7 - var19;
                        }
                        method1402(var11, arg1, arg2 + var22, arg3 + class169.method2154(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method1402(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bs.r(Leo;IIIIIII)V")
    public static final void method1402(class154 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2666();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2666();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2666();
                }
            }
            return;
        }
        field86[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2666();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field103[0][arg2][arg3] = -method3560(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field103[arg1][arg2][arg3] = field103[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2666();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field103[0][arg2][arg3] = -var8 * 8;
                } else {
                    field103[arg1][arg2][arg3] = field103[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1[arg1][arg2][arg3] = arg0.method2667();
                Statics.field30[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1762[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field86[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field88[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ao.o([BIII)Z")
    public static final boolean method812(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class154 var4 = new class154(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2679();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2679();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2666() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class198 var16 = class198.method2502(var5);
                        if (var13 != 22 || !client.field307 || var16.field2917 != 0 || var16.field2915 == 1 || var16.field2946) {
                            if (!var16.method3418()) {
                                client.field360++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2679();
                if (var9 == 0) {
                    break;
                }
                var4.method2666();
            }
        }
    }

    @ObfuscatedName("l.l([BIILcf;[Ldl;I)V")
    public static final void method76(byte[] arg0, int arg1, int arg2, class88 arg3, class118[] arg4) {
        class154 var5 = new class154(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2679();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2679();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2666();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field86[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class118 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method3097(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("fj.n(IIIIIILcf;Ldl;I)V")
    public static final void method3097(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, class118 arg7) {
        if (client.field307 && (field86[0][arg1][arg2] & 0x2) == 0 && (field86[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field87) {
            field87 = arg0;
        }
        class198 var8 = class198.method2502(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2914;
            var10 = var8.field2943;
        } else {
            var9 = var8.field2943;
            var10 = var8.field2914;
        }
        int var11;
        int var12;
        if (arg1 + var9 <= 104) {
            var11 = (var9 >> 1) + arg1;
            var12 = (var9 + 1 >> 1) + arg1;
        } else {
            var11 = arg1;
            var12 = arg1 + 1;
        }
        int var13;
        int var14;
        if (arg2 + var10 <= 104) {
            var13 = (var10 >> 1) + arg2;
            var14 = (var10 + 1 >> 1) + arg2;
        } else {
            var13 = arg2;
            var14 = arg2 + 1;
        }
        int[][] var15 = field103[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field2917 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field2938 == 1) {
            var20 += 256;
        }
        if (var8.method3434()) {
            class32.method177(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field307 || var8.field2917 != 0 || var8.field2915 == 1 || var8.field2946) {
                class90 var21;
                if (var8.field2921 == -1 && var8.field2939 == null) {
                    var21 = var8.method3428(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class50(arg3, 22, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
                }
                arg6.method1655(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field2915 == 1 && arg7 != null) {
                    arg7.method2161(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class90 var44;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var44 = var8.method3428(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class50(arg3, 10, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            if (var44 != null && arg6.method1662(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field2923) {
                int var45 = 15;
                if (var44 instanceof class83) {
                    var45 = ((class83) var44).method1502() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field220[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field220[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field2915 != 0 && arg7 != null) {
                arg7.method2171(arg1, arg2, var9, var10, var8.field2916);
            }
        } else if (arg5 >= 12) {
            class90 var22;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var22 = var8.method3428(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1662(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2167[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2915 != 0 && arg7 != null) {
                arg7.method2171(arg1, arg2, var9, var10, var8.field2916);
            }
        } else if (arg5 == 0) {
            class90 var23;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var23 = var8.method3428(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class50(arg3, 0, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1789(arg0, arg1, arg2, var16, var23, (class90) null, field91[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field2923) {
                    Statics.field220[arg0][arg1][arg2] = 50;
                    Statics.field220[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2934) {
                    Statics.field2167[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2923) {
                    Statics.field220[arg0][arg1][arg2 + 1] = 50;
                    Statics.field220[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2934) {
                    Statics.field2167[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2923) {
                    Statics.field220[arg0][arg1 + 1][arg2] = 50;
                    Statics.field220[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2934) {
                    Statics.field2167[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2923) {
                    Statics.field220[arg0][arg1][arg2] = 50;
                    Statics.field220[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2934) {
                    Statics.field2167[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2915 != 0 && arg7 != null) {
                arg7.method2158(arg1, arg2, arg5, arg4, var8.field2916);
            }
            if (var8.field2900 != 16) {
                arg6.method1665(arg0, arg1, arg2, var8.field2900);
            }
        } else if (arg5 == 1) {
            class90 var24;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var24 = var8.method3428(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class50(arg3, 1, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1789(arg0, arg1, arg2, var16, var24, (class90) null, field102[arg4], 0, var19, var20);
            if (var8.field2923) {
                if (arg4 == 0) {
                    Statics.field220[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field220[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field220[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field220[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2915 != 0 && arg7 != null) {
                arg7.method2158(arg1, arg2, arg5, arg4, var8.field2916);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class90 var26;
            class90 var27;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var26 = var8.method3428(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method3428(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class50(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
                var27 = new class50(arg3, 2, var25, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1789(arg0, arg1, arg2, var16, var26, var27, field91[arg4], field91[var25], var19, var20);
            if (var8.field2934) {
                if (arg4 == 0) {
                    Statics.field2167[arg0][arg1][arg2] |= 0x249;
                    Statics.field2167[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2167[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2167[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2167[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2167[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2167[arg0][arg1][arg2] |= 0x492;
                    Statics.field2167[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2915 != 0 && arg7 != null) {
                arg7.method2158(arg1, arg2, arg5, arg4, var8.field2916);
            }
            if (var8.field2900 != 16) {
                arg6.method1665(arg0, arg1, arg2, var8.field2900);
            }
        } else if (arg5 == 3) {
            class90 var28;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var28 = var8.method3428(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class50(arg3, 3, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1789(arg0, arg1, arg2, var16, var28, (class90) null, field102[arg4], 0, var19, var20);
            if (var8.field2923) {
                if (arg4 == 0) {
                    Statics.field220[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field220[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field220[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field220[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2915 != 0 && arg7 != null) {
                arg7.method2158(arg1, arg2, arg5, arg4, var8.field2916);
            }
        } else if (arg5 == 9) {
            class90 var29;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var29 = var8.method3428(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1662(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field2915 != 0 && arg7 != null) {
                arg7.method2171(arg1, arg2, var9, var10, var8.field2916);
            }
            if (var8.field2900 != 16) {
                arg6.method1665(arg0, arg1, arg2, var8.field2900);
            }
        } else if (arg5 == 4) {
            class90 var30;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var30 = var8.method3428(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1658(arg0, arg1, arg2, var16, var30, (class90) null, field91[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1675(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class198.method2502(var32 >> 14 & 0x7FFF).field2900;
            }
            class90 var33;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var33 = var8.method3428(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1658(arg0, arg1, arg2, var16, var33, (class90) null, field91[arg4], 0, field93[arg4] * var31, field94[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1675(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class198.method2502(var35 >> 14 & 0x7FFF).field2900 / 2;
            }
            class90 var36;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var36 = var8.method3428(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1658(arg0, arg1, arg2, var16, var36, (class90) null, 256, arg4, field85[arg4] * var34, field96[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class90 var38;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var38 = var8.method3428(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class50(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1658(arg0, arg1, arg2, var16, var38, (class90) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1675(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class198.method2502(var40 >> 14 & 0x7FFF).field2900 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class90 var42;
            class90 var43;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var42 = var8.method3428(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method3428(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
                var43 = new class50(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1658(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field85[arg4] * var39, field96[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("dk.m(Lcf;[Ldl;I)V")
    public static final void method1963(class88 arg0, class118[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field86[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field86[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2160(var3, var4);
                        }
                    }
                }
            }
        }
        field89 += (int) (Math.random() * 5.0D) - 2;
        if (field89 < -8) {
            field89 = -8;
        }
        if (field89 > 8) {
            field89 = 8;
        }
        field98 += (int) (Math.random() * 5.0D) - 2;
        if (field98 < -16) {
            field98 = -16;
        }
        if (field98 > 16) {
            field98 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field220[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field103[var6][var11 + 1][var10] - field103[var6][var11 - 1][var10];
                    int var13 = field103[var6][var11][var10 + 1] - field103[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field689[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field95[var20] = 0;
                Statics.field713[var20] = 0;
                Statics.field10[var20] = 0;
                Statics.field3[var20] = 0;
                Statics.field3244[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field88[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class192 var25 = class192.method2922(var24 - 1);
                            Statics.field95[var22] += var25.field2824;
                            Statics.field713[var22] += var25.field2821;
                            Statics.field10[var22] += var25.field2826;
                            Statics.field3[var22] += var25.field2827;
                            var10002 = Statics.field3244[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field88[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class192 var28 = class192.method2922(var27 - 1);
                            Statics.field95[var22] -= var28.field2824;
                            Statics.field713[var22] -= var28.field2821;
                            Statics.field10[var22] -= var28.field2826;
                            Statics.field3[var22] -= var28.field2827;
                            var10002 = Statics.field3244[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var29 = 0;
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = 0;
                    for (int var34 = -5; var34 < 109; var34++) {
                        int var35 = var34 + 5;
                        if (var35 >= 0 && var35 < 104) {
                            var29 += Statics.field95[var35];
                            var30 += Statics.field713[var35];
                            var31 += Statics.field10[var35];
                            var32 += Statics.field3[var35];
                            var33 += Statics.field3244[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field95[var36];
                            var30 -= Statics.field713[var36];
                            var31 -= Statics.field10[var36];
                            var32 -= Statics.field3[var36];
                            var33 -= Statics.field3244[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field307 || (field86[0][var21][var34] & 0x2) != 0 || (field86[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field87) {
                                field87 = var6;
                            }
                            int var37 = Statics.field88[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field1[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field103[var6][var21][var34];
                                int var40 = field103[var6][var21 + 1][var34];
                                int var41 = field103[var6][var21 + 1][var34 + 1];
                                int var42 = field103[var6][var21][var34 + 1];
                                int var43 = Statics.field689[var21][var34];
                                int var44 = Statics.field689[var21 + 1][var34];
                                int var45 = Statics.field689[var21 + 1][var34 + 1];
                                int var46 = Statics.field689[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method1141(var49, var50, var51);
                                    int var52 = field89 + var49 & 0xFF;
                                    int var53 = field98 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method1141(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field30[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class201.method2981(var38 - 1).field3044) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field2167[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class85.field1467[method902(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1659(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method902(var47, var43), method902(var47, var44), method902(var47, var45), method902(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field30[var6][var21][var34] + 1;
                                    byte var57 = Statics.field1762[var6][var21][var34];
                                    class201 var58 = class201.method2981(var38 - 1);
                                    int var59 = var58.field3046;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1473.method1389(var59);
                                        var61 = -1;
                                    } else if (var58.field3051 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method1141(var58.field3049, var58.field3050, var58.field3055);
                                        int var62 = field89 + var58.field3049 & 0xFF;
                                        int var63 = field98 + var58.field3055;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method1141(var62, var58.field3050, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class85.field1467[method1494(var60, 96)];
                                    }
                                    if (var58.field3045 != -1) {
                                        int var65 = field89 + var58.field3052 & 0xFF;
                                        int var66 = field98 + var58.field3054;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method1141(var65, var58.field3053, var66);
                                        var64 = class85.field1467[method1494(var67, 96)];
                                    }
                                    arg0.method1659(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method902(var47, var43), method902(var47, var44), method902(var47, var45), method902(var47, var46), method1494(var61, var43), method1494(var61, var44), method1494(var61, var45), method1494(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field86[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field86[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method1653(var6, var69, var68, var74);
                }
            }
            Statics.field88[var6] = (byte[][]) null;
            Statics.field1[var6] = (byte[][]) null;
            Statics.field30[var6] = (byte[][]) null;
            Statics.field1762[var6] = (byte[][]) null;
            Statics.field220[var6] = (byte[][]) null;
        }
        arg0.method1663(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field86[1][var75][var76] & 0x2) == 2) {
                    arg0.method1651(var75, var76);
                }
            }
        }
        int var77 = 1;
        int var78 = 2;
        int var79 = 4;
        for (int var80 = 0; var80 < 4; var80++) {
            if (var80 > 0) {
                var77 <<= 0x3;
                var78 <<= 0x3;
                var79 <<= 0x3;
            }
            for (int var81 = 0; var81 <= var80; var81++) {
                for (int var82 = 0; var82 <= 104; var82++) {
                    for (int var83 = 0; var83 <= 104; var83++) {
                        if ((Statics.field2167[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field2167[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field2167[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field2167[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field2167[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field103[var87][var83][var84] - var91;
                                int var93 = field103[var86][var83][var84];
                                class88.method1652(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field2167[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2167[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field2167[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field2167[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field2167[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field2167[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field103[var99][var96][var82] - var103;
                                int var105 = field103[var98][var96][var82];
                                class88.method1652(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field2167[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2167[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field2167[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field2167[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field2167[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field2167[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field103[var81][var108][var110];
                                class88.method1652(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field2167[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gh.w(III)I")
    public static final int method3560(int arg0, int arg1) {
        int var2 = method3759(arg0 + 45365, arg1 + 91923, 4) - 128 + (method3759(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method3759(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("hn.j(IIIB)I")
    public static final int method3759(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method648(var3, var5);
        int var8 = method648(var3 + 1, var5);
        int var9 = method648(var3, var5 + 1);
        int var10 = method648(var3 + 1, var5 + 1);
        int var11 = method646(var7, var8, var4, arg2);
        int var12 = method646(var9, var10, var4, arg2);
        return method646(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ag.s(IIIII)I")
    public static final int method646(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1470[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ag.q(III)I")
    public static final int method648(int arg0, int arg1) {
        int var2 = method1401(arg0 - 1, arg1 - 1) + method1401(arg0 + 1, arg1 - 1) + method1401(arg0 - 1, arg1 + 1) + method1401(arg0 + 1, arg1 + 1);
        int var3 = method1401(arg0 - 1, arg1) + method1401(arg0 + 1, arg1) + method1401(arg0, arg1 - 1) + method1401(arg0, arg1 + 1);
        int var4 = method1401(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("bs.d(III)I")
    public static final int method1401(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("az.p(IIB)I")
    public static final int method902(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cv.y(III)I")
    public static final int method1494(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var2 = (arg0 & 0x7F) * arg1 / 128;
            if (var2 < 2) {
                var2 = 2;
            } else if (var2 > 126) {
                var2 = 126;
            }
            return (arg0 & 0xFF80) + var2;
        }
    }

    @ObfuscatedName("bf.a(IIIB)I")
    public static final int method1141(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }
}
