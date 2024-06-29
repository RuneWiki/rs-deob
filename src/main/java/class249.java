import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class249 {

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field3167 = 0;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BIII)V")
    public static final void method1522(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 82) {
            method1522((byte) -15, 7, -11, -44);
        }
        field3166++;
        class548 var4 = class696.method3872(arg1, 11, -1633381944);
        var4.method3130(112);
        var4.field7725 = arg2;
        var4.field7726 = arg3;
    }
}
