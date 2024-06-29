import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class711 {

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public int field10300 = 128;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public int field10310 = 128;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public int field10302;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public int field10309;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public int field10305;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public int field10299;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10316 = new String[] { method5189(method5188("ZERW>")), method5189(method5188("o\u0011\\96")), method5189(method5188("ZERP>")), method5189(method5188("UW\u0010x")), method5189(method5188("@\fR:k")), method5189(method5188("ZER(\u007fUK\b*>")), method5189(method5188("ZERV>")), method5189(method5188("ZERU>")) };

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "J")
    public static long field10314 = -1L;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "Lwia;")
    public static class790 field10304 = new class790(90, 1);

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field10301;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field10303;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public int field10306;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public int field10307;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field10308;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public int field10311;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public int field10312;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public int field10313;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field10315;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLvha;)V")
    public static final void method5184(boolean arg0, class713 arg1) {
        try {
            field10301++;
            if (arg0) {
                if (class559.field8302 == arg1) {
                    class430.field6332.method1455((byte) 62);
                    int var2 = class430.field6332.method1455((byte) 62);
                    int var3 = ((var2 & 0x73) >> 4) + class609.field8904;
                    int var4 = (var2 & 0x7) + class383.field5797;
                    int var5 = class430.field6332.method1445((byte) 102);
                    int var6 = class430.field6332.method1455((byte) 62);
                    int var7 = class430.field6332.method1436((byte) 91);
                    String var8 = class430.field6332.method1423(-48);
                    class366.method2967(var6, (byte) 111, var5, var3, var8, var4, var7, class225.field3443);
                } else if (class108.field1258 == arg1) {
                    int var9 = class430.field6332.method1445((byte) 127);
                    int var10 = class430.field6332.method1455((byte) 62);
                    class417.field6144.method3030(0, var9).method1778(var10, !arg0);
                } else if (class458.field6663 == arg1) {
                    int var11 = class430.field6332.method1455((byte) 62);
                    boolean var12 = (var11 & 0x80) != 0;
                    int var13 = ((var11 & 0x39) >> 3) + class609.field8904;
                    int var14 = (var11 & 0x7) + class383.field5797;
                    int var15 = var13 + class430.field6332.method1414(1);
                    int var16 = var14 + class430.field6332.method1414(1);
                    int var17 = class430.field6332.method1442(65280);
                    int var18 = class430.field6332.method1445((byte) 119);
                    int var19 = class430.field6332.method1455((byte) 62) * 4;
                    int var20 = class430.field6332.method1455((byte) 62) * 4;
                    int var21 = class430.field6332.method1445((byte) 116);
                    int var22 = class430.field6332.method1445((byte) 101);
                    int var23 = class430.field6332.method1455((byte) 62);
                    int var24 = class430.field6332.method1445((byte) 119);
                    if (var23 == 255) {
                        var23 = -1;
                    }
                    if (var13 >= 0 && var14 >= 0 && var13 < class648.field9378 && var14 < class659.field9506 && var15 >= 0 && var16 >= 0 && class648.field9378 > var15 && class659.field9506 > var16 && var18 != 65535) {
                        int var25 = var15 * 512 + 256;
                        int var26 = var14 * 512 + 256;
                        int var27 = var19 << 2;
                        int var28 = var13 * 512 + 256;
                        int var29 = var16 * 512 + 256;
                        int var30 = var24 << 2;
                        int var31 = var20 << 2;
                        class218 var32 = new class218(var18, class225.field3443, class225.field3443, var28, var26, var27, class375.field5711 + var21, class375.field5711 + var22, var23, var30, 0, var17, var31, var12, -1);
                        var32.method1906(class316.method2656(var25, class225.field3443, var29, 0) - var31, var21 - -class375.field5711, (byte) 49, var25, var29);
                        class737.field10713.method3868(114, new class304(var32));
                    }
                } else if (class494.field7098 == arg1) {
                    int var33 = class430.field6332.method1455((byte) 62);
                    int var34 = class609.field8904 + (var33 >> 4 & 0x7);
                    int var35 = (var33 & 0x7) + class383.field5797;
                    int var36 = class430.field6332.method1445((byte) 118);
                    int var37 = class430.field6332.method1455((byte) 62);
                    int var38 = class430.field6332.method1445((byte) 125);
                    int var39 = class430.field6332.method1455((byte) 62);
                    if (var34 >= 0 && var35 >= 0 && class648.field9378 > var34 && var35 < class659.field9506) {
                        int var40 = var34 * 512 + 256;
                        int var41 = var35 * 512 + 256;
                        int var42 = class225.field3443;
                        if (var42 < 3 && class231.method1980(1, var35, var34)) {
                            var42++;
                        }
                        class464 var43 = new class464(var36, var38, class375.field5711, class225.field3443, var42, var40, class316.method2656(var40, class225.field3443, var41, 0) - var37, var41, var34, var34, var35, var35, var39);
                        class112.field1301.method3868(127, new class329(var43));
                    }
                } else if (class417.field6156 == arg1) {
                    int var44 = class430.field6332.method1455((byte) 62);
                    int var45 = (var44 & 0x7) + class383.field5797;
                    int var46 = var45 + class281.field4219;
                    int var47 = ((var44 & 0x73) >> 4) + class609.field8904;
                    int var48 = class494.field7101 + var47;
                    int var49 = class430.field6332.method1445((byte) 113);
                    int var50 = class430.field6332.method1445((byte) 126);
                    int var51 = class430.field6332.method1445((byte) 122);
                    if (class29.field357 != null) {
                        class672 var52 = (class672) class29.field357.method977((long) (var48 | class225.field3443 << 28 | var46 << 14), 1);
                        if (var52 != null) {
                            for (class719 var53 = (class719) var52.field9756.method3863((byte) 64); var53 != null; var53 = (class719) var52.field9756.method3862(-353)) {
                                if (var53.field10410 == (var49 & 0x7FFF) && var53.field10412 == var50) {
                                    var53.method1824(1);
                                    var53.field10412 = var51;
                                    class184.method1606(class225.field3443, (byte) -31, var46, var53, var48);
                                    break;
                                }
                            }
                            if (var47 >= 0 && var45 >= 0 && var47 < class648.field9378 && class659.field9506 > var45) {
                                class437.method3346(var45, !arg0, var47, class225.field3443);
                            }
                        }
                    }
                } else if (class530.field7770 == arg1) {
                    int var54 = class430.field6332.method1455((byte) 62);
                    int var55 = class609.field8904 * 2 + ((var54 & 0xF8) >> 4);
                    int var56 = (var54 & 0xF) + class383.field5797 * 2;
                    int var57 = class430.field6332.method1455((byte) 62);
                    boolean var58 = (var57 & 0x1) != 0;
                    boolean var59 = (var57 & 0x2) != 0;
                    int var60 = var59 ? var57 >> 2 : -1;
                    int var61 = var55 + class430.field6332.method1414(1);
                    int var62 = class430.field6332.method1414(1) + var56;
                    int var63 = class430.field6332.method1442(65280);
                    int var64 = class430.field6332.method1442(65280);
                    int var65 = class430.field6332.method1445((byte) 114);
                    int var66 = class430.field6332.method1455((byte) 62);
                    int var67;
                    if (var59) {
                        var67 = (byte) var66;
                    } else {
                        var67 = var66 * 4;
                    }
                    int var68 = class430.field6332.method1455((byte) 62) * 4;
                    int var69 = class430.field6332.method1445((byte) 107);
                    int var70 = class430.field6332.method1445((byte) 113);
                    int var71 = class430.field6332.method1455((byte) 62);
                    int var72 = class430.field6332.method1445((byte) 118);
                    if (var71 == 255) {
                        var71 = -1;
                    }
                    if (var55 >= 0 && var56 >= 0 && (class648.field9378 * 2) > var55 && (class648.field9378 * 2) > var56 && var61 >= 0 && var62 >= 0 && class659.field9506 * 2 > var61 && (class659.field9506 * 2) > var62 && var65 != 65535) {
                        int var73 = var68 << 2;
                        int var74 = var56 * 256;
                        int var75 = var62 * 256;
                        int var76 = var61 * 256;
                        int var77 = var55 * 256;
                        int var78 = var72 << 2;
                        int var79 = var67 << 2;
                        if (var63 != 0 && var60 != -1) {
                            class247 var80 = null;
                            if (var63 < 0) {
                                int var81 = -var63 - 1;
                                if (class722.field10458 == var81) {
                                    var80 = class225.field3446;
                                } else {
                                    var80 = class197.field2685[var81];
                                }
                            } else {
                                int var82 = var63 - 1;
                                class383 var83 = (class383) class207.field3184.method977((long) var82, 1);
                                if (var83 != null) {
                                    var80 = var83.field5799;
                                }
                            }
                            if (var80 != null) {
                                class144 var84 = var80.method2099(103);
                                if (var84.field1769 != null && var84.field1769[var60] != null) {
                                    var79 -= var84.field1769[var60][1];
                                }
                                if (var84.field1777 != null && var84.field1777[var60] != null) {
                                    var79 -= var84.field1777[var60][1];
                                }
                            }
                        }
                        class218 var85 = new class218(var65, class225.field3443, class225.field3443, var77, var74, var79, class375.field5711 + var69, var70 - -class375.field5711, var71, var78, var63, var64, var73, var58, var60);
                        var85.method1906(class316.method2656(var76, class225.field3443, var75, 0) - var73, class375.field5711 + var69, (byte) 49, var76, var75);
                        class737.field10713.method3868(-47, new class304(var85));
                    }
                } else if (class47.field540 == arg1) {
                    int var86 = class430.field6332.method1455((byte) 62);
                    int var87 = class609.field8904 + (var86 >> 4 & 0x7);
                    int var88 = (var86 & 0x7) + class383.field5797;
                    int var89 = class430.field6332.method1432((byte) -29);
                    if (var89 == 65535) {
                        var89 = -1;
                    }
                    int var90 = class430.field6332.method1426(-14788);
                    int var91 = var90 >> 2;
                    int var92 = var90 & 0x3;
                    int var93 = class434.field6372[var91];
                    class584.method4362(var93, var92, class225.field3443, var91, var87, (byte) 79, var88, var89);
                } else if (class387.field5840 == arg1) {
                    int var94 = class430.field6332.method1426(-14788);
                    int var95 = var94 >> 2;
                    int var96 = var94 & 0x3;
                    int var97 = class434.field6372[var95];
                    int var98 = class430.field6332.method1409(-90);
                    int var99 = (var98 >> 4 & 0x7) + class609.field8904;
                    int var100 = (var98 & 0x7) + class383.field5797;
                    if (class290.method2353(class104.field1209, -5) || var99 >= 0 && var100 >= 0 && var99 < class648.field9378 && var100 < class659.field9506) {
                        class383.method3067(var96, var99, var95, var97, class225.field3443, (byte) 111, var100, -1);
                    }
                } else if (class745.field10834 == arg1) {
                    int var101 = class430.field6332.method1409(-94);
                    int var102 = (var101 >> 4 & 0x7) + class609.field8904;
                    int var103 = class383.field5797 + (var101 & 0x7);
                    int var104 = class430.field6332.method1445((byte) 106);
                    int var105 = class430.field6332.method1431(-92);
                    int var106 = var105 >> 2;
                    int var107 = var105 & 0x3;
                    int var108 = class434.field6372[var106];
                    if (class290.method2353(class104.field1209, -5) || var102 >= 0 && var103 >= 0 && class648.field9378 > var102 && class659.field9506 > var103) {
                        class383.method3067(var107, var102, var106, var108, class225.field3443, (byte) 111, var103, var104);
                    }
                } else if (class661.field9560 == arg1) {
                    int var109 = class430.field6332.method1445((byte) 105);
                    int var110 = class430.field6332.method1432((byte) -72);
                    int var111 = class430.field6332.method1426(-14788);
                    int var112 = class383.field5797 + (var111 & 0x7);
                    int var113 = class281.field4219 + var112;
                    int var114 = (var111 >> 4 & 0x7) + class609.field8904;
                    int var115 = var114 + class494.field7101;
                    int var116 = class430.field6332.method1444(-117);
                    if (class722.field10458 != var116) {
                        boolean var117 = var114 >= 0 && var112 >= 0 && var114 < class648.field9378 && class659.field9506 > var112;
                        if (var117 || class290.method2353(class104.field1209, -5)) {
                            class184.method1606(class225.field3443, (byte) -121, var113, new class719(var110, var109), var115);
                            if (var117) {
                                class437.method3346(var112, false, var114, class225.field3443);
                            }
                        }
                    }
                } else if (class757.field10991 == arg1) {
                    int var118 = class430.field6332.method1455((byte) 62);
                    int var119 = (var118 >> 4 & 0x7) + class609.field8904;
                    int var120 = (var118 & 0x7) + class383.field5797;
                    int var121 = class430.field6332.method1445((byte) 126);
                    if (var121 == 65535) {
                        var121 = -1;
                    }
                    int var122 = class430.field6332.method1455((byte) 62);
                    int var123 = (var122 & 0xF3) >> 4;
                    int var124 = var122 & 0x7;
                    int var125 = class430.field6332.method1455((byte) 62);
                    int var126 = class430.field6332.method1455((byte) 62);
                    int var127 = class430.field6332.method1445((byte) 103);
                    if (var119 >= 0 && var120 >= 0 && class648.field9378 > var119 && class659.field9506 > var120) {
                        int var128 = var123 + 1;
                        if ((var119 - var128) <= class225.field3446.field3859[0] && class225.field3446.field3859[0] <= var119 + var128 && class225.field3446.field3863[0] >= var120 - var128 && (var120 + var128) >= class225.field3446.field3863[0]) {
                            class662.method4856(var127, var121, false, (class225.field3443 << 24) + (var120 << 8) + (var119 << 16) + var123, 108, var124, var125, var126);
                        }
                    }
                } else if (class244.field3746 == arg1) {
                    int var129 = class430.field6332.method1432((byte) -119);
                    int var130 = class430.field6332.method1409(-88);
                    int var131 = (var130 & 0x7) + class383.field5797;
                    int var132 = var131 + class281.field4219;
                    int var133 = (var130 >> 4 & 0x7) + class609.field8904;
                    int var134 = class494.field7101 + var133;
                    class672 var135 = (class672) class29.field357.method977((long) (class225.field3443 << 28 | var132 << 14 | var134), 1);
                    if (var135 != null) {
                        for (class719 var136 = (class719) var135.field9756.method3863((byte) 64); var136 != null; var136 = (class719) var135.field9756.method3862(-353)) {
                            if (var136.field10410 == (var129 & 0x7FFF)) {
                                var136.method1824(1);
                                break;
                            }
                        }
                        if (var135.field9756.method3873(17)) {
                            var135.method1824(1);
                        }
                        if (var133 >= 0 && var131 >= 0 && var133 < class648.field9378 && class659.field9506 > var131) {
                            class437.method3346(var131, !arg0, var133, class225.field3443);
                        }
                    }
                } else if (class104.field1208 == arg1) {
                    int var137 = class430.field6332.method1455((byte) 62);
                    int var138 = ((var137 & 0x73) >> 4) + class609.field8904;
                    int var139 = (var137 & 0x7) + class383.field5797;
                    int var140 = class430.field6332.method1445((byte) 122);
                    if (var140 == 65535) {
                        var140 = -1;
                    }
                    int var141 = class430.field6332.method1455((byte) 62);
                    int var142 = (var141 & 0xF7) >> 4;
                    int var143 = var141 & 0x7;
                    int var144 = class430.field6332.method1455((byte) 62);
                    int var145 = class430.field6332.method1455((byte) 62);
                    int var146 = class430.field6332.method1445((byte) 111);
                    if (var138 >= 0 && var139 >= 0 && class648.field9378 > var138 && class659.field9506 > var139) {
                        int var147 = var142 + 1;
                        if (var138 - var147 <= class225.field3446.field3859[0] && (var138 + var147) >= class225.field3446.field3859[0] && var139 - var147 <= class225.field3446.field3863[0] && (var139 + var147) >= class225.field3446.field3863[0]) {
                            class139.method1194((var139 << 8) + (class225.field3443 << 24) + (var138 << 16) + var142, var145, !arg0, var144, var146, var140, var143);
                        }
                    }
                } else if (class349.field5393 == arg1) {
                    int var148 = class430.field6332.method1455((byte) 62);
                    int var149 = class609.field8904 + (var148 >> 4 & 0x7);
                    int var150 = (var148 & 0x7) + class383.field5797;
                    int var151 = class430.field6332.method1409(-116);
                    int var152 = var151 >> 2;
                    int var153 = class434.field6372[var152];
                    int var154 = class430.field6332.method1441(118);
                    class198 var155 = class417.field6144.method3030(0, var154);
                    int var156 = class430.field6332.method1455((byte) 62);
                    if (var152 == 11) {
                        var152 = 10;
                    }
                    int var157 = 0;
                    if (var155.field3062 != null) {
                        int var158 = -1;
                        for (int var159 = 0; var159 < var155.field3062.length; var159++) {
                            if (var152 == var155.field3062[var159]) {
                                var158 = var159;
                                break;
                            }
                        }
                        var157 = var155.field3088[var158].length;
                    }
                    int var160 = 0;
                    if (var155.field3063 != null) {
                        var160 = var155.field3063.length;
                    }
                    int var161 = 0;
                    if (var155.field3050 != null) {
                        var161 = var155.field3050.length;
                    }
                    if ((var156 & 0x1) == 1) {
                        class181.method1583(var153, var149, var150, (byte) -26, class225.field3443, null);
                    } else {
                        int[] var162 = null;
                        if ((var156 & 0x2) == 2) {
                            var162 = new int[var157];
                            for (int var163 = 0; var163 < var157; var163++) {
                                var162[var163] = class430.field6332.method1445((byte) 115);
                            }
                        }
                        short[] var164 = null;
                        if ((var156 & 0x4) == 4) {
                            var164 = new short[var160];
                            for (int var165 = 0; var165 < var160; var165++) {
                                var164[var165] = (short) class430.field6332.method1445((byte) 108);
                            }
                        }
                        short[] var166 = null;
                        if ((var156 & 0x8) == 8) {
                            var166 = new short[var161];
                            for (int var167 = 0; var167 < var161; var167++) {
                                var166[var167] = (short) class430.field6332.method1445((byte) 101);
                            }
                        }
                        class181.method1583(var153, var149, var150, (byte) -26, class225.field3443, new class282((long) (class120.field1423++), var162, var164, var166));
                    }
                } else if (class535.field7834 == arg1) {
                    int var168 = class430.field6332.method1445((byte) 108);
                    int var169 = class430.field6332.method1445((byte) 125);
                    int var170 = class430.field6332.method1431(9);
                    int var171 = class383.field5797 + (var170 & 0x7);
                    int var172 = class281.field4219 + var171;
                    int var173 = ((var170 & 0x70) >> 4) + class609.field8904;
                    int var174 = class494.field7101 + var173;
                    boolean var175 = var173 >= 0 && var171 >= 0 && class648.field9378 > var173 && var171 < class659.field9506;
                    if (var175 || class290.method2353(class104.field1209, -5)) {
                        class184.method1606(class225.field3443, (byte) -102, var172, new class719(var169, var168), var174);
                        if (var175) {
                            class437.method3346(var171, !arg0, var173, class225.field3443);
                        }
                    }
                } else {
                    class618.method4603((byte) 126, field10316[1] + arg1, null);
                    class220.method1920(0, false);
                }
            }
        } catch (RuntimeException var177) {
            throw class759.method5498(var177, field10316[2] + arg0 + ',' + (arg1 == null ? field10316[3] : field10316[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILag;)V")
    public final void method5185(int arg0, class711 arg1) {
        try {
            this.field10302 = arg1.field10302;
            this.field10300 = arg1.field10300;
            this.field10310 = arg1.field10310;
            if (arg0 != 0) {
                this.method5185(-127, null);
            }
            this.field10309 = arg1.field10309;
            this.field10299 = arg1.field10299;
            this.field10305 = arg1.field10305;
            field10303++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10316[7] + arg0 + ',' + (arg1 == null ? field10316[3] : field10316[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Lag;")
    public final class711 method5186(int arg0) {
        try {
            if (arg0 != 0) {
                this.field10312 = -40;
            }
            field10308++;
            return new class711(this.field10302, this.field10300, this.field10310, this.field10299, this.field10309, this.field10305);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10316[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method5187(byte arg0) {
        try {
            field10304 = null;
            if (arg0 != 102) {
                field10314 = 127L;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10316[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(I)V")
    public class711(int arg0) {
        try {
            this.field10302 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10316[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(IIIIII)V")
    private class711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field10302 = arg0;
            this.field10310 = arg2;
            this.field10309 = arg4;
            this.field10300 = arg1;
            this.field10305 = arg5;
            this.field10299 = arg3;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10316[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5188(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x16);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5189(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 34;
                    break;
                case 2:
                    var10005 = 124;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 22;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
