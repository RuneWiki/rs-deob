import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class48 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "[I")
    public static int[] field566 = new int[8];

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
    public static int[] field569 = new int[6];

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "[I")
    public static int[] field568;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method296(int arg0) {
        field568 = null;
        field566 = null;
        if (arg0 >= 117) {
            field569 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIII)V")
    public static final void method297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= -42) {
            for (int var6 = arg3; var6 <= arg5; var6++) {
                class140.method969(arg0, 15888, arg4, arg1, class604.field8993[var6]);
            }
            field567++;
        }
    }
}
