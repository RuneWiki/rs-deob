package deob;

@ObfuscatedName("s")
public final class class11 {

    @ObfuscatedName("s.x")
    public static int[][][] field87 = new int[4][105][105];

    @ObfuscatedName("s.n")
    public static byte[][][] field81 = new byte[4][104][104];

    @ObfuscatedName("s.g")
    public static int field83 = 99;

    @ObfuscatedName("s.l")
    public static final int[] field86 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("s.r")
    public static final int[] field80 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("s.u")
    public static final int[] field82 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("s.e")
    public static final int[] field89 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("s.h")
    public static final int[] field94 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("s.d")
    public static final int[] field91 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("s.z")
    public static int field92 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("s.t")
    public static int field93 = (int) (Math.random() * 33.0D) - 16;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.x(B)V")
    public static void method1209() {
        field83 = 99;
        Statics.field3080 = new byte[4][104][104];
        Statics.field88 = new byte[4][104][104];
        Statics.field19 = new byte[4][104][104];
        Statics.field43 = new byte[4][104][104];
        Statics.field2123 = new int[4][105][105];
        Statics.field84 = new byte[4][105][105];
        Statics.field231 = new int[105][105];
        Statics.field90 = new int[104];
        Statics.field57 = new int[104];
        Statics.field1128 = new int[104];
        Statics.field2702 = new int[104];
        Statics.field62 = new int[104];
    }

    @ObfuscatedName("av.n(I)V")
    public static void method863() {
        Statics.field3080 = (byte[][][]) null;
        Statics.field88 = (byte[][][]) null;
        Statics.field19 = (byte[][][]) null;
        Statics.field43 = (byte[][][]) null;
        Statics.field2123 = (int[][][]) null;
        Statics.field84 = (byte[][][]) null;
        Statics.field231 = (int[][]) null;
        Statics.field90 = null;
        Statics.field57 = null;
        Statics.field1128 = null;
        Statics.field2702 = null;
        Statics.field62 = null;
    }

