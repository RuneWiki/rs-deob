import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class371 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V", line = 14)
    public static final void method2360(int arg0, int arg1) {
        class4.field68 = -1;
        field5430++;
        if (arg0 != -27751) {
            method2360(9, 85);
        }
        if (arg1 == 37) {
            class66.field851 = 3.0F;
        } else if (arg1 == 50) {
            class66.field851 = 4.0F;
        } else if (arg1 == 75) {
            class66.field851 = 6.0F;
        } else if (arg1 == 100) {
            class66.field851 = 8.0F;
        } else if (arg1 == 200) {
            class66.field851 = 16.0F;
        }
        class4.field68 = -1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIII)V", line = 45)
    public static final void method2361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5433++;
        if (arg4 == arg5) {
            class234.method1588(arg0, arg3, arg2, -1, arg5);
        } else if (arg1 == -19520) {
            if (arg2 - arg5 >= class9.field128 && class63.field838 >= arg2 + arg5 && class248.field3659 <= (arg3 - arg4) && class146.field1978 >= (arg3 + arg4)) {
                class195.method1357(arg0, (byte) -116, arg5, arg3, arg2, arg4);
            } else {
                class28.method292(arg5, arg0, arg4, (byte) -123, arg2, arg3);
            }
        }
    }
}
