import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class133 extends class259 {

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field2185 = 0;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "[I")
    public static int[] field2179 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field2182 = 0;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Lie;")
    public static class2 field2183 = new class2();

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public int field2181;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public int field2187;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "[I")
    public static int[] field2189;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "[Llf;")
    public static class94[] field2180;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IC)Z")
    public static final boolean method1012(int arg0, char arg1) {
        if (arg0 != 4194303) {
            method1012(58, (char) 65493);
        }
        field2184++;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
    public static void method1013(int arg0) {
        if (arg0 > -58) {
            method1012(119, '|');
        }
        field2179 = null;
        field2183 = null;
        field2189 = null;
        field2180 = null;
    }
}
