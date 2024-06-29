import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class418 extends class243 {

    @OriginalMember(owner = "client!nn", name = "G", descriptor = "Ljava/lang/Object;")
    public static volatile Object field5880 = null;

    @OriginalMember(owner = "client!nn", name = "F", descriptor = "Llga;")
    public static class712 field5879 = new class712(23, 2);

    @OriginalMember(owner = "client!nn", name = "D", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!nn", name = "E", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!nn", name = "I", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
    private int field5883;

    @OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
    private int field5885;

    @OriginalMember(owner = "client!nn", name = "M", descriptor = "I")
    private int field5886;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILha;)V", line = 4)
    public static final void method2399(int arg0, class60 arg1) {
        ++field5878;
        if (arg0 != 256) {
            method2402((byte) -94);
        }
        if (class83.field1156) {
            class520.method2864((byte) 80, arg1);
        } else {
            class123.method793(2, arg1);
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)[[I", line = 21)
    public final int[][] method2(int arg0, int arg1) {
        if (arg0 >= -76) {
            this.field5886 = -70;
        }
        ++field5884;
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (super.field3156.field8335) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class687.field9628; ++var7) {
                var4[var7] = this.field5883;
                var5[var7] = this.field5886;
                var6[var7] = this.field5885;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BLfha;)V", line = 60)
    public static final void method2400(byte arg0, class382 arg1) {
        ++field5877;
        if (class541.field7357 == arg1) {
            int var2 = class569.field8012.method3435(true);
            int var3 = class64.field700 - -((124 & var2) >> 4);
            int var4 = (var2 & 7) + class231.field2979;
            int var5 = class569.field8012.method3435(true);
            int var6 = class569.field8012.method3427((byte) 51);
            class685 var7 = class707.field9894.method4109(var6, (byte) 119);
            int var8 = class569.field8012.method3435(true);
            int var9 = var8 >> 2;
            int var10 = class473.field6544[var9];
            if (var9 == 11) {
                var9 = 10;
            }
            int var11 = 0;
            if (var7.field9606 != null) {
                int var12 = -1;
                for (int var13 = 0; var7.field9606.length > var13; ++var13) {
                    if (var7.field9606[var13] == var9) {
                        var12 = var13;
                        break;
                    }
                }
                var11 = var7.field9558[var12].length;
            }
            int var14 = 0;
            if (var7.field9574 != null) {
                var14 = var7.field9574.length;
            }
            int var15 = 0;
            if (var7.field9584 != null) {
                var15 = var7.field9584.length;
            }
            if ((var5 & 1) == 1) {
                class599.method3316(var4, var10, (class150) null, var3, -75, class325.field4359);
            } else {
                int[] var16 = null;
                if (~(var5 & 2) == -3) {
                    var16 = new int[var11];
                    for (int var17 = 0; var17 < var11; ++var17) {
                        var16[var17] = class569.field8012.method3402((byte) 127);
                    }
                }
                short[] var18 = null;
                if ((var5 & 4) == 4) {
                    var18 = new short[var14];
                    for (int var19 = 0; ~var19 > ~var14; ++var19) {
                        var18[var19] = (short) class569.field8012.method3402((byte) 127);
                    }
                }
                short[] var20 = null;
                if ((8 & var5) == 8) {
                    var20 = new short[var15];
                    for (int var21 = 0; var21 < var15; ++var21) {
                        var20[var21] = (short) class569.field8012.method3402((byte) 127);
                    }
                }
                class599.method3316(var4, var10, new class150((long) (class268.field3559++), var16, var18, var20), var3, -92, class325.field4359);
            }
        } else if (class516.field6965 == arg1) {
            int var22 = class569.field8012.method3428((byte) -124);
            int var23 = class64.field700 - -(var22 >> 4 & 7);
            int var24 = (var22 & 7) + class231.field2979;
            int var25 = class569.field8012.method3402((byte) 127);
            if (var25 == 65535) {
                var25 = -1;
            }
            int var26 = class569.field8012.method3428((byte) -2);
            int var27 = 15 & var26 >> 4;
            int var28 = 7 & var26;
            int var29 = class569.field8012.method3428((byte) -103);
            int var30 = class569.field8012.method3428((byte) -113);
            int var31 = class569.field8012.method3402((byte) 127);
            if (~var23 <= -1 && var24 >= 0 && class272.field3589 > var23 && class3.field26 > var24) {
                int var32 = var27 + 1;
                if (class653.field9086.field898[0] >= -var32 + var23 && var23 + var32 >= class653.field9086.field898[0] && ~(var24 - var32) >= ~class653.field9086.field899[0] && class653.field9086.field899[0] <= var24 - -var32) {
                    class284.method1701(var30, var31, var25, var28, var29, (byte) 65, (class325.field4359 << 24) + (var23 << 16) + (var24 << 8) - -var27);
                }
            }
        } else if (class617.field8660 == arg1) {
            int var33 = class569.field8012.method3425((byte) -128);
            int var34 = var33 >> 2;
            int var35 = var33 & 3;
            int var36 = class473.field6544[var34];
            int var37 = class569.field8012.method3429(arg0 ^ -87);
            int var38 = (var37 >> 4 & 7) + class64.field700;
            int var39 = (var37 & 7) + class231.field2979;
            if (class615.method3465(-114, class361.field4790) || ~var38 <= -1 && ~var39 <= -1 && class272.field3589 > var38 && var39 < class3.field26) {
                class480.method2695(-85, var38, var34, var39, var36, -1, var35, class325.field4359);
            }
        } else if (class614.field8606 == arg1) {
            int var40 = class569.field8012.method3428((byte) 17);
            int var41 = ((var40 & 250) >> 4) + class64.field700 * 2;
            int var42 = (15 & var40) + class231.field2979 * 2;
            int var43 = class569.field8012.method3428((byte) 36);
            boolean var44 = (var43 & 1) != 0;
            boolean var45 = (2 & var43) != 0;
            int var46 = !var45 ? -1 : var43 >> 2;
            int var47 = var41 - -class569.field8012.method3390((byte) -19);
            int var48 = class569.field8012.method3390((byte) -19) + var42;
            int var49 = class569.field8012.method3413(false);
            int var50 = class569.field8012.method3413(false);
            int var51 = class569.field8012.method3402((byte) 127);
            int var52 = class569.field8012.method3428((byte) -121);
            int var53;
            if (!var45) {
                var53 = var52 * 4;
            } else {
                var53 = (byte) var52;
            }
            int var54 = 4 * class569.field8012.method3428((byte) 71);
            int var55 = class569.field8012.method3402((byte) 127);
            int var56 = class569.field8012.method3402((byte) 127);
            int var57 = class569.field8012.method3428((byte) -119);
            int var58 = class569.field8012.method3402((byte) 127);
            if (~var57 == -256) {
                var57 = -1;
            }
            if (~var41 <= -1 && ~var42 <= -1 && ~var41 > ~(class272.field3589 * 2) && var42 < class272.field3589 * 2 && var47 >= 0 && var48 >= 0 && class3.field26 * 2 > var47 && class3.field26 * 2 > var48 && ~var51 != -65536) {
                int var59 = var42 * 256;
                int var60 = var54 << 2;
                int var61 = var58 << 2;
                int var62 = var53 << 2;
                int var63 = var41 * 256;
                int var64 = var48 * 256;
                int var65 = var47 * 256;
                if (~var49 != -1 && var46 != -1) {
                    class74 var66 = null;
                    if (~var49 <= -1) {
                        int var67 = var49 + -1;
                        class706 var68 = (class706) class681.field9475.method2552((long) var67, -1);
                        if (var68 != null) {
                            var66 = var68.field9890;
                        }
                    } else {
                        int var69 = -var49 + -1;
                        if (~class247.field3207 != ~var69) {
                            var66 = class361.field4793[var69];
                        } else {
                            var66 = class653.field9086;
                        }
                    }
                    if (var66 != null) {
                        class351 var70 = var66.method548(1);
                        if (var70.field4655 != null && var70.field4655[var46] != null) {
                            var62 -= var70.field4655[var46][1];
                        }
                        if (var70.field4653 != null && var70.field4653[var46] != null) {
                            var62 -= var70.field4653[var46][1];
                        }
                    }
                }
                class33 var71 = new class33(var51, class325.field4359, class325.field4359, var63, var59, var62, class406.field5732 + var55, var56 - -class406.field5732, var57, var61, var49, var50, var60, var44, var46);
                var71.method151(var65, -var60 + class86.method624(class325.field4359, var64, var65, arg0 ^ -24068), class406.field5732 + var55, (byte) 108, var64);
                class268.field3555.method725(new class532(var71), arg0 + -20866);
            }
        } else if (class583.field8164 == arg1) {
            int var72 = class569.field8012.method3428((byte) -120);
            boolean var73 = ~(var72 & 128) != -1;
            int var74 = class64.field700 - -(7 & var72 >> 3);
            int var75 = (var72 & 7) + class231.field2979;
            int var76 = var74 + class569.field8012.method3390((byte) -19);
            int var77 = var75 - -class569.field8012.method3390((byte) -19);
            int var78 = class569.field8012.method3413(false);
            int var79 = class569.field8012.method3402((byte) 127);
            int var80 = class569.field8012.method3428((byte) 0) * 4;
            int var81 = 4 * class569.field8012.method3428((byte) -8);
            int var82 = class569.field8012.method3402((byte) 127);
            int var83 = class569.field8012.method3402((byte) 127);
            int var84 = class569.field8012.method3428((byte) -100);
            int var85 = class569.field8012.method3402((byte) 127);
            if (var84 == 255) {
                var84 = -1;
            }
            if (var74 >= 0 && var75 >= 0 && class272.field3589 > var74 && ~class3.field26 < ~var75 && var76 >= 0 && ~var77 <= -1 && var76 < class272.field3589 && ~var77 > ~class3.field26 && ~var79 != -65536) {
                int var86 = var81 << 2;
                int var87 = var74 * 512 + 256;
                int var88 = var80 << 2;
                int var89 = var75 * 512 + 256;
                int var90 = var76 * 512 + 256;
                int var91 = var77 * 512 + 256;
                int var92 = var85 << 2;
                class33 var93 = new class33(var79, class325.field4359, class325.field4359, var87, var89, var88, class406.field5732 + var82, var83 - -class406.field5732, var84, var92, 0, var78, var86, var73, -1);
                var93.method151(var90, class86.method624(class325.field4359, var91, var90, 24111) - var86, var82 - -class406.field5732, (byte) 108, var91);
                class268.field3555.method725(new class532(var93), -20911);
            }
        } else {
            if (arg0 != -45) {
                field5879 = null;
            }
            if (class180.field2212 == arg1) {
                int var94 = class569.field8012.method3428((byte) -102);
                int var95 = (var94 & 7) + class231.field2979;
                int var96 = class133.field1704 + var95;
                int var97 = (7 & var94 >> 4) + class64.field700;
                int var98 = var97 - -class99.field1313;
                int var99 = class569.field8012.method3402((byte) 127);
                int var100 = class569.field8012.method3402((byte) 127);
                int var101 = class569.field8012.method3402((byte) 127);
                if (class472.field6537 != null) {
                    class270 var102 = (class270) class472.field6537.method2552((long) (var98 | var96 << 14 | class325.field4359 << 28), arg0 ^ 44);
                    if (var102 != null) {
                        for (class48 var103 = (class48) var102.field3567.method724(32); var103 != null; var103 = (class48) var102.field3567.method723(arg0 + 142)) {
                            if (~(var99 & 32767) == ~var103.field491 && var103.field493 == var100) {
                                var103.method315(44);
                                var103.field493 = var101;
                                class627.method3543(var103, class325.field4359, var96, var98, true);
                                break;
                            }
                        }
                        if (var97 >= 0 && var95 >= 0 && ~var97 > ~class272.field3589 && var95 < class3.field26) {
                            class753.method4191(var97, class325.field4359, (byte) 114, var95);
                        }
                    }
                }
            } else if (class571.field8045 == arg1) {
                class569.field8012.method3428((byte) -113);
                int var104 = class569.field8012.method3428((byte) -122);
                int var105 = ((114 & var104) >> 4) + class64.field700;
                int var106 = (7 & var104) + class231.field2979;
                int var107 = class569.field8012.method3402((byte) 127);
                int var108 = class569.field8012.method3428((byte) -7);
                int var109 = class569.field8012.method3385(-123);
                String var110 = class569.field8012.method3403((byte) 84);
                class665.method3754((byte) 118, var109, var106, var107, var110, var108, class325.field4359, var105);
            } else if (class348.field4628 == arg1) {
                int var111 = class569.field8012.method3419((byte) -68);
                int var112 = class569.field8012.method3429(arg0 ^ -81);
                int var113 = (var112 & 7) + class231.field2979;
                int var114 = class133.field1704 - -var113;
                int var115 = (7 & var112 >> 4) + class64.field700;
                int var116 = class99.field1313 - -var115;
                int var117 = class569.field8012.method3419((byte) 95);
                boolean var118 = ~var115 <= -1 && ~var113 <= -1 && ~var115 > ~class272.field3589 && class3.field26 > var113;
                if (var118 || class615.method3465(arg0 + -56, class361.field4790)) {
                    class627.method3543(new class48(var111, var117), class325.field4359, var114, var116, true);
                    if (var118) {
                        class753.method4191(var115, class325.field4359, (byte) 59, var113);
                    }
                }
            } else if (class262.field3428 == arg1) {
                int var119 = class569.field8012.method3429(-32);
                int var120 = class64.field700 - -(7 & var119 >> 4);
                int var121 = class231.field2979 - -(7 & var119);
                int var122 = class569.field8012.method3419((byte) 105);
                if (~var122 == -65536) {
                    var122 = -1;
                }
                int var123 = class569.field8012.method3435(true);
                int var124 = var123 >> 2;
                int var125 = 3 & var123;
                int var126 = class473.field6544[var124];
                class412.method2380(var124, var125, true, var120, var121, class325.field4359, var122, var126);
            } else if (class295.field3976 == arg1) {
                int var127 = class569.field8012.method3428((byte) -107);
                int var128 = ((125 & var127) >> 4) + class64.field700;
                int var129 = (7 & var127) + class231.field2979;
                int var130 = class569.field8012.method3402((byte) 127);
                if (var130 == 65535) {
                    var130 = -1;
                }
                int var131 = class569.field8012.method3428((byte) 56);
                int var132 = (var131 & 246) >> 4;
                int var133 = var131 & 7;
                int var134 = class569.field8012.method3428((byte) -123);
                int var135 = class569.field8012.method3428((byte) -107);
                int var136 = class569.field8012.method3402((byte) 127);
                if (var128 >= 0 && ~var129 <= -1 && ~class272.field3589 < ~var128 && ~class3.field26 < ~var129) {
                    int var137 = var132 + 1;
                    if (~class653.field9086.field898[0] <= ~(-var137 + var128) && class653.field9086.field898[0] <= var128 + var137 && -var137 + var129 <= class653.field9086.field899[0] && ~class653.field9086.field899[0] >= ~(var129 + var137)) {
                        class656.method3713(var136, false, var134, var133, var135, (var129 << 8) - -var132 + (class325.field4359 << 24) + (var128 << 16), var130, arg0 + -21);
                    }
                }
            } else if (class26.field196 == arg1) {
                int var138 = class569.field8012.method3429(-20);
                int var139 = (var138 & 7) + class231.field2979;
                int var140 = class133.field1704 + var139;
                int var141 = class64.field700 - -((var138 & 121) >> 4);
                int var142 = var141 - -class99.field1313;
                int var143 = class569.field8012.method3411(90);
                class270 var144 = (class270) class472.field6537.method2552((long) (var142 | var140 << 14 | class325.field4359 << 28), -1);
                if (var144 != null) {
                    for (class48 var145 = (class48) var144.field3567.method724(32); var145 != null; var145 = (class48) var144.field3567.method723(117)) {
                        if (~(var143 & 32767) == ~var145.field491) {
                            var145.method315(107);
                            break;
                        }
                    }
                    if (var144.field3567.method726(-127)) {
                        var144.method315(64);
                    }
                    if (var141 >= 0 && ~var139 <= -1 && var141 < class272.field3589 && ~var139 > ~class3.field26) {
                        class753.method4191(var141, class325.field4359, (byte) 94, var139);
                    }
                }
            } else if (class589.field8226 == arg1) {
                int var146 = class569.field8012.method3425((byte) 102);
                int var147 = (var146 >> 4 & 7) + class64.field700;
                int var148 = (7 & var146) + class231.field2979;
                int var149 = class569.field8012.method3427((byte) 49);
                int var150 = class569.field8012.method3428((byte) 45);
                int var151 = var150 >> 2;
                int var152 = var150 & 3;
                int var153 = class473.field6544[var151];
                if (class615.method3465(-100, class361.field4790) || ~var147 <= -1 && ~var148 <= -1 && ~class272.field3589 < ~var147 && class3.field26 > var148) {
                    class480.method2695(-60, var147, var151, var148, var153, var149, var152, class325.field4359);
                }
            } else if (class494.field6733 == arg1) {
                int var154 = class569.field8012.method3402((byte) 127);
                int var155 = class569.field8012.method3428((byte) -107);
                class707.field9894.method4109(var154, (byte) 119).method3876((byte) 49, var155);
            } else if (class363.field4805 != arg1) {
                if (class103.field1384 == arg1) {
                    int var165 = class569.field8012.method3428((byte) -117);
                    int var166 = (var165 >> 4 & 7) + class64.field700;
                    int var167 = class231.field2979 - -(7 & var165);
                    int var168 = class569.field8012.method3402((byte) 127);
                    int var169 = class569.field8012.method3428((byte) -114);
                    int var170 = class569.field8012.method3402((byte) 127);
                    int var171 = class569.field8012.method3428((byte) 40);
                    if (var166 >= 0 && var167 >= 0 && ~class272.field3589 < ~var166 && class3.field26 > var167) {
                        int var172 = var166 * 512 - -256;
                        int var173 = var167 * 512 + 256;
                        int var174 = class325.field4359;
                        if (var174 < 3 && class669.method3767(var167, (byte) -104, var166)) {
                            ++var174;
                        }
                        class640 var175 = new class640(var168, var170, class406.field5732, class325.field4359, var174, var172, class86.method624(class325.field4359, var173, var172, 24111) - var169, var173, var166, var166, var167, var167, var171);
                        class576.field8091.method725(new class309(var175), arg0 ^ 20866);
                    }
                } else {
                    class760.method4223((Throwable) null, -123, "T3 - " + arg1);
                    class727.method4076(false, false);
                }
            } else {
                int var156 = class569.field8012.method3419((byte) 109);
                int var157 = class569.field8012.method3411(99);
                int var158 = class569.field8012.method3402((byte) 127);
                int var159 = class569.field8012.method3425((byte) 25);
                int var160 = (7 & var159) + class231.field2979;
                int var161 = class133.field1704 + var160;
                int var162 = (7 & var159 >> 4) + class64.field700;
                int var163 = class99.field1313 + var162;
                if (~class247.field3207 != ~var158) {
                    boolean var164 = var162 >= 0 && ~var160 <= -1 && var162 < class272.field3589 && ~class3.field26 < ~var160;
                    if (var164 || class615.method3465(-69, class361.field4790)) {
                        class627.method3543(new class48(var156, var157), class325.field4359, var161, var163, true);
                        if (var164) {
                            class753.method4191(var162, class325.field4359, (byte) 39, var160);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(II)V", line = 769)
    private final void method2401(int arg0, int arg1) {
        if (arg0 > 121) {
            ++field5881;
            this.field5886 = (65280 & arg1) >> 4;
            this.field5885 = arg1 << 4 & 4080;
            this.field5883 = (arg1 & 16711680) >> 12;
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(I)V", line = 783)
    private class418(int arg0) {
        super(0, false);
        this.method2401(122, arg0);
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V", line = 791)
    public class418() {
        this(0);
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(B)V", line = 794)
    public static void method2402(byte arg0) {
        int var1 = 73 % ((-56 - arg0) / 43);
        field5879 = null;
        field5880 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILji;B)V", line = 807)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        ++field5882;
        if (arg2 > -92) {
            this.field5886 = 88;
        }
        if (~arg0 == -1) {
            this.method2401(122, arg1.method3385(-124));
        }
    }
}
