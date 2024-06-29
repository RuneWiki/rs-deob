import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class219 {

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "Lci;")
    public static class414 field3065 = null;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public static int field3066 = 0;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "Lem;")
    public static class206 field3067 = new class206(11, -1);

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "[I")
    public static int[] field3068 = new int[1];

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "[I")
    public static int[] field3069;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)I", line = 6)
    public static final int method1397(int arg0, int arg1) {
        field3064++;
        if (arg0 == 0) {
            return arg1 == 16711935 ? -1 : class622.method3457(false, arg1);
        } else {
            return 45;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V", line = 21)
    public static void method1398(int arg0) {
        field3068 = null;
        field3067 = null;
        field3065 = null;
        int var1 = 50 % ((arg0 - 19) / 36);
        field3069 = null;
    }
}
