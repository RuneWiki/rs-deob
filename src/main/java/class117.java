import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class117 extends class455 {

    @OriginalMember(owner = "client!sq", name = "Rc", descriptor = "I")
    public int field1671 = -1;

    @OriginalMember(owner = "client!sq", name = "Ec", descriptor = "I")
    public int field1658 = -1;

    @OriginalMember(owner = "client!sq", name = "Nc", descriptor = "Lff;")
    public static class9 field1667 = new class9(28, -1);

    @OriginalMember(owner = "client!sq", name = "Wc", descriptor = "Lub;")
    public static class18 field1676 = new class18(16);

    @OriginalMember(owner = "client!sq", name = "Yc", descriptor = "Lvj;")
    public static class304 field1678 = new class304("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!sq", name = "Cc", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!sq", name = "Dc", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!sq", name = "Fc", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!sq", name = "Gc", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!sq", name = "Ic", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!sq", name = "Jc", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!sq", name = "Kc", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!sq", name = "Lc", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!sq", name = "Mc", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!sq", name = "Oc", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!sq", name = "Pc", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!sq", name = "Qc", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!sq", name = "Sc", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!sq", name = "Tc", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!sq", name = "Uc", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!sq", name = "Vc", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!sq", name = "Hc", descriptor = "Lrl;")
    public class506 field1661;

    @OriginalMember(owner = "client!sq", name = "Xc", descriptor = "[[[B")
    public static byte[][][] field1677;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)I", line = 3)
    public final int method799(int arg0) {
        ++field1669;
        if (arg0 != -1) {
            this.field1658 = -22;
        }
        if (this.field1661.field6971 != null) {
            class506 var2 = this.field1661.method2885(98, class301.field3980);
            if (var2 != null && var2.field7013 != -1) {
                return var2.field7013;
            }
        }
        return ~this.field1661.field7013 == 0 ? super.method799(-1) : this.field1661.field7013;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZIIII)V", line = 24)
    public final void method800(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1674;
        super.field573 = (byte) arg5;
        if (~super.field6185 != 0 && class423.field5791.method1601(super.field6185, (byte) -113).field144 == 1) {
            super.field6185 = -1;
        }
        if (super.field6163 != -1) {
            class155 var7 = class441.field6049.method725(14896, super.field6163);
            if (var7.field2264 && var7.field2271 != -1 && ~class423.field5791.method1601(var7.field2271, (byte) -118).field144 == -2) {
                super.field6163 = -1;
            }
        }
        if (super.field6238 != -1) {
            class155 var8 = class441.field6049.method725(14896, super.field6238);
            if (var8.field2264 && ~var8.field2271 != 0 && ~class423.field5791.method1601(var8.field2271, (byte) -118).field144 == -2) {
                super.field6238 = -1;
            }
        }
        if (!arg1) {
            int var9 = -super.field6261[0] + arg4;
            int var10 = arg2 - super.field6266[0];
            if (var9 >= -8 && var9 <= 8 && var10 >= -8 && var10 <= 8) {
                if (super.field6257 < 9) {
                    ++super.field6257;
                }
                for (int var11 = super.field6257; var11 > 0; --var11) {
                    super.field6261[var11] = super.field6261[var11 - 1];
                    super.field6266[var11] = super.field6266[var11 + -1];
                    super.field6265[var11] = super.field6265[var11 - 1];
                }
                super.field6261[0] = arg4;
                super.field6265[0] = 1;
                super.field6266[0] = arg2;
                return;
            }
        }
        super.field6259 = 0;
        super.field6257 = 0;
        super.field6261[0] = arg4;
        super.field6263 = 0;
        super.field6266[0] = arg2;
        super.field584 = (super.field6261[arg0] << 7) - -(arg3 << 6);
        super.field574 = (super.field6266[0] << 7) + (arg3 << 6);
        if (super.field6262 != null) {
            super.field6262.method3104();
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lqa;Z)V", line = 100)
    public final void method334(class162 arg0, boolean arg1) {
        ++field1656;
        if (this.field1661 != null) {
            if (super.field6264 || this.method805((byte) -108, arg0, 0)) {
                if (!arg1) {
                    this.field1661 = null;
                }
                this.method2597(arg0, super.field6264, super.field6260, -22526);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)I", line = 123)
    public final int method285(byte arg0) {
        if (arg0 <= 113) {
            this.field1661 = null;
        }
        ++field1665;
        return super.field6207;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)Z", line = 134)
    public final boolean method126(byte arg0) {
        ++field1662;
        return arg0 != 54;
    }

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "(B)Z", line = 145)
    public final boolean method801(byte arg0) {
        ++field1659;
        if (arg0 != -78) {
            field1677 = null;
        }
        return this.field1661 != null;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(ILqa;)Lfm;", line = 161)
    public final class514 method339(int arg0, class162 arg1) {
        ++field1663;
        if (this.field1661 != null && this.method805((byte) 16, arg1, 2048)) {
            class414 var3 = arg1.method611();
            int var4 = super.field6233.method1692(true);
            var3.method959(var4);
            if (arg0 != 9124) {
                this.method807((byte) 9);
            }
            var3.method970(super.field584, super.field568, super.field574);
            class20 var5 = this.method2600(71);
            class506 var6 = this.field1661.field6971 == null ? this.field1661 : this.field1661.method2885(-17, class301.field3980);
            if (class154.field2244.field7766 && var6.field7007 && var5.field358) {
                class5 var7 = ~super.field6185 != 0 && ~super.field6248 == -1 ? class423.field5791.method1601(super.field6185, (byte) -126) : null;
                class5 var8 = ~super.field6172 == 0 || super.field6217 && var7 != null ? null : class423.field5791.method1601(super.field6172, (byte) -125);
                class121 var9 = class374.method2171(var8 == null ? super.field6204 : super.field6166, super.field6211, super.field6250, var8 == null ? var7 : var8, this.field1661.field6974 & 65535, arg1, 255 & this.field1661.field6997, this.field1661.field6956, super.field6260[0], this.field1661.field6978 & 65535, this.field1661.field7018 & 255, var4, 1232627105, super.field6203, super.field6212);
                if (var9 != null) {
                    float var10 = arg1.method524();
                    float var11 = arg1.method584();
                    arg1.method525(false);
                    arg1.method568(var10, var11 + -150.0F);
                    var9.method853(var3, (class357) null, 0);
                    arg1.method568(var10, var11);
                    arg1.method525(true);
                }
            }
            class514 var12 = null;
            if (this.method806((byte) -104)) {
                var12 = class148.method1020(0, super.field6260.length);
            }
            if (super.field6262 != null) {
                class411 var13 = super.field6262.method3100();
                arg1.method545(super.field6260, var13, var3, var12 == null ? null : var12.field7563, 0);
            } else {
                arg1.method537(super.field6260, var3, var12 != null ? var12.field7563 : null, 0);
            }
            this.method2597(arg1, false, super.field6260, -22526);
            if (super.field6260[2] != null) {
                if (~var4 != -1) {
                    super.field6260[2].method838(var4);
                }
                super.field6260[2].method879(-super.field6258.field6742 + super.field584, super.field568 - super.field6258.field6749, -super.field6258.field6748 + super.field574);
            }
            super.field6190 = class33.field531;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "(I)V", line = 239)
    public static void method802(int arg0) {
        field1678 = null;
        field1667 = null;
        field1676 = null;
        field1677 = null;
        int var1 = -60 % ((71 - arg0) / 33);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V", line = 252)
    public final void method125(boolean arg0) {
        ++field1675;
        if (!arg0) {
            field1677 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lrl;B)V", line = 266)
    public final void method803(class506 arg0, byte arg1) {
        this.field1661 = arg0;
        if (arg1 >= 114) {
            ++field1657;
            if (super.field6262 != null) {
                super.field6262.method3104();
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)I", line = 291)
    public final int method804(boolean arg0) {
        if (arg0) {
            this.method803((class506) null, (byte) -54);
        }
        ++field1670;
        if (this.field1661.field6971 != null) {
            class506 var2 = this.field1661.method2885(-68, class301.field3980);
            if (var2 != null && var2.field7012 != -1) {
                return var2.field7012;
            }
        }
        return this.field1661.field7012;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BLqa;I)Z", line = 315)
    private final boolean method805(byte arg0, class162 arg1, int arg2) {
        ++field1673;
        int var4 = arg2;
        class20 var5 = this.method2600(97);
        class5 var6 = ~super.field6185 != 0 && super.field6248 == 0 ? class423.field5791.method1601(super.field6185, (byte) -114) : null;
        class5 var7 = super.field6172 == -1 || super.field6217 && var6 != null ? null : class423.field5791.method1601(super.field6172, (byte) -116);
        int var8 = var5.field335;
        int var9 = var5.field354;
        if (~var8 != -1 || var9 != 0 || ~var5.field341 != -1 || ~var5.field363 != -1) {
            arg2 |= 7;
        }
        boolean var10 = super.field6193 != 0 && class31.field516 >= super.field6220 && ~class31.field516 > ~super.field6184;
        if (var10) {
            arg2 |= 524288;
        }
        class121 var11 = super.field6260[0] = this.field1661.method2887(super.field6237, super.field6204, super.field6251, 122, var7, class423.field5791, super.field6166, super.field6226, class291.field3825, var6, super.field6175, arg1, super.field6219, class301.field3980, arg2);
        if (var11 == null) {
            return false;
        } else {
            super.field6207 = var11.method861();
            this.method2594(25556, var11);
            int var12 = super.field6233.method1692(true);
            if (var8 == 0 && ~var9 == -1) {
                this.method2592(this.method2590(0) << 7, 0, this.method2590(0) << 7, (byte) -19, 0, var12);
            } else {
                this.method2592(var8, var5.field348, var9, (byte) 118, var5.field343, var12);
                if (~super.field6250 != -1) {
                    super.field6260[0].method868(super.field6250);
                }
                if (super.field6203 != 0) {
                    super.field6260[0].method869(super.field6203);
                }
                if (super.field6211 != 0) {
                    super.field6260[0].method879(0, super.field6211, 0);
                }
            }
            if (var10) {
                var11.method883(super.field6162, super.field6178, super.field6196, super.field6193 & 255);
            }
            if (~super.field6163 != 0 && super.field6246 != -1) {
                class155 var13 = class441.field6049.method725(14896, super.field6163);
                boolean var14 = ~var13.field2270 == -4 && (~var8 != -1 || ~var9 != -1);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (super.field6218 != 0) {
                        var15 = var4 | 5;
                    }
                    if (super.field6183 != 0) {
                        var15 |= 2;
                    }
                }
                class121 var16 = super.field6260[1] = var13.method1070(arg1, super.field6252, -1, var15, super.field6201, class423.field5791, super.field6246);
                if (var16 != null) {
                    if (super.field6183 != 0) {
                        var16.method879(0, -super.field6183 << 0, 0);
                    }
                    if (super.field6218 != 0) {
                        var16.method838(super.field6218 * 2048);
                    }
                    if (var14) {
                        if (~super.field6250 != -1) {
                            var16.method868(super.field6250);
                        }
                        if (~super.field6203 != -1) {
                            var16.method869(super.field6203);
                        }
                        if (super.field6211 != 0) {
                            var16.method879(0, super.field6211, 0);
                        }
                    }
                }
            } else {
                super.field6260[1] = null;
            }
            int var17 = -2 % ((-58 - arg0) / 32);
            if (super.field6238 != -1 && super.field6173 != -1) {
                class155 var18 = class441.field6049.method725(14896, super.field6238);
                boolean var19 = ~var18.field2270 == -4 && (var8 != 0 || var9 != 0);
                int var20 = var4;
                if (!var19) {
                    if (super.field6197 != 0) {
                        var20 = var4 | 5;
                    }
                    if (~super.field6188 != -1) {
                        var20 |= 2;
                    }
                } else {
                    var20 = var4 | 7;
                }
                class121 var21 = super.field6260[3] = var18.method1063(arg1, var20, -122, super.field6173, super.field6224, class423.field5791, super.field6194);
                if (var21 != null) {
                    if (super.field6188 != 0) {
                        var21.method879(0, -super.field6188 << 0, 0);
                    }
                    if (~super.field6197 != -1) {
                        var21.method838(super.field6197 * 2048);
                    }
                    if (var19) {
                        if (~super.field6250 != -1) {
                            var21.method868(super.field6250);
                        }
                        if (~super.field6203 != -1) {
                            var21.method869(super.field6203);
                        }
                        if (~super.field6211 != -1) {
                            var21.method879(0, super.field6211, 0);
                        }
                    }
                }
            } else {
                super.field6260[3] = null;
            }
            super.field6260[2] = null;
            if (super.field6258 != null) {
                if (~super.field6258.field6755 < ~class31.field516) {
                    if (class31.field516 >= super.field6258.field6747) {
                        class121 var22 = super.field6258.method2790(-53, arg1, 7 | var4);
                        if (var22 != null) {
                            var22.method879(-super.field584 + super.field6258.field6742, -super.field568 + super.field6258.field6749, -super.field574 + super.field6258.field6748);
                            if (var12 != 0) {
                                var22.method838(var12);
                            }
                            super.field6260[2] = var22;
                        }
                    }
                } else {
                    super.field6258 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "(B)Z", line = 508)
    private final boolean method806(byte arg0) {
        if (arg0 > -49) {
            this.method334((class162) null, false);
        }
        ++field1666;
        return this.field1661.field6991;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)I", line = 519)
    public final int method807(byte arg0) {
        ++field1672;
        if (this.field1661.field6971 != null) {
            class506 var2 = this.field1661.method2885(-105, class301.field3980);
            if (var2 != null && ~var2.field7006 != 0) {
                return var2.field7006;
            }
        }
        return arg0 != 24 ? 120 : this.field1661.field7006;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILqa;I)Z", line = 544)
    public final boolean method343(int arg0, int arg1, class162 arg2, int arg3) {
        ++field1660;
        if (arg0 != -1) {
            return true;
        } else if (this.field1661 != null && this.method805((byte) 87, arg2, 131072)) {
            class414 var5 = arg2.method611();
            int var6 = super.field6233.method1692(true);
            var5.method959(var6);
            var5.method970(super.field584, super.field568, super.field574);
            for (int var7 = 0; ~super.field6260.length < ~var7; ++var7) {
                if (super.field6260[var7] != null && super.field6260[var7].method847(arg3, arg1, var5, this.field1661.field6956 == 1)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIZ)V", line = 576)
    public final void method808(int arg0, int arg1, boolean arg2) {
        ++field1668;
        int var4 = super.field6261[0];
        int var5 = super.field6266[0];
        if (~arg0 == -1) {
            ++var5;
        }
        if (~arg0 == -2) {
            ++var4;
            ++var5;
        }
        if (arg0 == 2) {
            ++var4;
        }
        if (~arg0 == -4) {
            ++var4;
            --var5;
        }
        if (~arg0 == -5) {
            --var5;
        }
        if (arg0 == 5) {
            --var5;
            --var4;
        }
        if (~arg0 == -7) {
            --var4;
        }
        if (arg0 == 7) {
            ++var5;
            --var4;
        }
        if (super.field6185 != -1 && ~class423.field5791.method1601(super.field6185, (byte) -115).field144 == -2) {
            super.field6185 = -1;
        }
        if (super.field6163 != -1) {
            class155 var6 = class441.field6049.method725(14896, super.field6163);
            if (var6.field2264 && ~var6.field2271 != 0 && class423.field5791.method1601(var6.field2271, (byte) -121).field144 == 1) {
                super.field6163 = -1;
            }
        }
        if (~super.field6238 != 0) {
            class155 var7 = class441.field6049.method725(14896, super.field6238);
            if (var7.field2264 && ~var7.field2271 != 0 && class423.field5791.method1601(var7.field2271, (byte) -128).field144 == 1) {
                super.field6238 = -1;
            }
        }
        if (~super.field6257 > -10) {
            ++super.field6257;
        }
        for (int var8 = super.field6257; ~var8 < -1; --var8) {
            super.field6261[var8] = super.field6261[var8 - 1];
            super.field6266[var8] = super.field6266[var8 + -1];
            super.field6265[var8] = super.field6265[var8 - 1];
        }
        if (!arg2) {
            this.method800(23, true, 24, -17, -124, -76);
        }
        super.field6261[0] = var4;
        super.field6265[0] = (byte) arg1;
        super.field6266[0] = var5;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILqa;Leq;IIZ)V", line = 670)
    public final void method127(int arg0, int arg1, class162 arg2, class140 arg3, int arg4, int arg5, boolean arg6) {
        ++field1664;
        if (arg0 != 1) {
            this.method285((byte) 105);
        }
        throw new IllegalStateException();
    }
}
