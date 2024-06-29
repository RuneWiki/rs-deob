import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class517 {

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lqe;")
    public static class465 field7350 = new class465(93, -1);

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "[I")
    public static int[] field7352 = new int[14];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field7351;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method3077(int arg0) {
        field7352 = null;
        if (arg0 != 14) {
            field7351 = -7;
        }
        field7350 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)V")
    public static final void method3078(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 14) {
            field7352 = null;
        }
        field7349++;
        class156.field2337 = arg0;
        class558.field7940 = arg1;
        class748.field10458 = arg3;
        class612.field8854 = arg4;
    }
}
