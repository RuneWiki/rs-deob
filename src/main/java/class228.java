import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class228 extends class144 {

    @OriginalMember(owner = "client!of", name = "R", descriptor = "I")
    private int field3213 = 20;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    private int field3215 = 1365;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "I")
    private int field3207 = 0;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "I")
    private int field3216 = 0;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "I")
    public static int field3208 = -1;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    public static int field3209 = -1;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "Z")
    public static boolean field3214 = false;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "I")
    public static volatile int field3210 = 0;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "I")
    public static int field3217 = 2301979;

    @OriginalMember(owner = "client!of", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field3222 = "Take";

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "[I")
    public static int[] field3220 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!of", name = "I", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!of", name = "P", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        ++field3211;
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            for (int var4 = 0; var4 < class104.field1411; ++var4) {
                int var5 = (class87.field1178[var4] << 12) / this.field3215 + this.field3207;
                int var6 = (class143.field2045[arg0] << 12) / this.field3215 - -this.field3216;
                int var7 = var6;
                int var8 = var5;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 - -var12) > -16385 && ~var13 > ~this.field3213) {
                    ++var13;
                    var10 = (var9 * var10 >> 12) * 2 - -var7;
                    var9 = -var12 + var8 + var11;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = ~var13 <= ~(this.field3213 + -1) ? 0 : (var13 << 12) / this.field3213;
            }
        }
        if (arg1 != 255) {
            method1477(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field3206;
        if (arg2 != 20630) {
            method1475(-101, (class216) null);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.field3216 = arg1.method1380(true);
                    }
                } else {
                    this.field3207 = arg1.method1380(true);
                }
            } else {
                this.field3213 = arg1.method1380(true);
            }
        } else {
            this.field3215 = arg1.method1380(true);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILqi;)Lsg;")
    public static final class181 method1475(int arg0, class216 arg1) {
        if (arg0 != -5) {
            return null;
        } else {
            ++field3205;
            return new class181(arg1.method1357((byte) 50), arg1.method1357((byte) 50), arg1.method1357((byte) 50), arg1.method1357((byte) 50), arg1.method1357((byte) 50), arg1.method1357((byte) 50), arg1.method1357((byte) 50), arg1.method1357((byte) 50), arg1.method1382(-126), arg1.method1407(123));
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BII)I")
    public static final int method1476(byte arg0, int arg1, int arg2) {
        ++field3212;
        int var3 = 0;
        if (arg0 <= 8) {
            method1476((byte) 121, -17, -31);
        }
        while (~arg1 < -1) {
            var3 = 1 & arg2 | var3 << 1;
            --arg1;
            arg2 >>>= 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class228() {
        super(0, true);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public static void method1477(boolean arg0) {
        if (arg0) {
            field3222 = null;
            field3220 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "g", descriptor = "(I)V")
    public static final void method1478(int arg0) {
        ++field3219;
        if (class6.field79 == 111) {
            int var1 = class163.field2332.method1407(arg0 ^ 1221756937);
            int var2 = (var1 >> 4 & 7) + class145.field2141;
            int var3 = class257.field3713 - -(var1 & 7);
            int var4 = class163.field2332.method1380(true);
            int var5 = class163.field2332.method1380(true);
            int var6 = class163.field2332.method1380(true);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class234 var7 = class80.field943[class199.field2833][var2][var3];
                if (var7 != null) {
                    for (class192 var8 = (class192) var7.method1532(-116); var8 != null; var8 = (class192) var7.method1523(-109)) {
                        class97 var9 = var8.field2762;
                        if ((32767 & var4) == var9.field1303 && var9.field1302 == var5) {
                            var9.field1302 = var6;
                            break;
                        }
                    }
                    class215.method1350(false, var2, var3);
                }
            }
        } else {
            if (arg0 != 1221757028) {
                field3222 = null;
            }
            if (~class6.field79 == -198) {
                int var10 = class163.field2332.method1362(arg0 + -1221757023);
                int var11 = var10 >> 2;
                int var12 = var10 & 3;
                int var13 = class6.field85[var11];
                int var14 = class163.field2332.method1392(-62);
                int var15 = class145.field2141 - -(var14 >> 4 & 7);
                int var16 = (var14 & 7) + class257.field3713;
                if (var15 >= 0 && ~var16 <= -1 && ~var15 > -105 && ~var16 > -105) {
                    class30.method184(var12, -1, class199.field2833, var15, var13, 0, (byte) -111, var16, var11, -1);
                }
            } else if (class6.field79 == 159) {
                int var17 = class163.field2332.method1380(true);
                int var18 = class163.field2332.method1362(5);
                int var19 = class257.field3713 - -(var18 & 7);
                int var20 = (var18 >> 4 & 7) + class145.field2141;
                int var21 = class163.field2332.method1388(-1);
                if (var20 >= 0 && ~var19 <= -1 && ~var20 > -105 && ~var19 > -105) {
                    class97 var22 = new class97();
                    var22.field1303 = var21;
                    var22.field1302 = var17;
                    if (class80.field943[class199.field2833][var20][var19] == null) {
                        class80.field943[class199.field2833][var20][var19] = new class234();
                    }
                    class80.field943[class199.field2833][var20][var19].method1522(new class192(var22), -17);
                    class215.method1350(false, var20, var19);
                }
            } else if (class6.field79 == 193) {
                int var23 = class163.field2332.method1362(5);
                int var24 = var23 >> 2;
                int var25 = 3 & var23;
                int var26 = class6.field85[var24];
                int var27 = class163.field2332.method1369((byte) -124);
                int var28 = class145.field2141 - -((var27 & 123) >> 4);
                int var29 = (var27 & 7) + class257.field3713;
                int var30 = class163.field2332.method1385(2);
                if (~var30 == -65536) {
                    var30 = -1;
                }
                class269.method1721(class199.field2833, var25, var26, var30, var24, var28, (byte) 96, var29);
            } else if (class6.field79 == 41) {
                int var31 = class163.field2332.method1407(124);
                int var32 = (7 & var31) + class257.field3713;
                int var33 = class145.field2141 - -((var31 & 122) >> 4);
                int var34 = class163.field2332.method1355(true) + var33;
                int var35 = class163.field2332.method1355(true) + var32;
                int var36 = class163.field2332.method1357((byte) 50);
                int var37 = class163.field2332.method1380(true);
                int var38 = 4 * class163.field2332.method1407(120);
                int var39 = class163.field2332.method1407(108) * 4;
                int var40 = class163.field2332.method1380(true);
                int var41 = class163.field2332.method1380(true);
                int var42 = class163.field2332.method1407(109);
                if (~var42 == -256) {
                    var42 = -1;
                }
                int var43 = class163.field2332.method1407(107);
                if (var33 >= 0 && ~var32 <= -1 && var33 < 104 && ~var32 > -105 && var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && ~var37 != -65536) {
                    int var44 = var32 * 128 + 64;
                    int var45 = var35 * 128 + 64;
                    int var46 = var33 * 128 + 64;
                    int var47 = var34 * 128 + 64;
                    class182 var48 = new class182(var37, class199.field2833, var46, var44, class4.method21(var44, class199.field2833, var46, (byte) 26) - var38, class198.field2819 + var40, class198.field2819 + var41, var42, var43, var36, var39);
                    var48.method1181((byte) -60, class4.method21(var45, class199.field2833, var47, (byte) 26) + -var39, var45, class198.field2819 + var40, var47);
                    class71.field831.method1522(new class123(var48), -22);
                }
            } else if (~class6.field79 == -216) {
                int var49 = class163.field2332.method1369((byte) -128);
                int var50 = var49 >> 2;
                int var51 = var49 & 3;
                int var52 = class6.field85[var50];
                int var53 = class163.field2332.method1392(arg0 + -1221757077);
                int var54 = class145.field2141 - -(7 & var53 >> 4);
                int var55 = (7 & var53) + class257.field3713;
                int var56 = class163.field2332.method1380(true);
                if (~var54 <= -1 && var55 >= 0 && ~var54 > -105 && var55 < 104) {
                    class30.method184(var51, var56, class199.field2833, var54, var52, 0, (byte) -111, var55, var50, -1);
                }
            } else if (~class6.field79 == -141) {
                int var57 = class163.field2332.method1407(118);
                int var58 = (var57 >> 4 & 15) + class145.field2141 * 2;
                int var59 = class257.field3713 * 2 - -(15 & var57);
                int var60 = var58 + class163.field2332.method1355(true);
                int var61 = class163.field2332.method1355(true) + var59;
                int var62 = class163.field2332.method1357((byte) 50);
                int var63 = class163.field2332.method1380(true);
                int var64 = 4 * class163.field2332.method1407(125);
                int var65 = 4 * class163.field2332.method1407(127);
                int var66 = class163.field2332.method1380(true);
                int var67 = class163.field2332.method1380(true);
                int var68 = class163.field2332.method1407(110);
                if (~var68 == -256) {
                    var68 = -1;
                }
                int var69 = class163.field2332.method1407(arg0 ^ 1221756956);
                if (var58 >= 0 && var59 >= 0 && var58 < 208 && ~var59 > -209 && var60 >= 0 && var61 >= 0 && ~var60 > -209 && ~var61 > -209 && ~var63 != -65536) {
                    int var70 = var58 * 64;
                    int var71 = var60 * 64;
                    int var72 = var59 * 64;
                    int var73 = var61 * 64;
                    class182 var74 = new class182(var63, class199.field2833, var70, var72, -var64 + class4.method21(var72, class199.field2833, var70, (byte) 26), class198.field2819 + var66, class198.field2819 + var67, var68, var69, var62, var65);
                    var74.method1181((byte) 68, class4.method21(var73, class199.field2833, var71, (byte) 26) - var65, var73, class198.field2819 + var66, var71);
                    class71.field831.method1522(new class123(var74), 125);
                }
            } else if (~class6.field79 == -71) {
                int var75 = class163.field2332.method1407(118);
                int var76 = (7 & var75 >> 4) + class145.field2141;
                int var77 = (var75 & 7) + class257.field3713;
                int var78 = class163.field2332.method1380(true);
                int var79 = class163.field2332.method1407(118);
                int var80 = class163.field2332.method1380(true);
                if (var76 >= 0 && ~var77 <= -1 && var76 < 104 && var77 < 104) {
                    int var81 = var76 * 128 - -64;
                    int var82 = var77 * 128 + 64;
                    class37 var83 = new class37(var78, class199.field2833, var81, var82, -var79 + class4.method21(var82, class199.field2833, var81, (byte) 26), var80, class198.field2819);
                    class130.field1883.method1522(new class159(var83), -105);
                }
            } else if (~class6.field79 == -248) {
                int var84 = class163.field2332.method1388(-1);
                int var85 = class163.field2332.method1392(-32);
                int var86 = (7 & var85 >> 4) + class145.field2141;
                int var87 = (var85 & 7) + class257.field3713;
                int var88 = class163.field2332.method1380(true);
                int var89 = class163.field2332.method1385(2);
                if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104 && class33.field385 != var88) {
                    class97 var90 = new class97();
                    var90.field1302 = var84;
                    var90.field1303 = var89;
                    if (class80.field943[class199.field2833][var86][var87] == null) {
                        class80.field943[class199.field2833][var86][var87] = new class234();
                    }
                    class80.field943[class199.field2833][var86][var87].method1522(new class192(var90), 125);
                    class215.method1350(false, var86, var87);
                }
            } else if (~class6.field79 != -102) {
                if (class6.field79 == 7) {
                    int var97 = class163.field2332.method1407(119);
                    int var98 = (7 & var97 >> 4) + class145.field2141;
                    int var99 = class257.field3713 - -(7 & var97);
                    int var100 = class163.field2332.method1380(true);
                    int var101 = class163.field2332.method1407(117);
                    int var102 = var101 & 7;
                    int var103 = class163.field2332.method1407(arg0 + -1221756914);
                    int var104 = class163.field2332.method1407(127);
                    if (~var100 == -65536) {
                        var100 = -1;
                    }
                    int var105 = 15 & var101 >> 4;
                    if (~var98 <= -1 && ~var99 <= -1 && var98 < 104 && ~var99 > -105) {
                        int var106 = var105 + 1;
                        if (~(-var106 + var98) >= ~class177.field2507.field4597[0] && ~class177.field2507.field4597[0] >= ~(var98 - -var106) && ~class177.field2507.field4585[0] <= ~(var99 - var106) && class177.field2507.field4585[0] <= var99 + var106 && class95.field1277 != 0 && ~var102 < -1 && ~class37.field432 > -51 && var100 != -1) {
                            class243.field3548[class37.field432] = var100;
                            class223.field3148[class37.field432] = var102;
                            class157.field2258[class37.field432] = var103;
                            class101.field1397[class37.field432] = null;
                            class176.field2501[class37.field432] = (var99 << 8) + ((var98 << 16) - -var105);
                            class77.field924[class37.field432] = var104;
                            ++class37.field432;
                        }
                    }
                } else {
                    if (class6.field79 == 133) {
                        byte var107 = class163.field2332.method1355(true);
                        byte var108 = class163.field2332.method1393(-24884);
                        int var109 = class163.field2332.method1388(arg0 ^ -1221757029);
                        int var110 = class163.field2332.method1362(arg0 ^ 1221757025);
                        int var111 = (7 & var110) + class257.field3713;
                        int var112 = ((125 & var110) >> 4) + class145.field2141;
                        int var113 = class163.field2332.method1385(2);
                        int var114 = class163.field2332.method1392(-85);
                        byte var115 = class163.field2332.method1355(true);
                        int var116 = var114 & 3;
                        byte var117 = class163.field2332.method1377(0);
                        int var118 = class163.field2332.method1388(-1);
                        int var119 = class163.field2332.method1384(2);
                        int var120 = var114 >> 2;
                        class221.method1440(var108, var118, var119, var107, var113, var117, var115, var120, var111, (byte) -78, var112, var109, var116);
                    }
                    if (~class6.field79 == -47) {
                        int var121 = class163.field2332.method1407(115);
                        int var122 = (var121 & 15) + class257.field3713 * 2;
                        int var123 = ((253 & var121) >> 4) + class145.field2141 * 2;
                        int var124 = var123 - -class163.field2332.method1355(true);
                        int var125 = class163.field2332.method1355(true) + var122;
                        int var126 = class163.field2332.method1357((byte) 50);
                        int var127 = class163.field2332.method1357((byte) 50);
                        int var128 = class163.field2332.method1380(true);
                        int var129 = class163.field2332.method1355(true);
                        int var130 = 4 * class163.field2332.method1407(109);
                        int var131 = class163.field2332.method1380(true);
                        int var132 = class163.field2332.method1380(true);
                        int var133 = class163.field2332.method1407(103);
                        int var134 = class163.field2332.method1407(119);
                        if (var133 == 255) {
                            var133 = -1;
                        }
                        if (var123 >= 0 && ~var122 <= -1 && ~var123 > -209 && var122 < 208 && ~var124 <= -1 && ~var125 <= -1 && ~var124 > -209 && ~var125 > -209 && ~var128 != -65536) {
                            int var135 = var122 * 64;
                            int var136 = var124 * 64;
                            int var137 = var125 * 64;
                            int var138 = var123 * 64;
                            if (~var126 != -1) {
                                int var141;
                                class290 var142;
                                if (var126 >= 0) {
                                    int var139 = var126 + -1;
                                    int var140 = 2047 & var139;
                                    var141 = (var139 & 31590) >> 11;
                                    var142 = class20.field244[var140];
                                } else {
                                    int var143 = -var126 + -1;
                                    var141 = var143 >> 11 & 15;
                                    int var144 = 2047 & var143;
                                    if (class33.field385 == var144) {
                                        var142 = class177.field2507;
                                    } else {
                                        var142 = class253.field3656[var144];
                                    }
                                }
                                if (var142 != null) {
                                    class285 var145 = var142.method1949(-1);
                                    if (var145.field4370 != null && var145.field4370[var141] != null) {
                                        var129 -= var145.field4370[var141][1];
                                        int var146 = var145.field4370[var141][0];
                                        int var147 = var145.field4370[var141][2];
                                        int var148 = class297.field4697[var142.field4512];
                                        int var149 = class297.field4698[var142.field4512];
                                        int var150 = var146 * var149 + var147 * var148 >> 16;
                                        int var151 = var147 * var149 + -(var146 * var148) >> 16;
                                        var135 += var151;
                                        var138 += var150;
                                    }
                                }
                            }
                            class182 var153 = new class182(var128, class199.field2833, var138, var135, class4.method21(var135, class199.field2833, var138, (byte) 26) + -var129, class198.field2819 + var131, class198.field2819 + var132, var133, var134, var127, var130);
                            var153.method1181((byte) 113, -var130 + class4.method21(var137, class199.field2833, var136, (byte) 26), var137, class198.field2819 + var131, var136);
                            class71.field831.method1522(new class123(var153), 107);
                        }
                    } else if (class6.field79 == 136) {
                        int var154 = class163.field2332.method1380(true);
                        int var155 = class163.field2332.method1407(108);
                        class164.method1081(0, var154).method1745((byte) 102, var155);
                    }
                }
            } else {
                int var91 = class163.field2332.method1392(-76);
                int var92 = (7 & var91) + class257.field3713;
                int var93 = class145.field2141 - -((var91 & 118) >> 4);
                int var94 = class163.field2332.method1380(true);
                if (~var93 <= -1 && ~var92 <= -1 && ~var93 > -105 && ~var92 > -105) {
                    class234 var95 = class80.field943[class199.field2833][var93][var92];
                    if (var95 != null) {
                        for (class192 var96 = (class192) var95.method1532(arg0 ^ -1221756954); var96 != null; var96 = (class192) var95.method1523(-90)) {
                            if ((32767 & var94) == var96.field2762.field1303) {
                                var96.method1935(115);
                                break;
                            }
                        }
                        if (var95.method1532(-77) == null) {
                            class80.field943[class199.field2833][var93][var92] = null;
                        }
                        class215.method1350(false, var93, var92);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILwe;B)I")
    public static final int method1479(int arg0, class82 arg1, byte arg2) {
        ++field3221;
        if (arg1.field1037 != null && ~arg1.field1037.length < ~arg0) {
            try {
                if (arg2 < 31) {
                    return 0;
                } else {
                    int[] var3 = arg1.field1037[arg0];
                    int var4 = 0;
                    byte var5 = 0;
                    int var6 = 0;
                    while (true) {
                        int var7 = 0;
                        byte var8 = 0;
                        int var9 = var3[var4++];
                        if (~var9 == -1) {
                            return var6;
                        }
                        if (var9 == 1) {
                            var7 = class283.field4312[var3[var4++]];
                        }
                        if (var9 == 2) {
                            var7 = class124.field1786[var3[var4++]];
                        }
                        if (var9 == 3) {
                            var7 = class54.field637[var3[var4++]];
                        }
                        if (~var9 == -16) {
                            var8 = 1;
                        }
                        if (~var9 == -5) {
                            int var10 = var3[var4++] << 16;
                            int var11 = var10 + var3[var4++];
                            class82 var12 = class182.method1187((byte) -41, var11);
                            int var13 = var3[var4++];
                            if (var13 != -1 && (!class36.method224(var13, 24).field3234 || class263.field3809)) {
                                for (int var14 = 0; var12.field1080.length > var14; ++var14) {
                                    if (var13 - -1 == var12.field1080[var14]) {
                                        var7 += var12.field1066[var14];
                                    }
                                }
                            }
                        }
                        if (var9 == 16) {
                            var8 = 2;
                        }
                        if (~var9 == -6) {
                            var7 = class164.field2358[var3[var4++]];
                        }
                        if (~var9 == -18) {
                            var8 = 3;
                        }
                        if (var9 == 6) {
                            var7 = class172.field2454[class124.field1786[var3[var4++]] - 1];
                        }
                        if (~var9 == -8) {
                            var7 = 100 * class164.field2358[var3[var4++]] / 46875;
                        }
                        if (var9 == 8) {
                            var7 = class177.field2507.field3472;
                        }
                        if (var9 == 9) {
                            for (int var15 = 0; ~var15 > -26; ++var15) {
                                if (class44.field526[var15]) {
                                    var7 += class124.field1786[var15];
                                }
                            }
                        }
                        if (~var9 == -11) {
                            int var16 = var3[var4++] << 16;
                            int var17 = var16 + var3[var4++];
                            class82 var18 = class182.method1187((byte) -41, var17);
                            int var19 = var3[var4++];
                            if (var19 != -1 && (!class36.method224(var19, 39).field3234 || class263.field3809)) {
                                for (int var20 = 0; var20 < var18.field1080.length; ++var20) {
                                    if (var19 - -1 == var18.field1080[var20]) {
                                        var7 = 999999999;
                                        break;
                                    }
                                }
                            }
                        }
                        if (~var9 == -12) {
                            var7 = class260.field3790;
                        }
                        if (~var9 == -13) {
                            var7 = class103.field1399;
                        }
                        if (var9 == 13) {
                            int var21 = class164.field2358[var3[var4++]];
                            int var22 = var3[var4++];
                            var7 = (1 << var22 & var21) != 0 ? 1 : 0;
                        }
                        if (var9 == 14) {
                            int var23 = var3[var4++];
                            var7 = class48.method292((byte) -66, var23);
                        }
                        if (var9 == 18) {
                            var7 = (class177.field2507.field4563 >> 7) + class110.field1473;
                        }
                        if (var9 == 19) {
                            var7 = (class177.field2507.field4553 >> 7) + class166.field2383;
                        }
                        if (var9 == 20) {
                            var7 = var3[var4++];
                        }
                        if (~var8 == -1) {
                            if (~var5 == -1) {
                                var6 += var7;
                            }
                            if (~var5 == -2) {
                                var6 -= var7;
                            }
                            if (~var5 == -3 && var7 != 0) {
                                var6 /= var7;
                            }
                            if (var5 == 3) {
                                var6 *= var7;
                            }
                            var5 = 0;
                        } else {
                            var5 = var8;
                        }
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        } else {
            return -2;
        }
    }
}
