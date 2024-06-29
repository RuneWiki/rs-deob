import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class691 extends class259 {

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "Llc;")
    public static class435 field9795 = new class435(79, -2);

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    public static int field9797 = 0;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "[I")
    public static int[] field9798 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "Lae;")
    public static class351 field9799 = new class351();

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public static int field9796;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "Lip;")
    public static class304 field9800;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)V")
    public static void method3904(int arg0) {
        field9800 = null;
        field9795 = null;
        field9798 = null;
        field9799 = null;
        if (arg0 != -1) {
            field9799 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BLufa;)V")
    public static final void method3905(byte arg0, class740 arg1) {
        field9796++;
        if (class348.field5136 == arg1) {
            int var2 = class352.field5213.method2886(true);
            int var3 = class182.field2506 + ((var2 & 0x71) >> 4);
            int var4 = (var2 & 0x7) + class95.field1382;
            int var5 = class352.field5213.method2882(-1);
            int var6 = class352.field5213.method2886(true);
            int var7 = class352.field5213.method2882(-1);
            int var8 = class352.field5213.method2886(true);
            if (var3 >= 0 && var4 >= 0 && class184.field2546 > var3 && class240.field3555 > var4) {
                int var9 = var3 * 512 + 256;
                int var10 = var4 * 512 + 256;
                int var11 = class214.field3213;
                if (var11 < 3 && class547.method3292((byte) -128, var4, var3)) {
                    var11++;
                }
                class124 var12 = new class124(var5, var7, class703.field9918, class214.field3213, var11, var9, class530.method3211(var10, 2, var9, class214.field3213) - var6, var10, var3, var3, var4, var4, var8);
                class23.field214.method3559(new class137(var12), (byte) 12);
            }
        } else if (class364.field5326 == arg1) {
            int var13 = class352.field5213.method2897(65280);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = class352.field5213.method2904(59);
            int var15 = var14 >> 2;
            int var16 = var14 & 0x3;
            int var17 = class646.field9310[var15];
            int var18 = class352.field5213.method2920(-27357);
            int var19 = class182.field2506 + (var18 >> 4 & 0x7);
            int var20 = (var18 & 0x7) + class95.field1382;
            class443.method2710(class214.field3213, var16, var19, var13, var15, -10439, var17, var20);
        } else if (class598.field8510 == arg1) {
            int var21 = class352.field5213.method2920(-27357);
            int var22 = var21 >> 2;
            int var23 = var21 & 0x3;
            int var24 = class646.field9310[var22];
            int var25 = class352.field5213.method2886(true);
            int var26 = class182.field2506 + (var25 >> 4 & 0x7);
            int var27 = class95.field1382 + (var25 & 0x7);
            if (class697.method3923(class445.field6361, 5626) || var26 >= 0 && var27 >= 0 && class184.field2546 > var26 && class240.field3555 > var27) {
                class367.method2306(var26, var22, 0, -1, class214.field3213, var23, -1, var24, var27, arg0 ^ 0x71);
            }
        } else if (class262.field3767 == arg1) {
            int var28 = class352.field5213.method2904(62);
            int var29 = class182.field2506 + (var28 >> 4 & 0x7);
            int var30 = (var28 & 0x7) + class95.field1382;
            int var31 = class352.field5213.method2920(-27357);
            int var32 = var31 >> 2;
            int var33 = var31 & 0x3;
            int var34 = class646.field9310[var32];
            int var35 = class352.field5213.method2882(-1);
            if (class697.method3923(class445.field6361, 5626) || var29 >= 0 && var30 >= 0 && var29 < class184.field2546 && class240.field3555 > var30) {
                class367.method2306(var29, var32, 0, var35, class214.field3213, var33, -1, var34, var30, 1);
            }
        } else if (class22.field209 == arg1) {
            int var36 = class352.field5213.method2882(arg0 - 113);
            int var37 = class352.field5213.method2886(true);
            class375.field5421.method2680(var36, (byte) 90).method2944(88, var37);
        } else if (class520.field7505 == arg1) {
            int var38 = class352.field5213.method2886(true);
            int var39 = (var38 >> 4 & 0x7) + class182.field2506;
            int var40 = (var38 & 0x7) + class95.field1382;
            int var41 = class352.field5213.method2882(-1);
            if (var41 == 65535) {
                var41 = -1;
            }
            int var42 = class352.field5213.method2886(true);
            int var43 = var42 >> 4 & 0xF;
            int var44 = var42 & 0x7;
            int var45 = class352.field5213.method2886(true);
            int var46 = class352.field5213.method2886(true);
            int var47 = class352.field5213.method2882(arg0 - 113);
            if (var39 >= 0 && var40 >= 0 && class184.field2546 > var39 && class240.field3555 > var40) {
                int var48 = var43 + 1;
                if (class108.field1536.field4646[0] >= var39 - var48 && var39 + var48 >= class108.field1536.field4646[0] && var40 - var48 <= class108.field1536.field4645[0] && var40 + var48 >= class108.field1536.field4645[0]) {
                    class670.method3820(var41, var46, var45, var44, (class214.field3213 << 24) + var43 + (var39 << 16) + (var40 << 8), arg0 ^ 0x70, false, var47);
                }
            }
        } else if (class684.field9722 == arg1) {
            int var49 = class352.field5213.method2883(-2);
            int var50 = class352.field5213.method2924((byte) -105);
            int var51 = (var50 & 0x7) + class95.field1382;
            int var52 = class71.field1085 + var51;
            int var53 = class182.field2506 + (var50 >> 4 & 0x7);
            int var54 = var53 + class41.field693;
            class340 var55 = (class340) class591.field8409.method4020((long) (var54 | class214.field3213 << 28 | var52 << 14), (byte) -61);
            if (var55 != null) {
                for (class428 var56 = (class428) var55.field4685.method3565(arg0 + 15); var56 != null; var56 = (class428) var55.field4685.method3561((byte) 75)) {
                    if ((var49 & 0x7FFF) == var56.field6169) {
                        var56.method2656((byte) 118);
                        break;
                    }
                }
                if (var55.field4685.method3555(arg0 ^ 0x28)) {
                    var55.method2656((byte) 127);
                }
                if (var53 >= 0 && var51 >= 0 && var53 < class184.field2546 && var51 < class240.field3555) {
                    class623.method3600((byte) -127, var51, class214.field3213, var53);
                }
            }
        } else if (class383.field5538 == arg1) {
            int var57 = class352.field5213.method2886(true);
            int var58 = ((var57 & 0xF8) >> 4) + class182.field2506 * 2;
            int var59 = (var57 & 0xF) + class95.field1382 * 2;
            int var60 = class352.field5213.method2886(true);
            boolean var61 = (var60 & 0x1) != 0;
            boolean var62 = (var60 & 0x2) != 0;
            int var63 = var62 ? var60 >> 2 : -1;
            int var64 = var58 + class352.field5213.method2915(-112);
            int var65 = class352.field5213.method2915(arg0 ^ 0xFFFFFFE0) + var59;
            int var66 = class352.field5213.method2870(arg0 - 11507);
            int var67 = class352.field5213.method2870(-11395);
            int var68 = class352.field5213.method2882(-1);
            int var69 = class352.field5213.method2886(true);
            int var70;
            if (var62) {
                var70 = (byte) var69;
            } else {
                var70 = var69 * 4;
            }
            int var71 = class352.field5213.method2886(true) * 4;
            int var72 = class352.field5213.method2882(-1);
            int var73 = class352.field5213.method2882(-1);
            int var74 = class352.field5213.method2886(true);
            int var75 = class352.field5213.method2882(-1);
            if (var74 == 255) {
                var74 = -1;
            }
            if (var58 >= 0 && var59 >= 0 && var58 < class184.field2546 * 2 && (class184.field2546 * 2) > var59 && var64 >= 0 && var65 >= 0 && var64 < (class240.field3555 * 2) && class240.field3555 * 2 > var65 && var68 != 65535) {
                int var76 = var70 << 2;
                int var77 = var64 * 256;
                int var78 = var65 * 256;
                int var79 = var75 << 2;
                int var80 = var71 << 2;
                int var81 = var59 * 256;
                int var82 = var58 * 256;
                if (var66 != 0 && var63 != -1) {
                    class335 var83 = null;
                    if (var66 >= 0) {
                        int var84 = var66 - 1;
                        class63 var85 = (class63) class389.field5608.method4020((long) var84, (byte) -82);
                        if (var85 != null) {
                            var83 = var85.field1004;
                        }
                    } else {
                        int var86 = -var66 - 1;
                        if (class652.field9348 == var86) {
                            var83 = class108.field1536;
                        } else {
                            var83 = class536.field7796[var86];
                        }
                    }
                    if (var83 != null) {
                        class83 var87 = var83.method2052(-5569);
                        if (var87.field1237 != null && var87.field1237[var63] != null) {
                            var76 -= var87.field1237[var63][1];
                        }
                        if (var87.field1188 != null && var87.field1188[var63] != null) {
                            var76 -= var87.field1188[var63][1];
                        }
                    }
                }
                class185 var88 = new class185(var68, class214.field3213, class214.field3213, var82, var81, var76, class703.field9918 + var72, var73 - -class703.field9918, var74, var79, var66, var67, var80, var61, var63);
                var88.method1313(class703.field9918 + var72, var78, var77, class530.method3211(var78, 2, var77, class214.field3213) - var80, -62);
                class627.field8893.method3559(new class262(var88), (byte) 12);
            }
        } else if (class623.field8865 == arg1) {
            class352.field5213.method2886(true);
            int var89 = class352.field5213.method2886(true);
            int var90 = ((var89 & 0x74) >> 4) + class182.field2506;
            int var91 = class95.field1382 + (var89 & 0x7);
            int var92 = class352.field5213.method2882(arg0 - 113);
            int var93 = class352.field5213.method2886(true);
            int var94 = class352.field5213.method2865(arg0 ^ 0x8F);
            String var95 = class352.field5213.method2894(-13192);
            class266.method1752(var93, (byte) 120, var90, var91, var95, var94, class214.field3213, var92);
        } else if (class72.field1095 == arg1) {
            int var96 = class352.field5213.method2892((byte) 51);
            int var97 = class352.field5213.method2882(-1);
            int var98 = class352.field5213.method2920(-27357);
            int var99 = (var98 & 0x7) + class95.field1382;
            int var100 = class71.field1085 + var99;
            int var101 = ((var98 & 0x77) >> 4) + class182.field2506;
            int var102 = var101 + class41.field693;
            int var103 = class352.field5213.method2882(-1);
            if (class652.field9348 != var97) {
                boolean var104 = var101 >= 0 && var99 >= 0 && var101 < class184.field2546 && class240.field3555 > var99;
                if (var104 || class697.method3923(class445.field6361, 5626)) {
                    class638.method3679(var102, var100, arg0 ^ 0xFFFFFFE6, class214.field3213, new class428(var96, var103));
                    if (var104) {
                        class623.method3600((byte) -112, var99, class214.field3213, var101);
                    }
                }
            }
        } else if (class463.field6605 == arg1) {
            int var105 = class352.field5213.method2886(true);
            int var106 = ((var105 & 0x79) >> 4) + class182.field2506;
            int var107 = (var105 & 0x7) + class95.field1382;
            int var108 = class352.field5213.method2882(-1);
            if (var108 == 65535) {
                var108 = -1;
            }
            int var109 = class352.field5213.method2886(true);
            int var110 = (var109 & 0xFA) >> 4;
            int var111 = var109 & 0x7;
            int var112 = class352.field5213.method2886(true);
            int var113 = class352.field5213.method2886(true);
            int var114 = class352.field5213.method2882(-1);
            if (var106 >= 0 && var107 >= 0 && var106 < class184.field2546 && var107 < class240.field3555) {
                int var115 = var110 + 1;
                if ((var106 - var115) <= class108.field1536.field4646[0] && class108.field1536.field4646[0] <= (var106 + var115) && class108.field1536.field4645[0] >= var107 - var115 && class108.field1536.field4645[0] <= (var107 + var115)) {
                    class68.method600(var114, (var107 << 8) + (class214.field3213 << 24) + (var106 << 16) + var110, var113, var112, var111, var108, false);
                }
            }
        } else if (class325.field4403 == arg1) {
            int var116 = class352.field5213.method2904(62);
            int var117 = (var116 & 0x7) + class95.field1382;
            int var118 = class71.field1085 + var117;
            int var119 = ((var116 & 0x70) >> 4) + class182.field2506;
            int var120 = class41.field693 + var119;
            int var121 = class352.field5213.method2882(-1);
            int var122 = class352.field5213.method2892((byte) 51);
            boolean var123 = var119 >= 0 && var117 >= 0 && var119 < class184.field2546 && class240.field3555 > var117;
            if (var123 || class697.method3923(class445.field6361, 5626)) {
                class638.method3679(var120, var118, arg0 ^ 0xFFFFFF93, class214.field3213, new class428(var122, var121));
                if (var123) {
                    class623.method3600((byte) -108, var117, class214.field3213, var119);
                }
            }
        } else if (class663.field9469 == arg1) {
            int var124 = class352.field5213.method2886(true);
            boolean var125 = (var124 & 0x80) != 0;
            int var126 = (var124 >> 3 & 0x7) + class182.field2506;
            int var127 = class95.field1382 + (var124 & 0x7);
            int var128 = class352.field5213.method2915(arg0 ^ 0xFFFFFFE8) + var126;
            int var129 = class352.field5213.method2915(-118) + var127;
            int var130 = class352.field5213.method2870(-11395);
            int var131 = class352.field5213.method2882(-1);
            int var132 = class352.field5213.method2886(true) * 4;
            int var133 = class352.field5213.method2886(true) * 4;
            int var134 = class352.field5213.method2882(-1);
            int var135 = class352.field5213.method2882(-1);
            int var136 = class352.field5213.method2886(true);
            if (var136 == 255) {
                var136 = -1;
            }
            int var137 = class352.field5213.method2882(-1);
            if (var126 >= 0 && var127 >= 0 && var126 < class184.field2546 && class240.field3555 > var127 && var128 >= 0 && var129 >= 0 && class184.field2546 > var128 && var129 < class240.field3555 && var131 != 65535) {
                int var138 = var129 * 512 + 256;
                int var139 = var133 << 2;
                int var140 = var128 * 512 + 256;
                int var141 = var126 * 512 + 256;
                int var142 = var132 << 2;
                int var143 = var127 * 512 + 256;
                int var144 = var137 << 2;
                class185 var145 = new class185(var131, class214.field3213, class214.field3213, var141, var143, var142, class703.field9918 + var134, class703.field9918 + var135, var136, var144, 0, var130, var139, var125, -1);
                var145.method1313(class703.field9918 + var134, var138, var140, class530.method3211(var138, 2, var140, class214.field3213) - var139, -97);
                class627.field8893.method3559(new class262(var145), (byte) 12);
            }
        } else {
            if (arg0 != 112) {
                field9797 = -121;
            }
            if (class42.field703 == arg1) {
                int var146 = class352.field5213.method2886(true);
                int var147 = (var146 & 0x7) + class95.field1382;
                int var148 = var147 + class71.field1085;
                int var149 = ((var146 & 0x75) >> 4) + class182.field2506;
                int var150 = class41.field693 + var149;
                int var151 = class352.field5213.method2882(-1);
                int var152 = class352.field5213.method2882(-1);
                int var153 = class352.field5213.method2882(-1);
                if (class591.field8409 != null) {
                    class340 var154 = (class340) class591.field8409.method4020((long) (class214.field3213 << 28 | var148 << 14 | var150), (byte) -59);
                    if (var154 != null) {
                        for (class428 var155 = (class428) var154.field4685.method3565(arg0 ^ 0x1); var155 != null; var155 = (class428) var154.field4685.method3561((byte) 53)) {
                            if ((var151 & 0x7FFF) == var155.field6169 && var155.field6171 == var152) {
                                var155.method2656((byte) 118);
                                var155.field6171 = var153;
                                class638.method3679(var150, var148, arg0 ^ 0xFFFFFFD1, class214.field3213, var155);
                                break;
                            }
                        }
                        if (var149 >= 0 && var147 >= 0 && var149 < class184.field2546 && class240.field3555 > var147) {
                            class623.method3600((byte) -127, var147, class214.field3213, var149);
                        }
                    }
                }
            } else {
                class705.method3952("T3 - " + arg1, null, -29913);
                class89.method694(false, 0);
            }
        }
    }
}
