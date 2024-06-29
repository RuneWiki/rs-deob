import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class133 {

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field1986 = 0;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "Ljm;")
    public static class162 field1991 = new class162();

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "Z")
    public static boolean field1993 = false;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "[I")
    public static int[] field1994 = new int[3];

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)V")
    public static final void method991(int arg0, int arg1, int arg2) {
        if (arg2 != 1255678057) {
            field1994 = null;
        }
        field1992++;
        class13.field121[arg0] = arg1;
        class93 var3 = (class93) class366.field5073.method837((byte) -72, (long) arg0);
        if (var3 == null) {
            class93 var4 = new class93(class199.method1372(30938) + 500L);
            class366.field5073.method835(4, var4, (long) arg0);
        } else {
            var3.field1295 = class199.method1372(30938) + 500L;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lgg;III)V")
    public static final void method992(class313 arg0, int arg1, int arg2, int arg3) {
        int var4 = class296.field4069[arg1][arg2][arg3];
        int var5 = 0;
        arg0.field4247 = 0;
        while (var5 <= 24) {
            int var6 = var4 >> var5 & 0xFF;
            if (var6 <= 0) {
                break;
            }
            arg0.field4242[arg0.field4247++] = class122.field1838[var6 - 1];
            var5 += 8;
        }
        for (int var7 = arg0.field4247; var7 < 4; var7++) {
            arg0.field4242[var7] = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIIII[Lvg;I)V")
    public static final void method993(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108[] arg8, int arg9) {
        field1990++;
        class354.field4765.method227(arg2, arg6, arg0, arg9);
        for (int var10 = arg7; var10 < arg8.length; var10++) {
            class108 var11 = arg8[var10];
            if (var11 != null && (var11.field1540 == arg4 || arg4 == -1412584499 && class31.field431 == var11)) {
                int var12;
                if (arg1 == -1) {
                    class451.field6479[class58.field751].setBounds(var11.field1659 + arg3, var11.field1588 + arg5, var11.field1568, var11.field1577);
                    var12 = class58.field751++;
                } else {
                    var12 = arg1;
                }
                var11.field1556 = var12;
                var11.field1595 = class246.field3467;
                if (!client.method1637(var11)) {
                    if (var11.field1660 > 0) {
                        class41.method355(120, var11);
                    }
                    int var13 = var11.field1659 + arg3;
                    int var14 = var11.field1588 + arg5;
                    int var15 = var11.field1533;
                    if (class42.field542 && (client.method1634(var11).field4209 != 0 || var11.field1666 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class31.field431 == var11) {
                        if (arg4 != -1412584499 && !var11.field1597) {
                            class311.field4224 = arg8;
                            class204.field2894 = arg3;
                            class379.field5236 = arg5;
                            continue;
                        }
                        if (class406.field5625 && class84.field1177) {
                            int var16 = class116.field1759.method34(true);
                            int var17 = class116.field1759.method30((byte) 115);
                            int var18 = var16 - class228.field3172;
                            int var19 = var17 - class182.field2560;
                            if (var18 < class55.field726) {
                                var18 = class55.field726;
                            }
                            if (class55.field726 + class22.field286.field1568 < var11.field1568 + var18) {
                                var18 = class22.field286.field1568 + class55.field726 - var11.field1568;
                            }
                            if (var19 < class446.field6259) {
                                var19 = class446.field6259;
                            }
                            var13 = var18;
                            if ((var11.field1577 + var19) > (class446.field6259 + class22.field286.field1577)) {
                                var19 = class22.field286.field1577 + class446.field6259 - var11.field1577;
                            }
                            var14 = var19;
                        }
                        if (!var11.field1597) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field1666 == 2) {
                        var20 = arg0;
                        var21 = arg2;
                        var22 = arg6;
                        var23 = arg9;
                    } else {
                        int var24 = var13 + var11.field1568;
                        int var25 = var11.field1577 + var14;
                        var22 = arg6 >= var14 ? arg6 : var14;
                        var21 = arg2 >= var13 ? arg2 : var13;
                        if (var11.field1666 == 9) {
                            var24++;
                            var25++;
                        }
                        var23 = var25 >= arg9 ? arg9 : var25;
                        var20 = var24 >= arg0 ? arg0 : var24;
                    }
                    if (var21 < var20 && var23 > var22) {
                        if (var11.field1660 != 0) {
                            if (var11.field1660 == 1337 || var11.field1660 == 1403) {
                                class305.method1844(var14, var11.field1568, var13, var11.field1660 == 1403, var11.field1577, (byte) 115);
                                class363.field4998[var12] = true;
                                class354.field4765.method227(arg2, arg6, arg0, arg9);
                                continue;
                            }
                            if (var11.field1660 == 1338) {
                                if (var11.method831((byte) 56, class354.field4765) != null) {
                                    class140.method1025(255);
                                    class10.method51(var14, var11, class354.field4765, (byte) 87, var13);
                                    class53.field680[var12] = true;
                                    class354.field4765.method227(arg2, arg6, arg0, arg9);
                                }
                                continue;
                            }
                            if (var11.field1660 == 1339) {
                                if (var11.method831((byte) 64, class354.field4765) != null) {
                                    class246.method1604(var11, 68, var13, var14);
                                    class53.field680[var12] = true;
                                    class354.field4765.method227(arg2, arg6, arg0, arg9);
                                }
                                continue;
                            }
                            if (var11.field1660 == 1400) {
                                class128.method968((byte) 90, var11.field1568, var14, class354.field4765, var13, class122.field1846, var11.field1577);
                                class363.field4998[var12] = true;
                                class354.field4765.method227(arg2, arg6, arg0, arg9);
                                continue;
                            }
                            if (var11.field1660 == 1401) {
                                class313.method1896((byte) -118, var14, class354.field4765, var11.field1568, var11.field1577, var13);
                                class363.field4998[var12] = true;
                                class354.field4765.method227(arg2, arg6, arg0, arg9);
                                continue;
                            }
                            if (var11.field1660 == 1405) {
                                if (!class132.field1977 && !class281.field3833) {
                                    continue;
                                }
                                int var26 = var11.field1568 + var13;
                                int var27 = var14 + 15;
                                if (class132.field1977) {
                                    class31.field432.method495(var27, "Fps:" + class84.field1181, var26, -1, 350, -256);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class31.field432.method495(var27, "Mem:" + var29 + "k", var26, -1, arg7 ^ 0x15E, var30);
                                    var27 += 15;
                                    int var31 = class354.field4765.method200() / 1024;
                                    class31.field432.method495(var27, "Offheap:" + var31 + "k", var26, -1, 350, var31 <= 65536 ? -256 : -65536);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 29; var35++) {
                                        var32 += class404.field5595[var35].method1254((byte) -92);
                                        var33 += class404.field5595[var35].method1257(true);
                                        var34 += class404.field5595[var35].method1251(-81);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class372.method2328(true, (long) var37, 0, 44, 2) + "% (" + var36 + "%)";
                                    class52.field669.method495(var27, var38, var26, -1, 350, -256);
                                    var27 += 12;
                                }
                                if (class354.field4767 > 0) {
                                    class52.field669.method495(var27, "Particles: " + class140.field2050 + " / " + class354.field4767, var26, -1, arg7 ^ 0x15E, -256);
                                }
                                var27 += 12;
                                if (class281.field3833) {
                                    class52.field669.method495(var27, "Polys: " + class354.field4765.method203() + " Models: " + class354.field4765.method215(), var26, -1, 350, -256);
                                    var27 += 12;
                                    class52.field669.method495(var27, "Ls: " + class334.field4533 + " La: " + class424.field5895 + " NPC: " + class186.field2675 + " Pl: " + class296.field4071, var26, -1, 350, -256);
                                    class14.method71(-3);
                                    var27 += 12;
                                }
                                class363.field4998[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field1666 == 0) {
                            if (var11.field1660 == 1407 && class354.field4765.method226()) {
                                class354.field4765.method179(var13, var14, var11.field1568, var11.field1577);
                            }
                            method993(var20, var12, var21, var13 - var11.field1665, var11.field1631, var14 - var11.field1633, var22, arg7, arg8, var23);
                            if (var11.field1651 != null) {
                                method993(var20, var12, var21, var13 - var11.field1665, var11.field1631, var14 - var11.field1633, var22, 0, var11.field1651, var23);
                            }
                            class435 var39 = (class435) class171.field2415.method837((byte) -72, (long) var11.field1631);
                            if (var39 != null) {
                                class61.method498(var22, var20, var39.field6146, var21, var12, -10289, var14, var23, var13);
                            }
                            if (var11.field1660 == 1407 && class354.field4765.method226()) {
                                class354.field4765.method257();
                                class18.field241 = true;
                            }
                            class354.field4765.method227(arg2, arg6, arg0, arg9);
                        }
                        if (class160.field2276[var12] || class233.field3329 > 1) {
                            if (var11.field1666 == 3) {
                                if (var15 == 0) {
                                    if (var11.field1535) {
                                        class354.field4765.method245(var13, var14, var11.field1568, var11.field1577, var11.field1534, 0);
                                    } else {
                                        class354.field4765.method190(var13, var14, var11.field1568, var11.field1577, var11.field1534, 0);
                                    }
                                } else if (var11.field1535) {
                                    class354.field4765.method245(var13, var14, var11.field1568, var11.field1577, 255 - (var15 & 0xFF) << 24 | var11.field1534 & 0xFFFFFF, 1);
                                } else {
                                    class354.field4765.method190(var13, var14, var11.field1568, var11.field1577, var11.field1534 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                }
                            } else if (var11.field1666 == 4) {
                                class61 var40 = var11.method822(-1, class354.field4765);
                                if (var40 != null) {
                                    int var41 = var11.field1534;
                                    String var42 = var11.field1559;
                                    if (var11.field1575 != -1) {
                                        class14 var43 = class367.method2308(false, var11.field1575);
                                        var42 = var43.field191;
                                        if (var42 == null) {
                                            var42 = "null";
                                        }
                                        if ((var43.field153 == 1 || var11.field1554 != 1) && var11.field1554 != -1) {
                                            var42 = "<col=ff9040>" + var42 + "</col> x" + class42.method368(var11.field1554, arg7 ^ 0xFFFFFFFE);
                                        }
                                    }
                                    if (class50.field640 == var11) {
                                        var42 = class31.field430.method2313((byte) -75, class445.field6241);
                                        var41 = var11.field1534;
                                    }
                                    if (class217.field3054) {
                                        class354.field4765.method206(var13, var14, var11.field1568 + var13, var11.field1577 + var14);
                                    }
                                    var40.method490(var11.field1546 ? -16777216 : -1, var11.field1632, var42, var41 | 0xFF000000, var11.field1640, var11.field1577, var11.field1635, (int[]) null, var13, (byte) -108, (class165) null, class242.field3429, var14, 0, 0, var11.field1568);
                                    if (class217.field3054) {
                                        class354.field4765.method227(arg2, arg6, arg0, arg9);
                                    }
                                } else if (class225.field3117) {
                                    class298.method1821((byte) -63, var11);
                                }
                            } else if (var11.field1666 == 5) {
                                if (var11.field1652 >= 0) {
                                    var11.method828(arg7 ^ 0x5B).method542(var11.field1577, (byte) 116, var11.field1600 << 3, var14, 0, var11.field1542 << 3, 0, class354.field4765, var11.field1568, var13);
                                } else {
                                    class77 var44;
                                    if (var11.field1575 == -1) {
                                        var44 = var11.method824((byte) 0, class354.field4765);
                                    } else {
                                        class339 var45 = var11.field1636 ? class359.field4970.field5874 : null;
                                        var44 = class14.method81(var11.field1621 | 0xFF000000, class354.field4765, 29037, var45, var11.field1575, var11.field1624, var11.field1622, var11.field1554);
                                    }
                                    if (var44 != null) {
                                        int var46 = var44.method632();
                                        int var47 = var44.method619();
                                        if (var11.field1566) {
                                            class354.field4765.method206(var13, var14, var11.field1568 + var13, var11.field1577 + var14);
                                            if (var11.field1558 != 0) {
                                                int var48 = (var46 + var11.field1568 - 1) / var46;
                                                int var49 = (var11.field1577 + var47 - 1) / var47;
                                                for (int var50 = 0; var50 < var48; var50++) {
                                                    for (int var51 = 0; var51 < var49; var51++) {
                                                        var44.method630((float) var46 / 2.0F + (float) (var46 * var50 + var13), (float) var47 / 2.0F + (float) (var47 * var51 + var14), 4096, var11.field1558);
                                                    }
                                                }
                                            } else if (var15 == 0) {
                                                var44.method627(var13, var14, var11.field1568, var11.field1577, 0, 0, 1);
                                            } else {
                                                var44.method627(var13, var14, var11.field1568, var11.field1577, 1, 255 - (var15 & 0xFF) << 24 | 0xFFFFFF, 1);
                                            }
                                            class354.field4765.method227(arg2, arg6, arg0, arg9);
                                        } else if (var15 != 0) {
                                            int var52 = 255 - (var15 & 0xFF) << 24 | 0xFFFFFF;
                                            if (var11.field1558 != 0) {
                                                var44.method629((float) var11.field1568 / 2.0F + (float) var13, (float) var11.field1577 / 2.0F + (float) var14, var11.field1568 * 4096 / var46, var11.field1558, 1, var52, 1);
                                            } else if (var11.field1568 == var46 && var11.field1577 == var47) {
                                                var44.method617(var13, var14, 1, var52, 1);
                                            } else {
                                                var44.method618(var13, var14, var11.field1568, var11.field1577, 1, var52, 1);
                                            }
                                        } else if (var11.field1558 != 0) {
                                            var44.method630((float) var11.field1568 / 2.0F + (float) var13, (float) var11.field1577 / 2.0F + (float) var14, var11.field1568 * 4096 / var46, var11.field1558);
                                        } else if (var11.field1568 == var46 && var11.field1577 == var47) {
                                            var44.method616(var13, var14);
                                        } else {
                                            var44.method615(var13, var14, var11.field1568, var11.field1577);
                                        }
                                    } else if (class225.field3117) {
                                        class298.method1821((byte) -113, var11);
                                    }
                                }
                            } else if (var11.field1666 == 6) {
                                class372.method2327(arg7 + 110);
                                class116 var53 = null;
                                int var54 = 0;
                                if (var11.field1575 != -1) {
                                    class14 var62 = class367.method2308(false, var11.field1575);
                                    if (var62 != null) {
                                        class14 var63 = var62.method85(var11.field1554, 25714);
                                        class83 var64 = var11.field1607 == -1 ? null : class408.method2521((byte) -110, var11.field1607);
                                        class339 var65 = var11.field1636 ? class359.field4970.field5874 : null;
                                        var53 = var63.method74(1024, (byte) 103, 1, var11.field1620, var64, class354.field4765, var65, var11.field1539, var11.field1648);
                                        if (var53 == null) {
                                            class298.method1821((byte) -66, var11);
                                        } else {
                                            var54 = -var53.method889() / 2;
                                        }
                                    }
                                } else if (var11.field1661 == 5) {
                                    if (var11.field1578 == -1) {
                                        var53 = class213.field2977.method2073(-1, (class134[]) null, (byte) 12, -1, 1024, (class83) null, true, 0, -1, -1, class354.field4765, 0, (class83) null);
                                    } else {
                                        int var55 = var11.field1578;
                                        class423 var56;
                                        if (class217.field3030 == var55) {
                                            var56 = class359.field4970;
                                        } else {
                                            var56 = class87.field1227[var55];
                                        }
                                        class83 var57 = var11.field1607 == -1 ? null : class408.method2521((byte) -99, var11.field1607);
                                        if (var56 != null && (var55 == 2047 || class260.method1680(var56.field5869, (byte) 94) == var11.field1619)) {
                                            var53 = var56.field5874.method2073(-1, (class134[]) null, (byte) 12, 0, 1024, (class83) null, true, var11.field1620, var11.field1648, var11.field1539, class354.field4765, 0, var57);
                                        }
                                    }
                                } else if (var11.field1661 == 8 || var11.field1661 == 9) {
                                    class57 var59 = class2.method5(false, var11.field1578, true);
                                    class83 var60 = var11.field1607 == -1 ? null : class408.method2521((byte) 88, var11.field1607);
                                    if (var59 != null) {
                                        class339 var61 = var11.field1636 ? class359.field4970.field5874 : null;
                                        var53 = var59.method448(var11.field1648, var61, false, var11.field1661 == 9, var11.field1620, 1024, var60, var11.field1539, var11.field1619, class354.field4765);
                                    }
                                } else if (var11.field1607 == -1) {
                                    var53 = var11.method823(-1, class354.field4765, (class83) null, arg7 ^ 0x7, class359.field4970.field5874, -1, 1024, 0);
                                    if (var53 == null && class225.field3117) {
                                        class298.method1821((byte) -96, var11);
                                    }
                                } else {
                                    class83 var58 = class408.method2521((byte) 22, var11.field1607);
                                    var53 = var11.method823(var11.field1648, class354.field4765, var58, arg7 + 7, class359.field4970.field5874, var11.field1539, 1024, var11.field1620);
                                    if (var53 == null && class225.field3117) {
                                        class298.method1821((byte) -123, var11);
                                    }
                                }
                                if (var53 != null) {
                                    int var66;
                                    if (var11.field1599 > 0) {
                                        var66 = (var11.field1568 << 9) / var11.field1599;
                                    } else {
                                        var66 = 512;
                                    }
                                    int var67;
                                    if (var11.field1574 <= 0) {
                                        var67 = 512;
                                    } else {
                                        var67 = (var11.field1577 << 9) / var11.field1574;
                                    }
                                    int var68 = (var11.field1573 * var66 >> 9) + var11.field1568 / 2 + var13;
                                    int var69 = (var11.field1630 * var67 >> 9) + var11.field1577 / 2 + var14;
                                    class406.field5619.method1856();
                                    class354.field4765.method168(class406.field5619);
                                    int var70 = class136.field2021[var11.field1527 << 3] * var11.field1604 >> 15;
                                    int var71 = class136.field2020[var11.field1527 << 3] * var11.field1604 >> 15;
                                    class354.field4765.method194(var68, var69, var66, var67);
                                    class354.field4765.method180((float) var11.field1553, var11.field1615 ? (float) var11.field1641 : (float) var11.field1641 * 1.5F);
                                    if (class18.field241) {
                                        class354.field4765.method204();
                                        class354.field4765.method202();
                                        class354.field4765.method227(arg2, arg6, arg0, arg9);
                                        class18.field241 = false;
                                    }
                                    if (var11.field1596) {
                                        class354.field4765.method235(false);
                                    }
                                    class130.field1957.method1862(-var11.field1628 << 3);
                                    class130.field1957.method1865(var11.field1671 << 3);
                                    class130.field1957.method1869(var11.field1560, var54 + var70 + var11.field1677, var71 - -var11.field1677);
                                    class130.field1957.method1859(var11.field1527 << 3);
                                    if (class217.field3054) {
                                        class354.field4765.method206(var13, var14, var11.field1568 + var13, var14 - -var11.field1577);
                                    }
                                    if (var11.field1615) {
                                        var53.method881(class130.field1957, (class153) null, var11.field1604, 1);
                                    } else {
                                        var53.method896(class130.field1957, (class153) null, 1);
                                    }
                                    if (class217.field3054) {
                                        class354.field4765.method227(arg2, arg6, arg0, arg9);
                                    }
                                    if (var11.field1596) {
                                        class354.field4765.method235(true);
                                    }
                                }
                            } else if (var11.field1666 == 9) {
                                int var72;
                                int var73;
                                int var74;
                                int var75;
                                if (var11.field1668) {
                                    var73 = var14 + var11.field1577;
                                    var72 = var14;
                                    var75 = var13;
                                    var74 = var11.field1568 + var13;
                                } else {
                                    var72 = var14 + var11.field1577;
                                    var73 = var14;
                                    var74 = var11.field1568 + var13;
                                    var75 = var13;
                                }
                                if (var11.field1565 == 1) {
                                    class354.field4765.method250(var75, var73, var74, var72, var11.field1534, 0);
                                } else {
                                    class354.field4765.method198(var75, var73, var74, var72, var11.field1534, var11.field1565, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public static void method994(int arg0) {
        field1994 = null;
        if (arg0 != 13717) {
            field1988 = -66;
        }
        field1991 = null;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V")
    public static final void method995(int arg0) {
        if (arg0 == -22704) {
            class279.field3801.method2530((byte) -102);
            field1987++;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BI)Lp;")
    public static final class447 method996(byte arg0, int arg1) {
        if (arg0 != -19) {
            method994(-107);
        }
        field1989++;
        class408 var2 = class261.field3601;
        class447 var3;
        synchronized (class261.field3601) {
            var3 = (class447) class261.field3601.method2529(0, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class345.field4670.method1926(arg0 ^ 0xFFFFFFED, class215.method1430(arg1, (byte) -87), class408.method2528(arg1, 0));
        class447 var5 = new class447();
        var5.field6323 = arg1;
        if (var4 != null) {
            var5.method2760(110, new class366(var4));
        }
        var5.method2777((byte) -106);
        if (var5.field6283) {
            var5.field6292 = false;
            var5.field6337 = 0;
        }
        if (!class14.field180 && var5.field6265) {
            var5.field6303 = null;
            var5.field6305 = null;
        }
        class408 var6 = class261.field3601;
        synchronized (class261.field3601) {
            class261.field3601.method2527(arg0 + 109, (long) arg1, var5);
            return var5;
        }
    }
}
