import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class540 {

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "F")
    public static float field7899;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7898++;
        if ((arg3 - arg5) >= class470.field6589 && (arg3 + arg5) <= class592.field8588 && arg6 - arg5 >= class563.field8282 && (arg5 + arg6) <= class271.field3513) {
            class597.method3453(arg6, arg1, arg0, arg2, arg4 - 23120, arg5, arg3);
        } else {
            class395.method2272(arg6, arg2, arg1, -121, arg5, arg0, arg3);
        }
        if (arg4 != 23240) {
            field7899 = -1.4741052F;
        }
    }
}
