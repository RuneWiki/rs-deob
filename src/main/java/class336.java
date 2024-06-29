import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class336 extends class337 {

    @OriginalMember(owner = "client!ap", name = "E", descriptor = "Lhn;")
    public static class509 field5000;

    @OriginalMember(owner = "client!ap", name = "H", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!ap", name = "G", descriptor = "I")
    public static int field5002;

    static {
        new class234("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field5000 = new class509(104, -1);
        field5003 = 0;
    }

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "(I)V", line = 9)
    public static final void method2118(int arg0) {
        field5002++;
        int var1 = (int) ((double) class69.field976 * 34.46D);
        int var2 = var1 << 0;
        if (class377.field5692.method358()) {
            var2 += 128;
        }
        class377.field5692.method292(50, var2);
        if (arg0 != 4905) {
            method2121(-104);
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V", line = 26)
    public class336() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ)I", line = 31)
    public static final int method2119(int arg0, boolean arg1) {
        field4999++;
        return arg1 ? arg0 & 0x7F : 106;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II[BIBIII[B)V", line = 47)
    public static final void method2120(int arg0, int arg1, byte[] arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field5001++;
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        int var11 = -arg5;
        if (arg4 != -59) {
            return;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg8[var10001] = (byte) (arg8[var10001] - arg2[arg1++]);
                int var14 = arg0++;
                arg8[var14] = (byte) (arg8[var14] - arg2[arg1++]);
                int var15 = arg0++;
                arg8[var15] = (byte) (arg8[var15] - arg2[arg1++]);
                int var16 = arg0++;
                arg8[var16] = (byte) (arg8[var16] - arg2[arg1++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg8[var10001] = (byte) (arg8[var10001] - arg2[arg1++]);
            }
            arg1 += arg6;
            arg0 += arg7;
            var11++;
        }
    }

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "(I)V", line = 91)
    public static void method2121(int arg0) {
        if (arg0 == -32267) {
            field5000 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IB)[I", line = 101)
    public final int[] method179(int arg0, byte arg1) {
        if (arg1 == -11) {
            field4998++;
            return class109.field1530;
        } else {
            return null;
        }
    }
}
