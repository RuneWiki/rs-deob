import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class419 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Ltu;")
    public class176 field6255;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lhu;")
    public static class469 field6254;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZLoa;IILqa;IB)V")
    public static final void method2527(boolean arg0, class33 arg1, int arg2, int arg3, class496 arg4, int arg5, byte arg6) {
        if (arg6 < 3) {
            return;
        }
        if (arg0) {
            class223.field3152.method1332((class7.field112 - class223.field3152.method209()) / 2, (class486.field7136 - class223.field3152.method219()) / 2);
            class328.field5023.method1332((class7.field112 - class328.field5023.method209()) / 2, 18);
        }
        field6256++;
        arg1.method239(-1, 14144, (class393.field5983 == class23.field352 ? class359.field5564 : class146.field2094).method2335((byte) -100, class288.field4292), arg5, class7.field112 / 2, class486.field7136 / 2 - 26);
        int var7 = class486.field7136 / 2 - 18;
        arg4.method1125(class7.field112 / 2 - 152, var7, 304, 34, arg2, 0);
        arg4.method1125(class7.field112 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg4.method1112(class7.field112 / 2 - 150, var7 + 2, class500.field7456 * 3, 30, arg3, 0);
        arg4.method1112(class7.field112 / 2 + class500.field7456 * 3 - 150, var7 + 2, 300 - (class500.field7456 * 3), 30, 0, 0);
        arg1.method239(-1, 14144, class386.field5884, arg5, class7.field112 / 2, class486.field7136 / 2 + 4);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method2528(int arg0) {
        if (arg0 == 16773) {
            field6254 = null;
        }
    }

    static {
        new class375("Select", "Auswählen", "Sélectionner", "Selecionar");
    }
}
