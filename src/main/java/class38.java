import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class38 extends class362 {

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "[I")
    public static int[] field941 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field938 = 0;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "Lej;")
    public static class124 field939 = new class124(70, 0);

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lha;")
    public static class59 field937;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public static void method475(boolean arg0) {
        field941 = null;
        if (!arg0) {
            method475(false);
        }
        field939 = null;
        field937 = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(II)V")
    public class38(int arg0, int arg1) {
        this.field942 = arg0;
        this.field940 = arg1;
    }
}
