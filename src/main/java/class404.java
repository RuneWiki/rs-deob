import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class404 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "[S")
    public static short[] field5940 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 3)
    public static void method2420(int arg0) {
        if (arg0 != 12345678) {
            field5940 = null;
        }
        field5940 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBI)I", line = 15)
    public static final int method2421(int arg0, byte arg1, int arg2) {
        field5941++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = 30 % ((arg1 - 29) / 42);
            int var4 = (arg0 & 0x7F) * arg2 >> 7;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }
}
