import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class295 extends class395 {

    @OriginalMember(owner = "client!qt", name = "Wc", descriptor = "I")
    public int field3835 = -1;

    @OriginalMember(owner = "client!qt", name = "Qc", descriptor = "I")
    public int field3829 = -1;

    @OriginalMember(owner = "client!qt", name = "Zc", descriptor = "I")
    public static int field3838 = 0;

    @OriginalMember(owner = "client!qt", name = "Gc", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!qt", name = "Hc", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!qt", name = "Ic", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!qt", name = "Jc", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!qt", name = "Kc", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!qt", name = "Lc", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!qt", name = "Mc", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!qt", name = "Nc", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!qt", name = "Oc", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!qt", name = "Pc", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!qt", name = "Rc", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!qt", name = "Tc", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!qt", name = "Uc", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!qt", name = "Vc", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!qt", name = "Xc", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!qt", name = "Yc", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!qt", name = "ad", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!qt", name = "Sc", descriptor = "Lde;")
    public class10 field3831;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIZI)V", line = 10)
    public final void method1769(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        super.field6220 = (byte) arg3;
        ++field3823;
        if (~super.field5191 != 0 && ~class403.field5429.method1962(super.field5191, false).field649 == -2) {
            super.field5191 = -1;
        }
        if (~super.field5204 != 0) {
            class76 var7 = class472.field6897.method1495((byte) 62, super.field5204);
            if (var7.field964 && ~var7.field969 != 0 && class403.field5429.method1962(var7.field969, false).field649 == 1) {
                super.field5204 = -1;
            }
        }
        if (super.field5172 != -1) {
            class76 var8 = class472.field6897.method1495((byte) 62, super.field5172);
            if (var8.field964 && ~var8.field969 != 0 && class403.field5429.method1962(var8.field969, false).field649 == 1) {
                super.field5172 = -1;
            }
        }
        if (!arg4) {
            int var9 = -super.field5246[0] + arg1;
            int var10 = -super.field5251[0] + arg2;
            if (var9 >= -8 && var9 <= 8 && ~var10 <= 7 && ~var10 >= -9) {
                if (~super.field5244 > -10) {
                    ++super.field5244;
                }
                for (int var11 = super.field5244; ~var11 < -1; --var11) {
                    super.field5246[var11] = super.field5246[var11 + -1];
                    super.field5251[var11] = super.field5251[var11 + -1];
                    super.field5248[var11] = super.field5248[var11 - 1];
                }
                super.field5246[0] = arg1;
                super.field5251[0] = arg2;
                super.field5248[0] = 1;
                return;
            }
        }
        super.field5246[0] = arg1;
        super.field5244 = 0;
        super.field5252 = 0;
        super.field5245 = arg5;
        super.field5251[0] = arg2;
        super.field6241 = (super.field5251[0] << 7) + (arg0 << 6);
        super.field6239 = (super.field5246[0] << 7) + (arg0 << 6);
        if (super.field5249 != null) {
            super.field5249.method1968();
        }
    }

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "(B)I", line = 85)
    public final int method1770(byte arg0) {
        ++field3826;
        if (this.field3831.field111 != null) {
            class10 var2 = this.field3831.method63(false, class198.field2555);
            if (var2 != null && var2.field129 != -1) {
                return var2.field129;
            }
        }
        int var3 = 64 / ((-2 - arg0) / 40);
        return ~this.field3831.field129 != 0 ? this.field3831.field129 : super.method1770((byte) -61);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BLrn;ZIILqa;I)V", line = 105)
    public final void method174(byte arg0, class242 arg1, boolean arg2, int arg3, int arg4, class129 arg5, int arg6) {
        ++field3827;
        if (arg0 != 91) {
            this.method172((class129) null, (byte) -14);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BLqa;)V", line = 117)
    public final void method175(byte arg0, class129 arg1) {
        ++field3833;
        if (this.field3831 != null) {
            if (arg0 != 91) {
                this.field3829 = -127;
            }
            if (super.field5243 || this.method1778(0, arg1, (byte) 80)) {
                this.method2350(super.field5243, arg1, super.field5242, (byte) -104);
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)I", line = 142)
    public final int method1771(int arg0) {
        ++field3837;
        if (this.field3831.field111 != null) {
            class10 var2 = this.field3831.method63(false, class198.field2555);
            if (var2 != null && ~var2.field145 != 0) {
                return var2.field145;
            }
        }
        int var3 = 3 % ((-26 - arg0) / 42);
        return this.field3831.field145;
    }

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "(I)Z", line = 163)
    public final boolean method1772(int arg0) {
        if (arg0 != -6181) {
            return true;
        } else {
            ++field3819;
            return this.field3831 != null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B[B)[B", line = 178)
    public static final byte[] method1773(byte arg0, byte[] arg1) {
        ++field3828;
        class88 var2 = new class88(arg1);
        int var3 = var2.method617(2);
        if (arg0 != -1) {
            method1773((byte) 96, (byte[]) null);
        }
        int var4 = var2.method578(120);
        if (var4 >= 0 && (~class524.field7769 == -1 || class524.field7769 >= var4)) {
            if (var3 == 0) {
                byte[] var7 = new byte[var4];
                var2.method596(30576, 0, var7, var4);
                return var7;
            } else {
                int var5 = var2.method578(arg0 ^ -99);
                if (~var5 <= -1 && (~class524.field7769 == -1 || ~class524.field7769 <= ~var5)) {
                    byte[] var6 = new byte[var5];
                    if (~var3 != -2) {
                        class338.field4325.method1473(var6, var2, true);
                    } else {
                        class253.method1580(var6, var5, arg1, var4, 9);
                    }
                    return var6;
                } else {
                    throw new RuntimeException();
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "(I)I", line = 232)
    public final int method180(int arg0) {
        ++field3834;
        int var2 = 34 / (-arg0 / 33);
        return super.field5168;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)V", line = 247)
    public final void method1774(int arg0, int arg1, int arg2) {
        ++field3825;
        int var4 = super.field5246[0];
        int var5 = super.field5251[0];
        if (~arg0 == -1) {
            ++var5;
        }
        if (arg0 == 1) {
            ++var5;
            ++var4;
        }
        if (arg0 == 2) {
            ++var4;
        }
        if (~arg0 == -4) {
            ++var4;
            --var5;
        }
        if (arg0 == 4) {
            --var5;
        }
        if (arg0 == 5) {
            --var5;
            --var4;
        }
        if (arg0 == 6) {
            --var4;
        }
        if (~arg0 == -8) {
            ++var5;
            --var4;
        }
        if (~super.field5191 != 0 && ~class403.field5429.method1962(super.field5191, false).field649 == -2) {
            super.field5191 = -1;
        }
        int var6 = -81 % ((arg2 - 55) / 32);
        if (super.field5204 != -1) {
            class76 var7 = class472.field6897.method1495((byte) 62, super.field5204);
            if (var7.field964 && var7.field969 != -1 && ~class403.field5429.method1962(var7.field969, false).field649 == -2) {
                super.field5204 = -1;
            }
        }
        if (super.field5172 != -1) {
            class76 var8 = class472.field6897.method1495((byte) 62, super.field5172);
            if (var8.field964 && ~var8.field969 != 0 && class403.field5429.method1962(var8.field969, false).field649 == 1) {
                super.field5172 = -1;
            }
        }
        if (~super.field5244 > -10) {
            ++super.field5244;
        }
        for (int var9 = super.field5244; ~var9 < -1; --var9) {
            super.field5246[var9] = super.field5246[var9 - 1];
            super.field5251[var9] = super.field5251[var9 - 1];
            super.field5248[var9] = super.field5248[var9 - 1];
        }
        super.field5246[0] = var4;
        super.field5251[0] = var5;
        super.field5248[0] = (byte) arg1;
    }

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "(B)Z", line = 342)
    private final boolean method1775(byte arg0) {
        if (arg0 <= 56) {
            this.field3835 = -67;
        }
        ++field3832;
        return this.field3831.field99;
    }

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "(I)Z", line = 355)
    public final boolean method177(int arg0) {
        ++field3820;
        return arg0 != 5 ? false : false;
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(Lqa;B)Lvs;", line = 368)
    public final class465 method172(class129 arg0, byte arg1) {
        ++field3821;
        if (this.field3831 != null && this.method1778(2048, arg0, (byte) 105)) {
            int var3 = 50 % ((48 - arg1) / 60);
            class142 var4 = arg0.method847();
            int var5 = super.field5209.method336(false);
            var4.method986(var5);
            var4.method993(super.field6239, super.field6224, super.field6241);
            class371 var6 = this.method2347((byte) -121);
            class10 var7 = this.field3831.field111 == null ? this.field3831 : this.field3831.method63(false, class198.field2555);
            if (class421.field5647.field7719 && var7.field149 && var6.field4788) {
                class44 var8 = super.field5191 != -1 && super.field5177 == 0 ? class403.field5429.method1962(super.field5191, false) : null;
                class44 var9 = ~super.field5174 == 0 || super.field5196 && var8 != null ? null : class403.field5429.method1962(super.field5174, false);
                class507 var10 = class393.method2335(arg0, (byte) -38, this.field3831.field128, super.field5147, super.field5242[0], this.field3831.field159 & 255, 255 & this.field3831.field113, super.field5149, super.field5222, this.field3831.field171 & 65535, this.field3831.field142 & 65535, var9 == null ? super.field5176 : super.field5148, var9 == null ? var8 : var9, var5, super.field5217);
                if (var10 != null) {
                    float var11 = arg0.method863();
                    float var12 = arg0.method828();
                    arg0.method825(false);
                    arg0.method913(var11, var12 + -150.0F);
                    var10.method520(var4, (class530) null, 0);
                    arg0.method913(var11, var12);
                    arg0.method825(true);
                }
            }
            class465 var13 = null;
            if (this.method1775((byte) 80)) {
                var13 = class92.method635(super.field5242.length, -16461);
            }
            if (super.field5249 != null) {
                class287 var14 = super.field5249.method1969();
                arg0.method868(super.field5242, var14, var4, var13 == null ? null : var13.field6843, 0);
            } else {
                arg0.method873(super.field5242, var4, var13 != null ? var13.field6843 : null, 0);
            }
            this.method2350(false, arg0, super.field5242, (byte) -77);
            if (super.field5242[2] != null) {
                if (~var5 != -1) {
                    super.field5242[2].method522(var5);
                }
                super.field5242[2].method537(-super.field5250.field4511 + super.field6239, super.field6224 - super.field5250.field4510, -super.field5250.field4520 + super.field6241);
            }
            super.field5188 = class398.field5291;
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IZILqa;)Z", line = 447)
    public final boolean method179(int arg0, boolean arg1, int arg2, class129 arg3) {
        ++field3822;
        if (this.field3831 != null && this.method1778(131072, arg3, (byte) -29)) {
            class142 var5 = arg3.method847();
            int var6 = super.field5209.method336(arg1);
            var5.method986(var6);
            var5.method993(super.field6239, super.field6224, super.field6241);
            for (int var7 = 0; ~var7 > ~super.field5242.length; ++var7) {
                if (super.field5242[var7] != null && super.field5242[var7].method499(arg0, arg2, var5, this.field3831.field128 == 1)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V", line = 477)
    public final void method173(byte arg0) {
        ++field3824;
        if (arg0 == -32) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lde;B)V", line = 491)
    public final void method1776(class10 arg0, byte arg1) {
        this.field3831 = arg0;
        ++field3836;
        if (arg1 > 17) {
            if (super.field5249 != null) {
                super.field5249.method1968();
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "(I)I", line = 506)
    public final int method1777(int arg0) {
        ++field3830;
        int var2 = 123 % ((-63 - arg0) / 40);
        if (this.field3831.field111 != null) {
            class10 var3 = this.field3831.method63(false, class198.field2555);
            if (var3 != null && var3.field108 != -1) {
                return var3.field108;
            }
        }
        return this.field3831.field108;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILqa;B)Z", line = 530)
    private final boolean method1778(int arg0, class129 arg1, byte arg2) {
        ++field3839;
        int var4 = arg0;
        class371 var5 = this.method2347((byte) -121);
        class44 var6 = super.field5191 != -1 && ~super.field5177 == -1 ? class403.field5429.method1962(super.field5191, false) : null;
        class44 var7 = super.field5174 == -1 || super.field5196 && var6 != null ? null : class403.field5429.method1962(super.field5174, false);
        int var8 = var5.field4818;
        int var9 = var5.field4798;
        if (var8 != 0 || var9 != 0 || var5.field4819 != 0 || var5.field4821 != 0) {
            arg0 |= 7;
        }
        boolean var10 = ~super.field5226 != -1 && ~class264.field3353 <= ~super.field5219 && class264.field3353 < super.field5203;
        if (var10) {
            arg0 |= 524288;
        }
        class507 var11 = super.field5242[0] = this.field3831.method74(super.field5176, super.field5181, super.field5148, var6, super.field5221, class198.field2555, class403.field5429, super.field5183, arg0, arg1, -1, var7, super.field5233, class331.field4255, super.field5180);
        if (var11 == null) {
            return false;
        } else {
            super.field5168 = var11.method507();
            this.method2349(false, var11);
            int var12 = -65 % ((arg2 - 18) / 42);
            int var13 = super.field5209.method336(false);
            if (var8 == 0 && var9 == 0) {
                this.method2346(this.method2342(10804) << 7, false, this.method2342(10804) << 7, var13, 0, 0);
            } else {
                this.method2346(var8, false, var9, var13, var5.field4801, var5.field4797);
                if (super.field5217 != 0) {
                    super.field5242[0].method535(super.field5217);
                }
                if (~super.field5149 != -1) {
                    super.field5242[0].method506(super.field5149);
                }
                if (super.field5222 != 0) {
                    super.field5242[0].method537(0, super.field5222, 0);
                }
            }
            if (var10) {
                var11.method485(super.field5182, super.field5235, super.field5215, super.field5226 & 255);
            }
            if (super.field5204 != -1 && ~super.field5167 != 0) {
                class76 var14 = class472.field6897.method1495((byte) 62, super.field5204);
                boolean var15 = var14.field974 == 3 && (~var8 != -1 || var9 != 0);
                int var16 = var4;
                if (!var15) {
                    if (~super.field5190 != -1) {
                        var16 = var4 | 5;
                    }
                    if (~super.field5156 != -1) {
                        var16 |= 2;
                    }
                } else {
                    var16 = var4 | 7;
                }
                class507 var17 = super.field5242[1] = var14.method441(super.field5194, var16, arg1, super.field5167, class403.field5429, (byte) -98, super.field5163);
                if (var17 != null) {
                    if (~super.field5156 != -1) {
                        var17.method537(0, -super.field5156 << 0, 0);
                    }
                    if (super.field5190 != 0) {
                        var17.method522(super.field5190 * 2048);
                    }
                    if (var15) {
                        if (super.field5217 != 0) {
                            var17.method535(super.field5217);
                        }
                        if (super.field5149 != 0) {
                            var17.method506(super.field5149);
                        }
                        if (~super.field5222 != -1) {
                            var17.method537(0, super.field5222, 0);
                        }
                    }
                }
            } else {
                super.field5242[1] = null;
            }
            if (~super.field5172 != 0 && ~super.field5206 != 0) {
                class76 var18 = class472.field6897.method1495((byte) 62, super.field5172);
                boolean var19 = ~var18.field974 == -4 && (var8 != 0 || var9 != 0);
                int var20 = var4;
                if (!var19) {
                    if (super.field5237 != 0) {
                        var20 = var4 | 5;
                    }
                    if (~super.field5216 != -1) {
                        var20 |= 2;
                    }
                } else {
                    var20 = var4 | 7;
                }
                class507 var21 = super.field5242[3] = var18.method436(super.field5238, super.field5186, super.field5206, class403.field5429, var20, arg1, false);
                if (var21 != null) {
                    if (~super.field5216 != -1) {
                        var21.method537(0, -super.field5216 << 0, 0);
                    }
                    if (~super.field5237 != -1) {
                        var21.method522(super.field5237 * 2048);
                    }
                    if (var19) {
                        if (~super.field5217 != -1) {
                            var21.method535(super.field5217);
                        }
                        if (~super.field5149 != -1) {
                            var21.method506(super.field5149);
                        }
                        if (~super.field5222 != -1) {
                            var21.method537(0, super.field5222, 0);
                        }
                    }
                }
            } else {
                super.field5242[3] = null;
            }
            super.field5242[2] = null;
            if (super.field5250 != null) {
                if (class264.field3353 < super.field5250.field4507) {
                    if (class264.field3353 >= super.field5250.field4524) {
                        class507 var22 = super.field5250.method2071(7 | var4, arg1, (byte) -124);
                        if (var22 != null) {
                            var22.method537(-super.field6239 + super.field5250.field4511, -super.field6224 + super.field5250.field4510, -super.field6241 + super.field5250.field4520);
                            if (~var13 != -1) {
                                var22.method522(var13);
                            }
                            super.field5242[2] = var22;
                        }
                    }
                } else {
                    super.field5250 = null;
                }
            }
            return true;
        }
    }
}
