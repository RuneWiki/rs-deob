import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class377 extends class346 {

    @OriginalMember(owner = "client!fq", name = "Q", descriptor = "Z")
    private boolean field5522 = true;

    @OriginalMember(owner = "client!fq", name = "O", descriptor = "I")
    private int field5520 = 4096;

    @OriginalMember(owner = "client!fq", name = "R", descriptor = "I")
    public static int field5523 = 0;

    @OriginalMember(owner = "client!fq", name = "P", descriptor = "I")
    public static int field5521 = -1;

    @OriginalMember(owner = "client!fq", name = "L", descriptor = "Lbo;")
    public static class453 field5517 = new class453(16);

    @OriginalMember(owner = "client!fq", name = "H", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!fq", name = "J", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!fq", name = "K", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!fq", name = "N", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!fq", name = "S", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!fq", name = "M", descriptor = "Luh;")
    public static class414 field5518;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(II)[[I", line = 4)
    public final int[][] method287(int arg0, int arg1) {
        ++field5516;
        int[][] var3 = super.field5170.method2701(0, arg0);
        if (arg1 > -3) {
            field5521 = -53;
        }
        if (super.field5170.field6288) {
            int[] var4 = this.method2294((byte) 54, arg0 - 1 & class215.field3000, 0);
            int[] var5 = this.method2294((byte) 54, arg0, 0);
            int[] var6 = this.method2294((byte) 54, class215.field3000 & arg0 + 1, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class134.field1753; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field5520;
                int var12 = (var5[class188.field2572 & var10 - -1] + -var5[var10 + -1 & class188.field2572]) * this.field5520;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 - -var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var11 / var17;
                    var19 = var12 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var18 = 0;
                    var20 = 0;
                    var19 = 0;
                }
                if (this.field5522) {
                    var18 = 2048 - -(var18 >> 1);
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILir;)V", line = 91)
    public static final void method2461(int arg0, class185 arg1) {
        class266.field3948 = arg1;
        ++field5515;
        class74.field1038 = class266.field3948.method1225(4, (byte) 27);
        if (arg0 != 1) {
            method2464((byte) -122);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lfb;ZI)V", line = 103)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        ++field5519;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field5522 = ~arg0.method2233((byte) 104) == -2;
            }
        } else {
            this.field5520 = arg0.method2239(-1076227960);
        }
        if (arg1) {
            method2464((byte) -114);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III[Lsj;IIIIII)V", line = 140)
    public static final void method2462(int arg0, int arg1, int arg2, class248[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class126.field1647.method462(arg6, arg7, arg0, arg1);
        ++field5524;
        if (arg9 != 1) {
            method2463(-100, 111, 53, 114);
        }
        for (int var10 = 0; ~arg3.length < ~var10; ++var10) {
            class248 var11 = arg3[var10];
            if (var11 != null && (var11.field3584 == arg5 || ~arg5 == 1412584498 && class171.field2342 == var11)) {
                int var12;
                if (arg4 != -1) {
                    var12 = arg4;
                } else {
                    class418.field6092[class400.field5854].setBounds(var11.field3503 + arg8, var11.field3507 + arg2, var11.field3531, var11.field3564);
                    var12 = class400.field5854++;
                }
                var11.field3488 = class231.field3179;
                var11.field3586 = var12;
                if (!var11.field3537 || !client.method401(var11)) {
                    if (~var11.field3624 < -1) {
                        class69.method583(true, var11);
                    }
                    int var13 = var11.field3503 + arg8;
                    int var14 = var11.field3507 + arg2;
                    int var15 = var11.field3632;
                    if (class126.field1649 && (client.method402(var11).field3108 != 0 || ~var11.field3555 == -1) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class171.field2342 == var11) {
                        if (~arg5 != 1412584498 && !var11.field3566) {
                            class122.field1584 = arg8;
                            class318.field4680 = arg2;
                            class211.field2856 = arg3;
                            continue;
                        }
                        if (!var11.field3566) {
                            var15 = 128;
                        }
                        if (class14.field215 && class77.field1057) {
                            int var16 = class277.field4060;
                            int var17 = class217.field3032;
                            int var18 = var16 - class355.field5259;
                            int var19 = var17 - class316.field4634;
                            if (~var18 > ~field5521) {
                                var18 = field5521;
                            }
                            if (~var19 > ~class164.field2235) {
                                var19 = class164.field2235;
                            }
                            if (~(field5521 + class268.field3967.field3531) > ~(var11.field3531 + var18)) {
                                var18 = -var11.field3531 + field5521 + class268.field3967.field3531;
                            }
                            var13 = var18;
                            if (~(class164.field2235 + class268.field3967.field3564) > ~(var11.field3564 + var19)) {
                                var19 = class164.field2235 + class268.field3967.field3564 + -var11.field3564;
                            }
                            var14 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field3555 == 2) {
                        var20 = arg1;
                        var21 = arg6;
                        var22 = arg7;
                        var23 = arg0;
                    } else {
                        int var24 = var13 - -var11.field3531;
                        int var25 = var11.field3564 + var14;
                        var22 = arg7 >= var14 ? arg7 : var14;
                        var21 = ~arg6 > ~var13 ? var13 : arg6;
                        if (var11.field3555 == 9) {
                            ++var24;
                            ++var25;
                        }
                        var23 = ~var24 > ~arg0 ? var24 : arg0;
                        var20 = ~var25 <= ~arg1 ? arg1 : var25;
                    }
                    if (!var11.field3537 || ~var21 > ~var23 && ~var22 > ~var20) {
                        if (~var11.field3624 != -1) {
                            if (~var11.field3624 == -1338 || var11.field3624 == 1403) {
                                class245.method1599(var13, var11.field3564, var11.field3531, var14, ~var11.field3624 == -1404, 26841);
                                class33.field536[var12] = true;
                                class126.field1647.method462(arg6, arg7, arg0, arg1);
                                continue;
                            }
                            if (var11.field3624 == 1338) {
                                if (var11.method1620(0, class126.field1647) != null) {
                                    class264.method1766(8);
                                    class378.method2465(var14, var13, class126.field1647, var11, 4);
                                    class101.field1335[var12] = true;
                                    class126.field1647.method462(arg6, arg7, arg0, arg1);
                                }
                                continue;
                            }
                            if (~var11.field3624 == -1340) {
                                if (var11.method1620(0, class126.field1647) != null) {
                                    class267.method1785(var11, var13, var14, false);
                                    class101.field1335[var12] = true;
                                    class126.field1647.method462(arg6, arg7, arg0, arg1);
                                }
                                continue;
                            }
                            if (var11.field3624 == 1400) {
                                class181.method1185(class126.field1647, var13, var14, class74.field1035, (byte) -124, var11.field3564, var11.field3531);
                                class33.field536[var12] = true;
                                class126.field1647.method462(arg6, arg7, arg0, arg1);
                                continue;
                            }
                            if (~var11.field3624 == -1402) {
                                class325.method2132(class126.field1647, 23936, var14, var11.field3564, var13, var11.field3531);
                                class33.field536[var12] = true;
                                class126.field1647.method462(arg6, arg7, arg0, arg1);
                                continue;
                            }
                            if (var11.field3624 == 1405) {
                                if (!class169.field2287 && !class329.field4849) {
                                    continue;
                                }
                                int var26 = var11.field3531 + var13;
                                int var27 = var14 + 15;
                                if (class169.field2287) {
                                    class41.field630.method922(-256, "Fps:" + class258.field3781, var26, var27, -1, 0);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (~var29 < -65537) {
                                        var30 = -65536;
                                    }
                                    class41.field630.method922(var30, "Mem:" + var29 + "k", var26, var27, -1, 0);
                                    var27 += 15;
                                    int var31 = class126.field1647.method500() / 1024;
                                    class41.field630.method922(~var31 < -65537 ? -65536 : -256, "Offheap:" + var31 + "k", var26, var27, -1, 0);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 29; ++var35) {
                                        var32 += class386.field5643[var35].method1508(0);
                                        var33 += class386.field5643[var35].method1507(-20986);
                                        var34 += class386.field5643[var35].method1498((byte) -22);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class290.method1978((byte) 34, (long) var37, 0, 2, true) + "% (" + var36 + "%)";
                                    class237.field3304.method922(-256, var38, var26, var27, -1, arg9 + -1);
                                    var27 += 12;
                                }
                                if (class113.field1469 > 0) {
                                    class237.field3304.method922(-256, "Particles: " + class227.field3130 + " / " + class113.field1469, var26, var27, -1, arg9 + -1);
                                }
                                var27 += 12;
                                if (class329.field4849) {
                                    class237.field3304.method922(-256, "Polys: " + class126.field1647.method466() + " Models: " + class126.field1647.method470(), var26, var27, -1, arg9 + -1);
                                    var27 += 12;
                                    class237.field3304.method922(-256, "Ls: " + class372.field5484 + " La: " + class237.field3312 + " NPC: " + class203.field2797 + " Pl: " + class439.field6369, var26, var27, -1, 0);
                                    class415.method2619(true);
                                    var27 += 12;
                                }
                                class33.field536[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field3555 == 0) {
                            if (!var11.field3537 && client.method401(var11) && class273.field4009 != var11) {
                                continue;
                            }
                            if (!var11.field3537) {
                                if (~(-var11.field3564 + var11.field3568) > ~var11.field3499) {
                                    var11.field3499 = -var11.field3564 + var11.field3568;
                                }
                                if (~var11.field3499 > -1) {
                                    var11.field3499 = 0;
                                }
                            }
                            if (var11.field3624 == 1407 && class126.field1647.method498()) {
                                class126.field1647.method438(var13, var14, var11.field3531, var11.field3564);
                            }
                            method2462(var23, var20, -var11.field3499 + var14, arg3, var12, var11.field3636, var21, var22, -var11.field3559 + var13, arg9);
                            if (var11.field3528 != null) {
                                method2462(var23, var20, var14 - var11.field3499, var11.field3528, var12, var11.field3636, var21, var22, -var11.field3559 + var13, 1);
                            }
                            class28 var39 = (class28) class242.field3402.method2826(false, (long) var11.field3636);
                            if (var39 != null) {
                                class84.method689(var39.field482, var22, var12, (byte) -126, var20, var14, var21, var13, var23);
                            }
                            if (var11.field3624 == 1407 && class126.field1647.method498()) {
                                class126.field1647.method449();
                                class181.field2427 = true;
                            }
                            class126.field1647.method462(arg6, arg7, arg0, arg1);
                        }
                        if (class297.field4482[var12] || class7.field105 > 1) {
                            if (var11.field3555 == 0 && !var11.field3537 && ~var11.field3564 > ~var11.field3568) {
                                client.method415(var13 - -var11.field3531, (byte) 84, var14, var11.field3499, var11.field3564, var11.field3568);
                            }
                            if (var11.field3555 != 1) {
                                if (~var11.field3555 == -3) {
                                    int var40 = 0;
                                    for (int var41 = 0; ~var11.field3661 < ~var41; ++var41) {
                                        for (int var42 = 0; var11.field3567 > var42; ++var42) {
                                            int var43 = (var11.field3519 + 32) * var42 + var13;
                                            int var44 = var14 - -((var11.field3664 + 32) * var41);
                                            if (var40 < 20) {
                                                var44 += var11.field3645[var40];
                                                var43 += var11.field3612[var40];
                                            }
                                            if (~var11.field3651[var40] >= -1) {
                                                if (var11.field3490 != null && ~var40 > -21) {
                                                    class315 var45 = var11.method1619(var40, class126.field1647, (byte) -30);
                                                    if (var45 != null) {
                                                        var45.method2070(var43, var44);
                                                    } else if (class407.field5929) {
                                                        class92.method744(20491, var11);
                                                    }
                                                }
                                            } else {
                                                boolean var46 = false;
                                                boolean var47 = false;
                                                int var48 = var11.field3651[var40] - 1;
                                                if (arg6 < var43 + 32 && ~var43 > ~arg0 && ~(var44 + 32) < ~arg7 && ~arg1 < ~var44 || class346.field5156 == var11 && ~class295.field4457 == ~var40) {
                                                    class315 var49;
                                                    if (~class117.field1526 == -2 && class211.field2863 == var40 && ~class204.field2818 == ~var11.field3636) {
                                                        var49 = class3.method16(var11.field3495[var40], 0, -110, (class436) null, var11.field3608, class126.field1647, 2, var48);
                                                    } else {
                                                        var49 = class3.method16(var11.field3495[var40], -13623264, -70, (class436) null, var11.field3608, class126.field1647, 1, var48);
                                                    }
                                                    if (var49 != null) {
                                                        if (class346.field5156 == var11 && class295.field4457 == var40) {
                                                            int var50 = -class280.field4127 + class217.field3032;
                                                            int var51 = -class308.field4574 + class277.field4060;
                                                            if (~var51 > -6 && ~var51 < 4) {
                                                                var51 = 0;
                                                            }
                                                            if (~var50 > -6 && var50 > -5) {
                                                                var50 = 0;
                                                            }
                                                            if (~class245.field3455 > -6) {
                                                                var51 = 0;
                                                                var50 = 0;
                                                            }
                                                            var49.method211(var43 + var51, var44 + var50, 0, -2013265920, 1);
                                                            if (arg5 != -1) {
                                                                class248 var52 = arg3[65535 & arg5];
                                                                int[] var53 = new int[4];
                                                                class126.field1647.method474(var53);
                                                                int var54 = var53[1];
                                                                int var55 = var53[3];
                                                                if (~(var44 - -var50) > ~var54 && ~var52.field3499 < -1) {
                                                                    int var56 = (var54 - var44 + -var50) * class216.field3021 / 3;
                                                                    if (~(class216.field3021 * 10) > ~var56) {
                                                                        var56 = class216.field3021 * 10;
                                                                    }
                                                                    if (var52.field3499 < var56) {
                                                                        var56 = var52.field3499;
                                                                    }
                                                                    var52.field3499 -= var56;
                                                                    class280.field4127 += var56;
                                                                    class92.method744(20491, var52);
                                                                }
                                                                if (~(var44 + var50 + 32) < ~var55 && var52.field3499 < -var52.field3564 + var52.field3568) {
                                                                    int var57 = (var44 + var50 + 32 - var55) * class216.field3021 / 3;
                                                                    if (var57 > class216.field3021 * 10) {
                                                                        var57 = class216.field3021 * 10;
                                                                    }
                                                                    if (~(-var52.field3499 + var52.field3568 + -var52.field3564) > ~var57) {
                                                                        var57 = var52.field3568 - var52.field3564 - var52.field3499;
                                                                    }
                                                                    class280.field4127 -= var57;
                                                                    var52.field3499 += var57;
                                                                    class92.method744(20491, var52);
                                                                }
                                                            }
                                                        } else if (class46.field696 == var11 && ~class390.field5704 == ~var40) {
                                                            var49.method211(var43, var44, 0, -2013265920, 1);
                                                        } else {
                                                            var49.method2070(var43, var44);
                                                        }
                                                    } else {
                                                        class92.method744(arg9 + 20490, var11);
                                                    }
                                                }
                                            }
                                            ++var40;
                                        }
                                    }
                                } else if (var11.field3555 == 3) {
                                    int var58;
                                    if (class274.method1814(var11, -110)) {
                                        var58 = var11.field3604;
                                        if (class273.field4009 == var11 && ~var11.field3580 != -1) {
                                            var58 = var11.field3580;
                                        }
                                    } else {
                                        var58 = var11.field3483;
                                        if (class273.field4009 == var11 && var11.field3602 != 0) {
                                            var58 = var11.field3602;
                                        }
                                    }
                                    if (var15 != 0) {
                                        if (!var11.field3656) {
                                            class126.field1647.method511(var13, var14, var11.field3531, var11.field3564, 16777215 & var58 | -(var15 & 255) + 255 << 24, 1);
                                        } else {
                                            class126.field1647.method435(var13, var14, var11.field3531, var11.field3564, var58 & 16777215 | -(255 & var15) + 255 << 24, 1);
                                        }
                                    } else if (var11.field3656) {
                                        class126.field1647.method435(var13, var14, var11.field3531, var11.field3564, var58, 0);
                                    } else {
                                        class126.field1647.method511(var13, var14, var11.field3531, var11.field3564, var58, 0);
                                    }
                                } else if (~var11.field3555 == -5) {
                                    class129 var59 = var11.method1622(8130, class126.field1647);
                                    if (var59 == null) {
                                        if (class407.field5929) {
                                            class92.method744(20491, var11);
                                        }
                                    } else {
                                        String var60 = var11.field3588;
                                        int var61;
                                        if (class274.method1814(var11, -117)) {
                                            var61 = var11.field3604;
                                            if (class273.field4009 == var11 && ~var11.field3580 != -1) {
                                                var61 = var11.field3580;
                                            }
                                            if (var11.field3512.length() > 0) {
                                                var60 = var11.field3512;
                                            }
                                        } else {
                                            var61 = var11.field3483;
                                            if (class273.field4009 == var11 && var11.field3602 != 0) {
                                                var61 = var11.field3602;
                                            }
                                        }
                                        if (var11.field3537 && ~var11.field3494 != 0) {
                                            class159 var62 = class129.method915(127, var11.field3494);
                                            var60 = var62.field2068;
                                            if (var60 == null) {
                                                var60 = "null";
                                            }
                                            if ((var62.field2000 == 1 || ~var11.field3538 != -2) && var11.field3538 != -1) {
                                                var60 = "<col=ff9040>" + var60 + "</col> x" + class114.method841(var11.field3538, 0);
                                            }
                                        }
                                        if (class415.field6015 == var11) {
                                            var61 = var11.field3483;
                                            var60 = class8.field106;
                                        }
                                        if (!var11.field3537) {
                                            var60 = class170.method1136(var60, var11, 0);
                                        }
                                        if (class256.field3740) {
                                            class126.field1647.method460(var13, var14, var11.field3531 + var13, var11.field3564 + var14);
                                        }
                                        var59.method916(var13, 16, var11.field3564, 0, -16777216 | var61, var60, (class421) null, var14, 0, var11.field3659, (int[]) null, var11.field3560, class109.field1428, !var11.field3569 ? -1 : -16777216, var11.field3531, var11.field3644);
                                        if (class256.field3740) {
                                            class126.field1647.method462(arg6, arg7, arg0, arg1);
                                        }
                                    }
                                } else if (var11.field3555 == 5) {
                                    if (!var11.field3537) {
                                        class315 var72 = var11.method1627(class126.field1647, 195845475, class274.method1814(var11, -127));
                                        if (var72 == null) {
                                            if (class407.field5929) {
                                                class92.method744(20491, var11);
                                            }
                                        } else {
                                            var72.method2070(var13, var14);
                                        }
                                    } else if (var11.field3527 >= 0) {
                                        var11.method1633(0).method837((byte) -105, 0, var11.field3564, var11.field3576 << 3, var13, class126.field1647, var14, var11.field3544 << 3, var11.field3531, 0);
                                    } else {
                                        class315 var63;
                                        if (~var11.field3494 == 0) {
                                            var63 = var11.method1627(class126.field1647, arg9 ^ 195845474, false);
                                        } else {
                                            class436 var64 = !var11.field3609 ? null : class383.field5609.field4644;
                                            var63 = class3.method16(var11.field3538, var11.field3587 | -16777216, -54, var64, var11.field3608, class126.field1647, var11.field3542, var11.field3494);
                                        }
                                        if (var63 == null) {
                                            if (class407.field5929) {
                                                class92.method744(arg9 ^ 20490, var11);
                                            }
                                        } else {
                                            int var65 = var63.method199();
                                            int var66 = var63.method207();
                                            if (!var11.field3552) {
                                                if (~var15 != -1) {
                                                    int var67 = 16777215 | 255 - (255 & var15) << 24;
                                                    if (var11.field3530 != 0) {
                                                        var63.method2068((float) var11.field3531 / 2.0F + (float) var13, (float) var11.field3564 / 2.0F + (float) var14, var11.field3531 * 4096 / var65, var11.field3530, 1, var67, 1);
                                                    } else if (~var11.field3531 == ~var65 && var11.field3564 == var66) {
                                                        var63.method211(var13, var14, 1, var67, 1);
                                                    } else {
                                                        var63.method200(var13, var14, var11.field3531, var11.field3564, 1, var67, 1);
                                                    }
                                                } else if (var11.field3530 != 0) {
                                                    var63.method2067((float) var11.field3531 / 2.0F + (float) var13, (float) var11.field3564 / 2.0F + (float) var14, var11.field3531 * 4096 / var65, var11.field3530);
                                                } else if (var11.field3531 == var65 && var11.field3564 == var66) {
                                                    var63.method2070(var13, var14);
                                                } else {
                                                    var63.method2065(var13, var14, var11.field3531, var11.field3564);
                                                }
                                            } else {
                                                class126.field1647.method460(var13, var14, var11.field3531 + var13, var11.field3564 + var14);
                                                if (var11.field3530 != 0) {
                                                    int var68 = (var65 + -1 + var11.field3531) / var65;
                                                    int var69 = (var66 - (1 - var11.field3564)) / var66;
                                                    for (int var70 = 0; var68 > var70; ++var70) {
                                                        for (int var71 = 0; ~var69 < ~var71; ++var71) {
                                                            var63.method2067((float) var65 / 2.0F + (float) (var13 - -(var65 * var70)), (float) var66 / 2.0F + (float) (var66 * var71 + var14), 4096, var11.field3530);
                                                        }
                                                    }
                                                } else if (var15 == 0) {
                                                    var63.method210(var13, var14, var11.field3531, var11.field3564, 0, 0, 1);
                                                } else {
                                                    var63.method210(var13, var14, var11.field3531, var11.field3564, 1, 16777215 | -(255 & var15) + 255 << 24, 1);
                                                }
                                                class126.field1647.method462(arg6, arg7, arg0, arg1);
                                            }
                                        }
                                    }
                                } else if (~var11.field3555 == -7) {
                                    boolean var73 = class274.method1814(var11, -122);
                                    int var74;
                                    if (var73) {
                                        var74 = var11.field3666;
                                    } else {
                                        var74 = var11.field3600;
                                    }
                                    class357.method2343(false);
                                    class257 var75 = null;
                                    int var76 = 0;
                                    if (var11.field3494 == -1) {
                                        if (~var11.field3535 == -6) {
                                            if (var11.field3638 == -1) {
                                                var75 = class219.field3055.method2727((byte) -84, 0, -1, true, class126.field1647, 0, -1, -1, (class239[]) null, -1, 1024, (class233) null, (class233) null);
                                            } else {
                                                int var77 = var11.field3638;
                                                class317 var78;
                                                if (class400.field5853 == var77) {
                                                    var78 = class383.field5609;
                                                } else {
                                                    var78 = class176.field2382[var77];
                                                }
                                                class233 var79 = var74 != -1 ? class73.method597(var74, -1) : null;
                                                if (var78 != null && (var77 == 2047 || ~class425.method2666(var78.field4650, true) == ~var11.field3643)) {
                                                    var75 = var78.field4644.method2727((byte) -84, 0, 0, true, class126.field1647, var11.field3662, var11.field3622, var11.field3606, (class239[]) null, -1, 1024, var79, (class233) null);
                                                }
                                            }
                                        } else if (~var11.field3535 != -9 && ~var11.field3535 != -10) {
                                            if (~var74 != 0) {
                                                class233 var80 = class73.method597(var74, -1);
                                                var75 = var11.method1628((byte) 84, 1024, var73, var11.field3662, var80, var11.field3606, var11.field3622, class383.field5609.field4644, class126.field1647);
                                                if (var75 == null && class407.field5929) {
                                                    class92.method744(20491, var11);
                                                }
                                            } else {
                                                var75 = var11.method1628((byte) 26, 1024, var73, 0, (class233) null, -1, -1, class383.field5609.field4644, class126.field1647);
                                                if (var75 == null && class407.field5929) {
                                                    class92.method744(arg9 + 20490, var11);
                                                }
                                            }
                                        } else {
                                            class387 var81 = class208.method1366(var11.field3638, arg9 + -1048577);
                                            class233 var82 = ~var74 == 0 ? null : class73.method597(var74, -1);
                                            if (var81 != null) {
                                                class436 var83 = !var11.field3609 ? null : class383.field5609.field4644;
                                                var75 = var81.method2509(var11.field3662, var83, -17291, class126.field1647, ~var11.field3535 == -10, 1024, var11.field3606, var11.field3643, var11.field3622, var82);
                                            }
                                        }
                                    } else {
                                        class159 var84 = class129.method915(126, var11.field3494);
                                        if (var84 != null) {
                                            class159 var85 = var84.method1064((byte) -56, var11.field3538);
                                            class233 var86 = ~var74 != 0 ? class73.method597(var74, -1) : null;
                                            class436 var87 = var11.field3609 ? class383.field5609.field4644 : null;
                                            var75 = var85.method1070(arg9 ^ -121, class126.field1647, var11.field3606, var11.field3662, 1, var87, var86, var11.field3622, 1024);
                                            if (var75 != null) {
                                                var76 = -var75.method1688() / 2;
                                            } else {
                                                class92.method744(20491, var11);
                                            }
                                        }
                                    }
                                    if (var75 != null) {
                                        int var88;
                                        if (~var11.field3561 < -1) {
                                            var88 = (var11.field3531 << 9) / var11.field3561;
                                        } else {
                                            var88 = 512;
                                        }
                                        int var89;
                                        if (~var11.field3553 < -1) {
                                            var89 = (var11.field3564 << 9) / var11.field3553;
                                        } else {
                                            var89 = 512;
                                        }
                                        int var90 = var11.field3531 / 2 + (var13 - -(var11.field3669 * var88 >> 9));
                                        int var91 = var14 - (-(var11.field3564 / 2) - (var11.field3510 * var89 >> 9));
                                        class369.field5449.method264();
                                        class126.field1647.method478(class369.field5449);
                                        int var92 = class240.field3364[var11.field3607 << 3] * var11.field3523 >> 15;
                                        int var93 = class240.field3365[var11.field3607 << 3] * var11.field3523 >> 15;
                                        class126.field1647.method477(var90, var91, var88, var89);
                                        class126.field1647.method481((float) var11.field3520, !var11.field3484 ? (float) var11.field3601 * 1.5F : (float) var11.field3601);
                                        if (class181.field2427) {
                                            class126.field1647.method472();
                                            class126.field1647.method447();
                                            class126.field1647.method462(arg6, arg7, arg0, arg1);
                                            class181.field2427 = false;
                                        }
                                        if (var11.field3633) {
                                            class126.field1647.method499(false);
                                        }
                                        if (!var11.field3537) {
                                            class96.field1309.method273(var11.field3548 << 3);
                                            class96.field1309.method271(0, var92, var93);
                                        } else {
                                            class96.field1309.method272(-var11.field3621 << 3);
                                            class96.field1309.method277(var11.field3548 << 3);
                                            class96.field1309.method271(var11.field3579, var11.field3652 + var92 + var76, var11.field3652 + var93);
                                        }
                                        class96.field1309.method268(var11.field3607 << 3);
                                        if (class256.field3740) {
                                            class126.field1647.method460(var13, var14, var13 - -var11.field3531, var11.field3564 + var14);
                                        }
                                        if (!var11.field3484) {
                                            var75.method1661(class96.field1309, (class137) null, 1);
                                        } else {
                                            var75.method1680(class96.field1309, (class137) null, var11.field3523, 1);
                                        }
                                        if (class256.field3740) {
                                            class126.field1647.method462(arg6, arg7, arg0, arg1);
                                        }
                                        if (var11.field3633) {
                                            class126.field1647.method499(true);
                                        }
                                    }
                                } else {
                                    if (~var11.field3555 == -8) {
                                        class129 var94 = var11.method1622(8130, class126.field1647);
                                        if (var94 == null) {
                                            if (class407.field5929) {
                                                class92.method744(20491, var11);
                                            }
                                            continue;
                                        }
                                        int var95 = 0;
                                        for (int var96 = 0; var96 < var11.field3661; ++var96) {
                                            for (int var97 = 0; ~var11.field3567 < ~var97; ++var97) {
                                                if (~var11.field3651[var95] < -1) {
                                                    class159 var98 = class129.method915(127, var11.field3651[var95] + -1);
                                                    String var99;
                                                    if (var98.field2000 != 1 && var11.field3495[var95] == 1) {
                                                        var99 = "<col=ff9040>" + var98.field2068 + "</col>";
                                                    } else {
                                                        var99 = "<col=ff9040>" + var98.field2068 + "</col> x" + class114.method841(var11.field3495[var95], 0);
                                                    }
                                                    int var100 = (var11.field3519 + 115) * var97 + var13;
                                                    int var101 = (var11.field3664 + 12) * var96 + var14;
                                                    if (~var11.field3659 == -1) {
                                                        var94.method904(var100, (int[]) null, !var11.field3569 ? -1 : -16777216, -10, -16777216 | var11.field3483, class109.field1428, var101, var99);
                                                    } else if (~var11.field3659 != -2) {
                                                        var94.method917(var99, var101, -16777216 | var11.field3483, class109.field1428, var100 + 114, (int[]) null, (byte) 108, !var11.field3569 ? -1 : -16777216);
                                                    } else {
                                                        var94.method923((int[]) null, class109.field1428, var11.field3569 ? -16777216 : -1, var100 - -57, (byte) 79, var11.field3483 | -16777216, var101, var99);
                                                    }
                                                }
                                                ++var95;
                                            }
                                        }
                                    }
                                    if (~var11.field3555 == -9 && class242.field3380 == var11 && class421.field6118 == class246.field3463) {
                                        int var102 = 0;
                                        int var103 = 0;
                                        class129 var104 = class41.field630;
                                        String var105 = var11.field3588;
                                        String var106 = class170.method1136(var105, var11, 0);
                                        while (var106.length() > 0) {
                                            int var114 = var106.indexOf("<br>");
                                            String var115;
                                            if (~var114 != 0) {
                                                var115 = var106.substring(0, var114);
                                                var106 = var106.substring(var114 + 4);
                                            } else {
                                                var115 = var106;
                                                var106 = "";
                                            }
                                            int var116 = class298.field4504.method2695(-1, var115);
                                            var103 += class298.field4504.field6257 + 1;
                                            if (var102 < var116) {
                                                var102 = var116;
                                            }
                                        }
                                        var102 += 6;
                                        var103 += 7;
                                        int var107 = var13 + -5 + -var102 + var11.field3531;
                                        if (var13 + 5 > var107) {
                                            var107 = var13 - -5;
                                        }
                                        int var108 = var14 - -var11.field3564 + 5;
                                        if (var102 + var107 > arg0) {
                                            var107 = -var102 + arg0;
                                        }
                                        if (~arg1 > ~(var108 - -var103)) {
                                            var108 = -var103 + arg1;
                                        }
                                        class126.field1647.method435(var107, var108, var102, var103, -96, 0);
                                        class126.field1647.method511(var107, var108, var102, var103, -16777216, 0);
                                        String var109 = var11.field3588;
                                        int var110 = var108 - (-class298.field4504.field6257 + -2);
                                        String var111 = class170.method1136(var109, var11, 0);
                                        while (var111.length() > 0) {
                                            int var112 = var111.indexOf("<br>");
                                            String var113;
                                            if (var112 != -1) {
                                                var113 = var111.substring(0, var112);
                                                var111 = var111.substring(var112 + 4);
                                            } else {
                                                var113 = var111;
                                                var111 = "";
                                            }
                                            var104.method907(var113, false, -1, var110, -16777216, var107 + 3);
                                            var110 += class298.field4504.field6257 + 1;
                                        }
                                    }
                                    if (var11.field3555 == 9) {
                                        int var117;
                                        int var118;
                                        int var119;
                                        int var120;
                                        if (!var11.field3556) {
                                            var117 = var11.field3564 + var14;
                                            var118 = var14;
                                            var119 = var13;
                                            var120 = var11.field3531 + var13;
                                        } else {
                                            var120 = var13 - -var11.field3531;
                                            var119 = var13;
                                            var118 = var11.field3564 + var14;
                                            var117 = var14;
                                        }
                                        if (var11.field3487 == 1) {
                                            class126.field1647.method493(var119, var118, var120, var117, var11.field3483, 0);
                                        } else {
                                            class126.field1647.method444(var119, var118, var120, var117, var11.field3483, var11.field3487, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIII)V", line = 1188)
    public static final void method2463(int arg0, int arg1, int arg2, int arg3) {
        ++field5514;
        class440 var4 = class186.method1241(arg3, arg1, (byte) 56);
        var4.method2756(arg1 ^ -1369656517);
        var4.field6374 = arg0;
        var4.field6375 = arg2;
    }

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "(B)V", line = 1204)
    public static void method2464(byte arg0) {
        int var1 = -120 / ((-76 - arg0) / 39);
        field5517 = null;
        field5518 = null;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V", line = 1228)
    public class377() {
        super(1, false);
    }
}
