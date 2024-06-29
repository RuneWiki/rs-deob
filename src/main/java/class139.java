import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class139 extends class497 {

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field2074 = 0;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field2075 = -60;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Lfba;")
    public static class27 field2065 = new class27(0, 16);

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "Lgj;")
    public static class660 field2068;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lha;Lrca;II)V", line = 8)
    public static final void method1006(class65 arg0, class478 arg1, int arg2, int arg3) {
        ++field2077;
        if (class680.field9441 != null && arg1.field6720 >= arg3) {
            for (int var4 = 0; class680.field9441.length > var4; ++var4) {
                if (class680.field9441[var4] != -1000000 && (~class680.field9441[var4] <= ~arg1.field6711[0] || arg1.field6711[1] <= class680.field9441[var4] || arg1.field6711[2] <= class680.field9441[var4] || ~class680.field9441[var4] <= ~arg1.field6711[3]) && (~class399.field5482[var4] <= ~arg1.field6712[0] || ~class399.field5482[var4] <= ~arg1.field6712[1] || ~class399.field5482[var4] <= ~arg1.field6712[2] || ~class399.field5482[var4] <= ~arg1.field6712[3]) && (~class562.field7992[var4] >= ~arg1.field6712[0] || class562.field7992[var4] <= arg1.field6712[1] || class562.field7992[var4] <= arg1.field6712[2] || class562.field7992[var4] <= arg1.field6712[3]) && (class763.field10522[var4] >= arg1.field6717[0] || arg1.field6717[1] <= class763.field10522[var4] || arg1.field6717[2] <= class763.field10522[var4] || arg1.field6717[3] <= class763.field10522[var4]) && (class398.field5464[var4] <= arg1.field6717[0] || class398.field5464[var4] <= arg1.field6717[1] || class398.field5464[var4] <= arg1.field6717[2] || ~arg1.field6717[3] <= ~class398.field5464[var4])) {
                    return;
                }
            }
        }
        if (~arg1.field6708 == -2) {
            int var5 = arg1.field6710 - (class276.field4007 - class259.field3820);
            if (var5 >= 0 && class259.field3820 - -class259.field3820 >= var5) {
                int var6 = -class296.field4301 + arg1.field6715 + class259.field3820;
                if (~var6 > -1) {
                    var6 = 0;
                } else if (class259.field3820 + class259.field3820 < var6) {
                    return;
                }
                int var7 = arg1.field6709 - -class259.field3820 + -class296.field4301;
                if (class259.field3820 + class259.field3820 < var7) {
                    var7 = class259.field3820 + class259.field3820;
                } else if (~var7 > -1) {
                    return;
                }
                boolean var8 = false;
                while (var6 <= var7) {
                    if (class735.field10157[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class502.field7116 - arg1.field6712[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!(var9 < (float) class661.field9213)) {
                        if (class350.method2218(0, true, arg1)) {
                            if (class350.method2218(1, true, arg1)) {
                                if (class350.method2218(2, true, arg1)) {
                                    if (class350.method2218(3, true, arg1)) {
                                        class335.field4721[class138.field2052++] = arg1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (arg1.field6708 == 2) {
            int var10 = -class296.field4301 + arg1.field6715 + class259.field3820;
            if (var10 >= 0 && ~(class259.field3820 - -class259.field3820) <= ~var10) {
                int var11 = -class276.field4007 + class259.field3820 + arg1.field6710;
                if (~var11 > -1) {
                    var11 = 0;
                } else if (~(class259.field3820 + class259.field3820) > ~var11) {
                    return;
                }
                int var12 = -class276.field4007 + arg1.field6718 - -class259.field3820;
                if (~var12 < ~(class259.field3820 + class259.field3820)) {
                    var12 = class259.field3820 + class259.field3820;
                } else if (~var12 > -1) {
                    return;
                }
                boolean var13 = false;
                while (~var12 <= ~var11) {
                    if (class735.field10157[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (-arg1.field6717[0] + class82.field906);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!((float) class661.field9213 > var14)) {
                        if (class350.method2218(0, true, arg1)) {
                            if (class350.method2218(1, true, arg1)) {
                                if (class350.method2218(2, true, arg1)) {
                                    if (class350.method2218(3, true, arg1)) {
                                        class335.field4721[class138.field2052++] = arg1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (~arg1.field6708 != -17 && ~arg1.field6708 != -9) {
            if (arg2 != -1) {
                field2068 = null;
            }
            if (arg1.field6708 == 4) {
                float var15 = (float) (arg1.field6711[0] + -class276.field3997);
                if (!(var15 <= (float) class77.field878)) {
                    int var16 = arg1.field6715 - (class296.field4301 - class259.field3820);
                    if (~var16 <= -1) {
                        if (~var16 < ~(class259.field3820 + class259.field3820)) {
                            return;
                        }
                    } else {
                        var16 = 0;
                    }
                    int var17 = -class296.field4301 + arg1.field6709 + class259.field3820;
                    if (~var17 < ~(class259.field3820 + class259.field3820)) {
                        var17 = class259.field3820 - -class259.field3820;
                    } else if (~var17 > -1) {
                        return;
                    }
                    int var18 = -class276.field4007 + arg1.field6710 + class259.field3820;
                    if (~var18 <= -1) {
                        if (~var18 < ~(class259.field3820 - -class259.field3820)) {
                            return;
                        }
                    } else {
                        var18 = 0;
                    }
                    int var19 = -class276.field4007 + arg1.field6718 + class259.field3820;
                    if (class259.field3820 + class259.field3820 >= var19) {
                        if (~var19 > -1) {
                            return;
                        }
                    } else {
                        var19 = class259.field3820 - -class259.field3820;
                    }
                    boolean var20 = false;
                    label296: for (int var21 = var18; var21 <= var19; ++var21) {
                        for (int var22 = var16; ~var22 >= ~var17; ++var22) {
                            if (class735.field10157[var21][var22]) {
                                var20 = true;
                                break label296;
                            }
                        }
                    }
                    if (var20) {
                        if (class350.method2218(0, true, arg1)) {
                            if (class350.method2218(1, true, arg1)) {
                                if (class350.method2218(2, true, arg1)) {
                                    if (class350.method2218(3, true, arg1)) {
                                        class335.field4721[class138.field2052++] = arg1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            int var23 = class259.field3820 + arg1.field6710 + -class276.field4007;
            if (~var23 <= -1 && var23 <= class259.field3820 + class259.field3820) {
                int var24 = arg1.field6715 - -class259.field3820 + -class296.field4301;
                if (~var24 <= -1 && ~(class259.field3820 + class259.field3820) <= ~var24) {
                    if (class735.field10157[var23][var24]) {
                        float var25 = (float) (-arg1.field6712[0] + class502.field7116);
                        if (var25 < 0.0F) {
                            var25 *= -1.0F;
                        }
                        float var26 = (float) (-arg1.field6717[0] + class82.field906);
                        if (var26 < 0.0F) {
                            var26 *= -1.0F;
                        }
                        if (!(var25 < (float) class661.field9213) || !((float) class661.field9213 > var26)) {
                            if (class350.method2218(0, true, arg1)) {
                                if (class350.method2218(1, true, arg1)) {
                                    if (class350.method2218(2, true, arg1)) {
                                        if (class350.method2218(3, true, arg1)) {
                                            class335.field4721[class138.field2052++] = arg1;
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

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BILkja;)V", line = 339)
    public final void method925(byte arg0, int arg1, class684 arg2) {
        super.field7086.method1118(0, arg2);
        ++field2071;
        super.field7086.method1189(25, arg1);
        if (arg0 < 83) {
            field2074 = 9;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZB)V", line = 351)
    public final void method928(boolean arg0, byte arg1) {
        ++field2070;
        int var3 = -73 % ((24 - arg1) / 46);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBI)V", line = 362)
    public final void method923(int arg0, byte arg1, int arg2) {
        if (arg1 < 5) {
            method1010(-39, (class791) null, true, -121, 101, 63, 41);
        }
        ++field2072;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V", line = 374)
    public static final void method1007(int arg0, int arg1) {
        ++field2067;
        class313 var2 = class312.method1998((long) arg1, arg0, -1);
        var2.method2006(arg0 ^ 96);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V", line = 385)
    public static final void method1008(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class385.field5304 = true;
        class434.field5879 = class228.field3494.method535() > 0;
        class596.field8361 = arg15;
        class276.field4007 = arg1 >> class645.field9018;
        class296.field4301 = arg3 >> class645.field9018;
        class502.field7116 = arg1;
        class82.field906 = arg3;
        class276.field3997 = arg2;
        class314.field4473 = class276.field4007 - class259.field3820;
        if (class314.field4473 < 0) {
            class616.field8624 = -class314.field4473;
            class314.field4473 = 0;
        } else {
            class616.field8624 = 0;
        }
        class446.field6087 = class296.field4301 - class259.field3820;
        if (class446.field6087 < 0) {
            class48.field608 = -class446.field6087;
            class446.field6087 = 0;
        } else {
            class48.field608 = 0;
        }
        class16.field298 = class276.field4007 + class259.field3820;
        if (class16.field298 > class81.field902) {
            class16.field298 = class81.field902;
        }
        class34.field463 = class296.field4301 + class259.field3820;
        if (class34.field463 > class48.field615) {
            class34.field463 = class48.field615;
        }
        boolean[][] var19 = class735.field10157;
        boolean[][] var20 = class281.field4084;
        if (class596.field8361) {
            for (int var21 = 0; var21 < class259.field3820 + class259.field3820 + 2; ++var21) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class259.field3820 + class259.field3820 + 2; ++var24) {
                    if (var24 > 1) {
                        class103.field1193[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class276.field4007 - class259.field3820 + var21;
                    int var26 = class296.field4301 - class259.field3820 + var24;
                    if (var25 >= 0 && var26 >= 0 && var25 < class81.field902 && var26 < class48.field615) {
                        int var27 = var25 << class645.field9018;
                        int var28 = var26 << class645.field9018;
                        int var29 = class411.field5572[class411.field5572.length - 1].method1904(var26, (byte) 19, var25) - (1000 << class645.field9018 - 7);
                        int var30 = class774.field10642 != null ? class774.field10642[0].method1904(var26, (byte) 29, var25) + class109.field1611 : class411.field5572[0].method1904(var26, (byte) -122, var25) + class109.field1611;
                        var23 = arg16 >= 0 ? class228.field3494.method491(var27, var29, var28, var27, var30, var28, arg16) : class228.field3494.method531(var27, var29, var28, var27, var30, var28);
                        class281.field4084[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class281.field4084[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class103.field1193[var24 - 1] & class103.field1193[var24] & var22 & var23;
                        class735.field10157[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class103.field1193[class259.field3820 + class259.field3820] = var22;
                class103.field1193[class259.field3820 + class259.field3820 + 1] = var23;
            }
            if (arg16 >= 0) {
                class385.field5304 = false;
            } else {
                class680.field9441 = arg5;
                class562.field7992 = arg6;
                class399.field5482 = arg7;
                class763.field10522 = arg8;
                class398.field5464 = arg9;
                class254.method1659(class228.field3494, false, arg10);
            }
        } else {
            if (class270.field3920 == null) {
                class270.field3920 = new boolean[class81.field902 + class81.field902 + 1][class81.field902 + class48.field615 + 1];
            }
            for (int var32 = 0; var32 < class270.field3920.length; ++var32) {
                for (int var42 = 0; var42 < class270.field3920[0].length; ++var42) {
                    class270.field3920[var32][var42] = true;
                }
            }
            class281.field4084 = class270.field3920;
            class735.field10157 = class270.field3920;
            class314.field4473 = 0;
            class446.field6087 = 0;
            class16.field298 = class81.field902;
            class34.field463 = class48.field615;
            class385.field5304 = false;
        }
        class674.method3836(true, class228.field3494);
        if (!class510.field7211.field5458) {
            class343 var33 = class510.field7211.field5452;
            for (class495 var34 = (class495) var33.method2170(false); var34 != null; var34 = (class495) var33.method2176(-17754)) {
                var34.method3358(-9);
                class121.method919(var34, (byte) -7);
            }
        }
        if (class434.field5879) {
            for (int var35 = 0; var35 < class97.field1103; ++var35) {
                class603.field8444[var35].method2719(arg14, arg0, 98);
            }
        }
        if (class712.field9883) {
            class647.field9058 = class228.field3494.method510();
            class228.field3494.method449(class342.field4772);
            int var36 = (class342.field4772[2] - class342.field4772[0]) / class270.field3919;
            for (int var37 = 0; var37 < class270.field3919 - 1; ++var37) {
                class189.field2915[var37] = (var37 + 1) * var36 + class606.field8480[var37];
            }
            for (int var38 = 0; var38 < class16.field297.length; ++var38) {
                class16.field297[var38].method4243();
            }
        }
        if (class356.field5006 != null) {
            if (class712.field9883) {
                class347.method2202(0);
            }
            class33.method273(true);
            class228.field3494.method442(-1, 1583160, 40, 127);
            class647.method3712(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class712.field9883) {
                class624.method3593();
            }
            class228.field3494.method489();
            class33.method273(false);
        }
        class647.method3712(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class712.field9883) {
            for (int var39 = 0; var39 < class562.field7990; ++var39) {
                class760.field10485[var39] = class631.field8875[var39];
            }
            class347.method2202(0);
            for (int var40 = 0; var40 < class16.field297.length; ++var40) {
                class16.field297[var40].method4243();
            }
        }
        if (class712.field9883) {
            class624.method3593();
            for (int var41 = 0; var41 < class562.field7990; ++var41) {
                class631.field8875[var41] = class760.field10485[var41];
            }
            if (class652.field9112 == 2) {
                int var10002;
                if (class233.field3510[0] < class233.field3510[1]) {
                    if (class606.field8480[0] + class189.field2915[0] > class342.field4772[0]) {
                        var10002 = class606.field8480[0]++;
                    }
                } else if (class233.field3510[0] > class233.field3510[1] && class606.field8480[0] + class189.field2915[0] < class342.field4772[2]) {
                    var10002 = class606.field8480[0]--;
                }
            }
        }
        if (!class596.field8361) {
            class735.field10157 = var19;
            class281.field4084 = var20;
        }
        class341.method2164();
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V", line = 665)
    public static void method1009(int arg0) {
        field2065 = null;
        if (arg0 != 0) {
            field2065 = null;
        }
        field2068 = null;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lpj;)V", line = 677)
    public class139(class156 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILwia;ZIIII)V", line = 680)
    public static final void method1010(int arg0, class791 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 >= arg6) {
            class370.method2306(arg5, arg4, arg1, arg0, (byte) -84, arg2);
        } else {
            class741.field10208 = arg2;
            class350.field4900 = arg4;
            class14.field279 = arg5;
            class161.field2559 = null;
            class90.field1011 = 1;
            class106.field1241 = arg1;
            class665.field9257 = arg0;
            class353.field4975 = class686.field9533.method2744(arg3 + -16384) / arg6;
            if (~class353.field4975 > -2) {
                class353.field4975 = 1;
            }
        }
        ++field2076;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Z", line = 708)
    public final boolean method921(int arg0) {
        int var2 = -95 / ((19 - arg0) / 52);
        ++field2069;
        return true;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V", line = 727)
    public final void method929(int arg0, boolean arg1) {
        if (arg0 > -83) {
            method1009(23);
        }
        ++field2073;
        super.field7086.method1170(-117, true);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 741)
    public final void method926(int arg0) {
        ++field2066;
        super.field7086.method1170(arg0 + 224, false);
        if (arg0 != -339) {
            this.method926(22);
        }
    }
}
