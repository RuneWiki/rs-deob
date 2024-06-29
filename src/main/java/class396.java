import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class396 {

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "[I")
    public static int[] field5525 = new int[16];

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V", line = 6)
    public static void method2330(int arg0) {
        if (arg0 != 16) {
            field5525 = null;
        }
        field5525 = null;
    }
}
