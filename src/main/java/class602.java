import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class602 {

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "[I")
    public static int[] field8702 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "Lbda;")
    public static class401 field8701;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public static void method3460(int arg0) {
        if (arg0 != 2) {
            field8701 = null;
        }
        field8701 = null;
        field8702 = null;
    }
}
