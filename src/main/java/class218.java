import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class218 {

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3418 = "Attack";

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3417 = "Face here";

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method1455(byte arg0) {
        field3417 = null;
        if (arg0 < 74) {
            method1455((byte) 112);
        }
        field3418 = null;
    }
}
