import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class179 extends class44 {

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public int field3564 = 0;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public int field3567 = -1;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "Lkb;")
    private static class93 field3555 = class76.method390("shake:", 0);

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "[Lkb;")
    public static class93[] field3549 = new class93[200];

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "Lkb;")
    public static class93 field3558 = field3555;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "Lkb;")
    public static class93 field3550 = field3555;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field3552 = 0;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "Lkb;")
    public static class93 field3568 = class76.method390("Willkommen auf RuneScape", 0);

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public int field3551;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public int field3553;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public int field3554;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public int field3556;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public int field3559;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public int field3560;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public int field3561;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public int field3562;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public int field3566;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)V")
    public static final void method1176(boolean arg0) {
        if (!arg0) {
            field3555 = null;
        }
        if (class177.field3509 != null) {
            class154 var1 = class177.field3509;
            synchronized (class177.field3509) {
                class177.field3509 = null;
            }
        }
        field3563++;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public static void method1177(int arg0) {
        field3555 = null;
        field3558 = null;
        if (arg0 != 200) {
            method1176(true);
        }
        field3549 = null;
        field3568 = null;
        field3550 = null;
    }
}
