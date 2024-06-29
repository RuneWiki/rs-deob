import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class152 {

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lck;")
    public static class119 field2422 = class298.method1987((byte) 81, ")4l=");

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lck;")
    private static class119 field2419 = class298.method1987((byte) 12, "Choose Option");

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Lck;")
    private static class119 field2424 = class298.method1987((byte) 41, "Members object");

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field2427 = 0;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Lck;")
    public static class119 field2425 = field2424;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lck;")
    public static class119 field2429 = field2419;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2423 = 0;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lck;")
    private static class119 field2430 = class298.method1987((byte) 124, "Players");

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lck;")
    public static class119 field2418 = field2430;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field2428 = 0;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Lwi;")
    public static class23 field2426;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)I", line = 5)
    public static final int method976(int arg0, int arg1, int arg2) {
        if (arg2 != -15232) {
            method976(-107, -24, 6);
        }
        field2421++;
        int var3 = class157.method1007(arg0 + 91923, 4, (byte) 105, arg1 + 45365) + ((class157.method1007(arg0 + 37821, 2, (byte) 105, arg1 - -10294) + -128 >> 1) - -(class157.method1007(arg0, 1, (byte) 105, arg1) - 128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 80)
    public static void method977(byte arg0) {
        if (arg0 < 2) {
            field2427 = 21;
        }
        field2430 = null;
        field2426 = null;
        field2425 = null;
        field2429 = null;
        field2418 = null;
        field2422 = null;
        field2419 = null;
        field2424 = null;
    }
}
