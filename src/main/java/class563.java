import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class563 {

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "I")
    public static int field7996 = -1;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "[I")
    public static int[] field7998 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "I")
    public static int field7997;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIB)I", line = 6)
    public static final int method3364(int arg0, int arg1, byte arg2) {
        field7997++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (arg2 >= -17) {
                method3365(-100);
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V", line = 42)
    public static void method3365(int arg0) {
        if (arg0 != 3) {
            field7996 = -95;
        }
        field7998 = null;
    }
}
