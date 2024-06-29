import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class350 {

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public int field4950;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "[I")
    public static int[] field4951 = new int[1];

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field4958 = 0;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2257(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class583.field8210[var1] = true;
        }
        field4955++;
        if (arg0 != -101) {
            method2258(-79, 105, -30);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(III)Z", line = 22)
    public static final boolean method2258(int arg0, int arg1, int arg2) {
        field4952++;
        if (arg1 != -10698) {
            method2259(null, 18);
        }
        boolean var3 = (arg0 & 0x37) == 0 ? class748.method4157(arg0, arg2, 55) : class2.method8(arg0, arg2, arg1 ^ 0x5377);
        return var3 | (arg2 & 0x10000) != 0 | class37.method211((byte) 33, arg0, arg2);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lbd;I)V", line = 35)
    public static final void method2259(class60 arg0, int arg1) {
        field4959++;
        if (class614.field8602 == arg0) {
            int var2 = class89.field1072.method3750((byte) 35);
            int var3 = ((var2 & 0x7F) >> 4) + class14.field266;
            int var4 = class169.field2313 + (var2 & 0x7);
            int var5 = class89.field1072.method3757((byte) -65);
            int var6 = class89.field1072.method3750((byte) 35);
            int var7 = class89.field1072.method3757((byte) -65);
            int var8 = class89.field1072.method3750((byte) 35);
            if (var3 >= 0 && var4 >= 0 && class336.field4683 > var3 && class700.field9768 > var4) {
                int var9 = var3 * 512 + 256;
                int var10 = var4 * 512 + 256;
                int var11 = class412.field5817;
                if (var11 < 3 && class364.method2319((byte) -126, var3, var4)) {
                    var11++;
                }
                class646 var12 = new class646(var5, var7, class740.field10285, class412.field5817, var11, var9, class469.method2798(69, var10, class412.field5817, var9) - var6, var10, var3, var3, var4, var4, var8);
                class670.field9095.method2770((byte) -13, new class296(var12));
            }
        } else if (class94.field1103 == arg0) {
            int var13 = class89.field1072.method3750((byte) 35);
            int var14 = (var13 & 0x7) + class169.field2313;
            int var15 = class3.field30 + var14;
            int var16 = class14.field266 + (var13 >> 4 & 0x7);
            int var17 = class228.field3063 + var16;
            int var18 = class89.field1072.method3757((byte) -65);
            int var19 = class89.field1072.method3757((byte) -65);
            int var20 = class89.field1072.method3757((byte) -65);
            if (class178.field2391 != null) {
                class338 var21 = (class338) class178.field2391.method1180((byte) 26, (long) (var15 << 14 | class412.field5817 << 28 | var17));
                if (var21 != null) {
                    for (class446 var22 = (class446) var21.field4698.method2765(-12261); var22 != null; var22 = (class446) var21.field4698.method2759(-15361)) {
                        if ((var18 & 0x7FFF) == var22.field6325 && var22.field6322 == var19) {
                            var22.method1185(-127);
                            var22.field6322 = var20;
                            class343.method2221((byte) -112, var22, class412.field5817, var17, var15);
                            break;
                        }
                    }
                    if (var16 >= 0 && var14 >= 0 && var16 < class336.field4683 && var14 < class700.field9768) {
                        class64.method541(var14, var16, arg1 - 10614, class412.field5817);
                    }
                }
            }
        } else if (class133.field1951 == arg0) {
            int var23 = class89.field1072.method3750((byte) 35);
            int var24 = (var23 >> 4 & 0xF) + class14.field266 * 2;
            int var25 = class169.field2313 * 2 + (var23 & 0xF);
            int var26 = class89.field1072.method3750((byte) 35);
            boolean var27 = (var26 & 0x1) != 0;
            boolean var28 = (var26 & 0x2) != 0;
            int var29 = var28 ? var26 >> 2 : -1;
            int var30 = class89.field1072.method3719(arg1 ^ 0x917984CF) + var24;
            int var31 = var25 + class89.field1072.method3719(1854307120);
            int var32 = class89.field1072.method3706((byte) -121);
            int var33 = class89.field1072.method3706((byte) 84);
            int var34 = class89.field1072.method3757((byte) -65);
            int var35 = class89.field1072.method3750((byte) 35);
            int var36;
            if (var28) {
                var36 = (byte) var35;
            } else {
                var36 = var35 * 4;
            }
            int var37 = class89.field1072.method3750((byte) 35) * 4;
            int var38 = class89.field1072.method3757((byte) -65);
            int var39 = class89.field1072.method3757((byte) -65);
            int var40 = class89.field1072.method3750((byte) 35);
            if (var40 == 255) {
                var40 = -1;
            }
            int var41 = class89.field1072.method3757((byte) -65);
            if (var24 >= 0 && var25 >= 0 && (class336.field4683 * 2) > var24 && var25 < class336.field4683 * 2 && var30 >= 0 && var31 >= 0 && (class700.field9768 * 2) > var30 && var31 < class700.field9768 * 2 && var34 != 65535) {
                int var42 = var41 << 2;
                int var43 = var25 * 256;
                int var44 = var37 << 2;
                int var45 = var24 * 256;
                int var46 = var36 << 2;
                int var47 = var30 * 256;
                int var48 = var31 * 256;
                if (var32 != 0 && var29 != -1) {
                    class564 var49 = null;
                    if (var32 >= 0) {
                        int var50 = var32 - 1;
                        class740 var51 = (class740) class373.field5230.method1180((byte) 26, (long) var50);
                        if (var51 != null) {
                            var49 = var51.field10289;
                        }
                    } else {
                        int var52 = -var32 - 1;
                        if (class389.field5512 == var52) {
                            var49 = class660.field9039;
                        } else {
                            var49 = class309.field4311[var52];
                        }
                    }
                    if (var49 != null) {
                        class224 var53 = var49.method3247(21816);
                        if (var53.field3016 != null && var53.field3016[var29] != null) {
                            var46 -= var53.field3016[var29][1];
                        }
                        if (var53.field2981 != null && var53.field2981[var29] != null) {
                            var46 -= var53.field2981[var29][1];
                        }
                    }
                }
                class182 var54 = new class182(var34, class412.field5817, class412.field5817, var45, var43, var46, class740.field10285 + var38, var39 - -class740.field10285, var40, var42, var32, var33, var44, var27, var29);
                var54.method1147(class469.method2798(80, var48, class412.field5817, var47) - var44, var47, 0, var48, class740.field10285 + var38);
                class310.field4316.method2770((byte) -13, new class651(var54));
            }
        } else if (class54.field623 == arg0) {
            int var55 = class89.field1072.method3736(true);
            int var56 = var55 >> 2;
            int var57 = var55 & 0x3;
            int var58 = class141.field2026[var56];
            int var59 = class89.field1072.method3750((byte) 35);
            int var60 = class14.field266 + (var59 >> 4 & 0x7);
            int var61 = class169.field2313 + (var59 & 0x7);
            if (class674.method3687(0, class650.field8937) || var60 >= 0 && var61 >= 0 && var60 < class336.field4683 && var61 < class700.field9768) {
                class248.method1581(var56, -1, var60, var61, var57, (byte) 123, class412.field5817, var58, -1, 0);
            }
        } else if (class575.field8135 == arg0) {
            int var62 = class89.field1072.method3757((byte) -65);
            int var63 = class89.field1072.method3688(7925);
            int var64 = (var63 & 0x7) + class169.field2313;
            int var65 = class3.field30 + var64;
            int var66 = class14.field266 + (var63 >> 4 & 0x7);
            int var67 = class228.field3063 + var66;
            int var68 = class89.field1072.method3734(125);
            boolean var69 = var66 >= 0 && var64 >= 0 && class336.field4683 > var66 && var64 < class700.field9768;
            if (var69 || class674.method3687(~arg1, class650.field8937)) {
                class343.method2221((byte) -117, new class446(var68, var62), class412.field5817, var67, var65);
                if (var69) {
                    class64.method541(var64, var66, arg1 - 10614, class412.field5817);
                }
            }
        } else if (class174.field2355 == arg0) {
            int var70 = class89.field1072.method3750((byte) 35);
            int var71 = (var70 >> 4 & 0x7) + class14.field266;
            int var72 = class169.field2313 + (var70 & 0x7);
            int var73 = class89.field1072.method3757((byte) -65);
            if (var73 == 65535) {
                var73 = -1;
            }
            int var74 = class89.field1072.method3750((byte) 35);
            int var75 = var74 >> 4 & 0xF;
            int var76 = var74 & 0x7;
            int var77 = class89.field1072.method3750((byte) 35);
            int var78 = class89.field1072.method3750((byte) 35);
            int var79 = class89.field1072.method3757((byte) -65);
            if (var71 >= 0 && var72 >= 0 && var71 < class336.field4683 && class700.field9768 > var72) {
                int var80 = var75 + 1;
                if ((var71 - var80) <= class660.field9039.field8009[0] && class660.field9039.field8009[0] <= (var71 + var80) && class660.field9039.field8015[0] >= var72 - var80 && (var72 + var80) >= class660.field9039.field8015[0]) {
                    class43.method291((byte) 1, (var71 << 16) + (class412.field5817 << 24) + (var72 << 8) + var75, var78, var73, var77, var79, var76);
                }
            }
        } else if (class84.field1047 == arg0) {
            int var81 = class89.field1072.method3750((byte) 35);
            boolean var82 = (var81 & 0x80) != 0;
            int var83 = class14.field266 + (var81 >> 3 & 0x7);
            int var84 = class169.field2313 + (var81 & 0x7);
            int var85 = var83 + class89.field1072.method3719(1854307120);
            int var86 = class89.field1072.method3719(arg1 ^ 0x917984CF) + var84;
            int var87 = class89.field1072.method3706((byte) 25);
            int var88 = class89.field1072.method3757((byte) -65);
            int var89 = class89.field1072.method3750((byte) 35) * 4;
            int var90 = class89.field1072.method3750((byte) 35) * 4;
            int var91 = class89.field1072.method3757((byte) -65);
            int var92 = class89.field1072.method3757((byte) -65);
            int var93 = class89.field1072.method3750((byte) 35);
            int var94 = class89.field1072.method3757((byte) -65);
            if (var93 == 255) {
                var93 = -1;
            }
            if (var83 >= 0 && var84 >= 0 && class336.field4683 > var83 && var84 < class700.field9768 && var85 >= 0 && var86 >= 0 && var85 < class336.field4683 && class700.field9768 > var86 && var88 != 65535) {
                int var95 = var94 << 2;
                int var96 = var84 * 512 + 256;
                int var97 = var90 << 2;
                int var98 = var83 * 512 + 256;
                int var99 = var86 * 512 + 256;
                int var100 = var89 << 2;
                int var101 = var85 * 512 + 256;
                class182 var102 = new class182(var88, class412.field5817, class412.field5817, var98, var96, var100, class740.field10285 + var91, class740.field10285 + var92, var93, var95, 0, var87, var97, var82, -1);
                var102.method1147(class469.method2798(arg1 + 88, var99, class412.field5817, var101) - var97, var101, 0, var99, var91 + class740.field10285);
                class310.field4316.method2770((byte) -13, new class651(var102));
            }
        } else if (class134.field1953 == arg0) {
            class89.field1072.method3750((byte) 35);
            int var103 = class89.field1072.method3750((byte) 35);
            int var104 = ((var103 & 0x76) >> 4) + class14.field266;
            int var105 = (var103 & 0x7) + class169.field2313;
            int var106 = class89.field1072.method3757((byte) -65);
            int var107 = class89.field1072.method3750((byte) 35);
            int var108 = class89.field1072.method3756(false);
            String var109 = class89.field1072.method3697(-1);
            class531.method3099(var107, false, var109, var104, var106, class412.field5817, var105, var108);
        } else if (class661.field9052 == arg0) {
            int var110 = class89.field1072.method3717(25651);
            int var111 = class89.field1072.method3717(25651);
            int var112 = class89.field1072.method3736(true);
            int var113 = (var112 & 0x7) + class169.field2313;
            int var114 = class3.field30 + var113;
            int var115 = ((var112 & 0x74) >> 4) + class14.field266;
            int var116 = class228.field3063 + var115;
            int var117 = class89.field1072.method3744(true);
            if (class389.field5512 != var117) {
                boolean var118 = var115 >= 0 && var113 >= 0 && var115 < class336.field4683 && class700.field9768 > var113;
                if (var118 || class674.method3687(0, class650.field8937)) {
                    class343.method2221((byte) -80, new class446(var111, var110), class412.field5817, var116, var114);
                    if (var118) {
                        class64.method541(var113, var115, arg1 ^ 0x2976, class412.field5817);
                    }
                }
            }
        } else if (class263.field3792 == arg0) {
            int var119 = class89.field1072.method3744(true);
            int var120 = class89.field1072.method3736(true);
            int var121 = (var120 & 0x7) + class169.field2313;
            int var122 = class3.field30 + var121;
            int var123 = ((var120 & 0x79) >> 4) + class14.field266;
            int var124 = class228.field3063 + var123;
            class338 var125 = (class338) class178.field2391.method1180((byte) 26, (long) (var124 | var122 << 14 | class412.field5817 << 28));
            if (var125 != null) {
                for (class446 var126 = (class446) var125.field4698.method2765(arg1 ^ 0x2FE4); var126 != null; var126 = (class446) var125.field4698.method2759(arg1 ^ 0x3C00)) {
                    if ((var119 & 0x7FFF) == var126.field6325) {
                        var126.method1185(arg1 ^ 0x1B);
                        break;
                    }
                }
                if (var125.field4698.method2757((byte) 27)) {
                    var125.method1185(-91);
                }
                if (var123 >= 0 && var121 >= 0 && class336.field4683 > var123 && class700.field9768 > var121) {
                    class64.method541(var121, var123, -10615, class412.field5817);
                }
            }
        } else {
            if (arg1 != -1) {
                method2259(null, 97);
            }
            if (class194.field2590 == arg0) {
                int var127 = class89.field1072.method3750((byte) 35);
                int var128 = ((var127 & 0x78) >> 4) + class14.field266;
                int var129 = class169.field2313 + (var127 & 0x7);
                int var130 = class89.field1072.method3757((byte) -65);
                if (var130 == 65535) {
                    var130 = -1;
                }
                int var131 = class89.field1072.method3750((byte) 35);
                int var132 = (var131 & 0xF1) >> 4;
                int var133 = var131 & 0x7;
                int var134 = class89.field1072.method3750((byte) 35);
                int var135 = class89.field1072.method3750((byte) 35);
                int var136 = class89.field1072.method3757((byte) -65);
                if (var128 >= 0 && var129 >= 0 && class336.field4683 > var128 && var129 < class700.field9768) {
                    int var137 = var132 + 1;
                    if (class660.field9039.field8009[0] >= (var128 - var137) && (var128 + var137) >= class660.field9039.field8009[0] && class660.field9039.field8015[0] >= (var129 - var137) && (var129 + var137) >= class660.field9039.field8015[0]) {
                        class516.method3032(var134, -18, var133, false, (class412.field5817 << 24) + (var128 << 16) + (var129 << 8) + var132, var135, var130, var136);
                    }
                }
            } else if (class578.field8163 == arg0) {
                int var138 = class89.field1072.method3710(-6067);
                int var139 = ((var138 & 0x7D) >> 4) + class14.field266;
                int var140 = (var138 & 0x7) + class169.field2313;
                int var141 = class89.field1072.method3688(arg1 + 7926);
                int var142 = var141 >> 2;
                int var143 = var141 & 0x3;
                int var144 = class141.field2026[var142];
                int var145 = class89.field1072.method3717(arg1 + 25652);
                if (var145 == 65535) {
                    var145 = -1;
                }
                class604.method3394(var144, var140, false, var142, var143, class412.field5817, var139, var145);
            } else if (class220.field2880 == arg0) {
                int var146 = class89.field1072.method3757((byte) -65);
                int var147 = class89.field1072.method3750((byte) 35);
                class612.field8588.method558((byte) 8, var146).method60(true, var147);
            } else if (class639.field8788 == arg0) {
                int var148 = class89.field1072.method3757((byte) -65);
                int var149 = class89.field1072.method3710(arg1 ^ 0x17B2);
                int var150 = ((var149 & 0x7B) >> 4) + class14.field266;
                int var151 = (var149 & 0x7) + class169.field2313;
                int var152 = class89.field1072.method3750((byte) 35);
                int var153 = var152 >> 2;
                int var154 = var152 & 0x3;
                int var155 = class141.field2026[var153];
                if (class674.method3687(0, class650.field8937) || var150 >= 0 && var151 >= 0 && class336.field4683 > var150 && var151 < class700.field9768) {
                    class248.method1581(var153, var148, var150, var151, var154, (byte) 125, class412.field5817, var155, -1, 0);
                }
            } else {
                class248.method1583((byte) -45, "T3 - " + arg0, null);
                class415.method2550(false, -25626);
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "([[[Lwq;IIZII)Z", line = 623)
    public static final boolean method2260(class165[][][] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg5 != 6721) {
            return false;
        }
        field4957++;
        byte var6 = arg3 ? 1 : (byte) (class82.field1033 & 0xFF);
        if (class741.field10305[class526.field7430][arg2][arg1] == var6) {
            return false;
        } else if ((class651.field8948[class526.field7430][arg2][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class295.field4162[var7] = arg2;
            int var35 = var7 + 1;
            class317.field4406[var7] = arg1;
            class741.field10305[class526.field7430][arg2][arg1] = var6;
            while (var35 != var8) {
                int var9 = class295.field4162[var8] & 0xFFFF;
                int var10 = (class295.field4162[var8] & 0xFFAB82) >> 16;
                int var11 = class295.field4162[var8] >> 24 & 0xFF;
                int var12 = class317.field4406[var8] & 0xFFFF;
                int var13 = (class317.field4406[var8] & 0xFFBD68) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class651.field8948[class526.field7430][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                if (arg0 != null) {
                    label244: for (int var16 = class526.field7430 + 1; var16 <= 3; var16++) {
                        if (arg0[var16] != null && (class651.field8948[var16][var9][var12] & 0x8) == 0) {
                            if (var14 && arg0[var16][var9][var12] != null) {
                                if (arg0[var16][var9][var12].field2269 != null) {
                                    int var17 = class606.method3412(-86, var10);
                                    if (arg0[var16][var9][var12].field2269.field6312 == var17 || arg0[var16][var9][var12].field2265 != null && arg0[var16][var9][var12].field2265.field6312 == var17) {
                                        continue;
                                    }
                                    if (var11 != 0) {
                                        int var18 = class606.method3412(69, var11);
                                        if (arg0[var16][var9][var12].field2269.field6312 == var18 || arg0[var16][var9][var12].field2265 != null && arg0[var16][var9][var12].field2265.field6312 == var18) {
                                            continue;
                                        }
                                    }
                                    if (var13 != 0) {
                                        int var19 = class606.method3412(109, var13);
                                        if (arg0[var16][var9][var12].field2269.field6312 == var19 || arg0[var16][var9][var12].field2265 != null && arg0[var16][var9][var12].field2265.field6312 == var19) {
                                            continue;
                                        }
                                    }
                                }
                                class165 var20 = arg0[var16][var9][var12];
                                if (var20.field2270 != null) {
                                    for (class356 var21 = var20.field2270; var21 != null; var21 = var21.field5066) {
                                        class524 var22 = var21.field5067;
                                        if (var22 instanceof class706) {
                                            class706 var23 = (class706) var22;
                                            int var24 = var23.method868((byte) -10);
                                            int var25 = var23.method865(30374);
                                            if (var24 == 21) {
                                                var24 = 19;
                                            }
                                            int var26 = var25 << 6 | var24;
                                            if (var10 == var26 || var11 != 0 && var11 == var26 || var13 != 0 && var13 == var26) {
                                                continue label244;
                                            }
                                        }
                                    }
                                }
                            }
                            class165 var27 = arg0[var16][var9][var12];
                            if (var27 != null && var27.field2270 != null) {
                                for (class356 var28 = var27.field2270; var28 != null; var28 = var28.field5066) {
                                    class524 var29 = var28.field5067;
                                    if (var29.field7415 != var29.field7413 || var29.field7418 != var29.field7409) {
                                        for (int var30 = var29.field7415; var30 <= var29.field7413; var30++) {
                                            for (int var31 = var29.field7418; var31 <= var29.field7409; var31++) {
                                                class741.field10305[var16][var30][var31] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            var15 = true;
                            class741.field10305[var16][var9][var12] = var6;
                        }
                    }
                }
                if (var15) {
                    int var32 = class459.field6474[class526.field7430 + 1].method1816((byte) 125, var12, var9);
                    if (var32 > class418.field5909[arg4]) {
                        class418.field5909[arg4] = var32;
                    }
                    int var33 = var9 << 9;
                    if (var33 < class402.field5702[arg4]) {
                        class402.field5702[arg4] = var33;
                    } else if (class267.field3817[arg4] < var33) {
                        class267.field3817[arg4] = var33;
                    }
                    int var34 = var12 << 9;
                    if (var34 < class394.field5582[arg4]) {
                        class394.field5582[arg4] = var34;
                    } else if (var34 > class307.field4297[arg4]) {
                        class307.field4297[arg4] = var34;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class741.field10305[class526.field7430][var9 - 1][var12] != var6) {
                        class295.field4162[var35] = class325.method2116(-754974720, class325.method2116(var9 - 1, 1179648));
                        class317.field4406[var35] = class325.method2116(1245184, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class741.field10305[class526.field7430][var9 - 1][var12] = var6;
                    }
                    int var10000 = ~class700.field9768;
                    var12++;
                    if (var10000 < ~var12) {
                        if (var9 - 1 >= 0 && class741.field10305[class526.field7430][var9 - 1][var12] != var6 && (class651.field8948[class526.field7430][var9][var12] & 0x4) == 0 && (class651.field8948[class526.field7430][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class295.field4162[var35] = class325.method2116(1375731712, class325.method2116(1179648, var9 - 1));
                            class317.field4406[var35] = class325.method2116(1245184, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class741.field10305[class526.field7430][var9 - 1][var12] = var6;
                        }
                        if (class741.field10305[class526.field7430][var9][var12] != var6) {
                            class295.field4162[var35] = class325.method2116(318767104, class325.method2116(var9, 5373952));
                            class317.field4406[var35] = class325.method2116(var12, 5439488);
                            class741.field10305[class526.field7430][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class336.field4683 && class741.field10305[class526.field7430][var9 + 1][var12] != var6 && (class651.field8948[class526.field7430][var9][var12] & 0x4) == 0 && (class651.field8948[class526.field7430][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class295.field4162[var35] = class325.method2116(class325.method2116(var9 + 1, 5373952), -1845493760);
                            class317.field4406[var35] = class325.method2116(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class741.field10305[class526.field7430][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < class336.field4683 && class741.field10305[class526.field7430][var9 + 1][var12] != var6) {
                        class295.field4162[var35] = class325.method2116(class325.method2116(var9 + 1, 9568256), 1392508928);
                        class317.field4406[var35] = class325.method2116(9633792, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class741.field10305[class526.field7430][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class741.field10305[class526.field7430][var9 - 1][var12] != var6 && (class651.field8948[class526.field7430][var9][var12] & 0x4) == 0 && (class651.field8948[class526.field7430][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class295.field4162[var35] = class325.method2116(class325.method2116(13762560, var9 - 1), 301989888);
                            class317.field4406[var35] = class325.method2116(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class741.field10305[class526.field7430][var9 - 1][var12] = var6;
                        }
                        if (class741.field10305[class526.field7430][var9][var12] != var6) {
                            class295.field4162[var35] = class325.method2116(class325.method2116(13762560, var9), -1828716544);
                            class317.field4406[var35] = class325.method2116(13828096, var12);
                            class741.field10305[class526.field7430][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class336.field4683 && class741.field10305[class526.field7430][var9 + 1][var12] != var6 && (class651.field8948[class526.field7430][var9][var12] & 0x4) == 0 && (class651.field8948[class526.field7430][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class295.field4162[var35] = class325.method2116(class325.method2116(var9 + 1, 9568256), -771751936);
                            class317.field4406[var35] = class325.method2116(var12, 9633792);
                            class741.field10305[class526.field7430][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class418.field5909[arg4] != -1000000) {
                class418.field5909[arg4] += 40;
                class402.field5702[arg4] -= 512;
                class267.field3817[arg4] += 512;
                class307.field4297[arg4] += 512;
                class394.field5582[arg4] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rq", name = "toString", descriptor = "()Ljava/lang/String;", line = 953)
    public final String toString() {
        field4953++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)I", line = 968)
    public final int method2261(int arg0) {
        field4956++;
        int var2 = 63 / ((arg0 + 47) / 54);
        return this.field4950;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 980)
    public class350(String arg0, int arg1) {
        this.field4950 = arg1;
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)V", line = 991)
    public static void method2262(int arg0) {
        if (arg0 == -25086) {
            field4951 = null;
        }
    }
}
