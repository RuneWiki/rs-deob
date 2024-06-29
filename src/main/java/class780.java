import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class780 implements class175 {

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public int field10743;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "[I")
    public static int[] field10744 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field10745;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "Llf;")
    public static class251 field10746;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "Lnn;")
    public static class439 field10747;

    @OriginalMember(owner = "client!mo", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10745++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
    public static void method4272(byte arg0) {
        field10744 = null;
        field10747 = null;
        int var1 = 22 % ((67 - arg0) / 55);
        field10746 = null;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class780(String arg0, int arg1) {
        this.field10743 = arg1;
    }
}
