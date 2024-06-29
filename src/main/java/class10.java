import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class10 {

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public int field130;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public int field135;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lma;")
    public class10 field133;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lql;")
    public class496 field131;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Lsk;")
    public static class423 field137;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public int field128;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lq;")
    public static class282 field125;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field138;

    static {
        new class423("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        new class423("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field137 = new class423("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Lmj;", line = 11)
    public final class447 method52(byte arg0) {
        if (arg0 <= 99) {
            return null;
        } else {
            field129++;
            return class90.method664(false, this.field130);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II[S[Ljava/lang/String;B)V", line = 32)
    public static final void method53(int arg0, int arg1, short[] arg2, String[] arg3, byte arg4) {
        field136++;
        if (arg0 < arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var8;
            for (int var9 = arg0; var9 < arg1; var9++) {
                if (var7 == null || arg3[var9] != null && arg3[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var8;
            method53(arg0, var6 - 1, arg2, arg3, (byte) -113);
            method53(var6 + 1, arg1, arg2, arg3, (byte) 33);
        }
        int var12 = -25 % ((arg4 + 21) / 51);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)Lma;", line = 86)
    public final class10 method54(boolean arg0, int arg1) {
        if (arg0) {
            method56((byte) 39, -94);
        }
        field134++;
        return new class10(this.field130, arg1);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 97)
    public static void method55(int arg0) {
        field138 = null;
        if (arg0 != 2) {
            method53(0, 47, null, null, (byte) -18);
        }
        field137 = null;
        field125 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Z", line = 109)
    public static final boolean method56(byte arg0, int arg1) {
        if (arg0 == -93) {
            field127++;
            return arg1 == 0 || arg1 == 1 || arg1 == 2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(II)V", line = 127)
    public class10(int arg0, int arg1) {
        this.field130 = arg0;
        this.field135 = arg1;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lma;I)V", line = 135)
    public class10(class10 arg0, int arg1) {
        this.field133 = arg0;
        this.field135 = this.field133.field135 + arg1;
        this.field130 = this.field133.field130;
        this.field131 = this.field133.field131;
    }
}
