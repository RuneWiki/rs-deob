import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class14 {

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field239 = 0;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field238 = 0;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "Leo;")
    public static class423 field240;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V", line = 3)
    public static void method95(int arg0) {
        if (arg0 != 3) {
            field239 = -30;
        }
        field240 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIB)I", line = 17)
    public static final int method96(int arg0, int arg1, byte arg2) {
        if (arg2 > -10) {
            field240 = null;
        }
        field237++;
        return arg0 == 4 || arg0 == 5 ? class76.field975[arg1 & 0x3] : 256;
    }
}
