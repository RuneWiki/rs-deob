import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class196 {

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lok;")
    public static class41 field3160 = class137.method956("<col=ff3000>", 45);

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field3159 = 0;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Z")
    public static boolean field3165 = false;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 20)
    public static void method1400(int arg0) {
        if (arg0 == 0) {
            field3160 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 30)
    public static final void method1401(int arg0) {
        field3158++;
        if (arg0 != 75) {
            method1403(true);
        }
        class109.field1530 = null;
        class71.method515();
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V", line = 51)
    public static final void method1402(int arg0, int arg1) {
        field3166++;
        if (class208.field3368 == arg1 && arg1 != 0) {
            class99 var2 = class109.field1530[arg1];
            var2.method155(class218.field3490);
        }
        int var3 = -98 % ((57 - arg0) / 32);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)I", line = 68)
    public static final int method1403(boolean arg0) {
        field3161++;
        if ((double) class129.field1915 == 3.0D) {
            return 37;
        } else if ((double) class129.field1915 == 4.0D) {
            return 50;
        } else {
            if (!arg0) {
                field3159 = 4;
            }
            return (double) class129.field1915 == 6.0D ? 75 : 100;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([BI)Lwb;", line = 101)
    public static final class82 method1404(byte[] arg0, int arg1) {
        field3163++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != 0) {
            method1401(9);
        }
        class82 var2 = new class82(arg0, class95.field1412, class314.field5288, class69.field1040, class173.field2812, class223.field3562);
        class286.method2005((byte) -9);
        return var2;
    }
}
