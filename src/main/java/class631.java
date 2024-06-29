import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class631 {

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field8765 = 0;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Lqia;")
    public static class547 field8763 = new class547();

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method3433(int arg0) {
        if (arg0 <= 48) {
            method3435(8, -118, 84);
        }
        field8763 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V")
    public static final void method3434(int arg0, String arg1, String arg2) {
        class643.field8880 = -1;
        class202.field2576 = 1;
        field8764++;
        class406.method2407(-1591, arg1, false, arg2);
        if (arg0 != 0) {
            method3433(37);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
    public static final void method3435(int arg0, int arg1, int arg2) {
        field8762++;
        class548 var3 = class696.method3872(arg2, arg1, -1633381944);
        var3.method3130(119);
        var3.field7725 = arg0;
    }
}
