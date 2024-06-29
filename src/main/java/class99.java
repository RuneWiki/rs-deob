import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class99 {

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "Lde;")
    private class534 field1377 = new class534(64);

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "Lnd;")
    private class547 field1375;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "Lsf;")
    public static class526 field1372 = new class526("", 17);

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "Lhm;")
    public static class223 field1381 = new class223(5, 1);

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BI)Ltea;", line = 8)
    public final class242 method791(byte arg0, int arg1) {
        field1374++;
        class534 var3 = this.field1377;
        class242 var5;
        synchronized (this.field1377) {
            int var4 = -42 / ((-arg0 - 17) / 60);
            var5 = (class242) this.field1377.method3079((long) arg1, 0);
        }
        if (var5 != null) {
            return var5;
        }
        class547 var6 = this.field1375;
        byte[] var7;
        synchronized (this.field1375) {
            var7 = this.field1375.method3153(arg1, 0, 11);
        }
        class242 var8 = new class242();
        if (var7 != null) {
            var8.method1514(new class461(var7), (byte) -76);
        }
        class534 var9 = this.field1377;
        synchronized (this.field1377) {
            this.field1377.method3077((byte) 101, (long) arg1, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V", line = 39)
    public final void method792(int arg0) {
        field1371++;
        class534 var2 = this.field1377;
        synchronized (this.field1377) {
            if (arg0 != 65280) {
                method793(106, -72, -9, -81, -75, 89, 115);
            }
            this.field1377.method3064(false);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIII)V", line = 52)
    public static final void method793(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1379++;
        int var7 = class416.field5303;
        int[] var8 = class657.field9155;
        class733.field10206 = 0;
        for (int var9 = 0; var9 < (class646.field8947 + var7); var9++) {
            class131 var37 = null;
            class13 var38;
            if (var7 > var9) {
                var38 = class5.field49[var8[var9]];
            } else {
                var38 = ((class592) class207.field2745.method1160((long) class751.field10483[var9 - var7], 121)).field8280;
                var37 = ((class733) var38).field10192;
                if (var37.field1899 != null) {
                    var37 = var37.method981(-116, class516.field7236);
                    if (var37 == null) {
                        continue;
                    }
                }
            }
            if (var38.field166 >= 0 && (class762.field10618 == var38.field230 || class380.field4847.field5796 == var38.field5796)) {
                class139.method1020(arg6, arg2 >> 1, true, arg4, var38.method78((byte) -128), var38, arg5 >> 1);
                if (class83.field1136[0] >= 0) {
                    if (var38.field214 != null && (var7 <= var9 || class356.field4574 == 0 || class356.field4574 == 3 || class356.field4574 == 1 && class329.method1907(0, ((class724) var38).field10062)) && class733.field10206 < class684.field9537) {
                        class684.field9531[class733.field10206] = class270.field3406.method1619(false, var38.field214) / 2;
                        class684.field9538[class733.field10206] = class83.field1136[0];
                        class684.field9527[class733.field10206] = class83.field1136[1];
                        class684.field9532[class733.field10206] = var38.field228;
                        class684.field9526[class733.field10206] = var38.field209;
                        class684.field9536[class733.field10206] = var38.field247;
                        class684.field9534[class733.field10206] = var38.field214;
                        class733.field10206++;
                    }
                    int var39 = arg3 + class83.field1136[1];
                    int var50;
                    if (var38.field206 || var38.field241 <= class463.field6224) {
                        var50 = var39 - Math.max(class270.field3406.field3432, class7.field81[0].method144());
                    } else {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var43;
                        if (var7 > var9) {
                            class724 var42 = class5.field49[var8[var9]];
                            var43 = var38.method94((byte) -122).field10288;
                            if (var42.field10074) {
                                var41 = 2;
                            }
                        } else {
                            var43 = var37.field1849;
                            if (var43 == -1) {
                                var43 = var38.method94((byte) -121).field10288;
                            }
                        }
                        class481[] var44 = class7.field81;
                        if (var43 != -1) {
                            class481[] var45 = (class481[]) class762.field10629.method3079((long) var43, 0);
                            if (var45 == null) {
                                class728[] var46 = class728.method4067(class268.field3369, var43, 0);
                                if (var46 != null) {
                                    var45 = new class481[var46.length];
                                    for (int var47 = 0; var47 < var46.length; var47++) {
                                        var45[var47] = class386.field4930.method508(var46[var47], true);
                                    }
                                    class762.field10629.method3077((byte) -98, (long) var43, var45);
                                }
                            }
                            if (var45 != null && var45.length >= 2) {
                                var44 = var45;
                            }
                        }
                        if (var44.length <= var41) {
                            var41 = 1;
                        }
                        class481 var48 = var44[0];
                        class481 var49 = var44[var41];
                        var50 = var39 - Math.max(class270.field3406.field3432, var48.method144());
                        int var51 = arg0 + class83.field1136[0] - (var48.method143() >> 1);
                        int var52 = var48.method143() * var38.field155 / 255;
                        int var53 = var48.method144();
                        if (var38.field155 > 0 && var52 < 2) {
                            var52 = 2;
                        }
                        var48.method2759(var51, var50);
                        class386.field4930.method525(var51, var50, var51 + var52, var50 - -var53);
                        var49.method2759(var51, var50);
                        class386.field4930.method534(arg0, arg3, arg0 + arg2, arg3 + arg5);
                        class236.method1478(-104, var50, var51 + var48.method142(), var51, var50 + var53);
                    }
                    var50 -= 2;
                    if (!var38.field206) {
                        if (var38.field196 > class463.field6224) {
                            class481 var54 = class721.field10039[var38.field170 ? 2 : 0];
                            class481 var55 = class721.field10039[var38.field170 ? 3 : 1];
                            boolean var56 = true;
                            int var57;
                            if ((var38 instanceof class733)) {
                                var57 = var37.field1887;
                                if (var57 == -1) {
                                    var57 = var38.method94((byte) 121).field10252;
                                }
                            } else {
                                var57 = var38.method94((byte) -115).field10252;
                            }
                            if (var57 != -1) {
                                class481[] var58 = (class481[]) class138.field1980.method3079((long) var57, 0);
                                if (var58 == null) {
                                    class728[] var59 = class728.method4067(class268.field3369, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class481[var59.length];
                                        for (int var60 = 0; var60 < var59.length; var60++) {
                                            var58[var60] = class386.field4930.method508(var59[var60], true);
                                        }
                                        class138.field1980.method3077((byte) 116, (long) var57, var58);
                                    }
                                }
                                if (var58 != null && var58.length == 4) {
                                    var55 = var58[var38.field170 ? 3 : 1];
                                    var54 = var58[var38.field170 ? 2 : 0];
                                }
                            }
                            int var61 = var38.field196 - class463.field6224;
                            int var64;
                            if (var61 > var38.field183) {
                                int var62 = var61 - var38.field183;
                                int var63 = var38.field224 == 0 ? 0 : (var38.field190 - var62) / var38.field224 * var38.field224;
                                var64 = var63 * var54.method143() / var38.field190;
                            } else {
                                var64 = var54.method143();
                            }
                            int var65 = var54.method144();
                            var50 -= var65;
                            int var66 = class83.field1136[0] + arg0 - (var54.method143() >> 1);
                            var54.method2759(var66, var50);
                            class386.field4930.method525(var66, var50, var64 + var66, var50 + var65);
                            var55.method2759(var66, var50);
                            class386.field4930.method534(arg0, arg3, arg0 + arg2, arg3 - -arg5);
                            class236.method1478(-121, var50, var66 + var54.method142(), var66, var50 + var65);
                            var50 -= 2;
                        }
                        if (var9 < var7) {
                            class724 var67 = (class724) var38;
                            if (var67.field10106 != -1) {
                                var50 -= 25;
                                class481 var68 = class154.field2100[var67.field10106];
                                var68.method2759(class83.field1136[0] + arg0 - 12, var50);
                                class236.method1478(99, var50, class83.field1136[0] + (arg0 + var68.method142() - 12), arg0 - (-class83.field1136[0] - -12), var68.method149() + var50);
                                var50 -= 2;
                            }
                            if (var67.field10105 != -1) {
                                var50 -= 25;
                                class481 var69 = class290.field3811[var67.field10105];
                                var69.method2759(arg0 + class83.field1136[0] - 12, var50);
                                class236.method1478(36, var50, class83.field1136[0] + arg0 + var69.method142() - 12, arg0 - (-class83.field1136[0] - -12), var50 + var69.method149());
                                var50 -= 2;
                            }
                        } else if (var37.field1896 >= 0 && class290.field3811.length > var37.field1896) {
                            var50 -= 25;
                            class481 var70 = class290.field3811[var37.field1896];
                            var70.method2759(class83.field1136[0] + arg0 - (var70.method143() >> 1), var50);
                            class236.method1478(-104, var50, class83.field1136[0] + arg0 - ((var70.method143() >> 1) - var70.method142()), class83.field1136[0] + arg0 - (var70.method143() >> 1), var70.method149() + var50);
                            var50 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var38 instanceof class724)) {
                        int var71 = 0;
                        class323[] var72 = class98.field1369;
                        for (int var73 = 0; var73 < var72.length; var73++) {
                            class323 var75 = var72[var73];
                            if (var75 != null && var75.field4163 == 1 && class751.field10483[var9 - var7] == var75.field4156) {
                                class481 var76 = class537.field7461[var75.field4155];
                                if (var76.method144() > var71) {
                                    var71 = var76.method144();
                                }
                                if ((class463.field6224 % 20) < 10) {
                                    var76.method2759(class83.field1136[0] + arg0 - 12, var50 + -var76.method144());
                                    class236.method1478(121, var50 - var76.method144(), class83.field1136[0] + arg0 + -12 - -var76.method142(), arg0 + class83.field1136[0] - 12, var50 - (var76.method144() + -var76.method149()));
                                }
                            }
                        }
                        if (var71 > 0) {
                            var10000 = var50 - (var71 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var77 = 0;
                        class323[] var78 = class98.field1369;
                        for (int var79 = 0; var79 < var78.length; var79++) {
                            class323 var81 = var78[var79];
                            if (var81 != null && var81.field4163 == 10 && var8[var9] == var81.field4156) {
                                class481 var82 = class537.field7461[var81.field4155];
                                if (var82.method144() > var77) {
                                    var77 = var82.method144();
                                }
                                var82.method2759(arg0 - (12 - class83.field1136[0]), var50 - var82.method144());
                                class236.method1478(-105, var50 - var82.method144(), class83.field1136[0] + arg0 + -12 - -var82.method142(), arg0 + class83.field1136[0] - 12, var50 - (var82.method144() + -var82.method149()));
                            }
                        }
                        if (var77 > 0) {
                            var10000 = var50 - (var77 + 2);
                        }
                    }
                    for (int var83 = 0; var83 < class729.field10150; var83++) {
                        int var84 = var38.field182[var83];
                        int var85 = var38.field211[var83];
                        class692 var86 = null;
                        int var87 = 0;
                        if (var85 >= 0) {
                            if (var84 <= class463.field6224) {
                                continue;
                            }
                            var86 = class555.field7728.method955(var38.field211[var83], 46);
                            var87 = var86.field9622;
                        } else if (var84 < 0) {
                            continue;
                        }
                        int var88 = var38.field203[var83];
                        class692 var89 = null;
                        if (var88 >= 0) {
                            var89 = class555.field7728.method955(var88, 46);
                        }
                        if (class463.field6224 >= (var84 - var87)) {
                            int var90 = var38.field179[var83];
                            if (var90 >= 0) {
                                var38.field155 = var90;
                                var38.field241 = class463.field6224 + 300;
                                var38.field179[var83] = -1;
                            }
                            if (var86 == null) {
                                var38.field182[var83] = -1;
                            } else {
                                int var91 = var38.method78((byte) 125) / 2;
                                class139.method1020(arg6, arg2 >> 1, true, arg4, var91, var38, arg5 >> 1);
                                if (class83.field1136[0] > -1) {
                                    class83.field1136[0] += class701.field9746[var83];
                                    class83.field1136[1] += class614.field8485[var83];
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
                                    class481 var104 = null;
                                    class481 var105 = null;
                                    class481 var106 = null;
                                    class481 var107 = null;
                                    int var108 = 0;
                                    int var109 = 0;
                                    int var110 = 0;
                                    int var111 = 0;
                                    int var112 = 0;
                                    int var113 = 0;
                                    int var114 = 0;
                                    int var115 = 0;
                                    class481 var116 = var86.method3872(-99, class386.field4930);
                                    int var117 = 0;
                                    if (var116 != null) {
                                        var96 = var116.method143();
                                        int var118 = var116.method144();
                                        var116.method152(class6.field56);
                                        if (var117 < var118) {
                                            var117 = var118;
                                        }
                                        var100 = class6.field56[0];
                                    }
                                    class481 var119 = var86.method3874(class386.field4930, -122);
                                    if (var119 != null) {
                                        var97 = var119.method143();
                                        int var120 = var119.method144();
                                        var119.method152(class6.field56);
                                        if (var117 < var120) {
                                            var117 = var120;
                                        }
                                        var101 = class6.field56[0];
                                    }
                                    class481 var121 = var86.method3875(8482, class386.field4930);
                                    if (var121 != null) {
                                        var98 = var121.method143();
                                        int var122 = var121.method144();
                                        if (var117 < var122) {
                                            var117 = var122;
                                        }
                                        var121.method152(class6.field56);
                                        var102 = class6.field56[0];
                                    }
                                    class481 var123 = var86.method3877(0, class386.field4930);
                                    if (var123 != null) {
                                        var99 = var123.method143();
                                        int var124 = var123.method144();
                                        if (var117 < var124) {
                                            var117 = var124;
                                        }
                                        var123.method152(class6.field56);
                                        var103 = class6.field56[0];
                                    }
                                    if (var89 != null) {
                                        var104 = var89.method3872(-111, class386.field4930);
                                        if (var104 != null) {
                                            var108 = var104.method143();
                                            int var125 = var104.method144();
                                            if (var125 > var117) {
                                                var117 = var125;
                                            }
                                            var104.method152(class6.field56);
                                            var112 = class6.field56[0];
                                        }
                                        var105 = var89.method3874(class386.field4930, -85);
                                        if (var105 != null) {
                                            var109 = var105.method143();
                                            int var126 = var105.method144();
                                            var105.method152(class6.field56);
                                            if (var117 < var126) {
                                                var117 = var126;
                                            }
                                            var113 = class6.field56[0];
                                        }
                                        var106 = var89.method3875(8482, class386.field4930);
                                        if (var106 != null) {
                                            var110 = var106.method143();
                                            int var127 = var106.method144();
                                            var106.method152(class6.field56);
                                            if (var127 > var117) {
                                                var117 = var127;
                                            }
                                            var114 = class6.field56[0];
                                        }
                                        var107 = var89.method3877(0, class386.field4930);
                                        if (var107 != null) {
                                            var111 = var107.method143();
                                            int var128 = var107.method144();
                                            var107.method152(class6.field56);
                                            if (var117 < var128) {
                                                var117 = var128;
                                            }
                                            var115 = class6.field56[0];
                                        }
                                    }
                                    class61 var129 = class164.field2272;
                                    class61 var130 = class164.field2272;
                                    class274 var131 = class165.field2306;
                                    class274 var132 = class165.field2306;
                                    int var133 = var86.field9621;
                                    if (var133 >= 0) {
                                        class61 var134 = class438.method2494(var133, -88, true, class386.field4930);
                                        class274 var135 = class229.method1459(var133, class386.field4930, -2);
                                        if (var134 != null && var135 != null) {
                                            var131 = var135;
                                            var129 = var134;
                                        }
                                    }
                                    if (var89 != null) {
                                        int var136 = var89.field9621;
                                        if (var136 >= 0) {
                                            class61 var137 = class438.method2494(var136, -23, true, class386.field4930);
                                            class274 var138 = class229.method1459(var136, class386.field4930, -2);
                                            if (var137 != null && var138 != null) {
                                                var132 = var138;
                                                var130 = var137;
                                            }
                                        }
                                    }
                                    Object var139 = null;
                                    String var140 = null;
                                    boolean var141 = false;
                                    int var142 = 0;
                                    String var143 = var86.method3876((byte) 54, var38.field169[var83]);
                                    int var144 = var131.method1619(false, var143);
                                    if (var89 != null) {
                                        var140 = var89.method3876((byte) 54, var38.field197[var83]);
                                        var142 = var132.method1619(false, var140);
                                    }
                                    int var145 = 0;
                                    if (var97 > 0) {
                                        var145 = var144 / var97 + 1;
                                    }
                                    int var146 = 0;
                                    if (var89 != null && var109 > 0) {
                                        var146 = var142 / var109 + 1;
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
                                    int var152;
                                    if (var97 <= 0) {
                                        var152 = var144 + var147;
                                    } else {
                                        int var153 = var97 * var145;
                                        var151 = (var153 - var144) / 2 + var147;
                                        var152 = var147 + var153;
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
                                        if (var110 > 0) {
                                            var152 += var110;
                                        }
                                        var159 = var152;
                                        var157 = var152;
                                        if (var109 <= 0) {
                                            var152 += var142;
                                        } else {
                                            int var160 = var109 * var146;
                                            var152 += var160;
                                            var159 += (var160 - var142) / 2;
                                        }
                                        var158 = var152;
                                        if (var111 > 0) {
                                            var152 += var111;
                                        }
                                    }
                                    int var161 = var38.field182[var83] - class463.field6224;
                                    int var162 = var86.field9617 - var86.field9617 * var161 / var86.field9622;
                                    int var163 = var86.field9620 * var161 / var86.field9622 - var86.field9620;
                                    int var164 = class83.field1136[0] + arg0 + var162 - (var152 >> 1);
                                    int var165 = arg3 + var163 + class83.field1136[1] - 12;
                                    int var166 = var165;
                                    int var167 = var165 + var117;
                                    int var168 = var86.field9619 + var165 + 15;
                                    int var169 = var168 - var131.field3432;
                                    if (var169 < var165) {
                                        var166 = var169;
                                    }
                                    int var170 = var168 + var131.field3434;
                                    if (var170 > var167) {
                                        var167 = var170;
                                    }
                                    int var171 = 0;
                                    if (var89 != null) {
                                        var171 = var165 + var89.field9619 + 15;
                                        int var172 = var171 - var132.field3432;
                                        if (var172 < var166) {
                                            var166 = var172;
                                        }
                                        int var173 = var171 + var132.field3434;
                                        if (var167 < var173) {
                                            var167 = var173;
                                        }
                                    }
                                    int var174 = 255;
                                    if (var86.field9609 >= 0) {
                                        var174 = (var161 << 8) / (var86.field9622 - var86.field9609);
                                    }
                                    if (var174 >= 0 && var174 < 255) {
                                        int var175 = var174 << 24;
                                        int var176 = var175 | 0xFFFFFF;
                                        if (var116 != null) {
                                            var116.method148(var164 + var148 - var100, var165, 0, var176, 1);
                                        }
                                        if (var121 != null) {
                                            var121.method148(var149 + var164 - var102, var165, 0, var176, 1);
                                        }
                                        if (var119 != null) {
                                            for (int var177 = 0; var177 < var145; var177++) {
                                                var119.method148(var150 + var164 - (var101 - var97 * var177), var165, 0, var176, 1);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method148(var164 + var154 - var103, var165, 0, var176, 1);
                                        }
                                        var129.method555(var175 | var86.field9599, var143, 0, 0, var151 + var164, var168);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method148(var155 + var164 - var112, var165, 0, var176, 1);
                                            }
                                            if (var106 != null) {
                                                var106.method148(var156 + var164 - var114, var165, 0, var176, 1);
                                            }
                                            if (var105 != null) {
                                                for (int var178 = 0; var178 < var146; var178++) {
                                                    var105.method148(var157 + var164 + (var109 * var178) - var113, var165, 0, var176, 1);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method148(var158 + var164 - var115, var165, 0, var176, 1);
                                            }
                                            var130.method555(var175 | var89.field9599, var140, 0, 0, var159 + var164, var171);
                                        }
                                    } else {
                                        if (var116 != null) {
                                            var116.method2759(var164 - (var100 - var148), var165);
                                        }
                                        if (var121 != null) {
                                            var121.method2759(var149 + var164 - var102, var165);
                                        }
                                        if (var119 != null) {
                                            for (int var179 = 0; var179 < var145; var179++) {
                                                var119.method2759(var97 * var179 + var164 + var150 - var101, var165);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method2759(var154 + var164 - var103, var165);
                                        }
                                        var129.method555(var86.field9599 | 0xFF000000, var143, 0, 0, var164 + var151, var168);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method2759(var164 + var155 - var112, var165);
                                            }
                                            if (var106 != null) {
                                                var106.method2759(var164 - (var114 - var156), var165);
                                            }
                                            if (var105 != null) {
                                                for (int var180 = 0; var180 < var146; var180++) {
                                                    var105.method2759(var109 * var180 + var157 + var164 - var113, var165);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method2759(var158 + var164 - var115, var165);
                                            }
                                            var130.method555(var89.field9599 | 0xFF000000, var140, 0, 0, var159 + var164, var171);
                                        }
                                    }
                                    class236.method1478(39, var166, var152 + var164, var164, var167 + 1);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class197.field2687; var10++) {
            int var33 = class6.field64[var10];
            class13 var34;
            if (var33 >= 2048) {
                var34 = ((class592) class207.field2745.method1160((long) (var33 - 2048), 123)).field8280;
            } else {
                var34 = class5.field49[var33];
            }
            int var35 = class484.field6932[var10];
            class13 var36;
            if (var35 >= 2048) {
                var36 = ((class592) class207.field2745.method1160((long) (var35 - 2048), 123)).field8280;
            } else {
                var36 = class5.field49[var35];
            }
            class531.method3051(var34, arg2, var36, arg3, arg4, arg6, arg0, arg5, --var34.field227, true);
        }
        int var11 = class270.field3406.field3434 + class270.field3406.field3432 + 2;
        for (int var12 = 0; var12 < class733.field10206; var12++) {
            int var13 = class684.field9538[var12];
            int var14 = class684.field9527[var12];
            int var15 = class684.field9531[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; var32 < var12; var32++) {
                    if ((class684.field9527[var32] - var11) < (var14 + 2) && (class684.field9527[var32] + 2) > (var14 - var11) && var13 - var15 < class684.field9538[var32] + class684.field9531[var32] && class684.field9538[var32] - class684.field9531[var32] < var13 - -var15 && class684.field9527[var32] - var11 < var14) {
                        var14 = class684.field9527[var32] - var11;
                        var16 = true;
                    }
                }
            }
            class684.field9527[var12] = var14;
            String var17 = class684.field9534[var12];
            int var18 = class270.field3406.method1619(false, var17);
            int var19 = arg0 + var13;
            int var20 = arg3 + var14 - class270.field3406.field3432;
            int var21 = var19 + var18;
            int var22 = arg3 + var14 + class270.field3406.field3434;
            if (class558.field7756 == 0) {
                int var23 = 16776960;
                if (class684.field9532[var12] < 6) {
                    var23 = class378.field4833[class684.field9532[var12]];
                }
                if (class684.field9532[var12] == 6) {
                    var23 = (class762.field10618 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class684.field9532[var12] == 7) {
                    var23 = (class762.field10618 % 20) < 10 ? 255 : 65535;
                }
                if (class684.field9532[var12] == 8) {
                    var23 = class762.field10618 % 20 < 10 ? 45056 : 8454016;
                }
                if (class684.field9532[var12] == 9) {
                    int var24 = 150 - class684.field9536[var12];
                    if (var24 < 50) {
                        var23 = var24 * 1280 + 16711680;
                    } else if (var24 < 100) {
                        var23 = 33160960 - var24 * 327680;
                    } else if (var24 < 150) {
                        var23 = var24 * 5 + 65280 - 500;
                    }
                }
                if (class684.field9532[var12] == 10) {
                    int var25 = 150 - class684.field9536[var12];
                    if (var25 < 50) {
                        var23 = var25 * 5 + 16711680;
                    } else if (var25 < 100) {
                        var23 = 16711935 - ((var25 - 50) * 327680);
                    } else if (var25 < 150) {
                        var23 = 255 - (var25 * 5) - (-(var25 * 327680 - 32768000) - 500);
                    }
                }
                if (class684.field9532[var12] == 11) {
                    int var26 = 150 - class684.field9536[var12];
                    if (var26 < 50) {
                        var23 = 16777215 - (var26 * 327685);
                    } else if (var26 < 100) {
                        var23 = (var26 - 50) * 327685 + 65280;
                    } else if (var26 < 150) {
                        var23 = 16777215 - (var26 - 100) * 327680;
                    }
                }
                int var27 = var23 | 0xFF000000;
                if (class684.field9526[var12] == 0) {
                    var21 -= var18 >> 1;
                    class242.field3132.method563(arg0 + var13, -16777216, -123, var27, arg3 + var14, var17);
                    var19 -= var18 >> 1;
                }
                if (class684.field9526[var12] == 1) {
                    var19 -= var18 >> 1;
                    var22 += 5;
                    var21 -= var18 >> 1;
                    class242.field3132.method572(-1, arg0 + var13, var27, class762.field10618, -16777216, var17, arg3 + var14);
                    var20 -= 5;
                }
                if (class684.field9526[var12] == 2) {
                    var21 -= (var18 >> 1) - 5;
                    class242.field3132.method567(-16777216, arg3 + var14, var27, class762.field10618, arg0 + var13, var17, -83);
                    var20 -= 5;
                    var22 += 5;
                    var19 -= (var18 >> 1) + 5;
                }
                if (class684.field9526[var12] == 3) {
                    var21 -= var18 >> 1;
                    var20 -= 7;
                    class242.field3132.method569(arg3 + var14, var27, -6525, -16777216, var17, 150 - class684.field9536[var12], class762.field10618, arg0 + var13);
                    var22 += 7;
                    var19 -= var18 >> 1;
                }
                if (class684.field9526[var12] == 4) {
                    int var28 = (150 - class684.field9536[var12]) * (class270.field3406.method1619(false, var17) + 100) / 150;
                    class386.field4930.method525(arg0 + var13 - 50, arg3, arg0 + var13 + 50, arg3 + arg5);
                    var21 += 50 - var28;
                    var19 += 50 - var28;
                    class242.field3132.method555(var27, var17, 0, -16777216, arg0 + var13 + 50 - var28, arg3 + var14);
                    class386.field4930.method534(arg0, arg3, arg0 + arg2, arg3 - -arg5);
                }
                if (class684.field9526[var12] == 5) {
                    int var29 = 150 - class684.field9536[var12];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    int var31 = class270.field3406.field3434 + class270.field3406.field3432;
                    class386.field4930.method525(arg0, var14 + arg3 - var31 - 1, arg0 - -arg2, arg3 + var14 + 5);
                    var21 -= var18 >> 1;
                    var22 += var30;
                    class242.field3132.method563(arg0 + var13, -16777216, -124, var27, arg3 - (-var14 - var30), var17);
                    var19 -= var18 >> 1;
                    var20 += var30;
                    class386.field4930.method534(arg0, arg3, arg0 + arg2, arg3 + arg5);
                }
            } else {
                var21 -= var18 >> 1;
                var19 -= var18 >> 1;
                class242.field3132.method563(arg0 + var13, -16777216, 109, -256, arg3 + var14, var17);
            }
            class236.method1478(-121, var20, var21 + 1, var19, var22 + 1);
        }
        if (arg1 <= 119) {
            field1381 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lal;ILnd;)V", line = 1274)
    public class99(class102 arg0, int arg1, class547 arg2) {
        this.field1375 = arg2;
        if (this.field1375 != null) {
            this.field1375.method3178((byte) 64, 11);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIBI)V", line = 1217)
    public static final void method794(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if ((arg4 - arg0) >= class667.field9373 && class225.field2994 >= (arg0 + arg4) && class546.field7619 <= (arg1 - arg0) && arg0 + arg1 <= class760.field10606) {
            class196.method1301(arg4, arg1, -106, arg2, arg0);
        } else {
            class723.method4034(arg1, arg0, true, arg4, arg2);
        }
        int var5 = -93 / ((arg3 + 62) / 43);
        field1376++;
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V", line = 1235)
    public static void method795(int arg0) {
        field1381 = null;
        field1372 = null;
        if (arg0 >= -105) {
            field1372 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V", line = 1247)
    public final void method796(byte arg0) {
        if (arg0 != -32) {
            return;
        }
        field1378++;
        class534 var2 = this.field1377;
        synchronized (this.field1377) {
            this.field1377.method3065(true);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)Z", line = 1260)
    public static final boolean method797(int arg0, int arg1, int arg2) {
        field1380++;
        if (arg2 >= 0 && arg0 >= 0 && class305.field4001[1].length > arg2 && arg0 < class305.field4001[1][arg2].length) {
            return (class305.field4001[arg1][arg2][arg0] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)V", line = 1297)
    public final void method798(int arg0, int arg1) {
        field1373++;
        class534 var3 = this.field1377;
        synchronized (this.field1377) {
            this.field1377.method3070(arg1, 125);
            int var4 = -50 / ((arg0 - 37) / 57);
        }
    }
}
