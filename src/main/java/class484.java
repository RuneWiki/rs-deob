import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class484 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Ltn;")
    public static class166 field6901 = new class166();

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "[I")
    public static int[] field6904 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Lkq;")
    public static class696 field6905 = new class696(9, 2);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lpn;")
    public static class295 field6903;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILkfa;ZIII)Lbb;", line = 9)
    public static final class196 method2823(int arg0, class382 arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (!arg2) {
            method2823(19, null, true, -41, 89, -116);
        }
        field6900++;
        if (!arg1.field5507 && (!class452.method2633(arg3, (byte) 127) || !class452.method2633(arg0, (byte) 127))) {
            return arg1.field5528 ? new class196(arg1, 34037, arg4, arg5, arg3, arg0, true) : new class196(arg1, arg4, arg5, arg3, arg0, class99.method830(arg3, false), class99.method830(arg0, false), true);
        } else {
            return new class196(arg1, 3553, arg4, arg5, arg3, arg0, true);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V", line = 28)
    public static void method2824(boolean arg0) {
        if (!arg0) {
            method2823(-86, null, true, -83, 107, -57);
        }
        field6901 = null;
        field6904 = null;
        field6905 = null;
        field6903 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([BI)[B", line = 44)
    public static final byte[] method2825(byte[] arg0, int arg1) {
        field6902++;
        int var2 = arg0.length;
        if (arg1 >= -113) {
            return null;
        } else {
            byte[] var3 = new byte[var2];
            class553.method3242(arg0, 0, var3, 0, var2);
            return var3;
        }
    }
}
