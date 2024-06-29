import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class284 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Ljm;")
    public static class485 field3816 = new class485(64, 7);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "J")
    public static long field3820;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Lem;")
    public static class149 field3822;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Lup;")
    public static class179 field3819;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "[B")
    public static byte[] field3817;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method1623(int arg0) {
        field3816 = null;
        field3822 = null;
        field3819 = null;
        if (arg0 > -73) {
            field3822 = null;
        }
        field3817 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZILqp;III)V")
    public static final void method1624(int arg0, boolean arg1, int arg2, class467 arg3, int arg4, int arg5, int arg6) {
        field3815++;
        if (class292.field3915 >= 50 || arg3 == null || arg3.field6815 == null || arg3.field6815.length <= arg4 || arg3.field6815[arg4] == null) {
            return;
        }
        int var7 = arg3.field6815[arg4][0];
        int var8 = var7 >> 8;
        int var9 = -57 / ((69 - arg5) / 45);
        int var10 = (var7 & 0xFE) >> 5;
        if (arg3.field6815[arg4].length > 1) {
            int var11 = (int) ((double) arg3.field6815[arg4].length * Math.random());
            if (var11 > 0) {
                var8 = arg3.field6815[arg4][var11];
            }
        }
        int var12 = var7 & 0x1F;
        if (var12 == 0) {
            if (arg1) {
                class213.method1279(255, var10, var8, 0, false);
            }
        } else if (class437.field6374.field4273 != 0) {
            int var13 = arg2 - 64 >> 7;
            int var14 = arg0 - 64 >> 7;
            class526.field7723[class292.field3915++] = new class20((byte) 1, var8, var10, 0, 255, (arg6 << 24) + (var13 << 16) + (var14 << 8) + var12);
        }
    }

    @OriginalMember(owner = "client!lg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3818++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(II)V")
    public class284(int arg0, int arg1) {
    }

    static {
        new class83("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }
}
