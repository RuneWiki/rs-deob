import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class105 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Lnj;")
    public static class415 field1378 = new class415(18, 1);

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field1383 = 0;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Lgv;")
    public static class39 field1381 = new class39();

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "[[[I")
    public static int[][][] field1384;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    public static void method780(byte arg0) {
        if (arg0 <= 39) {
            field1381 = null;
        }
        field1378 = null;
        field1384 = null;
        field1381 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lft;B)V")
    public static final void method781(class285 arg0, byte arg1) {
        field1380++;
        if (arg1 != 75) {
            method782(true);
        }
        if (class158.field1979 == arg0) {
            byte var2 = class230.field3069.method2381(arg1 - 193);
            byte var3 = class230.field3069.method2375(arg1 - 8718);
            int var4 = class230.field3069.method2396(arg1 ^ 0xFFFFFFC8);
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = class230.field3069.method2413((byte) -121);
            int var8 = ((var7 & 0x7D) >> 4) + class178.field2200;
            int var9 = (var7 & 0x7) + class602.field8102;
            int var10 = class230.field3069.method2383(65280);
            byte var11 = class230.field3069.method2375(-8643);
            int var12 = class230.field3069.method2393(-30727);
            byte var13 = class230.field3069.method2375(-8643);
            int var14 = class230.field3069.method2379((byte) -96);
            int var15 = class230.field3069.method2399(true);
            if (!class520.field6799.method340()) {
                class264.method1633(class656.field9160, var15, var12, false, var5, var11, var8, var13, var6, var3, var9, var14, var2, var10);
            }
        } else if (class596.field8050 == arg0) {
            class230.field3069.method2396(-111);
            int var16 = class230.field3069.method2396(35);
            int var17 = (var16 >> 4 & 0x7) + class178.field2200;
            int var18 = class602.field8102 + (var16 & 0x7);
            int var19 = class230.field3069.method2393(-30727);
            int var20 = class230.field3069.method2396(arg1 - 11);
            int var21 = class230.field3069.method2364(-91);
            String var22 = class230.field3069.method2394(4);
            class165.method1153(0, var20, var19, class656.field9160, var21, var18, var17, var22);
        } else if (class83.field1129 == arg0) {
            int var23 = class230.field3069.method2396(arg1 - 183);
            int var24 = class178.field2200 + (var23 >> 4 & 0x7);
            int var25 = (var23 & 0x7) + class602.field8102;
            int var26 = class230.field3069.method2393(-30727);
            int var27 = class230.field3069.method2396(-120);
            int var28 = class230.field3069.method2393(-30727);
            int var29 = class230.field3069.method2396(2);
            if (var24 >= 0 && var25 >= 0 && var24 < class611.field8258 && class656.field9155 > var25) {
                int var30 = var24 * 512 + 256;
                int var31 = var25 * 512 + 256;
                int var32 = class656.field9160;
                if (var32 < 3 && class589.method3215(var24, (byte) -52, var25)) {
                    var32++;
                }
                class46 var33 = new class46(var26, var28, class424.field5503, class656.field9160, var32, var30, class332.method1916(1218445319, var31, class656.field9160, var30) - var27, var31, var24, var24, var25, var25, var29);
                class21.field231.method2087(new class225(var33), arg1 ^ 0xFFFFFFCD);
            }
        } else if (class559.field7308 == arg0) {
            int var34 = class230.field3069.method2390((byte) 125);
            int var35 = class230.field3069.method2399(true);
            int var36 = class230.field3069.method2405((byte) 126);
            int var37 = (var36 & 0x7) + class602.field8102;
            int var38 = class186.field2376 + var37;
            int var39 = class178.field2200 + ((var36 & 0x7C) >> 4);
            int var40 = class100.field1326 + var39;
            boolean var41 = var39 >= 0 && var37 >= 0 && var39 < class611.field8258 && var37 < class656.field9155;
            if (var41 || class2.method2(field1383, 83)) {
                class72.method580(false, class656.field9160, var40, var38, new class558(var34, var35));
                if (var41) {
                    class210.method1353(var37, var39, arg1 + 65460, class656.field9160);
                }
            }
        } else if (class389.field4983 == arg0) {
            int var42 = class230.field3069.method2405((byte) 126);
            int var43 = (var42 & 0x7) + class602.field8102;
            int var44 = class186.field2376 + var43;
            int var45 = class178.field2200 + (var42 >> 4 & 0x7);
            int var46 = class100.field1326 + var45;
            int var47 = class230.field3069.method2379((byte) -103);
            class37 var48 = (class37) class197.field2589.method39((long) (var46 | class656.field9160 << 28 | var44 << 14), 31750);
            if (var48 != null) {
                for (class558 var49 = (class558) var48.field542.method2090(true); var49 != null; var49 = (class558) var48.field542.method2088(-152)) {
                    if ((var47 & 0x7FFF) == var49.field7283) {
                        var49.method2438((byte) 111);
                        break;
                    }
                }
                if (var48.field542.method2093(-2)) {
                    var48.method2438((byte) 113);
                }
                if (var45 >= 0 && var43 >= 0 && class611.field8258 > var45 && class656.field9155 > var43) {
                    class210.method1353(var43, var45, 65535, class656.field9160);
                }
            }
        } else if (class337.field4361 == arg0) {
            int var50 = class230.field3069.method2396(-111);
            int var51 = (var50 >> 4 & 0xF) + class178.field2200 * 2;
            int var52 = (var50 & 0xF) + class602.field8102 * 2;
            boolean var53 = class230.field3069.method2396(arg1 ^ 0x58) != 0;
            int var54 = class230.field3069.method2387((byte) -84) + var51;
            int var55 = var52 + class230.field3069.method2387((byte) -111);
            int var56 = class230.field3069.method2383(65280);
            int var57 = class230.field3069.method2383(65280);
            int var58 = class230.field3069.method2393(-30727);
            byte var59 = class230.field3069.method2387((byte) -95);
            int var60 = class230.field3069.method2396(64) * 4;
            int var61 = class230.field3069.method2393(-30727);
            int var62 = class230.field3069.method2393(-30727);
            int var63 = class230.field3069.method2396(arg1 - 190);
            int var64 = class230.field3069.method2393(-30727);
            if (var63 == 255) {
                var63 = -1;
            }
            if (var51 >= 0 && var52 >= 0 && var51 < class611.field8258 * 2 && class611.field8258 * 2 > var52 && var54 >= 0 && var55 >= 0 && class656.field9155 * 2 > var54 && var55 < (class656.field9155 * 2) && var58 != 65535) {
                int var65 = var55 * 256;
                int var66 = var60 << 2;
                int var67 = var52 * 256;
                int var68 = var54 * 256;
                int var69 = var51 * 256;
                int var70 = var59 << 2;
                int var71 = var64 << 2;
                if (var56 != 0) {
                    class227 var72 = null;
                    int var74;
                    if (var56 < 0) {
                        int var73 = -var56 - 1;
                        var74 = (var73 & 0x7C7E) >> 11;
                        int var75 = var73 & 0x7FF;
                        if (class353.field4536 == var75) {
                            var72 = class233.field3130;
                        } else {
                            var72 = class592.field8019[var75];
                        }
                    } else {
                        int var76 = var56 - 1;
                        int var77 = var76 & 0x7FF;
                        var74 = (var76 & 0x7F69) >> 11;
                        class234 var78 = (class234) class505.field6640.method39((long) var77, 31750);
                        if (var78 != null) {
                            var72 = var78.field3131;
                        }
                    }
                    if (var72 != null) {
                        class501 var79 = var72.method1435((byte) 122);
                        if (var79.field6614 != null && var79.field6614[var74] != null) {
                            int var80 = var79.field6614[var74][0];
                            int var81 = var79.field6614[var74][2];
                            int var82 = var72.field2988.method2307(true);
                            int var83 = class237.field3193[var82];
                            int var84 = class237.field3196[var82];
                            int var85 = var80 * var84 + var81 * var83 >> 14;
                            int var86 = var81 * var84 - var80 * var83 >> 14;
                            var70 -= var79.field6614[var74][1];
                            var69 += var85;
                            var67 += var86;
                        }
                    }
                }
                class303 var88 = new class303(var58, class656.field9160, var69, var67, var70, class424.field5503 + var61, class424.field5503 + var62, var63, var71, var57, var66, var53);
                var88.method1780(var65, class424.field5503 + var61, class332.method1916(1218445319, var65, class656.field9160, var68) + -var66, var68, 0);
                class407.field5178.method2087(new class12(var88), 72);
            }
        } else if (class25.field295 == arg0) {
            int var89 = class230.field3069.method2396(-125);
            int var90 = (var89 >> 4 & 0xF) + class178.field2200 * 2;
            int var91 = (var89 & 0xF) + class602.field8102 * 2;
            boolean var92 = class230.field3069.method2396(98) != 0;
            int var93 = class230.field3069.method2387((byte) -108) + var90;
            int var94 = var91 + class230.field3069.method2387((byte) 111);
            int var95 = class230.field3069.method2383(65280);
            int var96 = class230.field3069.method2393(-30727);
            int var97 = class230.field3069.method2396(-106) * 4;
            int var98 = class230.field3069.method2396(arg1 - 21) * 4;
            int var99 = class230.field3069.method2393(-30727);
            int var100 = class230.field3069.method2393(-30727);
            int var101 = class230.field3069.method2396(-106);
            int var102 = class230.field3069.method2393(-30727);
            if (var101 == 255) {
                var101 = -1;
            }
            if (var90 >= 0 && var91 >= 0 && var90 < (class611.field8258 * 2) && (class611.field8258 * 2) > var91 && var93 >= 0 && var94 >= 0 && (class656.field9155 * 2) > var93 && (class656.field9155 * 2) > var94 && var96 != 65535) {
                int var103 = var98 << 2;
                int var104 = var94 * 256;
                int var105 = var102 << 2;
                int var106 = var93 * 256;
                int var107 = var97 << 2;
                int var108 = var91 * 256;
                int var109 = var90 * 256;
                class303 var110 = new class303(var96, class656.field9160, var109, var108, var107, var99 + class424.field5503, class424.field5503 + var100, var101, var105, var95, var103, var92);
                var110.method1780(var104, class424.field5503 + var99, -var103 + class332.method1916(1218445319, var104, class656.field9160, var106), var106, 0);
                class407.field5178.method2087(new class12(var110), -103);
            }
        } else if (class581.field7908 == arg0) {
            int var111 = class230.field3069.method2396(-108);
            int var112 = var111 >> 2;
            int var113 = var111 & 0x3;
            int var114 = class367.field4731[var112];
            int var115 = class230.field3069.method2363(-116);
            int var116 = class178.field2200 + (var115 >> 4 & 0x7);
            int var117 = (var115 & 0x7) + class602.field8102;
            int var118 = class230.field3069.method2379((byte) -115);
            if (class2.method2(field1383, 83) || var116 >= 0 && var117 >= 0 && class611.field8258 > var116 && class656.field9155 > var117) {
                class561.method3001(-1, var112, (byte) 8, var117, class656.field9160, var114, 0, var116, var118, var113);
            }
        } else if (class493.field6523 == arg0) {
            int var119 = class230.field3069.method2396(arg1 ^ 0xD);
            int var120 = ((var119 & 0x77) >> 4) + class178.field2200;
            int var121 = (var119 & 0x7) + class602.field8102;
            int var122 = class230.field3069.method2393(-30727);
            if (var122 == 65535) {
                var122 = -1;
            }
            int var123 = class230.field3069.method2396(-105);
            int var124 = var123 >> 4 & 0xF;
            int var125 = var123 & 0x7;
            int var126 = class230.field3069.method2396(-123);
            int var127 = class230.field3069.method2396(arg1 - 192);
            if (var120 >= 0 && var121 >= 0 && var120 < class611.field8258 && class656.field9155 > var121) {
                int var128 = var124 + 1;
                if (var120 - var128 <= class233.field3130.field3030[0] && var120 + var128 >= class233.field3130.field3030[0] && var121 - var128 <= class233.field3130.field3039[0] && class233.field3130.field3039[0] <= var121 + var128) {
                    class495.method2695(var126, (class656.field9160 << 24) + var124 + (var120 << 16) + (var121 << 8), var127, var125, var122, arg1 - 76);
                }
            }
        } else if (class530.field6875 == arg0) {
            int var129 = class230.field3069.method2405((byte) 125);
            int var130 = class178.field2200 + ((var129 & 0x73) >> 4);
            int var131 = (var129 & 0x7) + class602.field8102;
            int var132 = class230.field3069.method2379((byte) -118);
            if (var132 == 65535) {
                var132 = -1;
            }
            int var133 = class230.field3069.method2413((byte) -108);
            int var134 = var133 >> 2;
            int var135 = var133 & 0x3;
            int var136 = class367.field4731[var134];
            class550.method2912(true, var130, class656.field9160, var134, var135, var132, var136, var131);
        } else if (class275.field3609 == arg0) {
            int var137 = class230.field3069.method2396(-8);
            int var138 = (var137 & 0x7) + class602.field8102;
            int var139 = class186.field2376 + var138;
            int var140 = (var137 >> 4 & 0x7) + class178.field2200;
            int var141 = class100.field1326 + var140;
            int var142 = class230.field3069.method2393(-30727);
            int var143 = class230.field3069.method2393(arg1 - 30802);
            int var144 = class230.field3069.method2393(-30727);
            if (class197.field2589 != null) {
                class37 var145 = (class37) class197.field2589.method39((long) (var139 << 14 | class656.field9160 << 28 | var141), arg1 + 31675);
                if (var145 != null) {
                    for (class558 var146 = (class558) var145.field542.method2090(true); var146 != null; var146 = (class558) var145.field542.method2088(-152)) {
                        if ((var142 & 0x7FFF) == var146.field7283 && var146.field7284 == var143) {
                            var146.method2438((byte) -6);
                            var146.field7284 = var144;
                            class72.method580(false, class656.field9160, var141, var139, var146);
                            break;
                        }
                    }
                    if (var140 >= 0 && var138 >= 0 && var140 < class611.field8258 && class656.field9155 > var138) {
                        class210.method1353(var138, var140, 65535, class656.field9160);
                    }
                }
            }
        } else if (class298.field3898 == arg0) {
            int var147 = class230.field3069.method2396(arg1 + 31);
            boolean var148 = (var147 & 0x80) != 0;
            int var149 = class178.field2200 + ((var147 & 0x38) >> 3);
            int var150 = (var147 & 0x7) + class602.field8102;
            int var151 = class230.field3069.method2387((byte) 115) + var149;
            int var152 = var150 + class230.field3069.method2387((byte) -108);
            int var153 = class230.field3069.method2383(65280);
            int var154 = class230.field3069.method2393(-30727);
            int var155 = class230.field3069.method2396(arg1 ^ 0x57) * 4;
            int var156 = class230.field3069.method2396(arg1 - 202) * 4;
            int var157 = class230.field3069.method2393(-30727);
            int var158 = class230.field3069.method2393(-30727);
            int var159 = class230.field3069.method2396(arg1 - 64);
            if (var159 == 255) {
                var159 = -1;
            }
            int var160 = class230.field3069.method2393(-30727);
            if (var149 >= 0 && var150 >= 0 && var149 < class611.field8258 && var150 < class656.field9155 && var151 >= 0 && var152 >= 0 && class611.field8258 > var151 && var152 < class656.field9155 && var154 != 65535) {
                int var161 = var149 * 512 + 256;
                int var162 = var150 * 512 + 256;
                int var163 = var151 * 512 + 256;
                int var164 = var155 << 2;
                int var165 = var156 << 2;
                int var166 = var152 * 512 + 256;
                int var167 = var160 << 2;
                class303 var168 = new class303(var154, class656.field9160, var161, var162, var164, class424.field5503 + var157, class424.field5503 + var158, var159, var167, var153, var165, var148);
                var168.method1780(var166, class424.field5503 + var157, class332.method1916(1218445319, var166, class656.field9160, var163) - var165, var163, 0);
                class407.field5178.method2087(new class12(var168), -109);
            }
        } else if (class679.field9360 == arg0) {
            int var169 = class230.field3069.method2396(arg1 ^ 0xFFFFFFCB);
            int var170 = ((var169 & 0x73) >> 4) + class178.field2200;
            int var171 = (var169 & 0x7) + class602.field8102;
            int var172 = class230.field3069.method2393(-30727);
            if (var172 == 65535) {
                var172 = -1;
            }
            int var173 = class230.field3069.method2396(-124);
            int var174 = (var173 & 0xF0) >> 4;
            int var175 = var173 & 0x7;
            int var176 = class230.field3069.method2396(-20);
            int var177 = class230.field3069.method2396(-4);
            if (var170 >= 0 && var171 >= 0 && class611.field8258 > var170 && var171 < class656.field9155) {
                int var178 = var174 + 1;
                if ((var170 - var178) <= class233.field3130.field3030[0] && class233.field3130.field3030[0] <= var170 + var178 && class233.field3130.field3039[0] >= var171 - var178 && class233.field3130.field3039[0] <= (var171 + var178)) {
                    class413.method2337(false, var175, var172, (class656.field9160 << 24) + (var171 << 8) - (-(var170 << 16) - var174), var176, var177, arg1 - 126);
                }
            }
        } else if (class240.field3243 == arg0) {
            int var179 = class230.field3069.method2399(true);
            int var180 = class230.field3069.method2390((byte) 113);
            int var181 = class230.field3069.method2413((byte) -108);
            int var182 = (var181 & 0x7) + class602.field8102;
            int var183 = var182 + class186.field2376;
            int var184 = ((var181 & 0x74) >> 4) + class178.field2200;
            int var185 = class100.field1326 + var184;
            int var186 = class230.field3069.method2393(-30727);
            if (class353.field4536 != var179) {
                boolean var187 = var184 >= 0 && var182 >= 0 && var184 < class611.field8258 && class656.field9155 > var182;
                if (var187 || class2.method2(field1383, 83)) {
                    class72.method580(false, class656.field9160, var185, var183, new class558(var186, var180));
                    if (var187) {
                        class210.method1353(var182, var184, 65535, class656.field9160);
                    }
                }
            }
        } else if (class91.field1194 == arg0) {
            int var188 = class230.field3069.method2413((byte) -107);
            int var189 = var188 >> 2;
            int var190 = var188 & 0x3;
            int var191 = class367.field4731[var189];
            int var192 = class230.field3069.method2363(118);
            int var193 = (var192 >> 4 & 0x7) + class178.field2200;
            int var194 = (var192 & 0x7) + class602.field8102;
            if (class2.method2(field1383, arg1 ^ 0x18) || var193 >= 0 && var194 >= 0 && class611.field8258 > var193 && var194 < class656.field9155) {
                class561.method3001(-1, var189, (byte) 8, var194, class656.field9160, var191, 0, var193, -1, var190);
            }
        } else if (class605.field8191 == arg0) {
            int var195 = class230.field3069.method2393(-30727);
            int var196 = class230.field3069.method2396(-105);
            class348.field4436.method1900(arg1 ^ 0xFFFFFFC6, var195).method3803((byte) -118, var196);
        } else {
            class698.method3809("T3 - " + arg0, (byte) 113, null);
            class250.method1577(arg1 ^ 0x48, false);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static final void method782(boolean arg0) {
        field1382++;
        if (!arg0) {
            method782(true);
        }
        class64.field873 = null;
        class183.field2350 = false;
        class211.method1355(-21784);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLufa;)[Lan;")
    public static final class169[] method783(byte arg0, class140 arg1) {
        field1379++;
        if (!arg1.method1059(1)) {
            return new class169[0];
        }
        class548 var2 = arg1.method1048(-98);
        while (var2.field7108 == 0) {
            class122.method905(10L, -6145);
        }
        if (var2.field7108 == 2) {
            return new class169[0];
        }
        int[] var3 = (int[]) var2.field7113;
        class169[] var4 = new class169[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class169 var6 = new class169();
            var4[var5] = var6;
            var6.field2105 = var3[var5 << 2];
            var6.field2103 = var3[(var5 << 2) + 1];
            var6.field2102 = var3[(var5 << 2) + 2];
            var6.field2100 = var3[(var5 << 2) + 3];
        }
        if (arg0 < 65) {
            method783((byte) -88, null);
        }
        return var4;
    }
}
