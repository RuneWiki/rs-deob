import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class324 {

    @OriginalMember(owner = "client!np", name = "a", descriptor = "Lwt;")
    public static class194 field4735 = new class194("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!np", name = "d", descriptor = "Lpj;")
    public static class94 field4738;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "Lgn;")
    public static class475 field4740;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field4737;

    static {
        new class194("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field4738 = new class94(1);
        field4739 = -1;
        field4740 = new class475(72, -1);
        field4741 = 0;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)[B", line = 3)
    public static final synchronized byte[] method1943(byte arg0, int arg1) {
        if (arg0 > -120) {
            return null;
        }
        field4737++;
        if (arg1 == 100 && class254.field3660 > 0) {
            byte[] var2 = class32.field528[--class254.field3660];
            class32.field528[class254.field3660] = null;
            return var2;
        } else if (arg1 == 5000 && class210.field2976 > 0) {
            byte[] var3 = class129.field1644[--class210.field2976];
            class129.field1644[class210.field2976] = null;
            return var3;
        } else if (arg1 == 30000 && class450.field6556 > 0) {
            byte[] var4 = class6.field91[--class450.field6556];
            class6.field91[class450.field6556] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lts;III)V", line = 42)
    public static final void method1944(class356 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 30000) {
            method1944(null, 43, -56, -78);
        }
        class98.field1337 = arg3;
        class245.field3526 = arg1;
        field4736++;
        class149.field1928 = arg0;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V", line = 56)
    public static void method1945(byte arg0) {
        if (arg0 <= 11) {
            method1945((byte) 59);
        }
        field4738 = null;
        field4740 = null;
        field4735 = null;
    }
}
