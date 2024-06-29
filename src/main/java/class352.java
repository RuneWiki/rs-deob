import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class352 extends class494 {

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field5124 = -1;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "Lqe;")
    public static class469 field5127 = new class469(66, 20);

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "Lqe;")
    public static class469 field5128 = new class469(71, 6);

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field5129 = 0;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)V", line = 14)
    public static void method2213(boolean arg0) {
        field5128 = null;
        if (!arg0) {
            method2213(true);
        }
        field5127 = null;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIII)V", line = 31)
    public static final void method2214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5125++;
        int var7 = class254.field3653;
        int[] var8 = class345.field4993;
        class684.field9465 = 0;
        int var9 = 36 / ((arg6 - 80) / 36);
        for (int var10 = 0; var10 < (var7 + class441.field6552); var10++) {
            class348 var38 = null;
            class405 var39;
            if (var10 < var7) {
                var39 = class314.field4456[var8[var10]];
            } else {
                var39 = ((class432) class497.field7067.method2287((long) class338.field4921[var10 - var7], (byte) -117)).field6439;
                var38 = ((class282) var39).field4008;
                if (var38.field5076 != null) {
                    var38 = var38.method2207(77, class83.field1160);
                    if (var38 == null) {
                        continue;
                    }
                }
            }
            if (var39.field6114 >= 0 && (class412.field6195 == var39.field6030 || class130.field1749.field8429 == var39.field8429)) {
                class441.method2727(16383, var39.method1808(14371), arg0, arg3 >> 1, arg1 >> 1, var39, arg5);
                if (class340.field4942[0] >= 0) {
                    if (var39.field6020 != null && (var7 <= var10 || class587.field8318 == 0 || class587.field8318 == 3 || class587.field8318 == 1 && class238.method1579(-4695, ((class689) var39).field9513)) && class242.field3524 > class684.field9465) {
                        class242.field3520[class684.field9465] = class335.field4827.method587(-60, var39.field6020) / 2;
                        class242.field3542[class684.field9465] = class340.field4942[0];
                        class242.field3533[class684.field9465] = class340.field4942[1];
                        class242.field3540[class684.field9465] = var39.field6044;
                        class242.field3521[class684.field9465] = var39.field6050;
                        class242.field3516[class684.field9465] = var39.field6099;
                        class242.field3526[class684.field9465] = var39.field6020;
                        class684.field9465++;
                    }
                    int var40 = class340.field4942[1] + arg2;
                    int var51;
                    if (var39.field6095 || var39.field6027 <= class357.field5189) {
                        var51 = var40 - Math.max(class335.field4827.field940, class12.field169[0].method1510());
                    } else {
                        boolean var41 = true;
                        byte var42 = 1;
                        int var44;
                        if (var10 < var7) {
                            class689 var43 = class314.field4456[var8[var10]];
                            var44 = var39.method2577(-1).field3770;
                            if (var43.field9497) {
                                var42 = 2;
                            }
                        } else {
                            var44 = var38.field5034;
                            if (var44 == -1) {
                                var44 = var39.method2577(-1).field3770;
                            }
                        }
                        class536[] var45 = class12.field169;
                        if (var44 != -1) {
                            class536[] var46 = (class536[]) class108.field1500.method803(125, (long) var44);
                            if (var46 == null) {
                                class129[] var47 = class129.method920(class640.field8990, var44, 0);
                                if (var47 != null) {
                                    var46 = new class536[var47.length];
                                    for (int var48 = 0; var48 < var47.length; var48++) {
                                        var46[var48] = class736.field10316.method422(var47[var48], true);
                                    }
                                    class108.field1500.method801(1, var46, (long) var44);
                                }
                            }
                            if (var46 != null && var46.length >= 2) {
                                var45 = var46;
                            }
                        }
                        if (var42 >= var45.length) {
                            var42 = 1;
                        }
                        class536 var49 = var45[0];
                        class536 var50 = var45[var42];
                        var51 = var40 - Math.max(class335.field4827.field940, var49.method1510());
                        int var52 = class340.field4942[0] + arg4 - (var49.method1517() >> 1);
                        int var53 = var49.method1517() * var39.field6111 / 255;
                        int var54 = var49.method1510();
                        if (var39.field6111 > 0 && var53 < 2) {
                            var53 = 2;
                        }
                        var49.method3142(var52, var51);
                        class736.field10316.method509(var52, var51, var52 + var53, var51 + var54);
                        var50.method3142(var52, var51);
                        class736.field10316.method476(arg4, arg2, arg1 + arg4, arg2 - -arg3);
                        class497.method2963(var51 + var54, var52 + var49.method1504(), (byte) 30, var51, var52);
                    }
                    var51 -= 2;
                    if (!var39.field6095) {
                        if (var39.field6115 > class357.field5189) {
                            class536 var55 = class474.field6895[var39.field6024 ? 2 : 0];
                            class536 var56 = class474.field6895[var39.field6024 ? 3 : 1];
                            boolean var57 = true;
                            int var58;
                            if ((var39 instanceof class282)) {
                                var58 = var38.field5039;
                                if (var58 == -1) {
                                    var58 = var39.method2577(-1).field3748;
                                }
                            } else {
                                var58 = var39.method2577(-1).field3748;
                            }
                            if (var58 != -1) {
                                class536[] var59 = (class536[]) class335.field4831.method803(124, (long) var58);
                                if (var59 == null) {
                                    class129[] var60 = class129.method920(class640.field8990, var58, 0);
                                    if (var60 != null) {
                                        var59 = new class536[var60.length];
                                        for (int var61 = 0; var61 < var60.length; var61++) {
                                            var59[var61] = class736.field10316.method422(var60[var61], true);
                                        }
                                        class335.field4831.method801(1, var59, (long) var58);
                                    }
                                }
                                if (var59 != null && var59.length == 4) {
                                    var55 = var59[var39.field6024 ? 2 : 0];
                                    var56 = var59[var39.field6024 ? 3 : 1];
                                }
                            }
                            int var62 = var39.field6115 - class357.field5189;
                            int var63;
                            if (var62 <= var39.field6083) {
                                var63 = var55.method1517();
                            } else {
                                int var64 = var62 - var39.field6083;
                                int var65 = var39.field6033 == 0 ? 0 : (var39.field6019 - var64) / var39.field6033 * var39.field6033;
                                var63 = var65 * var55.method1517() / var39.field6019;
                            }
                            int var66 = var55.method1510();
                            var51 -= var66;
                            int var67 = arg4 + class340.field4942[0] - (var55.method1517() >> 1);
                            var55.method3142(var67, var51);
                            class736.field10316.method509(var67, var51, var63 + var67, var51 + var66);
                            var56.method3142(var67, var51);
                            class736.field10316.method476(arg4, arg2, arg1 + arg4, arg2 + arg3);
                            class497.method2963(var51 + var66, var67 - -var55.method1504(), (byte) 41, var51, var67);
                            var51 -= 2;
                        }
                        if (var10 < var7) {
                            class689 var69 = (class689) var39;
                            if (var69.field9537 != -1) {
                                var51 -= 25;
                                class536 var70 = class457.field6749[var69.field9537];
                                var70.method3142(class340.field4942[0] + arg4 - 12, var51);
                                class497.method2963(var51 + var70.method1514(), class340.field4942[0] + arg4 + -12 - -var70.method1504(), (byte) -121, var51, class340.field4942[0] + arg4 - 12);
                                var51 -= 2;
                            }
                            if (var69.field9539 != -1) {
                                var51 -= 25;
                                class536 var71 = class438.field6489[var69.field9539];
                                var71.method3142(class340.field4942[0] + arg4 - 12, var51);
                                class497.method2963(var71.method1514() + var51, arg4 - -class340.field4942[0] - (12 - var71.method1504()), (byte) 83, var51, class340.field4942[0] + arg4 - 12);
                                var51 -= 2;
                            }
                        } else if (var38.field5048 >= 0 && class438.field6489.length > var38.field5048) {
                            var51 -= 25;
                            class536 var68 = class438.field6489[var38.field5048];
                            var68.method3142(class340.field4942[0] + arg4 - (var68.method1517() >> 1), var51);
                            class497.method2963(var51 + var68.method1514(), class340.field4942[0] + (arg4 - (var68.method1517() >> 1) - -var68.method1504()), (byte) -112, var51, class340.field4942[0] + arg4 - (var68.method1517() >> 1));
                            var51 -= 2;
                        }
                    }
                    int var10000;
                    if (!var39 instanceof class689) {
                        int var78 = 0;
                        class635[] var79 = class554.field7904;
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            class635 var180 = var79[var80];
                            if (var180 != null && var180.field8922 == 1 && class338.field4921[var10 - var7] == var180.field8921) {
                                class536 var181 = class76.field1063[var180.field8924];
                                if (var78 < var181.method1510()) {
                                    var78 = var181.method1510();
                                }
                                if (class357.field5189 % 20 < 10) {
                                    var181.method3142(class340.field4942[0] + arg4 - 12, var51 - var181.method1510());
                                    class497.method2963(var51 + (-var181.method1510() + var181.method1514()), class340.field4942[0] + arg4 - 12 + var181.method1504(), (byte) 90, var51 - var181.method1510(), arg4 - (-class340.field4942[0] - -12));
                                }
                            }
                        }
                        if (var78 > 0) {
                            var10000 = var51 - (var78 + 2);
                        }
                    } else if (var10 >= 0) {
                        int var72 = 0;
                        class635[] var73 = class554.field7904;
                        for (int var74 = 0; var74 < var73.length; var74++) {
                            class635 var76 = var73[var74];
                            if (var76 != null && var76.field8922 == 10 && var8[var10] == var76.field8921) {
                                class536 var77 = class76.field1063[var76.field8924];
                                if (var77.method1510() > var72) {
                                    var72 = var77.method1510();
                                }
                                var77.method3142(class340.field4942[0] + arg4 - 12, var51 - var77.method1510());
                                class497.method2963(var51 - var77.method1510() + var77.method1514(), class340.field4942[0] + arg4 + -12 - -var77.method1504(), (byte) -125, var51 - var77.method1510(), class340.field4942[0] + arg4 - 12);
                            }
                        }
                        if (var72 > 0) {
                            var10000 = var51 - (var72 + 2);
                        }
                    }
                    for (int var82 = 0; var82 < class143.field1872; var82++) {
                        int var83 = var39.field6120[var82];
                        int var84 = var39.field6104[var82];
                        class154 var85 = null;
                        int var86 = 0;
                        if (var84 >= 0) {
                            if (class357.field5189 >= var83) {
                                continue;
                            }
                            var85 = class280.field3967.method625(46, var39.field6104[var82]);
                            var86 = var85.field2490;
                        } else if (var83 < 0) {
                            continue;
                        }
                        int var87 = var39.field6082[var82];
                        class154 var88 = null;
                        if (var87 >= 0) {
                            var88 = class280.field3967.method625(46, var87);
                        }
                        if ((var83 - var86) <= class357.field5189) {
                            int var89 = var39.field6059[var82];
                            if (var89 >= 0) {
                                var39.field6111 = var89;
                                var39.field6027 = class357.field5189 + 300;
                                var39.field6059[var82] = -1;
                            }
                            if (var85 == null) {
                                var39.field6120[var82] = -1;
                            } else {
                                int var90 = var39.method1808(14371) / 2;
                                class441.method2727(16383, var90, arg0, arg3 >> 1, arg1 >> 1, var39, arg5);
                                if (class340.field4942[0] > -1) {
                                    class340.field4942[0] += class272.field3874[var82];
                                    class340.field4942[1] += class177.field2748[var82];
                                    Object var91 = null;
                                    Object var92 = null;
                                    Object var93 = null;
                                    Object var94 = null;
                                    int var95 = 0;
                                    int var96 = 0;
                                    int var97 = 0;
                                    int var98 = 0;
                                    int var99 = 0;
                                    int var100 = 0;
                                    int var101 = 0;
                                    int var102 = 0;
                                    class536 var103 = null;
                                    class536 var104 = null;
                                    class536 var105 = null;
                                    class536 var106 = null;
                                    int var107 = 0;
                                    int var108 = 0;
                                    int var109 = 0;
                                    int var110 = 0;
                                    int var111 = 0;
                                    int var112 = 0;
                                    int var113 = 0;
                                    int var114 = 0;
                                    int var115 = 0;
                                    class536 var116 = var85.method1155(class736.field10316, true);
                                    if (var116 != null) {
                                        var95 = var116.method1517();
                                        int var117 = var116.method1510();
                                        var116.method1507(class157.field2513);
                                        if (var117 > var115) {
                                            var115 = var117;
                                        }
                                        var99 = class157.field2513[0];
                                    }
                                    class536 var118 = var85.method1148(true, class736.field10316);
                                    if (var118 != null) {
                                        var96 = var118.method1517();
                                        int var119 = var118.method1510();
                                        if (var115 < var119) {
                                            var115 = var119;
                                        }
                                        var118.method1507(class157.field2513);
                                        var100 = class157.field2513[0];
                                    }
                                    class536 var120 = var85.method1153(class736.field10316, (byte) 7);
                                    if (var120 != null) {
                                        var97 = var120.method1517();
                                        int var121 = var120.method1510();
                                        var120.method1507(class157.field2513);
                                        if (var115 < var121) {
                                            var115 = var121;
                                        }
                                        var101 = class157.field2513[0];
                                    }
                                    class536 var122 = var85.method1154(0, class736.field10316);
                                    if (var122 != null) {
                                        var98 = var122.method1517();
                                        int var123 = var122.method1510();
                                        var122.method1507(class157.field2513);
                                        if (var115 < var123) {
                                            var115 = var123;
                                        }
                                        var102 = class157.field2513[0];
                                    }
                                    if (var88 != null) {
                                        var103 = var88.method1155(class736.field10316, true);
                                        if (var103 != null) {
                                            var107 = var103.method1517();
                                            int var124 = var103.method1510();
                                            if (var124 > var115) {
                                                var115 = var124;
                                            }
                                            var103.method1507(class157.field2513);
                                            var111 = class157.field2513[0];
                                        }
                                        var104 = var88.method1148(true, class736.field10316);
                                        if (var104 != null) {
                                            var108 = var104.method1517();
                                            int var125 = var104.method1510();
                                            var104.method1507(class157.field2513);
                                            if (var115 < var125) {
                                                var115 = var125;
                                            }
                                            var112 = class157.field2513[0];
                                        }
                                        var105 = var88.method1153(class736.field10316, (byte) -58);
                                        if (var105 != null) {
                                            var109 = var105.method1517();
                                            int var126 = var105.method1510();
                                            if (var126 > var115) {
                                                var115 = var126;
                                            }
                                            var105.method1507(class157.field2513);
                                            var113 = class157.field2513[0];
                                        }
                                        var106 = var88.method1154(0, class736.field10316);
                                        if (var106 != null) {
                                            var110 = var106.method1517();
                                            int var127 = var106.method1510();
                                            var106.method1507(class157.field2513);
                                            if (var115 < var127) {
                                                var115 = var127;
                                            }
                                            var114 = class157.field2513[0];
                                        }
                                    }
                                    class61 var128 = class427.field6332;
                                    class61 var129 = class427.field6332;
                                    class66 var130 = class232.field3385;
                                    class66 var131 = class232.field3385;
                                    int var132 = var85.field2500;
                                    if (var132 >= 0) {
                                        class61 var133 = class735.method4133(true, class736.field10316, 112, var132);
                                        class66 var134 = class45.method328(class736.field10316, var132, (byte) 69);
                                        if (var133 != null && var134 != null) {
                                            var130 = var134;
                                            var128 = var133;
                                        }
                                    }
                                    if (var88 != null) {
                                        int var135 = var88.field2500;
                                        if (var135 >= 0) {
                                            class61 var136 = class735.method4133(true, class736.field10316, 116, var135);
                                            class66 var137 = class45.method328(class736.field10316, var135, (byte) 69);
                                            if (var136 != null && var137 != null) {
                                                var129 = var136;
                                                var131 = var137;
                                            }
                                        }
                                    }
                                    Object var138 = null;
                                    String var139 = null;
                                    boolean var140 = false;
                                    int var141 = 0;
                                    String var142 = var85.method1146(0, var39.field6021[var82]);
                                    int var143 = var130.method587(-84, var142);
                                    if (var88 != null) {
                                        var139 = var88.method1146(0, var39.field6097[var82]);
                                        var141 = var131.method587(-43, var139);
                                    }
                                    int var144 = 0;
                                    if (var96 > 0) {
                                        var144 = var143 / var96 + 1;
                                    }
                                    int var145 = 0;
                                    if (var88 != null && var108 > 0) {
                                        var145 = var141 / var108 + 1;
                                    }
                                    int var146 = 0;
                                    int var147 = var146;
                                    if (var95 > 0) {
                                        var146 += var95;
                                    }
                                    var146 += 2;
                                    int var148 = var146;
                                    if (var97 > 0) {
                                        var146 += var97;
                                    }
                                    int var149 = var146;
                                    int var150 = var146;
                                    int var152;
                                    if (var96 > 0) {
                                        int var151 = var96 * var144;
                                        var152 = var146 + var151;
                                        var150 = (var151 - var143) / 2 + var146;
                                    } else {
                                        var152 = var143 + var146;
                                    }
                                    int var153 = var152;
                                    if (var98 > 0) {
                                        var152 += var98;
                                    }
                                    int var154 = 0;
                                    int var155 = 0;
                                    int var156 = 0;
                                    int var157 = 0;
                                    int var158 = 0;
                                    if (var88 != null) {
                                        var152 += 2;
                                        var154 = var152;
                                        if (var107 > 0) {
                                            var152 += var107;
                                        }
                                        var152 += 2;
                                        var155 = var152;
                                        if (var109 > 0) {
                                            var152 += var109;
                                        }
                                        var158 = var152;
                                        var156 = var152;
                                        if (var108 <= 0) {
                                            var152 += var141;
                                        } else {
                                            int var159 = var108 * var145;
                                            var158 = (var159 - var141) / 2 + var152;
                                            var152 += var159;
                                        }
                                        var157 = var152;
                                        if (var110 > 0) {
                                            var152 += var110;
                                        }
                                    }
                                    int var160 = var39.field6120[var82] - class357.field5189;
                                    int var161 = var85.field2484 - var85.field2484 * var160 / var85.field2490;
                                    int var162 = (var85.field2485 * var160 / var85.field2490) - var85.field2485;
                                    int var163 = var161 + arg4 + class340.field4942[0] - (var152 >> 1);
                                    int var164 = class340.field4942[1] + arg2 + var162 - 12;
                                    int var165 = var164;
                                    int var166 = var115 + var164;
                                    int var167 = var85.field2496 + var164 + 15;
                                    int var168 = var167 - var130.field940;
                                    if (var164 > var168) {
                                        var165 = var168;
                                    }
                                    int var169 = var167 + var130.field938;
                                    if (var166 < var169) {
                                        var166 = var169;
                                    }
                                    int var170 = 0;
                                    if (var88 != null) {
                                        var170 = var164 + var88.field2496 + 15;
                                        int var171 = var170 - var131.field940;
                                        int var172 = var131.field938 + var170;
                                        if (var165 > var171) {
                                            var165 = var171;
                                        }
                                        if (var172 > var166) {
                                            var166 = var172;
                                        }
                                    }
                                    int var173 = 255;
                                    if (var85.field2504 >= 0) {
                                        var173 = (var160 << 8) / (var85.field2490 - var85.field2504);
                                    }
                                    if (var173 >= 0 && var173 < 255) {
                                        int var174 = var173 << 24;
                                        int var175 = var174 | 0xFFFFFF;
                                        if (var116 != null) {
                                            var116.method133(var163 + var147 - var99, var164, 0, var175, 1);
                                        }
                                        if (var120 != null) {
                                            var120.method133(var163 + var148 - var101, var164, 0, var175, 1);
                                        }
                                        if (var118 != null) {
                                            for (int var176 = 0; var176 < var144; var176++) {
                                                var118.method133(var96 * var176 + var149 + var163 - var100, var164, 0, var175, 1);
                                            }
                                        }
                                        if (var122 != null) {
                                            var122.method133(var163 + var153 - var102, var164, 0, var175, 1);
                                        }
                                        var128.method546(false, 0, var163 + var150, var142, var167, var174 | var85.field2486);
                                        if (var88 != null) {
                                            if (var103 != null) {
                                                var103.method133(var163 - (var111 - var154), var164, 0, var175, 1);
                                            }
                                            if (var105 != null) {
                                                var105.method133(var163 + var155 - var113, var164, 0, var175, 1);
                                            }
                                            if (var104 != null) {
                                                for (int var177 = 0; var177 < var145; var177++) {
                                                    var104.method133(var163 + var156 + (var108 * var177) - var112, var164, 0, var175, 1);
                                                }
                                            }
                                            if (var106 != null) {
                                                var106.method133(var163 + var157 - var114, var164, 0, var175, 1);
                                            }
                                            var129.method546(false, 0, var158 + var163, var139, var170, var174 | var88.field2486);
                                        }
                                    } else {
                                        if (var116 != null) {
                                            var116.method3142(var147 + var163 - var99, var164);
                                        }
                                        if (var120 != null) {
                                            var120.method3142(var148 + var163 - var101, var164);
                                        }
                                        if (var118 != null) {
                                            for (int var178 = 0; var178 < var144; var178++) {
                                                var118.method3142(var96 * var178 + var163 + var149 - var100, var164);
                                            }
                                        }
                                        if (var122 != null) {
                                            var122.method3142(var153 + var163 - var102, var164);
                                        }
                                        var128.method546(false, 0, var163 + var150, var142, var167, var85.field2486 | 0xFF000000);
                                        if (var88 != null) {
                                            if (var103 != null) {
                                                var103.method3142(var154 + var163 - var111, var164);
                                            }
                                            if (var105 != null) {
                                                var105.method3142(var163 + var155 - var113, var164);
                                            }
                                            if (var104 != null) {
                                                for (int var179 = 0; var179 < var145; var179++) {
                                                    var104.method3142(var108 * var179 + var163 - (-var156 - -var112), var164);
                                                }
                                            }
                                            if (var106 != null) {
                                                var106.method3142(var157 + var163 - var114, var164);
                                            }
                                            var129.method546(false, 0, var163 + var158, var139, var170, var88.field2486 | 0xFF000000);
                                        }
                                    }
                                    class497.method2963(var166 + 1, var152 + var163, (byte) -100, var165, var163);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var11 = 0; var11 < class246.field3580; var11++) {
            int var34 = class261.field3713[var11];
            class405 var35;
            if (var34 < 2048) {
                var35 = class314.field4456[var34];
            } else {
                var35 = ((class432) class497.field7067.method2287((long) (var34 - 2048), (byte) -117)).field6439;
            }
            int var36 = class62.field891[var11];
            class405 var37;
            if (var36 >= 2048) {
                var37 = ((class432) class497.field7067.method2287((long) (var36 - 2048), (byte) -117)).field6439;
            } else {
                var37 = class314.field4456[var36];
            }
            class181.method1278(arg1, arg2, arg0, arg4, arg3, --var35.field6067, 0, var37, arg5, var35);
        }
        int var12 = class335.field4827.field938 + class335.field4827.field940 + 2;
        for (int var13 = 0; var13 < class684.field9465; var13++) {
            int var14 = class242.field3542[var13];
            int var15 = class242.field3533[var13];
            int var16 = class242.field3520[var13];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var33 = 0; var33 < var13; var33++) {
                    if ((class242.field3533[var33] - var12) < (var15 + 2) && var15 - var12 < class242.field3533[var33] + 2 && var14 - var16 < class242.field3542[var33] + class242.field3520[var33] && (class242.field3542[var33] - class242.field3520[var33]) < (var14 + var16) && var15 > (class242.field3533[var33] - var12)) {
                        var17 = true;
                        var15 = class242.field3533[var33] - var12;
                    }
                }
            }
            class242.field3533[var13] = var15;
            String var18 = class242.field3526[var13];
            int var19 = class335.field4827.method587(-113, var18);
            int var20 = arg4 + var14;
            int var21 = arg2 + var15 - class335.field4827.field940;
            int var22 = var19 + var20;
            int var23 = arg2 + var15 + class335.field4827.field938;
            if (class461.field6795 == 0) {
                int var24 = 16776960;
                if (class242.field3540[var13] < 6) {
                    var24 = class424.field6305[class242.field3540[var13]];
                }
                if (class242.field3540[var13] == 6) {
                    var24 = (class412.field6195 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class242.field3540[var13] == 7) {
                    var24 = class412.field6195 % 20 >= 10 ? 65535 : 255;
                }
                if (class242.field3540[var13] == 8) {
                    var24 = class412.field6195 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class242.field3540[var13] == 9) {
                    int var25 = 150 - class242.field3516[var13];
                    if (var25 < 50) {
                        var24 = var25 * 1280 + 16711680;
                    } else if (var25 < 100) {
                        var24 = 16776960 - ((var25 - 50) * 327680);
                    } else if (var25 < 150) {
                        var24 = (var25 - 100) * 5 + 65280;
                    }
                }
                if (class242.field3540[var13] == 10) {
                    int var26 = 150 - class242.field3516[var13];
                    if (var26 < 50) {
                        var24 = var26 * 5 + 16711680;
                    } else if (var26 < 100) {
                        var24 = 33095935 - var26 * 327680;
                    } else if (var26 < 150) {
                        var24 = (var26 - 100) * 327680 + 255 + 500 - (var26 * 5);
                    }
                }
                if (class242.field3540[var13] == 11) {
                    int var27 = 150 - class242.field3516[var13];
                    if (var27 < 50) {
                        var24 = 16777215 - (var27 * 327685);
                    } else if (var27 < 100) {
                        var24 = (var27 - 50) * 327685 + 65280;
                    } else if (var27 < 150) {
                        var24 = 16777215 - ((var27 - 100) * 327680);
                    }
                }
                int var28 = var24 | 0xFF000000;
                if (class242.field3521[var13] == 0) {
                    class298.field4225.method544(arg4 + var14, var18, -16777216, (byte) -82, arg2 + var15, var28);
                    var20 -= var19 >> 1;
                    var22 -= var19 >> 1;
                }
                if (class242.field3521[var13] == 1) {
                    var23 += 5;
                    var20 -= var19 >> 1;
                    var22 -= var19 >> 1;
                    class298.field4225.method543(arg4 + var14, class412.field6195, true, arg2 + var15, var18, -16777216, var28);
                    var21 -= 5;
                }
                if (class242.field3521[var13] == 2) {
                    var22 -= (var19 >> 1) - 5;
                    var20 -= (var19 >> 1) + 5;
                    class298.field4225.method555(var18, var28, arg4 + var14, 0, arg2 + var15, -16777216, class412.field6195);
                    var23 += 5;
                    var21 -= 5;
                }
                if (class242.field3521[var13] == 3) {
                    var23 += 7;
                    var21 -= 7;
                    class298.field4225.method556(var28, -16777216, false, 150 - class242.field3516[var13], arg4 + var14, var18, class412.field6195, arg2 + var15);
                    var22 -= var19 >> 1;
                    var20 -= var19 >> 1;
                }
                if (class242.field3521[var13] == 4) {
                    int var29 = (150 - class242.field3516[var13]) * (class335.field4827.method587(-122, var18) + 100) / 150;
                    class736.field10316.method509(arg4 + var14 - 50, arg2, arg4 + var14 + 50, arg2 + arg3);
                    var22 += 50 - var29;
                    var20 += 50 - var29;
                    class298.field4225.method546(false, -16777216, arg4 + 50 - (var29 - var14), var18, arg2 + var15, var28);
                    class736.field10316.method476(arg4, arg2, arg1 + arg4, arg2 - -arg3);
                }
                if (class242.field3521[var13] == 5) {
                    int var30 = 150 - class242.field3516[var13];
                    int var31 = 0;
                    if (var30 < 25) {
                        var31 = var30 - 25;
                    } else if (var30 > 125) {
                        var31 = var30 - 125;
                    }
                    int var32 = class335.field4827.field940 + class335.field4827.field938;
                    class736.field10316.method509(arg4, arg2 + var15 - var32 - 1, arg4 - -arg1, arg2 + var15 + 5);
                    var20 -= var19 >> 1;
                    var23 += var31;
                    var22 -= var19 >> 1;
                    var21 += var31;
                    class298.field4225.method544(arg4 + var14, var18, -16777216, (byte) 107, arg2 - (-var15 - var31), var28);
                    class736.field10316.method476(arg4, arg2, arg4 + arg1, arg2 + arg3);
                }
            } else {
                var20 -= var19 >> 1;
                var22 -= var19 >> 1;
                class298.field4225.method544(arg4 + var14, var18, -16777216, (byte) 83, arg2 + var15, -256);
            }
            class497.method2963(var23 + 1, var22 + 1, (byte) -25, var21, var20);
        }
    }
}
