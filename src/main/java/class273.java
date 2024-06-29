import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class273 extends class383 implements class196 {

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "S")
    private short field3801;

    @OriginalMember(owner = "client!jp", name = "M", descriptor = "Z")
    private boolean field3811;

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "Z")
    private boolean field3808;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "B")
    private byte field3789;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "Z")
    private boolean field3803;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "B")
    private byte field3787;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "Z")
    private boolean field3797;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "Lc;")
    private class201 field3785;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "Lj;")
    private class229 field3795;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "Z")
    public static boolean field3786 = false;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "F")
    public static float field3792;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!jp", name = "L", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V")
    public static final void method1740(boolean arg0) {
        if (class374.field5734 != null) {
            class374.field5734.method1588(7);
        }
        ++field3805;
        if (!arg0) {
            field3786 = true;
        }
        if (class133.field1929 != null) {
            class133.field1929.method1588(7);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IBLqa;)Lc;")
    private final class201 method1741(int arg0, byte arg1, class496 arg2) {
        ++field3810;
        if (this.field3785 != null && ~arg2.method1141(this.field3785.method279(), arg0) == -1) {
            return this.field3785;
        } else if (arg1 != 124) {
            return null;
        } else {
            class454 var4 = this.method1742(arg2, false, false, arg0);
            return var4 != null ? var4.field6670 : null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLqa;)V")
    public final void method55(byte arg0, class496 arg1) {
        ++field3794;
        if (arg0 < -31) {
            Object var3 = null;
            class229 var5;
            if (this.field3795 == null && this.field3797) {
                class454 var4 = this.method1742(arg1, false, true, 262144);
                var5 = var4 == null ? null : var4.field6667;
            } else {
                var5 = this.field3795;
                this.field3795 = null;
            }
            if (var5 != null) {
                class457.method2753(var5, this.field3787, super.field5838, super.field5835, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method56(int arg0, int arg1, int arg2, class496 arg3) {
        ++field3806;
        if (arg1 != 3) {
            this.method1742((class496) null, true, true, -10);
        }
        class201 var5 = this.method1741(131072, (byte) 124, arg3);
        if (var5 != null) {
            class23 var6 = arg3.method1088();
            var6.method185(super.field5838, super.field5837, super.field5835);
            return var5.method310(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(B)V")
    public final void method59(byte arg0) {
        if (this.field3785 != null) {
            this.field3785.method295();
        }
        ++field3807;
        int var2 = -60 % ((27 - arg0) / 63);
    }

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "(I)V")
    public final void method57(int arg0) {
        if (arg0 != -5077) {
            this.field3797 = true;
        }
        this.field3803 = false;
        ++field3788;
        if (this.field3785 != null) {
            this.field3785.method297(this.field3785.method279() & -65537);
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)I")
    public final int method66(int arg0) {
        if (arg0 != -7234) {
            return -18;
        } else {
            ++field3790;
            return this.field3789;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lqa;I)Lpj;")
    public final class507 method51(class496 arg0, int arg1) {
        ++field3791;
        if (this.field3785 == null) {
            return null;
        } else {
            if (arg1 != -150) {
                this.field3797 = false;
            }
            class23 var3 = arg0.method1088();
            var3.method185(super.field5838, super.field5837, super.field5835);
            class507 var4 = null;
            if (this.field3808) {
                var4 = class82.method527(1, 1761171873);
            }
            this.field3785.method318(var3, var4 != null ? var4.field7549[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)I")
    public final int method63(byte arg0) {
        ++field3802;
        if (arg0 != 63) {
            this.method66(69);
        }
        return 22;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)I")
    public final int method50(int arg0) {
        ++field3784;
        if (arg0 != 25707) {
            this.field3801 = -122;
        }
        return 65535 & this.field3801;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lqa;ZZI)Lfo;")
    private final class454 method1742(class496 arg0, boolean arg1, boolean arg2, int arg3) {
        ++field3799;
        if (arg1) {
            return null;
        } else {
            class130 var5 = class56.field755.method2031(-82, 65535 & this.field3801);
            class206 var6;
            class206 var7;
            if (this.field3811) {
                var6 = class204.field2871[0];
                var7 = class187.field2632[this.field3787];
            } else {
                if (this.field3787 < 3) {
                    var6 = class204.field2871[this.field3787 - -1];
                } else {
                    var6 = null;
                }
                var7 = class204.field2871[this.field3787];
            }
            return var5.method831(3, arg3, 22, super.field5838, super.field5835, this.field3789, var7, var6, arg2, arg0, super.field5837);
        }
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)Z")
    public final boolean method49(int arg0) {
        ++field3793;
        if (arg0 != 7) {
            this.method1741(38, (byte) -77, (class496) null);
        }
        return this.field3803;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(BLqa;)V")
    public final void method62(byte arg0, class496 arg1) {
        if (arg0 != -126) {
            this.method67(58, (class496) null);
        }
        ++field3809;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)Z")
    public final boolean method60(byte arg0) {
        if (arg0 > -108) {
            this.method51((class496) null, 27);
        }
        ++field3796;
        return this.field3797;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILqa;B)Lc;")
    public final class201 method53(int arg0, class496 arg1, byte arg2) {
        int var4 = -7 / ((arg2 - -62) / 39);
        ++field3804;
        return this.method1741(arg0, (byte) 124, arg1);
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lqa;Leu;IIIIZIZ)V")
    public class273(class496 arg0, class130 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field1896, arg1.field1909);
        this.field3801 = (short) arg1.field1826;
        this.field3811 = arg6;
        this.field3808 = ~arg1.field1886 != -1 && !arg6;
        super.field5835 = arg5;
        super.field5838 = arg3;
        this.field3789 = (byte) arg7;
        this.field3803 = arg8;
        this.field3787 = (byte) arg2;
        this.field3797 = arg0.method1145() && arg1.field1884 && !this.field3811 && class96.field1399.method2170(class441.field6563, true) != 0;
        int var10 = 2048;
        if (this.field3803) {
            var10 |= 65536;
        }
        class454 var11 = this.method1742(arg0, false, this.field3797, var10);
        if (var11 != null) {
            this.field3785 = var11.field6670;
            this.field3795 = var11.field6667;
            if (this.field3803) {
                this.field3785 = this.field3785.method292((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILqa;)V")
    public final void method67(int arg0, class496 arg1) {
        ++field3800;
        Object var3 = null;
        class229 var5;
        if (this.field3795 == null && this.field3797) {
            class454 var4 = this.method1742(arg1, false, true, 262144);
            var5 = var4 == null ? null : var4.field6667;
        } else {
            var5 = this.field3795;
            this.field3795 = null;
        }
        if (var5 != null) {
            class220.method1489(var5, this.field3787, super.field5838, super.field5835, (boolean[]) null);
        }
        int var6 = 33 % ((arg0 - 59) / 60);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lqv;BLqa;IZII)V")
    public final void method61(class49 arg0, byte arg1, class496 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field3798;
        if (arg1 != 118) {
            this.field3811 = true;
        }
        if (arg0 instanceof class273) {
            class273 var8 = (class273) arg0;
            if (this.field3785 != null && var8.field3785 != null) {
                this.field3785.method298(var8.field3785, arg5, arg6, arg3, arg4);
                return;
            }
        }
    }
}
