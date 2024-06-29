import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class73 {

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "B")
    public byte field963;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "Lqia;")
    public static class547 field955 = new class547();

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "Lpda;")
    public class149 field964;

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "Lpda;")
    public class149 field971;

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "Lvl;")
    public class337 field966;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "Lmaa;")
    public class440 field965;

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "Lof;")
    public class456 field969;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "Ltd;")
    public class525 field961;

    @OriginalMember(owner = "client!fu", name = "s", descriptor = "Ltd;")
    public class525 field973;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "Lfu;")
    public class73 field962;

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "S")
    public short field967;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "S")
    public short field968;

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "S")
    public short field970;

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "S")
    public short field972;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "[[Lpg;")
    public static class711[][] field960;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
    public static void method535(byte arg0) {
        if (arg0 > -126) {
            method538(106, false, (byte) -121);
        }
        field960 = null;
        field955 = null;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIII)V")
    public static final void method536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field956++;
        int var7 = class627.field8745;
        int[] var8 = class274.field3465;
        class570.field7953 = 0;
        int var9 = 0;
        if (arg5 != 1) {
            field955 = null;
        }
        while (var9 < var7 + class443.field6200) {
            label715: {
                class155 var37 = null;
                class24 var38;
                if (var9 >= var7) {
                    var38 = ((class247) class563.field7875.method3248((long) class61.field832[var9 - var7], 0)).field3158;
                    var37 = ((class124) var38).field1486;
                    if (var37.field1929 != null) {
                        var37 = var37.method968((byte) -76, class461.field6637);
                        if (var37 == null) {
                            break label715;
                        }
                    }
                } else {
                    var38 = class447.field6287[var8[var9]];
                }
                if (var38.field422 >= 0 && (class710.field9990 == var38.field390 || class339.field4374.field5779 == var38.field5779)) {
                    class715.method3966(arg4 >> 1, arg6, (byte) -25, var38, var38.method251(-63), arg1 >> 1, arg2);
                    if (class681.field9310[0] >= 0) {
                        if (var38.field334 != null && (var7 <= var9 || class463.field6710 == 0 || class463.field6710 == 3 || class463.field6710 == 1 && class398.method2363(((class546) var38).field7690, arg5 - 1)) && class570.field7953 < class340.field4394) {
                            class340.field4396[class570.field7953] = class111.field1373.method453(-1, var38.field334) / 2;
                            class340.field4399[class570.field7953] = class681.field9310[0];
                            class340.field4402[class570.field7953] = class681.field9310[1];
                            class340.field4390[class570.field7953] = var38.field409;
                            class340.field4392[class570.field7953] = var38.field356;
                            class340.field4397[class570.field7953] = var38.field345;
                            class340.field4401[class570.field7953] = var38.field334;
                            class570.field7953++;
                        }
                        int var39 = class681.field9310[1] + arg3;
                        int var50;
                        if (var38.field417 || var38.field375 <= class266.field3368) {
                            var50 = var39 - Math.max(class111.field1373.field800, class376.field5268[0].method1893());
                        } else {
                            boolean var40 = true;
                            byte var41 = 1;
                            int var43;
                            if (var7 > var9) {
                                class546 var42 = class447.field6287[var8[var9]];
                                var43 = var38.method249(-92).field6456;
                                if (var42.field7677) {
                                    var41 = 2;
                                }
                            } else {
                                var43 = var37.field1912;
                                if (var43 == -1) {
                                    var43 = var38.method249(-122).field6456;
                                }
                            }
                            class712[] var44 = class376.field5268;
                            if (var43 != -1) {
                                class712[] var45 = (class712[]) class504.field7104.method778((long) var43, arg5 ^ 0x6D);
                                if (var45 == null) {
                                    class196[] var46 = class196.method1225(class645.field8897, var43, 0);
                                    if (var46 != null) {
                                        var45 = new class712[var46.length];
                                        for (int var47 = 0; var47 < var46.length; var47++) {
                                            var45[var47] = class458.field6407.method60(var46[var47], true);
                                        }
                                        class504.field7104.method774((long) var43, -113, var45);
                                    }
                                }
                                if (var45 != null && var45.length >= 2) {
                                    var44 = var45;
                                }
                            }
                            if (var41 >= var44.length) {
                                var41 = 1;
                            }
                            class712 var48 = var44[0];
                            class712 var49 = var44[var41];
                            var50 = var39 - Math.max(class111.field1373.field800, var48.method1893());
                            int var51 = class681.field9310[0] + arg0 - (var48.method1895() >> 1);
                            int var52 = var48.method1895() * var38.field319 / 255;
                            int var53 = var48.method1893();
                            if (var38.field319 > 0 && var52 < 2) {
                                var52 = 2;
                            }
                            var48.method3929(var51, var50);
                            class458.field6407.method81(var51, var50, var51 + var52, var50 - -var53);
                            var49.method3929(var51, var50);
                            class458.field6407.method131(arg0, arg3, arg0 + arg4, arg1 + arg3);
                            class365.method2249(true, var50 + var53, var50, var48.method1892() + var51, var51);
                        }
                        var50 -= 2;
                        if (!var38.field417) {
                            if (class266.field3368 < var38.field394) {
                                class712 var54 = class637.field8811[var38.field372 ? 2 : 0];
                                class712 var55 = class637.field8811[var38.field372 ? 3 : 1];
                                boolean var56 = true;
                                int var57;
                                if (var38 instanceof class124) {
                                    var57 = var37.field1967;
                                    if (var57 == -1) {
                                        var57 = var38.method249(-78).field6431;
                                    }
                                } else {
                                    var57 = var38.method249(-127).field6431;
                                }
                                if (var57 != -1) {
                                    class712[] var58 = (class712[]) class645.field8893.method778((long) var57, arg5 + 114);
                                    if (var58 == null) {
                                        class196[] var59 = class196.method1225(class645.field8897, var57, 0);
                                        if (var59 != null) {
                                            var58 = new class712[var59.length];
                                            for (int var60 = 0; var60 < var59.length; var60++) {
                                                var58[var60] = class458.field6407.method60(var59[var60], true);
                                            }
                                            class645.field8893.method774((long) var57, 122, var58);
                                        }
                                    }
                                    if (var58 != null && var58.length == 4) {
                                        var55 = var58[var38.field372 ? 3 : 1];
                                        var54 = var58[var38.field372 ? 2 : 0];
                                    }
                                }
                                int var61 = var38.field394 - class266.field3368;
                                int var64;
                                if (var61 > var38.field416) {
                                    int var62 = var61 - var38.field416;
                                    int var63 = var38.field350 == 0 ? 0 : (var38.field411 - var62) / var38.field350 * var38.field350;
                                    var64 = var63 * var54.method1895() / var38.field411;
                                } else {
                                    var64 = var54.method1895();
                                }
                                int var65 = var54.method1893();
                                var50 -= var65;
                                int var66 = arg0 + class681.field9310[0] - (var54.method1895() >> 1);
                                var54.method3929(var66, var50);
                                class458.field6407.method81(var66, var50, var64 + var66, var50 + var65);
                                var55.method3929(var66, var50);
                                class458.field6407.method131(arg0, arg3, arg0 + arg4, arg3 - -arg1);
                                class365.method2249(true, var50 + var65, var50, var66 + var54.method1892(), var66);
                                var50 -= 2;
                            }
                            if (var9 < var7) {
                                class546 var68 = (class546) var38;
                                if (var68.field7696 != -1) {
                                    var50 -= 25;
                                    class712 var69 = class229.field2990[var68.field7696];
                                    var69.method3929(class681.field9310[0] + arg0 - 12, var50);
                                    class365.method2249(true, var69.method1882() + var50, var50, class681.field9310[0] + arg0 - (-var69.method1892() + 12), arg0 - 12 + class681.field9310[0]);
                                    var50 -= 2;
                                }
                                if (var68.field7660 != -1) {
                                    var50 -= 25;
                                    class712 var70 = class22.field303[var68.field7660];
                                    var70.method3929(arg0 + class681.field9310[0] - 12, var50);
                                    class365.method2249(true, var50 + var70.method1882(), var50, class681.field9310[0] + arg0 + var70.method1892() - 12, class681.field9310[0] + arg0 - 12);
                                    var50 -= 2;
                                }
                            } else if (var37.field1921 >= 0 && class22.field303.length > var37.field1921) {
                                var50 -= 25;
                                class712 var67 = class22.field303[var37.field1921];
                                var67.method3929(class681.field9310[0] + arg0 - (var67.method1895() >> 1), var50);
                                class365.method2249(true, var67.method1882() + var50, var50, class681.field9310[0] + (arg0 - (var67.method1895() >> 1) + var67.method1892()), arg0 - -class681.field9310[0] - (var67.method1895() >> 1));
                                var50 -= 2;
                            }
                        }
                        int var10000;
                        if (!var38 instanceof class546) {
                            int var77 = 0;
                            class126[] var78 = class498.field7043;
                            for (int var79 = 0; var79 < var78.length; var79++) {
                                class126 var179 = var78[var79];
                                if (var179 != null && var179.field1507 == 1 && class61.field832[var9 - var7] == var179.field1515) {
                                    class712 var180 = class487.field6935[var179.field1512];
                                    if (var77 < var180.method1893()) {
                                        var77 = var180.method1893();
                                    }
                                    if ((class266.field3368 % 20) < 10) {
                                        var180.method3929(class681.field9310[0] + arg0 - 12, -var180.method1893() + var50);
                                        class365.method2249(true, var50 - var180.method1893() + var180.method1882(), var50 + -var180.method1893(), class681.field9310[0] + arg0 + (-12 - -var180.method1892()), arg0 - -class681.field9310[0] + -12);
                                    }
                                }
                            }
                            if (var77 > 0) {
                                var10000 = var50 - (var77 + 2);
                            }
                        } else if (var9 >= 0) {
                            int var71 = 0;
                            class126[] var72 = class498.field7043;
                            for (int var73 = 0; var73 < var72.length; var73++) {
                                class126 var75 = var72[var73];
                                if (var75 != null && var75.field1507 == 10 && var8[var9] == var75.field1515) {
                                    class712 var76 = class487.field6935[var75.field1512];
                                    if (var71 < var76.method1893()) {
                                        var71 = var76.method1893();
                                    }
                                    var76.method3929(class681.field9310[0] + arg0 - 12, -var76.method1893() + var50);
                                    class365.method2249(true, var50 - var76.method1893() + var76.method1882(), var50 + -var76.method1893(), arg0 + (class681.field9310[0] - (12 - var76.method1892())), class681.field9310[0] + arg0 + -12);
                                }
                            }
                            if (var71 > 0) {
                                var10000 = var50 - (var71 + 2);
                            }
                        }
                        for (int var81 = 0; var81 < class716.field10084; var81++) {
                            int var82 = var38.field322[var81];
                            int var83 = var38.field386[var81];
                            class282 var84 = null;
                            int var85 = 0;
                            if (var83 >= 0) {
                                if (class266.field3368 >= var82) {
                                    continue;
                                }
                                var84 = class398.field5521.method2714(arg5 + 45, var38.field386[var81]);
                                var85 = var84.field3583;
                            } else if (var82 < 0) {
                                continue;
                            }
                            int var86 = var38.field353[var81];
                            class282 var87 = null;
                            if (var86 >= 0) {
                                var87 = class398.field5521.method2714(46, var86);
                            }
                            if (var82 - var85 <= class266.field3368) {
                                int var88 = var38.field358[var81];
                                if (var88 >= 0) {
                                    var38.field319 = var88;
                                    var38.field375 = class266.field3368 + 300;
                                    var38.field358[var81] = -1;
                                }
                                if (var84 == null) {
                                    var38.field322[var81] = -1;
                                } else {
                                    int var89 = var38.method251(-75) / 2;
                                    class715.method3966(arg4 >> 1, arg6, (byte) -25, var38, var89, arg1 >> 1, arg2);
                                    if (class681.field9310[0] > -1) {
                                        class681.field9310[0] += class252.field3204[var81];
                                        class681.field9310[1] += class414.field5849[var81];
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
                                        class712 var102 = null;
                                        class712 var103 = null;
                                        class712 var104 = null;
                                        class712 var105 = null;
                                        int var106 = 0;
                                        int var107 = 0;
                                        int var108 = 0;
                                        int var109 = 0;
                                        int var110 = 0;
                                        int var111 = 0;
                                        int var112 = 0;
                                        int var113 = 0;
                                        int var114 = 0;
                                        class712 var115 = var84.method1697(class458.field6407, -1);
                                        if (var115 != null) {
                                            var94 = var115.method1895();
                                            int var116 = var115.method1893();
                                            var115.method1873(class5.field63);
                                            if (var114 < var116) {
                                                var114 = var116;
                                            }
                                            var98 = class5.field63[0];
                                        }
                                        class712 var117 = var84.method1692((byte) -96, class458.field6407);
                                        if (var117 != null) {
                                            var95 = var117.method1895();
                                            int var118 = var117.method1893();
                                            var117.method1873(class5.field63);
                                            if (var118 > var114) {
                                                var114 = var118;
                                            }
                                            var99 = class5.field63[0];
                                        }
                                        class712 var119 = var84.method1693(arg5 + 1195, class458.field6407);
                                        if (var119 != null) {
                                            var96 = var119.method1895();
                                            int var120 = var119.method1893();
                                            if (var114 < var120) {
                                                var114 = var120;
                                            }
                                            var119.method1873(class5.field63);
                                            var100 = class5.field63[0];
                                        }
                                        class712 var121 = var84.method1691((byte) 121, class458.field6407);
                                        if (var121 != null) {
                                            var97 = var121.method1895();
                                            int var122 = var121.method1893();
                                            if (var114 < var122) {
                                                var114 = var122;
                                            }
                                            var121.method1873(class5.field63);
                                            var101 = class5.field63[0];
                                        }
                                        if (var87 != null) {
                                            var102 = var87.method1697(class458.field6407, -1);
                                            if (var102 != null) {
                                                var106 = var102.method1895();
                                                int var123 = var102.method1893();
                                                if (var123 > var114) {
                                                    var114 = var123;
                                                }
                                                var102.method1873(class5.field63);
                                                var110 = class5.field63[0];
                                            }
                                            var103 = var87.method1692((byte) -100, class458.field6407);
                                            if (var103 != null) {
                                                var107 = var103.method1895();
                                                int var124 = var103.method1893();
                                                if (var124 > var114) {
                                                    var114 = var124;
                                                }
                                                var103.method1873(class5.field63);
                                                var111 = class5.field63[0];
                                            }
                                            var104 = var87.method1693(1196, class458.field6407);
                                            if (var104 != null) {
                                                var108 = var104.method1895();
                                                int var125 = var104.method1893();
                                                if (var114 < var125) {
                                                    var114 = var125;
                                                }
                                                var104.method1873(class5.field63);
                                                var112 = class5.field63[0];
                                            }
                                            var105 = var87.method1691((byte) -53, class458.field6407);
                                            if (var105 != null) {
                                                var109 = var105.method1895();
                                                int var126 = var105.method1893();
                                                if (var126 > var114) {
                                                    var114 = var126;
                                                }
                                                var105.method1873(class5.field63);
                                                var113 = class5.field63[0];
                                            }
                                        }
                                        class423 var127 = class524.field7408;
                                        class423 var128 = class524.field7408;
                                        class56 var129 = class324.field4132;
                                        class56 var130 = class324.field4132;
                                        int var131 = var84.field3584;
                                        if (var131 >= 0) {
                                            class423 var132 = class98.method656(true, var131, class458.field6407, arg5 - 786034065);
                                            class56 var133 = class89.method624(var131, class458.field6407, 10000);
                                            if (var132 != null && var133 != null) {
                                                var127 = var132;
                                                var129 = var133;
                                            }
                                        }
                                        if (var87 != null) {
                                            int var134 = var87.field3584;
                                            if (var134 >= 0) {
                                                class423 var135 = class98.method656(true, var134, class458.field6407, -786034064);
                                                class56 var136 = class89.method624(var134, class458.field6407, 10000);
                                                if (var135 != null && var136 != null) {
                                                    var128 = var135;
                                                    var130 = var136;
                                                }
                                            }
                                        }
                                        Object var137 = null;
                                        String var138 = null;
                                        boolean var139 = false;
                                        String var140 = var84.method1694(false, var38.field377[var81]);
                                        int var141 = 0;
                                        int var142 = var129.method453(-1, var140);
                                        if (var87 != null) {
                                            var138 = var87.method1694(false, var38.field347[var81]);
                                            var141 = var130.method453(-1, var138);
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
                                            var149 = (var150 - var142) / 2 + var145;
                                            var151 = var145 + var150;
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
                                            var157 = var151;
                                            var155 = var151;
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
                                        int var159 = var38.field322[var81] - class266.field3368;
                                        int var160 = var84.field3594 - (var84.field3594 * var159 / var84.field3583);
                                        int var161 = var84.field3586 * var159 / var84.field3583 - var84.field3586;
                                        int var162 = arg0 - (-class681.field9310[0] - var160) - (var151 >> 1);
                                        int var163 = var161 + arg3 + class681.field9310[1] - 12;
                                        int var164 = var163;
                                        int var165 = var114 + var163;
                                        int var166 = var84.field3589 + var163 + 15;
                                        int var167 = var166 - var129.field800;
                                        int var168 = var129.field808 + var166;
                                        if (var163 > var167) {
                                            var164 = var167;
                                        }
                                        if (var165 < var168) {
                                            var165 = var168;
                                        }
                                        int var169 = 0;
                                        if (var87 != null) {
                                            var169 = var87.field3589 + var163 + 15;
                                            int var170 = var169 - var130.field800;
                                            if (var170 < var164) {
                                                var164 = var170;
                                            }
                                            int var171 = var130.field808 + var169;
                                            if (var171 > var165) {
                                                var165 = var171;
                                            }
                                        }
                                        int var172 = 255;
                                        if (var84.field3588 >= 0) {
                                            var172 = (var159 << 8) / (var84.field3583 - var84.field3588);
                                        }
                                        if (var172 >= 0 && var172 < 255) {
                                            int var173 = var172 << 24;
                                            int var174 = var173 | 0xFFFFFF;
                                            if (var115 != null) {
                                                var115.method690(var162 + var146 - var98, var163, 0, var174, 1);
                                            }
                                            if (var119 != null) {
                                                var119.method690(var162 + var147 - var100, var163, 0, var174, 1);
                                            }
                                            if (var117 != null) {
                                                for (int var175 = 0; var175 < var143; var175++) {
                                                    var117.method690(var95 * var175 + var162 + var148 - var99, var163, 0, var174, 1);
                                                }
                                            }
                                            if (var121 != null) {
                                                var121.method690(var152 + var162 - var101, var163, 0, var174, 1);
                                            }
                                            var127.method2505(var173 | var84.field3590, 0, var140, var149 + var162, var166, 255);
                                            if (var87 != null) {
                                                if (var102 != null) {
                                                    var102.method690(var162 + var153 - var110, var163, 0, var174, 1);
                                                }
                                                if (var104 != null) {
                                                    var104.method690(var154 + var162 - var112, var163, 0, var174, 1);
                                                }
                                                if (var103 != null) {
                                                    for (int var176 = 0; var176 < var144; var176++) {
                                                        var103.method690(var155 + var162 - (var111 - var107 * var176), var163, 0, var174, 1);
                                                    }
                                                }
                                                if (var105 != null) {
                                                    var105.method690(var156 + var162 - var113, var163, 0, var174, 1);
                                                }
                                                var128.method2505(var173 | var87.field3590, 0, var138, var157 + var162, var169, 255);
                                            }
                                        } else {
                                            if (var115 != null) {
                                                var115.method3929(var162 + var146 - var98, var163);
                                            }
                                            if (var119 != null) {
                                                var119.method3929(var147 + var162 - var100, var163);
                                            }
                                            if (var117 != null) {
                                                for (int var177 = 0; var177 < var143; var177++) {
                                                    var117.method3929(var95 * var177 + (var162 + var148) - var99, var163);
                                                }
                                            }
                                            if (var121 != null) {
                                                var121.method3929(var152 + var162 - var101, var163);
                                            }
                                            var127.method2505(var84.field3590 | 0xFF000000, 0, var140, var149 + var162, var166, arg5 ^ 0xFE);
                                            if (var87 != null) {
                                                if (var102 != null) {
                                                    var102.method3929(var153 + var162 - var110, var163);
                                                }
                                                if (var104 != null) {
                                                    var104.method3929(var154 + var162 - var112, var163);
                                                }
                                                if (var103 != null) {
                                                    for (int var178 = 0; var178 < var144; var178++) {
                                                        var103.method3929(var107 * var178 + var155 + var162 - var111, var163);
                                                    }
                                                }
                                                if (var105 != null) {
                                                    var105.method3929(var156 + var162 - var113, var163);
                                                }
                                                var128.method2505(var87.field3590 | 0xFF000000, 0, var138, var157 + var162, var169, arg5 ^ 0xFE);
                                            }
                                        }
                                        class365.method2249(true, var165 + 1, var164, var151 + var162, var162);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var9++;
        }
        for (int var10 = 0; var10 < class167.field2154; var10++) {
            int var33 = class58.field818[var10];
            class24 var34;
            if (var33 >= 2048) {
                var34 = ((class247) class563.field7875.method3248((long) (var33 - 2048), 0)).field3158;
            } else {
                var34 = class447.field6287[var33];
            }
            int var35 = class557.field7804[var10];
            class24 var36;
            if (var35 < 2048) {
                var36 = class447.field6287[var35];
            } else {
                var36 = ((class247) class563.field7875.method3248((long) (var35 - 2048), 0)).field3158;
            }
            class416.method2476(arg3, arg4, var36, arg5, --var34.field328, arg1, arg6, arg0, arg2, var34);
        }
        int var11 = class111.field1373.field808 + class111.field1373.field800 + 2;
        for (int var12 = 0; var12 < class570.field7953; var12++) {
            int var13 = class340.field4399[var12];
            int var14 = class340.field4402[var12];
            int var15 = class340.field4396[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; var32 < var12; var32++) {
                    if ((class340.field4402[var32] - var11) < (var14 + 2) && class340.field4402[var32] + 2 > -var11 + var14 && (var13 - var15) < (class340.field4399[var32] + class340.field4396[var32]) && (var13 + var15) > (class340.field4399[var32] - class340.field4396[var32]) && var14 > (class340.field4402[var32] - var11)) {
                        var14 = class340.field4402[var32] - var11;
                        var16 = true;
                    }
                }
            }
            class340.field4402[var12] = var14;
            String var17 = class340.field4401[var12];
            int var18 = class111.field1373.method453(arg5 ^ 0xFFFFFFFE, var17);
            int var19 = arg0 + var13;
            int var20 = arg3 + var14 - class111.field1373.field800;
            int var21 = var18 + var19;
            int var22 = arg3 - (-var14 - class111.field1373.field808);
            if (class502.field7073 == 0) {
                int var23 = 16776960;
                if (class340.field4390[var12] < 6) {
                    var23 = class458.field6402[class340.field4390[var12]];
                }
                if (class340.field4390[var12] == 6) {
                    var23 = (class710.field9990 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class340.field4390[var12] == 7) {
                    var23 = (class710.field9990 % 20) < 10 ? 255 : 65535;
                }
                if (class340.field4390[var12] == 8) {
                    var23 = (class710.field9990 % 20) < 10 ? 45056 : 8454016;
                }
                if (class340.field4390[var12] == 9) {
                    int var24 = 150 - class340.field4397[var12];
                    if (var24 < 50) {
                        var23 = var24 * 1280 + 16711680;
                    } else if (var24 < 100) {
                        var23 = 16776960 - (var24 - 50) * 327680;
                    } else if (var24 < 150) {
                        var23 = (var24 - 100) * 5 + 65280;
                    }
                }
                if (class340.field4390[var12] == 10) {
                    int var25 = 150 - class340.field4397[var12];
                    if (var25 < 50) {
                        var23 = (var25 * 5) + 16711680;
                    } else if (var25 < 100) {
                        var23 = 16711935 - ((var25 - 50) * 327680);
                    } else if (var25 < 150) {
                        var23 = (var25 - 100) * 327680 + 255 - ((var25 - 100) * 5);
                    }
                }
                if (class340.field4390[var12] == 11) {
                    int var26 = 150 - class340.field4397[var12];
                    if (var26 < 50) {
                        var23 = 16777215 - (var26 * 327685);
                    } else if (var26 < 100) {
                        var23 = var26 * 327685 + 65280 - 16384250;
                    } else if (var26 < 150) {
                        var23 = 16777215 - (var26 - 100) * 327680;
                    }
                }
                int var27 = var23 | 0xFF000000;
                if (class340.field4392[var12] == 0) {
                    var19 -= var18 >> 1;
                    var21 -= var18 >> 1;
                    class100.field1234.method2510(arg3 + var14, -16777216, var27, 16777215, var17, arg0 + var13);
                }
                if (class340.field4392[var12] == 1) {
                    var22 += 5;
                    var20 -= 5;
                    var19 -= var18 >> 1;
                    var21 -= var18 >> 1;
                    class100.field1234.method2509(arg0 + var13, false, class710.field9990, arg3 + var14, var17, var27, -16777216);
                }
                if (class340.field4392[var12] == 2) {
                    var21 -= (var18 >> 1) - 5;
                    var22 += 5;
                    var19 -= (var18 >> 1) + 5;
                    var20 -= 5;
                    class100.field1234.method2521(class710.field9990, -16777216, arg5 ^ 0x3B01, var17, arg3 + var14, arg0 + var13, var27);
                }
                if (class340.field4392[var12] == 3) {
                    var22 += 7;
                    var20 -= 7;
                    var19 -= var18 >> 1;
                    class100.field1234.method2511(arg0 + var13, var27, 150 - class340.field4397[var12], arg5 + -94, -16777216, arg3 + var14, var17, class710.field9990);
                    var21 -= var18 >> 1;
                }
                if (class340.field4392[var12] == 4) {
                    int var28 = (150 - class340.field4397[var12]) * (class111.field1373.method453(-1, var17) + 100) / 150;
                    class458.field6407.method81(arg0 + var13 - 50, arg3, arg0 + var13 + 50, arg1 + arg3);
                    class100.field1234.method2505(var27, -16777216, var17, arg0 + var13 - (var28 + -50), arg3 + var14, 255);
                    var19 += 50 - var28;
                    var21 += 50 - var28;
                    class458.field6407.method131(arg0, arg3, arg0 + arg4, arg1 + arg3);
                }
                if (class340.field4392[var12] == 5) {
                    int var29 = 150 - class340.field4397[var12];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    int var31 = class111.field1373.field808 + class111.field1373.field800;
                    class458.field6407.method81(arg0, var14 + arg3 - var31 - 1, arg0 + arg4, arg3 + var14 + 5);
                    class100.field1234.method2510(arg3 + var14 + var30, -16777216, var27, 16777215, var17, arg0 + var13);
                    var20 += var30;
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                    var22 += var30;
                    class458.field6407.method131(arg0, arg3, arg0 + arg4, arg3 - -arg1);
                }
            } else {
                var21 -= var18 >> 1;
                var19 -= var18 >> 1;
                class100.field1234.method2510(arg3 + var14, -16777216, -256, 16777215, var17, arg0 + var13);
            }
            class365.method2249(true, var22 + 1, var20, var21 + 1, var19);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
    public final void method537(int arg0) {
        field958++;
        while (this.field969 != null) {
            class456 var2 = this.field969.field6389;
            this.field969.method2673(-501);
            this.field969 = var2;
        }
        if (arg0 <= 0) {
            field960 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(I)V")
    public class73(int arg0) {
        this.field963 = (byte) arg0;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IZB)Ljava/lang/String;")
    public static final String method538(int arg0, boolean arg1, byte arg2) {
        field957++;
        if (arg1 && arg0 >= 0) {
            if (arg2 != 14) {
                method536(-127, -35, -107, -123, -6, -38, 49);
            }
            return class117.method787(arg0, -37, 10, arg1);
        } else {
            return Integer.toString(arg0);
        }
    }
}
