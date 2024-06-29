import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class510 {

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "Lem;")
    public static class150 field7564 = null;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "[I")
    public static int[] field7567 = new int[25];

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "[B")
    public static byte[] field7568 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    public static void method3052(byte arg0) {
        field7568 = null;
        field7567 = null;
        field7564 = null;
        if (arg0 <= 117) {
            field7569 = 26;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)V")
    public static final void method3053(int arg0, byte arg1) {
        field7565++;
        class97 var2 = class348.method2064(arg0, 6, 123);
        var2.method710(-9237);
        if (arg1 != 0) {
            field7568 = null;
        }
    }
}
