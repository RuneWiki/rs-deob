import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public abstract class class216 {

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "[I")
    public static int[] field3654 = new int[32];

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "[I")
    public static int[] field3655 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field3650 = 0;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field3651 = -1;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "[[I")
    public static int[][] field3656;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public static final void method1539(int arg0) {
        field3658++;
        if (class131.field2170 == 200) {
            int var1 = class136.field2239.method1802((byte) -127);
            int var2 = ((var1 & 0x7B) >> 4) + class16.field330;
            int var3 = (var1 & 0x7) + class23.field413;
            int var4 = class136.field2239.method1821((byte) 51);
            int var5 = class136.field2239.method1821((byte) 51);
            int var6 = class136.field2239.method1821((byte) 51);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class49 var7 = class125.field2101[class182.field2898][var2][var3];
                if (var7 != null) {
                    for (class61 var8 = (class61) var7.method309(0); var8 != null; var8 = (class61) var7.method312((byte) -78)) {
                        class133 var9 = var8.field1050;
                        if ((var4 & 0x7FFF) == var9.field2193 && var9.field2199 == var5) {
                            var9.field2199 = var6;
                            break;
                        }
                    }
                    class89.method620(var3, false, var2);
                }
            }
        } else if (class131.field2170 == 21) {
            int var10 = class136.field2239.method1802((byte) 66);
            int var11 = (var10 & 0x7) + class23.field413;
            int var12 = class16.field330 + (var10 >> 4 & 0x7);
            int var13 = class136.field2239.method1821((byte) 51);
            int var14 = class136.field2239.method1787(arg0 ^ 0xFFFFFFFD);
            if (var12 >= 0 && var11 >= 0 && var12 < 104 && var11 < 104) {
                class133 var15 = new class133();
                var15.field2193 = var14;
                var15.field2199 = var13;
                if (class125.field2101[class182.field2898][var12][var11] == null) {
                    class125.field2101[class182.field2898][var12][var11] = new class49();
                }
                class125.field2101[class182.field2898][var12][var11].method311(105, new class61(var15));
                class89.method620(var11, false, var12);
            }
        } else if (class131.field2170 == 130) {
            int var16 = class136.field2239.method1767(255);
            int var17 = (var16 & 0x7) + class23.field413;
            int var18 = (var16 >> 4 & 0x7) + class16.field330;
            int var19 = class136.field2239.method1818(false);
            if (var18 >= 0 && var17 >= 0 && var18 < 104 && var17 < 104) {
                class49 var20 = class125.field2101[class182.field2898][var18][var17];
                if (var20 != null) {
                    for (class61 var21 = (class61) var20.method309(0); var21 != null; var21 = (class61) var20.method312((byte) -80)) {
                        if ((var19 & 0x7FFF) == var21.field1050.field2193) {
                            var21.method993(32);
                            break;
                        }
                    }
                    if (var20.method309(arg0 - 2) == null) {
                        class125.field2101[class182.field2898][var18][var17] = null;
                    }
                    class89.method620(var17, false, var18);
                }
            }
        } else if (class131.field2170 == 81) {
            int var22 = class136.field2239.method1802((byte) -104);
            int var23 = class16.field330 + (var22 >> 4 & 0x7);
            int var24 = (var22 & 0x7) + class23.field413;
            int var25 = class136.field2239.method1814(-1);
            int var26 = var25 & 0x3;
            int var27 = var25 >> 2;
            int var28 = class199.field3211[var27];
            int var29 = class136.field2239.method1787(-1);
            if (var29 == 65535) {
                var29 = -1;
            }
            class21.method140(var26, var24, var28, var29, class182.field2898, var27, var23, arg0 ^ 0x7);
        } else if (class131.field2170 == 179) {
            int var30 = class136.field2239.method1802((byte) -86);
            int var31 = (var30 >> 4 & 0x7) + class16.field330;
            int var32 = (var30 & 0x7) + class23.field413;
            int var33 = class136.field2239.method1821((byte) 51);
            if (var33 == 65535) {
                var33 = -1;
            }
            int var34 = class136.field2239.method1802((byte) 71);
            int var35 = var34 & 0x7;
            int var36 = var34 >> 4 & 0xF;
            int var37 = class136.field2239.method1802((byte) 95);
            int var38 = class136.field2239.method1802((byte) -119);
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                int var39 = var36 + 1;
                if (class16.field314.field711[0] >= var31 - var39 && var31 + var39 >= class16.field314.field711[0] && class16.field314.field717[0] >= var32 - var39 && class16.field314.field717[0] <= var32 + var39 && class292.field4785 != 0 && var35 > 0 && class295.field4841 < 50 && var33 != -1) {
                    class28.field487[class295.field4841] = var33;
                    class23.field427[class295.field4841] = var35;
                    class15.field312[class295.field4841] = var37;
                    class196.field3167[class295.field4841] = null;
                    class221.field3714[class295.field4841] = (var31 << 16) + (var32 << 8) + var36;
                    class95.field1548[class295.field4841] = var38;
                    class295.field4841++;
                }
            }
        } else {
            if (class131.field2170 == 173) {
                int var40 = class136.field2239.method1794((byte) 55);
                int var41 = var40 & 0x3;
                int var42 = var40 >> 2;
                byte var43 = class136.field2239.method1768(111);
                byte var44 = class136.field2239.method1779(arg0 + 3004);
                int var45 = class136.field2239.method1767(255);
                int var46 = (var45 & 0x7) + class23.field413;
                int var47 = ((var45 & 0x79) >> 4) + class16.field330;
                int var48 = class136.field2239.method1818(false);
                int var49 = class136.field2239.method1789(-56);
                int var50 = class136.field2239.method1821((byte) 51);
                byte var51 = class136.field2239.method1779(arg0 ^ 0xBBC);
                int var52 = class136.field2239.method1818(false);
                byte var53 = class136.field2239.method1768(arg0 ^ 0x50);
                class66.method456(var42, var51, var46, var44, var43, var49, var50, var53, var48, var52, var41, var47, (byte) 109);
            }
            if (class131.field2170 == 146) {
                int var54 = class136.field2239.method1802((byte) -116);
                int var55 = class16.field330 + (var54 >> 4 & 0x7);
                int var56 = (var54 & 0x7) + class23.field413;
                int var57 = var55 + class136.field2239.method1768(107);
                int var58 = class136.field2239.method1768(arg0 ^ 0x5C) + var56;
                int var59 = class136.field2239.method1762(arg0 - 3);
                int var60 = class136.field2239.method1821((byte) 51);
                int var61 = class136.field2239.method1802((byte) 124) * 4;
                int var62 = class136.field2239.method1802((byte) 33) * 4;
                int var63 = class136.field2239.method1821((byte) 51);
                int var64 = class136.field2239.method1821((byte) 51);
                int var65 = class136.field2239.method1802((byte) 34);
                int var66 = class136.field2239.method1802((byte) -124);
                if (var65 == 255) {
                    var65 = -1;
                }
                if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104 && var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104 && var60 != 65535) {
                    int var67 = var56 * 128 + 64;
                    int var68 = var58 * 128 + 64;
                    int var69 = var55 * 128 + 64;
                    int var70 = var57 * 128 + 64;
                    class226 var71 = new class226(var60, class182.field2898, var69, var67, class277.method1939(class182.field2898, var69, var67, (byte) -34) - var61, class275.field4598 + var63, class275.field4598 + var64, var65, var66, var59, var62);
                    var71.method1602((byte) -115, var68, var70, class275.field4598 + var63, class277.method1939(class182.field2898, var70, var68, (byte) -34) + -var62);
                    class258.field4343.method311(93, new class76(var71));
                }
            } else if (class131.field2170 == 90) {
                int var72 = class136.field2239.method1814(-1);
                int var73 = var72 >> 2;
                int var74 = var72 & 0x3;
                int var75 = class199.field3211[var73];
                int var76 = class136.field2239.method1802((byte) -109);
                int var77 = ((var76 & 0x70) >> 4) + class16.field330;
                int var78 = (var76 & 0x7) + class23.field413;
                if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
                    class64.method444(class182.field2898, (byte) 118, -1, -1, var75, var73, 0, var74, var77, var78);
                }
            } else if (class131.field2170 == 134) {
                int var79 = class136.field2239.method1787(arg0 - 3);
                int var80 = class136.field2239.method1806(-1);
                int var81 = class136.field2239.method1802((byte) 78);
                int var82 = (var81 >> 4 & 0x7) + class16.field330;
                int var83 = (var81 & 0x7) + class23.field413;
                int var84 = class136.field2239.method1787(-1);
                if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104 && class297.field4860 != var80) {
                    class133 var85 = new class133();
                    var85.field2199 = var84;
                    var85.field2193 = var79;
                    if (class125.field2101[class182.field2898][var82][var83] == null) {
                        class125.field2101[class182.field2898][var82][var83] = new class49();
                    }
                    class125.field2101[class182.field2898][var82][var83].method311(127, new class61(var85));
                    class89.method620(var83, false, var82);
                }
            } else if (arg0 == 2) {
                if (class131.field2170 == 17) {
                    int var86 = class136.field2239.method1787(-1);
                    int var87 = class136.field2239.method1767(255);
                    int var88 = var87 >> 2;
                    int var89 = var87 & 0x3;
                    int var90 = class199.field3211[var88];
                    int var91 = class136.field2239.method1802((byte) 48);
                    int var92 = (var91 >> 4 & 0x7) + class16.field330;
                    int var93 = (var91 & 0x7) + class23.field413;
                    if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                        class64.method444(class182.field2898, (byte) 114, -1, var86, var90, var88, 0, var89, var92, var93);
                    }
                } else if (class131.field2170 == 50) {
                    int var94 = class136.field2239.method1802((byte) 83);
                    int var95 = class16.field330 + (var94 >> 4 & 0x7);
                    int var96 = (var94 & 0x7) + class23.field413;
                    int var97 = class136.field2239.method1821((byte) 51);
                    int var98 = class136.field2239.method1802((byte) -107);
                    int var99 = class136.field2239.method1821((byte) 51);
                    if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                        int var100 = var95 * 128 + 64;
                        int var101 = var96 * 128 + 64;
                        class265 var102 = new class265(var97, class182.field2898, var100, var101, class277.method1939(class182.field2898, var100, var101, (byte) -34) - var98, var99, class275.field4598);
                        class181.field2881.method311(89, new class202(var102));
                    }
                } else if (class131.field2170 == 67) {
                    int var103 = class136.field2239.method1802((byte) -89);
                    int var104 = class16.field330 * 2 + ((var103 & 0xF0) >> 4);
                    int var105 = (var103 & 0xF) + class23.field413 * 2;
                    int var106 = class136.field2239.method1768(114) + var104;
                    int var107 = var105 + class136.field2239.method1768(arg0 ^ 0x72);
                    int var108 = class136.field2239.method1762(-1);
                    int var109 = class136.field2239.method1762(arg0 ^ 0xFFFFFFFD);
                    int var110 = class136.field2239.method1821((byte) 51);
                    int var111 = class136.field2239.method1768(arg0 + 88);
                    int var112 = class136.field2239.method1802((byte) -125) * 4;
                    int var113 = class136.field2239.method1821((byte) 51);
                    int var114 = class136.field2239.method1821((byte) 51);
                    int var115 = class136.field2239.method1802((byte) 115);
                    if (var115 == 255) {
                        var115 = -1;
                    }
                    int var116 = class136.field2239.method1802((byte) -122);
                    if (var104 >= 0 && var105 >= 0 && var104 < 208 && var105 < 208 && var106 >= 0 && var107 >= 0 && var106 < 208 && var107 < 208 && var110 != 65535) {
                        int var117 = var107 * 64;
                        int var118 = var106 * 64;
                        int var119 = var104 * 64;
                        int var120 = var105 * 64;
                        if (var108 != 0) {
                            int var123;
                            class46 var124;
                            if (var108 >= 0) {
                                int var121 = var108 - 1;
                                int var122 = var121 & 0x7FF;
                                var123 = (var121 & 0x7AC8) >> 11;
                                var124 = class57.field1002[var122];
                            } else {
                                int var125 = -var108 - 1;
                                int var126 = var125 & 0x7FF;
                                if (class297.field4860 == var126) {
                                    var124 = class16.field314;
                                } else {
                                    var124 = class15.field300[var126];
                                }
                                var123 = (var125 & 0x7CEF) >> 11;
                            }
                            if (var124 != null) {
                                class190 var127 = var124.method282(-1399);
                                if (var127.field3078 != null && var127.field3078[var123] != null) {
                                    var111 -= var127.field3078[var123][1];
                                    int var128 = var127.field3078[var123][0];
                                    int var129 = var127.field3078[var123][2];
                                    int var130 = class128.field2133[var124.field753];
                                    int var131 = class128.field2130[var124.field753];
                                    int var132 = var128 * var131 + var129 * var130 >> 16;
                                    int var133 = var129 * var131 - (var128 * var130) >> 16;
                                    var119 += var132;
                                    var120 += var133;
                                }
                            }
                        }
                        class226 var135 = new class226(var110, class182.field2898, var119, var120, class277.method1939(class182.field2898, var119, var120, (byte) -34) - var111, class275.field4598 + var113, var114 + class275.field4598, var115, var116, var109, var112);
                        var135.method1602((byte) -122, var117, var118, var113 + class275.field4598, -var112 + class277.method1939(class182.field2898, var118, var117, (byte) -34));
                        class258.field4343.method311(arg0 + 125, new class76(var135));
                    }
                } else if (class131.field2170 == 113) {
                    int var136 = class136.field2239.method1802((byte) 114);
                    int var137 = (var136 & 0xF) + class23.field413 * 2;
                    int var138 = (var136 >> 4 & 0xF) + class16.field330 * 2;
                    int var139 = var138 + class136.field2239.method1768(86);
                    int var140 = var137 + class136.field2239.method1768(arg0 + 101);
                    int var141 = class136.field2239.method1762(arg0 - 3);
                    int var142 = class136.field2239.method1821((byte) 51);
                    int var143 = class136.field2239.method1802((byte) -87) * 4;
                    int var144 = class136.field2239.method1802((byte) -120) * 4;
                    int var145 = class136.field2239.method1821((byte) 51);
                    int var146 = class136.field2239.method1821((byte) 51);
                    int var147 = class136.field2239.method1802((byte) 110);
                    if (var147 == 255) {
                        var147 = -1;
                    }
                    int var148 = class136.field2239.method1802((byte) -116);
                    if (var138 >= 0 && var137 >= 0 && var138 < 208 && var137 < 208 && var139 >= 0 && var140 >= 0 && var139 < 208 && var140 < 208 && var142 != 65535) {
                        int var149 = var138 * 64;
                        int var150 = var140 * 64;
                        int var151 = var137 * 64;
                        int var152 = var139 * 64;
                        class226 var153 = new class226(var142, class182.field2898, var149, var151, class277.method1939(class182.field2898, var149, var151, (byte) -34) - var143, class275.field4598 + var145, var146 + class275.field4598, var147, var148, var141, var144);
                        var153.method1602((byte) -127, var150, var152, class275.field4598 + var145, class277.method1939(class182.field2898, var152, var150, (byte) -34) + -var144);
                        class258.field4343.method311(75, new class76(var153));
                    }
                } else if (class131.field2170 == 49) {
                    int var154 = class136.field2239.method1821((byte) 51);
                    int var155 = class136.field2239.method1802((byte) -89);
                    class110.method827(var154, (byte) -36).method9(var155, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
    public static final void method1540(byte arg0) {
        field3657++;
        class139.method1024((long) class275.field4598);
        if (class243.field4082 != -1) {
            class146.method1082(-117, class243.field4082);
        }
        for (int var1 = 0; var1 < class215.field3631; var1++) {
            if (class143.field2351[var1]) {
                class236.field3988[var1] = true;
            }
            class13.field283[var1] = class143.field2351[var1];
            class143.field2351[var1] = false;
        }
        if (arg0 < 76) {
            return;
        }
        class17.field344 = class275.field4598;
        class268.field4454 = null;
        class124.field2095 = -1;
        class73.field1281 = -1;
        if (class243.field4082 != -1) {
            class215.field3631 = 0;
            class244.method1744(-64);
        }
        class211.method1496();
        class19.field356 = 0;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)I")
    public abstract int method1541(int arg0);

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method1542(Component arg0, byte arg1);

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lab;B)Lu;")
    public static final class30 method1543(class249 arg0, byte arg1) {
        field3652++;
        class30 var2 = new class30();
        var2.field502 = arg0.method1821((byte) 51);
        var2.field495 = class263.method1865((byte) -79, var2.field502);
        if (arg1 > -11) {
            field3655 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V")
    public static void method1544(int arg0) {
        field3654 = null;
        field3655 = null;
        int var1 = 109 % ((arg0 + 41) / 55);
        field3656 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1545(Component arg0, int arg1);
}
