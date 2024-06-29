import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class746 {

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "[I")
    public static int[] field10415 = new int[3];

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public static int field10414;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
    public static void method4160(int arg0) {
        if (arg0 != 1) {
            method4160(63);
        }
        field10415 = null;
    }
}
