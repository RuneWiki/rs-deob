import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class92 extends class73 {

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "J")
    public long field1764;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lli;")
    public static class185 field1769 = class245.method1649("::fpsoff", 127);

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "[Z")
    public static boolean[] field1771 = new boolean[8];

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field1770 = 0;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field1765 = 0;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field1773 = 0;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "[[S")
    public static short[][] field1768;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static final void method599(int arg0) {
        if (arg0 != -1) {
            method601(true);
        }
        field1767++;
        class225.method1558(false, false);
        System.gc();
        class276.method1892((byte) -126, 25);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static void method600(byte arg0) {
        field1771 = null;
        if (arg0 != -34) {
            field1773 = -66;
        }
        field1768 = null;
        field1769 = null;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class92() {
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(J)V")
    public class92(long arg0) {
        this.field1764 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(Z)V")
    public static final void method601(boolean arg0) {
        field1766++;
        if (class280.field4950 == 92) {
            int var1 = class142.field2669.method872(16);
            int var2 = class142.field2669.method827(255);
            int var3 = class142.field2669.method832((byte) 77);
            int var4 = (var3 & 0x7) + class7.field153;
            int var5 = (var3 >> 4 & 0x7) + class128.field2298;
            int var6 = class142.field2669.method851(2096);
            if (var5 >= 0 && var4 >= 0 && var5 < 104 && var4 < 104 && class249.field4421 != var6) {
                class102 var7 = new class102();
                var7.field1852 = var2;
                var7.field1850 = var1;
                if (class71.field1238[class265.field4703][var5][var4] == null) {
                    class71.field1238[class265.field4703][var5][var4] = new class191();
                }
                class71.field1238[class265.field4703][var5][var4].method1382(new class176(var7), (byte) -52);
                class228.method1578(var4, var5, arg0);
            }
        } else if (class280.field4950 == 99) {
            int var8 = class142.field2669.method854((byte) 104);
            int var9 = class128.field2298 + ((var8 & 0x7E) >> 4);
            int var10 = class7.field153 + (var8 & 0x7);
            int var11 = class142.field2669.method831((byte) -118);
            int var12 = class142.field2669.method821(60);
            int var13 = var12 >> 2;
            int var14 = class52.field860[var13];
            int var15 = var12 & 0x3;
            if (var11 == 65535) {
                var11 = -1;
            }
            class117.method813(var14, var11, class265.field4703, var13, var9, (byte) 67, var10, var15);
        } else if (class280.field4950 == 79) {
            int var16 = class142.field2669.method831((byte) -80);
            int var17 = class142.field2669.method821(-118);
            int var18 = (var17 >> 4 & 0x7) + class128.field2298;
            int var19 = class7.field153 + (var17 & 0x7);
            int var20 = class142.field2669.method872(16);
            if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                class102 var21 = new class102();
                var21.field1850 = var20;
                var21.field1852 = var16;
                if (class71.field1238[class265.field4703][var18][var19] == null) {
                    class71.field1238[class265.field4703][var18][var19] = new class191();
                }
                class71.field1238[class265.field4703][var18][var19].method1382(new class176(var21), (byte) -71);
                class228.method1578(var19, var18, false);
            }
        } else if (class280.field4950 == 128) {
            int var22 = class142.field2669.method867(false);
            int var23 = (var22 >> 4 & 0x7) + class128.field2298;
            int var24 = (var22 & 0x7) + class7.field153;
            int var25 = class142.field2669.method827(255);
            int var26 = class142.field2669.method867(false);
            int var27 = class142.field2669.method827(255);
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                int var28 = var23 * 128 + 64;
                int var29 = var24 * 128 + 64;
                class165 var30 = new class165(var25, class265.field4703, var28, var29, class236.method1606(55, var29, var28, class265.field4703) - var26, var27, class211.field3851);
                class229.field4168.method1382(new class70(var30), (byte) -87);
            }
        } else if (class280.field4950 == 15) {
            int var31 = class142.field2669.method854((byte) 81);
            int var32 = ((var31 & 0x76) >> 4) + class128.field2298;
            int var33 = class7.field153 + (var31 & 0x7);
            int var34 = class142.field2669.method867(arg0);
            int var35 = var34 >> 2;
            int var36 = class52.field860[var35];
            int var37 = var34 & 0x3;
            if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                class139.method996(-1, class265.field4703, var33, var32, 0, var36, 125, var35, -1, var37);
            }
        } else if (class280.field4950 == 42) {
            int var38 = class142.field2669.method867(false);
            int var39 = ((var38 & 0x72) >> 4) + class128.field2298;
            int var40 = (var38 & 0x7) + class7.field153;
            int var41 = class142.field2669.method838(1275919136) + var39;
            int var42 = class142.field2669.method838(1275919136) + var40;
            int var43 = class142.field2669.method876(65280);
            int var44 = class142.field2669.method827(255);
            int var45 = class142.field2669.method867(arg0) * 4;
            int var46 = class142.field2669.method867(false) * 4;
            int var47 = class142.field2669.method827(255);
            int var48 = class142.field2669.method827(255);
            int var49 = class142.field2669.method867(arg0);
            int var50 = class142.field2669.method867(false);
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104 && var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var44 != 65535) {
                int var51 = var41 * 128 + 64;
                int var52 = var42 * 128 + 64;
                int var53 = var39 * 128 + 64;
                int var54 = var40 * 128 + 64;
                class111 var55 = new class111(var44, class265.field4703, var53, var54, class236.method1606(111, var54, var53, class265.field4703) - var45, class211.field3851 + var47, class211.field3851 + var48, var49, var50, var43, var46);
                var55.method777(var52, var51, class211.field3851 + var47, class236.method1606(83, var52, var51, class265.field4703) + -var46, -5493);
                class203.field3721.method1382(new class128(var55), (byte) -93);
            }
        } else {
            if (arg0) {
                field1771 = null;
            }
            if (class280.field4950 == 116) {
                int var56 = class142.field2669.method867(false);
                int var57 = (var56 & 0x7) + class7.field153;
                int var58 = ((var56 & 0x74) >> 4) + class128.field2298;
                int var59 = class142.field2669.method827(255);
                int var60 = class142.field2669.method827(255);
                int var61 = class142.field2669.method827(255);
                if (var58 >= 0 && var57 >= 0 && var58 < 104 && var57 < 104) {
                    class191 var62 = class71.field1238[class265.field4703][var58][var57];
                    if (var62 != null) {
                        for (class176 var63 = (class176) var62.method1375(16259); var63 != null; var63 = (class176) var62.method1377(-19546)) {
                            class102 var64 = var63.field3223;
                            if ((var59 & 0x7FFF) == var64.field1852 && var64.field1850 == var60) {
                                var64.field1850 = var61;
                                break;
                            }
                        }
                        class228.method1578(var57, var58, false);
                    }
                }
            } else if (class280.field4950 == 63) {
                int var65 = class142.field2669.method867(arg0);
                int var66 = ((var65 & 0xF4) >> 4) + class128.field2298 * 2;
                int var67 = (var65 & 0xF) + class7.field153 * 2;
                int var68 = var66 + class142.field2669.method838(1275919136);
                int var69 = var67 + class142.field2669.method838(1275919136);
                int var70 = class142.field2669.method876(65280);
                int var71 = class142.field2669.method827(255);
                int var72 = class142.field2669.method867(arg0) * 4;
                int var73 = class142.field2669.method867(arg0) * 4;
                int var74 = class142.field2669.method827(255);
                int var75 = class142.field2669.method827(255);
                int var76 = class142.field2669.method867(false);
                int var77 = class142.field2669.method867(false);
                if (var66 >= 0 && var67 >= 0 && var66 < 208 && var67 < 208 && var68 >= 0 && var69 >= 0 && var68 < 208 && var69 < 208 && var71 != 65535) {
                    int var78 = var68 * 64;
                    int var79 = var66 * 64;
                    int var80 = var69 * 64;
                    int var81 = var67 * 64;
                    class111 var82 = new class111(var71, class265.field4703, var79, var81, class236.method1606(82, var81, var79, class265.field4703) - var72, class211.field3851 + var74, class211.field3851 + var75, var76, var77, var70, var73);
                    var82.method777(var80, var78, class211.field3851 + var74, -var73 + class236.method1606(59, var80, var78, class265.field4703), -5493);
                    class203.field3721.method1382(new class128(var82), (byte) -128);
                }
            } else if (class280.field4950 == 38) {
                int var83 = class142.field2669.method854((byte) 117);
                int var84 = (var83 & 0x7) + class7.field153;
                int var85 = class128.field2298 + ((var83 & 0x77) >> 4);
                int var86 = class142.field2669.method851(2096);
                if (var85 >= 0 && var84 >= 0 && var85 < 104 && var84 < 104) {
                    class191 var87 = class71.field1238[class265.field4703][var85][var84];
                    if (var87 != null) {
                        for (class176 var88 = (class176) var87.method1375(16259); var88 != null; var88 = (class176) var87.method1377(-19546)) {
                            if ((var86 & 0x7FFF) == var88.field3223.field1852) {
                                var88.method476(115);
                                break;
                            }
                        }
                        if (var87.method1375(16259) == null) {
                            class71.field1238[class265.field4703][var85][var84] = null;
                        }
                        class228.method1578(var84, var85, false);
                    }
                }
            } else if (class280.field4950 == 156) {
                int var89 = class142.field2669.method827(255);
                int var90 = class142.field2669.method832((byte) -102);
                int var91 = ((var90 & 0x7C) >> 4) + class128.field2298;
                int var92 = (var90 & 0x7) + class7.field153;
                int var93 = class142.field2669.method832((byte) 106);
                int var94 = var93 >> 2;
                int var95 = class52.field860[var94];
                int var96 = var93 & 0x3;
                if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                    class139.method996(-1, class265.field4703, var92, var91, 0, var95, -112, var94, var89, var96);
                }
            } else if (class280.field4950 == 139) {
                int var97 = class142.field2669.method867(false);
                int var98 = ((var97 & 0x72) >> 4) + class128.field2298;
                int var99 = (var97 & 0x7) + class7.field153;
                int var100 = class142.field2669.method827(255);
                int var101 = class142.field2669.method867(false);
                if (var100 == 65535) {
                    var100 = -1;
                }
                int var102 = (var101 & 0xF8) >> 4;
                int var103 = var101 & 0x7;
                int var104 = class142.field2669.method867(false);
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                    int var105 = var102 + 1;
                    if (var98 - var105 <= class241.field4310.field2651[0] && (var98 + var105) >= class241.field4310.field2651[0] && class241.field4310.field2720[0] >= (var99 - var105) && (var99 + var105) >= class241.field4310.field2720[0] && class280.field4965 != 0 && var103 > 0 && class185.field3453 < 50 && var100 != -1) {
                        class46.field743[class185.field3453] = var100;
                        class161.field3040[class185.field3453] = var103;
                        class209.field3822[class185.field3453] = var104;
                        class23.field385[class185.field3453] = null;
                        class174.field3180[class185.field3453] = (var98 << 16) - (-(var99 << 8) - var102);
                        class185.field3453++;
                    }
                }
            } else if (class280.field4950 == 12) {
                int var106 = class142.field2669.method831((byte) -91);
                int var107 = class142.field2669.method827(255);
                byte var108 = class142.field2669.method830(92);
                int var109 = class142.field2669.method831((byte) -90);
                byte var110 = class142.field2669.method825(!arg0);
                byte var111 = class142.field2669.method868((byte) 36);
                byte var112 = class142.field2669.method868((byte) 61);
                int var113 = class142.field2669.method821(-117);
                int var114 = var113 & 0x3;
                int var115 = var113 >> 2;
                int var116 = class52.field860[var115];
                int var117 = class142.field2669.method821(-116);
                int var118 = (var117 >> 4 & 0x7) + class128.field2298;
                int var119 = (var117 & 0x7) + class7.field153;
                int var120 = class142.field2669.method831((byte) 124);
                class188 var121;
                if (class249.field4421 == var107) {
                    var121 = class241.field4310;
                } else {
                    var121 = class93.field1774[var107];
                }
                if (var121 != null) {
                    class135 var122 = class184.method1294(var120, -28916);
                    int var123;
                    int var124;
                    if (var114 == 1 || var114 == 3) {
                        var124 = var122.field2500;
                        var123 = var122.field2536;
                    } else {
                        var123 = var122.field2500;
                        var124 = var122.field2536;
                    }
                    int var125 = (var124 + 1 >> 1) + var118;
                    int var126 = (var124 >> 1) + var118;
                    int var127 = (var123 + 1 >> 1) + var119;
                    int[][] var128 = class201.field3694[class265.field4703];
                    int var129 = var119 + (var123 >> 1);
                    int[][] var130 = null;
                    if (class265.field4703 < 3) {
                        var130 = class201.field3694[class265.field4703 + 1];
                    }
                    int var131 = var128[var125][var129] + var128[var126][var127] + var128[var126][var129] + var128[var125][var127] >> 2;
                    int var132 = (var119 << 7) + (var123 << 6);
                    int var133 = (var118 << 7) + (var124 << 6);
                    class217 var134 = var122.method972(var115, (class34) null, var132, var128, var122.field2474, (byte) -77, var114, var133, var131, var130, false);
                    if (var134 != null) {
                        if (var112 < var111) {
                            byte var135 = var111;
                            var111 = var112;
                            var112 = var135;
                        }
                        if (var110 < var108) {
                            byte var136 = var108;
                            var108 = var110;
                            var110 = var136;
                        }
                        class139.method996(var109 + 1, class265.field4703, var119, var118, var106 + 1, var116, -111, 0, -1, 0);
                        var121.field3490 = class211.field3851 + var109;
                        var121.field3517 = class211.field3851 + var106;
                        var121.field3499 = var108 + var119;
                        var121.field3505 = var118 * 128 + var124 * 64;
                        var121.field3483 = (class98) var134.field3972;
                        var121.field3485 = var119 + var110;
                        var121.field3500 = var118 + var112;
                        var121.field3493 = var111 + var118;
                        var121.field3495 = var119 * 128 + var123 * 64;
                        var121.field3516 = var131;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILli;)Lwc;")
    public static final class85 method602(int arg0, class185 arg1) {
        field1772++;
        for (class85 var2 = (class85) class235.field4213.method1375(16259); var2 != null; var2 = (class85) class235.field4213.method1377(arg0 ^ 0xFFFFAC64)) {
            if (var2.field1680.method1329(arg1, (byte) 22)) {
                return var2;
            }
        }
        if (arg0 != 8130) {
            field1771 = null;
        }
        return null;
    }
}
