import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class585 implements class353 {

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public int field7976;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field7973;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "Lrp;")
    public static class135 field7974;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "[I")
    public static int[] field7975;

    @OriginalMember(owner = "client!wn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7973++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
    public static void method3387(int arg0) {
        field7975 = null;
        if (arg0 != -19043) {
            field7974 = null;
        }
        field7974 = null;
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class585(String arg0, int arg1) {
        this.field7976 = arg1;
    }
}
