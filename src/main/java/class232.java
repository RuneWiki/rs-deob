import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class232 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lbg;")
    public static class464 field3138 = new class464();

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIBIIILwm;)V")
    public static final void method1498(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class564 arg6) {
        class712.method4006(arg0, (byte) -59, arg6.field1266, arg5, arg1, arg4, arg6.field1264, 0, arg3, arg6.field1250);
        if (arg2 < 22) {
            field3138 = null;
        }
        field3139++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method1499(int arg0) {
        if (arg0 <= 83) {
            field3138 = null;
        }
        field3138 = null;
    }
}
