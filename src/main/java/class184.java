import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class184 {

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field3023 = 0;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Lij;")
    public static class50 field3025 = class78.method578(123, "null");

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "[[[Le;")
    public static class86[][][] field3022 = new class86[4][104][104];

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "[I")
    public static int[] field3026 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Lij;")
    private static class50 field3028 = class78.method578(124, "wave2:");

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Lij;")
    public static class50 field3021 = field3028;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Lij;")
    public static class50 field3027 = field3028;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "[[[I")
    public static int[][][] field3024;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
    public static final void method1247(int arg0, int arg1) {
        class236.field3952.method770(true, arg0);
        if (arg1 != -9574) {
            field3028 = null;
        }
        field3019++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method1248(int arg0) {
        field3025 = null;
        field3024 = null;
        field3028 = null;
        field3027 = null;
        if (arg0 >= 56) {
            field3026 = null;
            field3021 = null;
            field3022 = null;
        }
    }
}
