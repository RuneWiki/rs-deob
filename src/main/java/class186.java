import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class186 extends class601 {

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "[I")
    public static int[] field2541 = new int[3];

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "Luu;")
    public static class237 field2537;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field2534;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)I", line = 3)
    public final int method45(int arg0) {
        ++field2542;
        if (arg0 != 8976) {
            this.method1161(102);
        }
        return 1;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)V", line = 14)
    public final void method43(int arg0, int arg1) {
        int var3 = -42 % ((22 - arg0) / 34);
        ++field2539;
        super.field8131 = arg1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 26)
    public final void method41(byte arg0) {
        if (super.field8137.method2153(-9) == class540.field7508) {
            if (super.field8137.method2161(0)) {
                super.field8131 = 0;
            }
        } else {
            super.field8131 = 1;
        }
        ++field2543;
        if (~super.field8131 != -1 && super.field8131 != 1) {
            super.field8131 = this.method45(8976);
        }
        int var2 = -126 % ((arg0 - 59) / 33);
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lqea;)V", line = 47)
    public class186(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)Z", line = 51)
    public final boolean method1161(int arg0) {
        ++field2535;
        if (arg0 != 2048) {
            field2541 = null;
        }
        if (super.field8137.method2161(0)) {
            return false;
        } else {
            return super.field8137.method2153(-9) == class540.field7508;
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)I", line = 70)
    public final int method1162(int arg0) {
        ++field2538;
        return arg0 != 0 ? -77 : super.field8131;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(ILqea;)V", line = 83)
    public class186(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)I", line = 86)
    public final int method36(int arg0, byte arg1) {
        ++field2536;
        if (arg1 != 22) {
            field2534 = null;
        }
        if (super.field8137.method2161(arg1 + -22)) {
            return 3;
        } else {
            return super.field8137.method2153(arg1 ^ -31) == class540.field7508 ? 1 : 3;
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V", line = 106)
    public static void method1163(int arg0) {
        if (arg0 < 8) {
            method1164(-84, -21, 109, 66, 66, -105, -58);
        }
        field2534 = null;
        field2537 = null;
        field2541 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIII)V", line = 119)
    public static final void method1164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2544;
        int var7 = class209.field2736;
        int[] var8 = class344.field4898;
        class349.field4961 = arg3;
        for (int var9 = 0; ~var9 > ~(class262.field3837 + var7); ++var9) {
            class123 var37 = null;
            class515 var38;
            if (var9 >= var7) {
                var38 = ((class234) class372.field5245.method812(119, (long) class446.field6192[-var7 + var9])).field3471;
                var37 = ((class679) var38).field9436;
                if (var37.field1700 != null) {
                    var37 = var37.method773(class124.field1712, false);
                    if (var37 == null) {
                        continue;
                    }
                }
            } else {
                var38 = class251.field3675[var8[var9]];
            }
            if (~var38.field7155 <= -1 && (class428.field5973 == var38.field7156 || class388.field5601.field4408 == var38.field4408)) {
                class286.method1894((byte) 110, var38.method3085(-80), arg4, arg6 >> 1, arg0, var38, arg2 >> 1);
                if (~class185.field2530[0] <= -1) {
                    if (var38.field7162 != null && (~var7 >= ~var9 || class197.field2641 == 0 || class197.field2641 == 3 || class197.field2641 == 1 && class207.method1241(((class96) var38).field1313, 3)) && class349.field4961 < class409.field5839) {
                        class409.field5845[class349.field4961] = class535.field7417.method1133(99, var38.field7162) / 2;
                        class409.field5836[class349.field4961] = class185.field2530[0];
                        class409.field5832[class349.field4961] = class185.field2530[1];
                        class409.field5840[class349.field4961] = var38.field7106;
                        class409.field5847[class349.field4961] = var38.field7110;
                        class409.field5838[class349.field4961] = var38.field7124;
                        class409.field5829[class349.field4961] = var38.field7162;
                        ++class349.field4961;
                    }
                    int var39 = class185.field2530[1] + arg1;
                    int var50;
                    if (!var38.field7134 && ~var38.field7133 < ~class483.field6741) {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var43;
                        if (~var7 < ~var9) {
                            class96 var42 = class251.field3675[var8[var9]];
                            var43 = var38.method3084((byte) -92).field429;
                            if (var42.field1351) {
                                var41 = 2;
                            }
                        } else {
                            var43 = var37.field1699;
                            if (~var43 == 0) {
                                var43 = var38.method3084((byte) -92).field429;
                            }
                        }
                        class298[] var44 = class232.field3147;
                        if (~var43 != 0) {
                            class298[] var45 = (class298[]) class84.field1194.method3898((byte) -42, (long) var43);
                            if (var45 == null) {
                                class52[] var46 = class52.method381(class671.field9318, var43, 0);
                                if (var46 != null) {
                                    var45 = new class298[var46.length];
                                    for (int var47 = 0; ~var46.length < ~var47; ++var47) {
                                        var45[var47] = class129.field1802.method1496(var46[var47], true);
                                    }
                                    class84.field1194.method3899(-71, var45, (long) var43);
                                }
                            }
                            if (var45 != null && ~var45.length <= -3) {
                                var44 = var45;
                            }
                        }
                        if (~var44.length >= ~var41) {
                            var41 = 1;
                        }
                        class298 var48 = var44[0];
                        class298 var49 = var44[var41];
                        var50 = var39 - Math.max(class535.field7417.field2462, var48.method1952());
                        int var51 = class185.field2530[0] + arg5 + -(var48.method1955() >> 1);
                        int var52 = var48.method1955() * var38.field7184 / 255;
                        int var53 = var48.method1952();
                        if (var38.field7184 > 0 && var52 < 2) {
                            var52 = 2;
                        }
                        var48.method1970(var51, var50);
                        class129.field1802.method1415(var51, var50, var51 + var52, var50 - -var53);
                        var49.method1970(var51, var50);
                        class129.field1802.method1544(arg5, arg1, arg5 - -arg6, arg1 + arg2);
                        class483.method2944(var51 - -var48.method1963(), var50 + var53, var51, var50, ~arg3);
                    } else {
                        var50 = var39 - Math.max(class535.field7417.field2462, class232.field3147[0].method1952());
                    }
                    var50 -= 2;
                    if (!var38.field7134) {
                        if (var38.field7102 > class483.field6741) {
                            class298 var54 = class381.field5467[var38.field7174 ? 2 : 0];
                            class298 var55 = class381.field5467[var38.field7174 ? 3 : 1];
                            boolean var56 = true;
                            int var57;
                            if (!(var38 instanceof class679)) {
                                var57 = var38.method3084((byte) -92).field422;
                            } else {
                                var57 = var37.field1696;
                                if (var57 == -1) {
                                    var57 = var38.method3084((byte) -92).field422;
                                }
                            }
                            if (~var57 != 0) {
                                class298[] var58 = (class298[]) class697.field9697.method3898((byte) -42, (long) var57);
                                if (var58 == null) {
                                    class52[] var59 = class52.method381(class671.field9318, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class298[var59.length];
                                        for (int var60 = 0; ~var60 > ~var59.length; ++var60) {
                                            var58[var60] = class129.field1802.method1496(var59[var60], true);
                                        }
                                        class697.field9697.method3899(39, var58, (long) var57);
                                    }
                                }
                                if (var58 != null && ~var58.length == -5) {
                                    var54 = var58[var38.field7174 ? 2 : 0];
                                    var55 = var58[!var38.field7174 ? 1 : 3];
                                }
                            }
                            int var61 = -class483.field6741 + var38.field7102;
                            int var64;
                            if (var61 > var38.field7160) {
                                int var62 = var61 - var38.field7160;
                                int var63 = ~var38.field7161 != -1 ? (-var62 + var38.field7144) / var38.field7161 * var38.field7161 : 0;
                                var64 = var54.method1955() * var63 / var38.field7144;
                            } else {
                                var64 = var54.method1955();
                            }
                            int var65 = var54.method1952();
                            var50 -= var65;
                            int var66 = arg5 - (-class185.field2530[0] - -(var54.method1955() >> 1));
                            var54.method1970(var66, var50);
                            class129.field1802.method1415(var66, var50, var66 - -var64, var50 - -var65);
                            var55.method1970(var66, var50);
                            class129.field1802.method1544(arg5, arg1, arg5 + arg6, arg1 - -arg2);
                            class483.method2944(var54.method1963() + var66, var50 + var65, var66, var50, -1);
                            var50 -= 2;
                        }
                        if (~var7 >= ~var9) {
                            if (var37.field1665 >= 0 && ~class339.field4775.length < ~var37.field1665) {
                                class298 var67 = class339.field4775[var37.field1665];
                                var50 -= 25;
                                var67.method1970(arg5 + class185.field2530[0] + -(var67.method1955() >> 1), var50);
                                class483.method2944(arg5 - (-class185.field2530[0] + (var67.method1955() >> 1) + -var67.method1963()), var50 + var67.method1961(), class185.field2530[0] + arg5 + -(var67.method1955() >> 1), var50, -1);
                                var50 -= 2;
                            }
                        } else {
                            class96 var68 = (class96) var38;
                            if (~var68.field1368 != 0) {
                                var50 -= 25;
                                class298 var69 = class129.field1804[var68.field1368];
                                var69.method1970(class185.field2530[0] - 12 + arg5, var50);
                                class483.method2944(arg5 - (-class185.field2530[0] - -12 - var69.method1963()), var69.method1961() + var50, arg5 - -class185.field2530[0] + -12, var50, -1);
                                var50 -= 2;
                            }
                            if (var68.field1353 != -1) {
                                var50 -= 25;
                                class298 var70 = class339.field4775[var68.field1353];
                                var70.method1970(arg5 + -12 + class185.field2530[0], var50);
                                class483.method2944(arg5 + (class185.field2530[0] - (12 - var70.method1963())), var50 - -var70.method1961(), arg5 + -12 - -class185.field2530[0], var50, -1);
                                var50 -= 2;
                            }
                        }
                    }
                    int var10000;
                    if (!(var38 instanceof class96)) {
                        int var71 = 0;
                        class596[] var72 = class653.field8740;
                        for (int var73 = 0; ~var73 > ~var72.length; ++var73) {
                            class596 var75 = var72[var73];
                            if (var75 != null && var75.field8081 == 1 && class446.field6192[-var7 + var9] == var75.field8082) {
                                class298 var76 = class577.field7930[var75.field8077];
                                if (~var71 > ~var76.method1952()) {
                                    var71 = var76.method1952();
                                }
                                if (class483.field6741 % 20 < 10) {
                                    var76.method1970(arg5 - -class185.field2530[0] + -12, -var76.method1952() + var50);
                                    class483.method2944(arg5 - 12 + class185.field2530[0] + var76.method1963(), -var76.method1952() + var50 + var76.method1961(), class185.field2530[0] + arg5 + -12, var50 - var76.method1952(), -1);
                                }
                            }
                        }
                        if (var71 > 0) {
                            var10000 = var50 - (var71 - -2);
                        }
                    } else if (~var9 <= -1) {
                        int var77 = 0;
                        class596[] var78 = class653.field8740;
                        for (int var79 = 0; var78.length > var79; ++var79) {
                            class596 var81 = var78[var79];
                            if (var81 != null && ~var81.field8081 == -11 && var8[var9] == var81.field8082) {
                                class298 var82 = class577.field7930[var81.field8077];
                                if (var77 < var82.method1952()) {
                                    var77 = var82.method1952();
                                }
                                var82.method1970(arg5 - (-class185.field2530[0] - -12), var50 + -var82.method1952());
                                class483.method2944(class185.field2530[0] + -12 + arg5 - -var82.method1963(), var50 + (-var82.method1952() - -var82.method1961()), class185.field2530[0] + -12 + arg5, -var82.method1952() + var50, -1);
                            }
                        }
                        if (~var77 < -1) {
                            var10000 = var50 - (var77 + 2);
                        }
                    }
                    for (int var83 = 0; ~var83 > ~class540.field7511; ++var83) {
                        int var84 = var38.field7179[var83];
                        int var85 = var38.field7138[var83];
                        class108 var86 = null;
                        int var87 = 0;
                        if (var85 >= 0) {
                            if (~var84 >= ~class483.field6741) {
                                continue;
                            }
                            var86 = class594.field8074.method3062(46, var38.field7138[var83]);
                            var87 = var86.field1448;
                        } else if (var84 < 0) {
                            continue;
                        }
                        int var88 = var38.field7171[var83];
                        class108 var89 = null;
                        if (var88 >= 0) {
                            var89 = class594.field8074.method3062(46, var88);
                        }
                        if (~class483.field6741 <= ~(-var87 + var84)) {
                            int var90 = var38.field7182[var83];
                            if (var90 >= 0) {
                                var38.field7133 = class483.field6741 + 300;
                                var38.field7184 = var90;
                                var38.field7182[var83] = -1;
                            }
                            if (var86 == null) {
                                var38.field7179[var83] = -1;
                            } else {
                                int var91 = var38.method3085(109) / 2;
                                class286.method1894((byte) 50, var91, arg4, arg6 >> 1, arg0, var38, arg2 >> 1);
                                if (~class185.field2530[0] < 0) {
                                    class185.field2530[0] += class425.field5961[var83];
                                    class185.field2530[1] += class558.field7750[var83];
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
                                    class298 var104 = null;
                                    class298 var105 = null;
                                    class298 var106 = null;
                                    class298 var107 = null;
                                    int var108 = 0;
                                    int var109 = 0;
                                    int var110 = 0;
                                    int var111 = 0;
                                    int var112 = 0;
                                    int var113 = 0;
                                    int var114 = 0;
                                    int var115 = 0;
                                    class298 var116 = var86.method702(-104, class129.field1802);
                                    int var117 = 0;
                                    if (var116 != null) {
                                        var96 = var116.method1955();
                                        int var118 = var116.method1952();
                                        if (var117 < var118) {
                                            var117 = var118;
                                        }
                                        var116.method1967(class330.field4685);
                                        var100 = class330.field4685[0];
                                    }
                                    class298 var119 = var86.method707(0, class129.field1802);
                                    if (var119 != null) {
                                        var97 = var119.method1955();
                                        int var120 = var119.method1952();
                                        if (var117 < var120) {
                                            var117 = var120;
                                        }
                                        var119.method1967(class330.field4685);
                                        var101 = class330.field4685[0];
                                    }
                                    class298 var121 = var86.method708(arg3 ^ -20858, class129.field1802);
                                    if (var121 != null) {
                                        var98 = var121.method1955();
                                        int var122 = var121.method1952();
                                        var121.method1967(class330.field4685);
                                        if (var117 < var122) {
                                            var117 = var122;
                                        }
                                        var102 = class330.field4685[0];
                                    }
                                    class298 var123 = var86.method700(arg3 ^ 99, class129.field1802);
                                    if (var123 != null) {
                                        var99 = var123.method1955();
                                        int var124 = var123.method1952();
                                        if (var117 < var124) {
                                            var117 = var124;
                                        }
                                        var123.method1967(class330.field4685);
                                        var103 = class330.field4685[0];
                                    }
                                    if (var89 != null) {
                                        var104 = var89.method702(-120, class129.field1802);
                                        if (var104 != null) {
                                            var108 = var104.method1955();
                                            int var125 = var104.method1952();
                                            var104.method1967(class330.field4685);
                                            if (~var125 < ~var117) {
                                                var117 = var125;
                                            }
                                            var112 = class330.field4685[0];
                                        }
                                        var105 = var89.method707(arg3, class129.field1802);
                                        if (var105 != null) {
                                            var109 = var105.method1955();
                                            int var126 = var105.method1952();
                                            if (~var117 > ~var126) {
                                                var117 = var126;
                                            }
                                            var105.method1967(class330.field4685);
                                            var113 = class330.field4685[0];
                                        }
                                        var106 = var89.method708(arg3 + -20858, class129.field1802);
                                        if (var106 != null) {
                                            var110 = var106.method1955();
                                            int var127 = var106.method1952();
                                            if (var117 < var127) {
                                                var117 = var127;
                                            }
                                            var106.method1967(class330.field4685);
                                            var114 = class330.field4685[0];
                                        }
                                        var107 = var89.method700(109, class129.field1802);
                                        if (var107 != null) {
                                            var111 = var107.method1955();
                                            int var128 = var107.method1952();
                                            if (~var128 < ~var117) {
                                                var117 = var128;
                                            }
                                            var107.method1967(class330.field4685);
                                            var115 = class330.field4685[0];
                                        }
                                    }
                                    class402 var129 = class1.field14;
                                    class402 var130 = class1.field14;
                                    class179 var131 = class488.field6818;
                                    class179 var132 = class488.field6818;
                                    int var133 = var86.field1458;
                                    if (var133 >= 0) {
                                        class402 var134 = class548.method3245(-127, var133, class129.field1802, true);
                                        class179 var135 = class145.method941(class129.field1802, (byte) 87, var133);
                                        if (var134 != null && var135 != null) {
                                            var131 = var135;
                                            var129 = var134;
                                        }
                                    }
                                    if (var89 != null) {
                                        int var136 = var89.field1458;
                                        if (var136 >= 0) {
                                            class402 var137 = class548.method3245(-121, var136, class129.field1802, true);
                                            class179 var138 = class145.method941(class129.field1802, (byte) 87, var136);
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
                                    String var143 = var86.method701(var38.field7142[var83], -90);
                                    int var144 = var131.method1133(107, var143);
                                    if (var89 != null) {
                                        var140 = var89.method701(var38.field7153[var83], -24);
                                        var142 = var132.method1133(arg3 ^ 92, var140);
                                    }
                                    int var145 = 0;
                                    int var146 = 0;
                                    if (var97 > 0) {
                                        var145 = var144 / var97 - -1;
                                    }
                                    if (var89 != null && ~var109 < -1) {
                                        var146 = var142 / var109 + 1;
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
                                    int var152;
                                    if (~var97 >= -1) {
                                        var152 = var144 + var147;
                                    } else {
                                        int var153 = var97 * var145;
                                        var152 = var147 + var153;
                                        var151 = (-var144 + var153) / 2 + var147;
                                    }
                                    int var154 = var152;
                                    if (~var99 < -1) {
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
                                        if (~var108 < -1) {
                                            var152 += var108;
                                        }
                                        var152 += 2;
                                        var156 = var152;
                                        if (~var110 < -1) {
                                            var152 += var110;
                                        }
                                        var159 = var152;
                                        var157 = var152;
                                        if (~var109 < -1) {
                                            int var160 = var109 * var146;
                                            var152 += var160;
                                            var159 += (-var142 + var160) / 2;
                                        } else {
                                            var152 += var142;
                                        }
                                        var158 = var152;
                                        if (~var111 < -1) {
                                            var152 += var111;
                                        }
                                    }
                                    int var161 = var38.field7179[var83] - class483.field6741;
                                    int var162 = -(var86.field1442 * var161 / var86.field1448) + var86.field1442;
                                    int var163 = var86.field1450 * var161 / var86.field1448 + -var86.field1450;
                                    int var164 = arg5 - -class185.field2530[0] + var162 - (var152 >> 1);
                                    int var165 = class185.field2530[1] + -12 + arg1 - -var163;
                                    int var166 = var165;
                                    int var167 = var165 - -var117;
                                    int var168 = var165 - -15 + var86.field1447;
                                    int var169 = -var131.field2462 + var168;
                                    int var170 = var131.field2464 + var168;
                                    if (~var165 < ~var169) {
                                        var166 = var169;
                                    }
                                    if (var167 < var170) {
                                        var167 = var170;
                                    }
                                    int var171 = 0;
                                    if (var89 != null) {
                                        var171 = var165 + 15 + var89.field1447;
                                        int var172 = -var132.field2462 + var171;
                                        int var173 = var132.field2464 + var171;
                                        if (~var166 < ~var172) {
                                            var166 = var172;
                                        }
                                        if (~var167 > ~var173) {
                                            var167 = var173;
                                        }
                                    }
                                    int var174 = 255;
                                    if (~var86.field1440 <= -1) {
                                        var174 = (var161 << 8) / (-var86.field1440 + var86.field1448);
                                    }
                                    if (~var174 <= -1 && ~var174 > -256) {
                                        int var175 = var174 << 24;
                                        int var176 = var175 | 16777215;
                                        if (var116 != null) {
                                            var116.method1013(-var100 + var164 + var148, var165, 0, var176, 1);
                                        }
                                        if (var121 != null) {
                                            var121.method1013(var164 - (-var149 + var102), var165, 0, var176, 1);
                                        }
                                        if (var119 != null) {
                                            for (int var177 = 0; ~var177 > ~var145; ++var177) {
                                                var119.method1013(var97 * var177 + var150 + var164 + -var101, var165, 0, var176, 1);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method1013(var164 - (-var154 - -var103), var165, 0, var176, 1);
                                        }
                                        var129.method2505(var151 + var164, -97, 0, var143, var86.field1443 | var175, var168);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method1013(var155 + var164 + -var112, var165, 0, var176, 1);
                                            }
                                            if (var106 != null) {
                                                var106.method1013(var156 + var164 + -var114, var165, 0, var176, 1);
                                            }
                                            if (var105 != null) {
                                                for (int var178 = 0; var146 > var178; ++var178) {
                                                    var105.method1013(var109 * var178 + -var113 + var164 - -var157, var165, 0, var176, 1);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method1013(-var115 + var158 + var164, var165, 0, var176, 1);
                                            }
                                            var130.method2505(var159 + var164, -85, 0, var140, var89.field1443 | var175, var171);
                                        }
                                    } else {
                                        if (var116 != null) {
                                            var116.method1970(var164 - -var148 + -var100, var165);
                                        }
                                        if (var121 != null) {
                                            var121.method1970(var149 - var102 + var164, var165);
                                        }
                                        if (var119 != null) {
                                            for (int var179 = 0; var179 < var145; ++var179) {
                                                var119.method1970(var150 + var164 - (var101 - var97 * var179), var165);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method1970(-var103 + var164 + var154, var165);
                                        }
                                        var129.method2505(var151 + var164, -118, 0, var143, var86.field1443 | -16777216, var168);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method1970(var155 - var112 + var164, var165);
                                            }
                                            if (var106 != null) {
                                                var106.method1970(-var114 + var164 + var156, var165);
                                            }
                                            if (var105 != null) {
                                                for (int var180 = 0; var146 > var180; ++var180) {
                                                    var105.method1970(var109 * var180 + var157 + var164 + -var113, var165);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method1970(var164 - -var158 + -var115, var165);
                                            }
                                            var130.method2505(var159 + var164, -110, 0, var140, -16777216 | var89.field1443, var171);
                                        }
                                    }
                                    class483.method2944(var152 + var164, var167 - -1, var164, var166, -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class442.field6140; ++var10) {
            int var33 = class560.field7794[var10];
            class515 var34;
            if (~var33 > -2049) {
                var34 = class251.field3675[var33];
            } else {
                var34 = ((class234) class372.field5245.method812(123, (long) (var33 + -2048))).field3471;
            }
            int var35 = class313.field4353[var10];
            class515 var36;
            if (var35 >= 2048) {
                var36 = ((class234) class372.field5245.method812(117, (long) (var35 - 2048))).field3471;
            } else {
                var36 = class251.field3675[var35];
            }
            class550.method3260(arg4, (byte) -123, --var34.field7112, arg2, arg0, arg5, var34, var36, arg1, arg6);
        }
        int var11 = class535.field7417.field2464 + class535.field7417.field2462 + 2;
        for (int var12 = 0; ~var12 > ~class349.field4961; ++var12) {
            int var13 = class409.field5836[var12];
            int var14 = class409.field5832[var12];
            int var15 = class409.field5845[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; var32 < var12; ++var32) {
                    if (~(class409.field5832[var32] - var11) > ~(var14 + 2) && class409.field5832[var32] + 2 > var14 - var11 && class409.field5845[var32] + class409.field5836[var32] > -var15 + var13 && ~(class409.field5836[var32] + -class409.field5845[var32]) > ~(var13 + var15) && class409.field5832[var32] + -var11 < var14) {
                        var16 = true;
                        var14 = class409.field5832[var32] - var11;
                    }
                }
            }
            class409.field5832[var12] = var14;
            String var17 = class409.field5829[var12];
            int var18 = class535.field7417.method1133(93, var17);
            int var19 = arg5 + var13;
            int var20 = arg1 + var14 + -class535.field7417.field2462;
            int var21 = var19 - -var18;
            int var22 = arg1 - (-var14 - class535.field7417.field2464);
            if (class77.field1124 == 0) {
                int var23 = 16776960;
                if (~class409.field5840[var12] > -7) {
                    var23 = class318.field4425[class409.field5840[var12]];
                }
                if (~class409.field5840[var12] == -7) {
                    var23 = class428.field5973 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (~class409.field5840[var12] == -8) {
                    var23 = class428.field5973 % 20 < 10 ? 255 : 65535;
                }
                if (~class409.field5840[var12] == -9) {
                    var23 = ~(class428.field5973 % 20) <= -11 ? 8454016 : 45056;
                }
                if (class409.field5840[var12] == 9) {
                    int var24 = 150 - class409.field5838[var12];
                    if (~var24 > -51) {
                        var23 = 16711680 - -(var24 * 1280);
                    } else if (~var24 > -101) {
                        var23 = -(var24 * 327680) + 16384000 + 16776960;
                    } else if (var24 < 150) {
                        var23 = 65280 - (-(var24 * 5) + 500);
                    }
                }
                if (class409.field5840[var12] == 10) {
                    int var25 = -class409.field5838[var12] + 150;
                    if (~var25 <= -51) {
                        if (~var25 <= -101) {
                            if (~var25 > -151) {
                                var23 = var25 * 327680 - 32768000 + 255 - (var25 + -100) * 5;
                            }
                        } else {
                            var23 = -((var25 + -50) * 327680) + 16711935;
                        }
                    } else {
                        var23 = var25 * 5 + 16711680;
                    }
                }
                if (~class409.field5840[var12] == -12) {
                    int var26 = 150 - class409.field5838[var12];
                    if (~var26 > -51) {
                        var23 = -(var26 * 327685) + 16777215;
                    } else if (~var26 <= -101) {
                        if (var26 < 150) {
                            var23 = -(var26 * 327680) - -32768000 + 16777215;
                        }
                    } else {
                        var23 = var26 * 327685 + -16384250 + 65280;
                    }
                }
                int var27 = -16777216 | var23;
                if (~class409.field5847[var12] == -1) {
                    var19 -= var18 >> 1;
                    class758.field10575.method2508(var17, arg1 - -var14, var27, -16777216, 115, arg5 - -var13);
                    var21 -= var18 >> 1;
                }
                if (~class409.field5847[var12] == -2) {
                    var21 -= var18 >> 1;
                    var22 += 5;
                    var19 -= var18 >> 1;
                    class758.field10575.method2509(-16777216, class428.field5973, var17, var27, arg5 + var13, arg1 - -var14, -101);
                    var20 -= 5;
                }
                if (~class409.field5847[var12] == -3) {
                    var22 += 5;
                    var19 -= (var18 >> 1) + 5;
                    var20 -= 5;
                    class758.field10575.method2507(var17, -16777216, var27, arg5 + var13, (byte) 45, arg1 + var14, class428.field5973);
                    var21 -= (var18 >> 1) + -5;
                }
                if (~class409.field5847[var12] == -4) {
                    var22 += 7;
                    class758.field10575.method2504(-16777216, arg5 + var13, (byte) 126, arg1 + var14, class428.field5973, 150 - class409.field5838[var12], var17, var27);
                    var21 -= var18 >> 1;
                    var20 -= 7;
                    var19 -= var18 >> 1;
                }
                if (class409.field5847[var12] == 4) {
                    int var28 = (-class409.field5838[var12] + 150) * (class535.field7417.method1133(92, var17) + 100) / 150;
                    class129.field1802.method1415(arg5 + -50 + var13, arg1, arg5 + var13 + 50, arg1 - -arg2);
                    class758.field10575.method2505(arg5 - -50 + -var28 + var13, -127, -16777216, var17, var27, arg1 - -var14);
                    var19 += -var28 + 50;
                    var21 += 50 - var28;
                    class129.field1802.method1544(arg5, arg1, arg5 + arg6, arg1 - -arg2);
                }
                if (class409.field5847[var12] == 5) {
                    int var29 = -class409.field5838[var12] + 150;
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 + -25;
                    } else if (var29 > 125) {
                        var30 = var29 + -125;
                    }
                    int var31 = class535.field7417.field2464 + class535.field7417.field2462;
                    class129.field1802.method1415(arg5, arg1 + -1 - (-var14 + var31), arg5 - -arg6, arg1 + var14 + 5);
                    class758.field10575.method2508(var17, arg1 - -var14 + var30, var27, -16777216, -40, arg5 - -var13);
                    var20 += var30;
                    var19 -= var18 >> 1;
                    var22 += var30;
                    var21 -= var18 >> 1;
                    class129.field1802.method1544(arg5, arg1, arg5 + arg6, arg1 - -arg2);
                }
            } else {
                class758.field10575.method2508(var17, arg1 + var14, -256, -16777216, 98, arg5 + var13);
                var21 -= var18 >> 1;
                var19 -= var18 >> 1;
            }
            class483.method2944(var21 - -1, var22 - -1, var19, var20, arg3 + -1);
        }
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)V", line = 1275)
    public static final void method1165(int arg0) {
        for (class272 var1 = (class272) class176.field2411.method3828(87); var1 != null; var1 = (class272) class176.field2411.method3829(-29202)) {
            if (~var1.field3953 < -2) {
                var1.field3953 = 0;
                class522.field7265.method3899(-73, var1, ((class558) var1.field3951.field9462.field33).field7758);
                var1.field3951.method3833(20975);
            }
        }
        ++field2540;
        class284.field4103 = 0;
        class569.field7865 = 0;
        class290.field4161.method3615((byte) -78);
        class560.field7789.method819(arg0 ^ 23739);
        class176.field2411.method3833(20975);
        class714.method4011(class193.field2626, 20132);
        if (arg0 != 1) {
            method1165(54);
        }
    }
}
