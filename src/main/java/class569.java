import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class569 {

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public int field8063;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lwh;")
    private class148 field8059;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Lqe;")
    public static class469 field8061 = new class469(110, 6);

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Lada;")
    public static class164 field8064 = new class164();

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field8065 = 0;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!qi", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        field8062++;
        this.field8059.method1036(this.field8063, 1);
        super.finalize();
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lwh;II)V", line = 19)
    public class569(class148 arg0, int arg1, int arg2) {
        this.field8063 = arg2;
        this.field8059 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 30)
    public static void method3303(byte arg0) {
        if (arg0 == 73) {
            field8064 = null;
            field8061 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILcha;ZLcha;)I", line = 42)
    public static final int method3304(int arg0, int arg1, class218 arg2, boolean arg3, class218 arg4) {
        field8060++;
        if (arg0 == 1) {
            int var5 = arg4.field10500;
            int var6 = arg2.field10500;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg0 == 2) {
            return class457.method2796(arg4.method1463(-1).field4251, class650.field9160, -1, arg2.method1463(-1).field4251);
        } else if (arg0 == 3) {
            if (arg4.field3208.equals("-")) {
                if (arg2.field3208.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field3208.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class457.method2796(arg4.field3208, class650.field9160, -1, arg2.field3208);
            }
        } else if (arg0 == 4) {
            if (arg4.method4192((byte) 53)) {
                return arg2.method4192((byte) 53) ? 0 : 1;
            } else if (arg2.method4192((byte) 53)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 != 5) {
            if (arg1 < 86) {
                method3303((byte) -49);
            }
            if (arg0 == 6) {
                if (arg4.method4189((byte) -69)) {
                    return arg2.method4189((byte) -83) ? 0 : 1;
                } else if (arg2.method4189((byte) -94)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg0 == 7) {
                if (arg4.method4190(1)) {
                    return arg2.method4190(1) ? 0 : 1;
                } else if (arg2.method4190(1)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg0 == 8) {
                int var7 = arg4.field3209;
                int var8 = arg2.field3209;
                if (arg3) {
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                } else {
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg4.field3212 - arg2.field3212;
            }
        } else if (arg4.method4193(2014)) {
            return arg2.method4193(2014) ? 0 : 1;
        } else if (arg2.method4193(2014)) {
            return -1;
        } else {
            return 0;
        }
    }
}
