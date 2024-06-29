import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class287 extends class231 {

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Lck;")
    public static class119 field4725 = class298.method1987((byte) 53, "(U0a )2 via: ");

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "Lck;")
    public static class119 field4727 = class298.method1987((byte) 101, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Lck;")
    private static class119 field4729 = class298.method1987((byte) 101, "wave:");

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "[I")
    public static int[] field4732 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field4731 = 0;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "Lck;")
    public static class119 field4726 = field4729;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "Lck;")
    public static class119 field4730 = field4729;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "[J")
    public static long[] field4728 = new long[1000];

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V", line = 25)
    public static void method1921(byte arg0) {
        field4730 = null;
        field4732 = null;
        field4729 = null;
        field4726 = null;
        field4727 = null;
        field4728 = null;
        field4725 = null;
        int var1 = 29 % ((arg0 - 10) / 46);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIBI)V", line = 40)
    public static final void method1922(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4733++;
        if (arg3 != 6) {
            field4726 = (class119) null;
        }
        if (class108.field1650 <= arg0 && arg0 <= class236.field3800) {
            int var5 = class197.method1264(-122, arg1, class79.field1226, class59.field957);
            int var6 = class197.method1264(arg3 - 130, arg2, class79.field1226, class59.field957);
            class179.method1152(var6, arg4, arg0, var5, (byte) -125);
        }
    }
}
