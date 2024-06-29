import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class609 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "Lsea;")
    public static class648 field8458;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Lsea;")
    public static class648 field8459;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BJ)V")
    public static final void method3417(byte arg0, long arg1) {
        field8457++;
        class352 var3 = class555.method3114(-1);
        var3.field4686.method2817(class206.field2894.field6750, true);
        var3.field4686.method2834(arg1, 120);
        int var4 = -82 % ((-arg0 - 71) / 50);
        var3.field4686.method2817(class697.field9900, true);
        class602.method3388(var3, (byte) 28);
        class129.field1850 = 0;
        class263.field3571 = 1;
        class610.field8467 = -3;
        class672.field9428 = 0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method3418(int arg0) {
        field8458 = null;
        field8459 = null;
        if (arg0 < 119) {
            method3417((byte) 36, -16L);
        }
    }
}
