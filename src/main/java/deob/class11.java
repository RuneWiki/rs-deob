package deob;

@ObfuscatedName("z")
public final class class11 {

    @ObfuscatedName("z.o")
    public static int[][][] field94 = new int[4][105][105];

    @ObfuscatedName("z.m")
    public static byte[][][] field82 = new byte[4][104][104];

    @ObfuscatedName("z.b")
    public static int field95 = 99;

    @ObfuscatedName("z.d")
    public static final int[] field93 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("z.w")
    public static final int[] field88 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("z.n")
    public static final int[] field90 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("z.q")
    public static final int[] field96 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("z.t")
    public static final int[] field101 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("z.r")
    public static final int[] field98 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("z.a")
    public static int field99 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("z.e")
    public static int field100 = (int) (Math.random() * 33.0D) - 16;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.o(IIIII)V")
    public static final void method667(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field81[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field94[0][var5][var4] = field94[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field94[0][var5][var4] = field94[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field94[0][var5][var4] = field94[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field94[0][var5][var4] = field94[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.m([BIIII[Ldh;I)V")
    public static final void method185(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class118[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1851[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class154 var9 = new class154(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method1781(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("cb.b([BIIIIIII[Ldh;I)V")
    public static final void method1752(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1851[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class154 var11 = new class154(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method1781(var11, arg1, arg2 + class169.method175(var13 & 0x7, var14 & 0x7, arg7), arg3 + class169.method715(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method1781(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cw.g(Lez;IIIIIII)V")
    public static final void method1781(class154 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2552();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2552();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2552();
                }
            }
            return;
        }
        field82[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2552();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field94[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method8(var10 + 45365, var11 + 91923, 4) - 128 + (method8(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method8(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field94[arg1][arg2][arg3] = field94[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2552();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field94[0][arg2][arg3] = -var15 * 8;
                } else {
                    field94[arg1][arg2][arg3] = field94[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field3073[arg1][arg2][arg3] = arg0.method2553();
                Statics.field2738[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field83[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field82[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field84[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("f.l([BIILcl;[Ldh;I)V")
    public static final void method169(byte[] arg0, int arg1, int arg2, class88 arg3, class118[] arg4) {
        class154 var5 = new class154(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2668();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2668();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2552();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field82[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class118 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method3264(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("gx.c(IIIIIILcl;Ldh;B)V")
    public static final void method3264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, class118 arg7) {
        if (client.field315 && (field82[0][arg1][arg2] & 0x2) == 0 && (field82[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field95) {
            field95 = arg0;
        }
        class198 var8 = class198.method2463(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2939;
            var10 = var8.field2906;
        } else {
            var9 = var8.field2906;
            var10 = var8.field2939;
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
        int[][] var15 = field94[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field2910 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field2931 == 1) {
            var20 += 256;
        }
        if (var8.method3324()) {
            class32.method1586(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field315 || var8.field2910 != 0 || var8.field2908 == 1 || var8.field2929) {
                class90 var21;
                if (var8.field2907 == -1 && var8.field2932 == null) {
                    var21 = var8.method3319(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class50(arg3, 22, arg4, arg0, arg1, arg2, var8.field2907, true, (class90) null);
                }
                arg6.method1706(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field2908 == 1 && arg7 != null) {
                    arg7.method2058(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class90 var44;
            if (var8.field2907 == -1 && var8.field2932 == null) {
                var44 = var8.method3319(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class50(arg3, 10, arg4, arg0, arg1, arg2, var8.field2907, true, (class90) null);
            }
            if (var44 != null && arg6.method1731(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field2922) {
                int var45 = 15;
                if (var44 instanceof class83) {
                    var45 = ((class83) var44).method1452() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field81[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field81[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field2908 != 0 && arg7 != null) {
                arg7.method2053(arg1, arg2, var9, var10, var8.field2919);
            }
        } else if (arg5 >= 12) {
            class90 var22;
            if (var8.field2907 == -1 && var8.field2932 == null) {
                var22 = var8.method3319(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2907, true, (class90) null);
            }
            arg6.method1731(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1597[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2908 != 0 && arg7 != null) {
                arg7.method2053(arg1, arg2, var9, var10, var8.field2919);
            }
        } else if (arg5 == 0) {
            class90 var23;
            if (var8.field2907 == -1 && var8.field2932 == null) {
                var23 = var8.method3319(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class50(arg3, 0, arg4, arg0, arg1, arg2, var8.field2907, true, (class90) null);
            }
            arg6.method1744(arg0, arg1, arg2, var16, var23, (class90) null, field93[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field2922) {
                    Statics.field81[arg0][arg1][arg2] = 50;
                    Statics.field81[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2891) {
                    Statics.field1597[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2922) {
                    Statics.field81[arg0][arg1][arg2 + 1] = 50;
                    Statics.field81[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2891) {
                    Statics.field1597[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2922) {
                    Statics.field81[arg0][arg1 + 1][arg2] = 50;
                    Statics.field81[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2891) {
                    Statics.field1597[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2922) {
                    Statics.field81[arg0][arg1][arg2] = 50;
                    Statics.field81[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2891) {
                    Statics.field1597[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2908 != 0 && arg7 != null) {
                arg7.method2055(arg1, arg2, arg5, arg4, var8.field2919);
            }
            if (var8.field2915 != 16) {
                arg6.method1606(arg0, arg1, arg2, var8.field2915);
            }
        } else if (arg5 == 1) {
            class90 var24;
            if (var8.field2907 == -1 && var8.field2932 == null) {
                var24 = var8.method3319(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class50(arg3, 1, arg4, arg0, arg1, arg2, var8.field2907, true, (class90) null);
            }
            arg6.method1744(arg0, arg1, arg2, var16, var24, (class90) null, field88[arg4], 0, var19, var20);
            if (var8.field2922) {
                if (arg4 == 0) {
                    Statics.field81[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field81[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field81[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field81[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2908 != 0 && arg7 != null) {
                arg7.method2055(arg1, arg2, arg5, arg4, var8.field2919);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class90 var26;
            class90 var27;
            if (var8.field2907 == -1 && var8.field2932 == null) {
                var26 = var8.method3319(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method3319(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class50(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2907, true, (class90) null);
                var27 = new class50(arg3, 2, var25, arg0, arg1, arg2, var8.field2907, true, (class90) null);
            }
            arg6.method1744(arg0, arg1, arg2, var16, var26, var27, field93[arg4], field93[var25], var19, var20);
            if (var8.field2891) {
                if (arg4 == 0) {
                    Statics.field1597[arg0][arg1][arg2] |= 0x249;
                    Statics.field1597[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1597[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1597[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1597[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1597[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1597[arg0][arg1][arg2] |= 0x492;
                    Statics.field1597[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2908 != 0 && arg7 != null) {
                arg7.method2055(arg1, arg2, arg5, arg4, var8.field2919);
            }
            if (var8.field2915 != 16) {
                arg6.method1606(arg0, arg1, arg2, var8.field2915);
            }
        } else if (arg5 == 3) {
            class90 var28;
            if (var8.field2907 == -1 && var8.field2932 == null) {
                var28 = var8.method3319(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class50(arg3, 3, arg4, arg0, arg1, arg2, var8.field2907, true, (class90) null);
            }
            arg6.method1744(arg0, arg1, arg2, var16, var28, (class90) null, field88[arg4], 0, var19, var20);
            if (var8.field2922) {
                if (arg4 == 0) {
                    Statics.field81[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field81[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field81[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field81[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2908 != 0 && arg7 != null) {
                arg7.method2055(arg1, arg2, arg5, arg4, var8.field2919);
            }
        } else if (arg5 == 9) {
            class90 var29;
            if (var8.field2907 == -1 && var8.field2932 == null) {
                var29 = var8.method3319(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2907, true, (class90) null);
            }
            arg6.method1731(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field2908 != 0 && arg7 != null) {
                arg7.method2053(arg1, arg2, var9, var10, var8.field2919);
            }
            if (var8.field2915 != 16) {
                arg6.method1606(arg0, arg1, arg2, var8.field2915);
            }
        } else if (arg5 == 4) {
            class90 var30;
            if (var8.field2907 == -1 && var8.field2932 == null) {
                var30 = var8.method3319(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2907, true, (class90) null);
            }
            arg6.method1599(arg0, arg1, arg2, var16, var30, (class90) null, field93[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1747(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class198.method2463(var32 >> 14 & 0x7FFF).field2915;
            }
            class90 var33;
            if (var8.field2907 == -1 && var8.field2932 == null) {
                var33 = var8.method3319(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2907, true, (class90) null);
            }
            arg6.method1599(arg0, arg1, arg2, var16, var33, (class90) null, field93[arg4], 0, field90[arg4] * var31, field96[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1747(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class198.method2463(var35 >> 14 & 0x7FFF).field2915 / 2;
            }
            class90 var36;
            if (var8.field2907 == -1 && var8.field2932 == null) {
                var36 = var8.method3319(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2907, true, (class90) null);
            }
            arg6.method1599(arg0, arg1, arg2, var16, var36, (class90) null, 256, arg4, field101[arg4] * var34, field98[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class90 var38;
            if (var8.field2907 == -1 && var8.field2932 == null) {
                var38 = var8.method3319(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class50(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field2907, true, (class90) null);
            }
            arg6.method1599(arg0, arg1, arg2, var16, var38, (class90) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1747(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class198.method2463(var40 >> 14 & 0x7FFF).field2915 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class90 var42;
            class90 var43;
            if (var8.field2907 == -1 && var8.field2932 == null) {
                var42 = var8.method3319(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method3319(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2907, true, (class90) null);
                var43 = new class50(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field2907, true, (class90) null);
            }
            arg6.method1599(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field101[arg4] * var39, field98[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("az.u(Lcl;[Ldh;I)V")
    public static final void method805(class88 arg0, class118[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field82[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field82[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2068(var3, var4);
                        }
                    }
                }
            }
        }
        field99 += (int) (Math.random() * 5.0D) - 2;
        if (field99 < -8) {
            field99 = -8;
        }
        if (field99 > 8) {
            field99 = 8;
        }
        field100 += (int) (Math.random() * 5.0D) - 2;
        if (field100 < -16) {
            field100 = -16;
        }
        if (field100 > 16) {
            field100 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field81[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field94[var6][var11 + 1][var10] - field94[var6][var11 - 1][var10];
                    int var13 = field94[var6][var11][var10 + 1] - field94[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field87[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field2033[var20] = 0;
                Statics.field105[var20] = 0;
                Statics.field89[var20] = 0;
                Statics.field85[var20] = 0;
                Statics.field91[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field84[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class192 var26 = (class192) class192.field2818.method2130((long) var25);
                            class192 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field4.method3012(1, var25);
                                class192 var29 = new class192();
                                if (var28 != null) {
                                    var29.method3192(new class154(var28), var25);
                                }
                                var29.method3191();
                                class192.field2818.method2132(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field2033[var22] += var27.field2811;
                            Statics.field105[var22] += var27.field2813;
                            Statics.field89[var22] += var27.field2810;
                            Statics.field85[var22] += var27.field2809;
                            var10002 = Statics.field91[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field84[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class192 var34 = (class192) class192.field2818.method2130((long) var33);
                            class192 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field4.method3012(1, var33);
                                class192 var37 = new class192();
                                if (var36 != null) {
                                    var37.method3192(new class154(var36), var33);
                                }
                                var37.method3191();
                                class192.field2818.method2132(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field2033[var22] -= var35.field2811;
                            Statics.field105[var22] -= var35.field2813;
                            Statics.field89[var22] -= var35.field2810;
                            Statics.field85[var22] -= var35.field2809;
                            var10002 = Statics.field91[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var39 = 0;
                    int var40 = 0;
                    int var41 = 0;
                    int var42 = 0;
                    int var43 = 0;
                    for (int var44 = -5; var44 < 109; var44++) {
                        int var45 = var44 + 5;
                        if (var45 >= 0 && var45 < 104) {
                            var39 += Statics.field2033[var45];
                            var40 += Statics.field105[var45];
                            var41 += Statics.field89[var45];
                            var42 += Statics.field85[var45];
                            var43 += Statics.field91[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field2033[var46];
                            var40 -= Statics.field105[var46];
                            var41 -= Statics.field89[var46];
                            var42 -= Statics.field85[var46];
                            var43 -= Statics.field91[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field315 || (field82[0][var21][var44] & 0x2) != 0 || (field82[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field95) {
                                field95 = var6;
                            }
                            int var47 = Statics.field84[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field3073[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field94[var6][var21][var44];
                                int var50 = field94[var6][var21 + 1][var44];
                                int var51 = field94[var6][var21 + 1][var44 + 1];
                                int var52 = field94[var6][var21][var44 + 1];
                                int var53 = Statics.field87[var21][var44];
                                int var54 = Statics.field87[var21 + 1][var44];
                                int var55 = Statics.field87[var21 + 1][var44 + 1];
                                int var56 = Statics.field87[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method3166(var59, var60, var61);
                                    int var62 = field99 + var59 & 0xFF;
                                    int var63 = field100 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method3166(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field2738[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0 && !class201.method1770(var48 - 1).field3043) {
                                        var64 = false;
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field1597[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var58 != -1) {
                                    var65 = class85.field1428[method2737(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1595(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method2737(var57, var53), method2737(var57, var54), method2737(var57, var55), method2737(var57, var56), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field2738[var6][var21][var44] + 1;
                                    byte var67 = Statics.field83[var6][var21][var44];
                                    class201 var68 = class201.method1770(var48 - 1);
                                    int var69 = var68.field3037;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1443.method1332(var69);
                                        var71 = -1;
                                    } else if (var68.field3036 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method3166(var68.field3038, var68.field3041, var68.field3042);
                                        int var72 = field99 + var68.field3038 & 0xFF;
                                        int var73 = field100 + var68.field3042;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method3166(var72, var68.field3041, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class85.field1428[method3478(var70, 96)];
                                    }
                                    if (var68.field3035 != -1) {
                                        int var75 = field99 + var68.field3034 & 0xFF;
                                        int var76 = field100 + var68.field3039;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method3166(var75, var68.field3044, var76);
                                        var74 = class85.field1428[method3478(var77, 96)];
                                    }
                                    arg0.method1595(var6, var21, var44, var66, var67, var69, var49, var50, var51, var52, method2737(var57, var53), method2737(var57, var54), method2737(var57, var55), method2737(var57, var56), method3478(var71, var53), method3478(var71, var54), method3478(var71, var55), method3478(var71, var56), var65, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    int var84;
                    if ((field82[var6][var79][var78] & 0x8) != 0) {
                        var84 = 0;
                    } else if (var6 <= 0 || (field82[1][var79][var78] & 0x2) == 0) {
                        var84 = var6;
                    } else {
                        var84 = var6 - 1;
                    }
                    arg0.method1594(var6, var79, var78, var84);
                }
            }
            Statics.field84[var6] = (byte[][]) null;
            Statics.field3073[var6] = (byte[][]) null;
            Statics.field2738[var6] = (byte[][]) null;
            Statics.field83[var6] = (byte[][]) null;
            Statics.field81[var6] = (byte[][]) null;
        }
        arg0.method1621(-50, -10, -50);
        for (int var85 = 0; var85 < 104; var85++) {
            for (int var86 = 0; var86 < 104; var86++) {
                if ((field82[1][var85][var86] & 0x2) == 2) {
                    arg0.method1592(var85, var86);
                }
            }
        }
        int var87 = 1;
        int var88 = 2;
        int var89 = 4;
        for (int var90 = 0; var90 < 4; var90++) {
            if (var90 > 0) {
                var87 <<= 0x3;
                var88 <<= 0x3;
                var89 <<= 0x3;
            }
            for (int var91 = 0; var91 <= var90; var91++) {
                for (int var92 = 0; var92 <= 104; var92++) {
                    for (int var93 = 0; var93 <= 104; var93++) {
                        if ((Statics.field1597[var91][var93][var92] & var87) != 0) {
                            int var94 = var92;
                            int var95 = var92;
                            int var96 = var91;
                            int var97 = var91;
                            while (var94 > 0 && (Statics.field1597[var91][var93][var94 - 1] & var87) != 0) {
                                var94--;
                            }
                            while (var95 < 104 && (Statics.field1597[var91][var93][var95 + 1] & var87) != 0) {
                                var95++;
                            }
                            label361: while (var96 > 0) {
                                for (int var98 = var94; var98 <= var95; var98++) {
                                    if ((Statics.field1597[var96 - 1][var93][var98] & var87) == 0) {
                                        break label361;
                                    }
                                }
                                var96--;
                            }
                            label350: while (var97 < var90) {
                                for (int var99 = var94; var99 <= var95; var99++) {
                                    if ((Statics.field1597[var97 + 1][var93][var99] & var87) == 0) {
                                        break label350;
                                    }
                                }
                                var97++;
                            }
                            int var100 = (var97 + 1 - var96) * (var95 - var94 + 1);
                            if (var100 >= 8) {
                                short var101 = 240;
                                int var102 = field94[var97][var93][var94] - var101;
                                int var103 = field94[var96][var93][var94];
                                class88.method1593(var90, 1, var93 * 128, var93 * 128, var94 * 128, var95 * 128 + 128, var102, var103);
                                for (int var104 = var96; var104 <= var97; var104++) {
                                    for (int var105 = var94; var105 <= var95; var105++) {
                                        Statics.field1597[var104][var93][var105] &= ~var87;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1597[var91][var93][var92] & var88) != 0) {
                            int var106 = var93;
                            int var107 = var93;
                            int var108 = var91;
                            int var109 = var91;
                            while (var106 > 0 && (Statics.field1597[var91][var106 - 1][var92] & var88) != 0) {
                                var106--;
                            }
                            while (var107 < 104 && (Statics.field1597[var91][var107 + 1][var92] & var88) != 0) {
                                var107++;
                            }
                            label414: while (var108 > 0) {
                                for (int var110 = var106; var110 <= var107; var110++) {
                                    if ((Statics.field1597[var108 - 1][var110][var92] & var88) == 0) {
                                        break label414;
                                    }
                                }
                                var108--;
                            }
                            label403: while (var109 < var90) {
                                for (int var111 = var106; var111 <= var107; var111++) {
                                    if ((Statics.field1597[var109 + 1][var111][var92] & var88) == 0) {
                                        break label403;
                                    }
                                }
                                var109++;
                            }
                            int var112 = (var109 + 1 - var108) * (var107 - var106 + 1);
                            if (var112 >= 8) {
                                short var113 = 240;
                                int var114 = field94[var109][var106][var92] - var113;
                                int var115 = field94[var108][var106][var92];
                                class88.method1593(var90, 2, var106 * 128, var107 * 128 + 128, var92 * 128, var92 * 128, var114, var115);
                                for (int var116 = var108; var116 <= var109; var116++) {
                                    for (int var117 = var106; var117 <= var107; var117++) {
                                        Statics.field1597[var116][var117][var92] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1597[var91][var93][var92] & var89) != 0) {
                            int var118 = var93;
                            int var119 = var93;
                            int var120 = var92;
                            int var121 = var92;
                            while (var120 > 0 && (Statics.field1597[var91][var93][var120 - 1] & var89) != 0) {
                                var120--;
                            }
                            while (var121 < 104 && (Statics.field1597[var91][var93][var121 + 1] & var89) != 0) {
                                var121++;
                            }
                            label467: while (var118 > 0) {
                                for (int var122 = var120; var122 <= var121; var122++) {
                                    if ((Statics.field1597[var91][var118 - 1][var122] & var89) == 0) {
                                        break label467;
                                    }
                                }
                                var118--;
                            }
                            label456: while (var119 < 104) {
                                for (int var123 = var120; var123 <= var121; var123++) {
                                    if ((Statics.field1597[var91][var119 + 1][var123] & var89) == 0) {
                                        break label456;
                                    }
                                }
                                var119++;
                            }
                            if ((var119 - var118 + 1) * (var121 - var120 + 1) >= 4) {
                                int var124 = field94[var91][var118][var120];
                                class88.method1593(var90, 4, var118 * 128, var119 * 128 + 128, var120 * 128, var121 * 128 + 128, var124, var124);
                                for (int var125 = var118; var125 <= var119; var125++) {
                                    for (int var126 = var120; var126 <= var121; var126++) {
                                        Statics.field1597[var91][var125][var126] &= ~var89;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.k(IIII)I")
    public static final int method8(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1769(var3, var5);
        int var8 = method1769(var3 + 1, var5);
        int var9 = method1769(var3, var5 + 1);
        int var10 = method1769(var3 + 1, var5 + 1);
        int var11 = method2286(var7, var8, var4, arg2);
        int var12 = method2286(var9, var10, var4, arg2);
        return method2286(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ev.z(IIIII)I")
    public static final int method2286(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1447[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ci.y(III)I")
    public static final int method1769(int arg0, int arg1) {
        int var2 = method2757(arg0 - 1, arg1 - 1) + method2757(arg0 + 1, arg1 - 1) + method2757(arg0 - 1, arg1 + 1) + method2757(arg0 + 1, arg1 + 1);
        int var3 = method2757(arg0 - 1, arg1) + method2757(arg0 + 1, arg1) + method2757(arg0, arg1 - 1) + method2757(arg0, arg1 + 1);
        int var4 = method2757(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("el.j(III)I")
    public static final int method2757(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ez.f(IIB)I")
    public static final int method2737(int arg0, int arg1) {
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

    @ObfuscatedName("gf.p(III)I")
    public static final int method3478(int arg0, int arg1) {
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

    @ObfuscatedName("gw.i(IIIB)I")
    public static final int method3166(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("n.s(IIIIIIILcl;Ldh;B)V")
    public static final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class88 arg7, class118 arg8) {
        class198 var9 = class198.method2463(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field2939;
            var11 = var9.field2906;
        } else {
            var10 = var9.field2906;
            var11 = var9.field2939;
        }
        int var12;
        int var13;
        if (arg2 + var10 <= 104) {
            var12 = (var10 >> 1) + arg2;
            var13 = (var10 + 1 >> 1) + arg2;
        } else {
            var12 = arg2;
            var13 = arg2 + 1;
        }
        int var14;
        int var15;
        if (arg3 + var11 <= 104) {
            var14 = (var11 >> 1) + arg3;
            var15 = (var11 + 1 >> 1) + arg3;
        } else {
            var14 = arg3;
            var15 = arg3 + 1;
        }
        int[][] var16 = field94[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field2910 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field2931 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class90 var22;
            if (var9.field2907 == -1 && var9.field2932 == null) {
                var22 = var9.method3327(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class50(arg4, 22, arg5, arg1, arg2, arg3, var9.field2907, true, (class90) null);
            }
            arg7.method1706(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field2908 == 1) {
                arg8.method2058(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class90 var45;
            if (var9.field2907 == -1 && var9.field2932 == null) {
                var45 = var9.method3327(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class50(arg4, 10, arg5, arg1, arg2, arg3, var9.field2907, true, (class90) null);
            }
            if (var45 != null) {
                arg7.method1731(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field2908 != 0) {
                arg8.method2053(arg2, arg3, var10, var11, var9.field2919);
            }
        } else if (arg6 >= 12) {
            class90 var23;
            if (var9.field2907 == -1 && var9.field2932 == null) {
                var23 = var9.method3327(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class50(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2907, true, (class90) null);
            }
            arg7.method1731(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field2908 != 0) {
                arg8.method2053(arg2, arg3, var10, var11, var9.field2919);
            }
        } else if (arg6 == 0) {
            class90 var24;
            if (var9.field2907 == -1 && var9.field2932 == null) {
                var24 = var9.method3327(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class50(arg4, 0, arg5, arg1, arg2, arg3, var9.field2907, true, (class90) null);
            }
            arg7.method1744(arg0, arg2, arg3, var17, var24, (class90) null, field93[arg5], 0, var20, var21);
            if (var9.field2908 != 0) {
                arg8.method2055(arg2, arg3, arg6, arg5, var9.field2919);
            }
        } else if (arg6 == 1) {
            class90 var25;
            if (var9.field2907 == -1 && var9.field2932 == null) {
                var25 = var9.method3327(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class50(arg4, 1, arg5, arg1, arg2, arg3, var9.field2907, true, (class90) null);
            }
            arg7.method1744(arg0, arg2, arg3, var17, var25, (class90) null, field88[arg5], 0, var20, var21);
            if (var9.field2908 != 0) {
                arg8.method2055(arg2, arg3, arg6, arg5, var9.field2919);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class90 var27;
            class90 var28;
            if (var9.field2907 == -1 && var9.field2932 == null) {
                var27 = var9.method3327(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method3327(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class50(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field2907, true, (class90) null);
                var28 = new class50(arg4, 2, var26, arg1, arg2, arg3, var9.field2907, true, (class90) null);
            }
            arg7.method1744(arg0, arg2, arg3, var17, var27, var28, field93[arg5], field93[var26], var20, var21);
            if (var9.field2908 != 0) {
                arg8.method2055(arg2, arg3, arg6, arg5, var9.field2919);
            }
        } else if (arg6 == 3) {
            class90 var29;
            if (var9.field2907 == -1 && var9.field2932 == null) {
                var29 = var9.method3327(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class50(arg4, 3, arg5, arg1, arg2, arg3, var9.field2907, true, (class90) null);
            }
            arg7.method1744(arg0, arg2, arg3, var17, var29, (class90) null, field88[arg5], 0, var20, var21);
            if (var9.field2908 != 0) {
                arg8.method2055(arg2, arg3, arg6, arg5, var9.field2919);
            }
        } else if (arg6 == 9) {
            class90 var30;
            if (var9.field2907 == -1 && var9.field2932 == null) {
                var30 = var9.method3327(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class50(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2907, true, (class90) null);
            }
            arg7.method1731(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field2908 != 0) {
                arg8.method2053(arg2, arg3, var10, var11, var9.field2919);
            }
        } else if (arg6 == 4) {
            class90 var31;
            if (var9.field2907 == -1 && var9.field2932 == null) {
                var31 = var9.method3327(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class50(arg4, 4, arg5, arg1, arg2, arg3, var9.field2907, true, (class90) null);
            }
            arg7.method1599(arg0, arg2, arg3, var17, var31, (class90) null, field93[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1747(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class198.method2463(var33 >> 14 & 0x7FFF).field2915;
            }
            class90 var34;
            if (var9.field2907 == -1 && var9.field2932 == null) {
                var34 = var9.method3327(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class50(arg4, 4, arg5, arg1, arg2, arg3, var9.field2907, true, (class90) null);
            }
            arg7.method1599(arg0, arg2, arg3, var17, var34, (class90) null, field93[arg5], 0, field90[arg5] * var32, field96[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1747(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class198.method2463(var36 >> 14 & 0x7FFF).field2915 / 2;
            }
            class90 var37;
            if (var9.field2907 == -1 && var9.field2932 == null) {
                var37 = var9.method3327(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class50(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2907, true, (class90) null);
            }
            arg7.method1599(arg0, arg2, arg3, var17, var37, (class90) null, 256, arg5, field101[arg5] * var35, field98[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class90 var39;
            if (var9.field2907 == -1 && var9.field2932 == null) {
                var39 = var9.method3327(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class50(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field2907, true, (class90) null);
            }
            arg7.method1599(arg0, arg2, arg3, var17, var39, (class90) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1747(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class198.method2463(var41 >> 14 & 0x7FFF).field2915 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class90 var43;
            class90 var44;
            if (var9.field2907 == -1 && var9.field2932 == null) {
                var43 = var9.method3327(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method3327(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class50(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2907, true, (class90) null);
                var44 = new class50(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field2907, true, (class90) null);
            }
            arg7.method1599(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field101[arg5] * var40, field98[arg5] * var40, var20, var21);
        }
    }
}
