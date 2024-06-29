import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class292 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field4473 = 0;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lbm;")
    public static class307 field4475;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "[[B")
    public static byte[][] field4474;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 11)
    public static void method1961(int arg0) {
        field4475 = null;
        if (arg0 == 0) {
            field4474 = (byte[][]) null;
        }
    }
}
