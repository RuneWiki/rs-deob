import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class199 {

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "Z")
    public static boolean field2663 = false;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field2664 = 0;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "Z")
    public static boolean field2665;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Ldia;", line = 15)
    public static final class618 method1212(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field2662++;
        try {
            return (class618) Class.forName("f").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
