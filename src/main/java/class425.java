import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class425 {

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "[I")
    public static int[] field6246 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lrm;")
    public static class282 field6243 = new class282(2);

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field6247 = 1403;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Lmg;")
    public static class101 field6244;

    static {
        new class466("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)V", line = 7)
    public static final void method2522(int arg0, byte arg1) {
        class80.field1216 = arg0;
        class295.field4056 = -1;
        field6245++;
        if (arg1 == 69) {
            class295.field4056 = -1;
            class279.method1660(false);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 22)
    public static void method2523(byte arg0) {
        field6246 = null;
        if (arg0 < -120) {
            field6244 = null;
            field6243 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIF[FFIIFF)V")
    public abstract void method628(int arg0, int arg1, int arg2, int arg3, float arg4, float[] arg5, float arg6, int arg7, int arg8, float arg9, float arg10);
}
