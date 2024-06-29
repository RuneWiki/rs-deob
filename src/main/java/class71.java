import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class71 extends class30 {

    @OriginalMember(owner = "client!jv", name = "D", descriptor = "I")
    private int field953 = 4096;

    @OriginalMember(owner = "client!jv", name = "z", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!jv", name = "A", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!jv", name = "B", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!jv", name = "E", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!jv", name = "C", descriptor = "Lpa;")
    public static class338 field952;

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V")
    public class71() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILrg;)V")
    public static final void method575(int arg0, class596 arg1) {
        ++field954;
        if (class700.field9932 == arg1) {
            int var2 = class660.field9184.method2874((byte) -75);
            int var3 = ((var2 & 122) >> 4) + class190.field2723;
            int var4 = (7 & var2) + class486.field6679;
            int var5 = class660.field9184.method2845(-1);
            int var6 = class660.field9184.method2874((byte) -75);
            int var7 = class660.field9184.method2845(-1);
            int var8 = class660.field9184.method2874((byte) -75);
            if (~var3 <= -1 && var4 >= 0 && ~class401.field5620 < ~var3 && ~class257.field3508 < ~var4) {
                int var9 = var3 * 512 - -256;
                int var10 = var4 * 512 - -256;
                int var11 = class190.field2724;
                if (~var11 > -4 && class467.method2640(var3, var4, (byte) -6)) {
                    ++var11;
                }
                class284 var12 = new class284(var5, var7, class186.field2697, class190.field2724, var11, var9, -var6 + class249.method1533(class190.field2724, var10, var9, -116), var10, var3, var3, var4, var4, var8);
                class393.field5553.method1441(new class539(var12), 0);
            }
        } else if (class23.field281 == arg1) {
            int var13 = class660.field9184.method2843(7592);
            int var14 = ((var13 & 122) >> 4) + class190.field2723;
            int var15 = (var13 & 7) + class486.field6679;
            int var16 = class660.field9184.method2838((byte) -2);
            int var17 = var16 >> 2;
            int var18 = 3 & var16;
            int var19 = class586.field8254[var17];
            int var20 = class660.field9184.method2867(arg0 + -258);
            if (~var20 == -65536) {
                var20 = -1;
            }
            class610.method3422(var15, var17, var19, -127, var18, class190.field2724, var20, var14);
        } else if (class21.field240 == arg1) {
            int var21 = class660.field9184.method2874((byte) -75);
            int var22 = (var21 >> 4 & 15) + class190.field2723 * 2;
            int var23 = (var21 & 15) + class486.field6679 * 2;
            int var24 = class660.field9184.method2874((byte) -75);
            boolean var25 = (1 & var24) != 0;
            int var26 = var24 >> 1;
            int var27 = var22 - -class660.field9184.method2863(arg0 + -165);
            int var28 = var23 - -class660.field9184.method2863(90);
            int var29 = class660.field9184.method2875(false);
            int var30 = class660.field9184.method2875(false);
            int var31 = class660.field9184.method2845(-1);
            byte var32 = class660.field9184.method2863(arg0 + -151);
            int var33 = class660.field9184.method2874((byte) -75) * 4;
            int var34 = class660.field9184.method2845(-1);
            int var35 = class660.field9184.method2845(arg0 + -257);
            int var36 = class660.field9184.method2874((byte) -75);
            int var37 = class660.field9184.method2845(-1);
            if (~var36 == -256) {
                var36 = -1;
            }
            if (~var22 <= -1 && var23 >= 0 && ~var22 > ~(class401.field5620 * 2) && class401.field5620 * 2 > var23 && ~var27 <= -1 && ~var28 <= -1 && class257.field3508 * 2 > var27 && var28 < class257.field3508 * 2 && var31 != 65535) {
                int var38 = var32 << 2;
                int var39 = var33 << 2;
                int var40 = var23 * 256;
                int var41 = var28 * 256;
                int var42 = var37 << 2;
                int var43 = var27 * 256;
                int var44 = var22 * 256;
                if (var29 != 0) {
                    class124 var45 = null;
                    if (~var29 > -1) {
                        int var46 = -var29 + -1;
                        if (~class409.field5813 == ~var46) {
                            var45 = class143.field2063;
                        } else {
                            var45 = class671.field9407[var46];
                        }
                    } else {
                        int var47 = var29 + -1;
                        class393 var48 = (class393) class299.field4071.method970((byte) 89, (long) var47);
                        if (var48 != null) {
                            var45 = var48.field5552;
                        }
                    }
                    if (var45 != null) {
                        class67 var49 = var45.method895(-25227);
                        if (var49.field903 != null && var49.field903[var26] != null) {
                            int var50 = var49.field903[var26][0];
                            int var51 = var49.field903[var26][2];
                            int var52 = var45.field1738.method2947(8720);
                            int var53 = class597.field8342[var52];
                            int var54 = class597.field8344[var52];
                            int var55 = var50 * var54 + var51 * var53 >> 14;
                            int var56 = var51 * var54 + -(var50 * var53) >> 14;
                            var40 += var56;
                            var44 += var55;
                            var38 -= var49.field903[var26][1];
                        }
                    }
                }
                class198 var58 = new class198(var31, class190.field2724, class190.field2724, var44, var40, var38, var34 - -class186.field2697, var35 - -class186.field2697, var36, var42, var30, var39, var25);
                var58.method1310((byte) 124, -var39 + class249.method1533(class190.field2724, var41, var43, 32), class186.field2697 + var34, var43, var41);
                class198.field2809.method1441(new class585(var58), 0);
            }
        } else if (class413.field5851 == arg1) {
            int var59 = class660.field9184.method2845(arg0 + -257);
            int var60 = class660.field9184.method2874((byte) -75);
            class475.field6543.method2685(var59, -83).method1825(var60, (byte) -58);
        } else if (arg0 == 256) {
            if (class77.field1007 == arg1) {
                int var61 = class660.field9184.method2845(-1);
                int var62 = class660.field9184.method2846((byte) -69);
                int var63 = class660.field9184.method2838((byte) -2);
                int var64 = (7 & var63) + class486.field6679;
                int var65 = class613.field8555 + var64;
                int var66 = ((var63 & 125) >> 4) + class190.field2723;
                int var67 = class498.field6774 + var66;
                int var68 = class660.field9184.method2816(0);
                if (class409.field5813 != var62) {
                    boolean var69 = ~var66 <= -1 && ~var64 <= -1 && ~var66 > ~class401.field5620 && var64 < class257.field3508;
                    if (var69 || class492.method2783(class273.field3739, arg0 + -181)) {
                        class430.method2470(var65, new class623(var68, var61), var67, 1, class190.field2724);
                        if (var69) {
                            class672.method3793((byte) -123, var64, class190.field2724, var66);
                        }
                    }
                }
            } else if (class89.field1280 == arg1) {
                int var70 = class660.field9184.method2846((byte) -69);
                int var71 = class660.field9184.method2867(-2);
                int var72 = class660.field9184.method2838((byte) -2);
                int var73 = (var72 & 7) + class486.field6679;
                int var74 = class613.field8555 + var73;
                int var75 = class190.field2723 - -(var72 >> 4 & 7);
                int var76 = class498.field6774 + var75;
                boolean var77 = ~var75 <= -1 && ~var73 <= -1 && ~var75 > ~class401.field5620 && var73 < class257.field3508;
                if (var77 || class492.method2783(class273.field3739, -115)) {
                    class430.method2470(var74, new class623(var70, var71), var76, 1, class190.field2724);
                    if (var77) {
                        class672.method3793((byte) -114, var73, class190.field2724, var75);
                    }
                }
            } else if (class285.field3912 == arg1) {
                int var78 = class660.field9184.method2874((byte) -75);
                int var79 = (var78 >> 4 & 7) + class190.field2723;
                int var80 = (var78 & 7) + class486.field6679;
                int var81 = class660.field9184.method2845(-1);
                if (~var81 == -65536) {
                    var81 = -1;
                }
                int var82 = class660.field9184.method2874((byte) -75);
                int var83 = 15 & var82 >> 4;
                int var84 = var82 & 7;
                int var85 = class660.field9184.method2874((byte) -75);
                int var86 = class660.field9184.method2874((byte) -75);
                int var87 = class660.field9184.method2845(arg0 ^ -257);
                if (var79 >= 0 && ~var80 <= -1 && ~class401.field5620 < ~var79 && ~var80 > ~class257.field3508) {
                    int var88 = var83 - -1;
                    if (class143.field2063.field1807[0] >= -var88 + var79 && var79 + var88 >= class143.field2063.field1807[0] && -var88 + var80 <= class143.field2063.field1801[0] && ~(var80 + var88) <= ~class143.field2063.field1801[0]) {
                        class129.method916(var85, var84, var86, var87, var81, arg0 ^ 321, (var79 << 16) + (class190.field2724 << 24) + (var80 << 8) + var83);
                    }
                }
            } else if (class31.field394 == arg1) {
                int var89 = class660.field9184.method2874((byte) -75);
                int var90 = ((126 & var89) >> 4) + class190.field2723;
                int var91 = (7 & var89) + class486.field6679;
                int var92 = class660.field9184.method2845(arg0 ^ -257);
                if (var92 == 65535) {
                    var92 = -1;
                }
                int var93 = class660.field9184.method2874((byte) -75);
                int var94 = (252 & var93) >> 4;
                int var95 = var93 & 7;
                int var96 = class660.field9184.method2874((byte) -75);
                int var97 = class660.field9184.method2874((byte) -75);
                int var98 = class660.field9184.method2845(-1);
                if (var90 >= 0 && ~var91 <= -1 && ~class401.field5620 < ~var90 && class257.field3508 > var91) {
                    int var99 = var94 - -1;
                    if (var90 - var99 <= class143.field2063.field1807[0] && var90 - -var99 >= class143.field2063.field1807[0] && -var99 + var91 <= class143.field2063.field1801[0] && ~class143.field2063.field1801[0] >= ~(var91 + var99)) {
                        class477.method2692(var98, var97, (class190.field2724 << 24) - (-(var90 << 16) + -(var91 << 8)) + var94, var92, var96, 117, var95, false);
                    }
                }
            } else if (class356.field4724 == arg1) {
                int var100 = class660.field9184.method2874((byte) -75);
                int var101 = ((248 & var100) >> 4) + class190.field2723 * 2;
                int var102 = (15 & var100) + class486.field6679 * 2;
                boolean var103 = ~class660.field9184.method2874((byte) -75) != -1;
                int var104 = class660.field9184.method2863(121) + var101;
                int var105 = class660.field9184.method2863(126) + var102;
                int var106 = class660.field9184.method2875(false);
                int var107 = class660.field9184.method2845(arg0 ^ -257);
                int var108 = 4 * class660.field9184.method2874((byte) -75);
                int var109 = 4 * class660.field9184.method2874((byte) -75);
                int var110 = class660.field9184.method2845(-1);
                int var111 = class660.field9184.method2845(arg0 + -257);
                int var112 = class660.field9184.method2874((byte) -75);
                int var113 = class660.field9184.method2845(arg0 + -257);
                if (var112 == 255) {
                    var112 = -1;
                }
                if (~var101 <= -1 && ~var102 <= -1 && ~(class401.field5620 * 2) < ~var101 && class401.field5620 * 2 > var102 && var104 >= 0 && var105 >= 0 && var104 < class257.field3508 * 2 && ~var105 > ~(class257.field3508 * 2) && ~var107 != -65536) {
                    int var114 = var113 << 2;
                    int var115 = var109 << 2;
                    int var116 = var102 * 256;
                    int var117 = var104 * 256;
                    int var118 = var105 * 256;
                    int var119 = var101 * 256;
                    int var120 = var108 << 2;
                    class198 var121 = new class198(var107, class190.field2724, class190.field2724, var119, var116, var120, class186.field2697 + var110, var111 - -class186.field2697, var112, var114, var106, var115, var103);
                    var121.method1310((byte) 119, class249.method1533(class190.field2724, var118, var117, 21) + -var115, class186.field2697 + var110, var117, var118);
                    class198.field2809.method1441(new class585(var121), 0);
                }
            } else if (class425.field5959 == arg1) {
                int var122 = class660.field9184.method2874((byte) -75);
                boolean var123 = ~(var122 & 128) != -1;
                int var124 = (7 & var122 >> 3) + class190.field2723;
                int var125 = (7 & var122) + class486.field6679;
                int var126 = class660.field9184.method2863(103) + var124;
                int var127 = var125 + class660.field9184.method2863(95);
                int var128 = class660.field9184.method2875(false);
                int var129 = class660.field9184.method2845(-1);
                int var130 = class660.field9184.method2874((byte) -75) * 4;
                int var131 = 4 * class660.field9184.method2874((byte) -75);
                int var132 = class660.field9184.method2845(-1);
                int var133 = class660.field9184.method2845(-1);
                int var134 = class660.field9184.method2874((byte) -75);
                if (var134 == 255) {
                    var134 = -1;
                }
                int var135 = class660.field9184.method2845(-1);
                if (~var124 <= -1 && var125 >= 0 && ~class401.field5620 < ~var124 && class257.field3508 > var125 && ~var126 <= -1 && var127 >= 0 && var126 < class401.field5620 && ~class257.field3508 < ~var127 && var129 != 65535) {
                    int var136 = var135 << 2;
                    int var137 = var124 * 512 + 256;
                    int var138 = var127 * 512 + 256;
                    int var139 = var126 * 512 + 256;
                    int var140 = var130 << 2;
                    int var141 = var131 << 2;
                    int var142 = var125 * 512 + 256;
                    class198 var143 = new class198(var129, class190.field2724, class190.field2724, var137, var142, var140, class186.field2697 + var132, var133 - -class186.field2697, var134, var136, var128, var141, var123);
                    var143.method1310((byte) 120, -var141 + class249.method1533(class190.field2724, var138, var139, 83), var132 - -class186.field2697, var139, var138);
                    class198.field2809.method1441(new class585(var143), arg0 ^ 256);
                }
            } else if (class206.field2883 == arg1) {
                int var144 = class660.field9184.method2816(0);
                int var145 = class660.field9184.method2843(7592);
                int var146 = (7 & var145) + class486.field6679;
                int var147 = var146 - -class613.field8555;
                int var148 = (var145 >> 4 & 7) + class190.field2723;
                int var149 = class498.field6774 + var148;
                class385 var150 = (class385) class687.field9801.method970((byte) 89, (long) (var147 << 14 | class190.field2724 << 28 | var149));
                if (var150 != null) {
                    for (class623 var151 = (class623) var150.field5460.method1436(arg0 ^ 28708); var151 != null; var151 = (class623) var150.field5460.method1443((byte) 6)) {
                        if ((32767 & var144) == var151.field8646) {
                            var151.method2340(-70);
                            break;
                        }
                    }
                    if (var150.field5460.method1435((byte) -98)) {
                        var150.method2340(arg0 ^ 337);
                    }
                    if (var148 >= 0 && ~var146 <= -1 && class401.field5620 > var148 && var146 < class257.field3508) {
                        class672.method3793((byte) 110, var146, class190.field2724, var148);
                    }
                }
            } else if (class281.field3847 == arg1) {
                int var152 = class660.field9184.method2874((byte) -75);
                int var153 = (var152 & 7) + class486.field6679;
                int var154 = class613.field8555 + var153;
                int var155 = (var152 >> 4 & 7) + class190.field2723;
                int var156 = class498.field6774 + var155;
                int var157 = class660.field9184.method2845(-1);
                int var158 = class660.field9184.method2845(-1);
                int var159 = class660.field9184.method2845(-1);
                if (class687.field9801 != null) {
                    class385 var160 = (class385) class687.field9801.method970((byte) 89, (long) (var154 << 14 | class190.field2724 << 28 | var156));
                    if (var160 != null) {
                        for (class623 var161 = (class623) var160.field5460.method1436(28964); var161 != null; var161 = (class623) var160.field5460.method1443((byte) 6)) {
                            if ((var157 & 32767) == var161.field8646 && var161.field8645 == var158) {
                                var161.method2340(105);
                                var161.field8645 = var159;
                                class430.method2470(var154, var161, var156, 1, class190.field2724);
                                break;
                            }
                        }
                        if (~var155 <= -1 && var153 >= 0 && ~var155 > ~class401.field5620 && ~class257.field3508 < ~var153) {
                            class672.method3793((byte) -122, var153, class190.field2724, var155);
                        }
                    }
                }
            } else if (class283.field3876 == arg1) {
                int var162 = class660.field9184.method2874((byte) -75);
                int var163 = var162 >> 2;
                int var164 = var162 & 3;
                int var165 = class586.field8254[var163];
                int var166 = class660.field9184.method2846((byte) -69);
                int var167 = class660.field9184.method2831(true);
                int var168 = (7 & var167 >> 4) + class190.field2723;
                int var169 = (7 & var167) + class486.field6679;
                if (class492.method2783(class273.field3739, arg0 ^ 317) || var168 >= 0 && ~var169 <= -1 && class401.field5620 > var168 && var169 < class257.field3508) {
                    class115.method824(var168, var165, var163, 3, -1, var169, var164, 0, var166, class190.field2724);
                }
            } else if (class357.field4732 == arg1) {
                class660.field9184.method2874((byte) -75);
                int var170 = class660.field9184.method2874((byte) -75);
                int var171 = (var170 >> 4 & 7) + class190.field2723;
                int var172 = class486.field6679 - -(7 & var170);
                int var173 = class660.field9184.method2845(-1);
                int var174 = class660.field9184.method2874((byte) -75);
                int var175 = class660.field9184.method2819((byte) 72);
                String var176 = class660.field9184.method2851((byte) -92);
                class629.method3521(var174, var175, false, var176, var172, var173, var171, class190.field2724);
            } else if (class594.field8308 != arg1) {
                class413.method2400("T3 - " + arg1, (Throwable) null, (byte) -50);
                class9.method35((byte) -127, false);
            } else {
                int var177 = class660.field9184.method2843(7592);
                int var178 = var177 >> 2;
                int var179 = var177 & 3;
                int var180 = class586.field8254[var178];
                int var181 = class660.field9184.method2843(7592);
                int var182 = ((var181 & 121) >> 4) + class190.field2723;
                int var183 = (7 & var181) + class486.field6679;
                if (class492.method2783(class273.field3739, arg0 + -380) || ~var182 <= -1 && ~var183 <= -1 && ~class401.field5620 < ~var182 && ~class257.field3508 < ~var183) {
                    class115.method824(var182, var180, var178, 3, -1, var183, var179, 0, -1, class190.field2724);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "(I)V")
    public static void method576(int arg0) {
        field952 = null;
        if (arg0 != 0) {
            field952 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field950;
        if (arg0 != 1) {
            method575(-67, (class596) null);
        }
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            int[] var4 = this.method294(arg1 + -1 & class649.field9002, 0, (byte) -115);
            int[] var5 = this.method294(arg1, 0, (byte) -121);
            int[] var6 = this.method294(class649.field9002 & arg1 + 1, 0, (byte) 116);
            for (int var7 = 0; ~class31.field399 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field953;
                int var9 = (var5[class353.field4694 & var7 - -1] + -var5[var7 + -1 & class353.field4694]) * this.field953;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 - -var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg0 <= 100) {
            this.method48(56, 86);
        }
        if (arg1 == 0) {
            this.field953 = arg2.method2845(-1);
        }
        ++field949;
    }
}