    @ObfuscatedName("k.g(IIIIB)V")
    public static final void method165(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field84[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field87[0][var5][var4] = field87[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field87[0][var5][var4] = field87[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field87[0][var5][var4] = field87[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field87[0][var5][var4] = field87[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("el.v(IIIB)V")
    public static final void method2925(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field87[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field87[arg0][arg1][arg2 + var5] = field87[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field87[arg0][arg1 + var6][arg2] = field87[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field87[arg0][arg1 - 1][arg2] != 0) {
            field87[arg0][arg1][arg2] = field87[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field87[arg0][arg1][arg2 - 1] != 0) {
            field87[arg0][arg1][arg2] = field87[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field87[arg0][arg1 - 1][arg2 - 1] != 0) {
            field87[arg0][arg1][arg2] = field87[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("n.y(Leq;IIIIIIB)V")
    public static final void method22(class154 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2878();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2878();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2878();
                }
            }
            return;
        }
        field81[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2878();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field87[0][arg2][arg3] = -method817(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field87[arg1][arg2][arg3] = field87[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2878();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field87[0][arg2][arg3] = -var8 * 8;
                } else {
                    field87[arg1][arg2][arg3] = field87[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field88[arg1][arg2][arg3] = arg0.method2788();
                Statics.field19[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field43[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field81[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field3080[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("cd.p([BIIS)Z")
    public static final boolean method1943(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class154 var4 = new class154(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2854();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2854();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2878() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class198 var16 = Statics.method935(var5);
                        if (var13 != 22 || !client.field291 || var16.field2918 != 0 || var16.field2916 == 1 || var16.field2944) {
                            if (!var16.method3492()) {
                                client.field353++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2854();
                if (var9 == 0) {
                    break;
                }
                var4.method2878();
            }
        }
    }

    @ObfuscatedName("f.j(IIIIIILcc;Ldd;I)V")
    public static final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, class118 arg7) {
        if (client.field291 && (field81[0][arg1][arg2] & 0x2) == 0 && (field81[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field83) {
            field83 = arg0;
        }
        class198 var8 = Statics.method935(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2933;
            var10 = var8.field2914;
        } else {
            var9 = var8.field2914;
            var10 = var8.field2933;
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
        int[][] var15 = field87[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field2918 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field2939 == 1) {
            var20 += 256;
        }
        if (var8.method3465()) {
            class32.method620(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field291 || var8.field2918 != 0 || var8.field2916 == 1 || var8.field2944) {
                class90 var21;
                if (var8.field2921 == -1 && var8.field2940 == null) {
                    var21 = var8.method3454(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class50(arg3, 22, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
                }
                arg6.method1718(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field2916 == 1 && arg7 != null) {
                    arg7.method2200(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class90 var44;
            if (var8.field2921 == -1 && var8.field2940 == null) {
                var44 = var8.method3454(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class50(arg3, 10, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            if (var44 != null && arg6.method1750(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field2906) {
                int var45 = 15;
                if (var44 instanceof class83) {
                    var45 = ((class83) var44).method1573() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field84[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field84[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field2916 != 0 && arg7 != null) {
                arg7.method2211(arg1, arg2, var9, var10, var8.field2937);
            }
        } else if (arg5 >= 12) {
            class90 var22;
            if (var8.field2921 == -1 && var8.field2940 == null) {
                var22 = var8.method3454(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1750(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2123[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2916 != 0 && arg7 != null) {
                arg7.method2211(arg1, arg2, var9, var10, var8.field2937);
            }
        } else if (arg5 == 0) {
            class90 var23;
            if (var8.field2921 == -1 && var8.field2940 == null) {
                var23 = var8.method3454(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class50(arg3, 0, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1821(arg0, arg1, arg2, var16, var23, (class90) null, field86[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field2906) {
                    Statics.field84[arg0][arg1][arg2] = 50;
                    Statics.field84[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2915) {
                    Statics.field2123[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2906) {
                    Statics.field84[arg0][arg1][arg2 + 1] = 50;
                    Statics.field84[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2915) {
                    Statics.field2123[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2906) {
                    Statics.field84[arg0][arg1 + 1][arg2] = 50;
                    Statics.field84[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2915) {
                    Statics.field2123[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2906) {
                    Statics.field84[arg0][arg1][arg2] = 50;
                    Statics.field84[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2915) {
                    Statics.field2123[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2916 != 0 && arg7 != null) {
                arg7.method2197(arg1, arg2, arg5, arg4, var8.field2937);
            }
            if (var8.field2923 != 16) {
                arg6.method1728(arg0, arg1, arg2, var8.field2923);
            }
        } else if (arg5 == 1) {
            class90 var24;
            if (var8.field2921 == -1 && var8.field2940 == null) {
                var24 = var8.method3454(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class50(arg3, 1, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1821(arg0, arg1, arg2, var16, var24, (class90) null, field80[arg4], 0, var19, var20);
            if (var8.field2906) {
                if (arg4 == 0) {
                    Statics.field84[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field84[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field84[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field84[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2916 != 0 && arg7 != null) {
                arg7.method2197(arg1, arg2, arg5, arg4, var8.field2937);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class90 var26;
            class90 var27;
            if (var8.field2921 == -1 && var8.field2940 == null) {
                var26 = var8.method3454(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method3454(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class50(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
                var27 = new class50(arg3, 2, var25, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1821(arg0, arg1, arg2, var16, var26, var27, field86[arg4], field86[var25], var19, var20);
            if (var8.field2915) {
                if (arg4 == 0) {
                    Statics.field2123[arg0][arg1][arg2] |= 0x249;
                    Statics.field2123[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2123[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2123[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2123[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2123[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2123[arg0][arg1][arg2] |= 0x492;
                    Statics.field2123[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2916 != 0 && arg7 != null) {
                arg7.method2197(arg1, arg2, arg5, arg4, var8.field2937);
            }
            if (var8.field2923 != 16) {
                arg6.method1728(arg0, arg1, arg2, var8.field2923);
            }
        } else if (arg5 == 3) {
            class90 var28;
            if (var8.field2921 == -1 && var8.field2940 == null) {
                var28 = var8.method3454(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class50(arg3, 3, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1821(arg0, arg1, arg2, var16, var28, (class90) null, field80[arg4], 0, var19, var20);
            if (var8.field2906) {
                if (arg4 == 0) {
                    Statics.field84[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field84[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field84[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field84[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2916 != 0 && arg7 != null) {
                arg7.method2197(arg1, arg2, arg5, arg4, var8.field2937);
            }
        } else if (arg5 == 9) {
            class90 var29;
            if (var8.field2921 == -1 && var8.field2940 == null) {
                var29 = var8.method3454(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1750(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field2916 != 0 && arg7 != null) {
                arg7.method2211(arg1, arg2, var9, var10, var8.field2937);
            }
            if (var8.field2923 != 16) {
                arg6.method1728(arg0, arg1, arg2, var8.field2923);
            }
        } else if (arg5 == 4) {
            class90 var30;
            if (var8.field2921 == -1 && var8.field2940 == null) {
                var30 = var8.method3454(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1721(arg0, arg1, arg2, var16, var30, (class90) null, field86[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1737(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = Statics.method935(var32 >> 14 & 0x7FFF).field2923;
            }
            class90 var33;
            if (var8.field2921 == -1 && var8.field2940 == null) {
                var33 = var8.method3454(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1721(arg0, arg1, arg2, var16, var33, (class90) null, field86[arg4], 0, field82[arg4] * var31, field89[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1737(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = Statics.method935(var35 >> 14 & 0x7FFF).field2923 / 2;
            }
            class90 var36;
            if (var8.field2921 == -1 && var8.field2940 == null) {
                var36 = var8.method3454(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1721(arg0, arg1, arg2, var16, var36, (class90) null, 256, arg4, field94[arg4] * var34, field91[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class90 var38;
            if (var8.field2921 == -1 && var8.field2940 == null) {
                var38 = var8.method3454(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class50(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1721(arg0, arg1, arg2, var16, var38, (class90) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1737(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = Statics.method935(var40 >> 14 & 0x7FFF).field2923 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class90 var42;
            class90 var43;
            if (var8.field2921 == -1 && var8.field2940 == null) {
                var42 = var8.method3454(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method3454(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
                var43 = new class50(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field2921, true, (class90) null);
            }
            arg6.method1721(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field94[arg4] * var39, field91[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("aj.k(III)I")
    public static final int method817(int arg0, int arg1) {
        int var2 = method35(arg0 + 45365, arg1 + 91923, 4) - 128 + (method35(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method35(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("g.f(IIIB)I")
    public static final int method35(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3317(var3, var5);
        int var8 = method3317(var3 + 1, var5);
        int var9 = method3317(var3, var5 + 1);
        int var10 = method3317(var3 + 1, var5 + 1);
        int var11 = 65536 - class85.field1447[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class85.field1447[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class85.field1447[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ga.o(III)I")
    public static final int method3317(int arg0, int arg1) {
        int var2 = method1891(arg0 - 1, arg1 - 1) + method1891(arg0 + 1, arg1 - 1) + method1891(arg0 - 1, arg1 + 1) + method1891(arg0 + 1, arg1 + 1);
        int var3 = method1891(arg0 - 1, arg1) + method1891(arg0 + 1, arg1) + method1891(arg0, arg1 - 1) + method1891(arg0, arg1 + 1);
        int var4 = method1891(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("cq.q(IIB)I")
    public static final int method1891(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cp.c(III)I")
    public static final int method1710(int arg0, int arg1) {
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

    @ObfuscatedName("j.b(IIB)I")
    public static final int method87(int arg0, int arg1) {
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

    @ObfuscatedName("el.w(IIII)I")
    public static final int method2924(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("z.l(III)Z")
    public static final boolean method262(int arg0, int arg1) {
        class198 var2 = Statics.method935(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3455(arg1);
    }

    @ObfuscatedName("cb.r(IIIIIIILcc;Ldd;I)V")
    public static final void method1896(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class88 arg7, class118 arg8) {
        class198 var9 = Statics.method935(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field2933;
            var11 = var9.field2914;
        } else {
            var10 = var9.field2914;
            var11 = var9.field2933;
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
        int[][] var16 = field87[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field2918 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field2939 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class90 var22;
            if (var9.field2921 == -1 && var9.field2940 == null) {
                var22 = var9.method3483(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class50(arg4, 22, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1718(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field2916 == 1) {
                arg8.method2200(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class90 var45;
            if (var9.field2921 == -1 && var9.field2940 == null) {
                var45 = var9.method3483(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class50(arg4, 10, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            if (var45 != null) {
                arg7.method1750(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field2916 != 0) {
                arg8.method2211(arg2, arg3, var10, var11, var9.field2937);
            }
        } else if (arg6 >= 12) {
            class90 var23;
            if (var9.field2921 == -1 && var9.field2940 == null) {
                var23 = var9.method3483(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class50(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1750(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field2916 != 0) {
                arg8.method2211(arg2, arg3, var10, var11, var9.field2937);
            }
        } else if (arg6 == 0) {
            class90 var24;
            if (var9.field2921 == -1 && var9.field2940 == null) {
                var24 = var9.method3483(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class50(arg4, 0, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1821(arg0, arg2, arg3, var17, var24, (class90) null, field86[arg5], 0, var20, var21);
            if (var9.field2916 != 0) {
                arg8.method2197(arg2, arg3, arg6, arg5, var9.field2937);
            }
        } else if (arg6 == 1) {
            class90 var25;
            if (var9.field2921 == -1 && var9.field2940 == null) {
                var25 = var9.method3483(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class50(arg4, 1, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1821(arg0, arg2, arg3, var17, var25, (class90) null, field80[arg5], 0, var20, var21);
            if (var9.field2916 != 0) {
                arg8.method2197(arg2, arg3, arg6, arg5, var9.field2937);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class90 var27;
            class90 var28;
            if (var9.field2921 == -1 && var9.field2940 == null) {
                var27 = var9.method3483(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method3483(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class50(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field2921, true, (class90) null);
                var28 = new class50(arg4, 2, var26, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1821(arg0, arg2, arg3, var17, var27, var28, field86[arg5], field86[var26], var20, var21);
            if (var9.field2916 != 0) {
                arg8.method2197(arg2, arg3, arg6, arg5, var9.field2937);
            }
        } else if (arg6 == 3) {
            class90 var29;
            if (var9.field2921 == -1 && var9.field2940 == null) {
                var29 = var9.method3483(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class50(arg4, 3, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1821(arg0, arg2, arg3, var17, var29, (class90) null, field80[arg5], 0, var20, var21);
            if (var9.field2916 != 0) {
                arg8.method2197(arg2, arg3, arg6, arg5, var9.field2937);
            }
        } else if (arg6 == 9) {
            class90 var30;
            if (var9.field2921 == -1 && var9.field2940 == null) {
                var30 = var9.method3483(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class50(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1750(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field2916 != 0) {
                arg8.method2211(arg2, arg3, var10, var11, var9.field2937);
            }
        } else if (arg6 == 4) {
            class90 var31;
            if (var9.field2921 == -1 && var9.field2940 == null) {
                var31 = var9.method3483(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class50(arg4, 4, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1721(arg0, arg2, arg3, var17, var31, (class90) null, field86[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1737(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = Statics.method935(var33 >> 14 & 0x7FFF).field2923;
            }
            class90 var34;
            if (var9.field2921 == -1 && var9.field2940 == null) {
                var34 = var9.method3483(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class50(arg4, 4, arg5, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1721(arg0, arg2, arg3, var17, var34, (class90) null, field86[arg5], 0, field82[arg5] * var32, field89[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1737(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = Statics.method935(var36 >> 14 & 0x7FFF).field2923 / 2;
            }
            class90 var37;
            if (var9.field2921 == -1 && var9.field2940 == null) {
                var37 = var9.method3483(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class50(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1721(arg0, arg2, arg3, var17, var37, (class90) null, 256, arg5, field94[arg5] * var35, field91[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class90 var39;
            if (var9.field2921 == -1 && var9.field2940 == null) {
                var39 = var9.method3483(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class50(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1721(arg0, arg2, arg3, var17, var39, (class90) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1737(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = Statics.method935(var41 >> 14 & 0x7FFF).field2923 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class90 var43;
            class90 var44;
            if (var9.field2921 == -1 && var9.field2940 == null) {
                var43 = var9.method3483(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method3483(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class50(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2921, true, (class90) null);
                var44 = new class50(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field2921, true, (class90) null);
            }
            arg7.method1721(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field94[arg5] * var40, field91[arg5] * var40, var20, var21);
        }
    }
}
