import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class743 {

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field10335 = 0;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field10334;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field10336;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "[Lkia;")
    public static class620[] field10333;

    @OriginalMember(owner = "client!qc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10334++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLji;)Llc;")
    public static final class647 method4156(byte arg0, class611 arg1) {
        if (arg0 >= -91) {
            field10333 = null;
        }
        field10336++;
        return new class647(arg1.method3413(false), arg1.method3413(false), arg1.method3413(false), arg1.method3413(false), arg1.method3385(-126), arg1.method3385(-123), arg1.method3428((byte) -7));
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method4157(byte arg0) {
        field10333 = null;
        if (arg0 != -18) {
            field10333 = null;
        }
    }
}
