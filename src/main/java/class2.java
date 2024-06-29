import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "Ls;")
    public static class186 field51 = new class186(28, 7);

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "F")
    public static float field52;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 4)
    public static void method21(int arg0) {
        field51 = null;
        if (arg0 <= 126) {
            method21(-84);
        }
    }
}
