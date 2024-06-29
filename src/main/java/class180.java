import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class180 {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field2730;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "[B")
    public static byte[] field2732 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field2734 = 0;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "[B")
    public static byte[] field2733 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Lkn;")
    public static class518 field2736;

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class180(String arg0, String arg1, String arg2, String arg3) {
        this.field2730 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!gf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2735++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static void method1272(byte arg0) {
        field2732 = null;
        field2733 = null;
        if (arg0 < 92) {
            field2734 = 43;
        }
        field2736 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method1273(boolean arg0, int arg1) {
        if (arg0) {
            field2731++;
            return this.field2730[arg1];
        } else {
            return null;
        }
    }
}
