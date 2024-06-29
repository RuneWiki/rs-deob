import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class311 {

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "Z")
    public static boolean field4555 = false;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "Loh;")
    public static class549 field4557 = null;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4558 = null;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "F")
    public static float field4556;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V", line = 5)
    public static void method1935(byte arg0) {
        field4557 = null;
        if (arg0 < 65) {
            method1935((byte) -106);
        }
        field4558 = null;
    }
}
