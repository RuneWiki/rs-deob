import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class60 {

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field842 = -1;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "[Lxa;")
    public static class424[] field841;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
    public static void method380(int arg0) {
        field841 = null;
        if (arg0 != -1) {
            field841 = null;
        }
    }
}
