import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class class198 extends class5 {

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lth;")
    public static class430 field2623 = new class430(14, 1);

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lth;")
    public static class430 field2624 = new class430(15, 4);

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Lth;")
    public static class430 field2625 = new class430(16, -2);

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lth;")
    public static class430 field2626 = new class430(17, 0);

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lth;")
    public static class430 field2627 = new class430(18, -2);

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Lth;")
    public static class430 field2628 = new class430(19, -2);

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Lth;")
    public static class430 field2629 = new class430(20, 6);

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Lth;")
    public static class430 field2630 = new class430(21, 9);

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Lth;")
    public static class430 field2631 = new class430(22, -2);

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lth;")
    public static class430 field2632 = new class430(23, 4);

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Lth;")
    public static class430 field2633 = new class430(24, -1);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Lth;")
    public static class430 field2634 = new class430(25, -2);

    @OriginalMember(owner = "client!w", name = "v", descriptor = "[Lth;")
    private static class430[] field2635 = new class430[32];

    @OriginalMember(owner = "client!w", name = "w", descriptor = "Ljs;")
    public static class221 field2636;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1321(int arg0) {
        field2632 = null;
        field2626 = null;
        field2627 = null;
        field2630 = null;
        field2635 = null;
        field2633 = null;
        field2623 = null;
        field2634 = null;
        field2624 = null;
        if (arg0 != 15) {
            return;
        }
        field2636 = null;
        field2625 = null;
        field2628 = null;
        field2631 = null;
        field2629 = null;
    }

    static {
        class430[] var0 = class372.method2352((byte) 24);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2635[var0[var1].field6547] = var0[var1];
        }
        field2636 = new class221(1);
    }
}
