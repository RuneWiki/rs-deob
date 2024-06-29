import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class158 extends class393 {

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "Z")
    public static boolean field2076 = true;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public int field2074;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public int field2075;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "Lqj;")
    public static class238 field2077;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(B)V")
    public static void method1003(byte arg0) {
        if (arg0 >= 108) {
            field2077 = null;
        }
    }
}
