import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class747 {

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "[I")
    public static int[] field10387 = new int[8];

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Lbg;")
    public static class464 field10386 = new class464();

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V", line = 4)
    public static void method4154(int arg0) {
        field10387 = null;
        if (arg0 != 8) {
            method4154(15);
        }
        field10386 = null;
    }
}
