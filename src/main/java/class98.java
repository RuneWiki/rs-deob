import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class98 {

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    private int field2417;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    private int field2419;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "[[I")
    private int[][] field2414;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "La;")
    private static class1 field2415 = class113.method934(-11538, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field2413 = 0;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "La;")
    public static class1 field2408 = field2415;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field2412 = 0;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "La;")
    private static class1 field2411 = class113.method934(-11538, "Loading title screen )2 ");

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "La;")
    public static class1 field2423 = class113.method934(-11538, "M");

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "La;")
    public static class1 field2410 = field2411;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field2424 = -1;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "La;")
    public static class1 field2409 = class113.method934(-11538, " ");

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Lba;")
    public static class8 field2418;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)I", line = 3)
    public final int method843(int arg0, int arg1) {
        if (this.field2414 != null) {
            arg0 = this.field2419 * arg0 / this.field2417 + 7;
        }
        if (arg1 == 54) {
            field2421++;
            return arg0;
        } else {
            return 55;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILba;IIIII)V", line = 33)
    public static final void method844(int arg0, int arg1, class8 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2425++;
        if (arg0 >= 0 && arg0 < 104 && arg4 >= 0 && arg4 < 104) {
            class34.field899[arg7][arg0][arg4] = 0;
            while (true) {
                int var8 = arg2.method145(false);
                if (var8 == 0) {
                    if (arg7 == 0) {
                        class57.field1454[0][arg0][arg4] = -class85.method754(arg0 + arg6 + 932731, (byte) -45, arg5 + arg4 + 556238) * 8;
                    } else {
                        class57.field1454[arg7][arg0][arg4] = class57.field1454[arg7 - 1][arg0][arg4] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg2.method145(false);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg7 == 0) {
                        class57.field1454[0][arg0][arg4] = -var9 * 8;
                    } else {
                        class57.field1454[arg7][arg0][arg4] = class57.field1454[arg7 - 1][arg0][arg4] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class122.field3056[arg7][arg0][arg4] = arg2.method185(105);
                    class34.field911[arg7][arg0][arg4] = (byte) ((var8 - 2) / 4);
                    class75.field1875[arg7][arg0][arg4] = (byte) class132.method1034(arg1 + var8 - 2, 3);
                } else if (var8 <= 81) {
                    class34.field899[arg7][arg0][arg4] = (byte) (var8 - 49);
                } else {
                    class85.field2134[arg7][arg0][arg4] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg2.method145(false);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg2.method145(false);
                    break;
                }
                if (var10 <= 49) {
                    arg2.method145(false);
                }
            }
        }
        if (arg3 > -62) {
            field2410 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I", line = 121)
    public final int method845(int arg0, int arg1) {
        if (arg1 != 4) {
            return -128;
        }
        field2426++;
        if (this.field2414 != null) {
            arg0 = this.field2419 * arg0 / this.field2417;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 137)
    public static void method846(byte arg0) {
        field2423 = null;
        field2418 = null;
        field2409 = null;
        int var1 = -6 % ((-arg0 - 6) / 49);
        field2415 = null;
        field2408 = null;
        field2410 = null;
        field2411 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[Lqd;IIIIIIIIII)V", line = 163)
    public static final void method847(int arg0, class100[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2427++;
        if (arg2 > arg8 || arg4 < arg9 || arg8 >= arg11 || arg4 >= arg0) {
            return;
        }
        for (int var12 = arg5; var12 < arg1.length; var12++) {
            class100 var13 = arg1[var12];
            if (var13 != null && var13.field2457 == arg6) {
                int var14 = var13.field2505 + arg9 - arg3;
                int var15 = var13.field2465 + arg2 - arg10;
                if (var13.field2492 == 8 && var15 <= arg8 && var14 <= arg4 && arg8 < var13.field2501 + var15 && arg4 < var13.field2452 + var14) {
                    class59.field1500 = var12;
                }
                if ((var13.field2530 >= 0 || var13.field2528 != 0) && var15 <= arg8 && var14 <= arg4 && arg8 < var13.field2501 + var15 && arg4 < var13.field2452 + var14) {
                    if (var13.field2530 >= 0) {
                        class34.field904 = var13.field2530;
                    } else {
                        class34.field904 = var12;
                    }
                }
                if (var13.field2492 != 0) {
                    if (var13.field2523 == 1 && var15 <= arg8 && var14 <= arg4 && var13.field2501 + var15 > arg8 && var13.field2452 + var14 > arg4) {
                        boolean var16 = false;
                        if (var13.field2448 != 0) {
                            var16 = class4.method105(300, var13);
                        }
                        if (!var16) {
                            class70.field1736++;
                            class34.method399(0, var13.field2485, var13.field2498, -501, 0, 42, class132.field3237);
                        }
                    }
                    if (var13.field2523 == 2 && client.field595 == 0 && arg8 >= var15 && arg4 >= var14 && arg8 < var13.field2501 + var15 && arg4 < var14 + var13.field2452) {
                        class34.method399(0, var13.field2473, var13.field2498, -501, 0, 33, class116.method959(102, new class1[] { class102.field2567, var13.field2518 }));
                        class134.field3286++;
                    }
                    if (var13.field2523 == 3 && arg8 >= var15 && arg4 >= var14 && var13.field2501 + var15 > arg8 && arg4 < var13.field2452 + var14) {
                        class34.field923++;
                        byte var17;
                        if (arg7 == 3) {
                            var17 = 40;
                        } else {
                            var17 = 9;
                        }
                        class34.method399(0, class93.field2313, var13.field2498, arg5 ^ 0xFFFFFE0B, 0, var17, class132.field3237);
                    }
                    if (var13.field2523 == 4 && arg8 >= var15 && var14 <= arg4 && arg8 < var13.field2501 + var15 && var13.field2452 + var14 > arg4) {
                        class34.method399(0, var13.field2485, var13.field2498, -501, 0, 23, class132.field3237);
                        class80.field2005++;
                    }
                    if (var13.field2523 == 5 && var15 <= arg8 && var14 <= arg4 && arg8 < var15 + var13.field2501 && var13.field2452 + var14 > arg4) {
                        class17.field541++;
                        class34.method399(0, var13.field2485, var13.field2498, -501, 0, 57, class132.field3237);
                    }
                    if (var13.field2523 == 6 && class120.field3001 == -1 && var15 <= arg8 && var14 <= arg4 && arg8 < var15 + var13.field2501 && arg4 < var13.field2452 + var14) {
                        class34.method399(0, var13.field2485, var13.field2498, -501, 0, 54, class132.field3237);
                        class93.field2324++;
                    }
                    if (var13.field2492 == 2) {
                        int var18 = 0;
                        for (int var19 = 0; var19 < var13.field2452; var19++) {
                            for (int var20 = 0; var20 < var13.field2501; var20++) {
                                int var21 = (var13.field2558 + 32) * var20 + var15;
                                int var22 = var14 + (var13.field2476 + 32) * var19;
                                if (var18 < 20) {
                                    var21 += var13.field2508[var18];
                                    var22 += var13.field2517[var18];
                                }
                                if (arg8 >= var21 && var22 <= arg4 && var21 + 32 > arg8 && arg4 < var22 + 32) {
                                    class43.field1146 = var13.field2498;
                                    class108.field2707 = var18;
                                    if (var13.field2494[var18] > 0) {
                                        class115 var23 = class89.method763(var13.field2494[var18] - 1, 10);
                                        if (class14.field476 == 1 && var13.field2536) {
                                            if (class39.field1076 != var13.field2498 || class92.field2284 != var18) {
                                                class34.method399(var23.field2886, client.field585, var13.field2498, -501, var18, 56, class116.method959(arg5 ^ 0x53, new class1[] { class130.field3180, class9.field329, var23.field2830 }));
                                                class78.field1914++;
                                            }
                                        } else if (client.field595 != 1 || !var13.field2536) {
                                            class133.field3246++;
                                            class1[] var24 = var23.field2833;
                                            if (class118.field2937) {
                                                var24 = class109.method908(var24, false);
                                            }
                                            if (var13.field2536) {
                                                for (int var25 = 4; var25 >= 3; var25--) {
                                                    if (var24 != null && var24[var25] != null) {
                                                        class53.field1404++;
                                                        byte var26;
                                                        if (var25 == 3) {
                                                            var26 = 43;
                                                        } else {
                                                            var26 = 11;
                                                        }
                                                        class34.method399(var23.field2886, var24[var25], var13.field2498, arg5 ^ 0xFFFFFE0B, var18, var26, class116.method959(-128, new class1[] { class93.field2337, var23.field2830 }));
                                                    } else if (var25 == 4) {
                                                        class34.method399(var23.field2886, class15.field488, var13.field2498, -501, var18, 11, class116.method959(94, new class1[] { class93.field2337, var23.field2830 }));
                                                        class6.field236++;
                                                    }
                                                }
                                            }
                                            if (var13.field2464) {
                                                class34.method399(var23.field2886, client.field585, var13.field2498, -501, var18, 19, class116.method959(58, new class1[] { class93.field2337, var23.field2830 }));
                                                class54.field1424++;
                                            }
                                            if (var13.field2536 && var24 != null) {
                                                for (int var27 = 2; var27 >= 0; var27--) {
                                                    if (var24[var27] != null) {
                                                        byte var28 = 0;
                                                        if (var27 == 0) {
                                                            var28 = 52;
                                                        }
                                                        class89.field2193++;
                                                        if (var27 == 1) {
                                                            var28 = 6;
                                                        }
                                                        if (var27 == 2) {
                                                            var28 = 31;
                                                        }
                                                        class34.method399(var23.field2886, var24[var27], var13.field2498, -501, var18, var28, class116.method959(-66, new class1[] { class93.field2337, var23.field2830 }));
                                                    }
                                                }
                                            }
                                            class1[] var29 = var13.field2507;
                                            if (class118.field2937) {
                                                var29 = class109.method908(var29, false);
                                            }
                                            if (var29 != null) {
                                                for (int var30 = 4; var30 >= 0; var30--) {
                                                    if (var29[var30] != null) {
                                                        class80.field2023++;
                                                        byte var31 = 0;
                                                        if (var30 == 0) {
                                                            var31 = 53;
                                                        }
                                                        if (var30 == 1) {
                                                            var31 = 25;
                                                        }
                                                        if (var30 == 2) {
                                                            var31 = 55;
                                                        }
                                                        if (var30 == 3) {
                                                            var31 = 48;
                                                        }
                                                        if (var30 == 4) {
                                                            var31 = 24;
                                                        }
                                                        class34.method399(var23.field2886, var29[var30], var13.field2498, arg5 - 501, var18, var31, class116.method959(68, new class1[] { class93.field2337, var23.field2830 }));
                                                    }
                                                }
                                            }
                                            class34.method399(var23.field2886, class114.field2808, var13.field2498, -501, var18, 1006, class116.method959(118, new class1[] { class93.field2337, var23.field2830 }));
                                        } else if ((class115.field2849 & 0x10) == 16) {
                                            class119.field2959++;
                                            class34.method399(var23.field2886, class60.field1526, var13.field2498, -501, var18, 37, class116.method959(107, new class1[] { class52.field1387, class9.field329, var23.field2830 }));
                                        }
                                    }
                                }
                                var18++;
                            }
                        }
                    }
                    if (var13.field2445 && var13.field2527 != -1 && arg8 >= var15 && arg4 >= var14 && arg8 < var13.field2501 + var15 && arg4 < var13.field2452 + var14) {
                        class133.field3246++;
                        class115 var32 = class89.method763(var13.field2527, 10);
                        if (var13.field2536) {
                            class1[] var33 = var32.field2833;
                            if (class118.field2937) {
                                var33 = class109.method908(var33, false);
                            }
                            if (var33 == null || var33[4] == null) {
                                class34.method399(var32.field2886, class15.field488, var13.field2498, -501, var13.field2545 - 1, 11, class116.method959(107, new class1[] { class93.field2337, var32.field2830 }));
                            } else {
                                class34.method399(var32.field2886, var33[4], var13.field2498, -501, var13.field2545 - 1, 11, class116.method959(-41, new class1[] { class93.field2337, var32.field2830 }));
                            }
                            if (var33 != null && var33[3] != null) {
                                class34.method399(var32.field2886, var33[3], var13.field2498, -501, var13.field2545 - 1, 43, class116.method959(57, new class1[] { class93.field2337, var32.field2830 }));
                            }
                            if (var33 != null && var33[2] != null) {
                                class34.method399(var32.field2886, var33[2], var13.field2498, -501, var13.field2545 - 1, 31, class116.method959(-113, new class1[] { class93.field2337, var32.field2830 }));
                            }
                            if (var33 != null && var33[1] != null) {
                                class34.method399(var32.field2886, var33[1], var13.field2498, -501, var13.field2545 - 1, 6, class116.method959(74, new class1[] { class93.field2337, var32.field2830 }));
                            }
                            if (var33 != null && var33[0] != null) {
                                class34.method399(var32.field2886, var33[0], var13.field2498, -501, var13.field2545 - 1, 52, class116.method959(73, new class1[] { class93.field2337, var32.field2830 }));
                            }
                        }
                        if (var13.field2498 >= 0) {
                            class34.method399(var32.field2886, class114.field2808, var13.field2498, -501, -1, 1007, class116.method959(98, new class1[] { class93.field2337, var32.field2830 }));
                        } else {
                            class34.method399(var32.field2886, class114.field2808, var13.field2457, -501, var13.field2498 & 0x7FFF, 1007, class116.method959(68, new class1[] { class93.field2337, var32.field2830 }));
                        }
                    }
                    if (var13.field2497 && var13.field2470 != null && var15 <= arg8 && var14 <= arg4 && var13.field2501 + var15 > arg8 && arg4 < var13.field2452 + var14) {
                        class1 var34 = class132.field3237;
                        if (var13.field2527 != -1) {
                            class115 var35 = class89.method763(var13.field2527, arg5 ^ 0xA);
                            var34 = class116.method959(arg5 - 67, new class1[] { class93.field2337, var35.field2830 });
                        }
                        for (int var36 = var13.field2470.length - 1; var36 >= 0; var36--) {
                            if (var13.field2470[var36] != null) {
                                if (var13.field2498 < 0) {
                                    class34.method399(var36 + 1, var13.field2470[var36], var13.field2457, arg5 ^ 0xFFFFFE0B, var13.field2498 & 0x7FFF, 50, var34);
                                } else {
                                    class34.method399(var36 + 1, var13.field2470[var36], var13.field2498, arg5 ^ 0xFFFFFE0B, 0, 50, var34);
                                }
                            }
                        }
                    }
                } else if (!var13.field2559 || class66.method634(8247, arg7, var12) || class36.field954) {
                    method847(var13.field2452 + var14, arg1, var15, var13.field2540, arg4, arg5, var12, arg7, arg8, var14, var13.field2555, var15 + var13.field2501);
                    if (var13.field2522 != null) {
                        method847(var14 + var13.field2452, var13.field2522, var15, var13.field2540, arg4, 0, var13.field2498, arg7, arg8, var14, var13.field2555, var13.field2501 + var15);
                    }
                    if (var13.field2452 < var13.field2529) {
                        class9.method193(var13.field2452, arg4, arg8, var13.field2529, (byte) 69, var13, var13.field2501 + var15, arg7, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([BZ)[B", line = 602)
    public final byte[] method848(byte[] arg0, boolean arg1) {
        field2422++;
        if (this.field2414 != null) {
            int var3 = arg0.length * this.field2419 / this.field2417 + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field2414[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2419 + var6;
                int var14 = var13 / this.field2417;
                var6 = var13 - this.field2417 * var14;
                var4 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        if (arg1) {
            method849(-84, null, true, -86);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(II)V", line = 672)
    public class98(int arg0, int arg1) {
        int var3 = class108.method903(arg1, (byte) -62, arg0);
        int var4 = arg0 / var3;
        this.field2417 = var4;
        int var5 = arg1 / var3;
        this.field2419 = var5;
        if (var4 != var5) {
            this.field2414 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2414[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                double var10 = (double) var5 / (double) var4;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = var10;
                    double var16 = ((double) var12 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var10 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILbd;ZI)Ljd;", line = 744)
    public static final class58 method849(int arg0, class11 arg1, boolean arg2, int arg3) {
        field2420++;
        if (class105.method888(arg0, arg3, arg1, -3844)) {
            if (!arg2) {
                method844(3, -92, null, -95, -119, -82, -28, -32);
            }
            return class42.method459(-120);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 759)
    public static final void method850(int arg0) {
        field2416++;
        if (class57.field1453 != null) {
            class57.field1453.method1018(75);
            class57.field1453 = null;
        }
        class62.method598(0);
        class130.field3186.method55();
        int var1 = 0;
        if (arg0 != -7225) {
            field2418 = null;
        }
        while (var1 < 4) {
            class102.field2572[var1].method111(arg0 + 16784441);
            var1++;
        }
        System.gc();
        class72.method675(arg0 ^ 0xFFFFA18E, 10);
        class75.field1863 = 0;
        class122.field3040 = -1;
        class78.method721(arg0 + 7352);
        class34.method400(10, -76);
    }
}
