import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 {

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Lwd;")
    private static class150 field421 = class2.method9(true, "System update in: ");

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lwd;")
    public static class150 field420 = field421;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field422 = 500;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Z")
    public static boolean field418 = false;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "[I")
    public static int[] field423 = new int[2000];

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lwd;")
    public static class150 field419 = class2.method9(true, "Freunde)2Server)3)3)3");

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Lwd;")
    public static class150 field427 = class2.method9(true, " loggt sich aus)3");

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Lwd;")
    public static class150 field429 = class2.method9(true, "blinken1:");

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lwd;")
    private static class150 field430 = class2.method9(true, "FULL");

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lwd;")
    public static class150 field428 = field430;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lqd;")
    public static class114 field416;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Lce;")
    public static class20 field415;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIBII[Lva;III)Z")
    public static final boolean method114(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class141[] arg6, int arg7, int arg8, int arg9) {
        if (arg3 != -118) {
            field419 = null;
        }
        class120.method874(arg7, arg1, arg5, arg0);
        field424++;
        boolean var10 = true;
        for (int var11 = 0; var11 < arg6.length; var11++) {
            class141 var12 = arg6[var11];
            if (var12 != null && (var12.field3298 == arg9 || arg9 == -1412584499 && class80.field1938 == var12)) {
                if (var12.field3338 > 0) {
                    class56.method434(-3, var12);
                }
                int var13 = var12.field3304 + arg7 - arg4;
                int var14 = arg1 + var12.field3353 - arg2;
                int var15 = var12.field3380;
                if (class80.field1938 == var12) {
                    if (arg9 != -1412584499 && !var12.field3347) {
                        class49.field1301 = arg2 - arg1;
                        class49.field1316 = arg6;
                        class49.field1285 = arg4 - arg7;
                        continue;
                    }
                    class141 var16 = class146.method1096((byte) -70, var12);
                    if (var16 == null) {
                        class80.field1938 = null;
                    } else {
                        int var17 = class111.field2557;
                        int var18 = class113.field2602;
                        if (class137.field3221 == 0) {
                            var18 -= 4;
                            var17 -= 4;
                        }
                        if (class137.field3221 == 1) {
                            var17 -= 553;
                            var18 -= 205;
                        }
                        if (class137.field3221 == 2) {
                            var18 -= 357;
                            var17 -= 17;
                        }
                        int var19 = var18 - class55.field1444;
                        int var20 = var17 - class95.field2209;
                        int[] var21 = class88.method631(var16, (byte) 127);
                        if (var19 < var21[1]) {
                            var19 = var21[1];
                        }
                        if (var21[0] > var20) {
                            var20 = var21[0];
                        }
                        if (var21[1] + var16.field3326 < var12.field3326 + var19) {
                            var19 = var21[1] + var16.field3326 - var12.field3326;
                        }
                        class141 var22 = class58.field1500[var12.field3323 >> 16][var12.field3298 & 0xFFFF];
                        if (var21[0] + var16.field3321 < var12.field3321 + var20) {
                            var20 = var21[0] + var16.field3321 - var12.field3321;
                        }
                        int[] var23 = class88.method631(var22, (byte) 123);
                        int var24 = var22.field3309 + var19 - var23[1];
                        int var25 = var20 + var22.field3390 - var23[0];
                        if (!var12.field3347) {
                            var15 = 128;
                        }
                        int var26 = var24 - var12.field3353;
                        int var27 = var25 - var12.field3304;
                        if (var12.field3299 >= var27 && -var12.field3299 <= var27 && var12.field3299 >= var26 && -var12.field3299 <= var26 && !class116.field2660) {
                            var27 = 0;
                            var26 = 0;
                        } else if (var12.field3417 >= class54.field1426 && !class116.field2660) {
                            var27 = 0;
                            var26 = 0;
                        }
                        var14 += var26;
                        var13 += var27;
                    }
                }
                if ((!var12.field3370 || class120.field2776 >= var13 && var14 <= class120.field2773 && class120.field2774 <= var13 + var12.field3321 && var12.field3326 + var14 >= class120.field2770) && (!var12.field3370 || !class80.method579(arg3 + 156, var12))) {
                    if (var12.field3354 == 0) {
                        if (!var12.field3370 && class80.method579(45, var12) && !class35.method267(var11, arg8, arg3 + 118)) {
                            continue;
                        }
                        if (!var12.field3370) {
                            if (var12.field3309 > var12.field3382 - var12.field3326) {
                                var12.field3309 = var12.field3382 - var12.field3326;
                            }
                            if (var12.field3309 < 0) {
                                var12.field3309 = 0;
                            }
                        }
                        var10 &= method114(var12.field3326 + var14, var14, var12.field3309, (byte) -118, var12.field3390, var12.field3321 + var13, arg6, var13, arg8, var12.field3323);
                        if (var12.field3367 != null) {
                            var10 &= method114(var12.field3326 + var14, var14, var12.field3309, (byte) -118, var12.field3390, var12.field3321 + var13, var12.field3367, var13, arg8, var12.field3323);
                        }
                        class120.method874(arg7, arg1, arg5, arg0);
                        if (var12.field3382 > var12.field3326 && !var12.field3370) {
                            class26.method211(var12.field3326, var12.field3382, var12.field3321 + var13, var14, 27714, var12.field3309);
                        }
                    }
                    if (var12.field3354 != 1) {
                        if (var12.field3354 == 2) {
                            int var28 = 0;
                            for (int var29 = 0; var29 < var12.field3326; var29++) {
                                for (int var30 = 0; var30 < var12.field3321; var30++) {
                                    int var31 = var14 + (var12.field3374 + 32) * var29;
                                    int var32 = (var12.field3407 + 32) * var30 + var13;
                                    if (var28 < 20) {
                                        var32 += var12.field3381[var28];
                                        var31 += var12.field3372[var28];
                                    }
                                    if (var12.field3341[var28] > 0) {
                                        boolean var34 = false;
                                        int var35 = var12.field3341[var28] - 1;
                                        boolean var36 = false;
                                        if (class120.field2774 - 32 < var32 && var32 < class120.field2776 && var31 > class120.field2770 - 32 && class120.field2773 > var31 || class113.field2608 != 0 && class25.field748 == var28) {
                                            class51 var37;
                                            if (class130.field3060 == 1 && class49.field1299 == var28 && class42.field1114 == var12.field3323) {
                                                var37 = class99.method686(false, var35, 0, 2, var12.field3334[var28], (byte) 108);
                                            } else {
                                                var37 = class99.method686(false, var35, 3153952, 1, var12.field3334[var28], (byte) 106);
                                            }
                                            if (var37 == null) {
                                                var10 = false;
                                            } else if (class113.field2608 != 0 && class25.field748 == var28 && class32.field942 == var12.field3323) {
                                                int var38 = class111.field2557 - class58.field1498;
                                                int var39 = class113.field2602 - class65.field1643;
                                                if (var38 < 5 && var38 > -5) {
                                                    var38 = 0;
                                                }
                                                if (var39 < 5 && var39 > -5) {
                                                    var39 = 0;
                                                }
                                                if (class145.field3522 < 5) {
                                                    var38 = 0;
                                                    var39 = 0;
                                                }
                                                var37.method392(var32 + var38, var31 - -var39, 128);
                                                if (arg9 != -1) {
                                                    class141 var40 = arg6[arg9 & 0xFFFF];
                                                    if (var31 + var39 < class120.field2770 && var40.field3309 > 0) {
                                                        int var41 = (class120.field2770 - var39 - var31) * class128.field3030 / 3;
                                                        if (class128.field3030 * 10 < var41) {
                                                            var41 = class128.field3030 * 10;
                                                        }
                                                        if (var41 > var40.field3309) {
                                                            var41 = var40.field3309;
                                                        }
                                                        var40.field3309 -= var41;
                                                        class65.field1643 += var41;
                                                    }
                                                    if (var31 + var39 + 32 > class120.field2773 && var40.field3382 - var40.field3326 > var40.field3309) {
                                                        int var42 = (var31 + var39 + 32 - class120.field2773) * class128.field3030 / 3;
                                                        if (var42 > class128.field3030 * 10) {
                                                            var42 = class128.field3030 * 10;
                                                        }
                                                        if (var40.field3382 - var40.field3309 - var40.field3326 < var42) {
                                                            var42 = var40.field3382 - var40.field3326 - var40.field3309;
                                                        }
                                                        class65.field1643 -= var42;
                                                        var40.field3309 += var42;
                                                    }
                                                }
                                            } else if (class103.field2330 != 0 && class103.field2328 == var28 && class41.field1092 == var12.field3323) {
                                                var37.method392(var32, var31, 128);
                                            } else {
                                                var37.method398(var32, var31);
                                            }
                                        }
                                    } else if (var12.field3362 != null && var28 < 20) {
                                        class51 var33 = var12.method1068(arg3 ^ 0xFFFFFF8A, var28);
                                        if (var33 != null) {
                                            var33.method398(var32, var31);
                                        } else if (class50.field1325) {
                                            var10 = false;
                                        }
                                    }
                                    var28++;
                                }
                            }
                        } else if (var12.field3354 == 3) {
                            int var43;
                            if (class121.method884(0, var12)) {
                                var43 = var12.field3388;
                                if (class35.method267(var11, arg8, 0) && var12.field3317 != 0) {
                                    var43 = var12.field3317;
                                }
                            } else {
                                var43 = var12.field3412;
                                if (class35.method267(var11, arg8, 0) && var12.field3294 != 0) {
                                    var43 = var12.field3294;
                                }
                            }
                            if (var15 == 0) {
                                if (var12.field3320) {
                                    class120.method872(var13, var14, var12.field3321, var12.field3326, var43);
                                } else {
                                    class120.method866(var13, var14, var12.field3321, var12.field3326, var43);
                                }
                            } else if (var12.field3320) {
                                class120.method869(var13, var14, var12.field3321, var12.field3326, var43, 256 - (var15 & 0xFF));
                            } else {
                                class120.method882(var13, var14, var12.field3321, var12.field3326, var43, 256 - (var15 & 0xFF));
                            }
                        } else if (var12.field3354 == 4) {
                            class140 var44 = var12.method1062(3);
                            if (var44 != null) {
                                class150 var45 = var12.field3366;
                                int var46;
                                if (class121.method884(0, var12)) {
                                    var46 = var12.field3388;
                                    if (class35.method267(var11, arg8, 0) && var12.field3317 != 0) {
                                        var46 = var12.field3317;
                                    }
                                    if (var12.field3403.method1174((byte) -120) > 0) {
                                        var45 = var12.field3403;
                                    }
                                } else {
                                    var46 = var12.field3412;
                                    if (class35.method267(var11, arg8, arg3 ^ 0xFFFFFF8A) && var12.field3294 != 0) {
                                        var46 = var12.field3294;
                                    }
                                }
                                if (var12.field3370 && var12.field3296 != -1) {
                                    class21 var47 = class4.method26((byte) 94, var12.field3296);
                                    var45 = var47.field558;
                                    if (var45 == null) {
                                        var45 = class49.field1320;
                                    }
                                    if ((var47.field566 == 1 || var12.field3350 != 1) && var12.field3350 != -1) {
                                        var45 = class111.method786((byte) -113, new class150[] { var45, class116.field2669, class127.method953((byte) -111, var12.field3350) });
                                    }
                                }
                                if (class147.field3559 == var12.field3323 && class49.field1323 == var12.field3322) {
                                    var46 = var12.field3412;
                                    var45 = class144.field3470;
                                }
                                if (class120.field2775 == 479) {
                                    if (var46 == 16776960) {
                                        var46 = 255;
                                    }
                                    if (var46 == 49152) {
                                        var46 = 16777215;
                                    }
                                }
                                class150 var48 = class95.method671(var12, var45, (byte) 5);
                                var44.method1040(var48, var13, var14, var12.field3321, var12.field3326, var46, var12.field3364, var12.field3343, var12.field3405, var12.field3336);
                            } else if (class50.field1325) {
                                var10 = false;
                            }
                        } else if (var12.field3354 == 5) {
                            if (var12.field3370) {
                                class51 var49;
                                if (var12.field3296 == -1) {
                                    var49 = var12.method1067(false, -123);
                                } else {
                                    var49 = class99.method686(false, var12.field3296, var12.field3315, var12.field3397, var12.field3350, (byte) 96);
                                }
                                if (var49 != null) {
                                    int var50 = var49.field1375;
                                    int var51 = var49.field1374;
                                    if (var12.field3312) {
                                        int var52 = var14;
                                        int var53 = var13;
                                        int[] var54 = new int[4];
                                        class120.method873(var54);
                                        if (var13 < var54[0]) {
                                            var53 = var54[0];
                                        }
                                        int var55 = var12.field3321 + var13;
                                        if (var14 < var54[1]) {
                                            var52 = var54[1];
                                        }
                                        if (var54[2] < var55) {
                                            var55 = var54[2];
                                        }
                                        int var56 = var12.field3326 + var14;
                                        if (var54[3] < var56) {
                                            var56 = var54[3];
                                        }
                                        class120.method874(var53, var52, var55, var56);
                                        int var57 = (var50 + var12.field3321 - 1) / var50;
                                        int var58 = (var12.field3326 + var51 - 1) / var51;
                                        for (int var59 = 0; var59 < var57; var59++) {
                                            for (int var60 = 0; var60 < var58; var60++) {
                                                if (var12.field3361 != 0) {
                                                    var49.method389(var50 / 2 + var50 * var59 + var13, var14 - -(var51 * var60) - -(var51 / 2), var12.field3361, 4096);
                                                } else if (var15 == 0) {
                                                    var49.method398(var13 + var50 * var59, var51 * var60 + var14);
                                                } else {
                                                    var49.method392(var50 * var59 + var13, var51 * var60 + var14, 256 - (var15 & 0xFF));
                                                }
                                            }
                                        }
                                        class120.method868(var54);
                                    } else {
                                        int var61 = var12.field3321 * 4096 / var50;
                                        if (var12.field3361 != 0) {
                                            var49.method389(var12.field3321 / 2 + var13, var14 - -(var12.field3326 / 2), var12.field3361, var61);
                                        } else if (var15 != 0) {
                                            var49.method401(var13, var14, var12.field3321, var12.field3326, 256 - (var15 & 0xFF));
                                        } else if (var12.field3321 == var50 && var12.field3326 == var51) {
                                            var49.method398(var13, var14);
                                        } else {
                                            var49.method396(var13, var14, var12.field3321, var12.field3326);
                                        }
                                    }
                                } else if (class50.field1325) {
                                    var10 = false;
                                }
                            } else {
                                class51 var62 = var12.method1067(class121.method884(arg3 ^ 0xFFFFFF8A, var12), -99);
                                if (var62 != null) {
                                    var62.method398(var13, var14);
                                } else if (class50.field1325) {
                                    var10 = false;
                                }
                            }
                        } else if (var12.field3354 == 6) {
                            boolean var63 = class121.method884(arg3 + 118, var12);
                            class13 var64 = null;
                            int var65 = 0;
                            int var66;
                            if (var63) {
                                var66 = var12.field3399;
                            } else {
                                var66 = var12.field3306;
                            }
                            if (var12.field3296 != -1) {
                                class21 var68 = class4.method26((byte) 93, var12.field3296);
                                if (var68 != null) {
                                    class21 var69 = var68.method161(-1, var12.field3350);
                                    var64 = var69.method168((byte) 7, 1);
                                    if (var64 == null) {
                                        var10 = false;
                                    } else {
                                        var64.method104();
                                        var65 = var64.field871 / 2;
                                    }
                                }
                            } else if (var12.field3318 == 5) {
                                if (var12.field3319 == 0) {
                                    var64 = class35.field975.method1156(null, -1, -62, null, -1);
                                } else {
                                    var64 = class46.field1244.method12(true);
                                }
                            } else if (var66 == -1) {
                                var64 = var12.method1058(-1, class46.field1244.field2562, true, var63, null);
                                if (var64 == null && class50.field1325) {
                                    var10 = false;
                                }
                            } else {
                                class49 var67 = class111.method785(var66, arg3 + 23087);
                                var64 = var12.method1058(var12.field3410, class46.field1244.field2562, true, var63, var67);
                                if (var64 == null && class50.field1325) {
                                    var10 = false;
                                }
                            }
                            class60.method458(var12.field3321 / 2 + var13, var14 - -(var12.field3326 / 2));
                            int var70 = class60.field1523[var12.field3375] * var12.field3307 >> 16;
                            int var71 = class60.field1515[var12.field3375] * var12.field3307 >> 16;
                            if (var64 != null) {
                                if (var12.field3370) {
                                    var64.method104();
                                    if (var12.field3337) {
                                        var64.method91(0, var12.field3404, var12.field3386, var12.field3375, var12.field3393, var65 + var70 + var12.field3325, var12.field3325 + var71, var12.field3307);
                                    } else {
                                        var64.method85(0, var12.field3404, var12.field3386, var12.field3375, var12.field3393, var12.field3325 + var65 + var70, var12.field3325 + var71);
                                    }
                                } else {
                                    var64.method85(0, var12.field3404, 0, var12.field3375, 0, var70, var71);
                                }
                            }
                            class60.method460();
                        } else {
                            if (var12.field3354 == 7) {
                                class140 var72 = var12.method1062(3);
                                if (var72 == null) {
                                    if (class50.field1325) {
                                        var10 = false;
                                    }
                                    continue;
                                }
                                int var73 = 0;
                                for (int var74 = 0; var74 < var12.field3326; var74++) {
                                    for (int var75 = 0; var75 < var12.field3321; var75++) {
                                        if (var12.field3341[var73] > 0) {
                                            class21 var76 = class4.method26((byte) 105, var12.field3341[var73] - 1);
                                            class150 var77 = var76.field558;
                                            if (var77 == null) {
                                                var77 = class49.field1320;
                                            }
                                            if (var76.field566 == 1 || var12.field3334[var73] != 1) {
                                                var77 = class111.method786((byte) 25, new class150[] { var77, class116.field2669, class127.method953((byte) 61, var12.field3334[var73]) });
                                            }
                                            int var78 = var14 + (var12.field3374 + 12) * var74;
                                            int var79 = (var12.field3407 + 115) * var75 + var13;
                                            if (var12.field3343 == 0) {
                                                var72.method1047(var77, var79, var78, var12.field3412, var12.field3364);
                                            } else if (var12.field3343 == 1) {
                                                var72.method1055(var77, var12.field3321 / 2 + var79, var78, var12.field3412, var12.field3364);
                                            } else {
                                                var72.method1050(var77, var79 + var12.field3321 - 1, var78, var12.field3412, var12.field3364);
                                            }
                                        }
                                        var73++;
                                    }
                                }
                            }
                            if (var12.field3354 == 8 && class94.method665(arg3 ^ 0xFFFFFFF5, var11, arg8) && class34.field958 == class113.field2641) {
                                int var80 = 0;
                                int var81 = 0;
                                class140 var82 = class22.field646;
                                class150 var83 = var12.field3366;
                                class150 var84 = class95.method671(var12, var83, (byte) 5);
                                while (var84.method1174((byte) -124) > 0) {
                                    int var92 = var84.method1200(class131.field3087, 29903);
                                    class150 var93;
                                    if (var92 == -1) {
                                        var93 = var84;
                                        var84 = class43.field1167;
                                    } else {
                                        var93 = var84.method1202(0, var92, 0);
                                        var84 = var84.method1196(var92 + 2, -31851);
                                    }
                                    int var94 = var82.method1043(var93);
                                    var81 += var82.field3268 + 1;
                                    if (var80 < var94) {
                                        var80 = var94;
                                    }
                                }
                                var81 += 7;
                                var80 += 6;
                                int var85 = var12.field3326 + var14 + 5;
                                int var86 = var13 + var12.field3321 - var80 - 5;
                                if (var13 + 5 > var86) {
                                    var86 = var13 + 5;
                                }
                                if (var80 + var86 > arg5) {
                                    var86 = arg5 - var80;
                                }
                                if (var81 + var85 > arg0) {
                                    var85 = arg0 - var81;
                                }
                                class120.method872(var86, var85, var80, var81, 16777120);
                                class120.method866(var86, var85, var80, var81, 0);
                                class150 var87 = var12.field3366;
                                int var88 = var82.field3268 + var85 + 2;
                                class150 var89 = class95.method671(var12, var87, (byte) 5);
                                while (var89.method1174((byte) -126) > 0) {
                                    int var90 = var89.method1200(class131.field3087, arg3 ^ 0xFFFF8B45);
                                    class150 var91;
                                    if (var90 == -1) {
                                        var91 = var89;
                                        var89 = class43.field1167;
                                    } else {
                                        var91 = var89.method1202(0, var90, arg3 ^ 0xFFFFFF8A);
                                        var89 = var89.method1196(var90 + 2, -31851);
                                    }
                                    var82.method1047(var91, var86 + 3, var88, 0, false);
                                    var88 += var82.field3268 + 1;
                                }
                            }
                            if (var12.field3354 == 9) {
                                if (var12.field3363 == 1) {
                                    class120.method877(var13, var14, var12.field3321 + var13, var12.field3326 + var14, var12.field3412);
                                } else {
                                    int var95 = var12.field3321 >= 0 ? var12.field3321 : -var12.field3321;
                                    int var96 = var95;
                                    int var97 = var12.field3326 < 0 ? -var12.field3326 : var12.field3326;
                                    if (var95 < var97) {
                                        var96 = var97;
                                    }
                                    if (var96 != 0) {
                                        int var98 = (var12.field3326 << 16) / var96;
                                        int var99 = (var12.field3321 << 16) / var96;
                                        if (var98 > var99) {
                                            var98 = -var98;
                                        } else {
                                            var99 = -var99;
                                        }
                                        int var100 = var12.field3363 * var98 >> 17;
                                        int var101 = var12.field3363 * var98 + 1 >> 17;
                                        int var102 = var12.field3363 * var99 + 1 >> 17;
                                        int var103 = var12.field3363 * var99 >> 17;
                                        int var104 = var13 + var100;
                                        int var105 = var13 - var101;
                                        int var106 = var12.field3321 + var13 - var101;
                                        int var107 = var12.field3321 + var13 + var100;
                                        int var108 = var14 + var103;
                                        int var109 = var12.field3326 + var14 - var102;
                                        int var110 = var14 + var103 + var12.field3326;
                                        class60.method459(var104, var105, var106);
                                        int var111 = var14 - var102;
                                        class60.method466(var108, var111, var109, var104, var105, var106, var12.field3412);
                                        class60.method459(var104, var106, var107);
                                        class60.method466(var108, var109, var110, var104, var106, var107, var12.field3412);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V")
    public static final void method115(int arg0, int arg1) {
        field425++;
        if (!class145.method1090(-80, arg0)) {
            return;
        }
        class141[] var2 = class58.field1500[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class141 var4 = var2[var3];
            if (var4 != null) {
                var4.field3410 = 0;
                var4.field3328 = 0;
            }
        }
        if (arg1 > -116) {
            method117(58);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method116(int arg0) {
        field430 = null;
        if (arg0 != 31951) {
            method116(-95);
        }
        field420 = null;
        field415 = null;
        field429 = null;
        field423 = null;
        field427 = null;
        field428 = null;
        field419 = null;
        field421 = null;
        field416 = null;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public static final void method117(int arg0) {
        field417++;
        if (arg0 >= -35) {
            field422 = 62;
        }
        class49.field1312.method762((byte) -126);
        class18.field490 = 1;
        class5.field106 = null;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public static final void method118(int arg0) {
        if (arg0 != 0) {
            field416 = null;
        }
        field431++;
        class126.field2920 = new class70(32);
    }
}
