import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class45 {

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZI)I", line = 8)
    public static final int method319(int arg0, boolean arg1, int arg2) {
        field657++;
        int var3 = class289.method1765(4, arg2 + 45365, arg0 + 91923, (byte) 11) + (class289.method1765(2, arg2 + 10294, arg0 + 37821, (byte) 11) - 128 >> 1) + (class289.method1765(1, arg2, arg0, (byte) 11) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return arg1 ? var4 : 100;
    }
}
