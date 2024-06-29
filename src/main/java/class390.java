import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class390 {

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "[I")
    public static int[] field5702 = new int[64];

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field5704 = 0;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Luc;")
    public static class51 field5701 = new class51(50);

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "[[I")
    public static int[][] field5707 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "F")
    public static float field5700;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Ll;")
    public static class315 field5706;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2517(int arg0) {
        class163.field2223 = 0;
        class142.field1805 = -1;
        field5703++;
        class47.field712 = -1;
        if (arg0 > -16) {
            field5706 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)Z", line = 21)
    public static final boolean method2518(boolean arg0, int arg1) {
        field5699++;
        if (arg1 >= -10) {
            method2519(78);
        }
        boolean var2 = class126.field1647.method498();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class126.field1647.method506();
        } else if (!class126.field1647.method424()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class256.field3747 = arg0;
            class212.method1398(-44, class63.field948);
            return true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 60)
    public static void method2519(int arg0) {
        field5707 = null;
        field5701 = null;
        field5706 = null;
        int var1 = 23 % ((-arg0 - 38) / 62);
        field5702 = null;
    }
}
