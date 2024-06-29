import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class165 {

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "[Z")
    public boolean[] field3151 = new boolean[16];

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "[[B")
    public byte[][] field3155 = new byte[6][258];

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "[B")
    public byte[] field3154 = new byte[18002];

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public int field3153 = 0;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "[I")
    public int[] field3152 = new int[6];

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "[I")
    public int[] field3162 = new int[256];

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "[B")
    public byte[] field3160 = new byte[256];

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "[B")
    public byte[] field3170 = new byte[4096];

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[[I")
    public int[][] field3149 = new int[6][258];

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public int field3177 = 0;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "[[I")
    public int[][] field3175 = new int[6][258];

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "[Z")
    public boolean[] field3173 = new boolean[256];

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "[I")
    public int[] field3159 = new int[257];

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "[[I")
    public int[][] field3176 = new int[6][258];

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "[B")
    public byte[] field3156 = new byte[18002];

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "[I")
    public int[] field3182 = new int[16];

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field3147 = 20;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "[I")
    public static int[] field3178 = new int[500];

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "B")
    public byte field3184;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public int field3157;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public int field3163;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public int field3164;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public int field3166;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public int field3168;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public int field3172;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public int field3174;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public int field3180;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public int field3183;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "[B")
    public byte[] field3171;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "[B")
    public byte[] field3185;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([Lq;IIZIIIIII)V")
    public static final void method1133(class174[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3165++;
        class72.method480(arg1, arg2, arg9, arg5);
        if (!arg3) {
            field3178 = null;
        }
        class173.method1237();
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class174 var11 = arg0[var10];
            if (var11 != null && (var11.field3506 == arg8 || arg8 == -1412584499 && class179.field3570 == var11)) {
                int var12;
                if (arg4 == -1) {
                    class81.field1455[class206.field3925] = var11.field3368 + arg6;
                    class132.field2473[class206.field3925] = var11.field3443 + arg7;
                    class133.field2487[class206.field3925] = var11.field3382;
                    class80.field1447[class206.field3925] = var11.field3424;
                    var12 = class206.field3925++;
                } else {
                    var12 = arg4;
                }
                var11.field3373 = class117.field2115;
                var11.field3384 = var12;
                if (!var11.field3412 || !class71.method475(0, var11)) {
                    if (var11.field3441 > 0) {
                        class16.method78(6479, var11);
                    }
                    int var13 = var11.field3368 + arg6;
                    int var14 = var11.field3443 + arg7;
                    int var15 = var11.field3482;
                    if (class116.field2105 && (class80.method530(-881710560, var11) != 0 || var11.field3392 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class179.field3570 == var11) {
                        if (arg8 != -1412584499 && !var11.field3429) {
                            class6.field77 = arg7;
                            class179.field3566 = arg0;
                            class94.field1757 = arg6;
                            continue;
                        }
                        if (!var11.field3429) {
                            var15 = 128;
                        }
                        if (class203.field3869 && class29.field487) {
                            int var16 = class28.field471;
                            int var17 = var16 - class148.field2793;
                            if (class127.field2373 > var17) {
                                var17 = class127.field2373;
                            }
                            if (class127.field2373 + class49.field923.field3382 < var11.field3382 + var17) {
                                var17 = class127.field2373 + class49.field923.field3382 - var11.field3382;
                            }
                            var13 = var17;
                            int var18 = class239.field4451;
                            int var19 = var18 - class207.field3943;
                            if (class28.field466 > var19) {
                                var19 = class28.field466;
                            }
                            if (var11.field3424 + var19 > class28.field466 - -class49.field923.field3424) {
                                var19 = class49.field923.field3424 + class28.field466 - var11.field3424;
                            }
                            var14 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field3392 == 2) {
                        var20 = arg2;
                        var21 = arg9;
                        var22 = arg5;
                        var23 = arg1;
                    } else {
                        var20 = var14 <= arg2 ? arg2 : var14;
                        var23 = arg1 >= var13 ? arg1 : var13;
                        int var24 = var11.field3382 + var13;
                        int var25 = var14 + var11.field3424;
                        if (var11.field3392 == 9) {
                            var25++;
                            var24++;
                        }
                        var22 = var25 >= arg5 ? arg5 : var25;
                        var21 = arg9 <= var24 ? arg9 : var24;
                    }
                    if (!var11.field3412 || var23 < var21 && var20 < var22) {
                        if (var11.field3441 != 0) {
                            if (var11.field3441 == 1337) {
                                class58.field1101 = var13;
                                class133.field2489 = var14;
                                class37.method248(var11.field3382, var13, var11.field3424, (byte) 78, var14);
                                class72.method480(arg1, arg2, arg9, arg5);
                                continue;
                            }
                            if (var11.field3441 == 1338) {
                                if (var11.method1248(-15543)) {
                                    class121.method826(var11, var12, var13, (byte) 58, var14);
                                    class72.method480(arg1, arg2, arg9, arg5);
                                }
                                continue;
                            }
                            if (var11.field3441 == 1339) {
                                if (var11.method1248(-15543)) {
                                    class109.method745(var12, var13, var14, var11, (byte) -91);
                                    class72.method480(arg1, arg2, arg9, arg5);
                                }
                                continue;
                            }
                            if (var11.field3441 == 1400) {
                                class104.method721((byte) 103, var11.field3382, var11.field3424, var13, var14);
                                class225.field4230[var12] = true;
                                class211.field4007[var12] = true;
                                class72.method480(arg1, arg2, arg9, arg5);
                                continue;
                            }
                            if (var11.field3441 == 1401) {
                                class241.method1592(var14, var13, var11.field3382, var11.field3424, 128);
                                class225.field4230[var12] = true;
                                class211.field4007[var12] = true;
                                class72.method480(arg1, arg2, arg9, arg5);
                                continue;
                            }
                        }
                        int var26 = class28.field471;
                        if (var11.field3392 == 0 && var11.field3472 && var23 <= class28.field471 && class239.field4451 >= var20 && var21 > class28.field471 && class239.field4451 < var22 && !class108.field1960 && !class116.field2105) {
                            class203.field3864 = 1;
                            class66.field1191[0] = class6.field76;
                            class201.field3838[0] = class174.field3455;
                            class53.field994[0] = 1007;
                        }
                        int var27 = class239.field4451;
                        if (!class108.field1960 && var26 >= var23 && var27 >= var20 && var26 < var21 && var22 > var27) {
                            class12.method65(var27 - var14, -var13 + var26, var11, (byte) 74);
                        }
                        if (var11.field3392 == 0) {
                            if (!var11.field3412 && class71.method475(0, var11) && class65.field1177 != var11) {
                                continue;
                            }
                            if (!var11.field3412) {
                                if (var11.field3417 > var11.field3377 - var11.field3424) {
                                    var11.field3417 = var11.field3377 - var11.field3424;
                                }
                                if (var11.field3417 < 0) {
                                    var11.field3417 = 0;
                                }
                            }
                            method1133(arg0, var23, var20, true, var12, var22, var13 - var11.field3395, -var11.field3417 + var14, var11.field3425, var21);
                            if (var11.field3467 != null) {
                                method1133(var11.field3467, var23, var20, true, var12, var22, var13 - var11.field3395, -var11.field3417 + var14, var11.field3425, var21);
                            }
                            class168 var28 = (class168) class128.field2397.method1051(-1, (long) var11.field3425);
                            if (var28 != null) {
                                if (var28.field3235 == 0 && var23 <= class28.field471 && var20 <= class239.field4451 && class28.field471 < var21 && class239.field4451 < var22 && !class108.field1960 && !class116.field2105) {
                                    class53.field994[0] = 1007;
                                    class203.field3864 = 1;
                                    class66.field1191[0] = class6.field76;
                                    class201.field3838[0] = class174.field3455;
                                }
                                class53.method393(var22, var28.field3231, (byte) -39, var20, var12, var14, var23, var13, var21);
                            }
                            class72.method480(arg1, arg2, arg9, arg5);
                            class173.method1237();
                        }
                        if (class113.field2045[var12] || class134.field2505 > 1) {
                            if (var11.field3392 == 0 && !var11.field3412 && var11.field3424 < var11.field3377) {
                                class241.method1594(var11.field3417, 17, var11.field3424, var14, var11.field3377, var13 + var11.field3382);
                            }
                            if (var11.field3392 != 1) {
                                if (var11.field3392 == 2) {
                                    int var29 = 0;
                                    for (int var30 = 0; var30 < var11.field3420; var30++) {
                                        for (int var31 = 0; var31 < var11.field3503; var31++) {
                                            int var32 = var14 + (var11.field3510 + 32) * var30;
                                            int var33 = var13 + (var11.field3468 + 32) * var31;
                                            if (var29 < 20) {
                                                var33 += var11.field3474[var29];
                                                var32 += var11.field3399[var29];
                                            }
                                            if (var11.field3390[var29] > 0) {
                                                boolean var35 = false;
                                                boolean var36 = false;
                                                int var37 = var11.field3390[var29] - 1;
                                                if (var33 + 32 > arg1 && var33 < arg9 && arg2 < var32 + 32 && var32 < arg5 || class135.field2516 == var11 && class18.field305 == var29) {
                                                    class188 var38;
                                                    if (class28.field475 == 1 && class58.field1105 == var29 && class209.field3967 == var11.field3425) {
                                                        var38 = class22.method117(2, (byte) -109, var37, var11.field3476[var29], var11.field3466, 0);
                                                    } else {
                                                        var38 = class22.method117(1, (byte) -127, var37, var11.field3476[var29], var11.field3466, 3153952);
                                                    }
                                                    if (class173.field3366) {
                                                        class225.field4230[var12] = true;
                                                    }
                                                    if (var38 == null) {
                                                        class200.method1373(65280, var11);
                                                    } else if (class135.field2516 == var11 && class18.field305 == var29) {
                                                        int var39 = class28.field471 - class219.field4148;
                                                        int var40 = class239.field4451 - class48.field894;
                                                        if (var39 < 5 && var39 > -5) {
                                                            var39 = 0;
                                                        }
                                                        if (var40 < 5 && var40 > -5) {
                                                            var40 = 0;
                                                        }
                                                        if (class248.field4537 < 5) {
                                                            var39 = 0;
                                                            var40 = 0;
                                                        }
                                                        var38.method1166(var33 + var39, var32 + var40, 128);
                                                        if (arg8 != -1) {
                                                            class174 var41 = arg0[arg8 & 0xFFFF];
                                                            int var42 = class72.field1335;
                                                            int var43 = class72.field1334;
                                                            if (var32 + var40 < var43 && var41.field3417 > 0) {
                                                                int var44 = (var43 - var32 - var40) * class17.field261 / 3;
                                                                if (class17.field261 * 10 < var44) {
                                                                    var44 = class17.field261 * 10;
                                                                }
                                                                if (var41.field3417 < var44) {
                                                                    var44 = var41.field3417;
                                                                }
                                                                var41.field3417 -= var44;
                                                                class48.field894 += var44;
                                                                class200.method1373(65280, var41);
                                                            }
                                                            if (var32 + var40 + 32 > var42 && var41.field3377 - var41.field3424 > var41.field3417) {
                                                                int var45 = (var32 + var40 + 32 - var42) * class17.field261 / 3;
                                                                if (class17.field261 * 10 < var45) {
                                                                    var45 = class17.field261 * 10;
                                                                }
                                                                if (var41.field3377 - var41.field3424 - var41.field3417 < var45) {
                                                                    var45 = var41.field3377 - var41.field3424 - var41.field3417;
                                                                }
                                                                var41.field3417 += var45;
                                                                class48.field894 -= var45;
                                                                class200.method1373(65280, var41);
                                                            }
                                                        }
                                                    } else if (class57.field1091 == var11 && class93.field1743 == var29) {
                                                        var38.method1166(var33, var32, 128);
                                                    } else {
                                                        var38.method1157(var33, var32);
                                                    }
                                                }
                                            } else if (var11.field3391 != null && var29 < 20) {
                                                class188 var34 = var11.method1250(var29, (byte) -120);
                                                if (var34 != null) {
                                                    var34.method1157(var33, var32);
                                                } else if (class248.field4551) {
                                                    class200.method1373(65280, var11);
                                                }
                                            }
                                            var29++;
                                        }
                                    }
                                } else if (var11.field3392 == 3) {
                                    int var46;
                                    if (class80.method533(-31987, var11)) {
                                        var46 = var11.field3515;
                                        if (class65.field1177 == var11 && var11.field3376 != 0) {
                                            var46 = var11.field3376;
                                        }
                                    } else {
                                        var46 = var11.field3416;
                                        if (class65.field1177 == var11 && var11.field3433 != 0) {
                                            var46 = var11.field3433;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3498) {
                                            class72.method478(var13, var14, var11.field3382, var11.field3424, var46);
                                        } else {
                                            class72.method476(var13, var14, var11.field3382, var11.field3424, var46);
                                        }
                                    } else if (var11.field3498) {
                                        class72.method497(var13, var14, var11.field3382, var11.field3424, var46, 256 - (var15 & 0xFF));
                                    } else {
                                        class72.method484(var13, var14, var11.field3382, var11.field3424, var46, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3392 == 4) {
                                    class26 var47 = var11.method1254(-2, class34.field587);
                                    if (var47 != null) {
                                        class88 var48 = var11.field3385;
                                        int var49;
                                        if (class80.method533(-31987, var11)) {
                                            var49 = var11.field3515;
                                            if (class65.field1177 == var11 && var11.field3376 != 0) {
                                                var49 = var11.field3376;
                                            }
                                            if (var11.field3448.method604((byte) -53) > 0) {
                                                var48 = var11.field3448;
                                            }
                                        } else {
                                            var49 = var11.field3416;
                                            if (class65.field1177 == var11 && var11.field3433 != 0) {
                                                var49 = var11.field3433;
                                            }
                                        }
                                        if (var11.field3412 && var11.field3401 != -1) {
                                            class149 var50 = class71.method472(var11.field3401, (byte) -119);
                                            var48 = var50.field2894;
                                            if (var48 == null) {
                                                var48 = class180.field3574;
                                            }
                                            if ((var50.field2854 == 1 || var11.field3484 != 1) && var11.field3484 != -1) {
                                                var48 = class166.method1142(new class88[] { class136.field2531, var48, class32.field523, class144.method960(0, var11.field3484) }, -3);
                                            }
                                        }
                                        if (class53.field967 == var11) {
                                            var48 = class143.field2652;
                                            var49 = var11.field3416;
                                        }
                                        if (!var11.field3412) {
                                            var48 = class161.method1086(var48, var11, 64);
                                        }
                                        var47.method153(var48, var13, var14, var11.field3382, var11.field3424, var49, var11.field3437 ? 0 : -1, var11.field3481, var11.field3471, var11.field3398);
                                    } else if (class248.field4551) {
                                        class200.method1373(65280, var11);
                                    }
                                } else if (var11.field3392 == 5) {
                                    if (var11.field3412) {
                                        class188 var51;
                                        if (var11.field3401 == -1) {
                                            var51 = var11.method1251(false, -100);
                                        } else {
                                            var51 = class22.method117(var11.field3431, (byte) -101, var11.field3401, var11.field3484, var11.field3466, var11.field3427);
                                        }
                                        if (var51 != null) {
                                            int var52 = var51.field3651;
                                            int var53 = var51.field3647;
                                            if (var11.field3422) {
                                                int var55 = (var52 + var11.field3382 - 1) / var52;
                                                int var56 = (var11.field3424 + var53 - 1) / var53;
                                                class72.method493(var13, var14, var11.field3382 + var13, var11.field3424 + var14);
                                                for (int var57 = 0; var57 < var55; var57++) {
                                                    for (int var58 = 0; var58 < var56; var58++) {
                                                        if (var11.field3439 != 0) {
                                                            var51.method1311(true, var53 / 2 + var53 * var58 + var14, var52 * var57 + var13 - -(var52 / 2), 4096, var11.field3439);
                                                        } else if (var15 == 0) {
                                                            var51.method1157(var52 * var57 + var13, var53 * var58 + var14);
                                                        } else {
                                                            var51.method1166(var52 * var57 + var13, var53 * var58 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class72.method480(arg1, arg2, arg9, arg5);
                                            } else {
                                                int var54 = var11.field3382 * 4096 / var52;
                                                if (var11.field3439 != 0) {
                                                    var51.method1311(arg3, var11.field3424 / 2 + var14, var13 - -(var11.field3382 / 2), var54, var11.field3439);
                                                } else if (var15 != 0) {
                                                    var51.method1176(var13, var14, var11.field3382, var11.field3424, 256 - (var15 & 0xFF));
                                                } else if (var11.field3382 == var52 && var11.field3424 == var53) {
                                                    var51.method1157(var13, var14);
                                                } else {
                                                    var51.method1164(var13, var14, var11.field3382, var11.field3424);
                                                }
                                            }
                                        } else if (class248.field4551) {
                                            class200.method1373(65280, var11);
                                        }
                                    } else {
                                        class188 var59 = var11.method1251(class80.method533(-31987, var11), -108);
                                        if (var59 != null) {
                                            var59.method1157(var13, var14);
                                        } else if (class248.field4551) {
                                            class200.method1373(65280, var11);
                                        }
                                    }
                                } else if (var11.field3392 == 6) {
                                    boolean var60 = class80.method533(-31987, var11);
                                    int var61 = 0;
                                    class30 var62 = null;
                                    int var63;
                                    if (var60) {
                                        var63 = var11.field3388;
                                    } else {
                                        var63 = var11.field3406;
                                    }
                                    if (var11.field3401 != -1) {
                                        class149 var68 = class71.method472(var11.field3401, (byte) -89);
                                        if (var68 != null) {
                                            class149 var69 = var68.method1023(var11.field3484, 27676);
                                            var62 = var69.method1027(1, 1, 0, null);
                                            if (var62 == null) {
                                                class200.method1373(65280, var11);
                                            } else {
                                                var61 = -var62.method88() / 2;
                                            }
                                        }
                                    } else if (var11.field3432 == 5) {
                                        if (var11.field3411 == -1) {
                                            var62 = class130.field2443.method1432(null, 1549114312, -1, -1, null);
                                        } else {
                                            int var65 = var11.field3411 & 0x7FF;
                                            if (class220.field4166 == var65) {
                                                var65 = 2047;
                                            }
                                            class44 var66 = class244.field4493[var65];
                                            class109 var67 = var63 == -1 ? null : class15.method75(var63, (byte) -38);
                                            if (var66 != null && (int) var66.field766.method630(false) << 11 == (var11.field3411 & 0xFFFFF800)) {
                                                var62 = var66.field768.method1432(null, 1549114312, var11.field3381, 0, var67);
                                            }
                                        }
                                    } else if (var63 == -1) {
                                        var62 = var11.method1247(null, class240.field4458.field768, -1, var60, -3);
                                        if (var62 == null && class248.field4551) {
                                            class200.method1373(65280, var11);
                                        }
                                    } else {
                                        class109 var64 = class15.method75(var63, (byte) 98);
                                        var62 = var11.method1247(var64, class240.field4458.field768, var11.field3381, var60, -3);
                                        if (var62 == null && class248.field4551) {
                                            class200.method1373(65280, var11);
                                        }
                                    }
                                    if (var62 != null) {
                                        int var70;
                                        if (var11.field3419 <= 0) {
                                            var70 = 256;
                                        } else {
                                            var70 = (var11.field3424 << 8) / var11.field3419;
                                        }
                                        int var71;
                                        if (var11.field3470 <= 0) {
                                            var71 = 256;
                                        } else {
                                            var71 = (var11.field3382 << 8) / var11.field3470;
                                        }
                                        int var72 = var11.field3382 / 2 + var13 + (var11.field3434 * var71 >> 8);
                                        int var73 = (var11.field3407 * var70 >> 8) + var11.field3424 / 2 + var14;
                                        class173.method1230(var72, var73);
                                        int var74 = class173.field3356[var11.field3457] * var11.field3487 >> 16;
                                        int var75 = class173.field3361[var11.field3457] * var11.field3487 >> 16;
                                        if (!var11.field3412) {
                                            var62.method193(0, var11.field3511, 0, var11.field3457, 0, var75, var74);
                                        } else if (var11.field3405) {
                                            ((class125) var62).method851(0, var11.field3511, var11.field3519, var11.field3457, var11.field3367, var75 + var11.field3500 + var61, var11.field3500 + var74, var11.field3487);
                                        } else {
                                            var62.method193(0, var11.field3511, var11.field3519, var11.field3457, var11.field3367, var61 + var75 + var11.field3500, var11.field3500 + var74);
                                        }
                                        class173.method1241();
                                    }
                                } else {
                                    if (var11.field3392 == 7) {
                                        class26 var76 = var11.method1254(-2, class34.field587);
                                        if (var76 == null) {
                                            if (class248.field4551) {
                                                class200.method1373(65280, var11);
                                            }
                                            continue;
                                        }
                                        int var77 = 0;
                                        for (int var78 = 0; var78 < var11.field3420; var78++) {
                                            for (int var79 = 0; var79 < var11.field3503; var79++) {
                                                if (var11.field3390[var77] > 0) {
                                                    class149 var80 = class71.method472(var11.field3390[var77] - 1, (byte) -126);
                                                    class88 var81;
                                                    if (var80.field2854 != 1 && var11.field3476[var77] == 1) {
                                                        var81 = class166.method1142(new class88[] { class136.field2531, var80.field2894, class120.field2201 }, -3);
                                                    } else {
                                                        var81 = class166.method1142(new class88[] { class136.field2531, var80.field2894, class32.field523, class144.method960(0, var11.field3476[var77]) }, -3);
                                                    }
                                                    int var82 = (var11.field3468 + 115) * var79 + var13;
                                                    int var83 = (var11.field3510 + 12) * var78 + var14;
                                                    if (var11.field3481 == 0) {
                                                        var76.method154(var81, var82, var83, var11.field3416, var11.field3437 ? 0 : -1);
                                                    } else if (var11.field3481 == 1) {
                                                        var76.method141(var81, var82 + 57, var83, var11.field3416, var11.field3437 ? 0 : -1);
                                                    } else {
                                                        var76.method150(var81, var82 + 115 - 1, var83, var11.field3416, var11.field3437 ? 0 : -1);
                                                    }
                                                }
                                                var77++;
                                            }
                                        }
                                    }
                                    if (var11.field3392 == 8 && class36.field635 == var11 && class46.field859 == class138.field2565) {
                                        int var84 = 0;
                                        class88 var85 = var11.field3385;
                                        class26 var86 = class3.field30;
                                        class88 var87 = class161.method1086(var85, var11, 64);
                                        int var88 = 0;
                                        while (var87.method604((byte) -53) > 0) {
                                            int var96 = var87.method617(-29, class142.field2620);
                                            class88 var97;
                                            if (var96 == -1) {
                                                var97 = var87;
                                                var87 = class174.field3455;
                                            } else {
                                                var97 = var87.method623(0, (byte) -23, var96);
                                                var87 = var87.method635(var96 + 4, -383902332);
                                            }
                                            int var98 = var86.method158(var97);
                                            if (var98 > var84) {
                                                var84 = var98;
                                            }
                                            var88 += var86.field416 + 1;
                                        }
                                        var84 += 6;
                                        var88 += 7;
                                        int var89 = var11.field3382 + var13 - var84 - 5;
                                        if (var89 < var13 + 5) {
                                            var89 = var13 + 5;
                                        }
                                        if (var89 + var84 > arg9) {
                                            var89 = arg9 - var84;
                                        }
                                        int var90 = var11.field3424 + var14 + 5;
                                        if (arg5 < var90 + var88) {
                                            var90 = arg5 - var88;
                                        }
                                        class72.method478(var89, var90, var84, var88, 16777120);
                                        class72.method476(var89, var90, var84, var88, 0);
                                        int var91 = var90 + var86.field416 + 2;
                                        class88 var92 = var11.field3385;
                                        class88 var93 = class161.method1086(var92, var11, 64);
                                        while (var93.method604((byte) -53) > 0) {
                                            int var94 = var93.method617(121, class142.field2620);
                                            class88 var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = class174.field3455;
                                            } else {
                                                var95 = var93.method623(0, (byte) -85, var94);
                                                var93 = var93.method635(var94 + 4, -383902332);
                                            }
                                            var86.method154(var95, var89 + 3, var91, 0, -1);
                                            var91 += var86.field416 + 1;
                                        }
                                    }
                                    if (var11.field3392 == 9) {
                                        int var99;
                                        int var100;
                                        int var101;
                                        int var102;
                                        if (var11.field3494) {
                                            var99 = var13;
                                            var100 = var11.field3424 + var14;
                                            var101 = var14;
                                            var102 = var13 + var11.field3382;
                                        } else {
                                            var101 = var14 + var11.field3424;
                                            var102 = var11.field3382 + var13;
                                            var99 = var13;
                                            var100 = var14;
                                        }
                                        if (var11.field3499 == 1) {
                                            class72.method477(var99, var100, var102, var101, var11.field3416);
                                        } else {
                                            class72.method485(var99, var100, var102, var101, var11.field3416, var11.field3499);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILi;)V")
    public static final void method1134(int arg0, class88 arg1) {
        field3188++;
        if (class126.field2326.field3599 == null) {
            return;
        }
        try {
            class88 var2 = class227.field4267.method608(class126.field2326.field3599, -64);
            class88 var3 = class247.field4518.method608(class126.field2326.field3599, 116);
            class88 var4 = class166.method1142(new class88[] { var2, class36.field651, arg1, class54.field1005, var3 }, -3);
            class88 var5;
            if (arg0 == arg1.method604((byte) -53)) {
                var5 = class166.method1142(new class88[] { var4, class49.field920 }, arg0 - 3);
            } else {
                var5 = class166.method1142(new class88[] { var4, class109.field1984, method1141(class206.method1420(false) + 94608000000L, 7085), class95.field1768, class234.method1558(arg0 + 75, 94608000L) }, -3);
            }
            class166.method1142(new class88[] { class168.field3239, var5, class34.field591 }, -3).method636(0, class126.field2326.field3599);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[Li;II)Li;")
    public static final class88 method1135(int arg0, class88[] arg1, int arg2, int arg3) {
        int var4 = 0;
        field3181++;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg1[arg3 + var5] == null) {
                arg1[arg3 + var5] = class15.field233;
            }
            var4 += arg1[arg3 + var5].field1660;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg0; var8++) {
            class88 var11 = arg1[arg3 + var8];
            class124.method838(var11.field1643, 0, var7, var6, var11.field1660);
            var6 += var11.field1660;
        }
        class88 var9 = new class88();
        var9.field1643 = var7;
        int var10 = 17 / ((60 - arg2) / 41);
        var9.field1660 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLnb;Lpg;Lnb;Lnb;)Z")
    public static final boolean method1136(byte arg0, class144 arg1, class170 arg2, class144 arg3, class144 arg4) {
        class31.field503 = arg2;
        field3158++;
        class86.field1553 = arg1;
        if (arg0 > -99) {
            method1138((byte) -37);
        }
        class153.field2957 = arg3;
        class12.field177 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)Li;")
    public static final class88 method1137(int arg0, byte arg1) {
        field3167++;
        class88 var2 = new class88();
        var2.field1660 = 0;
        if (arg1 <= 3) {
            field3147 = 74;
        }
        var2.field1643 = new byte[arg0];
        return var2;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method1138(byte arg0) {
        int var1 = 122 % ((arg0 + 16) / 57);
        field3178 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
    public static final void method1139(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class126.field2332 = class109.field1990 * arg3 / arg1;
        field3161++;
        class157.field3035 = class44.field760 * arg2 / arg4;
        class34.field594 = -1;
        class189.field3661 = -1;
        class245.method1606(0);
        if (arg0 < 106) {
            field3147 = 41;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(ILi;)V")
    public static final void method1140(int arg0, class88 arg1) {
        field3148++;
        if (arg0 != -4) {
            method1140(124, null);
        }
        try {
            class55.field1032.getAppletContext().showDocument(arg1.method632(class55.field1032.getCodeBase(), (byte) -121), "_blank");
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(JI)Li;")
    private static final class88 method1141(long arg0, int arg1) {
        field3150++;
        class248.field4547.setTime(new Date(arg0));
        int var3 = class248.field4547.get(7);
        if (arg1 != 7085) {
            return null;
        }
        int var4 = class248.field4547.get(5);
        int var5 = class248.field4547.get(2);
        int var6 = class248.field4547.get(1);
        int var7 = class248.field4547.get(11);
        int var8 = class248.field4547.get(12);
        int var9 = class248.field4547.get(13);
        return class166.method1142(new class88[] { class89.field1674[var3 - 1], class196.field3774, class170.method1214(var4 / 10, 106), class170.method1214(var4 % 10, 97), class164.field3137, class36.field658[var5], class164.field3137, class170.method1214(var6, 68), class227.field4264, class170.method1214(var7 / 10, -118), class170.method1214(var7 % 10, -84), class109.field1961, class170.method1214(var8 / 10, -111), class170.method1214(var8 % 10, -108), class109.field1961, class170.method1214(var9 / 10, arg1 ^ 0x1BA1), class170.method1214(var9 % 10, arg1 ^ 0xFFFFE42E), class6.field82 }, -3);
    }
}
