package deob;

@ObfuscatedName("l")
public final class class12 {

    @ObfuscatedName("l.n")
    public static int[][][] field111 = new int[4][105][105];

    @ObfuscatedName("l.d")
    public static byte[][][] field104 = new byte[4][104][104];

    @ObfuscatedName("l.m")
    public static int field103 = 99;

    @ObfuscatedName("l.i")
    public static final int[] field109 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("l.a")
    public static final int[] field110 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("l.b")
    public static final int[] field118 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("l.j")
    public static final int[] field117 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("l.k")
    public static final int[] field113 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("l.v")
    public static final int[] field114 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("l.u")
    public static int field112 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("l.t")
    public static int field116 = (int) (Math.random() * 33.0D) - 16;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ai.n(B)V")
    public static void method672() {
        Statics.field106 = (byte[][][]) null;
        Statics.field107 = (byte[][][]) null;
        Statics.field798 = (byte[][][]) null;
        Statics.field108 = (byte[][][]) null;
        Statics.field2779 = (int[][][]) null;
        Statics.field52 = (byte[][][]) null;
        Statics.field934 = (int[][]) null;
        Statics.field2308 = null;
        Statics.field1729 = null;
        Statics.field3076 = null;
        Statics.field1180 = null;
        Statics.field3065 = null;
    }

