import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class563 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lcu;")
    public static class206 field7462 = new class206(7, 16);

    @OriginalMember(owner = "client!re", name = "e", descriptor = "[[I")
    public static int[][] field7466 = new int[6][];

    @OriginalMember(owner = "client!re", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field7468 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!re", name = "c", descriptor = "F")
    public static float field7464;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Lbi;")
    public static class449 field7467;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Lck;")
    public static class600 field7465;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Z")
    public static final boolean method3089(int arg0, int arg1, int arg2) {
        if (arg0 > -97) {
            method3091(-79, -53, 93, -3);
        }
        field7463++;
        return (arg2 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method3090(int arg0) {
        field7462 = null;
        field7467 = null;
        field7465 = null;
        field7468 = null;
        field7466 = null;
        if (arg0 != 7) {
            field7464 = 0.5403332F;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)V")
    public static final void method3091(int arg0, int arg1, int arg2, int arg3) {
        class24 var4 = class703.field9899[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class18 var5 = var4.field396;
        class18 var6 = var4.field413;
        if (var5 != null) {
            var5.field303 = var5.field303 * arg3 / (0x10 << class348.field4782 - 7);
            var5.field297 = var5.field297 * arg3 / (0x10 << class348.field4782 - 7);
        }
        if (var6 != null) {
            var6.field303 = var6.field303 * arg3 / (0x10 << class348.field4782 - 7);
            var6.field297 = var6.field297 * arg3 / (0x10 << class348.field4782 - 7);
        }
    }
}
