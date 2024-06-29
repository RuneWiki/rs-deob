import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class103 extends class34 {

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
    private int field1510 = 585;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public static int field1504 = 0;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "Z")
    public static boolean field1512;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III[BLjava/lang/String;I)I")
    public static final int method749(int arg0, int arg1, int arg2, byte[] arg3, String arg4, int arg5) {
        int var6 = 42 % ((arg0 - -2) / 53);
        ++field1508;
        int var7 = -arg5 + arg1;
        for (int var8 = 0; ~var7 < ~var8; ++var8) {
            char var9 = arg4.charAt(arg5 + var8);
            if (~var9 < -1 && ~var9 > -129 || var9 >= 160 && var9 <= 255) {
                arg3[arg2 + var8] = (byte) var9;
            } else if (var9 != 8364) {
                if (~var9 != -8219) {
                    if (~var9 == -403) {
                        arg3[arg2 + var8] = -125;
                    } else if (var9 != 8222) {
                        if (~var9 == -8231) {
                            arg3[arg2 + var8] = -123;
                        } else if (var9 == 8224) {
                            arg3[arg2 - -var8] = -122;
                        } else if (~var9 == -8226) {
                            arg3[arg2 + var8] = -121;
                        } else if (var9 == 710) {
                            arg3[arg2 - -var8] = -120;
                        } else if (~var9 != -8241) {
                            if (var9 != 352) {
                                if (~var9 == -8250) {
                                    arg3[arg2 + var8] = -117;
                                } else if (~var9 != -339) {
                                    if (var9 != 381) {
                                        if (~var9 == -8217) {
                                            arg3[arg2 + var8] = -111;
                                        } else if (~var9 == -8218) {
                                            arg3[arg2 + var8] = -110;
                                        } else if (~var9 == -8221) {
                                            arg3[arg2 + var8] = -109;
                                        } else if (~var9 == -8222) {
                                            arg3[arg2 + var8] = -108;
                                        } else if (var9 != 8226) {
                                            if (var9 != 8211) {
                                                if (~var9 == -8213) {
                                                    arg3[arg2 - -var8] = -105;
                                                } else if (var9 != 732) {
                                                    if (var9 == 8482) {
                                                        arg3[arg2 + var8] = -103;
                                                    } else if (var9 != 353) {
                                                        if (var9 == 8250) {
                                                            arg3[arg2 + var8] = -101;
                                                        } else if (var9 != 339) {
                                                            if (~var9 == -383) {
                                                                arg3[arg2 + var8] = -98;
                                                            } else if (~var9 != -377) {
                                                                arg3[arg2 + var8] = 63;
                                                            } else {
                                                                arg3[arg2 - -var8] = -97;
                                                            }
                                                        } else {
                                                            arg3[arg2 + var8] = -100;
                                                        }
                                                    } else {
                                                        arg3[arg2 - -var8] = -102;
                                                    }
                                                } else {
                                                    arg3[arg2 + var8] = -104;
                                                }
                                            } else {
                                                arg3[arg2 - -var8] = -106;
                                            }
                                        } else {
                                            arg3[arg2 - -var8] = -107;
                                        }
                                    } else {
                                        arg3[arg2 + var8] = -114;
                                    }
                                } else {
                                    arg3[arg2 + var8] = -116;
                                }
                            } else {
                                arg3[arg2 + var8] = -118;
                            }
                        } else {
                            arg3[arg2 + var8] = -119;
                        }
                    } else {
                        arg3[arg2 + var8] = -124;
                    }
                } else {
                    arg3[arg2 - -var8] = -126;
                }
            } else {
                arg3[arg2 - -var8] = -128;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)V")
    public static final void method750(boolean arg0, int arg1) {
        ++field1513;
        if (!arg0) {
            method751(103, -99, -24, 3, 16, -31, 36, 55, 45, (class297[]) null);
        }
        class105 var2 = class9.method72(11, -1, arg1);
        var2.method764((byte) -121);
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class103() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIIII[Ljk;)V")
    public static final void method751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class297[] arg9) {
        class72.method567(arg2, arg4, arg8, arg7);
        class119.method842();
        ++field1511;
        if (arg3 <= 89) {
            field1503 = 67;
        }
        for (int var10 = 0; arg9.length > var10; ++var10) {
            class297 var11 = arg9[var10];
            if (var11 != null && (~var11.field4542 == ~arg6 || arg6 == -1412584499 && class223.field3464 == var11)) {
                int var12;
                if (~arg5 == 0) {
                    class150.field2189[class123.field1818] = var11.field4700 + arg1;
                    class188.field2802[class123.field1818] = var11.field4578 + arg0;
                    class247.field3848[class123.field1818] = var11.field4627;
                    class166.field2453[class123.field1818] = var11.field4531;
                    var12 = class123.field1818++;
                } else {
                    var12 = arg5;
                }
                var11.field4561 = class120.field1794;
                var11.field4567 = var12;
                if (!var11.field4647 || !client.method330(var11)) {
                    if (~var11.field4600 < -1) {
                        class179.method1182(-116, var11);
                    }
                    int var13 = var11.field4700 - -arg1;
                    int var14 = var11.field4537;
                    int var15 = var11.field4578 + arg0;
                    if (class112.field1712 && (~client.method333(var11).field4515 != -1 || ~var11.field4553 == -1) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class223.field3464 == var11) {
                        if (~arg6 != 1412584498 && !var11.field4591) {
                            class30.field551 = arg9;
                            class185.field2699 = arg0;
                            class208.field3121 = arg1;
                            continue;
                        }
                        if (class190.field2887 && class108.field1582) {
                            int var16 = class12.field172;
                            int var17 = class105.field1542;
                            int var18 = var16 - class287.field4394;
                            int var19 = var17 - class234.field3609;
                            if (~var19 > ~class109.field1601) {
                                var19 = class109.field1601;
                            }
                            if (class109.field1629 > var18) {
                                var18 = class109.field1629;
                            }
                            if (var18 - -var11.field4627 > class109.field1629 + class260.field3988.field4627) {
                                var18 = class109.field1629 + class260.field3988.field4627 - var11.field4627;
                            }
                            var13 = var18;
                            if (class109.field1601 + class260.field3988.field4531 < var11.field4531 + var19) {
                                var19 = class109.field1601 + class260.field3988.field4531 + -var11.field4531;
                            }
                            var15 = var19;
                        }
                        if (!var11.field4591) {
                            var14 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field4553 != 2) {
                        var20 = arg4 >= var15 ? arg4 : var15;
                        var21 = arg2 < var13 ? var13 : arg2;
                        int var22 = var11.field4627 + var13;
                        int var23 = var11.field4531 + var15;
                        if (~var11.field4553 == -10) {
                            ++var23;
                            ++var22;
                        }
                        var24 = ~var22 > ~arg8 ? var22 : arg8;
                        var25 = ~var23 > ~arg7 ? var23 : arg7;
                    } else {
                        var20 = arg4;
                        var24 = arg8;
                        var25 = arg7;
                        var21 = arg2;
                    }
                    if (!var11.field4647 || ~var21 > ~var24 && var25 > var20) {
                        if (~var11.field4600 != -1) {
                            if (~var11.field4600 == -1338 || var11.field4600 == 1403) {
                                class208.field3115 = var15;
                                class239.field3679 = var13;
                                class174.field2550 = var11;
                                class162.method1100(var13, var11.field4531, var11.field4600 == 1403, var11.field4627, (byte) 33, var15);
                                class17.field315[var12] = true;
                                class72.method567(arg2, arg4, arg8, arg7);
                                continue;
                            }
                            if (~var11.field4600 == -1339) {
                                if (!var11.method1975(0)) {
                                    continue;
                                }
                                class250.method1708(var13, var11, var15, var12, true);
                                class72.method567(arg2, arg4, arg8, arg7);
                                if (~class283.field4336 != -1 && class283.field4336 != 3 || class66.field1093 || ~class102.field1490 > ~var21 || ~var20 < ~class101.field1470 || var24 <= class102.field1490 || ~class101.field1470 <= ~var25) {
                                    continue;
                                }
                                int var26 = class102.field1490 - var13;
                                int var27 = -var15 + class101.field1470;
                                int var28 = var11.field4550[var27];
                                if (var28 > var26 || var11.field4645[var27] + var28 < var26) {
                                    continue;
                                }
                                int var29 = var26 - var11.field4627 / 2;
                                int var30 = var27 - var11.field4531 / 2;
                                int var31 = 2047 & (int) class89.field1349 + class96.field1420;
                                int var32 = class119.field1774[var31];
                                int var33 = (class258.field3958 + 256) * var32 >> 8;
                                int var34 = class119.field1776[var31];
                                int var35 = (class258.field3958 + 256) * var34 >> 8;
                                int var36 = var29 * var35 + var30 * var33 >> 11;
                                int var37 = var30 * var35 + -(var29 * var33) >> 11;
                                int var38 = var36 + (class185.field2687.field425 - 64 * (class185.field2687.method168(-113) - 1)) >> 7;
                                int var39 = -var37 + class185.field2687.field455 + -((class185.field2687.method168(-91) - 1) * 64) >> 7;
                                if (class76.field1205 && ~(64 & class146.field2123) != -1) {
                                    class297 var40 = class237.method1617(class54.field858, (byte) 63, class111.field1688);
                                    if (var40 == null) {
                                        class18.method126((byte) 126);
                                    } else {
                                        class246.method1685(" ->", var38, 1L, class182.field2647, var39, (short) 9, class270.field4218, true);
                                    }
                                    continue;
                                }
                                if (~class246.field3836 == -2) {
                                    class246.method1685("", var38, 1L, class12.field180, var39, (short) 58, -1, true);
                                }
                                class246.method1685("", var38, 1L, class195.field2946, var39, (short) 38, -1, true);
                                continue;
                            }
                            if (var11.field4600 == 1339) {
                                if (var11.method1975(0)) {
                                    class236.method1592(256, var13, var11, var15, var12);
                                    class72.method567(arg2, arg4, arg8, arg7);
                                }
                                continue;
                            }
                            if (var11.field4600 == 1400) {
                                class19.method135(var11.field4627, var15, var13, -13379, var11.field4531);
                                class17.field315[var12] = true;
                                class285.field4371[var12] = true;
                                class72.method567(arg2, arg4, arg8, arg7);
                                continue;
                            }
                            if (~var11.field4600 == -1402) {
                                class101.method740((byte) -121, var13, var15, var11.field4627, var11.field4531);
                                class17.field315[var12] = true;
                                class285.field4371[var12] = true;
                                class72.method567(arg2, arg4, arg8, arg7);
                                continue;
                            }
                            if (~var11.field4600 == -1403) {
                                class56.method469(var13, var15, 409);
                                class17.field315[var12] = true;
                                class285.field4371[var12] = true;
                                continue;
                            }
                            if (~var11.field4600 == -1406) {
                                if (!class151.field2198) {
                                    continue;
                                }
                                int var41 = var11.field4627 + var13;
                                int var42 = var15 + 15;
                                int var43 = 16776960;
                                class269.field4186.method1292("Fps:" + class123.field1825, var41, var42, 16776960, -1);
                                int var131 = var42 + 15;
                                Runtime var44 = Runtime.getRuntime();
                                int var45 = 0;
                                int var46 = (int) ((var44.totalMemory() + -var44.freeMemory()) / 1024L);
                                int var47 = 0;
                                if (var46 > 65536) {
                                    var43 = 16711680;
                                }
                                class269.field4186.method1292("Mem:" + var46 + "k", var41, var131, var43, -1);
                                int var48 = 0;
                                for (int var49 = 0; ~var49 > -30; ++var49) {
                                    var45 += class64.field1064[var49].method499(-81);
                                    var47 += class64.field1064[var49].method501((byte) 11);
                                    var48 += class64.field1064[var49].method502(111);
                                }
                                var42 = var131 + 15;
                                int var50 = 16776960;
                                int var51 = var47 * 10000 / var45;
                                int var52 = var48 * 100 / var45;
                                String var53 = "Cache:" + class124.method871(0, true, (long) var51, 2, -116) + "% (" + var52 + "%)";
                                class246.field3835.method1292(var53, var41, var42, var50, -1);
                                var42 += 12;
                                class17.field315[var12] = true;
                                class285.field4371[var12] = true;
                                continue;
                            }
                            if (var11.field4600 == 1406) {
                                class64.field1066 = var11;
                                class167.field2461 = var15;
                                class127.field1869 = var13;
                                continue;
                            }
                        }
                        if (!class66.field1093) {
                            if (var11.field4553 == 0 && var11.field4538 && var21 <= class102.field1490 && class101.field1470 >= var20 && ~var24 < ~class102.field1490 && class101.field1470 < var25 && !class112.field1712) {
                                class265.field4147[0] = 1007;
                                class51.field826 = 1;
                                class186.field2708[0] = class181.field2642;
                                class179.field2614[0] = class240.field3737;
                                class280.field4297[0] = "";
                            }
                            if (~var21 >= ~class102.field1490 && var20 <= class101.field1470 && var24 > class102.field1490 && ~class101.field1470 > ~var25) {
                                class253.method1720(-var15 + class101.field1470, -1, var11, -var13 + class102.field1490);
                            }
                        }
                        if (var11.field4553 == 0) {
                            if (!var11.field4647 && client.method330(var11) && class148.field2144 != var11) {
                                continue;
                            }
                            if (!var11.field4647) {
                                if (~(var11.field4675 - var11.field4531) > ~var11.field4594) {
                                    var11.field4594 = -var11.field4531 + var11.field4675;
                                }
                                if (~var11.field4594 > -1) {
                                    var11.field4594 = 0;
                                }
                            }
                            method751(-var11.field4594 + var15, var13 - var11.field4656, var21, 109, var20, var12, var11.field4683, var25, var24, arg9);
                            if (var11.field4646 != null) {
                                method751(-var11.field4594 + var15, -var11.field4656 + var13, var21, 107, var20, var12, var11.field4683, var25, var24, var11.field4646);
                            }
                            class123 var54 = (class123) class124.field1833.method306((long) var11.field4683, 16216);
                            if (var54 != null) {
                                if (~var54.field1820 == -1 && !class66.field1093 && class102.field1490 >= var21 && ~class101.field1470 <= ~var20 && ~class102.field1490 > ~var24 && class101.field1470 < var25 && !class112.field1712) {
                                    class51.field826 = 1;
                                    class265.field4147[0] = 1007;
                                    class186.field2708[0] = class181.field2642;
                                    class179.field2614[0] = class240.field3737;
                                    class280.field4297[0] = "";
                                }
                                class67.method532(var21, var25, var54.field1823, -108, var12, var24, var20, var15, var13);
                            }
                            class72.method567(arg2, arg4, arg8, arg7);
                            class119.method842();
                        }
                        if (class92.field1391[var12] || class275.field4250 > 1) {
                            if (~var11.field4553 == -1 && !var11.field4647 && var11.field4675 > var11.field4531) {
                                class149.method1010(var11.field4627 + var13, var15, (byte) 18, var11.field4675, var11.field4531, var11.field4594);
                            }
                            if (var11.field4553 != 1) {
                                if (~var11.field4553 == -3) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field4530; ++var56) {
                                        for (int var57 = 0; var57 < var11.field4686; ++var57) {
                                            int var58 = var13 - -((var11.field4554 + 32) * var57);
                                            int var59 = var15 - -((var11.field4620 + 32) * var56);
                                            if (~var55 > -21) {
                                                var59 += var11.field4617[var55];
                                                var58 += var11.field4556[var55];
                                            }
                                            if (~var11.field4529[var55] >= -1) {
                                                if (var11.field4689 != null && ~var55 > -21) {
                                                    class256 var71 = var11.method1972(true, var55);
                                                    if (var71 != null) {
                                                        var71.method1230(var58, var59);
                                                    } else if (class143.field2065) {
                                                        class297.method1979((byte) -48, var11);
                                                    }
                                                }
                                            } else {
                                                boolean var60 = false;
                                                boolean var61 = false;
                                                int var62 = var11.field4529[var55] + -1;
                                                if (var58 - -32 > arg2 && var58 < arg8 && arg4 < var59 + 32 && arg7 > var59 || class211.field3177 == var11 && ~class172.field2525 == ~var55) {
                                                    class256 var63;
                                                    if (class277.field4275 == 1 && class261.field4025 == var55 && ~class139.field2018 == ~var11.field4683) {
                                                        var63 = class62.method511((class261) null, 2, true, 0, var11.field4586, var62, var11.field4654[var55]);
                                                    } else {
                                                        var63 = class62.method511((class261) null, 1, true, 3153952, var11.field4586, var62, var11.field4654[var55]);
                                                    }
                                                    if (class119.field1778) {
                                                        class17.field315[var12] = true;
                                                    }
                                                    if (var63 != null) {
                                                        if (class211.field3177 == var11 && class172.field2525 == var55) {
                                                            int var64 = -class259.field3970 + class105.field1542;
                                                            int var65 = -class253.field3902 + class12.field172;
                                                            if (var64 < 5 && ~var64 < 4) {
                                                                var64 = 0;
                                                            }
                                                            if (~var65 > -6 && var65 > -5) {
                                                                var65 = 0;
                                                            }
                                                            if (~class248.field3849 > -6) {
                                                                var65 = 0;
                                                                var64 = 0;
                                                            }
                                                            var63.method1229(var58 - -var65, var59 + var64, 128);
                                                            if (arg6 != -1) {
                                                                class297 var66 = arg9[arg6 & 65535];
                                                                int var67 = class72.field1176;
                                                                int var68 = class72.field1178;
                                                                if (~var67 < ~(var59 - -var64) && var66.field4594 > 0) {
                                                                    int var69 = (-var64 + var67 + -var59) * class177.field2599 / 3;
                                                                    if (class177.field2599 * 10 < var69) {
                                                                        var69 = class177.field2599 * 10;
                                                                    }
                                                                    if (var69 > var66.field4594) {
                                                                        var69 = var66.field4594;
                                                                    }
                                                                    var66.field4594 -= var69;
                                                                    class259.field3970 += var69;
                                                                    class297.method1979((byte) -45, var66);
                                                                }
                                                                if (var68 < var59 - (-var64 + -32) && var66.field4594 < -var66.field4531 + var66.field4675) {
                                                                    int var70 = (var59 - -32 + -var68 + var64) * class177.field2599 / 3;
                                                                    if (~(class177.field2599 * 10) > ~var70) {
                                                                        var70 = class177.field2599 * 10;
                                                                    }
                                                                    if (-var66.field4594 + var66.field4675 + -var66.field4531 < var70) {
                                                                        var70 = -var66.field4594 + -var66.field4531 + var66.field4675;
                                                                    }
                                                                    class259.field3970 -= var70;
                                                                    var66.field4594 += var70;
                                                                    class297.method1979((byte) -55, var66);
                                                                }
                                                            }
                                                        } else if (class111.field1695 == var11 && class130.field1924 == var55) {
                                                            var63.method1229(var58, var59, 128);
                                                        } else {
                                                            var63.method1230(var58, var59);
                                                        }
                                                    } else {
                                                        class297.method1979((byte) -123, var11);
                                                    }
                                                }
                                            }
                                            ++var55;
                                        }
                                    }
                                } else if (var11.field4553 == 3) {
                                    int var72;
                                    if (class232.method1582(4, var11)) {
                                        var72 = var11.field4629;
                                        if (class148.field2144 == var11 && ~var11.field4638 != -1) {
                                            var72 = var11.field4638;
                                        }
                                    } else {
                                        var72 = var11.field4522;
                                        if (class148.field2144 == var11 && ~var11.field4671 != -1) {
                                            var72 = var11.field4671;
                                        }
                                    }
                                    if (~var14 == -1) {
                                        if (!var11.field4574) {
                                            class72.method564(var13, var15, var11.field4627, var11.field4531, var72);
                                        } else {
                                            class72.method576(var13, var15, var11.field4627, var11.field4531, var72);
                                        }
                                    } else if (var11.field4574) {
                                        class72.method573(var13, var15, var11.field4627, var11.field4531, var72, -(255 & var14) + 256);
                                    } else {
                                        class72.method577(var13, var15, var11.field4627, var11.field4531, var72, -(var14 & 255) + 256);
                                    }
                                } else if (~var11.field4553 == -5) {
                                    class192 var73 = var11.method1983(class71.field1166, 28755);
                                    if (var73 == null) {
                                        if (class143.field2065) {
                                            class297.method1979((byte) -123, var11);
                                        }
                                    } else {
                                        String var74 = var11.field4581;
                                        int var75;
                                        if (!class232.method1582(4, var11)) {
                                            var75 = var11.field4522;
                                            if (class148.field2144 == var11 && ~var11.field4671 != -1) {
                                                var75 = var11.field4671;
                                            }
                                        } else {
                                            var75 = var11.field4629;
                                            if (class148.field2144 == var11 && var11.field4638 != 0) {
                                                var75 = var11.field4638;
                                            }
                                            if (~var11.field4703.length() < -1) {
                                                var74 = var11.field4703;
                                            }
                                        }
                                        if (var11.field4647 && ~var11.field4608 != 0) {
                                            class15 var76 = class140.method951((byte) -94, var11.field4608);
                                            var74 = var76.field265;
                                            if (var74 == null) {
                                                var74 = "null";
                                            }
                                            if ((var76.field267 == 1 || ~var11.field4614 != -2) && ~var11.field4614 != 0) {
                                                var74 = "<col=ff9040>" + var74 + "</col> x" + class75.method599(8526, var11.field4614);
                                            }
                                        }
                                        if (class7.field90 == var11) {
                                            var75 = var11.field4522;
                                            var74 = class13.field189;
                                        }
                                        if (!var11.field4647) {
                                            var74 = class239.method1641(var11, 0, var74);
                                        }
                                        var73.method1286(var74, var13, var15, var11.field4627, var11.field4531, var75, !var11.field4644 ? -1 : 0, var11.field4677, var11.field4612, var11.field4577);
                                    }
                                } else if (var11.field4553 == 5) {
                                    if (!var11.field4647) {
                                        class256 var77 = var11.method1971(class232.method1582(4, var11), (byte) -108);
                                        if (var77 == null) {
                                            if (class143.field2065) {
                                                class297.method1979((byte) -80, var11);
                                            }
                                        } else {
                                            var77.method1230(var13, var15);
                                        }
                                    } else if (var11.field4547 >= 0) {
                                        class204 var78 = var11.method1980(94);
                                        var78.method1353(0, var13, var15, var11.field4627, var11.field4531, var11.field4592, var11.field4570, 0);
                                    } else {
                                        class256 var79;
                                        if (var11.field4608 == -1) {
                                            var79 = var11.method1971(false, (byte) -92);
                                        } else if (var11.field4625 && class185.field2687.field3487 != null) {
                                            var79 = class62.method511(class185.field2687.field3487, var11.field4615, true, var11.field4593, var11.field4586, var11.field4608, var11.field4614);
                                        } else {
                                            var79 = class62.method511((class261) null, var11.field4615, true, var11.field4593, var11.field4586, var11.field4608, var11.field4614);
                                        }
                                        if (var79 == null) {
                                            if (class143.field2065) {
                                                class297.method1979((byte) -119, var11);
                                            }
                                        } else {
                                            int var80 = var79.field3941;
                                            int var81 = var79.field3943;
                                            if (!var11.field4697) {
                                                int var86 = var11.field4627 * 4096 / var80;
                                                if (~var11.field4699 == -1) {
                                                    if (~var14 == -1) {
                                                        if (var11.field4627 == var80 && var11.field4531 == var81) {
                                                            var79.method1230(var13, var15);
                                                        } else {
                                                            var79.method1225(var13, var15, var11.field4627, var11.field4531);
                                                        }
                                                    } else {
                                                        var79.method1226(var13, var15, var11.field4627, var11.field4531, -(255 & var14) + 256);
                                                    }
                                                } else {
                                                    var79.method1734(var86, var11.field4531 / 2 + var15, 15, var11.field4699, var11.field4627 / 2 + var13);
                                                }
                                            } else {
                                                int var82 = (var11.field4627 + var80 + -1) / var80;
                                                int var83 = (-1 - -var81 + var11.field4531) / var81;
                                                class72.method570(var13, var15, var13 - -var11.field4627, var15 - -var11.field4531);
                                                for (int var84 = 0; ~var84 > ~var82; ++var84) {
                                                    for (int var85 = 0; var83 > var85; ++var85) {
                                                        if (~var11.field4699 != -1) {
                                                            var79.method1734(4096, var81 * var85 + var15 - -(var81 / 2), 15, var11.field4699, var13 - (-(var80 * var84) - var80 / 2));
                                                        } else if (var14 == 0) {
                                                            var79.method1230(var13 - -(var80 * var84), var81 * var85 + var15);
                                                        } else {
                                                            var79.method1229(var80 * var84 + var13, var81 * var85 + var15, 256 - (var14 & 255));
                                                        }
                                                    }
                                                }
                                                class72.method567(arg2, arg4, arg8, arg7);
                                            }
                                        }
                                    }
                                } else if (var11.field4553 == 6) {
                                    boolean var87 = class232.method1582(4, var11);
                                    int var88;
                                    if (!var87) {
                                        var88 = var11.field4613;
                                    } else {
                                        var88 = var11.field4544;
                                    }
                                    int var89 = 0;
                                    class2 var90 = null;
                                    if (var11.field4608 == -1) {
                                        if (~var11.field4584 != -6) {
                                            if (~var88 != 0) {
                                                class220 var91 = class108.method781(var88, -1);
                                                var90 = var11.method1976(var87, var11.field4701, var11.field4546, class185.field2687.field3487, var91, (byte) 55, var11.field4527);
                                                if (var90 == null && class143.field2065) {
                                                    class297.method1979((byte) -63, var11);
                                                }
                                            } else {
                                                var90 = var11.method1976(var87, 0, -1, class185.field2687.field3487, (class220) null, (byte) -123, -1);
                                                if (var90 == null && class143.field2065) {
                                                    class297.method1979((byte) -110, var11);
                                                }
                                            }
                                        } else if (~var11.field4604 == 0) {
                                            var90 = class171.field2508.method1761((class85[]) null, -1, (class220) null, -1, 0, (class220) null, -1, -1, true, 0, 1073741823);
                                        } else {
                                            int var92 = 2047 & var11.field4604;
                                            if (class138.field1996 == var92) {
                                                var92 = 2047;
                                            }
                                            class224 var93 = class166.field2438[var92];
                                            class220 var94 = var88 == -1 ? null : class108.method781(var88, -1);
                                            if (var93 != null && ~((int) class37.method286(25077, var93.field3488) << 11) == ~(-2048 & var11.field4604)) {
                                                var90 = var93.field3487.method1761((class85[]) null, -1, (class220) null, var11.field4546, 0, var94, -1, 0, true, 0, 1073741823);
                                            }
                                        }
                                    } else {
                                        class15 var95 = class140.method951((byte) -94, var11.field4608);
                                        if (var95 != null) {
                                            class15 var96 = var95.method110(var11.field4614, false);
                                            class220 var97 = ~var88 != 0 ? class108.method781(var88, -1) : null;
                                            if (var11.field4625 && class185.field2687.field3487 != null) {
                                                var90 = var96.method115(var11.field4527, -118, var11.field4701, var11.field4546, class185.field2687.field3487, var97, 1);
                                            } else {
                                                var90 = var96.method115(var11.field4527, 83, var11.field4701, var11.field4546, (class261) null, var97, 1);
                                            }
                                            if (var90 == null) {
                                                class297.method1979((byte) -91, var11);
                                            } else {
                                                var89 = -var90.method19() / 2;
                                            }
                                        }
                                    }
                                    if (var90 != null) {
                                        int var98;
                                        if (~var11.field4560 >= -1) {
                                            var98 = 256;
                                        } else {
                                            var98 = (var11.field4627 << 8) / var11.field4560;
                                        }
                                        int var99;
                                        if (~var11.field4536 < -1) {
                                            var99 = (var11.field4531 << 8) / var11.field4536;
                                        } else {
                                            var99 = 256;
                                        }
                                        int var100 = var11.field4627 / 2 + (var13 - -(var11.field4588 * var98 >> 8));
                                        int var101 = (var11.field4523 * var99 >> 8) + (var15 - -(var11.field4531 / 2));
                                        class119.method853(var100, var101);
                                        int var102 = class119.field1774[var11.field4622] * var11.field4624 >> 16;
                                        int var103 = class119.field1776[var11.field4622] * var11.field4624 >> 16;
                                        if (var11.field4647) {
                                            if (var11.field4618) {
                                                ((class263) var90).method1787(0, var11.field4691, var11.field4597, var11.field4622, var11.field4601, var11.field4668 + var102 + var89, var103 - -var11.field4668, var11.field4624);
                                            } else {
                                                var90.method20(0, var11.field4691, var11.field4597, var11.field4622, var11.field4601, var11.field4668 + var102 + var89, var103 - -var11.field4668, -1L);
                                            }
                                        } else {
                                            var90.method20(0, var11.field4691, 0, var11.field4622, 0, var102, var103, -1L);
                                        }
                                        class119.method845();
                                    }
                                } else {
                                    if (var11.field4553 == 7) {
                                        class192 var104 = var11.method1983(class71.field1166, 28755);
                                        if (var104 == null) {
                                            if (class143.field2065) {
                                                class297.method1979((byte) -48, var11);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; var11.field4530 > var106; ++var106) {
                                            for (int var107 = 0; ~var11.field4686 < ~var107; ++var107) {
                                                if (~var11.field4529[var105] < -1) {
                                                    class15 var108 = class140.method951((byte) -94, var11.field4529[var105] + -1);
                                                    String var109;
                                                    if (var108.field267 != 1 && var11.field4654[var105] == 1) {
                                                        var109 = "<col=ff9040>" + var108.field265 + "</col>";
                                                    } else {
                                                        var109 = "<col=ff9040>" + var108.field265 + "</col> x" + class75.method599(8526, var11.field4654[var105]);
                                                    }
                                                    int var110 = (var11.field4554 + 115) * var107 + var13;
                                                    int var111 = (var11.field4620 + 12) * var106 + var15;
                                                    if (var11.field4677 != 0) {
                                                        if (~var11.field4677 != -2) {
                                                            var104.method1292(var109, var110 + 114, var111, var11.field4522, var11.field4644 ? 0 : -1);
                                                        } else {
                                                            var104.method1303(var109, var110 + 57, var111, var11.field4522, !var11.field4644 ? -1 : 0);
                                                        }
                                                    } else {
                                                        var104.method1291(var109, var110, var111, var11.field4522, var11.field4644 ? 0 : -1);
                                                    }
                                                }
                                                ++var105;
                                            }
                                        }
                                    }
                                    if (var11.field4553 == 8 && class245.field3820 == var11 && class84.field1282 == class216.field3332) {
                                        int var112 = 0;
                                        class192 var113 = class269.field4186;
                                        int var114 = 0;
                                        String var115 = var11.field4581;
                                        String var116 = class239.method1641(var11, 0, var115);
                                        while (~var116.length() < -1) {
                                            int var124 = var116.indexOf("<br>");
                                            String var125;
                                            if (var124 == -1) {
                                                var125 = var116;
                                                var116 = "";
                                            } else {
                                                var125 = var116.substring(0, var124);
                                                var116 = var116.substring(var124 + 4);
                                            }
                                            int var126 = var113.method1293(var125);
                                            if (var112 < var126) {
                                                var112 = var126;
                                            }
                                            var114 += var113.field2906 + 1;
                                        }
                                        var114 += 7;
                                        var112 += 6;
                                        int var117 = var13 + -5 - -var11.field4627 - var112;
                                        int var118 = var11.field4531 + var15 + 5;
                                        if (~(var13 + 5) < ~var117) {
                                            var117 = var13 + 5;
                                        }
                                        if (~(var114 + var118) < ~arg7) {
                                            var118 = -var114 + arg7;
                                        }
                                        if (var112 + var117 > arg8) {
                                            var117 = arg8 - var112;
                                        }
                                        class72.method576(var117, var118, var112, var114, 16777120);
                                        class72.method564(var117, var118, var112, var114, 0);
                                        int var119 = var118 + 2 + var113.field2906;
                                        String var120 = var11.field4581;
                                        String var121 = class239.method1641(var11, 0, var120);
                                        while (~var121.length() < -1) {
                                            int var122 = var121.indexOf("<br>");
                                            String var123;
                                            if (~var122 == 0) {
                                                var123 = var121;
                                                var121 = "";
                                            } else {
                                                var123 = var121.substring(0, var122);
                                                var121 = var121.substring(var122 + 4);
                                            }
                                            var113.method1291(var123, var117 + 3, var119, 0, -1);
                                            var119 += var113.field2906 - -1;
                                        }
                                    }
                                    if (var11.field4553 == 9) {
                                        int var127;
                                        int var128;
                                        int var129;
                                        int var130;
                                        if (!var11.field4670) {
                                            var127 = var11.field4531 + var15;
                                            var128 = var15;
                                            var129 = var11.field4627 + var13;
                                            var130 = var13;
                                        } else {
                                            var129 = var11.field4627 + var13;
                                            var127 = var15;
                                            var130 = var13;
                                            var128 = var15 - -var11.field4531;
                                        }
                                        if (var11.field4524 != 1) {
                                            class72.method565(var130, var128, var129, var127, var11.field4522, var11.field4524);
                                        } else {
                                            class72.method568(var130, var128, var129, var127, var11.field4522);
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

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BIILjk;)V")
    public static final void method752(byte arg0, int arg1, int arg2, class297 arg3) {
        if (~arg3.field4606 != -1) {
            if (arg3.field4606 != 1) {
                if (~arg3.field4606 != -3) {
                    if (~arg3.field4606 == -4) {
                        arg3.field4700 = arg3.field4551 * arg2 >> 14;
                    } else if (arg3.field4606 == 4) {
                        arg3.field4700 = (arg3.field4551 * arg2 >> 14) + (-arg3.field4627 + arg2) / 2;
                    } else {
                        arg3.field4700 = -arg3.field4627 + arg2 + -(arg3.field4551 * arg2 >> 14);
                    }
                } else {
                    arg3.field4700 = -arg3.field4627 + -arg3.field4551 + arg2;
                }
            } else {
                arg3.field4700 = (-arg3.field4627 + arg2) / 2 + arg3.field4551;
            }
        } else {
            arg3.field4700 = arg3.field4551;
        }
        ++field1509;
        if (arg0 <= 98) {
            field1512 = false;
        }
        if (arg3.field4579 != 0) {
            if (arg3.field4579 != 1) {
                if (~arg3.field4579 == -3) {
                    arg3.field4578 = -arg3.field4531 + arg1 + -arg3.field4564;
                } else if (~arg3.field4579 == -4) {
                    arg3.field4578 = arg3.field4564 * arg1 >> 14;
                } else if (arg3.field4579 == 4) {
                    arg3.field4578 = (-arg3.field4531 + arg1) / 2 - -(arg3.field4564 * arg1 >> 14);
                } else {
                    arg3.field4578 = -arg3.field4531 + arg1 + -(arg3.field4564 * arg1 >> 14);
                }
            } else {
                arg3.field4578 = (-arg3.field4531 + arg1) / 2 - -arg3.field4564;
            }
        } else {
            arg3.field4578 = arg3.field4564;
        }
        if (class112.field1712) {
            if (client.method333(arg3).field4515 != 0 || ~arg3.field4553 == -1) {
                if (~arg3.field4578 <= -1) {
                    if (~(arg3.field4578 + arg3.field4531) < ~arg1) {
                        arg3.field4578 = arg1 - arg3.field4531;
                    }
                } else {
                    arg3.field4578 = 0;
                }
                if (arg3.field4700 >= 0) {
                    if (arg3.field4700 - -arg3.field4627 > arg2) {
                        arg3.field4700 = arg2 - arg3.field4627;
                        return;
                    }
                } else {
                    arg3.field4700 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
    public static final void method753(int arg0) {
        ++field1506;
        if (class27.field527 != -1 && class172.field2518 != -1) {
            int var1 = class277.field4267 - -((-class277.field4267 + class146.field2124) * class260.field3991 >> 16);
            float[] var2 = new float[3];
            int var3 = class217.field3337 * 2;
            class260.field3991 += var1;
            if (~class260.field3991 > -65536) {
                class63.field1062 = false;
                class160.field2324 = false;
            } else {
                class260.field3991 = 65535;
                if (!class63.field1062) {
                    class160.field2324 = true;
                } else {
                    class160.field2324 = false;
                }
                class63.field1062 = true;
            }
            float var4 = (float) class260.field3991 / 65535.0F;
            for (int var5 = 0; var5 < 3; ++var5) {
                int var21 = class240.field3735[class27.field527][var3 + 1][var5] * 3;
                int var22 = class240.field3735[class27.field527][var3][var5] * 3;
                int var23 = (class240.field3735[class27.field527][var3 + 2][var5] - class240.field3735[class27.field527][var3 + 3][var5] + class240.field3735[class27.field527][var3 + 2][var5]) * 3;
                int var24 = -var22 + var21;
                int var25 = -(var21 * 2) + var22 + var23;
                int var26 = class240.field3735[class27.field527][var3][var5];
                int var27 = -var26 - var23 + class240.field3735[class27.field527][var3 + 2][var5] + var21;
                var2[var5] = (((float) var27 * var4 + (float) var25) * var4 + (float) var24) * var4 + (float) var26;
            }
            class209.field3127 = (int) var2[2] + -(class188.field2774 * 128);
            class90.field1377 = (int) var2[0] - class90.field1367 * 128;
            class157.field2292 = (int) var2[1] * -1;
            float[] var6 = new float[3];
            int var7 = class216.field3317 * 2;
            for (int var8 = 0; ~var8 > -4; ++var8) {
                int var14 = class240.field3735[class172.field2518][var7][var8] * 3;
                int var15 = class240.field3735[class172.field2518][var7 + 1][var8] * 3;
                int var16 = -var14 + var15;
                int var17 = class240.field3735[class172.field2518][var7][var8];
                int var18 = (class240.field3735[class172.field2518][var7 - -2][var8] - class240.field3735[class172.field2518][var7 + 3][var8] + class240.field3735[class172.field2518][var7 + 2][var8]) * 3;
                int var19 = -(var15 * 2) + var14 + var18;
                int var20 = class240.field3735[class172.field2518][var7 + 2][var8] + var15 - (var17 + var18);
                var6[var8] = (((float) var20 * var4 + (float) var19) * var4 + (float) var16) * var4 + (float) var17;
            }
            float var9 = var6[0] + -var2[0];
            float var10 = var6[arg0] + -var2[2];
            float var11 = (var6[1] + -var2[1]) * -1.0F;
            double var12 = Math.sqrt((double) (var9 * var9 + var10 * var10));
            class37.field643 = (float) Math.atan2((double) var11, var12);
            class20.field340 = -((float) Math.atan2((double) var9, (double) var10));
            class205.field3074 = 2047 & (int) ((double) class20.field340 * 325.949D);
            class254.field3919 = (int) ((double) class37.field643 * 325.949D) & 2047;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        ++field1514;
        if (arg0 != 6) {
            method749(76, -9, -114, (byte[]) null, (String) null, -91);
        }
        if (arg1 == 0) {
            this.field1510 = arg2.method423(120);
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field1505;
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            int var4 = class199.field2985[arg1];
            for (int var5 = 0; ~class226.field3527 < ~var5; ++var5) {
                int var6 = class112.field1716[var5];
                if (var6 > this.field1510 && ~var6 > ~(4096 - this.field1510) && ~var4 < ~(2048 - this.field1510) && ~(2048 - -this.field1510) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1510 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > -this.field1510 + 2048 && ~(this.field1510 + 2048) < ~var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1510;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field1510);
                } else if (this.field1510 <= var4 && ~var4 >= ~(-this.field1510 + 4096)) {
                    if (~this.field1510 >= ~var6 && var6 <= -this.field1510 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field1510);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field1510;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1510 + 2048);
                }
            }
        }
        if (arg0 <= 75) {
            field1512 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(II)V")
    public static final void method754(int arg0, int arg1) {
        class8.field93.method938(arg0, (byte) -123);
        ++field1507;
        if (arg1 != -28973) {
            method754(36, 78);
        }
    }
}
