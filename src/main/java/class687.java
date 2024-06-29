import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public class class687 extends class36 {

    @OriginalMember(owner = "client!kja", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field9931 = new String[] { method5005(method5004("Ci\u001f{:\u0000")), method5005(method5004("S-P{\u0004")), method5005(method5004("Fv\u00129")), method5005(method5004("Ci\u001f{=\u0000")), method5005(method5004("Ci\u001f{;\u0000")), method5005(method5004("Ci\u001f{<\u0000")), method5005(method5004("Ci\u001f{8\u0000")) };

    @OriginalMember(owner = "client!kja", name = "u", descriptor = "Lvn;")
    public static class330 field9922 = new class330(4, -1);

    @OriginalMember(owner = "client!kja", name = "z", descriptor = "[I")
    public static int[] field9926 = new int[8];

    @OriginalMember(owner = "client!kja", name = "t", descriptor = "I")
    public static int field9928 = 0;

    @OriginalMember(owner = "client!kja", name = "w", descriptor = "[I")
    public static int[] field9929 = new int[1];

    @OriginalMember(owner = "client!kja", name = "A", descriptor = "B")
    private byte field9919;

    @OriginalMember(owner = "client!kja", name = "o", descriptor = "B")
    private byte field9924;

    @OriginalMember(owner = "client!kja", name = "y", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!kja", name = "v", descriptor = "I")
    public static int field9921;

    @OriginalMember(owner = "client!kja", name = "q", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!kja", name = "s", descriptor = "I")
    public static int field9925;

    @OriginalMember(owner = "client!kja", name = "x", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!kja", name = "p", descriptor = "Lgda;")
    public static class58 field9927;

    @OriginalMember(owner = "client!kja", name = "r", descriptor = "Ljava/lang/String;")
    private String field9920;

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(IIBIIII)V", line = 4)
    public static final void method5001(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field9918++;
            int var7 = class691.field9962;
            class60.field781 = 0;
            int[] var8 = class239.field3685;
            for (int var9 = 0; var9 < class632.field9088 + var7; var9++) {
                class162 var10 = null;
                class77 var11;
                if (var7 > var9) {
                    var11 = class33.field395[var8[var9]];
                } else {
                    var11 = ((class19) class176.field2797.method737((byte) -39, (long) class263.field4278[var9 - var7])).field194;
                    var10 = ((class426) var11).field6716;
                    if (var10.field2620 != null) {
                        var10 = var10.method1530(-76, class398.field6315);
                        if (var10 == null) {
                            continue;
                        }
                    }
                }
                if (var11.field1124 >= 0 && (class680.field9672 == var11.field1127 || class438.field6846.field9975 == var11.field9975)) {
                    class102.method969(var11.method813((byte) -121), -21235, arg1, arg0 >> 1, arg3 >> 1, arg6, var11);
                    if (class208.field3248[0] >= 0) {
                        if (var11.field1173 != null && (var9 >= var7 || class748.field11041 == 0 || class748.field11041 == 3 || class748.field11041 == 1 && class445.method3480(((class738) var11).field10821, 102)) && class97.field1430 > class60.field781) {
                            class97.field1415[class60.field781] = client.field5163.method498(var11.field1173, -1) / 2;
                            class97.field1423[class60.field781] = class208.field3248[0];
                            class97.field1424[class60.field781] = class208.field3248[1];
                            class97.field1416[class60.field781] = var11.field1133;
                            class97.field1420[class60.field781] = var11.field1152;
                            class97.field1425[class60.field781] = var11.field1168;
                            class97.field1427[class60.field781] = var11.field1173;
                            class60.field781++;
                        }
                        int var12 = class208.field3248[1] + arg4;
                        int var13;
                        if (var11.field1120 || class431.field6776 >= var11.field1138) {
                            var13 = var12 - Math.max(client.field5163.field581, class159.field2327[0].method13());
                        } else {
                            boolean var14 = true;
                            byte var15 = 1;
                            int var17;
                            if (var7 > var9) {
                                class738 var16 = class33.field395[var8[var9]];
                                var17 = var11.method802(-125).field10161;
                                if (var16.field10849) {
                                    var15 = 2;
                                }
                            } else {
                                var17 = var10.field2605;
                                if (var17 == -1) {
                                    var17 = var11.method802(-74).field10161;
                                }
                            }
                            class107[] var18 = class159.field2327;
                            if (var17 != -1) {
                                class107[] var19 = (class107[]) class82.field1252.method302(-125, (long) var17);
                                if (var19 == null) {
                                    class174[] var20 = class174.method1613(class550.field8065, var17, 0);
                                    if (var20 != null) {
                                        var19 = new class107[var20.length];
                                        for (int var21 = 0; var21 < var20.length; var21++) {
                                            var19[var21] = class662.field9437.method213(var20[var21], true);
                                        }
                                        class82.field1252.method295(false, (long) var17, var19);
                                    }
                                }
                                if (var19 != null && var19.length >= 2) {
                                    var18 = var19;
                                }
                            }
                            if (var18.length <= var15) {
                                var15 = 1;
                            }
                            class107 var22 = var18[0];
                            class107 var23 = var18[var15];
                            var13 = var12 - Math.max(client.field5163.field581, var22.method13());
                            int var24 = arg5 - ((var22.method7() >> 1) - class208.field3248[0]);
                            int var25 = var22.method7() * var11.field1130 / 255;
                            int var26 = var22.method13();
                            if (var11.field1130 > 0 && var25 < 2) {
                                var25 = 2;
                            }
                            var22.method1001(var24, var13);
                            class662.field9437.method162(var24, var13, var24 + var25, var13 + var26);
                            var23.method1001(var24, var13);
                            class662.field9437.method221(arg5, arg4, arg0 + arg5, arg4 - -arg3);
                            class458.method3552(var13, var24 + var22.method26(), var13 + var26, var24, -86);
                        }
                        var13 -= 2;
                        if (!var11.field1120) {
                            if (var11.field1162 > class431.field6776) {
                                class107 var27 = class193.field3046[var11.field1181 ? 2 : 0];
                                class107 var28 = class193.field3046[var11.field1181 ? 3 : 1];
                                boolean var29 = true;
                                int var30;
                                if ((var11 instanceof class426)) {
                                    var30 = var10.field2562;
                                    if (var30 == -1) {
                                        var30 = var11.method802(-62).field10143;
                                    }
                                } else {
                                    var30 = var11.method802(-83).field10143;
                                }
                                if (var30 != -1) {
                                    class107[] var31 = (class107[]) class738.field10844.method302(-82, (long) var30);
                                    if (var31 == null) {
                                        class174[] var32 = class174.method1613(class550.field8065, var30, 0);
                                        if (var32 != null) {
                                            var31 = new class107[var32.length];
                                            for (int var33 = 0; var33 < var32.length; var33++) {
                                                var31[var33] = class662.field9437.method213(var32[var33], true);
                                            }
                                            class738.field10844.method295(false, (long) var30, var31);
                                        }
                                    }
                                    if (var31 != null && var31.length == 4) {
                                        var27 = var31[var11.field1181 ? 2 : 0];
                                        var28 = var31[var11.field1181 ? 3 : 1];
                                    }
                                }
                                int var34 = var11.field1162 - class431.field6776;
                                int var35;
                                if (var34 <= var11.field1180) {
                                    var35 = var27.method7();
                                } else {
                                    int var36 = var34 - var11.field1180;
                                    int var37 = var11.field1183 == 0 ? 0 : (var11.field1134 - var36) / var11.field1183 * var11.field1183;
                                    var35 = var37 * var27.method7() / var11.field1134;
                                }
                                int var38 = var27.method13();
                                var13 -= var38;
                                int var39 = arg5 + class208.field3248[0] - (var27.method7() >> 1);
                                var27.method1001(var39, var13);
                                class662.field9437.method162(var39, var13, var35 + var39, var13 - -var38);
                                var28.method1001(var39, var13);
                                class662.field9437.method221(arg5, arg4, arg0 + arg5, arg4 - -arg3);
                                class458.method3552(var13, var27.method26() + var39, var13 + var38, var39, -73);
                                var13 -= 2;
                            }
                            if (var9 < var7) {
                                class738 var40 = (class738) var11;
                                if (var40.field10843 != -1) {
                                    var13 -= 25;
                                    class107 var41 = class333.field5446[var40.field10843];
                                    var41.method1001(class208.field3248[0] + arg5 - 12, var13);
                                    class458.method3552(var13, class208.field3248[0] + arg5 + var41.method26() - 12, var41.method12() + var13, class208.field3248[0] + arg5 - 12, -114);
                                    var13 -= 2;
                                }
                                if (var40.field10816 != -1) {
                                    var13 -= 25;
                                    class107 var42 = class166.field2694[var40.field10816];
                                    var42.method1001(arg5 + class208.field3248[0] - 12, var13);
                                    class458.method3552(var13, class208.field3248[0] + arg5 + var42.method26() - 12, var42.method12() + var13, class208.field3248[0] + arg5 - 12, -67);
                                    var13 -= 2;
                                }
                            } else if (var10.field2567 >= 0 && var10.field2567 < class166.field2694.length) {
                                class107 var43 = class166.field2694[var10.field2567];
                                var13 -= 25;
                                var43.method1001(arg5 + class208.field3248[0] - (var43.method7() >> 1), var13);
                                class458.method3552(var13, arg5 + class208.field3248[0] - (var43.method7() >> 1) + var43.method26(), var13 + var43.method12(), arg5 + (class208.field3248[0] - (var43.method7() >> 1)), -84);
                                var13 -= 2;
                            }
                        }
                        int var10000;
                        if (!var11 instanceof class738) {
                            int var50 = 0;
                            class165[] var51 = class262.field4273;
                            for (int var52 = 0; var52 < var51.length; var52++) {
                                class165 var53 = var51[var52];
                                if (var53 != null && var53.field2676 == 1 && class263.field4278[var9 - var7] == var53.field2687) {
                                    class107 var54 = class766.field11219[var53.field2679];
                                    if (var54.method13() > var50) {
                                        var50 = var54.method13();
                                    }
                                    if (class431.field6776 % 20 < 10) {
                                        var54.method1001(class208.field3248[0] + arg5 - 12, var13 - var54.method13());
                                        class458.method3552(var13 - var54.method13(), arg5 - (-class208.field3248[0] + 12) + var54.method26(), -var54.method13() + (var13 + var54.method12()), class208.field3248[0] + -12 + arg5, -103);
                                    }
                                }
                            }
                            if (var50 > 0) {
                                var10000 = var13 - (var50 + 2);
                            }
                        } else if (var9 >= 0) {
                            int var44 = 0;
                            class165[] var45 = class262.field4273;
                            for (int var46 = 0; var46 < var45.length; var46++) {
                                class165 var47 = var45[var46];
                                if (var47 != null && var47.field2676 == 10 && var8[var9] == var47.field2687) {
                                    class107 var48 = class766.field11219[var47.field2679];
                                    if (var48.method13() > var44) {
                                        var44 = var48.method13();
                                    }
                                    var48.method1001(arg5 + class208.field3248[0] - 12, -var48.method13() + var13);
                                    class458.method3552(var13 - var48.method13(), class208.field3248[0] + (arg5 - (-var48.method26() + 12)), var13 - var48.method13() + var48.method12(), arg5 + -12 - -class208.field3248[0], -98);
                                }
                            }
                            if (var44 > 0) {
                                var10000 = var13 - (var44 + 2);
                            }
                        }
                        for (int var56 = 0; var56 < class46.field521; var56++) {
                            int var57 = var11.field1163[var56];
                            int var58 = var11.field1135[var56];
                            class260 var59 = null;
                            int var60 = 0;
                            if (var58 >= 0) {
                                if (var57 <= class431.field6776) {
                                    continue;
                                }
                                var59 = class723.field10619.method879((byte) 105, var11.field1135[var56]);
                                var60 = var59.field3928;
                            } else if (var57 < 0) {
                                continue;
                            }
                            int var61 = var11.field1171[var56];
                            class260 var62 = null;
                            if (var61 >= 0) {
                                var62 = class723.field10619.method879((byte) 101, var61);
                            }
                            if ((var57 - var60) <= class431.field6776) {
                                int var63 = var11.field1156[var56];
                                if (var63 >= 0) {
                                    var11.field1138 = class431.field6776 + 300;
                                    var11.field1130 = var63;
                                    var11.field1156[var56] = -1;
                                }
                                if (var59 == null) {
                                    var11.field1163[var56] = -1;
                                } else {
                                    int var64 = var11.method813((byte) -122) / 2;
                                    class102.method969(var64, -21235, arg1, arg0 >> 1, arg3 >> 1, arg6, var11);
                                    if (class208.field3248[0] > -1) {
                                        class208.field3248[0] += class605.field8720[var56];
                                        class208.field3248[1] += class187.field2967[var56];
                                        Object var65 = null;
                                        Object var66 = null;
                                        Object var67 = null;
                                        Object var68 = null;
                                        int var69 = 0;
                                        int var70 = 0;
                                        int var71 = 0;
                                        int var72 = 0;
                                        int var73 = 0;
                                        int var74 = 0;
                                        int var75 = 0;
                                        int var76 = 0;
                                        class107 var77 = null;
                                        class107 var78 = null;
                                        class107 var79 = null;
                                        class107 var80 = null;
                                        int var81 = 0;
                                        int var82 = 0;
                                        int var83 = 0;
                                        int var84 = 0;
                                        int var85 = 0;
                                        int var86 = 0;
                                        int var87 = 0;
                                        int var88 = 0;
                                        int var89 = 0;
                                        class107 var90 = var59.method2193(-9148, class662.field9437);
                                        if (var90 != null) {
                                            var69 = var90.method7();
                                            int var91 = var90.method13();
                                            var90.method20(class533.field7822);
                                            if (var91 > var89) {
                                                var89 = var91;
                                            }
                                            var73 = class533.field7822[0];
                                        }
                                        class107 var92 = var59.method2194(class662.field9437, -1);
                                        if (var92 != null) {
                                            var70 = var92.method7();
                                            int var93 = var92.method13();
                                            if (var93 > var89) {
                                                var89 = var93;
                                            }
                                            var92.method20(class533.field7822);
                                            var74 = class533.field7822[0];
                                        }
                                        class107 var94 = var59.method2190(0, class662.field9437);
                                        if (var94 != null) {
                                            var71 = var94.method7();
                                            int var95 = var94.method13();
                                            var94.method20(class533.field7822);
                                            if (var89 < var95) {
                                                var89 = var95;
                                            }
                                            var75 = class533.field7822[0];
                                        }
                                        class107 var96 = var59.method2187(false, class662.field9437);
                                        if (var96 != null) {
                                            var72 = var96.method7();
                                            int var97 = var96.method13();
                                            var96.method20(class533.field7822);
                                            if (var89 < var97) {
                                                var89 = var97;
                                            }
                                            var76 = class533.field7822[0];
                                        }
                                        if (var62 != null) {
                                            var77 = var62.method2193(-9148, class662.field9437);
                                            if (var77 != null) {
                                                var81 = var77.method7();
                                                int var98 = var77.method13();
                                                var77.method20(class533.field7822);
                                                if (var98 > var89) {
                                                    var89 = var98;
                                                }
                                                var85 = class533.field7822[0];
                                            }
                                            var78 = var62.method2194(class662.field9437, -1);
                                            if (var78 != null) {
                                                var82 = var78.method7();
                                                int var99 = var78.method13();
                                                if (var89 < var99) {
                                                    var89 = var99;
                                                }
                                                var78.method20(class533.field7822);
                                                var86 = class533.field7822[0];
                                            }
                                            var79 = var62.method2190(0, class662.field9437);
                                            if (var79 != null) {
                                                var83 = var79.method7();
                                                int var100 = var79.method13();
                                                if (var89 < var100) {
                                                    var89 = var100;
                                                }
                                                var79.method20(class533.field7822);
                                                var87 = class533.field7822[0];
                                            }
                                            var80 = var62.method2187(false, class662.field9437);
                                            if (var80 != null) {
                                                var84 = var80.method7();
                                                int var101 = var80.method13();
                                                if (var89 < var101) {
                                                    var89 = var101;
                                                }
                                                var80.method20(class533.field7822);
                                                var88 = class533.field7822[0];
                                            }
                                        }
                                        class64 var102 = class355.field5718;
                                        class64 var103 = class355.field5718;
                                        class49 var104 = class693.field9978;
                                        int var105 = var59.field3925;
                                        class49 var106 = class693.field9978;
                                        if (var105 >= 0) {
                                            class64 var107 = class327.method2780(var105, class662.field9437, true, -1);
                                            class49 var108 = class242.method2082(22306, var105, class662.field9437);
                                            if (var107 != null && var108 != null) {
                                                var104 = var108;
                                                var102 = var107;
                                            }
                                        }
                                        if (var62 != null) {
                                            int var109 = var62.field3925;
                                            if (var109 >= 0) {
                                                class64 var110 = class327.method2780(var109, class662.field9437, true, -1);
                                                class49 var111 = class242.method2082(22306, var109, class662.field9437);
                                                if (var110 != null && var111 != null) {
                                                    var106 = var111;
                                                    var103 = var110;
                                                }
                                            }
                                        }
                                        Object var112 = null;
                                        String var113 = null;
                                        boolean var114 = false;
                                        int var115 = 0;
                                        String var116 = var59.method2185(var11.field1116[var56], 123);
                                        int var117 = var104.method498(var116, -1);
                                        if (var62 != null) {
                                            var113 = var62.method2185(var11.field1117[var56], 125);
                                            var115 = var106.method498(var113, -1);
                                        }
                                        int var118 = 0;
                                        if (var70 > 0) {
                                            var118 = var117 / var70 + 1;
                                        }
                                        int var119 = 0;
                                        if (var62 != null && var82 > 0) {
                                            var119 = var115 / var82 + 1;
                                        }
                                        int var120 = 0;
                                        int var121 = var120;
                                        if (var69 > 0) {
                                            var120 += var69;
                                        }
                                        var120 += 2;
                                        int var122 = var120;
                                        if (var71 > 0) {
                                            var120 += var71;
                                        }
                                        int var123 = var120;
                                        int var124 = var120;
                                        int var125;
                                        if (var70 <= 0) {
                                            var125 = var117 + var120;
                                        } else {
                                            int var126 = var70 * var118;
                                            var124 = (var126 - var117) / 2 + var120;
                                            var125 = var120 + var126;
                                        }
                                        int var127 = var125;
                                        if (var72 > 0) {
                                            var125 += var72;
                                        }
                                        int var128 = 0;
                                        int var129 = 0;
                                        int var130 = 0;
                                        int var131 = 0;
                                        int var132 = 0;
                                        if (var62 != null) {
                                            var125 += 2;
                                            var128 = var125;
                                            if (var81 > 0) {
                                                var125 += var81;
                                            }
                                            var125 += 2;
                                            var129 = var125;
                                            if (var83 > 0) {
                                                var125 += var83;
                                            }
                                            var130 = var125;
                                            var132 = var125;
                                            if (var82 > 0) {
                                                int var133 = var82 * var119;
                                                var132 = (var133 - var115) / 2 + var125;
                                                var125 += var133;
                                            } else {
                                                var125 += var115;
                                            }
                                            var131 = var125;
                                            if (var84 > 0) {
                                                var125 += var84;
                                            }
                                        }
                                        int var134 = var11.field1163[var56] - class431.field6776;
                                        int var135 = var59.field3937 - (var59.field3937 * var134 / var59.field3928);
                                        int var136 = var59.field3924 * var134 / var59.field3928 - var59.field3924;
                                        int var137 = arg5 + class208.field3248[0] + var135 - (var125 >> 1);
                                        int var138 = arg4 + class208.field3248[1] + var136 - 12;
                                        int var139 = var138;
                                        int var140 = var89 + var138;
                                        int var141 = var138 + var59.field3936 + 15;
                                        int var142 = var141 - var104.field581;
                                        if (var138 > var142) {
                                            var139 = var142;
                                        }
                                        int var143 = var104.field583 + var141;
                                        if (var143 > var140) {
                                            var140 = var143;
                                        }
                                        int var144 = 0;
                                        if (var62 != null) {
                                            var144 = var138 + var62.field3936 + 15;
                                            int var145 = var144 - var106.field581;
                                            int var146 = var144 + var106.field583;
                                            if (var139 > var145) {
                                                var139 = var145;
                                            }
                                            if (var146 > var140) {
                                                var140 = var146;
                                            }
                                        }
                                        int var147 = 255;
                                        if (var59.field3929 >= 0) {
                                            var147 = (var134 << 8) / (var59.field3928 - var59.field3929);
                                        }
                                        if (var147 >= 0 && var147 < 255) {
                                            int var150 = var147 << 24;
                                            int var151 = var150 | 0xFFFFFF;
                                            if (var90 != null) {
                                                var90.method19(var121 + var137 - var73, var138, 0, var151, 1);
                                            }
                                            if (var94 != null) {
                                                var94.method19(var137 + var122 - var75, var138, 0, var151, 1);
                                            }
                                            if (var92 != null) {
                                                for (int var152 = 0; var152 < var118; var152++) {
                                                    var92.method19(var123 + var137 - (var74 - var70 * var152), var138, 0, var151, 1);
                                                }
                                            }
                                            if (var96 != null) {
                                                var96.method19(var127 + var137 - var76, var138, 0, var151, 1);
                                            }
                                            var102.method679(0, var124 + var137, 0, var150 | var59.field3934, var116, var141);
                                            if (var62 != null) {
                                                if (var77 != null) {
                                                    var77.method19(var137 + var128 - var85, var138, 0, var151, 1);
                                                }
                                                if (var79 != null) {
                                                    var79.method19(var137 + var129 - var87, var138, 0, var151, 1);
                                                }
                                                if (var78 != null) {
                                                    for (int var153 = 0; var153 < var119; var153++) {
                                                        var78.method19(var130 + var137 - (var86 - var82 * var153), var138, 0, var151, 1);
                                                    }
                                                }
                                                if (var80 != null) {
                                                    var80.method19(var131 + var137 - var88, var138, 0, var151, 1);
                                                }
                                                var103.method679(0, var132 + var137, 0, var150 | var62.field3934, var113, var144);
                                            }
                                        } else {
                                            if (var90 != null) {
                                                var90.method1001(var121 + var137 - var73, var138);
                                            }
                                            if (var94 != null) {
                                                var94.method1001(var137 + var122 - var75, var138);
                                            }
                                            if (var92 != null) {
                                                for (int var148 = 0; var148 < var118; var148++) {
                                                    var92.method1001(var70 * var148 + var123 + var137 - var74, var138);
                                                }
                                            }
                                            if (var96 != null) {
                                                var96.method1001(var127 + var137 - var76, var138);
                                            }
                                            var102.method679(0, var124 + var137, 0, var59.field3934 | 0xFF000000, var116, var141);
                                            if (var62 != null) {
                                                if (var77 != null) {
                                                    var77.method1001(var128 + var137 - var85, var138);
                                                }
                                                if (var79 != null) {
                                                    var79.method1001(var129 + var137 - var87, var138);
                                                }
                                                if (var78 != null) {
                                                    for (int var149 = 0; var149 < var119; var149++) {
                                                        var78.method1001(var82 * var149 + (var130 + var137 - var86), var138);
                                                    }
                                                }
                                                if (var80 != null) {
                                                    var80.method1001(var137 + var131 - var88, var138);
                                                }
                                                var103.method679(0, var132 + var137, 0, var62.field3934 | 0xFF000000, var113, var144);
                                            }
                                        }
                                        class458.method3552(var139, var137 + var125, var140 + 1, var137, -122);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int var154 = -102 % (-arg2 / 44);
            for (int var155 = 0; var155 < class296.field4818; var155++) {
                int var156 = class190.field3011[var155];
                class77 var157;
                if (var156 < 2048) {
                    var157 = class33.field395[var156];
                } else {
                    var157 = ((class19) class176.field2797.method737((byte) -39, (long) (var156 - 2048))).field194;
                }
                int var158 = class740.field10908[var155];
                class77 var159;
                if (var158 < 2048) {
                    var159 = class33.field395[var158];
                } else {
                    var159 = ((class19) class176.field2797.method737((byte) -39, (long) (var158 - 2048))).field194;
                }
                class147.method1342(arg6, arg3, var157, arg5, arg4, arg1, arg0, (byte) 89, var159, --var157.field1169);
            }
            int var160 = client.field5163.field583 + client.field5163.field581 + 2;
            for (int var161 = 0; var161 < class60.field781; var161++) {
                int var162 = class97.field1423[var161];
                int var163 = class97.field1424[var161];
                int var164 = class97.field1415[var161];
                boolean var165 = true;
                while (var165) {
                    var165 = false;
                    for (int var166 = 0; var166 < var161; var166++) {
                        if (var163 + 2 > class97.field1424[var166] - var160 && class97.field1424[var166] + 2 > -var160 + var163 && var162 - var164 < class97.field1423[var166] + class97.field1415[var166] && class97.field1423[var166] - class97.field1415[var166] < var162 - -var164 && (class97.field1424[var166] - var160) < var163) {
                            var165 = true;
                            var163 = class97.field1424[var166] - var160;
                        }
                    }
                }
                class97.field1424[var161] = var163;
                String var167 = class97.field1427[var161];
                int var168 = client.field5163.method498(var167, -1);
                int var169 = arg5 + var162;
                int var170 = arg4 + var163 - client.field5163.field581;
                int var171 = var168 + var169;
                int var172 = client.field5163.field583 + arg4 + var163;
                if (class457.field7058 == 0) {
                    int var173 = 16776960;
                    if (class97.field1416[var161] < 6) {
                        var173 = class622.field8984[class97.field1416[var161]];
                    }
                    if (class97.field1416[var161] == 6) {
                        var173 = (class680.field9672 % 20) >= 10 ? 16776960 : 16711680;
                    }
                    if (class97.field1416[var161] == 7) {
                        var173 = class680.field9672 % 20 >= 10 ? 65535 : 255;
                    }
                    if (class97.field1416[var161] == 8) {
                        var173 = (class680.field9672 % 20) >= 10 ? 8454016 : 45056;
                    }
                    if (class97.field1416[var161] == 9) {
                        int var174 = 150 - class97.field1425[var161];
                        if (var174 < 50) {
                            var173 = var174 * 1280 + 16711680;
                        } else if (var174 < 100) {
                            var173 = 16776960 - ((var174 - 50) * 327680);
                        } else if (var174 < 150) {
                            var173 = ((var174 - 100) * 5) + 65280;
                        }
                    }
                    if (class97.field1416[var161] == 10) {
                        int var175 = 150 - class97.field1425[var161];
                        if (var175 < 50) {
                            var173 = var175 * 5 + 16711680;
                        } else if (var175 < 100) {
                            var173 = 16711935 - ((var175 - 50) * 327680);
                        } else if (var175 < 150) {
                            var173 = var175 * 327680 + 255 - ((var175 - 100) * 5) - 32768000;
                        }
                    }
                    if (class97.field1416[var161] == 11) {
                        int var176 = 150 - class97.field1425[var161];
                        if (var176 < 50) {
                            var173 = 16777215 - (var176 * 327685);
                        } else if (var176 < 100) {
                            var173 = (var176 - 50) * 327685 + 65280;
                        } else if (var176 < 150) {
                            var173 = 16777215 - (var176 * 327680 - 32768000);
                        }
                    }
                    int var177 = var173 | 0xFF000000;
                    if (class97.field1420[var161] == 0) {
                        var169 -= var168 >> 1;
                        var171 -= var168 >> 1;
                        class461.field7108.method680(arg4 + var163, (byte) -78, -16777216, arg5 + var162, var177, var167);
                    }
                    if (class97.field1420[var161] == 1) {
                        var171 -= var168 >> 1;
                        var172 += 5;
                        var169 -= var168 >> 1;
                        var170 -= 5;
                        class461.field7108.method685(0, var177, var167, -16777216, arg5 + var162, class680.field9672, arg4 + var163);
                    }
                    if (class97.field1420[var161] == 2) {
                        var171 -= (var168 >> 1) - 5;
                        var169 -= (var168 >> 1) + 5;
                        class461.field7108.method686(class680.field9672, -16777216, var167, -17923, var177, arg5 + var162, arg4 + var163);
                        var172 += 5;
                        var170 -= 5;
                    }
                    if (class97.field1420[var161] == 3) {
                        var171 -= var168 >> 1;
                        var169 -= var168 >> 1;
                        class461.field7108.method682(150 - class97.field1425[var161], -16777216, arg4 + var163, var177, -115, var167, class680.field9672, arg5 + var162);
                        var172 += 7;
                        var170 -= 7;
                    }
                    if (class97.field1420[var161] == 4) {
                        int var178 = (150 - class97.field1425[var161]) * (client.field5163.method498(var167, -1) + 100) / 150;
                        class662.field9437.method162(arg5 + var162 - 50, arg4, arg5 + var162 + 50, arg3 + arg4);
                        class461.field7108.method679(0, arg5 + var162 + 50 - var178, -16777216, var177, var167, arg4 + var163);
                        var171 += 50 - var178;
                        var169 += 50 - var178;
                        class662.field9437.method221(arg5, arg4, arg5 + arg0, arg3 + arg4);
                    }
                    if (class97.field1420[var161] == 5) {
                        int var179 = 150 - class97.field1425[var161];
                        int var180 = 0;
                        if (var179 < 25) {
                            var180 = var179 - 25;
                        } else if (var179 > 125) {
                            var180 = var179 - 125;
                        }
                        int var181 = client.field5163.field583 + client.field5163.field581;
                        class662.field9437.method162(arg5, arg4 - (-var163 - (-var181 - 1)), arg0 + arg5, arg4 + var163 + 5);
                        var169 -= var168 >> 1;
                        var171 -= var168 >> 1;
                        var170 += var180;
                        class461.field7108.method680(arg4 + var163 + var180, (byte) -78, -16777216, arg5 + var162, var177, var167);
                        var172 += var180;
                        class662.field9437.method221(arg5, arg4, arg5 + arg0, arg3 + arg4);
                    }
                } else {
                    class461.field7108.method680(arg4 + var163, (byte) -78, -16777216, arg5 + var162, -256, var167);
                    var169 -= var168 >> 1;
                    var171 -= var168 >> 1;
                }
                class458.method3552(var170, var171 + 1, var172 + 1, var169, -121);
            }
        } catch (RuntimeException var183) {
            throw class590.method4333(var183, field9931[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!kja", name = "b", descriptor = "(I)V", line = 1162)
    public static void method5002(int arg0) {
        try {
            if (arg0 == 25341) {
                field9927 = null;
                field9929 = null;
                field9922 = null;
                field9926 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9931[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 1182)
    public static final boolean method5003(String arg0, boolean arg1) {
        try {
            if (!arg1) {
                field9927 = null;
            }
            field9925++;
            return class134.field1901.containsKey(arg0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9931[4] + (arg0 == null ? field9931[2] : field9931[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(Lwt;I)V", line = 1196)
    public final void method359(class328 arg0, int arg1) {
        try {
            if (arg1 == 1984) {
                arg0.field5379 = this.field9920;
                if (this.field9920 != null) {
                    arg0.field5390 = this.field9919;
                    arg0.field5380 = this.field9924;
                }
                field9921++;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9931[6] + (arg0 == null ? field9931[2] : field9931[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(Lwq;I)V", line = 1231)
    public final void method361(class176 arg0, int arg1) {
        try {
            this.field9920 = arg0.method1666(-93);
            if (arg1 > 0) {
                field9923++;
                if (this.field9920 != null) {
                    arg0.method1645((byte) -111);
                    this.field9919 = arg0.method1672(119);
                    this.field9924 = arg0.method1672(111);
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9931[3] + (arg0 == null ? field9931[2] : field9931[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5004(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x79);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5005(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 40;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 126;
                    break;
                case 3:
                    var10005 = 85;
                    break;
                default:
                    var10005 = 121;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
