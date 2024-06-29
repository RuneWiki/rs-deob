import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class152 {

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "Loh;")
    public static class263 field2740 = class253.method1681(-125, "rect_debug=");

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "Loh;")
    private static class263 field2744 = class253.method1681(-121, "Loading textures )2 ");

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Loh;")
    public static class263 field2743 = class253.method1681(-123, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Loh;")
    public static class263 field2736 = field2744;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Loh;")
    private static class263 field2746 = class253.method1681(-128, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Loh;")
    public static class263 field2741 = field2746;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "Loh;")
    private static class263 field2747 = class253.method1681(-126, "Use");

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Loh;")
    public static class263 field2739 = field2747;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Loh;")
    private static class263 field2737 = class253.method1681(-127, "Loading fonts )2 ");

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "Loh;")
    public static class263 field2745 = field2737;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method997(int arg0) {
        field2744 = null;
        if (arg0 >= -36) {
            field2739 = null;
        }
        field2736 = null;
        field2743 = null;
        field2746 = null;
        field2745 = null;
        field2737 = null;
        field2739 = null;
        field2747 = null;
        field2741 = null;
        field2740 = null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public static final void method998(int arg0) {
        class249.field4355 = 0;
        class70.field1411 = 0;
        class150.method983(-93);
        class77.method524(-111);
        field2735++;
        class102.method687(1839);
        int var1 = 0;
        if (arg0 <= 9) {
            field2736 = null;
        }
        while (var1 < class70.field1411) {
            int var3 = class137.field2499[var1];
            if (class228.field4012 != class31.field774[var3].field4670) {
                if (class31.field774[var3].field1787.method1414((byte) -116)) {
                    class148.method974(class31.field774[var3], 100);
                }
                class31.field774[var3].field1787 = null;
                class31.field774[var3] = null;
            }
            var1++;
        }
        if (class36.field826 != class189.field3394.field3497) {
            throw new RuntimeException("gnp1 pos:" + class189.field3394.field3497 + " psize:" + class36.field826);
        }
        for (int var2 = 0; var2 < class13.field345; var2++) {
            if (class31.field774[class117.field2191[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class13.field345);
            }
        }
    }
}
