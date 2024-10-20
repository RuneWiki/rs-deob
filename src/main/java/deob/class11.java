package deob;

@ObfuscatedName("k")
public final class class11 {

    @ObfuscatedName("k.b")
    public static int[][][] field121 = new int[4][105][105];

    @ObfuscatedName("k.e")
    public static byte[][][] field104 = new byte[4][104][104];

    @ObfuscatedName("k.c")
    public static int field105 = 99;

    @ObfuscatedName("k.x")
    public static final int[] field113 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("k.z")
    public static final int[] field111 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("k.n")
    public static final int[] field112 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("k.w")
    public static final int[] field119 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("k.h")
    public static final int[] field114 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("k.u")
    public static final int[] field118 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("k.m")
    public static int field116 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("k.p")
    public static int field115 = (int) (Math.random() * 33.0D) - 16;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.b(I)V")
    public static void method285() {
        field105 = 99;
        Statics.field109 = new byte[4][104][104];
        Statics.field2154 = new byte[4][104][104];
        Statics.field2024 = new byte[4][104][104];
        Statics.field1545 = new byte[4][104][104];
        Statics.field2160 = new int[4][105][105];
        Statics.field127 = new byte[4][105][105];
        Statics.field2102 = new int[105][105];
        Statics.field754 = new int[104];
        Statics.field757 = new int[104];
        Statics.field107 = new int[104];
        Statics.field103 = new int[104];
        Statics.field108 = new int[104];
    }

