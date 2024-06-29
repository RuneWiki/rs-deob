import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class274 implements class733 {

    @OriginalMember(owner = "client!up", name = "b", descriptor = "Lrn;")
    private class267 field3902;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "[I")
    public static int[] field3906 = new int[14];

    @OriginalMember(owner = "client!up", name = "g", descriptor = "I")
    public static int field3907 = -1;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "Lqe;")
    public static class465 field3904 = new class465(90, -1);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "Lwq;")
    public static class166 field3909;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)Z")
    public final boolean method1176(byte arg0) {
        field3901++;
        if (arg0 < 124) {
            field3904 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
    public static void method1802(int arg0) {
        field3904 = null;
        if (arg0 != 0) {
            field3909 = null;
        }
        field3906 = null;
        field3909 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
    public final void method1173(int arg0) {
        field3903++;
        if (arg0 >= -105) {
            this.method1173(110);
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lrn;)V")
    public class274(class267 arg0) {
        this.field3902 = arg0;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3908++;
        if (arg0 == arg6) {
            class82.method799((byte) 87, arg1, arg4, arg7, arg5, arg6, arg2);
            return;
        }
        int var8 = 102 / ((arg3 + 77) / 47);
        if (arg7 - arg6 >= class156.field2337 && class612.field8854 >= (arg6 + arg7) && class558.field7940 <= (arg5 - arg0) && class748.field10458 >= arg5 + arg0) {
            class260.method1771(arg0, arg4, arg2, arg1, arg6, -27050, arg5, arg7);
        } else {
            class247.method1649(arg5, arg0, arg7, arg2, arg4, arg1, (byte) 124, arg6);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZI)V")
    public final void method1172(boolean arg0, int arg1) {
        field3905++;
        if (arg0) {
            class359.field5046.method630(0, 0, class206.field2956, class363.field5105, this.field3902.field3865, 0);
        }
        int var3 = -119 % (arg1 / 39);
    }
}
