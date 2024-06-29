import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class17 {

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "Lhn;")
    public static class509 field162 = new class509(64);

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "Lho;")
    public static class103 field163 = new class103(72, -1);

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field164 = 0;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!bu", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field161++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 15)
    public static void method95(int arg0) {
        field163 = null;
        field162 = null;
        if (arg0 >= -43) {
            field164 = -126;
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 33)
    public class17(String arg0, int arg1) {
        this.field160 = arg1;
    }
}
