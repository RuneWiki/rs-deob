import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class351 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lmr;")
    public static class611 field5206 = new class611();

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "[I")
    public static int[] field5207 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!ae", name = "toString", descriptor = "()Ljava/lang/String;", line = 11)
    public final String toString() {
        field5208++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 19)
    public static void method2241(int arg0) {
        if (arg0 == 26704) {
            field5206 = null;
            field5207 = null;
        }
    }
}
