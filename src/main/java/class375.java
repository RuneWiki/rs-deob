import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class375 {

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "[I")
    public static int[] field5224 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public static int field5228 = 0;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "Lpaa;")
    public static class317 field5223 = new class317(7, 14);

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "[B")
    public static byte[] field5231 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "Z")
    public static boolean field5230;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "[J")
    public static long[] field5229;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILpaa;)V")
    public static final void method2291(int arg0, class317 arg1) {
        field5226++;
        if (class488.field6796 == arg1) {
            int var2 = class342.field4758.method3045(-128);
            int var3 = class506.field7056 * 2 + ((var2 & 0xFC) >> 4);
            int var4 = (var2 & 0xF) + class540.field7559 * 2;
            boolean var5 = class342.field4758.method3045(-128) != 0;
            int var6 = class342.field4758.method3051((byte) -101) + var3;
            int var7 = class342.field4758.method3051((byte) 127) + var4;
            int var8 = class342.field4758.method3087(true);
            int var9 = class342.field4758.method3087(true);
            int var10 = class342.field4758.method3090(-86);
            byte var11 = class342.field4758.method3051((byte) -93);
            int var12 = class342.field4758.method3045(-127) * 4;
            int var13 = class342.field4758.method3090(-81);
            int var14 = class342.field4758.method3090(arg0 ^ 0xFFFFFF94);
            int var15 = class342.field4758.method3045(arg0 - 128);
            if (var15 == 255) {
                var15 = -1;
            }
            int var16 = class342.field4758.method3090(arg0 - 103);
            if (var3 >= 0 && var4 >= 0 && var3 < (class139.field1760 * 2) && class139.field1760 * 2 > var4 && var6 >= 0 && var7 >= 0 && var6 < class369.field5135 * 2 && var7 < class369.field5135 * 2 && var10 != 65535) {
                int var17 = var6 * 256;
                int var18 = var12 << 2;
                int var19 = var11 << 2;
                int var20 = var4 * 256;
                int var21 = var3 * 256;
                int var22 = var7 * 256;
                int var23 = var16 << 2;
                if (var8 != 0) {
                    class23 var24 = null;
                    int var27;
                    if (var8 >= 0) {
                        int var25 = var8 - 1;
                        int var26 = var25 & 0x7FF;
                        var27 = (var25 & 0x7ECA) >> 11;
                        class480 var28 = (class480) class131.field1619.method3476((long) var26, (byte) 28);
                        if (var28 != null) {
                            var24 = var28.field6729;
                        }
                    } else {
                        int var29 = -var8 - 1;
                        int var30 = var29 & 0x7FF;
                        var27 = (var29 & 0x7AC0) >> 11;
                        if (class182.field2335 == var30) {
                            var24 = class147.field1899;
                        } else {
                            var24 = class364.field5092[var30];
                        }
                    }
                    if (var24 != null) {
                        class362 var31 = var24.method144((byte) 85);
                        if (var31.field5061 != null && var31.field5061[var27] != null) {
                            int var32 = var31.field5061[var27][0];
                            int var33 = var31.field5061[var27][2];
                            int var34 = var24.field338.method160(true);
                            int var35 = class310.field3966[var34];
                            int var36 = class310.field3965[var34];
                            int var37 = var32 * var36 + var33 * var35 >> 14;
                            int var38 = var33 * var36 - (var32 * var35) >> 14;
                            var21 += var37;
                            var19 -= var31.field5061[var27][1];
                            var20 += var38;
                        }
                    }
                }
                class150 var40 = new class150(var10, class379.field5305, var21, var20, var19, var13 + class7.field61, class7.field61 + var14, var15, var23, var9, var18, var5);
                var40.method818(class341.method2147(class379.field5305, var17, 0, var22) - var18, var17, false, class7.field61 + var13, var22);
                class196.field2540.method3181(new class124(var40), true);
            }
        } else if (class237.field3041 == arg1) {
            int var41 = class342.field4758.method3045(-125);
            int var42 = (var41 >> 4 & 0xF) + class506.field7056 * 2;
            int var43 = class540.field7559 * 2 + (var41 & 0xF);
            boolean var44 = class342.field4758.method3045(-127) != 0;
            int var45 = class342.field4758.method3051((byte) 101) + var42;
            int var46 = class342.field4758.method3051((byte) 84) + var43;
            int var47 = class342.field4758.method3087(true);
            int var48 = class342.field4758.method3090(-78);
            int var49 = class342.field4758.method3045(-127) * 4;
            int var50 = class342.field4758.method3045(arg0 ^ 0xFFFFFF83) * 4;
            int var51 = class342.field4758.method3090(-85);
            int var52 = class342.field4758.method3090(arg0 ^ 0xFFFFFF95);
            int var53 = class342.field4758.method3045(arg0 ^ 0xFFFFFF80);
            if (var53 == 255) {
                var53 = -1;
            }
            int var54 = class342.field4758.method3090(-128);
            if (var42 >= 0 && var43 >= 0 && class139.field1760 * 2 > var42 && var43 < class139.field1760 * 2 && var45 >= 0 && var46 >= 0 && class369.field5135 * 2 > var45 && class369.field5135 * 2 > var46 && var48 != 65535) {
                int var55 = var54 << 2;
                int var56 = var45 * 256;
                int var57 = var43 * 256;
                int var58 = var50 << 2;
                int var59 = var46 * 256;
                int var60 = var42 * 256;
                int var61 = var49 << 2;
                class150 var62 = new class150(var48, class379.field5305, var60, var57, var61, class7.field61 + var51, var52 - -class7.field61, var53, var55, var47, var58, var44);
                var62.method818(class341.method2147(class379.field5305, var56, 0, var59) - var58, var56, false, class7.field61 + var51, var59);
                class196.field2540.method3181(new class124(var62), true);
            }
        } else if (class493.field6883 == arg1) {
            int var63 = class342.field4758.method3045(-125);
            int var64 = (var63 & 0x7) + class540.field7559;
            int var65 = class58.field786 + var64;
            int var66 = (var63 >> 4 & 0x7) + class506.field7056;
            int var67 = var66 + class525.field7310;
            int var68 = class342.field4758.method3090(-91);
            int var69 = class342.field4758.method3090(-106);
            int var70 = class342.field4758.method3090(-121);
            if (class241.field3066 != null) {
                class247 var71 = (class247) class241.field3066.method3476((long) (class379.field5305 << 28 | var65 << 14 | var67), (byte) 28);
                if (var71 != null) {
                    for (class508 var72 = (class508) var71.field3110.method3188((byte) -100); var72 != null; var72 = (class508) var71.field3110.method3182((byte) -39)) {
                        if ((var68 & 0x7FFF) == var72.field7085 && var72.field7088 == var69) {
                            var72.method589(-8880);
                            var72.field7088 = var70;
                            class101.method560(var67, var65, 14546, class379.field5305, var72);
                            break;
                        }
                    }
                    if (var66 >= 0 && var64 >= 0 && class139.field1760 > var66 && class369.field5135 > var64) {
                        class373.method2278(var66, -74, var64, class379.field5305);
                    }
                }
            }
        } else if (class179.field2306 == arg1) {
            int var73 = class342.field4758.method3039((byte) 127);
            int var74 = class342.field4758.method3066((byte) 101);
            int var75 = class342.field4758.method3037(true);
            int var76 = class342.field4758.method3064((byte) -99);
            int var77 = (var76 & 0x7) + class540.field7559;
            int var78 = var77 + class58.field786;
            int var79 = (var76 >> 4 & 0x7) + class506.field7056;
            int var80 = var79 + class525.field7310;
            if (class182.field2335 != var73) {
                boolean var81 = var79 >= 0 && var77 >= 0 && class139.field1760 > var79 && var77 < class369.field5135;
                if (var81 || class414.method2467(-11922, class403.field5520)) {
                    class101.method560(var80, var78, 14546, class379.field5305, new class508(var75, var74));
                    if (var81) {
                        class373.method2278(var79, -92, var77, class379.field5305);
                    }
                }
            }
        } else if (class559.field7822 == arg1) {
            int var82 = class342.field4758.method3035(arg0 - 957401312);
            int var83 = var82 >> 2;
            int var84 = var82 & 0x3;
            int var85 = class94.field1244[var83];
            int var86 = class342.field4758.method3035(arg0 ^ 0xC6EF3720);
            int var87 = ((var86 & 0x7C) >> 4) + class506.field7056;
            int var88 = (var86 & 0x7) + class540.field7559;
            int var89 = class342.field4758.method3090(arg0 ^ 0xFFFFFFAE);
            if (class414.method2467(-11922, class403.field5520) || var87 >= 0 && var88 >= 0 && var87 < class139.field1760 && class369.field5135 > var88) {
                class127.method682(-1, var83, var87, var84, var85, var89, 123, 0, var88, class379.field5305);
            }
        } else {
            if (arg0 != 0) {
                method2294(-111, (char) 65420);
            }
            if (class82.field1106 == arg1) {
                int var90 = class342.field4758.method3045(-128);
                int var91 = (var90 >> 4 & 0x7) + class506.field7056;
                int var92 = (var90 & 0x7) + class540.field7559;
                int var93 = class342.field4758.method3090(-115);
                int var94 = class342.field4758.method3045(-128);
                int var95 = class342.field4758.method3090(arg0 ^ 0xFFFFFFA9);
                int var96 = class342.field4758.method3045(-128);
                if (var91 >= 0 && var92 >= 0 && var91 < class139.field1760 && class369.field5135 > var92) {
                    int var97 = var91 * 512 + 256;
                    int var98 = var92 * 512 + 256;
                    int var99 = class379.field5305;
                    if (var99 < 3 && class291.method1786(var92, (byte) 106, var91)) {
                        var99++;
                    }
                    class35 var100 = new class35(var93, var95, class7.field61, class379.field5305, var99, var97, class341.method2147(class379.field5305, var97, 0, var98) - var94, var98, var91, var91, var92, var92, var96);
                    class239.field3052.method3181(new class338(var100), true);
                }
            } else if (class544.field7584 == arg1) {
                int var101 = class342.field4758.method3064((byte) -89);
                int var102 = class506.field7056 + ((var101 & 0x73) >> 4);
                int var103 = (var101 & 0x7) + class540.field7559;
                int var104 = class342.field4758.method3035(-957401312);
                int var105 = var104 >> 2;
                int var106 = var104 & 0x3;
                int var107 = class94.field1244[var105];
                if (class414.method2467(arg0 - 11922, class403.field5520) || var102 >= 0 && var103 >= 0 && class139.field1760 > var102 && class369.field5135 > var103) {
                    class127.method682(-1, var105, var102, var106, var107, -1, arg0 + 114, 0, var103, class379.field5305);
                }
            } else if (class233.field2974 == arg1) {
                int var108 = class342.field4758.method3045(-128);
                int var109 = (var108 & 0x7) + class540.field7559;
                int var110 = class58.field786 + var109;
                int var111 = (var108 >> 4 & 0x7) + class506.field7056;
                int var112 = class525.field7310 + var111;
                int var113 = class342.field4758.method3037(true);
                int var114 = class342.field4758.method3066((byte) 101);
                boolean var115 = var111 >= 0 && var109 >= 0 && class139.field1760 > var111 && var109 < class369.field5135;
                if (var115 || class414.method2467(arg0 ^ 0xFFFFD16E, class403.field5520)) {
                    class101.method560(var112, var110, 14546, class379.field5305, new class508(var114, var113));
                    if (var115) {
                        class373.method2278(var111, -8, var109, class379.field5305);
                    }
                }
            } else if (class501.field6952 == arg1) {
                int var116 = class342.field4758.method3090(-128);
                int var117 = class342.field4758.method3045(-126);
                class626.field9084.method1093(0, var116).method721(var117, false);
            } else if (field5223 == arg1) {
                byte var118 = class342.field4758.method3034(arg0 + 18351);
                int var119 = class342.field4758.method3064((byte) -119);
                int var120 = var119 >> 2;
                int var121 = var119 & 0x3;
                int var122 = class342.field4758.method3090(-85);
                int var123 = class342.field4758.method3090(-127);
                int var124 = class342.field4758.method3064((byte) -109);
                int var125 = ((var124 & 0x78) >> 4) + class506.field7056;
                int var126 = (var124 & 0x7) + class540.field7559;
                int var127 = class342.field4758.method3062((byte) -126);
                int var128 = class342.field4758.method3090(arg0 - 87);
                byte var129 = class342.field4758.method3051((byte) 79);
                byte var130 = class342.field4758.method3051((byte) 81);
                byte var131 = class342.field4758.method3034(18351);
                if (!class301.field3918.method195()) {
                    class433.method2526(arg0 ^ 0xFFFFBAD1, var128, var130, var127, var123, var129, class379.field5305, var118, var122, var125, var131, var121, var120, var126);
                }
            } else if (class195.field2533 == arg1) {
                class342.field4758.method3045(-128);
                int var132 = class342.field4758.method3045(-128);
                int var133 = ((var132 & 0x75) >> 4) + class506.field7056;
                int var134 = (var132 & 0x7) + class540.field7559;
                int var135 = class342.field4758.method3090(-93);
                int var136 = class342.field4758.method3045(-128);
                int var137 = class342.field4758.method3043((byte) 49);
                String var138 = class342.field4758.method3077(-20739);
                class21.method119(var137, var133, var138, 117, class379.field5305, var135, var136, var134);
            } else if (class167.field2117 == arg1) {
                int var139 = class342.field4758.method3064((byte) -80);
                int var140 = var139 >> 2;
                int var141 = var139 & 0x3;
                int var142 = class94.field1244[var140];
                int var143 = class342.field4758.method3041((byte) 124);
                int var144 = (var143 >> 4 & 0x7) + class506.field7056;
                int var145 = (var143 & 0x7) + class540.field7559;
                int var146 = class342.field4758.method3039((byte) 127);
                if (var146 == 65535) {
                    var146 = -1;
                }
                class171.method1039((byte) 118, var144, var146, var145, var141, class379.field5305, var140, var142);
            } else if (class97.field1302 == arg1) {
                int var147 = class342.field4758.method3045(-125);
                int var148 = ((var147 & 0x72) >> 4) + class506.field7056;
                int var149 = (var147 & 0x7) + class540.field7559;
                int var150 = class342.field4758.method3090(arg0 - 106);
                if (var150 == 65535) {
                    var150 = -1;
                }
                int var151 = class342.field4758.method3045(-125);
                int var152 = var151 >> 4 & 0xF;
                int var153 = var151 & 0x7;
                int var154 = class342.field4758.method3045(arg0 ^ 0xFFFFFF82);
                int var155 = class342.field4758.method3045(-127);
                if (var148 >= 0 && var149 >= 0 && var148 < class139.field1760 && class369.field5135 > var149) {
                    int var156 = var152 + 1;
                    if (class147.field1899.field419[0] >= var148 - var156 && var148 + var156 >= class147.field1899.field419[0] && (var149 - var156) <= class147.field1899.field417[0] && class147.field1899.field417[0] <= (var149 + var156)) {
                        class509.method2846(var155, (class379.field5305 << 24) + (var148 << 16) + ((var149 << 8) - -var152), var150, var153, var154, false);
                    }
                }
            } else if (class288.field3760 == arg1) {
                int var157 = class342.field4758.method3045(-126);
                int var158 = (var157 & 0x7) + class540.field7559;
                int var159 = class58.field786 + var158;
                int var160 = class506.field7056 + (var157 >> 4 & 0x7);
                int var161 = class525.field7310 + var160;
                int var162 = class342.field4758.method3039((byte) 127);
                class247 var163 = (class247) class241.field3066.method3476((long) (var159 << 14 | class379.field5305 << 28 | var161), (byte) 28);
                if (var163 != null) {
                    for (class508 var164 = (class508) var163.field3110.method3188((byte) -100); var164 != null; var164 = (class508) var163.field3110.method3182((byte) -48)) {
                        if ((var162 & 0x7FFF) == var164.field7085) {
                            var164.method589(-8880);
                            break;
                        }
                    }
                    if (var163.field3110.method3179(true)) {
                        var163.method589(-8880);
                    }
                    if (var160 >= 0 && var158 >= 0 && class139.field1760 > var160 && var158 < class369.field5135) {
                        class373.method2278(var160, arg0 ^ 0xFFFFFFCC, var158, class379.field5305);
                    }
                }
            } else if (class294.field3826 == arg1) {
                int var165 = class342.field4758.method3045(-126);
                boolean var166 = (var165 & 0x80) != 0;
                int var167 = (var165 >> 3 & 0x7) + class506.field7056;
                int var168 = (var165 & 0x7) + class540.field7559;
                int var169 = class342.field4758.method3051((byte) -128) + var167;
                int var170 = var168 + class342.field4758.method3051((byte) -66);
                int var171 = class342.field4758.method3087(true);
                int var172 = class342.field4758.method3090(-118);
                int var173 = class342.field4758.method3045(-126) * 4;
                int var174 = class342.field4758.method3045(-125) * 4;
                int var175 = class342.field4758.method3090(-115);
                int var176 = class342.field4758.method3090(-128);
                int var177 = class342.field4758.method3045(-128);
                if (var177 == 255) {
                    var177 = -1;
                }
                int var178 = class342.field4758.method3090(-93);
                if (var167 >= 0 && var168 >= 0 && var167 < class139.field1760 && class369.field5135 > var168 && var169 >= 0 && var170 >= 0 && var169 < class139.field1760 && var170 < class369.field5135 && var172 != 65535) {
                    int var179 = var170 * 512 + 256;
                    int var180 = var178 << 2;
                    int var181 = var168 * 512 + 256;
                    int var182 = var169 * 512 + 256;
                    int var183 = var174 << 2;
                    int var184 = var167 * 512 + 256;
                    int var185 = var173 << 2;
                    class150 var186 = new class150(var172, class379.field5305, var184, var181, var185, class7.field61 + var175, var176 - -class7.field61, var177, var180, var171, var183, var166);
                    var186.method818(class341.method2147(class379.field5305, var182, 0, var179) - var183, var182, false, class7.field61 + var175, var179);
                    class196.field2540.method3181(new class124(var186), true);
                }
            } else {
                class447.method2602(null, 96, "T3 - " + arg1);
                class493.method2772(false, arg0 ^ 0x493B);
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILjc;)I")
    public static final int method2292(int arg0, class585 arg1) {
        field5225++;
        class626 var2 = arg1.field8478;
        if (var2.field9085 != null) {
            var2 = var2.method3607(false, class257.field3191);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 <= 111) {
            method2293(true);
        }
        int var3 = var2.field9048;
        class362 var4 = arg1.method144((byte) 22);
        if (arg1.field398) {
            var3 = var2.field9063;
        } else if (arg1.field350 == var4.field5035 || arg1.field350 == var4.field5064 || arg1.field350 == var4.field5031 || arg1.field350 == var4.field5044) {
            var3 = var2.field9079;
        } else if (arg1.field350 == var4.field5030 || arg1.field350 == var4.field5052 || arg1.field350 == var4.field5054 || arg1.field350 == var4.field5063) {
            var3 = var2.field9092;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)V")
    public static void method2293(boolean arg0) {
        field5229 = null;
        field5223 = null;
        field5224 = null;
        field5231 = null;
        if (!arg0) {
            method2291(-5, null);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IC)I")
    public static final int method2294(int arg0, char arg1) {
        if (arg0 != -6279) {
            field5223 = null;
        }
        field5227++;
        return arg1 >= '\u0000' && class191.field2485.length > arg1 ? class191.field2485[arg1] : -1;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V")
    public static final void method2295(int arg0, int arg1) {
        class563 var2 = class199.field2605[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class563 var4 = class199.field2605[var3][arg0][arg1] = class199.field2605[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field7905--;
                for (class15 var5 = var4.field7894; var5 != null; var5 = var5.field158) {
                    class450 var6 = var5.field161;
                    if (var6.field6361 == arg0 && var6.field6359 == arg1) {
                        var6.field6358--;
                    }
                }
            }
        }
        if (class199.field2605[0][arg0][arg1] == null) {
            class199.field2605[0][arg0][arg1] = new class563(0, arg0, arg1);
            class199.field2605[0][arg0][arg1].field7886 = 1;
        }
        class199.field2605[0][arg0][arg1].field7893 = var2;
        class199.field2605[3][arg0][arg1] = null;
    }
}
