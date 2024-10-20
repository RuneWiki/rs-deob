package deob;

@ObfuscatedName("x")
public final class class11 {

    @ObfuscatedName("x.b")
    public static int[][][] field99 = new int[4][105][105];

    @ObfuscatedName("x.l")
    public static byte[][][] field88 = new byte[4][104][104];

    @ObfuscatedName("x.i")
    public static int field110 = 99;

    @ObfuscatedName("x.u")
    public static final int[] field89 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("x.q")
    public static final int[] field97 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("x.c")
    public static final int[] field91 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("x.v")
    public static final int[] field100 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("x.e")
    public static final int[] field98 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("x.j")
    public static final int[] field101 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("x.d")
    public static int field102 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("x.g")
    public static int field103 = (int) (Math.random() * 33.0D) - 16;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cd.b(I)V")
    public static void method1875() {
        field110 = 99;
        Statics.field90 = new byte[4][104][104];
        Statics.field108 = new byte[4][104][104];
        Statics.field92 = new byte[4][104][104];
        Statics.field93 = new byte[4][104][104];
        Statics.field2028 = new int[4][105][105];
        Statics.field885 = new byte[4][105][105];
        Statics.field2730 = new int[105][105];
        Statics.field1445 = new int[104];
        Statics.field1997 = new int[104];
        Statics.field929 = new int[104];
        Statics.field96 = new int[104];
        Statics.field176 = new int[104];
    }

    @ObfuscatedName("ep.l(B)V")
    public static void method2902() {
        Statics.field90 = (byte[][][]) null;
        Statics.field108 = (byte[][][]) null;
        Statics.field92 = (byte[][][]) null;
        Statics.field93 = (byte[][][]) null;
        Statics.field2028 = (int[][][]) null;
        Statics.field885 = (byte[][][]) null;
        Statics.field2730 = (int[][]) null;
        Statics.field1445 = null;
        Statics.field1997 = null;
        Statics.field929 = null;
        Statics.field96 = null;
        Statics.field176 = null;
    }

