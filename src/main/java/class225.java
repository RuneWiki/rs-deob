import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class225 {

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "[I")
    public static int[] field2973;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
    public static void method1455(byte arg0) {
        if (arg0 > 11) {
            field2973 = null;
        }
    }
}
