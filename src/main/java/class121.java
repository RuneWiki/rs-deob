import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class121 extends class86 {

    @OriginalMember(owner = "client!oe", name = "Ac", descriptor = "I")
    public int field1787 = -1;

    @OriginalMember(owner = "client!oe", name = "Gc", descriptor = "I")
    public int field1793 = -1;

    @OriginalMember(owner = "client!oe", name = "nc", descriptor = "[I")
    public static int[] field1774 = new int[2];

    @OriginalMember(owner = "client!oe", name = "Ec", descriptor = "I")
    public static int field1791 = 0;

    @OriginalMember(owner = "client!oe", name = "lc", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!oe", name = "mc", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!oe", name = "oc", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!oe", name = "pc", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!oe", name = "qc", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!oe", name = "rc", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!oe", name = "sc", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!oe", name = "uc", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!oe", name = "vc", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!oe", name = "wc", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!oe", name = "xc", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!oe", name = "yc", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!oe", name = "zc", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!oe", name = "Bc", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!oe", name = "Cc", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!oe", name = "Dc", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!oe", name = "Fc", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!oe", name = "Hc", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!oe", name = "tc", descriptor = "Lfk;")
    public class429 field1780;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILwm;)Z", line = 3)
    private final boolean method750(int arg0, int arg1, class364 arg2) {
        ++field1788;
        int var4 = arg1;
        class280 var5 = this.method549(-87);
        class181 var6 = ~super.field1137 != 0 && super.field1130 == 0 ? class395.field5477.method266(16107, super.field1137) : null;
        class181 var7 = ~super.field1122 == 0 || super.field1111 && var6 != null ? null : class395.field5477.method266(16107, super.field1122);
        int var8 = var5.field3747;
        int var9 = var5.field3750;
        if (~var8 != -1 || var9 != 0 || ~var5.field3738 != -1 || var5.field3740 != 0) {
            arg1 |= 7;
        }
        class456 var10 = super.field1198[arg0] = this.field1780.method2524(class193.field2611, super.field1150, var6, arg2, class395.field5477, super.field1177, super.field1172, super.field1133, var7, arg1, super.field1127, super.field1169, (byte) 118, class38.field562, super.field1132);
        if (var10 == null) {
            return false;
        } else {
            super.field1178 = var10.method1871();
            this.method536(false, var10);
            int var11 = super.field1143.method2758((byte) 70);
            super.field1128 = 0;
            super.field1151 = 0;
            super.field1136 = 0;
            if (~var8 == -1 && ~var9 == -1) {
                this.method537(this.method545(false) << 7, this.method545(false) << 7, var11, true);
            } else {
                this.method537(var9, var8, var11, true);
                if (super.field1128 != 0) {
                    super.field1198[0].method1885(super.field1128);
                }
                if (super.field1136 != 0) {
                    super.field1198[0].method1846(super.field1136);
                }
                if (~super.field1151 != -1) {
                    super.field1198[0].method1866(0, super.field1151, 0);
                }
            }
            super.field1198[1] = null;
            if (~super.field1134 != 0 && ~super.field1118 != 0) {
                class248 var12 = class302.field4030.method1394(super.field1134, arg0 ^ -7290);
                class456 var13 = var12.method1392(super.field1155, super.field1165, arg2, (byte) -117, (!var12.field3316 ? 2 : 7) | var4, class395.field5477, super.field1118);
                if (var13 != null) {
                    var13.method1866(0, -super.field1190, 0);
                    if (var12.field3316 && (~var8 != -1 || ~var9 != -1)) {
                        if (super.field1128 != 0) {
                            var13.method1885(super.field1128);
                        }
                        if (super.field1136 != 0) {
                            var13.method1846(super.field1136);
                        }
                        if (~super.field1151 != -1) {
                            var13.method1866(0, super.field1151, 0);
                        }
                    }
                    super.field1198[1] = var13;
                }
            }
            super.field1198[2] = null;
            if (super.field1201 != null) {
                if (~super.field1201.field2224 >= ~class70.field968) {
                    super.field1201 = null;
                } else if (~class70.field968 <= ~super.field1201.field2205) {
                    class456 var14 = super.field1201.method938(arg2, 7 | var4, -3);
                    if (var14 != null) {
                        var14.method1866(-super.field6501 + super.field1201.field2209, -super.field6503 + super.field1201.field2219, -super.field6507 + super.field1201.field2206);
                        if (var11 != 0) {
                            var14.method1865(var11);
                        }
                        super.field1198[2] = var14;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIILwm;ZLhp;Z)V", line = 116)
    public final void method2(int arg0, int arg1, int arg2, class364 arg3, boolean arg4, class197 arg5, boolean arg6) {
        ++field1776;
        if (!arg6) {
            this.method750(-50, -6, (class364) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Z", line = 129)
    public final boolean method751(int arg0) {
        ++field1794;
        if (arg0 != 0) {
            this.method3((class364) null, (byte) 56);
        }
        return this.field1780 != null;
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)Z", line = 145)
    public final boolean method17(int arg0) {
        ++field1790;
        return arg0 != 7 ? false : false;
    }

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "(I)V", line = 156)
    public static void method752(int arg0) {
        field1774 = null;
        if (arg0 != 0) {
            method752(-7);
        }
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V", line = 166)
    public final void method8(int arg0) {
        ++field1782;
        if (arg0 > -74) {
            this.method14(113, -120, (byte) -60, (class364) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)I", line = 177)
    public final int method541(boolean arg0) {
        if (!arg0) {
            field1779 = 108;
        }
        ++field1786;
        if (this.field1780.field5824 != null) {
            class429 var2 = this.field1780.method2531(class38.field562, -11);
            if (var2 != null && ~var2.field5838 != 0) {
                return var2.field5838;
            }
        }
        return this.field1780.field5838;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZI)V", line = 197)
    public final void method753(int arg0, boolean arg1, int arg2) {
        ++field1789;
        int var4 = super.field1193[0];
        int var5 = super.field1197[0];
        if (arg2 == 0) {
            ++var5;
        }
        if (arg2 == 1) {
            ++var4;
            ++var5;
        }
        if (arg2 == 2) {
            ++var4;
        }
        if (arg2 == 3) {
            --var5;
            ++var4;
        }
        if (arg2 == 4) {
            --var5;
        }
        if (~arg2 == -6) {
            --var4;
            --var5;
        }
        if (~arg2 == -7) {
            --var4;
        }
        if (arg2 == 7) {
            --var4;
            ++var5;
        }
        if (~super.field1137 != 0 && ~class395.field5477.method266(16107, super.field1137).field2478 == -2) {
            super.field1137 = -1;
        }
        if (~super.field1134 != 0) {
            class248 var6 = class302.field4030.method1394(super.field1134, -7290);
            if (var6.field3305 && var6.field3310 != -1 && ~class395.field5477.method266(16107, var6.field3310).field2478 == -2) {
                super.field1134 = -1;
            }
        }
        if (~super.field1203 > -10) {
            ++super.field1203;
        }
        int var7 = super.field1203;
        if (arg1) {
            this.field1787 = -84;
        }
        while (~var7 < -1) {
            super.field1193[var7] = super.field1193[var7 + -1];
            super.field1197[var7] = super.field1197[var7 + -1];
            super.field1195[var7] = super.field1195[var7 - 1];
            --var7;
        }
        super.field1193[0] = var4;
        super.field1195[0] = (byte) arg0;
        super.field1197[0] = var5;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lwm;B)Lnf;", line = 285)
    public final class374 method3(class364 arg0, byte arg1) {
        ++field1781;
        if (this.field1780 != null && this.method750(0, 1024, arg0)) {
            class203 var3 = arg0.method1960();
            int var4 = super.field1143.method2758((byte) 70);
            var3.method1020(var4);
            var3.method1027(super.field6501, super.field6503, super.field6507);
            class280 var5 = this.method549(-107);
            class429 var6 = this.field1780.field5824 != null ? this.field1780.method2531(class38.field562, -107) : this.field1780;
            if (class488.field6789.field6681 && var6.field5802 && var5.field3752) {
                class181 var7 = ~super.field1137 != 0 && super.field1130 == 0 ? class395.field5477.method266(16107, super.field1137) : null;
                class181 var8 = super.field1122 == -1 || super.field1111 && var7 != null ? null : class395.field5477.method266(16107, super.field1122);
                class456 var9 = class152.method895(var8 == null ? super.field1150 : super.field1172, this.field1780.field5805 & 255, 255 & this.field1780.field5797, super.field1136, var8 != null ? var8 : var7, this.field1780.field5857, 65535 & this.field1780.field5842, super.field1198[0], var4, arg0, 65535 & this.field1780.field5794, super.field1116, super.field1151, super.field1128, 57);
                if (var9 != null) {
                    float var10 = arg0.method2009();
                    float var11 = arg0.method2107();
                    arg0.method2069(false);
                    arg0.method1997(var10, var11 + -150.0F);
                    var9.method1880(var3, (class478) null, 0);
                    arg0.method1997(var10, var11);
                    arg0.method2069(true);
                }
            }
            class374 var12 = null;
            if (this.method755(-21736)) {
                var12 = class358.method2196(super.field1198.length, (byte) -35);
            }
            if (arg1 < 99) {
                field1791 = 29;
            }
            if (super.field1200 == null) {
                arg0.method2102(super.field1198, var3, var12 != null ? var12.field5156 : null, 0);
            } else {
                class342 var13 = super.field1200.method1441();
                arg0.method2081(super.field1198, var13, var3, var12 != null ? var12.field5156 : null, 0);
            }
            this.method550(124, arg0, super.field1198, false);
            if (super.field1198[2] != null) {
                if (~var4 != -1) {
                    super.field1198[2].method1865(var4);
                }
                super.field1198[2].method1866(-super.field1201.field2209 + super.field6501, -super.field1201.field2219 + super.field6503, super.field6507 - super.field1201.field2206);
            }
            super.field1145 = class67.field911;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIZI)V", line = 365)
    public final void method754(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field1785;
        super.field6502 = (byte) arg2;
        if (~super.field1137 != 0 && ~class395.field5477.method266(16107, super.field1137).field2478 == -2) {
            super.field1137 = -1;
        }
        if (super.field1134 != -1) {
            class248 var7 = class302.field4030.method1394(super.field1134, -7290);
            if (var7.field3305 && var7.field3310 != -1 && ~class395.field5477.method266(16107, var7.field3310).field2478 == -2) {
                super.field1134 = -1;
            }
        }
        if (!arg4) {
            int var8 = -super.field1193[0] + arg3;
            int var9 = -super.field1197[0] + arg5;
            if (~var8 <= 7 && ~var8 >= -9 && ~var9 <= 7 && var9 <= 8) {
                if (~super.field1203 > -10) {
                    ++super.field1203;
                }
                for (int var10 = super.field1203; var10 > 0; --var10) {
                    super.field1193[var10] = super.field1193[var10 - 1];
                    super.field1197[var10] = super.field1197[var10 + -1];
                    super.field1195[var10] = super.field1195[var10 - 1];
                }
                super.field1193[0] = arg3;
                super.field1197[0] = arg5;
                super.field1195[0] = 1;
                return;
            }
        }
        if (arg0 != -20002) {
            this.field1793 = 12;
        }
        super.field1203 = 0;
        super.field1193[0] = arg3;
        super.field1196 = 0;
        super.field1202 = 0;
        super.field1197[0] = arg5;
        super.field6501 = super.field1193[0] * 128 + arg1 * 64;
        super.field6507 = super.field1197[0] * 128 - -(arg1 * 64);
        if (super.field1200 != null) {
            super.field1200.method1442();
        }
    }

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)I", line = 433)
    public final int method6(int arg0) {
        if (arg0 != 0) {
            this.method541(false);
        }
        ++field1784;
        return super.field1178;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIBLwm;)Z", line = 445)
    public final boolean method14(int arg0, int arg1, byte arg2, class364 arg3) {
        ++field1772;
        if (this.field1780 != null && this.method750(0, 65536, arg3)) {
            class203 var5 = arg3.method1960();
            int var6 = super.field1143.method2758((byte) 70);
            var5.method1020(var6);
            var5.method1027(super.field6501, super.field6503, super.field6507);
            if (arg2 > -107) {
                this.field1787 = 64;
            }
            for (int var7 = 0; ~super.field1198.length < ~var7; ++var7) {
                if (super.field1198[var7] != null && super.field1198[var7].method1882(arg0, arg1, var5, this.field1780.field5857 == 1)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)I", line = 481)
    public final int method540(int arg0) {
        int var2 = -108 % ((2 - arg0) / 62);
        ++field1775;
        if (this.field1780.field5824 != null) {
            class429 var3 = this.field1780.method2531(class38.field562, -35);
            if (var3 != null && ~var3.field5801 != 0) {
                return var3.field5801;
            }
        }
        return this.field1780.field5801 == -1 ? super.method540(-123) : this.field1780.field5801;
    }

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "(I)Z", line = 516)
    private final boolean method755(int arg0) {
        if (arg0 != -21736) {
            this.field1787 = -75;
        }
        ++field1777;
        return this.field1780.field5822;
    }

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "(I)V", line = 531)
    public static final void method756(int arg0) {
        if (arg0 != 11490) {
            method756(95);
        }
        class453.field6147.method2113(class30.field404, class375.field5172, class162.field2261);
        ++field1778;
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(B)I", line = 542)
    public final int method546(byte arg0) {
        ++field1783;
        if (arg0 >= -63) {
            this.field1793 = 11;
        }
        if (this.field1780.field5824 != null) {
            class429 var2 = this.field1780.method2531(class38.field562, -87);
            if (var2 != null && var2.field5840 != -1) {
                return var2.field5840;
            }
        }
        return this.field1780.field5840;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lwm;B)V", line = 570)
    public final void method10(class364 arg0, byte arg1) {
        ++field1773;
        if (this.field1780 != null) {
            if (super.field1199 || this.method750(0, 0, arg0)) {
                if (arg1 <= -48) {
                    this.method550(120, arg0, super.field1198, super.field1199);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lfk;I)V", line = 595)
    public final void method757(class429 arg0, int arg1) {
        ++field1792;
        this.field1780 = arg0;
        if (super.field1200 != null) {
            super.field1200.method1442();
        }
        if (arg1 != 21748) {
            this.field1780 = null;
        }
    }
}
