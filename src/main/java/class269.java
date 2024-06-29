import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class269 {

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "Z")
    private static boolean field3588 = false;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "Z")
    private static boolean field3587 = true;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "Lsr;")
    private static class167 field3589 = new class167();

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lve;Z)V", line = 8)
    public static final synchronized void method1636(class350 arg0, boolean arg1) {
        if (field3587) {
            class439 var2 = new class439();
            var2.field6380 = arg0;
            field3589.method975(0, var2);
        } else if (!field3588) {
            arg0.method426();
        }
        if (!arg1) {
            method1636(null, true);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V", line = 34)
    public static final synchronized void method1637(byte arg0) {
        int var1 = -62 / ((46 - arg0) / 63);
        while (true) {
            class439 var2 = (class439) field3589.method977((byte) -52);
            if (var2 == null) {
                return;
            }
            var2.field6380.method426();
            var2.method2674(true);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BZ)V", line = 55)
    public static final synchronized void method1638(byte arg0, boolean arg1) {
        if (arg0 > -64) {
            field3587 = true;
        }
        field3588 = arg1;
    }
}
