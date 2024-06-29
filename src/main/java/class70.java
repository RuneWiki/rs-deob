import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class70 extends class447 {

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "Lcm;")
    public static class382 field904;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "Lla;")
    public class269 field901;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "[Lid;")
    public class158[] field899;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V")
    public static void method471(int arg0) {
        field904 = null;
        if (arg0 != 0) {
            method471(0);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BILdr;I)Z")
    public final boolean method472(byte arg0, int arg1, class261 arg2, int arg3) {
        field902++;
        if (arg0 != -115) {
            this.field900 = 125;
        }
        if (this.field899 != null) {
            for (int var5 = 0; var5 < this.field899.length; var5++) {
                if (this.field899[var5].method968(arg1, arg3) && this.field901.method4(arg1, arg3, arg2, 2)) {
                    return true;
                }
            }
        }
        return false;
    }

    static {
        new class151("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        new class151("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        new class151("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field904 = new class382(16);
    }
}
