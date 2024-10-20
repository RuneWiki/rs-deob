package deob;

@ObfuscatedName("g")
public final class class12 {

    @ObfuscatedName("g.k")
    public static int[][][] field115 = new int[4][105][105];

    @ObfuscatedName("g.y")
    public static byte[][][] field96 = new byte[4][104][104];

    @ObfuscatedName("g.o")
    public static int field116 = 99;

    @ObfuscatedName("g.f")
    public static final int[] field108 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("g.z")
    public static final int[] field117 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("g.u")
    public static final int[] field104 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("g.b")
    public static final int[] field105 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("g.m")
    public static final int[] field106 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("g.e")
    public static final int[] field99 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("g.l")
    public static int field103 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("g.x")
    public static int field109 = (int) (Math.random() * 33.0D) - 16;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.k(I)V")
    public static void method202() {
        Statics.field98 = (byte[][][]) null;
        Statics.field112 = (byte[][][]) null;
        Statics.field2767 = (byte[][][]) null;
        Statics.field100 = (byte[][][]) null;
        Statics.field56 = (int[][][]) null;
        Statics.field799 = (byte[][][]) null;
        Statics.field3154 = (int[][]) null;
        Statics.field934 = null;
        Statics.field101 = null;
        Statics.field207 = null;
        Statics.field63 = null;
        Statics.field930 = null;
    }

