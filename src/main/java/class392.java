import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public class class392 extends class387 {

    @OriginalMember(owner = "client!gka", name = "i", descriptor = "J")
    public static long field5078 = 20000000L;

    @OriginalMember(owner = "client!gka", name = "j", descriptor = "[I")
    public static int[] field5079 = new int[4096];

    @OriginalMember(owner = "client!gka", name = "l", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!gka", name = "m", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!gka", name = "n", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!gka", name = "k", descriptor = "Lbt;")
    public static class48 field5080;

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method2297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5082++;
        int var7 = -127 / ((arg3 + 17) / 48);
        int var8 = class235.field2787;
        class149.field1862 = 0;
        int[] var9 = class75.field1040;
        for (int var10 = 0; var10 < (class3.field42 + var8); var10++) {
            class479 var38 = null;
            class287 var39;
            if (var10 >= var8) {
                var39 = ((class273) class30.field444.method2121(119, (long) class2.field29[var10 - var8])).field3210;
                var38 = ((class388) var39).field5003;
                if (var38.field6636 != null) {
                    var38 = var38.method2843(class2.field30, 228);
                    if (var38 == null) {
                        continue;
                    }
                }
            } else {
                var39 = class61.field825[var9[var10]];
            }
            if (var39.field3374 >= 0 && (class471.field6571 == var39.field3389 || class300.field3596.field808 == var39.field808)) {
                class357.method2092(-7087, arg2 >> 1, arg4, arg5 >> 1, var39, var39.method1671(false), arg0);
                if (class123.field1576[0] >= 0) {
                    if (var39.field3381 != null && (var8 <= var10 || class8.field136 == 0 || class8.field136 == 3 || class8.field136 == 1 && class281.method1622(((class521) var39).field7399, 46)) && class149.field1862 < class729.field10219) {
                        class729.field10217[class149.field1862] = class332.field4108.method1819(var39.field3381, (byte) -30) / 2;
                        class729.field10222[class149.field1862] = class123.field1576[0];
                        class729.field10218[class149.field1862] = class123.field1576[1];
                        class729.field10225[class149.field1862] = var39.field3384;
                        class729.field10212[class149.field1862] = var39.field3432;
                        class729.field10213[class149.field1862] = var39.field3437;
                        class729.field10215[class149.field1862] = var39.field3381;
                        class149.field1862++;
                    }
                    int var40 = arg1 + class123.field1576[1];
                    int var51;
                    if (var39.field3363 || var39.field3445 <= class228.field2707) {
                        var51 = var40 - Math.max(class332.field4108.field3773, class215.field2533[0].method1637());
                    } else {
                        boolean var41 = true;
                        byte var42 = 1;
                        int var43;
                        if (var10 >= var8) {
                            var43 = var38.field6697;
                            if (var43 == -1) {
                                var43 = var39.method1676(0).field269;
                            }
                        } else {
                            class521 var44 = class61.field825[var9[var10]];
                            var43 = var39.method1676(0).field269;
                            if (var44.field7356) {
                                var42 = 2;
                            }
                        }
                        class312[] var45 = class215.field2533;
                        if (var43 != -1) {
                            class312[] var46 = (class312[]) class629.field8596.method1684((long) var43, -359);
                            if (var46 == null) {
                                class600[] var47 = class600.method3418(class208.field2470, var43, 0);
                                if (var47 != null) {
                                    var46 = new class312[var47.length];
                                    for (int var48 = 0; var48 < var47.length; var48++) {
                                        var46[var48] = class363.field4526.method640(var47[var48], true);
                                    }
                                    class629.field8596.method1686(-25638, (long) var43, var46);
                                }
                            }
                            if (var46 != null && var46.length >= 2) {
                                var45 = var46;
                            }
                        }
                        if (var45.length <= var42) {
                            var42 = 1;
                        }
                        class312 var49 = var45[0];
                        class312 var50 = var45[var42];
                        var51 = var40 - Math.max(class332.field4108.field3773, var49.method1637());
                        int var52 = class123.field1576[0] + arg6 - (var49.method1640() >> 1);
                        int var53 = var49.method1640() * var39.field3424 / 255;
                        int var54 = var49.method1637();
                        if (var39.field3424 > 0 && var53 < 2) {
                            var53 = 2;
                        }
                        var49.method1838(var52, var51);
                        class363.field4526.method607(var52, var51, var52 + var53, var51 + var54);
                        var50.method1838(var52, var51);
                        class363.field4526.method556(arg6, arg1, arg5 + arg6, arg1 - -arg2);
                        class326.method1945(var51, var49.method1634() + var52, var52, var51 + var54, false);
                    }
                    var51 -= 2;
                    if (!var39.field3363) {
                        if (var39.field3379 > class228.field2707) {
                            class312 var55 = class229.field2712[var39.field3371 ? 2 : 0];
                            class312 var56 = class229.field2712[var39.field3371 ? 3 : 1];
                            boolean var57 = true;
                            int var58;
                            if (var39 instanceof class388) {
                                var58 = var38.field6643;
                                if (var58 == -1) {
                                    var58 = var39.method1676(0).field267;
                                }
                            } else {
                                var58 = var39.method1676(0).field267;
                            }
                            if (var58 != -1) {
                                class312[] var59 = (class312[]) class303.field3617.method1684((long) var58, -359);
                                if (var59 == null) {
                                    class600[] var60 = class600.method3418(class208.field2470, var58, 0);
                                    if (var60 != null) {
                                        var59 = new class312[var60.length];
                                        for (int var61 = 0; var61 < var60.length; var61++) {
                                            var59[var61] = class363.field4526.method640(var60[var61], true);
                                        }
                                        class303.field3617.method1686(-25638, (long) var58, var59);
                                    }
                                }
                                if (var59 != null && var59.length == 4) {
                                    var55 = var59[var39.field3371 ? 2 : 0];
                                    var56 = var59[var39.field3371 ? 3 : 1];
                                }
                            }
                            int var62 = var39.field3379 - class228.field2707;
                            int var65;
                            if (var62 > var39.field3411) {
                                int var63 = var62 - var39.field3411;
                                int var64 = var39.field3441 == 0 ? 0 : (var39.field3362 - var63) / var39.field3441 * var39.field3441;
                                var65 = var55.method1640() * var64 / var39.field3362;
                            } else {
                                var65 = var55.method1640();
                            }
                            int var66 = var55.method1637();
                            var51 -= var66;
                            int var67 = class123.field1576[0] + arg6 - (var55.method1640() >> 1);
                            var55.method1838(var67, var51);
                            class363.field4526.method607(var67, var51, var67 + var65, var51 - -var66);
                            var56.method1838(var67, var51);
                            class363.field4526.method556(arg6, arg1, arg5 + arg6, arg1 - -arg2);
                            class326.method1945(var51, var67 + var55.method1634(), var67, var51 + var66, false);
                            var51 -= 2;
                        }
                        if (var10 < var8) {
                            class521 var69 = (class521) var39;
                            if (var69.field7385 != -1) {
                                var51 -= 25;
                                class312 var70 = class342.field4291[var69.field7385];
                                var70.method1838(arg6 + class123.field1576[0] - 12, var51);
                                class326.method1945(var51, class123.field1576[0] + arg6 + var70.method1634() - 12, class123.field1576[0] + -12 + arg6, var70.method1636() + var51, false);
                                var51 -= 2;
                            }
                            if (var69.field7359 != -1) {
                                var51 -= 25;
                                class312 var71 = class636.field8668[var69.field7359];
                                var71.method1838(arg6 + class123.field1576[0] - 12, var51);
                                class326.method1945(var51, class123.field1576[0] + arg6 + var71.method1634() - 12, class123.field1576[0] + -12 + arg6, var71.method1636() + var51, false);
                                var51 -= 2;
                            }
                        } else if (var38.field6694 >= 0 && class636.field8668.length > var38.field6694) {
                            var51 -= 25;
                            class312 var68 = class636.field8668[var38.field6694];
                            var68.method1838(class123.field1576[0] + arg6 - (var68.method1640() >> 1), var51);
                            class326.method1945(var51, class123.field1576[0] + arg6 - (var68.method1640() >> 1) + var68.method1634(), arg6 + class123.field1576[0] + -(var68.method1640() >> 1), var51 + var68.method1636(), false);
                            var51 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var39 instanceof class521)) {
                        int var72 = 0;
                        class615[] var73 = class56.field756;
                        for (int var74 = 0; var74 < var73.length; var74++) {
                            class615 var76 = var73[var74];
                            if (var76 != null && var76.field8259 == 1 && class2.field29[var10 - var8] == var76.field8258) {
                                class312 var77 = class535.field7535[var76.field8264];
                                if (var77.method1637() > var72) {
                                    var72 = var77.method1637();
                                }
                                if ((class228.field2707 % 20) < 10) {
                                    var77.method1838(arg6 - (12 - class123.field1576[0]), -var77.method1637() + var51);
                                    class326.method1945(var51 - var77.method1637(), class123.field1576[0] + -12 + arg6 + var77.method1634(), arg6 + class123.field1576[0] - 12, var51 + -var77.method1637() + var77.method1636(), false);
                                }
                            }
                        }
                        if (var72 > 0) {
                            var10000 = var51 - (var72 + 2);
                        }
                    } else if (var10 >= 0) {
                        int var78 = 0;
                        class615[] var79 = class56.field756;
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            class615 var82 = var79[var80];
                            if (var82 != null && var82.field8259 == 10 && var9[var10] == var82.field8258) {
                                class312 var83 = class535.field7535[var82.field8264];
                                if (var83.method1637() > var78) {
                                    var78 = var83.method1637();
                                }
                                var83.method1838(arg6 + class123.field1576[0] - 12, var51 + -var83.method1637());
                                class326.method1945(var51 - var83.method1637(), arg6 + class123.field1576[0] + -12 + var83.method1634(), class123.field1576[0] + arg6 - 12, var51 + -var83.method1637() + var83.method1636(), false);
                            }
                        }
                        if (var78 > 0) {
                            var10000 = var51 - (var78 + 2);
                        }
                    }
                    for (int var84 = 0; var84 < class606.field8163; var84++) {
                        int var85 = var39.field3391[var84];
                        int var86 = var39.field3438[var84];
                        class552 var87 = null;
                        int var88 = 0;
                        if (var86 >= 0) {
                            if (var85 <= class228.field2707) {
                                continue;
                            }
                            var87 = class607.field8173.method2831(10248, var39.field3438[var84]);
                            var88 = var87.field7681;
                        } else if (var85 < 0) {
                            continue;
                        }
                        int var89 = var39.field3412[var84];
                        class552 var90 = null;
                        if (var89 >= 0) {
                            var90 = class607.field8173.method2831(10248, var89);
                        }
                        if (class228.field2707 >= var85 - var88) {
                            int var91 = var39.field3358[var84];
                            if (var91 >= 0) {
                                var39.field3424 = var91;
                                var39.field3445 = class228.field2707 + 300;
                                var39.field3358[var84] = -1;
                            }
                            if (var87 == null) {
                                var39.field3391[var84] = -1;
                            } else {
                                int var92 = var39.method1671(false) / 2;
                                class357.method2092(-7087, arg2 >> 1, arg4, arg5 >> 1, var39, var92, arg0);
                                if (class123.field1576[0] > -1) {
                                    class123.field1576[0] += class355.field4407[var84];
                                    class123.field1576[1] += class204.field2442[var84];
                                    Object var93 = null;
                                    Object var94 = null;
                                    Object var95 = null;
                                    Object var96 = null;
                                    int var97 = 0;
                                    int var98 = 0;
                                    int var99 = 0;
                                    int var100 = 0;
                                    int var101 = 0;
                                    int var102 = 0;
                                    int var103 = 0;
                                    int var104 = 0;
                                    class312 var105 = null;
                                    class312 var106 = null;
                                    class312 var107 = null;
                                    class312 var108 = null;
                                    int var109 = 0;
                                    int var110 = 0;
                                    int var111 = 0;
                                    int var112 = 0;
                                    int var113 = 0;
                                    int var114 = 0;
                                    int var115 = 0;
                                    int var116 = 0;
                                    int var117 = 0;
                                    class312 var118 = var87.method3242((byte) -118, class363.field4526);
                                    if (var118 != null) {
                                        var97 = var118.method1640();
                                        int var119 = var118.method1637();
                                        if (var119 > var117) {
                                            var117 = var119;
                                        }
                                        var118.method1633(class330.field4088);
                                        var101 = class330.field4088[0];
                                    }
                                    class312 var120 = var87.method3238(class363.field4526, -1);
                                    if (var120 != null) {
                                        var98 = var120.method1640();
                                        int var121 = var120.method1637();
                                        if (var117 < var121) {
                                            var117 = var121;
                                        }
                                        var120.method1633(class330.field4088);
                                        var102 = class330.field4088[0];
                                    }
                                    class312 var122 = var87.method3243(class363.field4526, -1);
                                    if (var122 != null) {
                                        var99 = var122.method1640();
                                        int var123 = var122.method1637();
                                        var122.method1633(class330.field4088);
                                        if (var117 < var123) {
                                            var117 = var123;
                                        }
                                        var103 = class330.field4088[0];
                                    }
                                    class312 var124 = var87.method3241(-125, class363.field4526);
                                    if (var124 != null) {
                                        var100 = var124.method1640();
                                        int var125 = var124.method1637();
                                        var124.method1633(class330.field4088);
                                        if (var125 > var117) {
                                            var117 = var125;
                                        }
                                        var104 = class330.field4088[0];
                                    }
                                    if (var90 != null) {
                                        var105 = var90.method3242((byte) -123, class363.field4526);
                                        if (var105 != null) {
                                            var109 = var105.method1640();
                                            int var126 = var105.method1637();
                                            var105.method1633(class330.field4088);
                                            if (var117 < var126) {
                                                var117 = var126;
                                            }
                                            var113 = class330.field4088[0];
                                        }
                                        var106 = var90.method3238(class363.field4526, -1);
                                        if (var106 != null) {
                                            var110 = var106.method1640();
                                            int var127 = var106.method1637();
                                            if (var117 < var127) {
                                                var117 = var127;
                                            }
                                            var106.method1633(class330.field4088);
                                            var114 = class330.field4088[0];
                                        }
                                        var107 = var90.method3243(class363.field4526, -1);
                                        if (var107 != null) {
                                            var111 = var107.method1640();
                                            int var128 = var107.method1637();
                                            if (var117 < var128) {
                                                var117 = var128;
                                            }
                                            var107.method1633(class330.field4088);
                                            var115 = class330.field4088[0];
                                        }
                                        var108 = var90.method3241(-109, class363.field4526);
                                        if (var108 != null) {
                                            var112 = var108.method1640();
                                            int var129 = var108.method1637();
                                            if (var129 > var117) {
                                                var117 = var129;
                                            }
                                            var108.method1633(class330.field4088);
                                            var116 = class330.field4088[0];
                                        }
                                    }
                                    class67 var130 = class145.field1820;
                                    class67 var131 = class145.field1820;
                                    class307 var132 = class620.field8388;
                                    class307 var133 = class620.field8388;
                                    int var134 = var87.field7671;
                                    if (var134 >= 0) {
                                        class67 var135 = class241.method1455(true, var134, class363.field4526, 500);
                                        class307 var136 = class109.method879(var134, -24247, class363.field4526);
                                        if (var135 != null && var136 != null) {
                                            var132 = var136;
                                            var130 = var135;
                                        }
                                    }
                                    if (var90 != null) {
                                        int var137 = var90.field7671;
                                        if (var137 >= 0) {
                                            class67 var138 = class241.method1455(true, var137, class363.field4526, 500);
                                            class307 var139 = class109.method879(var137, -24247, class363.field4526);
                                            if (var138 != null && var139 != null) {
                                                var131 = var138;
                                                var133 = var139;
                                            }
                                        }
                                    }
                                    Object var140 = null;
                                    String var141 = null;
                                    boolean var142 = false;
                                    int var143 = 0;
                                    String var144 = var87.method3240(var39.field3408[var84], false);
                                    int var145 = var132.method1819(var144, (byte) -97);
                                    if (var90 != null) {
                                        var141 = var90.method3240(var39.field3417[var84], false);
                                        var143 = var133.method1819(var141, (byte) 112);
                                    }
                                    int var146 = 0;
                                    if (var98 > 0) {
                                        var146 = var145 / var98 + 1;
                                    }
                                    int var147 = 0;
                                    if (var90 != null && var110 > 0) {
                                        var147 = var143 / var110 + 1;
                                    }
                                    int var148 = 0;
                                    int var149 = var148;
                                    if (var97 > 0) {
                                        var148 += var97;
                                    }
                                    var148 += 2;
                                    int var150 = var148;
                                    if (var99 > 0) {
                                        var148 += var99;
                                    }
                                    int var151 = var148;
                                    int var152 = var148;
                                    int var154;
                                    if (var98 > 0) {
                                        int var153 = var98 * var146;
                                        var152 = (var153 - var145) / 2 + var148;
                                        var154 = var148 + var153;
                                    } else {
                                        var154 = var145 + var148;
                                    }
                                    int var155 = var154;
                                    if (var100 > 0) {
                                        var154 += var100;
                                    }
                                    int var156 = 0;
                                    int var157 = 0;
                                    int var158 = 0;
                                    int var159 = 0;
                                    int var160 = 0;
                                    if (var90 != null) {
                                        var154 += 2;
                                        var156 = var154;
                                        if (var109 > 0) {
                                            var154 += var109;
                                        }
                                        var154 += 2;
                                        var157 = var154;
                                        if (var111 > 0) {
                                            var154 += var111;
                                        }
                                        var158 = var154;
                                        var160 = var154;
                                        if (var110 <= 0) {
                                            var154 += var143;
                                        } else {
                                            int var161 = var110 * var147;
                                            var160 = (var161 - var143) / 2 + var154;
                                            var154 += var161;
                                        }
                                        var159 = var154;
                                        if (var112 > 0) {
                                            var154 += var112;
                                        }
                                    }
                                    int var162 = var39.field3391[var84] - class228.field2707;
                                    int var163 = var87.field7685 - (var87.field7685 * var162 / var87.field7681);
                                    int var164 = var87.field7672 * var162 / var87.field7681 - var87.field7672;
                                    int var165 = class123.field1576[0] + var163 + arg6 - (var154 >> 1);
                                    int var166 = class123.field1576[1] + arg1 + var164 - 12;
                                    int var167 = var166;
                                    int var168 = var117 + var166;
                                    int var169 = var87.field7668 + var166 + 15;
                                    int var170 = var169 - var132.field3773;
                                    int var171 = var132.field3769 + var169;
                                    if (var170 < var166) {
                                        var167 = var170;
                                    }
                                    if (var171 > var168) {
                                        var168 = var171;
                                    }
                                    int var172 = 0;
                                    if (var90 != null) {
                                        var172 = var166 + var90.field7668 + 15;
                                        int var173 = var172 - var133.field3773;
                                        int var174 = var172 + var133.field3769;
                                        if (var173 < var167) {
                                            var167 = var173;
                                        }
                                        if (var174 > var168) {
                                            var168 = var174;
                                        }
                                    }
                                    int var175 = 255;
                                    if (var87.field7683 >= 0) {
                                        var175 = (var162 << 8) / (var87.field7681 - var87.field7683);
                                    }
                                    if (var175 >= 0 && var175 < 255) {
                                        int var176 = var175 << 24;
                                        int var177 = var176 | 0xFFFFFF;
                                        if (var118 != null) {
                                            var118.method240(var149 + var165 - var101, var166, 0, var177, 1);
                                        }
                                        if (var122 != null) {
                                            var122.method240(var150 + var165 - var103, var166, 0, var177, 1);
                                        }
                                        if (var120 != null) {
                                            for (int var178 = 0; var178 < var146; var178++) {
                                                var120.method240(var165 + var98 * var178 + var151 - var102, var166, 0, var177, 1);
                                            }
                                        }
                                        if (var124 != null) {
                                            var124.method240(var165 + var155 - var104, var166, 0, var177, 1);
                                        }
                                        var130.method655(var165 + var152, var144, var169, var87.field7687 | var176, 0, 62);
                                        if (var90 != null) {
                                            if (var105 != null) {
                                                var105.method240(var156 + var165 - var113, var166, 0, var177, 1);
                                            }
                                            if (var107 != null) {
                                                var107.method240(var157 + var165 - var115, var166, 0, var177, 1);
                                            }
                                            if (var106 != null) {
                                                for (int var179 = 0; var179 < var147; var179++) {
                                                    var106.method240(var110 * var179 + var165 + var158 - var114, var166, 0, var177, 1);
                                                }
                                            }
                                            if (var108 != null) {
                                                var108.method240(var159 + var165 - var116, var166, 0, var177, 1);
                                            }
                                            var131.method655(var160 + var165, var141, var172, var176 | var90.field7687, 0, 62);
                                        }
                                    } else {
                                        if (var118 != null) {
                                            var118.method1838(var165 + var149 - var101, var166);
                                        }
                                        if (var122 != null) {
                                            var122.method1838(var150 + var165 - var103, var166);
                                        }
                                        if (var120 != null) {
                                            for (int var180 = 0; var180 < var146; var180++) {
                                                var120.method1838(var98 * var180 + var165 + var151 - var102, var166);
                                            }
                                        }
                                        if (var124 != null) {
                                            var124.method1838(var165 + var155 - var104, var166);
                                        }
                                        var130.method655(var152 + var165, var144, var169, var87.field7687 | 0xFF000000, 0, 62);
                                        if (var90 != null) {
                                            if (var105 != null) {
                                                var105.method1838(var156 + var165 - var113, var166);
                                            }
                                            if (var107 != null) {
                                                var107.method1838(var157 + var165 - var115, var166);
                                            }
                                            if (var106 != null) {
                                                for (int var181 = 0; var181 < var147; var181++) {
                                                    var106.method1838(var110 * var181 + var165 - (-var158 + var114), var166);
                                                }
                                            }
                                            if (var108 != null) {
                                                var108.method1838(var159 + var165 - var116, var166);
                                            }
                                            var131.method655(var165 + var160, var141, var172, var90.field7687 | 0xFF000000, 0, 62);
                                        }
                                    }
                                    class326.method1945(var167, var154 + var165, var165, var168 + 1, false);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var11 = 0; var11 < class599.field8115; var11++) {
            int var34 = class447.field6011[var11];
            class287 var35;
            if (var34 < 2048) {
                var35 = class61.field825[var34];
            } else {
                var35 = ((class273) class30.field444.method2121(85, (long) (var34 - 2048))).field3210;
            }
            int var36 = class734.field10264[var11];
            class287 var37;
            if (var36 >= 2048) {
                var37 = ((class273) class30.field444.method2121(123, (long) (var36 - 2048))).field3210;
            } else {
                var37 = class61.field825[var36];
            }
            class416.method2490(--var35.field3433, arg1, (byte) 108, arg2, var37, arg0, var35, arg5, arg6, arg4);
        }
        int var12 = class332.field4108.field3773 + class332.field4108.field3769 + 2;
        for (int var13 = 0; var13 < class149.field1862; var13++) {
            int var14 = class729.field10222[var13];
            int var15 = class729.field10218[var13];
            int var16 = class729.field10217[var13];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var33 = 0; var33 < var13; var33++) {
                    if ((var15 + 2) > (class729.field10218[var33] - var12) && var15 - var12 < class729.field10218[var33] + 2 && (var14 - var16) < (class729.field10222[var33] + class729.field10217[var33]) && (class729.field10222[var33] - class729.field10217[var33]) < (var14 + var16) && var15 > (class729.field10218[var33] - var12)) {
                        var15 = class729.field10218[var33] - var12;
                        var17 = true;
                    }
                }
            }
            class729.field10218[var13] = var15;
            String var18 = class729.field10215[var13];
            int var19 = class332.field4108.method1819(var18, (byte) 111);
            int var20 = arg6 + var14;
            int var21 = var15 + arg1 - class332.field4108.field3773;
            int var22 = var19 + var20;
            int var23 = class332.field4108.field3769 + var15 + arg1;
            if (class87.field1158 == 0) {
                int var24 = 16776960;
                if (class729.field10225[var13] < 6) {
                    var24 = class403.field5247[class729.field10225[var13]];
                }
                if (class729.field10225[var13] == 6) {
                    var24 = (class471.field6571 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class729.field10225[var13] == 7) {
                    var24 = (class471.field6571 % 20) < 10 ? 255 : 65535;
                }
                if (class729.field10225[var13] == 8) {
                    var24 = (class471.field6571 % 20) < 10 ? 45056 : 8454016;
                }
                if (class729.field10225[var13] == 9) {
                    int var25 = 150 - class729.field10213[var13];
                    if (var25 < 50) {
                        var24 = (var25 * 1280) + 16711680;
                    } else if (var25 < 100) {
                        var24 = 16776960 - (var25 - 50) * 327680;
                    } else if (var25 < 150) {
                        var24 = ((var25 - 100) * 5) + 65280;
                    }
                }
                if (class729.field10225[var13] == 10) {
                    int var26 = 150 - class729.field10213[var13];
                    if (var26 < 50) {
                        var24 = var26 * 5 + 16711680;
                    } else if (var26 < 100) {
                        var24 = 16711935 - (var26 - 50) * 327680;
                    } else if (var26 < 150) {
                        var24 = var26 * 327680 + 255 - ((var26 - 100) * 5) - 32768000;
                    }
                }
                if (class729.field10225[var13] == 11) {
                    int var27 = 150 - class729.field10213[var13];
                    if (var27 < 50) {
                        var24 = 16777215 - (var27 * 327685);
                    } else if (var27 < 100) {
                        var24 = (var27 - 50) * 327685 + 65280;
                    } else if (var27 < 150) {
                        var24 = 16777215 - ((var27 - 100) * 327680);
                    }
                }
                int var28 = var24 | 0xFF000000;
                if (class729.field10212[var13] == 0) {
                    var20 -= var19 >> 1;
                    class452.field6380.method657(var18, -16777216, -16777216, var28, arg1 + var15, arg6 - -var14);
                    var22 -= var19 >> 1;
                }
                if (class729.field10212[var13] == 1) {
                    var21 -= 5;
                    var22 -= var19 >> 1;
                    class452.field6380.method665(13109, arg1 + var15, class471.field6571, -16777216, arg6 + var14, var28, var18);
                    var23 += 5;
                    var20 -= var19 >> 1;
                }
                if (class729.field10212[var13] == 2) {
                    var21 -= 5;
                    var23 += 5;
                    var22 -= (var19 >> 1) - 5;
                    class452.field6380.method659(var28, var18, arg6 + var14, class471.field6571, -16777216, arg1 + var15, (byte) 72);
                    var20 -= (var19 >> 1) + 5;
                }
                if (class729.field10212[var13] == 3) {
                    class452.field6380.method653(150 - class729.field10213[var13], var18, -16777216, arg1 + var15, var28, -80, class471.field6571, arg6 + var14);
                    var20 -= var19 >> 1;
                    var23 += 7;
                    var21 -= 7;
                    var22 -= var19 >> 1;
                }
                if (class729.field10212[var13] == 4) {
                    int var29 = (150 - class729.field10213[var13]) * (class332.field4108.method1819(var18, (byte) -17) + 100) / 150;
                    class363.field4526.method607(arg6 + var14 - 50, arg1, arg6 + var14 + 50, arg1 + arg2);
                    var20 += 50 - var29;
                    var22 += 50 - var29;
                    class452.field6380.method655(arg6 + var14 + 50 - var29, var18, arg1 + var15, var28, -16777216, 62);
                    class363.field4526.method556(arg6, arg1, arg5 + arg6, arg1 + arg2);
                }
                if (class729.field10212[var13] == 5) {
                    int var30 = 150 - class729.field10213[var13];
                    int var31 = 0;
                    if (var30 < 25) {
                        var31 = var30 - 25;
                    } else if (var30 > 125) {
                        var31 = var30 - 125;
                    }
                    int var32 = class332.field4108.field3773 + class332.field4108.field3769;
                    class363.field4526.method607(arg6, arg1 + var15 - (var32 + 1), arg5 + arg6, arg1 + var15 + 5);
                    var22 -= var19 >> 1;
                    var20 -= var19 >> 1;
                    class452.field6380.method657(var18, -16777216, -16777216, var28, var15 + var31 + arg1, arg6 + var14);
                    var21 += var31;
                    var23 += var31;
                    class363.field4526.method556(arg6, arg1, arg5 + arg6, arg1 + arg2);
                }
            } else {
                class452.field6380.method657(var18, -16777216, -16777216, -256, arg1 + var15, arg6 + var14);
                var22 -= var19 >> 1;
                var20 -= var19 >> 1;
            }
            class326.method1945(var21, var22 + 1, var20, var23 + 1, false);
        }
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(I)V", line = 1182)
    public static void method2298(int arg0) {
        field5080 = null;
        if (arg0 != -645917983) {
            field5079 = null;
        }
        field5079 = null;
    }

    @OriginalMember(owner = "client!gka", name = "b", descriptor = "(I)Ltm;", line = 1193)
    public static final class410 method2299(int arg0) {
        field5081++;
        try {
            if (arg0 != -8456) {
                field5079 = null;
            }
            return (class410) Class.forName("jea").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BIZ)V", line = 1219)
    public static final void method2300(String arg0, String arg1, byte arg2, int arg3, boolean arg4) {
        field5083++;
        class336 var5 = class495.method2916((byte) 89);
        var5.field4150.method2353(63, class307.field3790.field6730);
        var5.field4150.method2369(-18090, 0);
        int var6 = var5.field4150.field5262;
        var5.field4150.method2369(-18090, 648);
        int[] var7 = class523.method3138(var5, 24960);
        int var8 = var5.field4150.field5262;
        var5.field4150.method2388(255, arg0);
        var5.field4150.method2369(-18090, class176.field2187);
        var5.field4150.method2388(arg2 ^ 0x8C, arg1);
        var5.field4150.method2404(-25, class171.field2051);
        var5.field4150.method2353(-82, class770.field10592);
        var5.field4150.method2353(-102, class672.field9229.field5926);
        class678.method3821(var5.field4150, 111);
        String var9 = class372.field4688;
        var5.field4150.method2353(115, var9 == null ? 0 : 1);
        if (var9 != null) {
            var5.field4150.method2388(255, var9);
        }
        var5.field4150.method2353(-81, arg3);
        var5.field4150.method2353(94, arg4 ? 1 : 0);
        var5.field4150.field5262 += 7;
        var5.field4150.method2385(var8, var5.field4150.field5262, var7, -22080);
        var5.field4150.method2416(arg2 - 235, -var6 + var5.field4150.field5262);
        class578.method3334(arg2 ^ 0x77, var5);
        class5.field53 = 1;
        class26.field414 = -3;
        class3.field43 = 0;
        if (arg2 != 115) {
            return;
        }
        class738.field10290 = 0;
        if (arg3 < 13) {
            class650.field8959 = true;
            class224.method1382(arg2 ^ 0xFFFFF21F);
        }
    }
}
