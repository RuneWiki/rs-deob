import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class626 {

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "[S")
    public short[] field8935;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "[I")
    public int[] field8933;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "J")
    public long field8939;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "[S")
    public short[] field8934;

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8946 = new String[] { method4602(method4601("i{u\u0000\u001bf}/\u0002Z")), method4602(method4601("s:u\u0012\u000f")), method4602(method4601("fa7P")), method4602(method4601("i{uxZ")), method4602(method4601("i{u}Z")), method4602(method4601("i{u~Z")), method4602(method4601("i{uyZ")), method4602(method4601("i{u{Z")), method4602(method4601("i{uzZ")), method4602(method4601("i{utZ")), method4602(method4601("i{u\u007fZ")), method4602(method4601("\\'{\u0011R")) };

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "Lpi;")
    public static class217 field8937 = new class217(true);

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field8941;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public static int field8944;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "Lda;")
    public static class216 field8945;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)I", line = 7)
    public static final int method4593(int arg0, int arg1) {
        try {
            field8941++;
            if (arg0 != 3) {
                return 56;
            }
            int var2 = 0;
            if (arg1 < 0 || arg1 >= 65536) {
                var2 += 16;
                arg1 >>>= 0x10;
            }
            if (arg1 >= 256) {
                var2 += 8;
                arg1 >>>= 0x8;
            }
            if (arg1 >= 16) {
                arg1 >>>= 0x4;
                var2 += 4;
            }
            if (arg1 >= 4) {
                arg1 >>>= 0x2;
                var2 += 2;
            }
            if (arg1 >= 1) {
                arg1 >>>= 0x1;
                var2++;
            }
            return arg1 + var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8946[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILjc;)Lqba;", line = 54)
    public static final class691 method4594(int arg0, class711 arg1) {
        try {
            if (arg0 != 0) {
                method4593(91, -15);
            }
            field8940++;
            return new class691(arg1.method5087((byte) -26), arg1.method5087((byte) -26), arg1.method5087((byte) -26), arg1.method5087((byte) -26), arg1.method5085(true), arg1.method5085(true), arg1.method5128(arg0));
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8946[7] + arg0 + ',' + (arg1 == null ? field8946[2] : field8946[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BLlf;)V", line = 66)
    public static final void method4595(byte arg0, class260 arg1) {
        try {
            field8942++;
            class476 var2 = class60.field916.field11099;
            if (class444.field6551 == arg1) {
                int var3 = var2.method5128(0);
                int var4 = (var3 & 0x7) + class12.field165;
                int var5 = class655.field9286 + var4;
                int var6 = ((var3 & 0x7C) >> 4) + class184.field2378;
                int var7 = var6 + class537.field7895;
                int var8 = var2.method5116((byte) -126);
                int var9 = var2.method5116((byte) -117);
                int var10 = var2.method5116((byte) -126);
                if (class414.field5965 != null) {
                    class413 var11 = (class413) class414.field5965.method3693(false, (long) (var5 << 14 | class736.field10488 << 28 | var7));
                    if (var11 != null) {
                        for (class197 var12 = (class197) var11.field5934.method3977((byte) -30); var12 != null; var12 = (class197) var11.field5934.method3987(0)) {
                            if ((var8 & 0x7FFF) == var12.field2926 && var12.field2925 == var9) {
                                var12.method4294(0);
                                var12.field2925 = var10;
                                class438.method3417(var12, var7, class736.field10488, 68, var5);
                                break;
                            }
                        }
                        if (var6 >= 0 && var4 >= 0 && class625.field8929 > var6 && var4 < class14.field187) {
                            class757.method5489(var4, (byte) -120, class736.field10488, var6);
                        }
                    }
                }
            } else if (class507.field7432 == arg1) {
                int var13 = var2.method5128(arg0 - 5);
                boolean var14 = (var13 & 0x80) != 0;
                int var15 = class184.field2378 + ((var13 & 0x3B) >> 3);
                int var16 = class12.field165 + (var13 & 0x7);
                int var17 = var2.method5125((byte) -91) + var15;
                int var18 = var2.method5125((byte) 98) + var16;
                int var19 = var2.method5087((byte) -26);
                int var20 = var2.method5116((byte) -119);
                int var21 = var2.method5128(arg0 - 5) * 4;
                int var22 = var2.method5128(0) * 4;
                int var23 = var2.method5116((byte) -116);
                int var24 = var2.method5116((byte) -122);
                int var25 = var2.method5128(0);
                int var26 = var2.method5116((byte) -114);
                if (var25 == 255) {
                    var25 = -1;
                }
                if (var15 >= 0 && var16 >= 0 && var15 < class625.field8929 && var16 < class14.field187 && var17 >= 0 && var18 >= 0 && class625.field8929 > var17 && var18 < class14.field187 && var20 != 65535) {
                    int var27 = var26 << 2;
                    int var28 = var21 << 2;
                    int var29 = var18 * 512 + 256;
                    int var30 = var16 * 512 + 256;
                    int var31 = var22 << 2;
                    int var32 = var17 * 512 + 256;
                    int var33 = var15 * 512 + 256;
                    class747 var34 = new class747(var20, class736.field10488, class736.field10488, var33, var30, var28, var23 + class694.field9700, var24 - -class694.field9700, var25, var27, 0, var19, var31, var14, -1);
                    var34.method5403(16383, class100.method977(arg0 - 6, var29, class736.field10488, var32) - var31, var29, class694.field9700 + var23, var32);
                    class574.field8309.method3984(new class489(var34), 0);
                }
            } else if (class648.field9207 == arg1) {
                int var35 = var2.method5134(arg0 - 18637);
                int var36 = ((var35 & 0x7E) >> 4) + class184.field2378;
                int var37 = (var35 & 0x7) + class12.field165;
                int var38 = var2.method5140((byte) -2);
                if (var38 == 65535) {
                    var38 = -1;
                }
                int var39 = var2.method5119(75);
                int var40 = var39 >> 2;
                int var41 = var39 & 0x3;
                int var42 = class118.field1501[var40];
                class490.method3774(var36, var38, class736.field10488, var40, var42, var37, (byte) 100, var41);
            } else if (class592.field8525 == arg1) {
                int var43 = var2.method5128(arg0 - 5);
                int var44 = (var43 >> 4 & 0x7) + class184.field2378;
                int var45 = (var43 & 0x7) + class12.field165;
                int var46 = var2.method5116((byte) -120);
                if (var46 == 65535) {
                    var46 = -1;
                }
                int var47 = var2.method5128(0);
                int var48 = (var47 & 0xF3) >> 4;
                int var49 = var47 & 0x7;
                int var50 = var2.method5128(0);
                int var51 = var2.method5128(arg0 - 5);
                int var52 = var2.method5116((byte) -119);
                if (var44 >= 0 && var45 >= 0 && var44 < class625.field8929 && class14.field187 > var45) {
                    int var53 = var48 + 1;
                    if (class203.field2988.field2252[0] >= (var44 - var53) && class203.field2988.field2252[0] <= (var44 + var53) && var45 - var53 <= class203.field2988.field2256[0] && class203.field2988.field2256[0] <= var45 + var53) {
                        class637.method4641(var50, var51, var49, arg0 ^ 0x33, var46, (class736.field10488 << 24) + (var45 << 8) + (var44 << 16) + var48, var52);
                    }
                }
            } else if (class720.field10253 == arg1) {
                int var54 = var2.method5103((byte) 82);
                int var55 = var2.method5134(-18632);
                int var56 = (var55 >> 4 & 0x7) + class184.field2378;
                int var57 = (var55 & 0x7) + class12.field165;
                int var58 = var2.method5132((byte) 16);
                int var59 = var58 >> 2;
                int var60 = var58 & 0x3;
                int var61 = class118.field1501[var59];
                if (class463.method3558((byte) -32, class751.field10694) || var56 >= 0 && var57 >= 0 && class625.field8929 > var56 && var57 < class14.field187) {
                    class715.method5184(var54, var57, var56, var59, class736.field10488, arg0 ^ 0x5, var60, var61);
                }
            } else if (class97.field1306 == arg1) {
                int var62 = var2.method5140((byte) -2);
                class789 var63 = class101.field1359.method2832(121, var62);
                int var64 = var2.method5119(83);
                int var65 = class184.field2378 + ((var64 & 0x78) >> 4);
                int var66 = (var64 & 0x7) + class12.field165;
                int var67 = var2.method5132((byte) 16);
                int var68 = var2.method5119(arg0 ^ 0x5B);
                int var69 = var68 >> 2;
                int var70 = class118.field1501[var69];
                if (var69 == 11) {
                    var69 = 10;
                }
                int var71 = 0;
                if (var63.field11410 != null) {
                    int var72 = -1;
                    for (int var73 = 0; var73 < var63.field11410.length; var73++) {
                        if (var69 == var63.field11410[var73]) {
                            var72 = var73;
                            break;
                        }
                    }
                    var71 = var63.field11430[var72].length;
                }
                int var74 = 0;
                if (var63.field11476 != null) {
                    var74 = var63.field11476.length;
                }
                int var75 = 0;
                if (var63.field11380 != null) {
                    var75 = var63.field11380.length;
                }
                if ((var67 & 0x1) == 1) {
                    class739.method5361(var70, null, class736.field10488, var65, (byte) -37, var66);
                } else {
                    int[] var76 = null;
                    if ((var67 & 0x2) == 2) {
                        var76 = new int[var71];
                        for (int var77 = 0; var77 < var71; var77++) {
                            var76[var77] = var2.method5116((byte) -120);
                        }
                    }
                    short[] var78 = null;
                    if ((var67 & 0x4) == 4) {
                        var78 = new short[var74];
                        for (int var79 = 0; var79 < var74; var79++) {
                            var78[var79] = (short) var2.method5116((byte) -123);
                        }
                    }
                    short[] var80 = null;
                    if ((var67 & 0x8) == 8) {
                        var80 = new short[var75];
                        for (int var81 = 0; var81 < var75; var81++) {
                            var80[var81] = (short) var2.method5116((byte) -128);
                        }
                    }
                    class739.method5361(var70, new class626((long) (class679.field9536++), var76, var78, var80), class736.field10488, var65, (byte) -37, var66);
                }
            } else if (arg0 == 5) {
                if (class288.field4073 == arg1) {
                    var2.method5128(0);
                    int var82 = var2.method5128(0);
                    int var83 = ((var82 & 0x7C) >> 4) + class184.field2378;
                    int var84 = (var82 & 0x7) + class12.field165;
                    int var85 = var2.method5116((byte) -112);
                    int var86 = var2.method5128(0);
                    int var87 = var2.method5085(true);
                    String var88 = var2.method5144(arg0 - 16419);
                    class190.method1592(var86, var87, var84, var85, var88, class736.field10488, var83, 16384);
                } else if (class409.field5913 == arg1) {
                    int var89 = var2.method5128(arg0 - 5);
                    int var90 = ((var89 & 0xFD) >> 4) + class184.field2378 * 2;
                    int var91 = (var89 & 0xF) + class12.field165 * 2;
                    int var92 = var2.method5128(arg0 - 5);
                    boolean var93 = (var92 & 0x1) != 0;
                    boolean var94 = (var92 & 0x2) != 0;
                    int var95 = var94 ? var92 >> 2 : -1;
                    int var96 = var90 + var2.method5125((byte) 120);
                    int var97 = var91 + var2.method5125((byte) -49);
                    int var98 = var2.method5087((byte) -26);
                    int var99 = var2.method5087((byte) -26);
                    int var100 = var2.method5116((byte) -106);
                    int var101 = var2.method5128(0);
                    int var102;
                    if (var94) {
                        var102 = (byte) var101;
                    } else {
                        var102 = var101 * 4;
                    }
                    int var103 = var2.method5128(0) * 4;
                    int var104 = var2.method5116((byte) -123);
                    int var105 = var2.method5116((byte) -128);
                    int var106 = var2.method5128(0);
                    if (var106 == 255) {
                        var106 = -1;
                    }
                    int var107 = var2.method5116((byte) -115);
                    if (var90 >= 0 && var91 >= 0 && var90 < (class625.field8929 * 2) && (class625.field8929 * 2) > var91 && var96 >= 0 && var97 >= 0 && class14.field187 * 2 > var96 && var97 < (class14.field187 * 2) && var100 != 65535) {
                        int var108 = var107 << 2;
                        int var109 = var90 * 256;
                        int var110 = var102 << 2;
                        int var111 = var91 * 256;
                        int var112 = var97 * 256;
                        int var113 = var96 * 256;
                        int var114 = var103 << 2;
                        if (var98 != 0 && var95 != -1) {
                            class170 var115 = null;
                            if (var98 >= 0) {
                                int var116 = var98 - 1;
                                class527 var117 = (class527) class479.field7063.method3693(false, (long) var116);
                                if (var117 != null) {
                                    var115 = var117.field7672;
                                }
                            } else {
                                int var118 = -var98 - 1;
                                if (class241.field3470 == var118) {
                                    var115 = class203.field2988;
                                } else {
                                    var115 = class748.field10666[var118];
                                }
                            }
                            if (var115 != null) {
                                class765 var119 = var115.method1430(27750);
                                if (var119.field10884 != null && var119.field10884[var95] != null) {
                                    var110 -= var119.field10884[var95][1];
                                }
                                if (var119.field10930 != null && var119.field10930[var95] != null) {
                                    var110 -= var119.field10930[var95][1];
                                }
                            }
                        }
                        class747 var120 = new class747(var100, class736.field10488, class736.field10488, var109, var111, var110, var104 + class694.field9700, class694.field9700 + var105, var106, var108, var98, var99, var114, var93, var95);
                        var120.method5403(16383, class100.method977(-1, var112, class736.field10488, var113) - var114, var112, class694.field9700 + var104, var113);
                        class574.field8309.method3984(new class489(var120), 0);
                    }
                } else if (class279.field3939 == arg1) {
                    int var121 = var2.method5146(arg0 ^ 0xFFFF8346);
                    int var122 = var2.method5134(-18632);
                    int var123 = (var122 & 0x7) + class12.field165;
                    int var124 = class655.field9286 + var123;
                    int var125 = (var122 >> 4 & 0x7) + class184.field2378;
                    int var126 = class537.field7895 + var125;
                    int var127 = var2.method5103((byte) 62);
                    boolean var128 = var125 >= 0 && var123 >= 0 && var125 < class625.field8929 && class14.field187 > var123;
                    if (var128 || class463.method3558((byte) -71, class751.field10694)) {
                        class438.method3417(new class197(var127, var121), var126, class736.field10488, arg0 ^ 0x3F, var124);
                        if (var128) {
                            class757.method5489(var123, (byte) -81, class736.field10488, var125);
                        }
                    }
                } else if (class444.field6549 == arg1) {
                    int var129 = var2.method5119(104);
                    int var130 = var129 >> 2;
                    int var131 = var129 & 0x3;
                    int var132 = class118.field1501[var130];
                    int var133 = var2.method5128(0);
                    int var134 = class184.field2378 + ((var133 & 0x7E) >> 4);
                    int var135 = class12.field165 + (var133 & 0x7);
                    if (class463.method3558((byte) -41, class751.field10694) || var134 >= 0 && var135 >= 0 && var134 < class625.field8929 && var135 < class14.field187) {
                        class715.method5184(-1, var135, var134, var130, class736.field10488, arg0 - 5, var131, var132);
                    }
                } else if (class592.field8526 == arg1) {
                    int var136 = var2.method5119(83);
                    int var137 = (var136 & 0x7) + class12.field165;
                    int var138 = class655.field9286 + var137;
                    int var139 = (var136 >> 4 & 0x7) + class184.field2378;
                    int var140 = class537.field7895 + var139;
                    int var141 = var2.method5146(-31933);
                    class413 var142 = (class413) class414.field5965.method3693(false, (long) (var140 | class736.field10488 << 28 | var138 << 14));
                    if (var142 != null) {
                        for (class197 var143 = (class197) var142.field5934.method3977((byte) -101); var143 != null; var143 = (class197) var142.field5934.method3987(0)) {
                            if (var143.field2926 == (var141 & 0x7FFF)) {
                                var143.method4294(0);
                                break;
                            }
                        }
                        if (var142.field5934.method3974(-22016)) {
                            var142.method4294(0);
                        }
                        if (var139 >= 0 && var137 >= 0 && class625.field8929 > var139 && class14.field187 > var137) {
                            class757.method5489(var137, (byte) -52, class736.field10488, var139);
                        }
                    }
                } else if (class660.field9367 == arg1) {
                    int var144 = var2.method5116((byte) -121);
                    int var145 = var2.method5128(0);
                    class101.field1359.method2832(125, var144).method5693(arg0 ^ 0xFFFFFFA9, var145);
                } else if (class208.field3033 == arg1) {
                    int var146 = var2.method5128(0);
                    int var147 = ((var146 & 0x72) >> 4) + class184.field2378;
                    int var148 = class12.field165 + (var146 & 0x7);
                    int var149 = var2.method5116((byte) -119);
                    int var150 = var2.method5128(0);
                    int var151 = var2.method5116((byte) -105);
                    int var152 = var2.method5128(0);
                    if (var147 >= 0 && var148 >= 0 && class625.field8929 > var147 && class14.field187 > var148) {
                        int var153 = var147 * 512 + 256;
                        int var154 = var148 * 512 + 256;
                        int var155 = class736.field10488;
                        if (var155 < 3 && class23.method275(1, var147, var148)) {
                            var155++;
                        }
                        class242 var156 = new class242(var149, var151, class736.field10488, var155, var153, class100.method977(arg0 - 6, var154, class736.field10488, var153) - var150, var154, var147, var147, var148, var148, var152, false);
                        class463.field6759.method3984(new class617(var156), 0);
                    }
                } else if (class692.field9681 == arg1) {
                    int var157 = var2.method5140((byte) -2);
                    int var158 = var2.method5128(0);
                    int var159 = class12.field165 + (var158 & 0x7);
                    int var160 = class655.field9286 + var159;
                    int var161 = (var158 >> 4 & 0x7) + class184.field2378;
                    int var162 = class537.field7895 + var161;
                    int var163 = var2.method5116((byte) -115);
                    int var164 = var2.method5103((byte) 107);
                    if (class241.field3470 != var163) {
                        boolean var165 = var161 >= 0 && var159 >= 0 && var161 < class625.field8929 && class14.field187 > var159;
                        if (var165 || class463.method3558((byte) -91, class751.field10694)) {
                            class438.method3417(new class197(var164, var157), var162, class736.field10488, arg0 ^ 0x3D, var160);
                            if (var165) {
                                class757.method5489(var159, (byte) -56, class736.field10488, var161);
                            }
                        }
                    }
                } else if (class382.field5572 == arg1) {
                    int var166 = var2.method5128(0);
                    int var167 = ((var166 & 0x7C) >> 4) + class184.field2378;
                    int var168 = (var166 & 0x7) + class12.field165;
                    int var169 = var2.method5116((byte) -112);
                    if (var169 == 65535) {
                        var169 = -1;
                    }
                    int var170 = var2.method5128(arg0 - 5);
                    int var171 = var170 >> 4 & 0xF;
                    int var172 = var170 & 0x7;
                    int var173 = var2.method5128(0);
                    int var174 = var2.method5128(0);
                    int var175 = var2.method5116((byte) -109);
                    if (var167 >= 0 && var168 >= 0 && var167 < class625.field8929 && var168 < class14.field187) {
                        int var176 = var171 + 1;
                        if (class203.field2988.field2252[0] >= var167 - var176 && (var167 + var176) >= class203.field2988.field2252[0] && (var168 - var176) <= class203.field2988.field2256[0] && var168 + var176 >= class203.field2988.field2256[0]) {
                            class648.method4725((class736.field10488 << 24) + (var167 << 16) + (var168 << 8) + var171, (byte) 2, var173, var174, false, var175, var172, var169);
                        }
                    }
                } else {
                    class162.method1374(null, field8946[11] + arg1, (byte) -93);
                    class794.method5727(-1, false);
                }
            }
        } catch (RuntimeException var178) {
            throw class665.method4799(var178, field8946[10] + arg0 + ',' + (arg1 == null ? field8946[2] : field8946[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V", line = 780)
    public static void method4596(int arg0) {
        try {
            field8937 = null;
            field8945 = null;
            int var1 = 21 / ((arg0 + 15) / 44);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8946[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V", line = 790)
    public static final void method4597(int arg0, int arg1) {
        try {
            if (arg1 != 14872) {
                method4595((byte) 46, null);
            }
            field8943++;
            class294 var2 = class146.method1261((long) arg0, -102, 10);
            var2.method2376(120);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8946[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(J[I[S[S)V", line = 809)
    private class626(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        try {
            this.field8935 = arg3;
            this.field8933 = arg1;
            this.field8939 = arg0;
            this.field8934 = arg2;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8946[0] + arg0 + ',' + (arg1 == null ? field8946[2] : field8946[1]) + ',' + (arg2 == null ? field8946[2] : field8946[1]) + ',' + (arg3 == null ? field8946[2] : field8946[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V", line = 820)
    public static final void method4598(int arg0) throws class142 {
        try {
            if (class101.field1360 == 1) {
                class349.field5060.method132(class224.field3263, class615.field8779);
            } else {
                class349.field5060.method132(0, 0);
            }
            if (arg0 != 3163) {
                field8945 = null;
            }
            field8938++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8946[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 838)
    public static final String method4599(byte arg0, long arg1) {
        try {
            field8936++;
            if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
                return null;
            } else if (arg1 % 37L == 0L) {
                return null;
            } else if (arg0 == -104) {
                int var3 = 0;
                for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                    var3++;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (arg1 != 0L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    var6.append(class735.field10464[(int) (var7 - arg1 * 37L)]);
                }
                return var6.reverse().toString();
            } else {
                return null;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field8946[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 876)
    public static final void method4600(int arg0) {
        try {
            field8944++;
            short var1 = 1024;
            short var2 = 3072;
            if (class149.field1902) {
                if (class727.field10426) {
                    var1 = 2048;
                }
                var2 = 4096;
            }
            if (class607.field8706 < (float) var1) {
                class607.field8706 = var1;
            }
            if (class607.field8706 > (float) var2) {
                class607.field8706 = var2;
            }
            while (class349.field5057 >= 16384.0F) {
                class349.field5057 -= 16384.0F;
            }
            while (class349.field5057 < 0.0F) {
                class349.field5057 += 16384.0F;
            }
            int var3 = class222.field3217 >> 9;
            if (arg0 == -20556) {
                int var4 = class604.field8658 >> 9;
                int var5 = class100.method977(arg0 ^ 0x504B, class604.field8658, class693.field9689, class222.field3217);
                int var6 = 0;
                if (var3 > 3 && var4 > 3 && (class625.field8929 - 4) > var3 && (class14.field187 - 4) > var4) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                            int var9 = class693.field9689;
                            if (var9 < 3 && class23.method275(1, var7, var8)) {
                                var9++;
                            }
                            int var10 = 0;
                            if (class334.field4579.field447 != null && class334.field4579.field447[var9] != null) {
                                var10 = (class334.field4579.field447[var9][var7][var8] & 0xFF) * 8 << 2;
                            }
                            if (class107.field1413 != null && class107.field1413[var9] != null) {
                                int var11 = var10 + var5 - class107.field1413[var9].method5442(var7, var8, 31844);
                                if (var11 > var6) {
                                    var6 = var11;
                                }
                            }
                        }
                    }
                }
                int var12 = (var6 >> 2) * 1536;
                if (var12 > 786432) {
                    var12 = 786432;
                }
                if (var12 < 262144) {
                    var12 = 262144;
                }
                if (var12 > class477.field7032) {
                    class477.field7032 += (var12 - class477.field7032) / 24;
                } else if (var12 < class477.field7032) {
                    class477.field7032 += (var12 - class477.field7032) / 80;
                }
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field8946[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V", line = 982)
    protected class626() {
    }

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4601(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x72);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4602(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 8;
                    break;
                case 1:
                    var10005 = 20;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 60;
                    break;
                default:
                    var10005 = 114;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
