import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class16 {

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "[I")
    public static int[] field297;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "Lkn;")
    public static class442 field296;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field300;

    static {
        new class442("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field297 = new int[5];
        field298 = -1;
        field296 = new class442("Loading...", "Lade...", "Chargement en cours...", "Carregando...");
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)Z", line = 9)
    public static final boolean method238(int arg0, int arg1) {
        field295++;
        if (class378.field5403[arg0]) {
            return true;
        }
        if (arg1 != 21) {
            field298 = -51;
        }
        if (!class274.field3825.method1764(arg0, false)) {
            return false;
        }
        int var2 = class274.field3825.method1739(90, arg0);
        if (var2 == 0) {
            class378.field5403[arg0] = true;
            return true;
        }
        if (class143.field2057[arg0] == null) {
            class143.field2057[arg0] = new class453[var2];
        }
        for (int var3 = 0; var3 < var2; var3++) {
            if (class143.field2057[arg0][var3] == null) {
                byte[] var4 = class274.field3825.method1745(var3, (byte) -93, arg0);
                if (var4 != null) {
                    class453 var5 = class143.field2057[arg0][var3] = new class453();
                    var5.field6314 = (arg0 << 16) + var3;
                    if (var4[0] != -1) {
                        throw new IllegalStateException("if1");
                    }
                    var5.method2806(new class11(var4), -1);
                }
            }
        }
        class378.field5403[arg0] = true;
        return true;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([BB)[B", line = 67)
    public static final byte[] method239(byte[] arg0, byte arg1) {
        field300++;
        if (arg0 == null) {
            return null;
        }
        byte[] var2 = new byte[arg0.length];
        if (arg1 < 87) {
            return null;
        } else {
            class36.method344(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lnq;I)I", line = 87)
    public static final int method240(class268 arg0, int arg1) {
        field294++;
        int var2 = arg1;
        if (arg0.method1759(arg1 ^ 0xFFFFFFE4, class103.field1413)) {
            var2 = arg1 + 1;
        }
        if (arg0.method1759(-92, class299.field4159)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V", line = 110)
    public static void method241(int arg0) {
        field297 = null;
        if (arg0 == 0) {
            field296 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IJ)V", line = 125)
    public static final void method242(int arg0, long arg1) {
        class46.field648.field191 = 0;
        field299++;
        class46.field648.method173(21, 255);
        class46.field648.method165(arg1, (byte) 16);
        class438.field6170 = -3;
        class145.field2063 = 0;
        class401.field5703 = arg0;
        class19.field367 = 1;
    }
}
