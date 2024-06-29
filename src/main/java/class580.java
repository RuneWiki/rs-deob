import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class580 {

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "I")
    public static int field8062 = -1;

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "I")
    public static int field8063;

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "Lnp;")
    public static class166 field8064;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IB)Z", line = 3)
    public static final boolean method3235(int arg0, byte arg1) {
        int var2 = 85 % ((arg1 + 31) / 41);
        field8065++;
        for (class718 var3 = (class718) class565.field7906.method3111(53); var3 != null; var3 = (class718) class565.field7906.method3116(-88)) {
            if (class589.method3275(var3.field10134, (byte) -88) && (long) arg0 == var3.field10137) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)V", line = 32)
    public static void method3236(byte arg0) {
        field8064 = null;
        if (arg0 > -31) {
            field8064 = null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "toString", descriptor = "()Ljava/lang/String;", line = 42)
    public final String toString() {
        field8063++;
        throw new IllegalStateException();
    }
}
