import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class275 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "Leb;")
    private static class230 field4825 = class68.method589(0, "Use");

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Leb;")
    public static class230 field4832 = field4825;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field4834 = 0;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "[I")
    public static int[] field4830 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "[Lka;")
    public static class245[] field4828;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)I")
    public static final int method1867(int arg0, int arg1, int arg2) {
        int var3 = 0;
        if (arg2 != 1) {
            field4833 = -49;
        }
        while (arg1 > 0) {
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        field4831++;
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static void method1868(int arg0) {
        field4825 = null;
        field4830 = null;
        field4828 = null;
        if (arg0 != 3043) {
            field4828 = null;
        }
        field4832 = null;
    }
}
