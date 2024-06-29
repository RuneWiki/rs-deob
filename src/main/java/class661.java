import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class661 implements class91 {

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public int field8968;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "[I")
    public static int[] field8969 = new int[1000];

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!pw", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field8967++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 19)
    public class661(String arg0, int arg1) {
        this.field8968 = arg1;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V", line = 35)
    public static void method3684(int arg0) {
        if (arg0 == 17162) {
            field8969 = null;
        }
    }
}
