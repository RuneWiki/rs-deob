import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class395 extends class456 {

    @OriginalMember(owner = "client!lu", name = "J", descriptor = "Lsh;")
    public static class472 field5813 = new class472(52, 4);

    @OriginalMember(owner = "client!lu", name = "N", descriptor = "[I")
    public static int[] field5817 = new int[13];

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!lu", name = "I", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!lu", name = "K", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!lu", name = "L", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!lu", name = "M", descriptor = "Ln;")
    public static class362 field5816;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method33(int arg0, int arg1) {
        field5811++;
        if (arg0 != -1) {
            field5817 = null;
        }
        return class288.field4397;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V", line = 15)
    public class395() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "(I)V", line = 18)
    public static void method2379(int arg0) {
        field5817 = null;
        field5813 = null;
        field5816 = null;
        if (arg0 <= 125) {
            method2379(33);
        }
    }
}
