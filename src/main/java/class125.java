import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class125 {

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1753 = "wave2:";

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Z")
    public static boolean field1755 = false;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Z")
    public static boolean field1756 = false;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Z")
    public static boolean field1749;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "[Lke;")
    public static class110[] field1751;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZI)V")
    public static final void method818(boolean arg0, int arg1) {
        field1752++;
        if (!arg0) {
            method818(false, 33);
        }
        if (arg1 >= 0 && arg1 < class93.field1296.length) {
            class93.field1296[arg1] = !class93.field1296[arg1];
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method819(int arg0) {
        field1751 = null;
        field1753 = null;
        if (arg0 != 0) {
            field1750 = -85;
        }
    }
}
