import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class152 {

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public int field2538 = -1;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2539 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "[I")
    public static int[] field2542 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2537 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "[I")
    public static int[] field2546 = new int[128];

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Lla;")
    public class170 field2548;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "[I")
    public int[] field2540;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "[Ljava/lang/String;")
    public String[] field2547;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)Z")
    public static final boolean method1041(int arg0, int arg1, int arg2) {
        int var3 = class178.field2936[arg0][arg1][arg2];
        if (-class142.field2447 == var3) {
            return false;
        } else if (class142.field2447 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class23.method165(var4 + 1, class95.field1642[arg0][arg1][arg2], var5 + 1) && class23.method165(var4 + 128 - 1, class95.field1642[arg0][arg1 + 1][arg2], var5 + 1) && class23.method165(var4 + 128 - 1, class95.field1642[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class23.method165(var4 + 1, class95.field1642[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class178.field2936[arg0][arg1][arg2] = class142.field2447;
                return true;
            } else {
                class178.field2936[arg0][arg1][arg2] = -class142.field2447;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static final void method1042(int arg0) {
        field2544++;
        if (class87.field1558 == 60) {
            int var1 = class248.field4058.method641(arg0 ^ 0xFFFFFFA7);
            int var2 = class248.field4058.method638(0);
            int var3 = (var2 >> 4 & 0x7) + class93.field1635;
            int var4 = (var2 & 0x7) + class21.field326;
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                class60 var5 = class255.field4163[class176.field2886][var3][var4];
                if (var5 != null) {
                    for (class58 var6 = (class58) var5.method379(6347); var6 != null; var6 = (class58) var5.method378(-52)) {
                        if ((var1 & 0x7FFF) == var6.field1019.field2460) {
                            var6.method547(10026);
                            break;
                        }
                    }
                    if (var5.method379(6347) == null) {
                        class255.field4163[class176.field2886][var3][var4] = null;
                    }
                    class6.method35(var3, var4, arg0 - 27);
                }
            }
        } else if (class87.field1558 == 220) {
            int var7 = class248.field4058.method691((byte) 117);
            int var8 = class248.field4058.method638(0);
            int var9 = ((var8 & 0x7C) >> 4) + class93.field1635;
            int var10 = (var8 & 0x7) + class21.field326;
            int var11 = class248.field4058.method677(false);
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                class143 var12 = new class143();
                var12.field2460 = var11;
                var12.field2455 = var7;
                if (class255.field4163[class176.field2886][var9][var10] == null) {
                    class255.field4163[class176.field2886][var9][var10] = new class60();
                }
                class255.field4163[class176.field2886][var9][var10].method374(-1, new class58(var12));
                class6.method35(var9, var10, -117);
            }
        } else if (arg0 == -91) {
            if (class87.field1558 == 153) {
                int var13 = class248.field4058.method669((byte) 36);
                int var14 = (var13 & 0x7) + class21.field326;
                int var15 = ((var13 & 0x7F) >> 4) + class93.field1635;
                int var16 = var15 + class248.field4058.method646(arg0 + 211);
                int var17 = var14 + class248.field4058.method646(-62);
                int var18 = class248.field4058.method686(-3);
                int var19 = class248.field4058.method677(false);
                int var20 = class248.field4058.method669((byte) 36) * 4;
                int var21 = class248.field4058.method669((byte) 36) * 4;
                int var22 = class248.field4058.method677(false);
                int var23 = class248.field4058.method677(false);
                int var24 = class248.field4058.method669((byte) 36);
                if (var24 == 255) {
                    var24 = -1;
                }
                int var25 = class248.field4058.method669((byte) 36);
                if (var15 >= 0 && var14 >= 0 && var15 < 104 && var14 < 104 && var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104 && var19 != 65535) {
                    int var26 = var14 * 128 + 64;
                    int var27 = var17 * 128 + 64;
                    int var28 = var15 * 128 + 64;
                    class71 var29 = new class71(var19, class176.field2886, var28, var26, class10.method68(true, class176.field2886, var26, var28) - var20, var22 - -class266.field4301, class266.field4301 + var23, var24, var25, var18, var21);
                    int var30 = var16 * 128 + 64;
                    var29.method433(var27, class10.method68(true, class176.field2886, var27, var30) - var21, var30, -124, class266.field4301 + var22);
                    class159.field2662.method374(-1, new class285(var29));
                }
            } else if (class87.field1558 == 93) {
                int var31 = class248.field4058.method677(false);
                int var32 = class248.field4058.method669((byte) 36);
                class10.method64(64, var31).method1369(var32, 123);
            } else if (class87.field1558 == 11) {
                int var33 = class248.field4058.method657(0);
                int var34 = (var33 >> 4 & 0x7) + class93.field1635;
                int var35 = class21.field326 + (var33 & 0x7);
                int var36 = class248.field4058.method691((byte) 125);
                int var37 = class248.field4058.method641(2);
                int var38 = class248.field4058.method691((byte) 116);
                if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && class37.field545 != var36) {
                    class143 var39 = new class143();
                    var39.field2455 = var37;
                    var39.field2460 = var38;
                    if (class255.field4163[class176.field2886][var34][var35] == null) {
                        class255.field4163[class176.field2886][var34][var35] = new class60();
                    }
                    class255.field4163[class176.field2886][var34][var35].method374(-1, new class58(var39));
                    class6.method35(var34, var35, -123);
                }
            } else if (class87.field1558 == 37) {
                int var40 = class248.field4058.method669((byte) 36);
                int var41 = class93.field1635 * 2 + (var40 >> 4 & 0xF);
                int var42 = (var40 & 0xF) + class21.field326 * 2;
                int var43 = var41 + class248.field4058.method646(73);
                int var44 = var42 + class248.field4058.method646(arg0 ^ 0xFFFFFFD8);
                int var45 = class248.field4058.method686(-3);
                int var46 = class248.field4058.method677(false);
                int var47 = class248.field4058.method669((byte) 36) * 4;
                int var48 = class248.field4058.method669((byte) 36) * 4;
                int var49 = class248.field4058.method677(false);
                int var50 = class248.field4058.method677(false);
                int var51 = class248.field4058.method669((byte) 36);
                int var52 = class248.field4058.method669((byte) 36);
                if (var51 == 255) {
                    var51 = -1;
                }
                if (var41 >= 0 && var42 >= 0 && var41 < 208 && var42 < 208 && var43 >= 0 && var44 >= 0 && var43 < 208 && var44 < 208 && var46 != 65535) {
                    int var53 = var42 * 64;
                    int var54 = var41 * 64;
                    int var55 = var43 * 64;
                    class71 var56 = new class71(var46, class176.field2886, var54, var53, class10.method68(true, class176.field2886, var53, var54) - var47, class266.field4301 + var49, class266.field4301 + var50, var51, var52, var45, var48);
                    int var57 = var44 * 64;
                    var56.method433(var57, class10.method68(true, class176.field2886, var57, var55) - var48, var55, arg0 ^ 0x2E, class266.field4301 + var49);
                    class159.field2662.method374(-1, new class285(var56));
                }
            } else {
                if (class87.field1558 == 237) {
                    int var58 = class248.field4058.method693(false);
                    int var59 = class248.field4058.method686(-3);
                    byte var60 = class248.field4058.method687((byte) -105);
                    int var61 = class248.field4058.method657(0);
                    int var62 = var61 >> 2;
                    int var63 = var61 & 0x3;
                    byte var64 = class248.field4058.method663(-1);
                    byte var65 = class248.field4058.method663(-1);
                    byte var66 = class248.field4058.method663(-1);
                    int var67 = class248.field4058.method641(2);
                    int var68 = class248.field4058.method669((byte) 36);
                    int var69 = (var68 & 0x7) + class21.field326;
                    int var70 = class93.field1635 + (var68 >> 4 & 0x7);
                    int var71 = class248.field4058.method677(false);
                    class99.method623(var71, var60, var70, var63, var69, var64, var62, var59, var66, var67, arg0 ^ 0x57, var65, var58);
                }
                if (class87.field1558 == 91) {
                    int var72 = class248.field4058.method669((byte) 36);
                    int var73 = (var72 >> 4 & 0x7) + class93.field1635;
                    int var74 = class21.field326 + (var72 & 0x7);
                    int var75 = class248.field4058.method677(false);
                    int var76 = class248.field4058.method677(false);
                    int var77 = class248.field4058.method677(false);
                    if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                        class60 var78 = class255.field4163[class176.field2886][var73][var74];
                        if (var78 != null) {
                            for (class58 var79 = (class58) var78.method379(6347); var79 != null; var79 = (class58) var78.method378(-115)) {
                                class143 var80 = var79.field1019;
                                if ((var75 & 0x7FFF) == var80.field2460 && var80.field2455 == var76) {
                                    var80.field2455 = var77;
                                    break;
                                }
                            }
                            class6.method35(var73, var74, -122);
                        }
                    }
                } else if (class87.field1558 == 43) {
                    int var81 = class248.field4058.method677(false);
                    int var82 = class248.field4058.method657(arg0 + 91);
                    int var83 = ((var82 & 0x7A) >> 4) + class93.field1635;
                    int var84 = (var82 & 0x7) + class21.field326;
                    int var85 = class248.field4058.method638(0);
                    int var86 = var85 & 0x3;
                    int var87 = var85 >> 2;
                    int var88 = class145.field2483[var87];
                    if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                        class239.method1575(0, -1, class176.field2886, var87, arg0 ^ 0xFFFFF85A, var84, var88, var83, var86, var81);
                    }
                } else if (class87.field1558 == 110) {
                    int var89 = class248.field4058.method641(2);
                    int var90 = class248.field4058.method638(0);
                    int var91 = var90 >> 2;
                    int var92 = var90 & 0x3;
                    if (var89 == 65535) {
                        var89 = -1;
                    }
                    int var93 = class145.field2483[var91];
                    int var94 = class248.field4058.method670(arg0 + 28019315);
                    int var95 = (var94 & 0x7) + class21.field326;
                    int var96 = (var94 >> 4 & 0x7) + class93.field1635;
                    class154.method1052(class176.field2886, false, var91, var93, var95, var96, var89, var92);
                } else if (class87.field1558 == 8) {
                    int var97 = class248.field4058.method638(0);
                    int var98 = var97 & 0x3;
                    int var99 = var97 >> 2;
                    int var100 = class145.field2483[var99];
                    int var101 = class248.field4058.method670(arg0 ^ 0xFE5475BD);
                    int var102 = class93.field1635 + ((var101 & 0x70) >> 4);
                    int var103 = (var101 & 0x7) + class21.field326;
                    if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                        class239.method1575(0, -1, class176.field2886, var99, 2047, var103, var100, var102, var98, -1);
                    }
                } else if (class87.field1558 == 120) {
                    int var104 = class248.field4058.method669((byte) 36);
                    int var105 = class21.field326 + (var104 & 0x7);
                    int var106 = ((var104 & 0x7B) >> 4) + class93.field1635;
                    int var107 = class248.field4058.method677(false);
                    int var108 = class248.field4058.method669((byte) 36);
                    int var109 = class248.field4058.method677(false);
                    if (var106 >= 0 && var105 >= 0 && var106 < 104 && var105 < 104) {
                        int var110 = var105 * 128 + 64;
                        int var111 = var106 * 128 + 64;
                        class177 var112 = new class177(var107, class176.field2886, var111, var110, class10.method68(true, class176.field2886, var110, var111) - var108, var109, class266.field4301);
                        class63.field1092.method374(-1, new class66(var112));
                    }
                } else if (class87.field1558 == 79) {
                    int var113 = class248.field4058.method669((byte) 36);
                    int var114 = class93.field1635 * 2 + ((var113 & 0xF5) >> 4);
                    int var115 = (var113 & 0xF) + class21.field326 * 2;
                    int var116 = var114 + class248.field4058.method646(86);
                    int var117 = class248.field4058.method646(90) + var115;
                    int var118 = class248.field4058.method686(-3);
                    int var119 = class248.field4058.method686(-3);
                    int var120 = class248.field4058.method677(false);
                    int var121 = class248.field4058.method646(arg0 ^ 0xFFFFFFCB);
                    int var122 = class248.field4058.method669((byte) 36) * 4;
                    int var123 = class248.field4058.method677(false);
                    int var124 = class248.field4058.method677(false);
                    int var125 = class248.field4058.method669((byte) 36);
                    int var126 = class248.field4058.method669((byte) 36);
                    if (var125 == 255) {
                        var125 = -1;
                    }
                    if (var114 >= 0 && var115 >= 0 && var114 < 208 && var115 < 208 && var116 >= 0 && var117 >= 0 && var116 < 208 && var117 < 208 && var120 != 65535) {
                        int var127 = var116 * 64;
                        int var128 = var114 * 64;
                        int var129 = var115 * 64;
                        if (var118 != 0) {
                            int var131;
                            class81 var133;
                            if (var118 < 0) {
                                int var130 = -var118 - 1;
                                var131 = var130 >> 11 & 0xF;
                                int var132 = var130 & 0x7FF;
                                if (class37.field545 == var132) {
                                    var133 = class273.field4378;
                                } else {
                                    var133 = class105.field1874[var132];
                                }
                            } else {
                                int var134 = var118 - 1;
                                int var135 = var134 & 0x7FF;
                                var131 = (var134 & 0x79E5) >> 11;
                                var133 = class42.field625[var135];
                            }
                            if (var133 != null) {
                                class37 var136 = var133.method533(-1);
                                if (var136.field522 != null && var136.field522[var131] != null) {
                                    var121 -= var136.field522[var131][1];
                                    int var137 = var136.field522[var131][0];
                                    int var138 = var136.field522[var131][2];
                                    int var139 = class287.field4567[var133.field1413];
                                    int var140 = class287.field4562[var133.field1413];
                                    int var141 = var137 * var140 + var138 * var139 >> 16;
                                    int var142 = var138 * var140 - (var137 * var139) >> 16;
                                    var129 += var142;
                                    var128 += var141;
                                }
                            }
                        }
                        int var144 = var117 * 64;
                        class71 var145 = new class71(var120, class176.field2886, var128, var129, class10.method68(true, class176.field2886, var129, var128) - var121, class266.field4301 + var123, var124 + class266.field4301, var125, var126, var119, var122);
                        var145.method433(var144, class10.method68(true, class176.field2886, var144, var127) - var122, var127, arg0 ^ 0xFFFFFFCA, var123 + class266.field4301);
                        class159.field2662.method374(-1, new class285(var145));
                    }
                } else if (class87.field1558 == 183) {
                    int var146 = class248.field4058.method669((byte) 36);
                    int var147 = ((var146 & 0x70) >> 4) + class93.field1635;
                    int var148 = (var146 & 0x7) + class21.field326;
                    int var149 = class248.field4058.method677(false);
                    int var150 = class248.field4058.method669((byte) 36);
                    int var151 = var150 & 0x7;
                    int var152 = var150 >> 4 & 0xF;
                    int var153 = class248.field4058.method669((byte) 36);
                    if (var149 == 65535) {
                        var149 = -1;
                    }
                    int var154 = class248.field4058.method669((byte) 36);
                    if (var147 >= 0 && var148 >= 0 && var147 < 104 && var148 < 104) {
                        int var155 = var152 + 1;
                        if (class273.field4378.field1464[0] >= var147 - var155 && var147 + var155 >= class273.field4378.field1464[0] && var148 - var155 <= class273.field4378.field1486[0] && var148 + var155 >= class273.field4378.field1486[0] && class196.field3167 != 0 && var151 > 0 && class31.field461 < 50 && var149 != -1) {
                            class245.field4018[class31.field461] = var149;
                            class169.field2797[class31.field461] = var151;
                            class135.field2360[class31.field461] = var153;
                            class47.field829[class31.field461] = null;
                            class25.field386[class31.field461] = (var147 << 16) + (var148 << 8) + var152;
                            class56.field981[class31.field461] = var154;
                            class31.field461++;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1043(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2541++;
        int var9 = arg0 - arg7;
        int var10 = arg4 - arg1;
        int var11 = (arg8 - arg2 << 16) / var10;
        int var12 = (arg6 - arg3 << 16) / var9;
        if (arg5 <= 36) {
            field2543 = 39;
        }
        class248.method1656(arg3, 0, arg2, -84, var11, arg1, arg0, 0, var12, arg4, arg7);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public static void method1044(int arg0) {
        field2546 = null;
        field2537 = null;
        field2542 = null;
        if (arg0 != 0) {
            method1041(-107, 14, 72);
        }
        field2539 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZB)V")
    public static final void method1045(boolean arg0, byte arg1) {
        class19.field304 = 99;
        if (arg1 <= 105) {
            field2537 = null;
        }
        class296.field4700 = new int[5];
        class78.field1332 = new int[104];
        class48.field840 = new int[104];
        class113.field2040 = new int[104];
        class61.field1057 = new int[104];
        field2545++;
        class129.field2264 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class107.field1908 = new int[var2][105][105];
        class57.field1006 = new byte[var2][104][104];
        class91.field1612 = new byte[var2][104][104];
        class88.field1566 = new byte[var2][104][104];
        class177.field2912 = new byte[var2][105][105];
        class106.field1887 = new byte[var2][104][104];
    }
}
