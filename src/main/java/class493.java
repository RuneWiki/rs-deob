import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class493 {

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Lgo;")
    public static class441 field7288 = new class441(4, 1, 1, 1);

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "Lcv;")
    public static class398 field7289 = new class398("RC", 1);

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "F")
    public static float field7290;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "Lbc;")
    public static class245 field7291;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public static void method2955(int arg0) {
        field7291 = null;
        field7288 = null;
        if (arg0 > -103) {
            method2957(64, -104);
        }
        field7289 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZZ)V")
    public static final void method2956(int arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            class509.field7433++;
            class168.method1167(123);
        }
        field7286++;
        if (arg0 < 125) {
            field7291 = null;
        }
        if (arg2) {
            class64.field973++;
            class18.method115(-65537);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)I")
    public static final int method2957(int arg0, int arg1) {
        int var2 = -23 % ((arg1 + 34) / 59);
        field7285++;
        return arg0 >>> 8;
    }

    static {
        new class475("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }
}
