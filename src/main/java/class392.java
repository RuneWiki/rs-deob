import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class392 {

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "F")
    public static float field5533;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
    public static final void method2355(int arg0, int arg1) {
        field5534++;
        class314 var2 = class483.method2819(arg0, arg1, arg0 ^ 0x533D);
        var2.method1962((byte) 0);
    }

    static {
        new class104("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }
}
