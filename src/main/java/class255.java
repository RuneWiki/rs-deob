import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class255 extends class517 {

    @OriginalMember(owner = "client!at", name = "Dc", descriptor = "I")
    public int field3657 = -1;

    @OriginalMember(owner = "client!at", name = "Jc", descriptor = "I")
    public int field3663 = -1;

    @OriginalMember(owner = "client!at", name = "Ac", descriptor = "[Ljava/lang/String;")
    public static String[] field3654 = new String[200];

    @OriginalMember(owner = "client!at", name = "zc", descriptor = "I")
    public static int field3653 = 2;

    @OriginalMember(owner = "client!at", name = "Uc", descriptor = "I")
    public static int field3674 = 0;

    @OriginalMember(owner = "client!at", name = "Bc", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!at", name = "Cc", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!at", name = "Ec", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!at", name = "Fc", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!at", name = "Gc", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!at", name = "Hc", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!at", name = "Ic", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!at", name = "Kc", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!at", name = "Lc", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!at", name = "Mc", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!at", name = "Nc", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!at", name = "Oc", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!at", name = "Pc", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!at", name = "Rc", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!at", name = "Tc", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!at", name = "Vc", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!at", name = "Wc", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!at", name = "Qc", descriptor = "Lnq;")
    public static class318 field3670;

    @OriginalMember(owner = "client!at", name = "Xc", descriptor = "Lda;")
    public class42 field3677;

    @OriginalMember(owner = "client!at", name = "Sc", descriptor = "[Z")
    public static boolean[] field3672;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(I)I")
    public final int method547(int arg0) {
        ++field3659;
        return arg0 != 3 ? 110 : super.field7647;
    }

    @OriginalMember(owner = "client!at", name = "g", descriptor = "(B)V")
    public static void method1643(byte arg0) {
        field3654 = null;
        field3670 = null;
        field3672 = null;
        if (arg0 != 117) {
            field3670 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "f", descriptor = "(B)I")
    public final int method1644(byte arg0) {
        if (arg0 <= 112) {
            field3670 = null;
        }
        ++field3667;
        if (this.field3677.field797 != null) {
            class42 var2 = this.field3677.method427(class335.field5059, (byte) -121);
            if (var2 != null && ~var2.field798 != 0) {
                return var2.field798;
            }
        }
        return this.field3677.field798;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ILqa;ZLto;III)V")
    public final void method18(int arg0, class162 arg1, boolean arg2, class8 arg3, int arg4, int arg5, int arg6) {
        ++field3676;
        if (arg4 == -1) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(B)V")
    public final void method22(byte arg0) {
        if (arg0 != -3) {
            this.method1644((byte) -13);
        }
        ++field3655;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)I")
    public final int method1645(int arg0) {
        if (arg0 != -1) {
            this.method24(true);
        }
        ++field3675;
        if (this.field3677.field797 != null) {
            class42 var2 = this.field3677.method427(class335.field5059, (byte) -59);
            if (var2 != null && var2.field748 != -1) {
                return var2.field748;
            }
        }
        return ~this.field3677.field748 != 0 ? this.field3677.field748 : super.method1645(-1);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)I")
    public final int method1646(int arg0) {
        ++field3665;
        if (this.field3677.field797 != null) {
            class42 var2 = this.field3677.method427(class335.field5059, (byte) -118);
            if (var2 != null && var2.field793 != -1) {
                return var2.field793;
            }
        }
        int var3 = -43 % ((-38 - arg0) / 34);
        return this.field3677.field793;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZILqa;)Z")
    private final boolean method1647(boolean arg0, int arg1, class162 arg2) {
        ++field3669;
        int var4 = arg1;
        class435 var5 = this.method3094(-82);
        class165 var6 = ~super.field7642 != 0 && ~super.field7664 == -1 ? class431.field6419.method1137(-108, super.field7642) : null;
        class165 var7 = ~super.field7666 == 0 || super.field7682 && var6 != null ? null : class431.field6419.method1137(-117, super.field7666);
        int var8 = var5.field6479;
        int var9 = var5.field6442;
        if (var8 != 0 || ~var9 != -1 || ~var5.field6482 != -1 || ~var5.field6468 != -1) {
            arg1 |= 7;
        }
        boolean var10 = super.field7601 != 0 && ~super.field7636 >= ~class531.field7821 && super.field7641 > class531.field7821;
        if (var10) {
            arg1 |= 524288;
        }
        class121 var11 = super.field7688[0] = this.field3677.method425(class203.field2969, super.field7592, class335.field5059, arg2, (byte) 89, super.field7624, super.field7594, var6, arg1, class431.field6419, super.field7629, var7, super.field7675, super.field7597, super.field7607);
        if (var11 == null) {
            return false;
        } else {
            super.field7647 = var11.method930();
            this.method3091(var11, arg0);
            int var12 = super.field7676.method2114(0);
            if (var8 == 0 && ~var9 == -1) {
                this.method3087(0, this.method1654(98) << 7, -25741, this.method1654(106) << 7, var12, 0);
            } else {
                this.method3087(var5.field6492, var9, -25741, var8, var12, var5.field6485);
                if (~super.field7627 != -1) {
                    super.field7688[0].method922(super.field7627);
                }
                if (super.field7658 != 0) {
                    super.field7688[0].method895(super.field7658);
                }
                if (~super.field7659 != -1) {
                    super.field7688[0].method923(0, super.field7659, 0);
                }
            }
            if (var10) {
                var11.method939(super.field7622, super.field7640, super.field7596, 255 & super.field7601);
            }
            if (super.field7617 != -1 && ~super.field7656 != 0) {
                class110 var13 = class140.field2233.method2249(super.field7617, -12502);
                boolean var14 = var13.field1850 == 3 && (~var8 != -1 || ~var9 != -1);
                int var15 = var4;
                if (!var14) {
                    if (super.field7593 != 0) {
                        var15 = var4 | 5;
                    }
                    if (super.field7625 != 0) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class121 var16 = super.field7688[1] = var13.method824(arg2, super.field7656, super.field7667, super.field7614, 1, var15, class431.field6419);
                if (var16 != null) {
                    if (~super.field7625 != -1) {
                        var16.method923(0, -super.field7625 << 0, 0);
                    }
                    if (~super.field7593 != -1) {
                        var16.method912(super.field7593 * 2048);
                    }
                    if (var14) {
                        if (~super.field7627 != -1) {
                            var16.method922(super.field7627);
                        }
                        if (~super.field7658 != -1) {
                            var16.method895(super.field7658);
                        }
                        if (super.field7659 != 0) {
                            var16.method923(0, super.field7659, 0);
                        }
                    }
                }
            } else {
                super.field7688[1] = null;
            }
            if (~super.field7621 != 0 && ~super.field7618 != 0) {
                class110 var17 = class140.field2233.method2249(super.field7621, -12502);
                boolean var18 = var17.field1850 == 3 && (var8 != 0 || ~var9 != -1);
                int var19 = var4;
                if (!var18) {
                    if (super.field7613 != 0) {
                        var19 = var4 | 5;
                    }
                    if (super.field7635 != 0) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class121 var20 = super.field7688[3] = var17.method825(class431.field6419, super.field7618, (byte) 124, arg2, var19, super.field7598, super.field7644);
                if (var20 != null) {
                    if (super.field7635 != 0) {
                        var20.method923(0, -super.field7635 << 0, 0);
                    }
                    if (super.field7613 != 0) {
                        var20.method912(super.field7613 * 2048);
                    }
                    if (var18) {
                        if (super.field7627 != 0) {
                            var20.method922(super.field7627);
                        }
                        if (super.field7658 != 0) {
                            var20.method895(super.field7658);
                        }
                        if (~super.field7659 != -1) {
                            var20.method923(0, super.field7659, 0);
                        }
                    }
                }
            } else {
                super.field7688[3] = null;
            }
            super.field7688[2] = null;
            if (super.field7689 != null) {
                if (class531.field7821 < super.field7689.field2448) {
                    if (~class531.field7821 <= ~super.field7689.field2441) {
                        class121 var21 = super.field7689.method1165(var4 | 7, false, arg2);
                        if (var21 != null) {
                            var21.method923(-super.field6228 + super.field7689.field2444, super.field7689.field2447 - super.field6230, super.field7689.field2431 - super.field6233);
                            if (~var12 != -1) {
                                var21.method912(var12);
                            }
                            super.field7688[2] = var21;
                        }
                    }
                } else {
                    super.field7689 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ILda;)V")
    public final void method1648(int arg0, class42 arg1) {
        int var3 = 15 / ((-8 - arg0) / 38);
        this.field3677 = arg1;
        ++field3661;
        if (super.field7693 != null) {
            super.field7693.method717();
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BLqa;)V")
    public final void method25(byte arg0, class162 arg1) {
        ++field3671;
        if (this.field3677 != null) {
            int var3 = -122 / ((arg0 - -45) / 48);
            if (super.field7686 || this.method1647(true, 0, arg1)) {
                this.method3083(super.field7686, arg1, super.field7688, 0);
                super.field7688[0] = super.field7688[1] = super.field7688[2] = super.field7688[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(III)V")
    public final void method1649(int arg0, int arg1, int arg2) {
        ++field3673;
        int var4 = super.field7692[0];
        int var5 = super.field7694[0];
        if (~arg1 == arg2) {
            ++var5;
        }
        if (~arg1 == -2) {
            ++var4;
            ++var5;
        }
        if (arg1 == 2) {
            ++var4;
        }
        if (arg1 == 3) {
            ++var4;
            --var5;
        }
        if (~arg1 == -5) {
            --var5;
        }
        if (~arg1 == -6) {
            --var5;
            --var4;
        }
        if (~arg1 == -7) {
            --var4;
        }
        if (arg1 == 7) {
            --var4;
            ++var5;
        }
        if (super.field7642 != -1 && ~class431.field6419.method1137(124, super.field7642).field2556 == -2) {
            super.field7642 = -1;
        }
        if (super.field7617 != -1) {
            class110 var6 = class140.field2233.method2249(super.field7617, arg2 + -12501);
            if (var6.field1852 && var6.field1853 != -1 && ~class431.field6419.method1137(31, var6.field1853).field2556 == -2) {
                super.field7617 = -1;
            }
        }
        if (~super.field7621 != 0) {
            class110 var7 = class140.field2233.method2249(super.field7621, -12502);
            if (var7.field1852 && ~var7.field1853 != 0 && class431.field6419.method1137(25, var7.field1853).field2556 == 1) {
                super.field7621 = -1;
            }
        }
        if (~super.field7690 > -10) {
            ++super.field7690;
        }
        for (int var8 = super.field7690; var8 > 0; --var8) {
            super.field7692[var8] = super.field7692[var8 + -1];
            super.field7694[var8] = super.field7694[var8 + -1];
            super.field7691[var8] = super.field7691[var8 - 1];
        }
        super.field7692[0] = var4;
        super.field7691[0] = (byte) arg0;
        super.field7694[0] = var5;
    }

    @OriginalMember(owner = "client!at", name = "g", descriptor = "(I)Z")
    public final boolean method1650(int arg0) {
        ++field3658;
        if (this.field3677 == null) {
            return false;
        } else {
            return arg0 == 16928;
        }
    }

    @OriginalMember(owner = "client!at", name = "e", descriptor = "(Z)Z")
    private final boolean method1651(boolean arg0) {
        ++field3662;
        if (arg0) {
            this.method1646(-88);
        }
        return this.field3677.field811;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method14(int arg0, class162 arg1, int arg2, int arg3) {
        ++field3668;
        if (this.field3677 != null && this.method1647(true, 131072, arg1)) {
            class414 var5 = arg1.method240();
            int var6 = super.field7676.method2114(0);
            var5.method864(var6);
            var5.method876(super.field6228, super.field6230, super.field6233);
            boolean var7 = false;
            for (int var8 = 0; var8 < super.field7688.length; ++var8) {
                if (super.field7688[var8] != null && super.field7688[var8].method924(arg3, arg2, var5, this.field3677.field807 == 1)) {
                    var7 = true;
                    break;
                }
            }
            super.field7688[0] = super.field7688[1] = super.field7688[2] = super.field7688[3] = null;
            if (arg0 != 131072) {
                this.method25((byte) -118, (class162) null);
            }
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZLqa;)Lae;")
    public final class163 method13(boolean arg0, class162 arg1) {
        ++field3656;
        if (this.field3677 != null && this.method1647(!arg0, 2048, arg1)) {
            class414 var3 = arg1.method240();
            int var4 = super.field7676.method2114(0);
            var3.method864(var4);
            var3.method876(super.field6228, super.field6230, super.field6233);
            class435 var5 = this.method3094(-35);
            class42 var6 = this.field3677.field797 == null ? this.field3677 : this.field3677.method427(class335.field5059, (byte) -124);
            if (class443.field6623.field612 && var6.field755 && var5.field6461) {
                class165 var7 = ~super.field7642 != 0 && super.field7664 == 0 ? class431.field6419.method1137(-118, super.field7642) : null;
                class165 var8 = super.field7666 == -1 || super.field7682 && var7 != null ? null : class431.field6419.method1137(-128, super.field7666);
                class121 var9 = class260.method1683(-17411, arg1, var4, this.field3677.field807, 255 & this.field3677.field754, 65535 & this.field3677.field792, super.field7627, super.field7623, super.field7688[0], var8 != null ? super.field7624 : super.field7594, 65535 & this.field3677.field772, super.field7658, var8 == null ? var7 : var8, super.field7659, 255 & this.field3677.field767);
                if (var9 != null) {
                    float var10 = arg1.method221();
                    float var11 = arg1.method276();
                    arg1.method220(false);
                    arg1.method300(var10, var11 - 150.0F);
                    var9.method927(var3, (class456) null, 0);
                    arg1.method300(var10, var11);
                    arg1.method220(true);
                }
            }
            class163 var12 = null;
            if (this.method1651(arg0)) {
                var12 = class483.method2876(super.field7688.length, 0);
            }
            if (super.field7693 != null) {
                class49 var13 = super.field7693.method724();
                arg1.method272(super.field7688, var13, var3, var12 != null ? var12.field2516 : null, 0);
            } else {
                arg1.method263(super.field7688, var3, var12 != null ? var12.field2516 : null, 0);
            }
            this.method3083(arg0, arg1, super.field7688, 0);
            if (super.field7688[2] != null) {
                if (var4 != 0) {
                    super.field7688[2].method912(var4);
                }
                super.field7688[2].method923(-super.field7689.field2444 + super.field6228, -super.field7689.field2447 + super.field6230, -super.field7689.field2431 + super.field6233);
            }
            super.field7651 = class173.field2664;
            super.field7688[0] = super.field7688[1] = super.field7688[2] = super.field7688[3] = null;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(Z)Z")
    public final boolean method24(boolean arg0) {
        if (arg0) {
            method1643((byte) -56);
        }
        ++field3666;
        return false;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BIIZII)V")
    public final void method1652(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        super.field6232 = (byte) arg2;
        if (arg0 >= -68) {
            this.method1651(false);
        }
        ++field3664;
        if (~super.field7642 != 0 && ~class431.field6419.method1137(36, super.field7642).field2556 == -2) {
            super.field7642 = -1;
        }
        if (super.field7617 != -1) {
            class110 var7 = class140.field2233.method2249(super.field7617, -12502);
            if (var7.field1852 && ~var7.field1853 != 0 && ~class431.field6419.method1137(-116, var7.field1853).field2556 == -2) {
                super.field7617 = -1;
            }
        }
        if (super.field7621 != -1) {
            class110 var8 = class140.field2233.method2249(super.field7621, -12502);
            if (var8.field1852 && ~var8.field1853 != 0 && class431.field6419.method1137(-102, var8.field1853).field2556 == 1) {
                super.field7621 = -1;
            }
        }
        if (!arg3) {
            int var9 = -super.field7692[0] + arg5;
            int var10 = -super.field7694[0] + arg4;
            if (~var9 <= 7 && var9 <= 8 && ~var10 <= 7 && var10 <= 8) {
                if (super.field7690 < 9) {
                    ++super.field7690;
                }
                for (int var11 = super.field7690; ~var11 < -1; --var11) {
                    super.field7692[var11] = super.field7692[var11 - 1];
                    super.field7694[var11] = super.field7694[var11 + -1];
                    super.field7691[var11] = super.field7691[var11 + -1];
                }
                super.field7692[0] = arg5;
                super.field7691[0] = 1;
                super.field7694[0] = arg4;
                return;
            }
        }
        super.field7687 = 0;
        super.field7692[0] = arg5;
        super.field7695 = 0;
        super.field7690 = 0;
        super.field7694[0] = arg4;
        super.field6228 = (super.field7692[0] << 7) + (arg1 << 6);
        super.field6233 = (super.field7694[0] << 7) - -(arg1 << 6);
        if (super.field7693 != null) {
            super.field7693.method717();
        }
    }
}
