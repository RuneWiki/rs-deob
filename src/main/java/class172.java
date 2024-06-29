import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class172 {

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
    public int field2671;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "Z")
    public static boolean field2674 = false;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!cda", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field2673++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)I", line = 16)
    public final int method1233(int arg0) {
        if (arg0 == -32687) {
            field2672++;
            return this.field2671;
        } else {
            return 84;
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 28)
    public class172(String arg0, int arg1) {
        this.field2671 = arg1;
    }
}