    @ObfuscatedName("cf.i(IIIIB)V")
    public static final void method1865(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field885[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field99[0][var5][var4] = field99[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field99[0][var5][var4] = field99[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field99[0][var5][var4] = field99[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field99[0][var5][var4] = field99[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("bu.t([BIIIIIII[Ldr;B)V")
    public static final void method1441(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1826[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
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
                        int var25 = arg2 + var22;
                        int var27 = var13 & 0x7;
                        int var28 = var14 & 0x7;
                        int var30 = arg7 & 0x3;
                        int var31;
                        if (var30 == 0) {
                            var31 = var28;
                        } else if (var30 == 1) {
                            var31 = 7 - var27;
                        } else if (var30 == 2) {
                            var31 = 7 - var28;
                        } else {
                            var31 = var27;
                        }
                        method118(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method118(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.k(Leg;IIIIIII)V")
    public static final void method118(class154 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2678();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2678();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2678();
                }
            }
            return;
        }
        field88[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2678();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field99[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method3143(var10 + 45365, var11 + 91923, 4) - 128 + (method3143(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method3143(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field99[arg1][arg2][arg3] = field99[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2678();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field99[0][arg2][arg3] = -var15 * 8;
                } else {
                    field99[arg1][arg2][arg3] = field99[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field108[arg1][arg2][arg3] = arg0.method2679();
                Statics.field92[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field93[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field88[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field90[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("dg.x([BIII)Z")
    public static final boolean method2039(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class154 var4 = new class154(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2813();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2813();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2678() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class198 var16 = class198.method3471(var5);
                        if (var13 != 22 || !client.field405 || var16.field2923 != 0 || var16.field2915 == 1 || var16.field2936) {
                            if (!var16.method3479()) {
                                client.field533++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2813();
                if (var9 == 0) {
                    break;
                }
                var4.method2678();
            }
        }
    }

    @ObfuscatedName("bu.p(IIIIIILcn;Ldr;I)V")
    public static final void method1440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, class118 arg7) {
        if (client.field405 && (field88[0][arg1][arg2] & 0x2) == 0 && (field88[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field110) {
            field110 = arg0;
        }
        class198 var8 = class198.method3471(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2914;
            var10 = var8.field2913;
        } else {
            var9 = var8.field2913;
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
        int[][] var15 = field99[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field2923 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field2944 == 1) {
            var20 += 256;
        }
        if (var8.method3485()) {
            class32.method98(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field405 || var8.field2923 != 0 || var8.field2915 == 1 || var8.field2936) {
                class90 var21;
                if (var8.field2921 == -1 && var8.field2939 == null) {
                    var21 = var8.method3480(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class50(arg3, 22, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
                }
                arg6.method1685(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field2915 == 1 && arg7 != null) {
                    arg7.method2176(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class90 var44;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var44 = var8.method3480(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class50(arg3, 10, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            if (var44 != null && arg6.method1689(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field2905) {
                int var45 = 15;
                if (var44 instanceof class83) {
                    var45 = ((class83) var44).method1606() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field885[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field885[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field2915 != 0 && arg7 != null) {
                arg7.method2174(arg1, arg2, var9, var10, var8.field2916);
            }
        } else if (arg5 >= 12) {
            class90 var22;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var22 = var8.method3480(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1689(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2028[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2915 != 0 && arg7 != null) {
                arg7.method2174(arg1, arg2, var9, var10, var8.field2916);
            }
        } else if (arg5 == 0) {
            class90 var23;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var23 = var8.method3480(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class50(arg3, 0, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1804(arg0, arg1, arg2, var16, var23, (class90) null, field89[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field2905) {
                    Statics.field885[arg0][arg1][arg2] = 50;
                    Statics.field885[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2920) {
                    Statics.field2028[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2905) {
                    Statics.field885[arg0][arg1][arg2 + 1] = 50;
                    Statics.field885[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2920) {
                    Statics.field2028[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2905) {
                    Statics.field885[arg0][arg1 + 1][arg2] = 50;
                    Statics.field885[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2920) {
                    Statics.field2028[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2905) {
                    Statics.field885[arg0][arg1][arg2] = 50;
                    Statics.field885[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2920) {
                    Statics.field2028[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2915 != 0 && arg7 != null) {
                arg7.method2173(arg1, arg2, arg5, arg4, var8.field2916);
            }
            if (var8.field2925 != 16) {
                arg6.method1771(arg0, arg1, arg2, var8.field2925);
            }
        } else if (arg5 == 1) {
            class90 var24;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var24 = var8.method3480(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class50(arg3, 1, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1804(arg0, arg1, arg2, var16, var24, (class90) null, field97[arg4], 0, var19, var20);
            if (var8.field2905) {
                if (arg4 == 0) {
                    Statics.field885[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field885[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field885[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field885[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2915 != 0 && arg7 != null) {
                arg7.method2173(arg1, arg2, arg5, arg4, var8.field2916);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class90 var26;
            class90 var27;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var26 = var8.method3480(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method3480(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class50(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
                var27 = new class50(arg3, 2, var25, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1804(arg0, arg1, arg2, var16, var26, var27, field89[arg4], field89[var25], var19, var20);
            if (var8.field2920) {
                if (arg4 == 0) {
                    Statics.field2028[arg0][arg1][arg2] |= 0x249;
                    Statics.field2028[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2028[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2028[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2028[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2028[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2028[arg0][arg1][arg2] |= 0x492;
                    Statics.field2028[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2915 != 0 && arg7 != null) {
                arg7.method2173(arg1, arg2, arg5, arg4, var8.field2916);
            }
            if (var8.field2925 != 16) {
                arg6.method1771(arg0, arg1, arg2, var8.field2925);
            }
        } else if (arg5 == 3) {
            class90 var28;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var28 = var8.method3480(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class50(arg3, 3, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1804(arg0, arg1, arg2, var16, var28, (class90) null, field97[arg4], 0, var19, var20);
            if (var8.field2905) {
                if (arg4 == 0) {
                    Statics.field885[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field885[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field885[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field885[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2915 != 0 && arg7 != null) {
                arg7.method2173(arg1, arg2, arg5, arg4, var8.field2916);
            }
        } else if (arg5 == 9) {
            class90 var29;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var29 = var8.method3480(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1689(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field2915 != 0 && arg7 != null) {
                arg7.method2174(arg1, arg2, var9, var10, var8.field2916);
            }
            if (var8.field2925 != 16) {
                arg6.method1771(arg0, arg1, arg2, var8.field2925);
            }
        } else if (arg5 == 4) {
            class90 var30;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var30 = var8.method3480(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1688(arg0, arg1, arg2, var16, var30, (class90) null, field89[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1748(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class198.method3471(var32 >> 14 & 0x7FFF).field2925;
            }
            class90 var33;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var33 = var8.method3480(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1688(arg0, arg1, arg2, var16, var33, (class90) null, field89[arg4], 0, field91[arg4] * var31, field100[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1748(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class198.method3471(var35 >> 14 & 0x7FFF).field2925 / 2;
            }
            class90 var36;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var36 = var8.method3480(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1688(arg0, arg1, arg2, var16, var36, (class90) null, 256, arg4, field98[arg4] * var34, field101[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class90 var38;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var38 = var8.method3480(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class50(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1688(arg0, arg1, arg2, var16, var38, (class90) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1748(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class198.method3471(var40 >> 14 & 0x7FFF).field2925 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class90 var42;
            class90 var43;
            if (var8.field2921 == -1 && var8.field2939 == null) {
                var42 = var8.method3480(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method3480(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
                var43 = new class50(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1688(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field98[arg4] * var39, field101[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("fe.s(Lcn;[Ldr;B)V")
    public static final void method3147(class88 arg0, class118[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field88[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field88[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2175(var3, var4);
                        }
                    }
                }
            }
        }
        field102 += (int) (Math.random() * 5.0D) - 2;
        if (field102 < -8) {
            field102 = -8;
        }
        if (field102 > 8) {
            field102 = 8;
        }
        field103 += (int) (Math.random() * 5.0D) - 2;
        if (field103 < -16) {
            field103 = -16;
        }
        if (field103 > 16) {
            field103 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field885[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field99[var6][var11 + 1][var10] - field99[var6][var11 - 1][var10];
                    int var13 = field99[var6][var11][var10 + 1] - field99[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field2730[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field1445[var20] = 0;
                Statics.field1997[var20] = 0;
                Statics.field929[var20] = 0;
                Statics.field96[var20] = 0;
                Statics.field176[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field90[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class192 var25 = class192.method210(var24 - 1);
                            Statics.field1445[var22] += var25.field2814;
                            Statics.field1997[var22] += var25.field2815;
                            Statics.field929[var22] += var25.field2811;
                            Statics.field96[var22] += var25.field2812;
                            var10002 = Statics.field176[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field90[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class192 var28 = class192.method210(var27 - 1);
                            Statics.field1445[var22] -= var28.field2814;
                            Statics.field1997[var22] -= var28.field2815;
                            Statics.field929[var22] -= var28.field2811;
                            Statics.field96[var22] -= var28.field2812;
                            var10002 = Statics.field176[var22]--;
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
                            var29 += Statics.field1445[var35];
                            var30 += Statics.field1997[var35];
                            var31 += Statics.field929[var35];
                            var32 += Statics.field96[var35];
                            var33 += Statics.field176[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field1445[var36];
                            var30 -= Statics.field1997[var36];
                            var31 -= Statics.field929[var36];
                            var32 -= Statics.field96[var36];
                            var33 -= Statics.field176[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field405 || (field88[0][var21][var34] & 0x2) != 0 || (field88[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field110) {
                                field110 = var6;
                            }
                            int var37 = Statics.field90[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field108[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field99[var6][var21][var34];
                                int var40 = field99[var6][var21 + 1][var34];
                                int var41 = field99[var6][var21 + 1][var34 + 1];
                                int var42 = field99[var6][var21][var34 + 1];
                                int var43 = Statics.field2730[var21][var34];
                                int var44 = Statics.field2730[var21 + 1][var34];
                                int var45 = Statics.field2730[var21 + 1][var34 + 1];
                                int var46 = Statics.field2730[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method3139(var49, var50, var51);
                                    int var52 = field102 + var49 & 0xFF;
                                    int var53 = field103 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method3139(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field92[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0) {
                                        int var55 = var38 - 1;
                                        class201 var56 = (class201) class201.field3054.method2256((long) var55);
                                        class201 var57;
                                        if (var56 == null) {
                                            byte[] var58 = Statics.field3052.method3226(4, var55);
                                            class201 var59 = new class201();
                                            if (var58 != null) {
                                                var59.method3643(new class154(var58), var55);
                                            }
                                            var59.method3631();
                                            class201.field3054.method2258(var59, (long) var55);
                                            var57 = var59;
                                        } else {
                                            var57 = var56;
                                        }
                                        if (!var57.field3050) {
                                            var54 = false;
                                        }
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field2028[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var60 = 0;
                                if (var48 != -1) {
                                    var60 = class85.field1437[method2519(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1684(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method2519(var47, var43), method2519(var47, var44), method2519(var47, var45), method2519(var47, var46), 0, 0, 0, 0, var60, 0);
                                } else {
                                    int var61 = Statics.field92[var6][var21][var34] + 1;
                                    byte var62 = Statics.field93[var6][var21][var34];
                                    class201 var63 = class201.method617(var38 - 1);
                                    int var64 = var63.field3049;
                                    int var65;
                                    int var66;
                                    if (var64 >= 0) {
                                        var65 = Statics.field1416.method1413(var64);
                                        var66 = -1;
                                    } else if (var63.field3047 == 16711935) {
                                        var66 = -2;
                                        var64 = -1;
                                        var65 = -2;
                                    } else {
                                        var66 = method3139(var63.field3048, var63.field3057, var63.field3046);
                                        int var67 = field102 + var63.field3048 & 0xFF;
                                        int var68 = field103 + var63.field3046;
                                        if (var68 < 0) {
                                            var68 = 0;
                                        } else if (var68 > 255) {
                                            var68 = 255;
                                        }
                                        var65 = method3139(var67, var63.field3057, var68);
                                    }
                                    int var69 = 0;
                                    if (var65 != -2) {
                                        var69 = class85.field1437[method1173(var65, 96)];
                                    }
                                    if (var63.field3051 != -1) {
                                        int var70 = field102 + var63.field3055 & 0xFF;
                                        int var71 = field103 + var63.field3053;
                                        if (var71 < 0) {
                                            var71 = 0;
                                        } else if (var71 > 255) {
                                            var71 = 255;
                                        }
                                        int var72 = method3139(var70, var63.field3056, var71);
                                        var69 = class85.field1437[method1173(var72, 96)];
                                    }
                                    arg0.method1684(var6, var21, var34, var61, var62, var64, var39, var40, var41, var42, method2519(var47, var43), method2519(var47, var44), method2519(var47, var45), method2519(var47, var46), method1173(var66, var43), method1173(var66, var44), method1173(var66, var45), method1173(var66, var46), var60, var69);
                                }
                            }
                        }
                    }
                }
            }
            for (int var73 = 1; var73 < 103; var73++) {
                for (int var74 = 1; var74 < 103; var74++) {
                    int var79;
                    if ((field88[var6][var74][var73] & 0x8) != 0) {
                        var79 = 0;
                    } else if (var6 <= 0 || (field88[1][var74][var73] & 0x2) == 0) {
                        var79 = var6;
                    } else {
                        var79 = var6 - 1;
                    }
                    arg0.method1683(var6, var74, var73, var79);
                }
            }
            Statics.field90[var6] = (byte[][]) null;
            Statics.field108[var6] = (byte[][]) null;
            Statics.field92[var6] = (byte[][]) null;
            Statics.field93[var6] = (byte[][]) null;
            Statics.field885[var6] = (byte[][]) null;
        }
        arg0.method1710(-50, -10, -50);
        for (int var80 = 0; var80 < 104; var80++) {
            for (int var81 = 0; var81 < 104; var81++) {
                if ((field88[1][var80][var81] & 0x2) == 2) {
                    arg0.method1743(var80, var81);
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
                        if ((Statics.field2028[var86][var88][var87] & var82) != 0) {
                            int var89 = var87;
                            int var90 = var87;
                            int var91 = var86;
                            int var92 = var86;
                            while (var89 > 0 && (Statics.field2028[var86][var88][var89 - 1] & var82) != 0) {
                                var89--;
                            }
                            while (var90 < 104 && (Statics.field2028[var86][var88][var90 + 1] & var82) != 0) {
                                var90++;
                            }
                            label352: while (var91 > 0) {
                                for (int var93 = var89; var93 <= var90; var93++) {
                                    if ((Statics.field2028[var91 - 1][var88][var93] & var82) == 0) {
                                        break label352;
                                    }
                                }
                                var91--;
                            }
                            label341: while (var92 < var85) {
                                for (int var94 = var89; var94 <= var90; var94++) {
                                    if ((Statics.field2028[var92 + 1][var88][var94] & var82) == 0) {
                                        break label341;
                                    }
                                }
                                var92++;
                            }
                            int var95 = (var92 + 1 - var91) * (var90 - var89 + 1);
                            if (var95 >= 8) {
                                short var96 = 240;
                                int var97 = field99[var92][var88][var89] - var96;
                                int var98 = field99[var91][var88][var89];
                                class88.method1682(var85, 1, var88 * 128, var88 * 128, var89 * 128, var90 * 128 + 128, var97, var98);
                                for (int var99 = var91; var99 <= var92; var99++) {
                                    for (int var100 = var89; var100 <= var90; var100++) {
                                        Statics.field2028[var99][var88][var100] &= ~var82;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2028[var86][var88][var87] & var83) != 0) {
                            int var101 = var88;
                            int var102 = var88;
                            int var103 = var86;
                            int var104 = var86;
                            while (var101 > 0 && (Statics.field2028[var86][var101 - 1][var87] & var83) != 0) {
                                var101--;
                            }
                            while (var102 < 104 && (Statics.field2028[var86][var102 + 1][var87] & var83) != 0) {
                                var102++;
                            }
                            label405: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((Statics.field2028[var103 - 1][var105][var87] & var83) == 0) {
                                        break label405;
                                    }
                                }
                                var103--;
                            }
                            label394: while (var104 < var85) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((Statics.field2028[var104 + 1][var106][var87] & var83) == 0) {
                                        break label394;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = field99[var104][var101][var87] - var108;
                                int var110 = field99[var103][var101][var87];
                                class88.method1682(var85, 2, var101 * 128, var102 * 128 + 128, var87 * 128, var87 * 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        Statics.field2028[var111][var112][var87] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2028[var86][var88][var87] & var84) != 0) {
                            int var113 = var88;
                            int var114 = var88;
                            int var115 = var87;
                            int var116 = var87;
                            while (var115 > 0 && (Statics.field2028[var86][var88][var115 - 1] & var84) != 0) {
                                var115--;
                            }
                            while (var116 < 104 && (Statics.field2028[var86][var88][var116 + 1] & var84) != 0) {
                                var116++;
                            }
                            label458: while (var113 > 0) {
                                for (int var117 = var115; var117 <= var116; var117++) {
                                    if ((Statics.field2028[var86][var113 - 1][var117] & var84) == 0) {
                                        break label458;
                                    }
                                }
                                var113--;
                            }
                            label447: while (var114 < 104) {
                                for (int var118 = var115; var118 <= var116; var118++) {
                                    if ((Statics.field2028[var86][var114 + 1][var118] & var84) == 0) {
                                        break label447;
                                    }
                                }
                                var114++;
                            }
                            if ((var114 - var113 + 1) * (var116 - var115 + 1) >= 4) {
                                int var119 = field99[var86][var113][var115];
                                class88.method1682(var85, 4, var113 * 128, var114 * 128 + 128, var115 * 128, var116 * 128 + 128, var119, var119);
                                for (int var120 = var113; var120 <= var114; var120++) {
                                    for (int var121 = var115; var121 <= var116; var121++) {
                                        Statics.field2028[var86][var120][var121] &= ~var84;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fg.o(IIII)I")
    public static final int method3143(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1524(var3, var5);
        int var8 = method1524(var3 + 1, var5);
        int var9 = method1524(var3, var5 + 1);
        int var10 = method1524(var3 + 1, var5 + 1);
        int var11 = method220(var7, var8, var4, arg2);
        int var12 = method220(var9, var10, var4, arg2);
        return method220(var11, var12, var6, arg2);
    }

    @ObfuscatedName("e.y(IIIII)I")
    public static final int method220(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1433[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("cm.w(IIB)I")
    public static final int method1524(int arg0, int arg1) {
        int var2 = method2642(arg0 - 1, arg1 - 1) + method2642(arg0 + 1, arg1 - 1) + method2642(arg0 - 1, arg1 + 1) + method2642(arg0 + 1, arg1 + 1);
        int var3 = method2642(arg0 - 1, arg1) + method2642(arg0 + 1, arg1) + method2642(arg0, arg1 - 1) + method2642(arg0, arg1 + 1);
        int var4 = method2642(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ei.m(IIB)I")
    public static final int method2642(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ea.u(IIB)I")
    public static final int method2519(int arg0, int arg1) {
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

    @ObfuscatedName("be.q(III)I")
    public static final int method1173(int arg0, int arg1) {
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

    @ObfuscatedName("fz.c(IIII)I")
    public static final int method3139(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("cx.v(IIIIIIILcn;Ldr;B)V")
    public static final void method1908(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class88 arg7, class118 arg8) {
        class198 var9 = class198.method3471(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field2914;
            var11 = var9.field2913;
        } else {
            var10 = var9.field2913;
            var11 = var9.field2914;
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
        int[][] var16 = field99[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field2923 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field2944 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class90 var22;
            if (var9.field2921 == -1 && var9.field2939 == null) {
                var22 = var9.method3501(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class50(arg4, 22, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1685(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field2915 == 1) {
                arg8.method2176(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class90 var45;
            if (var9.field2921 == -1 && var9.field2939 == null) {
                var45 = var9.method3501(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class50(arg4, 10, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            if (var45 != null) {
                arg7.method1689(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field2915 != 0) {
                arg8.method2174(arg2, arg3, var10, var11, var9.field2916);
            }
        } else if (arg6 >= 12) {
            class90 var23;
            if (var9.field2921 == -1 && var9.field2939 == null) {
                var23 = var9.method3501(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class50(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1689(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field2915 != 0) {
                arg8.method2174(arg2, arg3, var10, var11, var9.field2916);
            }
        } else if (arg6 == 0) {
            class90 var24;
            if (var9.field2921 == -1 && var9.field2939 == null) {
                var24 = var9.method3501(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class50(arg4, 0, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1804(arg0, arg2, arg3, var17, var24, (class90) null, field89[arg5], 0, var20, var21);
            if (var9.field2915 != 0) {
                arg8.method2173(arg2, arg3, arg6, arg5, var9.field2916);
            }
        } else if (arg6 == 1) {
            class90 var25;
            if (var9.field2921 == -1 && var9.field2939 == null) {
                var25 = var9.method3501(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class50(arg4, 1, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1804(arg0, arg2, arg3, var17, var25, (class90) null, field97[arg5], 0, var20, var21);
            if (var9.field2915 != 0) {
                arg8.method2173(arg2, arg3, arg6, arg5, var9.field2916);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class90 var27;
            class90 var28;
            if (var9.field2921 == -1 && var9.field2939 == null) {
                var27 = var9.method3501(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method3501(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class50(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field2921, true, (class90) null);
                var28 = new class50(arg4, 2, var26, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1804(arg0, arg2, arg3, var17, var27, var28, field89[arg5], field89[var26], var20, var21);
            if (var9.field2915 != 0) {
                arg8.method2173(arg2, arg3, arg6, arg5, var9.field2916);
            }
        } else if (arg6 == 3) {
            class90 var29;
            if (var9.field2921 == -1 && var9.field2939 == null) {
                var29 = var9.method3501(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class50(arg4, 3, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1804(arg0, arg2, arg3, var17, var29, (class90) null, field97[arg5], 0, var20, var21);
            if (var9.field2915 != 0) {
                arg8.method2173(arg2, arg3, arg6, arg5, var9.field2916);
            }
        } else if (arg6 == 9) {
            class90 var30;
            if (var9.field2921 == -1 && var9.field2939 == null) {
                var30 = var9.method3501(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class50(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1689(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field2915 != 0) {
                arg8.method2174(arg2, arg3, var10, var11, var9.field2916);
            }
        } else if (arg6 == 4) {
            class90 var31;
            if (var9.field2921 == -1 && var9.field2939 == null) {
                var31 = var9.method3501(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class50(arg4, 4, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1688(arg0, arg2, arg3, var17, var31, (class90) null, field89[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1748(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class198.method3471(var33 >> 14 & 0x7FFF).field2925;
            }
            class90 var34;
            if (var9.field2921 == -1 && var9.field2939 == null) {
                var34 = var9.method3501(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class50(arg4, 4, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1688(arg0, arg2, arg3, var17, var34, (class90) null, field89[arg5], 0, field91[arg5] * var32, field100[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1748(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class198.method3471(var36 >> 14 & 0x7FFF).field2925 / 2;
            }
            class90 var37;
            if (var9.field2921 == -1 && var9.field2939 == null) {
                var37 = var9.method3501(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class50(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1688(arg0, arg2, arg3, var17, var37, (class90) null, 256, arg5, field98[arg5] * var35, field101[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class90 var39;
            if (var9.field2921 == -1 && var9.field2939 == null) {
                var39 = var9.method3501(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class50(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1688(arg0, arg2, arg3, var17, var39, (class90) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1748(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class198.method3471(var41 >> 14 & 0x7FFF).field2925 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class90 var43;
            class90 var44;
            if (var9.field2921 == -1 && var9.field2939 == null) {
                var43 = var9.method3501(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method3501(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class50(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2921, true, (class90) null);
                var44 = new class50(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1688(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field98[arg5] * var40, field101[arg5] * var40, var20, var21);
        }
    }
}
