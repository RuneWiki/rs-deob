import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class173 {

    @OriginalMember(owner = "client!op", name = "c", descriptor = "[I")
    public static int[] field2466 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Z")
    public static boolean field2465 = false;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "Lno;")
    public static class652 field2464 = new class652();

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static void method1187(int arg0) {
        if (arg0 != 4) {
            field2465 = true;
        }
        field2466 = null;
        field2464 = null;
    }
}
