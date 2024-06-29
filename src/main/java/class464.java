import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class464 extends class562 {

    @OriginalMember(owner = "client!id", name = "U", descriptor = "[[I")
    public static int[][] field6350 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!id", name = "H", descriptor = "Z")
    public static boolean field6348 = false;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "[Lnt;")
    public static class141[] field6351 = new class141[4];

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!id", name = "X", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "[Ljava/lang/String;")
    public static String[] field6352;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)[[I")
    public final int[][] method445(int arg0, int arg1) {
        ++field6354;
        if (arg1 != 0) {
            method2773((class640) null, -18);
        }
        int[][] var3 = super.field10420.method930(29784, arg0);
        if (super.field10420.field1979 && this.method3363((byte) 76)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field7992 * super.field7992;
            for (int var8 = 0; var8 < class424.field5889; ++var8) {
                int var9 = super.field7989[var8 % super.field7993 + var7];
                var6[var8] = class136.method878(255, var9) << 4;
                var5[var8] = class136.method878(65280, var9) >> 4;
                var4[var8] = class136.method878(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(II)Z")
    public static final boolean method2770(int arg0, int arg1) {
        ++field6353;
        if (~arg0 != arg1 && arg0 != 46 && arg0 != 44 && arg0 != 57 && ~arg0 != -1009) {
            return arg0 == 6 || arg0 == 1001;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIBII)V")
    public static final void method2771(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        class425.field5891[class679.field9573++] = new class27(arg4, arg3, arg0, arg1, arg1, arg0, arg8, arg5, arg5, arg8, arg7, arg7, arg2, arg2);
        if (arg6 <= 21) {
            method2774((byte) 120);
        }
        ++field6349;
    }

    @OriginalMember(owner = "client!id", name = "h", descriptor = "(I)V")
    public static final void method2772(int arg0) {
        ++field6356;
        if (arg0 == -4406) {
            class306.field3966.method3969((byte) 97);
            class204.method1360(0);
            class669.field9418 = null;
            class708.field9899 = 0;
            class23.field262 = null;
            class658.field9294 = 0;
            class150.field2065.field330 = 0;
            class545.field7701 = null;
            class502.method2999(0);
            class693.field9691 = 0;
            class265.field3618 = null;
            class713.field10110 = 0;
            class540.field7552 = null;
            class656.field9289 = 0;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljf;I)V")
    public static final void method2773(class640 arg0, int arg1) {
        ++field6355;
        if (class710.field9911 == arg0) {
            int var2 = class150.field2065.method194((byte) 119);
            int var3 = var2 >> 2;
            int var4 = 3 & var2;
            int var5 = class197.field2850[var3];
            int var6 = class150.field2065.method192(84);
            int var7 = (7 & var6 >> 4) + class363.field4648;
            int var8 = (7 & var6) + class346.field4404;
            int var9 = class150.field2065.method167((byte) 81);
            if (class140.method904(class734.field10279, false) || var7 >= 0 && ~var8 <= -1 && ~var7 > ~class514.field7179 && ~var8 > ~class456.field6281) {
                class186.method1247(0, class217.field3071, var9, 0, var7, -1, var4, var5, var8, var3);
            }
        } else if (class714.field10126 == arg0) {
            class150.field2065.method194((byte) 119);
            int var10 = class150.field2065.method194((byte) 119);
            int var11 = class363.field4648 - -((var10 & 127) >> 4);
            int var12 = (var10 & 7) + class346.field4404;
            int var13 = class150.field2065.method193(2);
            int var14 = class150.field2065.method194((byte) 119);
            int var15 = class150.field2065.method186((byte) 123);
            String var16 = class150.field2065.method196((byte) -92);
            class679.method3890(var15, var12, class217.field3071, var11, var14, var16, 59, var13);
        } else if (arg1 == -5709) {
            if (class175.field2381 == arg0) {
                int var17 = class150.field2065.method194((byte) 119);
                int var18 = ((var17 & 114) >> 4) + class363.field4648;
                int var19 = class346.field4404 - -(7 & var17);
                int var20 = class150.field2065.method194((byte) 119);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                int var23 = class197.field2850[var21];
                int var24 = class150.field2065.method191(false);
                if (var24 == 65535) {
                    var24 = -1;
                }
                class248.method1571(var23, class217.field3071, var18, var21, 20, var24, var22, var19);
            } else if (class497.field6968 == arg0) {
                int var25 = class150.field2065.method193(2);
                int var26 = class150.field2065.method194((byte) 119);
                class264.field3604.method3188(var25, (byte) -57).method214(0, var26);
            } else if (class497.field6964 == arg0) {
                int var27 = class150.field2065.method194((byte) 119);
                int var28 = class363.field4648 * 2 - -((244 & var27) >> 4);
                int var29 = class346.field4404 * 2 - -(15 & var27);
                int var30 = class150.field2065.method194((byte) 119);
                boolean var31 = (1 & var30) != 0;
                boolean var32 = ~(2 & var30) != -1;
                int var33 = !var32 ? -1 : var30 >> 2;
                int var34 = class150.field2065.method195(128) + var28;
                int var35 = class150.field2065.method195(arg1 + 5837) + var29;
                int var36 = class150.field2065.method173(-3);
                int var37 = class150.field2065.method173(-3);
                int var38 = class150.field2065.method193(2);
                int var39 = class150.field2065.method194((byte) 119);
                int var40;
                if (!var32) {
                    var40 = var39 * 4;
                } else {
                    var40 = (byte) var39;
                }
                int var41 = class150.field2065.method194((byte) 119) * 4;
                int var42 = class150.field2065.method193(2);
                int var43 = class150.field2065.method193(2);
                int var44 = class150.field2065.method194((byte) 119);
                if (~var44 == -256) {
                    var44 = -1;
                }
                int var45 = class150.field2065.method193(2);
                if (~var28 <= -1 && ~var29 <= -1 && class514.field7179 * 2 > var28 && class514.field7179 * 2 > var29 && var34 >= 0 && ~var35 <= -1 && var34 < class456.field6281 * 2 && ~(class456.field6281 * 2) < ~var35 && ~var38 != -65536) {
                    int var46 = var40 << 2;
                    int var47 = var35 * 256;
                    int var48 = var41 << 2;
                    int var49 = var45 << 2;
                    int var50 = var29 * 256;
                    int var51 = var28 * 256;
                    int var52 = var34 * 256;
                    if (var36 != 0 && var33 != -1) {
                        class584 var53 = null;
                        if (var36 < 0) {
                            int var54 = -var36 - 1;
                            if (~class471.field6467 == ~var54) {
                                var53 = class473.field6483;
                            } else {
                                var53 = class40.field563[var54];
                            }
                        } else {
                            int var55 = var36 + -1;
                            class15 var56 = (class15) class403.field5587.method1381(true, (long) var55);
                            if (var56 != null) {
                                var53 = var56.field204;
                            }
                        }
                        if (var53 != null) {
                            class591 var57 = var53.method3482(0);
                            if (var57.field8502 != null && var57.field8502[var33] != null) {
                                var46 -= var57.field8502[var33][1];
                            }
                            if (var57.field8511 != null && var57.field8511[var33] != null) {
                                var46 -= var57.field8511[var33][1];
                            }
                        }
                    }
                    class623 var58 = new class623(var38, class217.field3071, class217.field3071, var51, var50, var46, var42 - -class245.field3409, var43 - -class245.field3409, var44, var49, var36, var37, var48, var31, var33);
                    var58.method3648(class245.field3409 + var42, class438.method2628(var52, class217.field3071, var47, (byte) 91) - var48, (byte) 123, var52, var47);
                    class512.field7156.method3116(29066, new class690(var58));
                }
            } else if (class453.field6240 == arg0) {
                int var59 = class150.field2065.method194((byte) 119);
                int var60 = (var59 >> 4 & 7) + class363.field4648;
                int var61 = (7 & var59) + class346.field4404;
                int var62 = class150.field2065.method193(2);
                int var63 = class150.field2065.method194((byte) 119);
                int var64 = class150.field2065.method193(2);
                int var65 = class150.field2065.method194((byte) 119);
                if (var60 >= 0 && ~var61 <= -1 && var60 < class514.field7179 && ~class456.field6281 < ~var61) {
                    int var66 = var60 * 512 + 256;
                    int var67 = var61 * 512 + 256;
                    int var68 = class217.field3071;
                    if (var68 < 3 && class753.method4175(-12388, var61, var60)) {
                        ++var68;
                    }
                    class236 var69 = new class236(var62, var64, class245.field3409, class217.field3071, var68, var66, class438.method2628(var66, class217.field3071, var67, (byte) 125) - var63, var67, var60, var60, var61, var61, var65);
                    class450.field6178.method3116(29066, new class677(var69));
                }
            } else if (class710.field9912 == arg0) {
                int var70 = class150.field2065.method194((byte) 119);
                int var71 = (var70 & 7) + class346.field4404;
                int var72 = class510.field7109 + var71;
                int var73 = ((var70 & 119) >> 4) + class363.field4648;
                int var74 = class179.field2535 + var73;
                int var75 = class150.field2065.method168(-16785);
                class731 var76 = (class731) class118.field1631.method1381(true, (long) (var74 | var72 << 14 | class217.field3071 << 28));
                if (var76 != null) {
                    for (class175 var77 = (class175) var76.field10232.method3118((byte) 73); var77 != null; var77 = (class175) var76.field10232.method3111(121)) {
                        if ((var75 & 32767) == var77.field2379) {
                            var77.method3065(-17363);
                            break;
                        }
                    }
                    if (var76.field10232.method3121((byte) 17)) {
                        var76.method3065(-17363);
                    }
                    if (~var73 <= -1 && var71 >= 0 && ~class514.field7179 < ~var73 && class456.field6281 > var71) {
                        class123.method791(var71, -27930, var73, class217.field3071);
                    }
                }
            } else if (class91.field1236 == arg0) {
                int var78 = class150.field2065.method191(false);
                int var79 = class150.field2065.method193(2);
                int var80 = class150.field2065.method174(arg1 ^ -5709);
                int var81 = (var80 & 7) + class346.field4404;
                int var82 = class510.field7109 + var81;
                int var83 = (var80 >> 4 & 7) + class363.field4648;
                int var84 = class179.field2535 + var83;
                boolean var85 = var83 >= 0 && var81 >= 0 && ~var83 > ~class514.field7179 && ~var81 > ~class456.field6281;
                if (var85 || class140.method904(class734.field10279, false)) {
                    class589.method3497(class217.field3071, var82, arg1 + 5806, var84, new class175(var78, var79));
                    if (var85) {
                        class123.method791(var81, -27930, var83, class217.field3071);
                    }
                }
            } else if (class47.field695 == arg0) {
                int var86 = class150.field2065.method194((byte) 119);
                boolean var87 = ~(var86 & 128) != -1;
                int var88 = ((var86 & 59) >> 3) + class363.field4648;
                int var89 = (var86 & 7) + class346.field4404;
                int var90 = class150.field2065.method195(128) + var88;
                int var91 = var89 + class150.field2065.method195(128);
                int var92 = class150.field2065.method173(-3);
                int var93 = class150.field2065.method193(2);
                int var94 = class150.field2065.method194((byte) 119) * 4;
                int var95 = 4 * class150.field2065.method194((byte) 119);
                int var96 = class150.field2065.method193(2);
                int var97 = class150.field2065.method193(arg1 ^ -5711);
                int var98 = class150.field2065.method194((byte) 119);
                int var99 = class150.field2065.method193(2);
                if (~var98 == -256) {
                    var98 = -1;
                }
                if (~var88 <= -1 && ~var89 <= -1 && class514.field7179 > var88 && class456.field6281 > var89 && var90 >= 0 && ~var91 <= -1 && class514.field7179 > var90 && ~class456.field6281 < ~var91 && ~var93 != -65536) {
                    int var100 = var91 * 512 + 256;
                    int var101 = var89 * 512 + 256;
                    int var102 = var90 * 512 + 256;
                    int var103 = var95 << 2;
                    int var104 = var99 << 2;
                    int var105 = var88 * 512 + 256;
                    int var106 = var94 << 2;
                    class623 var107 = new class623(var93, class217.field3071, class217.field3071, var105, var101, var106, class245.field3409 + var96, class245.field3409 + var97, var98, var104, 0, var92, var103, var87, -1);
                    var107.method3648(var96 - -class245.field3409, class438.method2628(var102, class217.field3071, var100, (byte) 93) - var103, (byte) 116, var102, var100);
                    class512.field7156.method3116(29066, new class690(var107));
                }
            } else if (class224.field3150 == arg0) {
                int var108 = class150.field2065.method194((byte) 119);
                int var109 = ((117 & var108) >> 4) + class363.field4648;
                int var110 = (var108 & 7) + class346.field4404;
                int var111 = class150.field2065.method193(2);
                if (var111 == 65535) {
                    var111 = -1;
                }
                int var112 = class150.field2065.method194((byte) 119);
                int var113 = 15 & var112 >> 4;
                int var114 = 7 & var112;
                int var115 = class150.field2065.method194((byte) 119);
                int var116 = class150.field2065.method194((byte) 119);
                int var117 = class150.field2065.method193(2);
                if (var109 >= 0 && var110 >= 0 && ~class514.field7179 < ~var109 && ~class456.field6281 < ~var110) {
                    int var118 = var113 - -1;
                    if (class473.field6483.field8421[0] >= var109 - var118 && class473.field6483.field8421[0] <= var109 - -var118 && -var118 + var110 <= class473.field6483.field8414[0] && ~class473.field6483.field8414[0] >= ~(var110 + var118)) {
                        class123.method794(false, (var110 << 8) + (class217.field3071 << 24) + (var109 << 16) + var113, var115, (byte) -120, var116, var114, var111, var117);
                    }
                }
            } else if (class53.field744 == arg0) {
                int var119 = class150.field2065.method194((byte) 119);
                int var120 = class363.field4648 - -((var119 & 126) >> 4);
                int var121 = (7 & var119) + class346.field4404;
                int var122 = class150.field2065.method193(2);
                if (var122 == 65535) {
                    var122 = -1;
                }
                int var123 = class150.field2065.method194((byte) 119);
                int var124 = (var123 & 253) >> 4;
                int var125 = 7 & var123;
                int var126 = class150.field2065.method194((byte) 119);
                int var127 = class150.field2065.method194((byte) 119);
                int var128 = class150.field2065.method193(arg1 + 5711);
                if (~var120 <= -1 && var121 >= 0 && class514.field7179 > var120 && var121 < class456.field6281) {
                    int var129 = var124 + 1;
                    if (~class473.field6483.field8421[0] <= ~(-var129 + var120) && class473.field6483.field8421[0] <= var120 + var129 && ~class473.field6483.field8414[0] <= ~(-var129 + var121) && var121 + var129 >= class473.field6483.field8414[0]) {
                        class205.method1372(var122, var127, var125, (var121 << 8) + ((class217.field3071 << 24) - (-(var120 << 16) - var124)), true, var128, var126);
                    }
                }
            } else if (class321.field4139 == arg0) {
                int var130 = class150.field2065.method194((byte) 119);
                int var131 = var130 >> 2;
                int var132 = 3 & var130;
                int var133 = class197.field2850[var131];
                int var134 = class150.field2065.method194((byte) 119);
                int var135 = (var134 >> 4 & 7) + class363.field4648;
                int var136 = (7 & var134) + class346.field4404;
                if (class140.method904(class734.field10279, false) || ~var135 <= -1 && var136 >= 0 && var135 < class514.field7179 && ~class456.field6281 < ~var136) {
                    class186.method1247(arg1 + 5709, class217.field3071, -1, 0, var135, -1, var132, var133, var136, var131);
                }
            } else if (class499.field6985 == arg0) {
                int var137 = class150.field2065.method194((byte) 119);
                int var138 = (7 & var137) + class346.field4404;
                int var139 = class510.field7109 + var138;
                int var140 = (var137 >> 4 & 7) + class363.field4648;
                int var141 = class179.field2535 + var140;
                int var142 = class150.field2065.method193(2);
                int var143 = class150.field2065.method193(arg1 + 5711);
                int var144 = class150.field2065.method193(2);
                if (class118.field1631 != null) {
                    class731 var145 = (class731) class118.field1631.method1381(true, (long) (class217.field3071 << 28 | var139 << 14 | var141));
                    if (var145 != null) {
                        for (class175 var146 = (class175) var145.field10232.method3118((byte) 73); var146 != null; var146 = (class175) var145.field10232.method3111(arg1 ^ -5696)) {
                            if (~(var142 & 32767) == ~var146.field2379 && ~var146.field2383 == ~var143) {
                                var146.method3065(-17363);
                                var146.field2383 = var144;
                                class589.method3497(class217.field3071, var139, 101, var141, var146);
                                break;
                            }
                        }
                        if (var140 >= 0 && ~var138 <= -1 && var140 < class514.field7179 && var138 < class456.field6281) {
                            class123.method791(var138, -27930, var140, class217.field3071);
                        }
                    }
                }
            } else if (class345.field4396 != arg0) {
                class233.method1495((byte) 41, (Throwable) null, "T3 - " + arg0);
                class529.method3148(0, false);
            } else {
                int var147 = class150.field2065.method191(false);
                int var148 = class150.field2065.method192(arg1 ^ -5669);
                int var149 = (var148 & 7) + class346.field4404;
                int var150 = class510.field7109 + var149;
                int var151 = (var148 >> 4 & 7) + class363.field4648;
                int var152 = class179.field2535 + var151;
                int var153 = class150.field2065.method193(arg1 + 5711);
                int var154 = class150.field2065.method167((byte) 89);
                if (~class471.field6467 != ~var153) {
                    boolean var155 = var151 >= 0 && ~var149 <= -1 && ~var151 > ~class514.field7179 && ~class456.field6281 < ~var149;
                    if (var155 || class140.method904(class734.field10279, false)) {
                        class589.method3497(class217.field3071, var150, 95, var152, new class175(var147, var154));
                        if (var155) {
                            class123.method791(var149, -27930, var151, class217.field3071);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(B)V")
    public static void method2774(byte arg0) {
        field6351 = null;
        field6352 = null;
        if (arg0 == -4) {
            field6350 = null;
        }
    }
}
