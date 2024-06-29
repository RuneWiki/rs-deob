import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class102 {

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Z")
    public static boolean field1502 = true;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1501 = 0;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)I")
    public static final int method773(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }
}