    @ObfuscatedName("ft.y(IIIII)V")
    public static final void method2969(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field799[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field115[0][var5][var4] = field115[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field115[0][var5][var4] = field115[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field115[0][var5][var4] = field115[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field115[0][var5][var4] = field115[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.o(Lfm;IIIIIII)V")
    public static final void method203(class161 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2733();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2733();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2733();
                }
            }
            return;
        }
        field96[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2733();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field115[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method3052(var10 + 45365, var11 + 91923, 4) - 128 + (method3052(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method3052(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field115[arg1][arg2][arg3] = field115[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2733();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field115[0][arg2][arg3] = -var15 * 8;
                } else {
                    field115[arg1][arg2][arg3] = field115[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field112[arg1][arg2][arg3] = arg0.method2734();
                Statics.field2767[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field100[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field96[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field98[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ft.r(IIIIIILca;Lde;B)V")
    public static final void method2970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, class118 arg7) {
        if (client.field279 && (field96[0][arg1][arg2] & 0x2) == 0 && (field96[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field116) {
            field116 = arg0;
        }
        class198 var8 = class198.method2703(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2891;
            var10 = var8.field2919;
        } else {
            var9 = var8.field2919;
            var10 = var8.field2891;
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
        int[][] var15 = field115[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field2911 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field2915 == 1) {
            var20 += 256;
        }
        if (var8.method3392()) {
            class32 var21 = new class32();
            var21.field704 = arg0;
            var21.field700 = arg1 * 128;
            var21.field693 = arg2 * 128;
            int var22 = var8.field2919;
            int var23 = var8.field2891;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field2891;
                var23 = var8.field2919;
            }
            var21.field697 = (arg1 + var22) * 128;
            var21.field705 = (arg2 + var23) * 128;
            var21.field695 = var8.field2901;
            var21.field699 = var8.field2920 * 128;
            var21.field702 = var8.field2875;
            var21.field703 = var8.field2922;
            var21.field696 = var8.field2923;
            if (var8.field2916 != null) {
                var21.field707 = var8;
                var21.method696();
            }
            class32.field694.method2220(var21);
            if (var21.field696 != null) {
                var21.field698 = var21.field702 + (int) (Math.random() * (double) (var21.field703 - var21.field702));
            }
        }
        if (arg5 == 22) {
            if (!client.field279 || var8.field2911 != 0 || var8.field2902 == 1 || var8.field2913) {
                class90 var24;
                if (var8.field2887 == -1 && var8.field2916 == null) {
                    var24 = var8.method3387(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class50(arg3, 22, arg4, arg0, arg1, arg2, var8.field2887, true, (class90) null);
                }
                arg6.method1627(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field2902 == 1 && arg7 != null) {
                    arg7.method2114(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class90 var47;
            if (var8.field2887 == -1 && var8.field2916 == null) {
                var47 = var8.method3387(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class50(arg3, 10, arg4, arg0, arg1, arg2, var8.field2887, true, (class90) null);
            }
            if (var47 != null && arg6.method1670(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field2906) {
                int var48 = 15;
                if (var47 instanceof class83) {
                    var48 = ((class83) var47).method1484() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field799[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field799[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field2902 != 0 && arg7 != null) {
                arg7.method2083(arg1, arg2, var9, var10, var8.field2877);
            }
        } else if (arg5 >= 12) {
            class90 var25;
            if (var8.field2887 == -1 && var8.field2916 == null) {
                var25 = var8.method3387(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2887, true, (class90) null);
            }
            arg6.method1670(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field56[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2902 != 0 && arg7 != null) {
                arg7.method2083(arg1, arg2, var9, var10, var8.field2877);
            }
        } else if (arg5 == 0) {
            class90 var26;
            if (var8.field2887 == -1 && var8.field2916 == null) {
                var26 = var8.method3387(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class50(arg3, 0, arg4, arg0, arg1, arg2, var8.field2887, true, (class90) null);
            }
            arg6.method1629(arg0, arg1, arg2, var16, var26, (class90) null, field108[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field2906) {
                    Statics.field799[arg0][arg1][arg2] = 50;
                    Statics.field799[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2897) {
                    Statics.field56[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2906) {
                    Statics.field799[arg0][arg1][arg2 + 1] = 50;
                    Statics.field799[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2897) {
                    Statics.field56[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2906) {
                    Statics.field799[arg0][arg1 + 1][arg2] = 50;
                    Statics.field799[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2897) {
                    Statics.field56[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2906) {
                    Statics.field799[arg0][arg1][arg2] = 50;
                    Statics.field799[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2897) {
                    Statics.field56[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2902 != 0 && arg7 != null) {
                arg7.method2089(arg1, arg2, arg5, arg4, var8.field2877);
            }
            if (var8.field2899 != 16) {
                arg6.method1669(arg0, arg1, arg2, var8.field2899);
            }
        } else if (arg5 == 1) {
            class90 var27;
            if (var8.field2887 == -1 && var8.field2916 == null) {
                var27 = var8.method3387(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class50(arg3, 1, arg4, arg0, arg1, arg2, var8.field2887, true, (class90) null);
            }
            arg6.method1629(arg0, arg1, arg2, var16, var27, (class90) null, field117[arg4], 0, var19, var20);
            if (var8.field2906) {
                if (arg4 == 0) {
                    Statics.field799[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field799[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field799[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field799[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2902 != 0 && arg7 != null) {
                arg7.method2089(arg1, arg2, arg5, arg4, var8.field2877);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class90 var29;
            class90 var30;
            if (var8.field2887 == -1 && var8.field2916 == null) {
                var29 = var8.method3387(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method3387(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class50(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2887, true, (class90) null);
                var30 = new class50(arg3, 2, var28, arg0, arg1, arg2, var8.field2887, true, (class90) null);
            }
            arg6.method1629(arg0, arg1, arg2, var16, var29, var30, field108[arg4], field108[var28], var19, var20);
            if (var8.field2897) {
                if (arg4 == 0) {
                    Statics.field56[arg0][arg1][arg2] |= 0x249;
                    Statics.field56[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field56[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field56[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field56[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field56[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field56[arg0][arg1][arg2] |= 0x492;
                    Statics.field56[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2902 != 0 && arg7 != null) {
                arg7.method2089(arg1, arg2, arg5, arg4, var8.field2877);
            }
            if (var8.field2899 != 16) {
                arg6.method1669(arg0, arg1, arg2, var8.field2899);
            }
        } else if (arg5 == 3) {
            class90 var31;
            if (var8.field2887 == -1 && var8.field2916 == null) {
                var31 = var8.method3387(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class50(arg3, 3, arg4, arg0, arg1, arg2, var8.field2887, true, (class90) null);
            }
            arg6.method1629(arg0, arg1, arg2, var16, var31, (class90) null, field117[arg4], 0, var19, var20);
            if (var8.field2906) {
                if (arg4 == 0) {
                    Statics.field799[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field799[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field799[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field799[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2902 != 0 && arg7 != null) {
                arg7.method2089(arg1, arg2, arg5, arg4, var8.field2877);
            }
        } else if (arg5 == 9) {
            class90 var32;
            if (var8.field2887 == -1 && var8.field2916 == null) {
                var32 = var8.method3387(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2887, true, (class90) null);
            }
            arg6.method1670(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field2902 != 0 && arg7 != null) {
                arg7.method2083(arg1, arg2, var9, var10, var8.field2877);
            }
            if (var8.field2899 != 16) {
                arg6.method1669(arg0, arg1, arg2, var8.field2899);
            }
        } else if (arg5 == 4) {
            class90 var33;
            if (var8.field2887 == -1 && var8.field2916 == null) {
                var33 = var8.method3387(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2887, true, (class90) null);
            }
            arg6.method1630(arg0, arg1, arg2, var16, var33, (class90) null, field108[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1647(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class198.method2703(var35 >> 14 & 0x7FFF).field2899;
            }
            class90 var36;
            if (var8.field2887 == -1 && var8.field2916 == null) {
                var36 = var8.method3387(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2887, true, (class90) null);
            }
            arg6.method1630(arg0, arg1, arg2, var16, var36, (class90) null, field108[arg4], 0, field104[arg4] * var34, field105[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1647(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class198.method2703(var38 >> 14 & 0x7FFF).field2899 / 2;
            }
            class90 var39;
            if (var8.field2887 == -1 && var8.field2916 == null) {
                var39 = var8.method3387(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2887, true, (class90) null);
            }
            arg6.method1630(arg0, arg1, arg2, var16, var39, (class90) null, 256, arg4, field106[arg4] * var37, field99[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class90 var41;
            if (var8.field2887 == -1 && var8.field2916 == null) {
                var41 = var8.method3387(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class50(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2887, true, (class90) null);
            }
            arg6.method1630(arg0, arg1, arg2, var16, var41, (class90) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1647(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class198.method2703(var43 >> 14 & 0x7FFF).field2899 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class90 var45;
            class90 var46;
            if (var8.field2887 == -1 && var8.field2916 == null) {
                var45 = var8.method3387(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method3387(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2887, true, (class90) null);
                var46 = new class50(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field2887, true, (class90) null);
            }
            arg6.method1630(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field106[arg4] * var42, field99[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("cs.w(Lca;[Lde;B)V")
    public static final void method1806(class88 arg0, class118[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field96[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field96[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2085(var3, var4);
                        }
                    }
                }
            }
        }
        field103 += (int) (Math.random() * 5.0D) - 2;
        if (field103 < -8) {
            field103 = -8;
        }
        if (field103 > 8) {
            field103 = 8;
        }
        field109 += (int) (Math.random() * 5.0D) - 2;
        if (field109 < -16) {
            field109 = -16;
        }
        if (field109 > 16) {
            field109 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field799[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field115[var6][var11 + 1][var10] - field115[var6][var11 - 1][var10];
                    int var13 = field115[var6][var11][var10 + 1] - field115[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field3154[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field934[var20] = 0;
                Statics.field101[var20] = 0;
                Statics.field207[var20] = 0;
                Statics.field63[var20] = 0;
                Statics.field930[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field98[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class192 var26 = (class192) class192.field2795.method2159((long) var25);
                            class192 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field2793.method3065(1, var25);
                                class192 var29 = new class192();
                                if (var28 != null) {
                                    var29.method3271(new class161(var28), var25);
                                }
                                var29.method3260();
                                class192.field2795.method2164(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field934[var22] += var27.field2792;
                            Statics.field101[var22] += var27.field2790;
                            Statics.field207[var22] += var27.field2789;
                            Statics.field63[var22] += var27.field2797;
                            var10002 = Statics.field930[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field98[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class192 var34 = (class192) class192.field2795.method2159((long) var33);
                            class192 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field2793.method3065(1, var33);
                                class192 var37 = new class192();
                                if (var36 != null) {
                                    var37.method3271(new class161(var36), var33);
                                }
                                var37.method3260();
                                class192.field2795.method2164(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field934[var22] -= var35.field2792;
                            Statics.field101[var22] -= var35.field2790;
                            Statics.field207[var22] -= var35.field2789;
                            Statics.field63[var22] -= var35.field2797;
                            var10002 = Statics.field930[var22]--;
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
                            var39 += Statics.field934[var45];
                            var40 += Statics.field101[var45];
                            var41 += Statics.field207[var45];
                            var42 += Statics.field63[var45];
                            var43 += Statics.field930[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field934[var46];
                            var40 -= Statics.field101[var46];
                            var41 -= Statics.field207[var46];
                            var42 -= Statics.field63[var46];
                            var43 -= Statics.field930[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field279 || (field96[0][var21][var44] & 0x2) != 0 || (field96[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field116) {
                                field116 = var6;
                            }
                            int var47 = Statics.field98[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field112[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field115[var6][var21][var44];
                                int var50 = field115[var6][var21 + 1][var44];
                                int var51 = field115[var6][var21 + 1][var44 + 1];
                                int var52 = field115[var6][var21][var44 + 1];
                                int var53 = Statics.field3154[var21][var44];
                                int var54 = Statics.field3154[var21 + 1][var44];
                                int var55 = Statics.field3154[var21 + 1][var44 + 1];
                                int var56 = Statics.field3154[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method122(var59, var60, var61);
                                    int var62 = field103 + var59 & 0xFF;
                                    int var63 = field109 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method122(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field2767[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0) {
                                        int var65 = var48 - 1;
                                        class201 var66 = (class201) class201.field3021.method2159((long) var65);
                                        class201 var67;
                                        if (var66 == null) {
                                            byte[] var68 = Statics.field3031.method3065(4, var65);
                                            class201 var69 = new class201();
                                            if (var68 != null) {
                                                var69.method3523(new class161(var68), var65);
                                            }
                                            var69.method3519();
                                            class201.field3021.method2164(var69, (long) var65);
                                            var67 = var69;
                                        } else {
                                            var67 = var66;
                                        }
                                        if (!var67.field3028) {
                                            var64 = false;
                                        }
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field56[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var70 = 0;
                                if (var58 != -1) {
                                    var70 = class85.field1448[method785(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1626(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method785(var57, var53), method785(var57, var54), method785(var57, var55), method785(var57, var56), 0, 0, 0, 0, var70, 0);
                                } else {
                                    int var71 = Statics.field2767[var6][var21][var44] + 1;
                                    byte var72 = Statics.field100[var6][var21][var44];
                                    int var73 = var48 - 1;
                                    class201 var74 = (class201) class201.field3021.method2159((long) var73);
                                    class201 var75;
                                    if (var74 == null) {
                                        byte[] var76 = Statics.field3031.method3065(4, var73);
                                        class201 var77 = new class201();
                                        if (var76 != null) {
                                            var77.method3523(new class161(var76), var73);
                                        }
                                        var77.method3519();
                                        class201.field3021.method2164(var77, (long) var73);
                                        var75 = var77;
                                    } else {
                                        var75 = var74;
                                    }
                                    int var79 = var75.field3023;
                                    int var80;
                                    int var81;
                                    if (var79 >= 0) {
                                        var80 = Statics.field1449.method1356(var79);
                                        var81 = -1;
                                    } else if (var75.field3022 == 16711935) {
                                        var81 = -2;
                                        var79 = -1;
                                        var80 = -2;
                                    } else {
                                        var81 = method122(var75.field3026, var75.field3024, var75.field3027);
                                        int var82 = field103 + var75.field3026 & 0xFF;
                                        int var83 = field109 + var75.field3027;
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        var80 = method122(var82, var75.field3024, var83);
                                    }
                                    int var84 = 0;
                                    if (var80 != -2) {
                                        var84 = class85.field1448[method3565(var80, 96)];
                                    }
                                    if (var75.field3025 != -1) {
                                        int var85 = field103 + var75.field3020 & 0xFF;
                                        int var86 = field109 + var75.field3030;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 255) {
                                            var86 = 255;
                                        }
                                        int var87 = method122(var85, var75.field3029, var86);
                                        var84 = class85.field1448[method3565(var87, 96)];
                                    }
                                    arg0.method1626(var6, var21, var44, var71, var72, var79, var49, var50, var51, var52, method785(var57, var53), method785(var57, var54), method785(var57, var55), method785(var57, var56), method3565(var81, var53), method3565(var81, var54), method3565(var81, var55), method3565(var81, var56), var70, var84);
                                }
                            }
                        }
                    }
                }
            }
            for (int var88 = 1; var88 < 103; var88++) {
                for (int var89 = 1; var89 < 103; var89++) {
                    arg0.method1682(var6, var89, var88, method98(var6, var89, var88));
                }
            }
            Statics.field98[var6] = (byte[][]) null;
            Statics.field112[var6] = (byte[][]) null;
            Statics.field2767[var6] = (byte[][]) null;
            Statics.field100[var6] = (byte[][]) null;
            Statics.field799[var6] = (byte[][]) null;
        }
        arg0.method1652(-50, -10, -50);
        for (int var90 = 0; var90 < 104; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                if ((field96[1][var90][var91] & 0x2) == 2) {
                    arg0.method1776(var90, var91);
                }
            }
        }
        int var92 = 1;
        int var93 = 2;
        int var94 = 4;
        for (int var95 = 0; var95 < 4; var95++) {
            if (var95 > 0) {
                var92 <<= 0x3;
                var93 <<= 0x3;
                var94 <<= 0x3;
            }
            for (int var96 = 0; var96 <= var95; var96++) {
                for (int var97 = 0; var97 <= 104; var97++) {
                    for (int var98 = 0; var98 <= 104; var98++) {
                        if ((Statics.field56[var96][var98][var97] & var92) != 0) {
                            int var99 = var97;
                            int var100 = var97;
                            int var101 = var96;
                            int var102 = var96;
                            while (var99 > 0 && (Statics.field56[var96][var98][var99 - 1] & var92) != 0) {
                                var99--;
                            }
                            while (var100 < 104 && (Statics.field56[var96][var98][var100 + 1] & var92) != 0) {
                                var100++;
                            }
                            label373: while (var101 > 0) {
                                for (int var103 = var99; var103 <= var100; var103++) {
                                    if ((Statics.field56[var101 - 1][var98][var103] & var92) == 0) {
                                        break label373;
                                    }
                                }
                                var101--;
                            }
                            label362: while (var102 < var95) {
                                for (int var104 = var99; var104 <= var100; var104++) {
                                    if ((Statics.field56[var102 + 1][var98][var104] & var92) == 0) {
                                        break label362;
                                    }
                                }
                                var102++;
                            }
                            int var105 = (var102 + 1 - var101) * (var100 - var99 + 1);
                            if (var105 >= 8) {
                                short var106 = 240;
                                int var107 = field115[var102][var98][var99] - var106;
                                int var108 = field115[var101][var98][var99];
                                class88.method1661(var95, 1, var98 * 128, var98 * 128, var99 * 128, var100 * 128 + 128, var107, var108);
                                for (int var109 = var101; var109 <= var102; var109++) {
                                    for (int var110 = var99; var110 <= var100; var110++) {
                                        Statics.field56[var109][var98][var110] &= ~var92;
                                    }
                                }
                            }
                        }
                        if ((Statics.field56[var96][var98][var97] & var93) != 0) {
                            int var111 = var98;
                            int var112 = var98;
                            int var113 = var96;
                            int var114 = var96;
                            while (var111 > 0 && (Statics.field56[var96][var111 - 1][var97] & var93) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field56[var96][var112 + 1][var97] & var93) != 0) {
                                var112++;
                            }
                            label426: while (var113 > 0) {
                                for (int var115 = var111; var115 <= var112; var115++) {
                                    if ((Statics.field56[var113 - 1][var115][var97] & var93) == 0) {
                                        break label426;
                                    }
                                }
                                var113--;
                            }
                            label415: while (var114 < var95) {
                                for (int var116 = var111; var116 <= var112; var116++) {
                                    if ((Statics.field56[var114 + 1][var116][var97] & var93) == 0) {
                                        break label415;
                                    }
                                }
                                var114++;
                            }
                            int var117 = (var114 + 1 - var113) * (var112 - var111 + 1);
                            if (var117 >= 8) {
                                short var118 = 240;
                                int var119 = field115[var114][var111][var97] - var118;
                                int var120 = field115[var113][var111][var97];
                                class88.method1661(var95, 2, var111 * 128, var112 * 128 + 128, var97 * 128, var97 * 128, var119, var120);
                                for (int var121 = var113; var121 <= var114; var121++) {
                                    for (int var122 = var111; var122 <= var112; var122++) {
                                        Statics.field56[var121][var122][var97] &= ~var93;
                                    }
                                }
                            }
                        }
                        if ((Statics.field56[var96][var98][var97] & var94) != 0) {
                            int var123 = var98;
                            int var124 = var98;
                            int var125 = var97;
                            int var126 = var97;
                            while (var125 > 0 && (Statics.field56[var96][var98][var125 - 1] & var94) != 0) {
                                var125--;
                            }
                            while (var126 < 104 && (Statics.field56[var96][var98][var126 + 1] & var94) != 0) {
                                var126++;
                            }
                            label479: while (var123 > 0) {
                                for (int var127 = var125; var127 <= var126; var127++) {
                                    if ((Statics.field56[var96][var123 - 1][var127] & var94) == 0) {
                                        break label479;
                                    }
                                }
                                var123--;
                            }
                            label468: while (var124 < 104) {
                                for (int var128 = var125; var128 <= var126; var128++) {
                                    if ((Statics.field56[var96][var124 + 1][var128] & var94) == 0) {
                                        break label468;
                                    }
                                }
                                var124++;
                            }
                            if ((var124 - var123 + 1) * (var126 - var125 + 1) >= 4) {
                                int var129 = field115[var96][var123][var125];
                                class88.method1661(var95, 4, var123 * 128, var124 * 128 + 128, var125 * 128, var126 * 128 + 128, var129, var129);
                                for (int var130 = var123; var130 <= var124; var130++) {
                                    for (int var131 = var125; var131 <= var126; var131++) {
                                        Statics.field56[var96][var130][var131] &= ~var94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.j(IIIB)I")
    public static int method98(int arg0, int arg1, int arg2) {
        if ((field96[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field96[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("fn.c(IIII)I")
    public static final int method3052(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method809(var3, var5);
        int var8 = method809(var3 + 1, var5);
        int var9 = method809(var3, var5 + 1);
        int var10 = method809(var3 + 1, var5 + 1);
        int var11 = method116(var7, var8, var4, arg2);
        int var12 = method116(var9, var10, var4, arg2);
        return method116(var11, var12, var6, arg2);
    }

    @ObfuscatedName("n.g(IIIII)I")
    public static final int method116(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1453[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ae.i(III)I")
    public static final int method809(int arg0, int arg1) {
        int var2 = method3049(arg0 - 1, arg1 - 1) + method3049(arg0 + 1, arg1 - 1) + method3049(arg0 - 1, arg1 + 1) + method3049(arg0 + 1, arg1 + 1);
        int var3 = method3049(arg0 - 1, arg1) + method3049(arg0 + 1, arg1) + method3049(arg0, arg1 - 1) + method3049(arg0, arg1 + 1);
        int var4 = method3049(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("fi.v(III)I")
    public static final int method3049(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("at.a(IIB)I")
    public static final int method785(int arg0, int arg1) {
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

    @ObfuscatedName("gk.h(IIB)I")
    public static final int method3565(int arg0, int arg1) {
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

    @ObfuscatedName("c.p(IIIB)I")
    public static final int method122(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("s.t(III)Z")
    public static final boolean method127(int arg0, int arg1) {
        class198 var2 = class198.method2703(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3401(arg1);
    }
}
