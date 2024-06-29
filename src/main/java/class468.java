import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class468 {

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public int field6886;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    public int field6887;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public int field6890;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(JB)V")
    public static final void method2848(long arg0, byte arg1) {
        field6889++;
        if (arg0 <= 0L) {
            return;
        }
        int var3 = 51 % (arg1 / 34);
        if ((arg0 % 10L) == 0L) {
            class19.method119((byte) -101, arg0 - 1L);
            class19.method119((byte) -96, 1L);
        } else {
            class19.method119((byte) -78, arg0);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)V")
    public static final void method2849(int arg0, int arg1) {
        class343.field5121 = arg0;
        field6888++;
        if (arg1 == 19713) {
            class326.field4937.method1637((byte) 13);
        }
    }

    static {
        new class179("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        new class179("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }
}
