import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class12 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field197 = 4;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Leo;")
    public static class423 field198;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field199;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field196;

    static {
        new class169("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field198 = null;
        field199 = new String[100];
    }

    @OriginalMember(owner = "client!dg", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field196++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I", line = 12)
    public static final int method92(int arg0, int arg1) {
        return class203.field2667 == null ? 0 : class203.field2667[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(II)V", line = 26)
    public class12(int arg0, int arg1) {
        this.field195 = arg0;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V", line = 37)
    public static void method93(byte arg0) {
        field198 = null;
        field199 = null;
        if (arg0 >= -103) {
            method93((byte) -78);
        }
    }
}
