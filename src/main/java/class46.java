import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class46 {

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "Lfg;")
    public static class83 field641 = new class83("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field643 = 0;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lss;Lss;B)V", line = 3)
    public static final void method289(class295 arg0, class295 arg1, byte arg2) {
        class356.method1978((byte) 38, class480.field7024);
        class273.field3715++;
        field642++;
        class244.field3395.method2074(false, arg1.field4073);
        class244.field3395.method2061(arg1.field4072, (byte) 125);
        class244.field3395.method2070(81954016, arg0.field3936);
        class244.field3395.method2072(-733958872, arg1.field3936);
        class244.field3395.method2101((byte) 68, arg0.field4073);
        int var3 = 16 % ((11 - arg2) / 62);
        class244.field3395.method2113(arg0.field4072, -119);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V", line = 25)
    public static void method290(int arg0) {
        if (arg0 <= -112) {
            field641 = null;
        }
    }
}
