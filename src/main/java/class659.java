import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class659 {

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "F")
    public static float field9023;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "Lea;")
    public static class546 field9022;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V", line = 26)
    public static void method3617(int arg0) {
        field9022 = null;
        if (arg0 >= -6) {
            method3617(11);
        }
    }
}
