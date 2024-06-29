import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class154 {

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public static final void method1188(int arg0) {
        field2507++;
        class259.method1746(arg0 + 15);
        class82.method783(class693.field9368.field4437.method3426(-32350) == 1, 2, true, 22050);
        class297.field4175 = class65.method669(22050, class689.field9299, class458.field6458, 0, 7);
        class161.method1231(true, arg0 - 82, class584.method3341(null, 9));
        class603.field8276 = class65.method669(2048, class689.field9299, class458.field6458, arg0, 7);
        class603.field8276.method3169(false, class326.field4510);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III)I")
    public static final int method1189(int arg0, int arg1, int arg2) {
        field2509++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg1 > -25) {
            return 58;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }
}
