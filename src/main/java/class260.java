import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class260 extends class117 {

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
    private int field4547 = 0;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
    private int field4555 = 0;

    @OriginalMember(owner = "client!rd", name = "hb", descriptor = "I")
    private int field4562 = 20;

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "I")
    private int field4559 = 1365;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "Lhh;")
    public static class163 field4548 = class137.method1065("Okay", 17);

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "I")
    public static int field4551 = 0;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "Lhh;")
    public static class163 field4550 = class137.method1065("gleiten:", 17);

    @OriginalMember(owner = "client!rd", name = "ib", descriptor = "Lhh;")
    public static class163 field4563 = class137.method1065("www", 17);

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!rd", name = "gb", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "[I")
    public static int[] field4553;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([Lqh;IIIIIIBII)V")
    public static final void method1756(class69[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        ++field4561;
        class206.method1466(arg2, arg9, arg5, arg6);
        class98.method775();
        if (arg7 != 28) {
            method1760((byte) -9);
        }
        for (int var10 = 0; var10 < arg0.length; ++var10) {
            class69 var11 = arg0[var10];
            if (var11 != null && (var11.field1302 == arg8 || ~arg8 == 1412584498 && class109.field2063 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class116.field2197[class52.field880] = var11.field1243 + arg1;
                    class236.field4216[class52.field880] = var11.field1218 + arg4;
                    class252.field4416[class52.field880] = var11.field1183;
                    class82.field1590[class52.field880] = var11.field1220;
                    var12 = class52.field880++;
                } else {
                    var12 = arg3;
                }
                var11.field1182 = var12;
                var11.field1198 = class227.field4092;
                if (!var11.field1240 || !client.method839(var11)) {
                    if (~var11.field1217 < -1) {
                        class114.method909(var11, -102);
                    }
                    int var13 = var11.field1218 + arg4;
                    int var14 = var11.field1243 + arg1;
                    int var15 = var11.field1199;
                    if (class127.field2470 && (~client.method826(var11) != -1 || ~var11.field1294 == -1) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class109.field2063 == var11) {
                        if (arg8 != -1412584499 && !var11.field1251) {
                            class159.field2933 = arg4;
                            class191.field3503 = arg1;
                            class22.field367 = arg0;
                            continue;
                        }
                        if (class212.field3866 && class193.field3523) {
                            int var16 = class36.field608;
                            int var17 = class240.field4281;
                            int var18 = var16 - class4.field88;
                            if (~var18 > ~class188.field3449) {
                                var18 = class188.field3449;
                            }
                            int var19 = var17 - class204.field3699;
                            if (var11.field1183 + var18 > class188.field3449 + class144.field2730.field1183) {
                                var18 = -var11.field1183 + class144.field2730.field1183 + class188.field3449;
                            }
                            if (~var19 > ~class81.field1563) {
                                var19 = class81.field1563;
                            }
                            if (class81.field1563 + class144.field2730.field1220 < var19 - -var11.field1220) {
                                var19 = -var11.field1220 + class144.field2730.field1220 + class81.field1563;
                            }
                            var14 = var18;
                            var13 = var19;
                        }
                        if (!var11.field1251) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (~var11.field1294 == -3) {
                        var20 = arg2;
                        var21 = arg6;
                        var22 = arg9;
                        var23 = arg5;
                    } else {
                        var22 = ~arg9 <= ~var13 ? arg9 : var13;
                        var20 = arg2 >= var14 ? arg2 : var14;
                        int var24 = var11.field1183 + var14;
                        int var25 = var13 - -var11.field1220;
                        if (~var11.field1294 == -10) {
                            ++var24;
                            ++var25;
                        }
                        var21 = ~arg6 >= ~var25 ? arg6 : var25;
                        var23 = arg5 <= var24 ? arg5 : var24;
                    }
                    if (!var11.field1240 || var20 < var23 && ~var22 > ~var21) {
                        if (var11.field1217 != 0) {
                            if (var11.field1217 == 1337) {
                                class137.field2646 = var11;
                                class125.field2404 = var14;
                                class26.field411 = var13;
                                class54.method369(var11.field1183, var14, var13, (byte) 85, var11.field1220, var11.field1217 == 1403);
                                class206.method1466(arg2, arg9, arg5, arg6);
                                continue;
                            }
                            if (var11.field1217 == 1338) {
                                if (var11.method492((byte) -74)) {
                                    class56.method393(var13, var11, var14, var12, arg7 ^ 116);
                                    class206.method1466(arg2, arg9, arg5, arg6);
                                }
                                continue;
                            }
                            if (var11.field1217 == 1339) {
                                if (var11.method492((byte) -74)) {
                                    class257.method1737(var12, arg7 ^ -4247, var13, var14, var11);
                                    class206.method1466(arg2, arg9, arg5, arg6);
                                }
                                continue;
                            }
                            if (var11.field1217 == 1400) {
                                class262.method1775(-8, var11.field1183, var13, var11.field1220, var14);
                                class110.field2086[var12] = true;
                                class91.field1671[var12] = true;
                                class206.method1466(arg2, arg9, arg5, arg6);
                                continue;
                            }
                            if (var11.field1217 == 1401) {
                                class199.method1428(var13, 50, var14, var11.field1220, var11.field1183);
                                class110.field2086[var12] = true;
                                class91.field1671[var12] = true;
                                class206.method1466(arg2, arg9, arg5, arg6);
                                continue;
                            }
                            if (~var11.field1217 == -1403) {
                                class187.method1382(var14, arg7 ^ 28, var13);
                                class110.field2086[var12] = true;
                                class91.field1671[var12] = true;
                                continue;
                            }
                            if (var11.field1217 == 1404) {
                                class210.method1505(var13, var11.field1183, arg7 + -98, class43.field739, var11, var14, class216.field3932, var11.field1220);
                                class110.field2086[var12] = true;
                                class91.field1671[var12] = true;
                                continue;
                            }
                            if (~var11.field1217 == -1406) {
                                if (class174.field3172) {
                                    int var26 = var11.field1183 + var14;
                                    int var27 = var13 + 15;
                                    class12.field192.method578(class145.method1101(0, new class163[] { class88.field1632, class136.method1061(class52.field879, (byte) 120) }), var26, var27, 16776960, -1);
                                    Runtime var28 = Runtime.getRuntime();
                                    int var109 = var27 + 15;
                                    int var29 = 16776960;
                                    int var30 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    if (~var30 < -65537) {
                                        var29 = 16711680;
                                    }
                                    class12.field192.method578(class145.method1101(0, new class163[] { class240.field4285, class136.method1061(var30, (byte) 112), class67.field1146 }), var26, var109, var29, -1);
                                    var27 = var109 + 15;
                                    class110.field2086[var12] = true;
                                    class91.field1671[var12] = true;
                                }
                                continue;
                            }
                        }
                        if (var11.field1294 == 0 && var11.field1166 && ~var20 >= ~class36.field608 && class240.field4281 >= var22 && ~class36.field608 > ~var23 && ~var21 < ~class240.field4281 && !class130.field2530 && !class127.field2470) {
                            class62.field1047[0] = class265.field4596;
                            class202.field3647 = 1;
                            class60.field993[0] = class170.field3120;
                            class4.field76[0] = 1006;
                        }
                        int var31 = class36.field608;
                        int var32 = class240.field4281;
                        if (!class130.field2530 && ~var31 <= ~var20 && var32 >= var22 && ~var31 > ~var23 && var21 > var32) {
                            class252.method1715(-var14 + var31, -var13 + var32, arg7 + -19, var11);
                        }
                        if (var11.field1294 == 0) {
                            if (!var11.field1240 && client.method839(var11) && class186.field3408 != var11) {
                                continue;
                            }
                            if (!var11.field1240) {
                                if (~(var11.field1160 - var11.field1220) > ~var11.field1196) {
                                    var11.field1196 = -var11.field1220 + var11.field1160;
                                }
                                if (~var11.field1196 > -1) {
                                    var11.field1196 = 0;
                                }
                            }
                            method1756(arg0, -var11.field1287 + var14, var20, var12, -var11.field1196 + var13, var23, var21, (byte) 28, var11.field1188, var22);
                            if (var11.field1291 != null) {
                                method1756(var11.field1291, -var11.field1287 + var14, var20, var12, -var11.field1196 + var13, var23, var21, (byte) 28, var11.field1188, var22);
                            }
                            class222 var33 = (class222) class92.field1739.method1743((long) var11.field1188, false);
                            if (var33 != null) {
                                if (~var33.field4046 == -1 && ~class36.field608 <= ~var20 && ~class240.field4281 <= ~var22 && class36.field608 < var23 && ~var21 < ~class240.field4281 && !class130.field2530 && !class127.field2470) {
                                    class4.field76[0] = 1006;
                                    class202.field3647 = 1;
                                    class62.field1047[0] = class265.field4596;
                                    class60.field993[0] = class170.field3120;
                                }
                                class17.method118(var23, var14, var20, var22, var33.field4049, var21, var12, var13, (byte) 120);
                            }
                            class206.method1466(arg2, arg9, arg5, arg6);
                            class98.method775();
                        }
                        if (class87.field1619[var12] || class129.field2515 > 1) {
                            if (var11.field1294 == 0 && !var11.field1240 && var11.field1160 > var11.field1220) {
                                class201.method1438(var11.field1160, arg7 + 9, var11.field1220, var11.field1196, var14 - -var11.field1183, var13);
                            }
                            if (var11.field1294 != 1) {
                                if (~var11.field1294 == -3) {
                                    int var34 = 0;
                                    for (int var35 = 0; ~var11.field1259 < ~var35; ++var35) {
                                        for (int var36 = 0; var11.field1320 > var36; ++var36) {
                                            int var37 = (32 - -var11.field1293) * var36 + var14;
                                            int var38 = (var11.field1260 + 32) * var35 + var13;
                                            if (var34 < 20) {
                                                var38 += var11.field1281[var34];
                                                var37 += var11.field1169[var34];
                                            }
                                            if (~var11.field1219[var34] >= -1) {
                                                if (var11.field1304 != null && ~var34 > -21) {
                                                    class71 var50 = var11.method481((byte) -46, var34);
                                                    if (var50 == null) {
                                                        if (class133.field2586) {
                                                            class213.method1517((byte) 11, var11);
                                                        }
                                                    } else {
                                                        var50.method101(var37, var38);
                                                    }
                                                }
                                            } else {
                                                boolean var39 = false;
                                                boolean var40 = false;
                                                int var41 = var11.field1219[var34] + -1;
                                                if (arg2 < var37 + 32 && ~arg5 < ~var37 && ~(var38 + 32) < ~arg9 && ~arg6 < ~var38 || class23.field380 == var11 && class59.field971 == var34) {
                                                    class71 var42;
                                                    if (class56.field928 == 1 && ~class81.field1524 == ~var34 && ~class240.field4275 == ~var11.field1188) {
                                                        var42 = class213.method1518(0, 462808465, var11.field1270, var41, var11.field1332[var34], 2);
                                                    } else {
                                                        var42 = class213.method1518(3153952, 462808465, var11.field1270, var41, var11.field1332[var34], 1);
                                                    }
                                                    if (class98.field1845) {
                                                        class110.field2086[var12] = true;
                                                    }
                                                    if (var42 == null) {
                                                        class213.method1517((byte) 11, var11);
                                                    } else if (class23.field380 == var11 && class59.field971 == var34) {
                                                        int var43 = -class141.field2689 + class36.field608;
                                                        int var44 = -class66.field1115 + class240.field4281;
                                                        if (~var44 > -6 && ~var44 < 4) {
                                                            var44 = 0;
                                                        }
                                                        if (~var43 > -6 && var43 > -5) {
                                                            var43 = 0;
                                                        }
                                                        if (~class49.field823 > -6) {
                                                            var43 = 0;
                                                            var44 = 0;
                                                        }
                                                        var42.method102(var37 - -var43, var38 + var44, 128);
                                                        if (arg8 != -1) {
                                                            class69 var45 = arg0[arg8 & 65535];
                                                            int var46 = class206.field3717;
                                                            int var47 = class206.field3712;
                                                            if (~(var38 + var44) > ~var47 && var45.field1196 > 0) {
                                                                int var48 = (var47 - var44 + -var38) * class52.field877 / 3;
                                                                if (~(class52.field877 * 10) > ~var48) {
                                                                    var48 = class52.field877 * 10;
                                                                }
                                                                if (~var45.field1196 > ~var48) {
                                                                    var48 = var45.field1196;
                                                                }
                                                                class66.field1115 += var48;
                                                                var45.field1196 -= var48;
                                                                class213.method1517((byte) 11, var45);
                                                            }
                                                            if (var38 + var44 + 32 > var46 && -var45.field1220 + var45.field1160 > var45.field1196) {
                                                                int var49 = (var38 - -32 + var44 + -var46) * class52.field877 / 3;
                                                                if (class52.field877 * 10 < var49) {
                                                                    var49 = class52.field877 * 10;
                                                                }
                                                                if (-var45.field1220 + var45.field1160 - var45.field1196 < var49) {
                                                                    var49 = -var45.field1220 + var45.field1160 - var45.field1196;
                                                                }
                                                                class66.field1115 -= var49;
                                                                var45.field1196 += var49;
                                                                class213.method1517((byte) 11, var45);
                                                            }
                                                        }
                                                    } else if (class213.field3885 == var11 && class32.field494 == var34) {
                                                        var42.method102(var37, var38, 128);
                                                    } else {
                                                        var42.method101(var37, var38);
                                                    }
                                                }
                                            }
                                            ++var34;
                                        }
                                    }
                                } else if (~var11.field1294 == -4) {
                                    int var51;
                                    if (!class24.method159(true, var11)) {
                                        var51 = var11.field1170;
                                        if (class186.field3408 == var11 && ~var11.field1273 != -1) {
                                            var51 = var11.field1273;
                                        }
                                    } else {
                                        var51 = var11.field1191;
                                        if (class186.field3408 == var11 && ~var11.field1173 != -1) {
                                            var51 = var11.field1173;
                                        }
                                    }
                                    if (var15 != 0) {
                                        if (!var11.field1311) {
                                            class206.method1469(var14, var13, var11.field1183, var11.field1220, var51, -(var15 & 255) + 256);
                                        } else {
                                            class206.method1461(var14, var13, var11.field1183, var11.field1220, var51, -(255 & var15) + 256);
                                        }
                                    } else if (var11.field1311) {
                                        class206.method1483(var14, var13, var11.field1183, var11.field1220, var51);
                                    } else {
                                        class206.method1471(var14, var13, var11.field1183, var11.field1220, var51);
                                    }
                                } else if (var11.field1294 == 4) {
                                    class79 var52 = var11.method489(class72.field1354, arg7 ^ 107);
                                    if (var52 == null) {
                                        if (class133.field2586) {
                                            class213.method1517((byte) 11, var11);
                                        }
                                    } else {
                                        class163 var53 = var11.field1171;
                                        int var54;
                                        if (class24.method159(true, var11)) {
                                            var54 = var11.field1191;
                                            if (class186.field3408 == var11 && var11.field1173 != 0) {
                                                var54 = var11.field1173;
                                            }
                                            if (~var11.field1197.method1221(-23096) < -1) {
                                                var53 = var11.field1197;
                                            }
                                        } else {
                                            var54 = var11.field1170;
                                            if (class186.field3408 == var11 && ~var11.field1273 != -1) {
                                                var54 = var11.field1273;
                                            }
                                        }
                                        if (var11.field1240 && ~var11.field1177 != 0) {
                                            class99 var55 = class120.method939(22952, var11.field1177);
                                            var53 = var55.field1903;
                                            if (var53 == null) {
                                                var53 = class67.field1148;
                                            }
                                            if ((~var55.field1892 == -2 || var11.field1226 != 1) && ~var11.field1226 != 0) {
                                                var53 = class145.method1101(0, new class163[] { class222.field4041, var53, class119.field2242, class35.method261(0, var11.field1226) });
                                            }
                                        }
                                        if (class18.field283 == var11) {
                                            var54 = var11.field1170;
                                            var53 = class46.field773;
                                        }
                                        if (!var11.field1240) {
                                            var53 = class113.method903(var53, 8572, var11);
                                        }
                                        var52.method576(var53, var14, var13, var11.field1183, var11.field1220, var54, !var11.field1249 ? -1 : 0, var11.field1211, var11.field1216, var11.field1229);
                                    }
                                } else if (var11.field1294 == 5) {
                                    if (!var11.field1240) {
                                        class71 var64 = var11.method479((byte) -121, class24.method159(true, var11));
                                        if (var64 == null) {
                                            if (class133.field2586) {
                                                class213.method1517((byte) 11, var11);
                                            }
                                        } else {
                                            var64.method101(var14, var13);
                                        }
                                    } else {
                                        class71 var56;
                                        if (~var11.field1177 == 0) {
                                            var56 = var11.method479((byte) -121, false);
                                        } else {
                                            var56 = class213.method1518(var11.field1301, 462808465, var11.field1270, var11.field1177, var11.field1226, var11.field1280);
                                        }
                                        if (var56 == null) {
                                            if (class133.field2586) {
                                                class213.method1517((byte) 11, var11);
                                            }
                                        } else {
                                            int var57 = var56.field1339;
                                            int var58 = var56.field1345;
                                            if (!var11.field1279) {
                                                int var63 = var11.field1183 * 4096 / var57;
                                                if (~var11.field1283 == -1) {
                                                    if (var15 == 0) {
                                                        if (~var11.field1183 == ~var57 && var11.field1220 == var58) {
                                                            var56.method101(var14, var13);
                                                        } else {
                                                            var56.method519(var14, var13, var11.field1183, var11.field1220);
                                                        }
                                                    } else {
                                                        var56.method97(var14, var13, var11.field1183, var11.field1220, 256 - (255 & var15));
                                                    }
                                                } else {
                                                    var56.method520(var11.field1183 / 2 + var14, var11.field1220 / 2 + var13, var63, 0, var11.field1283);
                                                }
                                            } else {
                                                int var59 = (var57 + -1 + var11.field1183) / var57;
                                                int var60 = (var58 - 1 + var11.field1220) / var58;
                                                class206.method1472(var14, var13, var14 - -var11.field1183, var11.field1220 + var13);
                                                for (int var61 = 0; ~var61 > ~var59; ++var61) {
                                                    for (int var62 = 0; var62 < var60; ++var62) {
                                                        if (~var11.field1283 == -1) {
                                                            if (~var15 != -1) {
                                                                var56.method102(var14 - -(var57 * var61), var58 * var62 + var13, -(var15 & 255) + 256);
                                                            } else {
                                                                var56.method101(var57 * var61 + var14, var58 * var62 + var13);
                                                            }
                                                        } else {
                                                            var56.method520(var57 * var61 + var14 - -(var57 / 2), var58 / 2 + var58 * var62 + var13, 4096, arg7 ^ 28, var11.field1283);
                                                        }
                                                    }
                                                }
                                                class206.method1466(arg2, arg9, arg5, arg6);
                                            }
                                        }
                                    }
                                } else if (~var11.field1294 == -7) {
                                    boolean var65 = class24.method159(true, var11);
                                    class70 var66 = null;
                                    int var67 = 0;
                                    int var68;
                                    if (var65) {
                                        var68 = var11.field1261;
                                    } else {
                                        var68 = var11.field1192;
                                    }
                                    if (~var11.field1177 != 0) {
                                        class99 var69 = class120.method939(22952, var11.field1177);
                                        if (var69 != null) {
                                            class99 var70 = var69.method793(var11.field1226, (byte) -68);
                                            class18 var71 = ~var68 == 0 ? null : class212.method1511(var68, -1);
                                            var66 = var70.method804(var71, var11.field1252, 1, arg7 ^ 100);
                                            if (var66 != null) {
                                                var67 = -var66.method21() / 2;
                                            } else {
                                                class213.method1517((byte) 11, var11);
                                            }
                                        }
                                    } else if (var11.field1208 != 5) {
                                        if (~var68 != 0) {
                                            class18 var72 = class212.method1511(var68, arg7 ^ -29);
                                            var66 = var11.method474(var65, -4, var72, class235.field4203.field2444, var11.field1252);
                                            if (var66 == null && class133.field2586) {
                                                class213.method1517((byte) 11, var11);
                                            }
                                        } else {
                                            var66 = var11.method474(var65, arg7 + -32, (class18) null, class235.field4203.field2444, -1);
                                            if (var66 == null && class133.field2586) {
                                                class213.method1517((byte) 11, var11);
                                            }
                                        }
                                    } else if (var11.field1245 == -1) {
                                        var66 = class120.field2260.method1338(-1, -1, 0, (class18) null, (class18) null);
                                    } else {
                                        int var73 = var11.field1245 & 2047;
                                        if (~class129.field2513 == ~var73) {
                                            var73 = 2047;
                                        }
                                        class126 var74 = class106.field2029[var73];
                                        class18 var75 = var68 == -1 ? null : class212.method1511(var68, -1);
                                        if (var74 != null && ~((int) var74.field2424.method1193((byte) 102) << 11) == ~(var11.field1245 & -2048)) {
                                            var66 = var74.field2444.method1338(0, var11.field1252, 0, var75, (class18) null);
                                        }
                                    }
                                    if (var66 != null) {
                                        int var76;
                                        if (var11.field1189 <= 0) {
                                            var76 = 256;
                                        } else {
                                            var76 = (var11.field1183 << 8) / var11.field1189;
                                        }
                                        int var77;
                                        if (~var11.field1309 < -1) {
                                            var77 = (var11.field1220 << 8) / var11.field1309;
                                        } else {
                                            var77 = 256;
                                        }
                                        int var78 = (var11.field1331 * var76 >> 8) + var14 - -(var11.field1183 / 2);
                                        int var79 = var11.field1220 / 2 + (var11.field1324 * var77 >> 8) + var13;
                                        class98.method789(var78, var79);
                                        int var80 = class98.field1839[var11.field1193] * var11.field1234 >> 16;
                                        int var81 = class98.field1843[var11.field1193] * var11.field1234 >> 16;
                                        if (!var11.field1240) {
                                            var66.method500(0, var11.field1227, 0, var11.field1193, 0, var80, var81);
                                        } else if (var11.field1263) {
                                            ((class207) var66).method1485(0, var11.field1227, var11.field1327, var11.field1193, var11.field1202, var67 + var80 + var11.field1310, var81 - -var11.field1310, var11.field1234);
                                        } else {
                                            var66.method500(0, var11.field1227, var11.field1327, var11.field1193, var11.field1202, var11.field1310 + var67 + var80, var11.field1310 + var81);
                                        }
                                        class98.method779();
                                    }
                                } else {
                                    if (~var11.field1294 == -8) {
                                        class79 var82 = var11.method489(class72.field1354, 127);
                                        if (var82 == null) {
                                            if (class133.field2586) {
                                                class213.method1517((byte) 11, var11);
                                            }
                                            continue;
                                        }
                                        int var83 = 0;
                                        for (int var84 = 0; var11.field1259 > var84; ++var84) {
                                            for (int var85 = 0; ~var85 > ~var11.field1320; ++var85) {
                                                if (~var11.field1219[var83] < -1) {
                                                    class99 var86 = class120.method939(22952, var11.field1219[var83] - 1);
                                                    class163 var87;
                                                    if (~var86.field1892 != -2 && var11.field1332[var83] == 1) {
                                                        var87 = class145.method1101(0, new class163[] { class222.field4041, var86.field1903, class40.field672 });
                                                    } else {
                                                        var87 = class145.method1101(arg7 ^ 28, new class163[] { class222.field4041, var86.field1903, class119.field2242, class35.method261(0, var11.field1332[var83]) });
                                                    }
                                                    int var88 = (var11.field1260 + 12) * var84 + var13;
                                                    int var89 = var14 - -((var11.field1293 + 115) * var85);
                                                    if (~var11.field1211 != -1) {
                                                        if (var11.field1211 == 1) {
                                                            var82.method584(var87, var89 - -57, var88, var11.field1170, !var11.field1249 ? -1 : 0);
                                                        } else {
                                                            var82.method578(var87, var89 + 115 - 1, var88, var11.field1170, !var11.field1249 ? -1 : 0);
                                                        }
                                                    } else {
                                                        var82.method592(var87, var89, var88, var11.field1170, var11.field1249 ? 0 : -1);
                                                    }
                                                }
                                                ++var83;
                                            }
                                        }
                                    }
                                    if (var11.field1294 == 8 && class2.field38 == var11 && ~class90.field1658 == ~class109.field2068) {
                                        int var90 = 0;
                                        class79 var91 = class12.field192;
                                        class163 var92 = var11.field1171;
                                        int var93 = 0;
                                        class163 var94 = class113.method903(var92, 8572, var11);
                                        while (~var94.method1221(-23096) < -1) {
                                            int var102 = var94.method1229((byte) 127, class187.field3433);
                                            class163 var103;
                                            if (var102 != -1) {
                                                var103 = var94.method1188(true, var102, 0);
                                                var94 = var94.method1216(var102 + 4, (byte) -125);
                                            } else {
                                                var103 = var94;
                                                var94 = class170.field3120;
                                            }
                                            int var104 = var91.method568(var103);
                                            var93 += var91.field1493 + 1;
                                            if (~var90 > ~var104) {
                                                var90 = var104;
                                            }
                                        }
                                        var93 += 7;
                                        var90 += 6;
                                        int var95 = var14 - -var11.field1183 - var90 + -5;
                                        int var96 = var11.field1220 + var13 - -5;
                                        if (~(var93 + var96) < ~arg6) {
                                            var96 = -var93 + arg6;
                                        }
                                        if (var14 - -5 > var95) {
                                            var95 = var14 + 5;
                                        }
                                        if (~arg5 > ~(var90 + var95)) {
                                            var95 = -var90 + arg5;
                                        }
                                        class206.method1483(var95, var96, var90, var93, 16777120);
                                        class206.method1471(var95, var96, var90, var93, 0);
                                        int var97 = var96 + 2 + var91.field1493;
                                        class163 var98 = var11.field1171;
                                        class163 var99 = class113.method903(var98, 8572, var11);
                                        while (var99.method1221(arg7 + -23124) > 0) {
                                            int var100 = var99.method1229((byte) 97, class187.field3433);
                                            class163 var101;
                                            if (var100 != -1) {
                                                var101 = var99.method1188(true, var100, 0);
                                                var99 = var99.method1216(var100 + 4, (byte) -125);
                                            } else {
                                                var101 = var99;
                                                var99 = class170.field3120;
                                            }
                                            var91.method592(var101, var95 + 3, var97, 0, -1);
                                            var97 += var91.field1493 - -1;
                                        }
                                    }
                                    if (var11.field1294 == 9) {
                                        int var105;
                                        int var106;
                                        int var107;
                                        int var108;
                                        if (!var11.field1190) {
                                            var105 = var11.field1183 + var14;
                                            var106 = var13;
                                            var107 = var11.field1220 + var13;
                                            var108 = var14;
                                        } else {
                                            var107 = var13;
                                            var106 = var11.field1220 + var13;
                                            var105 = var14 - -var11.field1183;
                                            var108 = var14;
                                        }
                                        if (var11.field1328 == 1) {
                                            class206.method1464(var108, var106, var105, var107, var11.field1170);
                                        } else {
                                            class206.method1460(var108, var106, var105, var107, var11.field1170, var11.field1328);
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

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZ)V")
    public static final void method1757(boolean arg0, boolean arg1) {
        if (!arg1) {
            field4550 = null;
        }
        for (class247 var2 = (class247) class21.field334.method1017(109); var2 != null; var2 = (class247) class21.field334.method1016((byte) -31)) {
            if (var2.field4366 != null) {
                class225.field4085.method594(var2.field4366);
                var2.field4366 = null;
            }
            if (var2.field4353 != null) {
                class225.field4085.method594(var2.field4353);
                var2.field4353 = null;
            }
            var2.method1063(125);
        }
        ++field4556;
        if (arg0) {
            for (class247 var3 = (class247) class57.field943.method1017(58); var3 != null; var3 = (class247) class57.field943.method1016((byte) -31)) {
                if (var3.field4366 != null) {
                    class225.field4085.method594(var3.field4366);
                    var3.field4366 = null;
                }
                var3.method1063(102);
            }
            for (class247 var4 = (class247) class39.field649.method1747((byte) 94); var4 != null; var4 = (class247) class39.field649.method1745(-32496)) {
                if (var4.field4366 != null) {
                    class225.field4085.method594(var4.field4366);
                    var4.field4366 = null;
                }
                var4.method1063(72);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lhh;ILhh;ZILhh;)V")
    public static final void method1758(class163 arg0, int arg1, class163 arg2, boolean arg3, int arg4, class163 arg5) {
        for (int var6 = 99; ~var6 < -1; --var6) {
            class57.field945[var6] = class57.field945[var6 + -1];
            class216.field3929[var6] = class216.field3929[var6 + -1];
            class256.field4491[var6] = class256.field4491[var6 - 1];
            class253.field4432[var6] = class253.field4432[var6 + -1];
            class18.field286[var6] = class18.field286[var6 + -1];
        }
        class57.field945[0] = arg4;
        class216.field3929[0] = arg2;
        class18.field286[0] = arg1;
        class256.field4491[0] = arg0;
        if (arg3) {
            field4553 = null;
        }
        ++field4549;
        class149.field2810 = class24.field384;
        ++class245.field4324;
        class253.field4432[0] = arg5;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lpg;I)Lj;")
    public static final class117 method1759(class81 arg0, int arg1) {
        ++field4554;
        arg0.method622(true);
        int var2 = arg0.method622(true);
        class117 var3 = class175.method1297(var2, 3);
        var3.field2237 = arg0.method622(true);
        int var4 = arg0.method622(true);
        for (int var5 = 0; ~var4 < ~var5; ++var5) {
            int var6 = arg0.method622(true);
            var3.method60(0, var6, arg0);
        }
        if (arg1 != 16864) {
            field4550 = null;
        }
        var3.method57((byte) -97);
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)V")
    public static void method1760(byte arg0) {
        field4548 = null;
        field4553 = null;
        int var1 = -59 % ((arg0 - -51) / 32);
        field4550 = null;
        field4563 = null;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class260() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        int[] var3 = super.field2218.method1044(arg1, arg0 ^ arg0);
        if (super.field2218.field2587) {
            for (int var4 = 0; ~var4 > ~class143.field2702; ++var4) {
                int var5 = (class26.field402[var4] << 12) / this.field4559 + this.field4555;
                int var6 = (class214.field3911[arg1] << 12) / this.field4559 + this.field4547;
                int var7 = var5 * var5 >> 12;
                int var8 = var5;
                int var9 = var5;
                int var10 = var6;
                int var11 = var6;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var7 - -var12) > -16385 && var13 < this.field4562) {
                    var11 = (var9 * var11 >> 12) * 2 - -var10;
                    ++var13;
                    var9 = -var12 + var7 + var8;
                    var12 = var11 * var11 >> 12;
                    var7 = var9 * var9 >> 12;
                }
                var3[var4] = ~(this.field4562 - 1) < ~var13 ? (var13 << 12) / this.field4562 : 0;
            }
        }
        ++field4560;
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)Z")
    public static final boolean method1761(byte arg0, int arg1) {
        if (arg0 != -101) {
            field4563 = null;
        }
        ++field4558;
        return ~(1 & arg1) != -1;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)Lqd;")
    public static final class215 method1762(int arg0, int arg1) {
        ++field4552;
        int var2 = 110 / ((arg0 - 3) / 51);
        class215 var3 = (class215) class193.field3522.method114((long) arg1, 0);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class66.field1125.method973(class110.method883(1293034634, arg1), true, class194.method1411(arg1, -26740));
            class215 var5 = new class215();
            if (var4 != null) {
                var5.method1531(-1, new class81(var4));
            }
            class193.field3522.method117(var5, false, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)V")
    public static final void method1763(int arg0) {
        for (class222 var1 = (class222) class92.field1739.method1747((byte) 81); var1 != null; var1 = (class222) class92.field1739.method1745(arg0 + -32496)) {
            int var2 = var1.field4049;
            if (class114.method906(0, var2)) {
                boolean var3 = true;
                class69[] var4 = class109.field2060[var2];
                for (int var5 = 0; ~var4.length < ~var5; ++var5) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field1240;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2641;
                    class69 var7 = class124.method989((byte) 127, var6);
                    if (var7 != null) {
                        class213.method1517((byte) 11, var7);
                    }
                }
            }
        }
        ++field4557;
        if (arg0 != 0) {
            field4553 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        ++field4546;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 == 3) {
                        this.field4547 = arg2.method658(-62);
                    }
                } else {
                    this.field4555 = arg2.method658(65);
                }
            } else {
                this.field4562 = arg2.method658(-73);
            }
        } else {
            this.field4559 = arg2.method658(-117);
        }
        if (arg0 != 0) {
            field4551 = -111;
        }
    }
}
