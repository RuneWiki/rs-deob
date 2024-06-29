import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class209 {

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "Lwp;")
    public static class453 field2636 = new class453(79, -1);

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "[[B")
    public static byte[][] field2635;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V", line = 3)
    public static void method1252(int arg0) {
        field2636 = null;
        field2635 = null;
        if (arg0 != 79) {
            method1252(-42);
        }
    }
}
