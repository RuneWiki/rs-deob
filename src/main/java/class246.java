import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class246 {

    @OriginalMember(owner = "client!os", name = "b", descriptor = "Lps;")
    public static class5 field3254 = null;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "[[B")
    public static byte[][] field3253;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public static void method1501(int arg0) {
        if (arg0 > -65) {
            method1501(14);
        }
        field3254 = null;
        field3253 = null;
    }
}
