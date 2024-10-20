package deob;

@ObfuscatedName("c")
public final class class11 {

    @ObfuscatedName("c.p")
    public static int[][][] field94 = new int[4][105][105];

    @ObfuscatedName("c.g")
    public static byte[][][] field87 = new byte[4][104][104];

    @ObfuscatedName("c.x")
    public static int field88 = 99;

    @ObfuscatedName("c.w")
    public static final int[] field92 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("c.y")
    public static final int[] field93 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("c.v")
    public static final int[] field96 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("c.f")
    public static final int[] field95 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("c.l")
    public static final int[] field86 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("c.t")
    public static final int[] field97 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("c.b")
    public static int field98 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("c.e")
    public static int field91 = (int) (Math.random() * 33.0D) - 16;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gl.p(I)V")
    public static void method3236() {
        Statics.field90 = (byte[][][]) null;
        Statics.field99 = (byte[][][]) null;
        Statics.field812 = (byte[][][]) null;
        Statics.field1080 = (byte[][][]) null;
        Statics.field1910 = (int[][][]) null;
        Statics.field932 = (byte[][][]) null;
        Statics.field101 = (int[][]) null;
        Statics.field2783 = null;
        Statics.field2164 = null;
        Statics.field748 = null;
        Statics.field760 = null;
        Statics.field582 = null;
    }

