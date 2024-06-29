import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class388 {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Llt;")
    public static class475 field5866 = new class475("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Llt;")
    public static class475 field5867 = new class475("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field5868 = 0;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 10)
    public static void method2368(int arg0) {
        field5867 = null;
        field5866 = null;
        if (arg0 != 0) {
            field5866 = null;
        }
    }
}
