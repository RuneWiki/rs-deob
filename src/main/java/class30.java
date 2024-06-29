import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class30 {

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Lmb;")
    private static class132 field463 = class166.method1092("glow3:", 126);

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lmb;")
    public static class132 field461 = field463;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lmb;")
    public static class132 field468 = field463;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lmb;")
    public static class132 field459 = class166.method1092("hint_mapmarkers", 123);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field458 = 0;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "[B")
    public static byte[] field467 = new byte[520];

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Lmb;")
    private static class132 field465 = class166.method1092("Please wait)3)3)3", 122);

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field460 = 0;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Lmb;")
    public static class132 field471 = field465;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lq;")
    public static class174 field466 = new class174(30);

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Lmb;")
    private static class132 field473 = class166.method1092("purple:", 113);

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "Z")
    public static boolean field474 = true;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Lmb;")
    public static class132 field475 = field473;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "Lmb;")
    public static class132 field477 = class166.method1092("Gegenstand f-Ur Mitglieder", 121);

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "Lmb;")
    public static class132 field476 = field473;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "[I")
    public static int[] field462;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "[Lhh;")
    public static class85[] field470;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static final void method216(int arg0) {
        field469++;
        if (class173.field3235 == 179) {
            int var1 = class118.field2241.method716(-1308);
            int var2 = var1 >> 2;
            int var3 = var1 & 0x3;
            int var4 = class33.field530[var2];
            int var5 = class118.field2241.method730(1848);
            byte var6 = class118.field2241.method734(true);
            int var7 = class118.field2241.method744((byte) 101);
            byte var8 = class118.field2241.method734(true);
            byte var9 = class118.field2241.method734(true);
            byte var10 = class118.field2241.method734(true);
            int var11 = class118.field2241.method739(37);
            int var12 = class118.field2241.method763(65280);
            int var13 = (var12 >> 4 & 0x7) + class22.field313;
            int var14 = (var12 & 0x7) + class73.field1214;
            int var15 = class118.field2241.method744((byte) 122);
            class159 var16;
            if (class65.field1069 == var15) {
                var16 = class210.field3854;
            } else {
                var16 = class68.field1120[var15];
            }
            if (var16 != null) {
                class84 var17 = class66.method414(0, var7);
                int var18;
                int var19;
                if (var3 == 1 || var3 == 3) {
                    var19 = var17.field1440;
                    var18 = var17.field1434;
                } else {
                    var18 = var17.field1440;
                    var19 = var17.field1434;
                }
                int var20 = (var19 + 1 >> 1) + var13;
                int var21 = (var19 >> 1) + var13;
                int[][] var22 = class190.field3531[class139.field2615];
                int var23 = (var18 >> 1) + var14;
                int var24 = (var18 + 1 >> 1) + var14;
                int var25 = var22[var20][var24] + var22[var21][var24] + var22[var20][var23] + var22[var21][var23] >> 2;
                int var26 = (var14 << 7) + (var18 << 6);
                int var27 = (var13 << 7) + (var19 << 6);
                class81 var28 = var17.method523(var26, var3, var2, var27, false, var25, var22, false);
                if (var28 != null) {
                    if (var9 > var6) {
                        byte var29 = var9;
                        var9 = var6;
                        var6 = var29;
                    }
                    class152.method998(var5 + 1, 0, class139.field2615, -1, var14, var4, 0, var11 + 1, var13, arg0 - 18793);
                    var16.field2873 = var25;
                    var16.field2899 = var5 + field460;
                    var16.field2895 = var14 * 128 + var18 * 64;
                    var16.field2883 = var13 * 128 + var19 * 64;
                    if (var10 < var8) {
                        byte var30 = var8;
                        var8 = var10;
                        var10 = var30;
                    }
                    var16.field2888 = var8 + var14;
                    var16.field2879 = var13 + var9;
                    var16.field2896 = (class221) var28.field1369;
                    var16.field2882 = var6 + var13;
                    var16.field2889 = var10 + var14;
                    var16.field2901 = var11 + field460;
                }
            }
        }
        if (class173.field3235 == 148) {
            int var31 = class118.field2241.method716(-1308);
            int var32 = (var31 >> 4 & 0x7) + class22.field313;
            int var33 = (var31 & 0x7) + class73.field1214;
            int var34 = class118.field2241.method753(false);
            int var35 = class118.field2241.method739(-128);
            int var36 = class118.field2241.method753(false);
            if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104 && class65.field1069 != var36) {
                class195 var37 = new class195();
                var37.field3628 = var35;
                var37.field3620 = var34;
                if (class15.field216[class139.field2615][var32][var33] == null) {
                    class15.field216[class139.field2615][var32][var33] = new class19();
                }
                class15.field216[class139.field2615][var32][var33].method120(0, new class39(var37));
                class158.method1025(var33, var32, true);
            }
        } else if (class173.field3235 == 62) {
            int var38 = class118.field2241.method732((byte) 115);
            int var39 = var38 >> 2;
            int var40 = var38 & 0x3;
            int var41 = class33.field530[var39];
            int var42 = class118.field2241.method711(-1795);
            int var43 = (var42 & 0x7) + class73.field1214;
            int var44 = (var42 >> 4 & 0x7) + class22.field313;
            int var45 = class118.field2241.method753(false);
            if (var44 >= 0 && var43 >= 0 && var44 < 104 && var43 < 104) {
                class152.method998(-1, var39, class139.field2615, var45, var43, var41, var40, 0, var44, arg0 - 18793);
            }
        } else if (class173.field3235 == 188) {
            int var46 = class118.field2241.method716(-1308);
            int var47 = class22.field313 + (var46 >> 4 & 0x7);
            int var48 = (var46 & 0x7) + class73.field1214;
            int var49 = class118.field2241.method739(arg0 - 29973);
            int var50 = class118.field2241.method739(-123);
            int var51 = class118.field2241.method739(-128);
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                class19 var52 = class15.field216[class139.field2615][var47][var48];
                if (var52 != null) {
                    for (class39 var53 = (class39) var52.method119(true); var53 != null; var53 = (class39) var52.method125((byte) -124)) {
                        class195 var54 = var53.field634;
                        if ((var49 & 0x7FFF) == var54.field3620 && var54.field3628 == var50) {
                            var54.field3628 = var51;
                            break;
                        }
                    }
                    class158.method1025(var48, var47, true);
                }
            }
        } else if (class173.field3235 == 166) {
            int var55 = class118.field2241.method716(-1308);
            int var56 = (var55 & 0x7) + class73.field1214;
            int var57 = (var55 >> 4 & 0x7) + class22.field313;
            int var58 = class118.field2241.method730(1848);
            if (var58 == 65535) {
                var58 = -1;
            }
            int var59 = class118.field2241.method711(arg0 ^ 0xFFFF8C64);
            int var60 = var59 & 0x3;
            int var61 = var59 >> 2;
            int var62 = class33.field530[var61];
            if (var57 >= 0 && var56 >= 0 && var57 < 103 && var56 < 103) {
                if (var62 == 0) {
                    class186 var63 = class157.method1023(class139.field2615, var57, var56);
                    if (var63 != null) {
                        int var64 = Integer.MAX_VALUE & (int) (var63.field3439 >>> 32);
                        if (var61 == 2) {
                            var63.field3440 = new class167(var64, 2, var60 + 4, class139.field2615, var57, var56, var58, false, var63.field3440);
                            var63.field3449 = new class167(var64, 2, var60 + 1 & 0x3, class139.field2615, var57, var56, var58, false, var63.field3449);
                        } else {
                            var63.field3440 = new class167(var64, var61, var60, class139.field2615, var57, var56, var58, false, var63.field3440);
                        }
                    }
                }
                if (var62 == 1) {
                    class220 var65 = class21.method145(class139.field2615, var57, var56);
                    if (var65 != null) {
                        int var66 = Integer.MAX_VALUE & (int) (var65.field4022 >>> 32);
                        if (var61 == 4 || var61 == 5) {
                            var65.field4023 = new class167(var66, 4, var60, class139.field2615, var57, var56, var58, false, var65.field4023);
                        } else if (var61 == 6) {
                            var65.field4023 = new class167(var66, 4, var60 + 4, class139.field2615, var57, var56, var58, false, var65.field4023);
                        } else if (var61 == 7) {
                            var65.field4023 = new class167(var66, 4, (var60 + 2 & 0x3) + 4, class139.field2615, var57, var56, var58, false, var65.field4023);
                        } else if (var61 == 8) {
                            var65.field4023 = new class167(var66, 4, var60 + 4, class139.field2615, var57, var56, var58, false, var65.field4023);
                            var65.field4019 = new class167(var66, 4, (var60 + 2 & 0x3) + 4, class139.field2615, var57, var56, var58, false, var65.field4019);
                        }
                    }
                }
                if (var62 == 2) {
                    if (var61 == 11) {
                        var61 = 10;
                    }
                    class78 var67 = class19.method116(class139.field2615, var57, var56);
                    if (var67 != null) {
                        var67.field1363 = new class167((int) (var67.field1355 >>> 32) & Integer.MAX_VALUE, var61, var60, class139.field2615, var57, var56, var58, false, var67.field1363);
                    }
                }
                if (var62 == 3) {
                    class15 var68 = class86.method537(class139.field2615, var57, var56);
                    if (var68 != null) {
                        var68.field227 = new class167((int) (var68.field210 >>> 32) & Integer.MAX_VALUE, 22, var60, class139.field2615, var57, var56, var58, false, var68.field227);
                    }
                }
            }
        } else {
            if (class173.field3235 == 133) {
                int var69 = class118.field2241.method716(-1308);
                int var70 = class22.field313 + (var69 >> 4 & 0x7);
                int var71 = (var69 & 0x7) + class73.field1214;
                int var72 = class118.field2241.method739(-127);
                if (var72 == 65535) {
                    var72 = -1;
                }
                int var73 = class118.field2241.method716(-1308);
                int var74 = var73 >> 4 & 0xF;
                int var75 = var73 & 0x7;
                int var76 = class118.field2241.method716(-1308);
                if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                    int var77 = var74 + 1;
                    if (var70 - var77 <= class210.field3854.field703[0] && var70 + var77 >= class210.field3854.field703[0] && var71 - var77 <= class210.field3854.field676[0] && class210.field3854.field676[0] <= var71 + var77 && class89.field1567 != 0 && var75 > 0 && class91.field1602 < 50 && var72 != -1) {
                        class59.field1010[class91.field1602] = var72;
                        class62.field1044[class91.field1602] = var75;
                        class118.field2242[class91.field1602] = var76;
                        class138.field2594[class91.field1602] = null;
                        class122.field2273[class91.field1602] = (var70 << 16) + (var71 << 8) + var74;
                        class91.field1602++;
                    }
                }
            }
            if (class173.field3235 == 73) {
                int var78 = class118.field2241.method716(-1308);
                int var79 = (var78 >> 4 & 0x7) + class22.field313;
                int var80 = class73.field1214 + (var78 & 0x7);
                int var81 = var79 + class118.field2241.method734(true);
                int var82 = class118.field2241.method734(true) + var80;
                int var83 = class118.field2241.method750(65280);
                int var84 = class118.field2241.method739(100);
                int var85 = class118.field2241.method716(arg0 ^ 0xFFFF8E7D) * 4;
                int var86 = class118.field2241.method716(-1308) * 4;
                int var87 = class118.field2241.method739(59);
                int var88 = class118.field2241.method739(arg0 - 29733);
                int var89 = class118.field2241.method716(-1308);
                int var90 = class118.field2241.method716(arg0 ^ 0xFFFF8E7D);
                if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104 && var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104 && var84 != 65535) {
                    int var91 = var82 * 128 + 64;
                    int var92 = var81 * 128 + 64;
                    int var93 = var79 * 128 + 64;
                    int var94 = var80 * 128 + 64;
                    class11 var95 = new class11(var84, class139.field2615, var93, var94, class195.method1239(var94, class139.field2615, false, var93) - var85, field460 + var87, field460 + var88, var89, var90, var83, var86);
                    var95.method54(1, var92, var87 + field460, -var86 + class195.method1239(var91, class139.field2615, false, var92), var91);
                    class200.field3697.method120(0, new class152(var95));
                }
            } else if (class173.field3235 == 155) {
                int var96 = class118.field2241.method753(false);
                int var97 = class118.field2241.method732((byte) 99);
                int var98 = class22.field313 + (var97 >> 4 & 0x7);
                int var99 = (var97 & 0x7) + class73.field1214;
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                    class19 var100 = class15.field216[class139.field2615][var98][var99];
                    if (var100 != null) {
                        for (class39 var101 = (class39) var100.method119(true); var101 != null; var101 = (class39) var100.method125((byte) -14)) {
                            if ((var96 & 0x7FFF) == var101.field634.field3620) {
                                var101.method995((byte) -23);
                                break;
                            }
                        }
                        if (var100.method119(true) == null) {
                            class15.field216[class139.field2615][var98][var99] = null;
                        }
                        class158.method1025(var99, var98, true);
                    }
                }
            } else if (class173.field3235 == 195) {
                int var102 = class118.field2241.method763(65280);
                int var103 = var102 >> 2;
                int var104 = class33.field530[var103];
                int var105 = class118.field2241.method711(arg0 ^ 0xFFFF8C64);
                int var106 = var102 & 0x3;
                int var107 = (var105 >> 4 & 0x7) + class22.field313;
                int var108 = class73.field1214 + (var105 & 0x7);
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    class152.method998(-1, var103, class139.field2615, -1, var108, var104, var106, 0, var107, 11056);
                }
            } else if (class173.field3235 == 15) {
                int var109 = class118.field2241.method730(1848);
                int var110 = class118.field2241.method716(-1308);
                int var111 = (var110 >> 4 & 0x7) + class22.field313;
                int var112 = class73.field1214 + (var110 & 0x7);
                int var113 = class118.field2241.method753(false);
                if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
                    class195 var114 = new class195();
                    var114.field3628 = var109;
                    var114.field3620 = var113;
                    if (class15.field216[class139.field2615][var111][var112] == null) {
                        class15.field216[class139.field2615][var111][var112] = new class19();
                    }
                    class15.field216[class139.field2615][var111][var112].method120(arg0 ^ 0x7499, new class39(var114));
                    class158.method1025(var112, var111, true);
                }
            } else if (class173.field3235 == 225) {
                int var115 = class118.field2241.method716(-1308);
                int var116 = (var115 >> 4 & 0x7) + class22.field313;
                int var117 = (var115 & 0x7) + class73.field1214;
                int var118 = class118.field2241.method739(-124);
                int var119 = class118.field2241.method716(arg0 ^ 0xFFFF8E7D);
                int var120 = class118.field2241.method739(-127);
                if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                    int var121 = var116 * 128 + 64;
                    int var122 = var117 * 128 + 64;
                    class97 var123 = new class97(var118, class139.field2615, var121, var122, class195.method1239(var122, class139.field2615, false, var121) - var119, var120, field460);
                    class181.field3325.method120(0, new class105(var123));
                }
            } else if (arg0 != 29849) {
                method218((byte) -4);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)V")
    public static final void method217(byte arg0, int arg1, int arg2) {
        if (arg0 != -99) {
            field460 = 96;
        }
        class182 var3 = class234.method1482((byte) 117, arg2);
        field472++;
        int var4 = var3.field3337;
        int var5 = var3.field3347;
        int var6 = var3.field3340;
        int var7 = class236.field4285[var6 - var4];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var4;
        class77.field1315[var5] = class219.method1368(class75.method450(var8, arg1 << var4), class75.method450(class77.field1315[var5], ~var8));
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static void method218(byte arg0) {
        field468 = null;
        field462 = null;
        field466 = null;
        field475 = null;
        field461 = null;
        field476 = null;
        field459 = null;
        field477 = null;
        field465 = null;
        int var1 = -73 / ((arg0 - 50) / 56);
        field473 = null;
        field470 = null;
        field463 = null;
        field471 = null;
        field467 = null;
    }
}
