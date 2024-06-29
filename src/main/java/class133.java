import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public abstract class class133 {

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "[J")
    private static long[] field1819 = new long[100];

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "[Loea;")
    public static class622[] field1822 = new class622[75];

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Luq;")
    public static class172 field1820;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 4)
    public static void method937(byte arg0) {
        field1822 = null;
        field1819 = null;
        field1820 = null;
        if (arg0 != 4) {
            field1822 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)Z", line = 26)
    public static final boolean method938(int arg0) throws IOException {
        field1821++;
        if (class710.field9707 == null) {
            return false;
        }
        if (class571.field7775 == null) {
            if (class196.field2544) {
                if (!class710.field9707.method133((byte) 77, 1)) {
                    return false;
                }
                class710.field9707.method135((byte) -74, 1, class560.field7678.field3789, 0);
                class23.field234++;
                class535.field7418 = 0;
                class196.field2544 = false;
            }
            class560.field7678.field3725 = 0;
            if (class560.field7678.method2725((byte) -72)) {
                if (!class710.field9707.method133((byte) 77, 1)) {
                    return false;
                }
                class710.field9707.method135((byte) -74, 1, class560.field7678.field3789, 1);
                class535.field7418 = 0;
                class23.field234++;
            }
            class196.field2544 = true;
            class519[] var1 = class384.method2387(-21565);
            int var2 = class560.field7678.method2719((byte) -61);
            if (var2 < 0 || var1.length <= var2) {
                throw new IOException("invo:" + var2 + " ip:" + class560.field7678.field3725);
            }
            class571.field7775 = var1[var2];
            class442.field6366 = class571.field7775.field7223;
        }
        if (class442.field6366 == -1) {
            if (!class710.field9707.method133((byte) 77, 1)) {
                return false;
            }
            class710.field9707.method135((byte) -74, 1, class560.field7678.field3789, 0);
            class442.field6366 = class560.field7678.field3789[0] & 0xFF;
            class535.field7418 = 0;
            class23.field234++;
        }
        if (class442.field6366 == -2) {
            if (!class710.field9707.method133((byte) 77, 2)) {
                return false;
            }
            class710.field9707.method135((byte) -74, 2, class560.field7678.field3789, 0);
            class560.field7678.field3725 = 0;
            class442.field6366 = class560.field7678.method1728((byte) 49);
            class23.field234 += 2;
            class535.field7418 = 0;
        }
        if (class442.field6366 > 0) {
            if (!class710.field9707.method133((byte) 77, class442.field6366)) {
                return false;
            }
            class560.field7678.field3725 = 0;
            class710.field9707.method135((byte) -74, class442.field6366, class560.field7678.field3789, 0);
            class23.field234 += class442.field6366;
            class535.field7418 = 0;
        }
        class230.field2959 = class640.field8614;
        class640.field8614 = class260.field3856;
        class260.field3856 = class571.field7775;
        if (class571.field7775 == class496.field6973) {
            int var3 = class560.field7678.method1724(0);
            int var4 = class560.field7678.method1711(-121);
            int var5 = class560.field7678.method1736(120);
            class149.method1041(true);
            class73 var6 = (class73) class355.field5178.method1248(99, (long) var3);
            if (var6 != null) {
                class314.method2010(var6, var6.field985 != var5, -103, false);
            }
            class371.method2330(var5, -117, var4, var3, false);
            class571.field7775 = null;
            return true;
        } else if (class571.field7775 == class368.field5314) {
            int var7 = class560.field7678.method1673(-32768);
            int var8 = class560.field7678.method1672(-16516);
            int var9 = class560.field7678.method1731((byte) 64);
            String var10 = "";
            String var11 = var10;
            if ((var9 & 0x1) != 0) {
                var10 = class560.field7678.method1699(-119);
                if ((var9 & 0x2) == 0) {
                    var11 = var10;
                } else {
                    var11 = class560.field7678.method1699(-101);
                }
            }
            String var12 = class560.field7678.method1699(-66);
            if (var7 == 99) {
                class280.method1834((byte) 88, var12);
            } else if (var11.equals("") || !client.method2049(var11, false)) {
                class26.method148(var8, var12, -111, var10, var7, var10, var11);
            } else {
                class571.field7775 = null;
                return true;
            }
            class571.field7775 = null;
            return true;
        } else if (class69.field953 == class571.field7775) {
            int var13 = class560.field7678.method1698((byte) 103);
            int var14 = class560.field7678.method1728((byte) 65);
            int var15 = class560.field7678.method1703((byte) 67);
            if (var15 == 65535) {
                var15 = -1;
            }
            int var16 = class560.field7678.method1736(126);
            if (var16 == 65535) {
                var16 = -1;
            }
            class149.method1041(true);
            for (int var17 = var15; var17 <= var16; var17++) {
                long var18 = ((long) var13 << 32) + (long) var17;
                class327 var20 = (class327) class171.field2243.method1248(118, var18);
                class327 var21;
                if (var20 != null) {
                    var21 = new class327(var20.field4635, var14);
                    var20.method1102((byte) 123);
                } else if (var17 == -1) {
                    var21 = new class327(class445.method2655(var13, (byte) 126).field4932.field4635, var14);
                } else {
                    var21 = new class327(0, var14);
                }
                class171.field2243.method1247(4070, var18, var21);
            }
            class571.field7775 = null;
            return true;
        } else if (class571.field7775 == class366.field5269) {
            int var22 = class560.field7678.method1728((byte) 19);
            class758 var23;
            if (class349.field5065 == var22) {
                var23 = class625.field8475;
            } else {
                var23 = class84.field1204[var22];
            }
            if (var23 == null) {
                class571.field7775 = null;
                return true;
            }
            int var24 = class560.field7678.method1728((byte) 68);
            int var25 = class560.field7678.method1731((byte) 64);
            boolean var26 = (var24 & 0x8000) != 0;
            if (var23.field10367 != null && var23.field10355 != null) {
                boolean var27 = false;
                if (var25 <= 1) {
                    if (!var26 && (class564.field7727 && !class405.field5751 || class704.field9640)) {
                        var27 = true;
                    } else if (client.method2049(var23.field10367, false)) {
                        var27 = true;
                    }
                }
                if (!var27 && class99.field1446 == 0) {
                    int var28 = -1;
                    String var29;
                    if (var26) {
                        var24 &= 0x7FFF;
                        class460 var30 = class357.method2264(14442, class560.field7678);
                        var28 = var30.field6559;
                        var29 = var30.field6562.method3674(0, class560.field7678);
                    } else {
                        var29 = class18.method98(false, class310.method2000(class560.field7678, 2510));
                    }
                    var23.field6182 = var29.trim();
                    var23.field6133 = 150;
                    var23.field6137 = var24 & 0xFF;
                    var23.field6123 = var24 >> 8;
                    int var31;
                    if (var25 == 1 || var25 == 2) {
                        var31 = var26 ? 17 : 1;
                    } else {
                        var31 = var26 ? 17 : 2;
                    }
                    if (var25 == 2) {
                        class648.method3598(var28, var29, 0, null, var31, "<img=1>" + var23.method4156((byte) 40, true), -1, "<img=1>" + var23.method4159(0, false), var23.field10354);
                    } else if (var25 == 1) {
                        class648.method3598(var28, var29, 0, null, var31, "<img=0>" + var23.method4156((byte) 40, true), -1, "<img=0>" + var23.method4159(0, false), var23.field10354);
                    } else {
                        class648.method3598(var28, var29, 0, null, var31, var23.method4156((byte) 40, true), -1, var23.method4159(0, false), var23.field10354);
                    }
                }
            }
            class571.field7775 = null;
            return true;
        } else if (class571.field7775 == class306.field4356) {
            int var32 = class560.field7678.method1706(-30);
            if (class148.field1993 != var32) {
                class148.field1993 = var32;
                class727.method4014(class18.field182, -1, -1);
            }
            class571.field7775 = null;
            return true;
        } else if (class571.field7775 == class535.field7405) {
            int var33 = class560.field7678.method1731((byte) 64);
            boolean var34 = (var33 & 0x1) == 1;
            String var35 = class560.field7678.method1699(-120);
            String var36 = class560.field7678.method1699(-88);
            if (var36.equals("")) {
                var36 = var35;
            }
            String var37 = class560.field7678.method1699(-70);
            String var38 = class560.field7678.method1699(-80);
            if (var38.equals("")) {
                var38 = var37;
            }
            if (var34) {
                for (int var39 = 0; var39 < class664.field8915; var39++) {
                    if (class560.field7682[var39].equals(var38)) {
                        class98.field1438[var39] = var35;
                        class560.field7682[var39] = var36;
                        class194.field2533[var39] = var37;
                        class196.field2542[var39] = var38;
                        break;
                    }
                }
            } else {
                class98.field1438[class664.field8915] = var35;
                class560.field7682[class664.field8915] = var36;
                class194.field2533[class664.field8915] = var37;
                class196.field2542[class664.field8915] = var38;
                class100.field1456[class664.field8915] = class519.method3018(var33, 2) == 2;
                class664.field8915++;
            }
            class462.field6564 = class701.field9280;
            class571.field7775 = null;
            return true;
        } else if (class571.field7775 == class443.field6372) {
            int var40 = class560.field7678.method1711(-121);
            int var41 = class560.field7678.method1676(255);
            int var42 = class560.field7678.method1731((byte) 64);
            int var43 = class560.field7678.method1691(114);
            int var44 = class560.field7678.method1703((byte) 77);
            class149.method1041(true);
            class422.field6068[var41] = true;
            class197.field2554[var41] = var43;
            class572.field7795[var41] = var40;
            class333.field4718[var41] = var42;
            class234.field3114[var41] = var44;
            class571.field7775 = null;
            return true;
        } else if (class571.field7775 == class504.field7089) {
            int var45 = class560.field7678.method1728((byte) 31);
            int var46 = class560.field7678.method1728((byte) 47);
            int var47 = class560.field7678.method1728((byte) 86);
            class149.method1041(true);
            if (class419.field6032[var45] != null) {
                for (int var48 = var46; var48 < var47; var48++) {
                    int var49 = class560.field7678.method1722(false);
                    if (class419.field6032[var45].length > var48 && class419.field6032[var45][var48] != null) {
                        class419.field6032[var45][var48].field4883 = var49;
                    }
                }
            }
            class571.field7775 = null;
            return true;
        } else if (class571.field7775 == class173.field2294) {
            int var50 = class560.field7678.method1728((byte) 8);
            int var51 = class560.field7678.method1672(-16516);
            int var52 = class560.field7678.method1711(-127);
            int var53 = class560.field7678.method1736(-66);
            int var54 = class560.field7678.method1736(127);
            int var55 = class560.field7678.method1731((byte) 64);
            int var56 = var52 & 0x7;
            int var57 = (var52 & 0x7A) >> 3;
            if (var57 == 15) {
                var57 = -1;
            }
            if (var51 >> 30 != 0) {
                int var58 = var51 >> 28 & 0x3;
                int var59 = (var51 >> 14 & 0x3FFF) - class120.field1625;
                int var60 = (var51 & 0x3FFF) - class259.field3849;
                if (var59 >= 0 && var60 >= 0 && class102.field1467 > var59 && class393.field5663 > var60) {
                    int var61 = var59 * 512 + 256;
                    int var62 = var60 * 512 + 256;
                    int var63 = var58;
                    if (var58 < 3 && class49.method310(var59, var60, (byte) 123)) {
                        var63 = var58 + 1;
                    }
                    class655 var64 = new class655(var50, var54, class572.field7788, var58, var63, var61, class778.method4273(var62, (byte) -124, var61, var58) - var53, var62, var59, var59, var60, var60, var56);
                    class625.field8473.method689(new class377(var64), -31);
                }
            } else if ((var51 >> 29) != 0) {
                int var79 = var51 & 0xFFFF;
                class316 var80 = (class316) class176.field2326.method1248(123, (long) var79);
                if (var80 != null) {
                    class22 var81 = var80.field4455;
                    if (var50 == 65535) {
                        var50 = -1;
                    }
                    class114 var82 = var81.field6110[var55];
                    boolean var83 = true;
                    int var84 = var82.field1549;
                    if (var50 != -1 && var84 != -1) {
                        if (var50 == var84) {
                            class573 var89 = class641.field8643.method918(var50, 64);
                            if (var89.field7801 && var89.field7819 != -1) {
                                class317 var90 = class693.field9223.method2388(var89.field7819, 0);
                                int var91 = var90.field4487;
                                if (var91 == 0 || var91 == 2) {
                                    var83 = false;
                                } else if (var91 == 1) {
                                    var83 = true;
                                }
                            }
                        } else {
                            class573 var85 = class641.field8643.method918(var50, 64);
                            class573 var86 = class641.field8643.method918(var84, 64);
                            if (var85.field7819 != -1 && var86.field7819 != -1) {
                                class317 var87 = class693.field9223.method2388(var85.field7819, 0);
                                class317 var88 = class693.field9223.method2388(var86.field7819, 0);
                                if (var87.field4466 < var88.field4466) {
                                    var83 = false;
                                }
                            }
                        }
                    }
                    if (var83) {
                        var82.field1545 = 0;
                        var82.field1550 = var56;
                        var82.field1555 = 1;
                        var82.field1549 = var50;
                        var82.field1554 = var57;
                        var82.field1552 = class572.field7788 + var54;
                        var82.field1551 = 0;
                        var82.field1546 = var53;
                        if (var82.field1552 > class572.field7788) {
                            var82.field1545 = -1;
                        }
                        if (var82.field1549 == 65535) {
                            var82.field1549 = -1;
                        }
                        if (var82.field1549 != -1 && class572.field7788 == var82.field1552) {
                            int var92 = class641.field8643.method918(var82.field1549, 64).field7819;
                            if (var92 != -1) {
                                class317 var93 = class693.field9223.method2388(var92, 0);
                                if (var93 != null && var93.field4493 != null && !var81.field6135) {
                                    class627.method3466(var81, var93, -29701, 0);
                                }
                            }
                        }
                    }
                }
            } else if ((var51 >> 28) != 0) {
                int var65 = var51 & 0xFFFF;
                class758 var66;
                if (class349.field5065 == var65) {
                    var66 = class625.field8475;
                } else {
                    var66 = class84.field1204[var65];
                }
                if (var66 != null) {
                    if (var50 == 65535) {
                        var50 = -1;
                    }
                    class114 var67 = var66.field6110[var55];
                    boolean var68 = true;
                    int var69 = var67.field1549;
                    if (var50 != -1 && var69 != -1) {
                        if (var50 == var69) {
                            class573 var74 = class641.field8643.method918(var50, 64);
                            if (var74.field7801 && var74.field7819 != -1) {
                                class317 var75 = class693.field9223.method2388(var74.field7819, 0);
                                int var76 = var75.field4487;
                                if (var76 == 0 || var76 == 2) {
                                    var68 = false;
                                } else if (var76 == 1) {
                                    var68 = true;
                                }
                            }
                        } else {
                            class573 var70 = class641.field8643.method918(var50, 64);
                            class573 var71 = class641.field8643.method918(var69, 64);
                            if (var70.field7819 != -1 && var71.field7819 != -1) {
                                class317 var72 = class693.field9223.method2388(var70.field7819, 0);
                                class317 var73 = class693.field9223.method2388(var71.field7819, 0);
                                if (var72.field4466 < var73.field4466) {
                                    var68 = false;
                                }
                            }
                        }
                    }
                    if (var68) {
                        var67.field1545 = 0;
                        var67.field1546 = var53;
                        var67.field1549 = var50;
                        var67.field1551 = 0;
                        var67.field1555 = 1;
                        var67.field1554 = var57;
                        var67.field1552 = class572.field7788 + var54;
                        var67.field1550 = var56;
                        if (var67.field1549 == 65535) {
                            var67.field1549 = -1;
                        }
                        if (var67.field1552 > class572.field7788) {
                            var67.field1545 = -1;
                        }
                        if (var67.field1549 != -1 && class572.field7788 == var67.field1552) {
                            int var77 = class641.field8643.method918(var67.field1549, 64).field7819;
                            if (var77 != -1) {
                                class317 var78 = class693.field9223.method2388(var77, 0);
                                if (var78 != null && var78.field4493 != null && !var66.field6135) {
                                    class627.method3466(var66, var78, -29701, 0);
                                }
                            }
                        }
                    }
                }
            }
            class571.field7775 = null;
            return true;
        } else if (class618.field8356 == class571.field7775) {
            class143.method994(class560.field7678.method1699(-92), (byte) -71);
            class571.field7775 = null;
            return true;
        } else if (class64.field821 == class571.field7775) {
            if (class227.field2935 != -1) {
                class208.method1359(-13540, class227.field2935, 0);
            }
            class571.field7775 = null;
            return true;
        } else if (class623.field8408 == class571.field7775) {
            String var94 = class560.field7678.method1699(-86);
            int var95 = class560.field7678.method1724(0);
            class149.method1041(true);
            class521.method3029((byte) 124, var95, var94);
            class571.field7775 = null;
            return true;
        } else if (class571.field7775 == class181.field2374) {
            int var96 = class560.field7678.method1672(-16516);
            int var97 = class560.field7678.method1712(0);
            class149.method1041(true);
            class389.method2407(var96, 78, var97);
            class571.field7775 = null;
            return true;
        } else if (class571.field7775 == class532.field7392) {
            class765.method4208(305, class751.field10146);
            class571.field7775 = null;
            return true;
        } else if (class571.field7775 == class122.field1689) {
            class192.method1270((byte) 106);
            class571.field7775 = null;
            return false;
        } else {
            int var98 = -106 / ((66 - arg0) / 32);
            if (class571.field7775 == class563.field7715) {
                class247.field3227 = class560.field7678.method1695(423951304);
                class183.field2411 = class701.field9280;
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class363.field5251) {
                int var99 = class560.field7678.method1712(0);
                byte var100 = class560.field7678.method1687(-128);
                class480.field6740.method4230(var100, -103, var99);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class251.field3674) {
                int var101 = class560.field7678.method1712(0);
                if (var101 == 65535) {
                    var101 = -1;
                }
                int var102 = class560.field7678.method1728((byte) 42);
                if (var102 == 65535) {
                    var102 = -1;
                }
                int var103 = class560.field7678.method1724(0);
                int var104 = class560.field7678.method1672(-16516);
                class149.method1041(true);
                for (int var105 = var102; var105 <= var101; var105++) {
                    long var106 = ((long) var104 << 32) + (long) var105;
                    class327 var108 = (class327) class171.field2243.method1248(92, var106);
                    class327 var109;
                    if (var108 != null) {
                        var109 = new class327(var103, var108.field4640);
                        var108.method1102((byte) 118);
                    } else if (var105 == -1) {
                        var109 = new class327(var103, class445.method2655(var104, (byte) 112).field4932.field4640);
                    } else {
                        var109 = new class327(var103, -1);
                    }
                    class171.field2243.method1247(4070, var106, var109);
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class271.field3949) {
                String var110 = class560.field7678.method1699(-104);
                int var111 = class560.field7678.method1736(-58);
                class149.method1041(true);
                class342.method2176(var111, var110, 90);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class246.field3211) {
                int var112 = class560.field7678.method1712(0);
                int var113 = class560.field7678.method1676(255);
                boolean var114 = (var113 & 0x1) == 1;
                class464.method2735(7627, var114, var112);
                class573.field7813[class519.method3018(class79.field1086++, 31)] = var112;
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class451.field6472) {
                class359.field5225 = class560.field7678.method1737(true) << 3;
                class697.field9245 = class560.field7678.method1711(-120);
                class282.field4080 = class560.field7678.method1683(-32070) << 3;
                class571.field7775 = null;
                return true;
            } else if (class610.field8246 == class571.field7775) {
                int var115 = class560.field7678.method1672(-16516);
                int var116 = class560.field7678.method1728((byte) 22);
                int var117 = class560.field7678.method1731((byte) 64);
                int var118 = class560.field7678.method1736(-67);
                class149.method1041(true);
                class597.method3342((byte) -93, var115, var117, var118, var116);
                class571.field7775 = null;
                return true;
            } else if (class651.field8772 == class571.field7775) {
                boolean var119 = class560.field7678.method1731((byte) 64) == 1;
                String var120 = class560.field7678.method1699(-102);
                String var121 = var120;
                if (var119) {
                    var121 = class560.field7678.method1699(-123);
                }
                long var122 = (long) class560.field7678.method1728((byte) 41);
                long var124 = (long) class560.field7678.method1722(false);
                int var126 = class560.field7678.method1731((byte) 64);
                int var127 = class560.field7678.method1728((byte) 5);
                long var128 = (var122 << 32) + var124;
                boolean var130 = false;
                int var131 = 0;
                while (true) {
                    if (var131 >= 100) {
                        if (var126 <= 1 && client.method2049(var121, false)) {
                            var130 = true;
                        }
                        break;
                    }
                    if (field1819[var131] == var128) {
                        var130 = true;
                        break;
                    }
                    var131++;
                }
                if (!var130 && class99.field1446 == 0) {
                    field1819[class625.field8478] = var128;
                    class625.field8478 = (class625.field8478 + 1) % 100;
                    String var132 = class749.field10088.method3391(var127, 44).method3674(0, class560.field7678);
                    if (var126 == 2) {
                        class648.method3598(var127, var132, 0, null, 18, "<img=1>" + var120, -1, "<img=1>" + var121, var120);
                    } else if (var126 == 1) {
                        class648.method3598(var127, var132, 0, null, 18, "<img=0>" + var120, -1, "<img=0>" + var121, var120);
                    } else {
                        class648.method3598(var127, var132, 0, null, 18, var120, -1, var121, var120);
                    }
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class551.field7601) {
                boolean var133 = class560.field7678.method1731((byte) 64) == 1;
                String var134 = class560.field7678.method1699(-100);
                String var135 = var134;
                if (var133) {
                    var135 = class560.field7678.method1699(-123);
                }
                int var136 = class560.field7678.method1731((byte) 64);
                boolean var137 = false;
                if (var136 <= 1) {
                    if (!(!class564.field7727 || class405.field5751) || class704.field9640) {
                        var137 = true;
                    } else if (var136 <= 1 && client.method2049(var135, false)) {
                        var137 = true;
                    }
                }
                if (!var137 && class99.field1446 == 0) {
                    String var138 = class18.method98(false, class310.method2000(class560.field7678, 2510));
                    if (var136 == 2) {
                        class648.method3598(-1, var138, 0, null, 24, "<img=1>" + var134, -1, "<img=1>" + var135, var134);
                    } else if (var136 == 1) {
                        class648.method3598(-1, var138, 0, null, 24, "<img=0>" + var134, -1, "<img=0>" + var135, var134);
                    } else {
                        class648.method3598(-1, var138, 0, null, 24, var134, -1, var135, var134);
                    }
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class43.field460) {
                class765.method4208(305, class351.field5111);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class497.field6987) {
                int var139 = class560.field7678.method1672(-16516);
                int var140 = class560.field7678.method1712(0);
                if (var140 == 65535) {
                    var140 = -1;
                }
                int var141 = class560.field7678.method1698((byte) 112);
                class149.method1041(true);
                class507.method2948(0, var140, var139, var141);
                class369 var142 = class16.field156.method2121(var140, 25928);
                class724.method3999(var139, var142.field5380, true, var142.field5334, var142.field5385);
                class511.method2985(var142.field5356, var139, var142.field5393, (byte) 114, var142.field5396);
                class571.field7775 = null;
                return true;
            } else if (class609.field8236 == class571.field7775) {
                class664.field8915 = class560.field7678.method1731((byte) 64);
                for (int var143 = 0; var143 < class664.field8915; var143++) {
                    class98.field1438[var143] = class560.field7678.method1699(-89);
                    class560.field7682[var143] = class560.field7678.method1699(-99);
                    if (class560.field7682[var143].equals("")) {
                        class560.field7682[var143] = class98.field1438[var143];
                    }
                    class194.field2533[var143] = class560.field7678.method1699(-98);
                    class196.field2542[var143] = class560.field7678.method1699(-77);
                    if (class196.field2542[var143].equals("")) {
                        class196.field2542[var143] = class194.field2533[var143];
                    }
                    class100.field1456[var143] = false;
                }
                class571.field7775 = null;
                class462.field6564 = class701.field9280;
                return true;
            } else if (class571.field7775 == class433.field6249) {
                int var144 = class560.field7678.method1712(0);
                class149.method1041(true);
                class384.method2389(0, var144);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class554.field7644) {
                class89.field1264 = class701.field9280;
                boolean var145 = class560.field7678.method1731((byte) 64) == 1;
                class361 var146 = new class361(class560.field7678);
                class95 var147;
                if (var145) {
                    var147 = class43.field463;
                } else {
                    var147 = class551.field7606;
                }
                var146.method2289(var147, 12345678);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class545.field7531) {
                class726.method4002(class442.field6366, class560.field7678, 0);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class480.field6747) {
                int var148 = class560.field7678.method1721((byte) 2);
                int var149 = class560.field7678.method1672(-16516);
                class149.method1041(true);
                class733.method4041(var148, (byte) -126, var149);
                class571.field7775 = null;
                return true;
            } else if (class760.field10446 == class571.field7775) {
                class317.field4468 = class701.field9280;
                if (class442.field6366 == 0) {
                    class571.field7775 = null;
                    class245.field3209 = null;
                    class86.field1213 = null;
                    class199.field2588 = 0;
                    class320.field4543 = null;
                    return true;
                }
                class320.field4543 = class560.field7678.method1699(-97);
                boolean var150 = class560.field7678.method1731((byte) 64) == 1;
                if (var150) {
                    class560.field7678.method1699(-72);
                }
                long var151 = class560.field7678.method1723(21795);
                class86.field1213 = class404.method2444(72, var151);
                class87.field1223 = class560.field7678.method1737(true);
                int var153 = class560.field7678.method1731((byte) 64);
                if (var153 == 255) {
                    class571.field7775 = null;
                    return true;
                }
                class199.field2588 = var153;
                class124[] var154 = new class124[100];
                for (int var155 = 0; var155 < class199.field2588; var155++) {
                    var154[var155] = new class124();
                    var154[var155].field1710 = class560.field7678.method1699(-108);
                    boolean var161 = class560.field7678.method1731((byte) 64) == 1;
                    if (var161) {
                        var154[var155].field1713 = class560.field7678.method1699(-73);
                    } else {
                        var154[var155].field1713 = var154[var155].field1710;
                    }
                    var154[var155].field1715 = class703.method3895(var154[var155].field1713, (byte) -84);
                    var154[var155].field1714 = class560.field7678.method1728((byte) 12);
                    var154[var155].field1718 = class560.field7678.method1737(true);
                    var154[var155].field1709 = class560.field7678.method1699(-85);
                    if (var154[var155].field1713.equals(class625.field8475.field10367)) {
                        class568.field7755 = var154[var155].field1718;
                    }
                }
                boolean var156 = false;
                int var157 = class199.field2588;
                while (var157 > 0) {
                    boolean var158 = true;
                    var157--;
                    for (int var159 = 0; var159 < var157; var159++) {
                        if (var154[var159].field1715.compareTo(var154[var159 + 1].field1715) > 0) {
                            class124 var160 = var154[var159];
                            var154[var159] = var154[var159 + 1];
                            var158 = false;
                            var154[var159 + 1] = var160;
                        }
                    }
                    if (var158) {
                        break;
                    }
                }
                class245.field3209 = var154;
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class433.field6259) {
                boolean var162 = class560.field7678.method1731((byte) 64) == 1;
                String var163 = class560.field7678.method1699(-95);
                String var164 = var163;
                if (var162) {
                    var164 = class560.field7678.method1699(-109);
                }
                int var165 = class560.field7678.method1731((byte) 64);
                int var166 = class560.field7678.method1728((byte) 39);
                boolean var167 = false;
                if (var165 <= 1 && client.method2049(var164, false)) {
                    var167 = true;
                }
                if (!var167 && class99.field1446 == 0) {
                    String var168 = class749.field10088.method3391(var166, 52).method3674(0, class560.field7678);
                    if (var165 == 2) {
                        class648.method3598(var166, var168, 0, null, 25, "<img=1>" + var163, -1, "<img=1>" + var164, var163);
                    } else if (var165 == 1) {
                        class648.method3598(var166, var168, 0, null, 25, "<img=0>" + var163, -1, "<img=0>" + var164, var163);
                    } else {
                        class648.method3598(var166, var168, 0, null, 25, var163, -1, var164, var163);
                    }
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class282.field4076) {
                class7.field60 = class560.field7678.method1711(-116) == 1;
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class494.field6952) {
                class391.method2415(true);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class422.field6060) {
                int var169 = class560.field7678.method1703((byte) 101);
                int var170 = class560.field7678.method1706(-117);
                class149.method1041(true);
                class573.method3253(var170, -3, var169);
                class571.field7775 = null;
                return true;
            } else if (class66.field916 == class571.field7775) {
                while (class560.field7678.field3725 < class442.field6366) {
                    boolean var181 = class560.field7678.method1731((byte) 64) == 1;
                    String var182 = class560.field7678.method1699(-75);
                    String var183 = class560.field7678.method1699(-98);
                    int var184 = class560.field7678.method1728((byte) 31);
                    int var185 = class560.field7678.method1731((byte) 64);
                    String var186 = "";
                    boolean var187 = false;
                    if (var184 > 0) {
                        var186 = class560.field7678.method1699(-124);
                        var187 = class560.field7678.method1731((byte) 64) == 1;
                    }
                    for (int var188 = 0; var188 < class525.field7289; var188++) {
                        if (var181) {
                            if (var183.equals(class316.field4458[var188])) {
                                class316.field4458[var188] = var182;
                                var182 = null;
                                class758.field10398[var188] = var183;
                                break;
                            }
                        } else if (var182.equals(class316.field4458[var188])) {
                            if (class565.field7737[var188] != var184) {
                                boolean var189 = true;
                                for (class399 var190 = (class399) class328.field4653.method2189((byte) 91); var190 != null; var190 = (class399) class328.field4653.method2192(0)) {
                                    if (var190.field5710.equals(var182)) {
                                        if (var184 != 0 && var190.field5712 == 0) {
                                            var190.method3310(30305);
                                            var189 = false;
                                        } else if (var184 == 0 && var190.field5712 != 0) {
                                            var189 = false;
                                            var190.method3310(30305);
                                        }
                                    }
                                }
                                if (var189) {
                                    class328.field4653.method2188((byte) 31, new class399(var182, var184));
                                }
                                class565.field7737[var188] = var184;
                            }
                            class758.field10398[var188] = var183;
                            class246.field3216[var188] = var186;
                            class235.field3133[var188] = var185;
                            class666.field8921[var188] = var187;
                            var182 = null;
                            break;
                        }
                    }
                    if (var182 != null && class525.field7289 < 200) {
                        class316.field4458[class525.field7289] = var182;
                        class758.field10398[class525.field7289] = var183;
                        class565.field7737[class525.field7289] = var184;
                        class246.field3216[class525.field7289] = var186;
                        class235.field3133[class525.field7289] = var185;
                        class666.field8921[class525.field7289] = var187;
                        class525.field7289++;
                    }
                }
                class462.field6564 = class701.field9280;
                class26.field261 = 2;
                boolean var171 = false;
                int var172 = class525.field7289;
                while (var172 > 0) {
                    var172--;
                    boolean var173 = true;
                    for (int var174 = 0; var174 < var172; var174++) {
                        if (class565.field7737[var174] != class102.field1464.field9099 && class565.field7737[var174 + 1] == class102.field1464.field9099 || class565.field7737[var174] == 0 && class565.field7737[var174 + 1] != 0) {
                            int var175 = class565.field7737[var174];
                            class565.field7737[var174] = class565.field7737[var174 + 1];
                            class565.field7737[var174 + 1] = var175;
                            String var176 = class246.field3216[var174];
                            class246.field3216[var174] = class246.field3216[var174 + 1];
                            class246.field3216[var174 + 1] = var176;
                            String var177 = class316.field4458[var174];
                            class316.field4458[var174] = class316.field4458[var174 + 1];
                            class316.field4458[var174 + 1] = var177;
                            String var178 = class758.field10398[var174];
                            class758.field10398[var174] = class758.field10398[var174 + 1];
                            class758.field10398[var174 + 1] = var178;
                            int var179 = class235.field3133[var174];
                            class235.field3133[var174] = class235.field3133[var174 + 1];
                            class235.field3133[var174 + 1] = var179;
                            boolean var180 = class666.field8921[var174];
                            class666.field8921[var174] = class666.field8921[var174 + 1];
                            class666.field8921[var174 + 1] = var180;
                            var173 = false;
                        }
                    }
                    if (var173) {
                        break;
                    }
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class561.field7685) {
                int var191 = class560.field7678.method1736(126) << 2;
                int var192 = class560.field7678.method1691(87);
                int var193 = class560.field7678.method1691(106);
                int var194 = class560.field7678.method1676(255);
                int var195 = class560.field7678.method1731((byte) 64);
                class149.method1041(true);
                class545.method3142(var192, var191, var193, true, var195, var194, (byte) 88);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class441.field6351) {
                int var196 = class560.field7678.method1711(-121);
                int var197 = class560.field7678.method1731((byte) 64);
                if (var197 == 255) {
                    var196 = -1;
                    var197 = -1;
                }
                class122.method879(0, var197, var196);
                class571.field7775 = null;
                return true;
            } else if (class635.field8575 == class571.field7775) {
                class765.method4208(305, class302.field4243);
                class571.field7775 = null;
                return true;
            } else if (class575.field7840 == class571.field7775) {
                boolean var198 = class560.field7678.method1731((byte) 64) == 1;
                String var199 = class560.field7678.method1699(-125);
                long var200 = (long) class560.field7678.method1728((byte) 10);
                long var202 = (long) class560.field7678.method1722(false);
                int var204 = class560.field7678.method1731((byte) 64);
                long var205 = (var200 << 32) + var202;
                boolean var207 = false;
                Object var208 = null;
                class551 var209 = var198 ? class747.field10081 : class182.field2393;
                if (var209 == null) {
                    var207 = true;
                } else {
                    label2142: {
                        for (int var210 = 0; var210 < 100; var210++) {
                            if (field1819[var210] == var205) {
                                var207 = true;
                                break label2142;
                            }
                        }
                        if (var204 <= 1) {
                            if (!(!class564.field7727 || class405.field5751) || class704.field9640) {
                                var207 = true;
                            } else if (client.method2049(var199, false)) {
                                var207 = true;
                            }
                        }
                    }
                }
                if (!var207 && class99.field1446 == 0) {
                    field1819[class625.field8478] = var205;
                    class625.field8478 = (class625.field8478 + 1) % 100;
                    String var211 = class18.method98(false, class310.method2000(class560.field7678, 2510));
                    int var212 = var198 ? 41 : 44;
                    if (var204 == 2 || var204 == 3) {
                        class648.method3598(-1, var211, 0, var209.field7604, var212, "<img=1>" + var199, -1, "<img=1>" + var199, var199);
                    } else if (var204 == 1) {
                        class648.method3598(-1, var211, 0, var209.field7604, var212, "<img=0>" + var199, -1, "<img=0>" + var199, var199);
                    } else {
                        class648.method3598(-1, var211, 0, var209.field7604, var212, var199, -1, var199, var199);
                    }
                }
                class571.field7775 = null;
                return true;
            } else if (class734.field9950 == class571.field7775) {
                class480.field6740.method4234((byte) -71);
                class571.field7775 = null;
                class588.field8010 += 32;
                return true;
            } else if (class571.field7775 == class415.field5991) {
                class571.field7775 = null;
                return false;
            } else if (class711.field9719 == class571.field7775) {
                int var213 = class560.field7678.method1703((byte) 99);
                int var214 = class560.field7678.method1728((byte) 9);
                class149.method1041(true);
                class228.method1445(3, var213, var214, 0);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class42.field452) {
                class388.method2403(22447);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class222.field2882) {
                class765.method4208(305, class524.field7271);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class453.field6499) {
                String var215 = class560.field7678.method1699(-110);
                Object[] var216 = new Object[var215.length() + 1];
                for (int var217 = var215.length() - 1; var217 >= 0; var217--) {
                    if (var215.charAt(var217) == 's') {
                        var216[var217 + 1] = class560.field7678.method1699(-97);
                    } else {
                        var216[var217 + 1] = Integer.valueOf(class560.field7678.method1672(-16516));
                    }
                }
                var216[0] = Integer.valueOf(class560.field7678.method1672(-16516));
                class149.method1041(true);
                class158 var218 = new class158();
                var218.field2128 = var216;
                class727.method4005(var218);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class164.field2196) {
                class765.method4208(305, class455.field6513);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class123.field1703) {
                class346.field4861 = class701.field9280;
                boolean var219 = class560.field7678.method1731((byte) 64) == 1;
                class353 var220 = new class353(class560.field7678);
                class551 var221;
                if (var219) {
                    var221 = class747.field10081;
                } else {
                    var221 = class182.field2393;
                }
                var220.method2245(var221, 3);
                class571.field7775 = null;
                return true;
            } else if (class605.field8199 == class571.field7775) {
                int var222 = class560.field7678.method1724(0);
                class149.method1041(true);
                class608.method3387(class349.field5065, (byte) 98, var222, 5, 0);
                class571.field7775 = null;
                return true;
            } else if (class702.field9297 == class571.field7775) {
                int var223 = class560.field7678.method1672(-16516);
                int var224 = class560.field7678.method1672(-16516);
                class149.method1041(true);
                class73 var225 = (class73) class355.field5178.method1248(110, (long) var224);
                class73 var226 = (class73) class355.field5178.method1248(123, (long) var223);
                if (var226 != null) {
                    class314.method2010(var226, var225 == null || var225.field985 != var226.field985, 85, false);
                }
                if (var225 != null) {
                    var225.method1102((byte) 75);
                    class355.field5178.method1247(4070, (long) var223, var225);
                }
                class347 var227 = class445.method2655(var224, (byte) 125);
                if (var227 != null) {
                    class151.method1062((byte) -108, var227);
                }
                class347 var228 = class445.method2655(var223, (byte) 119);
                if (var228 != null) {
                    class151.method1062((byte) -127, var228);
                    class104.method799(true, var228, -1);
                }
                if (class227.field2935 != -1) {
                    class208.method1359(-13540, class227.field2935, 1);
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class382.field5557) {
                class765.method4208(305, class213.field2798);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class386.field5612) {
                String var229 = class560.field7678.method1699(-94);
                int var230 = class560.field7678.method1703((byte) 68);
                if (var230 == 65535) {
                    var230 = -1;
                }
                int var231 = class560.field7678.method1676(255);
                int var232 = class560.field7678.method1676(255);
                if (var231 >= 1 && var231 <= 8) {
                    if (var229.equalsIgnoreCase("null")) {
                        var229 = null;
                    }
                    class300.field4234[var231 - 1] = var229;
                    class252.field3683[var231 - 1] = var230;
                    class160.field2152[var231 - 1] = var232 == 0;
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class358.field5211) {
                int var233 = class560.field7678.method1728((byte) 57);
                String var234 = class560.field7678.method1699(-69);
                class149.method1041(true);
                class342.method2176(var233, var234, 101);
                class571.field7775 = null;
                return true;
            } else if (class592.field8089 == class571.field7775) {
                int var235 = class560.field7678.method1728((byte) 53);
                int var236 = class560.field7678.method1731((byte) 64);
                boolean var237 = (var236 & 0x1) == 1;
                class302.method1952(var237, (byte) 123, var235);
                int var238 = class560.field7678.method1728((byte) 66);
                for (int var239 = 0; var239 < var238; var239++) {
                    int var240 = class560.field7678.method1676(255);
                    if (var240 == 255) {
                        var240 = class560.field7678.method1724(0);
                    }
                    int var241 = class560.field7678.method1712(0);
                    class178.method1217(var237, var240, var241 - 1, var235, var239, 32753);
                }
                class573.field7813[class519.method3018(31, class79.field1086++)] = var235;
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class323.field4587) {
                int var242 = class560.field7678.method1698((byte) 127);
                int var243 = class560.field7678.method1728((byte) 82);
                class149.method1041(true);
                if (var243 == 65535) {
                    var243 = -1;
                }
                class608.method3387(var243, (byte) -100, var242, 2, -1);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class318.field4522) {
                class87.method696(false, -113);
                class571.field7775 = null;
                return false;
            } else if (class734.field9955 == class571.field7775) {
                class765.method4208(305, class557.field7657);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class548.field7568) {
                class384.field5580 = class442.field6366 > 2 ? class560.field7678.method1699(-126) : class58.field723.method365(class55.field647, (byte) 83);
                class333.field4717 = class442.field6366 <= 0 ? -1 : class560.field7678.method1728((byte) 68);
                class571.field7775 = null;
                if (class333.field4717 == 65535) {
                    class333.field4717 = -1;
                }
                return true;
            } else if (class571.field7775 == class176.field2324) {
                int var244 = class560.field7678.method1706(-76);
                int var245 = class560.field7678.method1672(-16516);
                int var246 = class560.field7678.method1736(-118);
                class149.method1041(true);
                class608.method3387(var246, (byte) -108, var244, 5, var245);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class168.field2214) {
                String var247 = class560.field7678.method1699(-71);
                String var248 = class18.method98(false, class310.method2000(class560.field7678, 2510));
                class26.method148(0, var248, -92, var247, 6, var247, var247);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class459.field6547) {
                class701.field9288 = class560.field7678.method1731((byte) 64);
                class571.field7775 = null;
                class183.field2411 = class701.field9280;
                return true;
            } else if (class571.field7775 == class227.field2934) {
                if (class586.method3297(true, class780.field10712)) {
                    class73.field989 = (int) ((float) class560.field7678.method1728((byte) 100) * 2.5F);
                } else {
                    class73.field989 = class560.field7678.method1728((byte) 30) * 30;
                }
                class571.field7775 = null;
                class183.field2411 = class701.field9280;
                return true;
            } else if (class571.field7775 == class24.field239) {
                int var249 = class560.field7678.method1703((byte) 94);
                if (var249 == 65535) {
                    var249 = -1;
                }
                int var250 = class560.field7678.method1676(255);
                int var251 = var250 >> 2;
                int var252 = var250 & 0x3;
                int var253 = class559.field7671[var251];
                int var254 = class560.field7678.method1672(-16516);
                int var255 = var254 >> 28 & 0x3;
                int var256 = (var254 & 0xFFFE969) >> 14;
                int var257 = var256 - class120.field1625;
                int var258 = var254 & 0x3FFF;
                int var259 = var258 - class259.field3849;
                class502.method2934(var251, var252, var257, var255, false, var259, var253, var249);
                class571.field7775 = null;
                return true;
            } else if (class578.field7882 == class571.field7775) {
                class87.method696(class300.field4231, -72);
                class571.field7775 = null;
                return false;
            } else if (class571.field7775 == class257.field3831) {
                int var260 = class560.field7678.method1736(-45);
                int var261 = class560.field7678.method1731((byte) 64);
                class149.method1041(true);
                if (var261 == 2) {
                    class346.method2200(11);
                }
                class227.field2935 = var260;
                class305.method1974(var260, (byte) -107);
                class336.method2157(78, false);
                class727.method4007(class227.field2935);
                for (int var262 = 0; var262 < 100; var262++) {
                    class753.field10199[var262] = true;
                }
                class571.field7775 = null;
                return true;
            } else if (class625.field8469 == class571.field7775) {
                int var263 = class560.field7678.method1724(0);
                int var264 = class560.field7678.method1712(0);
                class480.field6740.method4230(var263, -101, var264);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class2.field13) {
                class149.method1041(true);
                class122.method877((byte) 102);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class173.field2289) {
                int var265 = class560.field7678.method1728((byte) 120);
                if (var265 == 65535) {
                    var265 = -1;
                }
                int var266 = class560.field7678.method1731((byte) 64);
                int var267 = class560.field7678.method1728((byte) 18);
                int var268 = class560.field7678.method1731((byte) 64);
                int var269 = class560.field7678.method1728((byte) 16);
                class449.method2673(var265, var267, var268, var269, 2003865932, var266);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class315.field4436) {
                int var270 = class560.field7678.method1731((byte) 64);
                if (class560.field7678.method1731((byte) 64) == 0) {
                    class652.field8790[var270] = new class514();
                } else {
                    class560.field7678.field3725--;
                    class652.field8790[var270] = new class514(class560.field7678);
                }
                class494.field6967 = class701.field9280;
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class128.field1763) {
                int var271 = class560.field7678.method1724(0);
                int var272 = class560.field7678.method1712(0);
                if (var272 == 65535) {
                    var272 = -1;
                }
                class149.method1041(true);
                class608.method3387(var272, (byte) -116, var271, 1, -1);
                class571.field7775 = null;
                return true;
            } else if (class643.field8654 == class571.field7775) {
                boolean var273 = class560.field7678.method1731((byte) 64) == 1;
                String var274 = class560.field7678.method1699(-87);
                String var275 = var274;
                if (var273) {
                    var275 = class560.field7678.method1699(-63);
                }
                long var276 = (long) class560.field7678.method1728((byte) 103);
                long var278 = (long) class560.field7678.method1722(false);
                int var280 = class560.field7678.method1731((byte) 64);
                long var281 = (var276 << 32) + var278;
                boolean var283 = false;
                int var284 = 0;
                while (true) {
                    if (var284 >= 100) {
                        if (var280 <= 1) {
                            if (!(!class564.field7727 || class405.field5751) || class704.field9640) {
                                var283 = true;
                            } else if (client.method2049(var275, false)) {
                                var283 = true;
                            }
                        }
                        break;
                    }
                    if (field1819[var284] == var281) {
                        var283 = true;
                        break;
                    }
                    var284++;
                }
                if (!var283 && class99.field1446 == 0) {
                    field1819[class625.field8478] = var281;
                    class625.field8478 = (class625.field8478 + 1) % 100;
                    String var285 = class18.method98(false, class310.method2000(class560.field7678, 2510));
                    if (var280 == 2) {
                        class648.method3598(-1, var285, 0, null, 7, "<img=1>" + var274, -1, "<img=1>" + var275, var274);
                    } else if (var280 == 1) {
                        class648.method3598(-1, var285, 0, null, 7, "<img=0>" + var274, -1, "<img=0>" + var275, var274);
                    } else {
                        class648.method3598(-1, var285, 0, null, 3, var274, -1, var275, var274);
                    }
                }
                class571.field7775 = null;
                return true;
            } else if (class575.field7835 == class571.field7775) {
                class765.method4208(305, class116.field1561);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class366.field5277) {
                class445.field6412 = class560.field7678.method1691(79);
                class49.field494 = class560.field7678.method1676(255);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class536.field7436) {
                int var286 = class560.field7678.method1724(0);
                class149.method1041(true);
                if (var286 == -1) {
                    class702.field9303 = -1;
                    class609.field8242 = -1;
                } else {
                    int var287 = (var286 & 0xFFFF505) >> 14;
                    int var288 = var286 & 0x3FFF;
                    int var289 = var287 - class120.field1625;
                    if (var289 < 0) {
                        var289 = 0;
                    } else if (class102.field1467 <= var289) {
                        var289 = class102.field1467;
                    }
                    int var290 = var288 - class259.field3849;
                    class702.field9303 = (var289 << 9) + 256;
                    if (var290 < 0) {
                        var290 = 0;
                    } else if (class393.field5663 <= var290) {
                        var290 = class393.field5663;
                    }
                    class609.field8242 = (var290 << 9) + 256;
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class555.field7650) {
                int var291 = class560.field7678.method1672(-16516);
                class529.field7309 = class786.field10800.method1543((byte) -10, var291);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class204.field2633) {
                int var292 = class560.field7678.method1728((byte) 77);
                int var293 = class560.field7678.method1731((byte) 64);
                boolean var294 = (var293 & 0x1) == 1;
                while (class442.field6366 > class560.field7678.field3725) {
                    int var295 = class560.field7678.method1673(-32768);
                    int var296 = class560.field7678.method1728((byte) 65);
                    int var297 = 0;
                    if (var296 != 0) {
                        var297 = class560.field7678.method1731((byte) 64);
                        if (var297 == 255) {
                            var297 = class560.field7678.method1672(-16516);
                        }
                    }
                    class178.method1217(var294, var297, var296 - 1, var292, var295, 32753);
                }
                class573.field7813[class519.method3018(class79.field1086++, 31)] = var292;
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class494.field6958) {
                int var298 = class560.field7678.method1712(0);
                int var299 = class560.field7678.method1691(127);
                class480.field6740.method4229(var299, var298, 109);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class233.field3020) {
                class765.method4208(305, class523.field7267);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class502.field7052) {
                class238.method1505(class560.field7678, class786.field10800, -6176, class442.field6366);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class329.field4678) {
                int var300 = class560.field7678.method1728((byte) 6);
                if (var300 == 65535) {
                    var300 = -1;
                }
                int var301 = class560.field7678.method1731((byte) 64);
                int var302 = class560.field7678.method1728((byte) 118);
                int var303 = class560.field7678.method1731((byte) 64);
                class416.method2509(256, var301, var300, var303, true, var302, true);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class202.field2627) {
                class149.method1041(true);
                class267.method1782(false);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class213.field2791) {
                int var304 = class560.field7678.method1731((byte) 64);
                class149.method1041(true);
                class571.field7775 = null;
                class408.field5785 = var304;
                return true;
            } else if (class75.field1016 == class571.field7775) {
                int var305 = class560.field7678.method1712(0);
                if (var305 == 65535) {
                    var305 = -1;
                }
                int var306 = class560.field7678.method1672(-16516);
                class149.method1041(true);
                class160.method1107(var306, -71, var305);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class243.field3192) {
                class765.method4208(305, class572.field7791);
                class571.field7775 = null;
                return true;
            } else if (class623.field8410 == class571.field7775) {
                String var307 = class560.field7678.method1699(-90);
                boolean var308 = class560.field7678.method1731((byte) 64) == 1;
                String var309;
                if (var308) {
                    var309 = class560.field7678.method1699(-128);
                } else {
                    var309 = var307;
                }
                int var310 = class560.field7678.method1728((byte) 45);
                byte var311 = class560.field7678.method1737(true);
                boolean var312 = false;
                if (var311 == -128) {
                    var312 = true;
                }
                if (var312) {
                    if (class199.field2588 == 0) {
                        class571.field7775 = null;
                        return true;
                    }
                    boolean var318 = false;
                    int var319;
                    for (var319 = 0; class199.field2588 > var319 && (!class245.field3209[var319].field1713.equals(var309) || class245.field3209[var319].field1714 != var310); var319++) {
                    }
                    if (class199.field2588 > var319) {
                        while ((class199.field2588 - 1) > var319) {
                            class245.field3209[var319] = class245.field3209[var319 + 1];
                            var319++;
                        }
                        class199.field2588--;
                        class245.field3209[class199.field2588] = null;
                    }
                } else {
                    String var313 = class560.field7678.method1699(-100);
                    class124 var314 = new class124();
                    var314.field1710 = var307;
                    var314.field1713 = var309;
                    var314.field1715 = class703.method3895(var314.field1713, (byte) 119);
                    var314.field1718 = var311;
                    var314.field1714 = var310;
                    var314.field1709 = var313;
                    int var315;
                    for (var315 = class199.field2588 - 1; var315 >= 0; var315--) {
                        int var316 = class245.field3209[var315].field1715.compareTo(var314.field1715);
                        if (var316 == 0) {
                            class245.field3209[var315].field1714 = var310;
                            class245.field3209[var315].field1718 = var311;
                            class245.field3209[var315].field1709 = var313;
                            if (var309.equals(class625.field8475.field10367)) {
                                class568.field7755 = var311;
                            }
                            class571.field7775 = null;
                            class317.field4468 = class701.field9280;
                            return true;
                        }
                        if (var316 < 0) {
                            break;
                        }
                    }
                    if (class199.field2588 >= class245.field3209.length) {
                        class571.field7775 = null;
                        return true;
                    }
                    for (int var317 = class199.field2588 - 1; var317 > var315; var317--) {
                        class245.field3209[var317 + 1] = class245.field3209[var317];
                    }
                    if (class199.field2588 == 0) {
                        class245.field3209 = new class124[100];
                    }
                    class245.field3209[var315 + 1] = var314;
                    class199.field2588++;
                    if (var309.equals(class625.field8475.field10367)) {
                        class568.field7755 = var311;
                    }
                }
                class317.field4468 = class701.field9280;
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class424.field6091) {
                class697.field9245 = class560.field7678.method1711(-121);
                class359.field5225 = class560.field7678.method1737(true) << 3;
                class282.field4080 = class560.field7678.method1737(true) << 3;
                while (class442.field6366 > class560.field7678.field3725) {
                    class474 var320 = class70.method580((byte) 54)[class560.field7678.method1731((byte) 64)];
                    class765.method4208(305, var320);
                }
                class571.field7775 = null;
                return true;
            } else if (class617.field8325 == class571.field7775) {
                class250.field3453 = class436.method2618(class560.field7678.method1731((byte) 64), 8352);
                class571.field7775 = null;
                return true;
            } else if (class791.field10854 == class571.field7775) {
                class754.field10208 = class560.field7678.method1689((byte) 123);
                class564.field7727 = class560.field7678.method1731((byte) 64) == 1;
                class571.field7775 = null;
                return true;
            } else if (class618.field8354 == class571.field7775) {
                int var321 = class560.field7678.method1736(-56);
                int var322 = class560.field7678.method1698((byte) 110);
                class149.method1041(true);
                class187.method1257(var321, var322, (byte) 32);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class191.field2479) {
                class765.method4208(305, class425.field6127);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class316.field4454) {
                class8.field70 = class560.field7678.method1731((byte) 64);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class189.field2465) {
                class765.method4208(305, class564.field7723);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class164.field2187) {
                boolean var323 = class560.field7678.method1711(-115) == 1;
                class149.method1041(true);
                class416.field6008 = var323;
                class571.field7775 = null;
                return true;
            } else if (class732.field9903 == class571.field7775) {
                int var324 = class560.field7678.method1724(0);
                int var325 = class560.field7678.method1712(0);
                int var326 = class560.field7678.method1676(255);
                int var327 = class560.field7678.method1712(0);
                class149.method1041(true);
                class284.method1845(var325, var326, var327, var324, false);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class213.field2799) {
                class697.field9245 = class560.field7678.method1691(107);
                class282.field4080 = class560.field7678.method1687(-128) << 3;
                class359.field5225 = class560.field7678.method1683(-32070) << 3;
                for (class769 var328 = (class769) class523.field7265.method1249((byte) -115); var328 != null; var328 = (class769) class523.field7265.method1246(true)) {
                    int var331 = (int) (var328.field2146 >> 28 & 0x3L);
                    int var332 = (int) (var328.field2146 & 0x3FFFL);
                    int var333 = var332 - class120.field1625;
                    int var334 = (int) (var328.field2146 >> 14 & 0x3FFFL);
                    int var335 = var334 - class259.field3849;
                    if (class697.field9245 == var331 && class359.field5225 <= var333 && (class359.field5225 + 8) > var333 && class282.field4080 <= var335 && var335 < class282.field4080 + 8) {
                        var328.method1102((byte) 127);
                        if (var333 >= 0 && var335 >= 0 && class102.field1467 > var333 && class393.field5663 > var335) {
                            class215.method1390(class697.field9245, var335, var333, -1);
                        }
                    }
                }
                for (class608 var329 = (class608) class398.field5706.method679((byte) -86); var329 != null; var329 = (class608) class398.field5706.method681(-92)) {
                    if (var329.field8230 >= class359.field5225 && var329.field8230 < class359.field5225 + 8 && var329.field8232 >= class282.field4080 && (class282.field4080 + 8) > var329.field8232 && class697.field9245 == var329.field8215) {
                        var329.field8225 = true;
                    }
                }
                for (class608 var330 = (class608) class518.field7196.method679((byte) -86); var330 != null; var330 = (class608) class518.field7196.method681(-53)) {
                    if (var330.field8230 >= class359.field5225 && (class359.field5225 + 8) > var330.field8230 && class282.field4080 <= var330.field8232 && (class282.field4080 + 8) > var330.field8232 && class697.field9245 == var330.field8215) {
                        var330.field8225 = true;
                    }
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class105.field1494) {
                int var336 = class560.field7678.method1711(-119);
                int var337 = class560.field7678.method1712(0);
                class149.method1041(true);
                class259.method1757(var337, var336, true, (byte) 110);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class12.field140) {
                int var338 = class560.field7678.method1706(-113);
                int var339 = class560.field7678.method1676(255);
                class149.method1041(true);
                class613.method3411(false, var339, var338);
                class571.field7775 = null;
                return true;
            } else if (class728.field9880 == class571.field7775) {
                byte var340 = class560.field7678.method1687(-128);
                int var341 = class560.field7678.method1711(-128);
                class149.method1041(true);
                class268.method1789(var341, var340, false);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class116.field1569) {
                int var342 = class560.field7678.method1706(-115);
                int var343 = class560.field7678.method1712(0);
                class149.method1041(true);
                class603.method3372((byte) -55, var343, var342);
                class571.field7775 = null;
                return true;
            } else if (class597.field8130 == class571.field7775) {
                class765.method4208(305, class620.field8397);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class302.field4237) {
                class462.field6564 = class701.field9280;
                class571.field7775 = null;
                class26.field261 = 1;
                return true;
            } else if (class687.field9195 == class571.field7775) {
                int var344 = class560.field7678.method1672(-16516);
                class149.method1041(true);
                class73 var345 = (class73) class355.field5178.method1248(127, (long) var344);
                if (var345 != null) {
                    class314.method2010(var345, true, 71, false);
                }
                if (class186.field2440 != null) {
                    class151.method1062((byte) -106, class186.field2440);
                    class186.field2440 = null;
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class49.field485) {
                class315.field4452 = class560.field7678.method1737(true);
                if (class315.field4452 == 0 || class315.field4452 == 1) {
                    class401.field5727 = true;
                }
                class571.field7775 = null;
                return true;
            } else if (class709.field9702 == class571.field7775) {
                boolean var346 = class560.field7678.method1731((byte) 64) == 1;
                String var347 = class560.field7678.method1699(-103);
                String var348 = var347;
                if (var346) {
                    var348 = class560.field7678.method1699(-76);
                }
                long var349 = class560.field7678.method1723(21795);
                long var351 = (long) class560.field7678.method1728((byte) 13);
                long var353 = (long) class560.field7678.method1722(false);
                int var355 = class560.field7678.method1731((byte) 64);
                long var356 = (var351 << 32) + var353;
                boolean var358 = false;
                int var359 = 0;
                while (true) {
                    if (var359 >= 100) {
                        if (var355 <= 1) {
                            if (!(!class564.field7727 || class405.field5751) || class704.field9640) {
                                var358 = true;
                            } else if (client.method2049(var348, false)) {
                                var358 = true;
                            }
                        }
                        break;
                    }
                    if (field1819[var359] == var356) {
                        var358 = true;
                        break;
                    }
                    var359++;
                }
                if (!var358 && class99.field1446 == 0) {
                    field1819[class625.field8478] = var356;
                    class625.field8478 = (class625.field8478 + 1) % 100;
                    String var360 = class18.method98(false, class310.method2000(class560.field7678, 2510));
                    if (var355 == 2 || var355 == 3) {
                        class648.method3598(-1, var360, 0, class452.method2689((byte) -90, var349), 9, "<img=1>" + var347, -1, "<img=1>" + var348, var347);
                    } else if (var355 == 1) {
                        class648.method3598(-1, var360, 0, class452.method2689((byte) -90, var349), 9, "<img=0>" + var347, -1, "<img=0>" + var348, var347);
                    } else {
                        class648.method3598(-1, var360, 0, class452.method2689((byte) -90, var349), 9, var347, -1, var348, var347);
                    }
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class478.field6705) {
                int var361 = class560.field7678.method1731((byte) 64);
                int var362 = class560.field7678.method1731((byte) 64);
                int var363 = class560.field7678.method1724(0);
                class605.field8204[var362] = var363;
                class610.field8247[var362] = var361;
                class408.field5787[var362] = 1;
                int var364 = class420.field6056[var362] - 1;
                for (int var365 = 0; var365 < var364; var365++) {
                    if (class518.field7213[var365] <= var363) {
                        class408.field5787[var362] = var365 + 2;
                    }
                }
                class324.field4599[class519.method3018(31, class611.field8258++)] = var362;
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class116.field1565) {
                int var366 = class560.field7678.method1736(121);
                int var367 = class560.field7678.method1691(86);
                int[] var368 = new int[4];
                for (int var369 = 0; var369 < 4; var369++) {
                    var368[var369] = class560.field7678.method1712(0);
                }
                class316 var370 = (class316) class176.field2326.method1248(95, (long) var366);
                if (var370 != null) {
                    class56.method355(var370.field4455, var368, var367, 123);
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class137.field1852) {
                int var371 = class560.field7678.method1698((byte) 81);
                int var372 = class560.field7678.method1703((byte) 89);
                class149.method1041(true);
                class715.method3960(var372, var371, (byte) -25);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class478.field6721) {
                int var373 = class560.field7678.method1706(-120);
                class149.method1041(true);
                class608.method3387(-1, (byte) -106, var373, 3, -1);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class52.field623) {
                int var374 = class560.field7678.method1736(-124);
                byte var375 = class560.field7678.method1683(-32070);
                class149.method1041(true);
                class389.method2407(var375, 47, var374);
                class571.field7775 = null;
                return true;
            } else if (class87.field1230 == class571.field7775) {
                boolean var376 = class560.field7678.method1731((byte) 64) == 1;
                String var377 = class560.field7678.method1699(-114);
                String var378 = var377;
                if (var376) {
                    var378 = class560.field7678.method1699(-83);
                }
                long var379 = class560.field7678.method1723(21795);
                long var381 = (long) class560.field7678.method1728((byte) 5);
                long var383 = (long) class560.field7678.method1722(false);
                int var385 = class560.field7678.method1731((byte) 64);
                int var386 = class560.field7678.method1728((byte) 56);
                long var387 = (var381 << 32) + var383;
                boolean var389 = false;
                int var390 = 0;
                while (true) {
                    if (var390 >= 100) {
                        if (var385 <= 1 && client.method2049(var378, false)) {
                            var389 = true;
                        }
                        break;
                    }
                    if (field1819[var390] == var387) {
                        var389 = true;
                        break;
                    }
                    var390++;
                }
                if (!var389 && class99.field1446 == 0) {
                    field1819[class625.field8478] = var387;
                    class625.field8478 = (class625.field8478 + 1) % 100;
                    String var391 = class749.field10088.method3391(var386, -101).method3674(0, class560.field7678);
                    if (var385 == 2) {
                        class648.method3598(var386, var391, 0, class452.method2689((byte) -90, var379), 20, "<img=1>" + var377, -1, "<img=1>" + var378, var377);
                    } else if (var385 == 1) {
                        class648.method3598(var386, var391, 0, class452.method2689((byte) -90, var379), 20, "<img=0>" + var377, -1, "<img=0>" + var378, var377);
                    } else {
                        class648.method3598(var386, var391, 0, class452.method2689((byte) -90, var379), 20, var377, -1, var378, var377);
                    }
                }
                class571.field7775 = null;
                return true;
            } else if (class672.field9012 == class571.field7775) {
                boolean var392 = class560.field7678.method1731((byte) 64) == 1;
                String var393 = class560.field7678.method1699(-60);
                long var394 = (long) class560.field7678.method1728((byte) 113);
                long var396 = (long) class560.field7678.method1722(false);
                int var398 = class560.field7678.method1731((byte) 64);
                int var399 = class560.field7678.method1728((byte) 22);
                long var400 = (var394 << 32) + var396;
                boolean var402 = false;
                Object var403 = null;
                class551 var404 = var392 ? class747.field10081 : class182.field2393;
                if (var404 == null) {
                    var402 = true;
                } else {
                    label2176: {
                        for (int var405 = 0; var405 < 100; var405++) {
                            if (field1819[var405] == var400) {
                                var402 = true;
                                break label2176;
                            }
                        }
                        if (var398 <= 1 && client.method2049(var393, false)) {
                            var402 = true;
                        }
                    }
                }
                if (!var402 && class99.field1446 == 0) {
                    field1819[class625.field8478] = var400;
                    class625.field8478 = (class625.field8478 + 1) % 100;
                    String var406 = class749.field10088.method3391(var399, -113).method3674(0, class560.field7678);
                    int var407 = var392 ? 42 : 45;
                    if (var398 == 2 || var398 == 3) {
                        class648.method3598(var399, var406, 0, var404.field7604, var407, "<img=1>" + var393, -1, "<img=1>" + var393, var393);
                    } else if (var398 == 1) {
                        class648.method3598(var399, var406, 0, var404.field7604, var407, "<img=0>" + var393, -1, "<img=0>" + var393, var393);
                    } else {
                        class648.method3598(var399, var406, 0, var404.field7604, var407, var393, -1, var393, var393);
                    }
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class154.field2088) {
                class560.field7678.field3725 += 28;
                if (class560.field7678.method1729(-2)) {
                    class97.method765(class560.field7678, (byte) 58, class560.field7678.field3725 - 28);
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class327.field4637) {
                int var408 = class560.field7678.method1706(-51);
                int var409 = class560.field7678.method1728((byte) 52);
                int var410 = class560.field7678.method1703((byte) 92);
                int var411 = class560.field7678.method1728((byte) 9);
                class149.method1041(true);
                class608.method3387(var411 << 16 | var410, (byte) 92, var408, 7, var409);
                class571.field7775 = null;
                return true;
            } else if (class776.field10669 == class571.field7775) {
                int var412 = class560.field7678.method1731((byte) 64);
                int var413 = var412 >> 5;
                int var414 = var412 & 0x1F;
                if (var414 == 0) {
                    class681.field9112[var413] = null;
                    class571.field7775 = null;
                    return true;
                }
                class436 var415 = new class436();
                var415.field6307 = var414;
                var415.field6311 = class560.field7678.method1731((byte) 64);
                if (var415.field6311 >= 0 && class405.field5744.length > var415.field6311) {
                    if (var415.field6307 == 1 || var415.field6307 == 10) {
                        var415.field6304 = class560.field7678.method1728((byte) 9);
                        class560.field7678.field3725 += 6;
                    } else if (var415.field6307 >= 2 && var415.field6307 <= 6) {
                        if (var415.field6307 == 2) {
                            var415.field6300 = 256;
                            var415.field6302 = 256;
                        }
                        if (var415.field6307 == 3) {
                            var415.field6302 = 256;
                            var415.field6300 = 0;
                        }
                        if (var415.field6307 == 4) {
                            var415.field6300 = 512;
                            var415.field6302 = 256;
                        }
                        if (var415.field6307 == 5) {
                            var415.field6302 = 0;
                            var415.field6300 = 256;
                        }
                        if (var415.field6307 == 6) {
                            var415.field6300 = 256;
                            var415.field6302 = 512;
                        }
                        var415.field6307 = 2;
                        var415.field6305 = class560.field7678.method1731((byte) 64);
                        var415.field6300 += class560.field7678.method1728((byte) 101) - class120.field1625 << 9;
                        var415.field6302 += class560.field7678.method1728((byte) 41) - class259.field3849 << 9;
                        var415.field6313 = class560.field7678.method1731((byte) 64) << 2;
                        var415.field6303 = class560.field7678.method1728((byte) 84);
                    }
                    var415.field6306 = class560.field7678.method1728((byte) 32);
                    if (var415.field6306 == 65535) {
                        var415.field6306 = -1;
                    }
                    class681.field9112[var413] = var415;
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class32.field307) {
                class89.field1264 = class701.field9280;
                boolean var416 = class560.field7678.method1731((byte) 64) == 1;
                if (class442.field6366 != 1) {
                    if (var416) {
                        class43.field463 = new class95(class560.field7678);
                    } else {
                        class551.field7606 = new class95(class560.field7678);
                    }
                    class571.field7775 = null;
                    return true;
                }
                if (var416) {
                    class43.field463 = null;
                } else {
                    class551.field7606 = null;
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class236.field3143) {
                int var417 = class560.field7678.method1703((byte) 85);
                class149.method1041(true);
                class158.method1097(var417, (byte) 122);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class469.field6633) {
                int var418 = class560.field7678.method1736(126);
                int var419 = class560.field7678.method1736(-30);
                int var420 = class560.field7678.method1698((byte) 87);
                int var421 = class560.field7678.method1703((byte) 79);
                class149.method1041(true);
                class724.method3999(var420, var421, true, var419, var418);
                class571.field7775 = null;
                return true;
            } else if (class83.field1183 == class571.field7775) {
                int var422 = class560.field7678.method1731((byte) 64);
                int var423 = class560.field7678.method1711(-126);
                int var424 = class560.field7678.method1736(-77) << 2;
                int var425 = class560.field7678.method1731((byte) 64);
                int var426 = class560.field7678.method1711(-116);
                class149.method1041(true);
                class316.method2019(-1025, var422, var424, var425, var426, var423);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class357.field5203) {
                String var427 = class560.field7678.method1699(-103);
                int var428 = class560.field7678.method1728((byte) 29);
                String var429 = class749.field10088.method3391(var428, 55).method3674(0, class560.field7678);
                class648.method3598(var428, var429, 0, null, 19, var427, -1, var427, var427);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class137.field1848) {
                for (int var430 = 0; var430 < class84.field1204.length; var430++) {
                    if (class84.field1204[var430] != null) {
                        class84.field1204[var430].field6179 = null;
                        class84.field1204[var430].field6138 = -1;
                    }
                }
                for (int var431 = 0; var431 < class181.field2380; var431++) {
                    class110.field1528[var431].field4455.field6179 = null;
                    class110.field1528[var431].field4455.field6138 = -1;
                }
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class465.field6591) {
                boolean var432 = class560.field7678.method1731((byte) 64) == 1;
                byte[] var433 = new byte[class442.field6366 - 1];
                class560.field7678.method1735(0, -127, var433, class442.field6366 - 1);
                class77.method624((byte) 96, var432, var433);
                class571.field7775 = null;
                return true;
            } else if (class572.field7786 == class571.field7775) {
                int var434 = class560.field7678.method1728((byte) 5);
                int var435 = class560.field7678.method1698((byte) 103);
                int var436 = class560.field7678.method1712(0);
                class149.method1041(true);
                class496.method2912(var435, (var436 << 16) + var434, 7);
                class571.field7775 = null;
                return true;
            } else if (class617.field8327 == class571.field7775) {
                int var437 = class560.field7678.method1698((byte) 100);
                int var438 = class560.field7678.method1728((byte) 18);
                class480.field6740.method4229(var437, var438, 107);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class239.field3173) {
                int var439 = class560.field7678.method1711(-126);
                int var440 = class560.field7678.method1731((byte) 64);
                int var441 = class560.field7678.method1712(0);
                if (var441 == 65535) {
                    var441 = -1;
                }
                class468.method2744(var440, -6522, var439, var441);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class275.field3983) {
                int var442 = class560.field7678.method1728((byte) 78);
                if (var442 == 65535) {
                    var442 = -1;
                }
                int var443 = class560.field7678.method1722(false);
                int var444 = class560.field7678.method1691(80);
                class564.method3212(var444, -61, var442, var443);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class309.field4387) {
                class765.method4208(305, class389.field5636);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class164.field2197) {
                class346.field4861 = class701.field9280;
                boolean var445 = class560.field7678.method1731((byte) 64) == 1;
                if (class442.field6366 != 1) {
                    if (var445) {
                        class747.field10081 = new class551(class560.field7678);
                    } else {
                        class182.field2393 = new class551(class560.field7678);
                    }
                    class571.field7775 = null;
                    return true;
                }
                class571.field7775 = null;
                if (var445) {
                    class747.field10081 = null;
                } else {
                    class182.field2393 = null;
                }
                return true;
            } else if (class731.field9901 == class571.field7775) {
                int var446 = class560.field7678.method1671((byte) -106);
                int var447 = class560.field7678.method1706(-93);
                int var448 = class560.field7678.method1695(423951304);
                class149.method1041(true);
                class532.method3078(var448, var447, var446, (byte) 124);
                class571.field7775 = null;
                return true;
            } else if (class582.field7910 == class571.field7775) {
                class657.method3650(100);
                class571.field7775 = null;
                return false;
            } else if (class571.field7775 == class220.field2847) {
                int var449 = class560.field7678.method1728((byte) 110);
                if (var449 == 65535) {
                    var449 = -1;
                }
                int var450 = class560.field7678.method1731((byte) 64);
                int var451 = class560.field7678.method1728((byte) 31);
                int var452 = class560.field7678.method1731((byte) 64);
                int var453 = class560.field7678.method1728((byte) 41);
                class416.method2509(var453, var450, var449, var452, false, var451, true);
                class571.field7775 = null;
                return true;
            } else if (class571.field7775 == class544.field7528) {
                if (class393.field5661 != null) {
                    class77.method625(false, true, class125.field1721.field5183.method1441(43), -1, -1);
                }
                byte[] var454 = new byte[class442.field6366];
                class560.field7678.method2718(0, class442.field6366, var454, 13);
                String var455 = class755.method4143((byte) 125, var454, class442.field6366, 0);
                class588.method3307(class786.field10800, var455, true, class125.field1721.field5141.method2541(43) == 1, (byte) 67);
                class571.field7775 = null;
                return true;
            } else if (class600.field8177 == class571.field7775) {
                class765.method4208(305, class706.field9657);
                class571.field7775 = null;
                return true;
            } else {
                class607.method3379("T1 - " + (class571.field7775 == null ? -1 : class571.field7775.method3020((byte) -13)) + "," + (class640.field8614 == null ? -1 : class640.field8614.method3020((byte) -13)) + "," + (class230.field2959 == null ? -1 : class230.field2959.method3020((byte) -13)) + " - " + class442.field6366, null, true);
                class87.method696(false, -111);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZLjava/lang/String;I)V", line = 3507)
    public static final void method940(int arg0, boolean arg1, String arg2, int arg3) {
        class73.method599(-1);
        field1823++;
        if (arg0 == 0) {
            class375.field5490 = class30.method169(class270.field3942, class125.field1721.field5184.method335(43) * 2, (byte) -119, class655.field8851, 0, class669.field8962);
            if (arg2 != null) {
                class375.field5490.method493(0);
                class651 var4 = class278.method1822(class410.field5827, 0, class290.field4141, 0);
                class67 var5 = class375.field5490.method502(var4, class162.method1122(class490.field6826, class290.field4141, 0), true);
                class555.method3188(-32479);
                class316.method2017(0, true, arg2, class375.field5490, var4, var5);
            }
        } else {
            class66 var6 = null;
            if (arg2 != null) {
                var6 = class30.method169(class270.field3942, 0, (byte) 54, class655.field8851, 0, class669.field8962);
                var6.method493(0);
                class651 var7 = class278.method1822(class410.field5827, 0, class290.field4141, arg3 ^ 0x3);
                class67 var8 = var6.method502(var7, class162.method1122(class490.field6826, class290.field4141, 0), true);
                class555.method3188(arg3 - 32482);
                class316.method2017(0, true, arg2, var6, var7, var8);
            }
            boolean var24 = false;
            label224: {
                try {
                    var24 = true;
                    class375.field5490 = class30.method169(class270.field3942, class125.field1721.field5184.method335(43) * 2, (byte) 67, class655.field8851, arg0, class669.field8962);
                    if (arg2 != null) {
                        var6.method493(0);
                        class651 var9 = class278.method1822(class410.field5827, 0, class290.field4141, 0);
                        class67 var10 = var6.method502(var9, class162.method1122(class490.field6826, class290.field4141, 0), true);
                        class555.method3188(arg3 - 32482);
                        class316.method2017(0, true, arg2, var6, var9, var10);
                    }
                    if (class375.field5490.method536()) {
                        boolean var11 = true;
                        try {
                            var11 = class706.field9663.field9953 > 256;
                        } catch (Throwable var28) {
                        }
                        class434 var12;
                        if (var11) {
                            var12 = class375.field5490.method478(146800640);
                        } else {
                            var12 = class375.field5490.method478(104857600);
                        }
                        class375.field5490.method501(var12);
                        var24 = false;
                    } else {
                        var24 = false;
                    }
                    break label224;
                } catch (Throwable var29) {
                    int var13 = class125.field1721.field5141.method2541(43);
                    if (var13 == 2) {
                        class40.field414 = true;
                    }
                    class125.field1721.method2255(true, 0, class125.field1721.field5141);
                    method940(var13, arg1, arg2, 3);
                    Object var10000 = null;
                    var24 = false;
                } finally {
                    if (var24) {
                        Object var17 = null;
                        if (var6 != null) {
                            try {
                                var6.method464((byte) -59);
                            } catch (Throwable var25) {
                            }
                        }
                    }
                }
                if (var6 != null) {
                    try {
                        var6.method464((byte) -59);
                    } catch (Throwable var26) {
                    }
                }
                return;
            }
            Object var16 = null;
            if (var6 != null) {
                try {
                    var6.method464((byte) -59);
                } catch (Throwable var27) {
                }
            }
        }
        class125.field1721.field5141.method2540(arg3 - 3, !arg1);
        class125.field1721.method2255(true, arg0, class125.field1721.field5141);
        class553.method3181(-9038);
        class375.field5490.method442(10000);
        class375.field5490.method477(32);
        class33.field312 = class375.field5490.method541();
        class559.field7670 = class375.field5490.method541();
        class539.method3122(-124);
        class375.field5490.method470(class125.field1721.field5186.method3036(43) == 1);
        if (class375.field5490.method460()) {
            class201.method1324(1073741823, class125.field1721.field5164.method607(43) == 1);
        }
        if (arg3 != 3) {
            field1822 = null;
        }
        class714.method3958(class393.field5663 >> 3, class375.field5490, 1, class102.field1467 >> 3);
        class697.method3787(arg3 ^ 0xFFFFFF8C);
        class130.field1794 = true;
        class180.field2362 = false;
        class159.field2141 = null;
        class654.method3639(-100);
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V", line = 3629)
    public static final void method941(byte arg0) {
        int var1 = -57 / ((arg0 + 36) / 58);
        class593.field8098.method468(((float) class125.field1721.field5136.method331(43) * 0.1F + 0.7F) * 1.1523438F);
        field1824++;
        class593.field8098.method555(class441.field6339, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class593.field8098.method540(class494.field6965, -1, 0);
        class593.field8098.method440(class388.field5625);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljt;B)Ljt;")
    public abstract class113 method939(class113 arg0, byte arg1);
}
