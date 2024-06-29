import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class383 extends class119 implements class721 {

    @OriginalMember(owner = "client!dda", name = "db", descriptor = "Z")
    private boolean field5785;

    @OriginalMember(owner = "client!dda", name = "ob", descriptor = "B")
    private byte field5796;

    @OriginalMember(owner = "client!dda", name = "cb", descriptor = "S")
    private short field5784;

    @OriginalMember(owner = "client!dda", name = "lb", descriptor = "B")
    private byte field5793;

    @OriginalMember(owner = "client!dda", name = "hb", descriptor = "Z")
    private boolean field5789;

    @OriginalMember(owner = "client!dda", name = "rb", descriptor = "Z")
    private boolean field5799;

    @OriginalMember(owner = "client!dda", name = "X", descriptor = "Z")
    private boolean field5779;

    @OriginalMember(owner = "client!dda", name = "nb", descriptor = "Lka;")
    public class473 field5795;

    @OriginalMember(owner = "client!dda", name = "sb", descriptor = "Lr;")
    private class183 field5800;

    @OriginalMember(owner = "client!dda", name = "T", descriptor = "I")
    public static int field5775 = 0;

    @OriginalMember(owner = "client!dda", name = "K", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!dda", name = "L", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!dda", name = "M", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!dda", name = "N", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!dda", name = "O", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!dda", name = "P", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!dda", name = "Q", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!dda", name = "R", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!dda", name = "S", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!dda", name = "U", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!dda", name = "V", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!dda", name = "W", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!dda", name = "Y", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!dda", name = "Z", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!dda", name = "ab", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!dda", name = "bb", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!dda", name = "eb", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!dda", name = "fb", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!dda", name = "gb", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!dda", name = "ib", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!dda", name = "jb", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!dda", name = "mb", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!dda", name = "pb", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!dda", name = "qb", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!dda", name = "kb", descriptor = "Lria;")
    private class286 field5792;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dda", name = "tb", descriptor = "Ljava/lang/Class;")
    public static Class field5801;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "(B)Z")
    public final boolean method738(byte arg0) {
        ++field5777;
        if (arg0 != 88) {
            this.field5799 = true;
        }
        return this.field5799;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lha;I)Lria;")
    public final class286 method325(class60 arg0, int arg1) {
        if (this.field5792 == null) {
            this.field5792 = class60.method527(this.method2464(arg0, true, 0), super.field8428, super.field8423, super.field8421, arg1 + -92182060);
        }
        ++field5769;
        return arg1 != 92160000 ? null : this.field5792;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)I")
    public final int method317(int arg0) {
        ++field5788;
        if (arg0 < 112) {
            this.method321((byte) -93);
        }
        return this.field5784 & 65535;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)V")
    public final void method316(byte arg0) {
        ++field5776;
        if (arg0 != -66) {
            this.field5785 = true;
        }
        if (this.field5795 != null) {
            this.field5795.method272();
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(Lha;B)Lc;")
    public final class187 method319(class60 arg0, byte arg1) {
        ++field5791;
        int var3 = 116 / ((arg1 - -25) / 60);
        if (this.field5795 == null) {
            return null;
        } else {
            class738 var4 = arg0.method442();
            var4.method774(super.field8423, super.field8421, super.field8428);
            class187 var5 = class650.method3774(124, this.field5789, 1);
            if (class418.field6258) {
                this.field5795.method235(var4, var5.field2851[0], class188.field2859, 0);
            } else {
                this.field5795.method265(var4, var5.field2851[0], 0);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lha;B)V")
    public final void method310(class60 arg0, byte arg1) {
        if (arg1 != -88) {
            this.field5796 = -10;
        }
        ++field5766;
        Object var3 = null;
        class183 var5;
        if (this.field5800 == null && this.field5779) {
            class77 var4 = this.method2465(arg0, (byte) 10, 262144, true);
            var5 = var4 == null ? null : var4.field1067;
        } else {
            var5 = this.field5800;
            this.field5800 = null;
        }
        if (var5 != null) {
            class58.method405(var5, super.field8417, super.field8423, super.field8428, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)I")
    public final int method327(int arg0) {
        ++field5798;
        if (arg0 > -116) {
            this.method314((class60) null, false);
        }
        return this.field5796;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILvs;ZILha;II)V")
    public final void method737(int arg0, class593 arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        ++field5786;
        if (arg0 != 8616) {
            this.field5793 = 50;
        }
        if (!(arg1 instanceof class631)) {
            if (arg1 instanceof class383) {
                class383 var8 = (class383) arg1;
                if (this.field5795 != null && var8.field5795 != null) {
                    this.field5795.method264(var8.field5795, arg6, arg3, arg5, arg2);
                    return;
                }
            }
        } else {
            class631 var9 = (class631) arg1;
            if (this.field5795 == null || var9.field8818 == null) {
                return;
            }
            this.field5795.method264(var9.field8818, arg6, arg3, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method2462(byte arg0, String arg1) {
        ++field5797;
        if (arg0 <= 28) {
            method2462((byte) -24, (String) null);
        }
        return class430.method2678(5, field5801 != null ? field5801 : (field5801 = method2466("qfa")), arg1);
    }

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "(I)I")
    public final int method2463(int arg0) {
        if (arg0 != 65536) {
            this.method327(82);
        }
        ++field5780;
        return this.field5795 == null ? 15 : this.field5795.method256() / 4;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lha;Lsu;IIIIIZIIIIIIZ)V")
    public class383(class60 arg0, class211 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field3123 == -2, class181.method1282(arg12, false, arg13));
        super.field8417 = (byte) arg3;
        this.field5785 = arg7;
        this.field5796 = (byte) arg13;
        this.field5784 = (short) arg1.field3158;
        this.field5793 = (byte) arg12;
        this.field5789 = ~arg1.field3113 != -1 && !arg7;
        this.field5799 = arg14;
        this.field5779 = arg0.method456() && arg1.field3175 && !this.field5785 && class63.field916.field10185.method2160(17503) != 0;
        int var16 = 2048;
        if (this.field5799) {
            var16 |= 65536;
        }
        class77 var17 = this.method2465(arg0, (byte) 10, var16, this.field5779);
        if (var17 != null) {
            this.field5795 = var17.field1068;
            this.field5800 = var17.field1067;
            if (this.field5799) {
                this.field5795 = this.field5795.method251((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lha;Z)V")
    public final void method314(class60 arg0, boolean arg1) {
        ++field5781;
        if (arg1) {
            this.method321((byte) -75);
        }
    }

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "(B)I")
    public final int method315(byte arg0) {
        if (arg0 != 106) {
            return -122;
        } else {
            ++field5771;
            return this.field5795 != null ? this.field5795.method253() : 0;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILha;)V")
    public final void method318(int arg0, class60 arg1) {
        ++field5772;
        Object var3 = null;
        class183 var5;
        if (this.field5800 == null && this.field5779) {
            class77 var4 = this.method2465(arg1, (byte) 10, 262144, true);
            var5 = var4 == null ? null : var4.field1067;
        } else {
            var5 = this.field5800;
            this.field5800 = null;
        }
        int var6 = 41 % ((arg0 - 8) / 57);
        if (var5 != null) {
            class467.method2833(var5, super.field8417, super.field8423, super.field8428, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)Z")
    public final boolean method321(byte arg0) {
        if (arg0 >= -125) {
            this.field5793 = 93;
        }
        ++field5782;
        return this.field5779;
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(B)I")
    public final int method309(byte arg0) {
        ++field5768;
        return arg0 > -16 ? -18 : this.field5793;
    }

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "(B)Z")
    public final boolean method320(byte arg0) {
        if (arg0 != 84) {
            this.field5779 = false;
        }
        ++field5787;
        if (this.field5795 != null) {
            return !this.field5795.method262();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "(B)I")
    public final int method313(byte arg0) {
        if (arg0 != 3) {
            this.field5789 = true;
        }
        ++field5774;
        return this.field5795 != null ? this.field5795.method269() : 0;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lha;ZI)Lka;")
    private final class473 method2464(class60 arg0, boolean arg1, int arg2) {
        ++field5778;
        if (this.field5795 != null && arg0.method491(this.field5795.method255(), arg2) == 0) {
            return this.field5795;
        } else if (!arg1) {
            return null;
        } else {
            class77 var4 = this.method2465(arg0, (byte) 10, arg2, false);
            return var4 != null ? var4.field1068 : null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "(I)V")
    public final void method741(int arg0) {
        this.field5799 = false;
        ++field5773;
        if (this.field5795 != null) {
            this.field5795.method271(-65537 & this.field5795.method255());
        }
        if (arg0 >= -93) {
            this.method741(-43);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lha;BIZ)Lqw;")
    private final class77 method2465(class60 arg0, byte arg1, int arg2, boolean arg3) {
        ++field5794;
        class211 var5 = class239.field3470.method388(this.field5784 & 65535, 100);
        if (arg1 != 10) {
            this.method309((byte) -87);
        }
        class280 var6;
        class280 var7;
        if (this.field5785) {
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
        return var5.method1443((byte) 119, arg3, var6, ~this.field5793 == -12 ? 4 - -this.field5796 : this.field5796, super.field8421, arg2, (class572) null, this.field5793 != 11 ? this.field5793 : 10, arg0, super.field8423, super.field8428, var7);
    }

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "(B)Z")
    public final boolean method329(byte arg0) {
        ++field5770;
        if (this.field5795 != null) {
            return this.field5795.method275();
        } else {
            int var2 = 37 % ((-33 - arg0) / 42);
            return false;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IBLha;I)Z")
    public final boolean method312(int arg0, byte arg1, class60 arg2, int arg3) {
        ++field5767;
        if (arg1 > -44) {
            this.method316((byte) 68);
        }
        class473 var5 = this.method2464(arg2, true, 131072);
        if (var5 != null) {
            class738 var6 = arg2.method442();
            var6.method774(super.field8423, super.field8421, super.field8428);
            return class418.field6258 ? var5.method283(arg0, arg3, var6, false, 0, class188.field2859) : var5.method277(arg0, arg3, var6, false, 0);
        } else {
            return false;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2466(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
