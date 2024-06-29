import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class169 extends class114 {

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
    private int field2414 = 0;

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "I")
    private int field2416 = 4096;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "J")
    public static volatile long field2411 = 0L;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field2413 = "flash2:";

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
    public static int field2412 = -1;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!nm", name = "U", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!nm", name = "V", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(III)Lpb;")
    public static final class180 method1077(int arg0, int arg1, int arg2) {
        class91 var3 = class246.field3856[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class180 var4 = var3.field1334;
            var3.field1334 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(BI)V")
    public static final void method1078(byte arg0, int arg1) {
        class72.field1037 = new int[arg1];
        class5.field48 = new int[arg1];
        class31.field465 = new int[arg1];
        ++field2417;
        if (arg0 == -99) {
            class42.field625 = new int[arg1];
            class136.field1863 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(III)J")
    public static final long method1079(int arg0, int arg1, int arg2) {
        class91 var3 = class246.field3856[arg0][arg1][arg2];
        return var3 != null && var3.field1323 != null ? var3.field1323.field4950 : 0L;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)V")
    public static final void method1080(byte arg0) {
        if (class108.field1546 == 168) {
            int var1 = class131.field1830.method1373(2);
            int var2 = class131.field1830.method1374((byte) -60);
            int var3 = ((var2 & 113) >> 4) + class184.field2788;
            int var4 = (var2 & 7) + class4.field32;
            byte var5 = class131.field1830.method1401(-110);
            int var6 = class131.field1830.method1390(28203);
            int var7 = var6 & 3;
            int var8 = class131.field1830.method1364(2);
            int var9 = var6 >> 2;
            int var10 = class131.field1830.method1380((byte) 45);
            int var11 = class131.field1830.method1379(-97);
            byte var12 = class131.field1830.method1349((byte) 54);
            byte var13 = class131.field1830.method1349((byte) 88);
            byte var14 = class131.field1830.method1349((byte) 91);
            class90.method581(var5, 123, var1, var13, var12, var14, var9, var3, var4, var8, var11, var10, var7);
        }
        ++field2415;
        if (~class108.field1546 == -174) {
            int var15 = class131.field1830.method1374((byte) -60);
            int var16 = (var15 >> 4 & 15) + class184.field2788 * 2;
            int var17 = (var15 & 15) + class4.field32 * 2;
            int var18 = class131.field1830.method1350((byte) -105) + var16;
            int var19 = class131.field1830.method1350((byte) -28) + var17;
            int var20 = class131.field1830.method1356(false);
            int var21 = class131.field1830.method1356(false);
            int var22 = class131.field1830.method1379(-119);
            int var23 = class131.field1830.method1350((byte) -74);
            int var24 = 4 * class131.field1830.method1374((byte) -60);
            int var25 = class131.field1830.method1379(-100);
            int var26 = class131.field1830.method1379(-96);
            int var27 = class131.field1830.method1374((byte) -60);
            if (~var27 == -256) {
                var27 = -1;
            }
            int var28 = class131.field1830.method1374((byte) -60);
            if (~var16 <= -1 && ~var17 <= -1 && ~var16 > -209 && var17 < 208 && ~var18 <= -1 && ~var19 <= -1 && var18 < 208 && ~var19 > -209 && ~var22 != -65536) {
                int var29 = var18 * 64;
                int var30 = var19 * 64;
                int var31 = var16 * 64;
                int var32 = var17 * 64;
                if (~var20 != -1) {
                    class256 var35;
                    int var36;
                    if (~var20 <= -1) {
                        int var33 = var20 - 1;
                        int var34 = 2047 & var33;
                        var35 = class88.field1274[var34];
                        var36 = (31490 & var33) >> 11;
                    } else {
                        int var37 = -var20 + -1;
                        var36 = 15 & var37 >> 11;
                        int var38 = 2047 & var37;
                        if (class305.field4917 != var38) {
                            var35 = class48.field689[var38];
                        } else {
                            var35 = class250.field3905;
                        }
                    }
                    if (var35 != null) {
                        class85 var39 = var35.method1685(0);
                        if (var39.field1198 != null && var39.field1198[var36] != null) {
                            int var40 = var39.field1198[var36][0];
                            var23 -= var39.field1198[var36][1];
                            int var41 = var39.field1198[var36][2];
                            int var42 = class118.field1697[var35.field4093];
                            int var43 = class118.field1690[var35.field4093];
                            int var44 = var40 * var43 + var41 * var42 >> 16;
                            int var45 = var41 * var43 + -(var40 * var42) >> 16;
                            var32 += var45;
                            var31 += var44;
                        }
                    }
                }
                class218 var47 = new class218(var22, class166.field2364, var31, var32, class58.method360(var32, var31, false, class166.field2364) + -var23, class35.field533 + var25, class35.field533 + var26, var27, var28, var21, var24);
                var47.method1421(var30, -19968, class58.method360(var30, var29, false, class166.field2364) + -var24, var29, class35.field533 + var25);
                class234.field3658.method370((byte) -22, new class153(var47));
            }
        } else if (class108.field1546 == 209) {
            int var48 = class131.field1830.method1374((byte) -60);
            int var49 = class184.field2788 - -(7 & var48 >> 4);
            int var50 = class4.field32 - -(var48 & 7);
            int var51 = class131.field1830.method1379(-90);
            int var52 = class131.field1830.method1374((byte) -60);
            int var53 = class131.field1830.method1379(-85);
            if (var49 >= 0 && var50 >= 0 && ~var49 > -105 && var50 < 104) {
                int var54 = var49 * 128 + 64;
                int var55 = var50 * 128 + 64;
                class23 var56 = new class23(var51, class166.field2364, var54, var55, class58.method360(var55, var54, false, class166.field2364) + -var52, var53, class35.field533);
                class8.field89.method370((byte) -22, new class112(var56));
            }
        } else if (~class108.field1546 == -82) {
            int var57 = class131.field1830.method1373(2);
            int var58 = class131.field1830.method1366(255);
            int var59 = (var58 & 7) + class4.field32;
            int var60 = ((114 & var58) >> 4) + class184.field2788;
            int var61 = class131.field1830.method1390(28203);
            int var62 = var61 >> 2;
            int var63 = class147.field2018[var62];
            int var64 = 3 & var61;
            if (var60 >= 0 && var59 >= 0 && var60 < 104 && ~var59 > -105) {
                method1081(var62, var64, var57, class166.field2364, var59, var60, true, var63, -1, 0);
            }
        } else if (~class108.field1546 == -238) {
            int var65 = class131.field1830.method1379(-111);
            int var66 = class131.field1830.method1374((byte) -60);
            class265.method1717(92, var65).method1570(100, var66);
        } else if (class108.field1546 == 54) {
            int var67 = class131.field1830.method1374((byte) -60);
            int var68 = class4.field32 * 2 - -(15 & var67);
            int var69 = ((var67 & 248) >> 4) + class184.field2788 * 2;
            int var70 = class131.field1830.method1350((byte) -42) + var69;
            int var71 = class131.field1830.method1350((byte) 103) + var68;
            int var72 = class131.field1830.method1356(false);
            int var73 = class131.field1830.method1379(-77);
            int var74 = class131.field1830.method1374((byte) -60) * 4;
            int var75 = class131.field1830.method1374((byte) -60) * 4;
            int var76 = class131.field1830.method1379(-113);
            int var77 = class131.field1830.method1379(-74);
            int var78 = class131.field1830.method1374((byte) -60);
            int var79 = class131.field1830.method1374((byte) -60);
            if (~var78 == -256) {
                var78 = -1;
            }
            if (~var69 <= -1 && ~var68 <= -1 && ~var69 > -209 && var68 < 208 && ~var70 <= -1 && ~var71 <= -1 && var70 < 208 && var71 < 208 && var73 != 65535) {
                int var80 = var69 * 64;
                int var81 = var70 * 64;
                int var82 = var68 * 64;
                int var83 = var71 * 64;
                class218 var84 = new class218(var73, class166.field2364, var80, var82, -var74 + class58.method360(var82, var80, false, class166.field2364), class35.field533 + var76, class35.field533 + var77, var78, var79, var72, var75);
                var84.method1421(var83, -19968, class58.method360(var83, var81, false, class166.field2364) + -var75, var81, class35.field533 + var76);
                class234.field3658.method370((byte) -22, new class153(var84));
            }
        } else if (arg0 <= -79) {
            if (~class108.field1546 == -39) {
                int var85 = class131.field1830.method1374((byte) -60);
                int var86 = (7 & var85) + class4.field32;
                int var87 = ((122 & var85) >> 4) + class184.field2788;
                int var88 = class131.field1830.method1379(-122);
                int var89 = class131.field1830.method1374((byte) -60);
                if (var88 == 65535) {
                    var88 = -1;
                }
                int var90 = var89 >> 4 & 15;
                int var91 = class131.field1830.method1374((byte) -60);
                int var92 = class131.field1830.method1374((byte) -60);
                int var93 = var89 & 7;
                if (var87 >= 0 && var86 >= 0 && ~var87 > -105 && var86 < 104) {
                    int var94 = var90 + 1;
                    if (~(-var94 + var87) >= ~class250.field3905.field4143[0] && ~(var87 + var94) <= ~class250.field3905.field4143[0] && ~(var86 - var94) >= ~class250.field3905.field4053[0] && class250.field3905.field4053[0] <= var86 + var94 && ~class209.field3110 != -1 && ~var93 < -1 && ~class114.field1647 > -51 && ~var88 != 0) {
                        class167.field2389[class114.field1647] = var88;
                        class106.field1515[class114.field1647] = var93;
                        class191.field2910[class114.field1647] = var91;
                        class128.field1791[class114.field1647] = null;
                        class200.field3044[class114.field1647] = (var86 << 8) + ((var87 << 16) - -var90);
                        class45.field670[class114.field1647] = var92;
                        ++class114.field1647;
                    }
                }
            } else if (class108.field1546 == 244) {
                int var95 = class131.field1830.method1366(255);
                int var96 = var95 >> 2;
                int var97 = class147.field2018[var96];
                int var98 = var95 & 3;
                int var99 = class131.field1830.method1377(25190);
                int var100 = class184.field2788 - -((118 & var99) >> 4);
                int var101 = (7 & var99) + class4.field32;
                int var102 = class131.field1830.method1373(2);
                if (~var102 == -65536) {
                    var102 = -1;
                }
                class17.method120(class166.field2364, var102, var98, var96, false, var100, var101, var97);
            } else if (~class108.field1546 == -89) {
                int var103 = class131.field1830.method1380((byte) 45);
                int var104 = class131.field1830.method1373(2);
                int var105 = class131.field1830.method1366(255);
                int var106 = (var105 & 7) + class4.field32;
                int var107 = (7 & var105 >> 4) + class184.field2788;
                if (~var107 <= -1 && ~var106 <= -1 && ~var107 > -105 && ~var106 > -105) {
                    class2 var108 = new class2();
                    var108.field12 = var104;
                    var108.field8 = var103;
                    if (class78.field1088[class166.field2364][var107][var106] == null) {
                        class78.field1088[class166.field2364][var107][var106] = new class58();
                    }
                    class78.field1088[class166.field2364][var107][var106].method370((byte) -22, new class199(var108));
                    class51.method314((byte) -27, var106, var107);
                }
            } else if (~class108.field1546 == -237) {
                int var109 = class131.field1830.method1374((byte) -60);
                int var110 = (7 & var109 >> 4) + class184.field2788;
                int var111 = (7 & var109) + class4.field32;
                int var112 = class131.field1830.method1379(-119);
                int var113 = class131.field1830.method1379(-92);
                int var114 = class131.field1830.method1379(-107);
                if (var110 >= 0 && ~var111 <= -1 && var110 < 104 && ~var111 > -105) {
                    class58 var115 = class78.field1088[class166.field2364][var110][var111];
                    if (var115 != null) {
                        for (class199 var116 = (class199) var115.method369((byte) -113); var116 != null; var116 = (class199) var115.method362(false)) {
                            class2 var117 = var116.field3036;
                            if ((var112 & 32767) == var117.field12 && ~var117.field8 == ~var113) {
                                var117.field8 = var114;
                                break;
                            }
                        }
                        class51.method314((byte) -27, var111, var110);
                    }
                }
            } else if (~class108.field1546 == -209) {
                int var118 = class131.field1830.method1374((byte) -60);
                int var119 = var118 >> 2;
                int var120 = 3 & var118;
                int var121 = class147.field2018[var119];
                int var122 = class131.field1830.method1390(28203);
                int var123 = class184.field2788 - -((117 & var122) >> 4);
                int var124 = class4.field32 - -(var122 & 7);
                if (var123 >= 0 && ~var124 <= -1 && ~var123 > -105 && ~var124 > -105) {
                    method1081(var119, var120, -1, class166.field2364, var124, var123, true, var121, -1, 0);
                }
            } else if (~class108.field1546 != -98) {
                if (class108.field1546 == 7) {
                    int var131 = class131.field1830.method1374((byte) -60);
                    int var132 = ((113 & var131) >> 4) + class184.field2788;
                    int var133 = class4.field32 - -(var131 & 7);
                    int var134 = class131.field1830.method1350((byte) -87) + var132;
                    int var135 = var133 - -class131.field1830.method1350((byte) 108);
                    int var136 = class131.field1830.method1356(false);
                    int var137 = class131.field1830.method1379(-110);
                    int var138 = class131.field1830.method1374((byte) -60) * 4;
                    int var139 = class131.field1830.method1374((byte) -60) * 4;
                    int var140 = class131.field1830.method1379(-83);
                    int var141 = class131.field1830.method1379(-97);
                    int var142 = class131.field1830.method1374((byte) -60);
                    if (var142 == 255) {
                        var142 = -1;
                    }
                    int var143 = class131.field1830.method1374((byte) -60);
                    if (var132 >= 0 && ~var133 <= -1 && var132 < 104 && var133 < 104 && ~var134 <= -1 && var135 >= 0 && ~var134 > -105 && ~var135 > -105 && var137 != 65535) {
                        int var144 = var132 * 128 + 64;
                        int var145 = var135 * 128 + 64;
                        int var146 = var133 * 128 + 64;
                        int var147 = var134 * 128 + 64;
                        class218 var148 = new class218(var137, class166.field2364, var144, var146, class58.method360(var146, var144, false, class166.field2364) - var138, var140 - -class35.field533, var141 - -class35.field533, var142, var143, var136, var139);
                        var148.method1421(var145, -19968, -var139 + class58.method360(var145, var147, false, class166.field2364), var147, class35.field533 + var140);
                        class234.field3658.method370((byte) -22, new class153(var148));
                    }
                } else if (class108.field1546 == 36) {
                    int var149 = class131.field1830.method1373(2);
                    int var150 = class131.field1830.method1374((byte) -60);
                    int var151 = ((126 & var150) >> 4) + class184.field2788;
                    int var152 = (var150 & 7) + class4.field32;
                    int var153 = class131.field1830.method1380((byte) 45);
                    int var154 = class131.field1830.method1353((byte) 106);
                    if (~var151 <= -1 && var152 >= 0 && var151 < 104 && ~var152 > -105 && ~class305.field4917 != ~var149) {
                        class2 var155 = new class2();
                        var155.field12 = var154;
                        var155.field8 = var153;
                        if (class78.field1088[class166.field2364][var151][var152] == null) {
                            class78.field1088[class166.field2364][var151][var152] = new class58();
                        }
                        class78.field1088[class166.field2364][var151][var152].method370((byte) -22, new class199(var155));
                        class51.method314((byte) -27, var152, var151);
                    }
                }
            } else {
                int var125 = class131.field1830.method1353((byte) 104);
                int var126 = class131.field1830.method1366(255);
                int var127 = class184.field2788 - -(7 & var126 >> 4);
                int var128 = (7 & var126) + class4.field32;
                if (var127 >= 0 && ~var128 <= -1 && var127 < 104 && var128 < 104) {
                    class58 var129 = class78.field1088[class166.field2364][var127][var128];
                    if (var129 != null) {
                        for (class199 var130 = (class199) var129.method369((byte) -101); var130 != null; var130 = (class199) var129.method362(false)) {
                            if ((32767 & var125) == var130.field3036.field12) {
                                var130.method962(128);
                                break;
                            }
                        }
                        if (var129.method369((byte) -79) == null) {
                            class78.field1088[class166.field2364][var127][var128] = null;
                        }
                        class51.method314((byte) -27, var128, var127);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        ++field2409;
        if (arg1) {
            field2412 = -120;
        }
        int[] var3 = super.field1630.method302(arg0, -108);
        if (super.field1630.field710) {
            int[] var4 = this.method729(arg0, 0, 0);
            for (int var5 = 0; var5 < class145.field2009; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field2414 && ~var6 >= ~this.field2416 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIIZIII)V")
    public static final void method1081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        ++field2410;
        class197 var10 = null;
        for (class197 var11 = (class197) class69.field966.method369((byte) -103); var11 != null; var11 = (class197) class69.field966.method362(!arg6)) {
            if (~var11.field3021 == ~arg3 && var11.field3009 == arg5 && ~var11.field3006 == ~arg4 && var11.field3008 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class197();
            var10.field3021 = arg3;
            var10.field3008 = arg7;
            var10.field3006 = arg4;
            var10.field3009 = arg5;
            class57.method354(var10, 37);
            class69.field966.method370((byte) -22, var10);
        }
        var10.field3014 = arg0;
        if (arg6) {
            var10.field3016 = arg1;
            var10.field3013 = arg8;
            var10.field3010 = arg2;
            var10.field3015 = arg9;
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
    public class169() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field2416 = arg0.method1379(arg2 ^ -13033);
            }
        } else {
            this.field2414 = arg0.method1379(-94);
        }
        ++field2418;
        if (arg2 != 12953) {
            method1080((byte) 68);
        }
    }

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "(I)V")
    public static void method1082(int arg0) {
        if (arg0 != 64) {
            method1082(74);
        }
        field2413 = null;
    }
}
