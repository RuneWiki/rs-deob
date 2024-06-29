import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class206 {

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Lrh;")
    public static class275 field3022 = new class275(4, 1, 1, 1);

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "[I")
    public static int[] field3023 = new int[2];

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Ljo;")
    public static class351 field3024 = new class351(6, 2);

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Z")
    public static volatile boolean field3026 = false;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Ljo;")
    public static class351 field3025 = new class351(13, 2);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
    public static void method1481(boolean arg0) {
        field3024 = null;
        field3023 = null;
        field3025 = null;
        field3022 = null;
        if (arg0) {
            method1481(true);
        }
    }
}
