package deob;

@ObfuscatedName("t")
public final class class11 {

    @ObfuscatedName("t.u")
    public static int[][][] field104 = new int[4][105][105];

    @ObfuscatedName("t.x")
    public static byte[][][] field101 = new byte[4][104][104];

    @ObfuscatedName("t.i")
    public static int field96 = 99;

    @ObfuscatedName("t.r")
    public static final int[] field97 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("t.y")
    public static final int[] field102 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("t.h")
    public static final int[] field103 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("t.s")
    public static final int[] field107 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("t.w")
    public static final int[] field105 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("t.n")
    public static final int[] field106 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("t.o")
    public static int field94 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("t.b")
    public static int field98 = (int) (Math.random() * 33.0D) - 16;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fz.u(IIIIB)V")
    public static final void method3056(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2620[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field104[0][var5][var4] = field104[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field104[0][var5][var4] = field104[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field104[0][var5][var4] = field104[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field104[0][var5][var4] = field104[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("gp.x([BIIIIIII[Ldf;I)V")
    public static final void method3606(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1821[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class154 var11 = new class154(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class169.method3206(var13 & 0x7, var14 & 0x7, arg7);
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
                        method1595(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method1595(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cj.i(Len;IIIIIIS)V")
    public static final void method1595(class154 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2708();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2708();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2708();
                }
            }
            return;
        }
        field101[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2708();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field104[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method1935(var10 + 45365, var11 + 91923, 4) - 128 + (method1935(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method1935(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field104[arg1][arg2][arg3] = field104[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2708();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field104[0][arg2][arg3] = -var15 * 8;
                } else {
                    field104[arg1][arg2][arg3] = field104[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field115[arg1][arg2][arg3] = arg0.method2754();
                Statics.field99[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2625[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field101[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field110[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("dw.a([BIIIIIIILcb;[Ldf;I)V")
    public static final void method2081(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class88 arg8, class118[] arg9) {
        class154 var10 = new class154(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2776();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2776();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2708();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class198 var21 = class198.method1443(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field2896;
                    int var27 = var21.field2932;
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
                    int var32 = arg3 + class169.method1426(var16 & 0x7, var15 & 0x7, arg7, var21.field2896, var21.field2932, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field101[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class118 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method173(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.c(IIIIIILcb;Ldf;B)V")
    public static final void method173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, class118 arg7) {
        if (client.field287 && (field101[0][arg1][arg2] & 0x2) == 0 && (field101[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field96) {
            field96 = arg0;
        }
        class198 var8 = class198.method1443(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2932;
            var10 = var8.field2896;
        } else {
            var9 = var8.field2896;
            var10 = var8.field2932;
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
        int[][] var15 = field104[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field2900 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field2921 == 1) {
            var20 += 256;
        }
        if (var8.method3398()) {
            class32 var21 = new class32();
            var21.field700 = arg0;
            var21.field701 = arg1 * 128;
            var21.field702 = arg2 * 128;
            int var22 = var8.field2896;
            int var23 = var8.field2932;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field2932;
                var23 = var8.field2896;
            }
            var21.field703 = (arg1 + var22) * 128;
            var21.field717 = (arg2 + var23) * 128;
            var21.field706 = var8.field2925;
            var21.field705 = var8.field2926 * 128;
            var21.field708 = var8.field2927;
            var21.field709 = var8.field2901;
            var21.field710 = var8.field2929;
            if (var8.field2912 != null) {
                var21.field713 = var8;
                var21.method675();
            }
            class32.field704.method2245(var21);
            if (var21.field710 != null) {
                var21.field711 = var21.field708 + (int) (Math.random() * (double) (var21.field709 - var21.field708));
            }
        }
        if (arg5 == 22) {
            if (!client.field287 || var8.field2900 != 0 || var8.field2924 == 1 || var8.field2919) {
                class90 var24;
                if (var8.field2904 == -1 && var8.field2912 == null) {
                    var24 = var8.method3391(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class50(arg3, 22, arg4, arg0, arg1, arg2, var8.field2904, true, (class90) null);
                }
                arg6.method1763(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field2924 == 1 && arg7 != null) {
                    arg7.method2088(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class90 var47;
            if (var8.field2904 == -1 && var8.field2912 == null) {
                var47 = var8.method3391(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class50(arg3, 10, arg4, arg0, arg1, arg2, var8.field2904, true, (class90) null);
            }
            if (var47 != null && arg6.method1610(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field2928) {
                int var48 = 15;
                if (var47 instanceof class83) {
                    var48 = ((class83) var47).method1451() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field2620[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field2620[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field2924 != 0 && arg7 != null) {
                arg7.method2086(arg1, arg2, var9, var10, var8.field2899);
            }
        } else if (arg5 >= 12) {
            class90 var25;
            if (var8.field2904 == -1 && var8.field2912 == null) {
                var25 = var8.method3391(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2904, true, (class90) null);
            }
            arg6.method1610(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field3190[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2924 != 0 && arg7 != null) {
                arg7.method2086(arg1, arg2, var9, var10, var8.field2899);
            }
        } else if (arg5 == 0) {
            class90 var26;
            if (var8.field2904 == -1 && var8.field2912 == null) {
                var26 = var8.method3391(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class50(arg3, 0, arg4, arg0, arg1, arg2, var8.field2904, true, (class90) null);
            }
            arg6.method1608(arg0, arg1, arg2, var16, var26, (class90) null, field97[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field2928) {
                    Statics.field2620[arg0][arg1][arg2] = 50;
                    Statics.field2620[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2903) {
                    Statics.field3190[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2928) {
                    Statics.field2620[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2620[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2903) {
                    Statics.field3190[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2928) {
                    Statics.field2620[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2620[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2903) {
                    Statics.field3190[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2928) {
                    Statics.field2620[arg0][arg1][arg2] = 50;
                    Statics.field2620[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2903) {
                    Statics.field3190[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2924 != 0 && arg7 != null) {
                arg7.method2107(arg1, arg2, arg5, arg4, var8.field2899);
            }
            if (var8.field2906 != 16) {
                arg6.method1661(arg0, arg1, arg2, var8.field2906);
            }
        } else if (arg5 == 1) {
            class90 var27;
            if (var8.field2904 == -1 && var8.field2912 == null) {
                var27 = var8.method3391(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class50(arg3, 1, arg4, arg0, arg1, arg2, var8.field2904, true, (class90) null);
            }
            arg6.method1608(arg0, arg1, arg2, var16, var27, (class90) null, field102[arg4], 0, var19, var20);
            if (var8.field2928) {
                if (arg4 == 0) {
                    Statics.field2620[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2620[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2620[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2620[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2924 != 0 && arg7 != null) {
                arg7.method2107(arg1, arg2, arg5, arg4, var8.field2899);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class90 var29;
            class90 var30;
            if (var8.field2904 == -1 && var8.field2912 == null) {
                var29 = var8.method3391(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method3391(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class50(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2904, true, (class90) null);
                var30 = new class50(arg3, 2, var28, arg0, arg1, arg2, var8.field2904, true, (class90) null);
            }
            arg6.method1608(arg0, arg1, arg2, var16, var29, var30, field97[arg4], field97[var28], var19, var20);
            if (var8.field2903) {
                if (arg4 == 0) {
                    Statics.field3190[arg0][arg1][arg2] |= 0x249;
                    Statics.field3190[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field3190[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field3190[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field3190[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field3190[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field3190[arg0][arg1][arg2] |= 0x492;
                    Statics.field3190[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2924 != 0 && arg7 != null) {
                arg7.method2107(arg1, arg2, arg5, arg4, var8.field2899);
            }
            if (var8.field2906 != 16) {
                arg6.method1661(arg0, arg1, arg2, var8.field2906);
            }
        } else if (arg5 == 3) {
            class90 var31;
            if (var8.field2904 == -1 && var8.field2912 == null) {
                var31 = var8.method3391(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class50(arg3, 3, arg4, arg0, arg1, arg2, var8.field2904, true, (class90) null);
            }
            arg6.method1608(arg0, arg1, arg2, var16, var31, (class90) null, field102[arg4], 0, var19, var20);
            if (var8.field2928) {
                if (arg4 == 0) {
                    Statics.field2620[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2620[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2620[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2620[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2924 != 0 && arg7 != null) {
                arg7.method2107(arg1, arg2, arg5, arg4, var8.field2899);
            }
        } else if (arg5 == 9) {
            class90 var32;
            if (var8.field2904 == -1 && var8.field2912 == null) {
                var32 = var8.method3391(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2904, true, (class90) null);
            }
            arg6.method1610(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field2924 != 0 && arg7 != null) {
                arg7.method2086(arg1, arg2, var9, var10, var8.field2899);
            }
            if (var8.field2906 != 16) {
                arg6.method1661(arg0, arg1, arg2, var8.field2906);
            }
        } else if (arg5 == 4) {
            class90 var33;
            if (var8.field2904 == -1 && var8.field2912 == null) {
                var33 = var8.method3391(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2904, true, (class90) null);
            }
            arg6.method1737(arg0, arg1, arg2, var16, var33, (class90) null, field97[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1626(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class198.method1443(var35 >> 14 & 0x7FFF).field2906;
            }
            class90 var36;
            if (var8.field2904 == -1 && var8.field2912 == null) {
                var36 = var8.method3391(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2904, true, (class90) null);
            }
            arg6.method1737(arg0, arg1, arg2, var16, var36, (class90) null, field97[arg4], 0, field103[arg4] * var34, field107[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1626(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class198.method1443(var38 >> 14 & 0x7FFF).field2906 / 2;
            }
            class90 var39;
            if (var8.field2904 == -1 && var8.field2912 == null) {
                var39 = var8.method3391(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2904, true, (class90) null);
            }
            arg6.method1737(arg0, arg1, arg2, var16, var39, (class90) null, 256, arg4, field105[arg4] * var37, field106[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class90 var41;
            if (var8.field2904 == -1 && var8.field2912 == null) {
                var41 = var8.method3391(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class50(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2904, true, (class90) null);
            }
            arg6.method1737(arg0, arg1, arg2, var16, var41, (class90) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1626(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class198.method1443(var43 >> 14 & 0x7FFF).field2906 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class90 var45;
            class90 var46;
            if (var8.field2904 == -1 && var8.field2912 == null) {
                var45 = var8.method3391(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method3391(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2904, true, (class90) null);
                var46 = new class50(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field2904, true, (class90) null);
            }
            arg6.method1737(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field105[arg4] * var42, field106[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("de.z(IIIB)I")
    public static final int method1935(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1343(var3, var5);
        int var8 = method1343(var3 + 1, var5);
        int var9 = method1343(var3, var5 + 1);
        int var10 = method1343(var3 + 1, var5 + 1);
        int var11 = method20(var7, var8, var4, arg2);
        int var12 = method20(var9, var10, var4, arg2);
        return method20(var11, var12, var6, arg2);
    }

    @ObfuscatedName("i.t(IIIIB)I")
    public static final int method20(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1429[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("bf.m(IIB)I")
    public static final int method1343(int arg0, int arg1) {
        int var2 = method30(arg0 - 1, arg1 - 1) + method30(arg0 + 1, arg1 - 1) + method30(arg0 - 1, arg1 + 1) + method30(arg0 + 1, arg1 + 1);
        int var3 = method30(arg0 - 1, arg1) + method30(arg0 + 1, arg1) + method30(arg0, arg1 - 1) + method30(arg0, arg1 + 1);
        int var4 = method30(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("i.q(IIB)I")
    public static final int method30(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("gy.e(IIB)I")
    public static final int method3177(int arg0, int arg1) {
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

    @ObfuscatedName("gd.j(IIII)I")
    public static final int method3326(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("dn.p(III)Z")
    public static final boolean method1978(int arg0, int arg1) {
        class198 var2 = class198.method1443(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3389(arg1);
    }

    @ObfuscatedName("fi.k(IIIIIIILcb;Ldf;I)V")
    public static final void method2915(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class88 arg7, class118 arg8) {
        class198 var9 = class198.method1443(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field2932;
            var11 = var9.field2896;
        } else {
            var10 = var9.field2896;
            var11 = var9.field2932;
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
        int[][] var16 = field104[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field2900 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field2921 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class90 var22;
            if (var9.field2904 == -1 && var9.field2912 == null) {
                var22 = var9.method3386(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class50(arg4, 22, arg5, arg1, arg2, arg3, var9.field2904, true, (class90) null);
            }
            arg7.method1763(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field2924 == 1) {
                arg8.method2088(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class90 var45;
            if (var9.field2904 == -1 && var9.field2912 == null) {
                var45 = var9.method3386(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class50(arg4, 10, arg5, arg1, arg2, arg3, var9.field2904, true, (class90) null);
            }
            if (var45 != null) {
                arg7.method1610(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field2924 != 0) {
                arg8.method2086(arg2, arg3, var10, var11, var9.field2899);
            }
        } else if (arg6 >= 12) {
            class90 var23;
            if (var9.field2904 == -1 && var9.field2912 == null) {
                var23 = var9.method3386(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class50(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2904, true, (class90) null);
            }
            arg7.method1610(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field2924 != 0) {
                arg8.method2086(arg2, arg3, var10, var11, var9.field2899);
            }
        } else if (arg6 == 0) {
            class90 var24;
            if (var9.field2904 == -1 && var9.field2912 == null) {
                var24 = var9.method3386(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class50(arg4, 0, arg5, arg1, arg2, arg3, var9.field2904, true, (class90) null);
            }
            arg7.method1608(arg0, arg2, arg3, var17, var24, (class90) null, field97[arg5], 0, var20, var21);
            if (var9.field2924 != 0) {
                arg8.method2107(arg2, arg3, arg6, arg5, var9.field2899);
            }
        } else if (arg6 == 1) {
            class90 var25;
            if (var9.field2904 == -1 && var9.field2912 == null) {
                var25 = var9.method3386(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class50(arg4, 1, arg5, arg1, arg2, arg3, var9.field2904, true, (class90) null);
            }
            arg7.method1608(arg0, arg2, arg3, var17, var25, (class90) null, field102[arg5], 0, var20, var21);
            if (var9.field2924 != 0) {
                arg8.method2107(arg2, arg3, arg6, arg5, var9.field2899);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class90 var27;
            class90 var28;
            if (var9.field2904 == -1 && var9.field2912 == null) {
                var27 = var9.method3386(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method3386(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class50(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field2904, true, (class90) null);
                var28 = new class50(arg4, 2, var26, arg1, arg2, arg3, var9.field2904, true, (class90) null);
            }
            arg7.method1608(arg0, arg2, arg3, var17, var27, var28, field97[arg5], field97[var26], var20, var21);
            if (var9.field2924 != 0) {
                arg8.method2107(arg2, arg3, arg6, arg5, var9.field2899);
            }
        } else if (arg6 == 3) {
            class90 var29;
            if (var9.field2904 == -1 && var9.field2912 == null) {
                var29 = var9.method3386(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class50(arg4, 3, arg5, arg1, arg2, arg3, var9.field2904, true, (class90) null);
            }
            arg7.method1608(arg0, arg2, arg3, var17, var29, (class90) null, field102[arg5], 0, var20, var21);
            if (var9.field2924 != 0) {
                arg8.method2107(arg2, arg3, arg6, arg5, var9.field2899);
            }
        } else if (arg6 == 9) {
            class90 var30;
            if (var9.field2904 == -1 && var9.field2912 == null) {
                var30 = var9.method3386(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class50(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2904, true, (class90) null);
            }
            arg7.method1610(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field2924 != 0) {
                arg8.method2086(arg2, arg3, var10, var11, var9.field2899);
            }
        } else if (arg6 == 4) {
            class90 var31;
            if (var9.field2904 == -1 && var9.field2912 == null) {
                var31 = var9.method3386(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class50(arg4, 4, arg5, arg1, arg2, arg3, var9.field2904, true, (class90) null);
            }
            arg7.method1737(arg0, arg2, arg3, var17, var31, (class90) null, field97[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1626(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class198.method1443(var33 >> 14 & 0x7FFF).field2906;
            }
            class90 var34;
            if (var9.field2904 == -1 && var9.field2912 == null) {
                var34 = var9.method3386(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class50(arg4, 4, arg5, arg1, arg2, arg3, var9.field2904, true, (class90) null);
            }
            arg7.method1737(arg0, arg2, arg3, var17, var34, (class90) null, field97[arg5], 0, field103[arg5] * var32, field107[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1626(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class198.method1443(var36 >> 14 & 0x7FFF).field2906 / 2;
            }
            class90 var37;
            if (var9.field2904 == -1 && var9.field2912 == null) {
                var37 = var9.method3386(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class50(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2904, true, (class90) null);
            }
            arg7.method1737(arg0, arg2, arg3, var17, var37, (class90) null, 256, arg5, field105[arg5] * var35, field106[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class90 var39;
            if (var9.field2904 == -1 && var9.field2912 == null) {
                var39 = var9.method3386(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class50(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field2904, true, (class90) null);
            }
            arg7.method1737(arg0, arg2, arg3, var17, var39, (class90) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1626(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class198.method1443(var41 >> 14 & 0x7FFF).field2906 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class90 var43;
            class90 var44;
            if (var9.field2904 == -1 && var9.field2912 == null) {
                var43 = var9.method3386(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method3386(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class50(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2904, true, (class90) null);
                var44 = new class50(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field2904, true, (class90) null);
            }
            arg7.method1737(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field105[arg5] * var40, field106[arg5] * var40, var20, var21);
        }
    }
}
