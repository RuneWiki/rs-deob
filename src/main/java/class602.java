import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class602 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "Lad;")
    public static class19 field8467 = new class19(50);

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "Lcq;")
    public static class110 field8472 = new class110(11, 8);

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field8471;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "[I")
    public static int[] field8470;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public static void method3369(int arg0) {
        field8472 = null;
        field8470 = null;
        if (arg0 == -31613) {
            field8467 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)Z")
    public static final boolean method3370(int arg0) {
        field8468++;
        class333 var1 = class694.field9730.field8677.field4174;
        if (var1 == null || class694.field9730.field8677 == var1) {
            return false;
        }
        class336 var2 = (class336) var1;
        if (~var2.field4231 <= arg0) {
            var2.field4231 -= 2000;
        }
        return var2.field4231 == 1007;
    }
}
