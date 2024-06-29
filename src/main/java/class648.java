import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class648 {

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "Lvv;")
    public static class343 field9061 = new class343();

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field9063 = -1;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field9064 = -1;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Lfba;")
    public static class27 field9062 = new class27(4, 5);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Lbq;")
    public static class305 field9065;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static void method3715(int arg0) {
        if (arg0 != 2835) {
            field9061 = null;
        }
        field9065 = null;
        field9061 = null;
        field9062 = null;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
    public static final void method3716(int arg0) {
        class104.field1206 = 1;
        class55.field709 = -1;
        field9060++;
        String var1 = null;
        if (class378.field5220 != null) {
            class494 var2 = new class494(class378.field5220);
            var1 = class288.method1856(var2.method3005(-78), 37);
            class189.field2920 = var2.method3005(-128);
        }
        int var3 = 84 / ((34 - arg0) / 60);
        if (var1 == null) {
            class757.method4204(35, 1);
        } else {
            class642.method3660(11084, false, true, "", var1);
        }
    }
}
