import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class599 {

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "[I")
    public static int[] field8655;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)V")
    public static void method3418(boolean arg0) {
        field8655 = null;
        if (!arg0) {
            method3418(false);
        }
    }
}
