import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class331 extends class314 {

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public int field5112 = 4;

    @OriginalMember(owner = "client!eh", name = "bb", descriptor = "I")
    public int field5127 = 1638;

    @OriginalMember(owner = "client!eh", name = "cb", descriptor = "I")
    public int field5128 = 0;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "[B")
    private byte[] field5120 = new byte[512];

    @OriginalMember(owner = "client!eh", name = "eb", descriptor = "Z")
    public boolean field5130 = true;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
    public int field5124 = 4;

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
    public int field5123 = 4;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "Lhga;")
    public static class158 field5113 = new class158(91, 9);

    @OriginalMember(owner = "client!eh", name = "gb", descriptor = "I")
    public static int field5132 = 0;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "Lmq;")
    public static class470 field5115;

    @OriginalMember(owner = "client!eh", name = "db", descriptor = "Lsw;")
    public static class701 field5129;

    @OriginalMember(owner = "client!eh", name = "fb", descriptor = "[Lob;")
    public static class686[] field5131;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "[S")
    private short[] field5118;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "[S")
    private short[] field5125;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(III)Z")
    public static final boolean method2216(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field5113 = null;
        }
        ++field5117;
        return class698.method3940(arg1, arg0, 1) || class653.method3762(arg1, -60, arg0);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class331() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field5122;
        if (arg1 < 109) {
            return null;
        } else {
            int[] var3 = super.field4928.method534((byte) -100, arg0);
            if (super.field4928.field618) {
                this.method2221(98, var3, arg0);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIII[Lpca;IZI)V")
    public static final void method2217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class665[] arg6, int arg7, boolean arg8, int arg9) {
        ++field5116;
        class627.field8857.method352(arg9, arg3, arg4, arg0);
        int var10 = 0;
        if (!arg8) {
            while (var10 < arg6.length) {
                class665 var11 = arg6[var10];
                if (var11 != null && (~var11.field9401 == ~arg7 || ~arg7 == 1412584498 && class573.field8182 == var11)) {
                    int var12;
                    if (arg1 != -1) {
                        var12 = arg1;
                    } else {
                        class462.field6896[class700.field9880].setBounds(var11.field9301 - -arg5, var11.field9402 + arg2, var11.field9411, var11.field9282);
                        var12 = class700.field9880++;
                    }
                    var11.field9405 = class562.field8084;
                    var11.field9412 = var12;
                    if (!client.method1949(var11)) {
                        label613: {
                            if (~var11.field9343 != -1) {
                                class472.method2926(3411, var11);
                            }
                            int var13 = var11.field9301 + arg5;
                            int var14 = var11.field9402 + arg2;
                            int var15 = var11.field9332;
                            if (class518.field7505 && (~client.method1955(var11).field919 != -1 || var11.field9309 == 0) && ~var15 < -128) {
                                var15 = 127;
                            }
                            if (class573.field8182 == var11) {
                                if (arg7 != -1412584499 && (~class668.field9450 == ~var11.field9265 || ~class239.field3785 == ~var11.field9265)) {
                                    class655.field9152 = arg2;
                                    class472.field6982 = arg5;
                                    class598.field8488 = arg6;
                                    break label613;
                                }
                                if (class38.field520 && client.field4445) {
                                    int var16 = class464.field6929.method451(1196);
                                    int var17 = class464.field6929.method454(114);
                                    int var18 = var17 - class426.field6477;
                                    int var19 = var16 - class589.field8375;
                                    if (~var19 > ~class66.field857) {
                                        var19 = class66.field857;
                                    }
                                    if (var18 < class157.field2692) {
                                        var18 = class157.field2692;
                                    }
                                    if (class66.field857 + class409.field6303.field9411 < var11.field9411 + var19) {
                                        var19 = class66.field857 + class409.field6303.field9411 + -var11.field9411;
                                    }
                                    if (var18 - -var11.field9282 > class157.field2692 - -class409.field6303.field9282) {
                                        var18 = class409.field6303.field9282 - var11.field9282 + class157.field2692;
                                    }
                                    var13 = var19;
                                    var14 = var18;
                                }
                                if (~class239.field3785 == ~var11.field9265) {
                                    var15 = 128;
                                }
                            }
                            int var20;
                            int var21;
                            int var22;
                            int var23;
                            if (var11.field9309 == 2) {
                                var20 = arg0;
                                var21 = arg3;
                                var22 = arg9;
                                var23 = arg4;
                            } else {
                                int var24 = var11.field9411 + var13;
                                int var25 = var14 - -var11.field9282;
                                var22 = ~var13 >= ~arg9 ? arg9 : var13;
                                if (var11.field9309 == 9) {
                                    ++var25;
                                    ++var24;
                                }
                                var21 = arg3 >= var14 ? arg3 : var14;
                                var23 = ~var24 > ~arg4 ? var24 : arg4;
                                var20 = ~arg0 >= ~var25 ? arg0 : var25;
                            }
                            if (~var22 > ~var23 && var20 > var21) {
                                if (~var11.field9343 != -1) {
                                    if (class150.field2485 == var11.field9343 || class371.field5819 == var11.field9343) {
                                        class635.method3695(false, var14, var11.field9282, var13, var11.field9411, ~class371.field5819 == ~var11.field9343);
                                        class532.field7753[var12] = true;
                                        class627.field8857.method352(arg9, arg3, arg4, arg0);
                                        break label613;
                                    }
                                    if (~class505.field7379 == ~var11.field9343) {
                                        if (var11.method3808(10492, class627.field8857) != null) {
                                            class636.method3698(true);
                                            class519.method3131(class627.field8857, var14, var13, var11, -26192);
                                            class185.field3111[var12] = true;
                                            class627.field8857.method352(arg9, arg3, arg4, arg0);
                                        }
                                        break label613;
                                    }
                                    if (~class231.field3688 == ~var11.field9343) {
                                        if (var11.method3808(10492, class627.field8857) != null) {
                                            class404.method2590(219836194, var11, var13, var14);
                                            class185.field3111[var12] = true;
                                            class627.field8857.method352(arg9, arg3, arg4, arg0);
                                        }
                                        break label613;
                                    }
                                    if (~class434.field6598 == ~var11.field9343) {
                                        class658.method3779(class627.field8857, var11.field9282, var13, var11.field9411, -123, var14, class48.field645);
                                        class532.field7753[var12] = true;
                                        class627.field8857.method352(arg9, arg3, arg4, arg0);
                                        break label613;
                                    }
                                    if (~class428.field6525 == ~var11.field9343) {
                                        class407.method2609(-92, class627.field8857, var11.field9282, var13, var11.field9411, var14);
                                        class532.field7753[var12] = true;
                                        class627.field8857.method352(arg9, arg3, arg4, arg0);
                                        break label613;
                                    }
                                    if (class31.field454 == var11.field9343) {
                                        if (!class217.field3567 && !class499.field7327) {
                                            break label613;
                                        }
                                        int var26 = var11.field9411 + var13;
                                        int var27 = var14 + 15;
                                        if (class217.field3567) {
                                            int var28 = -256;
                                            if (class41.field583 < 20) {
                                                var28 = -65536;
                                            }
                                            class573.field8183.method2655(var27, -1, var26, var28, "Fps:" + class41.field583, (byte) 71);
                                            var27 += 15;
                                            Runtime var29 = Runtime.getRuntime();
                                            int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            int var31 = -256;
                                            if (~var30 < -98305) {
                                                var31 = -65536;
                                                if (class527.field7699) {
                                                    class168.method1357(-44);
                                                    for (int var32 = 0; ~var32 > -11; ++var32) {
                                                        System.gc();
                                                    }
                                                    var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                                    if (var30 > 65536) {
                                                        class307.method2122(4, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", (byte) 126);
                                                    }
                                                }
                                            }
                                            class573.field8183.method2655(var27, -1, var26, var31, "Mem:" + var30 + "k", (byte) 71);
                                            var27 += 15;
                                            class573.field8183.method2655(var27, -1, var26, -256, "In:" + class192.field3181 + "B/s Out:" + class102.field1686 + "B/s", (byte) 71);
                                            var27 += 15;
                                            int var33 = class627.field8857.method338() / 1024;
                                            class573.field8183.method2655(var27, -1, var26, var33 <= 65536 ? -256 : -65536, "Offheap:" + var33 + "k", (byte) 71);
                                            var27 += 15;
                                            int var34 = 0;
                                            int var35 = 0;
                                            int var36 = 0;
                                            for (int var37 = 0; ~var37 > -36; ++var37) {
                                                if (class564.field8100[var37] != null) {
                                                    var34 += class564.field8100[var37].method2993(38);
                                                    var35 += class564.field8100[var37].method2989(-78);
                                                    var36 += class564.field8100[var37].method2986((byte) 77);
                                                }
                                            }
                                            int var38 = var36 * 100 / var34;
                                            int var39 = var35 * 10000 / var34;
                                            String var40 = "Cache:" + class255.method1809((long) var39, true, 0, 2, (byte) -104) + "% (" + var38 + "%)";
                                            class329.field5095.method2655(var27, -1, var26, -256, var40, (byte) 71);
                                            var27 += 12;
                                        }
                                        if (class429.field6545 > 0) {
                                            class329.field5095.method2655(var27, -1, var26, -256, "Particles: " + class319.field5000 + " / " + class429.field6545, (byte) 71);
                                        }
                                        var27 += 12;
                                        if (class499.field7327) {
                                            class329.field5095.method2655(var27, -1, var26, -256, "Polys: " + class627.field8857.method131() + " Models: " + class627.field8857.method340(), (byte) 71);
                                            var27 += 12;
                                            class329.field5095.method2655(var27, -1, var26, -256, "Ls: " + class674.field9500 + " La: " + class330.field5102 + " NPC: " + class134.field2204 + " Pl: " + class246.field3932, (byte) 71);
                                            var27 += 12;
                                            class500.method3048(true);
                                        }
                                        class532.field7753[var12] = true;
                                        break label613;
                                    }
                                }
                                if (var11.field9309 == 0) {
                                    if (~class700.field9882 == ~var11.field9343 && class627.field8857.method168()) {
                                        class627.field8857.method110(var13, var14, var11.field9411, var11.field9282);
                                    }
                                    method2217(var20, var12, -var11.field9394 + var14, var21, var23, var13 - var11.field9393, arg6, var11.field9400, false, var22);
                                    if (var11.field9296 != null) {
                                        method2217(var20, var12, -var11.field9394 + var14, var21, var23, var13 - var11.field9393, var11.field9296, var11.field9400, false, var22);
                                    }
                                    class102 var41 = (class102) class486.field7115.method1558((long) var11.field9400, (byte) -93);
                                    if (var41 != null) {
                                        class23.method379((byte) 73, var41.field1687, var23, var12, var22, var14, var21, var13, var20);
                                    }
                                    if (~class700.field9882 == ~var11.field9343 && class627.field8857.method168()) {
                                        class627.field8857.method182();
                                    }
                                    class627.field8857.method352(arg9, arg3, arg4, arg0);
                                }
                                if (class476.field7053[var12] || ~class150.field2483 < -2) {
                                    if (var11.field9309 == 3) {
                                        if (~var15 == -1) {
                                            if (var11.field9385) {
                                                class627.field8857.method335(var13, var14, var11.field9411, var11.field9282, var11.field9397, 0);
                                            } else {
                                                class627.field8857.method344(var13, var14, var11.field9411, var11.field9282, var11.field9397, 0);
                                            }
                                        } else if (var11.field9385) {
                                            class627.field8857.method335(var13, var14, var11.field9411, var11.field9282, 16777215 & var11.field9397 | -(var15 & 255) + 255 << 24, 1);
                                        } else {
                                            class627.field8857.method344(var13, var14, var11.field9411, var11.field9282, var11.field9397 & 16777215 | -(255 & var15) + 255 << 24, 1);
                                        }
                                    } else if (var11.field9309 == 4) {
                                        class418 var42 = var11.method3820(class627.field8857, (byte) 100);
                                        if (var42 == null) {
                                            if (class549.field7990) {
                                                class362.method2415(-122, var11);
                                            }
                                        } else {
                                            int var43 = var11.field9397;
                                            String var44 = var11.field9427;
                                            if (var11.field9354 != -1) {
                                                class117 var45 = class91.field1083.method2859(var11.field9354, (byte) 122);
                                                var44 = var45.field1869;
                                                if (var44 == null) {
                                                    var44 = "null";
                                                }
                                                if ((var45.field1845 == 1 || var11.field9341 != 1) && ~var11.field9341 != 0) {
                                                    var44 = "<col=ff9040>" + var44 + "</col> x" + class665.method3823(var11.field9341, (byte) -69);
                                                }
                                            }
                                            if (class672.field9481 == var11) {
                                                var44 = class122.field2003.method1091(class135.field2206, 1);
                                                var43 = var11.field9397;
                                            }
                                            if (class347.field5566) {
                                                class627.field8857.method271(var13, var14, var13 - -var11.field9411, var14 - -var11.field9282);
                                            }
                                            var42.method2670(var43 | -(255 & var15) + 255 << 24, var13, var44, var11.field9361, 0, var11.field9282, !var11.field9410 ? -1 : -(var15 & 255) + 255 << 24, var11.field9411, var11.field9302, (byte) 73, var14, 0, var11.field9306, (class617) null, class220.field3579, (int[]) null, var11.field9331);
                                            if (class347.field5566) {
                                                class627.field8857.method352(arg9, arg3, arg4, arg0);
                                            }
                                        }
                                    } else if (var11.field9309 == 5) {
                                        if (var11.field9396 >= 0) {
                                            var11.method3812(-1552, class275.field4412, class254.field4046).method1147(0, (byte) -122, var11.field9315 << 3, class627.field8857, var14, 0, var11.field9337 << 3, var11.field9282, var11.field9411, var13);
                                        } else {
                                            class702 var47;
                                            if (var11.field9354 != -1) {
                                                class144 var46 = var11.field9416 ? class567.field8141.field4778 : null;
                                                var47 = class91.field1083.method2860(-80, -16777216 | var11.field9305, var11.field9354, var11.field9351, class627.field8857, var46, var11.field9341, var11.field9392);
                                            } else {
                                                var47 = var11.method3816((byte) 96, class627.field8857);
                                            }
                                            if (var47 != null) {
                                                int var48 = var47.method1076();
                                                int var49 = var47.method1079();
                                                int var50 = (var11.field9397 != 0 ? var11.field9397 & 16777215 : 16777215) | 255 - (255 & var15) << 24;
                                                if (!var11.field9426) {
                                                    if (var11.field9397 == 0 && ~var15 == -1) {
                                                        if (~var11.field9356 != -1) {
                                                            var47.method3963((float) var11.field9411 / 2.0F + (float) var13, (float) var11.field9282 / 2.0F + (float) var14, var11.field9411 * 4096 / var48, var11.field9356);
                                                        } else if (~var11.field9411 == ~var48 && ~var11.field9282 == ~var49) {
                                                            var47.method3960(var13, var14);
                                                        } else {
                                                            var47.method3958(var13, var14, var11.field9411, var11.field9282);
                                                        }
                                                    } else if (~var11.field9356 == -1) {
                                                        if (var11.field9411 == var48 && var11.field9282 == var49) {
                                                            var47.method1086(var13, var14, 0, var50, 1);
                                                        } else {
                                                            var47.method3954(var13, var14, var11.field9411, var11.field9282, 0, var50, 1);
                                                        }
                                                    } else {
                                                        var47.method3959((float) var11.field9411 / 2.0F + (float) var13, (float) var11.field9282 / 2.0F + (float) var14, var11.field9411 * 4096 / var48, var11.field9356, 0, var50, 1);
                                                    }
                                                } else {
                                                    class627.field8857.method271(var13, var14, var11.field9411 + var13, var14 - -var11.field9282);
                                                    if (var11.field9356 != 0) {
                                                        int var51 = (var48 + -1 + var11.field9411) / var48;
                                                        int var52 = (var49 + -1 + var11.field9282) / var49;
                                                        for (int var53 = 0; var51 > var53; ++var53) {
                                                            for (int var54 = 0; ~var52 < ~var54; ++var54) {
                                                                if (~var11.field9397 == -1) {
                                                                    var47.method3963((float) var48 / 2.0F + (float) (var13 - -(var48 * var53)), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field9356);
                                                                } else {
                                                                    var47.method3959((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field9356, 0, var50, 1);
                                                                }
                                                            }
                                                        }
                                                    } else if (~var11.field9397 == -1 && var15 == 0) {
                                                        var47.method3956(var13, var14, var11.field9411, var11.field9282);
                                                    } else {
                                                        var47.method1087(var13, var14, var11.field9411, var11.field9282, 0, var50, 1);
                                                    }
                                                    class627.field8857.method352(arg9, arg3, arg4, arg0);
                                                }
                                            } else if (class549.field7990) {
                                                class362.method2415(-120, var11);
                                            }
                                        }
                                    } else if (var11.field9309 != 6) {
                                        if (var11.field9309 == 9) {
                                            int var74;
                                            int var75;
                                            int var76;
                                            int var77;
                                            if (!var11.field9295) {
                                                var74 = var11.field9411 + var13;
                                                var75 = var11.field9282 + var14;
                                                var76 = var14;
                                                var77 = var13;
                                            } else {
                                                var75 = var14;
                                                var74 = var11.field9411 + var13;
                                                var77 = var13;
                                                var76 = var11.field9282 + var14;
                                            }
                                            if (var11.field9259 != 1) {
                                                class627.field8857.method280(var77, var76, var74, var75, var11.field9397, var11.field9259, 0);
                                            } else {
                                                class627.field8857.method345(var77, var76, var74, var75, var11.field9397, 0);
                                            }
                                        }
                                    } else {
                                        class294.method2060(108);
                                        class55 var55 = null;
                                        int var56 = 0;
                                        if (~var11.field9354 != 0) {
                                            class117 var57 = class91.field1083.method2859(var11.field9354, (byte) 123);
                                            if (var57 != null) {
                                                class117 var58 = var57.method1049(var11.field9341, 4);
                                                class428 var59 = var11.field9376 == -1 ? null : class636.field8942.method2872((byte) 11, var11.field9376);
                                                class144 var60 = !var11.field9416 ? null : class567.field8141.field4778;
                                                var55 = var58.method1050(var60, 1, -16083, 2048, var11.field9299, var11.field9387, var11.field9383, class627.field8857, var59);
                                                if (var55 == null) {
                                                    class362.method2415(-125, var11);
                                                } else {
                                                    var56 = -var55.method623() >> 1;
                                                }
                                            }
                                        } else if (~var11.field9414 != -6) {
                                            if (~var11.field9414 != -9 && ~var11.field9414 != -10) {
                                                if (~var11.field9376 != 0) {
                                                    class428 var61 = class636.field8942.method2872((byte) 11, var11.field9376);
                                                    var55 = var11.method3819(var11.field9299, class91.field1083, var11.field9387, class472.field6988, class636.field8942, (byte) 126, class567.field8141.field4778, class538.field7860, var61, class385.field5985, var11.field9383, 2048, class539.field7869, class627.field8857);
                                                    if (var55 == null && class549.field7990) {
                                                        class362.method2415(-124, var11);
                                                    }
                                                } else {
                                                    var55 = var11.method3819(0, class91.field1083, -1, class472.field6988, class636.field8942, (byte) 124, class567.field8141.field4778, class538.field7860, (class428) null, class385.field5985, -1, 2048, class539.field7869, class627.field8857);
                                                    if (var55 == null && class549.field7990) {
                                                        class362.method2415(-126, var11);
                                                    }
                                                }
                                            } else {
                                                class527 var62 = class605.method3523(false, (byte) 126, var11.field9307);
                                                class428 var63 = var11.field9376 != -1 ? class636.field8942.method2872((byte) 11, var11.field9376) : null;
                                                if (var62 != null) {
                                                    class144 var64 = var11.field9416 ? class567.field8141.field4778 : null;
                                                    var55 = var62.method3195(2048, var11.field9414 == 9, -4113, var64, var11.field9292, var11.field9387, var11.field9383, var63, class627.field8857, var11.field9299);
                                                }
                                            }
                                        } else {
                                            int var65 = var11.field9307;
                                            if (var65 >= 0 && var65 < 2048) {
                                                class304 var66 = class597.field8465[var65];
                                                class428 var67 = var11.field9376 != -1 ? class636.field8942.method2872((byte) 11, var11.field9376) : null;
                                                if (var66 != null && (~class114.field1793 == ~var65 || class614.method3576(var66.field4792, 13149) == var11.field9292)) {
                                                    var55 = var66.field4778.method1219(0, 0, class385.field5985, var11.field9299, (class428) null, var11.field9383, -1, class539.field7869, 2048, 0, (int[]) null, class627.field8857, class538.field7860, var67, class472.field6988, var11.field9387, (byte) -78, (class684[]) null, true, class91.field1083, class636.field8942);
                                                }
                                            }
                                        }
                                        if (var55 != null) {
                                            int var68;
                                            if (var11.field9297 > 0) {
                                                var68 = (var11.field9411 << 9) / var11.field9297;
                                            } else {
                                                var68 = 512;
                                            }
                                            int var69;
                                            if (~var11.field9366 >= -1) {
                                                var69 = 512;
                                            } else {
                                                var69 = (var11.field9282 << 9) / var11.field9366;
                                            }
                                            int var70 = var13 - -(var11.field9411 / 2);
                                            int var71 = var11.field9282 / 2 + var14;
                                            if (!var11.field9274) {
                                                var71 += var11.field9284 * var69 >> 9;
                                                var70 += var11.field9263 * var68 >> 9;
                                            }
                                            class183.field3093.method504();
                                            class627.field8857.method346(class183.field3093);
                                            class627.field8857.method318(var70, var71, var68, var69);
                                            class627.field8857.method136();
                                            if (var11.field9261) {
                                                class627.field8857.method334(false);
                                            }
                                            if (var11.field9274) {
                                                class240.field3805.method521(var11.field9350);
                                                class240.field3805.method511(var11.field9381);
                                                class240.field3805.method515(var11.field9367);
                                                class240.field3805.method505(var11.field9263, var11.field9284, var11.field9268);
                                            } else {
                                                int var72 = (var11.field9272 << 2) * class567.field8139[var11.field9350 << 3] >> 14;
                                                int var73 = (var11.field9272 << 2) * class567.field8138[var11.field9350 << 3] >> 14;
                                                class240.field3805.method508(-var11.field9367 << 3);
                                                class240.field3805.method511(var11.field9381 << 3);
                                                class240.field3805.method505(var11.field9323 << 2, (var11.field9365 << 2) + var72 - -var56, (var11.field9365 << 2) + var73);
                                                class240.field3805.method517(var11.field9350 << 3);
                                            }
                                            var11.method3817(-69, class627.field8857, var55, class240.field3805, class562.field8084);
                                            if (class347.field5566) {
                                                class627.field8857.method271(var13, var14, var11.field9411 + var13, var14 - -var11.field9282);
                                            }
                                            if (var11.field9274) {
                                                if (!var11.field9352) {
                                                    var55.method606(class240.field3805, (class306) null, 1);
                                                    if (var11.field9379 != null) {
                                                        class627.field8857.method354(var11.field9379.method3254());
                                                    }
                                                } else {
                                                    var55.method613(class240.field3805, (class306) null, var11.field9272, 1);
                                                }
                                            } else if (var11.field9352) {
                                                var55.method613(class240.field3805, (class306) null, var11.field9272 << 2, 1);
                                            } else {
                                                var55.method606(class240.field3805, (class306) null, 1);
                                                if (var11.field9379 != null) {
                                                    class627.field8857.method354(var11.field9379.method3254());
                                                }
                                            }
                                            if (class347.field5566) {
                                                class627.field8857.method352(arg9, arg3, arg4, arg0);
                                            }
                                            if (var11.field9261) {
                                                class627.field8857.method334(true);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ++var10;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIBIII)I")
    private final int method2218(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field5111;
        int var8 = arg6 >> 12;
        int var9 = -119 % ((-18 - arg3) / 42);
        int var10 = var8 - -1;
        int var11 = arg6 & 4095;
        int var12 = var8 & 255;
        if (arg0 <= var10) {
            var10 = 0;
        }
        int var13 = var10 & 255;
        int var14 = var11 + -4096;
        int var15 = arg2 + -4096;
        int var16 = this.field5120[arg5 + var12] & 3;
        int var17 = class439.field6696[var11];
        int var18;
        if (~var16 < -2) {
            var18 = ~var16 != -3 ? -arg2 + -var11 : var11 - arg2;
        } else {
            var18 = ~var16 == -1 ? arg2 + var11 : -var11 + arg2;
        }
        int var19 = this.field5120[arg5 + var13] & 3;
        int var20;
        if (~var19 < -2) {
            var20 = ~var19 == -3 ? -arg2 + var14 : -arg2 + -var14;
        } else {
            var20 = var19 != 0 ? arg2 - var14 : arg2 + var14;
        }
        int var21 = ((-var18 + var20) * var17 >> 12) + var18;
        int var22 = this.field5120[arg1 + var12] & 3;
        int var23;
        if (var22 <= 1) {
            var23 = ~var22 == -1 ? var11 + var15 : -var11 + var15;
        } else {
            var23 = var22 == 2 ? -var15 + var11 : -var11 + -var15;
        }
        int var24 = this.field5120[arg1 + var13] & 3;
        int var25;
        if (var24 <= 1) {
            var25 = var24 == 0 ? var14 - -var15 : -var14 + var15;
        } else {
            var25 = ~var24 != -3 ? -var14 + -var15 : var14 - var15;
        }
        int var26 = ((-var23 + var25) * var17 >> 12) + var23;
        return ((-var21 + var26) * arg4 >> 12) + var21;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLie;I)V")
    public final void method5(byte arg0, class6 arg1, int arg2) {
        ++field5114;
        if (arg0 >= -1) {
            field5115 = null;
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field5124 = arg1.method70(-9059);
            } else {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        this.field5123 = this.field5112 = arg1.method70(-9059);
                        return;
                    }
                    if (~arg2 == -5) {
                        this.field5128 = arg1.method70(-9059);
                        return;
                    }
                    if (~arg2 == -6) {
                        this.field5123 = arg1.method70(-9059);
                        return;
                    }
                    if (~arg2 == -7) {
                        this.field5112 = arg1.method70(-9059);
                        return;
                    }
                } else {
                    this.field5127 = arg1.method45(-8652);
                    if (this.field5127 < 0) {
                        this.field5125 = new short[this.field5124];
                        for (int var5 = 0; var5 < this.field5124; ++var5) {
                            this.field5125[var5] = (short) arg1.method45(-8652);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field5130 = ~arg1.method70(-9059) == -2;
        }
    }

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)V")
    private final void method2219(int arg0) {
        ++field5119;
        if (this.field5127 > 0) {
            this.field5125 = new short[this.field5124];
            this.field5118 = new short[this.field5124];
            for (int var2 = 0; var2 < this.field5124; ++var2) {
                this.field5125[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field5127 / 4096.0F), (double) var2)));
                this.field5118[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field5125 != null && ~this.field5125.length == ~this.field5124) {
            this.field5118 = new short[this.field5124];
            for (int var3 = 0; ~var3 > ~this.field5124; ++var3) {
                this.field5118[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 <= 100) {
            this.method3((byte) 120);
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)V")
    public static void method2220(boolean arg0) {
        field5129 = null;
        field5131 = null;
        if (!arg0) {
            method2220(false);
        }
        field5113 = null;
        field5115 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[II)V")
    public final void method2221(int arg0, int[] arg1, int arg2) {
        ++field5126;
        int var4 = class657.field9166[arg2] * this.field5112;
        int var5 = -46 % ((22 - arg0) / 55);
        if (~this.field5124 == -2) {
            int var6 = this.field5118[0] << 12;
            short var7 = this.field5125[0];
            int var8 = this.field5112 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = this.field5123 * var6 >> 12;
            int var11 = var9 >> 12;
            int var12 = var11 + 1;
            if (~var8 >= ~var12) {
                var12 = 0;
            }
            int var13 = var9 & 4095;
            int var14 = 255 & this.field5120[var12 & 255];
            int var15 = class439.field6696[var13];
            int var16 = 255 & this.field5120[var11 & 255];
            if (!this.field5130) {
                for (int var17 = 0; class81.field1009 > var17; ++var17) {
                    int var18 = class328.field5091[var17] * this.field5123;
                    int var19 = this.method2218(var10, var14, var13, (byte) 66, var15, var16, var6 * var18 >> 12);
                    arg1[var17] = var7 * var19 >> 12;
                }
            } else {
                for (int var20 = 0; ~var20 > ~class81.field1009; ++var20) {
                    int var21 = class328.field5091[var20] * this.field5123;
                    int var22 = this.method2218(var10, var14, var13, (byte) 119, var15, var16, var6 * var21 >> 12);
                    int var23 = var7 * var22 >> 12;
                    arg1[var20] = (var23 >> 1) + 2048;
                }
            }
        } else {
            short var24 = this.field5125[0];
            if (var24 > 8 || var24 < -8) {
                int var25 = this.field5118[0] << 12;
                int var26 = this.field5123 * var25 >> 12;
                int var27 = var4 * var25 >> 12;
                int var28 = this.field5112 * var25 >> 12;
                int var29 = var27 >> 12;
                int var30 = var29 + 1;
                if (var28 <= var30) {
                    var30 = 0;
                }
                int var31 = var27 & 4095;
                int var32 = this.field5120[255 & var30] & 255;
                int var33 = this.field5120[var29 & 255] & 255;
                int var34 = class439.field6696[var31];
                for (int var35 = 0; var35 < class81.field1009; ++var35) {
                    int var55 = class328.field5091[var35] * this.field5123;
                    int var56 = this.method2218(var26, var32, var31, (byte) 75, var34, var33, var25 * var55 >> 12);
                    arg1[var35] = var24 * var56 >> 12;
                }
            }
            for (int var36 = 1; ~var36 > ~this.field5124; ++var36) {
                short var37 = this.field5125[var36];
                if (var37 > 8 || var37 < -8) {
                    int var38 = this.field5118[var36] << 12;
                    int var39 = this.field5112 * var38 >> 12;
                    int var40 = var4 * var38 >> 12;
                    int var41 = this.field5123 * var38 >> 12;
                    int var42 = var40 >> 12;
                    int var43 = var42 + 1;
                    if (var39 <= var43) {
                        var43 = 0;
                    }
                    int var44 = var40 & 4095;
                    int var45 = 255 & this.field5120[255 & var43];
                    int var46 = 255 & this.field5120[var42 & 255];
                    int var47 = class439.field6696[var44];
                    if (this.field5130 && ~(this.field5124 + -1) == ~var36) {
                        for (int var48 = 0; ~var48 > ~class81.field1009; ++var48) {
                            int var49 = class328.field5091[var48] * this.field5123;
                            int var50 = this.method2218(var41, var45, var44, (byte) 70, var47, var46, var38 * var49 >> 12);
                            int var51 = (var37 * var50 >> 12) + arg1[var48];
                            arg1[var48] = (var51 >> 1) + 2048;
                        }
                    } else {
                        for (int var52 = 0; var52 < class81.field1009; ++var52) {
                            int var53 = class328.field5091[var52] * this.field5123;
                            int var54 = this.method2218(var41, var45, var44, (byte) -112, var47, var46, var38 * var53 >> 12);
                            arg1[var52] += var37 * var54 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        ++field5121;
        this.field5120 = class438.method2777(this.field5128, true);
        this.method2219(126);
        if (arg0 != -15) {
            this.method5((byte) -8, (class6) null, 108);
        }
        for (int var2 = this.field5124 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field5125[var2];
            if (~var3 < -9) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field5124;
        }
    }
}
