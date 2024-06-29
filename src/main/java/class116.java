import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class116 extends class129 {

    @OriginalMember(owner = "client!wq", name = "Mc", descriptor = "I")
    public int field1765 = -1;

    @OriginalMember(owner = "client!wq", name = "Qc", descriptor = "I")
    public int field1769 = -1;

    @OriginalMember(owner = "client!wq", name = "zc", descriptor = "Luq;")
    public static class114 field1752 = null;

    @OriginalMember(owner = "client!wq", name = "Ic", descriptor = "[I")
    public static int[] field1761 = new int[5];

    @OriginalMember(owner = "client!wq", name = "M", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!wq", name = "xc", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!wq", name = "yc", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!wq", name = "Ac", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!wq", name = "Bc", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!wq", name = "Cc", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!wq", name = "Dc", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!wq", name = "Ec", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!wq", name = "Fc", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!wq", name = "Gc", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!wq", name = "Hc", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!wq", name = "Jc", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!wq", name = "Lc", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!wq", name = "Oc", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!wq", name = "Pc", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!wq", name = "Rc", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!wq", name = "Sc", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!wq", name = "Nc", descriptor = "Lod;")
    public static class352 field1766;

    @OriginalMember(owner = "client!wq", name = "Kc", descriptor = "Ldm;")
    public class37 field1763;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZIIIII)V", line = 3)
    public final void method876(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field5826 = (byte) arg2;
        ++field1755;
        if (~super.field1959 != arg4 && class242.field3846.method2238(super.field1959, (byte) 78).field3176 == 1) {
            super.field1959 = -1;
        }
        if (super.field1904 != -1) {
            class316 var7 = class123.field1839.method1490(super.field1904, true);
            if (var7.field4771 && ~var7.field4775 != 0 && class242.field3846.method2238(var7.field4775, (byte) 78).field3176 == 1) {
                super.field1904 = -1;
            }
        }
        if (super.field1962 != -1) {
            class316 var8 = class123.field1839.method1490(super.field1962, true);
            if (var8.field4771 && ~var8.field4775 != 0 && ~class242.field3846.method2238(var8.field4775, (byte) 78).field3176 == -2) {
                super.field1962 = -1;
            }
        }
        if (!arg0) {
            int var9 = -super.field1978[0] + arg3;
            int var10 = arg5 - super.field1976[0];
            if (var9 >= -8 && var9 <= 8 && ~var10 <= 7 && ~var10 >= -9) {
                if (~super.field1981 > -10) {
                    ++super.field1981;
                }
                for (int var11 = super.field1981; ~var11 < -1; --var11) {
                    super.field1978[var11] = super.field1978[var11 + -1];
                    super.field1976[var11] = super.field1976[var11 + -1];
                    super.field1984[var11] = super.field1984[var11 + -1];
                }
                super.field1978[0] = arg3;
                super.field1976[0] = arg5;
                super.field1984[0] = 1;
                return;
            }
        }
        super.field1981 = 0;
        super.field1978[0] = arg3;
        super.field1985 = 0;
        super.field1983 = 0;
        super.field1976[0] = arg5;
        super.field5837 = (super.field1978[0] << 7) + (arg1 << 6);
        super.field5833 = (super.field1976[0] << 7) - -(arg1 << 6);
        if (super.field1979 != null) {
            super.field1979.method2217();
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ldm;I)V", line = 81)
    public final void method877(class37 arg0, int arg1) {
        this.field1763 = arg0;
        ++field1770;
        if (arg1 == 28766) {
            if (super.field1979 != null) {
                super.field1979.method2217();
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "(B)Z", line = 101)
    private final boolean method878(byte arg0) {
        int var2 = -67 % ((10 - arg0) / 45);
        ++field1762;
        return this.field1763.field465;
    }

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "(I)I", line = 113)
    public final int method24(int arg0) {
        if (arg0 != -867749273) {
            this.method23(61, 117, (class38) null, 39, (class455) null, -116, false);
        }
        ++field1759;
        return super.field1890;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lya;Z)V", line = 130)
    public final void method25(class38 arg0, boolean arg1) {
        ++field1750;
        if (this.field1763 != null) {
            if (arg1) {
                this.field1763 = null;
            }
            if (super.field1982 || this.method882(arg0, 0, -1)) {
                this.method951(super.field1980, super.field1982, 29817, arg0);
                super.field1980[0] = super.field1980[1] = super.field1980[2] = super.field1980[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "(I)V", line = 156)
    public static void method879(int arg0) {
        if (arg0 != 0) {
            method880(-110);
        }
        field1766 = null;
        field1761 = null;
        field1752 = null;
    }

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "(I)V", line = 168)
    public static final void method880(int arg0) {
        class364.field5384 = arg0;
        ++field1760;
        class523.field7652 = -1;
        class114.field1692 = -1;
    }

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "(I)Z", line = 178)
    public final boolean method17(int arg0) {
        ++field1754;
        if (arg0 != 13651334) {
            this.method885((byte) 61);
        }
        return false;
    }

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "(B)Z", line = 189)
    public final boolean method881(byte arg0) {
        ++field1771;
        if (arg0 != -67) {
            return true;
        } else {
            return this.field1763 != null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IILya;ILor;IZ)V", line = 203)
    public final void method23(int arg0, int arg1, class38 arg2, int arg3, class455 arg4, int arg5, boolean arg6) {
        if (arg0 == 3) {
            ++field1756;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lya;II)Z", line = 219)
    private final boolean method882(class38 arg0, int arg1, int arg2) {
        ++field1757;
        int var4 = arg1;
        class376 var5 = this.method948(false);
        class189 var6 = super.field1959 != -1 && ~super.field1907 == -1 ? class242.field3846.method2238(super.field1959, (byte) 78) : null;
        class189 var7 = super.field1925 == -1 || super.field1926 && var6 != null ? null : class242.field3846.method2238(super.field1925, (byte) 78);
        int var8 = var5.field5654;
        int var9 = var5.field5632;
        if (var8 != 0 || var9 != 0 || ~var5.field5677 != -1 || var5.field5674 != 0) {
            arg1 |= 7;
        }
        boolean var10 = ~super.field1927 != arg2 && class475.field6854 >= super.field1954 && ~class475.field6854 > ~super.field1928;
        if (var10) {
            arg1 |= 524288;
        }
        class475 var11 = super.field1980[0] = this.field1763.method260(super.field1939, super.field1964, var7, arg1, super.field1921, super.field1903, class242.field3846, 80, arg0, super.field1899, var6, super.field1966, super.field1920, class195.field3271, class138.field2094);
        if (var11 == null) {
            return false;
        } else {
            super.field1890 = var11.method427();
            this.method957(0, var11);
            int var12 = super.field1949.method889(16383);
            if (~var8 == -1 && ~var9 == -1) {
                this.method954(var12, this.method953(-89) << 7, this.method953(-80) << 7, 0, 0, (byte) 108);
            } else {
                this.method954(var12, var8, var9, var5.field5660, var5.field5644, (byte) -114);
                if (super.field1969 != 0) {
                    super.field1980[0].method441(super.field1969);
                }
                if (super.field1935 != 0) {
                    super.field1980[0].method420(super.field1935);
                }
                if (~super.field1945 != -1) {
                    super.field1980[0].method450(0, super.field1945, 0);
                }
            }
            if (var10) {
                var11.method434(super.field1902, super.field1944, super.field1970, super.field1927 & 255);
            }
            if (super.field1904 != -1 && ~super.field1950 != 0) {
                class316 var13 = class123.field1839.method1490(super.field1904, true);
                boolean var14 = ~var13.field4754 == -4 && (var8 != 0 || ~var9 != -1);
                int var15 = var4;
                if (!var14) {
                    if (~super.field1887 != -1) {
                        var15 = var4 | 5;
                    }
                    if (~super.field1971 != -1) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class475 var16 = super.field1980[1] = var13.method2025(super.field1950, super.field1895, true, super.field1961, var15, arg0, class242.field3846);
                if (var16 != null) {
                    if (super.field1971 != 0) {
                        var16.method450(0, -super.field1971 << 0, 0);
                    }
                    if (~super.field1887 != -1) {
                        var16.method438(super.field1887 * 2048);
                    }
                    if (var14) {
                        if (super.field1969 != 0) {
                            var16.method441(super.field1969);
                        }
                        if (~super.field1935 != -1) {
                            var16.method420(super.field1935);
                        }
                        if (super.field1945 != 0) {
                            var16.method450(0, super.field1945, 0);
                        }
                    }
                }
            } else {
                super.field1980[1] = null;
            }
            if (~super.field1962 != 0 && ~super.field1967 != 0) {
                class316 var17 = class123.field1839.method1490(super.field1962, true);
                boolean var18 = var17.field4754 == 3 && (~var8 != -1 || var9 != 0);
                int var19 = var4;
                if (!var18) {
                    if (~super.field1900 != -1) {
                        var19 = var4 | 5;
                    }
                    if (~super.field1892 != -1) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class475 var20 = super.field1980[3] = var17.method2020(super.field1896, var19, class242.field3846, super.field1967, arg0, super.field1946, 8192);
                if (var20 != null) {
                    if (super.field1892 != 0) {
                        var20.method450(0, -super.field1892 << 0, 0);
                    }
                    if (~super.field1900 != -1) {
                        var20.method438(super.field1900 * 2048);
                    }
                    if (var18) {
                        if (super.field1969 != 0) {
                            var20.method441(super.field1969);
                        }
                        if (super.field1935 != 0) {
                            var20.method420(super.field1935);
                        }
                        if (super.field1945 != 0) {
                            var20.method450(0, super.field1945, 0);
                        }
                    }
                }
            } else {
                super.field1980[3] = null;
            }
            super.field1980[2] = null;
            if (super.field1986 != null) {
                if (super.field1986.field5769 <= class475.field6854) {
                    super.field1986 = null;
                } else if (~super.field1986.field5755 >= ~class475.field6854) {
                    class475 var21 = super.field1986.method2395((byte) 43, arg0, 7 | var4);
                    if (var21 != null) {
                        var21.method450(-super.field5837 + super.field1986.field5764, super.field1986.field5758 - super.field5831, -super.field5833 + super.field1986.field5765);
                        if (var12 != 0) {
                            var21.method438(var12);
                        }
                        super.field1980[2] = var21;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "(B)I", line = 408)
    public final int method883(byte arg0) {
        ++field1764;
        if (arg0 <= 116) {
            this.field1765 = -49;
        }
        if (this.field1763.field499 != null) {
            class37 var2 = this.field1763.method256(126, class195.field3271);
            if (var2 != null && var2.field457 != -1) {
                return var2.field457;
            }
        }
        return ~this.field1763.field457 != 0 ? this.field1763.field457 : super.method883((byte) 121);
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(I)I", line = 429)
    public final int method884(int arg0) {
        ++field1768;
        if (this.field1763.field499 != null) {
            class37 var2 = this.field1763.method256(126, class195.field3271);
            if (var2 != null && var2.field486 != -1) {
                return var2.field486;
            }
        }
        if (arg0 < 43) {
            this.method27((byte) -90, (class38) null, -65, 0);
        }
        return this.field1763.field486;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)V", line = 454)
    public final void method21(boolean arg0) {
        if (arg0) {
            method879(-105);
        }
        ++field1749;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)I", line = 469)
    public final int method885(byte arg0) {
        ++field1758;
        if (this.field1763.field499 != null) {
            class37 var2 = this.field1763.method256(127, class195.field3271);
            if (var2 != null && var2.field496 != -1) {
                return var2.field496;
            }
        }
        if (arg0 != -79) {
            this.method881((byte) -103);
        }
        return this.field1763.field496;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lya;I)Lag;", line = 493)
    public final class484 method29(class38 arg0, int arg1) {
        ++field1753;
        if (this.field1763 != null && this.method882(arg0, 2048, -1)) {
            if (arg1 < 22) {
                this.method883((byte) 14);
            }
            class125 var3 = arg0.method296();
            int var4 = super.field1949.method889(16383);
            var3.method216(var4);
            var3.method207(super.field5837, super.field5831, super.field5833);
            class376 var5 = this.method948(false);
            class37 var6 = this.field1763.field499 == null ? this.field1763 : this.field1763.method256(126, class195.field3271);
            if (class193.field3258.field7241 && var6.field445 && var5.field5647) {
                class189 var7 = super.field1959 != -1 && super.field1907 == 0 ? class242.field3846.method2238(super.field1959, (byte) 78) : null;
                class189 var8 = super.field1925 == -1 || super.field1926 && var7 != null ? null : class242.field3846.method2238(super.field1925, (byte) 78);
                class475 var9 = class111.method849(this.field1763.field494, super.field1945, super.field1953, 255 & this.field1763.field462, this.field1763.field438 & 255, super.field1969, var8 != null ? var8 : var7, arg0, var8 == null ? super.field1939 : super.field1921, var4, super.field1935, super.field1980[0], 65535 & this.field1763.field452, true, 65535 & this.field1763.field454);
                if (var9 != null) {
                    float var10 = arg0.method335();
                    float var11 = arg0.method275();
                    arg0.method282(false);
                    arg0.method365(var10, var11 - 150.0F);
                    var9.method439(var3, (class83) null, 0);
                    arg0.method365(var10, var11);
                    arg0.method282(true);
                }
            }
            class484 var12 = null;
            if (this.method878((byte) -98)) {
                var12 = class133.method971(super.field1980.length, 0);
            }
            if (super.field1979 == null) {
                arg0.method273(super.field1980, var3, var12 != null ? var12.field6964 : null, 0);
            } else {
                class341 var13 = super.field1979.method2221();
                arg0.method279(super.field1980, var13, var3, var12 != null ? var12.field6964 : null, 0);
            }
            this.method951(super.field1980, false, 29817, arg0);
            if (super.field1980[2] != null) {
                if (~var4 != -1) {
                    super.field1980[2].method438(var4);
                }
                super.field1980[2].method450(super.field5837 - super.field1986.field5764, -super.field1986.field5758 + super.field5831, -super.field1986.field5765 + super.field5833);
            }
            super.field1980[0] = super.field1980[1] = super.field1980[2] = super.field1980[3] = null;
            super.field1932 = class448.field6562;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)V", line = 570)
    public final void method886(int arg0, int arg1, int arg2) {
        ++field1751;
        int var4 = super.field1978[0];
        int var5 = super.field1976[0];
        if (arg0 == 0) {
            ++var5;
        }
        if (arg0 == 1) {
            ++var4;
            ++var5;
        }
        if (~arg0 == -3) {
            ++var4;
        }
        if (~arg0 == -4) {
            ++var4;
            --var5;
        }
        if (~arg0 == -5) {
            --var5;
        }
        if (~arg0 == -6) {
            --var5;
            --var4;
        }
        if (~arg0 == -7) {
            --var4;
        }
        if (~arg0 == -8) {
            ++var5;
            --var4;
        }
        if (~super.field1959 != 0 && class242.field3846.method2238(super.field1959, (byte) 78).field3176 == 1) {
            super.field1959 = -1;
        }
        if (super.field1904 != -1) {
            class316 var6 = class123.field1839.method1490(super.field1904, true);
            if (var6.field4771 && var6.field4775 != -1 && class242.field3846.method2238(var6.field4775, (byte) 78).field3176 == 1) {
                super.field1904 = -1;
            }
        }
        if (super.field1962 != -1) {
            class316 var7 = class123.field1839.method1490(super.field1962, true);
            if (var7.field4771 && var7.field4775 != -1 && ~class242.field3846.method2238(var7.field4775, (byte) 78).field3176 == -2) {
                super.field1962 = -1;
            }
        }
        if (~super.field1981 > -10) {
            ++super.field1981;
        }
        if (arg2 < 88) {
            field1761 = null;
        }
        for (int var8 = super.field1981; var8 > 0; --var8) {
            super.field1978[var8] = super.field1978[var8 - 1];
            super.field1976[var8] = super.field1976[var8 + -1];
            super.field1984[var8] = super.field1984[var8 + -1];
        }
        super.field1978[0] = var4;
        super.field1976[0] = var5;
        super.field1984[0] = (byte) arg1;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BLya;II)Z", line = 664)
    public final boolean method27(byte arg0, class38 arg1, int arg2, int arg3) {
        ++field1767;
        if (this.field1763 != null && this.method882(arg1, 131072, -1)) {
            if (arg0 >= -119) {
                return false;
            } else {
                class125 var5 = arg1.method296();
                int var6 = super.field1949.method889(16383);
                var5.method216(var6);
                var5.method207(super.field5837, super.field5831, super.field5833);
                boolean var7 = false;
                for (int var8 = 0; ~var8 > ~super.field1980.length; ++var8) {
                    if (super.field1980[var8] != null && super.field1980[var8].method440(arg3, arg2, var5, ~this.field1763.field494 == -2)) {
                        var7 = true;
                        break;
                    }
                }
                super.field1980[0] = super.field1980[1] = super.field1980[2] = super.field1980[3] = null;
                return var7;
            }
        } else {
            return false;
        }
    }
}
