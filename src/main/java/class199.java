import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class199 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field2987 = -1;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "Lclient;")
    public static client field2988;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 3)
    public static void method1412(int arg0) {
        if (arg0 != -1737) {
            field2987 = -88;
        }
        field2988 = null;
    }
}
