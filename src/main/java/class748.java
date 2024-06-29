import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class748 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[Z")
    public static boolean[] field10323 = new boolean[8];

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field10324;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field10325;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "[I")
    public static int[] field10326;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public static final void method4153(byte arg0) {
        field10325++;
        if (arg0 <= 60) {
            method4154(true);
        }
        class185.method1375(-63);
        class204.method1458(-17818);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V")
    public static void method4154(boolean arg0) {
        field10323 = null;
        field10326 = null;
        if (!arg0) {
            field10326 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)I")
    public static final int method4155(int arg0, int arg1, int arg2, int arg3) {
        field10324++;
        if (arg1 != 16) {
            method4154(true);
        }
        if (arg2 < arg0) {
            return arg0;
        } else if (arg2 > arg3) {
            return arg3;
        } else {
            return arg2;
        }
    }
}
