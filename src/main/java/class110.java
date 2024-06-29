import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class110 extends class24 {

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Z")
    public static boolean field1279 = false;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1275 = null;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 8)
    public static void method611(int arg0) {
        field1275 = null;
        if (arg0 < 28) {
            method611(-100);
        }
    }
}
