import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class341 extends class372 implements class41 {

    @OriginalMember(owner = "client!np", name = "P", descriptor = "Z")
    private boolean field4298;

    @OriginalMember(owner = "client!np", name = "F", descriptor = "B")
    private byte field4288;

    @OriginalMember(owner = "client!np", name = "I", descriptor = "Z")
    private boolean field4291;

    @OriginalMember(owner = "client!np", name = "O", descriptor = "B")
    private byte field4297;

    @OriginalMember(owner = "client!np", name = "W", descriptor = "S")
    private short field4304;

    @OriginalMember(owner = "client!np", name = "B", descriptor = "B")
    private byte field4284;

    @OriginalMember(owner = "client!np", name = "T", descriptor = "Z")
    private boolean field4301;

    @OriginalMember(owner = "client!np", name = "U", descriptor = "Lt;")
    private class474 field4302;

    @OriginalMember(owner = "client!np", name = "M", descriptor = "Lba;")
    private class264 field4295;

    @OriginalMember(owner = "client!np", name = "C", descriptor = "F")
    public static float field4285;

    @OriginalMember(owner = "client!np", name = "x", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!np", name = "y", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!np", name = "z", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!np", name = "D", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!np", name = "E", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!np", name = "G", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!np", name = "H", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!np", name = "J", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!np", name = "K", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!np", name = "L", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!np", name = "N", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!np", name = "Q", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!np", name = "V", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!np", name = "X", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!np", name = "Y", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!np", name = "R", descriptor = "[Z")
    public static boolean[] field4300;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(IILya;)Lt;")
    private final class474 method1962(int arg0, int arg1, class38 arg2) {
        ++field4287;
        if (this.field4302 != null && arg2.method307(this.field4302.method422(), arg0) == 0) {
            return this.field4302;
        } else {
            if (arg1 != 4977) {
                this.field4284 = -60;
            }
            class3 var4 = this.method1965((byte) -95, arg0, false, arg2);
            return var4 == null ? null : var4.field26;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lya;I)V")
    public final void method192(class38 arg0, int arg1) {
        ++field4282;
        if (arg1 != 1) {
            method1964(93);
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)I")
    public final int method187(int arg0) {
        if (arg0 != 21067) {
            this.method185(110, (class38) null);
        }
        ++field4281;
        return 65535 & this.field4304;
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(I)V")
    public final void method191(int arg0) {
        if (this.field4302 != null) {
            this.field4302.method439();
        }
        if (arg0 == 27223) {
            ++field4294;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)I")
    public final int method178(boolean arg0) {
        if (!arg0) {
            this.field4284 = 27;
        }
        ++field4286;
        return this.field4297;
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(Z)I")
    public final int method516(boolean arg0) {
        if (!arg0) {
            method1964(99);
        }
        ++field4296;
        return this.field4302 == null ? 0 : this.field4302.method418();
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)Z")
    public final boolean method182(int arg0) {
        ++field4289;
        if (arg0 != -2286) {
            this.method516(true);
        }
        return this.field4301;
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(I)I")
    public final int method189(int arg0) {
        ++field4303;
        if (arg0 != 32725) {
            this.method184(-110, (class38) null);
        }
        return this.field4284;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(ILya;)V")
    public final void method185(int arg0, class38 arg1) {
        ++field4293;
        Object var3 = null;
        class264 var5;
        if (this.field4295 == null && this.field4301) {
            class3 var4 = this.method1965((byte) -95, 262144, true, arg1);
            var5 = var4 != null ? var4.field28 : null;
        } else {
            var5 = this.field4295;
            this.field4295 = null;
        }
        if (arg0 != 15397) {
            this.field4301 = true;
        }
        if (var5 != null) {
            class481.method2933(var5, this.field4288, super.field4829, super.field4835, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lya;Lho;IIIIZIIIII)V")
    public class341(class38 arg0, class102 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class365.method2093(true, arg10, arg11));
        this.field4298 = arg6;
        this.field4288 = (byte) arg2;
        this.field4291 = arg1.field1305 != 0 && !arg6;
        this.field4297 = (byte) arg11;
        super.field4829 = arg3;
        this.field4304 = (short) arg1.field1316;
        this.field4284 = (byte) arg10;
        super.field4835 = arg5;
        this.field4301 = arg0.method281() && arg1.field1312 && !this.field4298 && ~class407.field5817.method1681(class377.field4959, -28198) != -1;
        class3 var13 = this.method1965((byte) -95, 2048, this.field4301, arg0);
        if (var13 != null) {
            this.field4302 = var13.field26;
            this.field4295 = var13.field28;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IILya;)Lt;")
    public final class474 method179(int arg0, int arg1, class38 arg2) {
        if (arg1 <= 72) {
            this.method189(-60);
        }
        ++field4299;
        return this.method1962(arg0, 4977, arg2);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZLya;)Llo;")
    public final class531 method181(boolean arg0, class38 arg1) {
        ++field4305;
        if (this.field4302 == null) {
            return null;
        } else {
            class123 var3 = arg1.method369();
            var3.method229(super.field4830 + super.field4829, super.field4822, super.field4835 + super.field4831);
            class531 var4 = null;
            if (this.field4291) {
                var4 = class119.method850(1, 101);
            }
            if (!arg0) {
                this.field4304 = 61;
            }
            this.field4302.method415(var3, var4 != null ? var4.field7810[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method186(int arg0, class38 arg1, int arg2, int arg3) {
        ++field4290;
        class474 var5 = this.method1962(131072, 4977, arg1);
        if (var5 != null) {
            class123 var6 = arg1.method369();
            var6.method229(super.field4829, super.field4822, super.field4835);
            return var5.method412(arg2, arg3, var6, false);
        } else {
            return arg0 <= 66 ? false : false;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method1963(int arg0, String arg1) {
        if (arg0 != 10) {
            method1964(-49);
        }
        ++field4283;
        return class319.method1878(true, (byte) 56, arg1, 10);
    }

    @OriginalMember(owner = "client!np", name = "g", descriptor = "(I)V")
    public static void method1964(int arg0) {
        field4300 = null;
        if (arg0 != 1) {
            method1963(-76, (String) null);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILya;)V")
    public final void method184(int arg0, class38 arg1) {
        ++field4306;
        if (arg0 != -5534) {
            this.field4304 = 106;
        }
        Object var3 = null;
        class264 var5;
        if (this.field4295 == null && this.field4301) {
            class3 var4 = this.method1965((byte) -95, 262144, true, arg1);
            var5 = var4 == null ? null : var4.field28;
        } else {
            var5 = this.field4295;
            this.field4295 = null;
        }
        if (var5 != null) {
            class125.method880(var5, this.field4288, super.field4829, super.field4835, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BIZLya;)Ldp;")
    private final class3 method1965(byte arg0, int arg1, boolean arg2, class38 arg3) {
        if (arg0 != -95) {
            field4300 = null;
        }
        ++field4292;
        class102 var5 = class315.field4017.method1958(-10091, this.field4304 & 65535);
        class143 var6;
        class143 var7;
        if (this.field4298) {
            var6 = class531.field7811[0];
            var7 = class140.field1808[this.field4288];
        } else {
            var7 = class531.field7811[this.field4288];
            if (this.field4288 >= 3) {
                var6 = null;
            } else {
                var6 = class531.field7811[this.field4288 + 1];
            }
        }
        return var5.method770(super.field4829, super.field4822, arg2, var6, this.field4284, arg3, arg1, -117, var7, super.field4835, this.field4297);
    }
}
