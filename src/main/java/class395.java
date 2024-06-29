import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class395 {

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "Lhj;")
    public static class596 field5121 = new class596(54, 6);

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "Lkq;")
    public static class620 field5122 = null;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2318(boolean arg0) {
        field5122 = null;
        if (arg0) {
            method2318(false);
        }
        field5121 = null;
    }
}
