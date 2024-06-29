import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class646 {

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
    public static int field9350 = -1;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
    public static int field9349 = -1;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "Lvt;")
    public static class344 field9347 = new class344("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field9352 = new String[8];

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "Luv;")
    public static class3 field9351 = new class3(7, -1);

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
    public static int field9348;

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "Lha;")
    public static class116 field9353;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZB)V")
    public static final void method3716(boolean arg0, byte arg1) {
        field9346++;
        class72 var2 = (class72) class244.field3084.method3188((byte) -100);
        if (arg1 != -50) {
            return;
        }
        while (var2 != null) {
            if (var2.field993 != null) {
                class92.field1224.method250(var2.field993);
                var2.field993 = null;
            }
            if (var2.field996 != null) {
                class92.field1224.method250(var2.field996);
                var2.field996 = null;
            }
            var2.method589(-8880);
            var2 = (class72) class244.field3084.method3182((byte) -15);
        }
        if (!arg0) {
            return;
        }
        for (class72 var3 = (class72) class453.field6416.method3188((byte) -100); var3 != null; var3 = (class72) class453.field6416.method3182((byte) -108)) {
            if (var3.field993 != null) {
                class92.field1224.method250(var3.field993);
                var3.field993 = null;
            }
            var3.method589(-8880);
        }
        for (class72 var4 = (class72) class304.field3930.method3473(-27089); var4 != null; var4 = (class72) class304.field3930.method3478((byte) 5)) {
            if (var4.field993 != null) {
                class92.field1224.method250(var4.field993);
                var4.field993 = null;
            }
            var4.method589(arg1 - 8830);
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
    public static final void method3717(int arg0) {
        if (class530.field7406 == null) {
            class550 var1 = new class550();
            byte[] var2 = var1.method3032(128, -3222, 128, 16);
            class530.field7406 = class410.method2443((byte) -62, false, var2);
        }
        if (arg0 != 24556) {
            field9350 = -81;
        }
        field9348++;
        if (class72.field1002 == null) {
            class96 var3 = new class96();
            byte[] var4 = var3.method531(128, 16, 128, 0);
            class72.field1002 = class410.method2443((byte) -62, false, var4);
        }
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)V")
    public static void method3718(int arg0) {
        field9353 = null;
        field9351 = null;
        field9347 = null;
        field9352 = null;
        if (arg0 != -14120) {
            method3716(true, (byte) 108);
        }
    }
}
