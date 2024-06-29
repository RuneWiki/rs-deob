import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class531 {

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "[Lya;")
    public static class38[] field7727;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
    public static void method3140(byte arg0) {
        field7727 = null;
        int var1 = 120 / ((arg0 - 33) / 47);
    }

    @OriginalMember(owner = "client!mo", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7726++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(II)V")
    public class531(int arg0, int arg1) {
    }
}
