import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class85 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field1040 = 0;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIB)B")
    public static final byte method479(int arg0, int arg1, byte arg2) {
        field1039++;
        if (arg2 != 0) {
            return -98;
        } else if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
