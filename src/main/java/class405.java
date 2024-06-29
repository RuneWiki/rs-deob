import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class405 extends class22 {

    @OriginalMember(owner = "client!uo", name = "Oc", descriptor = "I")
    public int field5618 = -1;

    @OriginalMember(owner = "client!uo", name = "Pc", descriptor = "I")
    public int field5619 = -1;

    @OriginalMember(owner = "client!uo", name = "Ec", descriptor = "[F")
    public static float[] field5608 = new float[16384];

    @OriginalMember(owner = "client!uo", name = "zc", descriptor = "[F")
    public static float[] field5603 = new float[16384];

    @OriginalMember(owner = "client!uo", name = "Uc", descriptor = "Lfg;")
    public static class83 field5624;

    @OriginalMember(owner = "client!uo", name = "Xc", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!uo", name = "Yc", descriptor = "[I")
    public static int[] field5628;

    @OriginalMember(owner = "client!uo", name = "Wc", descriptor = "[I")
    public static int[] field5626;

    @OriginalMember(owner = "client!uo", name = "xc", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!uo", name = "yc", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!uo", name = "Ac", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!uo", name = "Bc", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!uo", name = "Cc", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!uo", name = "Dc", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!uo", name = "Fc", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!uo", name = "Gc", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!uo", name = "Hc", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!uo", name = "Ic", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!uo", name = "Jc", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!uo", name = "Kc", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!uo", name = "Lc", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!uo", name = "Mc", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!uo", name = "Nc", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!uo", name = "Qc", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!uo", name = "Rc", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!uo", name = "Sc", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!uo", name = "Vc", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!uo", name = "Tc", descriptor = "Lef;")
    public class336 field5623;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)I")
    public final int method162(byte arg0) {
        ++field5610;
        if (arg0 <= 73) {
            this.method172(78);
        }
        if (this.field5623.field4612 != null) {
            class336 var2 = this.field5623.method1860(class453.field6623, (byte) -72);
            if (var2 != null && ~var2.field4628 != 0) {
                return var2.field4628;
            }
        }
        return this.field5623.field4628;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILco;ILqa;ZZ)V")
    public final void method394(int arg0, int arg1, class76 arg2, int arg3, class162 arg4, boolean arg5, boolean arg6) {
        if (!arg6) {
            field5627 = -107;
        }
        ++field5601;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)Z")
    public final boolean method399(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field5617;
            return false;
        }
    }

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "(I)I")
    public final int method172(int arg0) {
        ++field5621;
        if (this.field5623.field4612 != null) {
            class336 var2 = this.field5623.method1860(class453.field6623, (byte) -97);
            if (var2 != null && ~var2.field4634 != 0) {
                return var2.field4634;
            }
        }
        if (arg0 != 0) {
            this.method172(38);
        }
        return ~this.field5623.field4634 != 0 ? this.field5623.field4634 : super.method172(0);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIIIZLid;II)Z")
    public static final boolean method2339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class413 arg8, int arg9, int arg10) {
        ++field5606;
        int var11 = arg10;
        int var12 = arg6;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg10;
        int var16 = -var14 + arg6;
        class205.field2906[var13][var14] = 99;
        class472.field6894[var13][var14] = 0;
        byte var17 = 0;
        class175.field2502[var17] = arg10;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class300.field4118[var10001] = arg6;
        if (arg7) {
            return false;
        } else {
            int[][] var19 = arg8.field6067;
            while (~var26 != ~var18) {
                var11 = class175.field2502[var18];
                var12 = class300.field4118[var18];
                int var20 = -var16 + var12;
                int var21 = -arg8.field6063 + var12;
                int var22 = -var15 + var11;
                var18 = 4095 & var18 + 1;
                int var23 = -arg8.field6053 + var11;
                if (arg5 != -4) {
                    if (~arg5 != 2) {
                        if (arg5 != -2) {
                            if (arg5 != -1) {
                                if (arg5 != 0 && ~arg5 != -2 && ~arg5 != -3 && ~arg5 != -4 && arg5 != 9) {
                                    if (arg8.method2468(1, var12, arg1, arg0, arg4, arg5, var11, 32)) {
                                        class210.field2982 = var12;
                                        class100.field1372 = var11;
                                        return true;
                                    }
                                } else if (arg8.method2463(arg4, arg1, var11, -29353, arg5, var12, 1, arg0)) {
                                    class210.field2982 = var12;
                                    class100.field1372 = var11;
                                    return true;
                                }
                            } else if (arg8.method2471(!arg7, arg4, arg2, arg0, var11, arg3, var12, 1, arg9)) {
                                class210.field2982 = var12;
                                class100.field1372 = var11;
                                return true;
                            }
                        } else if (arg8.method2476(arg2, 1, var12, arg9, var11, 1, arg4, arg0, arg3, (byte) 117)) {
                            class210.field2982 = var12;
                            class100.field1372 = var11;
                            return true;
                        }
                    } else if (class360.method2000(var11, 1, arg4, arg2, var12, (byte) -37, arg0, arg3, 1)) {
                        class210.field2982 = var12;
                        class100.field1372 = var11;
                        return true;
                    }
                } else if (~arg0 == ~var11 && arg4 == var12) {
                    class100.field1372 = var11;
                    class210.field2982 = var12;
                    return true;
                }
                int var25 = class472.field6894[var22][var20] + 1;
                if (var22 > 0 && class205.field2906[var22 - 1][var20] == 0 && ~(var19[var23 + -1][var21] & 1109655552) == -1) {
                    class175.field2502[var26] = var11 + -1;
                    class300.field4118[var26] = var12;
                    class205.field2906[var22 + -1][var20] = 2;
                    var26 = var26 + 1 & 4095;
                    class472.field6894[var22 + -1][var20] = var25;
                }
                if (var22 < 127 && ~class205.field2906[var22 + 1][var20] == -1 && (1612972032 & var19[var23 + 1][var21]) == 0) {
                    class175.field2502[var26] = var11 + 1;
                    class300.field4118[var26] = var12;
                    var26 = 4095 & var26 + 1;
                    class205.field2906[var22 + 1][var20] = 8;
                    class472.field6894[var22 - -1][var20] = var25;
                }
                if (~var20 < -1 && ~class205.field2906[var22][var20 + -1] == -1 && ~(1084489728 & var19[var23][var21 - 1]) == -1) {
                    class175.field2502[var26] = var11;
                    class300.field4118[var26] = var12 - 1;
                    var26 = 4095 & var26 + 1;
                    class205.field2906[var22][var20 + -1] = 1;
                    class472.field6894[var22][var20 - 1] = var25;
                }
                if (~var20 > -128 && ~class205.field2906[var22][var20 - -1] == -1 && (var19[var23][var21 + 1] & 1210318848) == 0) {
                    class175.field2502[var26] = var11;
                    class300.field4118[var26] = var12 + 1;
                    class205.field2906[var22][var20 + 1] = 4;
                    var26 = 4095 & var26 - -1;
                    class472.field6894[var22][var20 + 1] = var25;
                }
                if (~var22 < -1 && var20 > 0 && ~class205.field2906[var22 + -1][var20 + -1] == -1 && ~(1134821376 & var19[var23 + -1][var21 - 1]) == -1 && ~(var19[var23 + -1][var21] & 1109655552) == -1 && (1084489728 & var19[var23][var21 + -1]) == 0) {
                    class175.field2502[var26] = var11 - 1;
                    class300.field4118[var26] = var12 + -1;
                    class205.field2906[var22 - 1][var20 + -1] = 3;
                    var26 = var26 - -1 & 4095;
                    class472.field6894[var22 - 1][var20 + -1] = var25;
                }
                if (var22 < 127 && ~var20 < -1 && class205.field2906[var22 + 1][var20 - 1] == 0 && (1625554944 & var19[var23 - -1][var21 + -1]) == 0 && (var19[var23 + 1][var21] & 1612972032) == 0 && ~(1084489728 & var19[var23][var21 - 1]) == -1) {
                    class175.field2502[var26] = var11 + 1;
                    class300.field4118[var26] = var12 - 1;
                    class205.field2906[var22 + 1][var20 + -1] = 9;
                    var26 = 4095 & var26 - -1;
                    class472.field6894[var22 + 1][var20 + -1] = var25;
                }
                if (var22 > 0 && ~var20 > -128 && ~class205.field2906[var22 + -1][var20 + 1] == -1 && ~(var19[var23 + -1][var21 + 1] & 1310982144) == -1 && ~(1109655552 & var19[var23 - 1][var21]) == -1 && ~(var19[var23][var21 + 1] & 1210318848) == -1) {
                    class175.field2502[var26] = var11 - 1;
                    class300.field4118[var26] = var12 + 1;
                    class205.field2906[var22 - 1][var20 + 1] = 6;
                    var26 = var26 + 1 & 4095;
                    class472.field6894[var22 - 1][var20 + 1] = var25;
                }
                if (var22 < 127 && ~var20 > -128 && class205.field2906[var22 + 1][var20 + 1] == 0 && (2015625216 & var19[var23 + 1][var21 + 1]) == 0 && ~(1612972032 & var19[var23 + 1][var21]) == -1 && (var19[var23][var21 + 1] & 1210318848) == 0) {
                    class175.field2502[var26] = var11 + 1;
                    class300.field4118[var26] = var12 + 1;
                    var26 = var26 + 1 & 4095;
                    class205.field2906[var22 + 1][var20 - -1] = 12;
                    class472.field6894[var22 + 1][var20 + 1] = var25;
                }
            }
            class210.field2982 = var12;
            class100.field1372 = var11;
            return false;
        }
    }

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(B)Z")
    public final boolean method2340(byte arg0) {
        if (arg0 != 105) {
            this.method398(88);
        }
        ++field5613;
        return this.field5623 != null;
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)I")
    public final int method170(int arg0) {
        ++field5616;
        if (arg0 < 78) {
            return 20;
        } else {
            if (this.field5623.field4612 != null) {
                class336 var2 = this.field5623.method1860(class453.field6623, (byte) -16);
                if (var2 != null && ~var2.field4629 != 0) {
                    return var2.field4629;
                }
            }
            return this.field5623.field4629;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILqa;)Z")
    private final boolean method2341(int arg0, int arg1, class162 arg2) {
        ++field5614;
        int var4 = arg0;
        class21 var5 = this.method165((byte) -112);
        class467 var6 = ~super.field271 != 0 && ~super.field325 == -1 ? class275.field3740.method1484(0, super.field271) : null;
        class467 var7 = super.field328 == -1 || super.field317 && var6 != null ? null : class275.field3740.method1484(0, super.field328);
        int var8 = var5.field254;
        int var9 = var5.field221;
        if (~var8 != -1 || var9 != 0 || var5.field234 != 0 || var5.field268 != 0) {
            arg0 |= 7;
        }
        boolean var10 = super.field334 != 0 && ~super.field322 >= ~class393.field5484 && class393.field5484 < super.field281;
        if (var10) {
            arg0 |= 524288;
        }
        class121 var11 = super.field369[0] = this.field5623.method1868(arg2, class453.field6623, super.field335, super.field326, super.field273, var7, false, arg0, class275.field3740, var6, super.field342, class20.field211, super.field330, super.field280, super.field270);
        if (var11 == null) {
            return false;
        } else {
            super.field272 = var11.method771();
            this.method159(var11, (byte) 21);
            int var12 = super.field357.method816(106);
            if (arg1 == var8 && var9 == 0) {
                this.method166(0, this.method167(-1) << 7, 0, this.method167(-1) << 7, var12, arg1 + -128);
            } else {
                this.method166(var5.field223, var8, var5.field262, var9, var12, 120);
                if (super.field318 != 0) {
                    super.field369[0].method773(super.field318);
                }
                if (super.field343 != 0) {
                    super.field369[0].method805(super.field343);
                }
                if (~super.field344 != -1) {
                    super.field369[0].method797(0, super.field344, 0);
                }
            }
            if (var10) {
                var11.method763(super.field315, super.field355, super.field302, 255 & super.field334);
            }
            if (super.field324 != -1 && super.field308 != -1) {
                class119 var13 = class492.field7279.method2231(super.field324, 64);
                boolean var14 = var13.field1624 == 3 && (var8 != 0 || var9 != 0);
                int var15 = var4;
                if (!var14) {
                    if (super.field329 != 0) {
                        var15 = var4 | 5;
                    }
                    if (super.field313 != 0) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class121 var16 = super.field369[1] = var13.method753(super.field274, 122, super.field336, class275.field3740, super.field308, var15, arg2);
                if (var16 != null) {
                    if (~super.field313 != -1) {
                        var16.method797(0, -super.field313 << 0, 0);
                    }
                    if (super.field329 != 0) {
                        var16.method798(super.field329 * 2048);
                    }
                    if (var14) {
                        if (~super.field318 != -1) {
                            var16.method773(super.field318);
                        }
                        if (super.field343 != 0) {
                            var16.method805(super.field343);
                        }
                        if (~super.field344 != -1) {
                            var16.method797(0, super.field344, 0);
                        }
                    }
                }
            } else {
                super.field369[1] = null;
            }
            if (~super.field303 != 0 && ~super.field300 != 0) {
                class119 var17 = class492.field7279.method2231(super.field303, 64);
                boolean var18 = ~var17.field1624 == -4 && (~var8 != -1 || var9 != 0);
                int var19 = var4;
                if (!var18) {
                    if (~super.field279 != -1) {
                        var19 = var4 | 5;
                    }
                    if (super.field292 != 0) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class121 var20 = super.field369[3] = var17.method755(class275.field3740, (byte) -59, var19, arg2, super.field300, super.field277, super.field310);
                if (var20 != null) {
                    if (super.field292 != 0) {
                        var20.method797(0, -super.field292 << 0, 0);
                    }
                    if (~super.field279 != -1) {
                        var20.method798(super.field279 * 2048);
                    }
                    if (var18) {
                        if (super.field318 != 0) {
                            var20.method773(super.field318);
                        }
                        if (super.field343 != 0) {
                            var20.method805(super.field343);
                        }
                        if (super.field344 != 0) {
                            var20.method797(0, super.field344, 0);
                        }
                    }
                }
            } else {
                super.field369[3] = null;
            }
            super.field369[2] = null;
            if (super.field366 != null) {
                if (~super.field366.field4928 < ~class393.field5484) {
                    if (class393.field5484 >= super.field366.field4946) {
                        class121 var21 = super.field366.method1999(var4 | 7, (byte) 121, arg2);
                        if (var21 != null) {
                            var21.method797(-super.field466 + super.field366.field4931, -super.field457 + super.field366.field4934, -super.field461 + super.field366.field4927);
                            if (~var12 != -1) {
                                var21.method798(var12);
                            }
                            super.field369[2] = var21;
                        }
                    }
                } else {
                    super.field366 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)I")
    public final int method215(int arg0) {
        ++field5625;
        return arg0 != 0 ? -95 : super.field272;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method403(class162 arg0, int arg1, int arg2, int arg3) {
        ++field5609;
        if (this.field5623 != null && this.method2341(131072, 0, arg0)) {
            class415 var5 = arg0.method539();
            if (arg2 != 24130) {
                this.method2340((byte) 99);
            }
            int var6 = super.field357.method816(118);
            var5.method343(var6);
            var5.method335(super.field466, super.field457, super.field461);
            for (int var7 = 0; ~var7 > ~super.field369.length; ++var7) {
                if (super.field369[var7] != null && super.field369[var7].method777(arg1, arg3, var5, this.field5623.field4637 == 1)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V")
    public final void method398(int arg0) {
        if (arg0 < 74) {
            this.method162((byte) -73);
        }
        ++field5605;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(ILqa;)V")
    public final void method400(int arg0, class162 arg1) {
        ++field5604;
        if (this.field5623 != null) {
            if (super.field364 || this.method2341(0, 0, arg1)) {
                this.method161(false, arg1, super.field369, super.field364);
                int var3 = 50 / ((-29 - arg0) / 33);
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIZZII)V")
    public final void method2342(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        ++field5622;
        super.field464 = (byte) arg0;
        if (~super.field271 != 0 && class275.field3740.method1484(0, super.field271).field6822 == 1) {
            super.field271 = -1;
        }
        if (super.field324 != -1) {
            class119 var7 = class492.field7279.method2231(super.field324, 64);
            if (var7.field1603 && ~var7.field1616 != 0 && class275.field3740.method1484(0, var7.field1616).field6822 == 1) {
                super.field324 = -1;
            }
        }
        if (~super.field303 != 0) {
            class119 var8 = class492.field7279.method2231(super.field303, 64);
            if (var8.field1603 && ~var8.field1616 != 0 && ~class275.field3740.method1484(0, var8.field1616).field6822 == -2) {
                super.field303 = -1;
            }
        }
        if (!arg2) {
            int var9 = -super.field372[0] + arg4;
            int var10 = arg1 - super.field362[0];
            if (~var9 <= 7 && ~var9 >= -9 && ~var10 <= 7 && ~var10 >= -9) {
                if (super.field368 < 9) {
                    ++super.field368;
                }
                for (int var11 = super.field368; ~var11 < -1; --var11) {
                    super.field372[var11] = super.field372[var11 + -1];
                    super.field362[var11] = super.field362[var11 + -1];
                    super.field367[var11] = super.field367[var11 + -1];
                }
                super.field372[0] = arg4;
                super.field362[0] = arg1;
                super.field367[0] = 1;
                return;
            }
        }
        super.field371 = 0;
        super.field368 = 0;
        if (arg3) {
            this.method2347(false);
        }
        super.field363 = 0;
        super.field372[0] = arg4;
        super.field362[0] = arg1;
        super.field461 = (super.field362[0] << 7) - -(arg5 << 6);
        super.field466 = (super.field372[0] << 7) + (arg5 << 6);
        if (super.field365 != null) {
            super.field365.method1259();
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lef;I)V")
    public final void method2343(class336 arg0, int arg1) {
        this.field5623 = arg0;
        if (arg1 > -117) {
            this.field5618 = -66;
        }
        ++field5612;
        if (super.field365 != null) {
            super.field365.method1259();
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIILtf;IILuo;Lpk;)V")
    public static final void method2344(int arg0, int arg1, int arg2, class192 arg3, int arg4, int arg5, class405 arg6, class132 arg7) {
        ++field5620;
        if (arg1 != 65535) {
            method2346(29);
        }
        class129 var8 = new class129();
        var8.field1768 = arg4 << 7;
        var8.field1769 = arg5 << 7;
        var8.field1759 = arg2;
        if (arg7 == null) {
            if (arg6 == null) {
                if (arg3 != null) {
                    var8.field1781 = arg3;
                    var8.field1780 = arg4 - -arg3.method167(arg1 + -65536) << 7;
                    var8.field1775 = arg3.method167(-1) + arg5 << 7;
                    var8.field1767 = class433.method2582(arg3, 3);
                    var8.field1779 = arg3.field2698;
                    var8.field1774 = arg3.field2691 << 7;
                    class453.field6620.method990((long) arg3.field297, (byte) 103, var8);
                    return;
                }
            } else {
                var8.field1777 = arg6;
                class336 var11 = arg6.field5623;
                if (var11.field4612 != null) {
                    var8.field1772 = true;
                    var11 = var11.method1860(class453.field6623, (byte) -85);
                }
                if (var11 != null) {
                    var8.field1775 = var11.field4637 + arg5 << 7;
                    var8.field1780 = arg4 - -var11.field4637 << 7;
                    var8.field1767 = class86.method602(-1, arg6);
                    var8.field1779 = var11.field4574;
                    var8.field1774 = var11.field4595 << 7;
                }
                class20.field217.method3070(var8, (byte) -121);
            }
        } else {
            var8.field1773 = arg7;
            int var9 = arg7.field1880;
            int var10 = arg7.field1881;
            if (arg0 == 1 || arg0 == 3) {
                var10 = arg7.field1880;
                var9 = arg7.field1881;
            }
            var8.field1774 = arg7.field1840 << 7;
            var8.field1779 = arg7.field1817;
            var8.field1770 = arg7.field1862;
            var8.field1761 = arg7.field1824;
            var8.field1780 = arg4 - -var9 << 7;
            var8.field1760 = arg7.field1898;
            var8.field1775 = arg5 + var10 << 7;
            var8.field1767 = arg7.field1868;
            if (arg7.field1814 != null) {
                var8.field1772 = true;
                var8.method844((byte) -55);
            }
            if (var8.field1761 != null) {
                var8.field1757 = var8.field1760 - -((int) ((double) (-var8.field1760 + var8.field1770) * Math.random()));
            }
            class184.field2573.method3070(var8, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BII)V")
    public final void method2345(byte arg0, int arg1, int arg2) {
        ++field5615;
        int var4 = super.field372[0];
        int var5 = super.field362[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (arg1 == 1) {
            ++var4;
            ++var5;
        }
        if (arg1 == 2) {
            ++var4;
        }
        if (~arg1 == -4) {
            ++var4;
            --var5;
        }
        if (arg1 == 4) {
            --var5;
        }
        if (~arg1 == -6) {
            --var5;
            --var4;
        }
        if (~arg1 == -7) {
            --var4;
        }
        if (~arg1 == -8) {
            ++var5;
            --var4;
        }
        if (~super.field271 != 0 && ~class275.field3740.method1484(0, super.field271).field6822 == -2) {
            super.field271 = -1;
        }
        if (super.field324 != -1) {
            class119 var6 = class492.field7279.method2231(super.field324, 64);
            if (var6.field1603 && ~var6.field1616 != 0 && ~class275.field3740.method1484(0, var6.field1616).field6822 == -2) {
                super.field324 = -1;
            }
        }
        if (~super.field303 != 0) {
            class119 var7 = class492.field7279.method2231(super.field303, 64);
            if (var7.field1603 && ~var7.field1616 != 0 && class275.field3740.method1484(0, var7.field1616).field6822 == 1) {
                super.field303 = -1;
            }
        }
        if (~super.field368 > -10) {
            ++super.field368;
        }
        for (int var8 = super.field368; var8 > 0; --var8) {
            super.field372[var8] = super.field372[var8 + -1];
            super.field362[var8] = super.field362[var8 + -1];
            super.field367[var8] = super.field367[var8 + -1];
        }
        super.field372[0] = var4;
        int var9 = 32 / ((arg0 - 82) / 37);
        super.field367[0] = (byte) arg2;
        super.field362[0] = var5;
    }

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "(I)V")
    public static void method2346(int arg0) {
        field5628 = null;
        field5624 = null;
        field5626 = null;
        if (arg0 != -1) {
            method2344(15, -62, 31, (class192) null, -30, 47, (class405) null, (class132) null);
        }
        field5608 = null;
        field5603 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lqa;I)Lip;")
    public final class498 method402(class162 arg0, int arg1) {
        ++field5607;
        if (this.field5623 != null && this.method2341(2048, arg1 + -16562, arg0)) {
            class415 var3 = arg0.method539();
            int var4 = super.field357.method816(74);
            if (arg1 != 16562) {
                field5608 = null;
            }
            var3.method343(var4);
            var3.method335(super.field466, super.field457, super.field461);
            class21 var5 = this.method165((byte) -118);
            class336 var6 = this.field5623.field4612 == null ? this.field5623 : this.field5623.method1860(class453.field6623, (byte) -107);
            if (class437.field6374.field4284 && var6.field4610 && var5.field243) {
                class467 var7 = ~super.field271 != 0 && super.field325 == 0 ? class275.field3740.method1484(0, super.field271) : null;
                class467 var8 = super.field328 == -1 || super.field317 && var7 != null ? null : class275.field3740.method1484(0, super.field328);
                class121 var9 = class263.method1520(var8 != null ? super.field280 : super.field273, 255 & this.field5623.field4568, this.field5623.field4637, (byte) -53, super.field344, super.field343, super.field316, 255 & this.field5623.field4564, super.field318, var8 != null ? var8 : var7, arg0, 65535 & this.field5623.field4600, super.field369[0], this.field5623.field4566 & 65535, var4);
                if (var9 != null) {
                    float var10 = arg0.method499();
                    float var11 = arg0.method439();
                    arg0.method469(false);
                    arg0.method440(var10, var11 + -150.0F);
                    var9.method781(var3, (class525) null, 0);
                    arg0.method440(var10, var11);
                    arg0.method469(true);
                }
            }
            class498 var12 = null;
            if (this.method2347(false)) {
                var12 = class227.method1338(0, super.field369.length);
            }
            if (super.field365 == null) {
                arg0.method453(super.field369, var3, var12 == null ? null : var12.field7332, 0);
            } else {
                class148 var13 = super.field365.method1260();
                arg0.method457(super.field369, var13, var3, var12 == null ? null : var12.field7332, 0);
            }
            this.method161(false, arg0, super.field369, false);
            if (super.field369[2] != null) {
                if (~var4 != -1) {
                    super.field369[2].method798(var4);
                }
                super.field369[2].method797(-super.field366.field4931 + super.field466, -super.field366.field4934 + super.field457, -super.field366.field4927 + super.field461);
            }
            super.field356 = class87.field1195;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(Z)Z")
    private final boolean method2347(boolean arg0) {
        ++field5602;
        if (arg0) {
            this.field5618 = -75;
        }
        return this.field5623.field4589;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field5608[var2] = (float) Math.sin((double) var2 * var0);
            field5603[var2] = (float) Math.cos((double) var2 * var0);
        }
        field5624 = new class83("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");
        field5627 = -1;
        field5628 = new int[200];
        field5626 = new int[100];
    }
}
