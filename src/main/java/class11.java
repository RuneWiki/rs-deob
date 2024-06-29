import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class11 {

    @OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
    public int field100 = 1;

    @OriginalMember(owner = "client!iea", name = "h", descriptor = "[I")
    public static int[] field97 = new int[256];

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "Lst;")
    public static class335 field94 = new class335(80, 16);

    @OriginalMember(owner = "client!iea", name = "l", descriptor = "Lmaa;")
    public static class508 field101 = new class508(14, -1);

    @OriginalMember(owner = "client!iea", name = "i", descriptor = "C")
    public char field98;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "[I")
    public static int[] field91;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILmaa;)V", line = 4)
    public static final void method50(int arg0, class508 arg1) {
        field90++;
        if (class612.field8231 == arg1) {
            int var2 = class352.field5071.method455(arg0 ^ 0xFFFFFFA3);
            class220 var3 = class20.field192.method716(6, var2);
            int var4 = class352.field5071.method498(-78);
            int var5 = class352.field5071.method466(102);
            int var6 = var5 >> 2;
            int var7 = class211.field2787[var6];
            int var8 = class352.field5071.method466(123);
            int var9 = class538.field7448 + (var8 >> 4 & 0x7);
            int var10 = (var8 & 0x7) + class121.field1602;
            if (var6 == 11) {
                var6 = 10;
            }
            int var11 = 0;
            if (var3.field2962 != null) {
                int var12 = -1;
                for (int var13 = 0; var13 < var3.field2962.length; var13++) {
                    if (var3.field2962[var13] == var6) {
                        var12 = var13;
                        break;
                    }
                }
                var11 = var3.field2906[var12].length;
            }
            int var14 = 0;
            if (var3.field2908 != null) {
                var14 = var3.field2908.length;
            }
            int var15 = 0;
            if (var3.field2928 != null) {
                var15 = var3.field2928.length;
            }
            if ((var4 & 0x1) == 1) {
                class623.method3512(var9, (byte) -45, var10, null, class499.field6972, var7);
            } else {
                int[] var16 = null;
                if ((var4 & 0x2) == 2) {
                    var16 = new int[var11];
                    for (int var17 = 0; var17 < var11; var17++) {
                        var16[var17] = class352.field5071.method482(-772591672);
                    }
                }
                short[] var18 = null;
                if ((var4 & 0x4) == 4) {
                    var18 = new short[var14];
                    for (int var19 = 0; var19 < var14; var19++) {
                        var18[var19] = (short) class352.field5071.method482(-772591672);
                    }
                }
                short[] var20 = null;
                if ((var4 & 0x8) == 8) {
                    var20 = new short[var15];
                    for (int var21 = 0; var21 < var15; var21++) {
                        var20[var21] = (short) class352.field5071.method482(-772591672);
                    }
                }
                class623.method3512(var9, (byte) -45, var10, new class77((long) (class554.field7725++), var16, var18, var20), class499.field6972, var7);
            }
        } else if (class563.field7815 == arg1) {
            int var22 = class352.field5071.method505((byte) -119);
            int var23 = (var22 >> 4 & 0xF) + class538.field7448 * 2;
            int var24 = class121.field1602 * 2 + (var22 & 0xF);
            int var25 = class352.field5071.method505((byte) -119);
            boolean var26 = (var25 & 0x1) != 0;
            boolean var27 = (var25 & 0x2) != 0;
            int var28 = var27 ? var25 >> 2 : -1;
            int var29 = class352.field5071.method491(false) + var23;
            int var30 = var24 + class352.field5071.method491(false);
            int var31 = class352.field5071.method496(-92);
            int var32 = class352.field5071.method496(-93);
            int var33 = class352.field5071.method482(-772591672);
            int var34 = class352.field5071.method505((byte) -119);
            int var35;
            if (var27) {
                var35 = (byte) var34;
            } else {
                var35 = var34 * 4;
            }
            int var36 = class352.field5071.method505((byte) -119) * 4;
            int var37 = class352.field5071.method482(-772591672);
            int var38 = class352.field5071.method482(arg0 ^ 0xD1F32FCF);
            int var39 = class352.field5071.method505((byte) -119);
            int var40 = class352.field5071.method482(arg0 - 772591679);
            if (var39 == 255) {
                var39 = -1;
            }
            if (var23 >= 0 && var24 >= 0 && (class277.field4036 * 2) > var23 && class277.field4036 * 2 > var24 && var29 >= 0 && var30 >= 0 && var29 < class667.field9202 * 2 && var30 < (class667.field9202 * 2) && var33 != 65535) {
                int var41 = var24 * 256;
                int var42 = var23 * 256;
                int var43 = var30 * 256;
                int var44 = var29 * 256;
                int var45 = var35 << 2;
                int var46 = var40 << 2;
                int var47 = var36 << 2;
                if (var31 != 0 && var28 != -1) {
                    class515 var48 = null;
                    if (var31 >= 0) {
                        int var49 = var31 - 1;
                        class234 var50 = (class234) class372.field5245.method812(114, (long) var49);
                        if (var50 != null) {
                            var48 = var50.field3471;
                        }
                    } else {
                        int var51 = -var31 - 1;
                        if (class145.field2037 == var51) {
                            var48 = class388.field5601;
                        } else {
                            var48 = class251.field3675[var51];
                        }
                    }
                    if (var48 != null) {
                        class32 var52 = var48.method3084((byte) -92);
                        if (var52.field403 != null && var52.field403[var28] != null) {
                            var45 -= var52.field403[var28][1];
                        }
                        if (var52.field428 != null && var52.field428[var28] != null) {
                            var45 -= var52.field428[var28][1];
                        }
                    }
                }
                class694 var53 = new class694(var33, class499.field6972, class499.field6972, var42, var41, var45, var37 + class483.field6741, var38 - -class483.field6741, var39, var46, var31, var32, var47, var26, var28);
                var53.method3925(class737.method4102((byte) 19, var44, var43, class499.field6972) - var47, 127, var44, class483.field6741 + var37, var43);
                class24.field295.method3610(arg0 + 9282, new class158(var53));
            }
        } else if (class193.field2625 == arg1) {
            int var54 = class352.field5071.method498(-116);
            int var55 = (var54 & 0x7) + class121.field1602;
            int var56 = var55 + class587.field7995;
            int var57 = ((var54 & 0x7B) >> 4) + class538.field7448;
            int var58 = class113.field1509 + var57;
            int var59 = class352.field5071.method506(-125);
            class662 var60 = (class662) class541.field7521.method812(107, (long) (class499.field6972 << 28 | var56 << 14 | var58));
            if (var60 != null) {
                for (class520 var61 = (class520) var60.field8785.method3618(93); var61 != null; var61 = (class520) var60.field8785.method3619(0)) {
                    if ((var59 & 0x7FFF) == var61.field7246) {
                        var61.method549(6410);
                        break;
                    }
                }
                if (var60.field8785.method3616((byte) 23)) {
                    var60.method549(6410);
                }
                if (var57 >= 0 && var55 >= 0 && class277.field4036 > var57 && class667.field9202 > var55) {
                    class464.method2844(class499.field6972, -43, var55, var57);
                }
            }
        } else if (class697.field9733 == arg1) {
            int var62 = class352.field5071.method505((byte) -119);
            int var63 = class121.field1602 + (var62 & 0x7);
            int var64 = var63 + class587.field7995;
            int var65 = (var62 >> 4 & 0x7) + class538.field7448;
            int var66 = var65 + class113.field1509;
            int var67 = class352.field5071.method482(-772591672);
            int var68 = class352.field5071.method482(-772591672);
            int var69 = class352.field5071.method482(-772591672);
            if (class541.field7521 != null) {
                class662 var70 = (class662) class541.field7521.method812(125, (long) (var66 | class499.field6972 << 28 | var64 << 14));
                if (var70 != null) {
                    for (class520 var71 = (class520) var70.field8785.method3618(-73); var71 != null; var71 = (class520) var70.field8785.method3619(0)) {
                        if ((var67 & 0x7FFF) == var71.field7246 && var71.field7251 == var68) {
                            var71.method549(6410);
                            var71.field7251 = var69;
                            class611.method3464(var64, var66, var71, class499.field6972, 90);
                            break;
                        }
                    }
                    if (var65 >= 0 && var63 >= 0 && var65 < class277.field4036 && var63 < class667.field9202) {
                        class464.method2844(class499.field6972, arg0 ^ 0xFFFFFF8D, var63, var65);
                    }
                }
            }
        } else if (field101 == arg1) {
            class352.field5071.method505((byte) -119);
            int var72 = class352.field5071.method505((byte) -119);
            int var73 = (var72 >> 4 & 0x7) + class538.field7448;
            int var74 = class121.field1602 + (var72 & 0x7);
            int var75 = class352.field5071.method482(-772591672);
            int var76 = class352.field5071.method505((byte) -119);
            int var77 = class352.field5071.method476((byte) -105);
            String var78 = class352.field5071.method479((byte) -47);
            class481.method2933(var73, false, var76, var74, var75, class499.field6972, var78, var77);
        } else if (class507.field7044 == arg1) {
            int var79 = class352.field5071.method498(-123);
            int var80 = var79 >> 2;
            int var81 = var79 & 0x3;
            int var82 = class211.field2787[var80];
            int var83 = class352.field5071.method474(arg0 + 11205);
            int var84 = ((var83 & 0x7A) >> 4) + class538.field7448;
            int var85 = (var83 & 0x7) + class121.field1602;
            if (class127.method803(class119.field1570, (byte) 91) || var84 >= 0 && var85 >= 0 && var84 < class277.field4036 && class667.field9202 > var85) {
                class458.method2797(-1, var85, true, var80, var81, var82, class499.field6972, var84);
            }
        } else {
            if (arg0 != 7) {
                field101 = null;
            }
            if (class282.field4089 == arg1) {
                int var86 = class352.field5071.method505((byte) -119);
                int var87 = var86 >> 2;
                int var88 = var86 & 0x3;
                int var89 = class211.field2787[var87];
                int var90 = class352.field5071.method455(arg0 - 106);
                int var91 = class352.field5071.method498(-59);
                int var92 = (var91 >> 4 & 0x7) + class538.field7448;
                int var93 = (var91 & 0x7) + class121.field1602;
                if (class127.method803(class119.field1570, (byte) 90) || var92 >= 0 && var93 >= 0 && var92 < class277.field4036 && class667.field9202 > var93) {
                    class458.method2797(var90, var93, true, var87, var88, var89, class499.field6972, var92);
                }
            } else if (class67.field1043 == arg1) {
                int var94 = class352.field5071.method505((byte) -119);
                int var95 = ((var94 & 0x7A) >> 4) + class538.field7448;
                int var96 = (var94 & 0x7) + class121.field1602;
                int var97 = class352.field5071.method482(-772591672);
                if (var97 == 65535) {
                    var97 = -1;
                }
                int var98 = class352.field5071.method505((byte) -119);
                int var99 = (var98 & 0xF5) >> 4;
                int var100 = var98 & 0x7;
                int var101 = class352.field5071.method505((byte) -119);
                int var102 = class352.field5071.method505((byte) -119);
                int var103 = class352.field5071.method482(-772591672);
                if (var95 >= 0 && var96 >= 0 && var95 < class277.field4036 && var96 < class667.field9202) {
                    int var104 = var99 + 1;
                    if ((var95 - var104) <= class388.field5601.field7197[0] && var95 + var104 >= class388.field5601.field7197[0] && class388.field5601.field7198[0] >= var96 - var104 && class388.field5601.field7198[0] <= (var96 + var104)) {
                        class230.method1366(var102, (byte) 1, var97, (class499.field6972 << 24) + (var95 << 16) + (var96 << 8) + var99, var100, var101, var103);
                    }
                }
            } else if (class555.field7739 == arg1) {
                int var105 = class352.field5071.method482(-772591672);
                int var106 = class352.field5071.method505((byte) -119);
                class20.field192.method716(6, var105).method1298(var106, 39);
            } else if (class596.field8091 == arg1) {
                int var107 = class352.field5071.method474(11212);
                int var108 = (var107 & 0x7) + class121.field1602;
                int var109 = class587.field7995 + var108;
                int var110 = class538.field7448 + (var107 >> 4 & 0x7);
                int var111 = class113.field1509 + var110;
                int var112 = class352.field5071.method455(-50);
                int var113 = class352.field5071.method455(arg0 ^ 0xFFFFFF8D);
                boolean var114 = var110 >= 0 && var108 >= 0 && var110 < class277.field4036 && class667.field9202 > var108;
                if (var114 || class127.method803(class119.field1570, (byte) 92)) {
                    class611.method3464(var109, var111, new class520(var112, var113), class499.field6972, -97);
                    if (var114) {
                        class464.method2844(class499.field6972, -123, var108, var110);
                    }
                }
            } else if (class3.field17 == arg1) {
                int var115 = class352.field5071.method505((byte) -119);
                int var116 = class538.field7448 + ((var115 & 0x72) >> 4);
                int var117 = class121.field1602 + (var115 & 0x7);
                int var118 = class352.field5071.method482(-772591672);
                if (var118 == 65535) {
                    var118 = -1;
                }
                int var119 = class352.field5071.method505((byte) -119);
                int var120 = var119 >> 4 & 0xF;
                int var121 = var119 & 0x7;
                int var122 = class352.field5071.method505((byte) -119);
                int var123 = class352.field5071.method505((byte) -119);
                int var124 = class352.field5071.method482(arg0 - 772591679);
                if (var116 >= 0 && var117 >= 0 && class277.field4036 > var116 && var117 < class667.field9202) {
                    int var125 = var120 + 1;
                    if (var116 - var125 <= class388.field5601.field7197[0] && class388.field5601.field7197[0] <= (var116 + var125) && class388.field5601.field7198[0] >= var117 - var125 && (var117 + var125) >= class388.field5601.field7198[0]) {
                        class302.method1990(-127, var121, var118, var124, (var116 << 16) + ((class499.field6972 << 24) + (var117 << 8) + var120), false, var122, var123);
                    }
                }
            } else if (class600.field8126 == arg1) {
                int var126 = class352.field5071.method505((byte) -119);
                int var127 = (var126 >> 4 & 0x7) + class538.field7448;
                int var128 = (var126 & 0x7) + class121.field1602;
                int var129 = class352.field5071.method482(-772591672);
                int var130 = class352.field5071.method505((byte) -119);
                int var131 = class352.field5071.method482(-772591672);
                int var132 = class352.field5071.method505((byte) -119);
                if (var127 >= 0 && var128 >= 0 && class277.field4036 > var127 && class667.field9202 > var128) {
                    int var133 = var127 * 512 + 256;
                    int var134 = var128 * 512 + 256;
                    int var135 = class499.field6972;
                    if (var135 < 3 && class479.method2918(var128, true, var127)) {
                        var135++;
                    }
                    class711 var136 = new class711(var129, var131, class483.field6741, class499.field6972, var135, var133, class737.method4102((byte) 19, var133, var134, class499.field6972) - var130, var134, var127, var127, var128, var128, var132);
                    class76.field1112.method3610(arg0 ^ 0x244E, new class379(var136));
                }
            } else if (class84.field1198 == arg1) {
                int var137 = class352.field5071.method505((byte) -119);
                boolean var138 = (var137 & 0x80) != 0;
                int var139 = (var137 >> 3 & 0x7) + class538.field7448;
                int var140 = (var137 & 0x7) + class121.field1602;
                int var141 = var139 + class352.field5071.method491(false);
                int var142 = var140 + class352.field5071.method491(false);
                int var143 = class352.field5071.method496(arg0 ^ 0xFFFFFFDC);
                int var144 = class352.field5071.method482(arg0 - 772591679);
                int var145 = class352.field5071.method505((byte) -119) * 4;
                int var146 = class352.field5071.method505((byte) -119) * 4;
                int var147 = class352.field5071.method482(-772591672);
                int var148 = class352.field5071.method482(-772591672);
                int var149 = class352.field5071.method505((byte) -119);
                int var150 = class352.field5071.method482(-772591672);
                if (var149 == 255) {
                    var149 = -1;
                }
                if (var139 >= 0 && var140 >= 0 && var139 < class277.field4036 && class667.field9202 > var140 && var141 >= 0 && var142 >= 0 && var141 < class277.field4036 && class667.field9202 > var142 && var144 != 65535) {
                    int var151 = var142 * 512 + 256;
                    int var152 = var141 * 512 + 256;
                    int var153 = var150 << 2;
                    int var154 = var145 << 2;
                    int var155 = var140 * 512 + 256;
                    int var156 = var139 * 512 + 256;
                    int var157 = var146 << 2;
                    class694 var158 = new class694(var144, class499.field6972, class499.field6972, var156, var155, var154, class483.field6741 + var147, class483.field6741 + var148, var149, var153, 0, var143, var157, var138, -1);
                    var158.method3925(class737.method4102((byte) 19, var152, var151, class499.field6972) - var157, 117, var152, class483.field6741 + var147, var151);
                    class24.field295.method3610(arg0 ^ 0x244E, new class158(var158));
                }
            } else if (class297.field4228 == arg1) {
                int var159 = class352.field5071.method498(-126);
                int var160 = (var159 & 0x7) + class121.field1602;
                int var161 = class587.field7995 + var160;
                int var162 = (var159 >> 4 & 0x7) + class538.field7448;
                int var163 = class113.field1509 + var162;
                int var164 = class352.field5071.method500((byte) 116);
                int var165 = class352.field5071.method482(-772591672);
                int var166 = class352.field5071.method500((byte) 116);
                if (class145.field2037 != var164) {
                    boolean var167 = var162 >= 0 && var160 >= 0 && class277.field4036 > var162 && var160 < class667.field9202;
                    if (var167 || class127.method803(class119.field1570, (byte) 126)) {
                        class611.method3464(var161, var163, new class520(var166, var165), class499.field6972, 68);
                        if (var167) {
                            class464.method2844(class499.field6972, arg0 + 111, var160, var162);
                        }
                    }
                }
            } else if (class261.field3785 == arg1) {
                int var168 = class352.field5071.method466(-80);
                int var169 = ((var168 & 0x7D) >> 4) + class538.field7448;
                int var170 = (var168 & 0x7) + class121.field1602;
                int var171 = class352.field5071.method482(-772591672);
                if (var171 == 65535) {
                    var171 = -1;
                }
                int var172 = class352.field5071.method498(-73);
                int var173 = var172 >> 2;
                int var174 = var172 & 0x3;
                int var175 = class211.field2787[var173];
                class379.method2375(var173, class499.field6972, var170, var175, var174, 17094, var169, var171);
            } else {
                class31.method172(null, "T3 - " + arg1, arg0 - 7);
                class327.method2089(false, false);
            }
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V", line = 720)
    public static final void method51(int arg0) {
        if (class221.field2991 != null) {
            class221.field2991.method3150((byte) 88);
        }
        field99++;
        if (class264.field3869 != null) {
            class264.field3869.method3150((byte) 92);
        }
        int var1 = -37 % ((arg0 - 19) / 52);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIIIIIII)V", line = 744)
    public static final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field96++;
        int var8 = arg7 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class621.field8313 - class67.field1037) * var8 / 100 + class67.field1037;
        int var10 = arg3 * var9 >> 8;
        class3.field30 = class3.field27 * var9 >> 8;
        int var11 = 16384 - arg1 & 0x3FFF;
        if (arg5 <= 2) {
            return;
        }
        int var12 = 16384 - arg6 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class24.field312[var11] * -var10 >> 14;
            var15 = class24.field308[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class24.field312[var12] * var15 >> 14;
            var15 = class24.field308[var12] * var15 >> 14;
        }
        class206.field2702 = arg2 - var14;
        class118.field1556 = 0;
        class123.field1680 = arg4 - var15;
        class671.field9282 = arg0 - var13;
        class25.field318 = arg1;
        class230.field3118 = arg6;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)V", line = 797)
    public static void method53(byte arg0) {
        field101 = null;
        field97 = null;
        field91 = null;
        field94 = null;
        if (arg0 != 76) {
            field91 = null;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Ldc;II)V", line = 811)
    private final void method54(class63 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return;
        }
        if (arg2 == 1) {
            this.field98 = class211.method1253(64, arg0.method491(false));
        } else if (arg2 == 2) {
            this.field100 = 0;
        }
        field95++;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "([BI)[B", line = 833)
    public static final byte[] method55(byte[] arg0, int arg1) {
        field92++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -2692) {
            field91 = null;
        }
        byte[] var2 = new byte[arg0.length];
        class245.method1646(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(BLdc;)V", line = 861)
    public final void method56(byte arg0, class63 arg1) {
        while (true) {
            int var3 = arg1.method505((byte) -119);
            if (var3 == 0) {
                field93++;
                if (arg0 <= 23) {
                    method50(-47, null);
                    return;
                }
                return;
            }
            this.method54(arg1, 0, var3);
        }
    }
}
