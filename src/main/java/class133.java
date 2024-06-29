import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class133 extends class166 {

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field2610 = 0;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Lsg;")
    public static class30 field2613 = class167.method1221((byte) 33, "gr-Un:");

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field2617 = 0;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "[B")
    public static byte[] field2615 = new byte[520];

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method1003(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field2614++;
        class220.field3977 = 0;
        for (int var7 = -1; var7 < (class28.field528 + class221.field3985); var7++) {
            class63 var23;
            if (var7 == -1) {
                var23 = class247.field4394;
            } else if (class28.field528 > var7) {
                var23 = class75.field1670[class183.field3378[var7]];
            } else {
                var23 = class125.field2443[class4.field55[var7 - class28.field528]];
            }
            if (var23 != null && var23.method568((byte) -74)) {
                if (var23 instanceof class275) {
                    class241 var24 = ((class275) var23).field4805;
                    if (var24.field4295 != null) {
                        var24 = var24.method1700((byte) 59);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class28.field528 <= var7) {
                    class241 var30 = ((class275) var23).field4805;
                    if (var30.field4295 != null) {
                        var30 = var30.method1700((byte) 59);
                    }
                    if (var30.field4282 >= 0 && class272.field4766.length > var30.field4282) {
                        int var31;
                        if (var30.field4260 == -1) {
                            var31 = var23.method564(63) + 15;
                        } else {
                            var31 = var30.field4260 + 15;
                        }
                        class150.method1091(-4491, arg2 >> 1, var31, var23, arg1, arg4, arg0 >> 1);
                        if (class238.field4245 > -1) {
                            class272.field4766[var30.field4282].method446(class238.field4245 + arg6 - 12, class256.field4511 - 30 + arg3);
                        }
                    }
                    class143[] var32 = class262.field4620;
                    for (int var33 = 0; var33 < var32.length; var33++) {
                        class143 var48 = var32[var33];
                        if (var48 != null && var48.field2754 == 1 && class4.field55[var7 - class28.field528] == var48.field2755 && field2617 % 20 < 10) {
                            int var49;
                            if (var30.field4260 == -1) {
                                var49 = var23.method564(93) + 15;
                            } else {
                                var49 = var30.field4260 + 15;
                            }
                            class150.method1091(-4491, arg2 >> 1, var49, var23, arg1, arg4, arg0 >> 1);
                            if (class238.field4245 > -1) {
                                class9.field172[var48.field2758].method446(arg6 + class238.field4245 - 12, arg3 - -class256.field4511 + -28);
                            }
                        }
                    }
                } else {
                    int var25 = 30;
                    class120 var26 = (class120) var23;
                    if (var26.field2336 != -1 || var26.field2357 != -1) {
                        class150.method1091(-4491, arg2 >> 1, var23.method564(110) + 15, var23, arg1, arg4, arg0 >> 1);
                        if (class238.field4245 > -1) {
                            if (var26.field2336 != -1) {
                                class243.field4341[var26.field2336].method446(arg6 + class238.field4245 - 12, class256.field4511 + arg3 - var25);
                                var25 += 25;
                            }
                            if (var26.field2357 != -1) {
                                class272.field4766[var26.field2357].method446(arg6 + class238.field4245 - 12, arg3 - -class256.field4511 + -var25);
                                var25 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var27 = 0;
                        class143[] var28 = class262.field4620;
                        while (var28.length > var27) {
                            class143 var29 = var28[var27];
                            if (var29 != null && var29.field2754 == 10 && class183.field3378[var7] == var29.field2755) {
                                class150.method1091(-4491, arg2 >> 1, var23.method564(20) + 15, var23, arg1, arg4, arg0 >> 1);
                                if (class238.field4245 > -1) {
                                    class9.field172[var29.field2758].method446(arg6 + class238.field4245 - 12, arg3 - var25 + class256.field4511);
                                }
                            }
                            var27++;
                        }
                    }
                }
                if (var23.field1357 != null && (var7 >= class28.field528 || class201.field3586 == 0 || class201.field3586 == 3 || class201.field3586 == 1 && class114.method886(((class120) var23).field2349, (byte) -107))) {
                    class150.method1091(-4491, arg2 >> 1, var23.method564(35), var23, arg1, arg4, arg0 >> 1);
                    if (class238.field4245 > -1 && class220.field3977 < class124.field2437) {
                        class124.field2430[class220.field3977] = class223.field4000.method1456(var23.field1357) / 2;
                        class124.field2428[class220.field3977] = class223.field4000.field3701;
                        class124.field2436[class220.field3977] = class238.field4245;
                        class124.field2435[class220.field3977] = class256.field4511;
                        class124.field2431[class220.field3977] = var23.field1408;
                        class124.field2429[class220.field3977] = var23.field1353;
                        class124.field2433[class220.field3977] = var23.field1374;
                        class124.field2440[class220.field3977] = var23.field1357;
                        class220.field3977++;
                    }
                }
                if (field2617 < var23.field1338) {
                    class44 var34 = class73.field1647[0];
                    class44 var35 = class73.field1647[1];
                    int var36;
                    if ((var23 instanceof class275)) {
                        class275 var37 = (class275) var23;
                        class44[] var38 = (class44[]) class90.field1811.method1644((byte) -64, (long) var37.field4805.field4318);
                        if (var38 == null) {
                            var38 = class15.method157(var37.field4805.field4318, class134.field2625, (byte) -89, 0);
                            if (var38 != null) {
                                class90.field1811.method1646((long) var37.field4805.field4318, var38, -119);
                            }
                        }
                        class241 var39 = var37.field4805;
                        if (var38 != null && var38.length == 2) {
                            var34 = var38[0];
                            var35 = var38[1];
                        }
                        if (var39.field4260 == -1) {
                            var36 = var23.method564(31);
                        } else {
                            var36 = var39.field4260;
                        }
                    } else {
                        var36 = var23.method564(97);
                    }
                    class150.method1091(-4491, arg2 >> 1, var36 + var34.field1043 + 10, var23, arg1, arg4, arg0 >> 1);
                    if (class238.field4245 > -1) {
                        int var40 = arg6 + class238.field4245 - (var34.field1049 >> 1);
                        int var41 = class256.field4511 + arg3 - 3;
                        var34.method446(var40, var41);
                        int var42 = var34.field1043;
                        int var43 = var23.field1377 * var34.field1049 / 255;
                        class188.method1369(var40, var41, var40 + var43, var41 - -var42);
                        var35.method446(var40, var41);
                        class188.method1355(arg6, arg3, arg6 + arg0, arg2 + arg3);
                    }
                }
                for (int var44 = 0; var44 < 4; var44++) {
                    if (field2617 < var23.field1365[var44]) {
                        int var45;
                        if ((var23 instanceof class275)) {
                            class275 var46 = (class275) var23;
                            class241 var47 = var46.field4805;
                            if (var47.field4260 == -1) {
                                var45 = var23.method564(100) / 2;
                            } else {
                                var45 = var47.field4260 / 2;
                            }
                        } else {
                            var45 = var23.method564(104) / 2;
                        }
                        class150.method1091(-4491, arg2 >> 1, var45, var23, arg1, arg4, arg0 >> 1);
                        if (class238.field4245 > -1) {
                            if (var44 == 1) {
                                class256.field4511 -= 20;
                            }
                            if (var44 == 2) {
                                class256.field4511 -= 10;
                                class238.field4245 -= 15;
                            }
                            if (var44 == 3) {
                                class256.field4511 -= 10;
                                class238.field4245 += 15;
                            }
                            class138.field2687[var23.field1401[var44]].method446(class238.field4245 + arg6 - 12, arg3 + -12 + class256.field4511);
                            class191.field3476.method1472(class73.method675(-22, var23.field1398[var44]), arg6 + class238.field4245 - 1, arg3 + 3 + class256.field4511, 16777215, 0);
                        }
                    }
                }
            }
        }
        int var8 = 0;
        if (arg5 <= 50) {
            field2610 = -83;
        }
        while (var8 < class220.field3977) {
            int var9 = class124.field2436[var8];
            boolean var10 = true;
            int var11 = class124.field2430[var8];
            int var12 = class124.field2435[var8];
            int var13 = class124.field2428[var8];
            while (var10) {
                var10 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if ((class124.field2435[var22] - class124.field2428[var22]) < (var12 + 2) && (class124.field2435[var22] + 2) > (var12 - var13) && class124.field2436[var22] + class124.field2430[var22] > -var11 + var9 && class124.field2436[var22] - class124.field2430[var22] < var9 - -var11 && class124.field2435[var22] - class124.field2428[var22] < var12) {
                        var12 = class124.field2435[var22] - class124.field2428[var22];
                        var10 = true;
                    }
                }
            }
            class238.field4245 = class124.field2436[var8];
            class256.field4511 = class124.field2435[var8] = var12;
            class30 var14 = class124.field2440[var8];
            if (class15.field322 == 0) {
                int var15 = 16776960;
                if (class124.field2431[var8] < 6) {
                    var15 = class189.field3449[class124.field2431[var8]];
                }
                if (class124.field2431[var8] == 6) {
                    var15 = class116.field2290 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class124.field2431[var8] == 7) {
                    var15 = class116.field2290 % 20 < 10 ? 255 : 65535;
                }
                if (class124.field2431[var8] == 8) {
                    var15 = (class116.field2290 % 20) < 10 ? 45056 : 8454016;
                }
                if (class124.field2431[var8] == 9) {
                    int var16 = 150 - class124.field2433[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 33160960 - (var16 * 327680);
                    } else if (var16 < 150) {
                        var15 = 65280 - (500 - (var16 * 5));
                    }
                }
                if (class124.field2431[var8] == 10) {
                    int var17 = 150 - class124.field2433[var8];
                    if (var17 < 50) {
                        var15 = (var17 * 5) + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 - ((var17 - 50) * 327680);
                    } else if (var17 < 150) {
                        var15 = var17 * 327680 + 255 + 500 - (var17 * 5) - 32768000;
                    }
                }
                if (class124.field2431[var8] == 11) {
                    int var18 = 150 - class124.field2433[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = ((var18 - 50) * 327685) + 65280;
                    } else if (var18 < 150) {
                        var15 = 49545215 - var18 * 327680;
                    }
                }
                if (class124.field2429[var8] == 0) {
                    class223.field4000.method1472(var14, class238.field4245 + arg6, arg3 - -class256.field4511, var15, 0);
                }
                if (class124.field2429[var8] == 1) {
                    class223.field4000.method1470(var14, arg6 + class238.field4245, class256.field4511 + arg3, var15, 0, class116.field2290);
                }
                if (class124.field2429[var8] == 2) {
                    class223.field4000.method1469(var14, class238.field4245 + arg6, class256.field4511 + arg3, var15, 0, class116.field2290);
                }
                if (class124.field2429[var8] == 3) {
                    class223.field4000.method1463(var14, class238.field4245 + arg6, class256.field4511 + arg3, var15, 0, class116.field2290, 150 - class124.field2433[var8]);
                }
                if (class124.field2429[var8] == 4) {
                    int var19 = (150 - class124.field2433[var8]) * (class223.field4000.method1456(var14) + 100) / 150;
                    class188.method1369(class238.field4245 + arg6 - 50, arg3, class238.field4245 + arg6 + 50, arg3 - -arg2);
                    class223.field4000.method1450(var14, arg6 + class238.field4245 + 50 - var19, class256.field4511 + arg3, var15, 0);
                    class188.method1355(arg6, arg3, arg0 + arg6, arg2 + arg3);
                }
                if (class124.field2429[var8] == 5) {
                    int var20 = 0;
                    int var21 = 150 - class124.field2433[var8];
                    if (var21 < 25) {
                        var20 = var21 - 25;
                    } else if (var21 > 125) {
                        var20 = var21 - 125;
                    }
                    class188.method1369(arg6, arg3 - (class223.field4000.field3701 - class256.field4511) - 1, arg0 + arg6, arg3 + class256.field4511 + 5);
                    class223.field4000.method1472(var14, class238.field4245 + arg6, arg3 + var20 - -class256.field4511, var15, 0);
                    class188.method1355(arg6, arg3, arg6 + arg0, arg2 + arg3);
                }
            } else {
                class223.field4000.method1472(var14, class238.field4245 + arg6, arg3 - -class256.field4511, 16776960, 0);
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public static void method1004(int arg0) {
        if (arg0 <= 107) {
            method1007(21, 54, -125, -41, 75, (byte) -48, 3, -49, 112, 0, 30, true);
        }
        field2615 = null;
        field2613 = null;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
    public static final void method1005(int arg0) {
        if (arg0 <= 96) {
            method1005(-59);
        }
        field2611++;
        class29.field553 = new class48();
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIBII)V")
    public static final void method1006(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class45.method458(arg3, 137);
        int var7 = 0;
        field2616++;
        int var8 = arg3;
        int var9 = -arg3;
        int var10 = arg3 - arg5;
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = -var10;
        int var12 = -1;
        int var13 = -116 / ((arg4 - 62) / 53);
        int var14 = var10;
        int var15 = -1;
        int[] var16 = class121.field2390[arg1];
        int var17 = arg2 - var10;
        class194.method1405(true, var16, var17, arg2 - arg3, arg0);
        int var18 = arg2 + var10;
        class194.method1405(true, var16, var18, var17, arg6);
        class194.method1405(true, var16, arg2 + arg3, var18, arg0);
        while (var8 > var7) {
            var12 += 2;
            var11 += var12;
            if (var11 >= 0 && var14 >= 1) {
                class121.field2388[var14] = var7;
                var14--;
                var11 -= var14 << 1;
            }
            var7++;
            var15 += 2;
            var9 += var15;
            if (var9 >= 0) {
                var8--;
                if (var8 >= var10) {
                    int[] var19 = class121.field2390[arg1 + var8];
                    int[] var20 = class121.field2390[arg1 - var8];
                    int var21 = arg2 + var7;
                    int var22 = arg2 - var7;
                    class194.method1405(true, var19, var21, var22, arg0);
                    class194.method1405(true, var20, var21, var22, arg0);
                } else {
                    int[] var23 = class121.field2390[arg1 + var8];
                    int[] var24 = class121.field2390[arg1 - var8];
                    int var25 = arg2 + var7;
                    int var26 = class121.field2388[var8];
                    int var27 = arg2 + var26;
                    int var28 = arg2 - var7;
                    int var29 = arg2 - var26;
                    class194.method1405(true, var23, var29, var28, arg0);
                    class194.method1405(true, var23, var27, var29, arg6);
                    class194.method1405(true, var23, var25, var27, arg0);
                    class194.method1405(true, var24, var29, var28, arg0);
                    class194.method1405(true, var24, var27, var29, arg6);
                    class194.method1405(true, var24, var25, var27, arg0);
                }
                var9 -= var8 << 1;
            }
            int[] var30 = class121.field2390[arg1 + var7];
            int var31 = arg2 + var8;
            int[] var32 = class121.field2390[arg1 - var7];
            int var33 = arg2 - var8;
            if (var10 <= var7) {
                class194.method1405(true, var30, var31, var33, arg0);
                class194.method1405(true, var32, var31, var33, arg0);
            } else {
                int var34 = var7 <= var14 ? var14 : class121.field2388[var7];
                int var35 = arg2 + var34;
                int var36 = arg2 - var34;
                class194.method1405(true, var30, var36, var33, arg0);
                class194.method1405(true, var30, var35, var36, arg6);
                class194.method1405(true, var30, var31, var35, arg0);
                class194.method1405(true, var32, var36, var33, arg0);
                class194.method1405(true, var32, var35, var36, arg6);
                class194.method1405(true, var32, var31, var35, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIBIIIIIZ)Z")
    public static final boolean method1007(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field2612++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class87.field1782[var12][var31] = 0;
                class121.field2391[var12][var31] = 99999999;
            }
        }
        class87.field1782[arg9][arg3] = 99;
        class121.field2391[arg9][arg3] = 0;
        int var13 = arg3;
        byte var14 = 0;
        int var15 = arg9;
        class195.field3509[var14] = arg9;
        int var32 = var14 + 1;
        class132.field2594[var14] = arg3;
        int var16 = 0;
        boolean var17 = false;
        int[][] var18 = class100.field2032[class159.field2998].field258;
        while (var32 != var16) {
            var15 = class195.field3509[var16];
            var13 = class132.field2594[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg8 == var15 && arg4 == var13) {
                var17 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class100.field2032[class159.field2998].method136(arg8, arg0, arg2 - 1, var13, var15, arg4, 1, (byte) 70)) {
                    var17 = true;
                    break;
                }
                if (arg2 < 10 && class100.field2032[class159.field2998].method129(arg8, 1, var13, arg4, -61, arg0, arg2 - 1, var15)) {
                    var17 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg7 != 0 && class100.field2032[class159.field2998].method125(var13, 16168, arg7, var15, arg6, arg8, 1, arg4, arg1)) {
                var17 = true;
                break;
            }
            int var30 = class121.field2391[var15][var13] + 1;
            if (var15 > 0 && class87.field1782[var15 - 1][var13] == 0 && (var18[var15 - 1][var13] & 0x12C0108) == 0) {
                class195.field3509[var32] = var15 - 1;
                class132.field2594[var32] = var13;
                var32 = var32 + 1 & 0xFFF;
                class87.field1782[var15 - 1][var13] = 2;
                class121.field2391[var15 - 1][var13] = var30;
            }
            if (var15 < 103 && class87.field1782[var15 + 1][var13] == 0 && (var18[var15 + 1][var13] & 0x12C0180) == 0) {
                class195.field3509[var32] = var15 + 1;
                class132.field2594[var32] = var13;
                var32 = var32 + 1 & 0xFFF;
                class87.field1782[var15 + 1][var13] = 8;
                class121.field2391[var15 + 1][var13] = var30;
            }
            if (var13 > 0 && class87.field1782[var15][var13 - 1] == 0 && (var18[var15][var13 - 1] & 0x12C0102) == 0) {
                class195.field3509[var32] = var15;
                class132.field2594[var32] = var13 - 1;
                class87.field1782[var15][var13 - 1] = 1;
                class121.field2391[var15][var13 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 103 && class87.field1782[var15][var13 + 1] == 0 && (var18[var15][var13 + 1] & 0x12C0120) == 0) {
                class195.field3509[var32] = var15;
                class132.field2594[var32] = var13 + 1;
                var32 = var32 + 1 & 0xFFF;
                class87.field1782[var15][var13 + 1] = 4;
                class121.field2391[var15][var13 + 1] = var30;
            }
            if (var15 > 0 && var13 > 0 && class87.field1782[var15 - 1][var13 - 1] == 0 && (var18[var15 - 1][var13 - 1] & 0x12C010E) == 0 && (var18[var15 - 1][var13] & 0x12C0108) == 0 && (var18[var15][var13 - 1] & 0x12C0102) == 0) {
                class195.field3509[var32] = var15 - 1;
                class132.field2594[var32] = var13 - 1;
                var32 = var32 + 1 & 0xFFF;
                class87.field1782[var15 - 1][var13 - 1] = 3;
                class121.field2391[var15 - 1][var13 - 1] = var30;
            }
            if (var15 < 103 && var13 > 0 && class87.field1782[var15 + 1][var13 - 1] == 0 && (var18[var15 + 1][var13 - 1] & 0x12C0183) == 0 && (var18[var15 + 1][var13] & 0x12C0180) == 0 && (var18[var15][var13 - 1] & 0x12C0102) == 0) {
                class195.field3509[var32] = var15 + 1;
                class132.field2594[var32] = var13 - 1;
                class87.field1782[var15 + 1][var13 - 1] = 9;
                class121.field2391[var15 + 1][var13 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 > 0 && var13 < 103 && class87.field1782[var15 - 1][var13 + 1] == 0 && (var18[var15 - 1][var13 + 1] & 0x12C0138) == 0 && (var18[var15 - 1][var13] & 0x12C0108) == 0 && (var18[var15][var13 + 1] & 0x12C0120) == 0) {
                class195.field3509[var32] = var15 - 1;
                class132.field2594[var32] = var13 + 1;
                class87.field1782[var15 - 1][var13 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class121.field2391[var15 - 1][var13 + 1] = var30;
            }
            if (var15 < 103 && var13 < 103 && class87.field1782[var15 + 1][var13 + 1] == 0 && (var18[var15 + 1][var13 + 1] & 0x12C01E0) == 0 && (var18[var15 + 1][var13] & 0x12C0180) == 0 && (var18[var15][var13 + 1] & 0x12C0120) == 0) {
                class195.field3509[var32] = var15 + 1;
                class132.field2594[var32] = var13 + 1;
                class87.field1782[var15 + 1][var13 + 1] = 12;
                class121.field2391[var15 + 1][var13 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class1.field14 = 0;
        if (arg5 >= -80) {
            method1003(-115, -112, 92, 123, 55, (byte) 69, -106);
        }
        if (!var17) {
            if (!arg11) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg8 - var21; var22 <= arg8 + var21; var22++) {
                for (int var23 = arg4 - var21; var23 <= (arg4 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class121.field2391[var22][var23] < 100) {
                        int var24 = 0;
                        if (var22 < arg8) {
                            var24 = arg8 - var22;
                        } else if ((arg8 + arg6 - 1) < var22) {
                            var24 = var22 - (arg8 - (1 - arg6));
                        }
                        int var25 = 0;
                        if (var23 < arg4) {
                            var25 = arg4 - var23;
                        } else if ((arg7 + arg4 - 1) < var23) {
                            var25 = var23 + 1 - arg4 - arg7;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var19 > var26 || var19 == var26 && var20 > class121.field2391[var22][var23]) {
                            var13 = var23;
                            var20 = class121.field2391[var22][var23];
                            var19 = var26;
                            var15 = var22;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg9 == var15 && arg3 == var13) {
                return false;
            }
            class1.field14 = 1;
        }
        byte var27 = 0;
        class195.field3509[var27] = var15;
        int var33 = var27 + 1;
        class132.field2594[var27] = var13;
        int var28;
        int var29 = var28 = class87.field1782[var15][var13];
        while (arg9 != var15 || arg3 != var13) {
            if (var28 != var29) {
                var28 = var29;
                class195.field3509[var33] = var15;
                class132.field2594[var33++] = var13;
            }
            if ((var29 & 0x2) != 0) {
                var15++;
            } else if ((var29 & 0x8) != 0) {
                var15--;
            }
            if ((var29 & 0x1) != 0) {
                var13++;
            } else if ((var29 & 0x4) != 0) {
                var13--;
            }
            var29 = class87.field1782[var15][var13];
        }
        if (var33 > 0) {
            class137.method1031((byte) -125, arg10, var33);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
