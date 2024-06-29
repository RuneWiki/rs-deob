import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class532 {

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field7840;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BIZ)V")
    public static final void method3128(byte arg0, int arg1, boolean arg2) {
        if (arg0 < 63) {
            return;
        }
        field7840++;
        class569 var3 = class198.method1392(arg1, arg2, Integer.MIN_VALUE);
        if (var3 != null) {
            var3.method2549((byte) 67);
        }
    }
}
