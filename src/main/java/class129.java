import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class129 extends class18 {

    @OriginalMember(owner = "client!ai", name = "Ic", descriptor = "Lwe;")
    public static class24 field1717 = new class24(200);

    @OriginalMember(owner = "client!ai", name = "Ac", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!ai", name = "Bc", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!ai", name = "Cc", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ai", name = "Dc", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!ai", name = "Ec", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!ai", name = "Hc", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ai", name = "Jc", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ai", name = "Kc", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!ai", name = "Lc", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ai", name = "Nc", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ai", name = "Oc", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ai", name = "Pc", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ai", name = "Qc", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!ai", name = "Rc", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ai", name = "Sc", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!ai", name = "Tc", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!ai", name = "Uc", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!ai", name = "Vc", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ai", name = "Gc", descriptor = "Lqj;")
    public static class238 field1715;

    @OriginalMember(owner = "client!ai", name = "Mc", descriptor = "Lqj;")
    public static class238 field1721;

    @OriginalMember(owner = "client!ai", name = "Fc", descriptor = "Lgj;")
    public class373 field1714;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method876(byte arg0, String arg1) {
        ++field1727;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = 0; ~var2 > ~class26.field463; ++var2) {
                if (arg1.equalsIgnoreCase(class164.field2128[var2])) {
                    return true;
                }
            }
            if (arg0 < 71) {
                method882(24);
            }
            return arg1.equalsIgnoreCase(class100.field1350.field2756);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILgj;)V")
    public final void method877(int arg0, class373 arg1) {
        this.field1714 = arg1;
        int var3 = 65 % ((25 - arg0) / 51);
        ++field1729;
        if (super.field291 != null) {
            super.field291.method1791();
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLnr;IIZLcb;I)V")
    public final void method153(byte arg0, class437 arg1, int arg2, int arg3, boolean arg4, class387 arg5, int arg6) {
        ++field1709;
        if (arg0 > -116) {
            this.method141((byte) 5);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lnr;I)V")
    public final void method161(class437 arg0, int arg1) {
        ++field1725;
        if (this.field1714 != null) {
            if (super.field301 || this.method881(0, -5235, arg0)) {
                if (arg1 != 0) {
                    this.field1714 = null;
                }
                this.method126((byte) -44, arg0, super.field304, super.field301);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)Z")
    public final boolean method878(boolean arg0) {
        ++field1712;
        if (arg0) {
            field1721 = null;
        }
        return this.field1714 != null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)I")
    public final int method127(byte arg0) {
        ++field1718;
        if (this.field1714.field5576 != null) {
            class373 var2 = this.field1714.method2469(true);
            if (var2 != null && var2.field5579 != -1) {
                return var2.field5579;
            }
        }
        int var3 = -119 / ((arg0 - -66) / 59);
        return this.field1714.field5579;
    }

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "(I)Z")
    private final boolean method879(int arg0) {
        if (arg0 != 82) {
            this.method142((byte) -1);
        }
        ++field1711;
        return this.field1714.field5572;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(II)V")
    public static final void method880(int arg0, int arg1) {
        class261.field3797 = arg1;
        ++field1719;
        class237.field3325.method212(arg0 + -86);
        if (arg0 != -1) {
            field1721 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILnr;)Z")
    private final boolean method881(int arg0, int arg1, class437 arg2) {
        ++field1720;
        int var4 = arg0;
        class183 var5 = this.method140(arg1 + 5351);
        class15 var6 = super.field222 != -1 && ~super.field231 == -1 ? class391.method2551(super.field222, (byte) -116) : null;
        class15 var7 = ~super.field229 == 0 || super.field236 && var6 != null ? null : class391.method2551(super.field229, (byte) -97);
        int var8 = var5.field2457;
        int var9 = var5.field2459;
        if (~var8 != -1 || ~var9 != -1 || var5.field2440 != 0 || var5.field2449 != 0) {
            arg0 |= 7;
        }
        if (arg1 != -5235) {
            field1717 = null;
        }
        class95 var10 = super.field304[0] = this.field1714.method2468(super.field279, super.field212, super.field288, var6, 110, var7, super.field210, arg2, super.field223, super.field280, arg0, super.field233);
        if (var10 == null) {
            return false;
        } else {
            super.field239 = var10.method597();
            this.method137(14889, var10);
            int var11 = super.field272.method1650((byte) 126);
            super.field227 = 0;
            super.field211 = 0;
            super.field250 = 0;
            if (var8 == 0 && var9 == 0) {
                this.method131(this.method130((byte) -67) << 7, 2, this.method130((byte) -122) << 7, var11);
            } else {
                this.method131(var9, 2, var8, var11);
                if (super.field227 != 0) {
                    super.field304[0].method629(super.field227);
                }
                if (~super.field250 != -1) {
                    super.field304[0].method592(super.field250);
                }
                if (super.field211 != 0) {
                    super.field304[0].method613(0, super.field211, 0);
                }
            }
            super.field304[1] = null;
            if (super.field228 != -1 && ~super.field237 != 0) {
                class333 var12 = class395.method2586(super.field228, -6861);
                class95 var13 = var12.method2210(-1, super.field237, super.field263, super.field226, (!var12.field4916 ? 2 : 7) | var4, arg2);
                if (var13 != null) {
                    var13.method613(0, -super.field261, 0);
                    if (var12.field4916 && (var8 != 0 || var9 != 0)) {
                        if (~super.field227 != -1) {
                            var13.method629(super.field227);
                        }
                        if (~super.field250 != -1) {
                            var13.method592(super.field250);
                        }
                        if (super.field211 != 0) {
                            var13.method613(0, super.field211, 0);
                        }
                    }
                    super.field304[1] = var13;
                }
            }
            super.field304[2] = null;
            if (super.field308 != null) {
                if (~class50.field698 <= ~super.field307) {
                    super.field308 = null;
                }
                if (~class50.field698 <= ~super.field299 && super.field307 > class50.field698) {
                    class95 var14 = super.field308.method147((byte) 105, var4 | 7, arg2);
                    if (var14 != null) {
                        var14.method613(-super.field5284 + super.field302, -super.field5297 + super.field300, super.field298 - super.field5298);
                        if (~var11 != -1) {
                            var14.method605(var11);
                        }
                        super.field304[2] = var14;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILnr;II)Z")
    public final boolean method159(int arg0, class437 arg1, int arg2, int arg3) {
        ++field1722;
        if (this.field1714 != null && this.method881(65536, -5235, arg1)) {
            class116 var5 = arg1.method2026();
            int var6 = super.field272.method1650((byte) 126);
            var5.method805(var6);
            var5.method809(super.field5284, super.field5297, super.field5298);
            int var7 = 0;
            if (arg3 <= 12) {
                return true;
            } else {
                while (~super.field304.length < ~var7) {
                    if (super.field304[var7] != null) {
                        return super.field304[var7].method619(arg2, arg0, var5, this.field1714.field5570 == 1);
                    }
                    ++var7;
                }
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(I)I")
    public final int method194(int arg0) {
        ++field1713;
        if (arg0 >= -7) {
            this.method194(-56);
        }
        return super.field239;
    }

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "(I)V")
    public static void method882(int arg0) {
        field1721 = null;
        field1717 = null;
        field1715 = null;
        if (arg0 != -14754) {
            method882(39);
        }
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(B)I")
    public final int method142(byte arg0) {
        if (arg0 != 115) {
            this.field1714 = null;
        }
        ++field1723;
        if (this.field1714.field5576 != null) {
            class373 var2 = this.field1714.method2469(true);
            if (var2 != null && var2.field5632 != -1) {
                return var2.field5632;
            }
        }
        return this.field1714.field5632;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)I")
    public final int method141(byte arg0) {
        ++field1710;
        if (this.field1714.field5576 != null) {
            class373 var2 = this.field1714.method2469(true);
            if (var2 != null && ~var2.field5577 != 0) {
                return var2.field5577;
            }
        }
        if (arg0 < 78) {
            this.field1714 = null;
        }
        return ~this.field1714.field5577 == 0 ? super.method141((byte) 112) : this.field1714.field5577;
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)Z")
    public final boolean method151(byte arg0) {
        ++field1730;
        if (arg0 != -115) {
            this.method153((byte) 125, (class437) null, -9, 15, true, (class387) null, 20);
        }
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Lnr;Z)Lg;")
    public final class433 method145(class437 arg0, boolean arg1) {
        ++field1716;
        if (this.field1714 != null && this.method881(1024, -5235, arg0)) {
            class116 var3 = arg0.method2026();
            int var4 = super.field272.method1650((byte) 127);
            var3.method805(var4);
            var3.method802(super.field5284, super.field5297, super.field5298);
            class183 var5 = this.method140(110);
            class373 var6 = this.field1714.field5576 == null ? this.field1714 : this.field1714.method2469(!arg1);
            if (class451.field6576 && var6.field5588 && var5.field2462) {
                class15 var7 = super.field222 != -1 && ~super.field231 == -1 ? class391.method2551(super.field222, (byte) -107) : null;
                class15 var8 = ~super.field229 == 0 || super.field236 && var7 != null ? null : class391.method2551(super.field229, (byte) -124);
                class95 var9 = class447.method2810(65535 & this.field1714.field5625, arg0, var8 != null ? var8 : var7, 255 & this.field1714.field5585, super.field211, var4, super.field284, var8 != null ? super.field210 : super.field223, super.field304[0], super.field227, super.field250, this.field1714.field5593 & 65535, this.field1714.field5570, 255 & this.field1714.field5582, (byte) 22);
                if (var9 != null) {
                    float var10 = arg0.method2091();
                    float var11 = arg0.method2177();
                    arg0.method2167(false);
                    arg0.method2107(var10, var11 - 150.0F);
                    var9.method602(var3, (class206) null, 0);
                    arg0.method2107(var10, var11);
                    arg0.method2167(true);
                }
            }
            class433 var12 = null;
            if (this.method879(82)) {
                var12 = class436.method2758(super.field304.length, 12300);
            }
            if (super.field291 != null) {
                class125 var13 = super.field291.method1783();
                arg0.method2081(super.field304, var13, var3, var12 != null ? var12.field6381 : null, 0);
            } else {
                arg0.method2080(super.field304, var3, var12 == null ? null : var12.field6381, 0);
            }
            this.method126((byte) -111, arg0, super.field304, arg1);
            if (super.field304[2] != null) {
                if (~var4 != -1) {
                    super.field304[2].method605(var4);
                }
                super.field304[2].method613(-super.field302 + super.field5284, super.field5297 - super.field300, super.field5298 - super.field298);
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
    public final void method163(int arg0) {
        ++field1724;
        if (arg0 != 0) {
            field1721 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(IIII)V")
    public static final void method883(int arg0, int arg1, int arg2, int arg3) {
        if (~arg1 == -1) {
            class232.field3279.method756(0, 119);
            ++class413.field6177;
        }
        ++field1726;
        if (~arg1 == -2) {
            ++class342.field5027;
            class232.field3279.method756(0, 163);
        }
        class232.field3279.method1670(class38.field620 + arg0, (byte) -115);
        class232.field3279.method1719(!class1.field5[82] ? 0 : 1, arg2 ^ 1549190008);
        class232.field3279.method1693(class184.field2482 + arg3, (byte) 59);
        class82.field1154 = arg3;
        class70.field967 = arg0;
        class405.field6086 = false;
        if (arg2 == 0) {
            class203.method1281((byte) -117);
        }
    }
}
