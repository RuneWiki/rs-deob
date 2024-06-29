import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class549 extends class572 {

    @OriginalMember(owner = "client!oea", name = "K", descriptor = "[Lhea;")
    public static class374[] field8059 = new class374[14];

    @OriginalMember(owner = "client!oea", name = "M", descriptor = "Lvh;")
    public static class125 field8061 = new class125(27, 3);

    @OriginalMember(owner = "client!oea", name = "E", descriptor = "I")
    public static int field8053;

    @OriginalMember(owner = "client!oea", name = "F", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!oea", name = "G", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!oea", name = "H", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!oea", name = "I", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!oea", name = "J", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!oea", name = "L", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lqj;Z)V", line = 4)
    public static final void method3220(class511 arg0, boolean arg1) {
        ++field8056;
        if (class127.field2070 == arg0) {
            int var2 = class376.field5209.method2705(-122);
            int var3 = ((var2 & 113) >> 4) + class334.field4664;
            int var4 = (var2 & 7) + class475.field6809;
            int var5 = class376.field5209.method2755((byte) -48);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = class376.field5209.method2705(-70);
            int var7 = (250 & var6) >> 4;
            int var8 = 7 & var6;
            int var9 = class376.field5209.method2705(-94);
            int var10 = class376.field5209.method2705(-92);
            int var11 = class376.field5209.method2755((byte) -101);
            if (~var3 <= -1 && var4 >= 0 && var3 < class430.field6136 && var4 < class580.field8504) {
                int var12 = var7 - -1;
                if (-var12 + var3 <= class103.field1708.field2454[0] && var3 + var12 >= class103.field1708.field2454[0] && ~(-var12 + var4) >= ~class103.field1708.field2459[0] && var4 + var12 >= class103.field1708.field2459[0]) {
                    class386.method2362((class183.field2900 << 24) - -(var3 << 16) + (var4 << 8) + var7, var8, var5, (byte) 2, var9, false, var10, var11);
                }
            }
        } else if (class626.field8921 == arg0) {
            int var13 = class376.field5209.method2711(-122);
            int var14 = class376.field5209.method2705(-114);
            int var15 = (var14 & 7) + class475.field6809;
            int var16 = class63.field917 + var15;
            int var17 = ((var14 & 121) >> 4) + class334.field4664;
            int var18 = class143.field2474 + var17;
            class430 var19 = (class430) class480.field6870.method2818(-22803, (long) (var18 | var16 << 14 | class183.field2900 << 28));
            if (var19 != null) {
                for (class417 var20 = (class417) var19.field6133.method3905(-120); var20 != null; var20 = (class417) var19.field6133.method3899(0)) {
                    if ((32767 & var13) == var20.field5941) {
                        var20.method2549((byte) 68);
                        break;
                    }
                }
                if (var19.field6133.method3903(2)) {
                    var19.method2549((byte) -87);
                }
                if (~var17 <= -1 && var15 >= 0 && ~class430.field6136 < ~var17 && ~var15 > ~class580.field8504) {
                    class155.method1163((byte) -84, var15, class183.field2900, var17);
                }
            }
        } else if (class387.field5672 == arg0) {
            int var21 = class376.field5209.method2705(-29);
            int var22 = (var21 >> 4 & 7) + class334.field4664;
            int var23 = (var21 & 7) + class475.field6809;
            int var24 = class376.field5209.method2755((byte) -84);
            if (~var24 == -65536) {
                var24 = -1;
            }
            int var25 = class376.field5209.method2705(-51);
            int var26 = (var25 & 255) >> 4;
            int var27 = 7 & var25;
            int var28 = class376.field5209.method2705(-116);
            int var29 = class376.field5209.method2705(-76);
            int var30 = class376.field5209.method2755((byte) -62);
            if (var22 >= 0 && ~var23 <= -1 && var22 < class430.field6136 && class580.field8504 > var23) {
                int var31 = var26 - -1;
                if (~class103.field1708.field2454[0] <= ~(-var31 + var22) && ~(var22 - -var31) <= ~class103.field1708.field2454[0] && ~(-var31 + var23) >= ~class103.field1708.field2459[0] && class103.field1708.field2459[0] <= var23 + var31) {
                    class66.method544(var30, (class183.field2900 << 24) + (var22 << 16) - -(var23 << 8) + var26, -126, var28, var27, var24, var29);
                }
            }
        } else if (class250.field3618 == arg0) {
            int var32 = class376.field5209.method2705(-108);
            boolean var33 = ~(128 & var32) != -1;
            int var34 = (var32 >> 3 & 7) + class334.field4664;
            int var35 = (7 & var32) + class475.field6809;
            int var36 = class376.field5209.method2712(-71) + var34;
            int var37 = class376.field5209.method2712(-55) + var35;
            int var38 = class376.field5209.method2744(-1);
            int var39 = class376.field5209.method2755((byte) -70);
            int var40 = class376.field5209.method2705(-79) * 4;
            int var41 = class376.field5209.method2705(-46) * 4;
            int var42 = class376.field5209.method2755((byte) -72);
            int var43 = class376.field5209.method2755((byte) -90);
            int var44 = class376.field5209.method2705(-92);
            if (~var44 == -256) {
                var44 = -1;
            }
            int var45 = class376.field5209.method2755((byte) -51);
            if (~var34 <= -1 && ~var35 <= -1 && ~class430.field6136 < ~var34 && ~class580.field8504 < ~var35 && ~var36 <= -1 && ~var37 <= -1 && class430.field6136 > var36 && class580.field8504 > var37 && var39 != 65535) {
                int var46 = var37 * 512 + 256;
                int var47 = var40 << 2;
                int var48 = var34 * 512 + 256;
                int var49 = var41 << 2;
                int var50 = var35 * 512 + 256;
                int var51 = var45 << 2;
                int var52 = var36 * 512 + 256;
                class489 var53 = new class489(var39, class183.field2900, class183.field2900, var48, var50, var47, class148.field2508 + var42, class148.field2508 + var43, var44, var51, var38, var49, var33);
                var53.method2860(class148.field2508 + var42, (byte) 80, var46, var52, -var49 + class603.method3433(var46, class183.field2900, var52, -105));
                class557.field8142.method3904(new class133(var53), 0);
            }
        } else if (class63.field903 == arg0) {
            int var54 = class376.field5209.method2710((byte) 107);
            int var55 = class334.field4664 - -((var54 & 122) >> 4);
            int var56 = class475.field6809 - -(7 & var54);
            int var57 = class376.field5209.method2705(-41);
            int var58 = var57 >> 2;
            int var59 = var57 & 3;
            int var60 = class233.field3452[var58];
            int var61 = class376.field5209.method2736(!arg1);
            if (~var61 == -65536) {
                var61 = -1;
            }
            class293.method1793(var56, var59, (byte) -84, var61, var60, var58, var55, class183.field2900);
        } else {
            if (!arg1) {
                method3222(-60, true, -88, 27, 26, 88, 125);
            }
            if (class9.field120 == arg0) {
                int var62 = class376.field5209.method2705(-79);
                int var63 = (7 & var62 >> 4) + class334.field4664;
                int var64 = class475.field6809 - -(7 & var62);
                int var65 = class376.field5209.method2755((byte) -119);
                int var66 = class376.field5209.method2705(-100);
                int var67 = class376.field5209.method2755((byte) -66);
                int var68 = class376.field5209.method2705(-113);
                if (var63 >= 0 && var64 >= 0 && ~class430.field6136 < ~var63 && ~class580.field8504 < ~var64) {
                    int var69 = var63 * 512 + 256;
                    int var70 = var64 * 512 + 256;
                    int var71 = class183.field2900;
                    if (~var71 > -4 && class151.method1151(var64, var63, (byte) -49)) {
                        ++var71;
                    }
                    class202 var72 = new class202(var65, var67, class148.field2508, class183.field2900, var71, var69, -var66 + class603.method3433(var70, class183.field2900, var69, -125), var70, var63, var63, var64, var64, var68);
                    class396.field5740.method3904(new class582(var72), 0);
                }
            } else if (class86.field1285 == arg0) {
                int var73 = class376.field5209.method2711(-115);
                int var74 = class376.field5209.method2696(-1605640280);
                int var75 = class376.field5209.method2688(128);
                int var76 = (var75 & 7) + class475.field6809;
                int var77 = class63.field917 + var76;
                int var78 = class334.field4664 - -((121 & var75) >> 4);
                int var79 = class143.field2474 + var78;
                int var80 = class376.field5209.method2711(-114);
                if (class609.field8749 != var73) {
                    boolean var81 = ~var78 <= -1 && ~var76 <= -1 && class430.field6136 > var78 && ~var76 > ~class580.field8504;
                    if (var81 || class384.method2348(class121.field1983, (byte) -78)) {
                        class580.method3363((byte) -38, new class417(var74, var80), var79, var77, class183.field2900);
                        if (var81) {
                            class155.method1163((byte) -84, var76, class183.field2900, var78);
                        }
                    }
                }
            } else if (class457.field6572 == arg0) {
                int var82 = class376.field5209.method2705(-47);
                int var83 = (var82 & 7) + class475.field6809;
                int var84 = class63.field917 + var83;
                int var85 = ((122 & var82) >> 4) + class334.field4664;
                int var86 = var85 - -class143.field2474;
                int var87 = class376.field5209.method2755((byte) -83);
                int var88 = class376.field5209.method2755((byte) -92);
                int var89 = class376.field5209.method2755((byte) -126);
                if (class480.field6870 != null) {
                    class430 var90 = (class430) class480.field6870.method2818(-22803, (long) (var84 << 14 | class183.field2900 << 28 | var86));
                    if (var90 != null) {
                        for (class417 var91 = (class417) var90.field6133.method3905(-123); var91 != null; var91 = (class417) var90.field6133.method3899(0)) {
                            if ((32767 & var87) == var91.field5941 && ~var91.field5939 == ~var88) {
                                var91.method2549((byte) -38);
                                var91.field5939 = var89;
                                class580.method3363((byte) -38, var91, var86, var84, class183.field2900);
                                break;
                            }
                        }
                        if (~var85 <= -1 && ~var83 <= -1 && var85 < class430.field6136 && var83 < class580.field8504) {
                            class155.method1163((byte) -84, var83, class183.field2900, var85);
                        }
                    }
                }
            } else if (class235.field3482 == arg0) {
                int var92 = class376.field5209.method2711(-88);
                int var93 = class376.field5209.method2710((byte) 107);
                int var94 = var93 >> 2;
                int var95 = 3 & var93;
                int var96 = class233.field3452[var94];
                int var97 = class376.field5209.method2710((byte) 107);
                int var98 = ((var97 & 123) >> 4) + class334.field4664;
                int var99 = (var97 & 7) + class475.field6809;
                if (class384.method2348(class121.field1983, (byte) -79) || ~var98 <= -1 && ~var99 <= -1 && ~class430.field6136 < ~var98 && ~var99 > ~class580.field8504) {
                    class485.method2833(var92, var96, -1, class183.field2900, var95, var98, 0, var99, (byte) -42, var94);
                }
            } else if (class658.field9279 == arg0) {
                int var100 = class376.field5209.method2755((byte) -46);
                int var101 = class376.field5209.method2705(-69);
                class14.field224.method2834(0, var100).method955(92, var101);
            } else if (class293.field4085 == arg0) {
                int var102 = class376.field5209.method2705(-22);
                int var103 = class334.field4664 * 2 - -((254 & var102) >> 4);
                int var104 = (var102 & 15) + class475.field6809 * 2;
                int var105 = class376.field5209.method2705(-48);
                boolean var106 = (var105 & 1) != 0;
                int var107 = var105 >> 1;
                int var108 = class376.field5209.method2712(-70) + var103;
                int var109 = var104 - -class376.field5209.method2712(-78);
                int var110 = class376.field5209.method2744(-1);
                int var111 = class376.field5209.method2744(-1);
                int var112 = class376.field5209.method2755((byte) -80);
                byte var113 = class376.field5209.method2712(-80);
                int var114 = class376.field5209.method2705(-42) * 4;
                int var115 = class376.field5209.method2755((byte) -111);
                int var116 = class376.field5209.method2755((byte) -77);
                int var117 = class376.field5209.method2705(-109);
                if (~var117 == -256) {
                    var117 = -1;
                }
                int var118 = class376.field5209.method2755((byte) -44);
                if (~var103 <= -1 && var104 >= 0 && ~(class430.field6136 * 2) < ~var103 && class430.field6136 * 2 > var104 && var108 >= 0 && var109 >= 0 && class580.field8504 * 2 > var108 && ~var109 > ~(class580.field8504 * 2) && ~var112 != -65536) {
                    int var119 = var114 << 2;
                    int var120 = var103 * 256;
                    int var121 = var113 << 2;
                    int var122 = var108 * 256;
                    int var123 = var109 * 256;
                    int var124 = var118 << 2;
                    int var125 = var104 * 256;
                    if (~var110 != -1) {
                        class141 var126 = null;
                        if (var110 < 0) {
                            int var127 = -var110 + -1;
                            if (class609.field8749 == var127) {
                                var126 = class103.field1708;
                            } else {
                                var126 = class76.field1186[var127];
                            }
                        } else {
                            int var128 = var110 + -1;
                            class6 var129 = (class6) class314.field4359.method2818(-22803, (long) var128);
                            if (var129 != null) {
                                var126 = var129.field49;
                            }
                        }
                        if (var126 != null) {
                            class674 var130 = var126.method1093(true);
                            if (var130.field9600 != null && var130.field9600[var107] != null) {
                                int var131 = var130.field9600[var107][0];
                                int var132 = var130.field9600[var107][2];
                                int var133 = var126.field2410.method1720(16383);
                                int var134 = class302.field4241[var133];
                                int var135 = class302.field4242[var133];
                                int var136 = var131 * var135 + var132 * var134 >> 14;
                                int var137 = var132 * var135 + -(var131 * var134) >> 14;
                                var120 += var136;
                                var125 += var137;
                                var121 -= var130.field9600[var107][1];
                            }
                        }
                    }
                    class489 var139 = new class489(var112, class183.field2900, class183.field2900, var120, var125, var121, var115 - -class148.field2508, var116 - -class148.field2508, var117, var124, var111, var119, var106);
                    var139.method2860(class148.field2508 + var115, (byte) 80, var123, var122, class603.method3433(var123, class183.field2900, var122, -56) - var119);
                    class557.field8142.method3904(new class133(var139), 0);
                }
            } else if (class128.field2086 == arg0) {
                class376.field5209.method2705(-39);
                int var140 = class376.field5209.method2705(-85);
                int var141 = class334.field4664 - -(7 & var140 >> 4);
                int var142 = (var140 & 7) + class475.field6809;
                int var143 = class376.field5209.method2755((byte) -80);
                int var144 = class376.field5209.method2705(-65);
                int var145 = class376.field5209.method2714(true);
                String var146 = class376.field5209.method2717(true);
                class59.method504(var145, var144, var142, class183.field2900, var146, var143, var141, -128);
            } else if (class642.field9124 == arg0) {
                int var147 = class376.field5209.method2688(128);
                int var148 = var147 >> 2;
                int var149 = var147 & 3;
                int var150 = class233.field3452[var148];
                int var151 = class376.field5209.method2705(-91);
                int var152 = class334.field4664 - -(var151 >> 4 & 7);
                int var153 = (var151 & 7) + class475.field6809;
                if (class384.method2348(class121.field1983, (byte) -73) || var152 >= 0 && var153 >= 0 && ~var152 > ~class430.field6136 && ~var153 > ~class580.field8504) {
                    class485.method2833(-1, var150, -1, class183.field2900, var149, var152, 0, var153, (byte) -85, var148);
                }
            } else if (class689.field9777 != arg0) {
                if (class475.field6808 == arg0) {
                    int var162 = class376.field5209.method2705(-34);
                    int var163 = (var162 >> 4 & 15) + class334.field4664 * 2;
                    int var164 = (var162 & 15) + class475.field6809 * 2;
                    boolean var165 = ~class376.field5209.method2705(-126) != -1;
                    int var166 = class376.field5209.method2712(-108) + var163;
                    int var167 = class376.field5209.method2712(-97) + var164;
                    int var168 = class376.field5209.method2744(-1);
                    int var169 = class376.field5209.method2755((byte) -75);
                    int var170 = 4 * class376.field5209.method2705(-51);
                    int var171 = class376.field5209.method2705(-97) * 4;
                    int var172 = class376.field5209.method2755((byte) -73);
                    int var173 = class376.field5209.method2755((byte) -125);
                    int var174 = class376.field5209.method2705(-103);
                    if (~var174 == -256) {
                        var174 = -1;
                    }
                    int var175 = class376.field5209.method2755((byte) -95);
                    if (var163 >= 0 && var164 >= 0 && class430.field6136 * 2 > var163 && class430.field6136 * 2 > var164 && ~var166 <= -1 && ~var167 <= -1 && ~(class580.field8504 * 2) < ~var166 && ~var167 > ~(class580.field8504 * 2) && var169 != 65535) {
                        int var176 = var163 * 256;
                        int var177 = var175 << 2;
                        int var178 = var167 * 256;
                        int var179 = var170 << 2;
                        int var180 = var171 << 2;
                        int var181 = var166 * 256;
                        int var182 = var164 * 256;
                        class489 var183 = new class489(var169, class183.field2900, class183.field2900, var176, var182, var179, var172 - -class148.field2508, var173 - -class148.field2508, var174, var177, var168, var180, var165);
                        var183.method2860(class148.field2508 + var172, (byte) 113, var178, var181, -var180 + class603.method3433(var178, class183.field2900, var181, -92));
                        class557.field8142.method3904(new class133(var183), 0);
                    }
                } else {
                    class18.method200("T3 - " + arg0, (Throwable) null, 10296);
                    class352.method2133(32074, false);
                }
            } else {
                int var154 = class376.field5209.method2736(false);
                int var155 = class376.field5209.method2736(false);
                int var156 = class376.field5209.method2705(-114);
                int var157 = (var156 & 7) + class475.field6809;
                int var158 = class63.field917 + var157;
                int var159 = class334.field4664 - -(var156 >> 4 & 7);
                int var160 = class143.field2474 + var159;
                boolean var161 = ~var159 <= -1 && var157 >= 0 && var159 < class430.field6136 && ~class580.field8504 < ~var157;
                if (var161 || class384.method2348(class121.field1983, (byte) -117)) {
                    class580.method3363((byte) -38, new class417(var154, var155), var160, var158, class183.field2900);
                    if (var161) {
                        class155.method1163((byte) -84, var157, class183.field2900, var159);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lvo;Lvo;Lpaa;)V", line = 655)
    public class549(class345 arg0, class345 arg1, class580 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "(I)V", line = 658)
    public static void method3221(int arg0) {
        field8061 = null;
        if (arg0 < 61) {
            field8059 = null;
        }
        field8059 = null;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IZIIIII)V", line = 671)
    public static final void method3222(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8060;
        class522.field7694 = arg6;
        class583.field8546 = arg4;
        class88.field1318 = arg2;
        class6.field52 = arg5;
        class538.field7903 = arg0;
        if (arg1 && class6.field52 >= 100) {
            class551.field8078 = class88.field1318 * 512 - -256;
            class322.field4478 = class522.field7694 * 512 + 256;
            class277.field3933 = class603.method3433(class322.field4478, class416.field5926, class551.field8078, -115) - class538.field7903;
        }
        class40.field544 = 2;
        class76.field1181 = -1;
        class294.field4104 = -1;
        if (arg3 != 256) {
            method3225(45);
        }
    }

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "(I)V", line = 699)
    public static final void method3223(int arg0) {
        ++field8057;
        if (arg0 > 85) {
            if (class609.field8759 == null || class43.field587 == null) {
                class609.field8759 = new int[256];
                class43.field587 = new int[256];
                for (int var1 = 0; var1 < 256; ++var1) {
                    double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                    class609.field8759[var1] = (int) (Math.sin(var2) * 4096.0D);
                    class43.field587[var1] = (int) (4096.0D * Math.cos(var2));
                }
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIII)V", line = 730)
    public final void method3224(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8058;
        int var6 = super.field8408.method11();
        int var7 = ((class580) super.field576).field8507 * class640.method3602(0) / 10 % var6;
        super.field8408.method1632(-var6 + var7 + arg0, arg1, arg3 - var7 + var6, arg4);
        if (arg2 != 6) {
            field8059 = null;
        }
    }

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "(I)Z", line = 751)
    public static final boolean method3225(int arg0) {
        if (arg0 <= 22) {
            field8059 = null;
        }
        ++field8055;
        if (class318.field4389) {
            try {
                if ((Boolean) class157.method1180((byte) 82, class492.field7063, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(JIII)V", line = 772)
    public static final void method3226(long arg0, int arg1, int arg2, int arg3) {
        ++field8054;
        int var5 = ((int) arg0 & 522480) >> 14;
        int var6 = ((int) arg0 & 4152346) >> 20;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (arg2 != 15) {
            method3223(-16);
        }
        if (var5 != 10 && ~var5 != -12 && ~var5 != -23) {
            class534.method3135(arg3, var6, 0, arg2 + 62, 0, true, var5, 0, arg1);
        } else {
            class119 var8 = class14.field224.method2834(0, var7);
            int var9;
            int var10;
            if (~var6 != -1 && var6 != 2) {
                var9 = var8.field1876;
                var10 = var8.field1965;
            } else {
                var9 = var8.field1965;
                var10 = var8.field1876;
            }
            int var11 = var8.field1969;
            if (var6 != 0) {
                var11 = (var11 >> -var6 + 4) + (var11 << var6 & 15);
            }
            class534.method3135(arg3, 0, var9, -83, var10, true, 0, var11, arg1);
        }
    }
}
