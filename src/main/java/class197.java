import java.awt.Component;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public abstract class class197 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[S")
    public static short[] field3607 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Lli;")
    public static class185 field3611 = class245.method1649("m-Ochte mit Ihnen handeln)3", 125);

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "Z")
    public static boolean field3610 = false;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Lli;")
    public static class185 field3616 = class245.method1649("Lade)3)3)3", -23);

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Lhi;")
    public static class250 field3612;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)I")
    public abstract int method1410(boolean arg0);

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B[Lp;IIIIIIII)V")
    public static final void method1411(byte arg0, class82[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class159.method1148(arg5, arg4, arg8, arg2);
        class167.method1207();
        field3618++;
        int var10 = 74 % ((arg0 - 10) / 36);
        for (int var11 = 0; var11 < arg1.length; var11++) {
            class82 var12 = arg1[var11];
            if (var12 != null && (var12.field1580 == arg3 || arg3 == -1412584499 && class149.field2813 == var12)) {
                int var13;
                if (arg9 == -1) {
                    class15.field257[class185.field3410] = var12.field1584 + arg6;
                    class211.field3847[class185.field3410] = var12.field1491 + arg7;
                    class123.field2228[class185.field3410] = var12.field1505;
                    class52.field912[class185.field3410] = var12.field1498;
                    var13 = class185.field3410++;
                } else {
                    var13 = arg9;
                }
                var12.field1488 = class211.field3851;
                var12.field1595 = var13;
                if (!var12.field1572 || !client.method1499(var12)) {
                    if (var12.field1599 > 0) {
                        class216.method1517(false, var12);
                    }
                    int var14 = var12.field1491 + arg7;
                    int var15 = var12.field1584 + arg6;
                    int var16 = var12.field1512;
                    if (class185.field3456 && (client.method1502(var12) != 0 || var12.field1612 == 0) && var16 > 127) {
                        var16 = 127;
                    }
                    if (class149.field2813 == var12) {
                        if (arg3 != -1412584499 && !var12.field1591) {
                            class131.field2352 = arg6;
                            class18.field299 = arg7;
                            class238.field4247 = arg1;
                            continue;
                        }
                        if (class180.field3305 && class127.field2266) {
                            int var17 = class18.field288;
                            int var18 = var17 - class259.field4595;
                            if (class130.field2317 > var18) {
                                var18 = class130.field2317;
                            }
                            if ((class130.field2317 + class178.field3263.field1505) < (var12.field1505 + var18)) {
                                var18 = class130.field2317 + class178.field3263.field1505 - var12.field1505;
                            }
                            var15 = var18;
                            int var19 = class32.field528;
                            int var20 = var19 - class200.field3674;
                            if (class154.field2923 > var20) {
                                var20 = class154.field2923;
                            }
                            if (var12.field1498 + var20 > class154.field2923 + class178.field3263.field1498) {
                                var20 = class154.field2923 + class178.field3263.field1498 - var12.field1498;
                            }
                            var14 = var20;
                        }
                        if (!var12.field1591) {
                            var16 = 128;
                        }
                    }
                    int var21;
                    int var22;
                    int var23;
                    int var24;
                    if (var12.field1612 == 2) {
                        var21 = arg8;
                        var22 = arg2;
                        var23 = arg4;
                        var24 = arg5;
                    } else {
                        var23 = var14 <= arg4 ? arg4 : var14;
                        int var25 = var12.field1505 + var15;
                        int var26 = var14 + var12.field1498;
                        var24 = var15 > arg5 ? var15 : arg5;
                        if (var12.field1612 == 9) {
                            var26++;
                            var25++;
                        }
                        var22 = arg2 > var26 ? var26 : arg2;
                        var21 = arg8 > var25 ? var25 : arg8;
                    }
                    if (!var12.field1572 || var21 > var24 && var23 < var22) {
                        if (var12.field1599 != 0) {
                            if (var12.field1599 == 1337) {
                                class245.field4361 = var12;
                                class206.field3772 = var15;
                                class223.field4094 = var14;
                                class55.method375(var12.field1599 == 1403, var12.field1498, -123, var15, var12.field1505, var14);
                                class159.method1148(arg5, arg4, arg8, arg2);
                                continue;
                            }
                            if (var12.field1599 == 1338) {
                                if (!var12.method542(-118)) {
                                    continue;
                                }
                                class217.method1520(var13, var12, var14, -18651, var15);
                                class159.method1148(arg5, arg4, arg8, arg2);
                                if (class256.field4531 != 0 && class256.field4531 != 3 || class112.field2027 || class52.field861 < var24 || class48.field792 < var23 || class52.field861 >= var21 || class48.field792 >= var22) {
                                    continue;
                                }
                                int var27 = class48.field792 - var14;
                                int var28 = class52.field861 - var15;
                                int var29 = var12.field1621[var27];
                                if (var29 > var28 || (var12.field1609[var27] + var29) < var28) {
                                    continue;
                                }
                                int var30 = var27 - var12.field1498 / 2;
                                int var31 = class92.field1765 + class191.field3543 & 0x7FF;
                                int var32 = var28 - var12.field1505 / 2;
                                int var33 = class167.field3110[var31];
                                int var34 = (class239.field4270 + 256) * var33 >> 8;
                                int var35 = class167.field3112[var31];
                                int var36 = (class239.field4270 + 256) * var35 >> 8;
                                int var37 = var30 * var36 - (var32 * var34) >> 11;
                                int var38 = var30 * var34 + (var32 * var36) >> 11;
                                int var39 = class241.field4310.field2687 - var37 >> 7;
                                int var40 = class241.field4310.field2694 + var38 >> 7;
                                if (class254.field4504 && (class214.field3908 & 0x40) != 0) {
                                    class82 var41 = class157.method1115(6684, class140.field2617, class148.field2805);
                                    if (var41 == null) {
                                        class260.method1763(true);
                                    } else {
                                        class105.method738(1L, var40, class122.field2218, (short) 4, -1, class102.field1856, var39, -113);
                                    }
                                    continue;
                                }
                                if (class235.field4218 == 1) {
                                    class105.method738(1L, var40, class20.field336, (short) 20, -1, class135.field2534, var39, -117);
                                }
                                class105.method738(1L, var40, class20.field336, (short) 42, -1, class24.field403, var39, -113);
                                continue;
                            }
                            if (var12.field1599 == 1339) {
                                if (var12.method542(-111)) {
                                    class210.method1480((byte) 120, var14, var12, var15, var13);
                                    class159.method1148(arg5, arg4, arg8, arg2);
                                }
                                continue;
                            }
                            if (var12.field1599 == 1400) {
                                class140.method1003(3, var14, var12.field1505, var15, var12.field1498);
                                class44.field700[var13] = true;
                                class274.field4855[var13] = true;
                                class159.method1148(arg5, arg4, arg8, arg2);
                                continue;
                            }
                            if (var12.field1599 == 1401) {
                                class157.method1117(var14, var12.field1505, var15, var12.field1498, 244);
                                class44.field700[var13] = true;
                                class274.field4855[var13] = true;
                                class159.method1148(arg5, arg4, arg8, arg2);
                                continue;
                            }
                            if (var12.field1599 == 1402) {
                                class226.method1565(var14, var15, -121);
                                class44.field700[var13] = true;
                                class274.field4855[var13] = true;
                                continue;
                            }
                            if (var12.field1599 == 1405) {
                                if (!class173.field3177) {
                                    continue;
                                }
                                int var42 = var15 + var12.field1505;
                                int var43 = var14 + 15;
                                class205.field3743.method1852(class87.method567(-11039, new class185[] { class84.field1662, class90.method591(class163.field3057, 0) }), var42, var43, 16776960, -1);
                                Runtime var44 = Runtime.getRuntime();
                                int var131 = var43 + 15;
                                int var45 = (int) ((var44.totalMemory() - var44.freeMemory()) / 1024L);
                                int var46 = 16776960;
                                int var47 = 0;
                                if (var45 > 65536) {
                                    var46 = 16711680;
                                }
                                int var48 = 0;
                                class205.field3743.method1852(class87.method567(-11039, new class185[] { class256.field4546, class90.method591(var45, 0), class180.field3302 }), var42, var131, var46, -1);
                                var43 = var131 + 15;
                                int var49 = 0;
                                int var50 = 16776960;
                                for (int var51 = 0; var51 < 28; var51++) {
                                    var48 += class191.field3531[var51].method1255((byte) -112);
                                    var47 += class191.field3531[var51].method1254(-20603);
                                    var49 += class191.field3531[var51].method1252(-75);
                                }
                                int var52 = var47 * 10000 / var48;
                                int var53 = var49 * 100 / var48;
                                class185 var54 = class87.method567(-11039, new class185[] { class181.field3326, class48.method304((long) var52, true, 2, 0, (byte) 86), class68.field1174, class90.method591(var53, 0), class46.field753 });
                                class189.field3523.method1852(var54, var42, var43, var50, -1);
                                var43 += 12;
                                class44.field700[var13] = true;
                                class274.field4855[var13] = true;
                                continue;
                            }
                            if (var12.field1599 == 1406) {
                                class207.field3800 = var14;
                                class242.field4328 = var12;
                                class131.field2354 = var15;
                                continue;
                            }
                        }
                        if (!class112.field2027) {
                            if (var12.field1612 == 0 && var12.field1487 && var24 <= class52.field861 && var23 <= class48.field792 && class52.field861 < var21 && var22 > class48.field792 && !class185.field3456) {
                                class37.field587[0] = class119.field2170;
                                class127.field2283 = 1;
                                class158.field3004[0] = class158.field2986;
                                class107.field1922[0] = class20.field336;
                                class55.field936[0] = 1006;
                            }
                            if (class52.field861 >= var24 && var23 <= class48.field792 && var21 > class52.field861 && var22 > class48.field792) {
                                class2.method25(1, class52.field861 - var15, -var14 + class48.field792, var12);
                            }
                        }
                        if (var12.field1612 == 0) {
                            if (!var12.field1572 && client.method1499(var12) && class281.field4966 != var12) {
                                continue;
                            }
                            if (!var12.field1572) {
                                if ((var12.field1552 - var12.field1498) < var12.field1590) {
                                    var12.field1590 = var12.field1552 - var12.field1498;
                                }
                                if (var12.field1590 < 0) {
                                    var12.field1590 = 0;
                                }
                            }
                            method1411((byte) 116, arg1, var22, var12.field1579, var23, var24, var15 - var12.field1565, -var12.field1590 + var14, var21, var13);
                            if (var12.field1536 != null) {
                                method1411((byte) 69, var12.field1536, var22, var12.field1579, var23, var24, var15 - var12.field1565, var14 - var12.field1590, var21, var13);
                            }
                            class271 var55 = (class271) class87.field1715.method195(97, (long) var12.field1579);
                            if (var55 != null) {
                                if (var55.field4810 == 0 && !class112.field2027 && class52.field861 >= var24 && var23 <= class48.field792 && class52.field861 < var21 && class48.field792 < var22 && !class185.field3456) {
                                    class37.field587[0] = class119.field2170;
                                    class158.field3004[0] = class158.field2986;
                                    class107.field1922[0] = class20.field336;
                                    class55.field936[0] = 1006;
                                    class127.field2283 = 1;
                                }
                                class96.method619(var24, var15, var22, var13, (byte) 126, var14, var21, var23, var55.field4811);
                            }
                            class159.method1148(arg5, arg4, arg8, arg2);
                            class167.method1207();
                        }
                        if (class226.field4127[var13] || class92.field1770 > 1) {
                            if (var12.field1612 == 0 && !var12.field1572 && var12.field1552 > var12.field1498) {
                                class133.method941(var12.field1505 + var15, var12.field1498, var12.field1552, (byte) 126, var12.field1590, var14);
                            }
                            if (var12.field1612 != 1) {
                                if (var12.field1612 == 2) {
                                    int var56 = 0;
                                    for (int var57 = 0; var57 < var12.field1481; var57++) {
                                        for (int var58 = 0; var58 < var12.field1566; var58++) {
                                            int var59 = var14 + ((var12.field1614 + 32) * var57);
                                            int var60 = (var12.field1610 + 32) * var58 + var15;
                                            if (var56 < 20) {
                                                var60 += var12.field1479[var56];
                                                var59 += var12.field1568[var56];
                                            }
                                            if (var12.field1576[var56] > 0) {
                                                boolean var62 = false;
                                                boolean var63 = false;
                                                int var64 = var12.field1576[var56] - 1;
                                                if (var60 + 32 > arg5 && arg8 > var60 && arg4 < var59 + 32 && var59 < arg2 || class108.field1941 == var12 && class236.field4223 == var56) {
                                                    class211 var65;
                                                    if (class187.field3471 == 1 && class210.field3840 == var56 && class215.field3952 == var12.field1579) {
                                                        var65 = class137.method983(var64, (byte) 64, 2, var12.field1504, 0, var12.field1548[var56]);
                                                    } else {
                                                        var65 = class137.method983(var64, (byte) 64, 1, var12.field1504, 3153952, var12.field1548[var56]);
                                                    }
                                                    if (class167.field3108) {
                                                        class44.field700[var13] = true;
                                                    }
                                                    if (var65 == null) {
                                                        class229.method1581(var12, false);
                                                    } else if (class108.field1941 == var12 && class236.field4223 == var56) {
                                                        int var66 = class18.field288 - class220.field4008;
                                                        int var67 = class32.field528 - class45.field710;
                                                        if (var67 < 5 && var67 > -5) {
                                                            var67 = 0;
                                                        }
                                                        if (var66 < 5 && var66 > -5) {
                                                            var66 = 0;
                                                        }
                                                        if (class196.field3592 < 5) {
                                                            var67 = 0;
                                                            var66 = 0;
                                                        }
                                                        var65.method704(var60 + var66, var59 + var67, 128);
                                                        if (arg3 != -1) {
                                                            class82 var68 = arg1[arg3 & 0xFFFF];
                                                            int var69 = class159.field3016;
                                                            int var70 = class159.field3013;
                                                            if (var70 > var59 + var67 && var68.field1590 > 0) {
                                                                int var71 = (var70 - var59 - var67) * class224.field4111 / 3;
                                                                if (var71 > class224.field4111 * 10) {
                                                                    var71 = class224.field4111 * 10;
                                                                }
                                                                if (var71 > var68.field1590) {
                                                                    var71 = var68.field1590;
                                                                }
                                                                var68.field1590 -= var71;
                                                                class45.field710 += var71;
                                                                class229.method1581(var68, false);
                                                            }
                                                            if ((var59 + var67 + 32) > var69 && var68.field1552 - var68.field1498 > var68.field1590) {
                                                                int var72 = (var59 + var67 + 32 - var69) * class224.field4111 / 3;
                                                                if (class224.field4111 * 10 < var72) {
                                                                    var72 = class224.field4111 * 10;
                                                                }
                                                                if (var68.field1552 - var68.field1498 - var68.field1590 < var72) {
                                                                    var72 = var68.field1552 - var68.field1498 - var68.field1590;
                                                                }
                                                                var68.field1590 += var72;
                                                                class45.field710 -= var72;
                                                                class229.method1581(var68, false);
                                                            }
                                                        }
                                                    } else if (class242.field4333 == var12 && class174.field3188 == var56) {
                                                        var65.method704(var60, var59, 128);
                                                    } else {
                                                        var65.method707(var60, var59);
                                                    }
                                                }
                                            } else if (var12.field1513 != null && var56 < 20) {
                                                class211 var61 = var12.method547(0, var56);
                                                if (var61 != null) {
                                                    var61.method707(var60, var59);
                                                } else if (class110.field1978) {
                                                    class229.method1581(var12, false);
                                                }
                                            }
                                            var56++;
                                        }
                                    }
                                } else if (var12.field1612 == 3) {
                                    int var73;
                                    if (class97.method625((byte) 126, var12)) {
                                        var73 = var12.field1582;
                                        if (class281.field4966 == var12 && var12.field1562 != 0) {
                                            var73 = var12.field1562;
                                        }
                                    } else {
                                        var73 = var12.field1594;
                                        if (class281.field4966 == var12 && var12.field1546 != 0) {
                                            var73 = var12.field1546;
                                        }
                                    }
                                    if (var16 == 0) {
                                        if (var12.field1578) {
                                            class159.method1130(var15, var14, var12.field1505, var12.field1498, var73);
                                        } else {
                                            class159.method1126(var15, var14, var12.field1505, var12.field1498, var73);
                                        }
                                    } else if (var12.field1578) {
                                        class159.method1145(var15, var14, var12.field1505, var12.field1498, var73, 256 - (var16 & 0xFF));
                                    } else {
                                        class159.method1133(var15, var14, var12.field1505, var12.field1498, var73, 256 - (var16 & 0xFF));
                                    }
                                } else if (var12.field1612 == 4) {
                                    class270 var74 = var12.method538(1938, class282.field4979);
                                    if (var74 != null) {
                                        class185 var75 = var12.field1555;
                                        int var76;
                                        if (class97.method625((byte) 124, var12)) {
                                            var76 = var12.field1582;
                                            if (class281.field4966 == var12 && var12.field1562 != 0) {
                                                var76 = var12.field1562;
                                            }
                                            if (var12.field1588.method1311((byte) 49) > 0) {
                                                var75 = var12.field1588;
                                            }
                                        } else {
                                            var76 = var12.field1594;
                                            if (class281.field4966 == var12 && var12.field1546 != 0) {
                                                var76 = var12.field1546;
                                            }
                                        }
                                        if (var12.field1572 && var12.field1497 != -1) {
                                            class134 var77 = class165.method1179(102, var12.field1497);
                                            var75 = var77.field2436;
                                            if (var75 == null) {
                                                var75 = class71.field1250;
                                            }
                                            if ((var77.field2469 == 1 || var12.field1507 != 1) && var12.field1507 != -1) {
                                                var75 = class87.method567(-11039, new class185[] { class20.field335, var75, class140.field2621, class152.method1078(0, var12.field1507) });
                                            }
                                        }
                                        if (class225.field4118 == var12) {
                                            var75 = class262.field4658;
                                            var76 = var12.field1594;
                                        }
                                        if (!var12.field1572) {
                                            var75 = class97.method621(var75, var12, (byte) 102);
                                        }
                                        var74.method1845(var75, var15, var14, var12.field1505, var12.field1498, var76, var12.field1544 ? 0 : -1, var12.field1623, var12.field1577, var12.field1601);
                                    } else if (class110.field1978) {
                                        class229.method1581(var12, false);
                                    }
                                } else if (var12.field1612 == 5) {
                                    if (var12.field1572) {
                                        class211 var78;
                                        if (var12.field1497 == -1) {
                                            var78 = var12.method548(false, -85);
                                        } else {
                                            var78 = class137.method983(var12.field1497, (byte) 64, var12.field1490, var12.field1504, var12.field1494, var12.field1507);
                                        }
                                        if (var78 != null) {
                                            int var79 = var78.field3859;
                                            int var80 = var78.field3852;
                                            if (var12.field1564) {
                                                int var82 = (var12.field1505 - (1 - var79)) / var79;
                                                int var83 = (var12.field1498 + var80 - 1) / var80;
                                                class159.method1127(var15, var14, var12.field1505 + var15, var12.field1498 + var14);
                                                for (int var84 = 0; var84 < var82; var84++) {
                                                    for (int var85 = 0; var85 < var83; var85++) {
                                                        if (var12.field1640 != 0) {
                                                            var78.method1482(var79 / 2 + var79 * var84 + var15, var80 / 2 + var80 * var85 + var14, var12.field1640, 4096, -1900408252);
                                                        } else if (var16 == 0) {
                                                            var78.method707(var79 * var84 + var15, var80 * var85 + var14);
                                                        } else {
                                                            var78.method704(var79 * var84 + var15, var14 - -(var80 * var85), 256 - (var16 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class159.method1148(arg5, arg4, arg8, arg2);
                                            } else {
                                                int var81 = var12.field1505 * 4096 / var79;
                                                if (var12.field1640 != 0) {
                                                    var78.method1482(var12.field1505 / 2 + var15, var12.field1498 / 2 + var14, var12.field1640, var81, -1900408252);
                                                } else if (var16 != 0) {
                                                    var78.method695(var15, var14, var12.field1505, var12.field1498, 256 - (var16 & 0xFF));
                                                } else if (var12.field1505 == var79 && var12.field1498 == var80) {
                                                    var78.method707(var15, var14);
                                                } else {
                                                    var78.method705(var15, var14, var12.field1505, var12.field1498);
                                                }
                                            }
                                        } else if (class110.field1978) {
                                            class229.method1581(var12, false);
                                        }
                                    } else {
                                        class211 var86 = var12.method548(class97.method625((byte) 121, var12), -82);
                                        if (var86 != null) {
                                            var86.method707(var15, var14);
                                        } else if (class110.field1978) {
                                            class229.method1581(var12, false);
                                        }
                                    }
                                } else if (var12.field1612 == 6) {
                                    boolean var87 = class97.method625((byte) 124, var12);
                                    int var88;
                                    if (var87) {
                                        var88 = var12.field1602;
                                    } else {
                                        var88 = var12.field1524;
                                    }
                                    class98 var89 = null;
                                    int var90 = 0;
                                    if (var12.field1497 != -1) {
                                        class134 var95 = class165.method1179(102, var12.field1497);
                                        if (var95 != null) {
                                            class134 var96 = var95.method950(var12.field1507, (byte) -4);
                                            class2 var97 = var88 == -1 ? null : class253.method1712(var88, -126);
                                            var89 = var96.method954(0, var97, 1, var12.field1607);
                                            if (var89 == null) {
                                                class229.method1581(var12, false);
                                            } else {
                                                var90 = -var89.method62() / 2;
                                            }
                                        }
                                    } else if (var12.field1626 == 5) {
                                        if (var12.field1521 == -1) {
                                            var89 = class252.field4483.method1734((class2) null, true, (class2) null, -1, (byte) -105, -1);
                                        } else {
                                            int var92 = var12.field1521 & 0x7FF;
                                            if (class249.field4421 == var92) {
                                                var92 = 2047;
                                            }
                                            class188 var93 = class93.field1774[var92];
                                            class2 var94 = var88 == -1 ? null : class253.method1712(var88, -127);
                                            if (var93 != null && ((int) var93.field3514.method1327((byte) 101) << 11) == (var12.field1521 & 0xFFFFF800)) {
                                                var89 = var93.field3478.method1734((class2) null, true, var94, var12.field1607, (byte) -105, 0);
                                            }
                                        }
                                    } else if (var88 == -1) {
                                        var89 = var12.method549((class2) null, (byte) -126, class241.field4310.field3478, var87, -1);
                                        if (var89 == null && class110.field1978) {
                                            class229.method1581(var12, false);
                                        }
                                    } else {
                                        class2 var91 = class253.method1712(var88, -120);
                                        var89 = var12.method549(var91, (byte) -128, class241.field4310.field3478, var87, var12.field1607);
                                        if (var89 == null && class110.field1978) {
                                            class229.method1581(var12, false);
                                        }
                                    }
                                    if (var89 != null) {
                                        int var98;
                                        if (var12.field1632 > 0) {
                                            var98 = (var12.field1498 << 8) / var12.field1632;
                                        } else {
                                            var98 = 256;
                                        }
                                        int var99;
                                        if (var12.field1643 > 0) {
                                            var99 = (var12.field1505 << 8) / var12.field1643;
                                        } else {
                                            var99 = 256;
                                        }
                                        int var100 = (var12.field1569 * var98 >> 8) + var12.field1498 / 2 + var14;
                                        int var101 = (var12.field1613 * var99 >> 8) + var12.field1505 / 2 + var15;
                                        class167.method1198(var101, var100);
                                        int var102 = class167.field3112[var12.field1563] * var12.field1605 >> 16;
                                        int var103 = class167.field3110[var12.field1563] * var12.field1605 >> 16;
                                        if (!var12.field1572) {
                                            var89.method631(0, var12.field1556, 0, var12.field1563, 0, var103, var102, -1L);
                                        } else if (var12.field1519) {
                                            ((class222) var89).method1534(0, var12.field1556, var12.field1520, var12.field1563, var12.field1529, var103 + var12.field1645 + var90, var12.field1645 + var102, var12.field1605);
                                        } else {
                                            var89.method631(0, var12.field1556, var12.field1520, var12.field1563, var12.field1529, var103 + var12.field1645 + var90, var12.field1645 + var102, -1L);
                                        }
                                        class167.method1188();
                                    }
                                } else {
                                    if (var12.field1612 == 7) {
                                        class270 var104 = var12.method538(1938, class282.field4979);
                                        if (var104 == null) {
                                            if (class110.field1978) {
                                                class229.method1581(var12, false);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; var106 < var12.field1481; var106++) {
                                            for (int var107 = 0; var107 < var12.field1566; var107++) {
                                                if (var12.field1576[var105] > 0) {
                                                    class134 var108 = class165.method1179(102, var12.field1576[var105] - 1);
                                                    class185 var109;
                                                    if (var108.field2469 != 1 && var12.field1548[var105] == 1) {
                                                        var109 = class87.method567(-11039, new class185[] { class20.field335, var108.field2436, class181.field3333 });
                                                    } else {
                                                        var109 = class87.method567(-11039, new class185[] { class20.field335, var108.field2436, class140.field2621, class152.method1078(0, var12.field1548[var105]) });
                                                    }
                                                    int var110 = var14 + ((var12.field1614 + 12) * var106);
                                                    int var111 = var15 + ((var12.field1610 + 115) * var107);
                                                    if (var12.field1623 == 0) {
                                                        var104.method1850(var109, var111, var110, var12.field1594, var12.field1544 ? 0 : -1);
                                                    } else if (var12.field1623 == 1) {
                                                        var104.method1833(var109, var111 + 57, var110, var12.field1594, var12.field1544 ? 0 : -1);
                                                    } else {
                                                        var104.method1852(var109, var111 + 115 - 1, var110, var12.field1594, var12.field1544 ? 0 : -1);
                                                    }
                                                }
                                                var105++;
                                            }
                                        }
                                    }
                                    if (var12.field1612 == 8 && class75.field1292 == var12 && class9.field179 == class207.field3807) {
                                        int var112 = 0;
                                        int var113 = 0;
                                        class270 var114 = class205.field3743;
                                        class185 var115 = var12.field1555;
                                        class185 var116 = class97.method621(var115, var12, (byte) 11);
                                        while (var116.method1311((byte) 49) > 0) {
                                            int var124 = var116.method1321((byte) 80, class21.field359);
                                            class185 var125;
                                            if (var124 == -1) {
                                                var125 = var116;
                                                var116 = class20.field336;
                                            } else {
                                                var125 = var116.method1301((byte) -76, var124, 0);
                                                var116 = var116.method1310(39, var124 + 4);
                                            }
                                            int var126 = var114.method1843(var125);
                                            var113 += var114.field4773 + 1;
                                            if (var126 > var112) {
                                                var112 = var126;
                                            }
                                        }
                                        var112 += 6;
                                        var113 += 7;
                                        int var117 = var12.field1505 + var15 - var112 - 5;
                                        if ((var15 + 5) > var117) {
                                            var117 = var15 + 5;
                                        }
                                        if ((var117 + var112) > arg8) {
                                            var117 = arg8 - var112;
                                        }
                                        int var118 = var12.field1498 + var14 + 5;
                                        if ((var113 + var118) > arg2) {
                                            var118 = arg2 - var113;
                                        }
                                        class159.method1130(var117, var118, var112, var113, 16777120);
                                        class159.method1126(var117, var118, var112, var113, 0);
                                        int var119 = var114.field4773 + var118 + 2;
                                        class185 var120 = var12.field1555;
                                        class185 var121 = class97.method621(var120, var12, (byte) 105);
                                        while (var121.method1311((byte) 49) > 0) {
                                            int var122 = var121.method1321((byte) 111, class21.field359);
                                            class185 var123;
                                            if (var122 == -1) {
                                                var123 = var121;
                                                var121 = class20.field336;
                                            } else {
                                                var123 = var121.method1301((byte) -94, var122, 0);
                                                var121 = var121.method1310(39, var122 + 4);
                                            }
                                            var114.method1850(var123, var117 + 3, var119, 0, -1);
                                            var119 += var114.field4773 + 1;
                                        }
                                    }
                                    if (var12.field1612 == 9) {
                                        int var127;
                                        int var128;
                                        int var129;
                                        int var130;
                                        if (var12.field1600) {
                                            var127 = var12.field1505 + var15;
                                            var128 = var15;
                                            var129 = var12.field1498 + var14;
                                            var130 = var14;
                                        } else {
                                            var127 = var12.field1505 + var15;
                                            var128 = var15;
                                            var130 = var12.field1498 + var14;
                                            var129 = var14;
                                        }
                                        if (var12.field1598 == 1) {
                                            class159.method1134(var128, var129, var127, var130, var12.field1594);
                                        } else {
                                            class159.method1131(var128, var129, var127, var130, var12.field1594, var12.field1598);
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

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method1412(byte arg0, Component arg1);

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BIIIIIIIII)V")
    public static final void method1413(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 != 49) {
            method1419(127);
        }
        field3609++;
        if (arg7 == arg8 && arg2 == arg5 && arg1 == arg6 && arg3 == arg4) {
            class36.method224(arg1, arg9, arg4, 0, arg5, arg7);
            return;
        }
        int var10 = arg7;
        int var11 = arg7 * 3;
        int var12 = arg5;
        int var13 = arg8 * 3;
        int var14 = arg5 * 3;
        int var15 = arg2 * 3;
        int var16 = arg6 * 3;
        int var17 = arg3 * 3;
        int var18 = arg1 + var13 - var16 - arg7;
        int var19 = var15 + arg4 - var17 - arg5;
        int var20 = var17 + var14 - var15 - var15;
        int var21 = var13 - var11;
        int var22 = var16 + var11 - var13 - var13;
        int var23 = var15 - var14;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var21 * var24;
            int var30 = var22 * var25;
            int var31 = var23 * var24;
            int var32 = var20 * var25;
            int var33 = arg7 + (var27 - (-var29 - var30) >> 12);
            int var34 = (var28 + var32 + var31 >> 12) + arg5;
            class36.method224(var33, arg9, var34, 0, var12, var10);
            var10 = var33;
            var12 = var34;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lhi;Lhi;ZI)V")
    public static final void method1414(class250 arg0, class250 arg1, boolean arg2, int arg3) {
        class47.field776 = arg0;
        class60.field1080 = arg2;
        if (arg3 > 73) {
            field3608++;
            class113.field2047 = arg1;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static void method1415(byte arg0) {
        field3616 = null;
        field3611 = null;
        field3607 = null;
        field3612 = null;
        if (arg0 != -71) {
            method1418((Object) null, 59, (class160) null);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static final void method1416(int arg0) {
        field3614++;
        class80.field1402.method80(-14113);
        if (arg0 != 1006) {
            method1420(68, -84, (class58) null, -17, 41, -40);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method1417(Component arg0, byte arg1);

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/Object;ILuc;)V")
    public static final void method1418(Object arg0, int arg1, class160 arg2) {
        field3613++;
        if (arg2.field3028 == null) {
            return;
        }
        if (arg1 != -28826) {
            field3607 = null;
        }
        for (int var3 = 0; var3 < 50 && arg2.field3028.peekEvent() != null; var3++) {
            class212.method1488(1L, -60);
        }
        if (arg0 != null) {
            arg2.field3028.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
    public static final void method1419(int arg0) {
        class118.field2109.method80(-14113);
        if (arg0 != -1) {
            method1411((byte) 14, (class82[]) null, -6, 41, 27, 82, 30, -31, -127, -62);
        }
        field3617++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILgg;III)V")
    public static final void method1420(int arg0, int arg1, class58 arg2, int arg3, int arg4, int arg5) {
        field3615++;
        if (arg2.field1029 == -1 && arg2.field1014 == null) {
            return;
        }
        int var6 = 0;
        if (arg2.field1009 < arg1) {
            var6 += arg1 - arg2.field1009;
        } else if (arg2.field1032 > arg1) {
            var6 += arg2.field1032 - arg1;
        }
        if (arg2.field1010 < arg5) {
            var6 += arg5 - arg2.field1010;
        } else if (arg5 < arg2.field1023) {
            var6 += arg2.field1023 - arg5;
        }
        if (arg4 >= -98) {
            field3616 = null;
        }
        if (arg2.field1008 == 0 || var6 - 64 > arg2.field1008 || class280.field4965 == 0 || arg2.field1017 != arg0) {
            if (arg2.field1007 != null) {
                class90.field1744.method802(arg2.field1007);
                arg2.field1007 = null;
            }
            if (arg2.field1013 != null) {
                class90.field1744.method802(arg2.field1013);
                arg2.field1013 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg2.field1008 - var6) * class280.field4965 / arg2.field1008;
        if (arg2.field1007 != null) {
            arg2.field1007.method667(var7);
        } else if (arg2.field1029 >= 0) {
            class11 var8 = class11.method101(class223.field4091, arg2.field1029, 0);
            if (var8 != null) {
                class91 var9 = var8.method99().method598(class133.field2383);
                class100 var10 = class100.method663(var9, 100, var7);
                var10.method670(-1);
                class90.field1744.method801(var10);
                arg2.field1007 = var10;
            }
        }
        if (arg2.field1013 != null) {
            arg2.field1013.method667(var7);
            if (arg2.field1013.method477(false)) {
                return;
            }
            arg2.field1013 = null;
        } else if (arg2.field1014 != null && (arg2.field1011 -= arg3) <= 0) {
            int var11 = (int) ((double) arg2.field1014.length * Math.random());
            class11 var12 = class11.method101(class223.field4091, arg2.field1014[var11], 0);
            if (var12 != null) {
                class91 var13 = var12.method99().method598(class133.field2383);
                class100 var14 = class100.method663(var13, 100, var7);
                var14.method670(0);
                class90.field1744.method801(var14);
                arg2.field1011 = arg2.field1006 + (int) ((double) (arg2.field1025 - arg2.field1006) * Math.random());
                arg2.field1013 = var14;
                return;
            }
        }
    }
}
