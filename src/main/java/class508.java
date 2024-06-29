import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class508 implements class464 {

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public int field7479;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field7476 = 0;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "Z")
    public static boolean field7475 = true;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public static int field7478 = 0;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "[I")
    public static int[] field7477 = new int[5];

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public static void method3049(byte arg0) {
        field7477 = null;
        if (arg0 != 73) {
            method3049((byte) -36);
        }
    }

    @OriginalMember(owner = "client!ip", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7474++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class508(String arg0, int arg1) {
        this.field7479 = arg1;
    }
}
