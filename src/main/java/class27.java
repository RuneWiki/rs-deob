import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class27 extends class160 {

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    private int field356 = 409;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    private int field355 = 1024;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    private int field354 = 819;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "I")
    private int field360 = 1024;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    private int field357 = 0;

    @OriginalMember(owner = "client!wb", name = "ib", descriptor = "I")
    private int field370 = 1024;

    @OriginalMember(owner = "client!wb", name = "jb", descriptor = "I")
    private int field371 = 2048;

    @OriginalMember(owner = "client!wb", name = "mb", descriptor = "I")
    private int field374 = 0;

    @OriginalMember(owner = "client!wb", name = "ob", descriptor = "I")
    private int field376 = 1024;

    @OriginalMember(owner = "client!wb", name = "gb", descriptor = "Ljava/lang/String;")
    public static String field368 = "wave2:";

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "[I")
    public static int[] field363 = new int[2];

    @OriginalMember(owner = "client!wb", name = "nb", descriptor = "I")
    public static int field375 = 0;

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "Lpa;")
    public static class219 field364 = new class219();

    @OriginalMember(owner = "client!wb", name = "pb", descriptor = "Ljava/lang/String;")
    public static String field377 = "Loading defaults - ";

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!wb", name = "eb", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!wb", name = "hb", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!wb", name = "kb", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!wb", name = "lb", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z[Lrh;[[[II)V")
    public static final void method213(boolean arg0, class47[] arg1, int[][][] arg2, int arg3) {
        ++field362;
        byte var4;
        if (arg0) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (arg3 != -5) {
            field364 = null;
        }
        if (!arg0) {
            for (int var5 = 0; var5 < 4; ++var5) {
                for (int var6 = 0; var6 < 104; ++var6) {
                    for (int var7 = 0; var7 < 104; ++var7) {
                        if (~(1 & class181.field2827[var5][var6][var7]) == -2) {
                            int var8 = var5;
                            if (~(class181.field2827[1][var6][var7] & 2) == -3) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method350(var7, (byte) 39, var6);
                            }
                        }
                    }
                }
            }
            class41.field597 += (int) (Math.random() * 5.0D) - 2;
            class84.field1426 += (int) (5.0D * Math.random()) + -2;
            if (~class84.field1426 > 15) {
                class84.field1426 = -16;
            }
            if (~class41.field597 > 7) {
                class41.field597 = -8;
            }
            if (~class41.field597 < -9) {
                class41.field597 = 8;
            }
            if (~class84.field1426 < -17) {
                class84.field1426 = 16;
            }
        }
        int var9 = class84.field1426 >> 1;
        int[][] var10 = new int[104][104];
        int var11 = class41.field597 >> 2 << 10;
        int[][] var12 = new int[104][104];
        for (int var13 = 0; ~var13 > ~var4; ++var13) {
            byte[][] var52 = class86.field1435[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; ++var55) {
                for (int var101 = 1; ~var101 > -104; ++var101) {
                    byte var102 = 74;
                    int var103 = class66.field1107[var13][var101 + 1][var55] + -class66.field1107[var13][var101 + -1][var55];
                    int var104 = class66.field1107[var13][var101][var55 - -1] + -class66.field1107[var13][var101][var55 + -1];
                    int var105 = (int) Math.sqrt((double) (var103 * var103 + var104 * var104 + 65536));
                    int var106 = -65536 / var105;
                    int var107 = (var104 << 8) / var105;
                    int var108 = (var103 << 8) / var105;
                    int var109 = (var108 * -50 - (-(var106 * -10) + -(var107 * -50))) / var54 + var102;
                    int var110 = (var52[var101][var55 - 1] >> 2) + (var52[var101 - 1][var55] >> 2) - -(var52[var101 - -1][var55] >> 3) + (var52[var101][var55 + 1] >> 3) + (var52[var101][var55] >> 1);
                    var12[var101][var55] = var109 - var110;
                }
            }
            for (int var56 = 0; ~var56 > -105; ++var56) {
                class101.field1695[var56] = 0;
                class244.field3973[var56] = 0;
                class176.field2759[var56] = 0;
                class100.field1675[var56] = 0;
                class138.field2114[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; ++var57) {
                for (int var86 = 0; var86 < 104; ++var86) {
                    int var95 = var57 - -5;
                    int var10002;
                    if (~var95 > -105) {
                        int var96 = 255 & class113.field1852[var13][var95][var86];
                        if (~var96 < -1) {
                            class204 var97 = class51.method380(1, var96 + -1);
                            class101.field1695[var86] += var97.field3180;
                            class244.field3973[var86] += var97.field3191;
                            class176.field2759[var86] += var97.field3183;
                            class100.field1675[var86] += var97.field3190;
                            var10002 = class138.field2114[var86]++;
                        }
                    }
                    int var98 = var57 + -5;
                    if (var98 >= 0) {
                        int var99 = class113.field1852[var13][var98][var86] & 255;
                        if (~var99 < -1) {
                            class204 var100 = class51.method380(1, var99 + -1);
                            class101.field1695[var86] -= var100.field3180;
                            class244.field3973[var86] -= var100.field3191;
                            class176.field2759[var86] -= var100.field3183;
                            class100.field1675[var86] -= var100.field3190;
                            var10002 = class138.field2114[var86]--;
                        }
                    }
                }
                if (~var57 <= -1) {
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    for (int var92 = -5; ~var92 > -105; ++var92) {
                        int var93 = var92 + 5;
                        if (~var93 > -105) {
                            var87 += class101.field1695[var93];
                            var89 += class244.field3973[var93];
                            var90 += class138.field2114[var93];
                            var91 += class100.field1675[var93];
                            var88 += class176.field2759[var93];
                        }
                        int var94 = var92 + -5;
                        if (~var94 <= -1) {
                            var88 -= class176.field2759[var94];
                            var87 -= class101.field1695[var94];
                            var91 -= class100.field1675[var94];
                            var89 -= class244.field3973[var94];
                            var90 -= class138.field2114[var94];
                        }
                        if (var92 >= 0 && ~var90 < -1) {
                            var10[var57][var92] = class217.method1458(var89 / var90, true, var88 / var90, var87 * 256 / var91);
                        }
                    }
                }
            }
            for (int var58 = 1; ~var58 > -104; ++var58) {
                for (int var59 = 1; var59 < 103; ++var59) {
                    if (arg0 || class191.method1284(arg3 + -106) || ~(2 & class181.field2827[0][var58][var59]) != -1 || ~(class181.field2827[var13][var58][var59] & 16) == -1 && ~class192.method1293(arg3 + 4, var59, var13, var58) == ~class255.field4081) {
                        if (class259.field4137 > var13) {
                            class259.field4137 = var13;
                        }
                        int var60 = 255 & class113.field1852[var13][var58][var59];
                        int var61 = 255 & class268.field4272[var13][var58][var59];
                        if (~var60 < -1 || var61 > 0) {
                            int var62 = class66.field1107[var13][var58][var59];
                            int var63 = class66.field1107[var13][var58 + 1][var59 + 1];
                            int var64 = class66.field1107[var13][var58 - -1][var59];
                            int var65 = class66.field1107[var13][var58][var59 - -1];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (~var60 == -1 && ~class50.field737[var13][var58][var59] != -1) {
                                    var66 = false;
                                }
                                if (var61 > 0 && !class218.method1466(var61 - 1, false).field1464) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var64 && var62 == var63 && var62 == var65) {
                                    class240.field3891[var13][var58][var59] = class45.method330(class240.field3891[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var68;
                            if (~var60 >= -1) {
                                var67 = -1;
                                var68 = 0;
                            } else {
                                var67 = var10[var58][var59];
                                int var69 = (127 & var67) + var9;
                                if (var69 < 0) {
                                    var69 = 0;
                                } else if (var69 > 127) {
                                    var69 = 127;
                                }
                                int var70 = (896 & var67) + ((var11 + var67 & 64512) - -var69);
                                var68 = class195.field3077[class281.method1890(var70, 96, (byte) 12)];
                            }
                            int var71 = var12[var58][var59];
                            int var72 = var12[var58 + 1][var59 + 1];
                            int var73 = var12[var58 - -1][var59];
                            int var74 = var12[var58][var59 + 1];
                            if (var61 == 0) {
                                class181.method1233(var13, var58, var59, 0, 0, -1, var62, var64, var63, var65, class281.method1890(var67, var71, (byte) 12), class281.method1890(var67, var73, (byte) 12), class281.method1890(var67, var72, (byte) 12), class281.method1890(var67, var74, (byte) 12), 0, 0, 0, 0, var68, 0);
                            } else {
                                int var75 = class50.field737[var13][var58][var59] + 1;
                                byte var76 = class180.field2818[var13][var58][var59];
                                class87 var77 = class218.method1466(var61 + -1, false);
                                int var78 = var77.field1469;
                                if (~var78 <= -1 && !class195.field3087.method496(arg3 + 260, var78)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (~var78 <= -1) {
                                    var79 = class195.field3077[class130.method902(123, 96, class195.field3087.method497(var78, (byte) -74))];
                                    var80 = -1;
                                } else if (var77.field1462 != -1) {
                                    var80 = var77.field1462;
                                    int var81 = (var80 & 127) + var9;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (~var81 < -128) {
                                        var81 = 127;
                                    }
                                    int var82 = (64512 & var11 + var80) - -(896 & var80) - -var81;
                                    var79 = class195.field3077[class130.method902(arg3 ^ -125, 96, var82)];
                                } else {
                                    var79 = 0;
                                    var80 = -2;
                                }
                                if (~var77.field1460 <= -1) {
                                    int var83 = var77.field1460;
                                    int var84 = (127 & var83) + var9;
                                    if (~var84 <= -1) {
                                        if (~var84 < -128) {
                                            var84 = 127;
                                        }
                                    } else {
                                        var84 = 0;
                                    }
                                    int var85 = (var11 + var83 & 64512) + (896 & var83) + var84;
                                    var79 = class195.field3077[class130.method902(arg3 + 120, 96, var85)];
                                }
                                class181.method1233(var13, var58, var59, var75, var76, var78, var62, var64, var63, var65, class281.method1890(var67, var71, (byte) 12), class281.method1890(var67, var73, (byte) 12), class281.method1890(var67, var72, (byte) 12), class281.method1890(var67, var74, (byte) 12), class130.method902(104, var71, var80), class130.method902(arg3 + 132, var73, var80), class130.method902(88, var72, var80), class130.method902(100, var74, var80), var68, var79);
                            }
                        }
                    }
                }
            }
            class113.field1852[var13] = null;
            class268.field4272[var13] = null;
            class50.field737[var13] = null;
            class180.field2818[var13] = null;
            class86.field1435[var13] = null;
        }
        class160.method1076(-50, -10, -50);
        if (!arg0) {
            for (int var14 = 0; ~var14 > -105; ++var14) {
                for (int var51 = 0; var51 < 104; ++var51) {
                    if (~(2 & class181.field2827[1][var14][var51]) == -3) {
                        class165.method1115(var14, var51);
                    }
                }
            }
            for (int var15 = 0; var15 < 4; ++var15) {
                for (int var16 = 0; ~var16 >= -105; ++var16) {
                    for (int var17 = 0; var17 <= 104; ++var17) {
                        if ((class240.field3891[var15][var17][var16] & 1) != 0) {
                            int var18;
                            for (var18 = var16; ~var18 < -1 && ~(class240.field3891[var15][var17][var18 + -1] & 1) != -1; --var18) {
                            }
                            int var19;
                            for (var19 = var16; ~var19 > -105 && ~(1 & class240.field3891[var15][var17][var19 + 1]) != -1; ++var19) {
                            }
                            int var20;
                            label355: for (var20 = var15; var20 > 0; --var20) {
                                for (int var21 = var18; var19 >= var21; ++var21) {
                                    if (~(1 & class240.field3891[var20 + -1][var17][var21]) == -1) {
                                        break label355;
                                    }
                                }
                            }
                            int var22;
                            label343: for (var22 = var15; ~var22 > -4; ++var22) {
                                for (int var23 = var18; var19 >= var23; ++var23) {
                                    if (~(1 & class240.field3891[var22 - -1][var17][var23]) == -1) {
                                        break label343;
                                    }
                                }
                            }
                            int var24 = (-var18 + 1 + var19) * (var22 + 1 + -var20);
                            if (~var24 <= -9) {
                                short var25 = 240;
                                int var26 = class66.field1107[var20][var17][var18];
                                int var27 = class66.field1107[var22][var17][var18] + -var25;
                                class277.method1870(1, var17 * 128, var17 * 128, var18 * 128, var19 * 128 + 128, var27, var26);
                                for (int var28 = var20; var28 <= var22; ++var28) {
                                    for (int var29 = var18; var19 >= var29; ++var29) {
                                        class240.field3891[var28][var17][var29] = class55.method420(class240.field3891[var28][var17][var29], -2);
                                    }
                                }
                            }
                        }
                        if (~(2 & class240.field3891[var15][var17][var16]) != -1) {
                            int var30;
                            for (var30 = var17; var30 > 0 && ~(2 & class240.field3891[var15][var30 - 1][var16]) != -1; --var30) {
                            }
                            int var31;
                            for (var31 = var17; ~var31 > -105 && ~(class240.field3891[var15][var31 + 1][var16] & 2) != -1; ++var31) {
                            }
                            int var32 = var15;
                            int var33 = var15;
                            label410: while (var32 > 0) {
                                for (int var34 = var30; ~var31 <= ~var34; ++var34) {
                                    if ((class240.field3891[var32 + -1][var34][var16] & 2) == 0) {
                                        break label410;
                                    }
                                }
                                --var32;
                            }
                            label399: while (~var33 > -4) {
                                for (int var35 = var30; ~var31 <= ~var35; ++var35) {
                                    if ((class240.field3891[var33 - -1][var35][var16] & 2) == 0) {
                                        break label399;
                                    }
                                }
                                ++var33;
                            }
                            int var36 = (-var30 + 1 + var31) * (-var32 + 1 + var33);
                            if (~var36 <= -9) {
                                short var37 = 240;
                                int var38 = class66.field1107[var33][var30][var16] + -var37;
                                int var39 = class66.field1107[var32][var30][var16];
                                class277.method1870(2, var30 * 128, var31 * 128 + 128, var16 * 128, var16 * 128, var38, var39);
                                for (int var40 = var32; ~var40 >= ~var33; ++var40) {
                                    for (int var41 = var30; ~var31 <= ~var41; ++var41) {
                                        class240.field3891[var40][var41][var16] = class55.method420(class240.field3891[var40][var41][var16], -3);
                                    }
                                }
                            }
                        }
                        if ((4 & class240.field3891[var15][var17][var16]) != 0) {
                            int var42 = var17;
                            int var43 = var17;
                            int var44;
                            for (var44 = var16; var44 < 104 && ~(4 & class240.field3891[var15][var17][var44 - -1]) != -1; ++var44) {
                            }
                            int var45;
                            for (var45 = var16; var45 > 0 && ~(class240.field3891[var15][var17][var45 + -1] & 4) != -1; --var45) {
                            }
                            label465: while (~var42 < -1) {
                                for (int var46 = var45; var44 >= var46; ++var46) {
                                    if (~(4 & class240.field3891[var15][var42 + -1][var46]) == -1) {
                                        break label465;
                                    }
                                }
                                --var42;
                            }
                            label454: while (var43 < 104) {
                                for (int var47 = var45; var44 >= var47; ++var47) {
                                    if ((4 & class240.field3891[var15][var43 - -1][var47]) == 0) {
                                        break label454;
                                    }
                                }
                                ++var43;
                            }
                            if (~((var43 - var42 + 1) * (var44 - var45 + 1)) <= -5) {
                                int var48 = class66.field1107[var15][var42][var45];
                                class277.method1870(4, var42 * 128, var43 * 128 + 128, var45 * 128, var44 * 128 + 128, var48, var48);
                                for (int var49 = var42; var43 >= var49; ++var49) {
                                    for (int var50 = var45; var50 <= var44; ++var50) {
                                        class240.field3891[var15][var49][var50] = class55.method420(class240.field3891[var15][var49][var50], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IB)I")
    public static final int method214(int arg0, byte arg1) {
        ++field361;
        if (class249.field4022 != null) {
            class249.field4022.method899((byte) -95);
            class249.field4022 = null;
        }
        if (arg1 != 43) {
            method216((byte) -108);
        }
        ++class73.field1230;
        if (~class73.field1230 < -5) {
            class73.field1230 = 0;
            class29.field406 = 0;
            return arg0;
        } else {
            if (class260.field4157 == class238.field3869) {
                class238.field3869 = class171.field2681;
            } else {
                class238.field3869 = class260.field4157;
            }
            class29.field406 = 0;
            return -1;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (arg2 != 7) {
                                        if (~arg2 == -9) {
                                            this.field355 = arg0.method645(11596);
                                        }
                                    } else {
                                        this.field370 = arg0.method645(11596);
                                    }
                                } else {
                                    this.field357 = arg0.method633(105);
                                }
                            } else {
                                this.field376 = arg0.method645(11596);
                            }
                        } else {
                            this.field354 = arg0.method645(11596);
                        }
                    } else {
                        this.field356 = arg0.method645(11596);
                    }
                } else {
                    this.field371 = arg0.method645(11596);
                }
            } else {
                this.field360 = arg0.method645(11596);
            }
        } else {
            this.field374 = arg0.method633(94);
        }
        if (arg1 < 11) {
            this.field355 = 31;
        }
        ++field372;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class27() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/util/Random;II[[IIII)V")
    private final void method215(Random arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field367;
        int var8 = this.field355 <= 0 ? 4096 : 4096 + -class129.method896(this.field355, arg0, false);
        int var9 = this.field370 * this.field358 >> 12;
        int var10 = this.field358 + -(var9 <= arg6 ? 0 : class129.method896(var9, arg0, false));
        if (arg2 >= class240.field3896) {
            arg2 -= class240.field3896;
        }
        if (var10 <= 0) {
            if (arg2 - -arg1 > class240.field3896) {
                int var11 = -arg2 + class240.field3896;
                for (int var12 = 0; ~arg5 < ~var12; ++var12) {
                    int[] var13 = arg3[arg4 - -var12];
                    class175.method1191(var13, arg2, var11, var8);
                    class175.method1191(var13, 0, -var11 + arg1, var8);
                }
            } else {
                for (int var14 = 0; arg5 > var14; ++var14) {
                    class175.method1191(arg3[arg4 + var14], arg2, arg1, var8);
                }
            }
        } else if (~arg5 < -1 && arg1 > 0) {
            int var15 = arg5 / 2;
            int var16 = arg1 / 2;
            int var17 = ~var15 <= ~var10 ? var10 : var15;
            int var18 = var10 > var16 ? var16 : var10;
            int var19 = arg2 + var18;
            int var20 = -(var18 * 2) + arg1;
            for (int var21 = 0; arg5 > var21; ++var21) {
                int[] var22 = arg3[arg4 + var21];
                if (~var21 > ~var17) {
                    int var23 = var8 * var21 / var17;
                    if (~this.field357 == -1) {
                        for (int var24 = 0; var18 > var24; ++var24) {
                            int var25 = var8 * var24 / var18;
                            var22[class55.method420(class189.field2929, arg2 + var24)] = var22[class55.method420(class189.field2929, arg1 + arg2 - (var24 - -1))] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var18 > var26; ++var26) {
                            int var28 = var8 * var26 / var18;
                            var22[class55.method420(arg2 + var26, class189.field2929)] = var22[class55.method420(class189.field2929, -var26 + -1 + arg1 + arg2)] = ~var28 > ~var23 ? var28 : var23;
                        }
                    }
                    if (~(var19 + var20) >= ~class240.field3896) {
                        class175.method1191(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class240.field3896;
                        class175.method1191(var22, var19, var27, var23);
                        class175.method1191(var22, 0, var20 - var27, var23);
                    }
                } else {
                    int var29 = -var21 + arg5 + -1;
                    if (~var29 > ~var17) {
                        int var30 = var8 * var29 / var17;
                        if (this.field357 == 0) {
                            for (int var31 = 0; ~var18 < ~var31; ++var31) {
                                int var32 = var8 * var31 / var18;
                                var22[class55.method420(class189.field2929, arg2 + var31)] = var22[class55.method420(arg1 + arg2 + -var31 - 1, class189.field2929)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var18 > var33; ++var33) {
                                int var35 = var8 * var33 / var18;
                                var22[class55.method420(class189.field2929, arg2 + var33)] = var22[class55.method420(class189.field2929, -var33 - 1 + arg1 + arg2)] = ~var30 >= ~var35 ? var30 : var35;
                            }
                        }
                        if (~(var19 + var20) >= ~class240.field3896) {
                            class175.method1191(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class240.field3896;
                            class175.method1191(var22, var19, var34, var30);
                            class175.method1191(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var36 > ~var18; ++var36) {
                            var22[class55.method420(arg2 + var36, class189.field2929)] = var22[class55.method420(-var36 + -1 + arg1 + arg2, class189.field2929)] = var8 * var36 / var18;
                        }
                        if (var19 + var20 > class240.field3896) {
                            int var37 = -var19 + class240.field3896;
                            class175.method1191(var22, var19, var37, var8);
                            class175.method1191(var22, 0, -var37 + var20, var8);
                        } else {
                            class175.method1191(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(B)V")
    public final void method210(byte arg0) {
        if (arg0 <= -124) {
            ++field369;
        }
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "(B)V")
    public static void method216(byte arg0) {
        int var1 = -72 % ((arg0 - 15) / 39);
        field377 = null;
        field363 = null;
        field368 = null;
        field364 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        if (arg1 != 57) {
            return null;
        } else {
            ++field359;
            int[] var3 = super.field2488.method15((byte) 127, arg0);
            if (super.field2488.field42) {
                int var4 = 0;
                int[][] var5 = super.field2488.method17(-1);
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = true;
                int var12 = 0;
                int var13 = 0;
                int var14 = class240.field3896 * this.field360 >> 12;
                int var15 = class240.field3896 * this.field371 >> 12;
                int var16 = class79.field1328 * this.field356 >> 12;
                int var17 = class79.field1328 * this.field354 >> 12;
                if (var17 <= 1) {
                    return var5[arg0];
                } else {
                    this.field358 = class240.field3896 / 8 * this.field376 >> 12;
                    int var18 = class240.field3896 / var14 + 1;
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    Random var21 = new Random((long) this.field374);
                    while (true) {
                        while (true) {
                            int var22 = var14 - -class129.method896(-var14 + var15, var21, false);
                            int var23 = var16 + class129.method896(-var16 + var17, var21, false);
                            int var24 = var8 + var22;
                            if (var24 > class240.field3896) {
                                var22 = -var8 + class240.field3896;
                                var24 = class240.field3896;
                            }
                            int var25;
                            if (var11) {
                                var25 = 0;
                            } else {
                                int var26 = var7;
                                int[] var27 = var19[var7];
                                var25 = var27[2];
                                int var28 = var4 + var24;
                                int var29 = 0;
                                if (var28 < 0) {
                                    var28 += class240.field3896;
                                }
                                if (var28 > class240.field3896) {
                                    var28 -= class240.field3896;
                                }
                                while (true) {
                                    int[] var30 = var19[var26];
                                    if (var30[0] <= var28 && ~var30[1] <= ~var28) {
                                        if (~var7 != ~var26) {
                                            int var31 = var4 + var8;
                                            if (var31 < 0) {
                                                var31 += class240.field3896;
                                            }
                                            if (class240.field3896 < var31) {
                                                var31 -= class240.field3896;
                                            }
                                            for (int var32 = 1; ~var29 <= ~var32; ++var32) {
                                                int[] var40 = var19[(var7 + var32) % var13];
                                                var25 = Math.max(var25, var40[2]);
                                            }
                                            for (int var33 = 0; ~var33 >= ~var29; ++var33) {
                                                int[] var34 = var19[(var7 + var33) % var13];
                                                int var35 = var34[2];
                                                if (~var25 != ~var35) {
                                                    int var36 = var34[0];
                                                    int var37 = var34[1];
                                                    int var38;
                                                    int var39;
                                                    if (~var31 > ~var28) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = Math.min(var28, var37);
                                                    } else if (var36 == 0) {
                                                        var39 = Math.min(var28, var37);
                                                        var38 = 0;
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class240.field3896;
                                                    }
                                                    this.method215(var21, -var38 + var39, var9 + var38, var5, var35, -var35 + var25, 0);
                                                }
                                            }
                                        }
                                        var7 = var26;
                                        break;
                                    }
                                    ++var26;
                                    if (var13 <= var26) {
                                        var26 = 0;
                                    }
                                    ++var29;
                                }
                            }
                            if (~class79.field1328 > ~(var25 - -var23)) {
                                var23 = -var25 + class79.field1328;
                            } else {
                                var10 = false;
                            }
                            if (class240.field3896 != var24) {
                                int[] var41 = var20[var12++];
                                var41[2] = var23 + var25;
                                var41[0] = var8;
                                var41[1] = var24;
                                this.method215(var21, var22, var6 + var8, var5, var25, var23, 0);
                                var8 = var24;
                            } else {
                                this.method215(var21, var22, var6 + var8, var5, var25, var23, 0);
                                if (var10) {
                                    return var3;
                                }
                                var9 = var6;
                                var11 = false;
                                var7 = 0;
                                var10 = true;
                                int[] var42 = var20[var12++];
                                var42[2] = var23 + var25;
                                var13 = var12;
                                int[][] var43 = var19;
                                var12 = 0;
                                var19 = var20;
                                var42[1] = var24;
                                var42[0] = var8;
                                var20 = var43;
                                var6 = class129.method896(class240.field3896, var21, false);
                                var8 = 0;
                                var4 = -var9 + var6;
                                int var44 = var4;
                                if (~var4 > -1) {
                                    var44 = class240.field3896 + var4;
                                }
                                if (var44 > class240.field3896) {
                                    var44 -= class240.field3896;
                                }
                                while (true) {
                                    int[] var45 = var19[var7];
                                    if (~var44 <= ~var45[0] && var44 <= var45[1]) {
                                        break;
                                    }
                                    int var10000 = ~var13;
                                    ++var7;
                                    if (var10000 >= ~var7) {
                                        var7 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IJ)V")
    public static final void method217(int arg0, long arg1) {
        ++field365;
        if (~arg1 != -1L) {
            int var3 = 0;
            if (arg0 != -15354) {
                method214(-110, (byte) -73);
            }
            while (~var3 > ~class166.field2604) {
                if (~class173.field2718[var3] == ~arg1) {
                    --class166.field2604;
                    ++class57.field937;
                    for (int var4 = var3; ~var4 > ~class166.field2604; ++var4) {
                        class129.field2024[var4] = class129.field2024[var4 + 1];
                        class295.field4659[var4] = class295.field4659[var4 + 1];
                        class272.field4363[var4] = class272.field4363[var4 + 1];
                        class173.field2718[var4] = class173.field2718[var4 + 1];
                        class152.field2386[var4] = class152.field2386[var4 + 1];
                        class52.field786[var4] = class52.field786[var4 - -1];
                    }
                    class15.field235 = class275.field4392;
                    client.field2435.method536((byte) -104, 56);
                    client.field2435.method638(arg1, false);
                    return;
                }
                ++var3;
            }
        }
    }
}
