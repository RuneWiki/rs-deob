import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class441 extends class779 {

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZZII)V")
    public final void method1826(boolean arg0, boolean arg1, int arg2, int arg3) {
        if (arg0) {
            method2569((String) null, false);
        }
        ++field5984;
        class95.field1472.method519(arg3 + -2, arg2, super.field10732.field1031 + 4, super.field10732.field1030 - -2, ((class713) super.field10732).field9814, 0);
        class95.field1472.method519(arg3 + -1, arg2 - -1, super.field10732.field1031 + 2, super.field10732.field1030, 0, 0);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5982;
        int var7 = class696.field9624;
        class609.field8493 = 0;
        int[] var8 = class417.field5700;
        for (int var9 = arg0; var9 < var7 - -class610.field8520; ++var9) {
            class568 var37 = null;
            class385 var38;
            if (~var7 < ~var9) {
                var38 = class527.field7150[var8[var9]];
            } else {
                var38 = ((class755) class664.field9216.method337((long) class744.field10273[var9 - var7], 1)).field10414;
                var37 = ((class666) var38).field9253;
                if (var37.field8023 != null) {
                    var37 = var37.method3283((byte) -104, class694.field9613);
                    if (var37 == null) {
                        continue;
                    }
                }
            }
            if (~var38.field5277 <= -1 && (class93.field1455 == var38.field5215 || class235.field3379.field7391 == var38.field7391)) {
                class145.method1168(arg6 >> 1, arg3, arg4 >> 1, (byte) 93, var38, var38.method2330(false), arg1);
                if (class538.field7307[0] >= 0) {
                    if (var38.field5228 != null && (~var7 >= ~var9 || class364.field4952 == 0 || ~class364.field4952 == -4 || ~class364.field4952 == -2 && class626.method3527((byte) -117, ((class771) var38).field10641)) && class692.field9596 > class609.field8493) {
                        class692.field9602[class609.field8493] = class333.field4511.method1172(var38.field5228, (byte) 90) / 2;
                        class692.field9598[class609.field8493] = class538.field7307[0];
                        class692.field9606[class609.field8493] = class538.field7307[1];
                        class692.field9608[class609.field8493] = var38.field5257;
                        class692.field9603[class609.field8493] = var38.field5265;
                        class692.field9605[class609.field8493] = var38.field5223;
                        class692.field9607[class609.field8493] = var38.field5228;
                        ++class609.field8493;
                    }
                    int var39 = arg5 - -class538.field7307[1];
                    int var50;
                    if (!var38.field5229 && ~var38.field5231 < ~class440.field5977) {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var43;
                        if (~var9 > ~var7) {
                            class771 var42 = class527.field7150[var8[var9]];
                            var43 = var38.method2347(arg0 ^ 16383).field7329;
                            if (var42.field10639) {
                                var41 = 2;
                            }
                        } else {
                            var43 = var37.field8096;
                            if (var43 == -1) {
                                var43 = var38.method2347(arg0 + 16383).field7329;
                            }
                        }
                        class604[] var44 = class350.field4695;
                        if (var43 != -1) {
                            class604[] var45 = (class604[]) class737.field10182.method266((byte) -127, (long) var43);
                            if (var45 == null) {
                                class49[] var46 = class49.method373(class346.field4664, var43, 0);
                                if (var46 != null) {
                                    var45 = new class604[var46.length];
                                    for (int var47 = 0; var46.length > var47; ++var47) {
                                        var45[var47] = class95.field1472.method498(var46[var47], true);
                                    }
                                    class737.field10182.method270(var45, (long) var43, -122);
                                }
                            }
                            if (var45 != null && ~var45.length <= -3) {
                                var44 = var45;
                            }
                        }
                        if (var41 >= var44.length) {
                            var41 = 1;
                        }
                        class604 var48 = var44[0];
                        class604 var49 = var44[var41];
                        var50 = var39 - Math.max(class333.field4511.field2444, var48.method214());
                        int var51 = class538.field7307[0] + (arg2 - (var48.method220() >> 1));
                        int var52 = var48.method220() * var38.field5297 / 255;
                        int var53 = var48.method214();
                        if (var38.field5297 > 0 && ~var52 > -3) {
                            var52 = 2;
                        }
                        var48.method3430(var51, var50);
                        class95.field1472.method550(var51, var50, var51 - -var52, var50 + var53);
                        var49.method3430(var51, var50);
                        class95.field1472.method512(arg2, arg5, arg2 + arg4, arg5 - -arg6);
                        class686.method3861(var51, var48.method224() + var51, 22738, var50, var50 + var53);
                    } else {
                        var50 = var39 - Math.max(class333.field4511.field2444, class350.field4695[0].method214());
                    }
                    var50 -= 2;
                    if (!var38.field5229) {
                        if (~var38.field5281 < ~class440.field5977) {
                            class604 var54 = class759.field10456[var38.field5224 ? 2 : 0];
                            class604 var55 = class759.field10456[var38.field5224 ? 3 : 1];
                            boolean var56 = true;
                            int var57;
                            if (!(var38 instanceof class666)) {
                                var57 = var38.method2347(16383).field7331;
                            } else {
                                var57 = var37.field8101;
                                if (~var57 == 0) {
                                    var57 = var38.method2347(arg0 + 16383).field7331;
                                }
                            }
                            if (var57 != -1) {
                                class604[] var58 = (class604[]) class482.field6502.method266((byte) -128, (long) var57);
                                if (var58 == null) {
                                    class49[] var59 = class49.method373(class346.field4664, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class604[var59.length];
                                        for (int var60 = 0; var60 < var59.length; ++var60) {
                                            var58[var60] = class95.field1472.method498(var59[var60], true);
                                        }
                                        class482.field6502.method270(var58, (long) var57, -123);
                                    }
                                }
                                if (var58 != null && ~var58.length == -5) {
                                    var54 = var58[!var38.field5224 ? 0 : 2];
                                    var55 = var58[!var38.field5224 ? 1 : 3];
                                }
                            }
                            int var61 = -class440.field5977 + var38.field5281;
                            int var62;
                            if (~var38.field5261 <= ~var61) {
                                var62 = var54.method220();
                            } else {
                                int var63 = var61 - var38.field5261;
                                int var64 = ~var38.field5244 == -1 ? 0 : (-var63 + var38.field5240) / var38.field5244 * var38.field5244;
                                var62 = var54.method220() * var64 / var38.field5240;
                            }
                            int var65 = var54.method214();
                            var50 -= var65;
                            int var66 = class538.field7307[0] + arg2 + -(var54.method220() >> 1);
                            var54.method3430(var66, var50);
                            class95.field1472.method550(var66, var50, var62 + var66, var50 + var65);
                            var55.method3430(var66, var50);
                            class95.field1472.method512(arg2, arg5, arg2 + arg4, arg5 + arg6);
                            class686.method3861(var66, var54.method224() + var66, 22738, var50, var50 - -var65);
                            var50 -= 2;
                        }
                        if (var7 > var9) {
                            class771 var67 = (class771) var38;
                            if (~var67.field10654 != 0) {
                                var50 -= 25;
                                class604 var68 = class309.field4220[var67.field10654];
                                var68.method3430(class538.field7307[0] + arg2 + -12, var50);
                                class686.method3861(class538.field7307[0] + -12 + arg2, arg2 - -class538.field7307[0] - (12 - var68.method224()), 22738, var50, var50 + var68.method218());
                                var50 -= 2;
                            }
                            if (~var67.field10652 != 0) {
                                var50 -= 25;
                                class604 var69 = class62.field857[var67.field10652];
                                var69.method3430(arg2 - (-class538.field7307[0] - -12), var50);
                                class686.method3861(class538.field7307[0] + arg2 - 12, arg2 - -class538.field7307[0] - 12 - -var69.method224(), 22738, var50, var69.method218() + var50);
                                var50 -= 2;
                            }
                        } else if (~var37.field8092 <= -1 && ~class62.field857.length < ~var37.field8092) {
                            class604 var70 = class62.field857[var37.field8092];
                            var50 -= 25;
                            var70.method3430(class538.field7307[0] + arg2 + -(var70.method220() >> 1), var50);
                            class686.method3861(class538.field7307[0] + arg2 - (var70.method220() >> 1), class538.field7307[0] + arg2 + -(var70.method220() >> 1) - -var70.method224(), arg0 ^ 22738, var50, var70.method218() + var50);
                            var50 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var38 instanceof class771)) {
                        int var71 = 0;
                        class12[] var72 = class13.field198;
                        for (int var73 = 0; ~var73 > ~var72.length; ++var73) {
                            class12 var75 = var72[var73];
                            if (var75 != null && var75.field194 == 1 && class744.field10273[-var7 + var9] == var75.field192) {
                                class604 var76 = class18.field424[var75.field195];
                                if (~var76.method214() < ~var71) {
                                    var71 = var76.method214();
                                }
                                if (class440.field5977 % 20 < 10) {
                                    var76.method3430(arg2 + -12 - -class538.field7307[0], -var76.method214() + var50);
                                    class686.method3861(arg2 + -12 - -class538.field7307[0], class538.field7307[0] + (arg2 - (12 + -var76.method224())), arg0 ^ 22738, var50 + -var76.method214(), -var76.method214() + var50 + var76.method218());
                                }
                            }
                        }
                        if (var71 > 0) {
                            var10000 = var50 - (var71 + 2);
                        }
                    } else if (~var9 <= -1) {
                        int var77 = 0;
                        class12[] var78 = class13.field198;
                        for (int var79 = 0; var79 < var78.length; ++var79) {
                            class12 var81 = var78[var79];
                            if (var81 != null && var81.field194 == 10 && var8[var9] == var81.field192) {
                                class604 var82 = class18.field424[var81.field195];
                                if (~var77 > ~var82.method214()) {
                                    var77 = var82.method214();
                                }
                                var82.method3430(arg2 - -class538.field7307[0] + -12, -var82.method214() + var50);
                                class686.method3861(class538.field7307[0] + arg2 - 12, class538.field7307[0] + arg2 + -12 + var82.method224(), arg0 ^ 22738, -var82.method214() + var50, var50 + -var82.method214() + var82.method218());
                            }
                        }
                        if (~var77 < -1) {
                            var10000 = var50 - (var77 - -2);
                        }
                    }
                    for (int var83 = 0; ~var83 > ~class566.field8001; ++var83) {
                        int var84 = var38.field5227[var83];
                        int var85 = var38.field5237[var83];
                        class547 var86 = null;
                        int var87 = 0;
                        if (~var85 > -1) {
                            if (~var84 > -1) {
                                continue;
                            }
                        } else {
                            if (~var84 >= ~class440.field5977) {
                                continue;
                            }
                            var86 = class399.field5506.method3330(true, var38.field5237[var83]);
                            var87 = var86.field7446;
                        }
                        int var88 = var38.field5253[var83];
                        class547 var89 = null;
                        if (~var88 <= -1) {
                            var89 = class399.field5506.method3330(true, var88);
                        }
                        if (-var87 + var84 <= class440.field5977) {
                            int var90 = var38.field5241[var83];
                            if (var90 >= 0) {
                                var38.field5231 = class440.field5977 + 300;
                                var38.field5297 = var90;
                                var38.field5241[var83] = -1;
                            }
                            if (var86 == null) {
                                var38.field5227[var83] = -1;
                            } else {
                                int var91 = var38.method2330(false) / 2;
                                class145.method1168(arg6 >> 1, arg3, arg4 >> 1, (byte) 93, var38, var91, arg1);
                                if (class538.field7307[0] > -1) {
                                    class538.field7307[0] += class114.field2116[var83];
                                    class538.field7307[1] += class55.field789[var83];
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
                                    class604 var104 = null;
                                    class604 var105 = null;
                                    class604 var106 = null;
                                    class604 var107 = null;
                                    int var108 = 0;
                                    int var109 = 0;
                                    int var110 = 0;
                                    int var111 = 0;
                                    int var112 = 0;
                                    int var113 = 0;
                                    int var114 = 0;
                                    int var115 = 0;
                                    class604 var116 = var86.method3072(class95.field1472, (byte) 56);
                                    int var117 = 0;
                                    if (var116 != null) {
                                        var96 = var116.method220();
                                        int var118 = var116.method214();
                                        if (~var118 < ~var117) {
                                            var117 = var118;
                                        }
                                        var116.method212(class125.field2213);
                                        var100 = class125.field2213[0];
                                    }
                                    class604 var119 = var86.method3074(class95.field1472, false);
                                    if (var119 != null) {
                                        var97 = var119.method220();
                                        int var120 = var119.method214();
                                        var119.method212(class125.field2213);
                                        if (var120 > var117) {
                                            var117 = var120;
                                        }
                                        var101 = class125.field2213[0];
                                    }
                                    class604 var121 = var86.method3079(0, class95.field1472);
                                    if (var121 != null) {
                                        var98 = var121.method220();
                                        int var122 = var121.method214();
                                        if (var117 < var122) {
                                            var117 = var122;
                                        }
                                        var121.method212(class125.field2213);
                                        var102 = class125.field2213[0];
                                    }
                                    class604 var123 = var86.method3075(false, class95.field1472);
                                    if (var123 != null) {
                                        var99 = var123.method220();
                                        int var124 = var123.method214();
                                        if (~var124 < ~var117) {
                                            var117 = var124;
                                        }
                                        var123.method212(class125.field2213);
                                        var103 = class125.field2213[0];
                                    }
                                    if (var89 != null) {
                                        var104 = var89.method3072(class95.field1472, (byte) 98);
                                        if (var104 != null) {
                                            var108 = var104.method220();
                                            int var125 = var104.method214();
                                            if (var125 > var117) {
                                                var117 = var125;
                                            }
                                            var104.method212(class125.field2213);
                                            var112 = class125.field2213[0];
                                        }
                                        var105 = var89.method3074(class95.field1472, false);
                                        if (var105 != null) {
                                            var109 = var105.method220();
                                            int var126 = var105.method214();
                                            var105.method212(class125.field2213);
                                            if (~var117 > ~var126) {
                                                var117 = var126;
                                            }
                                            var113 = class125.field2213[0];
                                        }
                                        var106 = var89.method3079(0, class95.field1472);
                                        if (var106 != null) {
                                            var110 = var106.method220();
                                            int var127 = var106.method214();
                                            if (var127 > var117) {
                                                var117 = var127;
                                            }
                                            var106.method212(class125.field2213);
                                            var114 = class125.field2213[0];
                                        }
                                        var107 = var89.method3075(false, class95.field1472);
                                        if (var107 != null) {
                                            var111 = var107.method220();
                                            int var128 = var107.method214();
                                            if (~var117 > ~var128) {
                                                var117 = var128;
                                            }
                                            var107.method212(class125.field2213);
                                            var115 = class125.field2213[0];
                                        }
                                    }
                                    class67 var129 = class555.field7842;
                                    class67 var130 = class555.field7842;
                                    class145 var131 = class440.field5967;
                                    int var132 = var86.field7440;
                                    class145 var133 = class440.field5967;
                                    if (var132 >= 0) {
                                        class67 var134 = class739.method4093(-11020, var132, class95.field1472, true);
                                        class145 var135 = class95.method806(class95.field1472, (byte) -125, var132);
                                        if (var134 != null && var135 != null) {
                                            var131 = var135;
                                            var129 = var134;
                                        }
                                    }
                                    if (var89 != null) {
                                        int var136 = var89.field7440;
                                        if (~var136 <= -1) {
                                            class67 var137 = class739.method4093(arg0 + -11020, var136, class95.field1472, true);
                                            class145 var138 = class95.method806(class95.field1472, (byte) -126, var136);
                                            if (var137 != null && var138 != null) {
                                                var130 = var137;
                                                var133 = var138;
                                            }
                                        }
                                    }
                                    Object var139 = null;
                                    String var140 = null;
                                    boolean var141 = false;
                                    int var142 = 0;
                                    String var143 = var86.method3077(-30205, var38.field5267[var83]);
                                    int var144 = var131.method1172(var143, (byte) 30);
                                    if (var89 != null) {
                                        var140 = var89.method3077(-30205, var38.field5208[var83]);
                                        var142 = var133.method1172(var140, (byte) 92);
                                    }
                                    int var145 = 0;
                                    if (~var97 < -1) {
                                        var145 = var144 / var97 + 1;
                                    }
                                    int var146 = 0;
                                    if (var89 != null && var109 > 0) {
                                        var146 = var142 / var109 - -1;
                                    }
                                    int var147 = 0;
                                    int var148 = var147;
                                    if (~var96 < -1) {
                                        var147 += var96;
                                    }
                                    var147 += 2;
                                    int var149 = var147;
                                    if (var98 > 0) {
                                        var147 += var98;
                                    }
                                    int var150 = var147;
                                    int var151 = var147;
                                    int var152;
                                    if (var97 <= 0) {
                                        var152 = var144 + var147;
                                    } else {
                                        int var153 = var97 * var145;
                                        var152 = var147 + var153;
                                        var151 = (-var144 + var153) / 2 + var147;
                                    }
                                    int var154 = var152;
                                    if (var99 > 0) {
                                        var152 += var99;
                                    }
                                    int var155 = 0;
                                    int var156 = 0;
                                    int var157 = 0;
                                    int var158 = 0;
                                    int var159 = 0;
                                    if (var89 != null) {
                                        var152 += 2;
                                        var155 = var152;
                                        if (var108 > 0) {
                                            var152 += var108;
                                        }
                                        var152 += 2;
                                        var156 = var152;
                                        if (~var110 < -1) {
                                            var152 += var110;
                                        }
                                        var157 = var152;
                                        var159 = var152;
                                        if (var109 > 0) {
                                            int var160 = var109 * var146;
                                            var152 += var160;
                                            var159 += (-var142 + var160) / 2;
                                        } else {
                                            var152 += var142;
                                        }
                                        var158 = var152;
                                        if (var111 > 0) {
                                            var152 += var111;
                                        }
                                    }
                                    int var161 = var38.field5227[var83] - class440.field5977;
                                    int var162 = -(var86.field7447 * var161 / var86.field7446) + var86.field7447;
                                    int var163 = var86.field7426 * var161 / var86.field7446 + -var86.field7426;
                                    int var164 = arg2 - -class538.field7307[0] + var162 + -(var152 >> 1);
                                    int var165 = arg5 - -class538.field7307[1] + var163 + -12;
                                    int var166 = var165;
                                    int var167 = var165 - -var117;
                                    int var168 = var86.field7427 + var165 + 15;
                                    int var169 = -var131.field2444 + var168;
                                    if (var165 > var169) {
                                        var166 = var169;
                                    }
                                    int var170 = var131.field2434 + var168;
                                    if (~var167 > ~var170) {
                                        var167 = var170;
                                    }
                                    int var171 = 0;
                                    if (var89 != null) {
                                        var171 = var165 + 15 - -var89.field7427;
                                        int var172 = var171 - var133.field2444;
                                        int var173 = var171 - -var133.field2434;
                                        if (var166 > var172) {
                                            var166 = var172;
                                        }
                                        if (var173 > var167) {
                                            var167 = var173;
                                        }
                                    }
                                    int var174 = 255;
                                    if (var86.field7430 >= 0) {
                                        var174 = (var161 << 8) / (-var86.field7430 + var86.field7446);
                                    }
                                    if (~var174 <= -1 && ~var174 > -256) {
                                        int var175 = var174 << 24;
                                        int var176 = var175 | 16777215;
                                        if (var116 != null) {
                                            var116.method215(-var100 + var148 + var164, var165, 0, var176, 1);
                                        }
                                        if (var121 != null) {
                                            var121.method215(-var102 + var164 + var149, var165, 0, var176, 1);
                                        }
                                        if (var119 != null) {
                                            for (int var177 = 0; ~var177 > ~var145; ++var177) {
                                                var119.method215(var97 * var177 + var164 + -var101 + var150, var165, 0, var176, 1);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method215(-var103 + var154 + var164, var165, 0, var176, 1);
                                        }
                                        var129.method598(var168, var175 | var86.field7434, 0, var143, var151 + var164, (byte) -19);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method215(var155 + var164 + -var112, var165, 0, var176, 1);
                                            }
                                            if (var106 != null) {
                                                var106.method215(var164 - -var156 + -var114, var165, 0, var176, 1);
                                            }
                                            if (var105 != null) {
                                                for (int var178 = 0; ~var146 < ~var178; ++var178) {
                                                    var105.method215(var157 - var113 + var109 * var178 + var164, var165, 0, var176, 1);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method215(var158 - var115 + var164, var165, 0, var176, 1);
                                            }
                                            var130.method598(var171, var175 | var89.field7434, 0, var140, var159 + var164, (byte) -19);
                                        }
                                    } else {
                                        if (var116 != null) {
                                            var116.method3430(var164 - (-var148 + var100), var165);
                                        }
                                        if (var121 != null) {
                                            var121.method3430(-var102 + var164 + var149, var165);
                                        }
                                        if (var119 != null) {
                                            for (int var179 = 0; var179 < var145; ++var179) {
                                                var119.method3430(var164 - (-var150 - -var101 - var97 * var179), var165);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method3430(-var103 + var154 + var164, var165);
                                        }
                                        var129.method598(var168, var86.field7434 | -16777216, 0, var143, var151 + var164, (byte) -19);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method3430(var155 + var164 + -var112, var165);
                                            }
                                            if (var106 != null) {
                                                var106.method3430(var156 + var164 + -var114, var165);
                                            }
                                            if (var105 != null) {
                                                for (int var180 = 0; ~var146 < ~var180; ++var180) {
                                                    var105.method3430(var109 * var180 + var157 + var164 + -var113, var165);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method3430(var158 + var164 + -var115, var165);
                                            }
                                            var130.method598(var171, -16777216 | var89.field7434, 0, var140, var159 + var164, (byte) -19);
                                        }
                                    }
                                    class686.method3861(var164, var152 + var164, arg0 + 22738, var166, var167 - -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; class20.field441 > var10; ++var10) {
            int var33 = class187.field2892[var10];
            class385 var34;
            if (~var33 > -2049) {
                var34 = class527.field7150[var33];
            } else {
                var34 = ((class755) class664.field9216.method337((long) (var33 + -2048), arg0 + 1)).field10414;
            }
            int var35 = class766.field10569[var10];
            class385 var36;
            if (var35 >= 2048) {
                var36 = ((class755) class664.field9216.method337((long) (var35 + -2048), 1)).field10414;
            } else {
                var36 = class527.field7150[var35];
            }
            class205.method1459(arg6, arg5, var34, 18, arg2, arg4, arg3, var36, arg1, --var34.field5210);
        }
        int var11 = class333.field4511.field2444 + class333.field4511.field2434 + 2;
        for (int var12 = 0; ~var12 > ~class609.field8493; ++var12) {
            int var13 = class692.field9598[var12];
            int var14 = class692.field9606[var12];
            int var15 = class692.field9602[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; var12 > var32; ++var32) {
                    if (~(class692.field9606[var32] + -var11) > ~(var14 + 2) && -var11 + var14 < class692.field9606[var32] - -2 && ~(class692.field9602[var32] + class692.field9598[var32]) < ~(-var15 + var13) && class692.field9598[var32] + -class692.field9602[var32] < var13 + var15 && class692.field9606[var32] + -var11 < var14) {
                        var14 = class692.field9606[var32] - var11;
                        var16 = true;
                    }
                }
            }
            class692.field9606[var12] = var14;
            String var17 = class692.field9607[var12];
            int var18 = class333.field4511.method1172(var17, (byte) 62);
            int var19 = arg2 + var13;
            int var20 = arg5 - (-var14 - -class333.field4511.field2444);
            int var21 = var18 + var19;
            int var22 = class333.field4511.field2434 + var14 + arg5;
            if (class656.field9084 == 0) {
                int var23 = 16776960;
                if (class692.field9608[var12] < 6) {
                    var23 = class246.field3489[class692.field9608[var12]];
                }
                if (~class692.field9608[var12] == -7) {
                    var23 = class93.field1455 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class692.field9608[var12] == 7) {
                    var23 = class93.field1455 % 20 < 10 ? 255 : 65535;
                }
                if (class692.field9608[var12] == 8) {
                    var23 = class93.field1455 % 20 < 10 ? 45056 : 8454016;
                }
                if (~class692.field9608[var12] == -10) {
                    int var24 = -class692.field9605[var12] + 150;
                    if (~var24 > -51) {
                        var23 = var24 * 1280 + 16711680;
                    } else if (var24 < 100) {
                        var23 = -(var24 * 327680) + 16384000 + 16776960;
                    } else if (var24 < 150) {
                        var23 = var24 * 5 + -500 + 65280;
                    }
                }
                if (class692.field9608[var12] == 10) {
                    int var25 = 150 - class692.field9605[var12];
                    if (var25 < 50) {
                        var23 = var25 * 5 + 16711680;
                    } else if (~var25 > -101) {
                        var23 = -(var25 * 327680) + 16384000 + 16711935;
                    } else if (~var25 > -151) {
                        var23 = (var25 + -100) * 327680 + 255 + -(var25 * 5) + 500;
                    }
                }
                if (~class692.field9608[var12] == -12) {
                    int var26 = -class692.field9605[var12] + 150;
                    if (var26 >= 50) {
                        if (var26 < 100) {
                            var23 = var26 * 327685 + -16384250 + 65280;
                        } else if (var26 < 150) {
                            var23 = -((var26 + -100) * 327680) + 16777215;
                        }
                    } else {
                        var23 = 16777215 - var26 * 327685;
                    }
                }
                int var27 = var23 | -16777216;
                if (class692.field9603[var12] == 0) {
                    class557.field7861.method613(arg2 + var13, -16777216, var17, var27, true, arg5 + var14);
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                }
                if (class692.field9603[var12] == 1) {
                    var21 -= var18 >> 1;
                    var20 -= 5;
                    var19 -= var18 >> 1;
                    class557.field7861.method612(arg5 + var14, class93.field1455, var27, -16777216, var17, arg2 - -var13, 13898);
                    var22 += 5;
                }
                if (class692.field9603[var12] == 2) {
                    class557.field7861.method607(arg5 + var14, -16777216, class93.field1455, var27, (byte) 58, var17, arg2 - -var13);
                    var22 += 5;
                    var20 -= 5;
                    var21 -= (var18 >> 1) + -5;
                    var19 -= (var18 >> 1) + 5;
                }
                if (class692.field9603[var12] == 3) {
                    var19 -= var18 >> 1;
                    class557.field7861.method611(class93.field1455, var27, arg2 + var13, 76, var17, arg5 + var14, -class692.field9605[var12] + 150, -16777216);
                    var21 -= var18 >> 1;
                    var20 -= 7;
                    var22 += 7;
                }
                if (~class692.field9603[var12] == -5) {
                    int var28 = (-class692.field9605[var12] + 150) * (100 + class333.field4511.method1172(var17, (byte) 67)) / 150;
                    class95.field1472.method550(arg2 + var13 + -50, arg5, arg2 + var13 + 50, arg5 + arg6);
                    class557.field7861.method598(arg5 + var14, var27, -16777216, var17, -var28 + 50 + arg2 + var13, (byte) -19);
                    var19 += -var28 + 50;
                    var21 += -var28 + 50;
                    class95.field1472.method512(arg2, arg5, arg2 - -arg4, arg5 + arg6);
                }
                if (class692.field9603[var12] == 5) {
                    int var29 = -class692.field9605[var12] + 150;
                    int var30 = 0;
                    if (~var29 <= -26) {
                        if (~var29 < -126) {
                            var30 = var29 - 125;
                        }
                    } else {
                        var30 = var29 - 25;
                    }
                    int var31 = class333.field4511.field2444 + class333.field4511.field2434;
                    class95.field1472.method550(arg2, arg5 - 1 + -var31 + var14, arg2 - -arg4, arg5 + var14 - -5);
                    class557.field7861.method613(arg2 + var13, -16777216, var17, var27, true, arg5 + var14 + var30);
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                    var22 += var30;
                    var20 += var30;
                    class95.field1472.method512(arg2, arg5, arg2 - -arg4, arg5 + arg6);
                }
            } else {
                class557.field7861.method613(arg2 + var13, -16777216, var17, -256, true, arg5 + var14);
                var21 -= var18 >> 1;
                var19 -= var18 >> 1;
            }
            class686.method3861(var19, var21 + 1, arg0 ^ 22738, var20, var22 + 1);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lha;Lia;IB)V")
    public static final void method2568(class66 arg0, class616 arg1, int arg2, byte arg3) {
        if (arg3 == -119) {
            ++field5981;
            if (class389.field5345 != null && arg2 <= arg1.field8584) {
                for (int var4 = 0; ~var4 > ~class389.field5345.length; ++var4) {
                    if (~class389.field5345[var4] != 999999 && (arg1.field8583[0] <= class389.field5345[var4] || ~class389.field5345[var4] <= ~arg1.field8583[1] || ~class389.field5345[var4] <= ~arg1.field8583[2] || class389.field5345[var4] >= arg1.field8583[3]) && (class340.field4591[var4] >= arg1.field8581[0] || ~arg1.field8581[1] >= ~class340.field4591[var4] || ~arg1.field8581[2] >= ~class340.field4591[var4] || arg1.field8581[3] <= class340.field4591[var4]) && (class748.field10326[var4] <= arg1.field8581[0] || ~class748.field10326[var4] >= ~arg1.field8581[1] || class748.field10326[var4] <= arg1.field8581[2] || arg1.field8581[3] >= class748.field10326[var4]) && (~arg1.field8588[0] >= ~class573.field8168[var4] || class573.field8168[var4] >= arg1.field8588[1] || arg1.field8588[2] <= class573.field8168[var4] || arg1.field8588[3] <= class573.field8168[var4]) && (~arg1.field8588[0] <= ~class521.field7065[var4] || arg1.field8588[1] >= class521.field7065[var4] || class521.field7065[var4] <= arg1.field8588[2] || ~class521.field7065[var4] >= ~arg1.field8588[3])) {
                        return;
                    }
                }
            }
            if (~arg1.field8578 == -2) {
                int var5 = -class434.field5912 - -class389.field5342 + arg1.field8580;
                if (var5 >= 0 && ~var5 >= ~(class389.field5342 + class389.field5342)) {
                    int var6 = class389.field5342 + arg1.field8574 - class111.field1920;
                    if (~var6 <= -1) {
                        if (var6 > class389.field5342 + class389.field5342) {
                            return;
                        }
                    } else {
                        var6 = 0;
                    }
                    int var7 = -class111.field1920 + class389.field5342 + arg1.field8576;
                    if (var7 > class389.field5342 + class389.field5342) {
                        var7 = class389.field5342 + class389.field5342;
                    } else if (~var7 > -1) {
                        return;
                    }
                    boolean var8 = false;
                    while (~var7 <= ~var6) {
                        if (class641.field8883[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }
                    if (var8) {
                        float var9 = (float) (-arg1.field8581[0] + class14.field218);
                        if (var9 < 0.0F) {
                            var9 *= -1.0F;
                        }
                        if (!((float) class475.field6430 > var9)) {
                            if (class718.method3988(0, false, arg1)) {
                                if (class718.method3988(1, false, arg1)) {
                                    if (class718.method3988(2, false, arg1)) {
                                        if (class718.method3988(3, false, arg1)) {
                                            class339.field4581[class682.field9500++] = arg1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (arg1.field8578 == 2) {
                int var10 = arg1.field8574 - (-class389.field5342 + class111.field1920);
                if (var10 >= 0 && class389.field5342 + class389.field5342 >= var10) {
                    int var11 = -class434.field5912 + class389.field5342 + arg1.field8580;
                    if (~var11 <= -1) {
                        if (~(class389.field5342 + class389.field5342) > ~var11) {
                            return;
                        }
                    } else {
                        var11 = 0;
                    }
                    int var12 = arg1.field8587 - class434.field5912 - -class389.field5342;
                    if (~(class389.field5342 + class389.field5342) <= ~var12) {
                        if (var12 < 0) {
                            return;
                        }
                    } else {
                        var12 = class389.field5342 + class389.field5342;
                    }
                    boolean var13 = false;
                    while (~var11 >= ~var12) {
                        if (class641.field8883[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        float var14 = (float) (-arg1.field8588[0] + class758.field10451);
                        if (var14 < 0.0F) {
                            var14 *= -1.0F;
                        }
                        if (!(var14 < (float) class475.field6430)) {
                            if (class718.method3988(0, false, arg1)) {
                                if (class718.method3988(1, false, arg1)) {
                                    if (class718.method3988(2, false, arg1)) {
                                        if (class718.method3988(3, false, arg1)) {
                                            class339.field4581[class682.field9500++] = arg1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (~arg1.field8578 != -17 && ~arg1.field8578 != -9) {
                if (arg1.field8578 == 4) {
                    float var15 = (float) (arg1.field8583[0] + -class692.field9609);
                    if (!((float) class284.field3926 >= var15)) {
                        int var16 = -class111.field1920 + arg1.field8574 + class389.field5342;
                        if (var16 >= 0) {
                            if (~(class389.field5342 + class389.field5342) > ~var16) {
                                return;
                            }
                        } else {
                            var16 = 0;
                        }
                        int var17 = arg1.field8576 - class111.field1920 - -class389.field5342;
                        if (class389.field5342 + class389.field5342 >= var17) {
                            if (var17 < 0) {
                                return;
                            }
                        } else {
                            var17 = class389.field5342 + class389.field5342;
                        }
                        int var18 = arg1.field8580 - -class389.field5342 + -class434.field5912;
                        if (var18 >= 0) {
                            if (~(class389.field5342 - -class389.field5342) > ~var18) {
                                return;
                            }
                        } else {
                            var18 = 0;
                        }
                        int var19 = -class434.field5912 + arg1.field8587 - -class389.field5342;
                        if (var19 <= class389.field5342 - -class389.field5342) {
                            if (var19 < 0) {
                                return;
                            }
                        } else {
                            var19 = class389.field5342 + class389.field5342;
                        }
                        boolean var20 = false;
                        label295: for (int var21 = var18; ~var19 <= ~var21; ++var21) {
                            for (int var22 = var16; ~var17 <= ~var22; ++var22) {
                                if (class641.field8883[var21][var22]) {
                                    var20 = true;
                                    break label295;
                                }
                            }
                        }
                        if (var20) {
                            if (class718.method3988(0, false, arg1)) {
                                if (class718.method3988(1, false, arg1)) {
                                    if (class718.method3988(2, false, arg1)) {
                                        if (class718.method3988(3, false, arg1)) {
                                            class339.field4581[class682.field9500++] = arg1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                int var23 = arg1.field8580 - (class434.field5912 - class389.field5342);
                if (~var23 <= -1 && ~(class389.field5342 + class389.field5342) <= ~var23) {
                    int var24 = class389.field5342 + arg1.field8574 + -class111.field1920;
                    if (var24 >= 0 && ~(class389.field5342 + class389.field5342) <= ~var24) {
                        if (class641.field8883[var23][var24]) {
                            float var25 = (float) (-arg1.field8581[0] + class14.field218);
                            if (var25 < 0.0F) {
                                var25 *= -1.0F;
                            }
                            float var26 = (float) (-arg1.field8588[0] + class758.field10451);
                            if (var26 < 0.0F) {
                                var26 *= -1.0F;
                            }
                            if (!(var25 < (float) class475.field6430) || !((float) class475.field6430 > var26)) {
                                if (class718.method3988(0, false, arg1)) {
                                    if (class718.method3988(1, false, arg1)) {
                                        if (class718.method3988(2, false, arg1)) {
                                            if (class718.method3988(3, false, arg1)) {
                                                class339.field4581[class682.field9500++] = arg1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lgj;Lgj;Ljca;)V")
    public class441(class662 arg0, class662 arg1, class713 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method2569(String arg0, boolean arg1) {
        ++field5983;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class766.field10564; ++var2) {
                if (arg0.equalsIgnoreCase(class603.field8439[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class343.field4618[var2])) {
                    return true;
                }
            }
            if (arg1) {
                method2568((class66) null, (class616) null, 80, (byte) -9);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIZ)V")
    public final void method1827(int arg0, int arg1, int arg2, boolean arg3) {
        ++field5979;
        int var5 = this.method4270(104) * super.field10732.field1031 / 10000;
        class95.field1472.method537(arg2, arg1 + 2, var5, super.field10732.field1030 + -2, ((class713) super.field10732).field9809, 0);
        class95.field1472.method537(arg2 + var5, arg1 + 2, -var5 + super.field10732.field1031, super.field10732.field1030 + -2, 0, arg0);
    }
}
