import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class352 {

    @OriginalMember(owner = "client!es", name = "a", descriptor = "[I")
    public static int[] field5310 = new int[64];

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
    public static void method2282(byte arg0) {
        field5310 = null;
        if (arg0 <= 122) {
            field5310 = null;
        }
    }
}
