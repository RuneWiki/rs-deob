import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class125 {

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Let;")
    public static class596 field1794 = new class596(1);

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "F")
    public static float field1795;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "[[I")
    public static int[][] field1796;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static void method945(int arg0) {
        field1796 = null;
        field1794 = null;
        if (arg0 != 1) {
            field1794 = null;
        }
    }
}
