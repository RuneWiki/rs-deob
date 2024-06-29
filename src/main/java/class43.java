import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class43 extends class438 {

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "Lka;")
    public static class408 field571 = new class408(5);

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public int field572;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Ljq;")
    public class185 field565;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Lij;")
    public static class316 field574;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 5)
    public static final boolean method369(String arg0, int arg1) {
        if (arg1 == 10) {
            field569++;
            return class441.method2735((byte) 100, arg0, 10, true);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 21)
    public static final void method370(boolean arg0) {
        field568++;
        if (class269.field3686 > 0) {
            class269.field3686--;
        }
        if (class64.field884 > 1) {
            class115.field1751 = class260.field3595;
            class64.field884--;
        }
        if (class251.field3502) {
            class251.field3502 = false;
            class409.method2539((byte) 6);
            return;
        }
        if (!class317.field4324) {
            class416.method2571(0);
        }
        for (int var1 = 0; var1 < 100 && class125.method952(-104); var1++) {
        }
        if (class98.field1383 != 30) {
            return;
        }
        class60.method472(-121, 128, class88.field1232);
        if (class446.field6255 != null || class104.field1430 < class199.method1372(30938) - 2000L) {
            boolean var2 = false;
            int var3 = class88.field1232.field5048;
            for (class21 var4 = (class21) class203.field2889.method1173(0); var4 != null && (class88.field1232.field5048 - var3) < 240; var4 = (class21) class203.field2889.method1165(true)) {
                var4.method1884(false);
                int var5 = var4.method126(arg0);
                if (var5 < 0) {
                    var5 = 0;
                } else if (var5 > 65534) {
                    var5 = 65534;
                }
                int var6 = var4.method121((byte) -95);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                boolean var7 = false;
                if (var4.method126(false) == -1 && var4.method121((byte) -84) == -1) {
                    var7 = true;
                    var6 = -1;
                    var5 = -1;
                }
                if (class389.field5422 != var6 || class397.field5498 != var5) {
                    if (!var2) {
                        class388.field5396++;
                        class88.field1232.method1151(135, (byte) -85);
                        class88.field1232.method2280(0, 1537846408);
                        var3 = class88.field1232.field5048;
                        var2 = true;
                    }
                    int var8 = var6 - class389.field5422;
                    class389.field5422 = var6;
                    int var9 = var5 - class397.field5498;
                    class397.field5498 = var5;
                    int var10 = (int) ((var4.method125((byte) 79) - class104.field1430) / 20L);
                    if (var10 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                        var8 += 32;
                        var9 += 32;
                        class88.field1232.method2275(-73, (var8 << 6) + (var10 << 12) + var9);
                    } else if (var10 < 32 && var8 >= -128 && var8 <= 127 && var9 >= -128 && var9 <= 127) {
                        class88.field1232.method2280(var10 + 128, 1537846408);
                        var9 += 128;
                        var8 += 128;
                        class88.field1232.method2275(122, (var8 << 8) + var9);
                    } else if (var10 < 32) {
                        class88.field1232.method2280(var10 + 192, 1537846408);
                        if (var7) {
                            class88.field1232.method2261(Integer.MIN_VALUE, -176);
                        } else {
                            class88.field1232.method2261(var5 << 16 | var6, -176);
                        }
                    } else {
                        class88.field1232.method2275(122, var10 + 57344);
                        if (var7) {
                            class88.field1232.method2261(Integer.MIN_VALUE, -176);
                        } else {
                            class88.field1232.method2261(var5 << 16 | var6, -176);
                        }
                    }
                    class104.field1430 = var4.method125((byte) 79);
                }
            }
            if (var2) {
                class88.field1232.method2302(19765, class88.field1232.field5048 - var3);
            }
        }
        if (class446.field6255 != null) {
            long var11 = (class446.field6255.method125((byte) 79) - class244.field3443) / 50L;
            class244.field3443 = class446.field6255.method125((byte) 79);
            if (var11 > 32767L) {
                var11 = 32767L;
            }
            int var13 = class446.field6255.method126(false);
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            int var14 = class446.field6255.method121((byte) -111);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var15 = 0;
            if (class446.field6255.method124(-1) == 2) {
                var15 = 1;
            }
            class281.field3812++;
            int var16 = (int) var11;
            class88.field1232.method1151(176, (byte) -79);
            class88.field1232.method2275(-79, var15 << 15 | var16);
            class88.field1232.method2273(1481174032, var14 | var13 << 16);
        }
        if (class86.field1211 > 0) {
            int var17 = 0;
            for (int var18 = 0; var18 < class86.field1211; var18++) {
                if (class165.field2335[var18].method1675((byte) -81)) {
                    var17++;
                }
            }
            if (var17 > 0) {
                class88.field1232.method1151(154, (byte) 93);
                if (var17 > 75) {
                    var17 = 75;
                }
                class160.field2270++;
                class88.field1232.method2280(var17 * 3, 1537846408);
                for (int var19 = 0; var19 < class86.field1211; var19++) {
                    class260 var20 = class165.field2335[var19];
                    if (var20.method1675((byte) -81)) {
                        long var21 = (var20.method1673(-119) - class432.field6122) / 50L;
                        class432.field6122 = var20.method1673(-126);
                        if (var21 > 65535L) {
                            var21 = 65535L;
                        }
                        class88.field1232.method2280(var20.method1678((byte) 93), 1537846408);
                        class88.field1232.method2275(7, (int) var21);
                    }
                }
            }
        }
        if (class350.field4716 > 0) {
            class350.field4716--;
        }
        if (class68.field964 && class350.field4716 <= 0) {
            class255.field3556++;
            class68.field964 = false;
            class350.field4716 = 20;
            class88.field1232.method1151(166, (byte) -94);
            class88.field1232.method2275(124, (int) class332.field4483 >> 3);
            class88.field1232.method2286((int) class356.field4785 >> 3, -65);
        }
        if (class29.field409 && !class281.field3814) {
            class281.field3814 = true;
            class279.field3799++;
            class88.field1232.method1151(223, (byte) -40);
            class88.field1232.method2280(1, 1537846408);
        }
        if (!class29.field409 && class281.field3814) {
            class281.field3814 = false;
            class279.field3799++;
            class88.field1232.method1151(223, (byte) 126);
            class88.field1232.method2280(0, 1537846408);
        }
        if (!class404.field5589) {
            class159.field2262++;
            class88.field1232.method1151(234, (byte) 93);
            class88.field1232.method2287((byte) -117, class49.method403((byte) -105));
            class404.field5589 = true;
        }
        if (class341.field4617 != null) {
            if (class26.field337 == 2) {
                class84.method678(0);
            } else if (class26.field337 == 3) {
                class196.method1363(2);
            }
        }
        if (class398.field5508) {
            class398.field5508 = false;
        } else {
            class230.field3233 /= 2.0F;
        }
        if (class354.field4763) {
            class354.field4763 = false;
        } else {
            class359.field4972 /= 2.0F;
        }
        class41.method356(-112);
        if (class98.field1383 != 30) {
            return;
        }
        class17.method99((byte) 82);
        class183.method1274(!arg0);
        class178.method1264((byte) -119);
        class369.field5116++;
        if (class369.field5116 > 750) {
            class409.method2539((byte) 6);
            return;
        }
        class387.method2375(-1);
        class220.method1459((byte) -109);
        class6.method33(-85);
        for (int var23 = class311.method1886(true, (byte) 98); var23 != -1; var23 = class311.method1886(false, (byte) 63)) {
            class410.method2542(var23, (byte) 113);
            class363.field5000[class187.method1301(class345.field4671++, 31)] = var23;
        }
        for (class26 var24 = class363.method2231((byte) -119); var24 != null; var24 = class363.method2231((byte) 11)) {
            int var25 = var24.method161(0);
            int var26 = var24.method157(-10495);
            if (var25 == 1) {
                class128.field1936[var26] = var24.field341;
                class35.field479 |= class42.field562[var26];
                class300.field4099[class187.method1301(class131.field1969++, 31)] = var26;
            } else if (var25 == 2) {
                class122.field1844[var26] = var24.field332;
                class428.field5966[class187.method1301(class91.field1274++, 31)] = var26;
            } else if (var25 == 3) {
                class108 var48 = class157.method1139(var26, false);
                if (!var24.field332.equals(var48.field1559)) {
                    var48.field1559 = var24.field332;
                    class298.method1821((byte) -60, var48);
                }
            } else if (var25 == 4) {
                class108 var27 = class157.method1139(var26, false);
                int var28 = var24.field341;
                int var29 = var24.field339;
                int var30 = var24.field336;
                if (var27.field1661 != var28 || var27.field1578 != var29 || var27.field1619 != var30) {
                    var27.field1661 = var28;
                    var27.field1619 = var30;
                    var27.field1578 = var29;
                    class298.method1821((byte) -75, var27);
                }
            } else if (var25 == 5) {
                class108 var31 = class157.method1139(var26, false);
                if (var24.field341 != var31.field1607 || var24.field341 == -1) {
                    var31.field1607 = var24.field341;
                    var31.field1539 = 0;
                    var31.field1620 = 0;
                    var31.field1648 = 1;
                    class298.method1821((byte) -73, var31);
                }
            } else if (var25 == 6) {
                int var42 = var24.field341;
                int var43 = var42 >> 10 & 0x1F;
                int var44 = (var42 & 0x3FE) >> 5;
                int var45 = var42 & 0x1F;
                int var46 = (var44 << 11) + ((var43 << 19) + (var45 << 3));
                class108 var47 = class157.method1139(var26, false);
                if (var47.field1534 != var46) {
                    var47.field1534 = var46;
                    class298.method1821((byte) -102, var47);
                }
            } else if (var25 == 7) {
                class108 var32 = class157.method1139(var26, false);
                boolean var33 = var24.field341 == 1;
                if (var33 != var32.field1656) {
                    var32.field1656 = var33;
                    class298.method1821((byte) -122, var32);
                }
            } else if (var25 == 8) {
                class108 var41 = class157.method1139(var26, false);
                if (var24.field341 != var41.field1527 || var24.field339 != var41.field1671 || var24.field336 != var41.field1604) {
                    var41.field1604 = var24.field336;
                    var41.field1671 = var24.field339;
                    var41.field1527 = var24.field341;
                    if (var41.field1575 != -1) {
                        if (var41.field1599 > 0) {
                            var41.field1604 = var41.field1604 * 32 / var41.field1599;
                        } else if (var41.field1583 > 0) {
                            var41.field1604 = var41.field1604 * 32 / var41.field1583;
                        }
                    }
                    class298.method1821((byte) -122, var41);
                }
            } else if (var25 == 9) {
                class108 var40 = class157.method1139(var26, false);
                if (var24.field341 != var40.field1575 || var24.field339 != var40.field1554) {
                    var40.field1554 = var24.field339;
                    var40.field1575 = var24.field341;
                    class298.method1821((byte) -116, var40);
                }
            } else if (var25 == 10) {
                class108 var34 = class157.method1139(var26, false);
                if (var24.field341 != var34.field1560 || var24.field339 != var34.field1677 || var24.field336 != var34.field1628) {
                    var34.field1560 = var24.field341;
                    var34.field1628 = var24.field336;
                    var34.field1677 = var24.field339;
                    class298.method1821((byte) -110, var34);
                }
            } else if (var25 == 11) {
                class108 var35 = class157.method1139(var26, false);
                var35.field1588 = var35.field1538 = var24.field339;
                var35.field1552 = 0;
                var35.field1645 = 0;
                var35.field1659 = var35.field1606 = var24.field341;
                class298.method1821((byte) -127, var35);
            } else if (var25 == 12) {
                class108 var38 = class157.method1139(var26, false);
                int var39 = var24.field341;
                if (var38 != null && var38.field1666 == 0) {
                    if ((var38.field1629 - var38.field1577) < var39) {
                        var39 = var38.field1629 - var38.field1577;
                    }
                    if (var39 < 0) {
                        var39 = 0;
                    }
                    if (var38.field1633 != var39) {
                        var38.field1633 = var39;
                        class298.method1821((byte) -86, var38);
                    }
                }
            } else if (var25 == 14) {
                class108 var37 = class157.method1139(var26, arg0);
                var37.field1547 = var24.field341;
            } else if (var25 == 15) {
                class233.field3265 = var24.field339;
                class399.field5526 = true;
                class93.field1300 = var24.field341;
            } else if (var25 == 16) {
                class108 var36 = class157.method1139(var26, arg0);
                var36.field1603 = var24.field341;
            }
        }
        class54.field694++;
        if (class50.field641 != 0) {
            class220.field3085 += 20;
            if (class220.field3085 >= 400) {
                class50.field641 = 0;
            }
        }
        if (class186.field2686 != null) {
            class26.field340++;
            if (class26.field340 >= 15) {
                class298.method1821((byte) -101, class186.field2686);
                class186.field2686 = null;
            }
        }
        class105.field1480 = null;
        class84.field1177 = arg0;
        class367.field5091 = false;
        class117.field1782 = null;
        class225.method1471((class108) null, -1, -1, (byte) -35);
        class388.method2416(-1, -1, true, (class108) null);
        class189.method1310((byte) 12);
        class260.field3595++;
        if (class319.field4356) {
            class278.field3785++;
            class88.field1232.method1151(105, (byte) -68);
            class88.field1232.method2299((byte) -119, class311.field4222 | class383.field5268 << 14 | class146.field2128 << 28);
            class319.field4356 = false;
        }
        while (true) {
            class101 var49;
            class108 var50;
            class108 var51;
            do {
                var49 = (class101) class169.field2392.method1160((byte) 34);
                if (var49 == null) {
                    while (true) {
                        class101 var52;
                        class108 var53;
                        class108 var54;
                        do {
                            var52 = (class101) class432.field6101.method1160((byte) 59);
                            if (var52 == null) {
                                while (true) {
                                    class101 var55;
                                    class108 var56;
                                    class108 var57;
                                    do {
                                        var55 = (class101) class90.field1262.method1160((byte) -101);
                                        if (var55 == null) {
                                            if (class105.field1480 == null) {
                                                class200.field2879 = 0;
                                            }
                                            if (class31.field431 != null) {
                                                class277.method1747((byte) -106);
                                            }
                                            if (class157.field2234 > 0 && class146.field2122.method1474(-20986, 82) && class146.field2122.method1474(-20986, 81) && class220.field3083 != 0) {
                                                int var58 = class343.field4623 - class220.field3083;
                                                if (var58 < 0) {
                                                    var58 = 0;
                                                } else if (var58 > 3) {
                                                    var58 = 3;
                                                }
                                                class246.method1601(var58, 63, class359.field4970.field2662[0] + class6.field65, class359.field4970.field2659[0] + class371.field5148);
                                            }
                                            class397.method2462(arg0);
                                            for (int var59 = 0; var59 < 5; var59++) {
                                                int var10002 = class30.field411[var59]++;
                                            }
                                            if (class35.field479 && class407.field5638 < (class199.method1372(30938) - 60000L)) {
                                                class222.method1466(1);
                                            }
                                            class325.field4429++;
                                            if (class325.field4429 > 500) {
                                                class325.field4429 = 0;
                                                int var60 = (int) (Math.random() * 8.0D);
                                                if ((var60 & 0x1) == 1) {
                                                    class405.field5611 += class219.field3082;
                                                }
                                                if ((var60 & 0x2) == 2) {
                                                    class1.field7 += class139.field2037;
                                                }
                                                if ((var60 & 0x4) == 4) {
                                                    class312.field4239 += class442.field6206;
                                                }
                                            }
                                            if (class405.field5611 < -50) {
                                                class219.field3082 = 2;
                                            }
                                            if (class405.field5611 > 50) {
                                                class219.field3082 = -2;
                                            }
                                            if (class1.field7 < -55) {
                                                class139.field2037 = 2;
                                            }
                                            if (class1.field7 > 55) {
                                                class139.field2037 = -2;
                                            }
                                            if (class312.field4239 < -40) {
                                                class442.field6206 = 1;
                                            }
                                            class147.field2143++;
                                            if (class312.field4239 > 40) {
                                                class442.field6206 = -1;
                                            }
                                            if (class147.field2143 > 500) {
                                                class147.field2143 = 0;
                                                int var61 = (int) (Math.random() * 8.0D);
                                                if ((var61 & 0x2) == 2) {
                                                    class129.field1950 += class258.field3573;
                                                }
                                                if ((var61 & 0x1) == 1) {
                                                    class19.field249 += class405.field5612;
                                                }
                                            }
                                            if (class19.field249 < -60) {
                                                class405.field5612 = 2;
                                            }
                                            if (class129.field1950 < -20) {
                                                class258.field3573 = 1;
                                            }
                                            if (class19.field249 > 60) {
                                                class405.field5612 = -2;
                                            }
                                            if (class129.field1950 > 10) {
                                                class258.field3573 = -1;
                                            }
                                            class388.field5401++;
                                            if (class388.field5401 > 50) {
                                                class88.field1232.method1151(57, (byte) -29);
                                                class35.field472++;
                                            }
                                            if (class14.field148) {
                                                class219.method1454((byte) 78);
                                                class14.field148 = false;
                                            }
                                            try {
                                                if (class398.field5513 != null && class88.field1232.field5048 > 0) {
                                                    class398.field5513.method1328(0, class88.field1232.field5076, class88.field1232.field5048, 3);
                                                    class388.field5401 = 0;
                                                    class88.field1232.field5048 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var62) {
                                                class409.method2539((byte) 6);
                                                return;
                                            }
                                        }
                                        var56 = var55.field1403;
                                        if (var56.field1647 < 0) {
                                            break;
                                        }
                                        var57 = class157.method1139(var56.field1540, false);
                                    } while (var57 == null || var57.field1651 == null || var56.field1647 >= var57.field1651.length || var57.field1651[var56.field1647] != var56);
                                    class172.method1230(var55);
                                }
                            }
                            var53 = var52.field1403;
                            if (var53.field1647 < 0) {
                                break;
                            }
                            var54 = class157.method1139(var53.field1540, false);
                        } while (var54 == null || var54.field1651 == null || var54.field1651.length <= var53.field1647 || var54.field1651[var53.field1647] != var53);
                        class172.method1230(var52);
                    }
                }
                var50 = var49.field1403;
                if (var50.field1647 < 0) {
                    break;
                }
                var51 = class157.method1139(var50.field1540, false);
            } while (var51 == null || var51.field1651 == null || var50.field1647 >= var51.field1651.length || var51.field1651[var50.field1647] != var50);
            class172.method1230(var49);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 839)
    public static void method371(int arg0) {
        field571 = null;
        field574 = null;
        if (arg0 < 125) {
            method372((byte) -12);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V", line = 850)
    public static final void method372(byte arg0) {
        field570++;
        if (arg0 != 75) {
            field574 = null;
        }
        class237.field3372.method2530((byte) -82);
    }
}
