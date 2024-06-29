import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class110 extends class107 {

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1697;
        if (arg6 == -947781874) {
            if (arg3 >= 0 && ~arg5 <= -1 && ~arg3 > -104 && arg5 < 103) {
                if (arg2 == 0) {
                    class138 var8 = class268.method1791(arg1, arg3, arg5);
                    if (var8 != null) {
                        int var9 = Integer.MAX_VALUE & (int) (var8.field2230 >>> 32);
                        if (arg4 == 2) {
                            var8.field2226 = new class234(var9, 2, arg7 + 4, arg1, arg3, arg5, arg0, false, var8.field2226);
                            var8.field2227 = new class234(var9, 2, arg7 + 1 & 3, arg1, arg3, arg5, arg0, false, var8.field2227);
                        } else {
                            var8.field2226 = new class234(var9, arg4, arg7, arg1, arg3, arg5, arg0, false, var8.field2226);
                        }
                    }
                }
                if (~arg2 == -2) {
                    class219 var10 = class200.method1376(arg1, arg3, arg5);
                    if (var10 != null) {
                        int var11 = Integer.MAX_VALUE & (int) (var10.field3446 >>> 32);
                        if (arg4 != 4 && arg4 != 5) {
                            if (~arg4 == -7) {
                                var10.field3444 = new class234(var11, 4, arg7 + 4, arg1, arg3, arg5, arg0, false, var10.field3444);
                            } else if (~arg4 != -8) {
                                if (arg4 == 8) {
                                    var10.field3444 = new class234(var11, 4, arg7 + 4, arg1, arg3, arg5, arg0, false, var10.field3444);
                                    var10.field3437 = new class234(var11, 4, (3 & arg7 + 2) + 4, arg1, arg3, arg5, arg0, false, var10.field3437);
                                }
                            } else {
                                var10.field3444 = new class234(var11, 4, (arg7 + 2 & 3) + 4, arg1, arg3, arg5, arg0, false, var10.field3444);
                            }
                        } else {
                            var10.field3444 = new class234(var11, 4, arg7, arg1, arg3, arg5, arg0, false, var10.field3444);
                        }
                    }
                }
                if (arg2 == 2) {
                    class90 var12 = class120.method827(arg1, arg3, arg5);
                    if (~arg4 == -12) {
                        arg4 = 10;
                    }
                    if (var12 != null) {
                        var12.field1416 = new class234((int) (var12.field1402 >>> 32) & Integer.MAX_VALUE, arg4, arg7, arg1, arg3, arg5, arg0, false, var12.field1416);
                    }
                }
                if (~arg2 == -4) {
                    class122 var13 = class81.method581(arg1, arg3, arg5);
                    if (var13 != null) {
                        var13.field1930 = new class234((int) (var13.field1933 >>> 32) & Integer.MAX_VALUE, 22, arg7, arg1, arg3, arg5, arg0, false, var13.field1930);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V")
    public static final void method769(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 16 / ((arg2 - -32) / 61);
        if (-arg3 + arg1 >= class34.field561 && arg1 + arg3 <= class148.field2371 && class52.field766 <= -arg3 + arg0 && class191.field3112 >= arg0 - -arg3) {
            class120.method828(arg3, arg1, arg4, -1, arg0);
        } else {
            class278.method1896(arg4, arg0, false, arg1, arg3);
        }
        ++field1698;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static final void method770(boolean arg0) {
        if (~class269.field4346 == -3) {
            if (class33.field539 == class210.field3341 && class148.field2368 == class121.field1918) {
                class269.field4346 = 0;
                if (class122.field1929 && class8.field170[81] && ~class291.field4776 < -3) {
                    class92.method642((byte) -110, class291.field4776 + -2);
                } else {
                    class92.method642((byte) -61, class291.field4776 + -1);
                }
            }
        } else if (~class33.field539 == ~class295.field4806 && ~class16.field302 == ~class148.field2368) {
            class269.field4346 = 0;
            if (class122.field1929 && class8.field170[81] && class291.field4776 > 2) {
                class92.method642((byte) -110, class291.field4776 + -2);
            } else {
                class92.method642((byte) -73, class291.field4776 + -1);
            }
        } else {
            class121.field1918 = class16.field302;
            class210.field3341 = class295.field4806;
            class269.field4346 = 2;
        }
        ++field1694;
        if (arg0) {
            method773(true, -94, 53, 4, -59);
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class110() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBILrg;I)V")
    public static final void method771(int arg0, byte arg1, int arg2, class248 arg3, int arg4) {
        ++field1700;
        class243.method1653(false);
        if (arg1 <= -71) {
            class94.method676(arg2, arg4, arg2 - -arg3.field4016, arg3.field4057 + arg4);
            if (class31.field531 != 2 && ~class31.field531 != -6 && class208.field3321 != null) {
                int var5 = (int) class114.field1742 + class278.field4540 & 2047;
                int var6 = -(class217.field3408.field929 / 32) + 464;
                int var7 = class217.field3408.field994 / 32 + 48;
                ((class67) class208.field3321).method453(arg2, arg4, arg3.field4016, arg3.field4057, var7, var6, var5, class150.field2394 + 256, arg3.field3993, arg3.field3934);
                if (class68.field1092 != null) {
                    for (int var8 = 0; ~class68.field1092.field3189 < ~var8; ++var8) {
                        if (class68.field1092.field3187[var8] != null && class68.field1092.field3185[var8] >> 28 == class214.field3389) {
                            int var9 = (class68.field1092.field3185[var8] & 16383) + -class145.field2327;
                            int var10 = ((class68.field1092.field3185[var8] & 268425194) >> 14) + -class75.field1211;
                            if (~var10 <= -1 && var10 < 104 && ~var9 <= -1 && ~var9 > -105) {
                                int var11 = var10 * 4 - (class217.field3408.field994 / 32 + -2);
                                int var12 = var9 * 4 + 2 + -(class217.field3408.field929 / 32);
                                class157.method1060(arg2, class68.field1092.field3187[var8].field1877, var12, arg3, arg4, var11, 1);
                            }
                        }
                    }
                }
                for (int var13 = 0; ~class97.field1523 < ~var13; ++var13) {
                    int var50 = class291.field4766[var13] * 4 + -(class217.field3408.field994 / 32) + 2;
                    int var51 = class240.field3756[var13] * 4 + 2 + -(class217.field3408.field929 / 32);
                    class172 var52 = class49.method319(class229.field3596[var13], 0);
                    if (var52.field2846 != null) {
                        var52 = var52.method1214(-57);
                        if (var52 == null || ~var52.field2866 == 0) {
                            continue;
                        }
                    }
                    class157.method1060(arg2, var52.field2866, var51, arg3, arg4, var50, 1);
                }
                for (int var14 = 0; ~var14 > -105; ++var14) {
                    for (int var46 = 0; ~var46 > -105; ++var46) {
                        class223 var47 = class296.field4827[class214.field3389][var14][var46];
                        if (var47 != null) {
                            int var48 = var14 * 4 + -(class217.field3408.field994 / 32) - -2;
                            int var49 = var46 * 4 + 2 - class217.field3408.field929 / 32;
                            class188.method1325(arg2, class88.field1374[0], var49, var48, arg3, 155, arg4);
                        }
                    }
                }
                for (int var15 = 0; ~var15 > ~class91.field1439; ++var15) {
                    class104 var42 = class131.field2113[class34.field556[var15]];
                    if (var42 != null && var42.method104(-32447)) {
                        class242 var43 = var42.field1645;
                        if (var43 != null && var43.field3779 != null) {
                            var43 = var43.method1649(false);
                        }
                        if (var43 != null && var43.field3830 && var43.field3834) {
                            int var44 = var42.field994 / 32 - class217.field3408.field994 / 32;
                            int var45 = var42.field929 / 32 - class217.field3408.field929 / 32;
                            if (var43.field3807 == -1) {
                                class188.method1325(arg2, class88.field1374[1], var45, var44, arg3, 155, arg4);
                            } else {
                                class157.method1060(arg2, var43.field3807, var45, arg3, arg4, var44, 1);
                            }
                        }
                    }
                }
                for (int var16 = 0; ~var16 > ~class134.field2172; ++var16) {
                    class12 var32 = class28.field494[class111.field1708[var16]];
                    if (var32 != null && var32.method104(-32447)) {
                        int var33 = var32.field929 / 32 - class217.field3408.field929 / 32;
                        int var34 = var32.field994 / 32 + -(class217.field3408.field994 / 32);
                        boolean var35 = false;
                        long var36 = class162.method1114((byte) -121, var32.field222);
                        for (int var38 = 0; ~var38 > ~class146.field2345; ++var38) {
                            if (class44.field651[var38] == var36 && class135.field2186[var38] != 0) {
                                var35 = true;
                                break;
                            }
                        }
                        boolean var39 = false;
                        for (int var40 = 0; class191.field3106 > var40; ++var40) {
                            if (class7.field167[var40].field2209 == var36) {
                                var39 = true;
                                break;
                            }
                        }
                        boolean var41 = false;
                        if (class217.field3408.field238 != 0 && ~var32.field238 != -1 && class217.field3408.field238 == var32.field238) {
                            var41 = true;
                        }
                        if (!var35) {
                            if (!var39) {
                                if (var41) {
                                    class188.method1325(arg2, class88.field1374[4], var33, var34, arg3, 155, arg4);
                                } else {
                                    class188.method1325(arg2, class88.field1374[2], var33, var34, arg3, 155, arg4);
                                }
                            } else {
                                class188.method1325(arg2, class88.field1374[5], var33, var34, arg3, 155, arg4);
                            }
                        } else {
                            class188.method1325(arg2, class88.field1374[3], var33, var34, arg3, 155, arg4);
                        }
                    }
                }
                class43[] var17 = class168.field2768;
                for (int var18 = 0; var17.length > var18; ++var18) {
                    class43 var21 = var17[var18];
                    if (var21 != null && ~var21.field638 != -1 && class274.field4472 % 20 < 10) {
                        if (~var21.field638 == -2 && var21.field642 >= 0 && ~var21.field642 > ~class131.field2113.length) {
                            class104 var22 = class131.field2113[var21.field642];
                            if (var22 != null) {
                                int var23 = var22.field994 / 32 - class217.field3408.field994 / 32;
                                int var24 = var22.field929 / 32 + -(class217.field3408.field929 / 32);
                                class95.method685(arg4, arg3, var23, arg2, var24, var21.field646, 360000, (byte) -93);
                            }
                        }
                        if (var21.field638 == 2) {
                            int var25 = (-class75.field1211 + var21.field641) * 4 + 2 + -(class217.field3408.field994 / 32);
                            int var26 = var21.field636 * 4;
                            int var27 = (-class145.field2327 + var21.field644) * 4 + 2 + -(class217.field3408.field929 / 32);
                            int var28 = var26 * var26;
                            class95.method685(arg4, arg3, var25, arg2, var27, var21.field646, var28, (byte) -127);
                        }
                        if (var21.field638 == 10 && var21.field642 >= 0 && ~var21.field642 > ~class28.field494.length) {
                            class12 var29 = class28.field494[var21.field642];
                            if (var29 != null) {
                                int var30 = var29.field994 / 32 - class217.field3408.field994 / 32;
                                int var31 = var29.field929 / 32 - class217.field3408.field929 / 32;
                                class95.method685(arg4, arg3, var30, arg2, var31, var21.field646, 360000, (byte) -110);
                            }
                        }
                    }
                }
                if (~class35.field569 != -1) {
                    int var19 = -(class217.field3408.field994 / 32) + (class35.field569 * 4 - (-2 - (class217.field3408.method101(false) * 2 - 2)));
                    int var20 = class164.field2690 * 4 + -(class217.field3408.field929 / 32) + 2 - -(2 * (class217.field3408.method101(false) - 1));
                    class188.method1325(arg2, class266.field4325[!class46.field691 ? 0 : 1], var20, var19, arg3, 155, arg4);
                }
                class94.method660(arg3.field4016 / 2 + -1 + arg2, arg4 + -1 - -(arg3.field4057 / 2), 3, 3, 16777215);
            } else {
                class94.method667(arg2, arg4, 0, arg3.field3993, arg3.field3934);
            }
            class197.field3170[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(III)I")
    private final int method772(int arg0, int arg1, int arg2) {
        ++field1696;
        int var4 = arg0 * 57 + arg1;
        if (arg2 <= 12) {
            return -110;
        } else {
            int var5 = var4 ^ var4 << 1;
            return 4096 - ((var5 * var5 * 15731 + 789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZIIII)V")
    public static final void method773(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class128.field2054; ++var5) {
            if (~arg2 > ~(class270.field4353[var5] + class169.field2779[var5]) && arg2 + arg3 > class270.field4353[var5] && ~(class248.field4071[var5] + class165.field2732[var5]) < ~arg1 && arg1 + arg4 > class248.field4071[var5]) {
                class259.field4249[var5] = true;
            }
        }
        ++field1699;
        if (!arg0) {
            method768(105, 68, -85, 23, 37, -6, 59, 101);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)V")
    public static final void method774(int arg0, boolean arg1) {
        if (arg1) {
            method771(122, (byte) 69, -74, (class248) null, 72);
        }
        ++field1701;
        class146.field2336.method1880(-107, arg0);
        class50.field727.method1880(-69, arg0);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        ++field1695;
        int var3 = 125 / ((-34 - arg0) / 49);
        int[] var4 = super.field1661.method894(-7, arg1);
        if (super.field1661.field2115) {
            int var5 = class259.field4254[arg1];
            for (int var6 = 0; ~class24.field443 < ~var6; ++var6) {
                var4[var6] = this.method772(var5, class221.field3486[var6], 77) % 4096;
            }
        }
        return var4;
    }
}
