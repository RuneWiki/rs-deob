package deob;

@ObfuscatedName("r")
public final class class11 {

    @ObfuscatedName("r.s")
    public static int[][][] field93 = new int[4][105][105];

    @ObfuscatedName("r.c")
    public static byte[][][] field112 = new byte[4][104][104];

    @ObfuscatedName("r.f")
    public static int field92 = 99;

    @ObfuscatedName("r.z")
    public static final int[] field101 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("r.e")
    public static final int[] field102 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("r.d")
    public static final int[] field103 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("r.t")
    public static final int[] field104 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("r.q")
    public static final int[] field105 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("r.y")
    public static final int[] field99 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("r.l")
    public static int field100 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("r.v")
    public static int field108 = (int) (Math.random() * 33.0D) - 16;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.s(I)V")
    public static void method61() {
        field92 = 99;
        Statics.field966 = new byte[4][104][104];
        Statics.field95 = new byte[4][104][104];
        Statics.field229 = new byte[4][104][104];
        Statics.field96 = new byte[4][104][104];
        Statics.field2153 = new int[4][105][105];
        Statics.field2158 = new byte[4][105][105];
        Statics.field94 = new int[105][105];
        Statics.field185 = new int[104];
        Statics.field117 = new int[104];
        Statics.field785 = new int[104];
        Statics.field98 = new int[104];
        Statics.field2350 = new int[104];
    }

