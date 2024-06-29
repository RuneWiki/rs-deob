import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class258 {

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "Lwl;")
    public static class452 field3955 = new class452(93, -2);

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "[Ldm;")
    public static class265[] field3956 = new class265[14];

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)I")
    public static final int method1602(byte arg0, int arg1) {
        field3954++;
        int var2 = -108 % ((-arg0 - 21) / 61);
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public static void method1603(int arg0) {
        field3955 = null;
        field3956 = null;
        if (arg0 != 2) {
            method1603(-73);
        }
    }
}
