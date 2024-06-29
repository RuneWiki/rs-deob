import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class122 {

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field1746 = 0;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "[I")
    public static int[] field1745 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lqj;")
    private static class196 field1742 = class80.method502("Your ignore list is full)3 Max of 100 users)3", -48);

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "[I")
    public static int[] field1747 = new int[32];

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lqj;")
    public static class196 field1748 = field1742;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Lbk;")
    public static class136 field1743;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method749(int arg0) {
        if (arg0 != -6601) {
            method749(1);
        }
        field1748 = null;
        field1747 = null;
        field1742 = null;
        field1745 = null;
        field1743 = null;
    }
}
