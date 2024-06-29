import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class567 {

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field8099;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    public static int field8100;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
    public static int field8101;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!bv", name = "toString", descriptor = "()Ljava/lang/String;", line = 28)
    public final String toString() {
        field8101++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 39)
    public final String method3220(boolean arg0, int arg1) {
        if (arg0) {
            field8100 = 21;
        }
        field8102++;
        return this.field8099[arg1];
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 102)
    public class567(String arg0, String arg1, String arg2, String arg3) {
        this.field8099 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
