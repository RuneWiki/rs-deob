import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class116 extends class449 {

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "Lha;")
    public static class294 field1616 = new class294("RC", 1);

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1617 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "Lap;")
    public static class310 field1618 = new class310(66, 1);

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public int field1615;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "[I")
    public int[] field1607;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "[I")
    public int[] field1608;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "[I")
    public int[] field1612;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "[Lor;")
    public class275[] field1613;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "[Lor;")
    public class275[] field1614;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "[[[B")
    public byte[][][] field1611;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V")
    public static void method908(boolean arg0) {
        field1617 = null;
        field1616 = null;
        if (!arg0) {
            method908(false);
        }
        field1618 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Leo;I)V")
    public static final void method909(class443 arg0, int arg1) {
        field1609++;
        if (class247.field3588 == arg0) {
            int var2 = class46.field710.method1172((byte) -116);
            int var3 = ((var2 & 0x76) >> 4) + class108.field1504;
            int var4 = (var2 & 0x7) + class9.field70;
            int var5 = class46.field710.method1134(-16848);
            int var6 = class46.field710.method1172((byte) -121);
            int var7 = class46.field710.method1134(-16848);
            if (var3 >= 0 && var4 >= 0 && var3 < class36.field388 && class68.field998 > var4) {
                int var8 = var3 * 128 + 64;
                int var9 = var4 * 128 + 64;
                class222 var10 = new class222(var5, var7, class364.field5010, class128.field1749, var8, class407.method2440(var8, -16490, var9, class128.field1749) - var6, var9, var3, var3, var4, var4);
                class422.field5849.method766(new class265(var10), -1);
            }
        } else if (class194.field2885 == arg0) {
            class46.field710.method1172((byte) 29);
            int var11 = class46.field710.method1172((byte) -112);
            int var12 = ((var11 & 0x7A) >> 4) + class108.field1504;
            int var13 = (var11 & 0x7) + class9.field70;
            int var14 = class46.field710.method1134(-16848);
            int var15 = class46.field710.method1172((byte) -108);
            int var16 = class46.field710.method1178((byte) 63);
            String var17 = class46.field710.method1186(-1);
            class304.method1959(class128.field1749, var13, var15, var17, -121, var16, var14, var12);
        } else if (class340.field4695 == arg0) {
            int var18 = class46.field710.method1172((byte) 98);
            int var19 = ((var18 & 0x79) >> 4) + class108.field1504;
            int var20 = (var18 & 0x7) + class9.field70;
            int var21 = class46.field710.method1160(78);
            int var22 = var21 >> 2;
            int var23 = var21 & 0x3;
            int var24 = class161.field2334[var22];
            if (var19 >= 0 && var20 >= 0 && class36.field388 > var19 && var20 < class68.field998) {
                class368.method2253(var19, var22, var23, -124, -1, 0, var20, class128.field1749, var24, -1);
            }
        } else if (class370.field5095 == arg0) {
            int var25 = class46.field710.method1172((byte) -126);
            int var26 = class108.field1504 + (var25 >> 4 & 0x7);
            int var27 = (var25 & 0x7) + class9.field70;
            int var28 = class46.field710.method1134(-16848);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var29 = class46.field710.method1160(81);
            int var30 = var29 >> 2;
            int var31 = var29 & 0x3;
            int var32 = class161.field2334[var30];
            class95.method793(var31, var26, var27, class128.field1749, (byte) -49, var30, var32, var28);
        } else if (class422.field5837 == arg0) {
            int var33 = class46.field710.method1172((byte) 60);
            int var34 = class108.field1504 + (var33 >> 4 & 0x7);
            int var35 = (var33 & 0x7) + class9.field70;
            int var36 = class46.field710.method1152(-1910700904) + var34;
            int var37 = class46.field710.method1152(-1910700904) + var35;
            int var38 = class46.field710.method1163(9988);
            int var39 = class46.field710.method1134(-16848);
            int var40 = class46.field710.method1172((byte) -127) * 4;
            int var41 = class46.field710.method1172((byte) -120) * 4;
            int var42 = class46.field710.method1134(-16848);
            int var43 = class46.field710.method1134(-16848);
            int var44 = class46.field710.method1172((byte) -122);
            int var45 = class46.field710.method1172((byte) 22);
            if (var44 == 255) {
                var44 = -1;
            }
            if (var34 >= 0 && var35 >= 0 && var34 < class36.field388 && var35 < class68.field998 && var36 >= 0 && var37 >= 0 && class36.field388 > var36 && var37 < class68.field998 && var39 != 65535) {
                int var46 = var34 * 128 + 64;
                int var47 = var37 * 128 + 64;
                int var48 = var36 * 128 + 64;
                int var49 = var35 * 128 + 64;
                class260 var50 = new class260(var39, class128.field1749, var46, var49, class407.method2440(var46, -16490, var49, class128.field1749) - var40, class364.field5010 + var42, class364.field5010 + var43, var44, var45, var38, var41);
                var50.method1748(0, var47, var48, class407.method2440(var48, -16490, var47, class128.field1749) - var41, class364.field5010 + var42);
                class178.field2707.method766(new class105(var50), -1);
            }
        } else if (class34.field371 == arg0) {
            int var51 = class46.field710.method1145((byte) 121);
            int var52 = class46.field710.method1139(-123);
            int var53 = class46.field710.method1137(true);
            int var54 = (var53 >> 4 & 0x7) + class108.field1504;
            int var55 = (var53 & 0x7) + class9.field70;
            if (var54 >= 0 && var55 >= 0 && var54 < class36.field388 && class68.field998 > var55) {
                class352.method2174(class128.field1749, (byte) -62, var54, new class143(var51, var52), var55);
                class478.method2830(-101, var54, class128.field1749, var55);
            }
        } else if (class343.field4741 == arg0) {
            int var56 = class46.field710.method1181((byte) -38);
            int var57 = (var56 >> 4 & 0x7) + class108.field1504;
            int var58 = (var56 & 0x7) + class9.field70;
            int var59 = class46.field710.method1134(-16848);
            int var60 = class46.field710.method1171((byte) 112);
            int var61 = class46.field710.method1145((byte) 108);
            if (var57 >= 0 && var58 >= 0 && var57 < class36.field388 && var58 < class68.field998 && class168.field2432 != var60) {
                class352.method2174(class128.field1749, (byte) -42, var57, new class143(var61, var59), var58);
                class478.method2830(67, var57, class128.field1749, var58);
            }
        } else {
            int var62 = -77 / ((60 - arg1) / 55);
            if (class402.field5514 == arg0) {
                int var63 = class46.field710.method1172((byte) -114);
                int var64 = ((var63 & 0x74) >> 4) + class108.field1504;
                int var65 = (var63 & 0x7) + class9.field70;
                int var66 = class46.field710.method1134(-16848);
                if (var66 == 65535) {
                    var66 = -1;
                }
                int var67 = class46.field710.method1172((byte) -120);
                int var68 = (var67 & 0xFA) >> 4;
                int var69 = var67 & 0x7;
                int var70 = class46.field710.method1172((byte) -128);
                int var71 = class46.field710.method1172((byte) 82);
                if (var64 >= 0 && var65 >= 0 && var64 < class36.field388 && class68.field998 > var65) {
                    int var72 = var68 + 1;
                    if (class262.field3781.field5811[0] >= var64 - var72 && (var64 + var72) >= class262.field3781.field5811[0] && var65 - var72 <= class262.field3781.field5807[0] && var65 + var72 >= class262.field3781.field5807[0] && class339.field4687 != 0 && var69 > 0 && class172.field2628 < 50 && var66 != -1) {
                        class191.field2863[class172.field2628] = var66;
                        class261.field3746[class172.field2628] = var69;
                        class377.field5194[class172.field2628] = var70;
                        class126.field1717[class172.field2628] = null;
                        class128.field1758[class172.field2628] = (class128.field1749 << 24) + var68 - (-(var64 << 16) - (var65 << 8));
                        class131.field1805[class172.field2628] = var71;
                        class172.field2628++;
                    }
                }
            } else if (class1.field9 == arg0) {
                int var73 = class46.field710.method1172((byte) -123);
                int var74 = ((var73 & 0x7E) >> 4) + class108.field1504;
                int var75 = (var73 & 0x7) + class9.field70;
                int var76 = class46.field710.method1134(-16848);
                int var77 = class46.field710.method1134(-16848);
                int var78 = class46.field710.method1134(-16848);
                if (class427.field5956 != null && var74 >= 0 && var75 >= 0 && var74 < class36.field388 && var75 < class68.field998) {
                    class223 var79 = (class223) class427.field5956.method1104(-128, (long) (class128.field1749 << 28 | var75 << 14 | var74));
                    if (var79 != null) {
                        for (class143 var80 = (class143) var79.field3219.method775(1); var80 != null; var80 = (class143) var79.field3219.method763(0)) {
                            if ((var76 & 0x7FFF) == var80.field1987 && var80.field1992 == var77) {
                                var80.method2714(112);
                                var80.field1992 = var78;
                                class352.method2174(class128.field1749, (byte) -50, var74, var80, var75);
                                break;
                            }
                        }
                        class478.method2830(116, var74, class128.field1749, var75);
                    }
                }
            } else if (class389.field5384 == arg0) {
                int var81 = class46.field710.method1172((byte) -6);
                int var82 = (var81 >> 4 & 0xF) + class108.field1504 * 2;
                int var83 = (var81 & 0xF) + class9.field70 * 2;
                int var84 = class46.field710.method1152(-1910700904) + var82;
                int var85 = var83 + class46.field710.method1152(-1910700904);
                int var86 = class46.field710.method1163(9988);
                int var87 = class46.field710.method1134(-16848);
                int var88 = class46.field710.method1172((byte) -109) * 4;
                int var89 = class46.field710.method1172((byte) -124) * 4;
                int var90 = class46.field710.method1134(-16848);
                int var91 = class46.field710.method1134(-16848);
                int var92 = class46.field710.method1172((byte) 121);
                int var93 = class46.field710.method1172((byte) -107);
                if (var92 == 255) {
                    var92 = -1;
                }
                if (var82 >= 0 && var83 >= 0 && var82 < (class36.field388 * 2) && var83 < class36.field388 * 2 && var84 >= 0 && var85 >= 0 && (class68.field998 * 2) > var84 && var85 < class68.field998 * 2 && var87 != 65535) {
                    int var94 = var84 * 64;
                    int var95 = var82 * 64;
                    int var96 = var85 * 64;
                    int var97 = var83 * 64;
                    class260 var98 = new class260(var87, class128.field1749, var95, var97, class407.method2440(var95, -16490, var97, class128.field1749) - var88, class364.field5010 + var90, var91 + class364.field5010, var92, var93, var86, var89);
                    var98.method1748(0, var96, var94, class407.method2440(var94, -16490, var96, class128.field1749) - var89, class364.field5010 + var90);
                    class178.field2707.method766(new class105(var98), -1);
                }
            } else if (class168.field2433 == arg0) {
                int var99 = class46.field710.method1134(-16848);
                int var100 = class46.field710.method1172((byte) -128);
                class468.field6599.method506(-127, var99).method1814(var100, (byte) 127);
            } else if (class303.field4293 == arg0) {
                int var101 = class46.field710.method1181((byte) -38);
                int var102 = var101 >> 2;
                int var103 = var101 & 0x3;
                int var104 = class161.field2334[var102];
                int var105 = class46.field710.method1134(-16848);
                int var106 = class46.field710.method1181((byte) -38);
                int var107 = ((var106 & 0x72) >> 4) + class108.field1504;
                int var108 = (var106 & 0x7) + class9.field70;
                if (var107 >= 0 && var108 >= 0 && class36.field388 > var107 && class68.field998 > var108) {
                    class368.method2253(var107, var102, var103, -111, var105, 0, var108, class128.field1749, var104, -1);
                }
            } else if (class117.field1628 == arg0) {
                int var109 = class46.field710.method1172((byte) -28);
                int var110 = (var109 >> 4 & 0xF) + class108.field1504 * 2;
                int var111 = class9.field70 * 2 + (var109 & 0xF);
                int var112 = var110 + class46.field710.method1152(-1910700904);
                int var113 = class46.field710.method1152(-1910700904) + var111;
                int var114 = class46.field710.method1163(9988);
                int var115 = class46.field710.method1163(9988);
                int var116 = class46.field710.method1134(-16848);
                int var117 = class46.field710.method1152(-1910700904);
                int var118 = class46.field710.method1172((byte) -113) * 4;
                int var119 = class46.field710.method1134(-16848);
                int var120 = class46.field710.method1134(-16848);
                int var121 = class46.field710.method1172((byte) 105);
                if (var121 == 255) {
                    var121 = -1;
                }
                int var122 = class46.field710.method1172((byte) -124);
                if (var110 >= 0 && var111 >= 0 && var110 < (class36.field388 * 2) && class36.field388 * 2 > var111 && var112 >= 0 && var113 >= 0 && var112 < class68.field998 * 2 && var113 < class68.field998 * 2 && var116 != 65535) {
                    int var123 = var113 * 64;
                    int var124 = var110 * 64;
                    int var125 = var112 * 64;
                    int var126 = var111 * 64;
                    if (var114 != 0) {
                        int var129;
                        class418 var130;
                        if (var114 >= 0) {
                            int var127 = var114 - 1;
                            int var128 = var127 & 0x7FF;
                            var129 = var127 >> 11 & 0xF;
                            var130 = class163.field2377[var128];
                        } else {
                            int var131 = -var114 - 1;
                            var129 = var131 >> 11 & 0xF;
                            int var132 = var131 & 0x7FF;
                            if (class168.field2432 == var132) {
                                var130 = class262.field3781;
                            } else {
                                var130 = class112.field1570[var132];
                            }
                        }
                        if (var130 != null) {
                            class389 var133 = var130.method2506(-16338);
                            if (var133.field5354 != null && var133.field5354[var129] != null) {
                                int var134 = var133.field5354[var129][0];
                                int var135 = var133.field5354[var129][2];
                                int var136 = var130.field5772.method1849(-10543);
                                int var137 = class319.field4501[var136];
                                int var138 = class319.field4504[var136];
                                int var139 = var134 * var138 + var135 * var137 >> 15;
                                int var140 = var135 * var138 - (var134 * var137) >> 15;
                                var124 += var139;
                                var126 += var140;
                                var117 -= var133.field5354[var129][1];
                            }
                        }
                    }
                    class260 var142 = new class260(var116, class128.field1749, var124, var126, class407.method2440(var124, -16490, var126, class128.field1749) - var117, var119 - -class364.field5010, class364.field5010 + var120, var121, var122, var115, var118);
                    var142.method1748(0, var123, var125, class407.method2440(var125, -16490, var123, class128.field1749) - var118, var119 - -class364.field5010);
                    class178.field2707.method766(new class105(var142), -1);
                }
            } else if (class163.field2376 == arg0) {
                int var143 = class46.field710.method1160(91);
                int var144 = (var143 >> 4 & 0x7) + class108.field1504;
                int var145 = (var143 & 0x7) + class9.field70;
                int var146 = class46.field710.method1145((byte) 76);
                if (var144 >= 0 && var145 >= 0 && class36.field388 > var144 && var145 < class68.field998) {
                    class223 var147 = (class223) class427.field5956.method1104(-125, (long) (var144 | var145 << 14 | class128.field1749 << 28));
                    if (var147 != null) {
                        for (class143 var148 = (class143) var147.field3219.method775(1); var148 != null; var148 = (class143) var147.field3219.method763(0)) {
                            if ((var146 & 0x7FFF) == var148.field1987) {
                                var148.method2714(39);
                                break;
                            }
                        }
                        if (var147.field3219.method765(-96)) {
                            var147.method2714(-87);
                        }
                        class478.method2830(80, var144, class128.field1749, var145);
                    }
                }
            } else if (class304.field4325 == arg0) {
                int var149 = class46.field710.method1171((byte) 110);
                byte var150 = class46.field710.method1193(-2097152);
                byte var151 = class46.field710.method1152(-1910700904);
                int var152 = class46.field710.method1137(true);
                int var153 = var152 >> 2;
                int var154 = var152 & 0x3;
                byte var155 = class46.field710.method1193(-2097152);
                int var156 = class46.field710.method1134(-16848);
                byte var157 = class46.field710.method1147((byte) -112);
                int var158 = class46.field710.method1145((byte) 66);
                int var159 = class46.field710.method1172((byte) 67);
                int var160 = (var159 >> 4 & 0x7) + class108.field1504;
                int var161 = (var159 & 0x7) + class9.field70;
                int var162 = class46.field710.method1159((byte) 101);
                if (!class374.field5152.method452()) {
                    class86.method731(var157, var151, var160, var155, var161, var149, class128.field1749, var154, var158, var162, 97, var156, var153, var150);
                }
            } else {
                class83.method704((byte) 120, (Throwable) null, "T3 - " + arg0);
                class370.method2263(3);
            }
        }
    }
}
