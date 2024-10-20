package deob;

@ObfuscatedName("h")
public final class class11 {

    @ObfuscatedName("h.i")
    public static int[][][] field100 = new int[4][105][105];

    @ObfuscatedName("h.e")
    public static byte[][][] field89 = new byte[4][104][104];

    @ObfuscatedName("h.f")
    public static int field103 = 99;

    @ObfuscatedName("h.x")
    public static final int[] field91 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("h.d")
    public static final int[] field96 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("h.y")
    public static final int[] field97 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("h.s")
    public static final int[] field95 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("h.t")
    public static final int[] field99 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("h.z")
    public static final int[] field90 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("h.b")
    public static int field101 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("h.o")
    public static int field102 = (int) (Math.random() * 33.0D) - 16;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gi.i(I)V")
    public static void method3185() {
        field103 = 99;
        Statics.field764 = new byte[4][104][104];
        Statics.field118 = new byte[4][104][104];
        Statics.field92 = new byte[4][104][104];
        Statics.field1111 = new byte[4][104][104];
        Statics.field98 = new int[4][105][105];
        Statics.field93 = new byte[4][105][105];
        Statics.field66 = new int[105][105];
        Statics.field3117 = new int[104];
        Statics.field1553 = new int[104];
        Statics.field663 = new int[104];
        Statics.field3119 = new int[104];
        Statics.field1223 = new int[104];
    }

    @ObfuscatedName("eg.e(I)V")
    public static void method2308() {
        Statics.field764 = (byte[][][]) null;
        Statics.field118 = (byte[][][]) null;
        Statics.field92 = (byte[][][]) null;
        Statics.field1111 = (byte[][][]) null;
        Statics.field98 = (int[][][]) null;
        Statics.field93 = (byte[][][]) null;
        Statics.field66 = (int[][]) null;
        Statics.field3117 = null;
        Statics.field1553 = null;
        Statics.field663 = null;
        Statics.field3119 = null;
        Statics.field1223 = null;
    }

