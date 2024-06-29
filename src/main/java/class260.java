import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class260 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
    public static int[] field3711;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
    public static final void method1741(int arg0, int arg1) {
        field3710++;
        class20 var2 = class369.method2351((byte) 79, 12, arg0);
        if (arg1 >= -20) {
            field3712 = 103;
        }
        var2.method148(-11806);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
    public static void method1742(byte arg0) {
        if (arg0 != 55) {
            method1741(49, -48);
        }
        field3711 = null;
    }
}
