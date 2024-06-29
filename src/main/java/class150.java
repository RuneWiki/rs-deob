import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class150 {

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "[B")
    public static byte[] field2133 = new byte[2048];

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "Lpc;")
    public static class473 field2136;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "[I")
    public static int[] field2134;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V", line = 12)
    public static void method1031(byte arg0) {
        if (arg0 != 42) {
            field2135 = -102;
        }
        field2134 = null;
        field2136 = null;
        field2133 = null;
    }
}
