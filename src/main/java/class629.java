import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class629 extends class55 {

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "I")
    public int field8775;

    @OriginalMember(owner = "client!pda", name = "n", descriptor = "Lea;")
    public static class547 field8777 = new class547(86, 6);

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "Lni;")
    public static class522 field8776;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIIBII)V")
    public static final void method3545(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field8774++;
        int var7 = class427.field6032;
        int[] var8 = class619.field8682;
        class185.field2256 = 0;
        for (int var9 = 0; var9 < (class84.field1169 + var7); var9++) {
            class274 var37 = null;
            class74 var38;
            if (var9 >= var7) {
                var38 = ((class706) class681.field9475.method2552((long) class665.field9261[var9 - var7], -1)).field9890;
                var37 = ((class215) var38).field2589;
                if (var37.field3616 != null) {
                    var37 = var37.method1637(class386.field5455, (byte) 127);
                    if (var37 == null) {
                        continue;
                    }
                }
            } else {
                var38 = class361.field4793[var8[var9]];
            }
            if (var38.field820 >= 0 && (class478.field6604 == var38.field875 || class653.field9086.field2175 == var38.field2175)) {
                class465.method2589(var38.method553(false), arg1 >> 1, -100, arg3, var38, arg2 >> 1, arg0);
                if (class118.field1560[0] >= 0) {
                    if (var38.field822 != null && (var7 <= var9 || class21.field156 == 0 || class21.field156 == 3 || class21.field156 == 1 && class212.method1181(0, ((class83) var38).field1148)) && class339.field4568 > class185.field2256) {
                        class339.field4572[class185.field2256] = class616.field8643.method2216(var38.field822, 124) / 2;
                        class339.field4567[class185.field2256] = class118.field1560[0];
                        class339.field4573[class185.field2256] = class118.field1560[1];
                        class339.field4569[class185.field2256] = var38.field853;
                        class339.field4571[class185.field2256] = var38.field858;
                        class339.field4563[class185.field2256] = var38.field836;
                        class339.field4562[class185.field2256] = var38.field822;
                        class185.field2256++;
                    }
                    int var39 = class118.field1560[1] + arg6;
                    int var50;
                    if (var38.field819 || class406.field5732 >= var38.field876) {
                        var50 = var39 - Math.max(class616.field8643.field5239, class563.field7963[0].method676());
                    } else {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var42;
                        if (var7 <= var9) {
                            var42 = var37.field3639;
                            if (var42 == -1) {
                                var42 = var38.method548(arg4 ^ 0xFFFFFF85).field4671;
                            }
                        } else {
                            class83 var43 = class361.field4793[var8[var9]];
                            var42 = var38.method548(1).field4671;
                            if (var43.field1142) {
                                var41 = 2;
                            }
                        }
                        class680[] var44 = class563.field7963;
                        if (var42 != -1) {
                            class680[] var45 = (class680[]) class539.field7308.method1571(-128, (long) var42);
                            if (var45 == null) {
                                class204[] var46 = class204.method1124(class97.field1282, var42, 0);
                                if (var46 != null) {
                                    var45 = new class680[var46.length];
                                    for (int var47 = 0; var47 < var46.length; var47++) {
                                        var45[var47] = class21.field142.method366(var46[var47], true);
                                    }
                                    class539.field7308.method1574((long) var42, var45, (byte) -80);
                                }
                            }
                            if (var45 != null && var45.length >= 2) {
                                var44 = var45;
                            }
                        }
                        if (var44.length <= var41) {
                            var41 = 1;
                        }
                        class680 var48 = var44[0];
                        class680 var49 = var44[var41];
                        var50 = var39 - Math.max(class616.field8643.field5239, var48.method676());
                        int var51 = arg5 + (class118.field1560[0] - (var48.method674() >> 1));
                        int var52 = var48.method674() * var38.field890 / 255;
                        int var53 = var48.method676();
                        if (var38.field890 > 0 && var52 < 2) {
                            var52 = 2;
                        }
                        var48.method3859(var51, var50);
                        class21.field142.method385(var51, var50, var51 + var52, var50 + var53);
                        var49.method3859(var51, var50);
                        class21.field142.method426(arg5, arg6, arg1 + arg5, arg6 - -arg2);
                        class207.method1157(var50 + var53, var50, false, var51, var48.method666() + var51);
                    }
                    var50 -= 2;
                    if (!var38.field819) {
                        if (var38.field870 > class406.field5732) {
                            class680 var54 = class713.field9956[var38.field788 ? 2 : 0];
                            class680 var55 = class713.field9956[var38.field788 ? 3 : 1];
                            boolean var56 = true;
                            int var57;
                            if ((var38 instanceof class215)) {
                                var57 = var37.field3605;
                                if (var57 == -1) {
                                    var57 = var38.method548(1).field4663;
                                }
                            } else {
                                var57 = var38.method548(1).field4663;
                            }
                            if (var57 != -1) {
                                class680[] var58 = (class680[]) class302.field4084.method1571(-126, (long) var57);
                                if (var58 == null) {
                                    class204[] var59 = class204.method1124(class97.field1282, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class680[var59.length];
                                        for (int var60 = 0; var60 < var59.length; var60++) {
                                            var58[var60] = class21.field142.method366(var59[var60], true);
                                        }
                                        class302.field4084.method1574((long) var57, var58, (byte) -80);
                                    }
                                }
                                if (var58 != null && var58.length == 4) {
                                    var54 = var58[var38.field788 ? 2 : 0];
                                    var55 = var58[var38.field788 ? 3 : 1];
                                }
                            }
                            int var61 = var38.field870 - class406.field5732;
                            int var62;
                            if (var38.field847 >= var61) {
                                var62 = var54.method674();
                            } else {
                                int var63 = var61 - var38.field847;
                                int var64 = var38.field856 == 0 ? 0 : (var38.field879 - var63) / var38.field856 * var38.field856;
                                var62 = var54.method674() * var64 / var38.field879;
                            }
                            int var65 = var54.method676();
                            var50 -= var65;
                            int var66 = class118.field1560[0] + arg5 - (var54.method674() >> 1);
                            var54.method3859(var66, var50);
                            class21.field142.method385(var66, var50, var62 + var66, var50 - -var65);
                            var55.method3859(var66, var50);
                            class21.field142.method426(arg5, arg6, arg1 + arg5, arg2 + arg6);
                            class207.method1157(var50 + var65, var50, false, var66, var54.method666() + var66);
                            var50 -= 2;
                        }
                        if (var9 < var7) {
                            class83 var68 = (class83) var38;
                            if (var68.field1116 != -1) {
                                var50 -= 25;
                                class680 var69 = class255.field3305[var68.field1116];
                                var69.method3859(class118.field1560[0] + arg5 - 12, var50);
                                class207.method1157(var69.method663() + var50, var50, false, arg5 - (12 - class118.field1560[0]), class118.field1560[0] + arg5 + -12 + var69.method666());
                                var50 -= 2;
                            }
                            if (var68.field1136 != -1) {
                                var50 -= 25;
                                class680 var70 = class427.field6033[var68.field1136];
                                var70.method3859(arg5 + class118.field1560[0] - 12, var50);
                                class207.method1157(var50 + var70.method663(), var50, false, class118.field1560[0] + arg5 - 12, arg5 + (class118.field1560[0] + -12 - -var70.method666()));
                                var50 -= 2;
                            }
                        } else if (var37.field3621 >= 0 && var37.field3621 < class427.field6033.length) {
                            class680 var67 = class427.field6033[var37.field3621];
                            var50 -= 25;
                            var67.method3859(arg5 + class118.field1560[0] - (var67.method674() >> 1), var50);
                            class207.method1157(var67.method663() + var50, var50, false, arg5 - ((var67.method674() >> 1) - class118.field1560[0]), class118.field1560[0] + arg5 + -(var67.method674() >> 1) + var67.method666());
                            var50 -= 2;
                        }
                    }
                    int var10000;
                    if (!var38 instanceof class83) {
                        int var77 = 0;
                        class641[] var78 = class475.field6572;
                        for (int var79 = 0; var79 < var78.length; var79++) {
                            class641 var179 = var78[var79];
                            if (var179 != null && var179.field8921 == 1 && class665.field9261[var9 - var7] == var179.field8918) {
                                class680 var180 = class635.field8820[var179.field8913];
                                if (var180.method676() > var77) {
                                    var77 = var180.method676();
                                }
                                if ((class406.field5732 % 20) < 10) {
                                    var180.method3859(class118.field1560[0] + arg5 - 12, var50 + -var180.method676());
                                    class207.method1157(var50 - var180.method676() + var180.method663(), var50 + -var180.method676(), false, class118.field1560[0] + arg5 - 12, class118.field1560[0] + -12 + arg5 + var180.method666());
                                }
                            }
                        }
                        if (var77 > 0) {
                            var10000 = var50 - (var77 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var71 = 0;
                        class641[] var72 = class475.field6572;
                        for (int var73 = 0; var73 < var72.length; var73++) {
                            class641 var75 = var72[var73];
                            if (var75 != null && var75.field8921 == 10 && var8[var9] == var75.field8918) {
                                class680 var76 = class635.field8820[var75.field8913];
                                if (var71 < var76.method676()) {
                                    var71 = var76.method676();
                                }
                                var76.method3859(arg5 + class118.field1560[0] - 12, -var76.method676() + var50);
                                class207.method1157(var50 - var76.method676() + var76.method663(), var50 - var76.method676(), false, arg5 + class118.field1560[0] - 12, arg5 - (-class118.field1560[0] + 12) - -var76.method666());
                            }
                        }
                        if (var71 > 0) {
                            var10000 = var50 - (var71 + 2);
                        }
                    }
                    for (int var81 = 0; var81 < class341.field4588; var81++) {
                        int var82 = var38.field823[var81];
                        int var83 = var38.field891[var81];
                        class656 var84 = null;
                        int var85 = 0;
                        if (var83 >= 0) {
                            if (class406.field5732 >= var82) {
                                continue;
                            }
                            var84 = class142.field1830.method2859(arg4 + 87, var38.field891[var81]);
                            var85 = var84.field9171;
                        } else if (var82 < 0) {
                            continue;
                        }
                        int var86 = var38.field838[var81];
                        class656 var87 = null;
                        if (var86 >= 0) {
                            var87 = class142.field1830.method2859(94, var86);
                        }
                        if (class406.field5732 >= (var82 - var85)) {
                            int var88 = var38.field852[var81];
                            if (var88 >= 0) {
                                var38.field876 = class406.field5732 + 300;
                                var38.field890 = var88;
                                var38.field852[var81] = -1;
                            }
                            if (var84 == null) {
                                var38.field823[var81] = -1;
                            } else {
                                int var89 = var38.method553(false) / 2;
                                class465.method2589(var89, arg1 >> 1, 92, arg3, var38, arg2 >> 1, arg0);
                                if (class118.field1560[0] > -1) {
                                    class118.field1560[0] += class359.field4755[var81];
                                    class118.field1560[1] += class606.field8440[var81];
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
                                    class680 var102 = null;
                                    class680 var103 = null;
                                    class680 var104 = null;
                                    class680 var105 = null;
                                    int var106 = 0;
                                    int var107 = 0;
                                    int var108 = 0;
                                    int var109 = 0;
                                    int var110 = 0;
                                    int var111 = 0;
                                    int var112 = 0;
                                    int var113 = 0;
                                    class680 var114 = var84.method3715(false, class21.field142);
                                    int var115 = 0;
                                    if (var114 != null) {
                                        var94 = var114.method674();
                                        int var116 = var114.method676();
                                        var114.method667(class705.field9888);
                                        if (var116 > var115) {
                                            var115 = var116;
                                        }
                                        var98 = class705.field9888[0];
                                    }
                                    class680 var117 = var84.method3721(40, class21.field142);
                                    if (var117 != null) {
                                        var95 = var117.method674();
                                        int var118 = var117.method676();
                                        var117.method667(class705.field9888);
                                        if (var118 > var115) {
                                            var115 = var118;
                                        }
                                        var99 = class705.field9888[0];
                                    }
                                    class680 var119 = var84.method3718(class21.field142, arg4 ^ 0x17);
                                    if (var119 != null) {
                                        var96 = var119.method674();
                                        int var120 = var119.method676();
                                        var119.method667(class705.field9888);
                                        if (var115 < var120) {
                                            var115 = var120;
                                        }
                                        var100 = class705.field9888[0];
                                    }
                                    class680 var121 = var84.method3719(-1, class21.field142);
                                    if (var121 != null) {
                                        var97 = var121.method674();
                                        int var122 = var121.method676();
                                        if (var122 > var115) {
                                            var115 = var122;
                                        }
                                        var121.method667(class705.field9888);
                                        var101 = class705.field9888[0];
                                    }
                                    if (var87 != null) {
                                        var102 = var87.method3715(false, class21.field142);
                                        if (var102 != null) {
                                            var106 = var102.method674();
                                            int var123 = var102.method676();
                                            if (var115 < var123) {
                                                var115 = var123;
                                            }
                                            var102.method667(class705.field9888);
                                            var110 = class705.field9888[0];
                                        }
                                        var103 = var87.method3721(63, class21.field142);
                                        if (var103 != null) {
                                            var107 = var103.method674();
                                            int var124 = var103.method676();
                                            var103.method667(class705.field9888);
                                            if (var115 < var124) {
                                                var115 = var124;
                                            }
                                            var111 = class705.field9888[0];
                                        }
                                        var104 = var87.method3718(class21.field142, arg4 ^ 0x7D);
                                        if (var104 != null) {
                                            var108 = var104.method674();
                                            int var125 = var104.method676();
                                            if (var125 > var115) {
                                                var115 = var125;
                                            }
                                            var104.method667(class705.field9888);
                                            var112 = class705.field9888[0];
                                        }
                                        var105 = var87.method3719(arg4 ^ 0x7B, class21.field142);
                                        if (var105 != null) {
                                            var109 = var105.method674();
                                            int var126 = var105.method676();
                                            var105.method667(class705.field9888);
                                            if (var115 < var126) {
                                                var115 = var126;
                                            }
                                            var113 = class705.field9888[0];
                                        }
                                    }
                                    class61 var127 = class497.field6764;
                                    class61 var128 = class497.field6764;
                                    class377 var129 = class86.field1180;
                                    int var130 = var84.field9176;
                                    class377 var131 = class86.field1180;
                                    if (var130 >= 0) {
                                        class61 var132 = class388.method2265(var130, class21.field142, (byte) 124, true);
                                        class377 var133 = class324.method1937(var130, 18361, class21.field142);
                                        if (var132 != null && var133 != null) {
                                            var129 = var133;
                                            var127 = var132;
                                        }
                                    }
                                    if (var87 != null) {
                                        int var134 = var87.field9176;
                                        if (var134 >= 0) {
                                            class61 var135 = class388.method2265(var134, class21.field142, (byte) 124, true);
                                            class377 var136 = class324.method1937(var134, 18361, class21.field142);
                                            if (var135 != null && var136 != null) {
                                                var131 = var136;
                                                var128 = var135;
                                            }
                                        }
                                    }
                                    Object var137 = null;
                                    String var138 = null;
                                    boolean var139 = false;
                                    String var140 = var84.method3717(22414, var38.field884[var81]);
                                    int var141 = 0;
                                    int var142 = var129.method2216(var140, arg4 + 242);
                                    if (var87 != null) {
                                        var138 = var87.method3717(22414, var38.field882[var81]);
                                        var141 = var131.method2216(var138, 107);
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
                                        if (var107 > 0) {
                                            int var158 = var107 * var144;
                                            var157 = (var158 - var141) / 2 + var151;
                                            var151 += var158;
                                        } else {
                                            var151 += var141;
                                        }
                                        var156 = var151;
                                        if (var109 > 0) {
                                            var151 += var109;
                                        }
                                    }
                                    int var159 = var38.field823[var81] - class406.field5732;
                                    int var160 = var84.field9174 - (var84.field9174 * var159 / var84.field9171);
                                    int var161 = var84.field9167 * var159 / var84.field9171 - var84.field9167;
                                    int var162 = class118.field1560[0] + arg5 + var160 - (var151 >> 1);
                                    int var163 = class118.field1560[1] + arg6 + var161 - 12;
                                    int var164 = var163;
                                    int var165 = var115 + var163;
                                    int var166 = var84.field9159 + var163 + 15;
                                    int var167 = var166 - var129.field5239;
                                    if (var167 < var163) {
                                        var164 = var167;
                                    }
                                    int var168 = var129.field5236 + var166;
                                    if (var168 > var165) {
                                        var165 = var168;
                                    }
                                    int var169 = 0;
                                    if (var87 != null) {
                                        var169 = var163 + var87.field9159 + 15;
                                        int var170 = var169 - var131.field5239;
                                        int var171 = var131.field5236 + var169;
                                        if (var170 < var164) {
                                            var164 = var170;
                                        }
                                        if (var165 < var171) {
                                            var165 = var171;
                                        }
                                    }
                                    int var172 = 255;
                                    if (var84.field9158 >= 0) {
                                        var172 = (var159 << 8) / (var84.field9171 - var84.field9158);
                                    }
                                    if (var172 >= 0 && var172 < 255) {
                                        int var173 = var172 << 24;
                                        int var174 = var173 | 0xFFFFFF;
                                        if (var114 != null) {
                                            var114.method677(var146 + var162 - var98, var163, 0, var174, 1);
                                        }
                                        if (var119 != null) {
                                            var119.method677(var147 + var162 - var100, var163, 0, var174, 1);
                                        }
                                        if (var117 != null) {
                                            for (int var175 = 0; var175 < var143; var175++) {
                                                var117.method677(var162 + var148 - (var99 - var95 * var175), var163, 0, var174, 1);
                                            }
                                        }
                                        if (var121 != null) {
                                            var121.method677(var162 + var152 - var101, var163, 0, var174, 1);
                                        }
                                        var127.method475((byte) -102, var166, var140, var84.field9165 | var173, 0, var149 + var162);
                                        if (var87 != null) {
                                            if (var102 != null) {
                                                var102.method677(var153 + var162 - var110, var163, 0, var174, 1);
                                            }
                                            if (var104 != null) {
                                                var104.method677(var162 - (var112 - var154), var163, 0, var174, 1);
                                            }
                                            if (var103 != null) {
                                                for (int var176 = 0; var176 < var144; var176++) {
                                                    var103.method677(var107 * var176 + var162 + var155 - var111, var163, 0, var174, 1);
                                                }
                                            }
                                            if (var105 != null) {
                                                var105.method677(var156 + var162 - var113, var163, 0, var174, 1);
                                            }
                                            var128.method475((byte) -105, var169, var138, var173 | var87.field9165, 0, var157 + var162);
                                        }
                                    } else {
                                        if (var114 != null) {
                                            var114.method3859(var162 + var146 - var98, var163);
                                        }
                                        if (var119 != null) {
                                            var119.method3859(var147 + var162 - var100, var163);
                                        }
                                        if (var117 != null) {
                                            for (int var177 = 0; var177 < var143; var177++) {
                                                var117.method3859((var95 * var177) + (var162 + var148) - var99, var163);
                                            }
                                        }
                                        if (var121 != null) {
                                            var121.method3859(var152 + var162 - var101, var163);
                                        }
                                        var127.method475((byte) 79, var166, var140, var84.field9165 | 0xFF000000, 0, var162 + var149);
                                        if (var87 != null) {
                                            if (var102 != null) {
                                                var102.method3859(var162 - (var110 - var153), var163);
                                            }
                                            if (var104 != null) {
                                                var104.method3859(var154 + var162 - var112, var163);
                                            }
                                            if (var103 != null) {
                                                for (int var178 = 0; var178 < var144; var178++) {
                                                    var103.method3859((var107 * var178) + var155 + var162 - var111, var163);
                                                }
                                            }
                                            if (var105 != null) {
                                                var105.method3859(var156 + var162 - var113, var163);
                                            }
                                            var128.method475((byte) 81, var169, var138, var87.field9165 | 0xFF000000, 0, var162 + var157);
                                        }
                                    }
                                    class207.method1157(var165 + 1, var164, false, var162, var151 + var162);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class590.field8235; var10++) {
            int var33 = class102.field1376[var10];
            class74 var34;
            if (var33 < 2048) {
                var34 = class361.field4793[var33];
            } else {
                var34 = ((class706) class681.field9475.method2552((long) (var33 - 2048), -1)).field9890;
            }
            int var35 = class647.field9005[var10];
            class74 var36;
            if (var35 >= 2048) {
                var36 = ((class706) class681.field9475.method2552((long) (var35 - 2048), arg4 + 123)).field9890;
            } else {
                var36 = class361.field4793[var35];
            }
            class439.method2482(arg0, arg5, arg3, 123, var34, arg6, var36, --var34.field802, arg1, arg2);
        }
        int var11 = class616.field8643.field5239 + class616.field8643.field5236 + 2;
        if (arg4 != -124) {
            return;
        }
        for (int var12 = 0; var12 < class185.field2256; var12++) {
            int var13 = class339.field4567[var12];
            int var14 = class339.field4573[var12];
            int var15 = class339.field4572[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; var32 < var12; var32++) {
                    if (class339.field4573[var32] - var11 < var14 + 2 && (class339.field4573[var32] + 2) > (var14 - var11) && var13 - var15 < class339.field4572[var32] + class339.field4567[var32] && (class339.field4567[var32] - class339.field4572[var32]) < (var13 + var15) && var14 > (class339.field4573[var32] - var11)) {
                        var14 = class339.field4573[var32] - var11;
                        var16 = true;
                    }
                }
            }
            class339.field4573[var12] = var14;
            String var17 = class339.field4562[var12];
            int var18 = class616.field8643.method2216(var17, 104);
            int var19 = arg5 + var13;
            int var20 = arg6 + var14 - class616.field8643.field5239;
            int var21 = var18 + var19;
            int var22 = arg6 + var14 + class616.field8643.field5236;
            if (class440.field6150 == 0) {
                int var23 = 16776960;
                if (class339.field4569[var12] < 6) {
                    var23 = class414.field5856[class339.field4569[var12]];
                }
                if (class339.field4569[var12] == 6) {
                    var23 = (class478.field6604 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class339.field4569[var12] == 7) {
                    var23 = class478.field6604 % 20 >= 10 ? 65535 : 255;
                }
                if (class339.field4569[var12] == 8) {
                    var23 = class478.field6604 % 20 < 10 ? 45056 : 8454016;
                }
                if (class339.field4569[var12] == 9) {
                    int var24 = 150 - class339.field4563[var12];
                    if (var24 < 50) {
                        var23 = var24 * 1280 + 16711680;
                    } else if (var24 < 100) {
                        var23 = 16776960 + 16384000 - (var24 * 327680);
                    } else if (var24 < 150) {
                        var23 = (var24 - 100) * 5 + 65280;
                    }
                }
                if (class339.field4569[var12] == 10) {
                    int var25 = 150 - class339.field4563[var12];
                    if (var25 < 50) {
                        var23 = var25 * 5 + 16711680;
                    } else if (var25 < 100) {
                        var23 = 16384000 + 16711935 - var25 * 327680;
                    } else if (var25 < 150) {
                        var23 = (var25 * 327680) + 255 - (32768000 - -((var25 + -100) * 5));
                    }
                }
                if (class339.field4569[var12] == 11) {
                    int var26 = 150 - class339.field4563[var12];
                    if (var26 < 50) {
                        var23 = 16777215 - (var26 * 327685);
                    } else if (var26 < 100) {
                        var23 = var26 * 327685 + 65280 - 16384250;
                    } else if (var26 < 150) {
                        var23 = 16777215 - ((var26 - 100) * 327680);
                    }
                }
                int var27 = var23 | 0xFF000000;
                if (class339.field4571[var12] == 0) {
                    var21 -= var18 >> 1;
                    class214.field2575.method479(var27, var17, arg5 + var13, -16777216, (byte) 60, arg6 + var14);
                    var19 -= var18 >> 1;
                }
                if (class339.field4571[var12] == 1) {
                    var20 -= 5;
                    var19 -= var18 >> 1;
                    class214.field2575.method468(-16777216, arg5 + var13, arg6 + var14, class478.field6604, 62, var17, var27);
                    var22 += 5;
                    var21 -= var18 >> 1;
                }
                if (class339.field4571[var12] == 2) {
                    var21 -= (var18 >> 1) - 5;
                    var22 += 5;
                    var20 -= 5;
                    class214.field2575.method476(-16777216, -127, var27, arg5 + var13, arg6 + var14, var17, class478.field6604);
                    var19 -= (var18 >> 1) + 5;
                }
                if (class339.field4571[var12] == 3) {
                    var21 -= var18 >> 1;
                    var22 += 7;
                    class214.field2575.method471(0, -16777216, arg6 + var14, var27, 150 - class339.field4563[var12], class478.field6604, arg5 + var13, var17);
                    var20 -= 7;
                    var19 -= var18 >> 1;
                }
                if (class339.field4571[var12] == 4) {
                    int var28 = (150 - class339.field4563[var12]) * (class616.field8643.method2216(var17, 112) + 100) / 150;
                    class21.field142.method385(var13 + arg5 - 50, arg6, arg5 + var13 + 50, arg6 - -arg2);
                    var21 += 50 - var28;
                    var19 += 50 - var28;
                    class214.field2575.method475((byte) 66, arg6 + var14, var17, var27, -16777216, var13 + arg5 + 50 - var28);
                    class21.field142.method426(arg5, arg6, arg1 + arg5, arg2 + arg6);
                }
                if (class339.field4571[var12] == 5) {
                    int var29 = 150 - class339.field4563[var12];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    int var31 = class616.field8643.field5239 + class616.field8643.field5236;
                    class21.field142.method385(arg5, arg6 + var14 - var31 - 1, arg1 + arg5, arg6 - (-var14 - 5));
                    var20 += var30;
                    var22 += var30;
                    var21 -= var18 >> 1;
                    class214.field2575.method479(var27, var17, arg5 + var13, -16777216, (byte) 124, arg6 + var14 + var30);
                    var19 -= var18 >> 1;
                    class21.field142.method426(arg5, arg6, arg1 + arg5, arg2 + arg6);
                }
            } else {
                class214.field2575.method479(-256, var17, arg5 + var13, -16777216, (byte) -87, arg6 + var14);
                var21 -= var18 >> 1;
                var19 -= var18 >> 1;
            }
            class207.method1157(var22 + 1, var20, false, var19, var21 + 1);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
    public static void method3546(int arg0) {
        field8777 = null;
        if (arg0 > -106) {
            field8776 = null;
        }
        field8776 = null;
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "()V")
    public class629() {
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(I)V")
    public class629(int arg0) {
        this.field8775 = arg0;
    }
}
