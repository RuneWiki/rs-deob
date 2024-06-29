import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class416 extends class55 {

    @OriginalMember(owner = "client!za", name = "l", descriptor = "Lee;")
    public static class676 field5871 = new class676();

    @OriginalMember(owner = "client!za", name = "k", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II)I", line = 8)
    public static final int method2394(int arg0, int arg1) {
        field5870++;
        return arg0 == -1035933944 ? arg1 >>> 8 : -95;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIIB)V", line = 19)
    public static final void method2395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field5872++;
        if (arg0 == arg2) {
            class146.method906(arg3, arg6, arg5, arg4, arg0, arg1, 1333849452);
            return;
        }
        int var8 = -52 % ((50 - arg7) / 63);
        if (arg5 - arg0 >= class122.field1604 && arg0 + arg5 <= class165.field2070 && class759.field10576 <= (arg3 - arg2) && arg2 + arg3 <= class29.field238) {
            class205.method1141(arg6, -2211, arg5, arg1, arg0, arg3, arg4, arg2);
        } else {
            class185.method1042(arg3, arg1, arg5, arg2, arg4, arg0, -25682, arg6);
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V", line = 41)
    public static void method2396(int arg0) {
        int var1 = -18 / ((arg0 + 45) / 60);
        field5871 = null;
    }
}
