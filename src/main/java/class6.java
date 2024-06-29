import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class6 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "[Z")
    public static boolean[] field66 = new boolean[100];

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 3)
    public static void method29(int arg0) {
        if (arg0 != 100) {
            field66 = null;
        }
        field66 = null;
    }
}
