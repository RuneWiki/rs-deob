import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class342 extends class349 {

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "[I")
    public static int[] field4620 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field4618 = 0;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V", line = 5)
    public static void method2084(int arg0) {
        field4620 = null;
        if (arg0 != 0) {
            method2085(-109, (byte) 28, -60);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBI)I", line = 19)
    public static final int method2085(int arg0, byte arg1, int arg2) {
        field4619++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        int var4 = 8 % ((arg1 + 76) / 40);
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}
