import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class230 {

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field3707 = 0;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "[I")
    public static int[] field3709 = new int[8];

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field3710 = 0;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "D")
    public static double field3708;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 17)
    public static void method1599(byte arg0) {
        if (arg0 > -64) {
            method1599((byte) 75);
        }
        field3709 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)Z", line = 30)
    public static final boolean method1600(int arg0, int arg1, int arg2) {
        if (arg1 != 8) {
            method1600(57, 124, 10);
        }
        field3706++;
        return class721.method3976(arg0, (byte) 52, arg2) | (arg0 & 0x40000) != 0 || class515.method3082(arg0, arg2, 90);
    }
}
