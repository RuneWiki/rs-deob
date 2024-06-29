import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public abstract class class200 extends class159 {

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "Llf;")
    public class250 field2598;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "Lqja;")
    public static class327 field2592 = new class327(0, -1);

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "Lrda;")
    public static class689 field2600 = null;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "Z")
    public boolean field2597;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)I", line = 8)
    public int method1309(byte arg0) {
        int var2 = -108 % ((arg0 - 9) / 43);
        field2599++;
        return 0;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)V", line = 20)
    public static void method1311(boolean arg0) {
        field2600 = null;
        if (arg0) {
            field2592 = null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIIIB)V", line = 36)
    public static final void method1313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field2601++;
        if (arg6 != 68) {
            field2600 = null;
        }
        int var7 = class652.field8795;
        int[] var8 = class497.field6986;
        class182.field2390 = 0;
        for (int var9 = 0; var9 < class178.field2352 + var7; var9++) {
            class304 var37 = null;
            class425 var38;
            if (var9 >= var7) {
                var38 = ((class316) class176.field2326.method1248(arg6 + 44, (long) class245.field3206[var9 - var7])).field4455;
                var37 = ((class22) var38).field217;
                if (var37.field4295 != null) {
                    var37 = var37.method1968(class480.field6740, arg6 - 69);
                    if (var37 == null) {
                        continue;
                    }
                }
            } else {
                var38 = class84.field1204[var8[var9]];
            }
            if (var38.field6144 >= 0 && (class327.field4642 == var38.field6106 || class625.field8475.field2813 == var38.field2813)) {
                class770.method4238((byte) -73, var38.method130(arg6 + 58), arg1, arg5, var38, arg3 >> 1, arg0 >> 1);
                if (class548.field7567[0] >= 0) {
                    if (var38.field6182 != null && (var7 <= var9 || class49.field494 == 0 || class49.field494 == 3 || class49.field494 == 1 && class91.method719(-45, ((class758) var38).field10367)) && class286.field4097 > class182.field2390) {
                        class286.field4095[class182.field2390] = class643.field8657.method3619((byte) -69, var38.field6182) / 2;
                        class286.field4099[class182.field2390] = class548.field7567[0];
                        class286.field4092[class182.field2390] = class548.field7567[1];
                        class286.field4094[class182.field2390] = var38.field6123;
                        class286.field4098[class182.field2390] = var38.field6137;
                        class286.field4091[class182.field2390] = var38.field6133;
                        class286.field4093[class182.field2390] = var38.field6182;
                        class182.field2390++;
                    }
                    int var39 = class548.field7567[1] + arg2;
                    int var50;
                    if (var38.field6135 || class572.field7788 >= var38.field6174) {
                        var50 = var39 - Math.max(class643.field8657.field8769, class545.field7530[0].method351());
                    } else {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var43;
                        if (var7 > var9) {
                            class758 var42 = class84.field1204[var8[var9]];
                            var43 = var38.method2573(-1).field7984;
                            if (var42.field10373) {
                                var41 = 2;
                            }
                        } else {
                            var43 = var37.field4307;
                            if (var43 == -1) {
                                var43 = var38.method2573(-1).field7984;
                            }
                        }
                        class140[] var44 = class545.field7530;
                        if (var43 != -1) {
                            class140[] var45 = (class140[]) class618.field8350.method3109((byte) 125, (long) var43);
                            if (var45 == null) {
                                class162[] var46 = class162.method1122(class490.field6826, var43, 0);
                                if (var46 != null) {
                                    var45 = new class140[var46.length];
                                    for (int var47 = 0; var47 < var46.length; var47++) {
                                        var45[var47] = class375.field5490.method466(var46[var47], true);
                                    }
                                    class618.field8350.method3108((long) var43, 16337, var45);
                                }
                            }
                            if (var45 != null && var45.length >= 2) {
                                var44 = var45;
                            }
                        }
                        if (var41 >= var44.length) {
                            var41 = 1;
                        }
                        class140 var48 = var44[0];
                        class140 var49 = var44[var41];
                        var50 = var39 - Math.max(class643.field8657.field8769, var48.method351());
                        int var51 = arg4 + class548.field7567[0] - (var48.method350() >> 1);
                        int var52 = var48.method350() * var38.field6176 / 255;
                        int var53 = var48.method351();
                        if (var38.field6176 > 0 && var52 < 2) {
                            var52 = 2;
                        }
                        var48.method968(var51, var50);
                        class375.field5490.method525(var51, var50, var51 + var52, var50 + var53);
                        var49.method968(var51, var50);
                        class375.field5490.method453(arg4, arg2, arg4 + arg0, arg2 + arg3);
                        class199.method1300(var50, var48.method343() + var51, 8963, var51, var50 + var53);
                    }
                    var50 -= 2;
                    if (!var38.field6135) {
                        if (class572.field7788 < var38.field6130) {
                            class140 var54 = class761.field10457[var38.field6145 ? 2 : 0];
                            class140 var55 = class761.field10457[var38.field6145 ? 3 : 1];
                            boolean var56 = true;
                            int var57;
                            if (var38 instanceof class22) {
                                var57 = var37.field4283;
                                if (var57 == -1) {
                                    var57 = var38.method2573(-1).field8006;
                                }
                            } else {
                                var57 = var38.method2573(-1).field8006;
                            }
                            if (var57 != -1) {
                                class140[] var58 = (class140[]) class355.field5177.method3109((byte) 121, (long) var57);
                                if (var58 == null) {
                                    class162[] var59 = class162.method1122(class490.field6826, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class140[var59.length];
                                        for (int var60 = 0; var60 < var59.length; var60++) {
                                            var58[var60] = class375.field5490.method466(var59[var60], true);
                                        }
                                        class355.field5177.method3108((long) var57, 16337, var58);
                                    }
                                }
                                if (var58 != null && var58.length == 4) {
                                    var54 = var58[var38.field6145 ? 2 : 0];
                                    var55 = var58[var38.field6145 ? 3 : 1];
                                }
                            }
                            int var61 = var38.field6130 - class572.field7788;
                            int var64;
                            if (var38.field6131 < var61) {
                                int var62 = var61 - var38.field6131;
                                int var63 = var38.field6152 == 0 ? 0 : (var38.field6159 - var62) / var38.field6152 * var38.field6152;
                                var64 = var63 * var54.method350() / var38.field6159;
                            } else {
                                var64 = var54.method350();
                            }
                            int var65 = var54.method351();
                            var50 -= var65;
                            int var66 = class548.field7567[0] + arg4 - (var54.method350() >> 1);
                            var54.method968(var66, var50);
                            class375.field5490.method525(var66, var50, var64 + var66, var50 + var65);
                            var55.method968(var66, var50);
                            class375.field5490.method453(arg4, arg2, arg0 + arg4, arg2 + arg3);
                            class199.method1300(var50, var54.method343() + var66, arg6 + 8895, var66, var50 + var65);
                            var50 -= 2;
                        }
                        if (var9 < var7) {
                            class758 var68 = (class758) var38;
                            if (var68.field10364 != -1) {
                                var50 -= 25;
                                class140 var69 = class583.field7917[var68.field10364];
                                var69.method968(class548.field7567[0] + arg4 - 12, var50);
                                class199.method1300(var50, class548.field7567[0] + (arg4 + var69.method343()) - 12, arg6 ^ 0x2347, class548.field7567[0] + arg4 - 12, var50 + var69.method340());
                                var50 -= 2;
                            }
                            if (var68.field10349 != -1) {
                                var50 -= 25;
                                class140 var70 = class412.field5916[var68.field10349];
                                var70.method968(class548.field7567[0] + arg4 - 12, var50);
                                class199.method1300(var50, class548.field7567[0] + arg4 + var70.method343() - 12, 8963, class548.field7567[0] + arg4 - 12, var50 - -var70.method340());
                                var50 -= 2;
                            }
                        } else if (var37.field4265 >= 0 && class412.field5916.length > var37.field4265) {
                            class140 var67 = class412.field5916[var37.field4265];
                            var50 -= 25;
                            var67.method968(class548.field7567[0] + (arg4 - (var67.method350() >> 1)), var50);
                            class199.method1300(var50, class548.field7567[0] + arg4 - (var67.method350() >> 1) + var67.method343(), arg6 ^ 0x2347, class548.field7567[0] + (arg4 - (var67.method350() >> 1)), var50 + var67.method340());
                            var50 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var38 instanceof class758)) {
                        int var71 = 0;
                        class436[] var72 = class681.field9112;
                        for (int var73 = 0; var73 < var72.length; var73++) {
                            class436 var75 = var72[var73];
                            if (var75 != null && var75.field6307 == 1 && class245.field3206[var9 - var7] == var75.field6304) {
                                class140 var76 = class405.field5744[var75.field6311];
                                if (var71 < var76.method351()) {
                                    var71 = var76.method351();
                                }
                                if (class572.field7788 % 20 < 10) {
                                    var76.method968(class548.field7567[0] + arg4 - 12, var50 + -var76.method351());
                                    class199.method1300(var50 - var76.method351(), class548.field7567[0] + arg4 + -12 - -var76.method343(), 8963, arg4 + class548.field7567[0] - 12, var50 + -var76.method351() - -var76.method340());
                                }
                            }
                        }
                        if (var71 > 0) {
                            var10000 = var50 - (var71 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var77 = 0;
                        class436[] var78 = class681.field9112;
                        for (int var79 = 0; var79 < var78.length; var79++) {
                            class436 var81 = var78[var79];
                            if (var81 != null && var81.field6307 == 10 && var8[var9] == var81.field6304) {
                                class140 var82 = class405.field5744[var81.field6311];
                                if (var82.method351() > var77) {
                                    var77 = var82.method351();
                                }
                                var82.method968(arg4 + class548.field7567[0] - 12, -var82.method351() + var50);
                                class199.method1300(var50 - var82.method351(), class548.field7567[0] + -12 + arg4 + var82.method343(), arg6 ^ 0x2347, class548.field7567[0] + arg4 - 12, var50 - (var82.method351() - var82.method340()));
                            }
                        }
                        if (var77 > 0) {
                            var10000 = var50 - (var77 + 2);
                        }
                    }
                    for (int var83 = 0; var83 < class7.field49; var83++) {
                        int var84 = var38.field6162[var83];
                        int var85 = var38.field6122[var83];
                        class529 var86 = null;
                        int var87 = 0;
                        if (var85 >= 0) {
                            if (var84 <= class572.field7788) {
                                continue;
                            }
                            var86 = class83.field1185.method2900(var38.field6122[var83], arg6 ^ 0x72);
                            var87 = var86.field7315;
                        } else if (var84 < 0) {
                            continue;
                        }
                        int var88 = var38.field6166[var83];
                        class529 var89 = null;
                        if (var88 >= 0) {
                            var89 = class83.field1185.method2900(var88, -101);
                        }
                        if ((var84 - var87) <= class572.field7788) {
                            int var90 = var38.field6171[var83];
                            if (var90 >= 0) {
                                var38.field6174 = class572.field7788 + 300;
                                var38.field6176 = var90;
                                var38.field6171[var83] = -1;
                            }
                            if (var86 == null) {
                                var38.field6162[var83] = -1;
                            } else {
                                int var91 = var38.method130(117) / 2;
                                class770.method4238((byte) -73, var91, arg1, arg5, var38, arg3 >> 1, arg0 >> 1);
                                if (class548.field7567[0] > -1) {
                                    class548.field7567[0] += class365.field5267[var83];
                                    class548.field7567[1] += class148.field1992[var83];
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
                                    class140 var104 = null;
                                    class140 var105 = null;
                                    class140 var106 = null;
                                    class140 var107 = null;
                                    int var108 = 0;
                                    int var109 = 0;
                                    int var110 = 0;
                                    int var111 = 0;
                                    int var112 = 0;
                                    int var113 = 0;
                                    int var114 = 0;
                                    int var115 = 0;
                                    int var116 = 0;
                                    class140 var117 = var86.method3066(-86, class375.field5490);
                                    if (var117 != null) {
                                        var96 = var117.method350();
                                        int var118 = var117.method351();
                                        if (var116 < var118) {
                                            var116 = var118;
                                        }
                                        var117.method346(class65.field890);
                                        var100 = class65.field890[0];
                                    }
                                    class140 var119 = var86.method3063(class375.field5490, -1);
                                    if (var119 != null) {
                                        var97 = var119.method350();
                                        int var120 = var119.method351();
                                        if (var120 > var116) {
                                            var116 = var120;
                                        }
                                        var119.method346(class65.field890);
                                        var101 = class65.field890[0];
                                    }
                                    class140 var121 = var86.method3067(class375.field5490, -110);
                                    if (var121 != null) {
                                        var98 = var121.method350();
                                        int var122 = var121.method351();
                                        var121.method346(class65.field890);
                                        if (var116 < var122) {
                                            var116 = var122;
                                        }
                                        var102 = class65.field890[0];
                                    }
                                    class140 var123 = var86.method3060(class375.field5490, -1);
                                    if (var123 != null) {
                                        var99 = var123.method350();
                                        int var124 = var123.method351();
                                        if (var124 > var116) {
                                            var116 = var124;
                                        }
                                        var123.method346(class65.field890);
                                        var103 = class65.field890[0];
                                    }
                                    if (var89 != null) {
                                        var104 = var89.method3066(64, class375.field5490);
                                        if (var104 != null) {
                                            var108 = var104.method350();
                                            int var125 = var104.method351();
                                            var104.method346(class65.field890);
                                            if (var116 < var125) {
                                                var116 = var125;
                                            }
                                            var112 = class65.field890[0];
                                        }
                                        var105 = var89.method3063(class375.field5490, -1);
                                        if (var105 != null) {
                                            var109 = var105.method350();
                                            int var126 = var105.method351();
                                            var105.method346(class65.field890);
                                            if (var126 > var116) {
                                                var116 = var126;
                                            }
                                            var113 = class65.field890[0];
                                        }
                                        var106 = var89.method3067(class375.field5490, -124);
                                        if (var106 != null) {
                                            var110 = var106.method350();
                                            int var127 = var106.method351();
                                            if (var116 < var127) {
                                                var116 = var127;
                                            }
                                            var106.method346(class65.field890);
                                            var114 = class65.field890[0];
                                        }
                                        var107 = var89.method3060(class375.field5490, -1);
                                        if (var107 != null) {
                                            var111 = var107.method350();
                                            int var128 = var107.method351();
                                            var107.method346(class65.field890);
                                            if (var128 > var116) {
                                                var116 = var128;
                                            }
                                            var115 = class65.field890[0];
                                        }
                                    }
                                    class67 var129 = class734.field9957;
                                    class67 var130 = class734.field9957;
                                    class651 var131 = class687.field9196;
                                    class651 var132 = class687.field9196;
                                    int var133 = var86.field7322;
                                    if (var133 >= 0) {
                                        class67 var134 = class792.method4329(class375.field5490, true, arg6 - 157, var133);
                                        class651 var135 = class649.method3606(43, var133, class375.field5490);
                                        if (var134 != null && var135 != null) {
                                            var129 = var134;
                                            var131 = var135;
                                        }
                                    }
                                    if (var89 != null) {
                                        int var136 = var89.field7322;
                                        if (var136 >= 0) {
                                            class67 var137 = class792.method4329(class375.field5490, true, -92, var136);
                                            class651 var138 = class649.method3606(arg6 ^ 0x53, var136, class375.field5490);
                                            if (var137 != null && var138 != null) {
                                                var132 = var138;
                                                var130 = var137;
                                            }
                                        }
                                    }
                                    Object var139 = null;
                                    String var140 = null;
                                    boolean var141 = false;
                                    String var142 = var86.method3061(var38.field6124[var83], -8);
                                    int var143 = 0;
                                    int var144 = var131.method3619((byte) -69, var142);
                                    if (var89 != null) {
                                        var140 = var89.method3061(var38.field6114[var83], -8);
                                        var143 = var132.method3619((byte) -69, var140);
                                    }
                                    int var145 = 0;
                                    if (var97 > 0) {
                                        var145 = var144 / var97 + 1;
                                    }
                                    int var146 = 0;
                                    if (var89 != null && var109 > 0) {
                                        var146 = var143 / var109 + 1;
                                    }
                                    int var147 = 0;
                                    int var148 = var147;
                                    if (var96 > 0) {
                                        var147 += var96;
                                    }
                                    var147 += 2;
                                    int var149 = var147;
                                    if (var98 > 0) {
                                        var147 += var98;
                                    }
                                    int var150 = var147;
                                    int var151 = var147;
                                    int var153;
                                    if (var97 > 0) {
                                        int var152 = var97 * var145;
                                        var153 = var147 + var152;
                                        var151 = (var152 - var144) / 2 + var147;
                                    } else {
                                        var153 = var144 + var147;
                                    }
                                    int var154 = var153;
                                    if (var99 > 0) {
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
                                        if (var108 > 0) {
                                            var153 += var108;
                                        }
                                        var153 += 2;
                                        var156 = var153;
                                        if (var110 > 0) {
                                            var153 += var110;
                                        }
                                        var157 = var153;
                                        var159 = var153;
                                        if (var109 <= 0) {
                                            var153 += var143;
                                        } else {
                                            int var160 = var109 * var146;
                                            var153 += var160;
                                            var159 += (var160 - var143) / 2;
                                        }
                                        var158 = var153;
                                        if (var111 > 0) {
                                            var153 += var111;
                                        }
                                    }
                                    int var161 = var38.field6162[var83] - class572.field7788;
                                    int var162 = var86.field7327 - (var86.field7327 * var161 / var86.field7315);
                                    int var163 = (var86.field7310 * var161 / var86.field7315) - var86.field7310;
                                    int var164 = arg4 + class548.field7567[0] + var162 - (var153 >> 1);
                                    int var165 = arg2 + var163 + class548.field7567[1] - 12;
                                    int var166 = var165;
                                    int var167 = var165 + var116;
                                    int var168 = var165 + var86.field7316 + 15;
                                    int var169 = var168 - var131.field8769;
                                    if (var169 < var165) {
                                        var166 = var169;
                                    }
                                    int var170 = var168 + var131.field8782;
                                    if (var170 > var167) {
                                        var167 = var170;
                                    }
                                    int var171 = 0;
                                    if (var89 != null) {
                                        var171 = var89.field7316 + var165 + 15;
                                        int var172 = var171 - var132.field8769;
                                        int var173 = var132.field8782 + var171;
                                        if (var172 < var166) {
                                            var166 = var172;
                                        }
                                        if (var167 < var173) {
                                            var167 = var173;
                                        }
                                    }
                                    int var174 = 255;
                                    if (var86.field7319 >= 0) {
                                        var174 = (var161 << 8) / (var86.field7315 - var86.field7319);
                                    }
                                    if (var174 >= 0 && var174 < 255) {
                                        int var175 = var174 << 24;
                                        int var176 = var175 | 0xFFFFFF;
                                        if (var117 != null) {
                                            var117.method358(var164 - (var100 - var148), var165, 0, var176, 1);
                                        }
                                        if (var121 != null) {
                                            var121.method358(var149 + var164 - var102, var165, 0, var176, 1);
                                        }
                                        if (var119 != null) {
                                            for (int var177 = 0; var177 < var145; var177++) {
                                                var119.method358(var164 + var97 * var177 + var150 - var101, var165, 0, var176, 1);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method358(var164 + var154 - var103, var165, 0, var176, 1);
                                        }
                                        var129.method568(var86.field7332 | var175, var164 + var151, var168, var142, 0, true);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method358(var155 + var164 - var112, var165, 0, var176, 1);
                                            }
                                            if (var106 != null) {
                                                var106.method358(var156 + var164 - var114, var165, 0, var176, 1);
                                            }
                                            if (var105 != null) {
                                                for (int var178 = 0; var178 < var146; var178++) {
                                                    var105.method358(var109 * var178 + var157 + var164 - var113, var165, 0, var176, 1);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method358(var164 + var158 - var115, var165, 0, var176, 1);
                                            }
                                            var130.method568(var89.field7332 | var175, var159 + var164, var171, var140, 0, true);
                                        }
                                    } else {
                                        if (var117 != null) {
                                            var117.method968(var164 + var148 - var100, var165);
                                        }
                                        if (var121 != null) {
                                            var121.method968(var164 + var149 - var102, var165);
                                        }
                                        if (var119 != null) {
                                            for (int var179 = 0; var179 < var145; var179++) {
                                                var119.method968(var97 * var179 + (var150 + var164 - var101), var165);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method968(var164 + var154 - var103, var165);
                                        }
                                        var129.method568(var86.field7332 | 0xFF000000, var151 + var164, var168, var142, 0, true);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method968(var164 + var155 - var112, var165);
                                            }
                                            if (var106 != null) {
                                                var106.method968(var164 + var156 - var114, var165);
                                            }
                                            if (var105 != null) {
                                                for (int var180 = 0; var180 < var146; var180++) {
                                                    var105.method968(var109 * var180 + var157 + var164 - var113, var165);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method968(var158 + var164 - var115, var165);
                                            }
                                            var130.method568(var89.field7332 | 0xFF000000, var164 + var159, var171, var140, 0, true);
                                        }
                                    }
                                    class199.method1300(var166, var153 + var164, 8963, var164, var167 + 1);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class79.field1096; var10++) {
            int var33 = class322.field4569[var10];
            class425 var34;
            if (var33 >= 2048) {
                var34 = ((class316) class176.field2326.method1248(109, (long) (var33 - 2048))).field4455;
            } else {
                var34 = class84.field1204[var33];
            }
            int var35 = class592.field8086[var10];
            class425 var36;
            if (var35 >= 2048) {
                var36 = ((class316) class176.field2326.method1248(118, (long) (var35 - 2048))).field4455;
            } else {
                var36 = class84.field1204[var35];
            }
            class771.method4243(--var34.field6116, arg1, -20586, arg5, arg0, arg2, var34, var36, arg4, arg3);
        }
        int var11 = class643.field8657.field8769 - (-class643.field8657.field8782 - 2);
        for (int var12 = 0; var12 < class182.field2390; var12++) {
            int var13 = class286.field4099[var12];
            int var14 = class286.field4092[var12];
            int var15 = class286.field4095[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; var32 < var12; var32++) {
                    if (var14 + 2 > class286.field4092[var32] - var11 && var14 - var11 < class286.field4092[var32] - -2 && class286.field4099[var32] + class286.field4095[var32] > -var15 + var13 && (class286.field4099[var32] - class286.field4095[var32]) < (var13 + var15) && var14 > class286.field4092[var32] - var11) {
                        var14 = class286.field4092[var32] - var11;
                        var16 = true;
                    }
                }
            }
            class286.field4092[var12] = var14;
            String var17 = class286.field4093[var12];
            int var18 = class643.field8657.method3619((byte) -69, var17);
            int var19 = arg4 + var13;
            int var20 = var14 + arg2 - class643.field8657.field8769;
            int var21 = var19 + var18;
            int var22 = arg2 + var14 + class643.field8657.field8782;
            if (class649.field8756 == 0) {
                int var23 = 16776960;
                if (class286.field4094[var12] < 6) {
                    var23 = class23.field235[class286.field4094[var12]];
                }
                if (class286.field4094[var12] == 6) {
                    var23 = class327.field4642 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class286.field4094[var12] == 7) {
                    var23 = class327.field4642 % 20 >= 10 ? 65535 : 255;
                }
                if (class286.field4094[var12] == 8) {
                    var23 = class327.field4642 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class286.field4094[var12] == 9) {
                    int var24 = 150 - class286.field4091[var12];
                    if (var24 < 50) {
                        var23 = var24 * 1280 + 16711680;
                    } else if (var24 < 100) {
                        var23 = 16776960 - ((var24 - 50) * 327680);
                    } else if (var24 < 150) {
                        var23 = (var24 - 100) * 5 + 65280;
                    }
                }
                if (class286.field4094[var12] == 10) {
                    int var25 = 150 - class286.field4091[var12];
                    if (var25 < 50) {
                        var23 = var25 * 5 + 16711680;
                    } else if (var25 < 100) {
                        var23 = 16711935 - (var25 * 327680 - 16384000);
                    } else if (var25 < 150) {
                        var23 = var25 * 327680 + 255 - ((var25 - 100) * 5) - 32768000;
                    }
                }
                if (class286.field4094[var12] == 11) {
                    int var26 = 150 - class286.field4091[var12];
                    if (var26 < 50) {
                        var23 = 16777215 - (var26 * 327685);
                    } else if (var26 < 100) {
                        var23 = ((var26 - 50) * 327685) + 65280;
                    } else if (var26 < 150) {
                        var23 = 16777215 - ((var26 - 100) * 327680);
                    }
                }
                int var27 = var23 | 0xFF000000;
                if (class286.field4098[var12] == 0) {
                    class88.field1251.method561(var27, var17, -16777216, -81, arg2 + var14, arg4 + var13);
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                }
                if (class286.field4098[var12] == 1) {
                    class88.field1251.method572(104, arg4 + var13, class327.field4642, var17, -16777216, var27, arg2 + var14);
                    var19 -= var18 >> 1;
                    var21 -= var18 >> 1;
                    var22 += 5;
                    var20 -= 5;
                }
                if (class286.field4098[var12] == 2) {
                    var22 += 5;
                    var20 -= 5;
                    var19 -= (var18 >> 1) + 5;
                    var21 -= (var18 >> 1) - 5;
                    class88.field1251.method559(var17, -16777216, -1, arg4 + var13, class327.field4642, arg2 + var14, var27);
                }
                if (class286.field4098[var12] == 3) {
                    var21 -= var18 >> 1;
                    var20 -= 7;
                    class88.field1251.method571(var27, 150 - class286.field4091[var12], arg4 + var13, class327.field4642, 2, -16777216, arg2 + var14, var17);
                    var19 -= var18 >> 1;
                    var22 += 7;
                }
                if (class286.field4098[var12] == 4) {
                    int var28 = (150 - class286.field4091[var12]) * (class643.field8657.method3619((byte) -69, var17) + 100) / 150;
                    class375.field5490.method525(arg4 + var13 - 50, arg2, arg4 + var13 + 50, arg2 + arg3);
                    var21 += 50 - var28;
                    var19 += 50 - var28;
                    class88.field1251.method568(var27, var13 + arg4 + 50 - var28, arg2 - -var14, var17, -16777216, true);
                    class375.field5490.method453(arg4, arg2, arg0 + arg4, arg2 + arg3);
                }
                if (class286.field4098[var12] == 5) {
                    int var29 = 150 - class286.field4091[var12];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    int var31 = class643.field8657.field8769 + class643.field8657.field8782;
                    class375.field5490.method525(arg4, arg2 + var14 - var31 - 1, arg0 + arg4, arg2 + var14 + 5);
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                    var22 += var30;
                    class88.field1251.method561(var27, var17, -16777216, 118, var14 + var30 + arg2, arg4 + var13);
                    var20 += var30;
                    class375.field5490.method453(arg4, arg2, arg0 + arg4, arg2 + arg3);
                }
            } else {
                var19 -= var18 >> 1;
                class88.field1251.method561(-256, var17, -16777216, 122, arg2 + var14, arg4 + var13);
                var21 -= var18 >> 1;
            }
            class199.method1300(var20, var21 + 1, 8963, var19, var22 + 1);
        }
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)Z", line = 1201)
    public final boolean method1314(int arg0) {
        if (arg0 >= -116) {
            this.method1307(-40, -87, (byte) 23);
        }
        field2596++;
        return false;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIILmfa;)V", line = 1215)
    public static final void method1315(int arg0, int arg1, int arg2, class641 arg3) {
        field2594++;
        if (!class677.field9075) {
            return;
        }
        int var4 = 0;
        for (class478 var5 = (class478) arg3.field8636.method152((byte) -13); var5 != null; var5 = (class478) arg3.field8636.method146((byte) 97)) {
            int var11 = class320.method2073(-128, var5);
            if (var4 < var11) {
                var4 = var11;
            }
        }
        var4 += 8;
        class626.field8480 = arg3.field8639 * 16 + (class348.field5048 ? 26 : 22);
        int var6 = arg3.field8639 * 16 + 21;
        int var7 = class92.field1298 + class677.field9082;
        if ((var4 + var7) > class460.field6558) {
            var7 = class92.field1298 - var4;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = class348.field5048 ? 33 : 31;
        int var9 = arg1 + 13 - var8;
        if (var6 + var9 > class693.field9222) {
            var9 = class693.field9222 - var6;
        }
        class271.field3950 = var7;
        if (var9 < 0) {
            var9 = 0;
        }
        class696.field9241 = var9;
        class740.field10028 = arg3;
        class588.field8032 = var4;
        int var10 = 19 % ((-arg0 - 61) / 42);
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(B)I", line = 1270)
    public final int method1316(byte arg0) {
        if (arg0 > -48) {
            this.field2598 = null;
        }
        field2593++;
        return 1;
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Llf;)V", line = 1282)
    public class200(class250 arg0) {
        this.field2598 = arg0;
    }

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "(I)Z", line = 1295)
    public final boolean method1319(int arg0) {
        if (arg0 == 0) {
            field2595++;
            return this.field2597;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIB)V")
    public abstract void method1307(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lrba;Lrba;II)V")
    public abstract void method1308(class456 arg0, class456 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
    public abstract void method1310(int arg0);

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)Z")
    public abstract boolean method1312(int arg0);

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)V")
    public abstract void method1317(int arg0, int arg1);

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(Z)Z")
    public abstract boolean method1318(boolean arg0);
}
