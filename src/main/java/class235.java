import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class235 extends class401 {

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
    private int field3257 = 0;

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "Z")
    public static boolean field3256 = false;

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "[I")
    public static int[] field3255 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V")
    public static void method1500(int arg0) {
        field3255 = null;
        if (arg0 != -30308) {
            method1503((class712) null, (byte) -15, 19, 10, (class545) null);
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lwu;Lfaa;)V")
    public class235(class557 arg0, class32 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZZ)V")
    public final void method681(boolean arg0, boolean arg1) {
        ++field3252;
        int var3 = super.field5559.field1498.method554(class95.field1381, (byte) -22, super.field5550.method116()) - -super.field5559.field1506;
        int var4 = super.field5559.field1503.method2838(super.field5550.method108(), class631.field8989, arg0) + super.field5559.field1502;
        super.field5550.method112((float) (super.field5550.method116() / 2 + var3), (float) (var4 - -(super.field5550.method108() / 2)), 4096, this.field3257);
        this.field3257 += ((class32) super.field5559).field484;
    }

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)V")
    public static final void method1501(int arg0) {
        class308.field3976.method3202((byte) 127);
        ++field3253;
        if (arg0 != 128) {
            field3250 = -65;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(CB)Z")
    public static final boolean method1502(char arg0, byte arg1) {
        if (arg1 > -5) {
            field3256 = false;
        }
        ++field3254;
        return ~arg0 <= -49 && ~arg0 >= -58 || arg0 >= 'A' && ~arg0 >= -91 || arg0 >= 'a' && ~arg0 >= -123;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lpaa;BIILha;)V")
    public static final void method1503(class712 arg0, byte arg1, int arg2, int arg3, class545 arg4) {
        ++field3251;
        class571 var5 = arg0.method3996(99, arg4);
        if (var5 != null) {
            int var6 = 19 % ((60 - arg1) / 63);
            arg4.method2097(arg3, arg2, arg3 - -arg0.field9966, arg0.field10011 + arg2);
            if (~class486.field6561 != -3 && class486.field6561 != 5 && class590.field8471 != null) {
                int var7;
                int var8;
                int var9;
                int var10;
                if (class665.field9377 != 4) {
                    var7 = (int) (-class403.field5597) - -class732.field10234 & 16383;
                    var8 = -(class592.field8541 * 16) + 4096;
                    var9 = class473.field6483.field9489;
                    var10 = class473.field6483.field9490;
                } else {
                    var8 = 4096;
                    var10 = class264.field3603;
                    var9 = class668.field9412;
                    var7 = 16383 & (int) (-class403.field5597);
                }
                int var11 = var10 / 128 + 48 + -((class514.field7179 + -104) * 2);
                int var12 = 208 - class456.field6281 * 2 + class456.field6281 * 4 + 48 - var9 / 128;
                class590.field8471.method102((float) arg0.field9966 / 2.0F + (float) arg3, (float) arg0.field10011 / 2.0F + (float) arg2, (float) var11, (float) var12, var8, var7 << 2, var5, arg3, arg2);
                for (class285 var13 = (class285) class303.field3947.method3118((byte) 73); var13 != null; var13 = (class285) class303.field3947.method3111(126)) {
                    int var59 = var13.field3770;
                    int var60 = ((268425690 & class669.field9413.field6304[var59]) >> 14) - class179.field2535;
                    int var61 = (16383 & class669.field9413.field6304[var59]) - class510.field7109;
                    int var62 = var60 * 4 + -(var10 / 128) + 2;
                    int var63 = var61 * 4 + -(var9 / 128) + 2;
                    class718.method4033(var63, arg0, arg2, class669.field9413.field6305[var59], var5, (byte) 125, arg3, arg4, var62);
                }
                for (int var14 = 0; ~class431.field5932 < ~var14; ++var14) {
                    int var56 = class313.field4019[var14] * 4 - -2 + -(var10 / 128);
                    int var57 = class671.field9442[var14] * 4 + -(var9 / 128) + 2;
                    class30 var58 = class264.field3604.method3188(class141.field1953[var14], (byte) -57);
                    if (var58.field455 != null) {
                        var58 = var58.method219(-1, class554.field7826);
                        if (var58 == null || var58.field380 == -1) {
                            continue;
                        }
                    }
                    class718.method4033(var57, arg0, arg2, var58.field380, var5, (byte) 85, arg3, arg4, var56);
                }
                for (class731 var15 = (class731) class118.field1631.method1382(27901); var15 != null; var15 = (class731) class118.field1631.method1383(false)) {
                    int var51 = (int) (3L & var15.field7166 >> 28);
                    if (class701.field9767 == var51) {
                        int var52 = (int) (16383L & var15.field7166) + -class179.field2535;
                        int var53 = (int) (16383L & var15.field7166 >> 14) - class510.field7109;
                        int var54 = var52 * 4 - (-2 - -(var10 / 128));
                        int var55 = var53 * 4 - -2 + -(var9 / 128);
                        class615.method3608(class548.field7728[0], (byte) 67, var54, arg3, var55, var5, arg2, arg0);
                    }
                }
                for (int var16 = 0; class676.field9533 > var16; ++var16) {
                    class15 var46 = (class15) class403.field5587.method1381(true, (long) class731.field10231[var16]);
                    if (var46 != null) {
                        class55 var47 = var46.field204;
                        if (var47.method370(-713165362) && class473.field6483.field9501 == var47.field9501) {
                            class11 var48 = var47.field771;
                            if (var48 != null && var48.field111 != null) {
                                var48 = var48.method55((byte) 118, class554.field7826);
                            }
                            if (var48 != null && var48.field101 && var48.field139) {
                                int var49 = var47.field9490 / 128 - var10 / 128;
                                int var50 = var47.field9489 / 128 + -(var9 / 128);
                                if (var48.field144 != -1) {
                                    class718.method4033(var50, arg0, arg2, var48.field144, var5, (byte) 94, arg3, arg4, var49);
                                } else {
                                    class615.method3608(class548.field7728[1], (byte) 67, var49, arg3, var50, var5, arg2, arg0);
                                }
                            }
                        }
                    }
                }
                int var17 = class147.field2030;
                int[] var18 = class351.field4456;
                for (int var19 = 0; ~var17 < ~var19; ++var19) {
                    class655 var38 = class40.field563[var18[var19]];
                    if (var38 != null && var38.method3782(-713165362) && !var38.field9255 && class473.field6483 != var38 && class473.field6483.field9501 == var38.field9501) {
                        int var39 = var38.field9490 / 128 - var10 / 128;
                        int var40 = var38.field9489 / 128 + -(var9 / 128);
                        boolean var41 = false;
                        for (int var42 = 0; class713.field10110 > var42; ++var42) {
                            if (var38.field9272.equals(class570.field8079[var42]) && ~class139.field1905[var42] != -1) {
                                var41 = true;
                                break;
                            }
                        }
                        boolean var43 = false;
                        for (int var44 = 0; ~class656.field9289 < ~var44; ++var44) {
                            if (var38.field9272.equals(class265.field3618[var44].field2884)) {
                                var43 = true;
                                break;
                            }
                        }
                        boolean var45 = false;
                        if (~class473.field6483.field9261 != -1 && var38.field9261 != 0 && ~class473.field6483.field9261 == ~var38.field9261) {
                            var45 = true;
                        }
                        if (!var38.field9264) {
                            if (!var41) {
                                if (var43) {
                                    class615.method3608(class548.field7728[5], (byte) 67, var39, arg3, var40, var5, arg2, arg0);
                                } else if (var45) {
                                    class615.method3608(class548.field7728[4], (byte) 67, var39, arg3, var40, var5, arg2, arg0);
                                } else {
                                    class615.method3608(class548.field7728[2], (byte) 67, var39, arg3, var40, var5, arg2, arg0);
                                }
                            } else {
                                class615.method3608(class548.field7728[3], (byte) 67, var39, arg3, var40, var5, arg2, arg0);
                            }
                        } else {
                            class615.method3608(class548.field7728[6], (byte) 67, var39, arg3, var40, var5, arg2, arg0);
                        }
                    }
                }
                class729[] var20 = class349.field4441;
                for (int var21 = 0; var20.length > var21; ++var21) {
                    class729 var24 = var20[var21];
                    if (var24 != null && ~var24.field10216 != -1 && class245.field3409 % 20 < 10) {
                        if (~var24.field10216 == -2) {
                            class15 var25 = (class15) class403.field5587.method1381(true, (long) var24.field10224);
                            if (var25 != null) {
                                class55 var26 = var25.field204;
                                int var27 = var26.field9490 / 128 + -(var10 / 128);
                                int var28 = var26.field9489 / 128 + -(var9 / 128);
                                class742.method4132(360000L, arg0, arg2, var24.field10215, var28, var27, -24870, arg3, var5);
                            }
                        }
                        if (var24.field10216 == 2) {
                            int var29 = var24.field10217 / 128 + -(var10 / 128);
                            int var30 = var24.field10221 / 128 - var9 / 128;
                            long var31 = (long) (var24.field10212 << 7);
                            long var33 = var31 * var31;
                            class742.method4132(var33, arg0, arg2, var24.field10215, var30, var29, -24870, arg3, var5);
                        }
                        if (var24.field10216 == 10 && ~var24.field10224 <= -1 && class40.field563.length > var24.field10224) {
                            class655 var35 = class40.field563[var24.field10224];
                            if (var35 != null) {
                                int var36 = var35.field9490 / 128 - var10 / 128;
                                int var37 = var35.field9489 / 128 - var9 / 128;
                                class742.method4132(360000L, arg0, arg2, var24.field10215, var37, var36, -24870, arg3, var5);
                            }
                        }
                    }
                }
                if (class665.field9377 != 4) {
                    if (class729.field10226 != 0) {
                        int var22 = class729.field10226 * 4 - (-2 - -(var10 / 128)) + (-1 + class473.field6483.method3470(-1)) * 2;
                        int var23 = -(var9 / 128) + class93.field1329 * 4 + 2 + 2 * (class473.field6483.method3470(-1) - 1);
                        class615.method3608(class72.field1012[!class557.field7912 ? 0 : 1], (byte) 67, var22, arg3, var23, var5, arg2, arg0);
                    }
                    if (!class473.field6483.field9255) {
                        arg4.method3255(3, 3, arg3 - -(arg0.field9966 / 2) + -1, -1, (byte) 124, arg0.field10011 / 2 + arg2 + -1);
                        return;
                    }
                }
            } else {
                arg4.method2093(-16777216, var5, arg3, arg2);
            }
        }
    }
}
