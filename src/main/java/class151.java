import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class151 {

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "Lwi;")
    public static class202 field2082 = new class202();

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "Z")
    public static boolean field2083 = false;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field2084;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "[[B")
    public static byte[][] field2085;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Luu;II)Lbha;")
    public static final class301 method957(class237 arg0, int arg1, int arg2) {
        if (arg2 != 11082) {
            method957(null, 63, 53);
        }
        field2081++;
        byte[] var3 = arg0.method1583(arg1, -86);
        return var3 == null ? null : new class301(var3);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
    public static void method958(int arg0) {
        if (arg0 != -25893) {
            field2084 = null;
        }
        field2085 = null;
        field2082 = null;
        field2084 = null;
    }
}
