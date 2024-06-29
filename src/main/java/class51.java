import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class51 extends class372 implements class41 {

    @OriginalMember(owner = "client!pv", name = "G", descriptor = "Lqp;")
    public class469 field674;

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "Z")
    private boolean field665;

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!pv", name = "A", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!pv", name = "B", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!pv", name = "C", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!pv", name = "D", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!pv", name = "E", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!pv", name = "F", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!pv", name = "H", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!pv", name = "I", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!pv", name = "J", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!pv", name = "K", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!pv", name = "L", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!pv", name = "M", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "(I)V", line = 4)
    public static final void method515(int arg0) {
        ++field678;
        if (arg0 != 262144) {
            field672 = 40;
        }
        client.field2572.method2640(114);
        class240.field3085.method2640(97);
        class109.field1476.method2640(87);
        class91.field1117.method2640(122);
        class159.field2028.method2640(89);
    }

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "(I)V", line = 19)
    public final void method191(int arg0) {
        ++field670;
        if (arg0 != 27223) {
            field672 = -72;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILya;)V", line = 29)
    public final void method184(int arg0, class38 arg1) {
        ++field671;
        if (arg0 == -5534) {
            this.field674.method2836(arg1, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(ILya;)V", line = 40)
    public final void method185(int arg0, class38 arg1) {
        if (arg0 == 15397) {
            this.field674.method2831(arg1, -3);
            ++field666;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILya;II)Z", line = 51)
    public final boolean method186(int arg0, class38 arg1, int arg2, int arg3) {
        ++field676;
        class474 var5 = this.field674.method2828(131072, arg1, false, -71, false, super.field4835, super.field4829);
        if (var5 == null) {
            return false;
        } else if (arg0 < 66) {
            return false;
        } else {
            class123 var6 = arg1.method369();
            var6.method229(super.field4830 + super.field4829, super.field4822, super.field4835 + super.field4831);
            return var5.method412(arg2, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)Z", line = 70)
    public final boolean method182(int arg0) {
        if (arg0 != -2286) {
            this.field674 = null;
        }
        ++field675;
        return this.field674.method2830((byte) 46);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lya;I)V", line = 81)
    public final void method192(class38 arg0, int arg1) {
        ++field673;
        class474 var3 = this.field674.method2828(262144, arg0, true, -49, false, super.field4835, super.field4829);
        if (arg1 == 1) {
            if (var3 != null) {
                int var4 = super.field4829 >> 7;
                int var5 = super.field4835 >> 7;
                this.field674.method2833(var5, var4, var3, var4, 4, var5, false, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)I", line = 104)
    public final int method187(int arg0) {
        ++field669;
        if (arg0 != 21067) {
            this.method187(-126);
        }
        return this.field674.field6799;
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(Z)I", line = 116)
    public final int method516(boolean arg0) {
        ++field667;
        if (!arg0) {
            this.method516(true);
        }
        return this.field674.method2825(14);
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)I", line = 130)
    public final int method189(int arg0) {
        if (arg0 != 32725) {
            return -102;
        } else {
            ++field668;
            return this.field674.field6796;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IILya;)Lt;", line = 146)
    public final class474 method179(int arg0, int arg1, class38 arg2) {
        if (arg1 <= 72) {
            this.field665 = true;
        }
        ++field680;
        return this.field674.method2828(arg0, arg2, false, -62, false, 0, 0);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZLya;)Llo;", line = 159)
    public final class531 method181(boolean arg0, class38 arg1) {
        ++field677;
        class474 var3 = this.field674.method2828(2048, arg1, arg0, -95, false, super.field4835, super.field4829);
        if (var3 == null) {
            return null;
        } else {
            class123 var4 = arg1.method369();
            var4.method229(super.field4829 - -super.field4830, super.field4822, super.field4835 + super.field4831);
            class531 var5 = null;
            if (this.field665) {
                var5 = class119.method850(1, -125);
            }
            if (this.field674.field6801 != null) {
                class517 var6 = this.field674.field6801.method594();
                arg1.method366(var3, var6, var4, var5 == null ? null : var5.field7810[0], 0);
            } else {
                var3.method415(var4, var5 == null ? null : var5.field7810[0], 0);
            }
            int var7 = super.field4829 >> 7;
            int var8 = super.field4835 >> 7;
            this.field674.method2833(var8, var7, var3, var7, 4, var8, true, arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lya;Lho;IIIIIZIIIIII)V", line = 198)
    public class51(class38 arg0, class102 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class384.method2172(98, arg12, arg11));
        this.field674 = new class469(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field665 = ~arg1.field1305 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)I", line = 208)
    public final int method178(boolean arg0) {
        ++field679;
        return !arg0 ? 44 : this.field674.field6782;
    }
}
