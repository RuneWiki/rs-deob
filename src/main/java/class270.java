import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class270 extends class353 {

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "[I")
    public static int[] field3537 = new int[5];

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "[I")
    public static int[] field3539 = new int[8];

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZI)V")
    public final void method486(int arg0, boolean arg1, int arg2) {
        ++field3538;
        if (arg1) {
            field3537 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
    public final void method490(int arg0) {
        ++field3535;
        if (arg0 != -2144900407) {
            field3537 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILqda;I)V")
    public final void method484(int arg0, class689 arg1, int arg2) {
        super.field5242.method3011(arg0 ^ -7944, arg1);
        ++field3536;
        if (arg0 == 8056) {
            super.field5242.method3037(arg2, true);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method1616(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3) {
            method1617(121);
        }
        ++field3542;
        if (arg5 == arg6) {
            class425.method2564(arg4, arg6, arg0, arg1, arg2, true, arg7);
        } else if (~class175.field2455 >= ~(-arg6 + arg1) && arg1 - -arg6 <= class375.field5631 && ~class323.field4704 >= ~(-arg5 + arg7) && ~(arg5 + arg7) >= ~class148.field2106) {
            class508.method2888(arg4, arg0, arg7, arg2, arg5, -1, arg1, arg6);
        } else {
            class595.method3390((byte) 78, arg0, arg6, arg2, arg4, arg1, arg7, arg5);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)V")
    public final void method491(int arg0, boolean arg1) {
        ++field3543;
        if (arg0 >= -121) {
            this.method484(121, (class689) null, -106);
        }
    }

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "(I)V")
    public static void method1617(int arg0) {
        field3537 = null;
        field3539 = null;
        if (arg0 != 32) {
            field3539 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(IZ)V")
    public final void method485(int arg0, boolean arg1) {
        ++field3540;
        if (arg0 < 1) {
            method1617(-69);
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)Z")
    public final boolean method493(byte arg0) {
        if (arg0 >= -20) {
            return true;
        } else {
            ++field3534;
            return false;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)Z")
    public static final boolean method1618(int arg0, int arg1, int arg2) {
        if (arg0 != 32) {
            return false;
        } else {
            ++field3541;
            return (32 & arg1) != 0;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lum;)V")
    public class270(class528 arg0) {
        super(arg0);
    }
}
