import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class184 {

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Lvaa;")
    public static class399 field2590 = new class399();

    @OriginalMember(owner = "client!p", name = "g", descriptor = "[I")
    public static int[] field2595 = new int[32];

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static final void method1146(int arg0) {
        field2593++;
        if (class209.field2952 != null) {
            class209.field2952.method2238(-115);
        }
        int var1 = -69 % ((arg0 - 66) / 59);
        if (class170.field2459 != null) {
            class170.field2459.method2238(25);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method1147(String arg0, String arg1, boolean arg2, String arg3) {
        field2591++;
        int var4 = arg1.indexOf(arg3);
        if (arg2) {
            field2595 = null;
        }
        while (var4 != -1) {
            arg1 = arg1.substring(0, var4) + arg0 + arg1.substring(arg3.length() + var4);
            var4 = arg1.indexOf(arg3, var4 + arg0.length());
        }
        return arg1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lml;Z)V")
    public static final void method1148(class325 arg0, boolean arg1) {
        field2592++;
        if (class315.field4240 == arg0) {
            int var2 = class343.field4627.method110((byte) 42);
            int var3 = (var2 >> 4 & 0x7) + client.field3471;
            int var4 = class25.field455 + (var2 & 0x7);
            int var5 = class343.field4627.method104(-113);
            int var6 = class343.field4627.method110((byte) 35);
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = class147.field2269[var7];
            if (class208.method1370((byte) 100, class489.field6847) || var3 >= 0 && var4 >= 0 && var3 < class32.field513 && var4 < class611.field8786) {
                class431.method2561(var7, var9, -1, var3, 0, class378.field5079, 0, var5, var4, var8);
            }
        } else if (class646.field9388 == arg0) {
            int var10 = class343.field4627.method96(arg1);
            int var11 = var10 >> 2;
            int var12 = var10 & 0x3;
            int var13 = class147.field2269[var11];
            int var14 = class343.field4627.method78(-8388608);
            int var15 = (var14 >> 4 & 0x7) + client.field3471;
            int var16 = class25.field455 + (var14 & 0x7);
            if (class208.method1370((byte) 100, class489.field6847) || var15 >= 0 && var16 >= 0 && var15 < class32.field513 && var16 < class611.field8786) {
                class431.method2561(var11, var13, -1, var15, 0, class378.field5079, 0, -1, var16, var12);
            }
        } else if (class298.field4078 == arg0) {
            int var17 = class343.field4627.method93((byte) 81);
            int var18 = class343.field4627.method110((byte) 124);
            class18.field227.method1201((byte) -110, var17).method2179(0, var18);
        } else if (class174.field2507 == arg0) {
            int var19 = class343.field4627.method78(-8388608);
            int var20 = var19 >> 2;
            int var21 = var19 & 0x3;
            int var22 = class147.field2269[var20];
            int var23 = class343.field4627.method96(false);
            int var24 = ((var23 & 0x73) >> 4) + client.field3471;
            int var25 = (var23 & 0x7) + class25.field455;
            int var26 = class343.field4627.method92(1);
            if (var26 == 65535) {
                var26 = -1;
            }
            class586.method3438(var20, class378.field5079, var21, var24, var25, var26, -81, var22);
        } else if (class132.field2111 == arg0) {
            class343.field4627.method110((byte) 29);
            int var27 = class343.field4627.method110((byte) 67);
            int var28 = (var27 >> 4 & 0x7) + client.field3471;
            int var29 = (var27 & 0x7) + class25.field455;
            int var30 = class343.field4627.method93((byte) 122);
            int var31 = class343.field4627.method110((byte) 117);
            int var32 = class343.field4627.method89((byte) -27);
            String var33 = class343.field4627.method100((byte) 123);
            class93.method682(var29, var28, var30, var33, var32, var31, class378.field5079, (byte) 94);
        } else if (class646.field9389 == arg0) {
            int var34 = class343.field4627.method110((byte) 73);
            int var35 = class25.field455 + (var34 & 0x7);
            int var36 = class6.field80 + var35;
            int var37 = ((var34 & 0x7C) >> 4) + client.field3471;
            int var38 = var37 + class519.field7304;
            int var39 = class343.field4627.method93((byte) 80);
            int var40 = class343.field4627.method93((byte) 83);
            int var41 = class343.field4627.method93((byte) 104);
            if (class220.field3147 != null) {
                class93 var42 = (class93) class220.field3147.method1242(0, (long) (var38 | class378.field5079 << 28 | var36 << 14));
                if (var42 != null) {
                    for (class335 var43 = (class335) var42.field1434.method456((byte) -93); var43 != null; var43 = (class335) var42.field1434.method460((byte) 120)) {
                        if ((var39 & 0x7FFF) == var43.field4461 && var43.field4465 == var40) {
                            var43.method1117(0);
                            var43.field4465 = var41;
                            class266.method1743(var38, var36, var43, class378.field5079, -27677);
                            break;
                        }
                    }
                    if (var37 >= 0 && var35 >= 0 && class32.field513 > var37 && var35 < class611.field8786) {
                        class344.method2081(class378.field5079, false, var37, var35);
                    }
                }
            }
        } else if (client.field3473 == arg0) {
            int var44 = class343.field4627.method110((byte) 49);
            int var45 = client.field3471 + (var44 >> 4 & 0x7);
            int var46 = class25.field455 + (var44 & 0x7);
            int var47 = class343.field4627.method93((byte) 126);
            if (var47 == 65535) {
                var47 = -1;
            }
            int var48 = class343.field4627.method110((byte) 124);
            int var49 = var48 >> 4 & 0xF;
            int var50 = var48 & 0x7;
            int var51 = class343.field4627.method110((byte) 126);
            int var52 = class343.field4627.method110((byte) 113);
            if (var45 >= 0 && var46 >= 0 && class32.field513 > var45 && var46 < class611.field8786) {
                int var53 = var49 + 1;
                if ((var45 - var53) <= class645.field9372.field616[0] && class645.field9372.field616[0] <= var45 + var53 && class645.field9372.field618[0] >= var46 - var53 && class645.field9372.field618[0] <= var46 + var53) {
                    class176.method1118((class378.field5079 << 24) + var49 + (var45 << 16) + (var46 << 8), 102, var52, var50, var51, var47);
                }
            }
        } else if (class175.field2509 == arg0) {
            int var54 = class343.field4627.method96(false);
            int var55 = (var54 & 0x7) + class25.field455;
            int var56 = var55 + class6.field80;
            int var57 = ((var54 & 0x7B) >> 4) + client.field3471;
            int var58 = class519.field7304 + var57;
            int var59 = class343.field4627.method98(25356);
            int var60 = class343.field4627.method104(-55);
            int var61 = class343.field4627.method98(25356);
            if (class97.field1472 != var61) {
                boolean var62 = var57 >= 0 && var55 >= 0 && class32.field513 > var57 && class611.field8786 > var55;
                if (var62 || class208.method1370((byte) 100, class489.field6847)) {
                    class266.method1743(var58, var56, new class335(var59, var60), class378.field5079, -27677);
                    if (var62) {
                        class344.method2081(class378.field5079, false, var57, var55);
                    }
                }
            }
        } else if (class349.field4698 == arg0) {
            byte var63 = class343.field4627.method116((byte) 81);
            int var64 = class343.field4627.method104(-51);
            int var65 = class343.field4627.method96(arg1);
            int var66 = ((var65 & 0x7D) >> 4) + client.field3471;
            int var67 = (var65 & 0x7) + class25.field455;
            int var68 = class343.field4627.method92(1);
            int var69 = class343.field4627.method71((byte) -109);
            int var70 = var69 >> 2;
            int var71 = var69 & 0x3;
            byte var72 = class343.field4627.method116((byte) 52);
            int var73 = class343.field4627.method93((byte) 106);
            int var74 = class343.field4627.method121((byte) -72);
            byte var75 = class343.field4627.method62((byte) -110);
            byte var76 = class343.field4627.method103((byte) -38);
            if (!class69.field1165.method1340()) {
                class124.method867(var63, var73, var76, var68, var64, var70, var75, 1, var66, var74, class378.field5079, var71, var67, var72);
            }
        } else if (class189.field2684 == arg0) {
            int var77 = class343.field4627.method110((byte) 112);
            int var78 = ((var77 & 0xFF) >> 4) + client.field3471 * 2;
            int var79 = (var77 & 0xF) + class25.field455 * 2;
            boolean var80 = class343.field4627.method110((byte) 106) != 0;
            int var81 = class343.field4627.method67(65280) + var78;
            int var82 = class343.field4627.method67(65280) + var79;
            int var83 = class343.field4627.method111(-119);
            int var84 = class343.field4627.method93((byte) 74);
            int var85 = class343.field4627.method110((byte) 124) * 4;
            int var86 = class343.field4627.method110((byte) 64) * 4;
            int var87 = class343.field4627.method93((byte) 117);
            int var88 = class343.field4627.method93((byte) 107);
            int var89 = class343.field4627.method110((byte) 98);
            int var90 = class343.field4627.method93((byte) 107);
            if (var89 == 255) {
                var89 = -1;
            }
            if (var78 >= 0 && var79 >= 0 && (class32.field513 * 2) > var78 && (class32.field513 * 2) > var79 && var81 >= 0 && var82 >= 0 && var81 < (class611.field8786 * 2) && class611.field8786 * 2 > var82 && var84 != 65535) {
                int var91 = var85 << 0;
                int var92 = var81 * 64;
                int var93 = var78 * 64;
                int var94 = var82 * 64;
                int var95 = var86 << 0;
                int var96 = var90 << 0;
                int var97 = var79 * 64;
                class77 var98 = new class77(var84, class378.field5079, var93, var97, var91, class405.field5763 + var87, class405.field5763 + var88, var89, var96, var83, var95, var80);
                var98.method590(class405.field5763 + var87, var92, class183.method1144(107, var92, var94, class378.field5079) - var95, var94, 32355);
                class456.field6423.method463(new class391(var98), -121);
            }
        } else if (class206.field2903 == arg0) {
            int var99 = class343.field4627.method110((byte) 110);
            int var100 = (var99 >> 4 & 0xF) + client.field3471 * 2;
            int var101 = class25.field455 * 2 + (var99 & 0xF);
            boolean var102 = class343.field4627.method110((byte) 44) != 0;
            int var103 = var100 + class343.field4627.method67(65280);
            int var104 = class343.field4627.method67(65280) + var101;
            int var105 = class343.field4627.method111(-128);
            int var106 = class343.field4627.method111(-123);
            int var107 = class343.field4627.method93((byte) 116);
            byte var108 = class343.field4627.method67(65280);
            int var109 = class343.field4627.method110((byte) 47) * 4;
            int var110 = class343.field4627.method93((byte) 124);
            int var111 = class343.field4627.method93((byte) 97);
            int var112 = class343.field4627.method110((byte) 97);
            int var113 = class343.field4627.method93((byte) 95);
            if (var112 == 255) {
                var112 = -1;
            }
            if (var100 >= 0 && var101 >= 0 && var100 < (class32.field513 * 2) && var101 < (class32.field513 * 2) && var103 >= 0 && var104 >= 0 && class611.field8786 * 2 > var103 && (class611.field8786 * 2) > var104 && var107 != 65535) {
                int var114 = var108 << 0;
                int var115 = var104 * 64;
                int var116 = var103 * 64;
                int var117 = var101 * 64;
                int var118 = var113 << 0;
                int var119 = var109 << 0;
                int var120 = var100 * 64;
                if (var105 != 0) {
                    class33 var121 = null;
                    int var123;
                    if (var105 < 0) {
                        int var122 = -var105 - 1;
                        var123 = (var122 & 0x7F91) >> 11;
                        int var124 = var122 & 0x7FF;
                        if (class97.field1472 == var124) {
                            var121 = class645.field9372;
                        } else {
                            var121 = class349.field4696[var124];
                        }
                    } else {
                        int var125 = var105 - 1;
                        int var126 = var125 & 0x7FF;
                        var123 = (var125 & 0x7DF0) >> 11;
                        class576 var127 = (class576) class278.field3837.method1242(0, (long) var126);
                        if (var127 != null) {
                            var121 = var127.field7929;
                        }
                    }
                    if (var121 != null) {
                        class107 var128 = var121.method349(true);
                        if (var128.field1654 != null && var128.field1654[var123] != null) {
                            int var129 = var128.field1654[var123][0];
                            int var130 = var128.field1654[var123][2];
                            int var131 = var121.field579.method1166((byte) -98);
                            int var132 = class1.field2[var131];
                            int var133 = class1.field7[var131];
                            int var134 = var129 * var133 + var130 * var132 >> 15;
                            int var135 = var130 * var133 - (var129 * var132) >> 15;
                            var114 -= var128.field1654[var123][1];
                            var117 += var135;
                            var120 += var134;
                        }
                    }
                }
                class77 var137 = new class77(var107, class378.field5079, var120, var117, var114, class405.field5763 + var110, var111 - -class405.field5763, var112, var118, var106, var119, var102);
                var137.method590(class405.field5763 + var110, var116, class183.method1144(111, var116, var115, class378.field5079) - var119, var115, 32355);
                class456.field6423.method463(new class391(var137), -96);
            }
        } else if (class333.field4457 == arg0) {
            int var138 = class343.field4627.method110((byte) 39);
            int var139 = ((var138 & 0x7F) >> 4) + client.field3471;
            int var140 = (var138 & 0x7) + class25.field455;
            int var141 = class343.field4627.method93((byte) 82);
            int var142 = class343.field4627.method110((byte) 39);
            int var143 = class343.field4627.method93((byte) 78);
            int var144 = class343.field4627.method110((byte) 122);
            if (var139 >= 0 && var140 >= 0 && class32.field513 > var139 && var140 < class611.field8786) {
                int var145 = var139 * 128 + 64;
                int var146 = var140 * 128 + 64;
                int var147 = class378.field5079;
                if (var147 < 3 && class414.method2493(var140, false, var139)) {
                    var147++;
                }
                class51 var148 = new class51(var141, var143, class405.field5763, class378.field5079, var147, var145, class183.method1144(108, var145, var146, class378.field5079) - var142, var146, var139, var139, var140, var140, var144);
                class625.field9107.method463(new class304(var148), -113);
            }
        } else if (class278.field3849 == arg0) {
            int var149 = class343.field4627.method93((byte) 83);
            int var150 = class343.field4627.method78(-8388608);
            int var151 = (var150 & 0x7) + class25.field455;
            int var152 = class6.field80 + var151;
            int var153 = ((var150 & 0x7A) >> 4) + client.field3471;
            int var154 = class519.field7304 + var153;
            int var155 = class343.field4627.method98(25356);
            boolean var156 = var153 >= 0 && var151 >= 0 && class32.field513 > var153 && class611.field8786 > var151;
            if (var156 || class208.method1370((byte) 100, class489.field6847)) {
                class266.method1743(var154, var152, new class335(var155, var149), class378.field5079, -27677);
                if (var156) {
                    class344.method2081(class378.field5079, false, var153, var151);
                }
            }
        } else if (class302.field4122 == arg0) {
            int var157 = class343.field4627.method110((byte) 77);
            boolean var158 = (var157 & 0x80) != 0;
            int var159 = client.field3471 + (var157 >> 3 & 0x7);
            int var160 = (var157 & 0x7) + class25.field455;
            int var161 = var159 + class343.field4627.method67(65280);
            int var162 = var160 + class343.field4627.method67(65280);
            int var163 = class343.field4627.method111(-120);
            int var164 = class343.field4627.method93((byte) 83);
            int var165 = class343.field4627.method110((byte) 112) * 4;
            int var166 = class343.field4627.method110((byte) 115) * 4;
            int var167 = class343.field4627.method93((byte) 75);
            int var168 = class343.field4627.method93((byte) 90);
            int var169 = class343.field4627.method110((byte) 68);
            int var170 = class343.field4627.method93((byte) 120);
            if (var169 == 255) {
                var169 = -1;
            }
            if (var159 >= 0 && var160 >= 0 && var159 < class32.field513 && var160 < class611.field8786 && var161 >= 0 && var162 >= 0 && var161 < class32.field513 && var162 < class611.field8786 && var164 != 65535) {
                int var171 = var170 << 0;
                int var172 = var160 * 128 + 64;
                int var173 = var165 << 0;
                int var174 = var159 * 128 + 64;
                int var175 = var166 << 0;
                int var176 = var162 * 128 + 64;
                int var177 = var161 * 128 + 64;
                class77 var178 = new class77(var164, class378.field5079, var174, var172, var173, class405.field5763 + var167, var168 - -class405.field5763, var169, var171, var163, var175, var158);
                var178.method590(class405.field5763 + var167, var177, class183.method1144(84, var177, var176, class378.field5079) - var175, var176, 32355);
                class456.field6423.method463(new class391(var178), -127);
            }
        } else if (class205.field2879 == arg0) {
            int var179 = class343.field4627.method92(1);
            int var180 = class343.field4627.method110((byte) 32);
            int var181 = class25.field455 + (var180 & 0x7);
            int var182 = class6.field80 + var181;
            int var183 = ((var180 & 0x74) >> 4) + client.field3471;
            int var184 = class519.field7304 + var183;
            class93 var185 = (class93) class220.field3147.method1242(0, (long) (class378.field5079 << 28 | var182 << 14 | var184));
            if (var185 != null) {
                for (class335 var186 = (class335) var185.field1434.method456((byte) -111); var186 != null; var186 = (class335) var185.field1434.method460((byte) -86)) {
                    if ((var179 & 0x7FFF) == var186.field4461) {
                        var186.method1117(0);
                        break;
                    }
                }
                if (var185.field1434.method466((byte) 87)) {
                    var185.method1117(0);
                }
                if (var183 >= 0 && var181 >= 0 && var183 < class32.field513 && var181 < class611.field8786) {
                    class344.method2081(class378.field5079, arg1, var183, var181);
                }
            }
        } else {
            class235.method1474(null, "T3 - " + arg0, (byte) 115);
            class368.method2208(false, arg1);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public static void method1149(int arg0) {
        field2595 = null;
        field2590 = null;
        if (arg0 != -177) {
            field2595 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(FIIFI[BLar;FFIIFI)V")
    public static final void method1150(float arg0, int arg1, int arg2, float arg3, int arg4, byte[] arg5, class585 arg6, float arg7, float arg8, int arg9, int arg10, float arg11, int arg12) {
        field2596++;
        for (int var13 = 0; var13 < arg10; var13++) {
            class536.method3078(arg4, arg7, arg12, arg5, arg0, arg1, arg8, arg11, arg9, var13, arg10, arg3, (byte) 123, arg6);
            arg4 += arg9 * arg12;
        }
        if (arg2 != -14941) {
            method1149(-57);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIILbe;ILbe;III)V")
    public static final void method1151(int arg0, int arg1, int arg2, int arg3, class33 arg4, int arg5, class33 arg6, int arg7, int arg8, int arg9) {
        field2589++;
        int var10 = arg6.method336(-2102190848);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class52 var12 = (class52) class213.field3020.method3252((long) var10, (byte) 117);
        if (var12 == null) {
            class38[] var13 = class38.method397(class645.field9371, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class69.field1165.method1332(var13[0], true);
            class213.field3020.method3243(var12, (long) var10, 62);
        }
        class375.method2220(arg3, arg1, arg4.field6037, arg8 + 22974, arg2 >> 1, arg4.method337(0) * 64, arg4.field6029, arg4.field6035, arg7 >> 1, 0);
        int var14 = arg5 + class328.field4394[0] - 18;
        if (arg8 != 2) {
            field2595 = null;
        }
        int var15 = class328.field4394[1] + arg0 - 16 - 54;
        int var16 = arg9 / 4 * 18 + var14;
        int var17 = arg9 % 4 * 18 + var15;
        var12.method497(var16, var17);
        if (arg4 == arg6) {
            class69.field1165.method1291(-256, 18, 18, var16 - 1, var17 + -1, 0);
        }
        class374 var18 = class294.method1885(0);
        var18.field5030 = var17 + 16;
        var18.field5036 = var16 + 16;
        var18.field5031 = var17;
        var18.field5037 = arg6;
        var18.field5034 = var16;
        class526.field7389.method3145(var18, Integer.MAX_VALUE);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Ltb;")
    public static final class337 method1152(int arg0, int arg1) {
        field2594++;
        class337 var2 = (class337) class517.field7255.method3252((long) arg1, (byte) -93);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class478.field6750.method240(0, arg1, (byte) -124);
        if (arg0 >= -6) {
            method1149(23);
        }
        class337 var4 = new class337();
        if (var3 != null) {
            var4.method2046(false, new class11(var3));
        }
        var4.method2045((byte) -121);
        class517.field7255.method3243(var4, (long) arg1, -65);
        return var4;
    }
}
