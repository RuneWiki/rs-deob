import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class500 {

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public int field7356;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "[I")
    public static int[] field7355 = new int[14];

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Lao;")
    public static class188 field7354 = new class188(3, 0);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "Lbk;")
    public static class253 field7358;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "[I")
    public static int[] field7357;

    @OriginalMember(owner = "client!nk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7353++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public static void method2987(byte arg0) {
        field7358 = null;
        if (arg0 != 57) {
            method2987((byte) 64);
        }
        field7354 = null;
        field7357 = null;
        field7355 = null;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class500(String arg0, int arg1) {
        this.field7356 = arg1;
    }
}
