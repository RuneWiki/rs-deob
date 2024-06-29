import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class127 extends class33 {

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "Lrd;")
    private static class173 field2395 = class133.method843("Connection lost)3", 37);

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "Lrd;")
    public static class173 field2391 = class133.method843("rot:", 115);

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "Lrd;")
    public static class173 field2393 = field2395;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        ++field2396;
        int[] var3 = super.field718.method514(arg0, 127);
        int var4 = 27 % ((-65 - arg1) / 60);
        if (super.field718.field1615) {
            for (int var5 = 0; var5 < class117.field2173; ++var5) {
                var3[var5] = class138.field2585[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(B)V")
    public static void method808(byte arg0) {
        field2395 = null;
        field2391 = null;
        int var1 = -92 / ((59 - arg0) / 60);
        field2393 = null;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class127() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[Lrh;)V")
    public static final void method809(int arg0, class177[] arg1) {
        ++field2392;
        for (int var2 = 0; ~var2 > -5; ++var2) {
            for (int var113 = 0; var113 < 104; ++var113) {
                for (int var114 = 0; var114 < 104; ++var114) {
                    if ((class21.field462[var2][var113][var114] & 1) == 1) {
                        int var115 = var2;
                        if (~(2 & class21.field462[1][var113][var114]) == -3) {
                            var115 = var2 - 1;
                        }
                        if (var115 >= 0) {
                            arg1[var115].method1182(107, var113, var114);
                        }
                    }
                }
            }
        }
        class194.field3766 += (int) (Math.random() * 5.0D) + -2;
        if (class194.field3766 < -8) {
            class194.field3766 = -8;
        }
        if (class194.field3766 > 8) {
            class194.field3766 = 8;
        }
        int var3 = class194.field3766 >> 2 << 10;
        class34.field739 += -2 + (int) (Math.random() * 5.0D);
        int[][] var4 = new int[104][104];
        if (~class34.field739 > 15) {
            class34.field739 = -16;
        }
        int[][] var5 = new int[104][104];
        if (~class34.field739 < -17) {
            class34.field739 = 16;
        }
        int var6 = class34.field739 >> 1;
        if (arg0 != -152652440) {
            method809(79, (class177[]) null);
        }
        for (int var7 = 0; ~var7 > -5; ++var7) {
            byte var50 = 74;
            byte[][] var51 = class140.field2602[var7];
            int var52 = (int) Math.sqrt(5100.0D);
            short var53 = 768;
            int var54 = var52 * var53 >> 8;
            for (int var55 = 1; ~var55 > -104; ++var55) {
                for (int var103 = 1; var103 < 103; ++var103) {
                    int var105 = class46.field975[var7][var103 + 1][var55] + -class46.field975[var7][var103 + -1][var55];
                    int var106 = class46.field975[var7][var103][var55 + 1] - class46.field975[var7][var103][var55 + -1];
                    int var107 = (int) Math.sqrt((double) (var106 * var106 + var105 * var105 + 65536));
                    int var108 = (var105 << 8) / var107;
                    int var109 = (var106 << 8) / var107;
                    int var110 = -65536 / var107;
                    int var111 = (var110 * -10 + var108 * -50 + var109 * -50) / var54 + var50;
                    int var112 = (var51[var103 + -1][var55] >> 2) - -(var51[var103][var55 + 1] >> 3) + (var51[var103 - -1][var55] >> 3) + (var51[var103][var55 - 1] >> 2) + (var51[var103][var55] >> 1);
                    var5[var103][var55] = var111 - var112;
                }
            }
            for (int var56 = 0; ~var56 > -105; ++var56) {
                class57.field1125[var56] = 0;
                class158.field2962[var56] = 0;
                class217.field4198[var56] = 0;
                class194.field3771[var56] = 0;
                class171.field3311[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; ++var57) {
                for (int var88 = 0; var88 < 104; ++var88) {
                    int var97 = var57 + 5;
                    int var10002;
                    if (var97 < 104) {
                        int var98 = 255 & class208.field4054[var7][var97][var88];
                        if (var98 > 0) {
                            class211 var99 = class60.method382((byte) 127, var98 + -1);
                            class57.field1125[var88] += var99.field4078;
                            class158.field2962[var88] += var99.field4082;
                            class217.field4198[var88] += var99.field4081;
                            class194.field3771[var88] += var99.field4072;
                            var10002 = class171.field3311[var88]++;
                        }
                    }
                    int var100 = var57 + -5;
                    if (~var100 <= -1) {
                        int var101 = 255 & class208.field4054[var7][var100][var88];
                        if (~var101 < -1) {
                            class211 var102 = class60.method382((byte) 121, var101 - 1);
                            class57.field1125[var88] -= var102.field4078;
                            class158.field2962[var88] -= var102.field4082;
                            class217.field4198[var88] -= var102.field4081;
                            class194.field3771[var88] -= var102.field4072;
                            var10002 = class171.field3311[var88]--;
                        }
                    }
                }
                if (var57 >= 0) {
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    int var92 = 0;
                    int var93 = 0;
                    for (int var94 = -5; ~var94 > -105; ++var94) {
                        int var95 = var94 + 5;
                        if (~var95 > -105) {
                            var90 += class158.field2962[var95];
                            var89 += class57.field1125[var95];
                            var93 += class171.field3311[var95];
                            var92 += class217.field4198[var95];
                            var91 += class194.field3771[var95];
                        }
                        int var96 = var94 + -5;
                        if (var96 >= 0) {
                            var92 -= class217.field4198[var96];
                            var89 -= class57.field1125[var96];
                            var90 -= class158.field2962[var96];
                            var91 -= class194.field3771[var96];
                            var93 -= class171.field3311[var96];
                        }
                        if (var94 >= 0 && ~var93 < -1) {
                            var4[var57][var94] = class195.method1292(var92 / var93, var89 * 256 / var91, var90 / var93, (byte) -15);
                        }
                    }
                }
            }
            for (int var58 = 1; ~var58 > -104; ++var58) {
                for (int var61 = 1; var61 < 103; ++var61) {
                    if (!class107.field2003 || (2 & class21.field462[0][var58][var61]) != 0 || (16 & class21.field462[var7][var58][var61]) == 0 && class151.method991(var61, var7, (byte) -120, var58) == class203.field3951) {
                        if (~class15.field351 < ~var7) {
                            class15.field351 = var7;
                        }
                        int var62 = 255 & class45.field938[var7][var58][var61];
                        int var63 = class208.field4054[var7][var58][var61] & 255;
                        if (var63 > 0 || var62 > 0) {
                            int var64 = class46.field975[var7][var58][var61];
                            int var65 = class46.field975[var7][var58 + 1][var61 + 1];
                            int var66 = class46.field975[var7][var58][var61 - -1];
                            int var67 = class46.field975[var7][var58 + 1][var61];
                            if (var7 > 0) {
                                boolean var68 = true;
                                if (~var63 == -1 && class23.field502[var7][var58][var61] != 0) {
                                    var68 = false;
                                }
                                if (~var62 < -1 && !class107.method656(var62 + -1, -30370).field540) {
                                    var68 = false;
                                }
                                if (var68 && var64 == var67 && ~var64 == ~var65 && ~var64 == ~var66) {
                                    class79.field1570[var7][var58][var61] = class21.method181(class79.field1570[var7][var58][var61], 2340);
                                }
                            }
                            int var69;
                            int var70;
                            if (var63 <= 0) {
                                var69 = 0;
                                var70 = -1;
                            } else {
                                var70 = var4[var58][var61];
                                int var71 = (127 & var70) + var6;
                                if (var71 < 0) {
                                    var71 = 0;
                                } else if (var71 > 127) {
                                    var71 = 127;
                                }
                                int var72 = (896 & var70) + ((64512 & var3 + var70) - -var71);
                                var69 = class72.field1394[class8.method55(var72, 96, true)];
                            }
                            int var73 = var5[var58 + 1][var61];
                            int var74 = var5[var58][var61];
                            int var75 = var5[var58 - -1][var61 + 1];
                            int var76 = var5[var58][var61 + 1];
                            if (var62 == 0) {
                                class203.method1350(var7, var58, var61, 0, 0, -1, var64, var67, var65, var66, class8.method55(var70, var74, true), class8.method55(var70, var73, true), class8.method55(var70, var75, true), class8.method55(var70, var76, true), 0, 0, 0, 0, var69, 0);
                            } else {
                                int var77 = class23.field502[var7][var58][var61] + 1;
                                byte var78 = class126.field2384[var7][var58][var61];
                                class25 var79 = class107.method656(var62 + -1, -30370);
                                int var80 = var79.field532;
                                if (~var80 <= -1 && !class72.field1400.method16(arg0 + 152629986, var80)) {
                                    var80 = -1;
                                }
                                int var81;
                                int var82;
                                if (var80 >= 0) {
                                    var81 = -1;
                                    var82 = class72.field1394[class5.method38(class72.field1400.method15(var80, arg0 ^ 152652456), arg0 ^ -152637124, 96)];
                                } else if (var79.field530 == -1) {
                                    var82 = 0;
                                    var81 = -2;
                                } else {
                                    var81 = var79.field530;
                                    int var83 = (var81 & 127) - -var6;
                                    if (var83 >= 0) {
                                        if (var83 > 127) {
                                            var83 = 127;
                                        }
                                    } else {
                                        var83 = 0;
                                    }
                                    int var84 = (64512 & var3 + var81) + (var81 & 896) - -var83;
                                    var82 = class72.field1394[class5.method38(var84, 17492, 96)];
                                }
                                if (var79.field533 >= 0) {
                                    int var85 = var79.field533;
                                    int var86 = (127 & var85) - -var6;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 127) {
                                        var86 = 127;
                                    }
                                    int var87 = (64512 & var3 + var85) + (var85 & 896) + var86;
                                    var82 = class72.field1394[class5.method38(var87, 17492, 96)];
                                }
                                class203.method1350(var7, var58, var61, var77, var78, var80, var64, var67, var65, var66, class8.method55(var70, var74, true), class8.method55(var70, var73, true), class8.method55(var70, var75, true), class8.method55(var70, var76, true), class5.method38(var81, arg0 + 152669932, var74), class5.method38(var81, 17492, var73), class5.method38(var81, 17492, var75), class5.method38(var81, arg0 ^ -152637124, var76), var69, var82);
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; ~var59 > -104; ++var59) {
                for (int var60 = 1; var60 < 103; ++var60) {
                    class143.method903(var7, var60, var59, class151.method991(var59, var7, (byte) -120, var60));
                }
            }
            class208.field4054[var7] = null;
            class45.field938[var7] = null;
            class23.field502[var7] = null;
            class126.field2384[var7] = null;
            class140.field2602[var7] = null;
        }
        class57.method372(-50, -10, -50);
        for (int var8 = 0; ~var8 > -105; ++var8) {
            for (int var49 = 0; ~var49 > -105; ++var49) {
                if ((class21.field462[1][var8][var49] & 2) == 2) {
                    class178.method1199(var8, var49);
                }
            }
        }
        int var9 = 1;
        int var10 = 2;
        int var11 = 4;
        for (int var12 = 0; var12 < 4; ++var12) {
            if (~var12 < -1) {
                var11 <<= 3;
                var10 <<= 3;
                var9 <<= 3;
            }
            for (int var13 = 0; ~var12 <= ~var13; ++var13) {
                for (int var14 = 0; ~var14 >= -105; ++var14) {
                    for (int var15 = 0; var15 <= 104; ++var15) {
                        if (~(var9 & class79.field1570[var13][var15][var14]) != -1) {
                            int var16;
                            for (var16 = var14; ~var16 < -1 && ~(class79.field1570[var13][var15][var16 + -1] & var9) != -1; --var16) {
                            }
                            int var17;
                            for (var17 = var14; ~var17 > -105 && ~(class79.field1570[var13][var15][var17 + 1] & var9) != -1; ++var17) {
                            }
                            int var18 = var13;
                            int var19 = var13;
                            label360: while (var18 > 0) {
                                for (int var20 = var16; ~var17 <= ~var20; ++var20) {
                                    if (~(class79.field1570[var18 + -1][var15][var20] & var9) == -1) {
                                        break label360;
                                    }
                                }
                                --var18;
                            }
                            label349: while (var12 > var19) {
                                for (int var21 = var16; ~var21 >= ~var17; ++var21) {
                                    if (~(var9 & class79.field1570[var19 + 1][var15][var21]) == -1) {
                                        break label349;
                                    }
                                }
                                ++var19;
                            }
                            int var22 = (-var16 + var17 + 1) * (-var18 + 1 + var19);
                            if (~var22 <= -9) {
                                short var23 = 240;
                                int var24 = class46.field975[var19][var15][var16] + -var23;
                                int var25 = class46.field975[var18][var15][var16];
                                class59.method378(var12, 1, var15 * 128, var15 * 128, var16 * 128, var17 * 128 - -128, var24, var25);
                                for (int var26 = var18; var19 >= var26; ++var26) {
                                    for (int var27 = var16; var27 <= var17; ++var27) {
                                        class79.field1570[var26][var15][var27] = class209.method1383(class79.field1570[var26][var15][var27], ~var9);
                                    }
                                }
                            }
                        }
                        if ((class79.field1570[var13][var15][var14] & var10) != 0) {
                            int var28 = var15;
                            int var29 = var15;
                            while (~var28 < -1 && ~(class79.field1570[var13][var28 + -1][var14] & var10) != -1) {
                                --var28;
                            }
                            int var30 = var13;
                            while (~var29 > -105 && ~(var10 & class79.field1570[var13][var29 + 1][var14]) != -1) {
                                ++var29;
                            }
                            int var31 = var13;
                            label415: while (~var30 < -1) {
                                for (int var32 = var28; var32 <= var29; ++var32) {
                                    if ((class79.field1570[var30 - 1][var32][var14] & var10) == 0) {
                                        break label415;
                                    }
                                }
                                --var30;
                            }
                            label404: while (var12 > var31) {
                                for (int var33 = var28; ~var29 <= ~var33; ++var33) {
                                    if (~(class79.field1570[var31 + 1][var33][var14] & var10) == -1) {
                                        break label404;
                                    }
                                }
                                ++var31;
                            }
                            int var34 = (var29 + 1 + -var28) * (var31 + 1 + -var30);
                            if (~var34 <= -9) {
                                int var35 = class46.field975[var30][var28][var14];
                                short var36 = 240;
                                int var37 = class46.field975[var31][var28][var14] + -var36;
                                class59.method378(var12, 2, var28 * 128, var29 * 128 + 128, var14 * 128, var14 * 128, var37, var35);
                                for (int var38 = var30; ~var31 <= ~var38; ++var38) {
                                    for (int var39 = var28; ~var39 >= ~var29; ++var39) {
                                        class79.field1570[var38][var39][var14] = class209.method1383(class79.field1570[var38][var39][var14], ~var10);
                                    }
                                }
                            }
                        }
                        if (~(var11 & class79.field1570[var13][var15][var14]) != -1) {
                            int var40 = var15;
                            int var41 = var15;
                            int var42;
                            for (var42 = var14; var42 > 0 && (var11 & class79.field1570[var13][var15][var42 - 1]) != 0; --var42) {
                            }
                            int var43;
                            for (var43 = var14; ~var43 > -105 && (var11 & class79.field1570[var13][var15][var43 + 1]) != 0; ++var43) {
                            }
                            label470: while (~var40 < -1) {
                                for (int var44 = var42; var43 >= var44; ++var44) {
                                    if ((class79.field1570[var13][var40 + -1][var44] & var11) == 0) {
                                        break label470;
                                    }
                                }
                                --var40;
                            }
                            label459: while (var41 < 104) {
                                for (int var45 = var42; ~var43 <= ~var45; ++var45) {
                                    if ((var11 & class79.field1570[var13][var41 + 1][var45]) == 0) {
                                        break label459;
                                    }
                                }
                                ++var41;
                            }
                            if (~((-var42 + var43 + 1) * (var41 + 1 + -var40)) <= -5) {
                                int var46 = class46.field975[var13][var40][var42];
                                class59.method378(var12, 4, var40 * 128, var41 * 128 - -128, var42 * 128, var43 * 128 + 128, var46, var46);
                                for (int var47 = var40; ~var41 <= ~var47; ++var47) {
                                    for (int var48 = var42; var43 >= var48; ++var48) {
                                        class79.field1570[var13][var47][var48] = class209.method1383(class79.field1570[var13][var47][var48], ~var11);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lrd;Lmb;I)I")
    public static final int method810(class173 arg0, class121 arg1, int arg2) {
        ++field2394;
        if (arg2 != 17913) {
            return 16;
        } else {
            int var3 = arg1.field2222;
            arg1.method743(arg0.field3379, (byte) 95);
            arg1.field2222 += class25.field534.method277(arg1.field2222, -1, arg0.field3415, arg0.field3379, arg1.field2218, 0);
            return -var3 + arg1.field2222;
        }
    }
}
