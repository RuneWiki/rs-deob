import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class307 extends class327 implements class381 {

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "Lql;")
    public class477 field4072;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "Z")
    private boolean field4057;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "Z")
    public static boolean field4055 = false;

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
    public static int field4058 = 0;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!ap", name = "E", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "(I)Z")
    public final boolean method17(int arg0) {
        ++field4059;
        if (arg0 != 7) {
            field4058 = -13;
        }
        return false;
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)I")
    public final int method9(int arg0) {
        if (arg0 != -769) {
            return 112;
        } else {
            ++field4065;
            return this.field4072.field6590;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)I")
    public final int method4(int arg0) {
        ++field4056;
        return arg0 != -10666 ? -7 : this.field4072.field6596;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILwm;I)Lgn;")
    public final class456 method15(int arg0, class364 arg1, int arg2) {
        if (arg2 != -28045) {
            return null;
        } else {
            ++field4070;
            return this.field4072.method2796(false, false, arg1, arg0, 0, 0, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLwm;)V")
    public final void method12(byte arg0, class364 arg1) {
        if (arg0 <= 27) {
            this.method4(-114);
        }
        ++field4066;
        this.field4072.method2785(arg1, -27576);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lwm;I)V")
    public final void method16(class364 arg0, int arg1) {
        if (arg1 != 31591) {
            this.method10((class364) null, (byte) -8);
        }
        ++field4060;
        this.field4072.method2795(106, arg0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)Z")
    public final boolean method7(boolean arg0) {
        if (arg0) {
            this.field4057 = false;
        }
        ++field4068;
        return this.field4072.method2793(-127);
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lwm;Lct;IIIIIZIII)V")
    public class307(class364 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class390.method2393(arg8, -111, arg9));
        this.field4072 = new class477(arg0, arg1, arg8, arg9, arg2, arg3, super.field4364, super.field4362, arg7, arg10);
        this.field4057 = arg1.field1265 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)I")
    public final int method13(int arg0) {
        ++field4067;
        if (arg0 < 51) {
            this.method13(-78);
        }
        return this.field4072.field6595;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIBLwm;)Z")
    public final boolean method14(int arg0, int arg1, byte arg2, class364 arg3) {
        ++field4062;
        if (arg2 > -107) {
            field4055 = false;
        }
        class456 var5 = this.field4072.method2796(false, false, arg3, 65536, super.field4362, super.field4364, (byte) -126);
        if (var5 == null) {
            return false;
        } else {
            class203 var6 = arg3.method1960();
            var6.method1029(super.field4364, super.field4361, super.field4362);
            return var5.method1882(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIILwm;ZLhp;Z)V")
    public final void method2(int arg0, int arg1, int arg2, class364 arg3, boolean arg4, class197 arg5, boolean arg6) {
        ++field4071;
        if (arg6) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lwm;B)V")
    public final void method10(class364 arg0, byte arg1) {
        ++field4064;
        class456 var3 = this.field4072.method2796(true, true, arg0, 131072, super.field4362, super.field4364, (byte) -117);
        if (var3 != null) {
            this.field4072.method2790(arg0, super.field4362 >> 7, var3, super.field4364 >> 7, super.field4362 >> 7, false, (byte) 99, super.field4364 >> 7);
        }
        if (arg1 > -48) {
            this.field4057 = false;
        }
    }

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "(I)V")
    public final void method8(int arg0) {
        if (arg0 < -74) {
            ++field4069;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V")
    public final void method1(int arg0) {
        ++field4061;
        if (arg0 > -105) {
            this.method7(true);
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(Lwm;B)Lnf;")
    public final class374 method3(class364 arg0, byte arg1) {
        ++field4063;
        class456 var3 = this.field4072.method2796(true, false, arg0, 1024, super.field4362, super.field4364, (byte) -121);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 < 99) {
                this.method12((byte) 124, (class364) null);
            }
            class203 var4 = arg0.method1960();
            var4.method1029(super.field4364, super.field4361, super.field4362);
            class374 var5 = null;
            if (this.field4057) {
                var5 = class358.method2196(1, (byte) -126);
            }
            if (this.field4072.field6610 == null) {
                var3.method1880(var4, var5 != null ? var5.field5156[0] : null, 0);
            } else {
                class342 var6 = this.field4072.field6610.method1441();
                arg0.method2051(var3, var6, var4, var5 == null ? null : var5.field5156[0], 0);
            }
            this.field4072.method2790(arg0, super.field4362 >> 7, var3, super.field4364 >> 7, super.field4362 >> 7, true, (byte) -120, super.field4364 >> 7);
            return var5;
        }
    }
}
