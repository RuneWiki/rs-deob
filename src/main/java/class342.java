import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class342 {

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field5152;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!pi", name = "toString", descriptor = "()Ljava/lang/String;", line = 71)
    public final String toString() {
        field5153++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Ljava/lang/String;", line = 105)
    public final String method2180(int arg0, int arg1) {
        field5150++;
        return arg1 == 29491 ? this.field5152[arg0] : null;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 115)
    public class342(String arg0, String arg1, String arg2, String arg3) {
        this.field5152 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
