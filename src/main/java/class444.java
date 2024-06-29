import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class444 {

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field6856 = 1339;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "[I")
    public static int[] field6854 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field6857 = 0;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "[I")
    public static int[] field6858;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILlt;)V", line = 15)
    public static final void method2662(int arg0, class458 arg1) {
        int var2 = -36 / ((arg0 - 55) / 36);
        class183.field2907 = arg1.method2720("titlebg", 1);
        field6855++;
        class255.field3883 = arg1.method2720("logo", 1);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V", line = 36)
    public static void method2663(boolean arg0) {
        field6858 = null;
        if (arg0) {
            method2662(-87, null);
        }
        field6854 = null;
    }
}
