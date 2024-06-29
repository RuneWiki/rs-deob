import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class252 {

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "I")
    public static int field3616 = 0;

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!bja", name = "c", descriptor = "Lus;")
    public static class341 field3618;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)V", line = 12)
    public static void method1669(int arg0) {
        if (arg0 > -90) {
            method1669(65);
        }
        field3618 = null;
    }
}