    @ObfuscatedName("fg.e(IIIIB)V")
    public static final void method2947(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field127[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field121[0][var5][var4] = field121[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field121[0][var5][var4] = field121[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field121[0][var5][var4] = field121[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field121[0][var5][var4] = field121[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("client.c(IIII)V")
    public static final void method568(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field121[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field121[arg0][arg1][arg2 + var5] = field121[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field121[arg0][arg1 + var6][arg2] = field121[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field121[arg0][arg1 - 1][arg2] != 0) {
            field121[arg0][arg1][arg2] = field121[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field121[arg0][arg1][arg2 - 1] != 0) {
            field121[arg0][arg1][arg2] = field121[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field121[arg0][arg1 - 1][arg2 - 1] != 0) {
            field121[arg0][arg1][arg2] = field121[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ar.l(Lec;IIIIIII)V")
    public static final void method886(class154 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2669();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2669();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2669();
                }
            }
            return;
        }
        field104[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2669();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field121[0][arg2][arg3] = -method87(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field121[arg1][arg2][arg3] = field121[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2669();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field121[0][arg2][arg3] = -var8 * 8;
                } else {
                    field121[arg1][arg2][arg3] = field121[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2154[arg1][arg2][arg3] = arg0.method2670();
                Statics.field2024[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1545[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field104[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field109[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("f.y([BIII)Z")
    public static final boolean method172(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class154 var4 = new class154(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2682();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2682();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2669() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class198 var16 = class198.method1865(var5);
                        if (var13 != 22 || !client.field569 || var16.field2928 != 0 || var16.field2919 == 1 || var16.field2940) {
                            if (!var16.method3480()) {
                                client.field344++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2682();
                if (var9 == 0) {
                    break;
                }
                var4.method2669();
            }
        }
    }

    @ObfuscatedName("c.j([BIILci;[Ldj;I)V")
    public static final void method18(byte[] arg0, int arg1, int arg2, class88 arg3, class118[] arg4) {
        class154 var5 = new class154(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2682();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2682();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2669();
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
                    method268(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("m.t(IIIIIILci;Ldj;I)V")
    public static final void method268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, class118 arg7) {
        if (client.field569 && (field104[0][arg1][arg2] & 0x2) == 0 && (field104[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field105) {
            field105 = arg0;
        }
        class198 var8 = class198.method1865(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2918;
            var10 = var8.field2903;
        } else {
            var9 = var8.field2903;
            var10 = var8.field2918;
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
        int[][] var15 = field121[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field2928 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field2932 == 1) {
            var20 += 256;
        }
        if (var8.method3446()) {
            class32 var21 = new class32();
            var21.field700 = arg0;
            var21.field708 = arg1 * 128;
            var21.field703 = arg2 * 128;
            int var22 = var8.field2903;
            int var23 = var8.field2918;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field2918;
                var23 = var8.field2903;
            }
            var21.field704 = (arg1 + var22) * 128;
            var21.field717 = (arg2 + var23) * 128;
            var21.field707 = var8.field2909;
            var21.field706 = var8.field2947 * 128;
            var21.field709 = var8.field2917;
            var21.field710 = var8.field2949;
            var21.field705 = var8.field2944;
            if (var8.field2943 != null) {
                var21.field714 = var8;
                var21.method665();
            }
            class32.field712.method2308(var21);
            if (var21.field705 != null) {
                var21.field711 = var21.field709 + (int) (Math.random() * (double) (var21.field710 - var21.field709));
            }
        }
        if (arg5 == 22) {
            if (!client.field569 || var8.field2928 != 0 || var8.field2919 == 1 || var8.field2940) {
                class90 var24;
                if (var8.field2925 == -1 && var8.field2943 == null) {
                    var24 = var8.method3441(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class50(arg3, 22, arg4, arg0, arg1, arg2, var8.field2925, true, (class90) null);
                }
                arg6.method1653(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field2919 == 1 && arg7 != null) {
                    arg7.method2163(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class90 var47;
            if (var8.field2925 == -1 && var8.field2943 == null) {
                var47 = var8.method3441(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class50(arg3, 10, arg4, arg0, arg1, arg2, var8.field2925, true, (class90) null);
            }
            if (var47 != null && arg6.method1657(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field2933) {
                int var48 = 15;
                if (var47 instanceof class83) {
                    var48 = ((class83) var47).method1507() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field127[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field127[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field2919 != 0 && arg7 != null) {
                arg7.method2161(arg1, arg2, var9, var10, var8.field2920);
            }
        } else if (arg5 >= 12) {
            class90 var25;
            if (var8.field2925 == -1 && var8.field2943 == null) {
                var25 = var8.method3441(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2925, true, (class90) null);
            }
            arg6.method1657(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2160[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2919 != 0 && arg7 != null) {
                arg7.method2161(arg1, arg2, var9, var10, var8.field2920);
            }
        } else if (arg5 == 0) {
            class90 var26;
            if (var8.field2925 == -1 && var8.field2943 == null) {
                var26 = var8.method3441(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class50(arg3, 0, arg4, arg0, arg1, arg2, var8.field2925, true, (class90) null);
            }
            arg6.method1818(arg0, arg1, arg2, var16, var26, (class90) null, field113[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field2933) {
                    Statics.field127[arg0][arg1][arg2] = 50;
                    Statics.field127[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2924) {
                    Statics.field2160[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2933) {
                    Statics.field127[arg0][arg1][arg2 + 1] = 50;
                    Statics.field127[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2924) {
                    Statics.field2160[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2933) {
                    Statics.field127[arg0][arg1 + 1][arg2] = 50;
                    Statics.field127[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2924) {
                    Statics.field2160[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2933) {
                    Statics.field127[arg0][arg1][arg2] = 50;
                    Statics.field127[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2924) {
                    Statics.field2160[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2919 != 0 && arg7 != null) {
                arg7.method2193(arg1, arg2, arg5, arg4, var8.field2920);
            }
            if (var8.field2926 != 16) {
                arg6.method1663(arg0, arg1, arg2, var8.field2926);
            }
        } else if (arg5 == 1) {
            class90 var27;
            if (var8.field2925 == -1 && var8.field2943 == null) {
                var27 = var8.method3441(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class50(arg3, 1, arg4, arg0, arg1, arg2, var8.field2925, true, (class90) null);
            }
            arg6.method1818(arg0, arg1, arg2, var16, var27, (class90) null, field111[arg4], 0, var19, var20);
            if (var8.field2933) {
                if (arg4 == 0) {
                    Statics.field127[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field127[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field127[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field127[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2919 != 0 && arg7 != null) {
                arg7.method2193(arg1, arg2, arg5, arg4, var8.field2920);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class90 var29;
            class90 var30;
            if (var8.field2925 == -1 && var8.field2943 == null) {
                var29 = var8.method3441(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method3441(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class50(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2925, true, (class90) null);
                var30 = new class50(arg3, 2, var28, arg0, arg1, arg2, var8.field2925, true, (class90) null);
            }
            arg6.method1818(arg0, arg1, arg2, var16, var29, var30, field113[arg4], field113[var28], var19, var20);
            if (var8.field2924) {
                if (arg4 == 0) {
                    Statics.field2160[arg0][arg1][arg2] |= 0x249;
                    Statics.field2160[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2160[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2160[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2160[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2160[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2160[arg0][arg1][arg2] |= 0x492;
                    Statics.field2160[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2919 != 0 && arg7 != null) {
                arg7.method2193(arg1, arg2, arg5, arg4, var8.field2920);
            }
            if (var8.field2926 != 16) {
                arg6.method1663(arg0, arg1, arg2, var8.field2926);
            }
        } else if (arg5 == 3) {
            class90 var31;
            if (var8.field2925 == -1 && var8.field2943 == null) {
                var31 = var8.method3441(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class50(arg3, 3, arg4, arg0, arg1, arg2, var8.field2925, true, (class90) null);
            }
            arg6.method1818(arg0, arg1, arg2, var16, var31, (class90) null, field111[arg4], 0, var19, var20);
            if (var8.field2933) {
                if (arg4 == 0) {
                    Statics.field127[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field127[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field127[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field127[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2919 != 0 && arg7 != null) {
                arg7.method2193(arg1, arg2, arg5, arg4, var8.field2920);
            }
        } else if (arg5 == 9) {
            class90 var32;
            if (var8.field2925 == -1 && var8.field2943 == null) {
                var32 = var8.method3441(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class50(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2925, true, (class90) null);
            }
            arg6.method1657(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field2919 != 0 && arg7 != null) {
                arg7.method2161(arg1, arg2, var9, var10, var8.field2920);
            }
            if (var8.field2926 != 16) {
                arg6.method1663(arg0, arg1, arg2, var8.field2926);
            }
        } else if (arg5 == 4) {
            class90 var33;
            if (var8.field2925 == -1 && var8.field2943 == null) {
                var33 = var8.method3441(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2925, true, (class90) null);
            }
            arg6.method1656(arg0, arg1, arg2, var16, var33, (class90) null, field113[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1670(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class198.method1865(var35 >> 14 & 0x7FFF).field2926;
            }
            class90 var36;
            if (var8.field2925 == -1 && var8.field2943 == null) {
                var36 = var8.method3441(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class50(arg3, 4, arg4, arg0, arg1, arg2, var8.field2925, true, (class90) null);
            }
            arg6.method1656(arg0, arg1, arg2, var16, var36, (class90) null, field113[arg4], 0, field112[arg4] * var34, field119[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1670(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class198.method1865(var38 >> 14 & 0x7FFF).field2926 / 2;
            }
            class90 var39;
            if (var8.field2925 == -1 && var8.field2943 == null) {
                var39 = var8.method3441(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2925, true, (class90) null);
            }
            arg6.method1656(arg0, arg1, arg2, var16, var39, (class90) null, 256, arg4, field114[arg4] * var37, field118[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class90 var41;
            if (var8.field2925 == -1 && var8.field2943 == null) {
                var41 = var8.method3441(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class50(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2925, true, (class90) null);
            }
            arg6.method1656(arg0, arg1, arg2, var16, var41, (class90) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1670(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class198.method1865(var43 >> 14 & 0x7FFF).field2926 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class90 var45;
            class90 var46;
            if (var8.field2925 == -1 && var8.field2943 == null) {
                var45 = var8.method3441(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method3441(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class50(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2925, true, (class90) null);
                var46 = new class50(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field2925, true, (class90) null);
            }
            arg6.method1656(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field114[arg4] * var42, field118[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("bv.k(Lci;[Ldj;B)V")
    public static final void method1138(class88 arg0, class118[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field104[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field104[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2162(var3, var4);
                        }
                    }
                }
            }
        }
        field116 += (int) (Math.random() * 5.0D) - 2;
        if (field116 < -8) {
            field116 = -8;
        }
        if (field116 > 8) {
            field116 = 8;
        }
        field115 += (int) (Math.random() * 5.0D) - 2;
        if (field115 < -16) {
            field115 = -16;
        }
        if (field115 > 16) {
            field115 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field127[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field121[var6][var11 + 1][var10] - field121[var6][var11 - 1][var10];
                    int var13 = field121[var6][var11][var10 + 1] - field121[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field2102[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field754[var20] = 0;
                Statics.field757[var20] = 0;
                Statics.field107[var20] = 0;
                Statics.field103[var20] = 0;
                Statics.field108[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field109[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class192 var26 = (class192) class192.field2814.method2246((long) var25);
                            class192 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field2820.method3126(1, var25);
                                class192 var29 = new class192();
                                if (var28 != null) {
                                    var29.method3321(new class154(var28), var25);
                                }
                                var29.method3322();
                                class192.field2814.method2250(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field754[var22] += var27.field2816;
                            Statics.field757[var22] += var27.field2813;
                            Statics.field107[var22] += var27.field2819;
                            Statics.field103[var22] += var27.field2817;
                            var10002 = Statics.field108[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field109[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class192 var34 = (class192) class192.field2814.method2246((long) var33);
                            class192 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field2820.method3126(1, var33);
                                class192 var37 = new class192();
                                if (var36 != null) {
                                    var37.method3321(new class154(var36), var33);
                                }
                                var37.method3322();
                                class192.field2814.method2250(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field754[var22] -= var35.field2816;
                            Statics.field757[var22] -= var35.field2813;
                            Statics.field107[var22] -= var35.field2819;
                            Statics.field103[var22] -= var35.field2817;
                            var10002 = Statics.field108[var22]--;
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
                            var39 += Statics.field754[var45];
                            var40 += Statics.field757[var45];
                            var41 += Statics.field107[var45];
                            var42 += Statics.field103[var45];
                            var43 += Statics.field108[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field754[var46];
                            var40 -= Statics.field757[var46];
                            var41 -= Statics.field107[var46];
                            var42 -= Statics.field103[var46];
                            var43 -= Statics.field108[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field569 || (field104[0][var21][var44] & 0x2) != 0 || (field104[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field105) {
                                field105 = var6;
                            }
                            int var47 = Statics.field109[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field2154[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field121[var6][var21][var44];
                                int var50 = field121[var6][var21 + 1][var44];
                                int var51 = field121[var6][var21 + 1][var44 + 1];
                                int var52 = field121[var6][var21][var44 + 1];
                                int var53 = Statics.field2102[var21][var44];
                                int var54 = Statics.field2102[var21 + 1][var44];
                                int var55 = Statics.field2102[var21 + 1][var44 + 1];
                                int var56 = Statics.field2102[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method739(var59, var60, var61);
                                    int var62 = field116 + var59 & 0xFF;
                                    int var63 = field115 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method739(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field2024[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0) {
                                        int var65 = var48 - 1;
                                        class201 var66 = (class201) class201.field3053.method2246((long) var65);
                                        class201 var67;
                                        if (var66 == null) {
                                            byte[] var68 = Statics.field3056.method3126(4, var65);
                                            class201 var69 = new class201();
                                            if (var68 != null) {
                                                var69.method3560(new class154(var68), var65);
                                            }
                                            var69.method3565();
                                            class201.field3053.method2250(var69, (long) var65);
                                            var67 = var69;
                                        } else {
                                            var67 = var66;
                                        }
                                        if (!var67.field3051) {
                                            var64 = false;
                                        }
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field2160[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var70 = 0;
                                if (var58 != -1) {
                                    var70 = class85.field1456[method1134(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1652(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method1134(var57, var53), method1134(var57, var54), method1134(var57, var55), method1134(var57, var56), 0, 0, 0, 0, var70, 0);
                                } else {
                                    int var71 = Statics.field2024[var6][var21][var44] + 1;
                                    byte var72 = Statics.field1545[var6][var21][var44];
                                    int var73 = var48 - 1;
                                    class201 var74 = (class201) class201.field3053.method2246((long) var73);
                                    class201 var75;
                                    if (var74 == null) {
                                        byte[] var76 = Statics.field3056.method3126(4, var73);
                                        class201 var77 = new class201();
                                        if (var76 != null) {
                                            var77.method3560(new class154(var76), var73);
                                        }
                                        var77.method3565();
                                        class201.field3053.method2250(var77, (long) var73);
                                        var75 = var77;
                                    } else {
                                        var75 = var74;
                                    }
                                    int var79 = var75.field3050;
                                    int var80;
                                    int var81;
                                    if (var79 >= 0) {
                                        var80 = Statics.field1457.method1379(var79);
                                        var81 = -1;
                                    } else if (var75.field3057 == 16711935) {
                                        var81 = -2;
                                        var79 = -1;
                                        var80 = -2;
                                    } else {
                                        var81 = method739(var75.field3049, var75.field3047, var75.field3055);
                                        int var82 = field116 + var75.field3049 & 0xFF;
                                        int var83 = field115 + var75.field3055;
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        var80 = method739(var82, var75.field3047, var83);
                                    }
                                    int var84 = 0;
                                    if (var80 != -2) {
                                        var84 = class85.field1456[method737(var80, 96)];
                                    }
                                    if (var75.field3052 != -1) {
                                        int var85 = field116 + var75.field3054 & 0xFF;
                                        int var86 = field115 + var75.field3058;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 255) {
                                            var86 = 255;
                                        }
                                        int var87 = method739(var85, var75.field3048, var86);
                                        var84 = class85.field1456[method737(var87, 96)];
                                    }
                                    arg0.method1652(var6, var21, var44, var71, var72, var79, var49, var50, var51, var52, method1134(var57, var53), method1134(var57, var54), method1134(var57, var55), method1134(var57, var56), method737(var81, var53), method737(var81, var54), method737(var81, var55), method737(var81, var56), var70, var84);
                                }
                            }
                        }
                    }
                }
            }
            for (int var88 = 1; var88 < 103; var88++) {
                for (int var89 = 1; var89 < 103; var89++) {
                    arg0.method1651(var6, var89, var88, method2393(var6, var89, var88));
                }
            }
            Statics.field109[var6] = (byte[][]) null;
            Statics.field2154[var6] = (byte[][]) null;
            Statics.field2024[var6] = (byte[][]) null;
            Statics.field1545[var6] = (byte[][]) null;
            Statics.field127[var6] = (byte[][]) null;
        }
        arg0.method1678(-50, -10, -50);
        for (int var90 = 0; var90 < 104; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                if ((field104[1][var90][var91] & 0x2) == 2) {
                    arg0.method1649(var90, var91);
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
                        if ((Statics.field2160[var96][var98][var97] & var92) != 0) {
                            int var99 = var97;
                            int var100 = var97;
                            int var101 = var96;
                            int var102 = var96;
                            while (var99 > 0 && (Statics.field2160[var96][var98][var99 - 1] & var92) != 0) {
                                var99--;
                            }
                            while (var100 < 104 && (Statics.field2160[var96][var98][var100 + 1] & var92) != 0) {
                                var100++;
                            }
                            label373: while (var101 > 0) {
                                for (int var103 = var99; var103 <= var100; var103++) {
                                    if ((Statics.field2160[var101 - 1][var98][var103] & var92) == 0) {
                                        break label373;
                                    }
                                }
                                var101--;
                            }
                            label362: while (var102 < var95) {
                                for (int var104 = var99; var104 <= var100; var104++) {
                                    if ((Statics.field2160[var102 + 1][var98][var104] & var92) == 0) {
                                        break label362;
                                    }
                                }
                                var102++;
                            }
                            int var105 = (var102 + 1 - var101) * (var100 - var99 + 1);
                            if (var105 >= 8) {
                                short var106 = 240;
                                int var107 = field121[var102][var98][var99] - var106;
                                int var108 = field121[var101][var98][var99];
                                class88.method1650(var95, 1, var98 * 128, var98 * 128, var99 * 128, var100 * 128 + 128, var107, var108);
                                for (int var109 = var101; var109 <= var102; var109++) {
                                    for (int var110 = var99; var110 <= var100; var110++) {
                                        Statics.field2160[var109][var98][var110] &= ~var92;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2160[var96][var98][var97] & var93) != 0) {
                            int var111 = var98;
                            int var112 = var98;
                            int var113 = var96;
                            int var114 = var96;
                            while (var111 > 0 && (Statics.field2160[var96][var111 - 1][var97] & var93) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field2160[var96][var112 + 1][var97] & var93) != 0) {
                                var112++;
                            }
                            label426: while (var113 > 0) {
                                for (int var115 = var111; var115 <= var112; var115++) {
                                    if ((Statics.field2160[var113 - 1][var115][var97] & var93) == 0) {
                                        break label426;
                                    }
                                }
                                var113--;
                            }
                            label415: while (var114 < var95) {
                                for (int var116 = var111; var116 <= var112; var116++) {
                                    if ((Statics.field2160[var114 + 1][var116][var97] & var93) == 0) {
                                        break label415;
                                    }
                                }
                                var114++;
                            }
                            int var117 = (var114 + 1 - var113) * (var112 - var111 + 1);
                            if (var117 >= 8) {
                                short var118 = 240;
                                int var119 = field121[var114][var111][var97] - var118;
                                int var120 = field121[var113][var111][var97];
                                class88.method1650(var95, 2, var111 * 128, var112 * 128 + 128, var97 * 128, var97 * 128, var119, var120);
                                for (int var121 = var113; var121 <= var114; var121++) {
                                    for (int var122 = var111; var122 <= var112; var122++) {
                                        Statics.field2160[var121][var122][var97] &= ~var93;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2160[var96][var98][var97] & var94) != 0) {
                            int var123 = var98;
                            int var124 = var98;
                            int var125 = var97;
                            int var126 = var97;
                            while (var125 > 0 && (Statics.field2160[var96][var98][var125 - 1] & var94) != 0) {
                                var125--;
                            }
                            while (var126 < 104 && (Statics.field2160[var96][var98][var126 + 1] & var94) != 0) {
                                var126++;
                            }
                            label479: while (var123 > 0) {
                                for (int var127 = var125; var127 <= var126; var127++) {
                                    if ((Statics.field2160[var96][var123 - 1][var127] & var94) == 0) {
                                        break label479;
                                    }
                                }
                                var123--;
                            }
                            label468: while (var124 < 104) {
                                for (int var128 = var125; var128 <= var126; var128++) {
                                    if ((Statics.field2160[var96][var124 + 1][var128] & var94) == 0) {
                                        break label468;
                                    }
                                }
                                var124++;
                            }
                            if ((var124 - var123 + 1) * (var126 - var125 + 1) >= 4) {
                                int var129 = field121[var96][var123][var125];
                                class88.method1650(var95, 4, var123 * 128, var124 * 128 + 128, var125 * 128, var126 * 128 + 128, var129, var129);
                                for (int var130 = var123; var130 <= var124; var130++) {
                                    for (int var131 = var125; var131 <= var126; var131++) {
                                        Statics.field2160[var96][var130][var131] &= ~var94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.f(IIII)I")
    public static int method2393(int arg0, int arg1, int arg2) {
        if ((field104[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field104[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("g.a(III)I")
    public static final int method87(int arg0, int arg1) {
        int var2 = method2022(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2022(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2022(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("dt.v(IIIB)I")
    public static final int method2022(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method27(var3, var5);
        int var8 = method27(var3 + 1, var5);
        int var9 = method27(var3, var5 + 1);
        int var10 = method27(var3 + 1, var5 + 1);
        int var11 = 65536 - class85.field1461[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = method3122(var9, var10, var4, arg2);
        int var15 = 65536 - class85.field1461[var6 * 1024 / arg2] >> 1;
        return ((65536 - var15) * var12 >> 16) + (var14 * var15 >> 16);
    }

    @ObfuscatedName("fs.d(IIIII)I")
    public static final int method3122(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1461[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("c.o(III)I")
    public static final int method27(int arg0, int arg1) {
        int var2 = method10(arg0 - 1, arg1 - 1) + method10(arg0 + 1, arg1 - 1) + method10(arg0 - 1, arg1 + 1) + method10(arg0 + 1, arg1 + 1);
        int var3 = method10(arg0 - 1, arg1) + method10(arg0 + 1, arg1) + method10(arg0, arg1 - 1) + method10(arg0, arg1 + 1);
        int var4 = method10(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("b.q(IIB)I")
    public static final int method10(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bv.i(IIB)I")
    public static final int method1134(int arg0, int arg1) {
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

    @ObfuscatedName("aw.x(III)I")
    public static final int method737(int arg0, int arg1) {
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

    @ObfuscatedName("aw.z(IIII)I")
    public static final int method739(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ck.n(III)Z")
    public static final boolean method1847(int arg0, int arg1) {
        class198 var2 = class198.method1865(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3439(arg1);
    }
}
