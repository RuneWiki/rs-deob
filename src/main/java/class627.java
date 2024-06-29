import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class627 {

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Lae;")
    public static class40 field8738 = new class40();

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field8739 = 0;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field8741 = 0;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Ljava/awt/Font;")
    public static Font field8740;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)Z", line = 12)
    public static final boolean method3446(int arg0, int arg1, int arg2) {
        field8737++;
        if (arg2 == 0) {
            return (arg1 & 0x100) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZIILpl;BI)V", line = 32)
    public static final void method3447(boolean arg0, int arg1, int arg2, class612 arg3, byte arg4, int arg5) {
        field8736++;
        class327.method1866(0L, -74, arg1, arg0, arg3, arg5, arg2);
        int var6 = -118 % ((arg4 - 38) / 34);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V", line = 45)
    public static void method3448(byte arg0) {
        field8738 = null;
        field8740 = null;
        if (arg0 < 2) {
            field8740 = null;
        }
    }
}
