import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public abstract class class406 {

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "Llp;")
    public static class272 field6158 = new class272(64);

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public int field6155;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public int field6156;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
    public int field6159;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "Lkl;")
    public static class55 field6165;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "[Laa;")
    public static class341[] field6163;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Z")
    public final boolean method2506(byte arg0) {
        if (arg0 <= 44) {
            return true;
        } else {
            field6154++;
            return (this.field6156 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
    public static void method2507(int arg0) {
        field6165 = null;
        field6158 = null;
        int var1 = 98 % ((arg0 - 62) / 46);
        field6163 = null;
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)Z")
    public final boolean method2508(byte arg0) {
        if (arg0 < 81) {
            return false;
        } else {
            field6161++;
            return (this.field6156 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)Z")
    public final boolean method2509(int arg0) {
        field6162++;
        int var2 = -3 % ((58 - arg0) / 45);
        return (this.field6156 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "(B)Z")
    public final boolean method2510(byte arg0) {
        if (arg0 < 32) {
            field6158 = null;
        }
        field6157++;
        return (this.field6156 & 0x4) != 0;
    }

    static {
        new class446("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        new class446("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field6164 = 0;
        new class446("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
    }
}
