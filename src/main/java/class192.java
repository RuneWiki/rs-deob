import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class192 extends class82 {

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public int field2943 = 0;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
    public int field2946 = -1;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "[I")
    public static int[] field2956 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public int field2941;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public int field2942;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public int field2944;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    public int field2947;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
    public int field2955;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "I")
    public int field2957;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "Lrl;")
    public static class164 field2953;

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "Lpf;")
    public static class294 field2959;

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "Ljf;")
    public static class65 field2958;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(CI)Z")
    public static final boolean method1203(char arg0, int arg1) {
        field2945++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ') {
            return true;
        } else {
            if (arg1 != 1) {
                method1204(105);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)V")
    public static void method1204(int arg0) {
        field2956 = null;
        field2958 = null;
        field2959 = null;
        if (arg0 == -339) {
            field2953 = null;
        }
    }
}
