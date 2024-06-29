import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class48 extends class151 {

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public static int field612 = 0;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "Ldq;")
    public static class493 field614 = new class493(73, 6);

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "Ll;")
    public static class16 field613;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)V")
    public static final void method491(int arg0, boolean arg1) {
        int var2 = -83 % ((-arg0 - 14) / 52);
        if (arg1) {
            if (class277.field3510 != -1) {
                class9.method60((byte) -34, class277.field3510);
            }
            for (class175 var3 = (class175) class397.field5684.method2021(99); var3 != null; var3 = (class175) class397.field5684.method2017(-110)) {
                if (!var3.method2166(0)) {
                    var3 = (class175) class397.field5684.method2021(99);
                    if (var3 == null) {
                        break;
                    }
                }
                class290.method1706(var3, 105, true, false);
            }
            class277.field3510 = -1;
            class397.field5684 = new class352(8);
            class386.method2179(0);
            class277.field3510 = class17.field256;
            class161.method1039(false, 71);
            class68.method604(-9192);
            class239.method1438(class277.field3510);
        }
        field610++;
        class209.field2709 = true;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
    public static void method492(int arg0) {
        int var1 = -94 % ((arg0 - 37) / 50);
        field614 = null;
        field613 = null;
    }
}
