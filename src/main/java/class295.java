import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class295 extends class375 {

    @OriginalMember(owner = "client!wg", name = "Dc", descriptor = "I")
    public int field3772 = -1;

    @OriginalMember(owner = "client!wg", name = "Pc", descriptor = "I")
    public int field3784 = -1;

    @OriginalMember(owner = "client!wg", name = "Lc", descriptor = "Z")
    public static boolean field3780 = false;

    @OriginalMember(owner = "client!wg", name = "Hc", descriptor = "[F")
    public static float[] field3776 = new float[16384];

    @OriginalMember(owner = "client!wg", name = "Ac", descriptor = "[F")
    public static float[] field3769 = new float[16384];

    @OriginalMember(owner = "client!wg", name = "Wc", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!wg", name = "Bc", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!wg", name = "Cc", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!wg", name = "Fc", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!wg", name = "Gc", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!wg", name = "Ic", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!wg", name = "Jc", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!wg", name = "Kc", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!wg", name = "Mc", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!wg", name = "Nc", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!wg", name = "Oc", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!wg", name = "Qc", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!wg", name = "Rc", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!wg", name = "Sc", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!wg", name = "Tc", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!wg", name = "Uc", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!wg", name = "Vc", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!wg", name = "Ec", descriptor = "Lfb;")
    public class477 field3773;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(IZIIII)V")
    public final void method1728(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field2676 = (byte) arg3;
        ++field3775;
        if (~super.field4859 != 0 && ~class404.field5756.method557(super.field4859, 15).field5925 == -2) {
            super.field4859 = -1;
        }
        if (super.field4886 != arg0) {
            class466 var7 = class120.field1624.method1836(arg0 + 121, super.field4886);
            if (var7.field6722 && ~var7.field6746 != 0 && ~class404.field5756.method557(var7.field6746, arg0 ^ -16).field5925 == -2) {
                super.field4886 = -1;
            }
        }
        if (super.field4906 != -1) {
            class466 var8 = class120.field1624.method1836(121, super.field4906);
            if (var8.field6722 && var8.field6746 != -1 && ~class404.field5756.method557(var8.field6746, arg0 ^ -16).field5925 == -2) {
                super.field4906 = -1;
            }
        }
        if (!arg1) {
            int var9 = -super.field4944[0] + arg5;
            int var10 = -super.field4936[0] + arg4;
            if (var9 >= -8 && ~var9 >= -9 && ~var10 <= 7 && ~var10 >= -9) {
                if (super.field4941 < 9) {
                    ++super.field4941;
                }
                for (int var11 = super.field4941; var11 > 0; --var11) {
                    super.field4944[var11] = super.field4944[var11 + -1];
                    super.field4936[var11] = super.field4936[var11 + -1];
                    super.field4940[var11] = super.field4940[var11 + -1];
                }
                super.field4944[0] = arg5;
                super.field4940[0] = 1;
                super.field4936[0] = arg4;
                return;
            }
        }
        super.field4938 = 0;
        super.field4941 = 0;
        super.field4943 = 0;
        super.field4944[0] = arg5;
        super.field4936[0] = arg4;
        super.field2677 = (super.field4936[0] << 7) + (arg2 << 6);
        super.field2666 = (super.field4944[0] << 7) + (arg2 << 6);
        if (super.field4942 != null) {
            super.field4942.method596();
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
    public static void method1729(int arg0) {
        if (arg0 != 0) {
            field3769 = null;
        }
        field3776 = null;
        field3769 = null;
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(B)I")
    public final int method1364(byte arg0) {
        ++field3778;
        if (arg0 != 24) {
            return 73;
        } else {
            if (this.field3773.field6922 != null) {
                class477 var2 = this.field3773.method2903(-1, class491.field7160);
                if (var2 != null && var2.field6941 != -1) {
                    return var2.field6941;
                }
            }
            return this.field3773.field6941;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method186(int arg0, class38 arg1, int arg2, int arg3) {
        if (arg0 <= 66) {
            return false;
        } else {
            ++field3774;
            if (this.field3773 != null && this.method1733(131072, arg1, -19541)) {
                class123 var5 = arg1.method369();
                int var6 = super.field4896.method33((byte) -48);
                var5.method233(var6);
                var5.method231(super.field2666, super.field2672, super.field2677);
                boolean var7 = false;
                for (int var8 = 0; ~super.field4937.length < ~var8; ++var8) {
                    if (super.field4937[var8] != null && super.field4937[var8].method412(arg2, arg3, var5, this.field3773.field6921 == 1)) {
                        var7 = true;
                        break;
                    }
                }
                super.field4937[0] = super.field4937[1] = super.field4937[2] = super.field4937[3] = null;
                return var7;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)Z")
    public final boolean method194(byte arg0) {
        if (arg0 >= -72) {
            field3791 = 103;
        }
        ++field3785;
        return false;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)I")
    public final int method1730(int arg0) {
        ++field3777;
        if (arg0 >= -6) {
            this.method1364((byte) -126);
        }
        if (this.field3773.field6922 != null) {
            class477 var2 = this.field3773.method2903(-1, class491.field7160);
            if (var2 != null && ~var2.field6973 != 0) {
                return var2.field6973;
            }
        }
        return this.field3773.field6973 == -1 ? super.method1730(-91) : this.field3773.field6973;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILfb;)V")
    public final void method1731(int arg0, class477 arg1) {
        if (arg0 != -16385) {
            this.field3784 = 9;
        }
        this.field3773 = arg1;
        ++field3771;
        if (super.field4942 != null) {
            super.field4942.method596();
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
    public final void method1732(int arg0, int arg1, int arg2) {
        ++field3781;
        int var4 = super.field4944[0];
        int var5 = super.field4936[0];
        if (~arg0 == -1) {
            ++var5;
        }
        if (arg0 == 1) {
            ++var5;
            ++var4;
        }
        if (~arg0 == -3) {
            ++var4;
        }
        if (arg0 == 3) {
            --var5;
            ++var4;
        }
        if (~arg0 == -5) {
            --var5;
        }
        if (arg0 == 5) {
            --var4;
            --var5;
        }
        if (~arg0 == -7) {
            --var4;
        }
        if (~super.field4859 != 0 && class404.field5756.method557(super.field4859, 15).field5925 == 1) {
            super.field4859 = -1;
        }
        if (~arg0 == -8) {
            ++var5;
            --var4;
        }
        if (~super.field4886 != arg1) {
            class466 var6 = class120.field1624.method1836(arg1 + -88, super.field4886);
            if (var6.field6722 && ~var6.field6746 != 0 && ~class404.field5756.method557(var6.field6746, 15).field5925 == -2) {
                super.field4886 = -1;
            }
        }
        if (super.field4906 != -1) {
            class466 var7 = class120.field1624.method1836(116, super.field4906);
            if (var7.field6722 && var7.field6746 != -1 && class404.field5756.method557(var7.field6746, 15).field5925 == 1) {
                super.field4906 = -1;
            }
        }
        if (super.field4941 < 9) {
            ++super.field4941;
        }
        for (int var8 = super.field4941; var8 > 0; --var8) {
            super.field4944[var8] = super.field4944[var8 + -1];
            super.field4936[var8] = super.field4936[var8 + -1];
            super.field4940[var8] = super.field4940[var8 + -1];
        }
        super.field4944[0] = var4;
        super.field4940[0] = (byte) arg2;
        super.field4936[0] = var5;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILya;I)Z")
    private final boolean method1733(int arg0, class38 arg1, int arg2) {
        ++field3782;
        int var4 = arg0;
        class511 var5 = this.method2128(-67);
        class415 var6 = ~super.field4859 != 0 && ~super.field4853 == -1 ? class404.field5756.method557(super.field4859, arg2 ^ -19548) : null;
        class415 var7 = super.field4888 == -1 || super.field4872 && var6 != null ? null : class404.field5756.method557(super.field4888, 15);
        int var8 = var5.field7420;
        int var9 = var5.field7381;
        if (~var8 != -1 || var9 != 0 || var5.field7400 != 0 || ~var5.field7409 != -1) {
            arg0 |= 7;
        }
        if (arg2 != -19541) {
            field3769 = null;
        }
        boolean var10 = ~super.field4922 != -1 && class163.field2065 >= super.field4929 && ~super.field4868 < ~class163.field2065;
        if (var10) {
            arg0 |= 524288;
        }
        class474 var11 = super.field4937[0] = this.field3773.method2904(var7, arg0, arg1, super.field4866, super.field4889, class404.field5756, super.field4870, class327.field4134, super.field4873, super.field4909, super.field4907, super.field4881, var6, -4739, class491.field7160);
        if (var11 == null) {
            return false;
        } else {
            super.field4851 = var11.method418();
            this.method2129(var11, -7625);
            int var12 = super.field4896.method33((byte) -48);
            if (~var8 == -1 && var9 == 0) {
                this.method2134(0, false, var12, this.method1366((byte) -109) << 7, this.method1366((byte) -104) << 7, 0);
            } else {
                this.method2134(var5.field7394, false, var12, var9, var8, var5.field7391);
                if (super.field4871 != 0) {
                    super.field4937[0].method436(super.field4871);
                }
                if (~super.field4927 != -1) {
                    super.field4937[0].method405(super.field4927);
                }
                if (~super.field4926 != -1) {
                    super.field4937[0].method443(0, super.field4926, 0);
                }
            }
            if (var10) {
                var11.method419(super.field4867, super.field4914, super.field4847, 255 & super.field4922);
            }
            if (~super.field4886 != 0 && super.field4861 != -1) {
                class466 var13 = class120.field1624.method1836(arg2 + 19489, super.field4886);
                boolean var14 = ~var13.field6733 == -4 && (~var8 != -1 || ~var9 != -1);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (~super.field4905 != -1) {
                        var15 = var4 | 5;
                    }
                    if (~super.field4878 != -1) {
                        var15 |= 2;
                    }
                }
                class474 var16 = super.field4937[1] = var13.method2815(class404.field5756, super.field4928, (byte) -127, var15, super.field4885, arg1, super.field4861);
                if (var16 != null) {
                    if (super.field4878 != 0) {
                        var16.method443(0, -super.field4878 << 0, 0);
                    }
                    if (~super.field4905 != -1) {
                        var16.method421(super.field4905 * 2048);
                    }
                    if (var14) {
                        if (super.field4871 != 0) {
                            var16.method436(super.field4871);
                        }
                        if (super.field4927 != 0) {
                            var16.method405(super.field4927);
                        }
                        if (super.field4926 != 0) {
                            var16.method443(0, super.field4926, 0);
                        }
                    }
                }
            } else {
                super.field4937[1] = null;
            }
            if (super.field4906 != -1 && super.field4883 != -1) {
                class466 var17 = class120.field1624.method1836(115, super.field4906);
                boolean var18 = ~var17.field6733 == -4 && (~var8 != -1 || var9 != 0);
                int var19 = var4;
                if (!var18) {
                    if (~super.field4882 != -1) {
                        var19 = var4 | 5;
                    }
                    if (super.field4899 != 0) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class474 var20 = super.field4937[3] = var17.method2810(var19, super.field4854, true, arg1, super.field4883, class404.field5756, super.field4875);
                if (var20 != null) {
                    if (~super.field4899 != -1) {
                        var20.method443(0, -super.field4899 << 0, 0);
                    }
                    if (super.field4882 != 0) {
                        var20.method421(super.field4882 * 2048);
                    }
                    if (var18) {
                        if (super.field4871 != 0) {
                            var20.method436(super.field4871);
                        }
                        if (~super.field4927 != -1) {
                            var20.method405(super.field4927);
                        }
                        if (super.field4926 != 0) {
                            var20.method443(0, super.field4926, 0);
                        }
                    }
                }
            } else {
                super.field4937[3] = null;
            }
            super.field4937[2] = null;
            if (super.field4939 != null) {
                if (~super.field4939.field6055 < ~class163.field2065) {
                    if (class163.field2065 >= super.field4939.field6056) {
                        class474 var21 = super.field4939.method2497(3, arg1, var4 | 7);
                        if (var21 != null) {
                            var21.method443(super.field4939.field6052 - super.field2666, -super.field2672 + super.field4939.field6046, -super.field2677 + super.field4939.field6051);
                            if (~var12 != -1) {
                                var21.method421(var12);
                            }
                            super.field4937[2] = var21;
                        }
                    }
                } else {
                    super.field4939 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "(B)Z")
    public final boolean method1734(byte arg0) {
        ++field3770;
        if (arg0 > -111) {
            this.method192((class38) null, -45);
        }
        return this.field3773 != null;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)V")
    public final void method180(byte arg0) {
        ++field3786;
        if (arg0 != -2) {
            this.field3784 = -8;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)Z")
    private final boolean method1735(int arg0) {
        if (arg0 != 0) {
            this.field3772 = -8;
        }
        ++field3779;
        return this.field3773.field6974;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lgg;IZIIILya;)V")
    public final void method193(class117 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class38 arg6) {
        ++field3790;
        int var8 = -94 / ((27 - arg5) / 40);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLya;)Llo;")
    public final class531 method181(boolean arg0, class38 arg1) {
        ++field3788;
        if (this.field3773 != null && this.method1733(2048, arg1, -19541)) {
            if (!arg0) {
                this.method1735(106);
            }
            class123 var3 = arg1.method369();
            int var4 = super.field4896.method33((byte) -48);
            var3.method233(var4);
            var3.method231(super.field2666, super.field2672, super.field2677);
            class511 var5 = this.method2128(-59);
            class477 var6 = this.field3773.field6922 == null ? this.field3773 : this.field3773.method2903(-1, class491.field7160);
            if (class407.field5817.field3616 && var6.field6945 && var5.field7373) {
                class415 var7 = ~super.field4859 != 0 && ~super.field4853 == -1 ? class404.field5756.method557(super.field4859, 15) : null;
                class415 var8 = ~super.field4888 == 0 || super.field4872 && var7 != null ? null : class404.field5756.method557(super.field4888, 15);
                class474 var9 = class223.method1359(super.field4926, arg1, -112, var4, super.field4937[0], 65535 & this.field3773.field6954, super.field4894, super.field4927, super.field4871, 255 & this.field3773.field6968, var8 != null ? super.field4866 : super.field4873, this.field3773.field6921, var8 != null ? var8 : var7, this.field3773.field6953 & 255, 65535 & this.field3773.field6957);
                if (var9 != null) {
                    float var10 = arg1.method278();
                    float var11 = arg1.method333();
                    arg1.method280(false);
                    arg1.method338(var10, var11 - 150.0F);
                    var9.method415(var3, (class419) null, 0);
                    arg1.method338(var10, var11);
                    arg1.method280(true);
                }
            }
            class531 var12 = null;
            if (this.method1735(0)) {
                var12 = class119.method850(super.field4937.length, -121);
            }
            if (super.field4942 == null) {
                arg1.method335(super.field4937, var3, var12 == null ? null : var12.field7810, 0);
            } else {
                class517 var13 = super.field4942.method594();
                arg1.method310(super.field4937, var13, var3, var12 == null ? null : var12.field7810, 0);
            }
            this.method2136((byte) 18, false, super.field4937, arg1);
            if (super.field4937[2] != null) {
                if (var4 != 0) {
                    super.field4937[2].method421(var4);
                }
                super.field4937[2].method443(-super.field4939.field6052 + super.field2666, -super.field4939.field6046 + super.field2672, super.field2677 - super.field4939.field6051);
            }
            super.field4937[0] = super.field4937[1] = super.field4937[2] = super.field4937[3] = null;
            super.field4864 = class386.field5073;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(B)I")
    public final int method1369(byte arg0) {
        ++field3787;
        if (this.field3773.field6922 != null) {
            class477 var2 = this.field3773.method2903(arg0 + -58, class491.field7160);
            if (var2 != null && var2.field6975 != -1) {
                return var2.field6975;
            }
        }
        if (arg0 != 57) {
            this.method1364((byte) -39);
        }
        return this.field3773.field6975;
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)I")
    public final int method733(int arg0) {
        ++field3789;
        if (arg0 != -29382) {
            field3791 = -125;
        }
        return super.field4851;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lya;I)V")
    public final void method192(class38 arg0, int arg1) {
        ++field3783;
        if (this.field3773 != null) {
            if (super.field4945 || this.method1733(0, arg0, arg1 + -19542)) {
                this.method2136((byte) 18, super.field4945, super.field4937, arg0);
                super.field4937[0] = super.field4937[arg1] = super.field4937[2] = super.field4937[3] = null;
            }
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field3769[var2] = (float) Math.sin((double) var2 * var0);
            field3776[var2] = (float) Math.cos((double) var2 * var0);
        }
        field3791 = 0;
    }
}
