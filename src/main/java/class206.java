import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class206 extends class502 {

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "Lfja;")
    public static class783 field3107 = new class783(97, 9);

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(II)V", line = 4)
    public final void method52(int arg0, int arg1) {
        ++field3111;
        super.field6865 = arg0;
        if (arg1 != 0) {
            method1462(-25, (class17) null, 5, true);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)I", line = 20)
    public final int method57(int arg0, int arg1) {
        ++field3108;
        return arg1 != 0 ? 8 : 1;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILkh;IZ)V", line = 31)
    public static final void method1462(int arg0, class17 arg1, int arg2, boolean arg3) {
        if (arg3) {
            if (~arg1.field315 == -1) {
                arg1.field248 = arg1.field274;
            } else if (~arg1.field315 != -2) {
                if (~arg1.field315 == -3) {
                    arg1.field248 = -arg1.field274 + arg2 - arg1.field347;
                } else if (arg1.field315 == 3) {
                    arg1.field248 = arg1.field274 * arg2 >> 14;
                } else if (~arg1.field315 != -5) {
                    arg1.field248 = -(arg1.field274 * arg2 >> 14) + arg2 - arg1.field347;
                } else {
                    arg1.field248 = (arg1.field274 * arg2 >> 14) + (arg2 - arg1.field347) / 2;
                }
            } else {
                arg1.field248 = (-arg1.field347 + arg2) / 2 + arg1.field274;
            }
            if (~arg1.field394 == -1) {
                arg1.field416 = arg1.field244;
            } else if (arg1.field394 == 1) {
                arg1.field416 = (-arg1.field330 + arg0) / 2 + arg1.field244;
            } else if (~arg1.field394 != -3) {
                if (arg1.field394 != 3) {
                    if (~arg1.field394 == -5) {
                        arg1.field416 = (arg1.field244 * arg0 >> 14) + (arg0 - arg1.field330) / 2;
                    } else {
                        arg1.field416 = -arg1.field330 + arg0 + -(arg1.field244 * arg0 >> 14);
                    }
                } else {
                    arg1.field416 = arg1.field244 * arg0 >> 14;
                }
            } else {
                arg1.field416 = -arg1.field330 + arg0 + -arg1.field244;
            }
            ++field3105;
            if (class178.field2814) {
                if (client.method2010(arg1).field9638 == 0 && arg1.field352 != 0) {
                    return;
                }
                if (arg1.field248 < 0) {
                    arg1.field248 = 0;
                } else if (arg1.field248 - -arg1.field347 > arg2) {
                    arg1.field248 = arg2 - arg1.field347;
                }
                if (arg1.field416 < 0) {
                    arg1.field416 = 0;
                    return;
                }
                if (arg1.field416 + arg1.field330 > arg0) {
                    arg1.field416 = -arg1.field330 + arg0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)V", line = 103)
    public final void method58(boolean arg0) {
        if (super.field6863.method2826(arg0) == class403.field5534) {
            super.field6865 = 2;
        }
        ++field3110;
        if (~super.field6865 > -1 || ~super.field6865 < -3) {
            super.field6865 = this.method55(-2);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)I", line = 116)
    public final int method55(int arg0) {
        if (arg0 != -2) {
            return -4;
        } else {
            ++field3106;
            return 1;
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Leka;)V", line = 127)
    public class206(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)I", line = 130)
    public final int method1463(byte arg0) {
        ++field3109;
        if (arg0 < 49) {
            field3107 = null;
        }
        return super.field6865;
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(ILeka;)V", line = 148)
    public class206(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V", line = 152)
    public static void method1464(int arg0) {
        if (arg0 != -24601) {
            method1462(-102, (class17) null, -8, true);
        }
        field3107 = null;
    }
}
