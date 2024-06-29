import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class187 extends class242 {

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "[I")
    public int[] field3279 = new int[] { -1 };

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "[I")
    public int[] field3281 = new int[] { 0 };

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public static int field3280 = 0;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "Ljf;")
    public static class229 field3282 = class212.method1457((byte) 95, ")2");

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "[Lei;")
    public static class197[] field3284 = new class197[4];

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public static int field3283 = 0;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V", line = 12)
    public static void method1302(int arg0) {
        if (arg0 < 120) {
            field3282 = (class229) null;
        }
        field3282 = null;
        field3284 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)I", line = 42)
    public static final int method1303(int arg0, int arg1) {
        field3278++;
        if (arg1 >= 65 && arg1 <= 90 || arg1 >= 192 && arg1 <= 222 && arg1 != 215) {
            return arg1 + 32;
        } else if (arg0 == arg1) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }
}
