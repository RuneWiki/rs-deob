import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class200 {

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "Luc;")
    public static class27 field2326 = new class27(1, 3);

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2328 = new String[100];

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
    public static void method1160(byte arg0) {
        field2328 = null;
        field2326 = null;
        if (arg0 != 106) {
            method1160((byte) 127);
        }
    }
}
