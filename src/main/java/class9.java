import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "[I")
    public static int[] field122 = new int[32];

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "F")
    public static float field123;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 8)
    public static void method51(byte arg0) {
        if (arg0 != 56) {
            method51((byte) 14);
        }
        field122 = null;
    }
}
