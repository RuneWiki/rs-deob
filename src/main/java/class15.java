import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class15 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Lrga;")
    public static class280 field255 = new class280(25, 12);

    @OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
    public static int[] field257 = new int[25];

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)I")
    public static final int method109(int arg0, int arg1, int arg2) {
        field256++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (arg1 <= 124) {
            field255 = null;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method110(int arg0) {
        field257 = null;
        field255 = null;
        if (arg0 != 32088) {
            method110(89);
        }
    }
}
