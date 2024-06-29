import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class424 extends class108 {

    @OriginalMember(owner = "client!u", name = "l", descriptor = "[I")
    public static int[] field6201 = new int[120];

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Lcb;")
    public static class78 field6207;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field6208;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field6201[var1] = var0 / 4;
        }
        new class567(null, "Dieses System darf nicht missbraucht werden!", null, null);
        field6206 = 0;
        field6207 = new class78(16);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 3)
    public static void method2539(int arg0) {
        field6207 = null;
        int var1 = 104 % ((arg0 - 63) / 45);
        field6201 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)I", line = 16)
    public static int method2540(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZI)V", line = 25)
    public static final void method2541(boolean arg0, boolean arg1, int arg2) {
        field6205++;
        class217 var3 = class132.method1024(arg2, 0, arg0);
        if (arg1) {
            method2542(72, 116, -60);
        }
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field3280.length; var4++) {
                var3.field3280[var4] = -1;
                var3.field3277[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)Z", line = 75)
    public static final boolean method2542(int arg0, int arg1, int arg2) {
        if (arg2 == 31878) {
            field6202++;
            return (arg0 & 0x20) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lnn;I)V", line = 98)
    public static final void method2543(class214 arg0, int arg1) {
        field6200++;
        if (class25.field346 == arg0) {
            int var2 = class52.field761.method1744(28);
            int var3 = (var2 >> 4 & 0x7) + class192.field2738;
            int var4 = (var2 & 0x7) + class605.field8618;
            byte var5 = class52.field761.method1707(true);
            byte var6 = class52.field761.method1714(-31536);
            int var7 = class52.field761.method1728(59868552);
            int var8 = class52.field761.method1738(255);
            int var9 = var8 >> 2;
            int var10 = var8 & 0x3;
            int var11 = class52.field761.method1745(32132);
            int var12 = class52.field761.method1723((byte) 107);
            int var13 = class52.field761.method1723((byte) 66);
            byte var14 = class52.field761.method1707(true);
            byte var15 = class52.field761.method1733(false);
            if (!class159.field2378.method407()) {
                class634.method3664(var13, var11, var10, (byte) 55, var15, var6, var7, var9, var14, var4, class526.field7322, var12, var5, var3);
            }
        } else if (class54.field777 == arg0) {
            int var16 = class52.field761.method1738(255);
            int var17 = class192.field2738 * 2 + (var16 >> 4 & 0xF);
            int var18 = class605.field8618 * 2 + (var16 & 0xF);
            boolean var19 = class52.field761.method1738(255) != 0;
            int var20 = class52.field761.method1714(-31536) + var17;
            int var21 = class52.field761.method1714(-31536) + var18;
            int var22 = class52.field761.method1730(13436);
            int var23 = class52.field761.method1745(32132);
            int var24 = class52.field761.method1738(255) * 4;
            int var25 = class52.field761.method1738(255) * 4;
            int var26 = class52.field761.method1745(32132);
            int var27 = class52.field761.method1745(32132);
            int var28 = class52.field761.method1738(255);
            if (var28 == 255) {
                var28 = -1;
            }
            int var29 = class52.field761.method1745(32132);
            if (var17 >= 0 && var18 >= 0 && var17 < (class146.field2247 * 2) && (class146.field2247 * 2) > var18 && var20 >= 0 && var21 >= 0 && (class66.field990 * 2) > var20 && (class66.field990 * 2) > var21 && var23 != 65535) {
                int var30 = var21 * 64;
                int var31 = var18 * 64;
                int var32 = var24 << 0;
                int var33 = var20 * 64;
                int var34 = var29 << 0;
                int var35 = var25 << 0;
                int var36 = var17 * 64;
                class642 var37 = new class642(var23, class526.field7322, var36, var31, var32, var26 + class310.field4553, var27 - -class310.field4553, var28, var34, var22, var35, var19);
                var37.method3699(class355.method2160(var33, var30, class526.field7322, (byte) 103) - var35, var30, var33, class310.field4553 + var26, false);
                class25.field352.method414(new class258(var37), (byte) 121);
            }
        } else if (class133.field2153 == arg0) {
            int var38 = class52.field761.method1701(255);
            int var39 = var38 >> 2;
            int var40 = var38 & 0x3;
            int var41 = class226.field3372[var39];
            int var42 = class52.field761.method1744(112);
            int var43 = ((var42 & 0x7A) >> 4) + class192.field2738;
            int var44 = (var42 & 0x7) + class605.field8618;
            int var45 = class52.field761.method1745(32132);
            if (var45 == 65535) {
                var45 = -1;
            }
            class127.method999(var39, var45, class526.field7322, var43, var40, var41, var44, -84);
        } else if (class401.field5994 == arg0) {
            int var46 = class52.field761.method1689(-92);
            int var47 = (var46 & 0x7) + class605.field8618;
            int var48 = class597.field8500 + var47;
            int var49 = class192.field2738 + (var46 >> 4 & 0x7);
            int var50 = class382.field5687 + var49;
            int var51 = class52.field761.method1720(-17391);
            int var52 = class52.field761.method1750(true);
            boolean var53 = var49 >= 0 && var47 >= 0 && class146.field2247 > var49 && var47 < class66.field990;
            if (var53 || class87.method794(-101, class234.field3439)) {
                class549.method3092(new class38(var51, var52), var48, 16750, class526.field7322, var50);
                if (var53) {
                    class297.method1862(var47, var49, 4694638, class526.field7322);
                }
            }
        } else {
            int var54 = -98 % ((arg1 + 62) / 32);
            if (class49.field740 == arg0) {
                int var55 = class52.field761.method1738(255);
                int var56 = (var55 & 0x7) + class605.field8618;
                int var57 = class597.field8500 + var56;
                int var58 = (var55 >> 4 & 0x7) + class192.field2738;
                int var59 = var58 + class382.field5687;
                int var60 = class52.field761.method1745(32132);
                int var61 = class52.field761.method1745(32132);
                int var62 = class52.field761.method1745(32132);
                if (class573.field8163 != null) {
                    class51 var63 = (class51) class573.field8163.method740(0, (long) (var57 << 14 | class526.field7322 << 28 | var59));
                    if (var63 != null) {
                        for (class38 var64 = (class38) var63.field755.method427(true); var64 != null; var64 = (class38) var63.field755.method420(false)) {
                            if ((var60 & 0x7FFF) == var64.field515 && var64.field513 == var61) {
                                var64.method911(-52);
                                var64.field513 = var62;
                                class549.method3092(var64, var57, 16750, class526.field7322, var59);
                                break;
                            }
                        }
                        if (var58 >= 0 && var56 >= 0 && var58 < class146.field2247 && class66.field990 > var56) {
                            class297.method1862(var56, var58, 4694638, class526.field7322);
                        }
                    }
                }
            } else if (class134.field2160 == arg0) {
                int var65 = class52.field761.method1738(255);
                int var66 = class192.field2738 + ((var65 & 0x73) >> 4);
                int var67 = (var65 & 0x7) + class605.field8618;
                int var68 = class52.field761.method1745(32132);
                int var69 = class52.field761.method1738(255);
                int var70 = class52.field761.method1745(32132);
                int var71 = class52.field761.method1738(255);
                if (var66 >= 0 && var67 >= 0 && var66 < class146.field2247 && class66.field990 > var67) {
                    int var72 = var66 * 128 + 64;
                    int var73 = var67 * 128 + 64;
                    int var74 = class526.field7322;
                    if (var74 < 3 && class402.method2455(var67, var66, 31705)) {
                        var74++;
                    }
                    class562 var75 = new class562(var68, var70, class310.field4553, class526.field7322, var74, var72, class355.method2160(var72, var73, class526.field7322, (byte) 103) - var69, var73, var66, var66, var67, var67, var71);
                    class341.field4897.method414(new class276(var75), (byte) 51);
                }
            } else if (class368.field5229 == arg0) {
                int var76 = class52.field761.method1720(-17391);
                int var77 = class52.field761.method1750(true);
                int var78 = class52.field761.method1701(255);
                int var79 = (var78 & 0x7) + class605.field8618;
                int var80 = class597.field8500 + var79;
                int var81 = class192.field2738 + (var78 >> 4 & 0x7);
                int var82 = class382.field5687 + var81;
                int var83 = class52.field761.method1745(32132);
                if (class323.field4670 != var83) {
                    boolean var84 = var81 >= 0 && var79 >= 0 && class146.field2247 > var81 && var79 < class66.field990;
                    if (var84 || class87.method794(-101, class234.field3439)) {
                        class549.method3092(new class38(var76, var77), var80, 16750, class526.field7322, var82);
                        if (var84) {
                            class297.method1862(var79, var81, 4694638, class526.field7322);
                        }
                    }
                }
            } else if (class299.field4325 == arg0) {
                int var85 = class52.field761.method1738(255);
                int var86 = var85 >> 2;
                int var87 = var85 & 0x3;
                int var88 = class226.field3372[var86];
                int var89 = class52.field761.method1738(255);
                int var90 = ((var89 & 0x73) >> 4) + class192.field2738;
                int var91 = (var89 & 0x7) + class605.field8618;
                if (class87.method794(-101, class234.field3439) || var90 >= 0 && var91 >= 0 && var90 < class146.field2247 && var91 < class66.field990) {
                    class406.method2466(class526.field7322, var87, -1, -1, var88, var91, var86, false, 0, var90);
                }
            } else if (class275.field4024 == arg0) {
                int var92 = class52.field761.method1723((byte) 60);
                int var93 = class52.field761.method1744(-77);
                int var94 = (var93 >> 4 & 0x7) + class192.field2738;
                int var95 = (var93 & 0x7) + class605.field8618;
                int var96 = class52.field761.method1689(-45);
                int var97 = var96 >> 2;
                int var98 = var96 & 0x3;
                int var99 = class226.field3372[var97];
                if (class87.method794(-101, class234.field3439) || var94 >= 0 && var95 >= 0 && var94 < class146.field2247 && class66.field990 > var95) {
                    class406.method2466(class526.field7322, var98, -1, var92, var99, var95, var97, false, 0, var94);
                }
            } else if (class151.field2276 == arg0) {
                int var100 = class52.field761.method1745(32132);
                int var101 = class52.field761.method1738(255);
                class552.field7819.method2890(0, var100).method2242(var101, 26188);
            } else if (class170.field2484 == arg0) {
                int var102 = class52.field761.method1738(255);
                boolean var103 = (var102 & 0x80) != 0;
                int var104 = (var102 >> 3 & 0x7) + class192.field2738;
                int var105 = (var102 & 0x7) + class605.field8618;
                int var106 = var104 + class52.field761.method1714(-31536);
                int var107 = class52.field761.method1714(-31536) + var105;
                int var108 = class52.field761.method1730(13436);
                int var109 = class52.field761.method1745(32132);
                int var110 = class52.field761.method1738(255) * 4;
                int var111 = class52.field761.method1738(255) * 4;
                int var112 = class52.field761.method1745(32132);
                int var113 = class52.field761.method1745(32132);
                int var114 = class52.field761.method1738(255);
                int var115 = class52.field761.method1745(32132);
                if (var114 == 255) {
                    var114 = -1;
                }
                if (var104 >= 0 && var105 >= 0 && class146.field2247 > var104 && var105 < class66.field990 && var106 >= 0 && var107 >= 0 && var106 < class146.field2247 && var107 < class66.field990 && var109 != 65535) {
                    int var116 = var104 * 128 + 64;
                    int var117 = var110 << 0;
                    int var118 = var115 << 0;
                    int var119 = var106 * 128 + 64;
                    int var120 = var105 * 128 + 64;
                    int var121 = var107 * 128 + 64;
                    int var122 = var111 << 0;
                    class642 var123 = new class642(var109, class526.field7322, var116, var120, var117, class310.field4553 + var112, class310.field4553 + var113, var114, var118, var108, var122, var103);
                    var123.method3699(class355.method2160(var119, var121, class526.field7322, (byte) 103) - var122, var121, var119, class310.field4553 + var112, false);
                    class25.field352.method414(new class258(var123), (byte) 92);
                }
            } else if (class574.field8171 == arg0) {
                class52.field761.method1738(255);
                int var124 = class52.field761.method1738(255);
                int var125 = (var124 >> 4 & 0x7) + class192.field2738;
                int var126 = (var124 & 0x7) + class605.field8618;
                int var127 = class52.field761.method1745(32132);
                int var128 = class52.field761.method1738(255);
                int var129 = class52.field761.method1700((byte) 44);
                String var130 = class52.field761.method1752(false);
                class533.method3012(var130, var126, var128, class526.field7322, var129, (byte) 42, var125, var127);
            } else if (class72.field1356 == arg0) {
                int var131 = class52.field761.method1738(255);
                int var132 = ((var131 & 0x7E) >> 4) + class192.field2738;
                int var133 = (var131 & 0x7) + class605.field8618;
                int var134 = class52.field761.method1745(32132);
                if (var134 == 65535) {
                    var134 = -1;
                }
                int var135 = class52.field761.method1738(255);
                int var136 = var135 >> 4 & 0xF;
                int var137 = var135 & 0x7;
                int var138 = class52.field761.method1738(255);
                int var139 = class52.field761.method1738(255);
                if (var132 >= 0 && var133 >= 0 && class146.field2247 > var132 && class66.field990 > var133) {
                    int var140 = var136 + 1;
                    if (class644.field9367.field1571[0] >= var132 - var140 && (var132 + var140) >= class644.field9367.field1571[0] && class644.field9367.field1572[0] >= (var133 - var140) && class644.field9367.field1572[0] <= (var133 + var140)) {
                        class77.method726(var139, var134, 0, (class526.field7322 << 24) + (var132 << 16) + (var133 << 8) + var136, var137, var138);
                    }
                }
            } else if (class599.field8509 == arg0) {
                int var141 = class52.field761.method1745(32132);
                int var142 = class52.field761.method1744(85);
                int var143 = (var142 & 0x7) + class605.field8618;
                int var144 = class597.field8500 + var143;
                int var145 = (var142 >> 4 & 0x7) + class192.field2738;
                int var146 = class382.field5687 + var145;
                class51 var147 = (class51) class573.field8163.method740(0, (long) (var146 | class526.field7322 << 28 | var144 << 14));
                if (var147 != null) {
                    for (class38 var148 = (class38) var147.field755.method427(true); var148 != null; var148 = (class38) var147.field755.method420(false)) {
                        if ((var141 & 0x7FFF) == var148.field515) {
                            var148.method911(-52);
                            break;
                        }
                    }
                    if (var147.field755.method424(2000)) {
                        var147.method911(-52);
                    }
                    if (var145 >= 0 && var143 >= 0 && var145 < class146.field2247 && var143 < class66.field990) {
                        class297.method1862(var143, var145, 4694638, class526.field7322);
                    }
                }
            } else if (class596.field8487 == arg0) {
                int var149 = class52.field761.method1738(255);
                int var150 = class192.field2738 * 2 + ((var149 & 0xF1) >> 4);
                int var151 = (var149 & 0xF) + class605.field8618 * 2;
                boolean var152 = class52.field761.method1738(255) != 0;
                int var153 = var150 + class52.field761.method1714(-31536);
                int var154 = class52.field761.method1714(-31536) + var151;
                int var155 = class52.field761.method1730(13436);
                int var156 = class52.field761.method1730(13436);
                int var157 = class52.field761.method1745(32132);
                byte var158 = class52.field761.method1714(-31536);
                int var159 = class52.field761.method1738(255) * 4;
                int var160 = class52.field761.method1745(32132);
                int var161 = class52.field761.method1745(32132);
                int var162 = class52.field761.method1738(255);
                if (var162 == 255) {
                    var162 = -1;
                }
                int var163 = class52.field761.method1745(32132);
                if (var150 >= 0 && var151 >= 0 && (class146.field2247 * 2) > var150 && class146.field2247 * 2 > var151 && var153 >= 0 && var154 >= 0 && class66.field990 * 2 > var153 && var154 < class66.field990 * 2 && var157 != 65535) {
                    int var164 = var158 << 0;
                    int var165 = var153 * 64;
                    int var166 = var163 << 0;
                    int var167 = var154 * 64;
                    int var168 = var151 * 64;
                    int var169 = var150 * 64;
                    int var170 = var159 << 0;
                    if (var155 != 0) {
                        class85 var171 = null;
                        int var174;
                        if (var155 < 0) {
                            int var172 = -var155 - 1;
                            int var173 = var172 & 0x7FF;
                            var174 = (var172 & 0x780C) >> 11;
                            if (class323.field4670 == var173) {
                                var171 = class644.field9367;
                            } else {
                                var171 = class39.field536[var173];
                            }
                        } else {
                            int var175 = var155 - 1;
                            var174 = (var175 & 0x7C86) >> 11;
                            int var176 = var175 & 0x7FF;
                            class181 var177 = (class181) class432.field6368.method740(0, (long) var176);
                            if (var177 != null) {
                                var171 = var177.field2623;
                            }
                        }
                        if (var171 != null) {
                            class298 var178 = var171.method772(0);
                            if (var178.field4280 != null && var178.field4280[var174] != null) {
                                int var179 = var178.field4280[var174][0];
                                int var180 = var178.field4280[var174][2];
                                int var181 = var171.field1557.method870(16383);
                                int var182 = class285.field4154[var181];
                                int var183 = class285.field4152[var181];
                                int var184 = var179 * var183 + var180 * var182 >> 15;
                                int var185 = var180 * var183 - (var179 * var182) >> 15;
                                var168 += var185;
                                var164 -= var178.field4280[var174][1];
                                var169 += var184;
                            }
                        }
                    }
                    class642 var187 = new class642(var157, class526.field7322, var169, var168, var164, var160 + class310.field4553, class310.field4553 + var161, var162, var166, var156, var170, var152);
                    var187.method3699(class355.method2160(var165, var167, class526.field7322, (byte) 103) - var170, var167, var165, class310.field4553 + var160, false);
                    class25.field352.method414(new class258(var187), (byte) 61);
                }
            } else {
                class593.method3390("T3 - " + arg0, null, 0);
                class271.method1759(false, 4);
            }
        }
    }
}
