import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class209 {

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "[I")
    public static int[] field3356 = new int[2500];

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "[I")
    public static int[] field3353 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "J")
    public static long field3360 = 0L;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Lfa;")
    public static class273 field3354;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Lfa;")
    public static class273 field3358;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "[[I")
    public static int[][] field3357;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIII)V")
    public static final void method1482(int arg0, int arg1, int arg2, int arg3) {
        field3352++;
        String var4 = "::tele " + arg1 + "," + (arg0 >> 6) + "," + (arg3 >> 6) + "," + (arg2 & arg0) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        class311.method2113(105, var4);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static final void method1483(int arg0) {
        class249.field3960.method144(arg0);
        field3363++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIII[Lkk;IIIII)V")
    public static final void method1484(int arg0, int arg1, int arg2, int arg3, class254[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3359++;
        class62.method391(arg3, arg9, arg6, arg0);
        class172.method1139();
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class254 var12 = arg4[var10];
            if (var12 != null && (var12.field4167 == arg7 || arg7 == -1412584499 && class138.field2135 == var12)) {
                int var13;
                if (arg2 == -1) {
                    class310.field5013[class249.field3967] = var12.field4197 + arg8;
                    class73.field1059[class249.field3967] = var12.field4200 + arg1;
                    class260.field4266[class249.field3967] = var12.field4085;
                    class150.field2341[class249.field3967] = var12.field4152;
                    var13 = class249.field3967++;
                } else {
                    var13 = arg2;
                }
                var12.field4072 = var13;
                var12.field4091 = class4.field32;
                if (!var12.field4181 || !client.method1096(var12)) {
                    if (var12.field4060 > 0) {
                        class36.method221(var12, true);
                    }
                    int var14 = var12.field4200 + arg1;
                    int var15 = var12.field4025;
                    int var16 = var12.field4197 + arg8;
                    if (class266.field4381 && (client.method1085(var12).field3765 != 0 || var12.field4052 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class138.field2135 == var12) {
                        if (arg7 != -1412584499 && !var12.field4164) {
                            class107.field1653 = arg4;
                            class156.field2475 = arg8;
                            class227.field3593 = arg1;
                            continue;
                        }
                        if (class246.field3927 && class115.field1744) {
                            int var17 = class1.field1;
                            int var18 = var17 - class82.field1304;
                            if (var18 < class68.field992) {
                                var18 = class68.field992;
                            }
                            if ((class68.field992 + class197.field3130.field4085) < (var12.field4085 + var18)) {
                                var18 = class197.field3130.field4085 + class68.field992 - var12.field4085;
                            }
                            int var19 = class60.field924;
                            int var20 = var19 - class52.field702;
                            if (var20 < class199.field3164) {
                                var20 = class199.field3164;
                            }
                            if ((class199.field3164 + class197.field3130.field4152) < (var20 + var12.field4152)) {
                                var20 = class199.field3164 + class197.field3130.field4152 - var12.field4152;
                            }
                            var16 = var18;
                            var14 = var20;
                        }
                        if (!var12.field4164) {
                            var15 = 128;
                        }
                    }
                    int var21;
                    int var22;
                    int var25;
                    int var26;
                    if (var12.field4052 == 2) {
                        var26 = arg6;
                        var22 = arg3;
                        var25 = arg0;
                        var21 = arg9;
                    } else {
                        var21 = arg9 >= var14 ? arg9 : var14;
                        var22 = var16 <= arg3 ? arg3 : var16;
                        int var23 = var12.field4152 + var14;
                        int var24 = var12.field4085 + var16;
                        if (var12.field4052 == 9) {
                            var23++;
                            var24++;
                        }
                        var25 = var23 < arg0 ? var23 : arg0;
                        var26 = var24 >= arg6 ? arg6 : var24;
                    }
                    if (!var12.field4181 || var26 > var22 && var25 > var21) {
                        if (var12.field4060 != 0) {
                            if (var12.field4060 == 1337 || var12.field4060 == 1403) {
                                class22.field296 = var12;
                                class256.field4228 = var14;
                                class128.field1971 = var16;
                                class98.method635(var14, var12.field4085, var12.field4060 == 1403, (byte) -32, var12.field4152, var16);
                                class283.field4731[var13] = true;
                                class62.method391(arg3, arg9, arg6, arg0);
                                continue;
                            }
                            if (var12.field4060 == 1338) {
                                if (!var12.method1757(-1)) {
                                    continue;
                                }
                                class69.method434(var13, var14, 10, var16, var12);
                                class62.method391(arg3, arg9, arg6, arg0);
                                if (class76.field1196 != 0 && class76.field1196 != 3 || class220.field3525 || var22 > class265.field4367 || class262.field4331 < var21 || var26 <= class265.field4367 || var25 <= class262.field4331) {
                                    continue;
                                }
                                int var27 = class265.field4367 - var16;
                                int var28 = class262.field4331 - var14;
                                int var29 = var12.field4193[var28];
                                if (var27 < var29 || var27 > (var12.field4092[var28] + var29)) {
                                    continue;
                                }
                                int var30 = var28 - var12.field4152 / 2;
                                int var31 = var27 - var12.field4085 / 2;
                                int var32;
                                if (class92.field1402 == 4) {
                                    var32 = (int) class202.field3253 & 0x7FF;
                                } else {
                                    var32 = (int) class202.field3253 + class262.field4330 & 0x7FF;
                                }
                                int var33 = class172.field2669[var32];
                                int var34 = class172.field2658[var32];
                                if (class92.field1402 != 4) {
                                    var34 = (class265.field4365 + 256) * var34 >> 8;
                                    var33 = (class265.field4365 + 256) * var33 >> 8;
                                }
                                int var35 = var30 * var34 - (var31 * var33) >> 11;
                                int var36 = var30 * var33 + var31 * var34 >> 11;
                                int var37;
                                int var38;
                                if (class92.field1402 == 4) {
                                    var38 = class49.field677 - var35 >> 7;
                                    var37 = class274.field4531 + var36 >> 7;
                                } else {
                                    var37 = class309.field5006.field836 + var36 + 64 - (class309.field5006.method362(25892) * 64) >> 7;
                                    var38 = class309.field5006.field850 - var35 - ((class309.field5006.method362(25892) + -1) * 64) >> 7;
                                }
                                if (class70.field1017 && (client.field2581 & 0x40) != 0) {
                                    class254 var39 = class79.method529(class84.field1334, 56, class268.field4398);
                                    if (var39 == null) {
                                        class173.method1151((byte) 33);
                                    } else {
                                        class192.method1333(var38, class70.field1019, 1L, " ->", (short) 26, var37, class44.field611, 9910);
                                    }
                                    continue;
                                }
                                if (class121.field1857 == 1) {
                                    class192.method1333(var38, class20.field271, 1L, "", (short) 15, var37, -1, 9910);
                                }
                                class192.method1333(var38, class276.field4578, 1L, "", (short) 44, var37, -1, 9910);
                                continue;
                            }
                            if (var12.field4060 == 1339) {
                                if (var12.method1757(-1)) {
                                    class14.method94(var14, var13, 2013, var16, var12);
                                    class62.method391(arg3, arg9, arg6, arg0);
                                }
                                continue;
                            }
                            if (var12.field4060 == 1400) {
                                class276.method1921(119, var12.field4085, var16, var14, var12.field4152);
                                class283.field4731[var13] = true;
                                class241.field3799[var13] = true;
                                class62.method391(arg3, arg9, arg6, arg0);
                                continue;
                            }
                            if (var12.field4060 == 1401) {
                                class79.method528(var12.field4152, var14, 1, var12.field4085, var16);
                                class283.field4731[var13] = true;
                                class241.field3799[var13] = true;
                                class62.method391(arg3, arg9, arg6, arg0);
                                continue;
                            }
                            if (var12.field4060 == 1402) {
                                class113.method720(var16, var14, 94);
                                class283.field4731[var13] = true;
                                class241.field3799[var13] = true;
                                continue;
                            }
                            if (var12.field4060 == 1405) {
                                if (!class260.field4264) {
                                    continue;
                                }
                                int var40 = var14 + 15;
                                int var41 = var12.field4085 + var16;
                                int var42 = 16776960;
                                class48.field667.method728("Fps:" + class202.field3216, var41, var40, 16776960, -1);
                                int var43 = 0;
                                int var130 = var40 + 15;
                                Runtime var44 = Runtime.getRuntime();
                                int var45 = 0;
                                int var46 = (int) ((var44.totalMemory() - var44.freeMemory()) / 1024L);
                                if (var46 > 65536) {
                                    var42 = 16711680;
                                }
                                class48.field667.method728("Mem:" + var46 + "k", var41, var130, var42, -1);
                                int var47 = 0;
                                int var48 = 16776960;
                                for (int var49 = 0; var49 < 29; var49++) {
                                    var43 += class163.field2559[var49].method1537(-128);
                                    var47 += class163.field2559[var49].method1540((byte) 104);
                                    var45 += class163.field2559[var49].method1541(-122);
                                }
                                var40 = var130 + 15;
                                int var50 = var47 * 10000 / var43;
                                int var51 = var45 * 100 / var43;
                                String var52 = "Cache:" + class174.method1168(0, 2, (long) var50, -1, true) + "% (" + var51 + "%)";
                                class249.field3970.method728(var52, var41, var40, var48, -1);
                                var40 += 12;
                                if (class77.field1210 > 0) {
                                    class249.field3970.method728("Particles: " + class77.field1200 + " / " + class77.field1210, var41, var40, var48, -1);
                                }
                                var40 += 12;
                                class283.field4731[var13] = true;
                                class241.field3799[var13] = true;
                                continue;
                            }
                            if (var12.field4060 == 1406) {
                                class198.field3144 = var16;
                                class72.field1039 = var14;
                                class117.field1772 = var12;
                                continue;
                            }
                        }
                        if (!class220.field3525) {
                            if (var12.field4052 == 0 && var12.field4078 && var22 <= class265.field4367 && class262.field4331 >= var21 && class265.field4367 < var26 && var25 > class262.field4331 && !class266.field4381) {
                                class178.field2773[0] = class84.field1332;
                                class214.field3420[0] = class276.field4574;
                                class70.field1016[0] = 1005;
                                class156.field2472[0] = "";
                                class18.field251 = 1;
                            }
                            if (class265.field4367 >= var22 && class262.field4331 >= var21 && class265.field4367 < var26 && class262.field4331 < var25) {
                                class110.method710(class265.field4367 - var16, var12, 19462, class262.field4331 - var14);
                            }
                        }
                        if (var12.field4052 == 0) {
                            if (!var12.field4181 && client.method1096(var12) && class217.field3458 != var12) {
                                continue;
                            }
                            if (!var12.field4181) {
                                if (var12.field4125 > var12.field4081 - var12.field4152) {
                                    var12.field4125 = var12.field4081 - var12.field4152;
                                }
                                if (var12.field4125 < 0) {
                                    var12.field4125 = 0;
                                }
                            }
                            method1484(var25, var14 - var12.field4125, var13, var22, arg4, 65, var26, var12.field4077, var16 - var12.field4175, var21);
                            if (var12.field4123 != null) {
                                method1484(var25, var14 - var12.field4125, var13, var22, var12.field4123, 32, var26, var12.field4077, var16 - var12.field4175, var21);
                            }
                            class229 var53 = (class229) class258.field4241.method872((byte) -117, (long) var12.field4077);
                            if (var53 != null) {
                                if (var53.field3654 == 0 && !class220.field3525 && class265.field4367 >= var22 && var21 <= class262.field4331 && class265.field4367 < var26 && var25 > class262.field4331 && !class266.field4381) {
                                    class18.field251 = 1;
                                    class70.field1016[0] = 1005;
                                    class214.field3420[0] = class276.field4574;
                                    class178.field2773[0] = class84.field1332;
                                    class156.field2472[0] = "";
                                }
                                class237.method1643(var21, var16, var22, var13, var53.field3658, var25, var26, -70, var14);
                            }
                            class62.method391(arg3, arg9, arg6, arg0);
                            class172.method1139();
                        }
                        if (class169.field2640[var13] || class37.field482 > 1) {
                            if (var12.field4052 == 0 && !var12.field4181 && var12.field4081 > var12.field4152) {
                                class43.method276(var12.field4085 + var16, true, var12.field4152, var12.field4081, var14, var12.field4125);
                            }
                            if (var12.field4052 != 1) {
                                if (var12.field4052 == 2) {
                                    int var54 = 0;
                                    for (int var55 = 0; var55 < var12.field4106; var55++) {
                                        for (int var56 = 0; var56 < var12.field4105; var56++) {
                                            int var57 = (var12.field4109 + 32) * var55 + var14;
                                            int var58 = var16 + ((var12.field4147 + 32) * var56);
                                            if (var54 < 20) {
                                                var58 += var12.field4196[var54];
                                                var57 += var12.field4133[var54];
                                            }
                                            if (var12.field4068[var54] > 0) {
                                                boolean var59 = false;
                                                boolean var60 = false;
                                                int var61 = var12.field4068[var54] - 1;
                                                if (arg3 < (var58 + 32) && var58 < arg6 && arg9 < var57 + 32 && arg0 > var57 || class156.field2470 == var12 && class135.field2112 == var54) {
                                                    class294 var62;
                                                    if (class29.field367 == 1 && class141.field2166 == var54 && class50.field685 == var12.field4077) {
                                                        var62 = class283.method1997(2, 118, var61, var12.field4148, var12.field4021[var54], 0, (class157) null);
                                                    } else {
                                                        var62 = class283.method1997(1, -86, var61, var12.field4148, var12.field4021[var54], 3153952, (class157) null);
                                                    }
                                                    if (class172.field2653) {
                                                        class283.field4731[var13] = true;
                                                    }
                                                    if (var62 == null) {
                                                        class58.method354(true, var12);
                                                    } else if (class156.field2470 == var12 && class135.field2112 == var54) {
                                                        int var63 = class60.field924 - class146.field2305;
                                                        int var64 = class1.field1 - class36.field471;
                                                        if (var64 < 5 && var64 > -5) {
                                                            var64 = 0;
                                                        }
                                                        if (var63 < 5 && var63 > -5) {
                                                            var63 = 0;
                                                        }
                                                        if (class162.field2546 < 5) {
                                                            var63 = 0;
                                                            var64 = 0;
                                                        }
                                                        var62.method253(var58 + var64, var57 + var63, 128);
                                                        if (arg7 != -1) {
                                                            class254 var65 = arg4[arg7 & 0xFFFF];
                                                            int var66 = class62.field935;
                                                            int var67 = class62.field930;
                                                            if (var67 > (var57 + var63) && var65.field4125 > 0) {
                                                                int var68 = (var67 - var57 - var63) * class247.field3938 / 3;
                                                                if (var68 > class247.field3938 * 10) {
                                                                    var68 = class247.field3938 * 10;
                                                                }
                                                                if (var68 > var65.field4125) {
                                                                    var68 = var65.field4125;
                                                                }
                                                                var65.field4125 -= var68;
                                                                class146.field2305 += var68;
                                                                class58.method354(true, var65);
                                                            }
                                                            if ((var63 + var57 + 32) > var66 && (var65.field4081 - var65.field4152) > var65.field4125) {
                                                                int var69 = (var57 + var63 + 32 - var66) * class247.field3938 / 3;
                                                                if (class247.field3938 * 10 < var69) {
                                                                    var69 = class247.field3938 * 10;
                                                                }
                                                                if (var65.field4081 - var65.field4125 - var65.field4152 < var69) {
                                                                    var69 = var65.field4081 - var65.field4152 - var65.field4125;
                                                                }
                                                                var65.field4125 += var69;
                                                                class146.field2305 -= var69;
                                                                class58.method354(true, var65);
                                                            }
                                                        }
                                                    } else if (class74.field1175 == var12 && class146.field2302 == var54) {
                                                        var62.method253(var58, var57, 128);
                                                    } else {
                                                        var62.method252(var58, var57);
                                                    }
                                                }
                                            } else if (var12.field4187 != null && var54 < 20) {
                                                class294 var70 = var12.method1753(var54, (byte) 1);
                                                if (var70 != null) {
                                                    var70.method252(var58, var57);
                                                } else if (class137.field2120) {
                                                    class58.method354(true, var12);
                                                }
                                            }
                                            var54++;
                                        }
                                    }
                                } else if (var12.field4052 == 3) {
                                    int var71;
                                    if (class14.method96(2, var12)) {
                                        var71 = var12.field4168;
                                        if (class217.field3458 == var12 && var12.field4046 != 0) {
                                            var71 = var12.field4046;
                                        }
                                    } else {
                                        var71 = var12.field4075;
                                        if (class217.field3458 == var12 && var12.field4126 != 0) {
                                            var71 = var12.field4126;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var12.field4150) {
                                            class62.method380(var16, var14, var12.field4085, var12.field4152, var71);
                                        } else {
                                            class62.method389(var16, var14, var12.field4085, var12.field4152, var71);
                                        }
                                    } else if (var12.field4150) {
                                        class62.method395(var16, var14, var12.field4085, var12.field4152, var71, 256 - (var15 & 0xFF));
                                    } else {
                                        class62.method388(var16, var14, var12.field4085, var12.field4152, var71, 256 - (var15 & 0xFF));
                                    }
                                } else if (var12.field4052 == 4) {
                                    class116 var72 = var12.method1752((byte) -87, class126.field1958);
                                    if (var72 != null) {
                                        String var73 = var12.field4113;
                                        int var74;
                                        if (class14.method96(2, var12)) {
                                            var74 = var12.field4168;
                                            if (class217.field3458 == var12 && var12.field4046 != 0) {
                                                var74 = var12.field4046;
                                            }
                                            if (var12.field4114.length() > 0) {
                                                var73 = var12.field4114;
                                            }
                                        } else {
                                            var74 = var12.field4075;
                                            if (class217.field3458 == var12 && var12.field4126 != 0) {
                                                var74 = var12.field4126;
                                            }
                                        }
                                        if (var12.field4181 && var12.field4174 != -1) {
                                            class132 var75 = class14.method92(var12.field4174, false);
                                            var73 = var75.field2071;
                                            if (var73 == null) {
                                                var73 = "null";
                                            }
                                            if ((var75.field2050 == 1 || var12.field4183 != 1) && var12.field4183 != -1) {
                                                var73 = "<col=ff9040>" + var73 + "</col> x" + class125.method828(1, var12.field4183);
                                            }
                                        }
                                        if (class296.field4862 == var12) {
                                            var74 = var12.field4075;
                                            var73 = class197.field3128;
                                        }
                                        if (!var12.field4181) {
                                            var73 = class164.method1103(var12, 3818, var73);
                                        }
                                        var72.method727(var73, var16, var14, var12.field4085, var12.field4152, var74, var12.field4189 ? 0 : -1, var12.field4170, var12.field4094, var12.field4159);
                                    } else if (class137.field2120) {
                                        class58.method354(true, var12);
                                    }
                                } else if (var12.field4052 == 5) {
                                    if (!var12.field4181) {
                                        class294 var85 = var12.method1763(74, class14.method96(2, var12));
                                        if (var85 != null) {
                                            var85.method252(var16, var14);
                                        } else if (class137.field2120) {
                                            class58.method354(true, var12);
                                        }
                                    } else if (var12.field4128 >= 0) {
                                        class205 var84 = var12.method1761(-2);
                                        var84.method1466(0, var16, var14, var12.field4085, var12.field4152, var12.field4120, var12.field4066, 0);
                                    } else {
                                        class294 var76;
                                        if (var12.field4174 == -1) {
                                            var76 = var12.method1763(105, false);
                                        } else if (var12.field4119 && class309.field5006.field3319 != null) {
                                            var76 = class283.method1997(var12.field4059, -82, var12.field4174, var12.field4148, var12.field4183, var12.field4135, class309.field5006.field3319);
                                        } else {
                                            var76 = class283.method1997(var12.field4059, 93, var12.field4174, var12.field4148, var12.field4183, var12.field4135, (class157) null);
                                        }
                                        if (var76 != null) {
                                            int var77 = var76.field4827;
                                            int var78 = var76.field4831;
                                            if (var12.field4169) {
                                                int var80 = (var77 + var12.field4085 - 1) / var77;
                                                int var81 = (var78 - (1 - var12.field4152)) / var78;
                                                class62.method397(var16, var14, var12.field4085 + var16, var14 - -var12.field4152);
                                                for (int var82 = 0; var82 < var80; var82++) {
                                                    for (int var83 = 0; var83 < var81; var83++) {
                                                        if (var12.field4190 != 0) {
                                                            var76.method2050(var78 / 2 + var78 * var83 + var14, -102, 4096, var12.field4190, var77 / 2 + var77 * var82 + var16);
                                                        } else if (var15 == 0) {
                                                            var76.method252(var77 * var82 + var16, var78 * var83 + var14);
                                                        } else {
                                                            var76.method253(var16 + (var77 * var82), var14 - -(var78 * var83), 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class62.method391(arg3, arg9, arg6, arg0);
                                            } else {
                                                int var79 = var12.field4085 * 4096 / var77;
                                                if (var12.field4190 != 0) {
                                                    var76.method2050(var12.field4152 / 2 + var14, -58, var79, var12.field4190, var12.field4085 / 2 + var16);
                                                } else if (var15 != 0) {
                                                    var76.method257(var16, var14, var12.field4085, var12.field4152, 256 - (var15 & 0xFF));
                                                } else if (var12.field4085 == var77 && var12.field4152 == var78) {
                                                    var76.method252(var16, var14);
                                                } else {
                                                    var76.method241(var16, var14, var12.field4085, var12.field4152);
                                                }
                                            }
                                        } else if (class137.field2120) {
                                            class58.method354(true, var12);
                                        }
                                    }
                                } else if (var12.field4052 == 6) {
                                    boolean var86 = class14.method96(2, var12);
                                    class293 var87 = null;
                                    int var88;
                                    if (var86) {
                                        var88 = var12.field4132;
                                    } else {
                                        var88 = var12.field4121;
                                    }
                                    int var89 = 0;
                                    if (var12.field4174 != -1) {
                                        class132 var94 = class14.method92(var12.field4174, false);
                                        if (var94 != null) {
                                            class132 var95 = var94.method882(-8, var12.field4183);
                                            class200 var96 = var88 == -1 ? null : class196.method1359(var88, (byte) 21);
                                            if (var12.field4119 && class309.field5006.field3319 != null) {
                                                var87 = var95.method895(var12.field4117, var12.field4165, class309.field5006.field3319, 1, (byte) -62, var12.field4033, var96);
                                            } else {
                                                var87 = var95.method895(var12.field4117, var12.field4165, (class157) null, 1, (byte) -61, var12.field4033, var96);
                                            }
                                            if (var87 == null) {
                                                class58.method354(true, var12);
                                            } else {
                                                var89 = -var87.method206() / 2;
                                            }
                                        }
                                    } else if (var12.field4054 == 5) {
                                        if (var12.field4073 == -1) {
                                            var87 = class119.field1828.method1043((class219[]) null, false, (class200) null, true, -12890, -1, 0, 0, -1, -1, -1, (class200) null);
                                        } else {
                                            int var91 = var12.field4073;
                                            class208 var92;
                                            if (class31.field396 == var91) {
                                                var92 = class309.field5006;
                                            } else {
                                                var92 = class300.field4925[var91];
                                            }
                                            class200 var93 = var88 == -1 ? null : class196.method1359(var88, (byte) 21);
                                            if (var92 != null && (var91 == 2047 || class171.method1127(var92.field3329, 62) == var12.field4064)) {
                                                var87 = var92.field3319.method1043((class219[]) null, false, (class200) null, true, -12890, -1, 0, 0, var12.field4033, -1, 0, var93);
                                            }
                                        }
                                    } else if (var88 == -1) {
                                        var87 = var12.method1755(0, (class200) null, var86, -122, -1, -1, class309.field5006.field3319);
                                        if (var87 == null && class137.field2120) {
                                            class58.method354(true, var12);
                                        }
                                    } else {
                                        class200 var90 = class196.method1359(var88, (byte) 21);
                                        var87 = var12.method1755(var12.field4165, var90, var86, -115, var12.field4117, var12.field4033, class309.field5006.field3319);
                                        if (var87 == null && class137.field2120) {
                                            class58.method354(true, var12);
                                        }
                                    }
                                    if (var87 != null) {
                                        int var97;
                                        if (var12.field4122 <= 0) {
                                            var97 = 256;
                                        } else {
                                            var97 = (var12.field4085 << 8) / var12.field4122;
                                        }
                                        int var98;
                                        if (var12.field4048 > 0) {
                                            var98 = (var12.field4152 << 8) / var12.field4048;
                                        } else {
                                            var98 = 256;
                                        }
                                        int var99 = (var12.field4166 * var97 >> 8) + (var16 + (var12.field4085 / 2));
                                        int var100 = var12.field4152 / 2 + (var12.field4031 * var98 >> 8) + var14;
                                        class172.method1138(var99, var100);
                                        int var101 = class172.field2669[var12.field4139] * var12.field4093 >> 16;
                                        int var102 = class172.field2658[var12.field4139] * var12.field4093 >> 16;
                                        if (!var12.field4181) {
                                            var87.method1314(0, var12.field4154, 0, var12.field4139, 0, var101, var102, -1L);
                                        } else if (var12.field4100) {
                                            ((class191) var87).method1321(0, var12.field4154, var12.field4191, var12.field4139, var12.field4047, var12.field4080 + var101 + var89, var12.field4080 + var102, var12.field4093);
                                        } else {
                                            var87.method1314(0, var12.field4154, var12.field4191, var12.field4139, var12.field4047, var101 - (-var89 - var12.field4080), var12.field4080 + var102, -1L);
                                        }
                                        class172.method1148();
                                    }
                                } else {
                                    if (var12.field4052 == 7) {
                                        class116 var103 = var12.method1752((byte) -51, class126.field1958);
                                        if (var103 == null) {
                                            if (class137.field2120) {
                                                class58.method354(true, var12);
                                            }
                                            continue;
                                        }
                                        int var104 = 0;
                                        for (int var105 = 0; var105 < var12.field4106; var105++) {
                                            for (int var106 = 0; var106 < var12.field4105; var106++) {
                                                if (var12.field4068[var104] > 0) {
                                                    class132 var107 = class14.method92(var12.field4068[var104] - 1, false);
                                                    String var108;
                                                    if (var107.field2050 != 1 && var12.field4021[var104] == 1) {
                                                        var108 = "<col=ff9040>" + var107.field2071 + "</col>";
                                                    } else {
                                                        var108 = "<col=ff9040>" + var107.field2071 + "</col> x" + class125.method828(1, var12.field4021[var104]);
                                                    }
                                                    int var109 = (var12.field4109 + 12) * var105 + var14;
                                                    int var110 = var16 + ((var12.field4147 + 115) * var106);
                                                    if (var12.field4170 == 0) {
                                                        var103.method744(var108, var110, var109, var12.field4075, var12.field4189 ? 0 : -1);
                                                    } else if (var12.field4170 == 1) {
                                                        var103.method730(var108, var110 + 57, var109, var12.field4075, var12.field4189 ? 0 : -1);
                                                    } else {
                                                        var103.method728(var108, var110 + 115 - 1, var109, var12.field4075, var12.field4189 ? 0 : -1);
                                                    }
                                                }
                                                var104++;
                                            }
                                        }
                                    }
                                    if (var12.field4052 == 8 && class156.field2471 == var12 && class283.field4733 == class230.field3664) {
                                        int var111 = 0;
                                        int var112 = 0;
                                        class116 var113 = class48.field667;
                                        String var114 = var12.field4113;
                                        String var115 = class164.method1103(var12, 3818, var114);
                                        while (var115.length() > 0) {
                                            int var123 = var115.indexOf("<br>");
                                            String var124;
                                            if (var123 == -1) {
                                                var124 = var115;
                                                var115 = "";
                                            } else {
                                                var124 = var115.substring(0, var123);
                                                var115 = var115.substring(var123 + 4);
                                            }
                                            int var125 = var113.method736(var124);
                                            if (var125 > var111) {
                                                var111 = var125;
                                            }
                                            var112 += var113.field1749 + 1;
                                        }
                                        var112 += 7;
                                        var111 += 6;
                                        int var116 = var16 - var111 - (-var12.field4085 + 5);
                                        if ((var16 + 5) > var116) {
                                            var116 = var16 + 5;
                                        }
                                        if (arg6 < (var111 + var116)) {
                                            var116 = arg6 - var111;
                                        }
                                        int var117 = var14 + var12.field4152 + 5;
                                        if (var112 + var117 > arg0) {
                                            var117 = arg0 - var112;
                                        }
                                        class62.method380(var116, var117, var111, var112, 16777120);
                                        class62.method389(var116, var117, var111, var112, 0);
                                        String var118 = var12.field4113;
                                        int var119 = var117 + var113.field1749 + 2;
                                        String var120 = class164.method1103(var12, 3818, var118);
                                        while (var120.length() > 0) {
                                            int var121 = var120.indexOf("<br>");
                                            String var122;
                                            if (var121 == -1) {
                                                var122 = var120;
                                                var120 = "";
                                            } else {
                                                var122 = var120.substring(0, var121);
                                                var120 = var120.substring(var121 + 4);
                                            }
                                            var113.method744(var122, var116 + 3, var119, 0, -1);
                                            var119 += var113.field1749 + 1;
                                        }
                                    }
                                    if (var12.field4052 == 9) {
                                        int var126;
                                        int var127;
                                        int var128;
                                        int var129;
                                        if (var12.field4142) {
                                            var126 = var16;
                                            var127 = var12.field4152 + var14;
                                            var128 = var14;
                                            var129 = var12.field4085 + var16;
                                        } else {
                                            var127 = var14;
                                            var129 = var12.field4085 + var16;
                                            var128 = var12.field4152 + var14;
                                            var126 = var16;
                                        }
                                        if (var12.field4101 == 1) {
                                            class62.method394(var126, var127, var129, var128, var12.field4075);
                                        } else {
                                            class62.method384(var126, var127, var129, var128, var12.field4075, var12.field4101);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int var11 = -44 / ((arg5 + 69) / 53);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public static void method1485(int arg0) {
        field3354 = null;
        field3356 = null;
        if (arg0 == 26) {
            field3358 = null;
            field3353 = null;
            field3357 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
    public static final void method1486(int arg0, int arg1) {
        class100.field1502.method147(arg0, (byte) -127);
        field3361++;
        if (arg1 != 63) {
            field3358 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIII)V")
    public static final void method1487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 90 % ((arg3 + 58) / 60);
        if (arg5 <= class75.field1180 && class63.field941 <= arg0) {
            boolean var7;
            if (class53.field711 > arg2) {
                arg2 = class53.field711;
                var7 = false;
            } else if (class87.field1356 < arg2) {
                arg2 = class87.field1356;
                var7 = false;
            } else {
                var7 = true;
            }
            boolean var8;
            if (arg1 < class53.field711) {
                var8 = false;
                arg1 = class53.field711;
            } else if (class87.field1356 >= arg1) {
                var8 = true;
            } else {
                arg1 = class87.field1356;
                var8 = false;
            }
            if (arg5 < class63.field941) {
                arg5 = class63.field941;
            } else {
                class71.method451(arg4, true, arg1, arg2, class130.field2005[arg5++]);
            }
            if (class75.field1180 >= arg0) {
                class71.method451(arg4, true, arg1, arg2, class130.field2005[arg0--]);
            } else {
                arg0 = class75.field1180;
            }
            if (var7 && var8) {
                for (int var9 = arg5; var9 <= arg0; var9++) {
                    int[] var10 = class130.field2005[var9];
                    var10[arg2] = var10[arg1] = arg4;
                }
            } else if (var7) {
                for (int var11 = arg5; var11 <= arg0; var11++) {
                    class130.field2005[var11][arg2] = arg4;
                }
            } else if (var8) {
                for (int var12 = arg5; var12 <= arg0; var12++) {
                    class130.field2005[var12][arg1] = arg4;
                }
            }
        }
        field3355++;
    }
}
