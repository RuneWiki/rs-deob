import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class391 {

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public int field5691;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public int field5693;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public int field5694;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public int field5695;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public int field5696;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public int field5697;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method2377(boolean arg0) {
        field5692++;
        if (class26.field363 > 1) {
            class587.field8579 = class330.field4562;
            class26.field363--;
        }
        if (class253.field3666) {
            class253.field3666 = false;
            class322.method1926((byte) 46);
            return;
        }
        if (!class324.field4519) {
            class96.method725(false);
        }
        for (int var1 = 0; var1 < 100 && class119.method967((byte) 73); var1++) {
        }
        if (class515.field7636 != 10) {
            return;
        }
        while (class168.method1263(100)) {
            class699 var2 = class452.method2630(class699.field9897, class34.field478, (byte) 123);
            var2.field9908.method2753((byte) 101, 0);
            int var3 = var2.field9908.field6710;
            class331.method1965(-18, var2.field9908);
            var2.field9908.method2692((byte) -117, var2.field9908.field6710 - var3);
            class149.method1134(var2, true);
        }
        if (class533.field7844 == null) {
            if (class254.method1619(true) >= class586.field8574) {
                class533.field7844 = class294.field4105.method1548(class97.field1450.field4286, 0);
            }
        } else if (class533.field7844.field1478 != -1) {
            class699 var4 = class452.method2630(class699.field9897, class140.field2345, (byte) 122);
            var4.field9908.method2739((byte) -86, class533.field7844.field1478);
            class149.method1134(var4, true);
            class533.field7844 = null;
            class586.field8574 = class254.method1619(true) + 30000L;
        }
        class634 var5 = (class634) class31.field459.method3905(-127);
        if (var5 != null || class222.field3311 < class254.method1619(true) - 2000L) {
            class699 var6 = null;
            int var7 = 0;
            for (class634 var8 = (class634) class413.field5889.method3905(-126); var8 != null && (var6 == null || (var6.field9908.field6710 - var7) < 240); var8 = (class634) class413.field5889.method3899(0)) {
                var8.method2549((byte) 39);
                int var9 = var8.method334(true);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method333(25632);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class703.field9953 != var10 || class507.field7532 != var9) {
                    if (var6 == null) {
                        class94.field1393++;
                        var6 = class452.method2630(class699.field9897, class666.field9359, (byte) 123);
                        var6.field9908.method2753((byte) 57, 0);
                        var7 = var6.field9908.field6710;
                    }
                    int var11 = var10 - class703.field9953;
                    class703.field9953 = var10;
                    int var12 = var9 - class507.field7532;
                    class507.field7532 = var9;
                    int var13 = (int) ((var8.method335(19807) - class222.field3311) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var11 += 32;
                        var12 += 32;
                        var6.field9908.method2739((byte) -86, (var11 << 6) + (var13 << 12) + var12);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var12 += 128;
                        var6.field9908.method2753((byte) 126, var13 + 128);
                        var11 += 128;
                        var6.field9908.method2739((byte) -86, (var11 << 8) + var12);
                    } else if (var13 >= 32) {
                        var6.field9908.method2739((byte) -86, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field9908.method2733(!arg0, Integer.MIN_VALUE);
                        } else {
                            var6.field9908.method2733(false, var9 << 16 | var10);
                        }
                    } else {
                        var6.field9908.method2753((byte) 55, var13 + 192);
                        if (var10 == 1 || var9 == -1) {
                            var6.field9908.method2733(!arg0, Integer.MIN_VALUE);
                        } else {
                            var6.field9908.method2733(!arg0, var9 << 16 | var10);
                        }
                    }
                    class222.field3311 = var8.method335(19807);
                }
            }
            if (var6 != null) {
                var6.field9908.method2692((byte) -105, var6.field9908.field6710 - var7);
                class149.method1134(var6, true);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method335(19807) - class550.field8068) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class550.field8068 = var5.method335(19807);
            int var16 = var5.method334(true);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method333(25632);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method332((byte) 127) == 2) {
                var18 = 1;
            }
            int var19 = (int) var14;
            class629.field8941++;
            class699 var20 = class452.method2630(class699.field9897, class140.field2344, (byte) 125);
            var20.field9908.method2751(var16 << 16 | var17, (byte) -126);
            var20.field9908.method2700(var19 | var18 << 15, 0);
            class149.method1134(var20, arg0);
        }
        if (class30.field453 > 0) {
            class260.field3725++;
            class699 var21 = class452.method2630(class699.field9897, class41.field547, (byte) 125);
            var21.field9908.method2753((byte) 71, class30.field453 * 3);
            for (int var22 = 0; var22 < class30.field453; var22++) {
                class414 var23 = class445.field6442[var22];
                long var24 = (var23.method2466(5435) - class208.field3210) / 50L;
                class208.field3210 = var23.method2466(5435);
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                var21.field9908.method2753((byte) 111, var23.method2464((byte) 110));
                var21.field9908.method2739((byte) -86, (int) var24);
            }
            class149.method1134(var21, arg0);
        }
        if (class130.field2126 > 0) {
            class130.field2126--;
        }
        if (class406.field5822 && class130.field2126 <= 0) {
            class409.field5852++;
            class406.field5822 = false;
            class130.field2126 = 20;
            class699 var26 = class452.method2630(class699.field9897, class260.field3723, (byte) 121);
            var26.field9908.method2702((byte) 28, (int) class473.field6790 >> 3);
            var26.field9908.method2702((byte) 28, (int) class636.field9031 >> 3);
            class149.method1134(var26, true);
        }
        if (class54.field710 != class264.field3791) {
            class662.field9312++;
            class264.field3791 = class54.field710;
            class699 var27 = class452.method2630(class699.field9897, class624.field8903, (byte) 121);
            var27.field9908.method2753((byte) 124, class54.field710 ? 1 : 0);
            class149.method1134(var27, true);
        }
        if (!class622.field8855) {
            class565.field8265++;
            class699 var28 = class452.method2630(class699.field9897, class692.field9811, (byte) 126);
            var28.field9908.method2753((byte) 106, 0);
            int var29 = var28.field9908.field6710;
            class465 var30 = new class465(class695.method3916(13));
            class525.field7713.method2482(var30, -123);
            var28.field9908.method2731(0, var30.field6710, var30.field6719, 0);
            var28.field9908.method2692((byte) -125, var28.field9908.field6710 - var29);
            class149.method1134(var28, true);
            class622.field8855 = true;
        }
        if (class541.field7946 != null) {
            if (class40.field544 == 2) {
                class156.method1172(false);
            } else if (class40.field544 == 3) {
                class692.method3898(1);
            }
        }
        if (class407.field5837) {
            class407.field5837 = false;
        } else {
            class609.field8756 /= 2.0F;
        }
        if (class224.field3359) {
            class224.field3359 = false;
        } else {
            class677.field9647 /= 2.0F;
        }
        class66.method542((byte) -59);
        if (class515.field7636 != 10) {
            return;
        }
        class126.method1000(-6648);
        class73.method597(-1);
        class312.method1886(16383);
        class426.field6089++;
        if (class426.field6089 > 750) {
            class322.method1926((byte) 46);
            return;
        }
        class256.method1628(6);
        class343.method2058((byte) 105);
        class223.method1482((byte) -26);
        for (int var31 = class230.field3404.method1428(arg0, -12970); var31 != -1; var31 = class230.field3404.method1428(false, -12970)) {
            class79.method613(var31, !arg0);
            class83.field1267[class248.method1593(class627.field8927++, 31)] = var31;
        }
        for (class449 var32 = class400.method2429(122); var32 != null; var32 = class400.method2429(77)) {
            int var33 = var32.method2616(-75);
            int var34 = var32.method2618(6065);
            if (var33 == 1) {
                class384.field5620[var34] = var32.field6472;
                class609.field8751 |= class331.field4580[var34];
                class186.field2922[class248.method1593(class435.field6267++, 31)] = var34;
            } else if (var33 == 2) {
                class39.field532[var34] = var32.field6473;
                class491.field7056[class248.method1593(31, class477.field6841++)] = var34;
            } else if (var33 == 3) {
                class101 var57 = class271.method1711(var34, 23727);
                if (!var32.field6473.equals(var57.field1639)) {
                    var57.field1639 = var32.field6473;
                    class326.method1948(1, var57);
                }
            } else if (var33 == 4) {
                class101 var35 = class271.method1711(var34, 23727);
                int var36 = var32.field6472;
                int var37 = var32.field6480;
                int var38 = var32.field6479;
                if (var35.field1527 != var36 || var35.field1598 != var37 || var35.field1621 != var38) {
                    var35.field1598 = var37;
                    var35.field1621 = var38;
                    var35.field1527 = var36;
                    class326.method1948(1, var35);
                }
            } else if (var33 == 5) {
                class101 var55 = class271.method1711(var34, 23727);
                if (var32.field6472 != var55.field1603 || var32.field6472 == -1) {
                    var55.field1603 = var32.field6472;
                    var55.field1545 = 0;
                    var55.field1551 = 0;
                    var55.field1499 = 1;
                    class606 var56 = var55.field1603 == -1 ? null : class480.field6871.method1417(-3585, var55.field1603);
                    if (var56 != null) {
                        class173.method1274(var55.field1551, var56, false);
                    }
                    class326.method1948(1, var55);
                }
            } else if (var33 == 6) {
                int var49 = var32.field6472;
                int var50 = (var49 & 0x7D0E) >> 10;
                int var51 = var49 >> 5 & 0x1F;
                int var52 = var49 & 0x1F;
                int var53 = (var52 << 3) + (var50 << 19) + (var51 << 11);
                class101 var54 = class271.method1711(var34, 23727);
                if (var54.field1582 != var53) {
                    var54.field1582 = var53;
                    class326.method1948(1, var54);
                }
            } else if (var33 == 7) {
                class101 var39 = class271.method1711(var34, 23727);
                boolean var40 = var32.field6472 == 1;
                if (var39.field1537 != var40) {
                    var39.field1537 = var40;
                    class326.method1948(1, var39);
                }
            } else if (var33 == 8) {
                class101 var41 = class271.method1711(var34, 23727);
                if (var32.field6472 != var41.field1570 || var32.field6480 != var41.field1609 || var32.field6479 != var41.field1587) {
                    var41.field1587 = var32.field6479;
                    var41.field1609 = var32.field6480;
                    var41.field1570 = var32.field6472;
                    if (var41.field1565 != -1) {
                        if (var41.field1645 > 0) {
                            var41.field1587 = var41.field1587 * 32 / var41.field1645;
                        } else if (var41.field1560 > 0) {
                            var41.field1587 = var41.field1587 * 32 / var41.field1560;
                        }
                    }
                    class326.method1948(1, var41);
                }
            } else if (var33 == 9) {
                class101 var48 = class271.method1711(var34, 23727);
                if (var32.field6472 != var48.field1565 || var32.field6480 != var48.field1489) {
                    var48.field1489 = var32.field6480;
                    var48.field1565 = var32.field6472;
                    class326.method1948(1, var48);
                }
            } else if (var33 == 10) {
                class101 var47 = class271.method1711(var34, 23727);
                if (var32.field6472 != var47.field1552 || var32.field6480 != var47.field1612 || var32.field6479 != var47.field1619) {
                    var47.field1552 = var32.field6472;
                    var47.field1619 = var32.field6479;
                    var47.field1612 = var32.field6480;
                    class326.method1948(1, var47);
                }
            } else if (var33 == 11) {
                class101 var42 = class271.method1711(var34, 23727);
                var42.field1531 = 0;
                var42.field1583 = var42.field1627 = var32.field6472;
                var42.field1536 = 0;
                var42.field1589 = var42.field1541 = var32.field6480;
                class326.method1948(1, var42);
            } else if (var33 == 12) {
                class101 var43 = class271.method1711(var34, 23727);
                int var44 = var32.field6472;
                if (var43 != null && var43.field1584 == 0) {
                    if (var43.field1592 - var43.field1651 < var44) {
                        var44 = var43.field1592 - var43.field1651;
                    }
                    if (var44 < 0) {
                        var44 = 0;
                    }
                    if (var43.field1523 != var44) {
                        var43.field1523 = var44;
                        class326.method1948(1, var43);
                    }
                }
            } else if (var33 == 14) {
                class101 var46 = class271.method1711(var34, 23727);
                var46.field1628 = var32.field6472;
            } else if (var33 == 15) {
                class153.field2547 = true;
                class400.field5777 = var32.field6472;
                class202.field3126 = var32.field6480;
            } else if (var33 == 16) {
                class101 var45 = class271.method1711(var34, 23727);
                var45.field1637 = var32.field6472;
            }
        }
        if (class600.field8661 != 0) {
            class435.field6264 += 20;
            if (class435.field6264 >= 400) {
                class600.field8661 = 0;
            }
        }
        class193.field2993++;
        if (class171.field2778 != null) {
            class571.field8348++;
            if (class571.field8348 >= 15) {
                class326.method1948(1, class171.field2778);
                class171.field2778 = null;
            }
        }
        class86.field1290 = false;
        class201.field3101 = null;
        class23.field309 = false;
        class541.field7950 = null;
        class390.method2374(false, -1, null, -1);
        class25.method244(-1, -1, null, -92);
        if (!class41.field555) {
            class324.field4521 = -1;
        }
        class669.method3773(6123);
        class330.field4562++;
        if (class476.field6819) {
            class549.field8053++;
            class699 var58 = class452.method2630(class699.field9897, class644.field9152, (byte) 127);
            var58.field9908.method2735(class91.field1337 << 14 | class121.field1976 << 28 | class204.field3161, 15015);
            class149.method1134(var58, true);
            class476.field6819 = false;
        }
        while (true) {
            class400 var59;
            class101 var60;
            class101 var61;
            do {
                var59 = (class400) class583.field8542.method3906(0);
                if (var59 == null) {
                    while (true) {
                        class400 var62;
                        class101 var63;
                        class101 var64;
                        do {
                            var62 = (class400) class556.field8137.method3906(0);
                            if (var62 == null) {
                                while (true) {
                                    class400 var65;
                                    class101 var66;
                                    class101 var67;
                                    do {
                                        var65 = (class400) class286.field4012.method3906(0);
                                        if (var65 == null) {
                                            if (class541.field7950 == null) {
                                                class221.field3307 = 0;
                                            }
                                            if (class512.field7616 != null) {
                                                class454.method2638(-3);
                                            }
                                            if (class447.field6459 > 0 && class236.field3494.method668(-64, 82) && class236.field3494.method668(-127, 81) && class165.field2730 != 0) {
                                                int var68 = class103.field1708.field3158 - class165.field2730;
                                                if (var68 < 0) {
                                                    var68 = 0;
                                                } else if (var68 > 3) {
                                                    var68 = 3;
                                                }
                                                class262.method1673(var68, class103.field1708.field2454[0] + class143.field2474, (byte) -115, class103.field1708.field2459[0] + class63.field917);
                                            }
                                            class659.method3710(10);
                                            for (int var69 = 0; var69 < 5; var69++) {
                                                int var10002 = class557.field8147[var69]++;
                                            }
                                            if (class609.field8751 && class662.field9304 < (class254.method1619(true) - 60000L)) {
                                                class539.method3174((byte) -103);
                                            }
                                            for (class499 var70 = (class499) class678.field9654.method3313((byte) -49); var70 != null; var70 = (class499) class678.field9654.method3308(-118)) {
                                                if (((long) var70.field7415) < (class254.method1619(true) / 1000L - 5L)) {
                                                    if (var70.field7417 > 0) {
                                                        class418.method2478(5, "", "", var70.field7421 + class343.field4768.method2059(class238.field3511, arg0), 0, "", 0);
                                                    }
                                                    if (var70.field7417 == 0) {
                                                        class418.method2478(5, "", "", var70.field7421 + class343.field4769.method2059(class238.field3511, true), 0, "", 0);
                                                    }
                                                    var70.method3421(3);
                                                }
                                            }
                                            class172.field2784++;
                                            if (class172.field2784 > 500) {
                                                class172.field2784 = 0;
                                                int var71 = (int) (Math.random() * 8.0D);
                                                if ((var71 & 0x2) == 2) {
                                                    class208.field3205 += class436.field6277;
                                                }
                                                if ((var71 & 0x4) == 4) {
                                                    class137.field2215 += class681.field9700;
                                                }
                                                if ((var71 & 0x1) == 1) {
                                                    class345.field4885 += class278.field3935;
                                                }
                                            }
                                            if (class345.field4885 < -50) {
                                                class278.field3935 = 2;
                                            }
                                            if (class345.field4885 > 50) {
                                                class278.field3935 = -2;
                                            }
                                            if (class208.field3205 < -55) {
                                                class436.field6277 = 2;
                                            }
                                            if (class137.field2215 < -40) {
                                                class681.field9700 = 1;
                                            }
                                            if (class208.field3205 > 55) {
                                                class436.field6277 = -2;
                                            }
                                            if (class137.field2215 > 40) {
                                                class681.field9700 = -1;
                                            }
                                            class270.field3881++;
                                            if (class270.field3881 > 500) {
                                                class270.field3881 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x2) == 2) {
                                                    class239.field3523 += class460.field6620;
                                                }
                                                if ((var72 & 0x1) == 1) {
                                                    class419.field5957 += class440.field6368;
                                                }
                                            }
                                            if (class419.field5957 < -60) {
                                                class440.field6368 = 2;
                                            }
                                            if (class239.field3523 < -20) {
                                                class460.field6620 = 1;
                                            }
                                            if (class419.field5957 > 60) {
                                                class440.field6368 = -2;
                                            }
                                            class510.field7592++;
                                            if (class239.field3523 > 10) {
                                                class460.field6620 = -1;
                                            }
                                            if (class510.field7592 > 50) {
                                                class425.field6065++;
                                                class699 var73 = class452.method2630(class699.field9897, class396.field5727, (byte) 126);
                                                class149.method1134(var73, true);
                                            }
                                            if (class119.field1913) {
                                                class340.method2046(-27305);
                                                class119.field1913 = false;
                                            }
                                            try {
                                                class557.method3263(123);
                                                return;
                                            } catch (IOException var74) {
                                                class322.method1926((byte) 46);
                                                return;
                                            }
                                        }
                                        var66 = var65.field5783;
                                        if (var66.field1528 < 0) {
                                            break;
                                        }
                                        var67 = class271.method1711(var66.field1539, 23727);
                                    } while (var67 == null || var67.field1578 == null || var67.field1578.length <= var66.field1528 || var67.field1578[var66.field1528] != var66);
                                    class362.method2171(var65);
                                }
                            }
                            var63 = var62.field5783;
                            if (var63.field1528 < 0) {
                                break;
                            }
                            var64 = class271.method1711(var63.field1539, 23727);
                        } while (var64 == null || var64.field1578 == null || var64.field1578.length <= var63.field1528 || var64.field1578[var63.field1528] != var63);
                        class362.method2171(var62);
                    }
                }
                var60 = var59.field5783;
                if (var60.field1528 < 0) {
                    break;
                }
                var61 = class271.method1711(var60.field1539, 23727);
            } while (var61 == null || var61.field1578 == null || var60.field1528 >= var61.field1578.length || var61.field1578[var60.field1528] != var60);
            class362.method2171(var59);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZIZB)V", line = 876)
    public static final void method2378(int arg0, boolean arg1, int arg2, boolean arg3, byte arg4) {
        field5690++;
        class556.method3252(0, arg2, class432.field6219.length - 1, arg0, arg3, arg1, (byte) 122);
        if (arg4 == -82) {
            class347.field4912 = 0;
            class619.field8831 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([BII)[B", line = 889)
    public static final byte[] method2379(byte[] arg0, int arg1, int arg2) {
        field5688++;
        byte[] var3 = new byte[arg1];
        if (arg2 <= 108) {
            return null;
        } else {
            class553.method3242(arg0, 0, var3, 0, arg1);
            return var3;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IBI)V", line = 903)
    public static final void method2380(int arg0, byte arg1, int arg2) {
        field5689++;
        int var3 = class246.field3584.method2870(true, class343.field4773.method2059(class238.field3511, true));
        class673 var4 = (class673) class150.field2533.method3905(-117);
        if (arg1 != -96) {
            method2379(null, 89, -81);
        }
        while (var4 != null) {
            int var8 = class640.method3599(-1009, var4);
            if (var8 > var3) {
                var3 = var8;
            }
            var4 = (class673) class150.field2533.method3899(0);
        }
        var3 += 8;
        int var5 = class400.field5784 * 16 + 21;
        int var6 = arg0 - (var3 / 2);
        if (var6 + var3 > class465.field6689) {
            var6 = class465.field6689 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg2;
        if (var5 + arg2 > class597.field8633) {
            var7 = class597.field8633 - var5;
        }
        class150.field2534 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class69.field1093 = var3;
        class324.field4519 = true;
        class485.field6918 = var7;
        class273.field3904 = class400.field5784 * 16 + (client.field1383 ? 26 : 22);
    }
}
