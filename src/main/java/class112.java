import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class112 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lcb;")
    public static class15 field2758 = new class15(64);

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "[I")
    public static int[] field2761 = new int[2048];

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "La;")
    public static class1 field2767 = class113.method934(-11538, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field2765 = 0;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "La;")
    private static class1 field2768 = class113.method934(-11538, "This world is full)3");

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "La;")
    public static class1 field2766 = field2768;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "La;")
    private static class1 field2763 = class113.method934(-11538, "To create a new account you need to");

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field2764 = 0;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[[I")
    public static int[][] field2762 = new int[104][104];

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "La;")
    private static class1 field2771 = class113.method934(-11538, "flash3:");

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "La;")
    public static class1 field2770 = field2771;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "La;")
    public static class1 field2760 = field2763;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lpb;")
    public static class92 field2759 = new class92();

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "La;")
    public static class1 field2775 = class113.method934(-11538, "0(U");

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "Lvc;")
    public static class129 field2772;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "Le;")
    public static class25 field2773;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "[I")
    public static int[] field2774;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 14)
    public static void method930(int arg0) {
        field2759 = null;
        field2775 = null;
        field2773 = null;
        field2762 = null;
        field2758 = null;
        field2763 = null;
        field2771 = null;
        field2772 = null;
        field2766 = null;
        field2767 = null;
        field2770 = null;
        field2774 = null;
        field2761 = null;
        field2768 = null;
        field2760 = null;
        int var1 = -39 % ((70 - arg0) / 56);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBI)V", line = 44)
    public static final void method931(int arg0, byte arg1, int arg2) {
        if (arg1 != 110) {
            return;
        }
        if (class62.field1557 != 0 && arg2 != -1) {
            class72.method684(false, 1, arg2, class62.field1557, 0, class93.field2327, arg1 ^ 0xFFFFFF91);
            class75.field1863 = arg0;
        }
        field2757++;
    }
}
