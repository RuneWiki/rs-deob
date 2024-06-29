import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class85 {

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "Lmha;")
    public static class419 field1027 = new class419(4, 1);

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "Lkg;")
    public static class275 field1029 = new class275(7, 0, 1, 1);

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "Lhu;")
    public static class133 field1030;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(BZ)V", line = 3)
    public static final void method655(byte arg0, boolean arg1) {
        field1028++;
        if (arg1) {
            if (class443.field6101 != -1) {
                class439.method2532(122, class443.field6101);
            }
            for (class8 var2 = (class8) class350.field4925.method2144(true); var2 != null; var2 = (class8) class350.field4925.method2146(false)) {
                if (!var2.method3566((byte) 78)) {
                    var2 = (class8) class350.field4925.method2144(true);
                    if (var2 == null) {
                        break;
                    }
                }
                class710.method3990(false, false, true, var2);
            }
            class443.field6101 = -1;
            class350.field4925 = new class360(8);
            class709.method3987((byte) 123);
            class443.field6101 = class555.field7299;
            class411.method2400(false, -68);
            class312.method1915(-101);
            class182.method1251(class443.field6101);
        }
        class367.field5144 = true;
        if (arg0 <= 76) {
            field1029 = null;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)V", line = 60)
    public static void method656(byte arg0) {
        field1027 = null;
        field1030 = null;
        field1029 = null;
        if (arg0 != -23) {
            method655((byte) 78, false);
        }
    }
}
