import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class218 extends class12 {

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "[I")
    public static int[] field3963 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "Lkh;")
    public static class117 field3966 = class224.method1450((byte) -29, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "B")
    public byte field3968;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public int field3969;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "Lkh;")
    public class117 field3958;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "Lkh;")
    public class117 field3960;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "Lvb;")
    public static class232 field3965;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
    public static void method1427(int arg0) {
        field3965 = null;
        field3963 = null;
        field3966 = null;
        if (arg0 != 0) {
            method1429(-26, null, null);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILai;Lai;Lai;Lai;)V")
    public static final void method1428(int arg0, class10 arg1, class10 arg2, class10 arg3, class10 arg4) {
        class79.field1498 = arg4;
        if (arg0 != 128) {
            return;
        }
        class240.field4352 = arg2;
        class11.field366 = arg3;
        field3959++;
        class136.field2456 = arg1;
        class90.field1675 = new class9[class11.field366.method99(118)][];
        class96.field1760 = new boolean[class11.field366.method99(34)];
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILai;Lai;)V")
    public static final void method1429(int arg0, class10 arg1, class10 arg2) {
        if (arg0 < 123) {
            method1428(-125, null, null, null, null);
        }
        class102.field1864 = arg1;
        class27.field671 = arg2;
        field3961++;
        class221.field3990 = class102.field1864.method108(3, 0);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1430(int arg0, int arg1, int arg2, int arg3) {
        if (class157.method1114(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class140.method955(var4 + 1, class156.field2839[arg0][arg1][arg2] + arg3, var5 + 1) && class140.method955(var4 + 128 - 1, class156.field2839[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class140.method955(var4 + 128 - 1, class156.field2839[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class140.method955(var4 + 1, class156.field2839[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }
}
