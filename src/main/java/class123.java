import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class123 {

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Let;I)I")
    public static final int method812(class429 arg0, int arg1) {
        field1677++;
        class322 var2 = arg0.field6055;
        if (var2.field4693 != null) {
            var2 = var2.method1939(15964, class163.field2413);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4688;
        class98 var4 = arg0.method1406((byte) 118);
        if (arg1 <= 13) {
            return 108;
        }
        if (arg0.field3302) {
            var3 = var2.field4683;
        } else if (arg0.field3337 == var4.field1326 || arg0.field3337 == var4.field1282 || arg0.field3337 == var4.field1283 || arg0.field3337 == var4.field1296) {
            var3 = var2.field4671;
        } else if (arg0.field3337 == var4.field1299 || arg0.field3337 == var4.field1279 || arg0.field3337 == var4.field1308 || arg0.field3337 == var4.field1297) {
            var3 = var2.field4672;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method813(int arg0, int arg1) {
        field1678++;
        if (arg0 == 100 && class443.field6226 > 0) {
            byte[] var2 = class517.field7608[--class443.field6226];
            class517.field7608[class443.field6226] = null;
            return var2;
        } else if (~arg0 == arg1 && class459.field6421 > 0) {
            byte[] var3 = class134.field1754[--class459.field6421];
            class134.field1754[class459.field6421] = null;
            return var3;
        } else if (arg0 == 30000 && class204.field2944 > 0) {
            byte[] var4 = class322.field4712[--class204.field2944];
            class322.field4712[class204.field2944] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    static {
        new class530("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
    }
}
