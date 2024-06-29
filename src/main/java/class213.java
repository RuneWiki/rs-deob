import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class213 extends class105 {

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lv;")
    public static class147 field3686 = new class147(100);

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Leb;")
    private static class230 field3689 = class68.method589(0, "Loaded world list data");

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Leb;")
    public static class230 field3693 = class68.method589(0, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Leb;")
    public static class230 field3691 = field3689;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Lha;")
    public static class30 field3694 = new class30(64);

    @OriginalMember(owner = "client!me", name = "r", descriptor = "Leb;")
    public static class230 field3696 = class68.method589(0, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!me", name = "s", descriptor = "[I")
    public static int[] field3697 = new int[128];

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Leh;")
    public static class80 field3688;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "[I")
    public static int[] field3695;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static void method1476(int arg0) {
        field3694 = null;
        field3696 = null;
        field3686 = null;
        field3691 = null;
        field3688 = null;
        field3697 = null;
        if (arg0 < -20) {
            field3689 = null;
            field3695 = null;
            field3693 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public static final void method1477(int arg0) {
        class243.field4169.method1122(arg0 - 54);
        if (arg0 == 64) {
            field3687++;
        }
    }
}
