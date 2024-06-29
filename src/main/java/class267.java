import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class267 extends class343 implements class721 {

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "B")
    private byte field3819;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "Z")
    private boolean field3811;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "S")
    private short field3807;

    @OriginalMember(owner = "client!rh", name = "cb", descriptor = "Z")
    private boolean field3824;

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "Z")
    private boolean field3817;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "Z")
    private boolean field3814;

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "Lr;")
    private class183 field3822;

    @OriginalMember(owner = "client!rh", name = "nb", descriptor = "Lka;")
    private class473 field3835;

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "Z")
    public static boolean field3823 = false;

    @OriginalMember(owner = "client!rh", name = "hb", descriptor = "D")
    public static double field3829;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!rh", name = "db", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!rh", name = "eb", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!rh", name = "fb", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!rh", name = "gb", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!rh", name = "ib", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!rh", name = "jb", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!rh", name = "kb", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!rh", name = "lb", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!rh", name = "mb", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "Lria;")
    private class286 field3809;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "(B)I")
    public final int method315(byte arg0) {
        if (arg0 != 106) {
            this.field3811 = false;
        }
        ++field3810;
        return this.field3835 != null ? this.field3835.method253() : 0;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V")
    public final void method316(byte arg0) {
        if (this.field3835 != null) {
            this.field3835.method272();
        }
        ++field3831;
        if (arg0 != -66) {
            this.field3811 = false;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Z")
    public final boolean method321(byte arg0) {
        ++field3816;
        if (arg0 > -125) {
            this.method315((byte) 26);
        }
        return this.field3814;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLha;I)Lka;")
    private final class473 method1712(byte arg0, class60 arg1, int arg2) {
        ++field3825;
        if (this.field3835 != null && arg1.method491(this.field3835.method255(), arg2) == 0) {
            return this.field3835;
        } else {
            int var4 = 22 % ((-63 - arg0) / 57);
            class77 var5 = this.method1714(false, 39, arg1, arg2);
            return var5 != null ? var5.field1068 : null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "(B)I")
    public final int method313(byte arg0) {
        if (arg0 != 3) {
            return 73;
        } else {
            ++field3832;
            return this.field3835 != null ? this.field3835.method269() : 0;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lha;B)V")
    public final void method310(class60 arg0, byte arg1) {
        ++field3830;
        Object var3 = null;
        if (arg1 == -88) {
            class183 var5;
            if (this.field3822 == null && this.field3814) {
                class77 var4 = this.method1714(true, 121, arg0, 262144);
                var5 = var4 == null ? null : var4.field1067;
            } else {
                var5 = this.field3822;
                this.field3822 = null;
            }
            if (var5 != null) {
                class58.method405(var5, super.field8417, super.field8423, super.field8428, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)I")
    public final int method317(int arg0) {
        if (arg0 < 112) {
            this.field3822 = null;
        }
        ++field3813;
        return this.field3807 & 65535;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lha;Z)V")
    public final void method314(class60 arg0, boolean arg1) {
        ++field3828;
        if (arg1) {
            this.field3809 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILvs;ZILha;II)V")
    public final void method737(int arg0, class593 arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        if (arg1 instanceof class267) {
            class267 var8 = (class267) arg1;
            if (this.field3835 != null && var8.field3835 != null) {
                this.field3835.method264(var8.field3835, arg6, arg3, arg5, arg2);
            }
        }
        if (arg0 != 8616) {
            this.method317(-99);
        }
        ++field3827;
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(B)Z")
    public final boolean method738(byte arg0) {
        ++field3821;
        if (arg0 != 88) {
            this.field3824 = true;
        }
        return this.field3824;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lha;I)Lria;")
    public final class286 method325(class60 arg0, int arg1) {
        if (arg1 != 92160000) {
            this.field3822 = null;
        }
        ++field3806;
        if (this.field3809 == null) {
            this.field3809 = class60.method527(this.method1712((byte) 37, arg0, 0), super.field8428, super.field8423, super.field8421, -22060);
        }
        return this.field3809;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBLha;I)Z")
    public final boolean method312(int arg0, byte arg1, class60 arg2, int arg3) {
        ++field3805;
        if (arg1 >= -44) {
            this.method741(38);
        }
        class473 var5 = this.method1712((byte) -121, arg2, 131072);
        if (var5 != null) {
            class738 var6 = arg2.method442();
            var6.method774(super.field8423, super.field8421, super.field8428);
            return class418.field6258 ? var5.method283(arg0, arg3, var6, false, 0, class188.field2859) : var5.method277(arg0, arg3, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "(B)Z")
    public static final boolean method1713(byte arg0) {
        ++field3808;
        if (arg0 != -114) {
            field3829 = 2.5038672708677194D;
        }
        return ~class68.field969 < -1;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lha;Lsu;IIIIIZIZ)V")
    public class267(class60 arg0, class211 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field3083);
        this.field3819 = (byte) arg8;
        super.field8423 = arg4;
        this.field3811 = arg1.field3113 != 0 && !arg7;
        this.field3807 = (short) arg1.field3158;
        super.field8428 = arg6;
        this.field3824 = arg9;
        this.field3817 = arg7;
        this.field3814 = arg0.method456() && arg1.field3175 && !this.field3817 && ~class63.field916.field10185.method2160(17503) != -1;
        int var11 = 2048;
        if (this.field3824) {
            var11 |= 65536;
        }
        class77 var12 = this.method1714(this.field3814, 108, arg0, var11);
        if (var12 != null) {
            this.field3822 = var12.field1067;
            this.field3835 = var12.field1068;
            if (this.field3824) {
                this.field3835 = this.field3835.method251((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZILha;I)Lqw;")
    private final class77 method1714(boolean arg0, int arg1, class60 arg2, int arg3) {
        ++field3815;
        if (arg1 < 7) {
            this.field3822 = null;
        }
        class211 var5 = class239.field3470.method388(this.field3807 & 65535, 100);
        class280 var6;
        class280 var7;
        if (this.field3817) {
            var6 = class531.field7566[0];
            var7 = class46.field568[super.field8417];
        } else {
            if (super.field8417 < 3) {
                var6 = class531.field7566[super.field8417 + 1];
            } else {
                var6 = null;
            }
            var7 = class531.field7566[super.field8417];
        }
        return var5.method1443((byte) 92, arg0, var6, this.field3819, super.field8421, arg3, (class572) null, 22, arg2, super.field8423, super.field8428, var7);
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)I")
    public final int method309(byte arg0) {
        if (arg0 >= -16) {
            field3829 = -0.399653691295498D;
        }
        ++field3826;
        return 22;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILha;)V")
    public final void method318(int arg0, class60 arg1) {
        ++field3833;
        int var3 = 21 % ((8 - arg0) / 57);
        Object var4 = null;
        class183 var6;
        if (this.field3822 == null && this.field3814) {
            class77 var5 = this.method1714(true, 23, arg1, 262144);
            var6 = var5 == null ? null : var5.field1067;
        } else {
            var6 = this.field3822;
            this.field3822 = null;
        }
        if (var6 != null) {
            class467.method2833(var6, super.field8417, super.field8423, super.field8428, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "(B)Z")
    public final boolean method329(byte arg0) {
        ++field3804;
        int var2 = -8 % ((arg0 - -33) / 42);
        return this.field3835 != null ? this.field3835.method275() : false;
    }

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "(B)Z")
    public final boolean method320(byte arg0) {
        ++field3834;
        if (arg0 != 84) {
            return false;
        } else if (this.field3835 != null) {
            return !this.field3835.method262();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Lha;B)Lc;")
    public final class187 method319(class60 arg0, byte arg1) {
        ++field3812;
        if (this.field3835 == null) {
            return null;
        } else {
            class738 var3 = arg0.method442();
            var3.method774(super.field8423, super.field8421, super.field8428);
            class187 var4 = class650.method3774(122, this.field3811, 1);
            int var5 = 15 % ((arg1 - -25) / 60);
            if (!class418.field6258) {
                this.field3835.method265(var3, var4.field2851[0], 0);
            } else {
                this.field3835.method235(var3, var4.field2851[0], class188.field2859, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)I")
    public final int method327(int arg0) {
        ++field3820;
        if (arg0 >= -116) {
            this.method1714(false, 119, (class60) null, -34);
        }
        return this.field3819;
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
    public final void method741(int arg0) {
        if (arg0 >= -93) {
            this.field3817 = false;
        }
        ++field3818;
        this.field3824 = false;
        if (this.field3835 != null) {
            this.field3835.method271(this.field3835.method255() & -65537);
        }
    }
}
