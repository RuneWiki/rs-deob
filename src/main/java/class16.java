import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class16 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Lae;")
    public static class6 field322 = class64.method474(112, ")2");

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field326 = -1;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lae;")
    public static class6 field325 = class64.method474(110, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lae;")
    public static class6 field324 = class64.method474(125, " )2> ");

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lae;")
    public static class6 field327 = class64.method474(117, "Abbrechen");

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "[I")
    public static int[] field329 = new int[500];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 21)
    public static final void method167(int arg0) {
        field321++;
        if (class7.field162 == 79) {
            int var1 = class85.field2051.method620((byte) -8);
            int var2 = class68.field1505 + (var1 >> 4 & 0x7);
            int var3 = (var1 & 0x7) + class117.field2762;
            int var4 = class85.field2051.method636(-76);
            int var5 = class85.field2051.method636(109);
            int var6 = class85.field2051.method636(-80);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class95 var7 = class27.field682[class15.field305][var2][var3];
                if (var7 != null) {
                    for (class49 var8 = (class49) var7.method798(false); var8 != null; var8 = (class49) var7.method792((byte) -87)) {
                        if ((var4 & 0x7FFF) == var8.field1106 && var8.field1099 == var5) {
                            var8.field1099 = var6;
                            break;
                        }
                    }
                    class130.method1049(var2, var3, (byte) -127);
                }
            }
        } else if (class7.field162 == 94) {
            int var9 = class85.field2051.method654(arg0 ^ 0xFFFFF4ED);
            int var10 = class85.field2051.method654(-1);
            int var11 = class85.field2051.method651((byte) -17);
            int var12 = (var11 >> 4 & 0x7) + class68.field1505;
            int var13 = (var11 & 0x7) + class117.field2762;
            int var14 = class85.field2051.method654(-1);
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104 && class136.field3308 != var9) {
                class49 var15 = new class49();
                var15.field1099 = var10;
                var15.field1106 = var14;
                if (class27.field682[class15.field305][var12][var13] == null) {
                    class27.field682[class15.field305][var12][var13] = new class95();
                }
                class27.field682[class15.field305][var12][var13].method785((byte) -82, var15);
                class130.method1049(var12, var13, (byte) -127);
            }
        } else if (class7.field162 == 84) {
            int var16 = class85.field2051.method637(10670);
            int var17 = class85.field2051.method620((byte) -8);
            int var18 = (var17 & 0x7) + class117.field2762;
            int var19 = (var17 >> 4 & 0x7) + class68.field1505;
            if (var19 >= 0 && var18 >= 0 && var19 < 104 && var18 < 104) {
                class95 var20 = class27.field682[class15.field305][var19][var18];
                if (var20 != null) {
                    for (class49 var21 = (class49) var20.method798(false); var21 != null; var21 = (class49) var20.method792((byte) -87)) {
                        if ((var16 & 0x7FFF) == var21.field1106) {
                            var21.method498(arg0 ^ 0xB77);
                            break;
                        }
                    }
                    if (var20.method798(false) == null) {
                        class27.field682[class15.field305][var19][var18] = null;
                    }
                    class130.method1049(var19, var18, (byte) -127);
                }
            }
        } else if (class7.field162 == 69) {
            int var22 = class85.field2051.method620((byte) -8);
            int var23 = var22 >> 2;
            int var24 = var22 & 0x3;
            int var25 = class57.field1243[var23];
            int var26 = class85.field2051.method624((byte) 22);
            int var27 = (var26 >> 4 & 0x7) + class68.field1505;
            int var28 = (var26 & 0x7) + class117.field2762;
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                class100.method843(0, var28, -1, class15.field305, (byte) 93, var24, var23, var25, -1, var27);
            }
        } else if (class7.field162 == 101) {
            int var29 = class85.field2051.method620((byte) -8);
            int var30 = (var29 & 0x7) + class117.field2762;
            int var31 = (var29 >> 4 & 0x7) + class68.field1505;
            int var32 = var31 + class85.field2051.method638(116);
            int var33 = var30 + class85.field2051.method638(119);
            int var34 = class85.field2051.method645(arg0 - 2933);
            int var35 = class85.field2051.method636(arg0 - 2713);
            int var36 = class85.field2051.method620((byte) -8) * 4;
            int var37 = class85.field2051.method620((byte) -8) * 4;
            int var38 = class85.field2051.method636(-16);
            int var39 = class85.field2051.method636(107);
            int var40 = class85.field2051.method620((byte) -8);
            int var41 = class85.field2051.method620((byte) -8);
            if (var31 >= 0 && var30 >= 0 && var31 < 104 && var30 < 104 && var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104 && var35 != 65535) {
                int var42 = var33 * 128 + 64;
                int var43 = var31 * 128 + 64;
                int var44 = var30 * 128 + 64;
                int var45 = var32 * 128 + 64;
                class41 var46 = new class41(var35, class15.field305, var43, var44, class20.method193(var44, 9990, class15.field305, var43) - var36, class5.field61 + var38, class5.field61 + var39, var40, var41, var34, var37);
                var46.method348(class20.method193(var42, 9990, class15.field305, var45) - var37, 63, var42, var38 + class5.field61, var45);
                class37.field851.method785((byte) 123, var46);
            }
        } else if (class7.field162 == 207) {
            int var47 = class85.field2051.method654(-1);
            int var48 = class85.field2051.method637(10670);
            int var49 = class85.field2051.method620((byte) -8);
            int var50 = (var49 >> 4 & 0x7) + class68.field1505;
            int var51 = class117.field2762 + (var49 & 0x7);
            if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                class49 var52 = new class49();
                var52.field1106 = var48;
                var52.field1099 = var47;
                if (class27.field682[class15.field305][var50][var51] == null) {
                    class27.field682[class15.field305][var50][var51] = new class95();
                }
                class27.field682[class15.field305][var50][var51].method785((byte) 62, var52);
                class130.method1049(var50, var51, (byte) -127);
            }
        } else {
            if (arg0 != 2834) {
                method168(-9);
            }
            if (class7.field162 == 170) {
                int var53 = class85.field2051.method669((byte) 117);
                int var54 = class85.field2051.method624((byte) 47);
                int var55 = var54 >> 2;
                int var56 = var54 & 0x3;
                int var57 = class57.field1243[var55];
                int var58 = class85.field2051.method640(34);
                int var59 = (var58 >> 4 & 0x7) + class68.field1505;
                int var60 = (var58 & 0x7) + class117.field2762;
                if (var59 >= 0 && var60 >= 0 && var59 < 103 && var60 < 103) {
                    int var61 = class137.field3331[class15.field305][var59][var60];
                    int var62 = class137.field3331[class15.field305][var59 + 1][var60];
                    int var63 = class137.field3331[class15.field305][var59 + 1][var60 + 1];
                    int var64 = class137.field3331[class15.field305][var59][var60 + 1];
                    if (var57 == 0) {
                        class62 var65 = class81.field1967.method521(class15.field305, var59, var60);
                        if (var65 != null) {
                            int var66 = var65.field1354 >> 14 & 0x7FFF;
                            if (var55 == 2) {
                                var65.field1364 = new class46(var66, 2, var56 + 4, var61, var62, var63, var64, var53, false, var65.field1364);
                                var65.field1358 = new class46(var66, 2, var56 + 1 & 0x3, var61, var62, var63, var64, var53, false, var65.field1358);
                            } else {
                                var65.field1364 = new class46(var66, var55, var56, var61, var62, var63, var64, var53, false, var65.field1364);
                            }
                        }
                    }
                    if (var57 == 1) {
                        class81 var67 = class81.field1967.method523(class15.field305, var59, var60);
                        if (var67 != null) {
                            var67.field1980 = new class46(var67.field1974 >> 14 & 0x7FFF, 4, 0, var61, var62, var63, var64, var53, false, var67.field1980);
                        }
                    }
                    if (var57 == 2) {
                        if (var55 == 11) {
                            var55 = 10;
                        }
                        class18 var68 = class81.field1967.method539(class15.field305, var59, var60);
                        if (var68 != null) {
                            var68.field339 = new class46(var68.field342 >> 14 & 0x7FFF, var55, var56, var61, var62, var63, var64, var53, false, var68.field339);
                        }
                    }
                    if (var57 == 3) {
                        class93 var69 = class81.field1967.method565(class15.field305, var59, var60);
                        if (var69 != null) {
                            var69.field2218 = new class46(var69.field2221 >> 14 & 0x7FFF, 22, var56, var61, var62, var63, var64, var53, false, var69.field2218);
                        }
                    }
                }
            } else if (class7.field162 == 122) {
                int var70 = class85.field2051.method651((byte) 121);
                int var71 = class117.field2762 + (var70 & 0x7);
                int var72 = (var70 >> 4 & 0x7) + class68.field1505;
                int var73 = class85.field2051.method636(95);
                int var74 = class85.field2051.method624((byte) 17);
                int var75 = var74 & 0x3;
                int var76 = var74 >> 2;
                int var77 = class57.field1243[var76];
                if (var72 >= 0 && var71 >= 0 && var72 < 104 && var71 < 104) {
                    class100.method843(0, var71, -1, class15.field305, (byte) 106, var75, var76, var77, var73, var72);
                }
            } else if (class7.field162 == 115) {
                int var78 = class85.field2051.method620((byte) -8);
                int var79 = (var78 >> 4 & 0x7) + class68.field1505;
                int var80 = (var78 & 0x7) + class117.field2762;
                int var81 = class85.field2051.method636(-112);
                int var82 = class85.field2051.method620((byte) -8);
                int var83 = class85.field2051.method636(-19);
                if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                    int var84 = var80 * 128 + 64;
                    int var85 = var79 * 128 + 64;
                    class126 var86 = new class126(var81, class15.field305, var85, var84, class20.method193(var84, 9990, class15.field305, var85) - var82, var83, class5.field61);
                    class25.field629.method785((byte) 83, var86);
                }
            } else {
                if (class7.field162 == 129) {
                    byte var87 = class85.field2051.method646(4);
                    byte var88 = class85.field2051.method635(4606);
                    int var89 = class85.field2051.method654(-1);
                    byte var90 = class85.field2051.method635(4606);
                    byte var91 = class85.field2051.method649((byte) 62);
                    int var92 = class85.field2051.method654(arg0 ^ 0xFFFFF4ED);
                    int var93 = class85.field2051.method651((byte) 122);
                    int var94 = var93 >> 2;
                    int var95 = class57.field1243[var94];
                    int var96 = var93 & 0x3;
                    int var97 = class85.field2051.method640(22);
                    int var98 = class68.field1505 + (var97 >> 4 & 0x7);
                    int var99 = (var97 & 0x7) + class117.field2762;
                    int var100 = class85.field2051.method636(125);
                    int var101 = class85.field2051.method669((byte) 118);
                    class66 var102;
                    if (class136.field3308 == var101) {
                        var102 = class12.field229;
                    } else {
                        var102 = class20.field387[var101];
                    }
                    if (var102 != null) {
                        class107 var103 = class80.method687(var89, (byte) 77);
                        int var104 = class137.field3331[class15.field305][var98][var99 + 1];
                        int var105 = class137.field3331[class15.field305][var98][var99];
                        int var106 = class137.field3331[class15.field305][var98 + 1][var99];
                        int var107 = class137.field3331[class15.field305][var98 + 1][var99 + 1];
                        class131 var108 = var103.method909(66, var94, var105, var96, var104, var107, var106);
                        if (var108 != null) {
                            class100.method843(var92 + 1, var99, var100 + 1, class15.field305, (byte) 98, 0, 0, var95, -1, var98);
                            if (var90 > var88) {
                                byte var109 = var90;
                                var90 = var88;
                                var88 = var109;
                            }
                            var102.field1445 = class5.field61 + var92;
                            var102.field1455 = var108;
                            if (var87 < var91) {
                                byte var110 = var91;
                                var91 = var87;
                                var87 = var110;
                            }
                            var102.field1458 = class5.field61 + var100;
                            int var111 = var103.field2516;
                            int var112 = var103.field2546;
                            if (var96 == 1 || var96 == 3) {
                                var112 = var103.field2516;
                                var111 = var103.field2546;
                            }
                            var102.field1448 = var98 * 128 + var111 * 64;
                            var102.field1453 = var99 * 128 + var112 * 64;
                            var102.field1454 = class20.method193(var102.field1453, 9990, class15.field305, var102.field1448);
                            var102.field1446 = var98 + var88;
                            var102.field1440 = var91 + var99;
                            var102.field1442 = var90 + var98;
                            var102.field1457 = var99 + var87;
                        }
                    }
                }
                if (class7.field162 == 109) {
                    int var113 = class85.field2051.method620((byte) -8);
                    int var114 = (var113 >> 4 & 0x7) + class68.field1505;
                    int var115 = (var113 & 0x7) + class117.field2762;
                    int var116 = class85.field2051.method636(100);
                    int var117 = class85.field2051.method620((byte) -8);
                    int var118 = var117 >> 4 & 0xF;
                    int var119 = class85.field2051.method620((byte) -8);
                    int var120 = var117 & 0x7;
                    if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                        int var121 = var118 + 1;
                        if (class12.field229.field1796[0] >= var114 - var121 && var114 + var121 >= class12.field229.field1796[0] && class12.field229.field1726[0] >= var115 - var121 && var115 + var121 >= class12.field229.field1726[0] && class14.field301 != 0 && var120 > 0 && class41.field916 < 50) {
                            class138.field3356[class41.field916] = var116;
                            class129.field3129[class41.field916] = var120;
                            class64.field1407[class41.field916] = var119;
                            class24.field618[class41.field916] = null;
                            class111.field2667[class41.field916] = (var114 << 16) + (var115 << 8) + var118;
                            class41.field916++;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 557)
    public static void method168(int arg0) {
        field327 = null;
        field324 = null;
        if (arg0 <= 34) {
            field324 = null;
        }
        field325 = null;
        field322 = null;
        field329 = null;
    }
}
