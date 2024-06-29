import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class95 {

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "[I")
    public static int[] field1705 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public static int field1709 = 0;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public static int field1707 = 0;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "Lom;")
    public static class344 field1708;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
    public static void method908(int arg0) {
        if (arg0 != 2047) {
            field1708 = null;
        }
        field1708 = null;
        field1705 = null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)V")
    public static final void method909(byte arg0, int arg1) {
        if (arg0 <= 0) {
            method908(-89);
        }
        if (arg1 == 37) {
            class407.field5876 = 3.0F;
        } else if (arg1 == 50) {
            class407.field5876 = 4.0F;
        } else if (arg1 == 75) {
            class407.field5876 = 6.0F;
        } else if (arg1 == 100) {
            class407.field5876 = 8.0F;
        } else if (arg1 == 200) {
            class407.field5876 = 16.0F;
        }
        field1706++;
        class459.field6560 = -1;
        class459.field6560 = -1;
    }
}
