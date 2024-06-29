import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class393 {

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "Ltm;")
    public static class334 field5871 = new class334(77, 0);

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "F")
    public static float field5872 = 0.0F;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)V")
    public static final void method2447(int arg0, int arg1) {
        field5873++;
        if (arg1 != -9502) {
            return;
        }
        class124 var2 = (class124) class662.field9426.method3512(true, (long) arg0);
        if (var2 != null) {
            var2.field1905 = !var2.field1905;
            var2.field1904.method4085(var2.field1905, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
    public static void method2448(int arg0) {
        field5871 = null;
        if (arg0 != 0) {
            method2448(-54);
        }
    }
}
