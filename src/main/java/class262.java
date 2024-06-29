import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class262 {

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public int field3910;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "Ljava/lang/String;")
    public String field3909;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "Lht;")
    public static class461 field3908;

    @OriginalMember(owner = "client!kr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3907++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public static void method1643(int arg0) {
        field3908 = null;
        if (arg0 <= 107) {
            method1643(-107);
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class262(String arg0, int arg1) {
        this.field3910 = arg1;
        this.field3909 = arg0;
    }
}