    @ObfuscatedName("cm.f(IIIII)V")
    public static final void method1821(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field93[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field100[0][var5][var4] = field100[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field100[0][var5][var4] = field100[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field100[0][var5][var4] = field100[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field100[0][var5][var4] = field100[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.k([BIIII[Ldl;I)V")
    public static final void method27(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class118[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1822[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class154 var9 = new class154(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.method185(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("a.a(IIIB)V")
    public static final void method81(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field100[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field100[arg0][arg1][arg2 + var5] = field100[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field100[arg0][arg1 + var6][arg2] = field100[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field100[arg0][arg1 - 1][arg2] != 0) {
            field100[arg0][arg1][arg2] = field100[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field100[arg0][arg1][arg2 - 1] != 0) {
            field100[arg0][arg1][arg2] = field100[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field100[arg0][arg1 - 1][arg2 - 1] != 0) {
            field100[arg0][arg1][arg2] = field100[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ce.w([BIILcr;[Ldl;I)V")
    public static final void method1812(byte[] arg0, int arg1, int arg2, class88 arg3, class118[] arg4) {
        class154 var5 = new class154(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2586();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2586();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2573();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field89[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class118 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method73(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("dy.v([BIIIIIIILcr;[Ldl;B)V")
    public static final void method2105(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class88 arg8, class118[] arg9) {
        class154 var10 = new class154(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2586();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2586();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2573();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class198 var21 = class198.method1371(var11);
                    int var22 = arg2 + class169.method841(var16 & 0x7, var15 & 0x7, arg7, var21.field2908, var21.field2909, var20);
                    int var23 = arg3 + class169.method1607(var16 & 0x7, var15 & 0x7, arg7, var21.field2908, var21.field2909, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field89[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class118 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method73(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.h(IIIIIILcr;Ldl;I)V")
    public static final void method73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, class118 arg7) {
        if (client.field290 && (field89[0][arg1][arg2] & 0x2) == 0 && (field89[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field103) {
            field103 = arg0;
        }
        class198 var8 = class198.method1371(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2909;
            var10 = var8.field2908;
        } else {
            var9 = var8.field2908;
            var10 = var8.field2909;
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
        int[][] var15 = field100[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field2912 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field2933 == 1) {
            var20 += 256;
        }
        if (var8.method3352()) {
            class32.method2511(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field290 || var8.field2912 != 0 || var8.field2910 == 1 || var8.field2931) {
                class90 var21;
                if (var8.field2914 == -1 && var8.field2934 == null) {
                    var21 = var8.method3338(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class50(arg3, 22, arg4, arg0, arg1, arg2, var8.field2914, true, (class90) null);
                }
                arg6.method1619(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field2910 == 1 && arg7 != null) {
                    arg7.method2070(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class90 var44;
            if (var8.field2914 == -1 && var8.field2934 == null) {
                var44 = var8.method3338(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class50(arg3, 10, arg4, arg0, arg1, arg2, var8.field2914, true, (class90) null);
            }
            if (var44 != null && arg6.method1623(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field2916) {
                int var45 = 15;
                if (var44 instanceof class83) {
                    var45 = ((class83) var44).method1502() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field93[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field93[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field2910 != 0 && arg7 != null) {
                arg7.method2064(arg1, arg2, var9, var10, var8.field2911);
            }
        } else if (arg5 >= 12) {
            class90 var22;
            if (var8.field2914 == -1 && var8.field2934 == null) {
                var22 = var8.method3338(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2914, true, (class90) null);
            }
            arg6.method1623(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field98[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2910 != 0 && arg7 != null) {
                arg7.method2064(arg1, arg2, var9, var10, var8.field2911);
            }
        } else if (arg5 == 0) {
            class90 var23;
            if (var8.field2914 == -1 && var8.field2934 == null) {
                var23 = var8.method3338(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class50(arg3, 0, arg4, arg0, arg1, arg2, var8.field2914, true, (class90) null);
            }
            arg6.method1663(arg0, arg1, arg2, var16, var23, (class90) null, field91[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field2916) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2915) {
                    Statics.field98[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2916) {
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2915) {
                    Statics.field98[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2916) {
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2915) {
                    Statics.field98[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2916) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2915) {
                    Statics.field98[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2910 != 0 && arg7 != null) {
                arg7.method2063(arg1, arg2, arg5, arg4, var8.field2911);
            }
            if (var8.field2893 != 16) {
                arg6.method1735(arg0, arg1, arg2, var8.field2893);
            }
        } else if (arg5 == 1) {
            class90 var24;
            if (var8.field2914 == -1 && var8.field2934 == null) {
                var24 = var8.method3338(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class50(arg3, 1, arg4, arg0, arg1, arg2, var8.field2914, true, (class90) null);
            }
            arg6.method1663(arg0, arg1, arg2, var16, var24, (class90) null, field96[arg4], 0, var19, var20);
            if (var8.field2916) {
                if (arg4 == 0) {
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2910 != 0 && arg7 != null) {
                arg7.method2063(arg1, arg2, arg5, arg4, var8.field2911);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class90 var26;
            class90 var27;
            if (var8.field2914 == -1 && var8.field2934 == null) {
                var26 = var8.method3338(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method3338(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class50(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2914, true, (class90) null);
                var27 = new class50(arg3, 2, var25, arg0, arg1, arg2, var8.field2914, true, (class90) null);
            }
            arg6.method1663(arg0, arg1, arg2, var16, var26, var27, field91[arg4], field91[var25], var19, var20);
            if (var8.field2915) {
                if (arg4 == 0) {
                    Statics.field98[arg0][arg1][arg2] |= 0x249;
                    Statics.field98[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field98[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field98[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field98[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field98[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field98[arg0][arg1][arg2] |= 0x492;
                    Statics.field98[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2910 != 0 && arg7 != null) {
                arg7.method2063(arg1, arg2, arg5, arg4, var8.field2911);
            }
            if (var8.field2893 != 16) {
                arg6.method1735(arg0, arg1, arg2, var8.field2893);
            }
        } else if (arg5 == 3) {
            class90 var28;
            if (var8.field2914 == -1 && var8.field2934 == null) {
                var28 = var8.method3338(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class50(arg3, 3, arg4, arg0, arg1, arg2, var8.field2914, true, (class90) null);
            }
            arg6.method1663(arg0, arg1, arg2, var16, var28, (class90) null, field96[arg4], 0, var19, var20);
            if (var8.field2916) {
                if (arg4 == 0) {
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2910 != 0 && arg7 != null) {
                arg7.method2063(arg1, arg2, arg5, arg4, var8.field2911);
            }
        } else if (arg5 == 9) {
            class90 var29;
            if (var8.field2914 == -1 && var8.field2934 == null) {
                var29 = var8.method3338(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2914, true, (class90) null);
            }
            arg6.method1623(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field2910 != 0 && arg7 != null) {
                arg7.method2064(arg1, arg2, var9, var10, var8.field2911);
            }
            if (var8.field2893 != 16) {
                arg6.method1735(arg0, arg1, arg2, var8.field2893);
            }
        } else if (arg5 == 4) {
            class90 var30;
            if (var8.field2914 == -1 && var8.field2934 == null) {
                var30 = var8.method3338(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2914, true, (class90) null);
            }
            arg6.method1622(arg0, arg1, arg2, var16, var30, (class90) null, field91[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1639(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class198.method1371(var32 >> 14 & 0x7FFF).field2893;
            }
            class90 var33;
            if (var8.field2914 == -1 && var8.field2934 == null) {
                var33 = var8.method3338(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2914, true, (class90) null);
            }
            arg6.method1622(arg0, arg1, arg2, var16, var33, (class90) null, field91[arg4], 0, field97[arg4] * var31, field95[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1639(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class198.method1371(var35 >> 14 & 0x7FFF).field2893 / 2;
            }
            class90 var36;
            if (var8.field2914 == -1 && var8.field2934 == null) {
                var36 = var8.method3338(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2914, true, (class90) null);
            }
            arg6.method1622(arg0, arg1, arg2, var16, var36, (class90) null, 256, arg4, field99[arg4] * var34, field90[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class90 var38;
            if (var8.field2914 == -1 && var8.field2934 == null) {
                var38 = var8.method3338(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class50(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field2914, true, (class90) null);
            }
            arg6.method1622(arg0, arg1, arg2, var16, var38, (class90) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1639(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class198.method1371(var40 >> 14 & 0x7FFF).field2893 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class90 var42;
            class90 var43;
            if (var8.field2914 == -1 && var8.field2934 == null) {
                var42 = var8.method3338(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method3338(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2914, true, (class90) null);
                var43 = new class50(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field2914, true, (class90) null);
            }
            arg6.method1622(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field99[arg4] * var39, field90[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("y.p(Lcr;[Ldl;I)V")
    public static final void method199(class88 arg0, class118[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field89[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field89[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2065(var3, var4);
                        }
                    }
                }
            }
        }
        field101 += (int) (Math.random() * 5.0D) - 2;
        if (field101 < -8) {
            field101 = -8;
        }
        if (field101 > 8) {
            field101 = 8;
        }
        field102 += (int) (Math.random() * 5.0D) - 2;
        if (field102 < -16) {
            field102 = -16;
        }
        if (field102 > 16) {
            field102 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field93[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field100[var6][var11 + 1][var10] - field100[var6][var11 - 1][var10];
                    int var13 = field100[var6][var11][var10 + 1] - field100[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field66[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field3117[var20] = 0;
                Statics.field1553[var20] = 0;
                Statics.field663[var20] = 0;
                Statics.field3119[var20] = 0;
                Statics.field1223[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field764[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class192 var25 = class192.method3110(var24 - 1);
                            Statics.field3117[var22] += var25.field2812;
                            Statics.field1553[var22] += var25.field2813;
                            Statics.field663[var22] += var25.field2816;
                            Statics.field3119[var22] += var25.field2809;
                            var10002 = Statics.field1223[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field764[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class192 var28 = class192.method3110(var27 - 1);
                            Statics.field3117[var22] -= var28.field2812;
                            Statics.field1553[var22] -= var28.field2813;
                            Statics.field663[var22] -= var28.field2816;
                            Statics.field3119[var22] -= var28.field2809;
                            var10002 = Statics.field1223[var22]--;
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
                            var29 += Statics.field3117[var35];
                            var30 += Statics.field1553[var35];
                            var31 += Statics.field663[var35];
                            var32 += Statics.field3119[var35];
                            var33 += Statics.field1223[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field3117[var36];
                            var30 -= Statics.field1553[var36];
                            var31 -= Statics.field663[var36];
                            var32 -= Statics.field3119[var36];
                            var33 -= Statics.field1223[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field290 || (field89[0][var21][var34] & 0x2) != 0 || (field89[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field103) {
                                field103 = var6;
                            }
                            int var37 = Statics.field764[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field118[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field100[var6][var21][var34];
                                int var40 = field100[var6][var21 + 1][var34];
                                int var41 = field100[var6][var21 + 1][var34 + 1];
                                int var42 = field100[var6][var21][var34 + 1];
                                int var43 = Statics.field66[var21][var34];
                                int var44 = Statics.field66[var21 + 1][var34];
                                int var45 = Statics.field66[var21 + 1][var34 + 1];
                                int var46 = Statics.field66[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method751(var49, var50, var51);
                                    int var52 = field101 + var49 & 0xFF;
                                    int var53 = field102 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method751(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field92[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0) {
                                        int var55 = var38 - 1;
                                        class201 var56 = (class201) class201.field3046.method2150((long) var55);
                                        class201 var57;
                                        if (var56 == null) {
                                            byte[] var58 = Statics.field3038.method3014(4, var55);
                                            class201 var59 = new class201();
                                            if (var58 != null) {
                                                var59.method3456(new class154(var58), var55);
                                            }
                                            var59.method3466();
                                            class201.field3046.method2152(var59, (long) var55);
                                            var57 = var59;
                                        } else {
                                            var57 = var56;
                                        }
                                        if (!var57.field3040) {
                                            var54 = false;
                                        }
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field98[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var60 = 0;
                                if (var48 != -1) {
                                    var60 = class85.field1450[Statics.method98(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1618(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, Statics.method98(var47, var43), Statics.method98(var47, var44), Statics.method98(var47, var45), Statics.method98(var47, var46), 0, 0, 0, 0, var60, 0);
                                } else {
                                    int var61 = Statics.field92[var6][var21][var34] + 1;
                                    byte var62 = Statics.field1111[var6][var21][var34];
                                    int var63 = var38 - 1;
                                    class201 var64 = (class201) class201.field3046.method2150((long) var63);
                                    class201 var65;
                                    if (var64 == null) {
                                        byte[] var66 = Statics.field3038.method3014(4, var63);
                                        class201 var67 = new class201();
                                        if (var66 != null) {
                                            var67.method3456(new class154(var66), var63);
                                        }
                                        var67.method3466();
                                        class201.field3046.method2152(var67, (long) var63);
                                        var65 = var67;
                                    } else {
                                        var65 = var64;
                                    }
                                    int var69 = var65.field3039;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1451.method1338(var69);
                                        var71 = -1;
                                    } else if (var65.field3037 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method751(var65.field3042, var65.field3043, var65.field3044);
                                        int var72 = field101 + var65.field3042 & 0xFF;
                                        int var73 = field102 + var65.field3044;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method751(var72, var65.field3043, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class85.field1450[method692(var70, 96)];
                                    }
                                    if (var65.field3041 != -1) {
                                        int var75 = field101 + var65.field3045 & 0xFF;
                                        int var76 = field102 + var65.field3047;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method751(var75, var65.field3036, var76);
                                        var74 = class85.field1450[method692(var77, 96)];
                                    }
                                    arg0.method1618(var6, var21, var34, var61, var62, var69, var39, var40, var41, var42, Statics.method98(var47, var43), Statics.method98(var47, var44), Statics.method98(var47, var45), Statics.method98(var47, var46), method692(var71, var43), method692(var71, var44), method692(var71, var45), method692(var71, var46), var60, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    arg0.method1756(var6, var79, var78, method174(var6, var79, var78));
                }
            }
            Statics.field764[var6] = (byte[][]) null;
            Statics.field118[var6] = (byte[][]) null;
            Statics.field92[var6] = (byte[][]) null;
            Statics.field1111[var6] = (byte[][]) null;
            Statics.field93[var6] = (byte[][]) null;
        }
        arg0.method1644(-50, -10, -50);
        for (int var80 = 0; var80 < 104; var80++) {
            for (int var81 = 0; var81 < 104; var81++) {
                if ((field89[1][var80][var81] & 0x2) == 2) {
                    arg0.method1615(var80, var81);
                }
            }
        }
        int var82 = 1;
        int var83 = 2;
        int var84 = 4;
        for (int var85 = 0; var85 < 4; var85++) {
            if (var85 > 0) {
                var82 <<= 0x3;
                var83 <<= 0x3;
                var84 <<= 0x3;
            }
            for (int var86 = 0; var86 <= var85; var86++) {
                for (int var87 = 0; var87 <= 104; var87++) {
                    for (int var88 = 0; var88 <= 104; var88++) {
                        if ((Statics.field98[var86][var88][var87] & var82) != 0) {
                            int var89 = var87;
                            int var90 = var87;
                            int var91 = var86;
                            int var92 = var86;
                            while (var89 > 0 && (Statics.field98[var86][var88][var89 - 1] & var82) != 0) {
                                var89--;
                            }
                            while (var90 < 104 && (Statics.field98[var86][var88][var90 + 1] & var82) != 0) {
                                var90++;
                            }
                            label355: while (var91 > 0) {
                                for (int var93 = var89; var93 <= var90; var93++) {
                                    if ((Statics.field98[var91 - 1][var88][var93] & var82) == 0) {
                                        break label355;
                                    }
                                }
                                var91--;
                            }
                            label344: while (var92 < var85) {
                                for (int var94 = var89; var94 <= var90; var94++) {
                                    if ((Statics.field98[var92 + 1][var88][var94] & var82) == 0) {
                                        break label344;
                                    }
                                }
                                var92++;
                            }
                            int var95 = (var92 + 1 - var91) * (var90 - var89 + 1);
                            if (var95 >= 8) {
                                short var96 = 240;
                                int var97 = field100[var92][var88][var89] - var96;
                                int var98 = field100[var91][var88][var89];
                                class88.method1624(var85, 1, var88 * 128, var88 * 128, var89 * 128, var90 * 128 + 128, var97, var98);
                                for (int var99 = var91; var99 <= var92; var99++) {
                                    for (int var100 = var89; var100 <= var90; var100++) {
                                        Statics.field98[var99][var88][var100] &= ~var82;
                                    }
                                }
                            }
                        }
                        if ((Statics.field98[var86][var88][var87] & var83) != 0) {
                            int var101 = var88;
                            int var102 = var88;
                            int var103 = var86;
                            int var104 = var86;
                            while (var101 > 0 && (Statics.field98[var86][var101 - 1][var87] & var83) != 0) {
                                var101--;
                            }
                            while (var102 < 104 && (Statics.field98[var86][var102 + 1][var87] & var83) != 0) {
                                var102++;
                            }
                            label408: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((Statics.field98[var103 - 1][var105][var87] & var83) == 0) {
                                        break label408;
                                    }
                                }
                                var103--;
                            }
                            label397: while (var104 < var85) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((Statics.field98[var104 + 1][var106][var87] & var83) == 0) {
                                        break label397;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = field100[var104][var101][var87] - var108;
                                int var110 = field100[var103][var101][var87];
                                class88.method1624(var85, 2, var101 * 128, var102 * 128 + 128, var87 * 128, var87 * 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        Statics.field98[var111][var112][var87] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field98[var86][var88][var87] & var84) != 0) {
                            int var113 = var88;
                            int var114 = var88;
                            int var115 = var87;
                            int var116 = var87;
                            while (var115 > 0 && (Statics.field98[var86][var88][var115 - 1] & var84) != 0) {
                                var115--;
                            }
                            while (var116 < 104 && (Statics.field98[var86][var88][var116 + 1] & var84) != 0) {
                                var116++;
                            }
                            label461: while (var113 > 0) {
                                for (int var117 = var115; var117 <= var116; var117++) {
                                    if ((Statics.field98[var86][var113 - 1][var117] & var84) == 0) {
                                        break label461;
                                    }
                                }
                                var113--;
                            }
                            label450: while (var114 < 104) {
                                for (int var118 = var115; var118 <= var116; var118++) {
                                    if ((Statics.field98[var86][var114 + 1][var118] & var84) == 0) {
                                        break label450;
                                    }
                                }
                                var114++;
                            }
                            if ((var114 - var113 + 1) * (var116 - var115 + 1) >= 4) {
                                int var119 = field100[var86][var113][var115];
                                class88.method1624(var85, 4, var113 * 128, var114 * 128 + 128, var115 * 128, var116 * 128 + 128, var119, var119);
                                for (int var120 = var113; var120 <= var114; var120++) {
                                    for (int var121 = var115; var121 <= var116; var121++) {
                                        Statics.field98[var86][var120][var121] &= ~var84;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.l(IIIB)I")
    public static int method174(int arg0, int arg1, int arg2) {
        if ((field89[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field89[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("fi.c(III)I")
    public static final int method2979(int arg0, int arg1) {
        int var2 = method97(arg0 + 45365, arg1 + 91923, 4) - 128 + (method97(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method97(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("w.m(IIIB)I")
    public static final int method97(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1359(var3, var5);
        int var8 = method1359(var3 + 1, var5);
        int var9 = method1359(var3, var5 + 1);
        int var10 = method1359(var3 + 1, var5 + 1);
        int var11 = method3557(var7, var8, var4, arg2);
        int var12 = method3557(var9, var10, var4, arg2);
        return method3557(var11, var12, var6, arg2);
    }

    @ObfuscatedName("gl.r(IIIII)I")
    public static final int method3557(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1455[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("bo.u(IIB)I")
    public static final int method1359(int arg0, int arg1) {
        int var2 = method2059(arg0 - 1, arg1 - 1) + method2059(arg0 + 1, arg1 - 1) + method2059(arg0 - 1, arg1 + 1) + method2059(arg0 + 1, arg1 + 1);
        int var3 = method2059(arg0 - 1, arg1) + method2059(arg0 + 1, arg1) + method2059(arg0, arg1 - 1) + method2059(arg0, arg1 + 1);
        int var4 = method2059(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("db.j(IIB)I")
    public static final int method2059(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("az.d(III)I")
    public static final int method692(int arg0, int arg1) {
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

    @ObfuscatedName("al.y(IIII)I")
    public static final int method751(int arg0, int arg1, int arg2) {
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
