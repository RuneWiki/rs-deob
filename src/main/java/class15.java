import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class15 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "J")
    public static long field85 = 0L;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "[I")
    public static int[] field86 = new int[1];

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Z")
    public static boolean field90 = false;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "F")
    public static float field89;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lfg;")
    public static class436 field91;

    @OriginalMember(owner = "client!oe", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field88++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V", line = 15)
    public static void method58(byte arg0) {
        field86 = null;
        field91 = null;
        if (arg0 > -38) {
            field91 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)I", line = 26)
    public final int method59(int arg0, int arg1, int arg2) {
        field87++;
        int var4 = class249.field3700 <= arg1 ? arg1 : class249.field3700;
        if (class568.field8007 == this) {
            return 0;
        } else if (class446.field6251 == this) {
            return var4 - arg2;
        } else if (class636.field8913 == this) {
            return (var4 - arg2) / 2;
        } else if (arg0 == 0) {
            return 0;
        } else {
            return -51;
        }
    }
}
