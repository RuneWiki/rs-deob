import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class691 {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Ldb;")
    public static class298 field9732 = new class298(3, -2);

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Ldb;")
    public static class298 field9733 = new class298(25, 8);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field9731;

    @OriginalMember(owner = "client!ob", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9731++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static void method3839(byte arg0) {
        field9733 = null;
        if (arg0 != 125) {
            field9733 = null;
        }
        field9732 = null;
    }
}
