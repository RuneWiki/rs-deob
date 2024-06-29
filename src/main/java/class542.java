import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class542 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public int field7725;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public int field7728;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public int field7733;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public int field7727;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "[I")
    public static int[] field7730 = new int[1];

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Lqe;")
    public static class469 field7732 = null;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "F")
    public static float field7729;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)Lac;", line = 6)
    public final class542 method3172(byte arg0, int arg1) {
        field7731++;
        if (arg0 < 117) {
            method3173((byte) -105);
        }
        return new class542(this.field7727, arg1, this.field7725, this.field7733);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 19)
    public static void method3173(byte arg0) {
        if (arg0 <= 100) {
            field7732 = null;
        }
        field7730 = null;
        field7732 = null;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIII)V", line = 40)
    public class542(int arg0, int arg1, int arg2, int arg3) {
        this.field7725 = arg2;
        this.field7728 = arg1;
        this.field7733 = arg3;
        this.field7727 = arg0;
    }
}
