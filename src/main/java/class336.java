import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class336 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Lim;")
    public static class353 field4694 = new class353(79, 2);

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Lim;")
    public static class353 field4695 = new class353(51, 5);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static void method2132(int arg0) {
        field4695 = null;
        field4694 = null;
        if (arg0 != 5) {
            method2132(89);
        }
    }
}
