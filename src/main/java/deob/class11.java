package deob;

@ObfuscatedName("m")
public final class class11 {

    @ObfuscatedName("m.q")
    public static int[][][] field114 = new int[4][105][105];

    @ObfuscatedName("m.d")
    public static byte[][][] field111 = new byte[4][104][104];

    @ObfuscatedName("m.h")
    public static int field96 = 99;

    @ObfuscatedName("m.y")
    public static final int[] field104 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("m.w")
    public static final int[] field105 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("m.a")
    public static final int[] field106 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("m.k")
    public static final int[] field107 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("m.l")
    public static final int[] field98 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("m.x")
    public static final int[] field109 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("m.g")
    public static int field101 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("m.e")
    public static int field113 = (int) (Math.random() * 33.0D) - 16;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cc.q(IIIII)V")
    public static final void method1938(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field119[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field114[0][var5][var4] = field114[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field114[0][var5][var4] = field114[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field114[0][var5][var4] = field114[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field114[0][var5][var4] = field114[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.h(IIII)V")
    public static final void method182(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field114[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field114[arg0][arg1][arg2 + var5] = field114[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field114[arg0][arg1 + var6][arg2] = field114[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field114[arg0][arg1 - 1][arg2] != 0) {
            field114[arg0][arg1][arg2] = field114[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field114[arg0][arg1][arg2 - 1] != 0) {
            field114[arg0][arg1][arg2] = field114[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field114[arg0][arg1 - 1][arg2 - 1] != 0) {
            field114[arg0][arg1][arg2] = field114[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("g.p(Lel;IIIIIII)V")
    public static final void method252(class154 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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
        field111[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2666();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field114[0][arg2][arg3] = -Statics.method1532(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field114[arg1][arg2][arg3] = field114[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2666();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field114[0][arg2][arg3] = -var8 * 8;
                } else {
                    field114[arg1][arg2][arg3] = field114[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field95[arg1][arg2][arg3] = arg0.method2835();
                Statics.field44[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field108[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field111[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field97[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("m.j(IIIIIILcn;Ldf;S)V")
    public static final void method115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, class118 arg7) {
        if (client.field309 && (field111[0][arg1][arg2] & 0x2) == 0 && (field111[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field96) {
            field96 = arg0;
        }
        class198 var8 = class198.method3257(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2917;
            var10 = var8.field2909;
        } else {
            var9 = var8.field2909;
            var10 = var8.field2917;
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
        int[][] var15 = field114[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field2913 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field2933 == 1) {
            var20 += 256;
        }
        if (var8.method3433()) {
            class32.method201(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field309 || var8.field2913 != 0 || var8.field2944 == 1 || var8.field2941) {
                class90 var21;
                if (var8.field2916 == -1 && var8.field2935 == null) {
                    var21 = var8.method3455(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class50(arg3, 22, arg4, arg0, arg1, arg2, var8.field2916, true, (class90) null);
                }
                arg6.method1688(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field2944 == 1 && arg7 != null) {
                    arg7.method2174(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class90 var44;
            if (var8.field2916 == -1 && var8.field2935 == null) {
                var44 = var8.method3455(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class50(arg3, 10, arg4, arg0, arg1, arg2, var8.field2916, true, (class90) null);
            }
            if (var44 != null && arg6.method1692(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field2940) {
                int var45 = 15;
                if (var44 instanceof class83) {
                    var45 = ((class83) var44).method1554() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field119[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field119[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field2944 != 0 && arg7 != null) {
                arg7.method2195(arg1, arg2, var9, var10, var8.field2912);
            }
        } else if (arg5 >= 12) {
            class90 var22;
            if (var8.field2916 == -1 && var8.field2935 == null) {
                var22 = var8.method3455(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2916, true, (class90) null);
            }
            arg6.method1692(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field985[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2944 != 0 && arg7 != null) {
                arg7.method2195(arg1, arg2, var9, var10, var8.field2912);
            }
        } else if (arg5 == 0) {
            class90 var23;
            if (var8.field2916 == -1 && var8.field2935 == null) {
                var23 = var8.method3455(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class50(arg3, 0, arg4, arg0, arg1, arg2, var8.field2916, true, (class90) null);
            }
            arg6.method1825(arg0, arg1, arg2, var16, var23, (class90) null, field104[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field2940) {
                    Statics.field119[arg0][arg1][arg2] = 50;
                    Statics.field119[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2893) {
                    Statics.field985[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2940) {
                    Statics.field119[arg0][arg1][arg2 + 1] = 50;
                    Statics.field119[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2893) {
                    Statics.field985[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2940) {
                    Statics.field119[arg0][arg1 + 1][arg2] = 50;
                    Statics.field119[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2893) {
                    Statics.field985[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2940) {
                    Statics.field119[arg0][arg1][arg2] = 50;
                    Statics.field119[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2893) {
                    Statics.field985[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2944 != 0 && arg7 != null) {
                arg7.method2171(arg1, arg2, arg5, arg4, var8.field2912);
            }
            if (var8.field2918 != 16) {
                arg6.method1698(arg0, arg1, arg2, var8.field2918);
            }
        } else if (arg5 == 1) {
            class90 var24;
            if (var8.field2916 == -1 && var8.field2935 == null) {
                var24 = var8.method3455(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class50(arg3, 1, arg4, arg0, arg1, arg2, var8.field2916, true, (class90) null);
            }
            arg6.method1825(arg0, arg1, arg2, var16, var24, (class90) null, field105[arg4], 0, var19, var20);
            if (var8.field2940) {
                if (arg4 == 0) {
                    Statics.field119[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field119[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field119[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field119[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2944 != 0 && arg7 != null) {
                arg7.method2171(arg1, arg2, arg5, arg4, var8.field2912);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class90 var26;
            class90 var27;
            if (var8.field2916 == -1 && var8.field2935 == null) {
                var26 = var8.method3455(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method3455(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class50(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2916, true, (class90) null);
                var27 = new class50(arg3, 2, var25, arg0, arg1, arg2, var8.field2916, true, (class90) null);
            }
            arg6.method1825(arg0, arg1, arg2, var16, var26, var27, field104[arg4], field104[var25], var19, var20);
            if (var8.field2893) {
                if (arg4 == 0) {
                    Statics.field985[arg0][arg1][arg2] |= 0x249;
                    Statics.field985[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field985[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field985[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field985[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field985[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field985[arg0][arg1][arg2] |= 0x492;
                    Statics.field985[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2944 != 0 && arg7 != null) {
                arg7.method2171(arg1, arg2, arg5, arg4, var8.field2912);
            }
            if (var8.field2918 != 16) {
                arg6.method1698(arg0, arg1, arg2, var8.field2918);
            }
        } else if (arg5 == 3) {
            class90 var28;
            if (var8.field2916 == -1 && var8.field2935 == null) {
                var28 = var8.method3455(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class50(arg3, 3, arg4, arg0, arg1, arg2, var8.field2916, true, (class90) null);
            }
            arg6.method1825(arg0, arg1, arg2, var16, var28, (class90) null, field105[arg4], 0, var19, var20);
            if (var8.field2940) {
                if (arg4 == 0) {
                    Statics.field119[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field119[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field119[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field119[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2944 != 0 && arg7 != null) {
                arg7.method2171(arg1, arg2, arg5, arg4, var8.field2912);
            }
        } else if (arg5 == 9) {
            class90 var29;
            if (var8.field2916 == -1 && var8.field2935 == null) {
                var29 = var8.method3455(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2916, true, (class90) null);
            }
            arg6.method1692(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field2944 != 0 && arg7 != null) {
                arg7.method2195(arg1, arg2, var9, var10, var8.field2912);
            }
            if (var8.field2918 != 16) {
                arg6.method1698(arg0, arg1, arg2, var8.field2918);
            }
        } else if (arg5 == 4) {
            class90 var30;
            if (var8.field2916 == -1 && var8.field2935 == null) {
                var30 = var8.method3455(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2916, true, (class90) null);
            }
            arg6.method1691(arg0, arg1, arg2, var16, var30, (class90) null, field104[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1708(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class198.method3257(var32 >> 14 & 0x7FFF).field2918;
            }
            class90 var33;
            if (var8.field2916 == -1 && var8.field2935 == null) {
                var33 = var8.method3455(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2916, true, (class90) null);
            }
            arg6.method1691(arg0, arg1, arg2, var16, var33, (class90) null, field104[arg4], 0, field106[arg4] * var31, field107[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1708(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class198.method3257(var35 >> 14 & 0x7FFF).field2918 / 2;
            }
            class90 var36;
            if (var8.field2916 == -1 && var8.field2935 == null) {
                var36 = var8.method3455(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2916, true, (class90) null);
            }
            arg6.method1691(arg0, arg1, arg2, var16, var36, (class90) null, 256, arg4, field98[arg4] * var34, field109[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class90 var38;
            if (var8.field2916 == -1 && var8.field2935 == null) {
                var38 = var8.method3455(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class50(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field2916, true, (class90) null);
            }
            arg6.method1691(arg0, arg1, arg2, var16, var38, (class90) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1708(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class198.method3257(var40 >> 14 & 0x7FFF).field2918 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class90 var42;
            class90 var43;
            if (var8.field2916 == -1 && var8.field2935 == null) {
                var42 = var8.method3455(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method3455(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2916, true, (class90) null);
                var43 = new class50(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field2916, true, (class90) null);
            }
            arg6.method1691(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field98[arg4] * var39, field109[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("bk.n(IIII)I")
    public static int method1187(int arg0, int arg1, int arg2) {
        if ((field111[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field111[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("s.o(IIII)I")
    public static final int method150(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1443(var3, var5);
        int var8 = method1443(var3 + 1, var5);
        int var9 = method1443(var3, var5 + 1);
        int var10 = method1443(var3 + 1, var5 + 1);
        int var11 = method93(var7, var8, var4, arg2);
        int var12 = method93(var9, var10, var4, arg2);
        return method93(var11, var12, var6, arg2);
    }

    @ObfuscatedName("c.s(IIIII)I")
    public static final int method93(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1463[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("bi.u(IIB)I")
    public static final int method1443(int arg0, int arg1) {
        int var2 = method176(arg0 - 1, arg1 - 1) + method176(arg0 + 1, arg1 - 1) + method176(arg0 - 1, arg1 + 1) + method176(arg0 + 1, arg1 + 1);
        int var3 = method176(arg0 - 1, arg1) + method176(arg0 + 1, arg1) + method176(arg0, arg1 - 1) + method176(arg0, arg1 + 1);
        int var4 = method176(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("b.b(IIB)I")
    public static final int method176(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("da.v(IIS)I")
    public static final int method2120(int arg0, int arg1) {
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

    @ObfuscatedName("au.z(IIII)I")
    public static final int method671(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("eb.t(III)Z")
    public static final boolean method2507(int arg0, int arg1) {
        class198 var2 = class198.method3257(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3427(arg1);
    }
}
