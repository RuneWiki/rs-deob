import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class310 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Z")
    public static boolean field4303 = false;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field4304 = 0;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "[I")
    public static int[] field4305;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 8)
    public static void method1877(byte arg0) {
        field4305 = null;
        if (arg0 != 36) {
            field4305 = null;
        }
    }
}
