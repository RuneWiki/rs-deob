import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class87 extends class45 {

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    private int field1522 = 0;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    private int field1525 = 20;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    private int field1521 = 0;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    private int field1533 = 1365;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "Lpi;")
    public static class342 field1523 = new class342("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "[[B")
    public static byte[][] field1520;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lbu;Lbu;Lbu;ZLbu;)V")
    public static final void method682(class17 arg0, class17 arg1, class17 arg2, boolean arg3, class17 arg4) {
        class480.field7145 = arg0;
        class390.field5913 = arg2;
        class28.field580 = arg4;
        class353.field5405 = arg1;
        ++field1531;
        if (arg3) {
            class22.field438 = new class350[class390.field5913.method138(false)][];
            class373.field5662 = new boolean[class390.field5913.method138(false)];
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lgr;I)V")
    public static final void method683(class296 arg0, int arg1) {
        ++field1524;
        if (class88.field1536 == arg0) {
            int var2 = class92.field1573.method1063((byte) -64);
            int var3 = (15 & var2 >> 4) + class145.field2318 * 2;
            int var4 = (15 & var2) + class212.field3038 * 2;
            boolean var5 = ~class92.field1573.method1063((byte) -120) != -1;
            int var6 = var3 - -class92.field1573.method1093(15);
            int var7 = var4 + class92.field1573.method1093(15);
            int var8 = class92.field1573.method1122(65280);
            int var9 = class92.field1573.method1122(65280);
            int var10 = class92.field1573.method1069((byte) -56);
            byte var11 = class92.field1573.method1093(15);
            int var12 = class92.field1573.method1063((byte) 113) * 4;
            int var13 = class92.field1573.method1069((byte) -8);
            int var14 = class92.field1573.method1069((byte) -17);
            int var15 = class92.field1573.method1063((byte) 115);
            int var16 = class92.field1573.method1063((byte) 107);
            if (var15 == 255) {
                var15 = -1;
            }
            if (~var3 <= -1 && var4 >= 0 && ~var3 > ~(class33.field662 * 2) && ~(class33.field662 * 2) < ~var4 && var6 >= 0 && var7 >= 0 && class121.field1966 * 2 > var6 && ~(class121.field1966 * 2) < ~var7 && ~var10 != -65536) {
                int var17 = var4 * 64;
                int var18 = var12 << 0;
                int var19 = var11 << 0;
                int var20 = var6 * 64;
                int var21 = var7 * 64;
                int var22 = var3 * 64;
                if (~var8 != -1) {
                    int var24;
                    class517 var26;
                    if (var8 >= 0) {
                        int var23 = var8 + -1;
                        var24 = var23 >> 11 & 15;
                        int var25 = 2047 & var23;
                        var26 = class34.field668[var25];
                    } else {
                        int var27 = -var8 + -1;
                        int var28 = 2047 & var27;
                        var24 = var27 >> 11 & 15;
                        if (~class148.field2368 == ~var28) {
                            var26 = class139.field2224;
                        } else {
                            var26 = class183.field2747[var28];
                        }
                    }
                    if (var26 != null) {
                        class435 var29 = var26.method3094(-65);
                        if (var29.field6486 != null && var29.field6486[var24] != null) {
                            int var30 = var29.field6486[var24][0];
                            int var31 = var29.field6486[var24][2];
                            int var32 = var26.field7676.method2114(arg1 + -1614053611);
                            int var33 = class528.field7783[var32];
                            int var34 = class528.field7786[var32];
                            int var35 = var30 * var34 + var31 * var33 >> 15;
                            int var36 = var31 * var34 + -(var30 * var33) >> 15;
                            var19 -= var29.field6486[var24][1];
                            var17 += var36;
                            var22 += var35;
                        }
                    }
                }
                class109 var38 = new class109(var10, class495.field7312, var22, var17, var19, class531.field7821 + var13, class531.field7821 + var14, var15, var16, var9, var18, var5);
                var38.method811(-var18 + class343.method2188(class495.field7312, var20, (byte) -102, var21), var21, (byte) -128, class531.field7821 + var13, var20);
                class149.field2372.method2417(-123, new class357(var38));
            }
        } else if (class483.field7196 == arg0) {
            byte var39 = class92.field1573.method1100(arg1 + -1614053510);
            byte var40 = class92.field1573.method1111((byte) -81);
            int var41 = class92.field1573.method1079(27);
            byte var42 = class92.field1573.method1111((byte) -105);
            int var43 = class92.field1573.method1120((byte) -122);
            int var44 = class145.field2318 - -(7 & var43 >> 4);
            int var45 = (7 & var43) + class212.field3038;
            byte var46 = class92.field1573.method1093(15);
            int var47 = class92.field1573.method1069((byte) -30);
            int var48 = class92.field1573.method1067((byte) -90);
            int var49 = class92.field1573.method1063((byte) -23);
            int var50 = var49 >> 2;
            int var51 = 3 & var49;
            int var52 = class92.field1573.method1116(arg1 ^ 1614053483);
            if (!class4.field109.method224()) {
                class282.method1800(var40, var39, var46, var51, var45, var44, var47, var50, var41, class495.field7312, var48, (byte) 101, var52, var42);
            }
        } else if (class56.field982 == arg0) {
            int var53 = class92.field1573.method1116(128);
            int var54 = class92.field1573.method1079(-126);
            int var55 = class92.field1573.method1063((byte) -102);
            int var56 = class145.field2318 - -(7 & var55 >> 4);
            int var57 = (var55 & 7) + class212.field3038;
            int var58 = class92.field1573.method1116(128);
            if (var56 >= 0 && ~var57 <= -1 && class33.field662 > var56 && class121.field1966 > var57 && ~class148.field2368 != ~var58) {
                class168.method1232(var57, (byte) 126, class495.field7312, var56, new class223(var53, var54));
                class369.method2312(var57, class495.field7312, var56, 1226839239);
            }
        } else if (arg1 == 1614053611) {
            if (class104.field1731 == arg0) {
                int var59 = class92.field1573.method1065((byte) 41);
                int var60 = ((120 & var59) >> 4) + class145.field2318;
                int var61 = (var59 & 7) + class212.field3038;
                int var62 = class92.field1573.method1120((byte) -70);
                int var63 = var62 >> 2;
                int var64 = 3 & var62;
                int var65 = class72.field1249[var63];
                if (class2.method20(7814, class412.field6157) || var60 >= 0 && var61 >= 0 && class33.field662 > var60 && class121.field1966 > var61) {
                    class223.method1478(var65, -1, -1, var63, var64, var60, false, 0, var61, class495.field7312);
                }
            } else if (class367.field5543 == arg0) {
                int var66 = class92.field1573.method1063((byte) 105);
                int var67 = class145.field2318 - -((var66 & 117) >> 4);
                int var68 = (7 & var66) + class212.field3038;
                int var69 = class92.field1573.method1069((byte) -42);
                int var70 = class92.field1573.method1069((byte) -49);
                int var71 = class92.field1573.method1069((byte) -78);
                if (class433.field6430 != null && var67 >= 0 && ~var68 <= -1 && ~var67 > ~class33.field662 && ~class121.field1966 < ~var68) {
                    class294 var72 = (class294) class433.field6430.method171((byte) 73, (long) (class495.field7312 << 28 | var68 << 14 | var67));
                    if (var72 != null) {
                        for (class223 var73 = (class223) var72.field4192.method2427(arg1 + -1614053495); var73 != null; var73 = (class223) var72.field4192.method2422(-83)) {
                            if (~(32767 & var69) == ~var73.field3191 && var73.field3192 == var70) {
                                var73.method2090(arg1 ^ -1614053612);
                                var73.field3192 = var71;
                                class168.method1232(var68, (byte) 126, class495.field7312, var67, var73);
                                break;
                            }
                        }
                        class369.method2312(var68, class495.field7312, var67, 1226839239);
                    }
                }
            } else if (class60.field1060 == arg0) {
                int var74 = class92.field1573.method1063((byte) 125);
                boolean var75 = ~(128 & var74) != -1;
                int var76 = (7 & var74 >> 3) + class145.field2318;
                int var77 = class212.field3038 - -(var74 & 7);
                int var78 = class92.field1573.method1093(15) + var76;
                int var79 = var77 - -class92.field1573.method1093(15);
                int var80 = class92.field1573.method1122(65280);
                int var81 = class92.field1573.method1069((byte) -126);
                int var82 = 4 * class92.field1573.method1063((byte) 127);
                int var83 = 4 * class92.field1573.method1063((byte) -35);
                int var84 = class92.field1573.method1069((byte) -93);
                int var85 = class92.field1573.method1069((byte) -67);
                int var86 = class92.field1573.method1063((byte) 114);
                if (~var86 == -256) {
                    var86 = -1;
                }
                int var87 = class92.field1573.method1063((byte) 125);
                if (var76 >= 0 && ~var77 <= -1 && ~var76 > ~class33.field662 && ~class121.field1966 < ~var77 && var78 >= 0 && var79 >= 0 && ~var78 > ~class33.field662 && ~var79 > ~class121.field1966 && ~var81 != -65536) {
                    int var88 = var77 * 128 + 64;
                    int var89 = var76 * 128 + 64;
                    int var90 = var82 << 0;
                    int var91 = var78 * 128 - -64;
                    int var92 = var83 << 0;
                    int var93 = var79 * 128 - -64;
                    class109 var94 = new class109(var81, class495.field7312, var89, var88, var90, var84 - -class531.field7821, class531.field7821 + var85, var86, var87, var80, var92, var75);
                    var94.method811(class343.method2188(class495.field7312, var91, (byte) -102, var93) - var92, var93, (byte) -125, class531.field7821 + var84, var91);
                    class149.field2372.method2417(arg1 ^ -1614053521, new class357(var94));
                }
            } else if (class282.field4034 == arg0) {
                int var95 = class92.field1573.method1063((byte) 105);
                int var96 = (var95 >> 4 & 15) + class145.field2318 * 2;
                int var97 = (var95 & 15) + class212.field3038 * 2;
                boolean var98 = ~class92.field1573.method1063((byte) 106) != -1;
                int var99 = var96 - -class92.field1573.method1093(15);
                int var100 = class92.field1573.method1093(15) + var97;
                int var101 = class92.field1573.method1122(65280);
                int var102 = class92.field1573.method1069((byte) -55);
                int var103 = 4 * class92.field1573.method1063((byte) 123);
                int var104 = class92.field1573.method1063((byte) 104) * 4;
                int var105 = class92.field1573.method1069((byte) -70);
                int var106 = class92.field1573.method1069((byte) -70);
                int var107 = class92.field1573.method1063((byte) -47);
                if (var107 == 255) {
                    var107 = -1;
                }
                int var108 = class92.field1573.method1063((byte) 109);
                if (var96 >= 0 && ~var97 <= -1 && ~var96 > ~(class33.field662 * 2) && var97 < class33.field662 * 2 && var99 >= 0 && var100 >= 0 && var99 < class121.field1966 * 2 && class121.field1966 * 2 > var100 && var102 != 65535) {
                    int var109 = var100 * 64;
                    int var110 = var103 << 0;
                    int var111 = var96 * 64;
                    int var112 = var97 * 64;
                    int var113 = var99 * 64;
                    int var114 = var104 << 0;
                    class109 var115 = new class109(var102, class495.field7312, var111, var112, var110, class531.field7821 + var105, class531.field7821 + var106, var107, var108, var101, var114, var98);
                    var115.method811(class343.method2188(class495.field7312, var113, (byte) -102, var109) + -var114, var109, (byte) -123, class531.field7821 + var105, var113);
                    class149.field2372.method2417(-126, new class357(var115));
                }
            } else if (class214.field3087 == arg0) {
                int var116 = class92.field1573.method1063((byte) 108);
                int var117 = (7 & var116 >> 4) + class145.field2318;
                int var118 = (7 & var116) + class212.field3038;
                int var119 = class92.field1573.method1074((byte) -58);
                int var120 = class92.field1573.method1079(arg1 + -1614053542);
                if (var117 >= 0 && ~var118 <= -1 && var117 < class33.field662 && ~var118 > ~class121.field1966) {
                    class168.method1232(var118, (byte) 127, class495.field7312, var117, new class223(var120, var119));
                    class369.method2312(var118, class495.field7312, var117, 1226839239);
                }
            } else if (class80.field1415 == arg0) {
                int var121 = class92.field1573.method1120((byte) -61);
                int var122 = (var121 >> 4 & 7) + class145.field2318;
                int var123 = class212.field3038 - -(var121 & 7);
                int var124 = class92.field1573.method1116(128);
                if (~var124 == -65536) {
                    var124 = -1;
                }
                int var125 = class92.field1573.method1063((byte) -85);
                int var126 = var125 >> 2;
                int var127 = var125 & 3;
                int var128 = class72.field1249[var126];
                class366.method2288(-10165, var122, class495.field7312, var128, var123, var124, var126, var127);
            } else if (class98.field1632 == arg0) {
                class92.field1573.method1063((byte) 126);
                int var129 = class92.field1573.method1063((byte) -85);
                int var130 = ((127 & var129) >> 4) + class145.field2318;
                int var131 = class212.field3038 - -(var129 & 7);
                int var132 = class92.field1573.method1069((byte) -90);
                int var133 = class92.field1573.method1063((byte) -93);
                int var134 = class92.field1573.method1085(111);
                String var135 = class92.field1573.method1101((byte) -123);
                class261.method1688(var135, var133, var131, var134, class495.field7312, var132, var130, (byte) 122);
            } else if (class357.field5435 == arg0) {
                int var136 = class92.field1573.method1063((byte) -108);
                int var137 = (var136 >> 4 & 7) + class145.field2318;
                int var138 = class212.field3038 - -(7 & var136);
                int var139 = class92.field1573.method1069((byte) -57);
                int var140 = class92.field1573.method1063((byte) 121);
                int var141 = class92.field1573.method1069((byte) -7);
                int var142 = class92.field1573.method1063((byte) -120);
                if (~var137 <= -1 && var138 >= 0 && ~var137 > ~class33.field662 && ~class121.field1966 < ~var138) {
                    int var143 = var137 * 128 + 64;
                    int var144 = var138 * 128 + 64;
                    int var145 = class495.field7312;
                    if (var145 < 3 && class389.method2400(var137, var138, arg1 ^ 1614053609)) {
                        ++var145;
                    }
                    class441 var146 = new class441(var139, var141, class531.field7821, class495.field7312, var145, var143, class343.method2188(class495.field7312, var143, (byte) -102, var144) + -var140, var144, var137, var137, var138, var138, var142);
                    class167.field2596.method2417(-124, new class236(var146));
                }
            } else if (class2.field73 == arg0) {
                int var147 = class92.field1573.method1065((byte) -121);
                int var148 = var147 >> 2;
                int var149 = 3 & var147;
                int var150 = class72.field1249[var148];
                int var151 = class92.field1573.method1118(-26);
                int var152 = class145.field2318 - -(7 & var151 >> 4);
                int var153 = class212.field3038 - -(7 & var151);
                int var154 = class92.field1573.method1074((byte) -104);
                if (class2.method20(7814, class412.field6157) || var152 >= 0 && ~var153 <= -1 && ~class33.field662 < ~var152 && ~class121.field1966 < ~var153) {
                    class223.method1478(var150, -1, var154, var148, var149, var152, false, 0, var153, class495.field7312);
                }
            } else if (class29.field614 != arg0) {
                if (class413.field6169 == arg0) {
                    int var161 = class92.field1573.method1063((byte) -126);
                    int var162 = (var161 >> 4 & 7) + class145.field2318;
                    int var163 = (7 & var161) + class212.field3038;
                    int var164 = class92.field1573.method1069((byte) -90);
                    if (~var164 == -65536) {
                        var164 = -1;
                    }
                    int var165 = class92.field1573.method1063((byte) 116);
                    int var166 = var165 >> 4 & 15;
                    int var167 = 7 & var165;
                    int var168 = class92.field1573.method1063((byte) 114);
                    int var169 = class92.field1573.method1063((byte) -96);
                    if (~var162 <= -1 && ~var163 <= -1 && ~class33.field662 < ~var162 && class121.field1966 > var163) {
                        int var170 = var166 + 1;
                        if (class139.field2224.field7692[0] >= -var170 + var162 && var162 - -var170 >= class139.field2224.field7692[0] && class139.field2224.field7694[0] >= -var170 + var163 && ~(var163 + var170) <= ~class139.field2224.field7694[0]) {
                            class123.method948(var168, var167, (class495.field7312 << 24) + var166 - (-(var162 << 16) + -(var163 << 8)), var164, arg1 ^ 1614053611, var169);
                        }
                    }
                } else if (class384.field5802 == arg0) {
                    int var171 = class92.field1573.method1069((byte) -113);
                    int var172 = class92.field1573.method1063((byte) -121);
                    class319.field4807.method2874(var171, -17045).method629(var172, -63);
                } else {
                    class320.method2087(0, (Throwable) null, "T3 - " + arg0);
                    class217.method1446(false);
                }
            } else {
                int var155 = class92.field1573.method1065((byte) 50);
                int var156 = class145.field2318 - -(7 & var155 >> 4);
                int var157 = (var155 & 7) + class212.field3038;
                int var158 = class92.field1573.method1079(arg1 ^ -1614053525);
                if (var156 >= 0 && ~var157 <= -1 && class33.field662 > var156 && class121.field1966 > var157) {
                    class294 var159 = (class294) class433.field6430.method171((byte) 114, (long) (var156 | var157 << 14 | class495.field7312 << 28));
                    if (var159 != null) {
                        for (class223 var160 = (class223) var159.field4192.method2427(117); var160 != null; var160 = (class223) var159.field4192.method2422(-121)) {
                            if ((32767 & var158) == var160.field3191) {
                                var160.method2090(-1);
                                break;
                            }
                        }
                        if (var159.field4192.method2430(-1)) {
                            var159.method2090(arg1 + -1614053612);
                        }
                        class369.method2312(var157, class495.field7312, var156, 1226839239);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg1 != -26471) {
            method683((class296) null, 106);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field1521 = arg0.method1069((byte) -28);
                    }
                } else {
                    this.field1522 = arg0.method1069((byte) -9);
                }
            } else {
                this.field1525 = arg0.method1069((byte) -115);
            }
        } else {
            this.field1533 = arg0.method1069((byte) -50);
        }
        ++field1530;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field1534;
        if (arg0 != 0) {
            this.field1521 = -119;
        }
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (super.field854.field1928) {
            for (int var4 = 0; ~var4 > ~class259.field3768; ++var4) {
                int var5 = (class69.field1199[var4] << 12) / this.field1533 + this.field1522;
                int var6 = (class433.field6429[arg1] << 12) / this.field1533 + this.field1521;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && ~this.field1525 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var7 + var11 + -var12;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = this.field1525 + -1 <= var13 ? 0 : (var13 << 12) / this.field1525;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)I")
    public static final int method684(int arg0, int arg1) {
        ++field1526;
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            if (arg1 < 94) {
                field1529 = 93;
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public static void method685(boolean arg0) {
        field1523 = null;
        if (arg0) {
            field1520 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class87() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)V")
    public static final void method686(boolean arg0) {
        ++field1532;
        int var1 = (int) ((double) class33.field662 * 34.46D);
        int var2 = var1 << 0;
        if (class4.field109.method305()) {
            var2 += 128;
        }
        class4.field109.method296(50, var2);
        if (!arg0) {
            field1520 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)Lkb;")
    public static final class485 method687(int arg0) {
        ++field1527;
        if (arg0 != 16565) {
            field1523 = null;
        }
        try {
            return new class484();
        } catch (Throwable var2) {
            try {
                return (class485) Class.forName("cw").newInstance();
            } catch (Throwable var1) {
                return new class225();
            }
        }
    }

    static {
        new class342("Select", "Auswählen", "Sélectionner", "Selecionar");
    }
}
