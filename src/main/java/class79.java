import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class79 extends class263 {

    @OriginalMember(owner = "client!fca", name = "h", descriptor = "Z")
    public boolean field1022 = false;

    @OriginalMember(owner = "client!fca", name = "t", descriptor = "I")
    public int field1034 = -1;

    @OriginalMember(owner = "client!fca", name = "o", descriptor = "Luv;")
    public static class338 field1029 = new class338();

    @OriginalMember(owner = "client!fca", name = "s", descriptor = "Lgr;")
    public static class403 field1033 = new class403();

    @OriginalMember(owner = "client!fca", name = "g", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!fca", name = "j", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!fca", name = "k", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!fca", name = "l", descriptor = "I")
    public int field1026;

    @OriginalMember(owner = "client!fca", name = "m", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!fca", name = "n", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!fca", name = "p", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!fca", name = "q", descriptor = "I")
    public int field1031;

    @OriginalMember(owner = "client!fca", name = "r", descriptor = "I")
    public int field1032;

    @OriginalMember(owner = "client!fca", name = "i", descriptor = "Lpfa;")
    public static class275 field1023;

    @OriginalMember(owner = "client!fca", name = "u", descriptor = "[[Lrr;")
    public static class337[][] field1035;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)V")
    public static void method611(int arg0) {
        if (arg0 != 16123) {
            method612(null, -84);
        }
        field1035 = null;
        field1033 = null;
        field1029 = null;
        field1023 = null;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Luc;I)V")
    public static final void method612(class27 arg0, int arg1) {
        field1028++;
        if (class546.field6859 == arg0) {
            int var2 = class222.field2585.method3031(-1);
            int var3 = class222.field2585.method3054(-2);
            int var4 = class222.field2585.method3063(0);
            int var5 = class80.field1042 + (var4 & 0x7);
            int var6 = class522.field6612 + var5;
            int var7 = (var4 >> 4 & 0x7) + class581.field7825;
            int var8 = class227.field2938 + var7;
            boolean var9 = var7 >= 0 && var5 >= 0 && class85.field1090 > var7 && class656.field8932 > var5;
            if (var9 || class578.method3200(-83, class442.field5572)) {
                class215.method1249(class66.field798, new class40(var3, var2), 28469, var6, var8);
                if (var9) {
                    class391.method2224((byte) -123, var5, var7, class66.field798);
                }
            }
        } else if (class339.field4333 == arg0) {
            int var10 = class222.field2585.method3031(-1);
            int var11 = class222.field2585.method3097((byte) 12);
            class232.field3017.method2358(0, var10).method3789(-7344, var11);
        } else {
            if (arg1 > -54) {
                field1029 = null;
            }
            if (class621.field8428 == arg0) {
                int var12 = class222.field2585.method3097((byte) 12);
                boolean var13 = (var12 & 0x80) != 0;
                int var14 = class581.field7825 + ((var12 & 0x3F) >> 3);
                int var15 = (var12 & 0x7) + class80.field1042;
                int var16 = var14 + class222.field2585.method3083(255);
                int var17 = class222.field2585.method3083(255) + var15;
                int var18 = class222.field2585.method3086(65280);
                int var19 = class222.field2585.method3031(-1);
                int var20 = class222.field2585.method3097((byte) 12) * 4;
                int var21 = class222.field2585.method3097((byte) 12) * 4;
                int var22 = class222.field2585.method3031(-1);
                int var23 = class222.field2585.method3031(-1);
                int var24 = class222.field2585.method3097((byte) 12);
                if (var24 == 255) {
                    var24 = -1;
                }
                int var25 = class222.field2585.method3031(-1);
                if (var14 >= 0 && var15 >= 0 && class85.field1090 > var14 && class656.field8932 > var15 && var16 >= 0 && var17 >= 0 && class85.field1090 > var16 && class656.field8932 > var17 && var19 != 65535) {
                    int var26 = var17 * 512 + 256;
                    int var27 = var14 * 512 + 256;
                    int var28 = var21 << 2;
                    int var29 = var25 << 2;
                    int var30 = var16 * 512 + 256;
                    int var31 = var20 << 2;
                    int var32 = var15 * 512 + 256;
                    class487 var33 = new class487(var19, class66.field798, var27, var32, var31, class665.field9027 + var22, class665.field9027 + var23, var24, var29, var18, var28, var13);
                    var33.method2645(var26, class665.field9027 + var22, false, class514.method2798(var26, var30, class66.field798, (byte) 77) - var28, var30);
                    class659.field8945.method1904(new class232(var33), -66);
                }
            } else if (class388.field4971 == arg0) {
                int var34 = class222.field2585.method3097((byte) 12);
                int var35 = (var34 >> 4 & 0x7) + class581.field7825;
                int var36 = (var34 & 0x7) + class80.field1042;
                int var37 = class222.field2585.method3031(-1);
                int var38 = class222.field2585.method3097((byte) 12);
                int var39 = class222.field2585.method3031(-1);
                int var40 = class222.field2585.method3097((byte) 12);
                if (var35 >= 0 && var36 >= 0 && var35 < class85.field1090 && class656.field8932 > var36) {
                    int var41 = var35 * 512 + 256;
                    int var42 = var36 * 512 + 256;
                    int var43 = class66.field798;
                    if (var43 < 3 && class407.method2284(73, var35, var36)) {
                        var43++;
                    }
                    class367 var44 = new class367(var37, var39, class665.field9027, class66.field798, var43, var41, class514.method2798(var42, var41, class66.field798, (byte) 92) - var38, var42, var35, var35, var36, var36, var40);
                    class301.field3832.method1904(new class210(var44), -38);
                }
            } else if (class200.field2326 == arg0) {
                int var45 = class222.field2585.method3096(-14);
                int var46 = class222.field2585.method3097((byte) 12);
                int var47 = (var46 & 0x7) + class80.field1042;
                int var48 = class522.field6612 + var47;
                int var49 = class581.field7825 + (var46 >> 4 & 0x7);
                int var50 = class227.field2938 + var49;
                class62 var51 = (class62) class370.field4774.method3828((long) (class66.field798 << 28 | var48 << 14 | var50), (byte) -91);
                if (var51 != null) {
                    for (class40 var52 = (class40) var51.field766.method1909(true); var52 != null; var52 = (class40) var51.field766.method1916((byte) 125)) {
                        if ((var45 & 0x7FFF) == var52.field580) {
                            var52.method1566(-68);
                            break;
                        }
                    }
                    if (var51.field766.method1908((byte) -118)) {
                        var51.method1566(-82);
                    }
                    if (var49 >= 0 && var47 >= 0 && class85.field1090 > var49 && var47 < class656.field8932) {
                        class391.method2224((byte) 107, var47, var49, class66.field798);
                    }
                }
            } else if (class580.field7768 == arg0) {
                int var53 = class222.field2585.method3097((byte) 12);
                int var54 = ((var53 & 0x76) >> 4) + class581.field7825;
                int var55 = class80.field1042 + (var53 & 0x7);
                int var56 = class222.field2585.method3031(-1);
                if (var56 == 65535) {
                    var56 = -1;
                }
                int var57 = class222.field2585.method3097((byte) 12);
                int var58 = var57 >> 4 & 0xF;
                int var59 = var57 & 0x7;
                int var60 = class222.field2585.method3097((byte) 12);
                int var61 = class222.field2585.method3097((byte) 12);
                if (var54 >= 0 && var55 >= 0 && var54 < class85.field1090 && class656.field8932 > var55) {
                    int var62 = var58 + 1;
                    if ((var54 - var62) <= class67.field815.field508[0] && class67.field815.field508[0] <= (var54 + var62) && class67.field815.field511[0] >= (var55 - var62) && var55 + var62 >= class67.field815.field511[0]) {
                        class415.method2312(var61, var56, var60, var59, (class66.field798 << 24) + (var54 << 16) + (var55 << 8) + var58, -1);
                    }
                }
            } else if (class522.field6598 == arg0) {
                int var63 = class222.field2585.method3097((byte) 12);
                int var64 = ((var63 & 0xFB) >> 4) + class581.field7825 * 2;
                int var65 = class80.field1042 * 2 + (var63 & 0xF);
                boolean var66 = class222.field2585.method3097((byte) 12) != 0;
                int var67 = var64 + class222.field2585.method3083(255);
                int var68 = var65 + class222.field2585.method3083(255);
                int var69 = class222.field2585.method3086(65280);
                int var70 = class222.field2585.method3031(-1);
                int var71 = class222.field2585.method3097((byte) 12) * 4;
                int var72 = class222.field2585.method3097((byte) 12) * 4;
                int var73 = class222.field2585.method3031(-1);
                int var74 = class222.field2585.method3031(-1);
                int var75 = class222.field2585.method3097((byte) 12);
                if (var75 == 255) {
                    var75 = -1;
                }
                int var76 = class222.field2585.method3031(-1);
                if (var64 >= 0 && var65 >= 0 && (class85.field1090 * 2) > var64 && (class85.field1090 * 2) > var65 && var67 >= 0 && var68 >= 0 && var67 < class656.field8932 * 2 && var68 < class656.field8932 * 2 && var70 != 65535) {
                    int var77 = var68 * 256;
                    int var78 = var76 << 2;
                    int var79 = var64 * 256;
                    int var80 = var67 * 256;
                    int var81 = var71 << 2;
                    int var82 = var72 << 2;
                    int var83 = var65 * 256;
                    class487 var84 = new class487(var70, class66.field798, var79, var83, var81, class665.field9027 + var73, class665.field9027 + var74, var75, var78, var69, var82, var66);
                    var84.method2645(var77, class665.field9027 + var73, false, class514.method2798(var77, var80, class66.field798, (byte) 124) - var82, var80);
                    class659.field8945.method1904(new class232(var84), -111);
                }
            } else if (class356.field4592 == arg0) {
                int var85 = class222.field2585.method3097((byte) 12);
                int var86 = ((var85 & 0x7B) >> 4) + class581.field7825;
                int var87 = (var85 & 0x7) + class80.field1042;
                int var88 = class222.field2585.method3031(-1);
                if (var88 == 65535) {
                    var88 = -1;
                }
                int var89 = class222.field2585.method3097((byte) 12);
                int var90 = var89 >> 4 & 0xF;
                int var91 = var89 & 0x7;
                int var92 = class222.field2585.method3097((byte) 12);
                int var93 = class222.field2585.method3097((byte) 12);
                if (var86 >= 0 && var87 >= 0 && class85.field1090 > var86 && class656.field8932 > var87) {
                    int var94 = var90 + 1;
                    if (class67.field815.field508[0] >= var86 - var94 && class67.field815.field508[0] <= (var86 + var94) && (var87 - var94) <= class67.field815.field511[0] && class67.field815.field511[0] <= var87 + var94) {
                        class167.method1016(var93, var88, var92, false, (byte) -91, var91, (class66.field798 << 24) + (var86 << 16) - (-(var87 << 8) + -var90));
                    }
                }
            } else if (class479.field5959 == arg0) {
                int var95 = class222.field2585.method3054(-2);
                int var96 = class222.field2585.method3097((byte) 12);
                int var97 = class581.field7825 + (var96 >> 4 & 0x7);
                int var98 = class80.field1042 + (var96 & 0x7);
                int var99 = class222.field2585.method3097((byte) 12);
                int var100 = var99 >> 2;
                int var101 = var99 & 0x3;
                int var102 = class158.field1876[var100];
                if (class578.method3200(-90, class442.field5572) || var97 >= 0 && var98 >= 0 && class85.field1090 > var97 && class656.field8932 > var98) {
                    class95.method708(0, -1, var102, var101, -84, var100, var95, class66.field798, var98, var97);
                }
            } else if (class311.field3915 == arg0) {
                int var103 = class222.field2585.method3063(0);
                int var104 = (var103 & 0x7) + class80.field1042;
                int var105 = class522.field6612 + var104;
                int var106 = ((var103 & 0x76) >> 4) + class581.field7825;
                int var107 = var106 + class227.field2938;
                int var108 = class222.field2585.method3096(-117);
                int var109 = class222.field2585.method3031(-1);
                int var110 = class222.field2585.method3054(-2);
                if (class350.field4523 != var110) {
                    boolean var111 = var106 >= 0 && var104 >= 0 && var106 < class85.field1090 && class656.field8932 > var104;
                    if (var111 || class578.method3200(-113, class442.field5572)) {
                        class215.method1249(class66.field798, new class40(var108, var109), 28469, var105, var107);
                        if (var111) {
                            class391.method2224((byte) 19, var104, var106, class66.field798);
                        }
                    }
                }
            } else if (class323.field4025 == arg0) {
                int var112 = class222.field2585.method3097((byte) 12);
                int var113 = class581.field7825 * 2 + (var112 >> 4 & 0xF);
                int var114 = class80.field1042 * 2 + (var112 & 0xF);
                boolean var115 = class222.field2585.method3097((byte) 12) != 0;
                int var116 = var113 + class222.field2585.method3083(255);
                int var117 = var114 + class222.field2585.method3083(255);
                int var118 = class222.field2585.method3086(65280);
                int var119 = class222.field2585.method3086(65280);
                int var120 = class222.field2585.method3031(-1);
                byte var121 = class222.field2585.method3083(255);
                int var122 = class222.field2585.method3097((byte) 12) * 4;
                int var123 = class222.field2585.method3031(-1);
                int var124 = class222.field2585.method3031(-1);
                int var125 = class222.field2585.method3097((byte) 12);
                if (var125 == 255) {
                    var125 = -1;
                }
                int var126 = class222.field2585.method3031(-1);
                if (var113 >= 0 && var114 >= 0 && var113 < (class85.field1090 * 2) && (class85.field1090 * 2) > var114 && var116 >= 0 && var117 >= 0 && var116 < (class656.field8932 * 2) && class656.field8932 * 2 > var117 && var120 != 65535) {
                    int var127 = var114 * 256;
                    int var128 = var122 << 2;
                    int var129 = var121 << 2;
                    int var130 = var117 * 256;
                    int var131 = var126 << 2;
                    int var132 = var116 * 256;
                    int var133 = var113 * 256;
                    if (var118 != 0) {
                        class32 var134 = null;
                        int var137;
                        if (var118 < 0) {
                            int var135 = -var118 - 1;
                            int var136 = var135 & 0x7FF;
                            var137 = (var135 & 0x7D05) >> 11;
                            if (class350.field4523 == var136) {
                                var134 = class67.field815;
                            } else {
                                var134 = class132.field1601[var136];
                            }
                        } else {
                            int var138 = var118 - 1;
                            int var139 = var138 & 0x7FF;
                            var137 = (var138 & 0x7F51) >> 11;
                            class704 var140 = (class704) class168.field1973.method3828((long) var139, (byte) -91);
                            if (var140 != null) {
                                var134 = var140.field9854;
                            }
                        }
                        if (var134 != null) {
                            class403 var141 = var134.method209(2);
                            if (var141.field5180 != null && var141.field5180[var137] != null) {
                                int var142 = var141.field5180[var137][0];
                                int var143 = var141.field5180[var137][2];
                                int var144 = var134.field477.method2388(-71);
                                int var145 = class243.field3129[var144];
                                int var146 = class243.field3128[var144];
                                int var147 = var142 * var146 + var143 * var145 >> 14;
                                int var148 = var143 * var146 - (var142 * var145) >> 14;
                                var129 -= var141.field5180[var137][1];
                                var133 += var147;
                                var127 += var148;
                            }
                        }
                    }
                    class487 var150 = new class487(var120, class66.field798, var133, var127, var129, class665.field9027 + var123, class665.field9027 + var124, var125, var131, var119, var128, var115);
                    var150.method2645(var130, class665.field9027 + var123, false, class514.method2798(var130, var132, class66.field798, (byte) 107) - var128, var132);
                    class659.field8945.method1904(new class232(var150), -98);
                }
            } else if (class175.field2049 == arg0) {
                int var151 = class222.field2585.method3097((byte) 12);
                int var152 = (var151 & 0x7) + class80.field1042;
                int var153 = class522.field6612 + var152;
                int var154 = ((var151 & 0x73) >> 4) + class581.field7825;
                int var155 = class227.field2938 + var154;
                int var156 = class222.field2585.method3031(-1);
                int var157 = class222.field2585.method3031(-1);
                int var158 = class222.field2585.method3031(-1);
                if (class370.field4774 != null) {
                    class62 var159 = (class62) class370.field4774.method3828((long) (var153 << 14 | class66.field798 << 28 | var155), (byte) -91);
                    if (var159 != null) {
                        for (class40 var160 = (class40) var159.field766.method1909(true); var160 != null; var160 = (class40) var159.field766.method1916((byte) 126)) {
                            if ((var156 & 0x7FFF) == var160.field580 && var160.field578 == var157) {
                                var160.method1566(-102);
                                var160.field578 = var158;
                                class215.method1249(class66.field798, var160, 28469, var153, var155);
                                break;
                            }
                        }
                        if (var154 >= 0 && var152 >= 0 && class85.field1090 > var154 && var152 < class656.field8932) {
                            class391.method2224((byte) 4, var152, var154, class66.field798);
                        }
                    }
                }
            } else if (class360.field4620 == arg0) {
                int var161 = class222.field2585.method3068((byte) -127);
                int var162 = class581.field7825 + (var161 >> 4 & 0x7);
                int var163 = (var161 & 0x7) + class80.field1042;
                int var164 = class222.field2585.method3096(-39);
                byte var165 = class222.field2585.method3066(27382);
                int var166 = class222.field2585.method3054(-2);
                int var167 = class222.field2585.method3031(-1);
                byte var168 = class222.field2585.method3087(58);
                int var169 = class222.field2585.method3076((byte) 111);
                int var170 = var169 >> 2;
                int var171 = var169 & 0x3;
                int var172 = class222.field2585.method3035(22401);
                byte var173 = class222.field2585.method3083(255);
                byte var174 = class222.field2585.method3095(0);
                if (!class309.field3898.method419()) {
                    class22.method142(var172, var170, var164, var163, var166, var162, var171, var173, var167, -111, var174, var168, class66.field798, var165);
                }
            } else if (class706.field9869 == arg0) {
                class222.field2585.method3097((byte) 12);
                int var175 = class222.field2585.method3097((byte) 12);
                int var176 = (var175 >> 4 & 0x7) + class581.field7825;
                int var177 = (var175 & 0x7) + class80.field1042;
                int var178 = class222.field2585.method3031(-1);
                int var179 = class222.field2585.method3097((byte) 12);
                int var180 = class222.field2585.method3059(1);
                String var181 = class222.field2585.method3072(255);
                class631.method3544(var181, var177, var178, class66.field798, (byte) -119, var180, var179, var176);
            } else if (class340.field4338 == arg0) {
                int var182 = class222.field2585.method3076((byte) 105);
                int var183 = var182 >> 2;
                int var184 = var182 & 0x3;
                int var185 = class158.field1876[var183];
                int var186 = class222.field2585.method3031(-1);
                if (var186 == 65535) {
                    var186 = -1;
                }
                int var187 = class222.field2585.method3076((byte) 107);
                int var188 = class581.field7825 + (var187 >> 4 & 0x7);
                int var189 = (var187 & 0x7) + class80.field1042;
                class235.method1420(var189, var184, var183, var188, var185, var186, -3, class66.field798);
            } else if (class228.field2951 == arg0) {
                int var190 = class222.field2585.method3063(0);
                int var191 = ((var190 & 0x7F) >> 4) + class581.field7825;
                int var192 = (var190 & 0x7) + class80.field1042;
                int var193 = class222.field2585.method3063(0);
                int var194 = var193 >> 2;
                int var195 = var193 & 0x3;
                int var196 = class158.field1876[var194];
                if (class578.method3200(-123, class442.field5572) || var191 >= 0 && var192 >= 0 && class85.field1090 > var191 && var192 < class656.field8932) {
                    class95.method708(0, -1, var196, var195, -16, var194, -1, class66.field798, var192, var191);
                }
            } else {
                class564.method2994((byte) 34, "T3 - " + arg0, null);
                class349.method2010(false, true);
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IB)V")
    public static final void method613(int arg0, byte arg1) {
        class208 var2 = class442.field5559;
        synchronized (class442.field5559) {
            int var3 = 97 / ((arg1 + 32) / 56);
            class442.field5559.method1222(14564, arg0);
        }
        field1030++;
        class208 var4 = class392.field5012;
        synchronized (class392.field5012) {
            class392.field5012.method1222(14564, arg0);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method614(String arg0, int arg1) {
        field1027++;
        if (arg1 != 1) {
            field1029 = null;
        }
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class279.method1680(arg1 ^ 0xFFFFF690, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class284.field3600; var3++) {
            String var4 = class136.field1659[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class279.method1680(-2415, var4);
            if (var5 != null && var5.equals(var2)) {
                class284.field3600--;
                for (int var6 = var3; var6 < class284.field3600; var6++) {
                    class136.field1659[var6] = class136.field1659[var6 + 1];
                    class392.field5015[var6] = class392.field5015[var6 + 1];
                    class618.field8380[var6] = class618.field8380[var6 + 1];
                    class413.field5289[var6] = class413.field5289[var6 + 1];
                    class65.field790[var6] = class65.field790[var6 + 1];
                    class267.field3373[var6] = class267.field3373[var6 + 1];
                }
                class456.field5692++;
                class78.field1019 = class696.field9643;
                class124 var7 = class336.method1924(class343.field4368, class636.field8620, (byte) 93);
                var7.field1516.method3090(class680.method3757((byte) 60, arg0), arg1 ^ 0x2);
                var7.field1516.method3050(false, arg0);
                class197.method1156((byte) 113, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(I)V")
    public class79(int arg0) {
        this.field1034 = arg0;
    }
}
