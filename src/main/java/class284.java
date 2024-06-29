import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class284 extends class147 implements class503 {

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "B")
    private byte field3922;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "B")
    private byte field3905;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "Z")
    private boolean field3915;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "S")
    private short field3903;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "B")
    private byte field3904;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "Z")
    private boolean field3918;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "Z")
    private boolean field3909;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "Lba;")
    private class263 field3924;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "Lt;")
    private class471 field3927;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)I")
    public final int method496(int arg0) {
        ++field3913;
        int var2 = 39 % ((arg0 - -4) / 61);
        return this.field3904;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public final void method485(int arg0) {
        if (arg0 <= -92) {
            if (this.field3927 != null) {
                this.field3927.method371();
            }
            ++field3910;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    public static final void method1689(byte arg0) {
        int var1 = 91 % ((arg0 - -67) / 32);
        ++field3907;
        class433.field6357.method1068(0);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIBI)V")
    public static final void method1690(int arg0, int arg1, byte arg2, int arg3) {
        if (arg1 == 0) {
            class491.method2878((byte) 92, class188.field2725);
            ++class229.field3245;
        }
        ++field3914;
        if (~arg1 == -2) {
            ++class22.field306;
            class491.method2878((byte) 92, class389.field5669);
        }
        class481.field7027.method2302(-4, class310.field4231.method901(0, 82) ? 1 : 0);
        class481.field7027.method2307(class14.field204 + arg3, -1069935832);
        class481.field7027.method2307(class510.field7566 + arg0, -1069935832);
        class285.field3961 = arg3;
        class445.field6555 = false;
        class228.field3244 = arg0;
        class520.method3104((byte) -107);
        if (arg2 != -111) {
            method1690(16, -28, (byte) 42, 16);
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)I")
    public final int method490(int arg0) {
        ++field3916;
        return arg0 != -29679 ? -102 : this.field3903 & 65535;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)I")
    public final int method499(int arg0) {
        if (arg0 != -15561) {
            return -34;
        } else {
            ++field3919;
            return this.field3922;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIILya;)Lso;")
    private final class329 method1691(boolean arg0, int arg1, int arg2, class38 arg3) {
        ++field3912;
        if (arg1 != 0) {
            this.field3922 = -113;
        }
        class220 var5 = class78.field1141.method2103(this.field3903 & 65535, true);
        class142 var6;
        class142 var7;
        if (this.field3915) {
            var6 = class89.field1302[this.field3905];
            var7 = class385.field5608[0];
        } else {
            var6 = class385.field5608[this.field3905];
            if (this.field3905 < 3) {
                var7 = class385.field5608[this.field3905 - -1];
            } else {
                var7 = null;
            }
        }
        return var5.method1377(arg3, var6, this.field3922, -4735, super.field2119, arg0, var7, super.field2131, super.field2121, arg2, this.field3904);
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Z")
    public final boolean method489(int arg0) {
        ++field3920;
        int var2 = -40 % ((arg0 - 23) / 62);
        return this.field3909;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lya;B)Lmf;")
    public final class289 method484(class38 arg0, byte arg1) {
        ++field3908;
        if (this.field3927 == null) {
            return null;
        } else {
            if (arg1 < 111) {
                this.method499(46);
            }
            class122 var3 = arg0.method280();
            var3.method182(super.field2123 + super.field2119, super.field2131, super.field2121 - -super.field2134);
            class289 var4 = null;
            if (this.field3918) {
                var4 = class165.method1099(true, 1);
            }
            this.field3927.method397(var3, var4 == null ? null : var4.field4009[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(ILya;)V")
    public final void method486(int arg0, class38 arg1) {
        ++field3925;
        Object var3 = null;
        if (arg0 == 9229) {
            class263 var5;
            if (this.field3924 == null && this.field3909) {
                class329 var4 = this.method1691(true, arg0 + -9229, 262144, arg1);
                var5 = var4 == null ? null : var4.field4490;
            } else {
                var5 = this.field3924;
                this.field3924 = null;
            }
            if (var5 != null) {
                class195.method1212(var5, this.field3905, super.field2119, super.field2121, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lya;Ljo;IIIIZIIIII)V")
    public class284(class38 arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class46.method423(0, arg11, arg10));
        this.field3922 = (byte) arg11;
        super.field2119 = arg3;
        super.field2121 = arg5;
        this.field3905 = (byte) arg2;
        this.field3915 = arg6;
        this.field3903 = (short) arg1.field3110;
        this.field3904 = (byte) arg10;
        this.field3918 = ~arg1.field3119 != -1 && !arg6;
        this.field3909 = arg0.method314() && arg1.field3073 && !this.field3915 && ~class20.field269.method3085(class152.field2332, (byte) 105) != -1;
        class329 var13 = this.method1691(this.field3909, 0, 2048, arg0);
        if (var13 != null) {
            this.field3924 = var13.field4490;
            this.field3927 = var13.field4492;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lya;II)Lt;")
    private final class471 method1692(class38 arg0, int arg1, int arg2) {
        ++field3902;
        if (this.field3927 != null && ~arg0.method257(this.field3927.method372(), arg2) == -1) {
            return this.field3927;
        } else {
            class329 var4 = this.method1691(false, arg1, arg2, arg0);
            return var4 != null ? var4.field4492 : null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILya;)V")
    public final void method482(int arg0, class38 arg1) {
        ++field3906;
        Object var3 = null;
        class263 var5;
        if (this.field3924 == null && this.field3909) {
            class329 var4 = this.method1691(true, 0, 262144, arg1);
            var5 = var4 != null ? var4.field4490 : null;
        } else {
            var5 = this.field3924;
            this.field3924 = null;
        }
        if (var5 != null) {
            class365.method2203(var5, this.field3905, super.field2119, super.field2121, (boolean[]) null);
        }
        if (arg0 > -56) {
            this.field3915 = true;
        }
    }

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "(I)I")
    public final int method988(int arg0) {
        if (arg0 < 108) {
            method1690(126, -68, (byte) 38, 85);
        }
        ++field3926;
        return this.field3927 == null ? 0 : this.field3927.method380();
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLya;I)Lt;")
    public final class471 method488(byte arg0, class38 arg1, int arg2) {
        ++field3911;
        if (arg0 != 124) {
            this.method499(110);
        }
        return this.method1692(arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(ILya;)V")
    public final void method493(int arg0, class38 arg1) {
        if (arg0 < -114) {
            ++field3923;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZILya;I)Z")
    public final boolean method500(boolean arg0, int arg1, class38 arg2, int arg3) {
        ++field3917;
        if (!arg0) {
            return false;
        } else {
            class471 var5 = this.method1692(arg2, 0, 131072);
            if (var5 != null) {
                class122 var6 = arg2.method280();
                var6.method182(super.field2119, super.field2131, super.field2121);
                return var5.method391(arg3, arg1, var6, false);
            } else {
                return false;
            }
        }
    }
}
