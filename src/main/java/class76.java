import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class76 extends class179 {

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
    public int field1360 = -1;

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "I")
    public int field1363 = 0;

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "I")
    public static int field1369 = 13156520;

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "Lha;")
    public static class40 field1370;

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "[I")
    public static int[] field1371;

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "I")
    public int field1355;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    public int field1356;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    public int field1357;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "I")
    public int field1367;

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "Lwb;")
    public static class207 field1364;

    static {
        new class423("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field1370 = new class40(new byte[5000]);
        field1371 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
        new class423(null, "Dieses System darf nicht missbraucht werden!", null, null);
        field1372 = -1;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIZI)I", line = 15)
    public static final int method561(int arg0, int arg1, boolean arg2, int arg3) {
        field1366++;
        if ((class146.field2369[arg0][arg1][arg3] & 0x8) == 0) {
            if (!arg2) {
                field1372 = 107;
            }
            return arg0 <= 0 || (class146.field2369[1][arg1][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)V", line = 38)
    public static void method562(int arg0) {
        if (arg0 == -25850) {
            field1371 = null;
            field1364 = null;
            field1370 = null;
        }
    }
}
