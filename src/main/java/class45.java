import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class45 {

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Lge;")
    private class511 field876 = new class511(64);

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Lci;")
    private class320 field880;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public int field878;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "Lqt;")
    public static class459 field883;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static void method428(byte arg0) {
        int var1 = -30 / ((arg0 - 76) / 36);
        field883 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(CI)C")
    public static final char method429(char arg0, int arg1) {
        field882++;
        if (arg1 >= -68) {
            field884 = -57;
        }
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public final void method430(int arg0) {
        class511 var2 = this.field876;
        synchronized (this.field876) {
            this.field876.method2990((byte) -103);
        }
        if (arg0 != 237) {
            field883 = null;
        }
        field877++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)Lnc;")
    public final class21 method431(int arg0, byte arg1) {
        int var3 = -93 / ((37 - arg1) / 49);
        field879++;
        class511 var4 = this.field876;
        class21 var5;
        synchronized (this.field876) {
            var5 = (class21) this.field876.method2982(0, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        class320 var6 = this.field880;
        byte[] var7;
        synchronized (this.field880) {
            var7 = this.field880.method2037(arg0, (byte) -96, 16);
        }
        class21 var8 = new class21();
        if (var7 != null) {
            var8.method117(new class519(var7), 18);
        }
        class511 var9 = this.field876;
        synchronized (this.field876) {
            this.field876.method2981(var8, 52, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZI)V")
    public final void method432(boolean arg0, int arg1) {
        if (arg0) {
            return;
        }
        class511 var3 = this.field876;
        synchronized (this.field876) {
            this.field876.method2989(arg0, arg1);
        }
        field881++;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
    public final void method433(int arg0) {
        field875++;
        if (arg0 == -30038) {
            class511 var2 = this.field876;
            synchronized (this.field876) {
                this.field876.method2980(-182819096);
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lsn;ILci;)V")
    public class45(class453 arg0, int arg1, class320 arg2) {
        this.field880 = arg2;
        if (this.field880 == null) {
            this.field878 = 0;
        } else {
            this.field878 = this.field880.method2030(-10914, 16);
        }
    }

    static {
        new class44("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field883 = new class459(68, 7);
        field884 = 0;
        new class44("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field885 = 0;
    }
}
