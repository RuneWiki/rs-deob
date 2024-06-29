import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class557 extends class213 {

    @OriginalMember(owner = "client!kfa", name = "Xc", descriptor = "I")
    public int field8046 = -1;

    @OriginalMember(owner = "client!kfa", name = "od", descriptor = "I")
    public int field8063 = -1;

    @OriginalMember(owner = "client!kfa", name = "gd", descriptor = "Lsq;")
    public static class161 field8055 = new class161(7, 2);

    @OriginalMember(owner = "client!kfa", name = "P", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!kfa", name = "Yc", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!kfa", name = "Zc", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!kfa", name = "ad", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!kfa", name = "bd", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!kfa", name = "cd", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!kfa", name = "ed", descriptor = "I")
    public static int field8053;

    @OriginalMember(owner = "client!kfa", name = "fd", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!kfa", name = "hd", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!kfa", name = "id", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!kfa", name = "jd", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!kfa", name = "kd", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!kfa", name = "ld", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!kfa", name = "md", descriptor = "I")
    public static int field8061;

    @OriginalMember(owner = "client!kfa", name = "pd", descriptor = "I")
    public static int field8064;

    @OriginalMember(owner = "client!kfa", name = "qd", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!kfa", name = "rd", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!kfa", name = "nd", descriptor = "Lrfa;")
    public static class182 field8062;

    @OriginalMember(owner = "client!kfa", name = "dd", descriptor = "Lrb;")
    public class323 field8052;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lrb;I)V")
    public final void method3251(class323 arg0, int arg1) {
        this.field8052 = arg0;
        ++field8053;
        if (super.field2684 != null) {
            super.field2684.method3876();
        }
        if (arg1 != 0) {
            method3254(-7);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lr;B)Llt;")
    public final class626 method170(class165 arg0, byte arg1) {
        ++field8048;
        if (this.field8052 != null && this.method3256(2048, arg0, -5)) {
            class394 var3 = arg0.method315();
            int var4 = super.field2588.method3060(16383);
            if (arg1 != -2) {
                this.field8052 = null;
            }
            var3.method724(var4);
            class433 var5 = class281.field3808[super.field532][super.field530 >> class295.field3981][super.field531 >> class295.field3981];
            if (var5 != null && var5.field6221 != null) {
                int var6 = super.field2636 - var5.field6221.field7691;
                super.field2636 = (int) ((float) super.field2636 - (float) var6 / 10.0F);
            } else {
                super.field2636 = (int) ((float) super.field2636 - (float) super.field2636 / 10.0F);
            }
            var3.method723(super.field530, super.field527 - (super.field2636 + 20), super.field531);
            class573 var7 = this.method1280(-1);
            class323 var8 = this.field8052.field4315 == null ? this.field8052 : this.field8052.method1881(class410.field5804, (byte) 123);
            super.field2685 = false;
            if (class221.field2851.field4132 && var8.field4302 && var7.field8400) {
                class282 var9 = super.field2637 != -1 && super.field2596 == 0 ? class195.field2367.method3273(super.field2637, 0) : null;
                class282 var10 = super.field2634 == -1 || super.field2594 && var9 != null ? null : class195.field2367.method3273(super.field2634, 0);
                class55 var11 = class233.method1418(var10 == null ? super.field2613 : super.field2620, super.field2580, super.field2611, this.field8052.field4304 & 65535, 65535 & this.field8052.field4255, (byte) 116, arg0, var4, this.field8052.field4301 & 255, var10 != null ? var10 : var9, this.field8052.field4318, super.field2687[0], super.field2592, 255 & this.field8052.field4312);
                if (var11 != null) {
                    super.field2685 = true;
                    arg0.method309(false);
                    if (class547.field7943) {
                        var11.method122(var3, (class605) null, class676.field9693, 0);
                    } else {
                        var11.method67(var3, (class605) null, 0);
                    }
                    arg0.method309(true);
                }
            }
            var3.method724(var4);
            var3.method723(super.field530, super.field527 + -5 - super.field2636, super.field531);
            class626 var12 = null;
            if (this.method3257((byte) -100)) {
                var12 = class547.method3208(super.field2687.length, arg1 + -16658);
            }
            this.method1283(super.field2687, false, var3, (byte) -7, arg0);
            if (class547.field7943) {
                for (int var13 = 0; ~super.field2687.length < ~var13; ++var13) {
                    if (super.field2687[var13] != null) {
                        super.field2687[var13].method122(var3, var12 != null ? var12.field8985[var13] : null, class676.field9693, 0);
                    }
                }
            } else {
                for (int var14 = 0; var14 < super.field2687.length; ++var14) {
                    if (super.field2687[var14] != null) {
                        super.field2687[var14].method67(var3, var12 == null ? null : var12.field8985[var14], 0);
                    }
                }
            }
            if (super.field2684 != null) {
                class436 var15 = super.field2684.method3869();
                if (!class547.field7943) {
                    arg0.method228(var15);
                } else {
                    arg0.method223(var15, class676.field9693);
                }
            }
            for (int var16 = 0; var16 < super.field2687.length; ++var16) {
                if (super.field2687[var16] != null) {
                    super.field2685 |= super.field2687[var16].method112();
                }
            }
            super.field2687[0] = super.field2687[1] = super.field2687[2] = null;
            super.field2659 = class114.field1478;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)V")
    public static final void method3252(boolean arg0) {
        if (!arg0) {
            class244.field3334 = 0;
            ++field8051;
            class465.field6487 = new class68[50];
        }
    }

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "(B)I")
    public final int method1294(byte arg0) {
        if (arg0 < 58) {
            this.method3256(13, (class165) null, 9);
        }
        ++field8054;
        if (this.field8052.field4315 != null) {
            class323 var2 = this.field8052.method1881(class410.field5804, (byte) -109);
            if (var2 != null && ~var2.field4261 != 0) {
                return var2.field4261;
            }
        }
        return this.field8052.field4261 != -1 ? this.field8052.field4261 : super.method1294((byte) 99);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BIIIZI)V")
    public final void method3253(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field8066;
        super.field532 = super.field535 = (byte) arg5;
        if (class626.method3602(arg3, arg2, (byte) 99)) {
            ++super.field535;
        }
        if (super.field2637 != -1 && class195.field2367.method3273(super.field2637, 0).field3836 == 1) {
            super.field2655 = null;
            super.field2637 = -1;
        }
        if (~super.field2626 != 0) {
            class596 var7 = class276.field3774.method136(super.field2626, false);
            if (var7.field8600 && ~var7.field8614 != 0 && ~class195.field2367.method3273(var7.field8614, 0).field3836 == -2) {
                super.field2626 = -1;
            }
        }
        if (super.field2629 != -1) {
            class596 var8 = class276.field3774.method136(super.field2629, false);
            if (var8.field8600 && ~var8.field8614 != 0 && ~class195.field2367.method3273(var8.field8614, 0).field3836 == -2) {
                super.field2629 = -1;
            }
        }
        if (!arg4) {
            int var9 = arg3 - super.field2689[0];
            int var10 = -super.field2686[0] + arg2;
            if (~var9 <= 7 && var9 <= 8 && var10 >= -8 && var10 <= 8) {
                if (super.field2683 < 9) {
                    ++super.field2683;
                }
                for (int var11 = super.field2683; var11 > 0; --var11) {
                    super.field2689[var11] = super.field2689[var11 + -1];
                    super.field2686[var11] = super.field2686[var11 - 1];
                    super.field2679[var11] = super.field2679[var11 - 1];
                }
                super.field2689[0] = arg3;
                super.field2686[0] = arg2;
                super.field2679[0] = 1;
                return;
            }
        }
        super.field2683 = 0;
        if (arg0 != -102) {
            this.method162((class165) null, true);
        }
        super.field2688 = 0;
        super.field2689[0] = arg3;
        super.field2680 = 0;
        super.field2686[0] = arg2;
        super.field530 = (super.field2689[0] << 9) + (arg1 << 8);
        super.field531 = (super.field2686[0] << 9) - -(arg1 << 8);
        if (super.field2684 != null) {
            super.field2684.method3876();
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(BLr;)Lsr;")
    public final class229 method161(byte arg0, class165 arg1) {
        ++field8047;
        if (arg0 < 100) {
            this.method3255((byte) 52, -61, -74);
        }
        return null;
    }

    @OriginalMember(owner = "client!kfa", name = "m", descriptor = "(I)V")
    public static void method3254(int arg0) {
        if (arg0 != -30871) {
            field8062 = null;
        }
        field8055 = null;
        field8062 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lr;III)Z")
    public final boolean method166(class165 arg0, int arg1, int arg2, int arg3) {
        ++field8061;
        if (this.field8052 != null && this.method3256(131072, arg0, -5)) {
            class394 var5 = arg0.method315();
            int var6 = super.field2588.method3060(16383);
            var5.method724(var6);
            var5.method723(super.field530, super.field527, super.field531);
            boolean var7 = false;
            if (arg3 > -20) {
                return true;
            } else {
                for (int var8 = 0; ~super.field2687.length < ~var8; ++var8) {
                    if (super.field2687[var8] != null) {
                        boolean var9 = this.field8052.field4275 != -1 ? this.field8052.field4275 == 1 : this.field8052.field4318 == 1;
                        boolean var10;
                        if (!class547.field7943) {
                            var10 = super.field2687[var8].method129(arg1, arg2, var5, var9);
                        } else {
                            var10 = super.field2687[var8].method124(arg1, arg2, var5, var9, class676.field9693);
                        }
                        if (var10) {
                            var7 = true;
                            break;
                        }
                    }
                }
                super.field2687[0] = super.field2687[1] = super.field2687[2] = null;
                return var7;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BII)V")
    public final void method3255(byte arg0, int arg1, int arg2) {
        ++field8050;
        int var4 = super.field2689[0];
        int var5 = super.field2686[0];
        if (arg2 == 0) {
            ++var5;
        }
        if (arg2 == 1) {
            ++var5;
            ++var4;
        }
        if (arg0 >= -93) {
            this.field8046 = -8;
        }
        if (~arg2 == -3) {
            ++var4;
        }
        if (arg2 == 3) {
            ++var4;
            --var5;
        }
        if (~arg2 == -5) {
            --var5;
        }
        if (arg2 == 5) {
            --var5;
            --var4;
        }
        if (~arg2 == -7) {
            --var4;
        }
        if (~arg2 == -8) {
            ++var5;
            --var4;
        }
        if (super.field2637 != -1 && ~class195.field2367.method3273(super.field2637, 0).field3836 == -2) {
            super.field2637 = -1;
            super.field2655 = null;
        }
        if (~super.field2626 != 0) {
            class596 var6 = class276.field3774.method136(super.field2626, false);
            if (var6.field8600 && ~var6.field8614 != 0 && ~class195.field2367.method3273(var6.field8614, 0).field3836 == -2) {
                super.field2626 = -1;
            }
        }
        if (super.field2629 != -1) {
            class596 var7 = class276.field3774.method136(super.field2629, false);
            if (var7.field8600 && ~var7.field8614 != 0 && ~class195.field2367.method3273(var7.field8614, 0).field3836 == -2) {
                super.field2629 = -1;
            }
        }
        if (super.field2683 < 9) {
            ++super.field2683;
        }
        for (int var8 = super.field2683; ~var8 < -1; --var8) {
            super.field2689[var8] = super.field2689[var8 + -1];
            super.field2686[var8] = super.field2686[var8 + -1];
            super.field2679[var8] = super.field2679[var8 + -1];
        }
        super.field2689[0] = var4;
        super.field2686[0] = var5;
        super.field2679[0] = (byte) arg1;
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)I")
    public final int method1286(int arg0) {
        ++field8057;
        if (arg0 != 0) {
            return -22;
        } else {
            if (this.field8052.field4315 != null) {
                class323 var2 = this.field8052.method1881(class410.field5804, (byte) 26);
                if (var2 != null && var2.field4297 != -1) {
                    return var2.field4297;
                }
            }
            return this.field8052.field4297;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)I")
    public final int method1291(int arg0) {
        ++field8060;
        if (this.field8052.field4315 != null) {
            class323 var2 = this.field8052.method1881(class410.field5804, (byte) 120);
            if (var2 != null && ~var2.field4286 != 0) {
                return var2.field4286;
            }
        }
        if (arg0 <= 111) {
            this.field8063 = 3;
        }
        return this.field8052.field4286;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lr;Z)V")
    public final void method162(class165 arg0, boolean arg1) {
        if (arg1) {
            this.field8046 = -124;
        }
        ++field8058;
        if (this.field8052 != null) {
            if (super.field2682 || this.method3256(0, arg0, -5)) {
                class394 var3 = arg0.method315();
                var3.method724(super.field2588.method3060(16383));
                var3.method723(super.field530, super.field527 + -20, super.field531);
                this.method1283(super.field2687, super.field2682, var3, (byte) -7, arg0);
                super.field2687[0] = super.field2687[1] = super.field2687[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "(I)V")
    public final void method163(int arg0) {
        ++field8056;
        int var2 = -104 % ((arg0 - 35) / 54);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILr;I)Z")
    private final boolean method3256(int arg0, class165 arg1, int arg2) {
        ++field8065;
        int var4 = arg0;
        class573 var5 = this.method1280(arg2 ^ 4);
        class282 var6 = super.field2637 != -1 && super.field2596 == 0 ? class195.field2367.method3273(super.field2637, 0) : null;
        if (arg2 != -5) {
            this.method1294((byte) -28);
        }
        class282 var7 = ~super.field2634 == 0 || super.field2594 && var6 != null ? null : class195.field2367.method3273(super.field2634, 0);
        int var8 = var5.field8355;
        int var9 = var5.field8384;
        if (~var8 != -1 || var9 != 0 || ~var5.field8379 != -1 || ~var5.field8409 != -1) {
            arg0 |= 7;
        }
        boolean var10 = ~super.field2583 != -1 && ~class543.field7882 <= ~super.field2595 && ~class543.field7882 > ~super.field2645;
        if (var10) {
            arg0 |= 524288;
        }
        int var11 = super.field2588.method3060(16383);
        class55 var12 = super.field2687[0] = this.field8052.method1887(super.field2585, super.field2620, super.field2613, arg1, var7, super.field2662, true, var11, arg0, super.field2614, class195.field2367, class332.field4418, var6, super.field2608, super.field2642, super.field2632, class410.field5804);
        if (var12 == null) {
            return false;
        } else {
            super.field2624 = var12.method65();
            super.field2647 = var12.method72();
            this.method1282(arg2 + 42, var12);
            if (~var8 == -1 && var9 == 0) {
                this.method1289(this.method1284((byte) -124) << 9, (byte) 95, this.method1284((byte) -124) << 9, var11, 0, 0);
            } else {
                this.method1289(var8, (byte) 118, var9, var11, var5.field8376, var5.field8361);
                if (super.field2592 != 0) {
                    super.field2687[0].method126(super.field2592);
                }
                if (~super.field2611 != -1) {
                    super.field2687[0].method91(super.field2611);
                }
                if (~super.field2580 != -1) {
                    super.field2687[0].method64(0, super.field2580, 0);
                }
            }
            if (var10) {
                var12.method77(super.field2603, super.field2660, super.field2666, super.field2583 & 255);
            }
            if (super.field2626 != -1 && ~super.field2644 != 0) {
                class596 var13 = class276.field3774.method136(super.field2626, false);
                boolean var14 = ~var13.field8607 == -4 && (var8 != 0 || var9 != 0);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (super.field2667 != 0) {
                        var15 = var4 | 5;
                    }
                    if (~super.field2599 != -1) {
                        var15 |= 2;
                    }
                }
                class55 var16 = super.field2687[1] = var13.method3452(super.field2619, var15, arg1, arg2 + -2, class195.field2367, super.field2644, super.field2618);
                if (var16 != null) {
                    if (super.field2599 != 0) {
                        var16.method64(0, -super.field2599 << 2, 0);
                    }
                    if (~super.field2667 != -1) {
                        var16.method74(super.field2667 * 2048);
                    }
                    if (var14) {
                        if (~super.field2592 != -1) {
                            var16.method126(super.field2592);
                        }
                        if (super.field2611 != 0) {
                            var16.method91(super.field2611);
                        }
                        if (super.field2580 != 0) {
                            var16.method64(0, super.field2580, 0);
                        }
                    }
                }
            } else {
                super.field2687[1] = null;
            }
            if (~super.field2629 != 0 && super.field2605 != -1) {
                class596 var17 = class276.field3774.method136(super.field2629, false);
                boolean var18 = var17.field8607 == 3 && (var8 != 0 || ~var9 != -1);
                int var19 = var4;
                if (!var18) {
                    if (super.field2668 != 0) {
                        var19 = var4 | 5;
                    }
                    if (~super.field2609 != -1) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class55 var20 = super.field2687[2] = var17.method3454(super.field2605, super.field2648, class195.field2367, var19, arg1, super.field2661, 0);
                if (var20 != null) {
                    if (~super.field2609 != -1) {
                        var20.method64(0, -super.field2609 << 2, 0);
                    }
                    if (~super.field2668 != -1) {
                        var20.method74(super.field2668 * 2048);
                    }
                    if (var18) {
                        if (super.field2592 != 0) {
                            var20.method126(super.field2592);
                        }
                        if (~super.field2611 != -1) {
                            var20.method91(super.field2611);
                        }
                        if (~super.field2580 != -1) {
                            var20.method64(0, super.field2580, 0);
                        }
                    }
                }
            } else {
                super.field2687[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "(B)Z")
    private final boolean method3257(byte arg0) {
        ++field8045;
        if (arg0 != -100) {
            this.method169(60, -80, false, (class165) null, -43, (class20) null, 91);
        }
        return this.field8052.field4299;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIZLr;ILub;I)V")
    public final void method169(int arg0, int arg1, boolean arg2, class165 arg3, int arg4, class20 arg5, int arg6) {
        if (arg4 <= 113) {
            this.field8052 = null;
        }
        ++field8064;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(B)Z")
    public final boolean method167(byte arg0) {
        if (arg0 != 118) {
            field8062 = null;
        }
        ++field8049;
        return false;
    }

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "(B)Z")
    public final boolean method3258(byte arg0) {
        if (arg0 > -104) {
            this.method3255((byte) -65, 23, -27);
        }
        ++field8059;
        return this.field8052 != null;
    }
}
