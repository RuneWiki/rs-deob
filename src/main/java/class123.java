import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class123 {

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field2788 = 0;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "[I")
    public static int[] field2786 = new int[128];

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Lsc;")
    private static class128 field2793 = class129.method1017(false, "Please remove ");

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Lsc;")
    public static class128 field2790 = field2793;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Lsc;")
    public static class128 field2792 = field2793;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Lsc;")
    public static class128 field2795 = class129.method1017(false, "Wordpack geladen)3");

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lsc;")
    public static class128 field2794 = class129.method1017(false, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Ljd;")
    public static class66 field2789;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "[[Lhe;")
    public static class54[][] field2791;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static final void method940(byte arg0) {
        if (arg0 == -45) {
            field2785++;
            class14.field284.method919((byte) -104);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method941(int arg0) {
        field2793 = null;
        field2795 = null;
        field2792 = null;
        field2791 = null;
        field2789 = null;
        field2794 = null;
        field2790 = null;
        if (arg0 != 0) {
            method940((byte) 108);
        }
        field2786 = null;
    }
}
