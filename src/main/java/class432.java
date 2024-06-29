import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class432 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Lfba;")
    public static class27 field5845 = new class27(89, 11);

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Z")
    public static boolean field5847 = true;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lbu;")
    public static class21 field5846 = new class21(78, 6);

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/awt/Frame;ILtd;)V")
    public static final void method2587(Frame arg0, int arg1, class477 arg2) {
        if (arg1 != -4286143) {
            return;
        }
        field5850++;
        while (true) {
            class141 var3 = arg2.method2840(arg0, (byte) -70);
            while (var3.field2089 == 0) {
                class107.method828(10L, (byte) -95);
            }
            if (var3.field2089 == 1) {
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class107.method828(100L, (byte) 91);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method2588(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field5848++;
        int var7 = class514.field7278;
        class193.field2973 = 0;
        int[] var8 = class522.field7381;
        if (arg5 != 20) {
            return;
        }
        for (int var9 = 0; var9 < class235.field3545 + var7; var9++) {
            class110 var37 = null;
            class330 var38;
            if (var9 < var7) {
                var38 = class767.field10560[var8[var9]];
            } else {
                var38 = ((class205) class645.field9014.method2242((long) class216.field3356[var9 - var7], -1)).field3181;
                var37 = ((class665) var38).field9240;
                if (var37.field1657 != null) {
                    var37 = var37.method840(class537.field7727, arg5 ^ 0x79);
                    if (var37 == null) {
                        continue;
                    }
                }
            }
            if (var38.field4610 >= 0 && (class746.field10346 == var38.field4612 || class210.field3250.field5755 == var38.field5755)) {
                class472.method2810(arg4 >> 1, arg1, arg3, var38.method2104((byte) -126), arg0 >> 1, 1981, var38);
                if (class470.field6591[0] >= 0) {
                    if (var38.field4635 != null && (var7 <= var9 || class13.field270 == 0 || class13.field270 == 3 || class13.field270 == 1 && class658.method3759(((class702) var38).field9768, true)) && class193.field2973 < class259.field3816) {
                        class259.field3812[class193.field2973] = class395.field5431.method41(var38.field4635, -124) / 2;
                        class259.field3817[class193.field2973] = class470.field6591[0];
                        class259.field3815[class193.field2973] = class470.field6591[1];
                        class259.field3819[class193.field2973] = var38.field4639;
                        class259.field3818[class193.field2973] = var38.field4606;
                        class259.field3814[class193.field2973] = var38.field4592;
                        class259.field3821[class193.field2973] = var38.field4635;
                        class193.field2973++;
                    }
                    int var39 = class470.field6591[1] + arg6;
                    int var50;
                    if (var38.field4577 || class192.field2961 >= var38.field4651) {
                        var50 = var39 - Math.max(class395.field5431.field64, class503.field7118[0].method1502());
                    } else {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var42;
                        if (var7 <= var9) {
                            var42 = var37.field1667;
                            if (var42 == -1) {
                                var42 = var38.method2096(arg5 ^ 0x14).field7747;
                            }
                        } else {
                            class702 var43 = class767.field10560[var8[var9]];
                            var42 = var38.method2096(0).field7747;
                            if (var43.field9767) {
                                var41 = 2;
                            }
                        }
                        class241[] var44 = class503.field7118;
                        if (var42 != -1) {
                            class241[] var45 = (class241[]) class386.field5353.method3742((byte) 67, (long) var42);
                            if (var45 == null) {
                                class1[] var46 = class1.method14(class152.field2163, var42, 0);
                                if (var46 != null) {
                                    var45 = new class241[var46.length];
                                    for (int var47 = 0; var47 < var46.length; var47++) {
                                        var45[var47] = class37.field491.method551(var46[var47], true);
                                    }
                                    class386.field5353.method3739((long) var42, (byte) 43, var45);
                                }
                            }
                            if (var45 != null && var45.length >= 2) {
                                var44 = var45;
                            }
                        }
                        if (var41 >= var44.length) {
                            var41 = 1;
                        }
                        class241 var48 = var44[0];
                        class241 var49 = var44[var41];
                        var50 = var39 - Math.max(class395.field5431.field64, var48.method1502());
                        int var51 = arg2 + class470.field6591[0] - (var48.method1508() >> 1);
                        int var52 = var48.method1508() * var38.field4613 / 255;
                        int var53 = var48.method1502();
                        if (var38.field4613 > 0 && var52 < 2) {
                            var52 = 2;
                        }
                        var48.method1604(var51, var50);
                        class37.field491.method453(var51, var50, var51 + var52, var50 - -var53);
                        var49.method1604(var51, var50);
                        class37.field491.method434(arg2, arg6, arg0 + arg2, arg4 + arg6);
                        class33.method272(var51, var50, var50 + var53, false, var48.method1507() + var51);
                    }
                    var50 -= 2;
                    if (!var38.field4577) {
                        if (class192.field2961 < var38.field4660) {
                            class241 var54 = class273.field3950[var38.field4637 ? 2 : 0];
                            class241 var55 = class273.field3950[var38.field4637 ? 3 : 1];
                            boolean var56 = true;
                            int var57;
                            if ((var38 instanceof class665)) {
                                var57 = var37.field1682;
                                if (var57 == -1) {
                                    var57 = var38.method2096(0).field7788;
                                }
                            } else {
                                var57 = var38.method2096(0).field7788;
                            }
                            if (var57 != -1) {
                                class241[] var58 = (class241[]) class284.field4192.method3742((byte) 67, (long) var57);
                                if (var58 == null) {
                                    class1[] var59 = class1.method14(class152.field2163, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class241[var59.length];
                                        for (int var60 = 0; var60 < var59.length; var60++) {
                                            var58[var60] = class37.field491.method551(var59[var60], true);
                                        }
                                        class284.field4192.method3739((long) var57, (byte) 97, var58);
                                    }
                                }
                                if (var58 != null && var58.length == 4) {
                                    var54 = var58[var38.field4637 ? 2 : 0];
                                    var55 = var58[var38.field4637 ? 3 : 1];
                                }
                            }
                            int var61 = var38.field4660 - class192.field2961;
                            int var64;
                            if (var38.field4596 < var61) {
                                int var62 = var61 - var38.field4596;
                                int var63 = var38.field4590 == 0 ? 0 : (var38.field4581 - var62) / var38.field4590 * var38.field4590;
                                var64 = var54.method1508() * var63 / var38.field4581;
                            } else {
                                var64 = var54.method1508();
                            }
                            int var65 = var54.method1502();
                            var50 -= var65;
                            int var66 = arg2 - ((var54.method1508() >> 1) - class470.field6591[0]);
                            var54.method1604(var66, var50);
                            class37.field491.method453(var66, var50, var64 + var66, var50 + var65);
                            var55.method1604(var66, var50);
                            class37.field491.method434(arg2, arg6, arg0 + arg2, arg6 - -arg4);
                            class33.method272(var66, var50, var50 + var65, false, var54.method1507() + var66);
                            var50 -= 2;
                        }
                        if (var7 > var9) {
                            class702 var67 = (class702) var38;
                            if (var67.field9781 != -1) {
                                var50 -= 25;
                                class241 var68 = class564.field8003[var67.field9781];
                                var68.method1604(class470.field6591[0] + arg2 - 12, var50);
                                class33.method272(class470.field6591[0] + arg2 - 12, var50, var50 + var68.method1505(), false, class470.field6591[0] + arg2 + var68.method1507() - 12);
                                var50 -= 2;
                            }
                            if (var67.field9776 != -1) {
                                var50 -= 25;
                                class241 var69 = class67.field822[var67.field9776];
                                var69.method1604(arg2 + class470.field6591[0] - 12, var50);
                                class33.method272(arg2 + class470.field6591[0] - 12, var50, var69.method1505() + var50, false, arg2 + class470.field6591[0] + var69.method1507() - 12);
                                var50 -= 2;
                            }
                        } else if (var37.field1661 >= 0 && var37.field1661 < class67.field822.length) {
                            class241 var70 = class67.field822[var37.field1661];
                            var50 -= 25;
                            var70.method1604(arg2 + class470.field6591[0] - (var70.method1508() >> 1), var50);
                            class33.method272(arg2 + (class470.field6591[0] - (var70.method1508() >> 1)), var50, var50 + var70.method1505(), false, arg2 + class470.field6591[0] - (var70.method1508() >> 1) + var70.method1507());
                            var50 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var38 instanceof class702)) {
                        int var71 = 0;
                        class589[] var72 = class693.field9665;
                        for (int var73 = 0; var73 < var72.length; var73++) {
                            class589 var75 = var72[var73];
                            if (var75 != null && var75.field8302 == 1 && class216.field3356[var9 - var7] == var75.field8307) {
                                class241 var76 = class454.field6372[var75.field8300];
                                if (var71 < var76.method1502()) {
                                    var71 = var76.method1502();
                                }
                                if (class192.field2961 % 20 < 10) {
                                    var76.method1604(arg2 + class470.field6591[0] - 12, var50 - var76.method1502());
                                    class33.method272(arg2 - (12 - class470.field6591[0]), var50 - var76.method1502(), var50 + (-var76.method1502() + var76.method1505()), false, class470.field6591[0] + arg2 + var76.method1507() - 12);
                                }
                            }
                        }
                        if (var71 > 0) {
                            var10000 = var50 - (var71 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var77 = 0;
                        class589[] var78 = class693.field9665;
                        for (int var79 = 0; var79 < var78.length; var79++) {
                            class589 var81 = var78[var79];
                            if (var81 != null && var81.field8302 == 10 && var8[var9] == var81.field8307) {
                                class241 var82 = class454.field6372[var81.field8300];
                                if (var77 < var82.method1502()) {
                                    var77 = var82.method1502();
                                }
                                var82.method1604(arg2 + class470.field6591[0] - 12, -var82.method1502() + var50);
                                class33.method272(arg2 + class470.field6591[0] - 12, -var82.method1502() + var50, var50 - var82.method1502() + var82.method1505(), false, class470.field6591[0] + arg2 + var82.method1507() - 12);
                            }
                        }
                        if (var77 > 0) {
                            var10000 = var50 - (var77 + 2);
                        }
                    }
                    for (int var83 = 0; var83 < class367.field5105; var83++) {
                        int var84 = var38.field4616[var83];
                        int var85 = var38.field4622[var83];
                        class674 var86 = null;
                        int var87 = 0;
                        if (var85 >= 0) {
                            if (class192.field2961 >= var84) {
                                continue;
                            }
                            var86 = class532.field7690.method1449(var38.field4622[var83], arg5 + 116);
                            var87 = var86.field9387;
                        } else if (var84 < 0) {
                            continue;
                        }
                        int var88 = var38.field4650[var83];
                        class674 var89 = null;
                        if (var88 >= 0) {
                            var89 = class532.field7690.method1449(var88, arg5 ^ 0x9C);
                        }
                        if (var84 - var87 <= class192.field2961) {
                            int var90 = var38.field4620[var83];
                            if (var90 >= 0) {
                                var38.field4651 = class192.field2961 + 300;
                                var38.field4613 = var90;
                                var38.field4620[var83] = -1;
                            }
                            if (var86 == null) {
                                var38.field4616[var83] = -1;
                            } else {
                                int var91 = var38.method2104((byte) -105) / 2;
                                class472.method2810(arg4 >> 1, arg1, arg3, var91, arg0 >> 1, 1981, var38);
                                if (class470.field6591[0] > -1) {
                                    class470.field6591[0] += class743.field10308[var83];
                                    class470.field6591[1] += class165.field2603[var83];
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
                                    class241 var104 = null;
                                    class241 var105 = null;
                                    class241 var106 = null;
                                    class241 var107 = null;
                                    int var108 = 0;
                                    int var109 = 0;
                                    int var110 = 0;
                                    int var111 = 0;
                                    int var112 = 0;
                                    int var113 = 0;
                                    int var114 = 0;
                                    int var115 = 0;
                                    int var116 = 0;
                                    class241 var117 = var86.method3829((byte) -68, class37.field491);
                                    if (var117 != null) {
                                        var96 = var117.method1508();
                                        int var118 = var117.method1502();
                                        var117.method1499(class67.field820);
                                        if (var116 < var118) {
                                            var116 = var118;
                                        }
                                        var100 = class67.field820[0];
                                    }
                                    class241 var119 = var86.method3830(126, class37.field491);
                                    if (var119 != null) {
                                        var97 = var119.method1508();
                                        int var120 = var119.method1502();
                                        if (var116 < var120) {
                                            var116 = var120;
                                        }
                                        var119.method1499(class67.field820);
                                        var101 = class67.field820[0];
                                    }
                                    class241 var121 = var86.method3833(class37.field491, (byte) -127);
                                    if (var121 != null) {
                                        var98 = var121.method1508();
                                        int var122 = var121.method1502();
                                        var121.method1499(class67.field820);
                                        if (var116 < var122) {
                                            var116 = var122;
                                        }
                                        var102 = class67.field820[0];
                                    }
                                    class241 var123 = var86.method3828(class37.field491, (byte) -83);
                                    if (var123 != null) {
                                        var99 = var123.method1508();
                                        int var124 = var123.method1502();
                                        var123.method1499(class67.field820);
                                        if (var124 > var116) {
                                            var116 = var124;
                                        }
                                        var103 = class67.field820[0];
                                    }
                                    if (var89 != null) {
                                        var104 = var89.method3829((byte) -80, class37.field491);
                                        if (var104 != null) {
                                            var108 = var104.method1508();
                                            int var125 = var104.method1502();
                                            var104.method1499(class67.field820);
                                            if (var116 < var125) {
                                                var116 = var125;
                                            }
                                            var112 = class67.field820[0];
                                        }
                                        var105 = var89.method3830(86, class37.field491);
                                        if (var105 != null) {
                                            var109 = var105.method1508();
                                            int var126 = var105.method1502();
                                            var105.method1499(class67.field820);
                                            if (var116 < var126) {
                                                var116 = var126;
                                            }
                                            var113 = class67.field820[0];
                                        }
                                        var106 = var89.method3833(class37.field491, (byte) -118);
                                        if (var106 != null) {
                                            var110 = var106.method1508();
                                            int var127 = var106.method1502();
                                            if (var127 > var116) {
                                                var116 = var127;
                                            }
                                            var106.method1499(class67.field820);
                                            var114 = class67.field820[0];
                                        }
                                        var107 = var89.method3828(class37.field491, (byte) -83);
                                        if (var107 != null) {
                                            var111 = var107.method1508();
                                            int var128 = var107.method1502();
                                            if (var116 < var128) {
                                                var116 = var128;
                                            }
                                            var107.method1499(class67.field820);
                                            var115 = class67.field820[0];
                                        }
                                    }
                                    class66 var129 = class718.field9945;
                                    class66 var130 = class718.field9945;
                                    class6 var131 = class460.field6446;
                                    class6 var132 = class460.field6446;
                                    int var133 = var86.field9383;
                                    if (var133 >= 0) {
                                        class66 var134 = class31.method256(var133, false, class37.field491, true);
                                        class6 var135 = class447.method2664(class37.field491, (byte) -124, var133);
                                        if (var134 != null && var135 != null) {
                                            var129 = var134;
                                            var131 = var135;
                                        }
                                    }
                                    if (var89 != null) {
                                        int var136 = var89.field9383;
                                        if (var136 >= 0) {
                                            class66 var137 = class31.method256(var136, false, class37.field491, true);
                                            class6 var138 = class447.method2664(class37.field491, (byte) -124, var136);
                                            if (var137 != null && var138 != null) {
                                                var130 = var137;
                                                var132 = var138;
                                            }
                                        }
                                    }
                                    Object var139 = null;
                                    String var140 = null;
                                    boolean var141 = false;
                                    String var142 = var86.method3838(var38.field4587[var83], arg5 ^ 0xFFFFFFEB);
                                    int var143 = 0;
                                    int var144 = var131.method41(var142, -109);
                                    if (var89 != null) {
                                        var140 = var89.method3838(var38.field4641[var83], arg5 ^ 0xFFFFFFEB);
                                        var143 = var132.method41(var140, -101);
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
                                        if (var109 > 0) {
                                            int var160 = var109 * var146;
                                            var159 = (var160 - var143) / 2 + var152;
                                            var152 += var160;
                                        } else {
                                            var152 += var143;
                                        }
                                        var158 = var152;
                                        if (var111 > 0) {
                                            var152 += var111;
                                        }
                                    }
                                    int var161 = var38.field4616[var83] - class192.field2961;
                                    int var162 = var86.field9386 - (var86.field9386 * var161 / var86.field9387);
                                    int var163 = var86.field9405 * var161 / var86.field9387 - var86.field9405;
                                    int var164 = class470.field6591[0] + arg2 + var162 - (var152 >> 1);
                                    int var165 = arg6 + var163 + class470.field6591[1] - 12;
                                    int var166 = var165;
                                    int var167 = var116 + var165;
                                    int var168 = var165 + var86.field9389 + 15;
                                    int var169 = var168 - var131.field64;
                                    if (var169 < var165) {
                                        var166 = var169;
                                    }
                                    int var170 = var131.field56 + var168;
                                    if (var170 > var167) {
                                        var167 = var170;
                                    }
                                    int var171 = 0;
                                    if (var89 != null) {
                                        var171 = var89.field9389 + var165 + 15;
                                        int var172 = var171 - var132.field64;
                                        int var173 = var171 + var132.field56;
                                        if (var172 < var166) {
                                            var166 = var172;
                                        }
                                        if (var173 > var167) {
                                            var167 = var173;
                                        }
                                    }
                                    int var174 = 255;
                                    if (var86.field9391 >= 0) {
                                        var174 = (var161 << 8) / (var86.field9387 - var86.field9391);
                                    }
                                    if (var174 >= 0 && var174 < 255) {
                                        int var175 = var174 << 24;
                                        int var176 = var175 | 0xFFFFFF;
                                        if (var117 != null) {
                                            var117.method364(var164 + var148 - var100, var165, 0, var176, 1);
                                        }
                                        if (var121 != null) {
                                            var121.method364(var149 + var164 - var102, var165, 0, var176, 1);
                                        }
                                        if (var119 != null) {
                                            for (int var177 = 0; var177 < var145; var177++) {
                                                var119.method364(var97 * var177 + var150 + var164 - var101, var165, 0, var176, 1);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method364(var164 + var154 - var103, var165, 0, var176, 1);
                                        }
                                        var129.method563(var142, (byte) 53, var86.field9404 | var175, 0, var168, var151 + var164);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method364(var155 + var164 - var112, var165, 0, var176, 1);
                                            }
                                            if (var106 != null) {
                                                var106.method364(var156 + var164 - var114, var165, 0, var176, 1);
                                            }
                                            if (var105 != null) {
                                                for (int var178 = 0; var178 < var146; var178++) {
                                                    var105.method364(var109 * var178 + var157 + var164 - var113, var165, 0, var176, 1);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method364(var164 + var158 - var115, var165, 0, var176, 1);
                                            }
                                            var130.method563(var140, (byte) 73, var175 | var89.field9404, 0, var171, var164 + var159);
                                        }
                                    } else {
                                        if (var117 != null) {
                                            var117.method1604(var148 + var164 - var100, var165);
                                        }
                                        if (var121 != null) {
                                            var121.method1604(var149 + var164 - var102, var165);
                                        }
                                        if (var119 != null) {
                                            for (int var179 = 0; var179 < var145; var179++) {
                                                var119.method1604(var97 * var179 + var150 + var164 - var101, var165);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method1604(var154 + var164 - var103, var165);
                                        }
                                        var129.method563(var142, (byte) -108, var86.field9404 | 0xFF000000, 0, var168, var151 + var164);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method1604(var155 + var164 - var112, var165);
                                            }
                                            if (var106 != null) {
                                                var106.method1604(var156 + var164 - var114, var165);
                                            }
                                            if (var105 != null) {
                                                for (int var180 = 0; var180 < var146; var180++) {
                                                    var105.method1604(var157 + (var109 * var180) + var164 - var113, var165);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method1604(var158 + var164 - var115, var165);
                                            }
                                            var130.method563(var140, (byte) 98, var89.field9404 | 0xFF000000, 0, var171, var159 + var164);
                                        }
                                    }
                                    class33.method272(var164, var166, var167 + 1, false, var152 + var164);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class367.field5103; var10++) {
            int var33 = class181.field2807[var10];
            class330 var34;
            if (var33 >= 2048) {
                var34 = ((class205) class645.field9014.method2242((long) (var33 - 2048), -1)).field3181;
            } else {
                var34 = class767.field10560[var33];
            }
            int var35 = class738.field10182[var10];
            class330 var36;
            if (var35 >= 2048) {
                var36 = ((class205) class645.field9014.method2242((long) (var35 - 2048), -1)).field3181;
            } else {
                var36 = class767.field10560[var35];
            }
            class474.method2816(var36, arg6, arg1, arg4, arg2, arg0, arg3, var34, --var34.field4588, arg5 ^ 0xFFFFB189);
        }
        int var11 = class395.field5431.field64 + class395.field5431.field56 + 2;
        for (int var12 = 0; var12 < class193.field2973; var12++) {
            int var13 = class259.field3817[var12];
            int var14 = class259.field3815[var12];
            int var15 = class259.field3812[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; var32 < var12; var32++) {
                    if ((class259.field3815[var32] - var11) < (var14 + 2) && (var14 - var11) < (class259.field3815[var32] + 2) && class259.field3817[var32] + class259.field3812[var32] > var13 - var15 && (class259.field3817[var32] - class259.field3812[var32]) < (var13 + var15) && (class259.field3815[var32] - var11) < var14) {
                        var14 = class259.field3815[var32] - var11;
                        var16 = true;
                    }
                }
            }
            class259.field3815[var12] = var14;
            String var17 = class259.field3821[var12];
            int var18 = class395.field5431.method41(var17, arg5 ^ 0xFFFFFF9B);
            int var19 = arg2 + var13;
            int var20 = arg6 + var14 - class395.field5431.field64;
            int var21 = var18 + var19;
            int var22 = arg6 + var14 + class395.field5431.field56;
            if (class28.field408 == 0) {
                int var23 = 16776960;
                if (class259.field3819[var12] < 6) {
                    var23 = class220.field3414[class259.field3819[var12]];
                }
                if (class259.field3819[var12] == 6) {
                    var23 = (class746.field10346 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class259.field3819[var12] == 7) {
                    var23 = class746.field10346 % 20 >= 10 ? 65535 : 255;
                }
                if (class259.field3819[var12] == 8) {
                    var23 = (class746.field10346 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class259.field3819[var12] == 9) {
                    int var24 = 150 - class259.field3814[var12];
                    if (var24 < 50) {
                        var23 = var24 * 1280 + 16711680;
                    } else if (var24 < 100) {
                        var23 = 16776960 + 16384000 - var24 * 327680;
                    } else if (var24 < 150) {
                        var23 = (var24 * 5) + 64780;
                    }
                }
                if (class259.field3819[var12] == 10) {
                    int var25 = 150 - class259.field3814[var12];
                    if (var25 < 50) {
                        var23 = var25 * 5 + 16711680;
                    } else if (var25 < 100) {
                        var23 = 16711935 - ((var25 - 50) * 327680);
                    } else if (var25 < 150) {
                        var23 = var25 * 327680 + 255 - (var25 - 100) * 5 - 32768000;
                    }
                }
                if (class259.field3819[var12] == 11) {
                    int var26 = 150 - class259.field3814[var12];
                    if (var26 < 50) {
                        var23 = 16777215 - (var26 * 327685);
                    } else if (var26 < 100) {
                        var23 = ((var26 - 50) * 327685) + 65280;
                    } else if (var26 < 150) {
                        var23 = 16777215 - ((var26 - 100) * 327680);
                    }
                }
                int var27 = var23 | 0xFF000000;
                if (class259.field3818[var12] == 0) {
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                    class269.field3907.method566(var17, var27, arg6 + var14, arg5 + -20, -16777216, arg2 + var13);
                }
                if (class259.field3818[var12] == 1) {
                    var19 -= var18 >> 1;
                    var22 += 5;
                    var21 -= var18 >> 1;
                    class269.field3907.method572(arg6 + var14, class746.field10346, (byte) 66, var27, var17, arg2 + var13, -16777216);
                    var20 -= 5;
                }
                if (class259.field3818[var12] == 2) {
                    var21 -= (var18 >> 1) - 5;
                    class269.field3907.method568(-16777216, class746.field10346, var27, -122, arg6 + var14, arg2 + var13, var17);
                    var19 -= (var18 >> 1) + 5;
                    var22 += 5;
                    var20 -= 5;
                }
                if (class259.field3818[var12] == 3) {
                    var22 += 7;
                    class269.field3907.method555(class746.field10346, var27, arg5 ^ 0xFFFFFF86, -16777216, arg2 + var13, var17, arg6 + var14, -class259.field3814[var12] + 150);
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                    var20 -= 7;
                }
                if (class259.field3818[var12] == 4) {
                    int var28 = (150 - class259.field3814[var12]) * (class395.field5431.method41(var17, -106) + 100) / 150;
                    class37.field491.method453(arg2 + var13 - 50, arg6, arg2 + var13 + 50, arg4 + arg6);
                    class269.field3907.method563(var17, (byte) 122, var27, -16777216, arg6 + var14, arg2 + var13 - -50 - var28);
                    var21 += 50 - var28;
                    var19 += 50 - var28;
                    class37.field491.method434(arg2, arg6, arg0 + arg2, arg6 - -arg4);
                }
                if (class259.field3818[var12] == 5) {
                    int var29 = 150 - class259.field3814[var12];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    int var31 = class395.field5431.field64 + class395.field5431.field56;
                    class37.field491.method453(arg2, var14 + arg6 - var31 - 1, arg0 + arg2, arg6 + var14 + 5);
                    var22 += var30;
                    var21 -= var18 >> 1;
                    class269.field3907.method566(var17, var27, var14 + var30 + arg6, 0, -16777216, arg2 + var13);
                    var19 -= var18 >> 1;
                    var20 += var30;
                    class37.field491.method434(arg2, arg6, arg2 + arg0, arg4 + arg6);
                }
            } else {
                class269.field3907.method566(var17, -256, arg6 + var14, arg5 ^ 0x14, -16777216, arg2 + var13);
                var21 -= var18 >> 1;
                var19 -= var18 >> 1;
            }
            class33.method272(var19, var20, var22 + 1, false, var21 + 1);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method2589(int arg0) {
        field5845 = null;
        if (arg0 != 3786) {
            method2587(null, -127, null);
        }
        field5846 = null;
    }
}
