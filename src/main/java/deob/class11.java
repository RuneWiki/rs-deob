package deob;

@ObfuscatedName("g")
public final class class11 {

    @ObfuscatedName("g.d")
    public static int[][][] field103 = new int[4][105][105];

    @ObfuscatedName("g.c")
    public static byte[][][] field93 = new byte[4][104][104];

    @ObfuscatedName("g.n")
    public static int field94 = 99;

    @ObfuscatedName("g.a")
    public static final int[] field100 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("g.x")
    public static final int[] field102 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("g.h")
    public static final int[] field101 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("g.b")
    public static final int[] field108 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("g.f")
    public static final int[] field111 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("g.o")
    public static final int[] field104 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("g.m")
    public static int field105 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("g.y")
    public static int field106 = (int) (Math.random() * 33.0D) - 16;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ch.d(IIIII)V")
    public static final void method1877(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field883[0][var5][var4] = 127;
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

    @ObfuscatedName("du.c([BIIII[Ldj;I)V")
    public static final void method2447(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class118[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1838[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class130 var9 = new class130(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method153(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("dc.n([BIIIIIII[Ldj;I)V")
    public static final void method2150(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1838[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class130 var11 = new class130(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class171.method203(var13 & 0x7, var14 & 0x7, arg7);
                        int var19 = var13 & 0x7;
                        int var20 = var14 & 0x7;
                        int var22 = arg7 & 0x3;
                        int var23;
                        if (var22 == 0) {
                            var23 = var20;
                        } else if (var22 == 1) {
                            var23 = 7 - var19;
                        } else if (var22 == 2) {
                            var23 = 7 - var20;
                        } else {
                            var23 = var19;
                        }
                        method153(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method153(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.q(IIIB)V")
    public static final void method709(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field103[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field103[arg0][arg1][arg2 + var5] = field103[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field103[arg0][arg1 + var6][arg2] = field103[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field103[arg0][arg1 - 1][arg2] != 0) {
            field103[arg0][arg1][arg2] = field103[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field103[arg0][arg1][arg2 - 1] != 0) {
            field103[arg0][arg1][arg2] = field103[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field103[arg0][arg1 - 1][arg2 - 1] != 0) {
            field103[arg0][arg1][arg2] = field103[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("w.t(Ldu;IIIIIII)V")
    public static final void method153(class130 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2379();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2379();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2379();
                }
            }
            return;
        }
        field93[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2379();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field103[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method151(var10 + 45365, var11 + 91923, 4) - 128 + (method151(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method151(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field103[arg1][arg2][arg3] = field103[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2379();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field103[0][arg2][arg3] = -var15 * 8;
                } else {
                    field103[arg1][arg2][arg3] = field103[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1859[arg1][arg2][arg3] = arg0.method2230();
                Statics.field95[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1901[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field93[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field2353[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("v.p(IIIIIILcq;Ldj;I)V")
    public static final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, class118 arg7) {
        if (client.field286 && (field93[0][arg1][arg2] & 0x2) == 0 && (field93[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field94) {
            field94 = arg0;
        }
        class203 var8 = class203.method579(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2941;
            var10 = var8.field2964;
        } else {
            var9 = var8.field2964;
            var10 = var8.field2941;
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
        if (var8.field2944 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field2965 == 1) {
            var20 += 256;
        }
        if (var8.method3478()) {
            class32.method1815(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field286 || var8.field2944 != 0 || var8.field2937 == 1 || var8.field2963) {
                class90 var21;
                if (var8.field2930 == -1 && var8.field2966 == null) {
                    var21 = var8.method3471(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class50(arg3, 22, arg4, arg0, arg1, arg2, var8.field2930, true, (class90) null);
                }
                arg6.method1803(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field2937 == 1 && arg7 != null) {
                    arg7.method2103(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class90 var44;
            if (var8.field2930 == -1 && var8.field2966 == null) {
                var44 = var8.method3471(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class50(arg3, 10, arg4, arg0, arg1, arg2, var8.field2930, true, (class90) null);
            }
            if (var44 != null && arg6.method1661(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field2956) {
                int var45 = 15;
                if (var44 instanceof class83) {
                    var45 = ((class83) var44).method1509() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field883[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field883[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field2937 != 0 && arg7 != null) {
                arg7.method2102(arg1, arg2, var9, var10, var8.field2943);
            }
        } else if (arg5 >= 12) {
            class90 var22;
            if (var8.field2930 == -1 && var8.field2966 == null) {
                var22 = var8.method3471(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2930, true, (class90) null);
            }
            arg6.method1661(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2161[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2937 != 0 && arg7 != null) {
                arg7.method2102(arg1, arg2, var9, var10, var8.field2943);
            }
        } else if (arg5 == 0) {
            class90 var23;
            if (var8.field2930 == -1 && var8.field2966 == null) {
                var23 = var8.method3471(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class50(arg3, 0, arg4, arg0, arg1, arg2, var8.field2930, true, (class90) null);
            }
            arg6.method1644(arg0, arg1, arg2, var16, var23, (class90) null, field100[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field2956) {
                    Statics.field883[arg0][arg1][arg2] = 50;
                    Statics.field883[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2940) {
                    Statics.field2161[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2956) {
                    Statics.field883[arg0][arg1][arg2 + 1] = 50;
                    Statics.field883[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2940) {
                    Statics.field2161[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2956) {
                    Statics.field883[arg0][arg1 + 1][arg2] = 50;
                    Statics.field883[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2940) {
                    Statics.field2161[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2956) {
                    Statics.field883[arg0][arg1][arg2] = 50;
                    Statics.field883[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2940) {
                    Statics.field2161[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2937 != 0 && arg7 != null) {
                arg7.method2104(arg1, arg2, arg5, arg4, var8.field2943);
            }
            if (var8.field2952 != 16) {
                arg6.method1652(arg0, arg1, arg2, var8.field2952);
            }
        } else if (arg5 == 1) {
            class90 var24;
            if (var8.field2930 == -1 && var8.field2966 == null) {
                var24 = var8.method3471(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class50(arg3, 1, arg4, arg0, arg1, arg2, var8.field2930, true, (class90) null);
            }
            arg6.method1644(arg0, arg1, arg2, var16, var24, (class90) null, field102[arg4], 0, var19, var20);
            if (var8.field2956) {
                if (arg4 == 0) {
                    Statics.field883[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field883[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field883[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field883[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2937 != 0 && arg7 != null) {
                arg7.method2104(arg1, arg2, arg5, arg4, var8.field2943);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class90 var26;
            class90 var27;
            if (var8.field2930 == -1 && var8.field2966 == null) {
                var26 = var8.method3471(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method3471(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class50(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2930, true, (class90) null);
                var27 = new class50(arg3, 2, var25, arg0, arg1, arg2, var8.field2930, true, (class90) null);
            }
            arg6.method1644(arg0, arg1, arg2, var16, var26, var27, field100[arg4], field100[var25], var19, var20);
            if (var8.field2940) {
                if (arg4 == 0) {
                    Statics.field2161[arg0][arg1][arg2] |= 0x249;
                    Statics.field2161[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2161[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2161[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2161[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2161[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2161[arg0][arg1][arg2] |= 0x492;
                    Statics.field2161[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2937 != 0 && arg7 != null) {
                arg7.method2104(arg1, arg2, arg5, arg4, var8.field2943);
            }
            if (var8.field2952 != 16) {
                arg6.method1652(arg0, arg1, arg2, var8.field2952);
            }
        } else if (arg5 == 3) {
            class90 var28;
            if (var8.field2930 == -1 && var8.field2966 == null) {
                var28 = var8.method3471(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class50(arg3, 3, arg4, arg0, arg1, arg2, var8.field2930, true, (class90) null);
            }
            arg6.method1644(arg0, arg1, arg2, var16, var28, (class90) null, field102[arg4], 0, var19, var20);
            if (var8.field2956) {
                if (arg4 == 0) {
                    Statics.field883[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field883[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field883[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field883[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2937 != 0 && arg7 != null) {
                arg7.method2104(arg1, arg2, arg5, arg4, var8.field2943);
            }
        } else if (arg5 == 9) {
            class90 var29;
            if (var8.field2930 == -1 && var8.field2966 == null) {
                var29 = var8.method3471(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2930, true, (class90) null);
            }
            arg6.method1661(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field2937 != 0 && arg7 != null) {
                arg7.method2102(arg1, arg2, var9, var10, var8.field2943);
            }
            if (var8.field2952 != 16) {
                arg6.method1652(arg0, arg1, arg2, var8.field2952);
            }
        } else if (arg5 == 4) {
            class90 var30;
            if (var8.field2930 == -1 && var8.field2966 == null) {
                var30 = var8.method3471(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2930, true, (class90) null);
            }
            arg6.method1645(arg0, arg1, arg2, var16, var30, (class90) null, field100[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1662(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class203.method579(var32 >> 14 & 0x7FFF).field2952;
            }
            class90 var33;
            if (var8.field2930 == -1 && var8.field2966 == null) {
                var33 = var8.method3471(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2930, true, (class90) null);
            }
            arg6.method1645(arg0, arg1, arg2, var16, var33, (class90) null, field100[arg4], 0, field101[arg4] * var31, field108[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1662(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class203.method579(var35 >> 14 & 0x7FFF).field2952 / 2;
            }
            class90 var36;
            if (var8.field2930 == -1 && var8.field2966 == null) {
                var36 = var8.method3471(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2930, true, (class90) null);
            }
            arg6.method1645(arg0, arg1, arg2, var16, var36, (class90) null, 256, arg4, field111[arg4] * var34, field104[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class90 var38;
            if (var8.field2930 == -1 && var8.field2966 == null) {
                var38 = var8.method3471(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class50(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field2930, true, (class90) null);
            }
            arg6.method1645(arg0, arg1, arg2, var16, var38, (class90) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1662(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class203.method579(var40 >> 14 & 0x7FFF).field2952 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class90 var42;
            class90 var43;
            if (var8.field2930 == -1 && var8.field2966 == null) {
                var42 = var8.method3471(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method3471(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2930, true, (class90) null);
                var43 = new class50(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field2930, true, (class90) null);
            }
            arg6.method1645(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field111[arg4] * var39, field104[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("g.u(IIII)I")
    public static final int method151(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2841(var3, var5);
        int var8 = method2841(var3 + 1, var5);
        int var9 = method2841(var3, var5 + 1);
        int var10 = method2841(var3 + 1, var5 + 1);
        int var11 = 65536 - class85.field1442[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class85.field1442[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class85.field1442[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("fg.w(III)I")
    public static final int method2841(int arg0, int arg1) {
        int var2 = method1148(arg0 - 1, arg1 - 1) + method1148(arg0 + 1, arg1 - 1) + method1148(arg0 - 1, arg1 + 1) + method1148(arg0 + 1, arg1 + 1);
        int var3 = method1148(arg0 - 1, arg1) + method1148(arg0 + 1, arg1) + method1148(arg0, arg1 - 1) + method1148(arg0, arg1 + 1);
        int var4 = method1148(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("bb.r(III)I")
    public static final int method1148(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bb.s(III)I")
    public static final int method1149(int arg0, int arg1) {
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

    @ObfuscatedName("e.k(IIB)I")
    public static final int method187(int arg0, int arg1) {
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

    @ObfuscatedName("ag.e(IIIB)I")
    public static final int method760(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("e.j(III)Z")
    public static final boolean method190(int arg0, int arg1) {
        class203 var2 = class203.method579(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3512(arg1);
    }
}
