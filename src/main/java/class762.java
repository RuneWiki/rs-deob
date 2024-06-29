import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class762 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field10380;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field10381;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field10382;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lbt;I)V", line = 3)
    public static final void method4153(class437 arg0, int arg1) {
        field10380++;
        if (class362.field4406 == arg0) {
            int var2 = class356.field4337.method1509(true);
            int var3 = (var2 >> 4 & 0x7) + class398.field5262;
            int var4 = class100.field1336 + (var2 & 0x7);
            int var5 = class356.field4337.method1553((byte) 30);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = class356.field4337.method1509(true);
            int var7 = var6 >> 4 & 0xF;
            int var8 = var6 & 0x7;
            int var9 = class356.field4337.method1509(true);
            int var10 = class356.field4337.method1509(true);
            int var11 = class356.field4337.method1553((byte) -128);
            if (var3 >= 0 && var4 >= 0 && var3 < class240.field3280 && var4 < class276.field3602) {
                int var12 = var7 + 1;
                if (class422.field5564.field4767[0] >= var3 - var12 && class422.field5564.field4767[0] <= var3 + var12 && class422.field5564.field4758[0] >= var4 - var12 && class422.field5564.field4758[0] <= var4 + var12) {
                    class38.method232(var5, var11, (byte) 56, var10, var9, (class682.field8801 << 24) + (var3 << 16) + (var4 << 8) + var7, var8);
                }
            }
        } else if (class753.field10262 == arg0) {
            class356.field4337.method1509(true);
            int var13 = class356.field4337.method1509(true);
            int var14 = ((var13 & 0x7E) >> 4) + class398.field5262;
            int var15 = class100.field1336 + (var13 & 0x7);
            int var16 = class356.field4337.method1553((byte) -127);
            int var17 = class356.field4337.method1509(true);
            int var18 = class356.field4337.method1500((byte) -83);
            String var19 = class356.field4337.method1540((byte) -112);
            class193.method1343(var18, var17, var15, class682.field8801, var14, var16, (byte) 67, var19);
        } else if (class84.field1196 == arg0) {
            int var20 = class356.field4337.method1509(true);
            int var21 = (var20 >> 4 & 0xF) + class398.field5262 * 2;
            int var22 = class100.field1336 * 2 + (var20 & 0xF);
            int var23 = class356.field4337.method1509(true);
            boolean var24 = (var23 & 0x1) != 0;
            boolean var25 = (var23 & 0x2) != 0;
            int var26 = var25 ? var23 >> 2 : -1;
            int var27 = var21 + class356.field4337.method1554(27806);
            int var28 = var22 + class356.field4337.method1554(arg1 + 27804);
            int var29 = class356.field4337.method1542(27067);
            int var30 = class356.field4337.method1542(27067);
            int var31 = class356.field4337.method1553((byte) -126);
            int var32 = class356.field4337.method1509(true);
            int var33;
            if (var25) {
                var33 = (byte) var32;
            } else {
                var33 = var32 * 4;
            }
            int var34 = class356.field4337.method1509(true) * 4;
            int var35 = class356.field4337.method1553((byte) 16);
            int var36 = class356.field4337.method1553((byte) 59);
            int var37 = class356.field4337.method1509(true);
            int var38 = class356.field4337.method1553((byte) -125);
            if (var37 == 255) {
                var37 = -1;
            }
            if (var21 >= 0 && var22 >= 0 && var21 < (class240.field3280 * 2) && class240.field3280 * 2 > var22 && var27 >= 0 && var28 >= 0 && class276.field3602 * 2 > var27 && class276.field3602 * 2 > var28 && var31 != 65535) {
                int var39 = var27 * 256;
                int var40 = var28 * 256;
                int var41 = var33 << 2;
                int var42 = var34 << 2;
                int var43 = var21 * 256;
                int var44 = var22 * 256;
                int var45 = var38 << 2;
                if (var29 != 0 && var26 != -1) {
                    class381 var46 = null;
                    if (var29 < 0) {
                        int var47 = -var29 - 1;
                        if (class330.field4043 == var47) {
                            var46 = class422.field5564;
                        } else {
                            var46 = class263.field3508[var47];
                        }
                    } else {
                        int var48 = var29 - 1;
                        class232 var49 = (class232) class444.field5811.method2616((long) var48, (byte) -98);
                        if (var49 != null) {
                            var46 = var49.field3125;
                        }
                    }
                    if (var46 != null) {
                        class68 var50 = var46.method2169(0);
                        if (var50.field920 != null && var50.field920[var26] != null) {
                            var41 -= var50.field920[var26][1];
                        }
                        if (var50.field893 != null && var50.field893[var26] != null) {
                            var41 -= var50.field893[var26][1];
                        }
                    }
                }
                class781 var51 = new class781(var31, class682.field8801, class682.field8801, var43, var44, var41, class693.field8900 + var35, class693.field8900 + var36, var37, var45, var29, var30, var42, var24, var26);
                var51.method4285(class512.method2831(class682.field8801, (byte) 54, var39, var40) - var42, var40, var35 + class693.field8900, var39, (byte) -88);
                class139.field1833.method3593(new class573(var51), 15);
            }
        } else if (class614.field7744 == arg0) {
            int var52 = class356.field4337.method1492(-12);
            int var53 = (var52 & 0x7) + class100.field1336;
            int var54 = var53 + class240.field3293;
            int var55 = (var52 >> 4 & 0x7) + class398.field5262;
            int var56 = class714.field9407 + var55;
            int var57 = class356.field4337.method1489(arg1);
            class89 var58 = (class89) class407.field5401.method2616((long) (class682.field8801 << 28 | var54 << 14 | var56), (byte) 107);
            if (var58 != null) {
                for (class64 var59 = (class64) var58.field1228.method3591(0); var59 != null; var59 = (class64) var58.field1228.method3600((byte) 78)) {
                    if ((var57 & 0x7FFF) == var59.field838) {
                        var59.method1946(-10364);
                        break;
                    }
                }
                if (var58.field1228.method3596(-44)) {
                    var58.method1946(arg1 - 10366);
                }
                if (var55 >= 0 && var53 >= 0 && var55 < class240.field3280 && class276.field3602 > var53) {
                    class263.method1666(121, class682.field8801, var55, var53);
                }
            }
        } else if (class657.field8520 == arg0) {
            int var60 = class356.field4337.method1489(arg1);
            int var61 = class356.field4337.method1553((byte) -114);
            int var62 = class356.field4337.method1492(-84);
            int var63 = (var62 & 0x7) + class100.field1336;
            int var64 = class240.field3293 + var63;
            int var65 = ((var62 & 0x7E) >> 4) + class398.field5262;
            int var66 = class714.field9407 + var65;
            int var67 = class356.field4337.method1489(arg1);
            if (class330.field4043 != var61) {
                boolean var68 = var65 >= 0 && var63 >= 0 && var65 < class240.field3280 && var63 < class276.field3602;
                if (var68 || class610.method3268(arg1 ^ 0xFFFFFFA7, class449.field5854)) {
                    class1.method2(class682.field8801, false, new class64(var60, var67), var64, var66);
                    if (var68) {
                        class263.method1666(41, class682.field8801, var65, var63);
                    }
                }
            }
        } else if (class391.field5089 == arg0) {
            int var69 = class356.field4337.method1489(2);
            int var70 = class356.field4337.method1509(true);
            int var71 = (var70 & 0x7) + class100.field1336;
            int var72 = class240.field3293 + var71;
            int var73 = ((var70 & 0x77) >> 4) + class398.field5262;
            int var74 = class714.field9407 + var73;
            int var75 = class356.field4337.method1489(2);
            boolean var76 = var73 >= 0 && var71 >= 0 && var73 < class240.field3280 && var71 < class276.field3602;
            if (var76 || class610.method3268(-91, class449.field5854)) {
                class1.method2(class682.field8801, false, new class64(var75, var69), var72, var74);
                if (var76) {
                    class263.method1666(arg1 ^ 0xFFFFFF8D, class682.field8801, var73, var71);
                }
            }
        } else if (class317.field3949 == arg0) {
            int var77 = class356.field4337.method1553((byte) 92);
            int var78 = class356.field4337.method1509(true);
            class390.field4983.method4292(var77, (byte) -99).method4223(true, var78);
        } else if (class456.field5975 == arg0) {
            int var79 = class356.field4337.method1509(true);
            int var80 = class100.field1336 + (var79 & 0x7);
            int var81 = var80 + class240.field3293;
            int var82 = class398.field5262 + (var79 >> 4 & 0x7);
            int var83 = class714.field9407 + var82;
            int var84 = class356.field4337.method1553((byte) 38);
            int var85 = class356.field4337.method1553((byte) -115);
            int var86 = class356.field4337.method1553((byte) 32);
            if (class407.field5401 != null) {
                class89 var87 = (class89) class407.field5401.method2616((long) (var83 | class682.field8801 << 28 | var81 << 14), (byte) -123);
                if (var87 != null) {
                    for (class64 var88 = (class64) var87.field1228.method3591(0); var88 != null; var88 = (class64) var87.field1228.method3600((byte) 76)) {
                        if ((var84 & 0x7FFF) == var88.field838 && var88.field840 == var85) {
                            var88.method1946(-10364);
                            var88.field840 = var86;
                            class1.method2(class682.field8801, false, var88, var81, var83);
                            break;
                        }
                    }
                    if (var82 >= 0 && var80 >= 0 && class240.field3280 > var82 && class276.field3602 > var80) {
                        class263.method1666(-117, class682.field8801, var82, var80);
                    }
                }
            }
        } else if (class101.field1342 == arg0) {
            int var89 = class356.field4337.method1509(true);
            int var90 = var89 >> 2;
            int var91 = var89 & 0x3;
            int var92 = class89.field1227[var90];
            int var93 = class356.field4337.method1511(128);
            int var94 = class398.field5262 + (var93 >> 4 & 0x7);
            int var95 = (var93 & 0x7) + class100.field1336;
            if (class610.method3268(-91, class449.field5854) || var94 >= 0 && var95 >= 0 && var94 < class240.field3280 && class276.field3602 > var95) {
                class698.method3793(class682.field8801, -1, var92, var91, var95, false, var94, var90);
            }
        } else if (class439.field5766 == arg0) {
            int var96 = class356.field4337.method1509(true);
            boolean var97 = (var96 & 0x80) != 0;
            int var98 = ((var96 & 0x3B) >> 3) + class398.field5262;
            int var99 = (var96 & 0x7) + class100.field1336;
            int var100 = class356.field4337.method1554(arg1 ^ 0x6C9C) + var98;
            int var101 = var99 + class356.field4337.method1554(27806);
            int var102 = class356.field4337.method1542(arg1 + 27065);
            int var103 = class356.field4337.method1553((byte) -116);
            int var104 = class356.field4337.method1509(true) * 4;
            int var105 = class356.field4337.method1509(true) * 4;
            int var106 = class356.field4337.method1553((byte) 106);
            int var107 = class356.field4337.method1553((byte) 118);
            int var108 = class356.field4337.method1509(true);
            int var109 = class356.field4337.method1553((byte) 76);
            if (var108 == 255) {
                var108 = -1;
            }
            if (var98 >= 0 && var99 >= 0 && var98 < class240.field3280 && var99 < class276.field3602 && var100 >= 0 && var101 >= 0 && var100 < class240.field3280 && var101 < class276.field3602 && var103 != 65535) {
                int var110 = var105 << 2;
                int var111 = var109 << 2;
                int var112 = var100 * 512 + 256;
                int var113 = var98 * 512 + 256;
                int var114 = var99 * 512 + 256;
                int var115 = var101 * 512 + 256;
                int var116 = var104 << 2;
                class781 var117 = new class781(var103, class682.field8801, class682.field8801, var113, var114, var116, class693.field8900 + var106, class693.field8900 + var107, var108, var111, 0, var102, var110, var97, -1);
                var117.method4285(class512.method2831(class682.field8801, (byte) -34, var112, var115) - var110, var115, class693.field8900 + var106, var112, (byte) -69);
                class139.field1833.method3593(new class573(var117), 15);
            }
        } else if (class72.field980 == arg0) {
            int var118 = class356.field4337.method1511(128);
            int var119 = (var118 >> 4 & 0x7) + class398.field5262;
            int var120 = class100.field1336 + (var118 & 0x7);
            int var121 = class356.field4337.method1492(-17);
            int var122 = var121 >> 2;
            int var123 = var121 & 0x3;
            int var124 = class89.field1227[var122];
            int var125 = class356.field4337.method1551(255);
            if (class610.method3268(-91, class449.field5854) || var119 >= 0 && var120 >= 0 && var119 < class240.field3280 && var120 < class276.field3602) {
                class698.method3793(class682.field8801, var125, var124, var123, var120, false, var119, var122);
            }
        } else if (class330.field4038 == arg0) {
            int var126 = class356.field4337.method1492(-77);
            int var127 = ((var126 & 0x75) >> 4) + class398.field5262;
            int var128 = (var126 & 0x7) + class100.field1336;
            int var129 = class356.field4337.method1509(true);
            int var130 = var129 >> 2;
            int var131 = var129 & 0x3;
            int var132 = class89.field1227[var130];
            int var133 = class356.field4337.method1531((byte) -2);
            if (var133 == 65535) {
                var133 = -1;
            }
            class526.method2889(var127, false, class682.field8801, var130, var133, var128, var132, var131);
        } else if (class181.field2464 == arg0) {
            int var134 = class356.field4337.method1509(true);
            int var135 = ((var134 & 0x72) >> 4) + class398.field5262;
            int var136 = (var134 & 0x7) + class100.field1336;
            int var137 = class356.field4337.method1553((byte) 70);
            int var138 = class356.field4337.method1509(true);
            int var139 = class356.field4337.method1553((byte) 67);
            int var140 = class356.field4337.method1509(true);
            if (var135 >= 0 && var136 >= 0 && var135 < class240.field3280 && var136 < class276.field3602) {
                int var141 = var135 * 512 + 256;
                int var142 = var136 * 512 + 256;
                int var143 = class682.field8801;
                if (var143 < 3 && class433.method2484(var136, 0, var135)) {
                    var143++;
                }
                class127 var144 = new class127(var137, var139, class693.field8900, class682.field8801, var143, var141, class512.method2831(class682.field8801, (byte) -112, var141, var142) - var138, var142, var135, var135, var136, var136, var140);
                class604.field7674.method3593(new class195(var144), 15);
            }
        } else if (arg1 == 2) {
            if (class746.field10199 == arg0) {
                int var145 = class356.field4337.method1509(true);
                int var146 = (var145 >> 4 & 0x7) + class398.field5262;
                int var147 = class100.field1336 + (var145 & 0x7);
                int var148 = class356.field4337.method1553((byte) -112);
                if (var148 == 65535) {
                    var148 = -1;
                }
                int var149 = class356.field4337.method1509(true);
                int var150 = (var149 & 0xF4) >> 4;
                int var151 = var149 & 0x7;
                int var152 = class356.field4337.method1509(true);
                int var153 = class356.field4337.method1509(true);
                int var154 = class356.field4337.method1553((byte) -112);
                if (var146 >= 0 && var147 >= 0 && var146 < class240.field3280 && class276.field3602 > var147) {
                    int var155 = var150 + 1;
                    if (class422.field5564.field4767[0] >= (var146 - var155) && (var146 + var155) >= class422.field5564.field4767[0] && (var147 - var155) <= class422.field5564.field4758[0] && class422.field5564.field4758[0] <= (var147 + var155)) {
                        class6.method17(false, (class682.field8801 << 24) + var150 + (var146 << 16) + (var147 << 8), var152, var151, var154, -65, var148, var153);
                    }
                }
            } else if (class32.field322 == arg0) {
                int var156 = class356.field4337.method1511(128);
                int var157 = class356.field4337.method1509(true);
                int var158 = ((var157 & 0x79) >> 4) + class398.field5262;
                int var159 = (var157 & 0x7) + class100.field1336;
                int var160 = class356.field4337.method1553((byte) -110);
                class773 var161 = class390.field4983.method4292(var160, (byte) -103);
                int var162 = class356.field4337.method1492(-66);
                int var163 = var162 >> 2;
                int var164 = class89.field1227[var163];
                if (var163 == 11) {
                    var163 = 10;
                }
                int var165 = 0;
                if (var161.field10485 != null) {
                    int var166 = -1;
                    for (int var167 = 0; var167 < var161.field10485.length; var167++) {
                        if (var161.field10485[var167] == var163) {
                            var166 = var167;
                            break;
                        }
                    }
                    var165 = var161.field10511[var166].length;
                }
                int var168 = 0;
                if (var161.field10456 != null) {
                    var168 = var161.field10456.length;
                }
                int var169 = 0;
                if (var161.field10473 != null) {
                    var169 = var161.field10473.length;
                }
                if ((var156 & 0x1) == 1) {
                    class754.method4093(var158, var159, var164, (byte) 88, class682.field8801, null);
                } else {
                    int[] var170 = null;
                    if ((var156 & 0x2) == 2) {
                        var170 = new int[var165];
                        for (int var171 = 0; var171 < var165; var171++) {
                            var170[var171] = class356.field4337.method1553((byte) 111);
                        }
                    }
                    short[] var172 = null;
                    if ((var156 & 0x4) == 4) {
                        var172 = new short[var168];
                        for (int var173 = 0; var173 < var168; var173++) {
                            var172[var173] = (short) class356.field4337.method1553((byte) -118);
                        }
                    }
                    short[] var174 = null;
                    if ((var156 & 0x8) == 8) {
                        var174 = new short[var169];
                        for (int var175 = 0; var175 < var169; var175++) {
                            var174[var175] = (short) class356.field4337.method1553((byte) 9);
                        }
                    }
                    class754.method4093(var158, var159, var164, (byte) 82, class682.field8801, new class702((long) (class64.field837++), var170, var172, var174));
                }
            } else {
                class416.method2401(1, null, "T3 - " + arg0);
                class480.method2697((byte) 121, false);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[FIII[II[I[FIIII)V", line = 713)
    public static final void method4154(int arg0, float[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, float[] arg8, int arg9, int arg10, int arg11, int arg12) {
        field10382++;
        int var13 = arg2 * arg6 + arg0;
        int var14 = arg10 * arg12 + arg3;
        int var15 = arg6 - arg4;
        if (arg11 != -1) {
            method4153(null, 37);
        }
        int var16 = arg12 - arg4;
        if (arg7 == null) {
            for (int var17 = 0; var17 < arg9; var17++) {
                int var18 = arg4 + var13;
                while (var13 < var18) {
                    arg8[var14++] = arg1[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        } else if (arg1 == null) {
            for (int var19 = 0; var19 < arg9; var19++) {
                int var20 = arg4 + var13;
                while (var13 < var20) {
                    arg5[var14++] = arg7[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        } else {
            for (int var21 = 0; var21 < arg9; var21++) {
                int var22 = var13 + arg4;
                while (var13 < var22) {
                    arg5[var14] = arg7[var13];
                    arg8[var14++] = arg1[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lha;IBI)V", line = 797)
    public static final void method4155(class570 arg0, int arg1, byte arg2, int arg3) {
        class343.field4206 = new class133[arg1][arg3];
        if (arg2 != -80) {
            return;
        }
        class702.field9291 = arg0;
        field10381++;
        if (class33.field369 != null) {
            class629.field7987 = class541.method2946(class33.field369[1], class33.field369[0], class33.field369[3], class33.field369[2], class33.field369[5], class33.field369[4], (byte) 92);
        }
        class483.field6235 = new class133();
        class661.method3592(arg2 ^ 0xFFFFFFC9);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IFFIIFBI[FIF)V")
    public abstract void method3054(int arg0, float arg1, float arg2, int arg3, int arg4, float arg5, byte arg6, int arg7, float[] arg8, int arg9, float arg10);
}
