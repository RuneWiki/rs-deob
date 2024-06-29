import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class53 extends class137 {

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field712 = 0;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "Lbe;")
    private static class283 field715 = class153.method941(125, "Loading config )2 ");

    @OriginalMember(owner = "client!il", name = "r", descriptor = "Lbe;")
    public static class283 field713 = field715;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIIIZIII)Z", line = 8)
    public static final boolean method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        if (arg3 != 1) {
            field715 = (class283) null;
        }
        field716++;
        if (class213.field3624.method460((byte) -80) == 2) {
            return class290.method1980(arg4, arg0, -48, arg9, arg7, arg2, arg1, arg10, arg5, arg8, arg11, arg6);
        } else if (class213.field3624.method460((byte) 112) > 2) {
            return class220.method1446(arg2, arg4, arg7, arg0, -2, arg11, class213.field3624.method460((byte) 125), arg8, arg1, arg6, arg10, arg5, arg9);
        } else {
            return class168.method1065(arg5, arg10, arg1, arg11, (byte) 10, arg2, arg8, arg4, arg9, arg0, arg7, arg6);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)I", line = 36)
    public static final int method336(int arg0, int arg1) {
        field711++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg0 == -1753429918) {
            int var4 = var3 | var3 >>> 4;
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        } else {
            return 51;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II)I", line = 53)
    public static int method337(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIILgf;IJ)Z", line = 59)
    public static final boolean method338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class7 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class208.method1381(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 79)
    public static final void method339(int arg0) {
        field710++;
        if (!class96.method622((byte) 0) && class83.field1405 != class61.field850) {
            class54.method342(false, class213.field3624.field1150[0], -15993, class184.field3170, class114.field1914, class213.field3624.field1178[0], class61.field850);
            return;
        }
        if (class74.field1294 != class61.field850) {
            class74.field1294 = class61.field850;
            class170.method1079(56, class61.field850);
            class304.method2055((byte) 87);
        }
        if (arg0 != 0) {
            method339(121);
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V", line = 105)
    public static void method340(byte arg0) {
        if (arg0 != -80) {
            method335(-77, 73, 92, 39, 7, 17, -39, 12, false, -9, 112, 64);
        }
        field713 = null;
        field715 = null;
    }
}
