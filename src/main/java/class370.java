import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class370 {

    @OriginalMember(owner = "client!im", name = "b", descriptor = "Lus;")
    public static class1 field5338;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Z")
    public static boolean field5341;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Ldk;")
    public static class326 field5339;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
    public static void method2274(byte arg0) {
        field5339 = null;
        field5338 = null;
        if (arg0 != -19) {
            method2274((byte) -63);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
    public static final void method2275(int arg0) {
        field5337++;
        int var1 = 89 / ((-arg0 - 86) / 37);
        for (int var2 = 0; var2 < class225.field3418; var2++) {
            int var3 = class281.field4139[var2];
            class216 var4 = class139.field1851[var3];
            if (var4 != null) {
                class485.method2836(var4.field3232.field6573, true, var4);
            }
        }
    }

    static {
        new class326("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field5338 = new class1(43, 4);
        field5340 = 0;
        field5341 = false;
        field5339 = new class326("flash3:", "blinken3:", "clignotant3:", "brilho3:");
    }
}
