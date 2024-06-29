import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class150 {

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public int field2749;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public int field2748;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Lmb;")
    private static class132 field2750 = class166.method1092("Your profile will be transferred in:", 124);

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "[I")
    public static int[] field2751 = new int[] { 2, 2, 4, 0, 1, 8, 0 };

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "Lmb;")
    public static class132 field2754 = field2750;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "Lmb;")
    private static class132 field2755 = class166.method1092("wishes to trade with you)3", 114);

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "Lmb;")
    public static class132 field2747 = class166.method1092("rot:", 122);

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "Lmb;")
    public static class132 field2742 = field2755;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "Lpb;")
    public static class165 field2744;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "Lhh;")
    public static class85 field2745;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "[Lvi;")
    public static class233[] field2756;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method991(int arg0) {
        field2742 = null;
        field2756 = null;
        field2744 = null;
        if (arg0 != 5691) {
            field2750 = null;
        }
        field2755 = null;
        field2747 = null;
        field2754 = null;
        field2751 = null;
        field2750 = null;
        field2745 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)Z")
    public static final boolean method992(byte arg0, int arg1) {
        field2741++;
        int var2 = -2 / ((arg0 - 34) / 50);
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class150() {
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIZI)V")
    public static final void method993(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            method992((byte) 126, -57);
        }
        for (int var5 = 0; var5 < client.field536; var5++) {
            if (class203.field3725[var5] + class13.field168[var5] > arg2 && arg2 + arg4 > class203.field3725[var5] && class236.field4270[var5] + class128.field2382[var5] > arg1 && arg0 + arg1 > class236.field4270[var5]) {
                class196.field3636[var5] = true;
            }
        }
        field2743++;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lni;)V")
    public class150(class150 arg0) {
        this.field2749 = arg0.field2749;
        this.field2748 = arg0.field2748;
        this.field2753 = arg0.field2753;
        this.field2740 = arg0.field2740;
    }
}
