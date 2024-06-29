import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class384 {

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "[I")
    public static int[] field5600;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public int field5596;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public int field5597;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public int field5599;

    static {
        new class466("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field5600 = new int[14];
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 5)
    public static void method2273(int arg0) {
        field5600 = null;
        if (arg0 != 14) {
            method2273(124);
        }
    }
}
