import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class220 {

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "[B")
    public static byte[] field2792 = new byte[2048];

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "Ldt;")
    public static class616 field2793 = new class616(true);

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)V", line = 6)
    public static void method1379(byte arg0) {
        if (arg0 <= -21) {
            field2793 = null;
            field2792 = null;
        }
    }
}
