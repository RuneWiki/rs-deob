import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class198 {

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "Z")
    public static boolean field2403 = true;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "Ljk;")
    public static class585 field2402 = new class585(2, 8);

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)V", line = 3)
    public static void method1212(byte arg0) {
        field2402 = null;
        if (arg0 != -74) {
            field2402 = null;
        }
    }
}
