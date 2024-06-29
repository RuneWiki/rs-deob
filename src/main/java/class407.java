import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class407 {

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6037 = "Face here";

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lke;")
    public static class162 field6039 = new class162();

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Ljava/lang/String;")
    public static String field6045 = "Close";

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field6046 = 0;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Z")
    public static boolean field6043;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lps;I)V", line = 13)
    public static final void method2621(class394 arg0, int arg1) {
        if (class124.field1747 == arg0.field5754) {
            class270.field3927[arg0.field5759] = true;
        }
        field6036++;
        if (arg1 != 15) {
            method2624(-49, 69, -30);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 30)
    public static final void method2622(byte arg0) {
        field6041++;
        if (class276.field4000.length() == 0) {
            return;
        }
        class386.method2484("--> " + class276.field4000, true);
        class324.method2178(class276.field4000, (byte) -27, false);
        class296.field4244 = 0;
        if (arg0 != -117) {
            field6039 = null;
        }
        class368.field5320 = 0;
        class276.field4000 = "";
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V", line = 50)
    public static final void method2623(byte arg0) {
        field6040++;
        if (class145.field1988 == 69) {
            int var1 = class156.field2120.method1348(-120);
            int var2 = class16.field225 + (var1 >> 4 & 0x7);
            int var3 = class316.field4617 + (var1 & 0x7);
            int var4 = var2 + class156.field2120.method1349(3);
            int var5 = class156.field2120.method1349(3) + var3;
            int var6 = class156.field2120.method1319((byte) -13);
            int var7 = class156.field2120.method1343(255);
            int var8 = class156.field2120.method1348(-88) * 4;
            int var9 = class156.field2120.method1348(-100) * 4;
            int var10 = class156.field2120.method1343(255);
            int var11 = class156.field2120.method1343(255);
            int var12 = class156.field2120.method1348(-118);
            if (var12 == 255) {
                var12 = -1;
            }
            int var13 = class156.field2120.method1348(-110);
            if (var2 >= 0 && var3 >= 0 && class192.field2574 > var2 && class364.field5262 > var3 && var4 >= 0 && var5 >= 0 && var4 < class192.field2574 && var5 < class364.field5262 && var7 != 65535) {
                int var14 = var4 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var2 * 128 + 64;
                int var17 = var5 * 128 + 64;
                class71 var18 = new class71(var7, class227.field2981, var16, var15, class52.method359((byte) -116, var15, var16, class227.field2981) - var8, class28.field418 + var10, class28.field418 + var11, var12, var13, var6, var9);
                var18.method522(var14, class28.field418 + var10, (byte) -83, class52.method359((byte) -116, var17, var14, class227.field2981) - var9, var17);
                class178.field2366.method330(new class434(var18), -2130841184);
            }
        } else if (class145.field1988 == 207) {
            int var19 = class156.field2120.method1348(-116);
            int var20 = ((var19 & 0xFF) >> 4) + class16.field225 * 2;
            int var21 = (var19 & 0xF) + class316.field4617 * 2;
            int var22 = class156.field2120.method1349(3) + var20;
            int var23 = var21 + class156.field2120.method1349(3);
            int var24 = class156.field2120.method1319((byte) -13);
            int var25 = class156.field2120.method1343(255);
            int var26 = class156.field2120.method1348(-100) * 4;
            int var27 = class156.field2120.method1348(-92) * 4;
            int var28 = class156.field2120.method1343(255);
            int var29 = class156.field2120.method1343(255);
            int var30 = class156.field2120.method1348(-119);
            if (var30 == 255) {
                var30 = -1;
            }
            int var31 = class156.field2120.method1348(-95);
            if (var20 >= 0 && var21 >= 0 && var20 < 208 && var21 < 208 && var22 >= 0 && var23 >= 0 && var22 < 208 && var23 < 208 && var25 != 65535) {
                int var32 = var20 * 64;
                int var33 = var22 * 64;
                int var34 = var23 * 64;
                int var35 = var21 * 64;
                class71 var36 = new class71(var25, class227.field2981, var32, var35, class52.method359((byte) -116, var35, var32, class227.field2981) - var26, var28 - -class28.field418, class28.field418 + var29, var30, var31, var24, var27);
                var36.method522(var33, class28.field418 + var28, (byte) -83, class52.method359((byte) -116, var34, var33, class227.field2981) - var27, var34);
                class178.field2366.method330(new class434(var36), -2130841184);
            }
        } else if (class145.field1988 == 47) {
            int var37 = class156.field2120.method1355(29550);
            int var38 = var37 >> 2;
            int var39 = var37 & 0x3;
            int var40 = class215.field2859[var38];
            int var41 = class156.field2120.method1361(-9711);
            if (var41 == 65535) {
                var41 = -1;
            }
            int var42 = class156.field2120.method1374(0);
            int var43 = (var42 >> 4 & 0x7) + class16.field225;
            int var44 = (var42 & 0x7) + class316.field4617;
            class242.method1454(var40, class227.field2981, var41, var38, var39, -17444, var44, var43);
        } else {
            if (class145.field1988 == 87) {
                int var45 = class156.field2120.method1356((byte) -30);
                int var46 = class156.field2120.method1342(2082344352);
                int var47 = class156.field2120.method1356((byte) -57);
                int var48 = class156.field2120.method1374(0);
                int var49 = var48 >> 2;
                int var50 = var48 & 0x3;
                byte var51 = class156.field2120.method1360((byte) -55);
                int var52 = class156.field2120.method1355(29550);
                int var53 = (var52 >> 4 & 0x7) + class16.field225;
                int var54 = (var52 & 0x7) + class316.field4617;
                int var55 = class156.field2120.method1340(-128);
                byte var56 = class156.field2120.method1349(3);
                byte var57 = class156.field2120.method1349(3);
                byte var58 = class156.field2120.method1336(0);
                if (!class61.field807.method1720()) {
                    class73.method533(var57, var58, var53, var50, var55, var56, var45, var46, var51, var54, var49, (byte) -119, var47);
                }
            }
            if (class145.field1988 == 147) {
                class156.field2120.method1348(-104);
                int var59 = class156.field2120.method1348(-121);
                int var60 = (var59 >> 4 & 0x7) + class16.field225;
                int var61 = (var59 & 0x7) + class316.field4617;
                int var62 = class156.field2120.method1343(255);
                int var63 = class156.field2120.method1348(-88);
                int var64 = class156.field2120.method1333((byte) -82);
                String var65 = class156.field2120.method1329(991328496);
                class379.method2464(var63, var64, var60, var62, true, var61, var65);
            } else if (class145.field1988 == 75) {
                int var66 = class156.field2120.method1340(-128);
                int var67 = class156.field2120.method1374(0);
                int var68 = ((var67 & 0x75) >> 4) + class16.field225;
                int var69 = (var67 & 0x7) + class316.field4617;
                int var70 = class156.field2120.method1343(255);
                if (var68 >= 0 && var69 >= 0 && var68 < class192.field2574 && var69 < class364.field5262) {
                    class388.method2495(var69, var68, class227.field2981, -83, new class200(var70, var66));
                    class73.method538(var69, var68, (byte) -36, class227.field2981);
                }
            } else {
                if (arg0 <= 95) {
                    method2625((byte) 77, 50);
                }
                if (class145.field1988 == 80) {
                    int var71 = class156.field2120.method1348(-112);
                    int var72 = (var71 >> 4 & 0x7) + class16.field225;
                    int var73 = (var71 & 0x7) + class316.field4617;
                    int var74 = class156.field2120.method1343(255);
                    if (var74 == 65535) {
                        var74 = -1;
                    }
                    int var75 = class156.field2120.method1348(-89);
                    int var76 = (var75 & 0xF4) >> 4;
                    int var77 = var75 & 0x7;
                    int var78 = class156.field2120.method1348(-87);
                    int var79 = class156.field2120.method1348(-99);
                    if (var72 >= 0 && var73 >= 0 && var72 < class192.field2574 && var73 < class364.field5262) {
                        int var80 = var76 + 1;
                        if (class227.field2988.field4360[0] >= (var72 - var80) && class227.field2988.field4360[0] <= (var72 + var80) && class227.field2988.field4362[0] >= var73 - var80 && var73 + var80 >= class227.field2988.field4362[0] && class156.field2123 != 0 && var77 > 0 && class321.field4730 < 50 && var74 != -1) {
                            class240.field3218[class321.field4730] = var74;
                            class31.field442[class321.field4730] = var77;
                            class245.field3284[class321.field4730] = var78;
                            class56.field766[class321.field4730] = null;
                            class161.field2160[class321.field4730] = (var72 << 16) + var76 + (var73 << 8);
                            class164.field2209[class321.field4730] = var79;
                            class321.field4730++;
                        }
                    }
                } else if (class145.field1988 == 187) {
                    int var81 = class156.field2120.method1348(-102);
                    int var82 = class16.field225 + ((var81 & 0x73) >> 4);
                    int var83 = class316.field4617 + (var81 & 0x7);
                    int var84 = class156.field2120.method1343(255);
                    int var85 = class156.field2120.method1348(-121);
                    int var86 = class156.field2120.method1343(255);
                    if (var82 >= 0 && var83 >= 0 && var82 < class192.field2574 && var83 < class364.field5262) {
                        int var87 = var82 * 128 + 64;
                        int var88 = var83 * 128 + 64;
                        class52 var89 = new class52(var84, var86, class28.field418, class227.field2981, var87, class52.method359((byte) -116, var88, var87, class227.field2981) - var85, var88, var82, var82, var83, var83);
                        class43.field609.method330(new class105(var89), -2130841184);
                    }
                } else if (class145.field1988 == 255) {
                    int var90 = class156.field2120.method1343(255);
                    int var91 = class156.field2120.method1348(-94);
                    class329.method2190((byte) 63, var90).method697(var91, -25);
                } else if (class145.field1988 == 184) {
                    int var92 = class156.field2120.method1371(-99);
                    int var93 = var92 >> 2;
                    int var94 = var92 & 0x3;
                    int var95 = class215.field2859[var93];
                    int var96 = class156.field2120.method1361(-9711);
                    int var97 = class156.field2120.method1374(0);
                    int var98 = class16.field225 + ((var97 & 0x7D) >> 4);
                    int var99 = (var97 & 0x7) + class316.field4617;
                    if (var98 >= 0 && var99 >= 0 && var98 < class192.field2574 && var99 < class364.field5262) {
                        class115.method737(-1, var94, var93, 0, var96, var98, class227.field2981, var95, -28070, var99);
                    }
                } else if (class145.field1988 == 90) {
                    int var100 = class156.field2120.method1361(-9711);
                    int var101 = class156.field2120.method1371(-108);
                    int var102 = (var101 >> 4 & 0x7) + class16.field225;
                    int var103 = (var101 & 0x7) + class316.field4617;
                    int var104 = class156.field2120.method1361(-9711);
                    int var105 = class156.field2120.method1361(-9711);
                    if (var102 >= 0 && var103 >= 0 && var102 < class192.field2574 && class364.field5262 > var103 && class272.field3950 != var104) {
                        class388.method2495(var103, var102, class227.field2981, -72, new class200(var100, var105));
                        class73.method538(var103, var102, (byte) -36, class227.field2981);
                    }
                } else if (class145.field1988 == 191) {
                    int var106 = class156.field2120.method1348(-106);
                    int var107 = ((var106 & 0x74) >> 4) + class16.field225;
                    int var108 = class316.field4617 + (var106 & 0x7);
                    int var109 = class156.field2120.method1343(255);
                    int var110 = class156.field2120.method1343(255);
                    int var111 = class156.field2120.method1343(255);
                    if (class200.field2656 != null && var107 >= 0 && var108 >= 0 && var107 < class192.field2574 && class364.field5262 > var108) {
                        class38 var112 = (class38) class200.field2656.method384((long) (var108 << 14 | class227.field2981 << 28 | var107), true);
                        if (var112 != null) {
                            for (class200 var113 = (class200) var112.field533.method332(-2130841184); var113 != null; var113 = (class200) var112.field533.method343((byte) -85)) {
                                if ((var109 & 0x7FFF) == var113.field2658 && var113.field2657 == var110) {
                                    var113.method322(11);
                                    var113.field2657 = var111;
                                    class388.method2495(var108, var107, class227.field2981, -121, var113);
                                    break;
                                }
                            }
                            class73.method538(var108, var107, (byte) -36, class227.field2981);
                        }
                    }
                } else if (class145.field1988 == 159) {
                    int var114 = class156.field2120.method1348(-96);
                    int var115 = (var114 >> 4 & 0xF) + class16.field225 * 2;
                    int var116 = (var114 & 0xF) + class316.field4617 * 2;
                    int var117 = var115 + class156.field2120.method1349(3);
                    int var118 = class156.field2120.method1349(3) + var116;
                    int var119 = class156.field2120.method1319((byte) -13);
                    int var120 = class156.field2120.method1319((byte) -13);
                    int var121 = class156.field2120.method1343(255);
                    int var122 = class156.field2120.method1349(3);
                    int var123 = class156.field2120.method1348(-87) * 4;
                    int var124 = class156.field2120.method1343(255);
                    int var125 = class156.field2120.method1343(255);
                    int var126 = class156.field2120.method1348(-111);
                    if (var126 == 255) {
                        var126 = -1;
                    }
                    int var127 = class156.field2120.method1348(-128);
                    if (var115 >= 0 && var116 >= 0 && var115 < 208 && var116 < 208 && var117 >= 0 && var118 >= 0 && var117 < 208 && var118 < 208 && var121 != 65535) {
                        int var128 = var118 * 64;
                        int var129 = var115 * 64;
                        int var130 = var117 * 64;
                        int var131 = var116 * 64;
                        if (var119 != 0) {
                            int var134;
                            class298 var135;
                            if (var119 < 0) {
                                int var132 = -var119 - 1;
                                int var133 = var132 & 0x7FF;
                                var134 = (var132 & 0x7D2C) >> 11;
                                if (class272.field3950 == var133) {
                                    var135 = class227.field2988;
                                } else {
                                    var135 = class206.field2777[var133];
                                }
                            } else {
                                int var136 = var119 - 1;
                                var134 = var136 >> 11 & 0xF;
                                int var137 = var136 & 0x7FF;
                                var135 = class306.field4496[var137];
                            }
                            if (var135 != null) {
                                class396 var138 = var135.method2040(false);
                                if (var138.field5888 != null && var138.field5888[var134] != null) {
                                    int var139 = var138.field5888[var134][0];
                                    int var140 = var138.field5888[var134][2];
                                    int var141 = var135.field4328.method2641((byte) -56);
                                    int var142 = class117.field1644[var141];
                                    int var143 = class117.field1636[var141];
                                    int var144 = var139 * var143 + var140 * var142 >> 15;
                                    int var145 = var140 * var143 - (var139 * var142) >> 15;
                                    var122 -= var138.field5888[var134][1];
                                    var131 += var145;
                                    var129 += var144;
                                }
                            }
                        }
                        class71 var147 = new class71(var121, class227.field2981, var129, var131, class52.method359((byte) -116, var131, var129, class227.field2981) - var122, class28.field418 + var124, class28.field418 + var125, var126, var127, var120, var123);
                        var147.method522(var130, var124 + class28.field418, (byte) -83, class52.method359((byte) -116, var128, var130, class227.field2981) - var123, var128);
                        class178.field2366.method330(new class434(var147), -2130841184);
                    }
                } else if (class145.field1988 == 132) {
                    int var148 = class156.field2120.method1348(-91);
                    int var149 = class16.field225 + ((var148 & 0x70) >> 4);
                    int var150 = (var148 & 0x7) + class316.field4617;
                    int var151 = class156.field2120.method1371(-93);
                    int var152 = var151 >> 2;
                    int var153 = var151 & 0x3;
                    int var154 = class215.field2859[var152];
                    if (var149 >= 0 && var150 >= 0 && var149 < class192.field2574 && var150 < class364.field5262) {
                        class115.method737(-1, var153, var152, 0, -1, var149, class227.field2981, var154, -28070, var150);
                    }
                } else if (class145.field1988 == 144) {
                    int var155 = class156.field2120.method1355(29550);
                    int var156 = (var155 >> 4 & 0x7) + class16.field225;
                    int var157 = (var155 & 0x7) + class316.field4617;
                    int var158 = class156.field2120.method1343(255);
                    if (var156 >= 0 && var157 >= 0 && class192.field2574 > var156 && var157 < class364.field5262) {
                        class38 var159 = (class38) class200.field2656.method384((long) (class227.field2981 << 28 | var157 << 14 | var156), true);
                        if (var159 != null) {
                            for (class200 var160 = (class200) var159.field533.method332(-2130841184); var160 != null; var160 = (class200) var159.field533.method343((byte) -113)) {
                                if ((var158 & 0x7FFF) == var160.field2658) {
                                    var160.method322(11);
                                    break;
                                }
                            }
                            if (var159.field533.method338(16091)) {
                                var159.method322(11);
                            }
                            class73.method538(var157, var156, (byte) -36, class227.field2981);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I", line = 656)
    public static final int method2624(int arg0, int arg1, int arg2) {
        field6044++;
        if (arg1 != -3007) {
            field6046 = -107;
        }
        class72 var3 = (class72) class8.field145.method384((long) arg2, true);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && var3.field1038.length > arg0) {
            return var3.field1038[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)V", line = 680)
    public static final void method2625(byte arg0, int arg1) {
        class93.field1329.method1142((byte) -80, arg1);
        int var2 = 97 % ((-arg0 - 22) / 54);
        field6038++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 691)
    public static void method2626(int arg0) {
        field6045 = null;
        field6037 = null;
        field6039 = null;
        if (arg0 <= 76) {
            field6043 = false;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V", line = 708)
    public static final void method2627(int arg0) {
        if (class317.field4647 < 1024.0F) {
            class317.field4647 = 1024.0F;
        }
        field6042++;
        while (class396.field5847 >= 16384.0F) {
            class396.field5847 -= 16384.0F;
        }
        if (class317.field4647 > 3072.0F) {
            class317.field4647 = 3072.0F;
        }
        while (class396.field5847 < 0.0F) {
            class396.field5847 += 16384.0F;
        }
        int var1 = class153.field2071 >> 7;
        int var2 = class144.field1962 >> 7;
        int var3 = class52.method359((byte) -116, class144.field1962, class153.field2071, class227.field2981);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class227.field2981;
                    if (var7 < 3 && class444.method2792(-85, var5, var6)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class377.field5490 != null && class377.field5490[var7] != null) {
                        var8 = (class377.field5490[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 - (class12.field205[var7].method742(var5, var6) - var8);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class48.field677) {
            class48.field677 += (var10 - class48.field677) / 24;
        } else if (var10 < class48.field677) {
            class48.field677 += (var10 - class48.field677) / 80;
        }
        if (arg0 != 3) {
            field6039 = null;
        }
    }
}
