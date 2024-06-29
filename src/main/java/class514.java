import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class514 {

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public int field7621 = 0;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
    public int field7627 = 0;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "Ler;")
    private class157 field7619 = new class157(64);

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "Lgk;")
    private class409 field7629 = null;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "Lns;")
    private class438 field7616;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "Lns;")
    private class438 field7620;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "Liu;")
    public static class356 field7617;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "[I")
    public static int[] field7618;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)I", line = 13)
    public static final int method3055(int arg0, int arg1, int arg2) {
        if (arg1 > -13) {
            field7617 = null;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        field7622++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILsi;)V", line = 38)
    public static final void method3056(int arg0, class512 arg1) {
        field7628++;
        if (class269.field3729 == arg1) {
            int var2 = class486.field7134.method618((byte) 100);
            int var3 = ((var2 & 0xF8) >> 4) + class292.field4353 * 2;
            int var4 = (var2 & 0xF) + class156.field2263 * 2;
            boolean var5 = class486.field7134.method618((byte) 100) != 0;
            int var6 = class486.field7134.method619((byte) -23) + var3;
            int var7 = class486.field7134.method619((byte) -23) + var4;
            int var8 = class486.field7134.method643((byte) 109);
            int var9 = class486.field7134.method631(10494);
            int var10 = class486.field7134.method618((byte) 100) * 4;
            int var11 = class486.field7134.method618((byte) 100) * 4;
            int var12 = class486.field7134.method631(10494);
            int var13 = class486.field7134.method631(10494);
            int var14 = class486.field7134.method618((byte) 100);
            int var15 = class486.field7134.method618((byte) 100);
            if (var14 == 255) {
                var14 = -1;
            }
            if (var3 >= 0 && var4 >= 0 && var3 < class96.field1403 * 2 && class96.field1403 * 2 > var4 && var6 >= 0 && var7 >= 0 && (class485.field7122 * 2) > var6 && (class485.field7122 * 2) > var7 && var9 != 65535) {
                int var16 = var10 << 0;
                int var17 = var11 << 0;
                int var18 = var6 * 64;
                int var19 = var7 * 64;
                int var20 = var3 * 64;
                int var21 = var4 * 64;
                class223 var22 = new class223(var9, class503.field7500, var20, var21, var16, class405.field6116 + var12, class405.field6116 + var13, var14, var15, var8, var17, var5);
                var22.method1508(-24131, class500.method2985(var18, 5293, class503.field7500, var19) - var17, var12 - -class405.field6116, var18, var19);
                class494.field7232.method1958(new class434(var22), 0);
            }
        } else if (class86.field1170 == arg1) {
            int var23 = class486.field7134.method634(122);
            int var24 = class486.field7134.method618((byte) 100);
            int var25 = ((var24 & 0x7B) >> 4) + class292.field4353;
            int var26 = class156.field2263 + (var24 & 0x7);
            if (var25 >= 0 && var26 >= 0 && class96.field1403 > var25 && class485.field7122 > var26) {
                class481 var27 = (class481) class392.field5964.method943((long) (var25 | var26 << 14 | class503.field7500 << 28), -1);
                if (var27 != null) {
                    for (class251 var28 = (class251) var27.field7021.method1970(64); var28 != null; var28 = (class251) var27.field7021.method1960(24)) {
                        if ((var23 & 0x7FFF) == var28.field3476) {
                            var28.method2785((byte) -120);
                            break;
                        }
                    }
                    if (var27.field7021.method1965(64)) {
                        var27.method2785((byte) -120);
                    }
                    class158.method1031(class503.field7500, (byte) -91, var25, var26);
                }
            }
        } else {
            if (arg0 >= -88) {
                method3059(14);
            }
            if (class437.field6485 == arg1) {
                int var29 = class486.field7134.method618((byte) 100);
                int var30 = ((var29 & 0x7E) >> 4) + class292.field4353;
                int var31 = (var29 & 0x7) + class156.field2263;
                int var32 = class486.field7134.method631(10494);
                int var33 = class486.field7134.method618((byte) 100);
                int var34 = class486.field7134.method631(10494);
                int var35 = class486.field7134.method618((byte) 100);
                if (var30 >= 0 && var31 >= 0 && var30 < class96.field1403 && var31 < class485.field7122) {
                    int var36 = var30 * 128 + 64;
                    int var37 = var31 * 128 + 64;
                    int var38 = class503.field7500;
                    if (var38 < 3 && class42.method333(var31, var30, 0)) {
                        var38++;
                    }
                    class384 var39 = new class384(var32, var34, class405.field6116, class503.field7500, var38, var36, class500.method2985(var36, 5293, class503.field7500, var37) - var33, var37, var30, var30, var31, var31, var35);
                    class443.field6601.method1958(new class25(var39), 0);
                }
            } else if (class362.field5611 == arg1) {
                int var40 = class486.field7134.method618((byte) 100);
                int var41 = ((var40 & 0xFB) >> 4) + class292.field4353 * 2;
                int var42 = (var40 & 0xF) + class156.field2263 * 2;
                boolean var43 = class486.field7134.method618((byte) 100) != 0;
                int var44 = class486.field7134.method619((byte) -23) + var41;
                int var45 = class486.field7134.method619((byte) -23) + var42;
                int var46 = class486.field7134.method643((byte) 118);
                int var47 = class486.field7134.method643((byte) 122);
                int var48 = class486.field7134.method631(10494);
                byte var49 = class486.field7134.method619((byte) -23);
                int var50 = class486.field7134.method618((byte) 100) * 4;
                int var51 = class486.field7134.method631(10494);
                int var52 = class486.field7134.method631(10494);
                int var53 = class486.field7134.method618((byte) 100);
                int var54 = class486.field7134.method618((byte) 100);
                if (var53 == 255) {
                    var53 = -1;
                }
                if (var41 >= 0 && var42 >= 0 && var41 < class96.field1403 * 2 && class96.field1403 * 2 > var42 && var44 >= 0 && var45 >= 0 && class485.field7122 * 2 > var44 && class485.field7122 * 2 > var45 && var48 != 65535) {
                    int var55 = var45 * 64;
                    int var56 = var42 * 64;
                    int var57 = var50 << 0;
                    int var58 = var49 << 0;
                    int var59 = var44 * 64;
                    int var60 = var41 * 64;
                    if (var46 != 0) {
                        int var63;
                        class337 var64;
                        if (var46 < 0) {
                            int var61 = -var46 - 1;
                            int var62 = var61 & 0x7FF;
                            var63 = var61 >> 11 & 0xF;
                            if (class452.field6641 == var62) {
                                var64 = class339.field5365;
                            } else {
                                var64 = class439.field6539[var62];
                            }
                        } else {
                            int var65 = var46 - 1;
                            int var66 = var65 & 0x7FF;
                            var63 = var65 >> 11 & 0xF;
                            var64 = class151.field2174[var66];
                        }
                        if (var64 != null) {
                            class219 var67 = var64.method2181(0);
                            if (var67.field3057 != null && var67.field3057[var63] != null) {
                                int var68 = var67.field3057[var63][0];
                                int var69 = var67.field3057[var63][2];
                                int var70 = var64.field5319.method2101(-121);
                                int var71 = class525.field7760[var70];
                                int var72 = class525.field7763[var70];
                                int var73 = var68 * var72 + var69 * var71 >> 15;
                                int var74 = var69 * var72 - (var68 * var71) >> 15;
                                var60 += var73;
                                var58 -= var67.field3057[var63][1];
                                var56 += var74;
                            }
                        }
                    }
                    class223 var76 = new class223(var48, class503.field7500, var60, var56, var58, class405.field6116 + var51, class405.field6116 + var52, var53, var54, var47, var57, var43);
                    var76.method1508(-24131, class500.method2985(var59, 5293, class503.field7500, var55) - var57, class405.field6116 + var51, var59, var55);
                    class494.field7232.method1958(new class434(var76), 0);
                }
            } else if (class332.field5143 == arg1) {
                int var77 = class486.field7134.method618((byte) 100);
                boolean var78 = (var77 & 0x80) != 0;
                int var79 = class292.field4353 + ((var77 & 0x3B) >> 3);
                int var80 = (var77 & 0x7) + class156.field2263;
                int var81 = var79 + class486.field7134.method619((byte) -23);
                int var82 = var80 + class486.field7134.method619((byte) -23);
                int var83 = class486.field7134.method643((byte) 127);
                int var84 = class486.field7134.method631(10494);
                int var85 = class486.field7134.method618((byte) 100) * 4;
                int var86 = class486.field7134.method618((byte) 100) * 4;
                int var87 = class486.field7134.method631(10494);
                int var88 = class486.field7134.method631(10494);
                int var89 = class486.field7134.method618((byte) 100);
                if (var89 == 255) {
                    var89 = -1;
                }
                int var90 = class486.field7134.method618((byte) 100);
                if (var79 >= 0 && var80 >= 0 && class96.field1403 > var79 && class485.field7122 > var80 && var81 >= 0 && var82 >= 0 && class96.field1403 > var81 && class485.field7122 > var82 && var84 != 65535) {
                    int var91 = var82 * 128 + 64;
                    int var92 = var80 * 128 + 64;
                    int var93 = var79 * 128 + 64;
                    int var94 = var85 << 0;
                    int var95 = var86 << 0;
                    int var96 = var81 * 128 + 64;
                    class223 var97 = new class223(var84, class503.field7500, var93, var92, var94, var87 + class405.field6116, class405.field6116 + var88, var89, var90, var83, var95, var78);
                    var97.method1508(-24131, class500.method2985(var96, 5293, class503.field7500, var91) - var95, var87 - -class405.field6116, var96, var91);
                    class494.field7232.method1958(new class434(var97), 0);
                }
            } else if (class277.field3844 == arg1) {
                int var98 = class486.field7134.method618((byte) 100);
                int var99 = (var98 >> 4 & 0x7) + class292.field4353;
                int var100 = (var98 & 0x7) + class156.field2263;
                int var101 = class486.field7134.method631(10494);
                int var102 = class486.field7134.method631(10494);
                int var103 = class486.field7134.method631(10494);
                if (class392.field5964 != null && var99 >= 0 && var100 >= 0 && var99 < class96.field1403 && var100 < class485.field7122) {
                    class481 var104 = (class481) class392.field5964.method943((long) (var100 << 14 | class503.field7500 << 28 | var99), -1);
                    if (var104 != null) {
                        for (class251 var105 = (class251) var104.field7021.method1970(64); var105 != null; var105 = (class251) var104.field7021.method1960(24)) {
                            if ((var101 & 0x7FFF) == var105.field3476 && var105.field3474 == var102) {
                                var105.method2785((byte) -120);
                                var105.field3474 = var103;
                                class485.method2895(var105, 569086798, class503.field7500, var100, var99);
                                break;
                            }
                        }
                        class158.method1031(class503.field7500, (byte) -56, var99, var100);
                    }
                }
            } else if (class265.field3703 == arg1) {
                class486.field7134.method618((byte) 100);
                int var106 = class486.field7134.method618((byte) 100);
                int var107 = class292.field4353 + ((var106 & 0x77) >> 4);
                int var108 = (var106 & 0x7) + class156.field2263;
                int var109 = class486.field7134.method631(10494);
                int var110 = class486.field7134.method618((byte) 100);
                int var111 = class486.field7134.method641(32455);
                String var112 = class486.field7134.method621(2029169511);
                class153.method998(var108, var109, 8, var107, var110, class503.field7500, var112, var111);
            } else if (class494.field7233 == arg1) {
                int var113 = class486.field7134.method618((byte) 100);
                int var114 = (var113 >> 4 & 0x7) + class292.field4353;
                int var115 = (var113 & 0x7) + class156.field2263;
                int var116 = class486.field7134.method634(125);
                if (var116 == 65535) {
                    var116 = -1;
                }
                int var117 = class486.field7134.method583(false);
                int var118 = var117 >> 2;
                int var119 = var117 & 0x3;
                int var120 = class341.field5384[var118];
                class199.method1394(var114, var118, var120, var119, class503.field7500, 3, var116, var115);
            } else if (class472.field6904 == arg1) {
                int var121 = class486.field7134.method631(10494);
                int var122 = class486.field7134.method618((byte) 100);
                class56.field755.method2031(116, var121).method836(0, var122);
            } else if (class66.field916 == arg1) {
                int var123 = class486.field7134.method608(false);
                int var124 = (var123 >> 4 & 0x7) + class292.field4353;
                int var125 = (var123 & 0x7) + class156.field2263;
                int var126 = class486.field7134.method610(1312572200);
                int var127 = class486.field7134.method631(10494);
                int var128 = class486.field7134.method631(10494);
                if (var124 >= 0 && var125 >= 0 && var124 < class96.field1403 && class485.field7122 > var125 && class452.field6641 != var126) {
                    class485.method2895(new class251(var127, var128), 569086798, class503.field7500, var125, var124);
                    class158.method1031(class503.field7500, (byte) -109, var124, var125);
                }
            } else if (class237.field3375 == arg1) {
                int var129 = class486.field7134.method618((byte) 100);
                int var130 = (var129 >> 4 & 0x7) + class292.field4353;
                int var131 = (var129 & 0x7) + class156.field2263;
                int var132 = class486.field7134.method618((byte) 100);
                int var133 = var132 >> 2;
                int var134 = var132 & 0x3;
                int var135 = class341.field5384[var133];
                if (class228.method1564(-62, class51.field683) || var130 >= 0 && var131 >= 0 && var130 < class96.field1403 && var131 < class485.field7122) {
                    class501.method2989(var133, true, -1, var131, var130, 0, var134, class503.field7500, -1, var135);
                }
            } else if (class265.field3679 == arg1) {
                int var136 = class486.field7134.method606((byte) -55);
                int var137 = class486.field7134.method608(false);
                int var138 = (var137 >> 4 & 0x7) + class292.field4353;
                int var139 = class156.field2263 + (var137 & 0x7);
                int var140 = class486.field7134.method631(10494);
                if (var138 >= 0 && var139 >= 0 && class96.field1403 > var138 && var139 < class485.field7122) {
                    class485.method2895(new class251(var140, var136), 569086798, class503.field7500, var139, var138);
                    class158.method1031(class503.field7500, (byte) -75, var138, var139);
                }
            } else if (class389.field5906 == arg1) {
                int var141 = class486.field7134.method636(-2);
                int var142 = var141 >> 2;
                int var143 = var141 & 0x3;
                int var144 = class341.field5384[var142];
                int var145 = class486.field7134.method606((byte) -55);
                int var146 = class486.field7134.method636(-2);
                int var147 = (var146 >> 4 & 0x7) + class292.field4353;
                int var148 = (var146 & 0x7) + class156.field2263;
                if (class228.method1564(110, class51.field683) || var147 >= 0 && var148 >= 0 && var147 < class96.field1403 && class485.field7122 > var148) {
                    class501.method2989(var142, true, var145, var148, var147, 0, var143, class503.field7500, -1, var144);
                }
            } else if (class85.field1165 == arg1) {
                int var149 = class486.field7134.method618((byte) 100);
                int var150 = (var149 >> 4 & 0x7) + class292.field4353;
                int var151 = (var149 & 0x7) + class156.field2263;
                int var152 = class486.field7134.method631(10494);
                if (var152 == 65535) {
                    var152 = -1;
                }
                int var153 = class486.field7134.method618((byte) 100);
                int var154 = var153 >> 4 & 0xF;
                int var155 = var153 & 0x7;
                int var156 = class486.field7134.method618((byte) 100);
                int var157 = class486.field7134.method618((byte) 100);
                if (var150 >= 0 && var151 >= 0 && var150 < class96.field1403 && class485.field7122 > var151) {
                    int var158 = var154 + 1;
                    if (class339.field5365.field5339[0] >= (var150 - var158) && var150 + var158 >= class339.field5365.field5339[0] && (var151 - var158) <= class339.field5365.field5344[0] && (var151 + var158) >= class339.field5365.field5344[0]) {
                        class515.method3064(var157, var155, -112, (class503.field7500 << 24) + (var150 << 16) + (var151 << 8) + var154, var152, var156);
                    }
                }
            } else if (class495.field7239 == arg1) {
                int var159 = class486.field7134.method631(10494);
                int var160 = class486.field7134.method636(-2);
                int var161 = (var160 >> 4 & 0x7) + class292.field4353;
                int var162 = (var160 & 0x7) + class156.field2263;
                byte var163 = class486.field7134.method633(115);
                byte var164 = class486.field7134.method620(32131);
                byte var165 = class486.field7134.method619((byte) -23);
                int var166 = class486.field7134.method606((byte) -55);
                int var167 = class486.field7134.method636(-2);
                int var168 = var167 >> 2;
                int var169 = var167 & 0x3;
                byte var170 = class486.field7134.method619((byte) -23);
                int var171 = class486.field7134.method586(-126);
                int var172 = class486.field7134.method606((byte) -55);
                if (!class337.field5242.method1132()) {
                    class233.method1578(var171, -8835, var168, var161, class503.field7500, var172, var166, var169, var165, var159, var164, var170, var163, var162);
                }
            } else {
                class438.method2644("T3 - " + arg1, -1, null);
                class19.method146(0);
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Lmq;", line = 647)
    public final class54 method3057(int arg0, int arg1) {
        field7625++;
        class54 var3 = (class54) this.field7619.method1013((long) arg1, (byte) -106);
        if (arg0 != 64) {
            return null;
        } else if (var3 == null) {
            byte[] var4;
            if (arg1 < 32768) {
                var4 = this.field7620.method2650(arg1, -21, 1);
            } else {
                var4 = this.field7616.method2650(arg1 & 0x7FFF, -21, 1);
            }
            class54 var5 = new class54();
            var5.field734 = this;
            if (var4 != null) {
                var5.method361(-103, new class91(var4));
            }
            if (arg1 >= 32768) {
                var5.method364((byte) -71);
            }
            this.field7619.method1012(-127, (long) arg1, var5);
            return var5;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(JLwi;[II)Ljava/lang/String;", line = 682)
    public final String method3058(long arg0, class340 arg1, int[] arg2, int arg3) {
        field7626++;
        if (arg3 != -673) {
            this.method3057(-66, -104);
        }
        if (this.field7629 != null) {
            String var6 = this.field7629.method1683(arg2, arg3 + 606, arg0, arg1);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(ILns;Lns;Lgk;)V", line = 813)
    public class514(int arg0, class438 arg1, class438 arg2, class409 arg3) {
        this.field7629 = arg3;
        this.field7616 = arg2;
        this.field7620 = arg1;
        if (this.field7620 != null) {
            this.field7621 = this.field7620.method2645(1, 1);
        }
        if (this.field7616 != null) {
            this.field7627 = this.field7616.method2645(1, 1);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V", line = 707)
    public static void method3059(int arg0) {
        field7617 = null;
        if (arg0 > -39) {
            field7617 = null;
        }
        field7618 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(FFIIBIFI)[F", line = 719)
    public static final float[] method3060(float arg0, float arg1, int arg2, int arg3, byte arg4, int arg5, float arg6, int arg7) {
        field7624++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        var8[2] = var11;
        var8[6] = -var11;
        var8[8] = var10;
        float var12 = 1.0F - var10;
        var8[0] = var10;
        var8[1] = 0.0F;
        var8[7] = 0.0F;
        var8[3] = 0.0F;
        var8[4] = 1.0F;
        var8[5] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg7 / 32767.0F;
        float var16 = 0.0F;
        float var17 = 1.0F - var15;
        float var18 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var19 = (float) Math.sqrt((double) (arg2 * arg2 + arg5 * arg5));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg5) / var19;
                var16 = (float) arg2 / var19;
            }
            var13[1] = var16 * var18;
            var13[5] = var14 * var18;
            var13[7] = -var14 * var18;
            var13[2] = var14 * var16 * var17;
            var13[8] = var16 * var16 * var17 + var15;
            var13[3] = -var16 * var18;
            var13[6] = var14 * var16 * var17;
            var13[0] = var14 * var14 * var17 + var15;
            var13[4] = var15;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        if (arg4 <= 70) {
            method3055(-93, 78, 107);
        }
        var9[4] *= arg1;
        var9[2] *= arg6;
        var9[6] *= arg0;
        var9[8] *= arg0;
        var9[3] *= arg1;
        var9[5] *= arg1;
        var9[7] *= arg0;
        var9[0] *= arg6;
        var9[1] *= arg6;
        return var9;
    }
}
