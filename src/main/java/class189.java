import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class189 extends class480 {

    @OriginalMember(owner = "client!bq", name = "K", descriptor = "[Z")
    public static boolean[] field2793 = new boolean[5];

    @OriginalMember(owner = "client!bq", name = "Q", descriptor = "I")
    public static int field2799 = 12;

    @OriginalMember(owner = "client!bq", name = "I", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!bq", name = "J", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!bq", name = "M", descriptor = "I")
    public int field2795;

    @OriginalMember(owner = "client!bq", name = "O", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!bq", name = "P", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!bq", name = "N", descriptor = "Loc;")
    public class135 field2796;

    @OriginalMember(owner = "client!bq", name = "L", descriptor = "[B")
    public byte[] field2794;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(B)V")
    public static final void method1290(byte arg0) {
        ++field2791;
        class450.field6706 = 0;
        class312.field4467.method817(-4);
        if (arg0 > -85) {
            field2799 = 63;
        }
        class312.field4467.method809(class4.field56, false);
        ++class450.field6706;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)[B")
    public final byte[] method1291(int arg0) {
        ++field2792;
        if (super.field7045) {
            throw new RuntimeException();
        } else {
            if (arg0 != 0) {
                method1292((byte) 39);
            }
            return this.field2794;
        }
    }

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "(B)V")
    public static void method1292(byte arg0) {
        field2793 = null;
        int var1 = -9 % ((arg0 - 58) / 48);
    }

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "(I)I")
    public final int method1293(int arg0) {
        if (arg0 != 100) {
            field2799 = 58;
        }
        ++field2798;
        return super.field7045 ? 0 : 100;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/awt/Canvas;BIILji;Lm;)Lqa;")
    public static final class162 method1294(Canvas arg0, byte arg1, int arg2, int arg3, class432 arg4, class126 arg5) {
        ++field2797;
        if (arg1 != -54) {
            field2793 = null;
        }
        return new class349(arg2, arg0, arg5, arg3, arg4);
    }

    static {
        new class475("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
    }
}
