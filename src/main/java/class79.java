import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class79 {

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    private int field969;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Ldk;")
    public static class326 field968 = new class326("M", "M", "M", "M");

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field972 = 0;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "[Z")
    public static boolean[] field974 = new boolean[8];

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Z")
    public static boolean field971 = false;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!wf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field967++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)I")
    public final int method454(byte arg0) {
        field970++;
        int var2 = -96 / ((arg0 + 14) / 49);
        return this.field969;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(II)V")
    public class79(int arg0, int arg1) {
        this.field969 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
    public static void method455(boolean arg0) {
        if (!arg0) {
            field968 = null;
        }
        field968 = null;
        field974 = null;
    }
}
