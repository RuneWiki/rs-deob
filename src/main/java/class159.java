import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class159 {

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lad;")
    private class11 field2089 = new class11(128);

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Ldn;")
    private class201 field2088;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Lpi;")
    public static class340 field2090;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Z")
    public static boolean field2092;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field2087;

    static {
        new class169("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        new class169("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field2090 = new class340(70, 1);
        field2092 = true;
        field2091 = 0;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1066(int arg0) {
        if (arg0 != 128) {
            method1067(-29);
        }
        field2087++;
        if (class254.field3207 != null) {
            class254.field3207.method2945((byte) 97);
        }
        if (class531.field7820 != null) {
            class531.field7820.method2945((byte) 94);
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V", line = 22)
    public static void method1067(int arg0) {
        field2090 = null;
        if (arg0 != -28310) {
            field2090 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()V", line = 35)
    public static final void method1068() {
        class98.method674(1, class412.field5495);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Ldq;", line = 38)
    public final class127 method1069(int arg0, int arg1) {
        field2086++;
        if (arg0 != 1) {
            this.method1069(-18, -32);
        }
        class11 var3 = this.field2089;
        class127 var4;
        synchronized (this.field2089) {
            var4 = (class127) this.field2089.method78((long) arg1, (byte) -110);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2088.method1313((byte) -117, class285.method1732(arg1, (byte) -2), class179.method1169((byte) 56, arg1));
        class127 var6 = new class127();
        if (var5 != null) {
            var6.method807(false, new class88(var5));
        }
        class11 var7 = this.field2089;
        synchronized (this.field2089) {
            this.field2089.method88((long) arg1, 57, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lgt;ILdn;)V", line = 96)
    public class159(class65 arg0, int arg1, class201 arg2) {
        this.field2088 = arg2;
        if (this.field2088 != null) {
            int var4 = this.field2088.method1309((byte) 31) - 1;
            this.field2088.method1302(-74, var4);
        }
    }
}
