import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class430 {

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Lie;")
    public static class6 field6322 = class366.method2264((byte) -88);

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Lsl;")
    public static class318 field6324;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "[I")
    public static int[] field6326;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Lsl;")
    public static class318 field6325;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "[I")
    public static int[] field6323;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static void method2615(byte arg0) {
        field6325 = null;
        field6322 = null;
        field6323 = null;
        field6326 = null;
        field6324 = null;
        if (arg0 != -63) {
            method2615((byte) -86);
        }
    }

    static {
        new class331("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field6324 = new class318(21, -1);
        field6326 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
        field6325 = new class318(1, 2);
    }
}
