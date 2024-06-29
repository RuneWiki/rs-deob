import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class127 extends class362 {

    @OriginalMember(owner = "client!qo", name = "Pc", descriptor = "Lik;")
    public static class410 field1786 = new class410(128);

    @OriginalMember(owner = "client!qo", name = "Yc", descriptor = "[I")
    public static int[] field1795 = new int[200];

    @OriginalMember(owner = "client!qo", name = "Zc", descriptor = "Ljava/lang/String;")
    public static String field1796 = "Ok";

    @OriginalMember(owner = "client!qo", name = "ad", descriptor = "Ljava/lang/String;")
    public static String field1797 = "Members object";

    @OriginalMember(owner = "client!qo", name = "bd", descriptor = "Lik;")
    public static class410 field1798 = new class410(4);

    @OriginalMember(owner = "client!qo", name = "cd", descriptor = "Lv;")
    public static class243 field1799 = new class243();

    @OriginalMember(owner = "client!qo", name = "fd", descriptor = "I")
    public static int field1802 = 0;

    @OriginalMember(owner = "client!qo", name = "ed", descriptor = "Z")
    public static boolean field1801 = false;

    @OriginalMember(owner = "client!qo", name = "Dc", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!qo", name = "Ec", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!qo", name = "Fc", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!qo", name = "Gc", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!qo", name = "Hc", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!qo", name = "Ic", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!qo", name = "Jc", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!qo", name = "Kc", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!qo", name = "Lc", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!qo", name = "Mc", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!qo", name = "Oc", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!qo", name = "Qc", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!qo", name = "Rc", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!qo", name = "Sc", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!qo", name = "Tc", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!qo", name = "Uc", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!qo", name = "Vc", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!qo", name = "Wc", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!qo", name = "Xc", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!qo", name = "Nc", descriptor = "Lqr;")
    public class15 field1784;

    @OriginalMember(owner = "client!qo", name = "dd", descriptor = "Lrk;")
    public static class427 field1800;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)I")
    public final int method989(int arg0) {
        if (arg0 != 4) {
            return -123;
        } else {
            ++field1793;
            if (this.field1784.field177 != null) {
                class15 var2 = this.field1784.method78(0);
                if (var2 != null && var2.field142 != -1) {
                    return var2.field142;
                }
            }
            return this.field1784.field142;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILpe;I)Z")
    public final boolean method583(int arg0, int arg1, class391 arg2, int arg3) {
        ++field1792;
        if (this.field1784 != null && this.method992(65536, arg2, true)) {
            class156 var5 = arg2.method226();
            int var6 = super.field4977.method2041(arg3 ^ -71497);
            var5.method312(var6);
            var5.method308(super.field3176, super.field3168, super.field3167);
            if (arg3 != 65536) {
                field1791 = 33;
            }
            for (int var7 = 0; var7 < super.field5014.length; ++var7) {
                if (super.field5014[var7] != null) {
                    return super.field5014[var7].method455(arg1, arg0, var5, ~this.field1784.field133 == -2);
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "(I)Z")
    public final boolean method990(int arg0) {
        ++field1777;
        if (this.field1784 == null) {
            return false;
        } else {
            int var2 = 28 % ((-54 - arg0) / 59);
            return true;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZILhh;Lpe;III)V")
    public final void method532(boolean arg0, int arg1, class184 arg2, class391 arg3, int arg4, int arg5, int arg6) {
        int var8 = 58 / ((76 - arg1) / 38);
        ++field1780;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "(B)V")
    public static final void method991(byte arg0) {
        ++field1776;
        if (class391.field5485 >= 0) {
            long var1 = class108.method902((byte) -93);
            class391.field5485 = (int) ((long) class391.field5485 - (var1 - class448.field6495));
            if (class391.field5485 > 0) {
                int var3 = (class391.field5485 << 8) / class149.field2291;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class183.field2657 = (-16711936 & (16711935 & class95.field1385) * var3 + (class448.field6489.field1622 & 16711935) * var4) - -(16711680 & (65280 & class95.field1385) * var3 - -((class448.field6489.field1622 & 65280) * var4)) >>> 8;
                float var6 = -var5 + 1.0F;
                class394.field5520 = (-class442.field6365 + class448.field6489.field1632) * var6 + class442.field6365;
                class445.field6403 = (-class227.field3158 + class448.field6489.field1628) * var6 + class227.field3158;
                class239.field3301 = (-class7.field68 + class448.field6489.field1631) * var6 + class7.field68;
                class132.field1895 = ((class185.field2684 & 16711935) * var3 - -((16711935 & class448.field6489.field1625) * var4) & -16711936) + ((65280 & class185.field2684) * var3 - -((65280 & class448.field6489.field1625) * var4) & 16711680) >>> 8;
                class37.field567 = class447.field6478 * var3 - -(class448.field6489.field1630 * var4) >> 8;
                class41.field629 = (class448.field6489.field1633 - class437.field6248) * var6 + class437.field6248;
                class440.field6325 = (class448.field6489.field1629 - class23.field418) * var6 + class23.field418;
                class341.field4657 = (-class73.field1099 + class448.field6489.field1626) * var6 + class73.field1099;
                if (class39.field592 != class448.field6489.field1619) {
                    class367.field5043 = class387.field5450.method229(class39.field592, class448.field6489.field1619, var6, class367.field5043);
                }
            } else {
                class41.field629 = class448.field6489.field1633;
                class394.field5520 = class448.field6489.field1632;
                class183.field2657 = class448.field6489.field1622;
                class367.field5043 = class448.field6489.field1619;
                class445.field6403 = class448.field6489.field1628;
                class239.field3301 = class448.field6489.field1631;
                class132.field1895 = class448.field6489.field1625;
                class391.field5485 = -1;
                class37.field567 = class448.field6489.field1630;
                class341.field4657 = class448.field6489.field1626;
                class440.field6325 = class448.field6489.field1629;
            }
            class448.field6495 = var1;
        }
        if (arg0 != 52) {
            field1800 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILpe;Z)Z")
    private final boolean method992(int arg0, class391 arg1, boolean arg2) {
        ++field1794;
        int var4 = arg0;
        class434 var5 = this.method2280(104);
        class209 var6 = ~super.field4980 != 0 && ~super.field4934 == -1 ? class288.method1819(super.field4980, (byte) 105) : null;
        class209 var7 = super.field4941 == -1 || super.field4982 && var6 != null ? null : class288.method1819(super.field4941, (byte) 105);
        int var8 = var5.field6197;
        int var9 = var5.field6166;
        if (~var8 != -1 || ~var9 != -1 || ~var5.field6191 != -1 || var5.field6152 != 0) {
            arg0 |= 7;
        }
        class73 var10 = super.field5014[0] = this.field1784.method85(super.field4979, super.field4919, arg0, 25031, super.field4993, super.field4925, var6, super.field4959, arg1, super.field4985, var7, super.field4990);
        if (var10 == null) {
            return false;
        } else {
            super.field4949 = var10.method420();
            if (!arg2) {
                field1795 = null;
            }
            this.method2275(var10, (byte) 127);
            int var11 = super.field4977.method2041(-5961);
            super.field4983 = 0;
            super.field4991 = 0;
            super.field4970 = 0;
            if (var8 == 0 && var9 == 0) {
                this.method2283(this.method2146(-118) << 7, this.method2146(-123) << 7, -91, var11);
            } else {
                this.method2283(var8, var9, -101, var11);
                if (super.field4991 != 0) {
                    super.field5014[0].method467(super.field4991);
                }
                if (super.field4983 != 0) {
                    super.field5014[0].method442(super.field4983);
                }
                if (~super.field4970 != -1) {
                    super.field5014[0].method460(0, super.field4970, 0);
                }
            }
            super.field5014[1] = null;
            if (super.field4974 != -1 && super.field4965 != -1) {
                class282 var12 = class71.method613(super.field4974, (byte) -119);
                class73 var13 = var12.method1780(true, super.field4965, super.field4978, arg1, super.field4971, var4 | (!var12.field3770 ? 2 : 7));
                if (var13 != null) {
                    var13.method460(0, -super.field4931, 0);
                    if (var12.field3770 && (var8 != 0 || var9 != 0)) {
                        if (~super.field4991 != -1) {
                            var13.method467(super.field4991);
                        }
                        if (super.field4983 != 0) {
                            var13.method442(super.field4983);
                        }
                        if (super.field4970 != 0) {
                            var13.method460(0, super.field4970, 0);
                        }
                    }
                    super.field5014[1] = var13;
                }
            }
            super.field5014[2] = null;
            if (super.field4997 != null) {
                if (class414.field5793 >= super.field5002) {
                    super.field4997 = null;
                }
                if (~class414.field5793 <= ~super.field5003 && super.field5002 > class414.field5793) {
                    class73 var14 = super.field4997.method576(arg1, var4 | 7, -2705);
                    if (var14 != null) {
                        var14.method460(-super.field3176 + super.field5016, -super.field3168 + super.field5000, -super.field3167 + super.field5013);
                        if (~var11 != -1) {
                            var14.method439(var11);
                        }
                        super.field5014[2] = var14;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lqr;I)V")
    public final void method993(class15 arg0, int arg1) {
        if (arg1 == 128) {
            this.field1784 = arg0;
            ++field1775;
            if (super.field5004 != null) {
                super.field5004.method490();
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "(I)I")
    public final int method579(int arg0) {
        ++field1790;
        if (arg0 != 0) {
            field1795 = null;
        }
        return super.field4949;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILpe;)V")
    public final void method581(int arg0, class391 arg1) {
        ++field1778;
        if (this.field1784 != null) {
            if (super.field5010 || this.method992(0, arg1, true)) {
                this.method2273(arg0 ^ arg0, super.field5014, arg1, super.field5010);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(IIII)Z")
    public static final boolean method994(int arg0, int arg1, int arg2, int arg3) {
        if (!class176.method1318(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class10.method51(var4 + 1, class91.field1351[arg0].method1509(arg1, arg2) + arg3, var5 + 1) && class10.method51(var4 + 128 - 1, class91.field1351[arg0].method1509(arg1 + 1, arg2) + arg3, var5 + 1) && class10.method51(var4 + 128 - 1, class91.field1351[arg0].method1509(arg1 + 1, arg2 + 1) + arg3, var5 + 128 - 1) && class10.method51(var4 + 1, class91.field1351[arg0].method1509(arg1, arg2 + 1) + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)Z")
    public final boolean method537(int arg0) {
        if (arg0 > -48) {
            this.method537(-83);
        }
        ++field1774;
        return false;
    }

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "(B)Z")
    private final boolean method995(byte arg0) {
        if (arg0 != -24) {
            return true;
        } else {
            ++field1783;
            return this.field1784.field151;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lpe;B)Lca;")
    public final class415 method572(class391 arg0, byte arg1) {
        ++field1781;
        if (this.field1784 != null && this.method992(1024, arg0, true)) {
            class156 var3 = arg0.method226();
            int var4 = super.field4977.method2041(-5961);
            var3.method312(var4);
            if (arg1 >= -45) {
                field1802 = 64;
            }
            var3.method319(super.field3176, super.field3168, super.field3167);
            class434 var5 = this.method2280(48);
            class15 var6 = this.field1784.field177 != null ? this.field1784.method78(0) : this.field1784;
            if (class61.field952 && var6.field140 && var5.field6187) {
                class209 var7 = ~super.field4980 != 0 && ~super.field4934 == -1 ? class288.method1819(super.field4980, (byte) 105) : null;
                class209 var8 = super.field4941 == -1 || super.field4982 && var7 != null ? null : class288.method1819(super.field4941, (byte) 105);
                class73 var9 = class228.method1534(this.field1784.field161 & 65535, arg0, this.field1784.field133, 65535 & this.field1784.field127, super.field4983, super.field4970, super.field5014[0], var8 != null ? var8 : var7, this.field1784.field131 & 255, super.field4929, 255 & this.field1784.field174, -116, var4, var8 == null ? super.field4959 : super.field4919, super.field4991);
                if (var9 != null) {
                    float var10 = arg0.method114();
                    float var11 = arg0.method208();
                    arg0.method152(false);
                    arg0.method108(var10, var11 + -150.0F);
                    var9.method478(var3, (class197) null, 0);
                    arg0.method108(var10, var11);
                    arg0.method152(true);
                }
            }
            class415 var12 = null;
            if (this.method995((byte) -24)) {
                var12 = class340.method2159(24579, super.field5014.length);
            }
            if (super.field5004 == null) {
                arg0.method245(super.field5014, var3, var12 != null ? var12.field5799 : null, 0);
            } else {
                class374 var13 = super.field5004.method489();
                arg0.method212(super.field5014, var13, var3, var12 != null ? var12.field5799 : null, 0);
            }
            this.method2273(0, super.field5014, arg0, false);
            if (super.field5014[2] != null) {
                if (var4 != 0) {
                    super.field5014[2].method439(var4);
                }
                super.field5014[2].method460(-super.field5016 + super.field3176, -super.field5000 + super.field3168, -super.field5013 + super.field3167);
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "(I)V")
    public static final void method996(int arg0) {
        int var1 = -119 % ((41 - arg0) / 53);
        ++field1785;
        if (class365.field5037 != null) {
            class365.field5037.method1552(-96);
        }
        if (class76.field1136 != null) {
            class76.field1136.method1552(-96);
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(Z)V")
    public static void method997(boolean arg0) {
        field1797 = null;
        field1799 = null;
        field1795 = null;
        field1800 = null;
        field1798 = null;
        if (!arg0) {
            method997(false);
        }
        field1786 = null;
        field1796 = null;
    }

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "(I)V")
    public static final void method998(int arg0) {
        class263.field3531.method2533(0);
        int var1 = 127 % ((arg0 - -23) / 43);
        ++field1788;
    }

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "(I)I")
    public final int method999(int arg0) {
        ++field1782;
        if (this.field1784.field177 != null) {
            class15 var2 = this.field1784.method78(0);
            if (var2 != null && ~var2.field117 != 0) {
                return var2.field117;
            }
        }
        if (arg0 < 45) {
            method991((byte) -21);
        }
        return this.field1784.field117;
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(B)V")
    public final void method535(byte arg0) {
        if (arg0 > 110) {
            ++field1787;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)I")
    public final int method1000(byte arg0) {
        ++field1779;
        if (arg0 > -38) {
            field1802 = -53;
        }
        if (this.field1784.field177 != null) {
            class15 var2 = this.field1784.method78(0);
            if (var2 != null && var2.field171 != -1) {
                return var2.field171;
            }
        }
        return this.field1784.field171 != -1 ? this.field1784.field171 : super.method1000((byte) -75);
    }
}
