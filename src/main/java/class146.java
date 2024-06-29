import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class146 {

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Lhh;")
    private static class163 field2778 = class137.method1065(" from your ignore list first)3", 17);

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "[I")
    public static int[] field2780 = new int[200];

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Lhh;")
    public static class163 field2781 = field2778;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Lad;")
    public static class43 field2782 = new class43(64);

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "Lhh;")
    public static class163 field2784 = class137.method1065("zap", 17);

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "Lhh;")
    public static class163 field2785 = class137.method1065("overlay", 17);

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "Lhh;")
    public static class163 field2786 = class137.method1065("welle:", 17);

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "Lde;")
    public static class130 field2783;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)V")
    public static final void method1102(int arg0, int arg1, int arg2) {
        field2777++;
        if (class114.method906(0, arg1)) {
            if (arg2 != -1458) {
                method1104(-26);
            }
            class183.method1350(class109.field2060[arg1], false, arg0);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public static final void method1103(byte arg0) {
        if (class23.field378 != null) {
            class23.field378.method1724(true);
        }
        field2776++;
        if (arg0 != 96) {
            field2780 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method1104(int arg0) {
        field2783 = null;
        field2784 = null;
        field2786 = null;
        field2780 = null;
        field2781 = null;
        field2778 = null;
        field2782 = null;
        field2785 = null;
        if (arg0 <= 124) {
            field2784 = null;
        }
    }
}
