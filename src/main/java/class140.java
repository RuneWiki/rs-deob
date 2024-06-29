import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class140 {

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "[[B")
    public static byte[][] field1857;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V", line = 3)
    public static void method983(int arg0) {
        field1857 = null;
        if (arg0 != 15448) {
            field1857 = null;
        }
    }
}
