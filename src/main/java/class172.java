import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class172 {

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field2739 = 0;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "Lwg;")
    public static class450 field2743 = new class450(9, 0, 4, 1);

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public int field2741;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public int field2744;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public int field2745;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public int field2746;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    public int field2747;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    public int field2748;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public int field2749;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
    public int field2752;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public int field2754;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "[I")
    public static int[] field2750;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V", line = 19)
    public static void method1311(int arg0) {
        field2750 = null;
        if (arg0 == 0) {
            field2743 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Laq;I)Z", line = 34)
    public final boolean method1312(class172 arg0, int arg1) {
        field2740++;
        if (arg1 != 4) {
            method1311(-98);
        }
        return this.field2742 == arg0.field2742 && this.field2745 == arg0.field2745 && this.field2747 == arg0.field2747;
    }
}
