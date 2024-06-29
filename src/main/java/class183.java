import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class183 extends class499 {

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    public int field2606;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "[I")
    public static int[] field2608;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public static int field2607;

    static {
        new class304("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field2609 = 0;
        field2608 = new int[256];
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2608[var0] = var1;
        }
        field2610 = 0;
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(B)V", line = 3)
    public static void method1198(byte arg0) {
        field2608 = null;
        if (arg0 != 77) {
            field2609 = -66;
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I)V", line = 20)
    public class183(int arg0) {
        this.field2606 = arg0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Z")
    public abstract boolean method1199(int arg0);

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1200(byte arg0);
}
