import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class199 extends class28 {

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    public static int field2920 = 100;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IBZIZ)V", line = 3)
    public static final void method1440(int arg0, byte arg1, boolean arg2, int arg3, boolean arg4) {
        field2921++;
        class363.method2268(arg2, arg4, class194.field2859.length - 1, 0, arg0, arg3, 0);
        if (arg1 != 59) {
            field2920 = 116;
        }
        class450.field6466 = 0;
        class518.field7401 = null;
    }
}
