import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class625 extends class292 {

    @OriginalMember(owner = "client!ag", name = "Pc", descriptor = "I")
    public int field8854 = -1;

    @OriginalMember(owner = "client!ag", name = "Jc", descriptor = "I")
    public int field8848 = -1;

    @OriginalMember(owner = "client!ag", name = "bd", descriptor = "Llu;")
    public static class651 field8866 = new class651();

    @OriginalMember(owner = "client!ag", name = "dd", descriptor = "Lpr;")
    public static class407 field8868 = new class407(19, 6);

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!ag", name = "Fc", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!ag", name = "Gc", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!ag", name = "Hc", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!ag", name = "Ic", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!ag", name = "Kc", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!ag", name = "Lc", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!ag", name = "Mc", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!ag", name = "Nc", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!ag", name = "Oc", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!ag", name = "Rc", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!ag", name = "Sc", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!ag", name = "Tc", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!ag", name = "Uc", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!ag", name = "Vc", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!ag", name = "Wc", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!ag", name = "Xc", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!ag", name = "Yc", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!ag", name = "Zc", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!ag", name = "ad", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!ag", name = "cd", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!ag", name = "ed", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!ag", name = "Qc", descriptor = "Lnc;")
    public class23 field8855;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)V")
    public static final void method3495(int arg0, int arg1) {
        ++field8862;
        if (!class601.field8530.field2844) {
            arg0 = -1;
        }
        if (class566.field8019 != arg0) {
            if (arg0 != arg1) {
                class312 var2 = class498.field7190.method2895((byte) 126, arg0);
                class563 var3 = var2.method1767(arg1 ^ -3);
                if (var3 == null) {
                    arg0 = -1;
                } else {
                    class623.field8837.method3136(var3.method3190(), (byte) 13, var3.method3179(), class220.field2664, new Point(var2.field4029, var2.field4031), var3.method3181());
                    class566.field8019 = arg0;
                }
            }
            if (~arg0 == 0 && ~class566.field8019 != 0) {
                class623.field8837.method3136(-1, (byte) 13, (int[]) null, class220.field2664, new Point(), -1);
                class566.field8019 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIILep;)V")
    public static final void method3496(int arg0, int arg1, int arg2, class382 arg3) {
        ++field8859;
        if (arg0 == -28759) {
            if (class464.field6446 == null && !class215.field2615) {
                if (arg3 != null && class649.method3648(arg3, arg0 ^ 28731) != null) {
                    class464.field6446 = arg3;
                    class66.field694 = class649.method3648(arg3, arg0 + 28674);
                    class185.field2249 = 0;
                    class422.field5614 = arg1;
                    class453.field6279 = arg2;
                    class682.field9687 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILoa;)Lgr;")
    public final class396 method450(int arg0, class635 arg1) {
        ++field8849;
        int var3 = -106 / ((arg0 - 47) / 34);
        return null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZIIII)V")
    public final void method3497(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field4638 = (byte) arg0;
        ++field8844;
        if (arg4 >= -79) {
            this.method1649((byte) -44);
        }
        if (super.field3778 != -1 && class618.field8696.method124(24006, super.field3778).field8223 == 1) {
            super.field3778 = -1;
        }
        if (super.field3774 != -1) {
            class135 var7 = class203.field2487.method2045((byte) -125, super.field3774);
            if (var7.field1520 && ~var7.field1516 != 0 && ~class618.field8696.method124(24006, var7.field1516).field8223 == -2) {
                super.field3774 = -1;
            }
        }
        if (super.field3785 != -1) {
            class135 var8 = class203.field2487.method2045((byte) 59, super.field3785);
            if (var8.field1520 && var8.field1516 != -1 && class618.field8696.method124(24006, var8.field1516).field8223 == 1) {
                super.field3785 = -1;
            }
        }
        if (!arg1) {
            int var9 = -super.field3839[0] + arg2;
            int var10 = -super.field3841[0] + arg5;
            if (var9 >= -8 && ~var9 >= -9 && var10 >= -8 && var10 <= 8) {
                if (super.field3835 < 9) {
                    ++super.field3835;
                }
                for (int var11 = super.field3835; var11 > 0; --var11) {
                    super.field3839[var11] = super.field3839[var11 + -1];
                    super.field3841[var11] = super.field3841[var11 + -1];
                    super.field3842[var11] = super.field3842[var11 + -1];
                }
                super.field3839[0] = arg2;
                super.field3841[0] = arg5;
                super.field3842[0] = 1;
                return;
            }
        }
        super.field3837 = 0;
        super.field3840 = 0;
        super.field3839[0] = arg2;
        super.field3835 = 0;
        super.field3841[0] = arg5;
        super.field4647 = (super.field3841[0] << 9) + (arg3 << 8);
        super.field4641 = (super.field3839[0] << 9) - -(arg3 << 8);
        if (super.field3833 != null) {
            super.field3833.method1232();
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V")
    public final void method448(int arg0) {
        int var2 = 45 % ((12 - arg0) / 56);
        ++field8864;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "(I)V")
    public static void method3498(int arg0) {
        field8866 = null;
        int var1 = -109 % ((arg0 - -1) / 52);
        field8868 = null;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Loa;I)Lok;")
    public final class231 method442(class635 arg0, int arg1) {
        ++field8851;
        if (this.field8855 != null && this.method3500(2048, arg0, false)) {
            class389 var3 = arg0.method297();
            int var4 = super.field3765.method1593(arg1 ^ -125);
            var3.method225(var4);
            var3.method235(super.field4641, super.field4646 + -20, super.field4647);
            class468 var5 = this.method1653(1);
            class23 var6 = this.field8855.field229 != null ? this.field8855.method108(0, class491.field7127) : this.field8855;
            if (class601.field8530.field2882 && var6.field240 && var5.field6531) {
                class576 var7 = super.field3778 != -1 && ~super.field3797 == -1 ? class618.field8696.method124(24006, super.field3778) : null;
                class576 var8 = ~super.field3782 == 0 || super.field3779 && var7 != null ? null : class618.field8696.method124(24006, super.field3782);
                int var9 = 0;
                if (~super.field3789 != -1) {
                    var9 = this.method1655(false);
                }
                class350 var10 = class426.method2300(super.field3771, this.field8855.field217 & 65535, super.field3825, this.field8855.field234, 255 & this.field8855.field241, arg0, var8 != null ? super.field3773 : super.field3744, super.field3836[0], 65535 & this.field8855.field237, var4, var8 == null ? var7 : var8, super.field3811, 255 & this.field8855.field257, -54, var9);
                if (var10 != null) {
                    arg0.method329(false);
                    var10.method904(var3, (class130) null, 0);
                    arg0.method329(true);
                }
            }
            var3.method225(var4);
            var3.method235(super.field4641, super.field4646 + -5, super.field4647);
            class231 var11 = null;
            if (this.method3499(arg1 + arg1)) {
                var11 = class526.method2993(super.field3836.length, arg1 ^ 32671);
            }
            this.method1659((byte) -94, arg0, super.field3836, false, var3);
            if (super.field3833 != null) {
                class211 var12 = super.field3833.method1241();
                arg0.method373(super.field3836, var12, var3, var11 != null ? var11.field2947 : null, 0);
            } else {
                arg0.method381(super.field3836, var3, var11 == null ? null : var11.field2947, 0);
            }
            super.field3748 = class273.field3463;
            super.field3836[0] = super.field3836[1] = super.field3836[2] = super.field3836[3] = null;
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "(I)Z")
    private final boolean method3499(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field8861;
            return this.field8855.field212;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIZIILfl;Loa;)V")
    public final void method453(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, class673 arg5, class635 arg6) {
        ++field8853;
        if (arg2) {
            this.method3500(-115, (class635) null, true);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILoa;Z)Z")
    private final boolean method3500(int arg0, class635 arg1, boolean arg2) {
        ++field8863;
        int var4 = arg0;
        class468 var5 = this.method1653(1);
        class576 var6 = ~super.field3778 != 0 && super.field3797 == 0 ? class618.field8696.method124(24006, super.field3778) : null;
        class576 var7 = ~super.field3782 == 0 || super.field3779 && var6 != null ? null : class618.field8696.method124(24006, super.field3782);
        int var8 = var5.field6509;
        int var9 = var5.field6490;
        if (~var8 != -1 || var9 != 0 || ~var5.field6493 != -1 || ~var5.field6502 != -1) {
            arg0 |= 7;
        }
        boolean var10 = super.field3817 != 0 && class469.field6549 >= super.field3809 && ~super.field3742 < ~class469.field6549;
        if (var10) {
            arg0 |= 524288;
        }
        class350 var11 = super.field3836[0] = this.field8855.method103(super.field3810, -1, super.field3773, super.field3744, super.field3758, class422.field5623, super.field3820, arg1, class491.field7127, var6, super.field3738, var7, arg0, class618.field8696, super.field3776);
        if (arg2) {
            return false;
        } else if (var11 == null) {
            return false;
        } else {
            super.field3769 = var11.method864();
            this.method1651(-12641, var11);
            int var12 = super.field3765.method1593(-120);
            if (var8 == 0 && var9 == 0) {
                this.method1654(0, var12, this.method1656(true) << 9, 0, this.method1656(true) << 9, (byte) 118);
            } else {
                this.method1654(var5.field6518, var12, var8, var5.field6506, var9, (byte) 118);
                if (super.field3825 != 0) {
                    super.field3836[0].method865(super.field3825);
                }
                if (~super.field3811 != -1) {
                    super.field3836[0].method870(super.field3811);
                }
                if (super.field3771 != 0) {
                    super.field3836[0].method862(0, super.field3771, 0);
                }
            }
            if (var10) {
                var11.method899(super.field3794, super.field3787, super.field3747, 255 & super.field3817);
            }
            if (~super.field3774 != 0 && super.field3813 != -1) {
                class135 var13 = class203.field2487.method2045((byte) -127, super.field3774);
                boolean var14 = var13.field1525 == 3 && (~var8 != -1 || var9 != 0);
                int var15 = var4;
                if (!var14) {
                    if (~super.field3828 != -1) {
                        var15 = var4 | 5;
                    }
                    if (super.field3814 != 0) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class350 var16 = super.field3836[1] = var13.method758(super.field3813, arg1, super.field3804, 0, class618.field8696, var15, super.field3793);
                if (var16 != null) {
                    if (super.field3814 != 0) {
                        var16.method862(0, -super.field3814 << 2, 0);
                    }
                    if (super.field3828 != 0) {
                        var16.method903(super.field3828 * 2048);
                    }
                    if (var14) {
                        if (super.field3825 != 0) {
                            var16.method865(super.field3825);
                        }
                        if (super.field3811 != 0) {
                            var16.method870(super.field3811);
                        }
                        if (super.field3771 != 0) {
                            var16.method862(0, super.field3771, 0);
                        }
                    }
                }
            } else {
                super.field3836[1] = null;
            }
            if (~super.field3785 != 0 && ~super.field3743 != 0) {
                class135 var17 = class203.field2487.method2045((byte) -122, super.field3785);
                boolean var18 = var17.field1525 == 3 && (var8 != 0 || ~var9 != -1);
                int var19 = var4;
                if (var18) {
                    var19 = var4 | 7;
                } else {
                    if (~super.field3805 != -1) {
                        var19 = var4 | 5;
                    }
                    if (super.field3798 != 0) {
                        var19 |= 2;
                    }
                }
                class350 var20 = super.field3836[3] = var17.method759(class618.field8696, -68, super.field3823, super.field3821, arg1, var19, super.field3743);
                if (var20 != null) {
                    if (super.field3798 != 0) {
                        var20.method862(0, -super.field3798 << 2, 0);
                    }
                    if (super.field3805 != 0) {
                        var20.method903(super.field3805 * 2048);
                    }
                    if (var18) {
                        if (super.field3825 != 0) {
                            var20.method865(super.field3825);
                        }
                        if (super.field3811 != 0) {
                            var20.method870(super.field3811);
                        }
                        if (super.field3771 != 0) {
                            var20.method862(0, super.field3771, 0);
                        }
                    }
                }
            } else {
                super.field3836[3] = null;
            }
            super.field3836[2] = null;
            if (super.field3834 != null) {
                if (~super.field3834.field7411 >= ~class469.field6549) {
                    super.field3834 = null;
                } else if (~class469.field6549 <= ~super.field3834.field7412) {
                    class350 var21 = super.field3834.method2958(true, arg1, 7 | var4);
                    if (var21 != null) {
                        var21.method862(-super.field4641 + super.field3834.field7403, super.field3834.field7405 - (super.field4646 - 5), super.field3834.field7409 - super.field4647);
                        if (~var12 != -1) {
                            var21.method903(var12);
                        }
                        super.field3836[2] = var21;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)I")
    public final int method1658(byte arg0) {
        ++field8869;
        if (this.field8855.field229 != null) {
            class23 var2 = this.field8855.method108(arg0 + 93, class491.field7127);
            if (var2 != null && ~var2.field269 != 0) {
                return var2.field269;
            }
        }
        if (arg0 != -93) {
            this.field8854 = -49;
        }
        return this.field8855.field269 == -1 ? super.method1658((byte) -93) : this.field8855.field269;
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)I")
    public final int method740(int arg0) {
        int var2 = -47 / ((arg0 - -31) / 48);
        ++field8865;
        return super.field3769;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method457(int arg0, int arg1, class635 arg2, int arg3) {
        ++field8843;
        if (this.field8855 != null && this.method3500(131072, arg2, false)) {
            class389 var5 = arg2.method297();
            int var6 = super.field3765.method1593(-121);
            var5.method225(var6);
            var5.method235(super.field4641, super.field4646, super.field4647);
            boolean var7 = false;
            for (int var8 = 0; ~super.field3836.length < ~var8; ++var8) {
                if (super.field3836[var8] != null && super.field3836[var8].method910(arg3, arg0, var5, ~this.field8855.field234 == -2)) {
                    var7 = true;
                    break;
                }
            }
            super.field3836[0] = super.field3836[arg1] = super.field3836[2] = super.field3836[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)Z")
    public final boolean method449(byte arg0) {
        ++field8856;
        return arg0 != -126;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lnc;I)V")
    public final void method3501(class23 arg0, int arg1) {
        this.field8855 = arg0;
        if (arg1 <= 12) {
            this.method450(88, (class635) null);
        }
        ++field8860;
        if (super.field3833 != null) {
            super.field3833.method1232();
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(IBI)V")
    public static final void method3502(int arg0, byte arg1, int arg2) {
        ++field8867;
        if (class501.field7222 != arg0) {
            class579.field8246 = new int[arg0];
            for (int var3 = 0; arg0 > var3; ++var3) {
                class579.field8246[var3] = (var3 << 12) / arg0;
            }
            class507.field7299 = arg0 + -1;
            class501.field7222 = arg0;
            class268.field3390 = arg0 * 32;
        }
        if (arg1 <= 6) {
            field8868 = null;
        }
        if (~class567.field8041 != ~arg2) {
            if (~class501.field7222 != ~arg2) {
                class476.field6935 = new int[arg2];
                for (int var4 = 0; ~var4 > ~arg2; ++var4) {
                    class476.field6935[var4] = (var4 << 12) / arg2;
                }
            } else {
                class476.field6935 = class579.field8246;
            }
            class567.field8041 = arg2;
            class515.field7357 = arg2 - 1;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)I")
    public final int method1652(int arg0) {
        ++field8858;
        if (this.field8855.field229 != null) {
            class23 var2 = this.field8855.method108(0, class491.field7127);
            if (var2 != null && var2.field211 != -1) {
                return var2.field211;
            }
        }
        return arg0 != 0 ? -39 : this.field8855.field211;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)I")
    public final int method1649(byte arg0) {
        ++field8850;
        if (arg0 != 114) {
            return 87;
        } else {
            if (this.field8855.field229 != null) {
                class23 var2 = this.field8855.method108(0, class491.field7127);
                if (var2 != null && ~var2.field244 != 0) {
                    return var2.field244;
                }
            }
            return this.field8855.field244;
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(Z)Z")
    public final boolean method3503(boolean arg0) {
        ++field8846;
        if (this.field8855 == null) {
            return false;
        } else {
            return arg0 ? true : true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(II)Ljava/lang/String;")
    public static final String method3504(int arg0, int arg1) {
        ++field8852;
        String var2 = Integer.toString(arg0);
        for (int var3 = -3 + var2.length(); ~var3 < -1; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 >= -40) {
            field8866 = null;
        }
        if (~var2.length() < -10) {
            return " <col=00ff80>" + var2.substring(0, -8 + var2.length()) + class221.field2752.method1296(class226.field2899, (byte) 63) + " (" + var2 + ")</col>";
        } else {
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class221.field2754.method1296(class226.field2899, (byte) 109) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)V")
    public final void method3505(int arg0, int arg1, int arg2) {
        ++field8845;
        int var4 = super.field3839[0];
        int var5 = super.field3841[0];
        if (arg1 == 0) {
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
            --var5;
            ++var4;
        }
        if (arg1 == 4) {
            --var5;
        }
        if (arg1 == 5) {
            --var5;
            --var4;
        }
        if (arg1 == 6) {
            --var4;
        }
        if (~arg1 == -8) {
            ++var5;
            --var4;
        }
        if (super.field3778 != -1 && ~class618.field8696.method124(arg2 + 36668, super.field3778).field8223 == -2) {
            super.field3778 = -1;
        }
        if (super.field3774 != -1) {
            class135 var6 = class203.field2487.method2045((byte) -123, super.field3774);
            if (var6.field1520 && var6.field1516 != -1 && ~class618.field8696.method124(arg2 ^ -27828, var6.field1516).field8223 == -2) {
                super.field3774 = -1;
            }
        }
        if (~super.field3785 != 0) {
            class135 var7 = class203.field2487.method2045((byte) 40, super.field3785);
            if (var7.field1520 && var7.field1516 != -1 && ~class618.field8696.method124(arg2 ^ -27828, var7.field1516).field8223 == -2) {
                super.field3785 = -1;
            }
        }
        if (super.field3835 < 9) {
            ++super.field3835;
        }
        if (arg2 != -12662) {
            this.method453(false, -3, true, -54, 49, (class673) null, (class635) null);
        }
        for (int var8 = super.field3835; var8 > 0; --var8) {
            super.field3839[var8] = super.field3839[var8 - 1];
            super.field3841[var8] = super.field3841[var8 - 1];
            super.field3842[var8] = super.field3842[var8 - 1];
        }
        super.field3839[0] = var4;
        super.field3841[0] = var5;
        super.field3842[0] = (byte) arg0;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(Loa;I)V")
    public final void method451(class635 arg0, int arg1) {
        ++field8857;
        if (this.field8855 != null) {
            if (super.field3832 || this.method3500(0, arg0, false)) {
                if (arg1 != 31055) {
                    field8868 = null;
                }
                class389 var3 = arg0.method297();
                var3.method225(super.field3765.method1593(-126));
                var3.method235(super.field4641, super.field4646 + -20, super.field4647);
                this.method1659((byte) 42, arg0, super.field3836, super.field3832, var3);
                super.field3836[0] = super.field3836[1] = super.field3836[2] = super.field3836[3] = null;
            }
        }
    }
}
