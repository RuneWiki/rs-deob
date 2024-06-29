import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class446 {

    @OriginalMember(owner = "client!of", name = "d", descriptor = "[Ljava/lang/String;")
    private String[] field6694;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "[Lne;")
    public static class212[] field6691 = new class212[6];

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Ll;")
    public static class15 field6695;

    @OriginalMember(owner = "client!of", name = "toString", descriptor = "()Ljava/lang/String;", line = 41)
    public final String toString() {
        field6693++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 89)
    public class446(String arg0, String arg1, String arg2, String arg3) {
        this.field6694 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 105)
    public static void method2704(int arg0) {
        field6695 = null;
        if (arg0 > -27) {
            field6691 = null;
        }
        field6691 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 117)
    public final String method2705(byte arg0, int arg1) {
        if (arg0 != 69) {
            field6695 = null;
        }
        field6692++;
        return this.field6694[arg1];
    }
}
