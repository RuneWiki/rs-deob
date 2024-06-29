import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class229 {

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field3994 = 0;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "[I")
    public static int[] field3998 = new int[50];

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
    public static void method1587(int arg0) {
        if (arg0 < 95) {
            method1588(94, -34, 48);
        }
        field3998 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)Z")
    public static final boolean method1588(int arg0, int arg1, int arg2) {
        field3995++;
        if (arg1 != -17634) {
            field3994 = -11;
        }
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Z")
    public static final boolean method1589(byte arg0) {
        int var1 = 57 % ((-arg0 - 49) / 48);
        field3996++;
        return class255.field4320 != class180.field2857 || class407.field6189 >= 2;
    }
}
