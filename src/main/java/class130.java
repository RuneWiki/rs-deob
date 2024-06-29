import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class130 {

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field1678 = 0;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "[I")
    public static int[] field1682 = new int[1000];

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "Lae;")
    public static class283 field1675;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "[I")
    public static int[] field1680;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "[I")
    public static int[] field1683;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(III)Z")
    public static final boolean method888(int arg0, int arg1, int arg2) {
        field1676++;
        int var3 = 119 / ((-arg0 - 23) / 54);
        return class726.method4039(0, arg1, arg2) || class723.method4032(arg1, true, arg2);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V")
    public static void method889(byte arg0) {
        field1683 = null;
        if (arg0 > -96) {
            method888(-31, -50, 30);
        }
        field1682 = null;
        field1680 = null;
        field1675 = null;
    }
}
