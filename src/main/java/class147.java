import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class147 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Lcd;")
    public static class64 field2592 = class44.method335((byte) 71, "::clientjs5drop");

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Lcd;")
    public static class64 field2595 = class44.method335((byte) 71, "Abbrechen");

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "[I")
    public static int[] field2594 = new int[5];

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "B")
    public static byte field2598;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "[Lnm;")
    public static class176[] field2597;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "[S")
    public static short[] field2599;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "[[Z")
    public static boolean[][] field2593;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1044(int arg0, int arg1) {
        if (arg1 == 5) {
            field2596++;
            class149.field2616.method1197((byte) 78, arg0);
            class12.field231.method1197((byte) 116, arg0);
            class168.field2926.method1197((byte) 98, arg0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 39)
    public static void method1045(int arg0) {
        field2593 = (boolean[][]) null;
        field2592 = null;
        field2595 = null;
        field2594 = null;
        field2599 = null;
        if (arg0 < -55) {
            field2597 = null;
        }
    }
}
