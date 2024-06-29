import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class202 extends class227 {

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "Ljd;")
    public static class85 field3513 = class221.method1499("W-=hlen Sie eine Option", (byte) 112);

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public static int field3520 = -1;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "Ljd;")
    public static class85 field3512 = class221.method1499("http:)4)4", (byte) 107);

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field3519 = 0;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "Lwe;")
    public static class15 field3522 = new class15();

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "Ljd;")
    public static class85 field3524 = class221.method1499("_labels", (byte) 90);

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "Ljd;")
    public static class85 field3523 = class221.method1499("<col=ff7000>", (byte) -56);

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "Ljd;")
    public static class85 field3526 = class221.method1499("<col=00ff00>", (byte) -63);

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "Ljd;")
    private static class85 field3525 = class221.method1499("Choose Option", (byte) 118);

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "[I")
    public static int[] field3529 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "Ljd;")
    public static class85 field3530 = class221.method1499("headicons_pk", (byte) 105);

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "Ljd;")
    private static class85 field3531 = class221.method1499("Loading sprites )2 ", (byte) -62);

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "Ljd;")
    public static class85 field3527 = field3531;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "Ljd;")
    public static class85 field3532 = field3525;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "F")
    public static float field3528;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "Z")
    public static boolean field3515;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
    public static final void method1384(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class217.field3802 <= arg4 && arg4 <= class83.field1513) {
            int var5 = class144.method945(arg2, class34.field522, (byte) -116, class1.field6);
            int var6 = class144.method945(arg0, class34.field522, (byte) -116, class1.field6);
            class148.method964(arg1, true, arg4, var5, var6);
        }
        field3514++;
        if (arg3 != -8159) {
            method1384(-50, -47, -70, 33, 103);
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(Z)V")
    public static void method1385(boolean arg0) {
        field3523 = null;
        field3513 = null;
        if (!arg0) {
            field3530 = null;
        }
        field3532 = null;
        field3530 = null;
        field3512 = null;
        field3522 = null;
        field3524 = null;
        field3526 = null;
        field3529 = null;
        field3531 = null;
        field3527 = null;
        field3525 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
    public static final void method1386(int arg0, int arg1) {
        field3517++;
        class247.method1679(0);
        class255.method1769(28285);
        int var2 = class169.method1134(true, arg0).field298;
        if (arg1 != 1 || var2 == 0) {
            return;
        }
        int var3 = class256.field4563[arg0];
        if (var2 == 6) {
            class55.field967 = var3;
        }
        if (var2 == 5) {
            class150.field2543 = var3;
        }
        if (var2 == 9) {
            class47.field826 = var3;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Lrf;")
    public static final class267 method1387(int arg0, int arg1, int arg2) {
        class208 var3 = class99.field1780[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3641;
    }
}