    @ObfuscatedName("fu.g(IIIII)V")
    public static final void method3012(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field932[0][var5][var4] = 127;
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

    @ObfuscatedName("v.x([BIIII[Ldt;B)V")
    public static final void method199(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class118[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1840[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class154 var9 = new class154(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method189(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("gb.q([BIIIIIII[Ldt;B)V")
    public static final void method3275(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1840[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class154 var11 = new class154(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method189(var11, arg1, arg2 + class169.method2023(var13 & 0x7, var14 & 0x7, arg7), arg3 + class169.method802(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method189(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.d(Lev;IIIIIII)V")
    public static final void method189(class154 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2593();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2593();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2593();
                }
            }
            return;
        }
        field87[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2593();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field94[0][arg2][arg3] = -method688(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field94[arg1][arg2][arg3] = field94[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2593();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field94[0][arg2][arg3] = -var8 * 8;
                } else {
                    field94[arg1][arg2][arg3] = field94[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field99[arg1][arg2][arg3] = arg0.method2631();
                Statics.field812[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1080[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field87[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field90[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("fi.k([BIIIIIIILcb;[Ldt;I)V")
    public static final void method3010(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class88 arg8, class118[] arg9) {
        class154 var10 = new class154(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2758();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2758();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2593();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class198 var21 = class198.method3716(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field2917;
                    int var27 = var21.field2906;
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
                    int var33 = var16 & 0x7;
                    int var34 = var15 & 0x7;
                    int var36 = var21.field2917;
                    int var37 = var21.field2906;
                    if ((var20 & 0x1) == 1) {
                        int var38 = var36;
                        var36 = var37;
                        var37 = var38;
                    }
                    int var39 = arg7 & 0x3;
                    int var40;
                    if (var39 == 0) {
                        var40 = var34;
                    } else if (var39 == 1) {
                        var40 = 7 - var33 - (var36 - 1);
                    } else if (var39 == 2) {
                        var40 = 7 - var34 - (var37 - 1);
                    } else {
                        var40 = var33;
                    }
                    int var41 = arg3 + var40;
                    if (var31 > 0 && var41 > 0 && var31 < 103 && var41 < 103) {
                        int var42 = arg1;
                        if ((field87[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class118 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method119(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.j(IIIIIILcb;Ldt;I)V")
    public static final void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, class118 arg7) {
        if (client.field284 && (field87[0][arg1][arg2] & 0x2) == 0 && (field87[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field88) {
            field88 = arg0;
        }
        class198 var8 = class198.method3716(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2906;
            var10 = var8.field2917;
        } else {
            var9 = var8.field2917;
            var10 = var8.field2906;
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
        if (var8.field2909 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field2930 == 1) {
            var20 += 256;
        }
        if (var8.method3391()) {
            class32 var21 = new class32();
            var21.field708 = arg0;
            var21.field697 = arg1 * 128;
            var21.field698 = arg2 * 128;
            int var22 = var8.field2917;
            int var23 = var8.field2906;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field2906;
                var23 = var8.field2917;
            }
            var21.field699 = (arg1 + var22) * 128;
            var21.field700 = (arg2 + var23) * 128;
            var21.field705 = var8.field2934;
            var21.field710 = var8.field2911 * 128;
            var21.field704 = var8.field2889;
            var21.field696 = var8.field2912;
            var21.field701 = var8.field2938;
            if (var8.field2896 != null) {
                var21.field709 = var8;
                var21.method661();
            }
            class32.field712.method2232(var21);
            if (var21.field701 != null) {
                var21.field702 = var21.field704 + (int) (Math.random() * (double) (var21.field696 - var21.field704));
            }
        }
        if (arg5 == 22) {
            if (!client.field284 || var8.field2909 != 0 || var8.field2907 == 1 || var8.field2928) {
                class90 var24;
                if (var8.field2913 == -1 && var8.field2896 == null) {
                    var24 = var8.method3392(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class50(arg3, 22, arg4, arg0, arg1, arg2, var8.field2913, true, (class90) null);
                }
                arg6.method1607(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field2907 == 1 && arg7 != null) {
                    arg7.method2085(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class90 var47;
            if (var8.field2913 == -1 && var8.field2896 == null) {
                var47 = var8.method3392(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class50(arg3, 10, arg4, arg0, arg1, arg2, var8.field2913, true, (class90) null);
            }
            if (var47 != null && arg6.method1611(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field2921) {
                int var48 = 15;
                if (var47 instanceof class83) {
                    var48 = ((class83) var47).method1462() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field932[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field932[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field2907 != 0 && arg7 != null) {
                arg7.method2083(arg1, arg2, var9, var10, var8.field2935);
            }
        } else if (arg5 >= 12) {
            class90 var25;
            if (var8.field2913 == -1 && var8.field2896 == null) {
                var25 = var8.method3392(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2913, true, (class90) null);
            }
            arg6.method1611(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1910[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2907 != 0 && arg7 != null) {
                arg7.method2083(arg1, arg2, var9, var10, var8.field2935);
            }
        } else if (arg5 == 0) {
            class90 var26;
            if (var8.field2913 == -1 && var8.field2896 == null) {
                var26 = var8.method3392(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class50(arg3, 0, arg4, arg0, arg1, arg2, var8.field2913, true, (class90) null);
            }
            arg6.method1769(arg0, arg1, arg2, var16, var26, (class90) null, field92[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field2921) {
                    Statics.field932[arg0][arg1][arg2] = 50;
                    Statics.field932[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2893) {
                    Statics.field1910[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2921) {
                    Statics.field932[arg0][arg1][arg2 + 1] = 50;
                    Statics.field932[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2893) {
                    Statics.field1910[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2921) {
                    Statics.field932[arg0][arg1 + 1][arg2] = 50;
                    Statics.field932[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2893) {
                    Statics.field1910[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2921) {
                    Statics.field932[arg0][arg1][arg2] = 50;
                    Statics.field932[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2893) {
                    Statics.field1910[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2907 != 0 && arg7 != null) {
                arg7.method2082(arg1, arg2, arg5, arg4, var8.field2935);
            }
            if (var8.field2936 != 16) {
                arg6.method1617(arg0, arg1, arg2, var8.field2936);
            }
        } else if (arg5 == 1) {
            class90 var27;
            if (var8.field2913 == -1 && var8.field2896 == null) {
                var27 = var8.method3392(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class50(arg3, 1, arg4, arg0, arg1, arg2, var8.field2913, true, (class90) null);
            }
            arg6.method1769(arg0, arg1, arg2, var16, var27, (class90) null, field93[arg4], 0, var19, var20);
            if (var8.field2921) {
                if (arg4 == 0) {
                    Statics.field932[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field932[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field932[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field932[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2907 != 0 && arg7 != null) {
                arg7.method2082(arg1, arg2, arg5, arg4, var8.field2935);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class90 var29;
            class90 var30;
            if (var8.field2913 == -1 && var8.field2896 == null) {
                var29 = var8.method3392(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method3392(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class50(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2913, true, (class90) null);
                var30 = new class50(arg3, 2, var28, arg0, arg1, arg2, var8.field2913, true, (class90) null);
            }
            arg6.method1769(arg0, arg1, arg2, var16, var29, var30, field92[arg4], field92[var28], var19, var20);
            if (var8.field2893) {
                if (arg4 == 0) {
                    Statics.field1910[arg0][arg1][arg2] |= 0x249;
                    Statics.field1910[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1910[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1910[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1910[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1910[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1910[arg0][arg1][arg2] |= 0x492;
                    Statics.field1910[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2907 != 0 && arg7 != null) {
                arg7.method2082(arg1, arg2, arg5, arg4, var8.field2935);
            }
            if (var8.field2936 != 16) {
                arg6.method1617(arg0, arg1, arg2, var8.field2936);
            }
        } else if (arg5 == 3) {
            class90 var31;
            if (var8.field2913 == -1 && var8.field2896 == null) {
                var31 = var8.method3392(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class50(arg3, 3, arg4, arg0, arg1, arg2, var8.field2913, true, (class90) null);
            }
            arg6.method1769(arg0, arg1, arg2, var16, var31, (class90) null, field93[arg4], 0, var19, var20);
            if (var8.field2921) {
                if (arg4 == 0) {
                    Statics.field932[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field932[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field932[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field932[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2907 != 0 && arg7 != null) {
                arg7.method2082(arg1, arg2, arg5, arg4, var8.field2935);
            }
        } else if (arg5 == 9) {
            class90 var32;
            if (var8.field2913 == -1 && var8.field2896 == null) {
                var32 = var8.method3392(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2913, true, (class90) null);
            }
            arg6.method1611(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field2907 != 0 && arg7 != null) {
                arg7.method2083(arg1, arg2, var9, var10, var8.field2935);
            }
            if (var8.field2936 != 16) {
                arg6.method1617(arg0, arg1, arg2, var8.field2936);
            }
        } else if (arg5 == 4) {
            class90 var33;
            if (var8.field2913 == -1 && var8.field2896 == null) {
                var33 = var8.method3392(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2913, true, (class90) null);
            }
            arg6.method1659(arg0, arg1, arg2, var16, var33, (class90) null, field92[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1680(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class198.method3716(var35 >> 14 & 0x7FFF).field2936;
            }
            class90 var36;
            if (var8.field2913 == -1 && var8.field2896 == null) {
                var36 = var8.method3392(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2913, true, (class90) null);
            }
            arg6.method1659(arg0, arg1, arg2, var16, var36, (class90) null, field92[arg4], 0, field96[arg4] * var34, field95[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1680(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class198.method3716(var38 >> 14 & 0x7FFF).field2936 / 2;
            }
            class90 var39;
            if (var8.field2913 == -1 && var8.field2896 == null) {
                var39 = var8.method3392(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2913, true, (class90) null);
            }
            arg6.method1659(arg0, arg1, arg2, var16, var39, (class90) null, 256, arg4, field86[arg4] * var37, field97[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class90 var41;
            if (var8.field2913 == -1 && var8.field2896 == null) {
                var41 = var8.method3392(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class50(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2913, true, (class90) null);
            }
            arg6.method1659(arg0, arg1, arg2, var16, var41, (class90) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1680(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class198.method3716(var43 >> 14 & 0x7FFF).field2936 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class90 var45;
            class90 var46;
            if (var8.field2913 == -1 && var8.field2896 == null) {
                var45 = var8.method3392(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method3392(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2913, true, (class90) null);
                var46 = new class50(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field2913, true, (class90) null);
            }
            arg6.method1659(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field86[arg4] * var42, field97[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("aw.s(III)I")
    public static final int method688(int arg0, int arg1) {
        int var2 = method214(arg0 + 45365, arg1 + 91923, 4) - 128 + (method214(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method214(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("l.o(IIII)I")
    public static final int method214(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method114(var3, var5);
        int var8 = method114(var3 + 1, var5);
        int var9 = method114(var3, var5 + 1);
        int var10 = method114(var3 + 1, var5 + 1);
        int var11 = Statics.method728(var7, var8, var4, arg2);
        int var12 = Statics.method728(var9, var10, var4, arg2);
        return Statics.method728(var11, var12, var6, arg2);
    }

    @ObfuscatedName("s.c(III)I")
    public static final int method114(int arg0, int arg1) {
        int var2 = method24(arg0 - 1, arg1 - 1) + method24(arg0 + 1, arg1 - 1) + method24(arg0 - 1, arg1 + 1) + method24(arg0 + 1, arg1 + 1);
        int var3 = method24(arg0 - 1, arg1) + method24(arg0 + 1, arg1) + method24(arg0, arg1 - 1) + method24(arg0, arg1 + 1);
        int var4 = method24(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("x.u(III)I")
    public static final int method24(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("h.i(IIB)I")
    public static final int method169(int arg0, int arg1) {
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

    @ObfuscatedName("fp.z(III)I")
    public static final int method2913(int arg0, int arg1) {
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

    @ObfuscatedName("u.n(IIIB)I")
    public static final int method181(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("l.w(IIB)Z")
    public static final boolean method208(int arg0, int arg1) {
        class198 var2 = class198.method3716(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3351(arg1);
    }
}
