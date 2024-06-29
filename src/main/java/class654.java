import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class654 {

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "Z")
    public static boolean field9307 = false;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "Lga;")
    public static class332 field9309;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public static void method3696(int arg0) {
        field9309 = null;
        if (arg0 <= 7) {
            method3697(-96, 108, (byte) -46);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIB)B")
    public static final byte method3697(int arg0, int arg1, byte arg2) {
        if (arg2 != -57) {
            field9307 = true;
        }
        field9308++;
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
