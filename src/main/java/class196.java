import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class196 {

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "Leba;")
    public static class550 field2681 = new class550(88, 4);

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "[I")
    public static int[] field2684 = new int[1];

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "[I")
    public static int[] field2682 = new int[1];

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "[Lf;")
    public static class532[] field2683;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public static void method1275(int arg0) {
        field2683 = null;
        if (arg0 == 1) {
            field2681 = null;
            field2682 = null;
            field2684 = null;
        }
    }
}
