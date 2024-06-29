import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class347 {

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "Lem;")
    public static class206 field4638 = new class206(89, 11);

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4641 = null;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "Lnp;")
    public static class454 field4640;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 5)
    public static final void method2015(String arg0, int arg1) {
        field4639++;
        if (class174.field2525 == null) {
            return;
        }
        class451.field6197++;
        if (arg1 != 89) {
            field4640 = null;
        }
        class352 var2 = class290.method1786(98, class199.field2836, class439.field6092);
        var2.field4686.method2817(class705.method3947((byte) -47, arg0), true);
        var2.field4686.method2820(-79, arg0);
        class602.method3388(var2, (byte) 28);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V", line = 27)
    public static void method2016(int arg0) {
        field4638 = null;
        int var1 = -84 % ((arg0 - 4) / 39);
        field4640 = null;
        field4641 = null;
    }
}
