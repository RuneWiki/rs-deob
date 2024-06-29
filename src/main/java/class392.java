import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class class392 {

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Lw;")
    public class675 field5454;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public int field5452;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lin;")
    public static class380 field5451 = new class380(129, 4);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V", line = 4)
    public static final void method2347(int arg0, int arg1) {
        if (arg0 != 1) {
            method2347(106, -48);
        }
        field5453++;
        class737.field10228 = 1000000000L / (long) arg1;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII)V", line = 18)
    public static final void method2348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5449++;
        int var7 = class469.field6382;
        int[] var8 = class464.field6311;
        class640.field9019 = 0;
        for (int var9 = 0; var9 < class657.field9270 + var7; var9++) {
            class179 var37 = null;
            class281 var38;
            if (var9 < var7) {
                var38 = class588.field8451[var8[var9]];
            } else {
                var38 = ((class647) class486.field6697.method4253((long) class350.field4963[var9 - var7], -1)).field9191;
                var37 = ((class506) var38).field6964;
                if (var37.field2683 != null) {
                    var37 = var37.method1304(class578.field8328, arg0 - 10663);
                    if (var37 == null) {
                        continue;
                    }
                }
            }
            if (var38.field4049 >= 0 && (class626.field8887 == var38.field4115 || class719.field10041.field10361 == var38.field10361)) {
                class781.method4291(arg6 >> 1, arg1 >> 1, arg3, arg2, var38, (byte) -82, var38.method1790(-92));
                if (class27.field292[0] >= 0) {
                    if (var38.field4069 != null && (var7 <= var9 || class712.field9943 == 0 || class712.field9943 == 3 || class712.field9943 == 1 && class124.method1074(((class21) var38).field212, -2779)) && class191.field2872 > class640.field9019) {
                        class191.field2868[class640.field9019] = class675.field9477.method2748(var38.field4069, 8364) / 2;
                        class191.field2875[class640.field9019] = class27.field292[0];
                        class191.field2876[class640.field9019] = class27.field292[1];
                        class191.field2874[class640.field9019] = var38.field4118;
                        class191.field2870[class640.field9019] = var38.field4091;
                        class191.field2871[class640.field9019] = var38.field4102;
                        class191.field2869[class640.field9019] = var38.field4069;
                        class640.field9019++;
                    }
                    int var39 = class27.field292[1] + arg4;
                    int var50;
                    if (var38.field4120 || class594.field8494 >= var38.field4128) {
                        var50 = var39 - Math.max(class675.field9477.field6402, class456.field6223[0].method5());
                    } else {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var43;
                        if (var9 < var7) {
                            class21 var42 = class588.field8451[var8[var9]];
                            var43 = var38.method1783(true).field381;
                            if (var42.field206) {
                                var41 = 2;
                            }
                        } else {
                            var43 = var37.field2670;
                            if (var43 == -1) {
                                var43 = var38.method1783(true).field381;
                            }
                        }
                        class85[] var44 = class456.field6223;
                        if (var43 != -1) {
                            class85[] var45 = (class85[]) class5.field69.method2882((long) var43, (byte) -122);
                            if (var45 == null) {
                                class418[] var46 = class418.method2472(class176.field2648, var43, 0);
                                if (var46 != null) {
                                    var45 = new class85[var46.length];
                                    for (int var47 = 0; var47 < var46.length; var47++) {
                                        var45[var47] = class686.field9702.method487(var46[var47], true);
                                    }
                                    class5.field69.method2890(-7307, (long) var43, var45);
                                }
                            }
                            if (var45 != null && var45.length >= 2) {
                                var44 = var45;
                            }
                        }
                        if (var44.length <= var41) {
                            var41 = 1;
                        }
                        class85 var48 = var44[0];
                        class85 var49 = var44[var41];
                        var50 = var39 - Math.max(class675.field9477.field6402, var48.method5());
                        int var51 = class27.field292[0] + arg5 - (var48.method16() >> 1);
                        int var52 = var48.method16() * var38.field4045 / 255;
                        int var53 = var48.method5();
                        if (var38.field4045 > 0 && var52 < 2) {
                            var52 = 2;
                        }
                        var48.method759(var51, var50);
                        class686.field9702.method518(var51, var50, var51 + var52, var50 + var53);
                        var49.method759(var51, var50);
                        class686.field9702.method488(arg5, arg4, arg1 + arg5, arg4 + arg6);
                        class528.method3090(3985, var50 + var53, var50, var51, var48.method11() + var51);
                    }
                    var50 -= 2;
                    if (!var38.field4120) {
                        if (var38.field4103 > class594.field8494) {
                            class85 var54 = class478.field6575[var38.field4094 ? 2 : 0];
                            class85 var55 = class478.field6575[var38.field4094 ? 3 : 1];
                            boolean var56 = true;
                            int var57;
                            if ((var38 instanceof class506)) {
                                var57 = var37.field2744;
                                if (var57 == -1) {
                                    var57 = var38.method1783(true).field361;
                                }
                            } else {
                                var57 = var38.method1783(true).field361;
                            }
                            if (var57 != -1) {
                                class85[] var58 = (class85[]) class126.field2150.method2882((long) var57, (byte) -65);
                                if (var58 == null) {
                                    class418[] var59 = class418.method2472(class176.field2648, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class85[var59.length];
                                        for (int var60 = 0; var60 < var59.length; var60++) {
                                            var58[var60] = class686.field9702.method487(var59[var60], true);
                                        }
                                        class126.field2150.method2890(-7307, (long) var57, var58);
                                    }
                                }
                                if (var58 != null && var58.length == 4) {
                                    var54 = var58[var38.field4094 ? 2 : 0];
                                    var55 = var58[var38.field4094 ? 3 : 1];
                                }
                            }
                            int var61 = var38.field4103 - class594.field8494;
                            int var62;
                            if (var38.field4112 >= var61) {
                                var62 = var54.method16();
                            } else {
                                int var63 = var61 - var38.field4112;
                                int var64 = var38.field4116 == 0 ? 0 : (var38.field4075 - var63) / var38.field4116 * var38.field4116;
                                var62 = var64 * var54.method16() / var38.field4075;
                            }
                            int var65 = var54.method5();
                            var50 -= var65;
                            int var66 = arg5 - ((var54.method16() >> 1) - class27.field292[0]);
                            var54.method759(var66, var50);
                            class686.field9702.method518(var66, var50, var62 + var66, var50 + var65);
                            var55.method759(var66, var50);
                            class686.field9702.method488(arg5, arg4, arg1 + arg5, arg4 - -arg6);
                            class528.method3090(3985, var50 + var65, var50, var66, var54.method11() + var66);
                            var50 -= 2;
                        }
                        if (var7 > var9) {
                            class21 var68 = (class21) var38;
                            if (var68.field213 != -1) {
                                var50 -= 25;
                                class85 var69 = class150.field2405[var68.field213];
                                var69.method759(class27.field292[0] + arg5 - 12, var50);
                                class528.method3090(3985, var69.method14() + var50, var50, class27.field292[0] + arg5 - 12, arg5 + -12 - (-class27.field292[0] - var69.method11()));
                                var50 -= 2;
                            }
                            if (var68.field243 != -1) {
                                var50 -= 25;
                                class85 var70 = class91.field1308[var68.field243];
                                var70.method759(arg5 + class27.field292[0] - 12, var50);
                                class528.method3090(arg0 + 19239, var70.method14() + var50, var50, arg5 + class27.field292[0] - 12, class27.field292[0] + arg5 - 12 - -var70.method11());
                                var50 -= 2;
                            }
                        } else if (var37.field2675 >= 0 && var37.field2675 < class91.field1308.length) {
                            class85 var67 = class91.field1308[var37.field2675];
                            var50 -= 25;
                            var67.method759(class27.field292[0] + arg5 - (var67.method16() >> 1), var50);
                            class528.method3090(arg0 + 19239, var67.method14() + var50, var50, class27.field292[0] + (arg5 - (var67.method16() >> 1)), arg5 - (-class27.field292[0] + (var67.method16() >> 1) - var67.method11()));
                            var50 -= 2;
                        }
                    }
                    int var10000;
                    if (!var38 instanceof class21) {
                        int var77 = 0;
                        class780[] var78 = class55.field870;
                        for (int var79 = 0; var79 < var78.length; var79++) {
                            class780 var179 = var78[var79];
                            if (var179 != null && var179.field10692 == 1 && class350.field4963[var9 - var7] == var179.field10686) {
                                class85 var180 = class491.field6736[var179.field10689];
                                if (var77 < var180.method5()) {
                                    var77 = var180.method5();
                                }
                                if (class594.field8494 % 20 < 10) {
                                    var180.method759(class27.field292[0] + arg5 - 12, var50 - var180.method5());
                                    class528.method3090(3985, var50 - (var180.method5() - var180.method14()), var50 + -var180.method5(), arg5 + class27.field292[0] - 12, class27.field292[0] + arg5 + -12 + var180.method11());
                                }
                            }
                        }
                        if (var77 > 0) {
                            var10000 = var50 - (var77 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var71 = 0;
                        class780[] var72 = class55.field870;
                        for (int var73 = 0; var73 < var72.length; var73++) {
                            class780 var75 = var72[var73];
                            if (var75 != null && var75.field10692 == 10 && var8[var9] == var75.field10686) {
                                class85 var76 = class491.field6736[var75.field10689];
                                if (var71 < var76.method5()) {
                                    var71 = var76.method5();
                                }
                                var76.method759(arg5 + class27.field292[0] - 12, -var76.method5() + var50);
                                class528.method3090(arg0 + 19239, -var76.method5() + var50 + var76.method14(), var50 - var76.method5(), arg5 - -class27.field292[0] + -12, class27.field292[0] + arg5 + var76.method11() - 12);
                            }
                        }
                        if (var71 > 0) {
                            var10000 = var50 - (var71 + 2);
                        }
                    }
                    for (int var81 = 0; var81 < class255.field3646; var81++) {
                        int var82 = var38.field4062[var81];
                        int var83 = var38.field4052[var81];
                        class218 var84 = null;
                        int var85 = 0;
                        if (var83 >= 0) {
                            if (class594.field8494 >= var82) {
                                continue;
                            }
                            var84 = class153.field2446.method2733((byte) 98, var38.field4052[var81]);
                            var85 = var84.field3175;
                        } else if (var82 < 0) {
                            continue;
                        }
                        int var86 = var38.field4078[var81];
                        class218 var87 = null;
                        if (var86 >= 0) {
                            var87 = class153.field2446.method2733((byte) 115, var86);
                        }
                        if (class594.field8494 >= var82 - var85) {
                            int var88 = var38.field4085[var81];
                            if (var88 >= 0) {
                                var38.field4128 = class594.field8494 + 300;
                                var38.field4045 = var88;
                                var38.field4085[var81] = -1;
                            }
                            if (var84 == null) {
                                var38.field4062[var81] = -1;
                            } else {
                                int var89 = var38.method1790(arg0 ^ 0x3BE4) / 2;
                                class781.method4291(arg6 >> 1, arg1 >> 1, arg3, arg2, var38, (byte) -82, var89);
                                if (class27.field292[0] > -1) {
                                    class27.field292[0] += class239.field3460[var81];
                                    class27.field292[1] += class773.field10642[var81];
                                    Object var90 = null;
                                    Object var91 = null;
                                    Object var92 = null;
                                    Object var93 = null;
                                    int var94 = 0;
                                    int var95 = 0;
                                    int var96 = 0;
                                    int var97 = 0;
                                    int var98 = 0;
                                    int var99 = 0;
                                    int var100 = 0;
                                    int var101 = 0;
                                    class85 var102 = null;
                                    class85 var103 = null;
                                    class85 var104 = null;
                                    class85 var105 = null;
                                    int var106 = 0;
                                    int var107 = 0;
                                    int var108 = 0;
                                    int var109 = 0;
                                    int var110 = 0;
                                    int var111 = 0;
                                    int var112 = 0;
                                    int var113 = 0;
                                    class85 var114 = var84.method1500(arg0 ^ 0xFFFFB5A9, class686.field9702);
                                    int var115 = 0;
                                    if (var114 != null) {
                                        var94 = var114.method16();
                                        int var116 = var114.method5();
                                        var114.method3(class753.field10479);
                                        if (var115 < var116) {
                                            var115 = var116;
                                        }
                                        var98 = class753.field10479[0];
                                    }
                                    class85 var117 = var84.method1502(class686.field9702, arg0 ^ 0xFFFFC46A);
                                    if (var117 != null) {
                                        var95 = var117.method16();
                                        int var118 = var117.method5();
                                        if (var115 < var118) {
                                            var115 = var118;
                                        }
                                        var117.method3(class753.field10479);
                                        var99 = class753.field10479[0];
                                    }
                                    class85 var119 = var84.method1505(class686.field9702, arg0 - 17355);
                                    if (var119 != null) {
                                        var96 = var119.method16();
                                        int var120 = var119.method5();
                                        var119.method3(class753.field10479);
                                        if (var120 > var115) {
                                            var115 = var120;
                                        }
                                        var100 = class753.field10479[0];
                                    }
                                    class85 var121 = var84.method1499(0, class686.field9702);
                                    if (var121 != null) {
                                        var97 = var121.method16();
                                        int var122 = var121.method5();
                                        if (var115 < var122) {
                                            var115 = var122;
                                        }
                                        var121.method3(class753.field10479);
                                        var101 = class753.field10479[0];
                                    }
                                    if (var87 != null) {
                                        var102 = var87.method1500(arg0 + 44377, class686.field9702);
                                        if (var102 != null) {
                                            var106 = var102.method16();
                                            int var123 = var102.method5();
                                            if (var115 < var123) {
                                                var115 = var123;
                                            }
                                            var102.method3(class753.field10479);
                                            var110 = class753.field10479[0];
                                        }
                                        var103 = var87.method1502(class686.field9702, arg0 ^ 0xFFFFC46A);
                                        if (var103 != null) {
                                            var107 = var103.method16();
                                            int var124 = var103.method5();
                                            var103.method3(class753.field10479);
                                            if (var115 < var124) {
                                                var115 = var124;
                                            }
                                            var111 = class753.field10479[0];
                                        }
                                        var104 = var87.method1505(class686.field9702, arg0 ^ 0x44F5);
                                        if (var104 != null) {
                                            var108 = var104.method16();
                                            int var125 = var104.method5();
                                            var104.method3(class753.field10479);
                                            if (var115 < var125) {
                                                var115 = var125;
                                            }
                                            var112 = class753.field10479[0];
                                        }
                                        var105 = var87.method1499(0, class686.field9702);
                                        if (var105 != null) {
                                            var109 = var105.method16();
                                            int var126 = var105.method5();
                                            var105.method3(class753.field10479);
                                            if (var126 > var115) {
                                                var115 = var126;
                                            }
                                            var113 = class753.field10479[0];
                                        }
                                    }
                                    class443 var127 = class71.field1124;
                                    class443 var128 = class71.field1124;
                                    class470 var129 = class606.field8600;
                                    int var130 = var84.field3189;
                                    class470 var131 = class606.field8600;
                                    if (var130 >= 0) {
                                        class443 var132 = class36.method281(class686.field9702, true, var130, 6);
                                        class470 var133 = class430.method2511(true, class686.field9702, var130);
                                        if (var132 != null && var133 != null) {
                                            var129 = var133;
                                            var127 = var132;
                                        }
                                    }
                                    if (var87 != null) {
                                        int var134 = var87.field3189;
                                        if (var134 >= 0) {
                                            class443 var135 = class36.method281(class686.field9702, true, var134, arg0 ^ 0xFFFFC46C);
                                            class470 var136 = class430.method2511(true, class686.field9702, var134);
                                            if (var135 != null && var136 != null) {
                                                var131 = var136;
                                                var128 = var135;
                                            }
                                        }
                                    }
                                    Object var137 = null;
                                    String var138 = null;
                                    boolean var139 = false;
                                    String var140 = var84.method1504((byte) -122, var38.field4126[var81]);
                                    int var141 = 0;
                                    int var142 = var129.method2748(var140, 8364);
                                    if (var87 != null) {
                                        var138 = var87.method1504((byte) -101, var38.field4055[var81]);
                                        var141 = var131.method2748(var138, 8364);
                                    }
                                    int var143 = 0;
                                    int var144 = 0;
                                    if (var95 > 0) {
                                        var143 = var142 / var95 + 1;
                                    }
                                    if (var87 != null && var107 > 0) {
                                        var144 = var141 / var107 + 1;
                                    }
                                    int var145 = 0;
                                    int var146 = var145;
                                    if (var94 > 0) {
                                        var145 += var94;
                                    }
                                    var145 += 2;
                                    int var147 = var145;
                                    if (var96 > 0) {
                                        var145 += var96;
                                    }
                                    int var148 = var145;
                                    int var149 = var145;
                                    int var151;
                                    if (var95 > 0) {
                                        int var150 = var95 * var143;
                                        var151 = var145 + var150;
                                        var149 = (var150 - var142) / 2 + var145;
                                    } else {
                                        var151 = var142 + var145;
                                    }
                                    int var152 = var151;
                                    if (var97 > 0) {
                                        var151 += var97;
                                    }
                                    int var153 = 0;
                                    int var154 = 0;
                                    int var155 = 0;
                                    int var156 = 0;
                                    int var157 = 0;
                                    if (var87 != null) {
                                        var151 += 2;
                                        var153 = var151;
                                        if (var106 > 0) {
                                            var151 += var106;
                                        }
                                        var151 += 2;
                                        var154 = var151;
                                        if (var108 > 0) {
                                            var151 += var108;
                                        }
                                        var155 = var151;
                                        var157 = var151;
                                        if (var107 <= 0) {
                                            var151 += var141;
                                        } else {
                                            int var158 = var107 * var144;
                                            var157 = (var158 - var141) / 2 + var151;
                                            var151 += var158;
                                        }
                                        var156 = var151;
                                        if (var109 > 0) {
                                            var151 += var109;
                                        }
                                    }
                                    int var159 = var38.field4062[var81] - class594.field8494;
                                    int var160 = var84.field3192 - (var84.field3192 * var159 / var84.field3175);
                                    int var161 = var84.field3177 * var159 / var84.field3175 - var84.field3177;
                                    int var162 = class27.field292[0] + arg5 + var160 - (var151 >> 1);
                                    int var163 = class27.field292[1] + arg4 + var161 - 12;
                                    int var164 = var163;
                                    int var165 = var115 + var163;
                                    int var166 = var163 + var84.field3185 + 15;
                                    int var167 = var166 - var129.field6402;
                                    if (var163 > var167) {
                                        var164 = var167;
                                    }
                                    int var168 = var129.field6399 + var166;
                                    if (var168 > var165) {
                                        var165 = var168;
                                    }
                                    int var169 = 0;
                                    if (var87 != null) {
                                        var169 = var87.field3185 + var163 + 15;
                                        int var170 = var169 - var131.field6402;
                                        if (var164 > var170) {
                                            var164 = var170;
                                        }
                                        int var171 = var131.field6399 + var169;
                                        if (var165 < var171) {
                                            var165 = var171;
                                        }
                                    }
                                    int var172 = 255;
                                    if (var84.field3176 >= 0) {
                                        var172 = (var159 << 8) / (var84.field3175 - var84.field3176);
                                    }
                                    if (var172 >= 0 && var172 < 255) {
                                        int var173 = var172 << 24;
                                        int var174 = var173 | 0xFFFFFF;
                                        if (var114 != null) {
                                            var114.method6(var162 + var146 - var98, var163, 0, var174, 1);
                                        }
                                        if (var119 != null) {
                                            var119.method6(var147 + var162 - var100, var163, 0, var174, 1);
                                        }
                                        if (var117 != null) {
                                            for (int var175 = 0; var175 < var143; var175++) {
                                                var117.method6(var162 + (var95 * var175) + var148 - var99, var163, 0, var174, 1);
                                            }
                                        }
                                        if (var121 != null) {
                                            var121.method6(var162 + var152 - var101, var163, 0, var174, 1);
                                        }
                                        var127.method2628(var84.field3194 | var173, var140, var149 + var162, -104, var166, 0);
                                        if (var87 != null) {
                                            if (var102 != null) {
                                                var102.method6(var162 + var153 - var110, var163, 0, var174, 1);
                                            }
                                            if (var104 != null) {
                                                var104.method6(var154 + var162 - var112, var163, 0, var174, 1);
                                            }
                                            if (var103 != null) {
                                                for (int var176 = 0; var176 < var144; var176++) {
                                                    var103.method6(var162 + var107 * var176 + var155 - var111, var163, 0, var174, 1);
                                                }
                                            }
                                            if (var105 != null) {
                                                var105.method6(var156 + var162 - var113, var163, 0, var174, 1);
                                            }
                                            var128.method2628(var87.field3194 | var173, var138, var157 + var162, -96, var169, 0);
                                        }
                                    } else {
                                        if (var114 != null) {
                                            var114.method759(var162 + var146 - var98, var163);
                                        }
                                        if (var119 != null) {
                                            var119.method759(var147 + var162 - var100, var163);
                                        }
                                        if (var117 != null) {
                                            for (int var177 = 0; var177 < var143; var177++) {
                                                var117.method759(var95 * var177 + var148 + var162 - var99, var163);
                                            }
                                        }
                                        if (var121 != null) {
                                            var121.method759(var152 + var162 - var101, var163);
                                        }
                                        var127.method2628(var84.field3194 | 0xFF000000, var140, var162 + var149, -125, var166, 0);
                                        if (var87 != null) {
                                            if (var102 != null) {
                                                var102.method759(var153 + var162 - var110, var163);
                                            }
                                            if (var104 != null) {
                                                var104.method759(var154 + var162 - var112, var163);
                                            }
                                            if (var103 != null) {
                                                for (int var178 = 0; var178 < var144; var178++) {
                                                    var103.method759(var162 + var155 + (var107 * var178) - var111, var163);
                                                }
                                            }
                                            if (var105 != null) {
                                                var105.method759(var162 - (var113 - var156), var163);
                                            }
                                            var128.method2628(var87.field3194 | 0xFF000000, var138, var162 + var157, -105, var169, 0);
                                        }
                                    }
                                    class528.method3090(3985, var165 + 1, var164, var162, var162 + var151);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class327.field4662; var10++) {
            int var33 = class554.field7688[var10];
            class281 var34;
            if (var33 < 2048) {
                var34 = class588.field8451[var33];
            } else {
                var34 = ((class647) class486.field6697.method4253((long) (var33 - 2048), -1)).field9191;
            }
            int var35 = class2.field34[var10];
            class281 var36;
            if (var35 < 2048) {
                var36 = class588.field8451[var35];
            } else {
                var36 = ((class647) class486.field6697.method4253((long) (var35 - 2048), -1)).field9191;
            }
            class591.method3462(var34, arg2, arg3, arg6, var36, (byte) 43, arg1, --var34.field4059, arg5, arg4);
        }
        if (arg0 != -15254) {
            return;
        }
        int var11 = class675.field9477.field6402 + class675.field9477.field6399 + 2;
        for (int var12 = 0; var12 < class640.field9019; var12++) {
            int var13 = class191.field2875[var12];
            int var14 = class191.field2876[var12];
            int var15 = class191.field2868[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; var32 < var12; var32++) {
                    if ((var14 + 2) > (class191.field2876[var32] - var11) && class191.field2876[var32] + 2 > -var11 + var14 && (var13 - var15) < (class191.field2875[var32] + class191.field2868[var32]) && var13 + var15 > class191.field2875[var32] + -class191.field2868[var32] && (class191.field2876[var32] - var11) < var14) {
                        var14 = class191.field2876[var32] - var11;
                        var16 = true;
                    }
                }
            }
            class191.field2876[var12] = var14;
            String var17 = class191.field2869[var12];
            int var18 = class675.field9477.method2748(var17, 8364);
            int var19 = arg5 + var13;
            int var20 = arg4 + var14 - class675.field9477.field6402;
            int var21 = var18 + var19;
            int var22 = arg4 - (-class675.field9477.field6399 - var14);
            if (class498.field6850 == 0) {
                int var23 = 16776960;
                if (class191.field2874[var12] < 6) {
                    var23 = class789.field10790[class191.field2874[var12]];
                }
                if (class191.field2874[var12] == 6) {
                    var23 = (class626.field8887 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class191.field2874[var12] == 7) {
                    var23 = (class626.field8887 % 20) >= 10 ? 65535 : 255;
                }
                if (class191.field2874[var12] == 8) {
                    var23 = (class626.field8887 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class191.field2874[var12] == 9) {
                    int var24 = 150 - class191.field2871[var12];
                    if (var24 < 50) {
                        var23 = var24 * 1280 + 16711680;
                    } else if (var24 < 100) {
                        var23 = 16776960 + 16384000 - (var24 * 327680);
                    } else if (var24 < 150) {
                        var23 = (var24 - 100) * 5 + 65280;
                    }
                }
                if (class191.field2874[var12] == 10) {
                    int var25 = 150 - class191.field2871[var12];
                    if (var25 < 50) {
                        var23 = (var25 * 5) + 16711680;
                    } else if (var25 < 100) {
                        var23 = 16384000 - (var25 * 327680 - 16711935);
                    } else if (var25 < 150) {
                        var23 = (var25 - 100) * 327680 + 500 + 255 - (var25 * 5);
                    }
                }
                if (class191.field2874[var12] == 11) {
                    int var26 = 150 - class191.field2871[var12];
                    if (var26 < 50) {
                        var23 = 16777215 - (var26 * 327685);
                    } else if (var26 < 100) {
                        var23 = (var26 - 50) * 327685 + 65280;
                    } else if (var26 < 150) {
                        var23 = 16777215 - ((var26 - 100) * 327680);
                    }
                }
                int var27 = var23 | 0xFF000000;
                if (class191.field2870[var12] == 0) {
                    var21 -= var18 >> 1;
                    class670.field9398.method2635(arg5 + var13, var17, var27, 0, -16777216, arg4 + var14);
                    var19 -= var18 >> 1;
                }
                if (class191.field2870[var12] == 1) {
                    var21 -= var18 >> 1;
                    var22 += 5;
                    class670.field9398.method2626(arg4 + var14, arg0 + 5576, var27, class626.field8887, arg5 + var13, var17, -16777216);
                    var20 -= 5;
                    var19 -= var18 >> 1;
                }
                if (class191.field2870[var12] == 2) {
                    var21 -= (var18 >> 1) - 5;
                    var19 -= (var18 >> 1) + 5;
                    var20 -= 5;
                    class670.field9398.method2625(arg4 + var14, arg5 + var13, var27, (byte) 82, var17, class626.field8887, -16777216);
                    var22 += 5;
                }
                if (class191.field2870[var12] == 3) {
                    var22 += 7;
                    var21 -= var18 >> 1;
                    class670.field9398.method2636(arg4 + var14, class626.field8887, arg5 + var13, var27, -124, -16777216, 150 - class191.field2871[var12], var17);
                    var19 -= var18 >> 1;
                    var20 -= 7;
                }
                if (class191.field2870[var12] == 4) {
                    int var28 = (150 - class191.field2871[var12]) * (class675.field9477.method2748(var17, 8364) + 100) / 150;
                    class686.field9702.method518(arg5 + var13 - 50, arg4, arg5 + var13 + 50, arg4 + arg6);
                    var19 += 50 - var28;
                    var21 += 50 - var28;
                    class670.field9398.method2628(var27, var17, var13 + arg5 + 50 - var28, -102, arg4 + var14, -16777216);
                    class686.field9702.method488(arg5, arg4, arg1 + arg5, arg4 + arg6);
                }
                if (class191.field2870[var12] == 5) {
                    int var29 = 150 - class191.field2871[var12];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    int var31 = class675.field9477.field6402 + class675.field9477.field6399;
                    class686.field9702.method518(arg5, arg4 + var14 - (var31 + 1), arg1 + arg5, arg4 + var14 + 5);
                    class670.field9398.method2635(arg5 + var13, var17, var27, 0, -16777216, arg4 + var30 + var14);
                    var22 += var30;
                    var20 += var30;
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                    class686.field9702.method488(arg5, arg4, arg1 + arg5, arg4 + arg6);
                }
            } else {
                var21 -= var18 >> 1;
                class670.field9398.method2635(arg5 + var13, var17, -256, 0, -16777216, arg4 + var14);
                var19 -= var18 >> 1;
            }
            class528.method3090(3985, var22 + 1, var20, var19, var21 + 1);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 1184)
    public static void method2349(int arg0) {
        field5451 = null;
        if (arg0 != -5051) {
            method2347(8, 112);
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(II)V", line = 1196)
    public final void method2350(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method290(-59, -28);
        }
        field5450++;
        if (this.method290(arg1, -127) != 3) {
            this.method286((byte) -125, arg1);
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lw;)V", line = 1215)
    public class392(class675 arg0) {
        this.field5454 = arg0;
        this.field5452 = this.method292(true);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(ILw;)V", line = 1223)
    public class392(int arg0, class675 arg1) {
        this.field5452 = arg0;
        this.field5454 = arg1;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)I")
    public abstract int method292(boolean arg0);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)I")
    public abstract int method290(int arg0, int arg1);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
    public abstract void method291(boolean arg0);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)V")
    public abstract void method286(byte arg0, int arg1);
}
