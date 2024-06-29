import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class276 extends class502 {

    @OriginalMember(owner = "client!oba", name = "q", descriptor = "Lpja;")
    public static class43 field3827 = new class43(20);

    @OriginalMember(owner = "client!oba", name = "r", descriptor = "I")
    public static int field3828 = 0;

    @OriginalMember(owner = "client!oba", name = "i", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!oba", name = "j", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!oba", name = "k", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!oba", name = "l", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!oba", name = "m", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!oba", name = "n", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!oba", name = "o", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!oba", name = "p", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!oba", name = "s", descriptor = "Lgj;")
    public static class662 field3829;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V", line = 3)
    public static void method1777(int arg0) {
        if (arg0 >= -127) {
            method1777(-5);
        }
        field3829 = null;
        field3827 = null;
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(ILeka;)V", line = 16)
    public class276(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "(II)V", line = 24)
    public final void method52(int arg0, int arg1) {
        super.field6865 = arg0;
        if (arg1 != 0) {
            method1777(81);
        }
        ++field3819;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lha;IIIIIII)V", line = 37)
    public static final void method1778(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3826;
        arg0.method472(arg1 ^ 25676, arg5, arg7, arg4, arg3, arg6);
        arg0.method472(25692, arg1, arg7 - -1, arg4 + -2, arg2, arg6 + 1);
        arg0.method568(arg2, arg7 - -1, arg4 - 2, -112, arg5 + -19, arg6 - -18);
    }

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "(B)I", line = 47)
    public final int method1779(byte arg0) {
        if (arg0 < 49) {
            field3827 = null;
        }
        ++field3825;
        return super.field6865;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)I", line = 58)
    public final int method55(int arg0) {
        if (arg0 != -2) {
            field3827 = null;
        }
        ++field3824;
        return 0;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)I", line = 69)
    public final int method57(int arg0, int arg1) {
        if (arg1 != 0) {
            field3827 = null;
        }
        ++field3821;
        return 1;
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Leka;)V", line = 81)
    public class276(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Z)V", line = 86)
    public final void method58(boolean arg0) {
        ++field3820;
        if (!arg0) {
            field3828 = -48;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIII)I", line = 96)
    public static final int method1780(int arg0, int arg1, int arg2, int arg3) {
        if (~arg2 >= -244) {
            if (arg2 <= 217) {
                if (arg2 <= 192) {
                    if (arg2 > 179) {
                        arg1 >>= 1;
                    }
                } else {
                    arg1 >>= 2;
                }
            } else {
                arg1 >>= 3;
            }
        } else {
            arg1 >>= 4;
        }
        int var4 = -101 / ((-83 - arg0) / 33);
        ++field3823;
        return (arg2 >> 1) + (arg1 >> 5 << 7) + ((arg3 >> 2 & 63) << 10);
    }
}
