import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class643 {

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "[I")
    public static int[] field9108 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "Lcb;")
    public static class318 field9107 = new class318(40, -1);

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "Ljj;")
    public static class398 field9110 = new class398(33, 7);

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "[Z")
    public static boolean[] field9112 = new boolean[100];

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "Ljj;")
    public static class398 field9111 = new class398(50, 3);

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "Z")
    public static boolean field9114 = true;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "S")
    public static short field9115 = 256;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "Lek;")
    public static class540 field9113;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZB)V", line = 11)
    public static final void method3581(int arg0, boolean arg1, byte arg2) {
        if (arg2 != 54) {
            field9112 = null;
        }
        field9109++;
        class149 var3 = class255.method1597(arg0, arg1, arg2 + 27574);
        if (var3 != null) {
            var3.method175(arg2 ^ 0x77BA);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 37)
    public static void method3582(int arg0) {
        field9111 = null;
        if (arg0 <= 17) {
            field9114 = false;
        }
        field9110 = null;
        field9107 = null;
        field9108 = null;
        field9112 = null;
        field9113 = null;
    }
}
