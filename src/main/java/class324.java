import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class324 {

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "[I")
    public static int[] field3983 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "[I")
    public static int[] field3981 = new int[3];

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "[[B")
    public static byte[][] field3984;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLnp;)Lcp;", line = 14)
    public static final class684 method1827(boolean arg0, class115 arg1) {
        if (arg0) {
            return null;
        } else {
            field3982++;
            return new class684(arg1.method676(-5), arg1.method676(-5), arg1.method676(-5), arg1.method676(-5), arg1.method676(-5), arg1.method676(-5), arg1.method676(-5), arg1.method676(-5), arg1.method675(-125), arg1.method620((byte) 106));
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 31)
    public static final void method1828(byte arg0) {
        field3985++;
        if (arg0 != 12) {
            method1829(101);
        }
        if (class464.field6613.toLowerCase().indexOf("microsoft") != -1) {
            class9.field93[189] = 26;
            class9.field93[190] = 72;
            class9.field93[222] = 59;
            class9.field93[219] = 42;
            class9.field93[192] = 58;
            class9.field93[221] = 43;
            class9.field93[223] = 28;
            class9.field93[191] = 73;
            class9.field93[188] = 71;
            class9.field93[186] = 57;
            class9.field93[220] = 74;
            class9.field93[187] = 27;
            return;
        }
        class9.field93[44] = 71;
        class9.field93[92] = 74;
        class9.field93[47] = 73;
        class9.field93[46] = 72;
        class9.field93[91] = 42;
        if (class464.field6606 == null) {
            class9.field93[192] = 58;
            class9.field93[222] = 59;
        } else {
            class9.field93[520] = 59;
            class9.field93[222] = 58;
            class9.field93[192] = 28;
        }
        class9.field93[93] = 43;
        class9.field93[59] = 57;
        class9.field93[61] = 27;
        class9.field93[45] = 26;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 81)
    public static void method1829(int arg0) {
        field3983 = null;
        field3984 = null;
        field3981 = null;
        if (arg0 != 60) {
            method1827(false, null);
        }
    }
}
