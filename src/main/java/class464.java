import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class464 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lej;")
    public static class104 field6545 = new class104(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)V")
    public static final void method2712(int arg0, byte arg1) {
        field6548++;
        if (class40.field797 == 1) {
            class189.field2677 = arg0;
        } else if (class40.field797 == 2 || class40.field797 == 3) {
            class645.field9369 = arg0;
        }
        if (arg1 != -66) {
            method2713((byte) -37);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static final void method2713(byte arg0) {
        field6547++;
        class6.field77.method3246(false);
        int var1 = -122 / ((35 - arg0) / 34);
        class2.field24.method3246(false);
        class447.field6345.method3246(false);
        class348.field4671.method3246(false);
        class343.field4620.method3246(false);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public static void method2714(boolean arg0) {
        field6545 = null;
        if (arg0) {
            field6545 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)V")
    public static final void method2715(byte arg0, int arg1) {
        if (!class491.field6875.field3344) {
            arg1 = -1;
        }
        if (arg0 < 56) {
            method2714(false);
        }
        field6546++;
        if (class130.field2094 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class513 var2 = class62.field1080.method2537(arg1, 1);
            class38 var3 = var2.method2971(-106);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class500.field6968.method1857(17, var3.method404(), var3.method394(), var3.method395(), new Point(var2.field7227, var2.field7223), class166.field2390);
                class130.field2094 = arg1;
            }
        }
        if (arg1 == -1 && class130.field2094 != -1) {
            class500.field6968.method1857(17, -1, -1, null, new Point(), class166.field2390);
            class130.field2094 = -1;
        }
    }
}