    @ObfuscatedName("cw.d(IIIII)V")
    public static final void method1488(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field52[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field111[0][var5][var4] = field111[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field111[0][var5][var4] = field111[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field111[0][var5][var4] = field111[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field111[0][var5][var4] = field111[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("db.m([BIIIIIII[Lds;I)V")
    public static final void method2083(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1834[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class161 var11 = new class161(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class150.method1961(var13 & 0x7, var14 & 0x7, arg7);
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
                        method256(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method256(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.h(Lfa;IIIIIII)V")
    public static final void method256(class161 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2823();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2823();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2823();
                }
            }
            return;
        }
        field104[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2823();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field111[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method864(var10 + 45365, var11 + 91923, 4) - 128 + (method864(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method864(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field111[arg1][arg2][arg3] = field111[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2823();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field111[0][arg2][arg3] = -var15 * 8;
                } else {
                    field111[arg1][arg2][arg3] = field111[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field107[arg1][arg2][arg3] = arg0.method2837();
                Statics.field798[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field108[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field104[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field106[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("db.w([BIILcu;[Lds;I)V")
    public static final void method2082(byte[] arg0, int arg1, int arg2, class88 arg3, class118[] arg4) {
        class161 var5 = new class161(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2793();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2793();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2823();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field104[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class118 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2988(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("br.r([BIIIIIIILcu;[Lds;B)V")
    public static final void method1086(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class88 arg8, class118[] arg9) {
        class161 var10 = new class161(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2793();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2793();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2823();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class198 var21 = class198.method197(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field2904;
                    int var27 = var21.field2908;
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
                    int var32 = arg3 + class150.method1818(var16 & 0x7, var15 & 0x7, arg7, var21.field2904, var21.field2908, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field104[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class118 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method2988(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fi.c(IIIIIILcu;Lds;I)V")
    public static final void method2988(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, class118 arg7) {
        if (client.field289 && (field104[0][arg1][arg2] & 0x2) == 0 && (field104[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field103) {
            field103 = arg0;
        }
        class198 var8 = class198.method197(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2908;
            var10 = var8.field2904;
        } else {
            var9 = var8.field2904;
            var10 = var8.field2908;
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
        int[][] var15 = field111[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field2911 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field2932 == 1) {
            var20 += 256;
        }
        if (var8.method3416()) {
            class32.method194(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field289 || var8.field2911 != 0 || var8.field2909 == 1 || var8.field2930) {
                class90 var21;
                if (var8.field2915 == -1 && var8.field2918 == null) {
                    var21 = var8.method3411(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class50(arg3, 22, arg4, arg0, arg1, arg2, var8.field2915, true, (class90) null);
                }
                arg6.method1716(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field2909 == 1 && arg7 != null) {
                    arg7.method2136(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class90 var44;
            if (var8.field2915 == -1 && var8.field2918 == null) {
                var44 = var8.method3411(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class50(arg3, 10, arg4, arg0, arg1, arg2, var8.field2915, true, (class90) null);
            }
            if (var44 != null && arg6.method1660(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field2892) {
                int var45 = 15;
                if (var44 instanceof class83) {
                    var45 = ((class83) var44).method1519() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field52[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field52[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field2909 != 0 && arg7 != null) {
                arg7.method2163(arg1, arg2, var9, var10, var8.field2910);
            }
        } else if (arg5 >= 12) {
            class90 var22;
            if (var8.field2915 == -1 && var8.field2918 == null) {
                var22 = var8.method3411(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2915, true, (class90) null);
            }
            arg6.method1660(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2779[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2909 != 0 && arg7 != null) {
                arg7.method2163(arg1, arg2, var9, var10, var8.field2910);
            }
        } else if (arg5 == 0) {
            class90 var23;
            if (var8.field2915 == -1 && var8.field2918 == null) {
                var23 = var8.method3411(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class50(arg3, 0, arg4, arg0, arg1, arg2, var8.field2915, true, (class90) null);
            }
            arg6.method1658(arg0, arg1, arg2, var16, var23, (class90) null, field109[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field2892) {
                    Statics.field52[arg0][arg1][arg2] = 50;
                    Statics.field52[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2914) {
                    Statics.field2779[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2892) {
                    Statics.field52[arg0][arg1][arg2 + 1] = 50;
                    Statics.field52[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2914) {
                    Statics.field2779[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2892) {
                    Statics.field52[arg0][arg1 + 1][arg2] = 50;
                    Statics.field52[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2914) {
                    Statics.field2779[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2892) {
                    Statics.field52[arg0][arg1][arg2] = 50;
                    Statics.field52[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2914) {
                    Statics.field2779[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2909 != 0 && arg7 != null) {
                arg7.method2156(arg1, arg2, arg5, arg4, var8.field2910);
            }
            if (var8.field2916 != 16) {
                arg6.method1749(arg0, arg1, arg2, var8.field2916);
            }
        } else if (arg5 == 1) {
            class90 var24;
            if (var8.field2915 == -1 && var8.field2918 == null) {
                var24 = var8.method3411(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class50(arg3, 1, arg4, arg0, arg1, arg2, var8.field2915, true, (class90) null);
            }
            arg6.method1658(arg0, arg1, arg2, var16, var24, (class90) null, field110[arg4], 0, var19, var20);
            if (var8.field2892) {
                if (arg4 == 0) {
                    Statics.field52[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field52[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field52[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field52[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2909 != 0 && arg7 != null) {
                arg7.method2156(arg1, arg2, arg5, arg4, var8.field2910);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class90 var26;
            class90 var27;
            if (var8.field2915 == -1 && var8.field2918 == null) {
                var26 = var8.method3411(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method3411(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class50(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2915, true, (class90) null);
                var27 = new class50(arg3, 2, var25, arg0, arg1, arg2, var8.field2915, true, (class90) null);
            }
            arg6.method1658(arg0, arg1, arg2, var16, var26, var27, field109[arg4], field109[var25], var19, var20);
            if (var8.field2914) {
                if (arg4 == 0) {
                    Statics.field2779[arg0][arg1][arg2] |= 0x249;
                    Statics.field2779[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2779[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2779[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2779[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2779[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2779[arg0][arg1][arg2] |= 0x492;
                    Statics.field2779[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2909 != 0 && arg7 != null) {
                arg7.method2156(arg1, arg2, arg5, arg4, var8.field2910);
            }
            if (var8.field2916 != 16) {
                arg6.method1749(arg0, arg1, arg2, var8.field2916);
            }
        } else if (arg5 == 3) {
            class90 var28;
            if (var8.field2915 == -1 && var8.field2918 == null) {
                var28 = var8.method3411(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class50(arg3, 3, arg4, arg0, arg1, arg2, var8.field2915, true, (class90) null);
            }
            arg6.method1658(arg0, arg1, arg2, var16, var28, (class90) null, field110[arg4], 0, var19, var20);
            if (var8.field2892) {
                if (arg4 == 0) {
                    Statics.field52[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field52[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field52[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field52[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2909 != 0 && arg7 != null) {
                arg7.method2156(arg1, arg2, arg5, arg4, var8.field2910);
            }
        } else if (arg5 == 9) {
            class90 var29;
            if (var8.field2915 == -1 && var8.field2918 == null) {
                var29 = var8.method3411(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2915, true, (class90) null);
            }
            arg6.method1660(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field2909 != 0 && arg7 != null) {
                arg7.method2163(arg1, arg2, var9, var10, var8.field2910);
            }
            if (var8.field2916 != 16) {
                arg6.method1749(arg0, arg1, arg2, var8.field2916);
            }
        } else if (arg5 == 4) {
            class90 var30;
            if (var8.field2915 == -1 && var8.field2918 == null) {
                var30 = var8.method3411(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2915, true, (class90) null);
            }
            arg6.method1659(arg0, arg1, arg2, var16, var30, (class90) null, field109[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1676(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class198.method197(var32 >> 14 & 0x7FFF).field2916;
            }
            class90 var33;
            if (var8.field2915 == -1 && var8.field2918 == null) {
                var33 = var8.method3411(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2915, true, (class90) null);
            }
            arg6.method1659(arg0, arg1, arg2, var16, var33, (class90) null, field109[arg4], 0, field118[arg4] * var31, field117[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1676(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class198.method197(var35 >> 14 & 0x7FFF).field2916 / 2;
            }
            class90 var36;
            if (var8.field2915 == -1 && var8.field2918 == null) {
                var36 = var8.method3411(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2915, true, (class90) null);
            }
            arg6.method1659(arg0, arg1, arg2, var16, var36, (class90) null, 256, arg4, field113[arg4] * var34, field114[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class90 var38;
            if (var8.field2915 == -1 && var8.field2918 == null) {
                var38 = var8.method3411(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class50(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field2915, true, (class90) null);
            }
            arg6.method1659(arg0, arg1, arg2, var16, var38, (class90) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1676(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class198.method197(var40 >> 14 & 0x7FFF).field2916 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class90 var42;
            class90 var43;
            if (var8.field2915 == -1 && var8.field2918 == null) {
                var42 = var8.method3411(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method3411(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2915, true, (class90) null);
                var43 = new class50(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field2915, true, (class90) null);
            }
            arg6.method1659(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field113[arg4] * var39, field114[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("fn.z(Lcu;[Lds;B)V")
    public static final void method3083(class88 arg0, class118[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field104[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field104[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2135(var3, var4);
                        }
                    }
                }
            }
        }
        field112 += (int) (Math.random() * 5.0D) - 2;
        if (field112 < -8) {
            field112 = -8;
        }
        if (field112 > 8) {
            field112 = 8;
        }
        field116 += (int) (Math.random() * 5.0D) - 2;
        if (field116 < -16) {
            field116 = -16;
        }
        if (field116 > 16) {
            field116 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field52[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field111[var6][var11 + 1][var10] - field111[var6][var11 - 1][var10];
                    int var13 = field111[var6][var11][var10 + 1] - field111[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field934[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field2308[var20] = 0;
                Statics.field1729[var20] = 0;
                Statics.field3076[var20] = 0;
                Statics.field1180[var20] = 0;
                Statics.field3065[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field106[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class192 var26 = (class192) class192.field2812.method2221((long) var25);
                            class192 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field2813.method3093(1, var25);
                                class192 var29 = new class192();
                                if (var28 != null) {
                                    var29.method3285(new class161(var28), var25);
                                }
                                var29.method3292();
                                class192.field2812.method2219(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field2308[var22] += var27.field2815;
                            Statics.field1729[var22] += var27.field2816;
                            Statics.field3076[var22] += var27.field2817;
                            Statics.field1180[var22] += var27.field2818;
                            var10002 = Statics.field3065[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field106[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class192 var34 = (class192) class192.field2812.method2221((long) var33);
                            class192 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field2813.method3093(1, var33);
                                class192 var37 = new class192();
                                if (var36 != null) {
                                    var37.method3285(new class161(var36), var33);
                                }
                                var37.method3292();
                                class192.field2812.method2219(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field2308[var22] -= var35.field2815;
                            Statics.field1729[var22] -= var35.field2816;
                            Statics.field3076[var22] -= var35.field2817;
                            Statics.field1180[var22] -= var35.field2818;
                            var10002 = Statics.field3065[var22]--;
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
                            var39 += Statics.field2308[var45];
                            var40 += Statics.field1729[var45];
                            var41 += Statics.field3076[var45];
                            var42 += Statics.field1180[var45];
                            var43 += Statics.field3065[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field2308[var46];
                            var40 -= Statics.field1729[var46];
                            var41 -= Statics.field3076[var46];
                            var42 -= Statics.field1180[var46];
                            var43 -= Statics.field3065[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field289 || (field104[0][var21][var44] & 0x2) != 0 || (field104[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field103) {
                                field103 = var6;
                            }
                            int var47 = Statics.field106[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field107[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field111[var6][var21][var44];
                                int var50 = field111[var6][var21 + 1][var44];
                                int var51 = field111[var6][var21 + 1][var44 + 1];
                                int var52 = field111[var6][var21][var44 + 1];
                                int var53 = Statics.field934[var21][var44];
                                int var54 = Statics.field934[var21 + 1][var44];
                                int var55 = Statics.field934[var21 + 1][var44 + 1];
                                int var56 = Statics.field934[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method2746(var59, var60, var61);
                                    int var62 = field112 + var59 & 0xFF;
                                    int var63 = field116 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method2746(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field798[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0) {
                                        int var65 = var48 - 1;
                                        class201 var66 = (class201) class201.field3039.method2221((long) var65);
                                        class201 var67;
                                        if (var66 == null) {
                                            byte[] var68 = Statics.field3033.method3093(4, var65);
                                            class201 var69 = new class201();
                                            if (var68 != null) {
                                                var69.method3538(new class161(var68), var65);
                                            }
                                            var69.method3537();
                                            class201.field3039.method2219(var69, (long) var65);
                                            var67 = var69;
                                        } else {
                                            var67 = var66;
                                        }
                                        if (!var67.field3034) {
                                            var64 = false;
                                        }
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field2779[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var70 = 0;
                                if (var58 != -1) {
                                    var70 = class85.field1441[method767(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1779(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method767(var57, var53), method767(var57, var54), method767(var57, var55), method767(var57, var56), 0, 0, 0, 0, var70, 0);
                                } else {
                                    int var71 = Statics.field798[var6][var21][var44] + 1;
                                    byte var72 = Statics.field108[var6][var21][var44];
                                    int var73 = var48 - 1;
                                    class201 var74 = (class201) class201.field3039.method2221((long) var73);
                                    class201 var75;
                                    if (var74 == null) {
                                        byte[] var76 = Statics.field3033.method3093(4, var73);
                                        class201 var77 = new class201();
                                        if (var76 != null) {
                                            var77.method3538(new class161(var76), var73);
                                        }
                                        var77.method3537();
                                        class201.field3039.method2219(var77, (long) var73);
                                        var75 = var77;
                                    } else {
                                        var75 = var74;
                                    }
                                    int var79 = var75.field3040;
                                    int var80;
                                    int var81;
                                    if (var79 >= 0) {
                                        var80 = Statics.field1442.method1377(var79);
                                        var81 = -1;
                                    } else if (var75.field3031 == 16711935) {
                                        var81 = -2;
                                        var79 = -1;
                                        var80 = -2;
                                    } else {
                                        var81 = method2746(var75.field3036, var75.field3037, var75.field3038);
                                        int var82 = field112 + var75.field3036 & 0xFF;
                                        int var83 = field116 + var75.field3038;
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        var80 = method2746(var82, var75.field3037, var83);
                                    }
                                    int var84 = 0;
                                    if (var80 != -2) {
                                        var84 = class85.field1441[method2168(var80, 96)];
                                    }
                                    if (var75.field3035 != -1) {
                                        int var85 = field112 + var75.field3032 & 0xFF;
                                        int var86 = field116 + var75.field3041;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 255) {
                                            var86 = 255;
                                        }
                                        int var87 = method2746(var85, var75.field3030, var86);
                                        var84 = class85.field1441[method2168(var87, 96)];
                                    }
                                    arg0.method1779(var6, var21, var44, var71, var72, var79, var49, var50, var51, var52, method767(var57, var53), method767(var57, var54), method767(var57, var55), method767(var57, var56), method2168(var81, var53), method2168(var81, var54), method2168(var81, var55), method2168(var81, var56), var70, var84);
                                }
                            }
                        }
                    }
                }
            }
            for (int var88 = 1; var88 < 103; var88++) {
                for (int var89 = 1; var89 < 103; var89++) {
                    int var94;
                    if ((field104[var6][var89][var88] & 0x8) != 0) {
                        var94 = 0;
                    } else if (var6 <= 0 || (field104[1][var89][var88] & 0x2) == 0) {
                        var94 = var6;
                    } else {
                        var94 = var6 - 1;
                    }
                    arg0.method1782(var6, var89, var88, var94);
                }
            }
            Statics.field106[var6] = (byte[][]) null;
            Statics.field107[var6] = (byte[][]) null;
            Statics.field798[var6] = (byte[][]) null;
            Statics.field108[var6] = (byte[][]) null;
            Statics.field52[var6] = (byte[][]) null;
        }
        arg0.method1681(-50, -10, -50);
        for (int var95 = 0; var95 < 104; var95++) {
            for (int var96 = 0; var96 < 104; var96++) {
                if ((field104[1][var95][var96] & 0x2) == 2) {
                    arg0.method1727(var95, var96);
                }
            }
        }
        int var97 = 1;
        int var98 = 2;
        int var99 = 4;
        for (int var100 = 0; var100 < 4; var100++) {
            if (var100 > 0) {
                var97 <<= 0x3;
                var98 <<= 0x3;
                var99 <<= 0x3;
            }
            for (int var101 = 0; var101 <= var100; var101++) {
                for (int var102 = 0; var102 <= 104; var102++) {
                    for (int var103 = 0; var103 <= 104; var103++) {
                        if ((Statics.field2779[var101][var103][var102] & var97) != 0) {
                            int var104 = var102;
                            int var105 = var102;
                            int var106 = var101;
                            int var107 = var101;
                            while (var104 > 0 && (Statics.field2779[var101][var103][var104 - 1] & var97) != 0) {
                                var104--;
                            }
                            while (var105 < 104 && (Statics.field2779[var101][var103][var105 + 1] & var97) != 0) {
                                var105++;
                            }
                            label379: while (var106 > 0) {
                                for (int var108 = var104; var108 <= var105; var108++) {
                                    if ((Statics.field2779[var106 - 1][var103][var108] & var97) == 0) {
                                        break label379;
                                    }
                                }
                                var106--;
                            }
                            label368: while (var107 < var100) {
                                for (int var109 = var104; var109 <= var105; var109++) {
                                    if ((Statics.field2779[var107 + 1][var103][var109] & var97) == 0) {
                                        break label368;
                                    }
                                }
                                var107++;
                            }
                            int var110 = (var107 + 1 - var106) * (var105 - var104 + 1);
                            if (var110 >= 8) {
                                short var111 = 240;
                                int var112 = field111[var107][var103][var104] - var111;
                                int var113 = field111[var106][var103][var104];
                                class88.method1653(var100, 1, var103 * 128, var103 * 128, var104 * 128, var105 * 128 + 128, var112, var113);
                                for (int var114 = var106; var114 <= var107; var114++) {
                                    for (int var115 = var104; var115 <= var105; var115++) {
                                        Statics.field2779[var114][var103][var115] &= ~var97;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2779[var101][var103][var102] & var98) != 0) {
                            int var116 = var103;
                            int var117 = var103;
                            int var118 = var101;
                            int var119 = var101;
                            while (var116 > 0 && (Statics.field2779[var101][var116 - 1][var102] & var98) != 0) {
                                var116--;
                            }
                            while (var117 < 104 && (Statics.field2779[var101][var117 + 1][var102] & var98) != 0) {
                                var117++;
                            }
                            label432: while (var118 > 0) {
                                for (int var120 = var116; var120 <= var117; var120++) {
                                    if ((Statics.field2779[var118 - 1][var120][var102] & var98) == 0) {
                                        break label432;
                                    }
                                }
                                var118--;
                            }
                            label421: while (var119 < var100) {
                                for (int var121 = var116; var121 <= var117; var121++) {
                                    if ((Statics.field2779[var119 + 1][var121][var102] & var98) == 0) {
                                        break label421;
                                    }
                                }
                                var119++;
                            }
                            int var122 = (var119 + 1 - var118) * (var117 - var116 + 1);
                            if (var122 >= 8) {
                                short var123 = 240;
                                int var124 = field111[var119][var116][var102] - var123;
                                int var125 = field111[var118][var116][var102];
                                class88.method1653(var100, 2, var116 * 128, var117 * 128 + 128, var102 * 128, var102 * 128, var124, var125);
                                for (int var126 = var118; var126 <= var119; var126++) {
                                    for (int var127 = var116; var127 <= var117; var127++) {
                                        Statics.field2779[var126][var127][var102] &= ~var98;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2779[var101][var103][var102] & var99) != 0) {
                            int var128 = var103;
                            int var129 = var103;
                            int var130 = var102;
                            int var131 = var102;
                            while (var130 > 0 && (Statics.field2779[var101][var103][var130 - 1] & var99) != 0) {
                                var130--;
                            }
                            while (var131 < 104 && (Statics.field2779[var101][var103][var131 + 1] & var99) != 0) {
                                var131++;
                            }
                            label485: while (var128 > 0) {
                                for (int var132 = var130; var132 <= var131; var132++) {
                                    if ((Statics.field2779[var101][var128 - 1][var132] & var99) == 0) {
                                        break label485;
                                    }
                                }
                                var128--;
                            }
                            label474: while (var129 < 104) {
                                for (int var133 = var130; var133 <= var131; var133++) {
                                    if ((Statics.field2779[var101][var129 + 1][var133] & var99) == 0) {
                                        break label474;
                                    }
                                }
                                var129++;
                            }
                            if ((var129 - var128 + 1) * (var131 - var130 + 1) >= 4) {
                                int var134 = field111[var101][var128][var130];
                                class88.method1653(var100, 4, var128 * 128, var129 * 128 + 128, var130 * 128, var131 * 128 + 128, var134, var134);
                                for (int var135 = var128; var135 <= var129; var135++) {
                                    for (int var136 = var130; var136 <= var131; var136++) {
                                        Statics.field2779[var101][var135][var136] &= ~var99;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.q(IIII)I")
    public static final int method864(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method796(var3, var5);
        int var8 = method796(var3 + 1, var5);
        int var9 = method796(var3, var5 + 1);
        int var10 = method796(var3 + 1, var5 + 1);
        int var11 = method86(var7, var8, var4, arg2);
        int var12 = method86(var9, var10, var4, arg2);
        return method86(var11, var12, var6, arg2);
    }

    @ObfuscatedName("c.l(IIIIB)I")
    public static final int method86(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1446[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ah.y(III)I")
    public static final int method796(int arg0, int arg1) {
        int var2 = method1084(arg0 - 1, arg1 - 1) + method1084(arg0 + 1, arg1 - 1) + method1084(arg0 - 1, arg1 + 1) + method1084(arg0 + 1, arg1 + 1);
        int var3 = method1084(arg0 - 1, arg1) + method1084(arg0 + 1, arg1) + method1084(arg0, arg1 - 1) + method1084(arg0, arg1 + 1);
        int var4 = method1084(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("br.e(IIB)I")
    public static final int method1084(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ax.x(III)I")
    public static final int method767(int arg0, int arg1) {
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

    @ObfuscatedName("dn.f(III)I")
    public static final int method2168(int arg0, int arg1) {
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

    @ObfuscatedName("fu.s(IIIB)I")
    public static final int method2746(int arg0, int arg1, int arg2) {
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
