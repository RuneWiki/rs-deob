import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class461 extends class121 {

    @OriginalMember(owner = "client!rs", name = "vc", descriptor = "I")
    public int field6770 = -1;

    @OriginalMember(owner = "client!rs", name = "Cc", descriptor = "I")
    public int field6777 = -1;

    @OriginalMember(owner = "client!rs", name = "zc", descriptor = "Lsl;")
    public static class318 field6774 = new class318(58, 6);

    @OriginalMember(owner = "client!rs", name = "wc", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!rs", name = "xc", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!rs", name = "yc", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!rs", name = "Ac", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!rs", name = "Bc", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!rs", name = "Dc", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!rs", name = "Ec", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!rs", name = "Fc", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!rs", name = "Gc", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!rs", name = "Hc", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!rs", name = "Ic", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!rs", name = "Jc", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!rs", name = "Kc", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!rs", name = "Lc", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!rs", name = "Mc", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!rs", name = "Nc", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!rs", name = "Oc", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!rs", name = "Pc", descriptor = "Lwh;")
    public class100 field6790;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "(I)V", line = 4)
    public static final void method2764(int arg0) {
        class85.method757(-62);
        ++field6780;
        if (arg0 != 0) {
            field6774 = null;
        }
        class240.field3541 = null;
        class435.field6370 = null;
        class162.field2294 = null;
        class326.field4576 = null;
        class53.field580 = null;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)I", line = 27)
    public final int method961(byte arg0) {
        if (arg0 <= 100) {
            this.method968((byte) -5);
        }
        ++field6771;
        if (this.field6790.field1364 != null) {
            class100 var2 = this.field6790.method848(false, class253.field3739);
            if (var2 != null && var2.field1414 != -1) {
                return var2.field1414;
            }
        }
        return this.field6790.field1414;
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(B)Z", line = 53)
    public final boolean method32(byte arg0) {
        if (arg0 < 104) {
            return false;
        } else {
            ++field6783;
            return false;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IILfi;BZLya;I)V", line = 66)
    public final void method25(int arg0, int arg1, class388 arg2, byte arg3, boolean arg4, class38 arg5, int arg6) {
        if (arg3 != -99) {
            this.field6790 = null;
        }
        ++field6782;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIZI)V", line = 77)
    public final void method2765(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field6789;
        super.field6328 = (byte) arg0;
        if (super.field1696 != -1 && ~class153.field2169.method1585(3, super.field1696).field3936 == -2) {
            super.field1696 = -1;
        }
        if (~super.field1707 != 0) {
            class330 var7 = class151.field2145.method2115(-137, super.field1707);
            if (var7.field4606 && ~var7.field4611 != 0 && class153.field2169.method1585(3, var7.field4611).field3936 == 1) {
                super.field1707 = -1;
            }
        }
        if (super.field1728 != -1) {
            class330 var8 = class151.field2145.method2115(-137, super.field1728);
            if (var8.field4606 && var8.field4611 != -1 && class153.field2169.method1585(arg1 ^ -20440, var8.field4611).field3936 == 1) {
                super.field1728 = -1;
            }
        }
        if (!arg4) {
            int var9 = -super.field1777[0] + arg2;
            int var10 = -super.field1778[0] + arg5;
            if (~var9 <= 7 && ~var9 >= -9 && ~var10 <= 7 && ~var10 >= -9) {
                if (~super.field1779 > -10) {
                    ++super.field1779;
                }
                for (int var11 = super.field1779; var11 > 0; --var11) {
                    super.field1777[var11] = super.field1777[var11 + -1];
                    super.field1778[var11] = super.field1778[var11 + -1];
                    super.field1782[var11] = super.field1782[var11 + -1];
                }
                super.field1777[0] = arg2;
                super.field1778[0] = arg5;
                super.field1782[0] = 1;
                return;
            }
        }
        super.field1777[0] = arg2;
        super.field1779 = 0;
        super.field1775 = 0;
        super.field1783 = 0;
        super.field1778[0] = arg5;
        if (arg1 != -20437) {
            field6774 = null;
        }
        super.field6334 = (super.field1778[0] << 7) + (arg3 << 6);
        super.field6335 = (super.field1777[0] << 7) + (arg3 << 6);
        if (super.field1776 != null) {
            super.field1776.method1324();
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)I", line = 152)
    public final int method967(int arg0) {
        ++field6773;
        if (arg0 != 0) {
            return 12;
        } else {
            if (this.field6790.field1364 != null) {
                class100 var2 = this.field6790.method848(false, class253.field3739);
                if (var2 != null && ~var2.field1398 != 0) {
                    return var2.field1398;
                }
            }
            return ~this.field6790.field1398 == 0 ? super.method967(0) : this.field6790.field1398;
        }
    }

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "(I)V", line = 173)
    public static void method2766(int arg0) {
        if (arg0 != 0) {
            field6774 = null;
        }
        field6774 = null;
    }

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "(I)I", line = 190)
    public final int method890(int arg0) {
        ++field6779;
        return arg0 != -25430 ? -37 : super.field1708;
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)V", line = 201)
    public final void method29(int arg0) {
        ++field6776;
        int var2 = -64 / ((arg0 - 57) / 44);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(Lya;I)Lfk;", line = 212)
    public final class462 method38(class38 arg0, int arg1) {
        ++field6785;
        if (this.field6790 != null && this.method2769(-77, arg0, 2048)) {
            if (arg1 > -87) {
                return null;
            } else {
                class122 var3 = arg0.method362();
                int var4 = super.field1718.method1994(-118);
                var3.method253(var4);
                var3.method251(super.field6335, super.field6327, super.field6334);
                class531 var5 = this.method969(-1);
                class100 var6 = this.field6790.field1364 == null ? this.field6790 : this.field6790.method848(false, class253.field3739);
                if (class478.field7044.field3348 && var6.field1406 && var5.field7797) {
                    class267 var7 = ~super.field1696 != 0 && super.field1729 == 0 ? class153.field2169.method1585(3, super.field1696) : null;
                    class267 var8 = super.field1763 == -1 || super.field1743 && var7 != null ? null : class153.field2169.method1585(3, super.field1763);
                    class471 var9 = class164.method1161(super.field1723, super.field1755, super.field1781[0], 65535 & this.field6790.field1409, super.field1721, this.field6790.field1385 & 65535, arg0, this.field6790.field1373 & 255, 109, this.field6790.field1344, var4, var8 != null ? super.field1690 : super.field1745, super.field1689, var8 != null ? var8 : var7, 255 & this.field6790.field1380);
                    if (var9 != null) {
                        float var10 = arg0.method395();
                        float var11 = arg0.method361();
                        arg0.method390(false);
                        arg0.method319(var10, var11 + -150.0F);
                        var9.method457(var3, (class341) null, 0);
                        arg0.method319(var10, var11);
                        arg0.method390(true);
                    }
                }
                class462 var12 = null;
                if (this.method2770(-1)) {
                    var12 = class482.method2908(super.field1781.length, (byte) -95);
                }
                if (super.field1776 == null) {
                    arg0.method388(super.field1781, var3, var12 == null ? null : var12.field6800, 0);
                } else {
                    class88 var13 = super.field1776.method1331();
                    arg0.method376(super.field1781, var13, var3, var12 == null ? null : var12.field6800, 0);
                }
                this.method953(false, super.field1781, 0, arg0);
                if (super.field1781[2] != null) {
                    if (~var4 != -1) {
                        super.field1781[2].method451(var4);
                    }
                    super.field1781[2].method446(-super.field1780.field2269 + super.field6335, -super.field1780.field2258 + super.field6327, super.field6334 - super.field1780.field2275);
                }
                super.field1746 = class50.field551;
                super.field1781[0] = super.field1781[1] = super.field1781[2] = super.field1781[3] = null;
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "(I)Z", line = 290)
    public final boolean method2767(int arg0) {
        if (arg0 <= 10) {
            this.method2771((byte) 87, (class100) null);
        }
        ++field6788;
        return this.field6790 != null;
    }

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "(B)I", line = 305)
    public final int method968(byte arg0) {
        ++field6772;
        if (arg0 != 18) {
            method2766(44);
        }
        if (this.field6790.field1364 != null) {
            class100 var2 = this.field6790.method848(false, class253.field3739);
            if (var2 != null && var2.field1355 != -1) {
                return var2.field1355;
            }
        }
        return this.field6790.field1355;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IILya;I)Z", line = 328)
    public final boolean method34(int arg0, int arg1, class38 arg2, int arg3) {
        ++field6786;
        if (this.field6790 != null && this.method2769(-91, arg2, 131072)) {
            class122 var5 = arg2.method362();
            int var6 = super.field1718.method1994(-96);
            var5.method253(var6);
            var5.method251(super.field6335, super.field6327, super.field6334);
            boolean var7 = false;
            for (int var8 = 0; var8 < super.field1781.length; ++var8) {
                if (super.field1781[var8] != null && super.field1781[var8].method443(arg3, arg0, var5, this.field6790.field1344 == 1)) {
                    var7 = true;
                    break;
                }
            }
            super.field1781[arg1] = super.field1781[1] = super.field1781[2] = super.field1781[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(III)V", line = 362)
    public final void method2768(int arg0, int arg1, int arg2) {
        ++field6778;
        int var4 = -77 % ((-93 - arg0) / 33);
        int var5 = super.field1777[0];
        int var6 = super.field1778[0];
        if (arg1 == 0) {
            ++var6;
        }
        if (arg1 == 1) {
            ++var5;
            ++var6;
        }
        if (~arg1 == -3) {
            ++var5;
        }
        if (~arg1 == -4) {
            --var6;
            ++var5;
        }
        if (arg1 == 4) {
            --var6;
        }
        if (arg1 == 5) {
            --var6;
            --var5;
        }
        if (~arg1 == -7) {
            --var5;
        }
        if (super.field1696 != -1 && ~class153.field2169.method1585(3, super.field1696).field3936 == -2) {
            super.field1696 = -1;
        }
        if (arg1 == 7) {
            --var5;
            ++var6;
        }
        if (super.field1707 != -1) {
            class330 var7 = class151.field2145.method2115(-137, super.field1707);
            if (var7.field4606 && var7.field4611 != -1 && ~class153.field2169.method1585(3, var7.field4611).field3936 == -2) {
                super.field1707 = -1;
            }
        }
        if (~super.field1728 != 0) {
            class330 var8 = class151.field2145.method2115(-137, super.field1728);
            if (var8.field4606 && var8.field4611 != -1 && ~class153.field2169.method1585(3, var8.field4611).field3936 == -2) {
                super.field1728 = -1;
            }
        }
        if (super.field1779 < 9) {
            ++super.field1779;
        }
        for (int var9 = super.field1779; var9 > 0; --var9) {
            super.field1777[var9] = super.field1777[var9 + -1];
            super.field1778[var9] = super.field1778[var9 + -1];
            super.field1782[var9] = super.field1782[var9 - 1];
        }
        super.field1777[0] = var5;
        super.field1778[0] = var6;
        super.field1782[0] = (byte) arg2;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(Lya;I)V", line = 457)
    public final void method35(class38 arg0, int arg1) {
        if (arg1 <= 53) {
            this.field6790 = null;
        }
        ++field6787;
        if (this.field6790 != null) {
            if (super.field1785 || this.method2769(-98, arg0, 0)) {
                this.method953(super.field1785, super.field1781, 0, arg0);
                super.field1781[0] = super.field1781[1] = super.field1781[2] = super.field1781[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILya;I)Z", line = 482)
    private final boolean method2769(int arg0, class38 arg1, int arg2) {
        ++field6781;
        int var4 = arg2;
        class531 var5 = this.method969(-1);
        class267 var6 = super.field1696 != -1 && super.field1729 == 0 ? class153.field2169.method1585(3, super.field1696) : null;
        class267 var7 = super.field1763 == -1 || super.field1743 && var6 != null ? null : class153.field2169.method1585(3, super.field1763);
        int var8 = var5.field7777;
        int var9 = var5.field7786;
        if (~var8 != -1 || ~var9 != -1 || ~var5.field7790 != -1 || var5.field7775 != 0) {
            arg2 |= 7;
        }
        boolean var10 = ~super.field1695 != -1 && ~class263.field3867 <= ~super.field1694 && ~class263.field3867 > ~super.field1753;
        if (var10) {
            arg2 |= 524288;
        }
        class471 var11 = super.field1781[0] = this.field6790.method849(super.field1750, -77, var6, class253.field3739, super.field1742, arg2, super.field1758, super.field1690, arg1, super.field1745, super.field1715, super.field1760, var7, class153.field2169, class284.field4134);
        if (var11 == null) {
            return false;
        } else {
            super.field1708 = var11.method463();
            this.method959((byte) -17, var11);
            int var12 = super.field1718.method1994(-119);
            if (~var8 == -1 && ~var9 == -1) {
                this.method964(this.method963((byte) 127) << 7, 0, 0, var12, this.method963((byte) 127) << 7, -54);
            } else {
                this.method964(var8, var5.field7787, var5.field7814, var12, var9, -60);
                if (super.field1755 != 0) {
                    super.field1781[0].method447(super.field1755);
                }
                if (~super.field1723 != -1) {
                    super.field1781[0].method455(super.field1723);
                }
                if (super.field1721 != 0) {
                    super.field1781[0].method446(0, super.field1721, 0);
                }
            }
            if (var10) {
                var11.method434(super.field1761, super.field1706, super.field1725, 255 & super.field1695);
            }
            if (arg0 >= -72) {
                return true;
            } else {
                if (~super.field1707 != 0 && ~super.field1703 != 0) {
                    class330 var13 = class151.field2145.method2115(-137, super.field1707);
                    boolean var14 = var13.field4595 == 3 && (~var8 != -1 || var9 != 0);
                    int var15 = var4;
                    if (var14) {
                        var15 = var4 | 7;
                    } else {
                        if (super.field1691 != 0) {
                            var15 = var4 | 5;
                        }
                        if (super.field1687 != 0) {
                            var15 |= 2;
                        }
                    }
                    class471 var16 = super.field1781[1] = var13.method2023(super.field1703, super.field1712, class153.field2169, (byte) -114, super.field1770, var15, arg1);
                    if (var16 != null) {
                        if (~super.field1687 != -1) {
                            var16.method446(0, -super.field1687 << 0, 0);
                        }
                        if (super.field1691 != 0) {
                            var16.method451(super.field1691 * 2048);
                        }
                        if (var14) {
                            if (~super.field1755 != -1) {
                                var16.method447(super.field1755);
                            }
                            if (super.field1723 != 0) {
                                var16.method455(super.field1723);
                            }
                            if (~super.field1721 != -1) {
                                var16.method446(0, super.field1721, 0);
                            }
                        }
                    }
                } else {
                    super.field1781[1] = null;
                }
                if (super.field1728 != -1 && ~super.field1697 != 0) {
                    class330 var17 = class151.field2145.method2115(-137, super.field1728);
                    boolean var18 = ~var17.field4595 == -4 && (var8 != 0 || ~var9 != -1);
                    int var19 = var4;
                    if (!var18) {
                        if (~super.field1739 != -1) {
                            var19 = var4 | 5;
                        }
                        if (~super.field1736 != -1) {
                            var19 |= 2;
                        }
                    } else {
                        var19 = var4 | 7;
                    }
                    class471 var20 = super.field1781[3] = var17.method2030(arg1, (byte) -53, super.field1747, class153.field2169, super.field1697, var19, super.field1754);
                    if (var20 != null) {
                        if (~super.field1736 != -1) {
                            var20.method446(0, -super.field1736 << 0, 0);
                        }
                        if (~super.field1739 != -1) {
                            var20.method451(super.field1739 * 2048);
                        }
                        if (var18) {
                            if (~super.field1755 != -1) {
                                var20.method447(super.field1755);
                            }
                            if (super.field1723 != 0) {
                                var20.method455(super.field1723);
                            }
                            if (~super.field1721 != -1) {
                                var20.method446(0, super.field1721, 0);
                            }
                        }
                    }
                } else {
                    super.field1781[3] = null;
                }
                super.field1781[2] = null;
                if (super.field1780 != null) {
                    if (super.field1780.field2274 <= class263.field3867) {
                        super.field1780 = null;
                    } else if (~super.field1780.field2262 >= ~class263.field3867) {
                        class471 var21 = super.field1780.method1134(1, arg1, var4 | 7);
                        if (var21 != null) {
                            var21.method446(-super.field6335 + super.field1780.field2269, -super.field6327 + super.field1780.field2258, -super.field6334 + super.field1780.field2275);
                            if (~var12 != -1) {
                                var21.method451(var12);
                            }
                            super.field1781[2] = var21;
                        }
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "(I)Z", line = 680)
    private final boolean method2770(int arg0) {
        ++field6775;
        if (arg0 != -1) {
            this.field6790 = null;
        }
        return this.field6790.field1366;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLwh;)V", line = 699)
    public final void method2771(byte arg0, class100 arg1) {
        ++field6784;
        this.field6790 = arg1;
        if (super.field1776 != null) {
            super.field1776.method1324();
        }
        if (arg0 > -114) {
            this.method2765(25, -50, 104, -108, true, -102);
        }
    }
}
