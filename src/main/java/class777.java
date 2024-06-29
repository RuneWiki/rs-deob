import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class777 extends class204 {

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Lsha;")
    public static class115 field10680 = null;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Ljn;")
    public static class134 field10682 = new class134(3, 12);

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Lpb;")
    public static class2 field10689 = new class2(1);

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "Lof;")
    public static class475 field10690 = new class475(8, 1);

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "[I")
    public static int[] field10693 = null;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "Lqk;")
    public static class1 field10692 = new class1(26, 8);

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field10681;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field10683;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field10684;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field10685;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field10686;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field10687;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field10688;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "J")
    public static long field10691;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIZIII)V", line = 3)
    public static final void method4279(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        ++field10684;
        int var7 = class783.field10748;
        class232.field3493 = 0;
        int[] var8 = class244.field3610;
        for (int var9 = 0; class429.field5988 + var7 > var9; ++var9) {
            class636 var37 = null;
            class654 var38;
            if (var7 <= var9) {
                var38 = ((class685) class450.field6288.method3669(false, (long) class425.field5934[-var7 + var9])).field9573;
                var37 = ((class359) var38).field5172;
                if (var37.field8872 != null) {
                    var37 = var37.method3650(class173.field2192, (byte) 55);
                    if (var37 == null) {
                        continue;
                    }
                }
            } else {
                var38 = class413.field5787[var8[var9]];
            }
            if (var38.field9199 >= 0 && (~class137.field1758 == ~var38.field9166 || class724.field10031.field3467 == var38.field3467)) {
                class718.method4012(var38.method2251(0), arg2, arg1 >> 1, var38, -29197, arg5, arg0 >> 1);
                if (class491.field6769[0] >= 0) {
                    if (var38.field9204 != null && (var9 >= var7 || class626.field8766 == 0 || class626.field8766 == 3 || ~class626.field8766 == -2 && class261.method1718(-28054, ((class723) var38).field9965)) && class232.field3493 < class139.field1772) {
                        class139.field1777[class232.field3493] = class705.field9812.method1953(var38.field9204, (byte) 125) / 2;
                        class139.field1778[class232.field3493] = class491.field6769[0];
                        class139.field1784[class232.field3493] = class491.field6769[1];
                        class139.field1771[class232.field3493] = var38.field9125;
                        class139.field1783[class232.field3493] = var38.field9180;
                        class139.field1782[class232.field3493] = var38.field9192;
                        class139.field1779[class232.field3493] = var38.field9204;
                        ++class232.field3493;
                    }
                    int var39 = class491.field6769[1] + arg6;
                    int var50;
                    if (!var38.field9136 && var38.field9126 > class533.field7336) {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var43;
                        if (var7 > var9) {
                            class723 var42 = class413.field5787[var8[var9]];
                            var43 = var38.method3736((byte) 125).field1944;
                            if (var42.field10008) {
                                var41 = 2;
                            }
                        } else {
                            var43 = var37.field8924;
                            if (var43 == -1) {
                                var43 = var38.method3736((byte) 120).field1944;
                            }
                        }
                        class318[] var44 = class161.field2085;
                        if (~var43 != 0) {
                            class318[] var45 = (class318[]) class766.field10538.method312(0, (long) var43);
                            if (var45 == null) {
                                class279[] var46 = class279.method1817(class149.field1968, var43, 0);
                                if (var46 != null) {
                                    var45 = new class318[var46.length];
                                    for (int var47 = 0; var46.length > var47; ++var47) {
                                        var45[var47] = class111.field1332.method192(var46[var47], true);
                                    }
                                    class766.field10538.method305(var45, (long) var43, 18320);
                                }
                            }
                            if (var45 != null && var45.length >= 2) {
                                var44 = var45;
                            }
                        }
                        if (var41 >= var44.length) {
                            var41 = 1;
                        }
                        class318 var48 = var44[0];
                        class318 var49 = var44[var41];
                        var50 = var39 - Math.max(class705.field9812.field4363, var48.method738());
                        int var51 = class491.field6769[0] + arg4 + -(var48.method737() >> 1);
                        int var52 = var48.method737() * var38.field9152 / 255;
                        int var53 = var48.method738();
                        if (var38.field9152 > 0 && var52 < 2) {
                            var52 = 2;
                        }
                        var48.method2025(var51, var50);
                        class111.field1332.method252(var51, var50, var51 + var52, var50 + var53);
                        var49.method2025(var51, var50);
                        class111.field1332.method225(arg4, arg6, arg1 + arg4, arg0 + arg6);
                        class338.method2144((byte) -21, var51 + var48.method749(), var50, var50 + var53, var51);
                    } else {
                        var50 = var39 - Math.max(class705.field9812.field4363, class161.field2085[0].method738());
                    }
                    var50 -= 2;
                    if (!var38.field9136) {
                        if (class533.field7336 < var38.field9194) {
                            class318 var54 = class623.field8739[!var38.field9201 ? 0 : 2];
                            class318 var55 = class623.field8739[var38.field9201 ? 3 : 1];
                            boolean var56 = true;
                            int var57;
                            if (!(var38 instanceof class359)) {
                                var57 = var38.method3736((byte) 113).field1937;
                            } else {
                                var57 = var37.field8932;
                                if (~var57 == 0) {
                                    var57 = var38.method3736((byte) 126).field1937;
                                }
                            }
                            if (~var57 != 0) {
                                class318[] var58 = (class318[]) class380.field5447.method312(0, (long) var57);
                                if (var58 == null) {
                                    class279[] var59 = class279.method1817(class149.field1968, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class318[var59.length];
                                        for (int var60 = 0; var60 < var59.length; ++var60) {
                                            var58[var60] = class111.field1332.method192(var59[var60], true);
                                        }
                                        class380.field5447.method305(var58, (long) var57, 18320);
                                    }
                                }
                                if (var58 != null && var58.length == 4) {
                                    var54 = var58[var38.field9201 ? 2 : 0];
                                    var55 = var58[var38.field9201 ? 3 : 1];
                                }
                            }
                            int var61 = -class533.field7336 + var38.field9194;
                            int var62;
                            if (~var61 >= ~var38.field9163) {
                                var62 = var54.method737();
                            } else {
                                int var63 = var61 - var38.field9163;
                                int var64 = ~var38.field9170 != -1 ? (var38.field9197 - var63) / var38.field9170 * var38.field9170 : 0;
                                var62 = var64 * var54.method737() / var38.field9197;
                            }
                            int var65 = var54.method738();
                            var50 -= var65;
                            int var66 = arg4 - -class491.field6769[0] - (var54.method737() >> 1);
                            var54.method2025(var66, var50);
                            class111.field1332.method252(var66, var50, var62 + var66, var50 + var65);
                            var55.method2025(var66, var50);
                            class111.field1332.method225(arg4, arg6, arg1 + arg4, arg0 + arg6);
                            class338.method2144((byte) -32, var54.method749() + var66, var50, var50 + var65, var66);
                            var50 -= 2;
                        }
                        if (~var9 > ~var7) {
                            class723 var67 = (class723) var38;
                            if (var67.field9994 != -1) {
                                var50 -= 25;
                                class318 var68 = class382.field5483[var67.field9994];
                                var68.method2025(arg4 - -class491.field6769[0] + -12, var50);
                                class338.method2144((byte) -88, -12 + class491.field6769[0] + arg4 + var68.method749(), var50, var50 + var68.method736(), arg4 - -class491.field6769[0] + -12);
                                var50 -= 2;
                            }
                            if (~var67.field9995 != 0) {
                                var50 -= 25;
                                class318 var69 = class612.field8622[var67.field9995];
                                var69.method2025(arg4 + -12 + class491.field6769[0], var50);
                                class338.method2144((byte) -27, -12 + (arg4 - (-class491.field6769[0] + -var69.method749())), var50, var69.method736() + var50, arg4 + -12 + class491.field6769[0]);
                                var50 -= 2;
                            }
                        } else if (var37.field8897 >= 0 && ~class612.field8622.length < ~var37.field8897) {
                            class318 var70 = class612.field8622[var37.field8897];
                            var50 -= 25;
                            var70.method2025(class491.field6769[0] + arg4 + -(var70.method737() >> 1), var50);
                            class338.method2144((byte) -117, class491.field6769[0] + arg4 - ((var70.method737() >> 1) + -var70.method749()), var50, var50 + var70.method736(), class491.field6769[0] + arg4 + -(var70.method737() >> 1));
                            var50 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var38 instanceof class723)) {
                        int var71 = 0;
                        class657[] var72 = class115.field1569;
                        for (int var73 = 0; var72.length > var73; ++var73) {
                            class657 var75 = var72[var73];
                            if (var75 != null && ~var75.field9270 == -2 && ~class425.field5934[var9 - var7] == ~var75.field9275) {
                                class318 var76 = class182.field2292[var75.field9268];
                                if (~var76.method738() < ~var71) {
                                    var71 = var76.method738();
                                }
                                if (class533.field7336 % 20 < 10) {
                                    var76.method2025(arg4 - (-class491.field6769[0] + 12), var50 - var76.method738());
                                    class338.method2144((byte) -32, class491.field6769[0] + arg4 - 12 - -var76.method749(), var50 - var76.method738(), var50 - (var76.method738() + -var76.method736()), class491.field6769[0] + arg4 + -12);
                                }
                            }
                        }
                        if (var71 > 0) {
                            var10000 = var50 - (var71 + 2);
                        }
                    } else if (~var9 <= -1) {
                        int var77 = 0;
                        class657[] var78 = class115.field1569;
                        for (int var79 = 0; ~var78.length < ~var79; ++var79) {
                            class657 var81 = var78[var79];
                            if (var81 != null && ~var81.field9270 == -11 && var8[var9] == var81.field9275) {
                                class318 var82 = class182.field2292[var81.field9268];
                                if (var82.method738() > var77) {
                                    var77 = var82.method738();
                                }
                                var82.method2025(class491.field6769[0] + arg4 - 12, var50 - var82.method738());
                                class338.method2144((byte) -52, arg4 + -12 + (class491.field6769[0] - -var82.method749()), var50 + -var82.method738(), var50 + -var82.method738() + var82.method736(), arg4 + -12 + class491.field6769[0]);
                            }
                        }
                        if (var77 > 0) {
                            var10000 = var50 - (var77 + 2);
                        }
                    }
                    for (int var83 = 0; var83 < class510.field6923; ++var83) {
                        int var84 = var38.field9151[var83];
                        int var85 = var38.field9187[var83];
                        class302 var86 = null;
                        int var87 = 0;
                        if (~var85 > -1) {
                            if (var84 < 0) {
                                continue;
                            }
                        } else {
                            if (var84 <= class533.field7336) {
                                continue;
                            }
                            var86 = class10.field67.method2200(-75, var38.field9187[var83]);
                            var87 = var86.field4402;
                        }
                        int var88 = var38.field9156[var83];
                        class302 var89 = null;
                        if (var88 >= 0) {
                            var89 = class10.field67.method2200(-28, var88);
                        }
                        if (-var87 + var84 <= class533.field7336) {
                            int var90 = var38.field9188[var83];
                            if (~var90 <= -1) {
                                var38.field9152 = var90;
                                var38.field9126 = class533.field7336 - -300;
                                var38.field9188[var83] = -1;
                            }
                            if (var86 == null) {
                                var38.field9151[var83] = -1;
                            } else {
                                int var91 = var38.method2251(0) / 2;
                                class718.method4012(var91, arg2, arg1 >> 1, var38, -29197, arg5, arg0 >> 1);
                                if (class491.field6769[0] > -1) {
                                    class491.field6769[0] += class471.field6521[var83];
                                    class491.field6769[1] += field10693[var83];
                                    Object var92 = null;
                                    Object var93 = null;
                                    Object var94 = null;
                                    Object var95 = null;
                                    int var96 = 0;
                                    int var97 = 0;
                                    int var98 = 0;
                                    int var99 = 0;
                                    int var100 = 0;
                                    int var101 = 0;
                                    int var102 = 0;
                                    int var103 = 0;
                                    class318 var104 = null;
                                    class318 var105 = null;
                                    class318 var106 = null;
                                    class318 var107 = null;
                                    int var108 = 0;
                                    int var109 = 0;
                                    int var110 = 0;
                                    int var111 = 0;
                                    int var112 = 0;
                                    int var113 = 0;
                                    int var114 = 0;
                                    int var115 = 0;
                                    int var116 = 0;
                                    class318 var117 = var86.method1969(false, class111.field1332);
                                    if (var117 != null) {
                                        var96 = var117.method737();
                                        int var118 = var117.method738();
                                        var117.method744(class115.field1488);
                                        if (var116 < var118) {
                                            var116 = var118;
                                        }
                                        var100 = class115.field1488[0];
                                    }
                                    class318 var119 = var86.method1973(class111.field1332, (byte) -53);
                                    if (var119 != null) {
                                        var97 = var119.method737();
                                        int var120 = var119.method738();
                                        if (~var120 < ~var116) {
                                            var116 = var120;
                                        }
                                        var119.method744(class115.field1488);
                                        var101 = class115.field1488[0];
                                    }
                                    class318 var121 = var86.method1970(-50, class111.field1332);
                                    if (var121 != null) {
                                        var98 = var121.method737();
                                        int var122 = var121.method738();
                                        if (var122 > var116) {
                                            var116 = var122;
                                        }
                                        var121.method744(class115.field1488);
                                        var102 = class115.field1488[0];
                                    }
                                    class318 var123 = var86.method1975(class111.field1332, (byte) 106);
                                    if (var123 != null) {
                                        var99 = var123.method737();
                                        int var124 = var123.method738();
                                        if (~var124 < ~var116) {
                                            var116 = var124;
                                        }
                                        var123.method744(class115.field1488);
                                        var103 = class115.field1488[0];
                                    }
                                    if (var89 != null) {
                                        var104 = var89.method1969(false, class111.field1332);
                                        if (var104 != null) {
                                            var108 = var104.method737();
                                            int var125 = var104.method738();
                                            if (~var125 < ~var116) {
                                                var116 = var125;
                                            }
                                            var104.method744(class115.field1488);
                                            var112 = class115.field1488[0];
                                        }
                                        var105 = var89.method1973(class111.field1332, (byte) -53);
                                        if (var105 != null) {
                                            var109 = var105.method737();
                                            int var126 = var105.method738();
                                            if (~var126 < ~var116) {
                                                var116 = var126;
                                            }
                                            var105.method744(class115.field1488);
                                            var113 = class115.field1488[0];
                                        }
                                        var106 = var89.method1970(97, class111.field1332);
                                        if (var106 != null) {
                                            var110 = var106.method737();
                                            int var127 = var106.method738();
                                            if (var127 > var116) {
                                                var116 = var127;
                                            }
                                            var106.method744(class115.field1488);
                                            var114 = class115.field1488[0];
                                        }
                                        var107 = var89.method1975(class111.field1332, (byte) 106);
                                        if (var107 != null) {
                                            var111 = var107.method737();
                                            int var128 = var107.method738();
                                            if (~var128 < ~var116) {
                                                var116 = var128;
                                            }
                                            var107.method744(class115.field1488);
                                            var115 = class115.field1488[0];
                                        }
                                    }
                                    class442 var129 = class78.field878;
                                    class442 var130 = class78.field878;
                                    class300 var131 = class525.field7226;
                                    class300 var132 = class525.field7226;
                                    int var133 = var86.field4396;
                                    if (~var133 <= -1) {
                                        class442 var134 = class476.method2839(var133, true, class111.field1332, false);
                                        class300 var135 = class171.method1098(var133, -93, class111.field1332);
                                        if (var134 != null && var135 != null) {
                                            var129 = var134;
                                            var131 = var135;
                                        }
                                    }
                                    if (var89 != null) {
                                        int var136 = var89.field4396;
                                        if (~var136 <= -1) {
                                            class442 var137 = class476.method2839(var136, true, class111.field1332, false);
                                            class300 var138 = class171.method1098(var136, -85, class111.field1332);
                                            if (var137 != null && var138 != null) {
                                                var130 = var137;
                                                var132 = var138;
                                            }
                                        }
                                    }
                                    Object var139 = null;
                                    String var140 = null;
                                    boolean var141 = false;
                                    String var142 = var86.method1971(-116, var38.field9144[var83]);
                                    int var143 = 0;
                                    int var144 = var131.method1953(var142, (byte) 66);
                                    if (var89 != null) {
                                        var140 = var89.method1971(-44, var38.field9147[var83]);
                                        var143 = var132.method1953(var140, (byte) -113);
                                    }
                                    int var145 = 0;
                                    int var146 = 0;
                                    if (var97 > 0) {
                                        var145 = var144 / var97 + 1;
                                    }
                                    if (var89 != null && ~var109 < -1) {
                                        var146 = var143 / var109 + 1;
                                    }
                                    int var147 = 0;
                                    int var148 = var147;
                                    if (var96 > 0) {
                                        var147 += var96;
                                    }
                                    var147 += 2;
                                    int var149 = var147;
                                    if (~var98 < -1) {
                                        var147 += var98;
                                    }
                                    int var150 = var147;
                                    int var151 = var147;
                                    int var153;
                                    if (var97 > 0) {
                                        int var152 = var97 * var145;
                                        var153 = var147 + var152;
                                        var151 = (-var144 + var152) / 2 + var147;
                                    } else {
                                        var153 = var144 + var147;
                                    }
                                    int var154 = var153;
                                    if (~var99 < -1) {
                                        var153 += var99;
                                    }
                                    int var155 = 0;
                                    int var156 = 0;
                                    int var157 = 0;
                                    int var158 = 0;
                                    int var159 = 0;
                                    if (var89 != null) {
                                        var153 += 2;
                                        var155 = var153;
                                        if (~var108 < -1) {
                                            var153 += var108;
                                        }
                                        var153 += 2;
                                        var156 = var153;
                                        if (var110 > 0) {
                                            var153 += var110;
                                        }
                                        var157 = var153;
                                        var159 = var153;
                                        if (~var109 >= -1) {
                                            var153 += var143;
                                        } else {
                                            int var160 = var109 * var146;
                                            var159 = (var160 - var143) / 2 + var153;
                                            var153 += var160;
                                        }
                                        var158 = var153;
                                        if (var111 > 0) {
                                            var153 += var111;
                                        }
                                    }
                                    int var161 = var38.field9151[var83] - class533.field7336;
                                    int var162 = -(var86.field4387 * var161 / var86.field4402) + var86.field4387;
                                    int var163 = var86.field4385 * var161 / var86.field4402 + -var86.field4385;
                                    int var164 = class491.field6769[0] + arg4 + -(var153 >> 1) + var162;
                                    int var165 = class491.field6769[1] + var163 + arg6 - 12;
                                    int var166 = var165;
                                    int var167 = var116 + var165;
                                    int var168 = var165 - -var86.field4383 + 15;
                                    int var169 = -var131.field4363 + var168;
                                    if (var169 < var165) {
                                        var166 = var169;
                                    }
                                    int var170 = var131.field4355 + var168;
                                    if (var167 < var170) {
                                        var167 = var170;
                                    }
                                    int var171 = 0;
                                    if (var89 != null) {
                                        var171 = var165 - -var89.field4383 + 15;
                                        int var172 = -var132.field4363 + var171;
                                        int var173 = var132.field4355 + var171;
                                        if (var172 < var166) {
                                            var166 = var172;
                                        }
                                        if (var167 < var173) {
                                            var167 = var173;
                                        }
                                    }
                                    int var174 = 255;
                                    if (~var86.field4380 <= -1) {
                                        var174 = (var161 << 8) / (-var86.field4380 + var86.field4402);
                                    }
                                    if (~var174 <= -1 && var174 < 255) {
                                        int var175 = var174 << 24;
                                        int var176 = var175 | 16777215;
                                        if (var117 != null) {
                                            var117.method746(var164 - var100 + var148, var165, 0, var176, 1);
                                        }
                                        if (var121 != null) {
                                            var121.method746(-var102 + var149 + var164, var165, 0, var176, 1);
                                        }
                                        if (var119 != null) {
                                            for (int var177 = 0; var177 < var145; ++var177) {
                                                var119.method746(var97 * var177 + var164 - (-var150 - -var101), var165, 0, var176, 1);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method746(var164 - -var154 + -var103, var165, 0, var176, 1);
                                        }
                                        var129.method2653(var168, 117, var175 | var86.field4388, 0, var151 + var164, var142);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method746(var155 + var164 + -var112, var165, 0, var176, 1);
                                            }
                                            if (var106 != null) {
                                                var106.method746(var156 + var164 + -var114, var165, 0, var176, 1);
                                            }
                                            if (var105 != null) {
                                                for (int var178 = 0; ~var146 < ~var178; ++var178) {
                                                    var105.method746(var109 * var178 + var157 + -var113 + var164, var165, 0, var176, 1);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method746(var158 + var164 + -var115, var165, 0, var176, 1);
                                            }
                                            var130.method2653(var171, 109, var89.field4388 | var175, 0, var159 + var164, var140);
                                        }
                                    } else {
                                        if (var117 != null) {
                                            var117.method2025(var148 + var164 + -var100, var165);
                                        }
                                        if (var121 != null) {
                                            var121.method2025(-var102 + var149 + var164, var165);
                                        }
                                        if (var119 != null) {
                                            for (int var179 = 0; var179 < var145; ++var179) {
                                                var119.method2025(var97 * var179 + -var101 + var150 + var164, var165);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method2025(var154 + var164 - var103, var165);
                                        }
                                        var129.method2653(var168, 115, var86.field4388 | -16777216, 0, var151 + var164, var142);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method2025(-var112 + var164 + var155, var165);
                                            }
                                            if (var106 != null) {
                                                var106.method2025(var156 + var164 + -var114, var165);
                                            }
                                            if (var105 != null) {
                                                for (int var180 = 0; var180 < var146; ++var180) {
                                                    var105.method2025(var157 - -(var109 * var180) + -var113 + var164, var165);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method2025(var158 + var164 + -var115, var165);
                                            }
                                            var130.method2653(var171, 81, -16777216 | var89.field4388, 0, var159 + var164, var140);
                                        }
                                    }
                                    class338.method2144((byte) -51, var153 + var164, var166, var167 + 1, var164);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg3) {
            for (int var10 = 0; ~var10 > ~class50.field604; ++var10) {
                int var33 = class759.field10429[var10];
                class654 var34;
                if (~var33 <= -2049) {
                    var34 = ((class685) class450.field6288.method3669(false, (long) (var33 + -2048))).field9573;
                } else {
                    var34 = class413.field5787[var33];
                }
                int var35 = class418.field5817[var10];
                class654 var36;
                if (~var35 <= -2049) {
                    var36 = ((class685) class450.field6288.method3669(false, (long) (var35 - 2048))).field9573;
                } else {
                    var36 = class413.field5787[var35];
                }
                class111.method805(var34, arg6, --var34.field9134, var36, (byte) 43, arg5, arg2, arg0, arg1, arg4);
            }
            int var11 = class705.field9812.field4363 + class705.field9812.field4355 + 2;
            for (int var12 = 0; ~var12 > ~class232.field3493; ++var12) {
                int var13 = class139.field1778[var12];
                int var14 = class139.field1784[var12];
                int var15 = class139.field1777[var12];
                boolean var16 = true;
                while (var16) {
                    var16 = false;
                    for (int var32 = 0; ~var32 > ~var12; ++var32) {
                        if (~(var14 - -2) < ~(class139.field1784[var32] - var11) && -var11 + var14 < class139.field1784[var32] + 2 && -var15 + var13 < class139.field1778[var32] + class139.field1777[var32] && class139.field1778[var32] - class139.field1777[var32] < var13 - -var15 && var14 > class139.field1784[var32] + -var11) {
                            var14 = class139.field1784[var32] + -var11;
                            var16 = true;
                        }
                    }
                }
                class139.field1784[var12] = var14;
                String var17 = class139.field1779[var12];
                int var18 = class705.field9812.method1953(var17, (byte) -69);
                int var19 = arg4 - -var13;
                int var20 = -class705.field9812.field4363 + var14 + arg6;
                int var21 = var18 + var19;
                int var22 = class705.field9812.field4355 + var14 + arg6;
                if (~class116.field1571 == -1) {
                    int var23 = 16776960;
                    if (~class139.field1771[var12] > -7) {
                        var23 = class589.field8312[class139.field1771[var12]];
                    }
                    if (class139.field1771[var12] == 6) {
                        var23 = ~(class137.field1758 % 20) > -11 ? 16711680 : 16776960;
                    }
                    if (~class139.field1771[var12] == -8) {
                        var23 = ~(class137.field1758 % 20) <= -11 ? 65535 : 255;
                    }
                    if (class139.field1771[var12] == 8) {
                        var23 = class137.field1758 % 20 < 10 ? 45056 : 8454016;
                    }
                    if (~class139.field1771[var12] == -10) {
                        int var24 = 150 - class139.field1782[var12];
                        if (var24 < 50) {
                            var23 = var24 * 1280 + 16711680;
                        } else if (var24 >= 100) {
                            if (~var24 > -151) {
                                var23 = 65280 - (-(var24 * 5) + 500);
                            }
                        } else {
                            var23 = 16384000 - (var24 * 327680 - 16776960);
                        }
                    }
                    if (class139.field1771[var12] == 10) {
                        int var25 = 150 - class139.field1782[var12];
                        if (~var25 <= -51) {
                            if (~var25 > -101) {
                                var23 = -((var25 + -50) * 327680) + 16711935;
                            } else if (var25 < 150) {
                                var23 = var25 * 327680 + -32768000 + 255 + -((var25 + -100) * 5);
                            }
                        } else {
                            var23 = var25 * 5 + 16711680;
                        }
                    }
                    if (class139.field1771[var12] == 11) {
                        int var26 = -class139.field1782[var12] + 150;
                        if (var26 < 50) {
                            var23 = -(var26 * 327685) + 16777215;
                        } else if (var26 < 100) {
                            var23 = var26 * 327685 + -16384250 + 65280;
                        } else if (~var26 > -151) {
                            var23 = 49545215 - var26 * 327680;
                        }
                    }
                    int var27 = var23 | -16777216;
                    if (class139.field1783[var12] == 0) {
                        class386.field5515.method2645(arg6 - -var14, var27, var17, -16777216, 0, arg4 - -var13);
                        var19 -= var18 >> 1;
                        var21 -= var18 >> 1;
                    }
                    if (class139.field1783[var12] == 1) {
                        var19 -= var18 >> 1;
                        var21 -= var18 >> 1;
                        var20 -= 5;
                        class386.field5515.method2651(arg4 + var13, class137.field1758, 26567, arg6 + var14, var27, var17, -16777216);
                        var22 += 5;
                    }
                    if (~class139.field1783[var12] == -3) {
                        var22 += 5;
                        var20 -= 5;
                        class386.field5515.method2646(arg4 + var13, (byte) 114, var27, -16777216, arg6 - -var14, class137.field1758, var17);
                        var19 -= (var18 >> 1) + 5;
                        var21 -= (var18 >> 1) - 5;
                    }
                    if (~class139.field1783[var12] == -4) {
                        var19 -= var18 >> 1;
                        var21 -= var18 >> 1;
                        var20 -= 7;
                        var22 += 7;
                        class386.field5515.method2640(arg4 + var13, var17, -67, 150 - class139.field1782[var12], var27, -16777216, arg6 - -var14, class137.field1758);
                    }
                    if (class139.field1783[var12] == 4) {
                        int var28 = (150 - class139.field1782[var12]) * (100 + class705.field9812.method1953(var17, (byte) -84)) / 150;
                        class111.field1332.method252(arg4 + var13 + -50, arg6, arg4 + var13 + 50, arg6 - -arg0);
                        class386.field5515.method2653(arg6 + var14, 81, var27, -16777216, arg4 + var13 + 50 + -var28, var17);
                        var19 += -var28 + 50;
                        var21 += -var28 + 50;
                        class111.field1332.method225(arg4, arg6, arg1 + arg4, arg0 + arg6);
                    }
                    if (class139.field1783[var12] == 5) {
                        int var29 = -class139.field1782[var12] + 150;
                        int var30 = 0;
                        if (~var29 > -26) {
                            var30 = var29 - 25;
                        } else if (var29 > 125) {
                            var30 = var29 + -125;
                        }
                        int var31 = class705.field9812.field4363 - -class705.field9812.field4355;
                        class111.field1332.method252(arg4, -var31 + var14 + arg6 - 1, arg1 + arg4, arg6 - -var14 - -5);
                        var20 += var30;
                        var22 += var30;
                        var19 -= var18 >> 1;
                        class386.field5515.method2645(var14 + var30 + arg6, var27, var17, -16777216, 0, arg4 + var13);
                        var21 -= var18 >> 1;
                        class111.field1332.method225(arg4, arg6, arg4 - -arg1, arg0 + arg6);
                    }
                } else {
                    var19 -= var18 >> 1;
                    class386.field5515.method2645(arg6 + var14, -256, var17, -16777216, 0, arg4 + var13);
                    var21 -= var18 >> 1;
                }
                class338.method2144((byte) -27, var21 + 1, var20, var22 + 1, var19);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(II)V", line = 1167)
    public final void method488(int arg0, int arg1) {
        ++field10687;
        if (arg1 >= -105) {
            this.method486(32);
        }
        super.field2852 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)I", line = 1178)
    public final int method4280(byte arg0) {
        ++field10685;
        if (arg0 != -98) {
            this.method486(-75);
        }
        return super.field2852;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)I", line = 1195)
    public final int method490(byte arg0) {
        if (arg0 < 83) {
            field10692 = null;
        }
        ++field10683;
        return 2;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V", line = 1210)
    public static void method4281(int arg0) {
        field10690 = null;
        field10692 = null;
        field10680 = null;
        field10689 = null;
        field10693 = null;
        int var1 = 57 / ((arg0 - -65) / 46);
        field10682 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 1224)
    public final void method486(int arg0) {
        if (arg0 != -4591) {
            this.method487(-102, -127);
        }
        if (super.field2853.field8545.method4144((byte) -94) && super.field2852 == 2) {
            super.field2852 = 1;
        }
        ++field10686;
        if (super.field2852 < 0 || super.field2852 > 2) {
            super.field2852 = this.method490((byte) 84);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I", line = 1246)
    public final int method487(int arg0, int arg1) {
        ++field10681;
        int var3 = 58 / ((arg1 - -57) / 60);
        return 1;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lfs;)V", line = 1256)
    public class777(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(ILfs;)V", line = 1259)
    public class777(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILgs;)V", line = 1262)
    public static final void method4282(int arg0, class432 arg1) {
        if (arg0 != 14187) {
            method4282(52, (class432) null);
        }
        for (int var2 = 0; ~class688.field9599 < ~var2; ++var2) {
            int var3 = class363.field5236[var2];
            class723 var4 = class413.field5787[var3];
            int var5 = arg1.method3013(arg0 + -14291);
            if ((64 & var5) != 0) {
                var5 += arg1.method3013(113) << 8;
            }
            if ((2048 & var5) != 0) {
                var5 += arg1.method3013(arg0 ^ -14133) << 16;
            }
            class14.method56(0, var4, var5, arg1, var3);
        }
        ++field10688;
    }
}
