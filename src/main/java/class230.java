import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class230 {

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)I", line = 3)
    public static final int method1585(int arg0, int arg1, int arg2, int arg3) {
        field3336++;
        int var4 = arg1 & 0x3;
        if (arg2 != 7) {
            method1589(-16);
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Laq;IILuo;B)V", line = 26)
    public static final void method1586(class90 arg0, int arg1, int arg2, class345 arg3, byte arg4) {
        class135.field1963.method644(false);
        field3334++;
        if (arg4 != -71) {
            method1586((class90) null, -97, -48, (class345) null, (byte) -115);
        }
        if (class377.field5388) {
            return;
        }
        for (class62 var5 = (class62) arg0.method646(48); var5 != null; var5 = (class62) arg0.method641(false)) {
            class25 var6 = class328.method2113(var5.field851, (byte) -125);
            if (class135.method945(var6, true)) {
                boolean var7 = class170.method1120(arg2, var6, arg4 - 31250, arg3, var5, arg1);
                if (var7) {
                    class243.method1651(var5, arg4 + 18200, var6, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lnq;I)V", line = 61)
    public static final void method1587(class268 arg0, int arg1) {
        class170.field2334 = arg0;
        int var2 = -5 / ((arg1 + 17) / 47);
        field3335++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZZ)Z", line = 71)
    public static boolean method1588(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 84)
    public static final void method1589(int arg0) {
        field3337++;
        if (class304.field4190 == 160) {
            class333.field4591.method172((byte) 52);
            int var1 = class333.field4591.method172((byte) 52);
            int var2 = ((var1 & 0x7B) >> 4) + class50.field701;
            int var3 = class416.field5924 + (var1 & 0x7);
            int var4 = class333.field4591.method174(arg0 + 140);
            int var5 = class333.field4591.method172((byte) 52);
            int var6 = class333.field4591.method208(27308);
            String var7 = class333.field4591.method171(-9265);
            class188.method1218((byte) 127, var5, var6, var2, var4, var3, var7);
        } else if (class304.field4190 == 231) {
            int var8 = class333.field4591.method188(-128);
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = class333.field4591.method177((byte) 55);
            int var10 = var9 >> 2;
            int var11 = var9 & 0x3;
            int var12 = class387.field5566[var10];
            int var13 = class333.field4591.method172((byte) 52);
            int var14 = (var13 >> 4 & 0x7) + class50.field701;
            int var15 = (var13 & 0x7) + class416.field5924;
            class154.method1032(class142.field2034, var14, (byte) 106, var15, var10, var8, var12, var11);
        } else if (class304.field4190 == 41) {
            int var16 = class333.field4591.method174(arg0 ^ 0x8C);
            int var17 = class333.field4591.method172((byte) 52);
            class375.method2395((byte) 108, var16).method495(var17, (byte) -56);
        } else if (class304.field4190 == 46) {
            int var18 = class333.field4591.method172((byte) 52);
            int var19 = ((var18 & 0x79) >> 4) + class50.field701;
            int var20 = (var18 & 0x7) + class416.field5924;
            int var21 = class333.field4591.method174(255);
            int var22 = class333.field4591.method172((byte) 52);
            int var23 = class333.field4591.method174(255);
            if (var19 >= 0 && var20 >= 0 && var19 < class211.field2954 && class290.field4061 > var20) {
                int var24 = var19 * 128 + 64;
                int var25 = var20 * 128 + 64;
                class367 var26 = new class367(var21, var23, class276.field3837, class142.field2034, var24, class285.method1858(var24, class142.field2034, var25, -63) - var22, var25, var19, var19, var20, var20);
                class59.field802.method643(new class366(var26), -74);
            }
        } else if (class304.field4190 == 227) {
            int var27 = class333.field4591.method172((byte) 52);
            int var28 = (var27 >> 4 & 0x7) + class50.field701;
            int var29 = (var27 & 0x7) + class416.field5924;
            int var30 = class333.field4591.method162(-4436) + var28;
            int var31 = var29 + class333.field4591.method162(-4436);
            int var32 = class333.field4591.method207(7124);
            int var33 = class333.field4591.method174(255);
            int var34 = class333.field4591.method172((byte) 52) * 4;
            int var35 = class333.field4591.method172((byte) 52) * 4;
            int var36 = class333.field4591.method174(255);
            int var37 = class333.field4591.method174(255);
            int var38 = class333.field4591.method172((byte) 52);
            if (var38 == 255) {
                var38 = -1;
            }
            int var39 = class333.field4591.method172((byte) 52);
            if (var28 >= 0 && var29 >= 0 && class211.field2954 > var28 && class290.field4061 > var29 && var30 >= 0 && var31 >= 0 && class211.field2954 > var30 && class290.field4061 > var31 && var33 != 65535) {
                int var40 = var28 * 128 + 64;
                int var41 = var31 * 128 + 64;
                int var42 = var30 * 128 + 64;
                int var43 = var29 * 128 + 64;
                class277 var44 = new class277(var33, class142.field2034, var40, var43, class285.method1858(var40, class142.field2034, var43, -71) - var34, class276.field3837 + var36, class276.field3837 + var37, var38, var39, var32, var35);
                var44.method1803(var42, (byte) 106, class285.method1858(var42, class142.field2034, var41, arg0 ^ 0xFFFFFFE7) - var35, var41, var36 + class276.field3837);
                class243.field3450.method643(new class410(var44), arg0 ^ 0xFFFFFFF6);
            }
        } else if (arg0 == 115) {
            if (class304.field4190 == 73) {
                int var45 = class333.field4591.method172((byte) 52);
                int var46 = var45 >> 2;
                int var47 = var45 & 0x3;
                int var48 = class387.field5566[var46];
                int var49 = class333.field4591.method206(-101);
                int var50 = (var49 >> 4 & 0x7) + class50.field701;
                int var51 = (var49 & 0x7) + class416.field5924;
                int var52 = class333.field4591.method166(false);
                if (var50 >= 0 && var51 >= 0 && class211.field2954 > var50 && class290.field4061 > var51) {
                    class450.method2801(var52, 0, var48, -1, false, var46, var50, class142.field2034, var51, var47);
                }
            } else if (class304.field4190 == 58) {
                int var53 = class333.field4591.method172((byte) 52);
                int var54 = ((var53 & 0xFC) >> 4) + class50.field701 * 2;
                int var55 = (var53 & 0xF) + class416.field5924 * 2;
                int var56 = var54 + class333.field4591.method162(arg0 - 4551);
                int var57 = var55 + class333.field4591.method162(arg0 - 4551);
                int var58 = class333.field4591.method207(arg0 ^ 0x1BA7);
                int var59 = class333.field4591.method174(255);
                int var60 = class333.field4591.method172((byte) 52) * 4;
                int var61 = class333.field4591.method172((byte) 52) * 4;
                int var62 = class333.field4591.method174(255);
                int var63 = class333.field4591.method174(255);
                int var64 = class333.field4591.method172((byte) 52);
                if (var64 == 255) {
                    var64 = -1;
                }
                int var65 = class333.field4591.method172((byte) 52);
                if (var54 >= 0 && var55 >= 0 && class211.field2954 * 2 > var54 && var55 < (class211.field2954 * 2) && var56 >= 0 && var57 >= 0 && (class290.field4061 * 2) > var56 && var57 < (class290.field4061 * 2) && var59 != 65535) {
                    int var66 = var54 * 64;
                    int var67 = var57 * 64;
                    int var68 = var56 * 64;
                    int var69 = var55 * 64;
                    class277 var70 = new class277(var59, class142.field2034, var66, var69, class285.method1858(var66, class142.field2034, var69, -41) - var60, class276.field3837 + var62, class276.field3837 + var63, var64, var65, var58, var61);
                    var70.method1803(var68, (byte) 70, class285.method1858(var68, class142.field2034, var67, -117) - var61, var67, class276.field3837 + var62);
                    class243.field3450.method643(new class410(var70), -106);
                }
            } else if (class304.field4190 == 45) {
                int var71 = class333.field4591.method172((byte) 52);
                int var72 = ((var71 & 0xF9) >> 4) + class50.field701 * 2;
                int var73 = class416.field5924 * 2 + (var71 & 0xF);
                int var74 = class333.field4591.method162(-4436) + var72;
                int var75 = var73 + class333.field4591.method162(-4436);
                int var76 = class333.field4591.method207(7124);
                int var77 = class333.field4591.method207(7124);
                int var78 = class333.field4591.method174(arg0 + 140);
                int var79 = class333.field4591.method162(-4436);
                int var80 = class333.field4591.method172((byte) 52) * 4;
                int var81 = class333.field4591.method174(255);
                int var82 = class333.field4591.method174(255);
                int var83 = class333.field4591.method172((byte) 52);
                int var84 = class333.field4591.method172((byte) 52);
                if (var83 == 255) {
                    var83 = -1;
                }
                if (var72 >= 0 && var73 >= 0 && (class211.field2954 * 2) > var72 && class211.field2954 * 2 > var73 && var74 >= 0 && var75 >= 0 && var74 < (class290.field4061 * 2) && var75 < (class290.field4061 * 2) && var78 != 65535) {
                    int var85 = var73 * 64;
                    int var86 = var75 * 64;
                    int var87 = var74 * 64;
                    int var88 = var72 * 64;
                    if (var76 != 0) {
                        int var90;
                        class374 var92;
                        if (var76 >= 0) {
                            int var89 = var76 - 1;
                            var90 = var89 >> 11 & 0xF;
                            int var91 = var89 & 0x7FF;
                            var92 = class98.field1358[var91];
                        } else {
                            int var93 = -var76 - 1;
                            var90 = var93 >> 11 & 0xF;
                            int var94 = var93 & 0x7FF;
                            if (class40.field588 == var94) {
                                var92 = class412.field5841;
                            } else {
                                var92 = class381.field5447[var94];
                            }
                        }
                        if (var92 != null) {
                            class428 var95 = var92.method2388(10);
                            if (var95.field6038 != null && var95.field6038[var90] != null) {
                                int var96 = var95.field6038[var90][0];
                                int var97 = var95.field6038[var90][2];
                                int var98 = var92.field5269.method608(16383);
                                int var99 = class133.field1913[var98];
                                int var100 = class133.field1908[var98];
                                int var101 = var96 * var100 + var97 * var99 >> 15;
                                int var102 = var97 * var100 - (var96 * var99) >> 15;
                                var88 += var101;
                                var79 -= var95.field6038[var90][1];
                                var85 += var102;
                            }
                        }
                    }
                    class277 var104 = new class277(var78, class142.field2034, var88, var85, class285.method1858(var88, class142.field2034, var85, -72) - var79, var81 - -class276.field3837, var82 + class276.field3837, var83, var84, var77, var80);
                    var104.method1803(var87, (byte) 80, class285.method1858(var87, class142.field2034, var86, arg0 ^ 0xFFFFFFF5) - var80, var86, class276.field3837 + var81);
                    class243.field3450.method643(new class410(var104), -101);
                }
            } else if (class304.field4190 == 179) {
                int var105 = class333.field4591.method172((byte) 52);
                int var106 = (var105 >> 4 & 0x7) + class50.field701;
                int var107 = (var105 & 0x7) + class416.field5924;
                int var108 = class333.field4591.method174(255);
                int var109 = class333.field4591.method174(255);
                int var110 = class333.field4591.method174(255);
                if (class367.field5182 != null && var106 >= 0 && var107 >= 0 && var106 < class211.field2954 && var107 < class290.field4061) {
                    class107 var111 = (class107) class367.field5182.method886((long) (var106 | class142.field2034 << 28 | var107 << 14), 25651);
                    if (var111 != null) {
                        for (class388 var112 = (class388) var111.field1478.method646(48); var112 != null; var112 = (class388) var111.field1478.method641(false)) {
                            if ((var108 & 0x7FFF) == var112.field5569 && var112.field5574 == var109) {
                                var112.method2467((byte) 110);
                                var112.field5574 = var110;
                                class429.method2714(83, var107, class142.field2034, var106, var112);
                                break;
                            }
                        }
                        class328.method2112(-1, class142.field2034, var107, var106);
                    }
                }
            } else if (class304.field4190 == 122) {
                int var113 = class333.field4591.method166(false);
                int var114 = class333.field4591.method172((byte) 52);
                int var115 = class50.field701 + ((var114 & 0x76) >> 4);
                int var116 = (var114 & 0x7) + class416.field5924;
                if (var115 >= 0 && var116 >= 0 && var115 < class211.field2954 && var116 < class290.field4061) {
                    class107 var117 = (class107) class367.field5182.method886((long) (class142.field2034 << 28 | var116 << 14 | var115), 25651);
                    if (var117 != null) {
                        for (class388 var118 = (class388) var117.field1478.method646(48); var118 != null; var118 = (class388) var117.field1478.method641(false)) {
                            if ((var113 & 0x7FFF) == var118.field5569) {
                                var118.method2467((byte) 69);
                                break;
                            }
                        }
                        if (var117.field1478.method647(false)) {
                            var117.method2467((byte) -96);
                        }
                        class328.method2112(-1, class142.field2034, var116, var115);
                    }
                }
            } else if (class304.field4190 == 169) {
                int var119 = class333.field4591.method177((byte) 55);
                int var120 = ((var119 & 0x7F) >> 4) + class50.field701;
                int var121 = (var119 & 0x7) + class416.field5924;
                int var122 = class333.field4591.method187(-19097);
                int var123 = var122 >> 2;
                int var124 = var122 & 0x3;
                int var125 = class387.field5566[var123];
                if (var120 >= 0 && var121 >= 0 && class211.field2954 > var120 && class290.field4061 > var121) {
                    class450.method2801(-1, 0, var125, -1, false, var123, var120, class142.field2034, var121, var124);
                }
            } else {
                if (class304.field4190 == 102) {
                    byte var126 = class333.field4591.method156(arg0 + 8418);
                    int var127 = class333.field4591.method166(false);
                    int var128 = class333.field4591.method174(255);
                    byte var129 = class333.field4591.method156(arg0 ^ 0x2126);
                    byte var130 = class333.field4591.method162(-4436);
                    byte var131 = class333.field4591.method156(8533);
                    int var132 = class333.field4591.method187(arg0 ^ 0xFFFFB514);
                    int var133 = ((var132 & 0x7E) >> 4) + class50.field701;
                    int var134 = class416.field5924 + (var132 & 0x7);
                    int var135 = class333.field4591.method187(arg0 ^ 0xFFFFB514);
                    int var136 = var135 >> 2;
                    int var137 = var135 & 0x3;
                    int var138 = class333.field4591.method174(255);
                    int var139 = class333.field4591.method207(7124);
                    if (!class64.field949.method51()) {
                        class79.method571(var138, var139, var136, var127, var133, var137, (byte) -127, var126, var128, var131, var130, var129, var134);
                    }
                }
                if (class304.field4190 == 57) {
                    int var140 = class333.field4591.method172((byte) 52);
                    int var141 = class50.field701 + ((var140 & 0x7D) >> 4);
                    int var142 = (var140 & 0x7) + class416.field5924;
                    int var143 = class333.field4591.method174(arg0 ^ 0x8C);
                    if (var143 == 65535) {
                        var143 = -1;
                    }
                    int var144 = class333.field4591.method172((byte) 52);
                    int var145 = var144 >> 4 & 0xF;
                    int var146 = var144 & 0x7;
                    int var147 = class333.field4591.method172((byte) 52);
                    int var148 = class333.field4591.method172((byte) 52);
                    if (var141 >= 0 && var142 >= 0 && class211.field2954 > var141 && class290.field4061 > var142) {
                        int var149 = var145 + 1;
                        if (var141 - var149 <= class412.field5841.field5326[0] && class412.field5841.field5326[0] <= (var141 + var149) && class412.field5841.field5332[0] >= (var142 - var149) && (var142 + var149) >= class412.field5841.field5332[0] && class345.field4692 != 0 && var146 > 0 && class108.field1556 < 50 && var143 != -1) {
                            class406.field5777[class108.field1556] = var143;
                            class59.field810[class108.field1556] = var146;
                            class156.field2199[class108.field1556] = var147;
                            class228.field3321[class108.field1556] = null;
                            class428.field6063[class108.field1556] = (var141 << 16) + (var142 << 8) + var145;
                            class123.field1702[class108.field1556] = var148;
                            class108.field1556++;
                        }
                    }
                } else if (class304.field4190 == 162) {
                    int var150 = class333.field4591.method188(-128);
                    int var151 = class333.field4591.method158(true);
                    int var152 = class333.field4591.method172((byte) 52);
                    int var153 = (var152 >> 4 & 0x7) + class50.field701;
                    int var154 = (var152 & 0x7) + class416.field5924;
                    if (var153 >= 0 && var154 >= 0 && var153 < class211.field2954 && class290.field4061 > var154) {
                        class429.method2714(118, var154, class142.field2034, var153, new class388(var150, var151));
                        class328.method2112(arg0 - 116, class142.field2034, var154, var153);
                    }
                } else if (class304.field4190 == 71) {
                    int var155 = class333.field4591.method174(255);
                    int var156 = class333.field4591.method166(false);
                    int var157 = class333.field4591.method187(-19097);
                    int var158 = ((var157 & 0x73) >> 4) + class50.field701;
                    int var159 = (var157 & 0x7) + class416.field5924;
                    int var160 = class333.field4591.method174(255);
                    if (var158 >= 0 && var159 >= 0 && var158 < class211.field2954 && class290.field4061 > var159 && class40.field588 != var155) {
                        class429.method2714(37, var159, class142.field2034, var158, new class388(var156, var160));
                        class328.method2112(-1, class142.field2034, var159, var158);
                    }
                }
            }
        }
    }
}