    @ObfuscatedName("at.c(IIIII)V")
    public static final void method775(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2158[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field93[0][var5][var4] = field93[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field93[0][var5][var4] = field93[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field93[0][var5][var4] = field93[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field93[0][var5][var4] = field93[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("fr.f([BIIIIIII[Ldg;I)V")
    public static final void method2793(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1841[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class154 var11 = new class154(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method2255(var11, arg1, arg2 + class169.method692(var13 & 0x7, var14 & 0x7, arg7), arg3 + class169.method1082(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method2255(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ev.g(Lea;IIIIIIS)V")
    public static final void method2255(class154 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2545();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2545();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2545();
                }
            }
            return;
        }
        field112[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2545();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field93[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method2268(var10 + 45365, var11 + 91923, 4) - 128 + (method2268(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method2268(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field93[arg1][arg2][arg3] = field93[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2545();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field93[0][arg2][arg3] = -var15 * 8;
                } else {
                    field93[arg1][arg2][arg3] = field93[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field95[arg1][arg2][arg3] = arg0.method2657();
                Statics.field229[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field96[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field112[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field966[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ay.k([BIII)Z")
    public static final boolean method709(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class154 var4 = new class154(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2558();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2558();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2545() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class198 var16 = class198.method2454(var5);
                        if (var13 != 22 || !client.field300 || var16.field2911 != 0 || var16.field2917 == 1 || var16.field2905) {
                            if (!var16.method3296()) {
                                client.field351++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2558();
                if (var9 == 0) {
                    break;
                }
                var4.method2545();
            }
        }
    }

    @ObfuscatedName("de.u([BIIIIIIILcs;[Ldg;I)V")
    public static final void method1989(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class88 arg8, class118[] arg9) {
        class154 var10 = new class154(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2558();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2558();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2545();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class198 var21 = class198.method2454(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field2915;
                    int var27 = var21.field2916;
                    if ((var20 & 0x1) == 1) {
                        int var28 = var26;
                        var26 = var27;
                        var27 = var28;
                    }
                    int var29 = arg7 & 0x3;
                    int var30;
                    if (var29 == 0) {
                        var30 = var23;
                    } else if (var29 == 1) {
                        var30 = var24;
                    } else if (var29 == 2) {
                        var30 = 7 - var23 - (var26 - 1);
                    } else {
                        var30 = 7 - var24 - (var27 - 1);
                    }
                    int var31 = arg2 + var30;
                    int var32 = arg3 + class169.method832(var16 & 0x7, var15 & 0x7, arg7, var21.field2915, var21.field2916, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field112[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class118 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method1067(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bj.b(IIIIIILcs;Ldg;I)V")
    public static final void method1067(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, class118 arg7) {
        if (client.field300 && (field112[0][arg1][arg2] & 0x2) == 0 && (field112[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field92) {
            field92 = arg0;
        }
        class198 var8 = class198.method2454(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2916;
            var10 = var8.field2915;
        } else {
            var9 = var8.field2915;
            var10 = var8.field2916;
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
        int[][] var15 = field93[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field2911 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field2940 == 1) {
            var20 += 256;
        }
        if (var8.method3289()) {
            class32 var21 = new class32();
            var21.field705 = arg0;
            var21.field706 = arg1 * 128;
            var21.field716 = arg2 * 128;
            int var22 = var8.field2915;
            int var23 = var8.field2916;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field2916;
                var23 = var8.field2915;
            }
            var21.field707 = (arg1 + var22) * 128;
            var21.field709 = (arg2 + var23) * 128;
            var21.field708 = var8.field2944;
            var21.field711 = var8.field2945 * 128;
            var21.field713 = var8.field2946;
            var21.field714 = var8.field2947;
            var21.field710 = var8.field2938;
            if (var8.field2939 != null) {
                var21.field718 = var8;
                var21.method651();
            }
            class32.field704.method2190(var21);
            if (var21.field710 != null) {
                var21.field715 = var21.field713 + (int) (Math.random() * (double) (var21.field714 - var21.field713));
            }
        }
        if (arg5 == 22) {
            if (!client.field300 || var8.field2911 != 0 || var8.field2917 == 1 || var8.field2905) {
                class90 var24;
                if (var8.field2923 == -1 && var8.field2939 == null) {
                    var24 = var8.method3283(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class50(arg3, 22, arg4, arg0, arg1, arg2, var8.field2923, true, (class90) null);
                }
                arg6.method1601(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field2917 == 1 && arg7 != null) {
                    arg7.method2041(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class90 var47;
            if (var8.field2923 == -1 && var8.field2939 == null) {
                var47 = var8.method3283(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class50(arg3, 10, arg4, arg0, arg1, arg2, var8.field2923, true, (class90) null);
            }
            if (var47 != null && arg6.method1735(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field2931) {
                int var48 = 15;
                if (var47 instanceof class83) {
                    var48 = ((class83) var47).method1494() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field2158[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field2158[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field2917 != 0 && arg7 != null) {
                arg7.method2042(arg1, arg2, var9, var10, var8.field2934);
            }
        } else if (arg5 >= 12) {
            class90 var25;
            if (var8.field2923 == -1 && var8.field2939 == null) {
                var25 = var8.method3283(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2923, true, (class90) null);
            }
            arg6.method1735(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2153[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2917 != 0 && arg7 != null) {
                arg7.method2042(arg1, arg2, var9, var10, var8.field2934);
            }
        } else if (arg5 == 0) {
            class90 var26;
            if (var8.field2923 == -1 && var8.field2939 == null) {
                var26 = var8.method3283(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class50(arg3, 0, arg4, arg0, arg1, arg2, var8.field2923, true, (class90) null);
            }
            arg6.method1625(arg0, arg1, arg2, var16, var26, (class90) null, field101[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field2931) {
                    Statics.field2158[arg0][arg1][arg2] = 50;
                    Statics.field2158[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2922) {
                    Statics.field2153[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2931) {
                    Statics.field2158[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2158[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2922) {
                    Statics.field2153[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2931) {
                    Statics.field2158[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2158[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2922) {
                    Statics.field2153[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2931) {
                    Statics.field2158[arg0][arg1][arg2] = 50;
                    Statics.field2158[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2922) {
                    Statics.field2153[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2917 != 0 && arg7 != null) {
                arg7.method2046(arg1, arg2, arg5, arg4, var8.field2934);
            }
            if (var8.field2924 != 16) {
                arg6.method1599(arg0, arg1, arg2, var8.field2924);
            }
        } else if (arg5 == 1) {
            class90 var27;
            if (var8.field2923 == -1 && var8.field2939 == null) {
                var27 = var8.method3283(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class50(arg3, 1, arg4, arg0, arg1, arg2, var8.field2923, true, (class90) null);
            }
            arg6.method1625(arg0, arg1, arg2, var16, var27, (class90) null, field102[arg4], 0, var19, var20);
            if (var8.field2931) {
                if (arg4 == 0) {
                    Statics.field2158[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2158[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2158[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2158[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2917 != 0 && arg7 != null) {
                arg7.method2046(arg1, arg2, arg5, arg4, var8.field2934);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class90 var29;
            class90 var30;
            if (var8.field2923 == -1 && var8.field2939 == null) {
                var29 = var8.method3283(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method3283(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class50(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2923, true, (class90) null);
                var30 = new class50(arg3, 2, var28, arg0, arg1, arg2, var8.field2923, true, (class90) null);
            }
            arg6.method1625(arg0, arg1, arg2, var16, var29, var30, field101[arg4], field101[var28], var19, var20);
            if (var8.field2922) {
                if (arg4 == 0) {
                    Statics.field2153[arg0][arg1][arg2] |= 0x249;
                    Statics.field2153[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2153[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2153[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2153[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2153[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2153[arg0][arg1][arg2] |= 0x492;
                    Statics.field2153[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2917 != 0 && arg7 != null) {
                arg7.method2046(arg1, arg2, arg5, arg4, var8.field2934);
            }
            if (var8.field2924 != 16) {
                arg6.method1599(arg0, arg1, arg2, var8.field2924);
            }
        } else if (arg5 == 3) {
            class90 var31;
            if (var8.field2923 == -1 && var8.field2939 == null) {
                var31 = var8.method3283(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class50(arg3, 3, arg4, arg0, arg1, arg2, var8.field2923, true, (class90) null);
            }
            arg6.method1625(arg0, arg1, arg2, var16, var31, (class90) null, field102[arg4], 0, var19, var20);
            if (var8.field2931) {
                if (arg4 == 0) {
                    Statics.field2158[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2158[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2158[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2158[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2917 != 0 && arg7 != null) {
                arg7.method2046(arg1, arg2, arg5, arg4, var8.field2934);
            }
        } else if (arg5 == 9) {
            class90 var32;
            if (var8.field2923 == -1 && var8.field2939 == null) {
                var32 = var8.method3283(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2923, true, (class90) null);
            }
            arg6.method1735(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field2917 != 0 && arg7 != null) {
                arg7.method2042(arg1, arg2, var9, var10, var8.field2934);
            }
            if (var8.field2924 != 16) {
                arg6.method1599(arg0, arg1, arg2, var8.field2924);
            }
        } else if (arg5 == 4) {
            class90 var33;
            if (var8.field2923 == -1 && var8.field2939 == null) {
                var33 = var8.method3283(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2923, true, (class90) null);
            }
            arg6.method1592(arg0, arg1, arg2, var16, var33, (class90) null, field101[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1609(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class198.method2454(var35 >> 14 & 0x7FFF).field2924;
            }
            class90 var36;
            if (var8.field2923 == -1 && var8.field2939 == null) {
                var36 = var8.method3283(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2923, true, (class90) null);
            }
            arg6.method1592(arg0, arg1, arg2, var16, var36, (class90) null, field101[arg4], 0, field103[arg4] * var34, field104[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1609(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class198.method2454(var38 >> 14 & 0x7FFF).field2924 / 2;
            }
            class90 var39;
            if (var8.field2923 == -1 && var8.field2939 == null) {
                var39 = var8.method3283(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2923, true, (class90) null);
            }
            arg6.method1592(arg0, arg1, arg2, var16, var39, (class90) null, 256, arg4, field105[arg4] * var37, field99[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class90 var41;
            if (var8.field2923 == -1 && var8.field2939 == null) {
                var41 = var8.method3283(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class50(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2923, true, (class90) null);
            }
            arg6.method1592(arg0, arg1, arg2, var16, var41, (class90) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1609(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class198.method2454(var43 >> 14 & 0x7FFF).field2924 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class90 var45;
            class90 var46;
            if (var8.field2923 == -1 && var8.field2939 == null) {
                var45 = var8.method3283(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method3283(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2923, true, (class90) null);
                var46 = new class50(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field2923, true, (class90) null);
            }
            arg6.method1592(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field105[arg4] * var42, field99[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("ep.x(Lcs;[Ldg;I)V")
    public static final void method2269(class88 arg0, class118[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field112[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field112[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2065(var3, var4);
                        }
                    }
                }
            }
        }
        field100 += (int) (Math.random() * 5.0D) - 2;
        if (field100 < -8) {
            field100 = -8;
        }
        if (field100 > 8) {
            field100 = 8;
        }
        field108 += (int) (Math.random() * 5.0D) - 2;
        if (field108 < -16) {
            field108 = -16;
        }
        if (field108 > 16) {
            field108 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field2158[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field93[var6][var11 + 1][var10] - field93[var6][var11 - 1][var10];
                    int var13 = field93[var6][var11][var10 + 1] - field93[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field94[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field185[var20] = 0;
                Statics.field117[var20] = 0;
                Statics.field785[var20] = 0;
                Statics.field98[var20] = 0;
                Statics.field2350[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field966[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class192 var25 = class192.method475(var24 - 1);
                            Statics.field185[var22] += var25.field2820;
                            Statics.field117[var22] += var25.field2816;
                            Statics.field785[var22] += var25.field2817;
                            Statics.field98[var22] += var25.field2818;
                            var10002 = Statics.field2350[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field966[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class192 var28 = class192.method475(var27 - 1);
                            Statics.field185[var22] -= var28.field2820;
                            Statics.field117[var22] -= var28.field2816;
                            Statics.field785[var22] -= var28.field2817;
                            Statics.field98[var22] -= var28.field2818;
                            var10002 = Statics.field2350[var22]--;
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
                            var29 += Statics.field185[var35];
                            var30 += Statics.field117[var35];
                            var31 += Statics.field785[var35];
                            var32 += Statics.field98[var35];
                            var33 += Statics.field2350[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field185[var36];
                            var30 -= Statics.field117[var36];
                            var31 -= Statics.field785[var36];
                            var32 -= Statics.field98[var36];
                            var33 -= Statics.field2350[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field300 || (field112[0][var21][var34] & 0x2) != 0 || (field112[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field92) {
                                field92 = var6;
                            }
                            int var37 = Statics.field966[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field95[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field93[var6][var21][var34];
                                int var40 = field93[var6][var21 + 1][var34];
                                int var41 = field93[var6][var21 + 1][var34 + 1];
                                int var42 = field93[var6][var21][var34 + 1];
                                int var43 = Statics.field94[var21][var34];
                                int var44 = Statics.field94[var21 + 1][var34];
                                int var45 = Statics.field94[var21 + 1][var34 + 1];
                                int var46 = Statics.field94[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method766(var49, var50, var51);
                                    int var52 = field100 + var49 & 0xFF;
                                    int var53 = field108 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method766(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field229[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0) {
                                        int var55 = var38 - 1;
                                        class201 var56 = (class201) class201.field3047.method2121((long) var55);
                                        class201 var57;
                                        if (var56 == null) {
                                            byte[] var58 = Statics.field738.method2986(4, var55);
                                            class201 var59 = new class201();
                                            if (var58 != null) {
                                                var59.method3393(new class154(var58), var55);
                                            }
                                            var59.method3395();
                                            class201.field3047.method2123(var59, (long) var55);
                                            var57 = var59;
                                        } else {
                                            var57 = var56;
                                        }
                                        if (!var57.field3052) {
                                            var54 = false;
                                        }
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field2153[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var60 = 0;
                                if (var48 != -1) {
                                    var60 = class85.field1441[method744(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1588(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method744(var47, var43), method744(var47, var44), method744(var47, var45), method744(var47, var46), 0, 0, 0, 0, var60, 0);
                                } else {
                                    int var61 = Statics.field229[var6][var21][var34] + 1;
                                    byte var62 = Statics.field96[var6][var21][var34];
                                    class201 var63 = Statics.method1765(var38 - 1);
                                    int var64 = var63.field3046;
                                    int var65;
                                    int var66;
                                    if (var64 >= 0) {
                                        var65 = Statics.field1439.method1326(var64);
                                        var66 = -1;
                                    } else if (var63.field3043 == 16711935) {
                                        var66 = -2;
                                        var64 = -1;
                                        var65 = -2;
                                    } else {
                                        var66 = method766(var63.field3042, var63.field3048, var63.field3049);
                                        int var67 = field100 + var63.field3042 & 0xFF;
                                        int var68 = field108 + var63.field3049;
                                        if (var68 < 0) {
                                            var68 = 0;
                                        } else if (var68 > 255) {
                                            var68 = 255;
                                        }
                                        var65 = method766(var67, var63.field3048, var68);
                                    }
                                    int var69 = 0;
                                    if (var65 != -2) {
                                        var69 = class85.field1441[method1580(var65, 96)];
                                    }
                                    if (var63.field3045 != -1) {
                                        int var70 = field100 + var63.field3044 & 0xFF;
                                        int var71 = field108 + var63.field3050;
                                        if (var71 < 0) {
                                            var71 = 0;
                                        } else if (var71 > 255) {
                                            var71 = 255;
                                        }
                                        int var72 = method766(var70, var63.field3051, var71);
                                        var69 = class85.field1441[method1580(var72, 96)];
                                    }
                                    arg0.method1588(var6, var21, var34, var61, var62, var64, var39, var40, var41, var42, method744(var47, var43), method744(var47, var44), method744(var47, var45), method744(var47, var46), method1580(var66, var43), method1580(var66, var44), method1580(var66, var45), method1580(var66, var46), var60, var69);
                                }
                            }
                        }
                    }
                }
            }
            for (int var73 = 1; var73 < 103; var73++) {
                for (int var74 = 1; var74 < 103; var74++) {
                    arg0.method1587(var6, var74, var73, method1066(var6, var74, var73));
                }
            }
            Statics.field966[var6] = (byte[][]) null;
            Statics.field95[var6] = (byte[][]) null;
            Statics.field229[var6] = (byte[][]) null;
            Statics.field96[var6] = (byte[][]) null;
            Statics.field2158[var6] = (byte[][]) null;
        }
        arg0.method1614(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field112[1][var75][var76] & 0x2) == 2) {
                    arg0.method1585(var75, var76);
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
                        if ((Statics.field2153[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field2153[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field2153[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label346: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field2153[var86 - 1][var83][var88] & var77) == 0) {
                                        break label346;
                                    }
                                }
                                var86--;
                            }
                            label335: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field2153[var87 + 1][var83][var89] & var77) == 0) {
                                        break label335;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field93[var87][var83][var84] - var91;
                                int var93 = field93[var86][var83][var84];
                                class88.method1586(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field2153[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2153[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field2153[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field2153[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label399: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field2153[var98 - 1][var100][var82] & var78) == 0) {
                                        break label399;
                                    }
                                }
                                var98--;
                            }
                            label388: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field2153[var99 + 1][var101][var82] & var78) == 0) {
                                        break label388;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field93[var99][var96][var82] - var103;
                                int var105 = field93[var98][var96][var82];
                                class88.method1586(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field2153[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2153[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field2153[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field2153[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label452: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field2153[var81][var108 - 1][var112] & var79) == 0) {
                                        break label452;
                                    }
                                }
                                var108--;
                            }
                            label441: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field2153[var81][var109 + 1][var113] & var79) == 0) {
                                        break label441;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field93[var81][var108][var110];
                                class88.method1586(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field2153[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bj.r(IIIS)I")
    public static int method1066(int arg0, int arg1, int arg2) {
        if ((field112[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field112[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ep.n(IIII)I")
    public static final int method2268(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method668(var3, var5);
        int var8 = method668(var3 + 1, var5);
        int var9 = method668(var3, var5 + 1);
        int var10 = method668(var3 + 1, var5 + 1);
        int var11 = method708(var7, var8, var4, arg2);
        int var12 = method708(var9, var10, var4, arg2);
        return method708(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ar.m(IIIII)I")
    public static final int method708(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1454[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("al.j(III)I")
    public static final int method668(int arg0, int arg1) {
        int var2 = method579(arg0 - 1, arg1 - 1) + method579(arg0 + 1, arg1 - 1) + method579(arg0 - 1, arg1 + 1) + method579(arg0 + 1, arg1 + 1);
        int var3 = method579(arg0 - 1, arg1) + method579(arg0 + 1, arg1) + method579(arg0, arg1 - 1) + method579(arg0, arg1 + 1);
        int var4 = method579(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ai.w(III)I")
    public static final int method579(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("af.p(III)I")
    public static final int method744(int arg0, int arg1) {
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

    @ObfuscatedName("cn.o(III)I")
    public static final int method1580(int arg0, int arg1) {
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

    @ObfuscatedName("ac.i(IIII)I")
    public static final int method766(int arg0, int arg1, int arg2) {
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
