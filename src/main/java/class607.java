import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class607 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public int field8283;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "[I")
    public static int[] field8284 = new int[1];

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I)V")
    public class607(int arg0) {
        this.field8283 = arg0;
    }

    @OriginalMember(owner = "client!bc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8285++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method3352(int arg0) {
        if (arg0 == -12480) {
            field8284 = null;
        }
    }
}
