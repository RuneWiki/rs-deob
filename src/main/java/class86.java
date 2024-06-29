import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class86 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Z")
    public static boolean field1419 = true;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field1418 = 0;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "[I")
    public static int[] field1421;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public static final void method587(boolean arg0) {
        field1420++;
        if (class71.field1208 == 186) {
            int var1 = class131.field2053.method1133((byte) 53);
            int var2 = (var1 & 0xF) + class309.field4938 * 2;
            int var3 = class165.field2654 * 2 + ((var1 & 0xF5) >> 4);
            int var4 = var3 + class131.field2053.method1107((byte) -105);
            int var5 = class131.field2053.method1107((byte) -105) + var2;
            int var6 = class131.field2053.method1146(2);
            int var7 = class131.field2053.method1146(2);
            int var8 = class131.field2053.method1142(-18970);
            int var9 = class131.field2053.method1107((byte) -76);
            int var10 = class131.field2053.method1133((byte) 53) * 4;
            int var11 = class131.field2053.method1142(-18970);
            int var12 = class131.field2053.method1142(-18970);
            int var13 = class131.field2053.method1133((byte) 53);
            int var14 = class131.field2053.method1133((byte) 53);
            if (var13 == 255) {
                var13 = -1;
            }
            if (var3 >= 0 && var2 >= 0 && var3 < 208 && var2 < 208 && var4 >= 0 && var5 >= 0 && var4 < 208 && var5 < 208 && var8 != 65535) {
                int var15 = var5 * 64;
                int var16 = var4 * 64;
                int var17 = var3 * 64;
                int var18 = var2 * 64;
                if (var6 != 0) {
                    int var20;
                    class43 var22;
                    if (var6 >= 0) {
                        int var19 = var6 - 1;
                        var20 = var19 >> 11 & 0xF;
                        int var21 = var19 & 0x7FF;
                        var22 = class12.field127[var21];
                    } else {
                        int var23 = -var6 - 1;
                        int var24 = var23 & 0x7FF;
                        var20 = var23 >> 11 & 0xF;
                        if (class123.field1961 == var24) {
                            var22 = class239.field3829;
                        } else {
                            var22 = class270.field4355[var24];
                        }
                    }
                    if (var22 != null) {
                        class182 var25 = var22.method292(123);
                        if (var25.field2990 != null && var25.field2990[var20] != null) {
                            var9 -= var25.field2990[var20][1];
                            int var26 = var25.field2990[var20][0];
                            int var27 = var25.field2990[var20][2];
                            int var28 = class302.field4823[var22.field652];
                            int var29 = class302.field4824[var22.field652];
                            int var30 = var26 * var29 + var27 * var28 >> 16;
                            int var31 = var27 * var29 - (var26 * var28) >> 16;
                            var18 += var31;
                            var17 += var30;
                        }
                    }
                }
                class255 var33 = new class255(var8, class56.field941, var17, var18, class155.method1060((byte) -12, class56.field941, var18, var17) - var9, class29.field360 + var11, class29.field360 + var12, var13, var14, var7, var10);
                var33.method1718(class155.method1060((byte) -12, class56.field941, var15, var16) - var10, class29.field360 + var11, -110, var16, var15);
                class25.field303.method1646(true, new class216(var33));
            }
        } else if (class71.field1208 == 137) {
            int var34 = class131.field2053.method1133((byte) 53);
            int var35 = ((var34 & 0x7F) >> 4) + class165.field2654;
            int var36 = class309.field4938 + (var34 & 0x7);
            int var37 = class131.field2053.method1142(-18970);
            int var38 = class131.field2053.method1142(-18970);
            int var39 = class131.field2053.method1142(-18970);
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                class246 var40 = class192.field3113[class56.field941][var35][var36];
                if (var40 != null) {
                    for (class294 var41 = (class294) var40.method1643((byte) 107); var41 != null; var41 = (class294) var40.method1642((byte) 112)) {
                        class159 var42 = var41.field4707;
                        if ((var37 & 0x7FFF) == var42.field2530 && var42.field2529 == var38) {
                            var42.field2529 = var39;
                            break;
                        }
                    }
                    class247.method1652(var35, 64, var36);
                }
            }
        } else if (class71.field1208 == 60) {
            int var43 = class131.field2053.method1126((byte) 118);
            int var44 = (var43 >> 4 & 0x7) + class165.field2654;
            int var45 = class309.field4938 + (var43 & 0x7);
            int var46 = class131.field2053.method1145(-49);
            if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                class246 var47 = class192.field3113[class56.field941][var44][var45];
                if (var47 != null) {
                    for (class294 var48 = (class294) var47.method1643((byte) 113); var48 != null; var48 = (class294) var47.method1642((byte) 105)) {
                        if ((var46 & 0x7FFF) == var48.field4707.field2530) {
                            var48.method913(-3542);
                            break;
                        }
                    }
                    if (var47.method1643((byte) 126) == null) {
                        class192.field3113[class56.field941][var44][var45] = null;
                    }
                    class247.method1652(var44, 64, var45);
                }
            }
        } else {
            if (class71.field1208 == 158) {
                byte var49 = class131.field2053.method1107((byte) -75);
                int var50 = class131.field2053.method1145(-115);
                int var51 = class131.field2053.method1133((byte) 53);
                int var52 = (var51 >> 4 & 0x7) + class165.field2654;
                int var53 = (var51 & 0x7) + class309.field4938;
                int var54 = class131.field2053.method1153((byte) -121);
                int var55 = class131.field2053.method1133((byte) 53);
                int var56 = var55 >> 2;
                int var57 = var55 & 0x3;
                int var58 = class131.field2053.method1143(65280);
                byte var59 = class131.field2053.method1163(-29446);
                int var60 = class131.field2053.method1147(-9173);
                byte var61 = class131.field2053.method1109((byte) -45);
                byte var62 = class131.field2053.method1109((byte) -96);
                class259.method1740(var53, var49, var60, var57, var61, var50, var59, var54, var56, var52, var62, 256, var58);
            }
            if (class71.field1208 == 34) {
                int var63 = class131.field2053.method1142(-18970);
                int var64 = class131.field2053.method1133((byte) 53);
                class5.method29(var63, arg0).method1080(false, var64);
            } else if (class71.field1208 == 66) {
                int var65 = class131.field2053.method1127((byte) 30);
                int var66 = ((var65 & 0x7D) >> 4) + class165.field2654;
                int var67 = class309.field4938 + (var65 & 0x7);
                int var68 = class131.field2053.method1145(-98);
                int var69 = class131.field2053.method1147(-9173);
                int var70 = class131.field2053.method1143(65280);
                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104 && class123.field1961 != var70) {
                    class159 var71 = new class159();
                    var71.field2530 = var69;
                    var71.field2529 = var68;
                    if (class192.field3113[class56.field941][var66][var67] == null) {
                        class192.field3113[class56.field941][var66][var67] = new class246();
                    }
                    class192.field3113[class56.field941][var66][var67].method1646(arg0, new class294(var71));
                    class247.method1652(var66, 64, var67);
                }
            } else {
                if (!arg0) {
                    field1421 = null;
                }
                if (class71.field1208 == 124) {
                    int var72 = class131.field2053.method1133((byte) 53);
                    int var73 = (var72 >> 4 & 0x7) + class165.field2654;
                    int var74 = (var72 & 0x7) + class309.field4938;
                    int var75 = class131.field2053.method1142(-18970);
                    if (var75 == 65535) {
                        var75 = -1;
                    }
                    int var76 = class131.field2053.method1133((byte) 53);
                    int var77 = var76 & 0x7;
                    int var78 = var76 >> 4 & 0xF;
                    int var79 = class131.field2053.method1133((byte) 53);
                    int var80 = class131.field2053.method1133((byte) 53);
                    if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                        int var81 = var78 + 1;
                        if (var73 - var81 <= class239.field3829.field709[0] && class239.field3829.field709[0] <= (var73 + var81) && (var74 - var81) <= class239.field3829.field704[0] && class239.field3829.field704[0] <= (var74 + var81) && class32.field481 != 0 && var77 > 0 && class195.field3163 < 50 && var75 != -1) {
                            class199.field3203[class195.field3163] = var75;
                            class4.field47[class195.field3163] = var77;
                            class291.field4678[class195.field3163] = var79;
                            class30.field371[class195.field3163] = null;
                            class11.field118[class195.field3163] = (var73 << 16) + var78 + (var74 << 8);
                            class126.field1995[class195.field3163] = var80;
                            class195.field3163++;
                        }
                    }
                } else if (class71.field1208 == 235) {
                    int var82 = class131.field2053.method1133((byte) 53);
                    int var83 = class165.field2654 + (var82 >> 4 & 0x7);
                    int var84 = class309.field4938 + (var82 & 0x7);
                    int var85 = var83 + class131.field2053.method1107((byte) -91);
                    int var86 = var84 + class131.field2053.method1107((byte) -95);
                    int var87 = class131.field2053.method1146(2);
                    int var88 = class131.field2053.method1142(-18970);
                    int var89 = class131.field2053.method1133((byte) 53) * 4;
                    int var90 = class131.field2053.method1133((byte) 53) * 4;
                    int var91 = class131.field2053.method1142(-18970);
                    int var92 = class131.field2053.method1142(-18970);
                    int var93 = class131.field2053.method1133((byte) 53);
                    int var94 = class131.field2053.method1133((byte) 53);
                    if (var93 == 255) {
                        var93 = -1;
                    }
                    if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104 && var88 != 65535) {
                        int var95 = var83 * 128 + 64;
                        int var96 = var84 * 128 + 64;
                        int var97 = var86 * 128 + 64;
                        class255 var98 = new class255(var88, class56.field941, var95, var96, class155.method1060((byte) -12, class56.field941, var96, var95) - var89, class29.field360 + var91, class29.field360 + var92, var93, var94, var87, var90);
                        int var99 = var85 * 128 + 64;
                        var98.method1718(class155.method1060((byte) -12, class56.field941, var97, var99) - var90, class29.field360 + var91, -113, var99, var97);
                        class25.field303.method1646(true, new class216(var98));
                    }
                } else if (class71.field1208 == 91) {
                    int var100 = class131.field2053.method1133((byte) 53);
                    int var101 = var100 & 0x3;
                    int var102 = var100 >> 2;
                    int var103 = class183.field3012[var102];
                    int var104 = class131.field2053.method1126((byte) 86);
                    int var105 = class165.field2654 + (var104 >> 4 & 0x7);
                    int var106 = (var104 & 0x7) + class309.field4938;
                    if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
                        class126.method876(var102, var105, 0, var106, var103, -1, class56.field941, var101, -1, 5);
                    }
                } else if (class71.field1208 == 103) {
                    int var107 = class131.field2053.method1133((byte) 53);
                    int var108 = (var107 & 0x7) + class309.field4938;
                    int var109 = class165.field2654 + (var107 >> 4 & 0x7);
                    int var110 = class131.field2053.method1142(-18970);
                    int var111 = class131.field2053.method1133((byte) 53);
                    int var112 = class131.field2053.method1142(-18970);
                    if (var109 >= 0 && var108 >= 0 && var109 < 104 && var108 < 104) {
                        int var113 = var109 * 128 + 64;
                        int var114 = var108 * 128 + 64;
                        class141 var115 = new class141(var110, class56.field941, var113, var114, class155.method1060((byte) -12, class56.field941, var114, var113) - var111, var112, class29.field360);
                        class1.field10.method1646(true, new class134(var115));
                    }
                } else if (class71.field1208 == 189) {
                    int var116 = class131.field2053.method1168(65280);
                    int var117 = (var116 & 0x7) + class309.field4938;
                    int var118 = ((var116 & 0x70) >> 4) + class165.field2654;
                    int var119 = class131.field2053.method1147(-9173);
                    int var120 = class131.field2053.method1147(-9173);
                    if (var118 >= 0 && var117 >= 0 && var118 < 104 && var117 < 104) {
                        class159 var121 = new class159();
                        var121.field2530 = var119;
                        var121.field2529 = var120;
                        if (class192.field3113[class56.field941][var118][var117] == null) {
                            class192.field3113[class56.field941][var118][var117] = new class246();
                        }
                        class192.field3113[class56.field941][var118][var117].method1646(true, new class294(var121));
                        class247.method1652(var118, 64, var117);
                    }
                } else if (class71.field1208 == 150) {
                    int var122 = class131.field2053.method1133((byte) 53);
                    int var123 = (var122 & 0xF) + class309.field4938 * 2;
                    int var124 = class165.field2654 * 2 + ((var122 & 0xFC) >> 4);
                    int var125 = class131.field2053.method1107((byte) -108) + var124;
                    int var126 = var123 + class131.field2053.method1107((byte) -123);
                    int var127 = class131.field2053.method1146(2);
                    int var128 = class131.field2053.method1142(-18970);
                    int var129 = class131.field2053.method1133((byte) 53) * 4;
                    int var130 = class131.field2053.method1133((byte) 53) * 4;
                    int var131 = class131.field2053.method1142(-18970);
                    int var132 = class131.field2053.method1142(-18970);
                    int var133 = class131.field2053.method1133((byte) 53);
                    int var134 = class131.field2053.method1133((byte) 53);
                    if (var133 == 255) {
                        var133 = -1;
                    }
                    if (var124 >= 0 && var123 >= 0 && var124 < 208 && var123 < 208 && var125 >= 0 && var126 >= 0 && var125 < 208 && var126 < 208 && var128 != 65535) {
                        int var135 = var123 * 64;
                        int var136 = var124 * 64;
                        class255 var137 = new class255(var128, class56.field941, var136, var135, class155.method1060((byte) -12, class56.field941, var135, var136) - var129, class29.field360 + var131, class29.field360 + var132, var133, var134, var127, var130);
                        int var138 = var125 * 64;
                        int var139 = var126 * 64;
                        var137.method1718(class155.method1060((byte) -12, class56.field941, var139, var138) - var130, class29.field360 + var131, -96, var138, var139);
                        class25.field303.method1646(arg0, new class216(var137));
                    }
                } else if (class71.field1208 == 11) {
                    int var140 = class131.field2053.method1127((byte) 123);
                    int var141 = ((var140 & 0x71) >> 4) + class165.field2654;
                    int var142 = (var140 & 0x7) + class309.field4938;
                    int var143 = class131.field2053.method1127((byte) 41);
                    int var144 = var143 >> 2;
                    int var145 = var143 & 0x3;
                    int var146 = class183.field3012[var144];
                    int var147 = class131.field2053.method1142(-18970);
                    if (var141 >= 0 && var142 >= 0 && var141 < 104 && var142 < 104) {
                        class126.method876(var144, var141, 0, var142, var146, -1, class56.field941, var145, var147, 5);
                    }
                } else if (class71.field1208 == 118) {
                    int var148 = class131.field2053.method1126((byte) 98);
                    int var149 = var148 & 0x3;
                    int var150 = var148 >> 2;
                    int var151 = class183.field3012[var150];
                    int var152 = class131.field2053.method1145(-47);
                    int var153 = class131.field2053.method1126((byte) 105);
                    if (var152 == 65535) {
                        var152 = -1;
                    }
                    int var154 = (var153 >> 4 & 0x7) + class165.field2654;
                    int var155 = (var153 & 0x7) + class309.field4938;
                    class305.method2043(class56.field941, var151, var155, var150, var152, false, var154, var149);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static void method588(byte arg0) {
        if (arg0 > 123) {
            field1421 = null;
        }
    }
}
