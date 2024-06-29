import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class241 extends class33 {

    @OriginalMember(owner = "client!t", name = "s", descriptor = "Lol;")
    public static class220 field3882 = new class220();

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
    public static void method1716(byte arg0) {
        field3882 = null;
        if (arg0 >= -13) {
            field3883 = -34;
        }
    }
}
