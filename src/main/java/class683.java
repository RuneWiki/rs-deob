import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class683 {

    @OriginalMember(owner = "client!or", name = "b", descriptor = "Ljj;")
    public static class398 field9706 = new class398(72, -1);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "[I")
    public static int[] field9707;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V", line = 5)
    public static void method3779(boolean arg0) {
        field9706 = null;
        if (!arg0) {
            method3780(79, false, 66, false, 71, 116);
        }
        field9707 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IZIZII)V", line = 18)
    public static final void method3780(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if ((arg1 ? class72.field935.field6514 : class72.field935.field6512) != 0 && arg5 != 0 && class485.field6555 < 50 && arg0 != -1) {
            class658.field9278[class485.field6555++] = new class578((byte) (arg1 ? 3 : 2), arg0, arg5, arg2, arg4, 0);
        }
        field9705++;
        if (arg3) {
            field9706 = null;
        }
    }
}
