import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class184 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "J")
    public long field3141 = 0L;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field3157 = 0;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "Ldh;")
    public static class159 field3146 = new class159(512);

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "D")
    public static double field3158 = -1.0D;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "Lcd;")
    public static class64 field3159 = class44.method335((byte) 71, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public int field3145;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public int field3154;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public int field3156;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "Lqm;")
    public static class222 field3148;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "La;")
    public class262 field3143;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "La;")
    public class262 field3151;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "[Lqd;")
    public static class40[] field3150;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "[[[I")
    public static int[][][] field3155;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V", line = 8)
    public static void method1294(boolean arg0) {
        field3146 = null;
        field3150 = null;
        field3159 = null;
        if (arg0) {
            method1295(-4, -18);
        }
        field3155 = (int[][][]) null;
        field3148 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V", line = 58)
    public static final void method1295(int arg0, int arg1) {
        if (arg0 == -464486940) {
            field3144++;
            class77.field1447.method1197((byte) 81, arg1);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 74)
    public static final void method1296(int arg0) {
        field3153++;
        if (class274.field4709 == 82) {
            byte var1 = class108.field1991.method150((byte) 109);
            int var2 = class108.field1991.method120(arg0 ^ 0x82);
            int var3 = class108.field1991.method120(2);
            int var4 = class108.field1991.method110(arg0 ^ 0x314D);
            int var5 = ((var4 & 0x70) >> 4) + class270.field4658;
            int var6 = (var4 & 0x7) + class89.field1613;
            byte var7 = class108.field1991.method159(0);
            int var8 = class108.field1991.method112((byte) 92);
            byte var9 = class108.field1991.method159(0);
            byte var10 = class108.field1991.method140(arg0 - 132);
            int var11 = class108.field1991.method110(12749);
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = class65.field1303[var12];
            int var15 = class108.field1991.method120(2);
            class41 var16;
            if (class149.field2632 == var8) {
                var16 = class139.field2472;
            } else {
                var16 = class284.field4888[var8];
            }
            if (!class123.field2216 && var16 != null) {
                class290 var17 = class172.method1207(var2, arg0 ^ 0xFFFFFF07);
                int var18;
                int var19;
                if (var13 == 1 || var13 == 3) {
                    var18 = var17.field4957;
                    var19 = var17.field5017;
                } else {
                    var18 = var17.field5017;
                    var19 = var17.field4957;
                }
                int var20 = (var18 >> 1) + var5;
                int var21 = (var19 + 1 >> 1) + var6;
                int var22 = (var19 >> 1) + var6;
                int[][] var23 = class96.field1764[class20.field364];
                int[][] var24 = (int[][]) null;
                if (class20.field364 < 3) {
                    var24 = class96.field1764[class20.field364 + 1];
                }
                int var25 = (var18 + 1 >> 1) + var5;
                int var26 = (var5 << 7) + (var18 << 6);
                int var27 = (var6 << 7) + (var19 << 6);
                int var28 = var23[var20][var21] + var23[var25][var22] + var23[var20][var22] + var23[var25][var21] >> 2;
                class1 var29 = var17.method2000(var27, var23, -1, (class176) null, var26, var17.field5013, false, var24, var12, var28, var13);
                if (var29 != null) {
                    if (var7 > var10) {
                        byte var30 = var7;
                        var7 = var10;
                        var10 = var30;
                    }
                    if (var9 < var1) {
                        byte var31 = var1;
                        var1 = var9;
                        var9 = var31;
                    }
                    class71.method581(var15 + 1, class20.field364, var6, 0, 26032, 0, -1, var5, var3 + 1, var14);
                    var16.field674 = var5 + var10;
                    var16.field655 = var6 * 128 + var19 * 64;
                    var16.field669 = var28;
                    var16.field673 = var6 + var9;
                    var16.field647 = var1 + var6;
                    var16.field668 = var5 * 128 + var18 * 64;
                    var16.field654 = class29.field482 + var3;
                    var16.field664 = (class243) var29.field6;
                    var16.field648 = var15 + class29.field482;
                    var16.field635 = var5 + var7;
                }
            }
        }
        if (class274.field4709 == 168) {
            int var32 = class108.field1991.method152((byte) -125);
            int var33 = ((var32 & 0x76) >> 4) + class270.field4658;
            int var34 = (var32 & 0x7) + class89.field1613;
            int var35 = class108.field1991.method112((byte) 92);
            int var36 = class108.field1991.method152((byte) -89);
            int var37 = class108.field1991.method112((byte) 92);
            if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                int var38 = var34 * 128 + 64;
                int var39 = var33 * 128 + 64;
                class267 var40 = new class267(var35, class20.field364, var39, var38, class15.method169(var38, 13257, class20.field364, var39) - var36, var37, class29.field482);
                class151.field2687.method781(new class227(var40), 10751);
            }
        } else if (class274.field4709 == 83) {
            int var41 = class108.field1991.method101(128);
            int var42 = (var41 & 0x7) + class89.field1613;
            int var43 = (var41 >> 4 & 0x7) + class270.field4658;
            int var44 = class108.field1991.method108((byte) 82);
            if (var43 >= 0 && var42 >= 0 && var43 < 104 && var42 < 104) {
                class106 var45 = class274.field4712[class20.field364][var43][var42];
                if (var45 != null) {
                    for (class258 var46 = (class258) var45.method778(arg0 ^ 0x80); var46 != null; var46 = (class258) var45.method775(26517)) {
                        if ((var44 & 0x7FFF) == var46.field4459.field2742) {
                            var46.method232(128);
                            break;
                        }
                    }
                    if (var45.method778(0) == null) {
                        class274.field4712[class20.field364][var43][var42] = null;
                    }
                    class227.method1642(-17700, var43, var42);
                }
            }
        } else if (class274.field4709 == 63) {
            int var47 = class108.field1991.method152((byte) -76);
            int var48 = class89.field1613 * 2 + (var47 & 0xF);
            int var49 = class270.field4658 * 2 + ((var47 & 0xF5) >> 4);
            int var50 = var49 + class108.field1991.method150((byte) 107);
            int var51 = var48 + class108.field1991.method150((byte) 97);
            int var52 = class108.field1991.method153(arg0 ^ 0xCE);
            int var53 = class108.field1991.method112((byte) 92);
            int var54 = class108.field1991.method152((byte) -69) * 4;
            int var55 = class108.field1991.method152((byte) -125) * 4;
            int var56 = class108.field1991.method112((byte) 92);
            int var57 = class108.field1991.method112((byte) 92);
            int var58 = class108.field1991.method152((byte) -80);
            int var59 = class108.field1991.method152((byte) -87);
            if (var49 >= 0 && var48 >= 0 && var49 < 208 && var48 < 208 && var50 >= 0 && var51 >= 0 && var50 < 208 && var51 < 208 && var53 != 65535) {
                int var60 = var51 * 64;
                int var61 = var50 * 64;
                int var62 = var49 * 64;
                int var63 = var48 * 64;
                class59 var64 = new class59(var53, class20.field364, var62, var63, class15.method169(var63, 13257, class20.field364, var62) - var54, class29.field482 + var56, class29.field482 + var57, var58, var59, var52, var55);
                var64.method453(var60, var61, -6924, class29.field482 + var56, -var55 + class15.method169(var60, 13257, class20.field364, var61));
                class227.field3865.method781(new class164(var64), 10751);
            }
        } else if (class274.field4709 == 112) {
            int var65 = class108.field1991.method152((byte) -127);
            int var66 = (var65 >> 4 & 0x7) + class270.field4658;
            int var67 = (var65 & 0x7) + class89.field1613;
            int var68 = class108.field1991.method112((byte) 92);
            int var69 = class108.field1991.method112((byte) 92);
            int var70 = class108.field1991.method112((byte) 92);
            if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                class106 var71 = class274.field4712[class20.field364][var66][var67];
                if (var71 != null) {
                    for (class258 var72 = (class258) var71.method778(0); var72 != null; var72 = (class258) var71.method775(26517)) {
                        class155 var73 = var72.field4459;
                        if ((var68 & 0x7FFF) == var73.field2742 && var73.field2740 == var69) {
                            var73.field2740 = var70;
                            break;
                        }
                    }
                    class227.method1642(-17700, var66, var67);
                }
            }
        } else if (arg0 == 128) {
            if (class274.field4709 == 111) {
                int var129 = class108.field1991.method108((byte) -122);
                int var130 = class108.field1991.method152((byte) -118);
                int var131 = class270.field4658 + ((var130 & 0x7F) >> 4);
                int var132 = (var130 & 0x7) + class89.field1613;
                int var133 = class108.field1991.method101(128);
                int var134 = var133 >> 2;
                int var135 = class65.field1303[var134];
                int var136 = var133 & 0x3;
                if (var131 >= 0 && var132 >= 0 && var131 < 104 && var132 < 104) {
                    class71.method581(0, class20.field364, var132, var134, 26032, var136, var129, var131, -1, var135);
                }
            } else if (class274.field4709 == 238) {
                int var121 = class108.field1991.method120(2);
                int var122 = class108.field1991.method110(12749);
                int var123 = var122 >> 2;
                int var124 = class65.field1303[var123];
                int var125 = var122 & 0x3;
                int var126 = class108.field1991.method101(128);
                if (var121 == 65535) {
                    var121 = -1;
                }
                int var127 = (var126 & 0x7) + class89.field1613;
                int var128 = class270.field4658 + ((var126 & 0x73) >> 4);
                class216.method1519(var125, var121, class20.field364, var124, arg0 ^ 0xF2, var128, var123, var127);
            } else if (class274.field4709 == 189) {
                int var74 = class108.field1991.method152((byte) -115);
                int var75 = (var74 >> 4 & 0x7) + class270.field4658;
                int var76 = (var74 & 0x7) + class89.field1613;
                int var77 = var75 + class108.field1991.method150((byte) 92);
                int var78 = var76 + class108.field1991.method150((byte) 120);
                int var79 = class108.field1991.method153(94);
                int var80 = class108.field1991.method112((byte) 92);
                int var81 = class108.field1991.method152((byte) -110) * 4;
                int var82 = class108.field1991.method152((byte) -95) * 4;
                int var83 = class108.field1991.method112((byte) 92);
                int var84 = class108.field1991.method112((byte) 92);
                int var85 = class108.field1991.method152((byte) -89);
                int var86 = class108.field1991.method152((byte) -122);
                if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104 && var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104 && var80 != 65535) {
                    int var87 = var77 * 128 + 64;
                    int var88 = var75 * 128 + 64;
                    int var89 = var76 * 128 + 64;
                    int var90 = var78 * 128 + 64;
                    class59 var91 = new class59(var80, class20.field364, var88, var89, class15.method169(var89, 13257, class20.field364, var88) - var81, class29.field482 + var83, class29.field482 + var84, var85, var86, var79, var82);
                    var91.method453(var90, var87, -6924, class29.field482 + var83, -var82 + class15.method169(var90, 13257, class20.field364, var87));
                    class227.field3865.method781(new class164(var91), 10751);
                }
            } else if (class274.field4709 == 165) {
                int var92 = class108.field1991.method108((byte) -128);
                int var93 = class108.field1991.method110(12749);
                int var94 = (var93 & 0x7) + class89.field1613;
                int var95 = (var93 >> 4 & 0x7) + class270.field4658;
                int var96 = class108.field1991.method120(arg0 ^ 0x82);
                int var97 = class108.field1991.method120(2);
                if (var95 >= 0 && var94 >= 0 && var95 < 104 && var94 < 104 && class149.field2632 != var92) {
                    class155 var98 = new class155();
                    var98.field2742 = var96;
                    var98.field2740 = var97;
                    if (class274.field4712[class20.field364][var95][var94] == null) {
                        class274.field4712[class20.field364][var95][var94] = new class106();
                    }
                    class274.field4712[class20.field364][var95][var94].method781(new class258(var98), 10751);
                    class227.method1642(-17700, var95, var94);
                }
            } else if (class274.field4709 == 242) {
                int var112 = class108.field1991.method152((byte) -122);
                int var113 = class270.field4658 + (var112 >> 4 & 0x7);
                int var114 = (var112 & 0x7) + class89.field1613;
                int var115 = class108.field1991.method112((byte) 92);
                if (var115 == 65535) {
                    var115 = -1;
                }
                int var116 = class108.field1991.method152((byte) -87);
                int var117 = var116 & 0x7;
                int var118 = var116 >> 4 & 0xF;
                int var119 = class108.field1991.method152((byte) -84);
                if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                    int var120 = var118 + 1;
                    if (var113 - var120 <= class139.field2472.field1876[0] && class139.field2472.field1876[0] <= var113 + var120 && (var114 - var120) <= class139.field2472.field1898[0] && class139.field2472.field1898[0] <= (var114 + var120) && class106.field1960 != 0 && var117 > 0 && class307.field5248 < 50 && var115 != -1) {
                        class195.field3333[class307.field5248] = var115;
                        class119.field2161[class307.field5248] = var117;
                        class295.field5067[class307.field5248] = var119;
                        class132.field2352[class307.field5248] = null;
                        class273.field4697[class307.field5248] = (var114 << 8) + (var113 << 16) + var118;
                        class307.field5248++;
                    }
                }
            } else if (class274.field4709 == 222) {
                int var99 = class108.field1991.method110(12749);
                int var100 = class270.field4658 + ((var99 & 0x72) >> 4);
                int var101 = (var99 & 0x7) + class89.field1613;
                int var102 = class108.field1991.method110(arg0 ^ 0x314D);
                int var103 = var102 >> 2;
                int var104 = var102 & 0x3;
                int var105 = class65.field1303[var103];
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                    class71.method581(0, class20.field364, var101, var103, arg0 + 25904, var104, -1, var100, -1, var105);
                }
            } else if (class274.field4709 == 116) {
                int var106 = class108.field1991.method112((byte) 92);
                int var107 = class108.field1991.method118(-103);
                int var108 = class108.field1991.method133(-128);
                int var109 = (var108 >> 4 & 0x7) + class270.field4658;
                int var110 = (var108 & 0x7) + class89.field1613;
                if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                    class155 var111 = new class155();
                    var111.field2742 = var107;
                    var111.field2740 = var106;
                    if (class274.field4712[class20.field364][var109][var110] == null) {
                        class274.field4712[class20.field364][var109][var110] = new class106();
                    }
                    class274.field4712[class20.field364][var109][var110].method781(new class258(var111), 10751);
                    class227.method1642(-17700, var109, var110);
                }
            }
        }
    }
}
