import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class361 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field5044;

    static {
        new class112("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field5042 = 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Llk;B)V", line = 11)
    public static final void method2166(class425 arg0, byte arg1) {
        int var2 = 0;
        if (arg1 <= 13) {
            method2166((class425) null, (byte) -95);
        }
        while (class399.field5584 > var2) {
            int var3 = arg0.method2474((byte) 62);
            int var4 = arg0.method2508(true);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class106.field1527[var3] != null) {
                class106.field1527[var3].field759 = var4;
            }
            var2++;
        }
        field5044++;
    }
}
