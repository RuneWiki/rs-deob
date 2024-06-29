import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class150 {

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "J")
    public static long field2345 = 0L;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Lwb;")
    public static class123 field2343 = null;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Leh;")
    public static class137 field2341;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BII)I")
    public static final int method1036(byte arg0, int arg1, int arg2) {
        field2340++;
        if (arg0 != -75) {
            return 50;
        }
        int var3 = 0;
        while (arg1 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg1--;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static final void method1037(byte arg0) {
        field2346++;
        if (class152.field2363 == 49) {
            int var1 = class96.field1283.method548(118);
            int var2 = class96.field1283.method583(arg0 ^ 0x5D);
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = class115.field1645[var3];
            int var6 = class96.field1283.method563(255);
            int var7 = class265.field4266 + ((var6 & 0x7C) >> 4);
            int var8 = class9.field106 + (var6 & 0x7);
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                class104.method633(true, var7, var3, var4, class244.field4011, var8, var1, var5, 0, -1);
            }
        } else if (class152.field2363 == 195) {
            int var9 = class96.field1283.method549(arg0 ^ 0xFFFFFF5D);
            int var10 = class96.field1283.method584(255);
            class256.method1749(var9, 0).method1623(-26708, var10);
        } else if (class152.field2363 == 229) {
            int var11 = class96.field1283.method584(arg0 + 349);
            int var12 = class265.field4266 * 2 + ((var11 & 0xF5) >> 4);
            int var13 = (var11 & 0xF) + class9.field106 * 2;
            int var14 = var12 + class96.field1283.method587(arg0 + 218);
            int var15 = class96.field1283.method587(109) + var13;
            int var16 = class96.field1283.method564(-106);
            int var17 = class96.field1283.method549(255);
            int var18 = class96.field1283.method584(arg0 ^ 0xFFFFFF5D) * 4;
            int var19 = class96.field1283.method584(255) * 4;
            int var20 = class96.field1283.method549(arg0 ^ 0xFFFFFF5D);
            int var21 = class96.field1283.method549(255);
            int var22 = class96.field1283.method584(arg0 ^ 0xFFFFFF5D);
            if (var22 == 255) {
                var22 = -1;
            }
            int var23 = class96.field1283.method584(arg0 ^ 0xFFFFFF5D);
            if (var12 >= 0 && var13 >= 0 && var12 < 208 && var13 < 208 && var14 >= 0 && var15 >= 0 && var14 < 208 && var15 < 208 && var17 != 65535) {
                int var24 = var12 * 64;
                int var25 = var13 * 64;
                int var26 = var15 * 64;
                class101 var27 = new class101(var17, class244.field4011, var24, var25, class166.method1148(class244.field4011, var24, var25, (byte) 122) - var18, var20 - -class73.field924, class73.field924 + var21, var22, var23, var16, var19);
                int var28 = var14 * 64;
                var27.method620(class73.field924 + var20, var28, class166.method1148(class244.field4011, var28, var26, (byte) -100) - var19, var26, (byte) 55);
                class196.field3122.method1803(new class117(var27), -1);
            }
        } else if (class152.field2363 == 239) {
            int var29 = class96.field1283.method548(113);
            int var30 = class96.field1283.method583(-1);
            int var31 = (var30 >> 4 & 0x7) + class265.field4266;
            int var32 = (var30 & 0x7) + class9.field106;
            int var33 = class96.field1283.method562((byte) -18);
            int var34 = class96.field1283.method562((byte) -18);
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && class185.field2958 != var34) {
                class18 var35 = new class18();
                var35.field222 = var33;
                var35.field216 = var29;
                if (class206.field3296[class244.field4011][var31][var32] == null) {
                    class206.field3296[class244.field4011][var31][var32] = new class269();
                }
                class206.field3296[class244.field4011][var31][var32].method1803(new class226(var35), -1);
                class40.method221(var32, -112, var31);
            }
        } else if (class152.field2363 == 246) {
            int var36 = class96.field1283.method584(arg0 + 349);
            int var37 = (var36 >> 4 & 0x7) + class265.field4266;
            int var38 = class9.field106 + (var36 & 0x7);
            int var39 = class96.field1283.method549(255);
            int var40 = class96.field1283.method584(255);
            int var41 = class96.field1283.method549(255);
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                int var42 = var38 * 128 + 64;
                int var43 = var37 * 128 + 64;
                class71 var44 = new class71(var39, class244.field4011, var43, var42, class166.method1148(class244.field4011, var43, var42, (byte) -104) - var40, var41, class73.field924);
                class272.field4346.method1803(new class130(var44), -1);
            }
        } else if (class152.field2363 == 87) {
            int var45 = class96.field1283.method562((byte) -18);
            int var46 = class96.field1283.method583(arg0 ^ 0x5D);
            int var47 = class265.field4266 + (var46 >> 4 & 0x7);
            int var48 = class9.field106 + (var46 & 0x7);
            int var49 = class96.field1283.method549(255);
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                class18 var50 = new class18();
                var50.field216 = var45;
                var50.field222 = var49;
                if (class206.field3296[class244.field4011][var47][var48] == null) {
                    class206.field3296[class244.field4011][var47][var48] = new class269();
                }
                class206.field3296[class244.field4011][var47][var48].method1803(new class226(var50), arg0 ^ 0x5D);
                class40.method221(var48, -123, var47);
            }
        } else if (class152.field2363 == 222) {
            int var51 = class96.field1283.method584(arg0 + 349);
            int var52 = ((var51 & 0xFD) >> 4) + class265.field4266 * 2;
            int var53 = class9.field106 * 2 + (var51 & 0xF);
            int var54 = var52 + class96.field1283.method587(arg0 ^ 0xFFFFFFDC);
            int var55 = var53 + class96.field1283.method587(124);
            int var56 = class96.field1283.method564(-72);
            int var57 = class96.field1283.method564(-109);
            int var58 = class96.field1283.method549(arg0 + 349);
            int var59 = class96.field1283.method587(108);
            int var60 = class96.field1283.method584(arg0 ^ 0xFFFFFF5D) * 4;
            int var61 = class96.field1283.method549(255);
            int var62 = class96.field1283.method549(255);
            int var63 = class96.field1283.method584(arg0 + 349);
            if (var63 == 255) {
                var63 = -1;
            }
            int var64 = class96.field1283.method584(arg0 + 349);
            if (var52 >= 0 && var53 >= 0 && var52 < 208 && var53 < 208 && var54 >= 0 && var55 >= 0 && var54 < 208 && var55 < 208 && var58 != 65535) {
                int var65 = var54 * 64;
                int var66 = var53 * 64;
                int var67 = var52 * 64;
                int var68 = var55 * 64;
                if (var56 != 0) {
                    int var70;
                    class230 var72;
                    if (var56 < 0) {
                        int var69 = -var56 - 1;
                        var70 = (var69 & 0x7D7B) >> 11;
                        int var71 = var69 & 0x7FF;
                        if (class185.field2958 == var71) {
                            var72 = class286.field4571;
                        } else {
                            var72 = class89.field1113[var71];
                        }
                    } else {
                        int var73 = var56 - 1;
                        var70 = var73 >> 11 & 0xF;
                        int var74 = var73 & 0x7FF;
                        var72 = class265.field4273[var74];
                    }
                    if (var72 != null) {
                        class154 var75 = var72.method1636(0);
                        if (var75.field2415 != null && var75.field2415[var70] != null) {
                            int var76 = var75.field2415[var70][0];
                            var59 -= var75.field2415[var70][1];
                            int var77 = var75.field2415[var70][2];
                            int var78 = class174.field2753[var72.field3751];
                            int var79 = class174.field2759[var72.field3751];
                            int var80 = var76 * var79 + var77 * var78 >> 16;
                            int var81 = var77 * var79 - (var76 * var78) >> 16;
                            var67 += var80;
                            var66 += var81;
                        }
                    }
                }
                class101 var83 = new class101(var58, class244.field4011, var67, var66, class166.method1148(class244.field4011, var67, var66, (byte) 70) - var59, class73.field924 + var61, class73.field924 + var62, var63, var64, var57, var60);
                var83.method620(class73.field924 + var61, var65, class166.method1148(class244.field4011, var65, var68, (byte) -114) - var60, var68, (byte) 86);
                class196.field3122.method1803(new class117(var83), -1);
            }
        } else if (class152.field2363 == 203) {
            int var84 = class96.field1283.method563(arg0 ^ 0xFFFFFF5D);
            int var85 = (var84 >> 4 & 0x7) + class265.field4266;
            int var86 = (var84 & 0x7) + class9.field106;
            int var87 = class96.field1283.method549(255);
            if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                class269 var88 = class206.field3296[class244.field4011][var85][var86];
                if (var88 != null) {
                    for (class226 var89 = (class226) var88.method1802(arg0 ^ 0xFFFFFF89); var89 != null; var89 = (class226) var88.method1815(0)) {
                        if ((var87 & 0x7FFF) == var89.field3629.field222) {
                            var89.method1673(14510);
                            break;
                        }
                    }
                    if (var88.method1802(arg0 + 137) == null) {
                        class206.field3296[class244.field4011][var85][var86] = null;
                    }
                    class40.method221(var86, -91, var85);
                }
            }
        } else {
            if (class152.field2363 == 69) {
                int var90 = class96.field1283.method570((byte) -13);
                int var91 = class96.field1283.method562((byte) -18);
                byte var92 = class96.field1283.method593(122);
                int var93 = class96.field1283.method563(255);
                int var94 = var93 >> 2;
                int var95 = var93 & 0x3;
                int var96 = class96.field1283.method563(255);
                int var97 = ((var96 & 0x7E) >> 4) + class265.field4266;
                int var98 = (var96 & 0x7) + class9.field106;
                byte var99 = class96.field1283.method567(69);
                byte var100 = class96.field1283.method560((byte) 111);
                byte var101 = class96.field1283.method593(127);
                int var102 = class96.field1283.method549(arg0 + 349);
                int var103 = class96.field1283.method562((byte) -18);
                class74.method421(var90, var94, var91, var99, var103, var101, var98, var97, arg0 + 1997, var95, var100, var102, var92);
            }
            if (class152.field2363 == 180) {
                int var104 = class96.field1283.method584(255);
                int var105 = (var104 & 0x7) + class9.field106;
                int var106 = class265.field4266 + ((var104 & 0x74) >> 4);
                int var107 = class96.field1283.method549(255);
                if (var107 == 65535) {
                    var107 = -1;
                }
                int var108 = class96.field1283.method584(255);
                int var109 = var108 >> 4 & 0xF;
                int var110 = var108 & 0x7;
                int var111 = class96.field1283.method584(255);
                int var112 = class96.field1283.method584(255);
                if (var106 >= 0 && var105 >= 0 && var106 < 104 && var105 < 104) {
                    int var113 = var109 + 1;
                    if (class286.field4571.field3829[0] >= (var106 - var113) && var106 + var113 >= class286.field4571.field3829[0] && class286.field4571.field3836[0] >= var105 - var113 && (var105 + var113) >= class286.field4571.field3836[0] && class63.field818 != 0 && var110 > 0 && class288.field4599 < 50 && var107 != -1) {
                        class4.field63[class288.field4599] = var107;
                        class275.field4399[class288.field4599] = var110;
                        class77.field971[class288.field4599] = var111;
                        class220.field3526[class288.field4599] = null;
                        class206.field3282[class288.field4599] = (var106 << 16) + (var105 << 8) + var109;
                        class68.field858[class288.field4599] = var112;
                        class288.field4599++;
                    }
                }
            } else if (class152.field2363 == 170) {
                int var114 = class96.field1283.method584(255);
                int var115 = (var114 >> 4 & 0x7) + class265.field4266;
                int var116 = (var114 & 0x7) + class9.field106;
                int var117 = class96.field1283.method587(-120) + var115;
                int var118 = class96.field1283.method587(arg0 ^ 0xFFFFFFD3) + var116;
                int var119 = class96.field1283.method564(arg0 + 4);
                int var120 = class96.field1283.method549(255);
                int var121 = class96.field1283.method584(255) * 4;
                int var122 = class96.field1283.method584(255) * 4;
                int var123 = class96.field1283.method549(255);
                int var124 = class96.field1283.method549(arg0 + 349);
                int var125 = class96.field1283.method584(arg0 + 349);
                if (var125 == 255) {
                    var125 = -1;
                }
                int var126 = class96.field1283.method584(255);
                if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104 && var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104 && var120 != 65535) {
                    int var127 = var117 * 128 + 64;
                    int var128 = var116 * 128 + 64;
                    int var129 = var115 * 128 + 64;
                    int var130 = var118 * 128 + 64;
                    class101 var131 = new class101(var120, class244.field4011, var129, var128, class166.method1148(class244.field4011, var129, var128, (byte) 95) - var121, var123 - -class73.field924, class73.field924 + var124, var125, var126, var119, var122);
                    var131.method620(var123 + class73.field924, var127, class166.method1148(class244.field4011, var127, var130, (byte) -104) - var122, var130, (byte) 109);
                    class196.field3122.method1803(new class117(var131), arg0 + 93);
                }
            } else if (class152.field2363 == 112) {
                int var132 = class96.field1283.method584(255);
                int var133 = ((var132 & 0x72) >> 4) + class265.field4266;
                int var134 = (var132 & 0x7) + class9.field106;
                int var135 = class96.field1283.method549(255);
                int var136 = class96.field1283.method549(arg0 ^ 0xFFFFFF5D);
                int var137 = class96.field1283.method549(255);
                if (var133 >= 0 && var134 >= 0 && var133 < 104 && var134 < 104) {
                    class269 var138 = class206.field3296[class244.field4011][var133][var134];
                    if (var138 != null) {
                        for (class226 var139 = (class226) var138.method1802(43); var139 != null; var139 = (class226) var138.method1815(arg0 + 94)) {
                            class18 var140 = var139.field3629;
                            if ((var135 & 0x7FFF) == var140.field222 && var140.field216 == var136) {
                                var140.field216 = var137;
                                break;
                            }
                        }
                        class40.method221(var134, -90, var133);
                    }
                }
            } else {
                if (arg0 != -94) {
                    field2341 = null;
                }
                if (class152.field2363 == 99) {
                    int var141 = class96.field1283.method583(-1);
                    int var142 = var141 >> 2;
                    int var143 = class115.field1645[var142];
                    int var144 = var141 & 0x3;
                    int var145 = class96.field1283.method584(255);
                    int var146 = class265.field4266 + ((var145 & 0x75) >> 4);
                    int var147 = (var145 & 0x7) + class9.field106;
                    if (var146 >= 0 && var147 >= 0 && var146 < 104 && var147 < 104) {
                        class104.method633(true, var146, var142, var144, class244.field4011, var147, -1, var143, 0, -1);
                    }
                } else if (class152.field2363 == 52) {
                    int var148 = class96.field1283.method548(111);
                    int var149 = class96.field1283.method584(255);
                    if (var148 == 65535) {
                        var148 = -1;
                    }
                    int var150 = var149 >> 2;
                    int var151 = var149 & 0x3;
                    int var152 = class115.field1645[var150];
                    int var153 = class96.field1283.method585(255);
                    int var154 = class265.field4266 + ((var153 & 0x76) >> 4);
                    int var155 = (var153 & 0x7) + class9.field106;
                    class266.method1790(class244.field4011, var151, var155, Integer.MAX_VALUE, var148, var150, var152, var154);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method1038(int arg0) {
        field2343 = null;
        field2341 = null;
        if (arg0 != 18458) {
            field2345 = 74L;
        }
    }
}
