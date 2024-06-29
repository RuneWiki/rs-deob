import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class544 {

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "[I")
    public static int[] field6815 = new int[4];

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "Lrn;")
    public static class633 field6817 = new class633(6, 16);

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    public static int field6819 = 0;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "[Lpu;")
    public static class772[] field6816;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BI)J", line = 12)
    public static final long method2953(byte arg0, int arg1) {
        field6820++;
        int var2 = -81 % ((34 - arg0) / 59);
        return (long) (arg1 + 11745) * 86400000L;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 22)
    public static void method2954(int arg0) {
        field6816 = null;
        field6815 = null;
        if (arg0 == 0) {
            field6817 = null;
        }
    }
}
