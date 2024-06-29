import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class223 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "[I")
    public static int[] field3286 = new int[4096];

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Z")
    public static boolean field3289;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)I")
    public static final int method1527(int arg0, byte arg1) {
        field3288++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg0 & 0xFFD9) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = 96 % ((1 - arg1) / 61);
        int var22 = (int) (var14 * 256.0D);
        int var23 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var22 >>= 0x4;
        } else if (var23 > 217) {
            var22 >>= 0x3;
        } else if (var23 > 192) {
            var22 >>= 0x2;
        } else if (var23 > 179) {
            var22 >>= 0x1;
        }
        return (var23 >> 1) + ((var20 & 0xFF) >> 2 << 10) + (var22 >> 5 << 7);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZLso;)V")
    public static final void method1528(boolean arg0, class327 arg1) {
        field3287++;
        if (class60.field891 == arg1) {
            int var2 = class66.field1009.method1469(128);
            int var3 = class27.field286 + (var2 >> 4 & 0x7);
            int var4 = class37.field394 + (var2 & 0x7);
            int var5 = class66.field1009.method1424((byte) 114);
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = class260.field3836[var6];
            if (class482.method2859(class474.field6982, (byte) -75) || var3 >= 0 && var4 >= 0 && var3 < class30.field323 && class182.field2661 > var4) {
                class93.method536(var6, -1, var3, var7, 0, var8, -1, (byte) 57, class314.field4479, var4);
            }
        } else if (class40.field583 == arg1) {
            int var9 = class66.field1009.method1450((byte) 114);
            int var10 = class66.field1009.method1428(32122);
            class252.field3743.method2686(var9, (byte) 99).method3062((byte) -76, var10);
        } else if (class442.field6595 == arg1) {
            int var11 = class66.field1009.method1428(32122);
            int var12 = class27.field286 + ((var11 & 0x76) >> 4);
            int var13 = (var11 & 0x7) + class37.field394;
            int var14 = class66.field1009.method1450((byte) 37);
            if (var14 == 65535) {
                var14 = -1;
            }
            int var15 = class66.field1009.method1428(32122);
            int var16 = var15 >> 4 & 0xF;
            int var17 = var15 & 0x7;
            int var18 = class66.field1009.method1428(32122);
            int var19 = class66.field1009.method1428(32122);
            if (var12 >= 0 && var13 >= 0 && var12 < class30.field323 && class182.field2661 > var13) {
                int var20 = var16 + 1;
                if ((var12 - var20) <= class500.field7365.field1997[0] && var12 + var20 >= class500.field7365.field1997[0] && class500.field7365.field1996[0] >= (var13 - var20) && class500.field7365.field1996[0] <= (var13 + var20)) {
                    class435.method2617((class314.field4479 << 24) + (var12 << 16) + (var13 << 8) + var16, var14, var19, var17, 0, var18);
                }
            }
        } else if (class489.field7225 == arg1) {
            int var21 = class66.field1009.method1469(128);
            int var22 = var21 >> 2;
            int var23 = var21 & 0x3;
            int var24 = class260.field3836[var22];
            int var25 = class66.field1009.method1424((byte) 121);
            int var26 = ((var25 & 0x76) >> 4) + class27.field286;
            int var27 = (var25 & 0x7) + class37.field394;
            int var28 = class66.field1009.method1451((byte) -47);
            if (var28 == 65535) {
                var28 = -1;
            }
            class229.method1574(var24, var22, -89, var27, var26, var28, class314.field4479, var23);
        } else if (class352.field5397 == arg1) {
            int var29 = class66.field1009.method1428(32122);
            int var30 = class27.field286 + ((var29 & 0x76) >> 4);
            int var31 = class37.field394 + (var29 & 0x7);
            int var32 = class66.field1009.method1450((byte) 75);
            int var33 = class66.field1009.method1428(32122);
            int var34 = class66.field1009.method1450((byte) 119);
            int var35 = class66.field1009.method1428(32122);
            if (var30 >= 0 && var31 >= 0 && var30 < class30.field323 && var31 < class182.field2661) {
                int var36 = var30 * 128 + 64;
                int var37 = var31 * 128 + 64;
                int var38 = class314.field4479;
                if (var38 < 3 && class57.method347(var31, var30, arg0)) {
                    var38++;
                }
                class417 var39 = new class417(var32, var34, class317.field4559, class314.field4479, var38, var36, class377.method2316(var37, false, var36, class314.field4479) - var33, var37, var30, var30, var31, var31, var35);
                class100.field1459.method809(new class214(var39), false);
            }
        } else if (class38.field561 == arg1) {
            class66.field1009.method1428(32122);
            int var40 = class66.field1009.method1428(32122);
            int var41 = (var40 >> 4 & 0x7) + class27.field286;
            int var42 = (var40 & 0x7) + class37.field394;
            int var43 = class66.field1009.method1450((byte) 38);
            int var44 = class66.field1009.method1428(32122);
            int var45 = class66.field1009.method1458((byte) -10);
            String var46 = class66.field1009.method1449(86);
            class116.method772(class314.field4479, var42, var46, var45, var44, var43, 0, var41);
        } else {
            if (!arg0) {
                field3286 = null;
            }
            if (class400.field6007 == arg1) {
                int var47 = class66.field1009.method1450((byte) 78);
                int var48 = class66.field1009.method1428(32122);
                int var49 = class27.field286 + ((var48 & 0x71) >> 4);
                int var50 = (var48 & 0x7) + class37.field394;
                if (var49 >= 0 && var50 >= 0 && var49 < class30.field323 && var50 < class182.field2661) {
                    class84 var51 = (class84) class176.field2591.method2605(false, (long) (var49 | class314.field4479 << 28 | var50 << 14));
                    if (var51 != null) {
                        for (class237 var52 = (class237) var51.field1291.method816(117); var52 != null; var52 = (class237) var51.field1291.method812(115)) {
                            if ((var47 & 0x7FFF) == var52.field3491) {
                                var52.method2049(-69);
                                break;
                            }
                        }
                        if (var51.field1291.method823((byte) 63)) {
                            var51.method2049(-100);
                        }
                        class326.method2015((byte) -121, class314.field4479, var49, var50);
                    }
                }
            } else if (class480.field7046 == arg1) {
                int var53 = class66.field1009.method1451((byte) -47);
                int var54 = class66.field1009.method1451((byte) -47);
                int var55 = class66.field1009.method1469(128);
                int var56 = (var55 >> 4 & 0x7) + class27.field286;
                int var57 = (var55 & 0x7) + class37.field394;
                if (var56 >= 0 && var57 >= 0 && class30.field323 > var56 && class182.field2661 > var57) {
                    class227.method1552(var56, var57, (byte) -62, class314.field4479, new class237(var53, var54));
                    class326.method2015((byte) 96, class314.field4479, var56, var57);
                }
            } else if (class338.field4753 == arg1) {
                int var58 = class66.field1009.method1428(32122);
                boolean var59 = (var58 & 0x80) != 0;
                int var60 = (var58 >> 3 & 0x7) + class27.field286;
                int var61 = (var58 & 0x7) + class37.field394;
                int var62 = class66.field1009.method1417(false) + var60;
                int var63 = class66.field1009.method1417(!arg0) + var61;
                int var64 = class66.field1009.method1447(29480);
                int var65 = class66.field1009.method1450((byte) 90);
                int var66 = class66.field1009.method1428(32122) * 4;
                int var67 = class66.field1009.method1428(32122) * 4;
                int var68 = class66.field1009.method1450((byte) 54);
                int var69 = class66.field1009.method1450((byte) 36);
                int var70 = class66.field1009.method1428(32122);
                if (var70 == 255) {
                    var70 = -1;
                }
                int var71 = class66.field1009.method1428(32122);
                if (var60 >= 0 && var61 >= 0 && class30.field323 > var60 && class182.field2661 > var61 && var62 >= 0 && var63 >= 0 && class30.field323 > var62 && class182.field2661 > var63 && var65 != 65535) {
                    int var72 = var66 << 0;
                    int var73 = var67 << 0;
                    int var74 = var63 * 128 + 64;
                    int var75 = var62 * 128 + 64;
                    int var76 = var60 * 128 + 64;
                    int var77 = var61 * 128 + 64;
                    class354 var78 = new class354(var65, class314.field4479, var76, var77, var72, var68 + class317.field4559, class317.field4559 + var69, var70, var71, var64, var73, var59);
                    var78.method2219(var75, var74, class377.method2316(var74, false, var75, class314.field4479) - var73, class317.field4559 + var68, 1);
                    class405.field6119.method809(new class102(var78), false);
                }
            } else if (class381.field5775 == arg1) {
                int var79 = class66.field1009.method1459(false);
                byte var80 = class66.field1009.method1438(3);
                int var81 = class66.field1009.method1451((byte) -47);
                int var82 = class66.field1009.method1430(false);
                int var83 = ((var82 & 0x7E) >> 4) + class27.field286;
                int var84 = class37.field394 + (var82 & 0x7);
                byte var85 = class66.field1009.method1442(102);
                int var86 = class66.field1009.method1450((byte) 30);
                byte var87 = class66.field1009.method1442(94);
                int var88 = class66.field1009.method1430(false);
                int var89 = var88 >> 2;
                int var90 = var88 & 0x3;
                byte var91 = class66.field1009.method1417(!arg0);
                int var92 = class66.field1009.method1465((byte) -108);
                if (!class348.field5015.method1073()) {
                    class13.method86(var84, class314.field4479, var83, var92, var90, var81, var85, var87, var91, var89, (byte) -108, var79, var80, var86);
                }
            } else if (class76.field1122 == arg1) {
                int var93 = class66.field1009.method1428(32122);
                int var94 = ((var93 & 0xFD) >> 4) + class27.field286 * 2;
                int var95 = (var93 & 0xF) + class37.field394 * 2;
                boolean var96 = class66.field1009.method1428(32122) != 0;
                int var97 = class66.field1009.method1417(!arg0) + var94;
                int var98 = class66.field1009.method1417(false) + var95;
                int var99 = class66.field1009.method1447(29480);
                int var100 = class66.field1009.method1447(29480);
                int var101 = class66.field1009.method1450((byte) 88);
                byte var102 = class66.field1009.method1417(false);
                int var103 = class66.field1009.method1428(32122) * 4;
                int var104 = class66.field1009.method1450((byte) 126);
                int var105 = class66.field1009.method1450((byte) 45);
                int var106 = class66.field1009.method1428(32122);
                int var107 = class66.field1009.method1428(32122);
                if (var106 == 255) {
                    var106 = -1;
                }
                if (var94 >= 0 && var95 >= 0 && var94 < class30.field323 * 2 && var95 < class30.field323 * 2 && var97 >= 0 && var98 >= 0 && var97 < (class182.field2661 * 2) && var98 < (class182.field2661 * 2) && var101 != 65535) {
                    int var108 = var98 * 64;
                    int var109 = var103 << 0;
                    int var110 = var95 * 64;
                    int var111 = var94 * 64;
                    int var112 = var97 * 64;
                    int var113 = var102 << 0;
                    if (var99 != 0) {
                        int var116;
                        class129 var117;
                        if (var99 >= 0) {
                            int var114 = var99 - 1;
                            int var115 = var114 & 0x7FF;
                            var116 = (var114 & 0x7EE7) >> 11;
                            var117 = class193.field2821[var115];
                        } else {
                            int var118 = -var99 - 1;
                            int var119 = var118 & 0x7FF;
                            var116 = var118 >> 11 & 0xF;
                            if (class172.field2546 == var119) {
                                var117 = class500.field7365;
                            } else {
                                var117 = class44.field707[var119];
                            }
                        }
                        if (var117 != null) {
                            class82 var120 = var117.method845(0);
                            if (var120.field1275 != null && var120.field1275[var116] != null) {
                                int var121 = var120.field1275[var116][0];
                                int var122 = var120.field1275[var116][2];
                                int var123 = var117.field1945.method757(51);
                                int var124 = class457.field6760[var123];
                                int var125 = class457.field6759[var123];
                                int var126 = var121 * var125 + var122 * var124 >> 15;
                                int var127 = var122 * var125 - var121 * var124 >> 15;
                                var110 += var127;
                                var113 -= var120.field1275[var116][1];
                                var111 += var126;
                            }
                        }
                    }
                    class354 var129 = new class354(var101, class314.field4479, var111, var110, var113, class317.field4559 + var104, class317.field4559 + var105, var106, var107, var100, var109, var96);
                    var129.method2219(var112, var108, class377.method2316(var108, !arg0, var112, class314.field4479) - var109, class317.field4559 + var104, 1);
                    class405.field6119.method809(new class102(var129), false);
                }
            } else if (class75.field1115 == arg1) {
                int var130 = class66.field1009.method1465((byte) -53);
                int var131 = class66.field1009.method1428(32122);
                int var132 = class27.field286 + (var131 >> 4 & 0x7);
                int var133 = (var131 & 0x7) + class37.field394;
                int var134 = class66.field1009.method1450((byte) 120);
                int var135 = class66.field1009.method1451((byte) -47);
                if (var132 >= 0 && var133 >= 0 && var132 < class30.field323 && var133 < class182.field2661 && class172.field2546 != var134) {
                    class227.method1552(var132, var133, (byte) -62, class314.field4479, new class237(var135, var130));
                    class326.method2015((byte) 79, class314.field4479, var132, var133);
                }
            } else if (class47.field768 == arg1) {
                int var136 = class66.field1009.method1428(32122);
                int var137 = ((var136 & 0xFA) >> 4) + class27.field286 * 2;
                int var138 = (var136 & 0xF) + class37.field394 * 2;
                boolean var139 = class66.field1009.method1428(32122) != 0;
                int var140 = class66.field1009.method1417(false) + var137;
                int var141 = class66.field1009.method1417(false) + var138;
                int var142 = class66.field1009.method1447(29480);
                int var143 = class66.field1009.method1450((byte) 45);
                int var144 = class66.field1009.method1428(32122) * 4;
                int var145 = class66.field1009.method1428(32122) * 4;
                int var146 = class66.field1009.method1450((byte) 30);
                int var147 = class66.field1009.method1450((byte) 56);
                int var148 = class66.field1009.method1428(32122);
                int var149 = class66.field1009.method1428(32122);
                if (var148 == 255) {
                    var148 = -1;
                }
                if (var137 >= 0 && var138 >= 0 && (class30.field323 * 2) > var137 && var138 < (class30.field323 * 2) && var140 >= 0 && var141 >= 0 && var140 < (class182.field2661 * 2) && var141 < class182.field2661 * 2 && var143 != 65535) {
                    int var150 = var145 << 0;
                    int var151 = var138 * 64;
                    int var152 = var137 * 64;
                    int var153 = var141 * 64;
                    int var154 = var144 << 0;
                    int var155 = var140 * 64;
                    class354 var156 = new class354(var143, class314.field4479, var152, var151, var154, class317.field4559 + var146, class317.field4559 + var147, var148, var149, var142, var150, var139);
                    var156.method2219(var155, var153, class377.method2316(var153, false, var155, class314.field4479) - var150, class317.field4559 + var146, 1);
                    class405.field6119.method809(new class102(var156), false);
                }
            } else if (class5.field66 == arg1) {
                int var157 = class66.field1009.method1469(128);
                int var158 = var157 >> 2;
                int var159 = var157 & 0x3;
                int var160 = class260.field3836[var158];
                int var161 = class66.field1009.method1462((byte) -119);
                int var162 = class66.field1009.method1428(32122);
                int var163 = ((var162 & 0x74) >> 4) + class27.field286;
                int var164 = (var162 & 0x7) + class37.field394;
                if (class482.method2859(class474.field6982, (byte) -60) || var163 >= 0 && var164 >= 0 && class30.field323 > var163 && var164 < class182.field2661) {
                    class93.method536(var158, -1, var163, var159, 0, var160, var161, (byte) 57, class314.field4479, var164);
                }
            } else if (class234.field3483 == arg1) {
                int var165 = class66.field1009.method1428(32122);
                int var166 = class27.field286 + (var165 >> 4 & 0x7);
                int var167 = (var165 & 0x7) + class37.field394;
                int var168 = class66.field1009.method1450((byte) 85);
                int var169 = class66.field1009.method1450((byte) 38);
                int var170 = class66.field1009.method1450((byte) 111);
                if (class176.field2591 != null && var166 >= 0 && var167 >= 0 && var166 < class30.field323 && var167 < class182.field2661) {
                    class84 var171 = (class84) class176.field2591.method2605(!arg0, (long) (class314.field4479 << 28 | var167 << 14 | var166));
                    if (var171 != null) {
                        for (class237 var172 = (class237) var171.field1291.method816(97); var172 != null; var172 = (class237) var171.field1291.method812(91)) {
                            if ((var168 & 0x7FFF) == var172.field3491 && var172.field3494 == var169) {
                                var172.method2049(-118);
                                var172.field3494 = var170;
                                class227.method1552(var166, var167, (byte) -62, class314.field4479, var172);
                                break;
                            }
                        }
                        class326.method2015((byte) 34, class314.field4479, var166, var167);
                    }
                }
            } else {
                class235.method1598(null, "T3 - " + arg1, (byte) 118);
                class246.method1653(-4548);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method1529(int arg0) {
        field3286 = null;
        if (arg0 != 2543) {
            field3286 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3286[var0] = class185.method1277(-122, var0);
        }
        field3289 = false;
    }
}
