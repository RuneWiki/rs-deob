import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class682 {

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "[I")
    public static int[] field8798 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "[I")
    public static int[] field8799 = new int[4];

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "Lgp;")
    public static class576 field8797 = new class576(6, 1);

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Z)V")
    public static void method3663(boolean arg0) {
        field8797 = null;
        field8799 = null;
        field8798 = null;
        if (!arg0) {
            field8797 = null;
        }
    }
}
