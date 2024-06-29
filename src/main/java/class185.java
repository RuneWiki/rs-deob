import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class185 {

    @OriginalMember(owner = "client!os", name = "b", descriptor = "[I")
    public static int[] field2612;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "Lcm;")
    public static class449 field2611;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "[Z")
    public static boolean[] field2614;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "[I")
    public static int[] field2613;

    static {
        new class375(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
        field2612 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field2611 = new class449(56, -1);
        field2614 = new boolean[5];
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V", line = 15)
    public static void method1314(int arg0) {
        field2614 = null;
        field2611 = null;
        field2612 = null;
        if (arg0 != 4194303) {
            field2614 = null;
        }
        field2613 = null;
    }
}
