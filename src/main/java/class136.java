import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class136 extends class216 {

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Z")
    public static boolean field2104 = false;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field2106 = new String[5];

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "[Lg;")
    public static class284[] field2103;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public static final String method927(boolean arg0, int arg1) {
        field2105++;
        if (!arg0) {
            field2103 = null;
        }
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class145.field2304 + "</col>";
        } else {
            return "<col=00ff80>" + arg1 / 1000000 + class187.field2902 + "</col>";
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lhc;I)V")
    public static final void method928(class235 arg0, int arg1) {
        if (arg1 != -20618) {
            field2103 = null;
        }
        field2107++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public static void method929(byte arg0) {
        int var1 = 43 / ((-arg0 - 22) / 37);
        field2103 = null;
        field2106 = null;
    }
}
