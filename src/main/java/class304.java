import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class304 {

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Lih;")
    private class214 field4865;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public int field4864;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field4860 = 4;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Z")
    public static boolean field4866 = false;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "[I")
    public static int[] field4862 = new int[6];

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field4867 = 205;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(FFIF)I", line = 7)
    public static final int method1942(float arg0, float arg1, int arg2, float arg3) {
        field4861++;
        float var4 = arg0 < 0.0F ? -arg0 : arg0;
        float var5 = arg3 < 0.0F ? -arg3 : arg3;
        float var6 = arg1 < 0.0F ? -arg1 : arg1;
        int var7 = 108 / ((arg2 - 58) / 41);
        if (var5 > var4 && var6 < var5) {
            return (arg3 > 0.0F) ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return arg1 > 0.0F ? 2 : 3;
        } else if ((arg0 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!bh", name = "finalize", descriptor = "()V", line = 51)
    protected final void finalize() throws Throwable {
        this.field4865.method1451(this.field4864, true);
        field4863++;
        super.finalize();
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljc;I)V", line = 60)
    public static final void method1943(class356 arg0, int arg1) {
        field4869++;
        if (class378.field5873 == arg0) {
            int var2 = class506.field7365.method132(49);
            int var3 = class506.field7365.method180(false);
            int var4 = class506.field7365.method165(false);
            int var5 = (var4 & 0x7) + class73.field1258;
            int var6 = class455.field6794 + var5;
            int var7 = ((var4 & 0x79) >> 4) + class236.field4088;
            int var8 = class16.field181 + var7;
            boolean var9 = var7 >= 0 && var5 >= 0 && var7 < class217.field3775 && class277.field4548 > var5;
            if (var9 || class532.method3148(-4, class194.field3037)) {
                class275.method1817(var6, var8, class151.field2426, (byte) -47, new class292(var3, var2));
                if (var9) {
                    class156.method1086(-110, var7, var5, class151.field2426);
                }
            }
        } else if (class413.field6292 == arg0) {
            int var10 = class506.field7365.method126((byte) -77);
            boolean var11 = (var10 & 0x80) != 0;
            int var12 = ((var10 & 0x39) >> 3) + class236.field4088;
            int var13 = (var10 & 0x7) + class73.field1258;
            int var14 = var12 + class506.field7365.method167(arg1 - 1492332113);
            int var15 = class506.field7365.method167(arg1 - 1492332113) + var13;
            int var16 = class506.field7365.method170(492756037);
            int var17 = class506.field7365.method132(107);
            int var18 = class506.field7365.method126((byte) -103) * 4;
            int var19 = class506.field7365.method126((byte) -77) * 4;
            int var20 = class506.field7365.method132(72);
            int var21 = class506.field7365.method132(arg1 ^ 0x58F32E0D);
            int var22 = class506.field7365.method126((byte) -97);
            int var23 = class506.field7365.method132(117);
            if (var22 == 255) {
                var22 = -1;
            }
            if (var12 >= 0 && var13 >= 0 && var12 < class217.field3775 && var13 < class277.field4548 && var14 >= 0 && var15 >= 0 && var14 < class217.field3775 && class277.field4548 > var15 && var17 != 65535) {
                int var24 = var18 << 0;
                int var25 = var14 * 128 + 64;
                int var26 = var13 * 128 + 64;
                int var27 = var12 * 128 + 64;
                int var28 = var23 << 0;
                int var29 = var15 * 128 + 64;
                int var30 = var19 << 0;
                class44 var31 = new class44(var17, class151.field2426, var27, var26, var24, class504.field7348 + var20, class504.field7348 + var21, var22, var28, var16, var30, var11);
                var31.method324(class81.method592(var25, var29, 9251, class151.field2426) - var30, var20 - -class504.field7348, var29, 1, var25);
                class328.field5171.method2541(0, new class82(var31));
            }
        } else if (class268.field4474 == arg0) {
            int var32 = class506.field7365.method162(false);
            int var33 = class506.field7365.method162(false);
            int var34 = class506.field7365.method126((byte) -94);
            int var35 = (var34 & 0x7) + class73.field1258;
            int var36 = var35 + class455.field6794;
            int var37 = (var34 >> 4 & 0x7) + class236.field4088;
            int var38 = var37 + class16.field181;
            int var39 = class506.field7365.method162(false);
            if (class265.field4432 != var32) {
                boolean var40 = var37 >= 0 && var35 >= 0 && class217.field3775 > var37 && var35 < class277.field4548;
                if (var40 || class532.method3148(-4, class194.field3037)) {
                    class275.method1817(var36, var38, class151.field2426, (byte) 120, new class292(var33, var39));
                    if (var40) {
                        class156.method1086(arg1 ^ 0xA70CD1C1, var37, var35, class151.field2426);
                    }
                }
            }
        } else if (class420.field6344 == arg0) {
            int var41 = class506.field7365.method126((byte) -80);
            int var42 = class73.field1258 + (var41 & 0x7);
            int var43 = class455.field6794 + var42;
            int var44 = (var41 >> 4 & 0x7) + class236.field4088;
            int var45 = class16.field181 + var44;
            int var46 = class506.field7365.method132(63);
            class279 var47 = (class279) class244.field4176.method2516((long) (class151.field2426 << 28 | var43 << 14 | var45), -1);
            if (var47 != null) {
                for (class292 var48 = (class292) var47.field4577.method2538(arg1 ^ 0xA70CD1B2); var48 != null; var48 = (class292) var47.field4577.method2535((byte) -56)) {
                    if ((var46 & 0x7FFF) == var48.field4737) {
                        var48.method1821((byte) -100);
                        break;
                    }
                }
                if (var47.field4577.method2544((byte) 61)) {
                    var47.method1821((byte) 92);
                }
                if (var44 >= 0 && var42 >= 0 && var44 < class217.field3775 && class277.field4548 > var42) {
                    class156.method1086(-101, var44, var42, class151.field2426);
                }
            }
        } else if (class155.field2510 == arg0) {
            int var49 = class506.field7365.method126((byte) -107);
            int var50 = ((var49 & 0xF7) >> 4) + class236.field4088 * 2;
            int var51 = (var49 & 0xF) + class73.field1258 * 2;
            boolean var52 = class506.field7365.method126((byte) -91) != 0;
            int var53 = class506.field7365.method167(arg1 - 1492332113) + var50;
            int var54 = class506.field7365.method167(-2) + var51;
            int var55 = class506.field7365.method170(arg1 ^ 0x45ADF20A);
            int var56 = class506.field7365.method132(72);
            int var57 = class506.field7365.method126((byte) -82) * 4;
            int var58 = class506.field7365.method126((byte) -76) * 4;
            int var59 = class506.field7365.method132(36);
            int var60 = class506.field7365.method132(arg1 - 1492332038);
            int var61 = class506.field7365.method126((byte) -109);
            int var62 = class506.field7365.method132(74);
            if (var61 == 255) {
                var61 = -1;
            }
            if (var50 >= 0 && var51 >= 0 && class217.field3775 * 2 > var50 && (class217.field3775 * 2) > var51 && var53 >= 0 && var54 >= 0 && var53 < (class277.field4548 * 2) && var54 < class277.field4548 * 2 && var56 != 65535) {
                int var63 = var50 * 64;
                int var64 = var62 << 0;
                int var65 = var53 * 64;
                int var66 = var58 << 0;
                int var67 = var54 * 64;
                int var68 = var57 << 0;
                int var69 = var51 * 64;
                class44 var70 = new class44(var56, class151.field2426, var63, var69, var68, class504.field7348 + var59, var60 - -class504.field7348, var61, var64, var55, var66, var52);
                var70.method324(class81.method592(var65, var67, arg1 ^ 0x58F30A6C, class151.field2426) - var66, class504.field7348 + var59, var67, 1, var65);
                class328.field5171.method2541(0, new class82(var70));
            }
        } else if (class449.field6688 == arg0) {
            int var71 = class506.field7365.method132(77);
            int var72 = class506.field7365.method126((byte) -72);
            class61.field928.method791(var71, true).method291(0, var72);
        } else if (class228.field3985 == arg0) {
            int var73 = class506.field7365.method125((byte) 94);
            int var74 = (var73 >> 4 & 0x7) + class236.field4088;
            int var75 = (var73 & 0x7) + class73.field1258;
            int var76 = class506.field7365.method165(false);
            int var77 = var76 >> 2;
            int var78 = var76 & 0x3;
            int var79 = class491.field7178[var77];
            if (class532.method3148(-4, class194.field3037) || var74 >= 0 && var75 >= 0 && var74 < class217.field3775 && var75 < class277.field4548) {
                class441.method2657(var77, -1, var74, var79, var75, var78, class151.field2426, 0, (byte) 101, -1);
            }
        } else if (class530.field7795 == arg0) {
            int var80 = class506.field7365.method126((byte) -115);
            int var81 = ((var80 & 0x70) >> 4) + class236.field4088;
            int var82 = class73.field1258 + (var80 & 0x7);
            int var83 = class506.field7365.method132(40);
            if (var83 == 65535) {
                var83 = -1;
            }
            int var84 = class506.field7365.method126((byte) -108);
            int var85 = var84 >> 4 & 0xF;
            int var86 = var84 & 0x7;
            int var87 = class506.field7365.method126((byte) -88);
            int var88 = class506.field7365.method126((byte) -127);
            if (var81 >= 0 && var82 >= 0 && class217.field3775 > var81 && var82 < class277.field4548) {
                int var89 = var85 + 1;
                if (class302.field4850.field3159[0] >= (var81 - var89) && class302.field4850.field3159[0] <= (var81 + var89) && class302.field4850.field3158[0] >= var82 - var89 && class302.field4850.field3158[0] <= var82 + var89) {
                    class386.method2425(var87, var88, (class151.field2426 << 24) + (var82 << 8) + (var81 << 16) + var85, var86, var83, (byte) 1);
                }
            }
        } else if (class352.field5491 == arg0) {
            int var90 = class506.field7365.method180(false);
            int var91 = class506.field7365.method125((byte) 92);
            int var92 = ((var91 & 0x7A) >> 4) + class236.field4088;
            int var93 = (var91 & 0x7) + class73.field1258;
            int var94 = class506.field7365.method165(false);
            int var95 = var94 >> 2;
            int var96 = var94 & 0x3;
            int var97 = class491.field7178[var95];
            if (class532.method3148(-4, class194.field3037) || var92 >= 0 && var93 >= 0 && class217.field3775 > var92 && var93 < class277.field4548) {
                class441.method2657(var95, var90, var92, var97, var93, var96, class151.field2426, 0, (byte) 127, -1);
            }
        } else if (class264.field4413 == arg0) {
            class506.field7365.method126((byte) -123);
            int var98 = class506.field7365.method126((byte) -88);
            int var99 = (var98 >> 4 & 0x7) + class236.field4088;
            int var100 = (var98 & 0x7) + class73.field1258;
            int var101 = class506.field7365.method132(87);
            int var102 = class506.field7365.method126((byte) -114);
            int var103 = class506.field7365.method181(92);
            String var104 = class506.field7365.method156((byte) -128);
            class110.method787(var104, var101, var99, var100, true, class151.field2426, var103, var102);
        } else if (class14.field159 == arg0) {
            int var105 = class506.field7365.method126((byte) -75);
            int var106 = (var105 & 0x7) + class73.field1258;
            int var107 = class455.field6794 + var106;
            int var108 = class236.field4088 + ((var105 & 0x7E) >> 4);
            int var109 = class16.field181 + var108;
            int var110 = class506.field7365.method132(41);
            int var111 = class506.field7365.method132(118);
            int var112 = class506.field7365.method132(40);
            if (class244.field4176 != null) {
                class279 var113 = (class279) class244.field4176.method2516((long) (var109 | class151.field2426 << 28 | var107 << 14), -1);
                if (var113 != null) {
                    for (class292 var114 = (class292) var113.field4577.method2538(-3); var114 != null; var114 = (class292) var113.field4577.method2535((byte) -89)) {
                        if ((var110 & 0x7FFF) == var114.field4737 && var114.field4738 == var111) {
                            var114.method1821((byte) -97);
                            var114.field4738 = var112;
                            class275.method1817(var107, var109, class151.field2426, (byte) -30, var114);
                            break;
                        }
                    }
                    if (var108 >= 0 && var106 >= 0 && var108 < class217.field3775 && var106 < class277.field4548) {
                        class156.method1086(-120, var108, var106, class151.field2426);
                    }
                }
            }
        } else if (class527.field7768 == arg0) {
            int var115 = class506.field7365.method126((byte) -80);
            int var116 = (var115 >> 4 & 0xF) + class236.field4088 * 2;
            int var117 = (var115 & 0xF) + class73.field1258 * 2;
            boolean var118 = class506.field7365.method126((byte) -93) != 0;
            int var119 = class506.field7365.method167(arg1 - 1492332113) + var116;
            int var120 = var117 + class506.field7365.method167(-2);
            int var121 = class506.field7365.method170(492756037);
            int var122 = class506.field7365.method170(492756037);
            int var123 = class506.field7365.method132(arg1 - 1492332087);
            byte var124 = class506.field7365.method167(-2);
            int var125 = class506.field7365.method126((byte) -94) * 4;
            int var126 = class506.field7365.method132(36);
            int var127 = class506.field7365.method132(72);
            int var128 = class506.field7365.method126((byte) -108);
            int var129 = class506.field7365.method132(26);
            if (var128 == 255) {
                var128 = -1;
            }
            if (var116 >= 0 && var117 >= 0 && var116 < class217.field3775 * 2 && var117 < class217.field3775 * 2 && var119 >= 0 && var120 >= 0 && (class277.field4548 * 2) > var119 && var120 < (class277.field4548 * 2) && var123 != 65535) {
                int var130 = var125 << 0;
                int var131 = var129 << 0;
                int var132 = var124 << 0;
                int var133 = var119 * 64;
                int var134 = var120 * 64;
                int var135 = var117 * 64;
                int var136 = var116 * 64;
                if (var121 != 0) {
                    class197 var137 = null;
                    int var139;
                    if (var121 >= 0) {
                        int var138 = var121 - 1;
                        var139 = var138 >> 11 & 0xF;
                        int var140 = var138 & 0x7FF;
                        class505 var141 = (class505) class147.field2396.method2516((long) var140, -1);
                        if (var141 != null) {
                            var137 = var141.field7355;
                        }
                    } else {
                        int var142 = -var121 - 1;
                        var139 = var142 >> 11 & 0xF;
                        int var143 = var142 & 0x7FF;
                        if (class265.field4432 == var143) {
                            var137 = class302.field4850;
                        } else {
                            var137 = class435.field6489[var143];
                        }
                    }
                    if (var137 != null) {
                        class49 var144 = var137.method1308(arg1 ^ 0xA70CE2A3);
                        if (var144.field814 != null && var144.field814[var139] != null) {
                            int var145 = var144.field814[var139][0];
                            int var146 = var144.field814[var139][2];
                            int var147 = var137.field3087.method2112((byte) 122);
                            int var148 = class46.field757[var147];
                            int var149 = class46.field755[var147];
                            int var150 = var145 * var149 + var146 * var148 >> 15;
                            int var151 = var146 * var149 - (var145 * var148) >> 15;
                            var136 += var150;
                            var135 += var151;
                            var132 -= var144.field814[var139][1];
                        }
                    }
                }
                class44 var153 = new class44(var123, class151.field2426, var136, var135, var132, class504.field7348 + var126, class504.field7348 + var127, var128, var131, var122, var130, var118);
                var153.method324(class81.method592(var133, var134, 9251, class151.field2426) - var130, class504.field7348 + var126, var134, 1, var133);
                class328.field5171.method2541(0, new class82(var153));
            }
        } else if (class328.field5179 == arg0) {
            byte var154 = class506.field7365.method167(arg1 ^ 0xA70CD1B1);
            byte var155 = class506.field7365.method175(91);
            int var156 = class506.field7365.method162(false);
            int var157 = class506.field7365.method180(false);
            int var158 = class506.field7365.method125((byte) 106);
            int var159 = var158 >> 2;
            int var160 = var158 & 0x3;
            int var161 = class506.field7365.method126((byte) -98);
            int var162 = ((var161 & 0x7B) >> 4) + class236.field4088;
            int var163 = (var161 & 0x7) + class73.field1258;
            byte var164 = class506.field7365.method144(112);
            byte var165 = class506.field7365.method148(108);
            int var166 = class506.field7365.method170(492756037);
            int var167 = class506.field7365.method132(30);
            if (!class305.field4873.method831()) {
                class395.method2471(var166, var163, var164, class151.field2426, var167, var160, var157, 16, var154, var159, var156, var162, var155, var165);
            }
        } else if (class151.field2421 == arg0) {
            int var168 = class506.field7365.method173(-1278512920);
            int var169 = (var168 >> 4 & 0x7) + class236.field4088;
            int var170 = (var168 & 0x7) + class73.field1258;
            int var171 = class506.field7365.method165(false);
            int var172 = var171 >> 2;
            int var173 = var171 & 0x3;
            int var174 = class491.field7178[var172];
            int var175 = class506.field7365.method162(false);
            if (var175 == 65535) {
                var175 = -1;
            }
            class30.method234((byte) 109, var169, var172, class151.field2426, var173, var175, var170, var174);
        } else {
            if (arg1 != 1492332111) {
                field4862 = null;
            }
            if (class406.field6168 == arg0) {
                int var176 = class506.field7365.method126((byte) -83);
                int var177 = ((var176 & 0x78) >> 4) + class236.field4088;
                int var178 = (var176 & 0x7) + class73.field1258;
                int var179 = class506.field7365.method132(82);
                int var180 = class506.field7365.method126((byte) -119);
                int var181 = class506.field7365.method132(25);
                int var182 = class506.field7365.method126((byte) -106);
                if (var177 >= 0 && var178 >= 0 && class217.field3775 > var177 && var178 < class277.field4548) {
                    int var183 = var177 * 128 + 64;
                    int var184 = var178 * 128 + 64;
                    int var185 = class151.field2426;
                    if (var185 < 3 && class355.method2280((byte) 82, var178, var177)) {
                        var185++;
                    }
                    class134 var186 = new class134(var179, var181, class504.field7348, class151.field2426, var185, var183, class81.method592(var183, var184, arg1 ^ 0x58F30A6C, class151.field2426) - var180, var184, var177, var177, var178, var178, var182);
                    class359.field5586.method2541(0, new class460(var186));
                }
            } else {
                class502.method2968("T3 - " + arg0, (byte) -110, null);
                class165.method1132(false, false);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljp;ILjp;)V", line = 716)
    public static final void method1944(class276 arg0, int arg1, class276 arg2) {
        field4868++;
        if (arg2.field4530 != null) {
            arg2.method1821((byte) 101);
        }
        arg2.field4535 = arg0;
        int var3 = -11 / ((5 - arg1) / 54);
        arg2.field4530 = arg0.field4530;
        arg2.field4530.field4535 = arg2;
        arg2.field4535.field4530 = arg2;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 739)
    public static void method1945(int arg0) {
        if (arg0 <= 57) {
            method1943(null, 113);
        }
        field4862 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()V", line = 751)
    public static final void method1946() {
        for (int var0 = 0; var0 < class510.field7453; var0++) {
            class290 var1 = class271.field4497[var0];
            class355.method2282(var1);
            class271.field4497[var0] = null;
        }
        class510.field7453 = 0;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lih;II)V", line = 770)
    public class304(class214 arg0, int arg1, int arg2) {
        this.field4865 = arg0;
        this.field4864 = arg2;
    }
}
