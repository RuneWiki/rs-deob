import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class239 {

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "Ljava/lang/String;")
    public String field3438;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public int field3439;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "[I")
    public static int[] field3437 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V", line = 7)
    public static void method1558(byte arg0) {
        field3437 = null;
        if (arg0 != 62) {
            field3437 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "toString", descriptor = "()Ljava/lang/String;", line = 25)
    public final String toString() {
        field3436++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 32)
    public class239(String arg0, int arg1) {
        this.field3438 = arg0;
        this.field3439 = arg1;
    }
}
