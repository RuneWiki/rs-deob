import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class69 {

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "[B")
    public static byte[] field1037 = new byte[520];

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "[I")
    public static int[] field1038 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
    public static int field1039 = 0;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)V", line = 16)
    public static void method540(byte arg0) {
        field1037 = null;
        if (arg0 != -25) {
            field1038 = null;
        }
        field1038 = null;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(III)Z", line = 28)
    public static final boolean method541(int arg0, int arg1, int arg2) {
        field1040++;
        if (arg2 >= arg0 && arg1 >= 0 && arg2 < class477.field6362[1].length && arg1 < class477.field6362[1][arg2].length) {
            return (class477.field6362[1][arg2][arg1] & 0x2) != 0;
        } else {
            return false;
        }
    }
}
