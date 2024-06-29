import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class174 extends class147 {

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "Ln;")
    public static class282 field2723 = new class282(64);

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "Lna;")
    public static class26 field2724 = class69.method505("::clientjs5drop", (byte) -121);

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "Lna;")
    public static class26 field2727 = class69.method505(")4l=", (byte) -121);

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public int field2721;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public int field2722;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "[I")
    public static int[] field2725;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)V", line = 16)
    public static final void method1192(int arg0, int arg1) {
        field2719++;
        class22.field315.method1985(-127, arg0);
        if (arg1 == 64) {
            class295.field4909.method1985(-126, arg0);
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V", line = 34)
    public static void method1193(int arg0) {
        field2723 = null;
        field2725 = null;
        field2724 = null;
        field2727 = null;
        if (arg0 != 26971) {
            method1192(-51, -76);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[Lna;)[Lna;", line = 48)
    public static final class26[] method1194(int arg0, class26[] arg1) {
        field2720++;
        class26[] var2 = new class26[5];
        if (arg0 != 19406) {
            method1193(-26);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class236.method1587(new class26[] { class149.method1019((byte) 9, var3), class281.field4694 }, (byte) -67);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class236.method1587(new class26[] { var2[var3], arg1[var3] }, (byte) -62);
            }
        }
        return var2;
    }
}
