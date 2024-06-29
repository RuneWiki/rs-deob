import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class159 extends class145 {

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2572;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Los;")
    public static class309 field2575;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lcv;")
    public static class403 field2574;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)I")
    public static final int method1140(int arg0) {
        int var1 = 113 % ((-arg0 - 71) / 55);
        field2573++;
        return 2;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
    public static void method1141(int arg0) {
        if (arg0 < -2) {
            field2574 = null;
            field2575 = null;
            field2572 = null;
        }
    }

    static {
        new class309("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field2572 = "";
        field2575 = new class309("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
    }
}
