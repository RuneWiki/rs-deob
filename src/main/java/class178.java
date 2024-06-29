import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class178 {

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "[I")
    public static int[] field3535 = new int[500];

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lkb;")
    private static class93 field3539 = class76.method390("Error loading your profile)3", 0);

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "Lkb;")
    public static class93 field3544 = class76.method390("Bitte versuchen Sie es erneut)3", 0);

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Lkb;")
    private static class93 field3543 = class76.method390("We suspect someone knows your password)3", 0);

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field3545 = 0;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "Lkb;")
    public static class93 field3547 = field3543;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "Lkb;")
    public static class93 field3540 = field3539;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lkb;")
    public static class93 field3537 = class76.method390("<img=1>", 0);

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Lkb;")
    private static class93 field3548 = class76.method390("white:", 0);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lkb;")
    public static class93 field3533 = field3548;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "Lkb;")
    public static class93 field3546 = class76.method390(" (X", 0);

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Lkb;")
    public static class93 field3536 = field3548;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lsa;")
    public static class164 field3542;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lh;I)I")
    public static final int method1173(class65 arg0, int arg1) {
        field3534++;
        if (arg1 < 123) {
            return -22;
        } else {
            class197 var2 = (class197) class37.field610.method616(((long) arg0.field1058 << 32) + ((long) arg0.field1127), -1);
            return var2 == null ? arg0.field1147 : var2.field3840;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method1174(int arg0) {
        field3540 = null;
        field3543 = null;
        field3542 = null;
        if (arg0 != -5827) {
            method1175(7, null, null);
        }
        field3547 = null;
        field3539 = null;
        field3544 = null;
        field3533 = null;
        field3546 = null;
        field3548 = null;
        field3537 = null;
        field3535 = null;
        field3536 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILjg;Ljg;)V")
    public static final void method1175(int arg0, class89 arg1, class89 arg2) {
        class107.field1950 = arg1;
        field3541++;
        class165.field3253 = arg2;
        if (arg0 != -26512) {
            method1175(-79, null, null);
        }
    }
}
