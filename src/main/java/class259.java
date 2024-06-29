import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class259 {

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "[I")
    public static int[] field4600 = new int[32];

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Lli;")
    public static class185 field4596 = class245.method1649("<col=ffffff>", 1);

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "[J")
    public static long[] field4602 = new long[200];

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field4595 = 0;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field4606 = 0;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field4601 = 0;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Z")
    public static boolean field4598;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "[I")
    public static int[] field4604;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lp;II)I")
    public static final int method1755(class82 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field4596 = null;
        }
        field4603++;
        if (!class145.method1038(arg1, client.method1502(arg0), 15975) && arg0.field1496 == null) {
            return -1;
        } else if (arg0.field1638 == null || arg0.field1638.length <= arg1) {
            return -1;
        } else {
            return arg0.field1638[arg1];
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lli;Z)V")
    public static final void method1756(class185 arg0, boolean arg1) {
        class225.method1558(false, false);
        if (!arg1) {
            field4596 = null;
        }
        class188.method1360(arg0, (byte) -123);
        field4597++;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z")
    public static final boolean method1757(int arg0, int arg1) {
        if (arg1 == -20843) {
            field4605++;
            return (arg0 >> 28 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public static void method1758(boolean arg0) {
        if (!arg0) {
            field4604 = null;
        }
        field4600 = null;
        field4596 = null;
        field4602 = null;
        field4604 = null;
    }
}
