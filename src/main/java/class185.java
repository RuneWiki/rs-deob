import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class185 {

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
    public static int field2210 = 0;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "Z")
    public static boolean field2211 = false;

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "Lvn;")
    public static class311 field2213;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1145(boolean arg0) {
        if (arg0) {
            method1145(true);
        }
        field2213 = null;
    }

    @OriginalMember(owner = "client!ffa", name = "toString", descriptor = "()Ljava/lang/String;", line = 29)
    public final String toString() {
        field2212++;
        throw new IllegalStateException();
    }
}
