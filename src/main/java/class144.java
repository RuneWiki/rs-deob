import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class144 extends class535 implements class141 {

    @OriginalMember(owner = "client!ct", name = "db", descriptor = "B")
    private byte field2212;

    @OriginalMember(owner = "client!ct", name = "jb", descriptor = "Z")
    private boolean field2218;

    @OriginalMember(owner = "client!ct", name = "X", descriptor = "B")
    private byte field2206;

    @OriginalMember(owner = "client!ct", name = "lb", descriptor = "S")
    private short field2220;

    @OriginalMember(owner = "client!ct", name = "Q", descriptor = "Z")
    private boolean field2199;

    @OriginalMember(owner = "client!ct", name = "hb", descriptor = "Z")
    private boolean field2216;

    @OriginalMember(owner = "client!ct", name = "Y", descriptor = "Lka;")
    private class469 field2207;

    @OriginalMember(owner = "client!ct", name = "mb", descriptor = "Lr;")
    private class181 field2221;

    @OriginalMember(owner = "client!ct", name = "O", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ct", name = "P", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!ct", name = "R", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ct", name = "S", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!ct", name = "T", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!ct", name = "U", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!ct", name = "V", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!ct", name = "Z", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!ct", name = "ab", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ct", name = "bb", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ct", name = "cb", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!ct", name = "eb", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!ct", name = "fb", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!ct", name = "gb", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!ct", name = "ib", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!ct", name = "kb", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!ct", name = "nb", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!ct", name = "ob", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!ct", name = "pb", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!ct", name = "qb", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!ct", name = "rb", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ct", name = "W", descriptor = "Ltb;")
    private class397 field2205;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(BLha;)V", line = 4)
    public final void method401(byte arg0, class58 arg1) {
        if (arg0 != -39) {
            this.field2205 = null;
        }
        ++field2214;
    }

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "(B)Z", line = 17)
    public final boolean method395(byte arg0) {
        ++field2217;
        if (arg0 != 84) {
            return true;
        } else if (this.field2207 != null) {
            return !this.field2207.method328();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)I", line = 36)
    public final int method1112(byte arg0) {
        int var2 = 86 / ((-75 - arg0) / 34);
        ++field2222;
        return this.field2206;
    }

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "(I)I", line = 46)
    public final int method404(int arg0) {
        ++field2200;
        if (arg0 != 65535) {
            return -72;
        } else {
            return this.field2207 != null ? this.field2207.method338() : 0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lha;IZI)Z", line = 60)
    public final boolean method390(class58 arg0, int arg1, boolean arg2, int arg3) {
        ++field2197;
        class469 var5 = this.method1126(131072, (byte) -1, arg0);
        if (var5 != null) {
            class280 var6 = arg0.method530();
            var6.method157(super.field644, super.field651, super.field648);
            return class339.field4781 ? var5.method318(arg3, arg1, var6, false, 0, class220.field3129) : var5.method348(arg3, arg1, var6, false, 0);
        } else {
            return !arg2;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZB)V", line = 81)
    public static final void method1123(boolean arg0, byte arg1) {
        ++field2202;
        if (class555.field7776 != null) {
            class555.field7776.method67(-1);
            class555.field7776 = null;
        }
        class363.field5096 = 0;
        class114.method941(0);
        class372.method2342();
        for (int var2 = 0; var2 < 4; ++var2) {
            class630.field9041[var2].method3994(false);
        }
        class497.method2990(arg1 + -69, false);
        System.gc();
        class484.method2913(-18443, 2);
        class90.field1607 = false;
        class122.field1893 = -1;
        class226.method1558(arg1 + -15994);
        class157.method1190(-91, true);
        class544.field7683 = 0;
        class115.field1845 = 0;
        class440.field6143 = 0;
        class64.field1160 = 0;
        class564.field7978 = 0;
        class4.field62 = 0;
        for (int var3 = 0; class220.field3146.length > var3; ++var3) {
            class220.field3146[var3] = null;
        }
        class711.method3973(arg1 + 11851);
        int var4 = 0;
        if (arg1 != -38) {
            field2208 = 12;
        }
        while (~var4 > -2049) {
            class165.field2442[var4] = null;
            ++var4;
        }
        class152.field2290 = 0;
        class758.field10539.method4204((byte) -77);
        class130.field1948 = 0;
        class136.field2123.method4204((byte) 122);
        class57.method521(true);
        class241.field3385 = 0;
        class742.field10408.method3177(arg1 ^ -166);
        class319.method2051(837);
        class476.method2871(false);
        class248.field3473 = 0L;
        class444.field6178 = null;
        if (!arg0) {
            class19.method122(1, 3);
            try {
                class101.method889("loggedout", class476.field6812, arg1 + -27382);
            } catch (Throwable var5) {
            }
        } else {
            class19.method122(1, 12);
        }
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(B)I", line = 159)
    public final int method393(byte arg0) {
        if (arg0 != -83) {
            return 119;
        } else {
            ++field2203;
            return this.field2207 != null ? this.field2207.method324() : 0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lha;BZI)Lnj;", line = 171)
    private final class244 method1124(class58 arg0, byte arg1, boolean arg2, int arg3) {
        if (arg1 < 112) {
            return null;
        } else {
            ++field2213;
            class414 var5 = class66.field1181.method131(2, this.field2220 & 65535);
            class278 var6;
            class278 var7;
            if (this.field2199) {
                var6 = class4.field56[super.field659];
                var7 = class173.field2511[0];
            } else {
                if (super.field659 >= 3) {
                    var7 = null;
                } else {
                    var7 = class173.field2511[super.field659 + 1];
                }
                var6 = class173.field2511[super.field659];
            }
            return var5.method2523(var7, var6, super.field651, arg2, 1, this.field2212, super.field644, this.field2206, arg3, arg0, super.field648);
        }
    }

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "(B)Z", line = 203)
    public final boolean method399(byte arg0) {
        if (arg0 != 38) {
            return false;
        } else {
            ++field2201;
            return this.field2207 != null ? this.field2207.method332() : false;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIILha;)V", line = 220)
    public static final void method1125(int arg0, int arg1, int arg2, class58 arg3) {
        ++field2224;
        if (~arg2 <= -1 && arg0 >= 0 && class292.field4104 != 0 && ~class464.field6683 != -1) {
            class280 var4;
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            if (class200.field2876) {
                class555.method3250(false, true);
                var4 = arg3.method612();
                int[] var5 = arg3.method547();
                var6 = var5[1];
                var7 = var5[2];
                var8 = var5[3];
                var9 = var5[0];
                var10 = arg2 + class705.method3952(255, false);
                var11 = arg0 + class526.method3117(false, arg1 ^ 26190);
            } else {
                arg3.method545(class694.field9762, class342.field4819, class292.field4104, class464.field6683);
                var8 = class464.field6683;
                var9 = class694.field9762;
                var7 = class292.field4104;
                var6 = class342.field4819;
                arg3.method584(class456.field6596, class647.field9166, class292.field4104, class464.field6683);
                var4 = arg3.method558();
                var4.method168(class548.field7721, class587.field8257, class634.field9083, class214.field3072, class556.field7800, class501.field7163);
                arg3.method538(var4);
                var11 = arg0;
                var10 = arg2;
            }
            if (var8 == 0) {
                var8 = 1;
            }
            class334.method2138(false, true);
            if (~var7 == -1) {
                var7 = 1;
            }
            if (class173.field2511 != null && (!class737.field10375 || (64 & class464.field6709) != 0)) {
                int var12 = -1;
                int var13 = -1;
                int var14 = arg3.method534();
                int var15 = arg3.method531();
                int var16;
                int var17;
                int var18;
                int var19;
                if (!class339.field4781) {
                    var16 = (-var9 + var10) * var15 / var7;
                    var17 = (-var6 + var11) * var14 / var8;
                    var18 = (-var9 + var10) * var14 / var7;
                    var19 = (-var6 + var11) * var15 / var8;
                } else {
                    var18 = var16 = (-var9 + var10) * class220.field3129 / var7;
                    var17 = var19 = (var11 - var6) * class220.field3129 / var8;
                }
                int[] var20 = new int[] { var18, var17, var14 };
                int[] var21 = new int[] { var16, var19, var15 };
                var4.method187(var20);
                var4.method187(var21);
                float var22 = class567.method3316((float) var20[2], (float) var21[1], (float) var21[2], (float) var20[0], (float) var21[0], 4, (byte) 104, (float) var20[1]);
                if (var22 > 0.0F) {
                    int var23 = var21[0] + -var20[0];
                    int var24 = var21[2] + -var20[2];
                    int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                    int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                    var12 = var25 + (-1 + class468.field6748.method482(false) << 8) >> 9;
                    var13 = var26 - -(class468.field6748.method482(false) - 1 << 8) >> 9;
                    byte var27 = class468.field6748.field649;
                    if (~var27 > -4 && (class435.field6078[1][var25 >> 9][var26 >> 9] & 2) != 0) {
                        int var87 = var27 + 1;
                    }
                }
                if (var12 != -1 && ~var13 != 0) {
                    if (class737.field10375 && (64 & class464.field6709) != 0) {
                        class50 var28 = class434.method2624(class31.field415, class40.field590, (byte) -69);
                        if (var28 == null) {
                            class249.method1662((byte) 122);
                        } else {
                            class673.method3807((long) (var12 << 0 | var13), " ->", var12, (byte) -68, 0L, true, class322.field4580, 21, true, var13, false, class23.field299, -1);
                        }
                    } else {
                        if (class310.field4379) {
                            class673.method3807((long) (var12 << 0 | var13), "", var12, (byte) -104, 0L, true, class281.field3968.method1839((byte) 45, class744.field10426), 19, true, var13, false, -1, -1);
                        }
                        class673.method3807((long) (var13 | var12 << 0), "", var12, (byte) -24, 0L, true, class681.field9591, 16, true, var13, false, class493.field7014, -1);
                        ++class467.field6739;
                    }
                }
            }
            if (class200.field2876) {
                class705.method3949((byte) -82);
            }
            if (arg1 == -26189) {
                for (int var29 = 0; ~(!class200.field2876 ? 1 : 2) < ~var29; ++var29) {
                    boolean var30 = var29 == 0;
                    class532 var31 = !var30 ? class330.field4668 : class62.field1128;
                    int var32 = arg2;
                    int var33 = arg0;
                    if (class200.field2876) {
                        class555.method3250(var30, true);
                        var32 = arg2 + class705.method3952(255, var30);
                        var33 = arg0 + class526.method3117(var30, -3);
                    }
                    class747 var34 = var31.field7527;
                    for (class304 var35 = (class304) var34.method4159(arg1 + 26189); var35 != null; var35 = (class304) var34.method4151(arg1 + 26196)) {
                        if ((class696.field9798 || ~class468.field6748.field649 == ~var35.field4297.field649) && var35.method1975(var33, arg3, true, var32)) {
                            boolean var36 = false;
                            boolean var37 = false;
                            int var38;
                            int var39;
                            if (!(var35.field4297 instanceof class113)) {
                                var38 = var35.field4297.field648 >> 9;
                                var39 = var35.field4297.field644 >> 9;
                            } else {
                                var39 = ((class113) var35.field4297).field1814;
                                var38 = ((class113) var35.field4297).field1820;
                            }
                            if (var35.field4297 instanceof class349) {
                                class349 var40 = (class349) var35.field4297;
                                int var41 = var40.method482(false);
                                if ((var41 & 1) == 0 && (511 & var40.field644) == 0 && ~(511 & var40.field648) == -1 || (1 & var41) == 1 && ~(var40.field644 & 511) == -257 && ~(var40.field648 & 511) == -257) {
                                    int var42 = var40.field644 - (-1 + var40.method482(false) << 8);
                                    int var43 = var40.field648 - (-1 + var40.method482(false) << 8);
                                    for (int var44 = 0; var44 < class152.field2290; ++var44) {
                                        class272 var51 = (class272) class758.field10539.method4203(true, (long) class323.field4590[var44]);
                                        if (var51 != null) {
                                            class84 var52 = var51.field3885;
                                            if (~class605.field8787 != ~var52.field913 && var52.field892) {
                                                int var53 = -(var52.field1523.field6911 + -1 << 8) + var52.field644;
                                                int var54 = -(var52.field1523.field6911 + -1 << 8) + var52.field648;
                                                if (~var53 <= ~var42 && ~var52.field1523.field6911 >= ~(-(-var42 + var53 >> 9) + var40.method482(false)) && ~var54 <= ~var43 && ~var52.field1523.field6911 >= ~(-(var54 - var43 >> 9) + var40.method482(false))) {
                                                    class478.method2873(var52, 0, class468.field6748.field649 != var35.field4297.field649);
                                                    var52.field913 = class605.field8787;
                                                }
                                            }
                                        }
                                    }
                                    int var45 = class206.field2950;
                                    int[] var46 = class209.field3013;
                                    for (int var47 = 0; ~var47 > ~var45; ++var47) {
                                        class349 var48 = class165.field2442[var46[var47]];
                                        if (var48 != null && class605.field8787 != var48.field913 && var40 != var48 && var48.field892) {
                                            int var49 = var48.field644 - (-1 + var48.method482(false) << 8);
                                            int var50 = var48.field648 - (var48.method482(false) + -1 << 8);
                                            if (var42 <= var49 && ~var48.method482(false) >= ~(-(var49 - var42 >> 9) + var40.method482(false)) && var50 >= var43 && var48.method482(false) <= -(var50 - var43 >> 9) + var40.method482(false)) {
                                                class657.method3703(class468.field6748.field649 != var35.field4297.field649, arg1 + 26189, var48);
                                                var48.field913 = class605.field8787;
                                            }
                                        }
                                    }
                                }
                                if (class605.field8787 == var40.field913) {
                                    continue;
                                }
                                class657.method3703(class468.field6748.field649 != var35.field4297.field649, arg1 ^ -26189, var40);
                                var40.field913 = class605.field8787;
                            }
                            if (var35.field4297 instanceof class84) {
                                class84 var55 = (class84) var35.field4297;
                                if (var55.field1523 != null) {
                                    if ((var55.field1523.field6911 & 1) == 0 && ~(var55.field644 & 511) == -1 && (511 & var55.field648) == 0 || ~(1 & var55.field1523.field6911) == -2 && ~(var55.field644 & 511) == -257 && (511 & var55.field648) == 256) {
                                        int var56 = -(var55.field1523.field6911 - 1 << 8) + var55.field644;
                                        int var57 = var55.field648 - (var55.field1523.field6911 + -1 << 8);
                                        for (int var58 = 0; ~var58 > ~class152.field2290; ++var58) {
                                            class272 var65 = (class272) class758.field10539.method4203(true, (long) class323.field4590[var58]);
                                            if (var65 != null) {
                                                class84 var66 = var65.field3885;
                                                if (~class605.field8787 != ~var66.field913 && var55 != var66 && var66.field892) {
                                                    int var67 = var66.field644 - (var66.field1523.field6911 + -1 << 8);
                                                    int var68 = -(var66.field1523.field6911 - 1 << 8) + var66.field648;
                                                    if (var56 <= var67 && var66.field1523.field6911 <= -(-var56 + var67 >> 9) + var55.field1523.field6911 && ~var57 >= ~var68 && -(var68 - var57 >> 9) + var55.field1523.field6911 >= var66.field1523.field6911) {
                                                        class478.method2873(var66, arg1 + 26189, ~class468.field6748.field649 != ~var35.field4297.field649);
                                                        var66.field913 = class605.field8787;
                                                    }
                                                }
                                            }
                                        }
                                        int var59 = class206.field2950;
                                        int[] var60 = class209.field3013;
                                        for (int var61 = 0; var59 > var61; ++var61) {
                                            class349 var62 = class165.field2442[var60[var61]];
                                            if (var62 != null && ~class605.field8787 != ~var62.field913 && var62.field892) {
                                                int var63 = var62.field644 + -(var62.method482(false) + -1 << 8);
                                                int var64 = var62.field648 + -(-1 + var62.method482(false) << 8);
                                                if (var56 <= var63 && ~var62.method482(false) >= ~(-(-var56 + var63 >> 9) + var55.field1523.field6911) && var57 <= var64 && var62.method482(false) <= -(-var57 + var64 >> 9) + var55.field1523.field6911) {
                                                    class657.method3703(~class468.field6748.field649 != ~var35.field4297.field649, 0, var62);
                                                    var62.field913 = class605.field8787;
                                                }
                                            }
                                        }
                                    }
                                    if (~class605.field8787 == ~var55.field913) {
                                        continue;
                                    }
                                    class478.method2873(var55, 0, ~class468.field6748.field649 != ~var35.field4297.field649);
                                    var55.field913 = class605.field8787;
                                }
                            }
                            if (var35.field4297 instanceof class218) {
                                int var69 = class115.field1845 + var39;
                                int var70 = class64.field1160 + var38;
                                class694 var71 = (class694) class136.field2123.method4203(true, (long) (var70 << 14 | var35.field4297.field649 << 28 | var69));
                                if (var71 != null) {
                                    int var72 = 0;
                                    for (class332 var73 = (class332) var71.field9759.method1523((byte) 71); var73 != null; var73 = (class332) var71.field9759.method1532((byte) 100)) {
                                        class253 var74 = class558.field7942.method721(-41, var73.field4685);
                                        if (class737.field10375 && ~class468.field6748.field649 == ~var35.field4297.field649) {
                                            class513 var75 = class41.field600 == -1 ? null : class285.field4042.method2993(class41.field600, (byte) 80);
                                            if ((class464.field6709 & 1) != 0 && (var75 == null || var74.method1726(-26242, class41.field600, var75.field7315) != var75.field7315)) {
                                                class673.method3807((long) var72, class623.field8966 + " -> <col=ff9040>" + var74.field3644, var39, (byte) -29, (long) var73.field4685, true, class322.field4580, 50, false, var38, false, class23.field299, -1);
                                                ++class110.field1784;
                                            }
                                        }
                                        if (class468.field6748.field649 == var35.field4297.field649) {
                                            String[] var76 = var74.field3648;
                                            for (int var77 = 4; ~var77 <= -1; --var77) {
                                                if (var76 != null && var76[var77] != null) {
                                                    byte var78 = 0;
                                                    if (var77 == 0) {
                                                        var78 = 45;
                                                    }
                                                    int var79 = class719.field10072;
                                                    if (var77 == 1) {
                                                        var78 = 48;
                                                    }
                                                    if (~var77 == -3) {
                                                        var78 = 9;
                                                    }
                                                    if (~var77 == -4) {
                                                        var78 = 58;
                                                    }
                                                    if (~var77 == -5) {
                                                        var78 = 3;
                                                    }
                                                    if (~var74.field3662 == ~var77) {
                                                        var79 = var74.field3621;
                                                    }
                                                    if (var74.field3655 == var77) {
                                                        var79 = var74.field3604;
                                                    }
                                                    ++class578.field8170;
                                                    class673.method3807((long) var72, "<col=ff9040>" + var74.field3644, var39, (byte) -73, (long) var73.field4685, true, var76[var77], var78, false, var38, false, var79, -1);
                                                }
                                            }
                                        }
                                        ++class380.field5296;
                                        class673.method3807((long) var72, "<col=ff9040>" + var74.field3644, var39, (byte) -73, (long) var73.field4685, true, class281.field3963.method1839((byte) 45, class744.field10426), 1002, false, var38, class468.field6748.field649 != var35.field4297.field649, class224.field3197, -1);
                                        ++var72;
                                    }
                                }
                            }
                            if (var35.field4297 instanceof class141) {
                                class141 var80 = (class141) var35.field4297;
                                class414 var81 = class66.field1181.method131(arg1 + 26191, var80.method1109((byte) 38));
                                if (var81.field5720 != null) {
                                    var81 = var81.method2513(class742.field10408, true);
                                }
                                if (var81 != null) {
                                    if (class737.field10375 && class468.field6748.field649 == var35.field4297.field649) {
                                        class513 var82 = ~class41.field600 != 0 ? class285.field4042.method2993(class41.field600, (byte) 80) : null;
                                        if ((4 & class464.field6709) != 0 && (var82 == null || var81.method2510(104, var82.field7315, class41.field600) != var82.field7315)) {
                                            ++class174.field2531;
                                            class673.method3807((long) var80.hashCode(), class623.field8966 + " -> <col=00ffff>" + var81.field5752, var39, (byte) -46, class442.method2652(var80, var39, var38, (byte) -115), true, class322.field4580, 57, false, var38, false, class23.field299, -1);
                                        }
                                    }
                                    if (~class468.field6748.field649 == ~var35.field4297.field649) {
                                        String[] var83 = var81.field5771;
                                        if (var83 != null) {
                                            for (int var84 = 4; var84 >= 0; --var84) {
                                                if (var83[var84] != null) {
                                                    short var85 = 0;
                                                    int var86 = class719.field10072;
                                                    if (~var84 == -1) {
                                                        var85 = 15;
                                                    }
                                                    if (var84 == 1) {
                                                        var85 = 2;
                                                    }
                                                    if (var84 == 2) {
                                                        var85 = 59;
                                                    }
                                                    if (var84 == 3) {
                                                        var85 = 11;
                                                    }
                                                    if (var84 == 4) {
                                                        var85 = 1011;
                                                    }
                                                    if (var81.field5795 == var84) {
                                                        var86 = var81.field5743;
                                                    }
                                                    if (var81.field5759 == var84) {
                                                        var86 = var81.field5801;
                                                    }
                                                    ++class718.field10066;
                                                    class673.method3807((long) var80.hashCode(), "<col=00ffff>" + var81.field5752, var39, (byte) -44, class442.method2652(var80, var39, var38, (byte) -112), true, var83[var84], var85, false, var38, false, var86, -1);
                                                }
                                            }
                                        }
                                        class673.method3807((long) var80.hashCode(), "<col=00ffff>" + var81.field5752, var39, (byte) -53, (long) var81.field5711, true, class281.field3963.method1839((byte) 45, class744.field10426), 1012, false, var38, ~class468.field6748.field649 != ~var35.field4297.field649, class224.field3197, -1);
                                        ++class358.field5027;
                                    }
                                }
                            }
                        }
                    }
                    if (class200.field2876) {
                        class705.method3949((byte) -102);
                    }
                }
                class334.method2138(false, false);
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BLha;)V", line = 765)
    public final void method1110(byte arg0, class58 arg1) {
        if (arg0 <= 9) {
            this.method1114(110);
        }
        ++field2226;
        Object var3 = null;
        class181 var5;
        if (this.field2221 == null && this.field2216) {
            class244 var4 = this.method1124(arg1, (byte) 118, true, 262144);
            var5 = var4 == null ? null : var4.field3404;
        } else {
            var5 = this.field2221;
            this.field2221 = null;
        }
        if (var5 != null) {
            class299.method1928(var5, super.field659, super.field644, super.field648, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)Z", line = 795)
    public final boolean method1113(int arg0) {
        if (arg0 != -24333) {
            return true;
        } else {
            ++field2223;
            return this.field2216;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)I", line = 811)
    public final int method1109(byte arg0) {
        int var2 = 48 / ((-45 - arg0) / 39);
        ++field2210;
        return this.field2220 & 65535;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBLha;)Lka;", line = 821)
    private final class469 method1126(int arg0, byte arg1, class58 arg2) {
        ++field2209;
        if (this.field2207 != null && arg2.method611(this.field2207.method361(), arg0) == 0) {
            return this.field2207;
        } else {
            if (arg1 != -1) {
                this.method401((byte) -24, (class58) null);
            }
            class244 var4 = this.method1124(arg2, (byte) 127, false, arg0);
            return var4 != null ? var4.field3407 : null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lha;Z)Ltb;", line = 844)
    public final class397 method397(class58 arg0, boolean arg1) {
        if (arg1) {
            this.method1110((byte) -76, (class58) null);
        }
        if (this.field2205 == null) {
            this.field2205 = class719.method4012(super.field644, super.field648, this.method1126(0, (byte) -1, arg0), super.field651, (byte) -108);
        }
        ++field2211;
        return this.field2205;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lha;I)V", line = 865)
    public final void method1108(class58 arg0, int arg1) {
        ++field2215;
        int var3 = 53 % ((arg1 - 44) / 49);
        Object var4 = null;
        class181 var6;
        if (this.field2221 == null && this.field2216) {
            class244 var5 = this.method1124(arg0, (byte) 117, true, 262144);
            var6 = var5 == null ? null : var5.field3404;
        } else {
            var6 = this.field2221;
            this.field2221 = null;
        }
        if (var6 != null) {
            class489.method2942(var6, super.field659, super.field644, super.field648, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(BLha;)Lvw;", line = 892)
    public final class304 method396(byte arg0, class58 arg1) {
        ++field2225;
        if (this.field2207 == null) {
            return null;
        } else {
            if (arg0 < 3) {
                this.field2199 = false;
            }
            class280 var3 = arg1.method530();
            var3.method157(super.field7560 + super.field644, super.field651, super.field7557 + super.field648);
            class304 var4 = class359.method2239(1, this.field2218, (byte) 122);
            if (class339.field4781) {
                this.field2207.method343(var3, var4.field4298[0], class220.field3129, 0);
            } else {
                this.field2207.method329(var3, var4.field4298[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)I", line = 919)
    public final int method1111(boolean arg0) {
        if (arg0) {
            this.field2218 = false;
        }
        ++field2204;
        return this.field2212;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lha;Luw;IIIIIZIIII)V", line = 930)
    public class144(class58 arg0, class414 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field2212 = (byte) arg11;
        super.field644 = arg4;
        this.field2218 = arg1.field5737 != 0 && !arg7;
        this.field2206 = (byte) arg10;
        this.field2220 = (short) arg1.field5711;
        this.field2199 = arg7;
        super.field648 = arg6;
        this.field2216 = arg0.method550() && arg1.field5770 && !this.field2199 && ~class471.field6781.field6689.method56(27669) != -1;
        class244 var13 = this.method1124(arg0, (byte) 121, this.field2216, 2048);
        if (var13 != null) {
            this.field2207 = var13.field3407;
            this.field2221 = var13.field3404;
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V", line = 953)
    public final void method1114(int arg0) {
        ++field2198;
        if (this.field2207 != null) {
            this.field2207.method326();
        }
        if (arg0 < 63) {
            this.method1109((byte) -112);
        }
    }
}
