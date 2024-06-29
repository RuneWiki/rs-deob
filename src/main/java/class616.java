import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class616 {

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "Lem;")
    public static class206 field8605 = new class206(3, 6);

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "[I")
    public static int[] field8606;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V", line = 5)
    public static void method3442(int arg0) {
        field8606 = null;
        field8605 = null;
        if (arg0 <= 125) {
            method3442(37);
        }
    }
}
