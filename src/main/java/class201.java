import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class201 {

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "Lkg;")
    public static class275 field2709 = new class275(51, 3);

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "[I")
    public static int[] field2708;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BII)V")
    public static final void method1310(byte arg0, int arg1, int arg2) {
        field2710++;
        class37 var3 = class636.method3571(14, arg1, -79);
        var3.method232(-3);
        int var4 = -88 % ((4 - arg0) / 40);
        var3.field579 = arg2;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
    public static void method1311(int arg0) {
        if (arg0 != 3) {
            field2708 = null;
        }
        field2708 = null;
        field2709 = null;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IC)Z")
    public static final boolean method1312(int arg0, char arg1) {
        field2707++;
        if (arg0 < 88) {
            method1312(110, 'Q');
        }
        return arg1 >= '0' && arg1 <= '9';
    }
}
