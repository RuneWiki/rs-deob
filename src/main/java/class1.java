import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 {

    @OriginalMember(owner = "client!us", name = "a", descriptor = "Lwf;")
    public static class117 field1 = new class117(4);

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public static int field2 = 0;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field4 = 0;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public static int field3 = 0;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "[S")
    public static short[] field6;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "Lbu;")
    public static class19 field5;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "D")
    public static double field7;

    static {
        new class572("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field6 = new short[] { -10304, 9104, -1, -1, -1 };
        field5 = new class19();
        field7 = -1.0D;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V", line = 6)
    public static void method1(int arg0) {
        field1 = null;
        field5 = null;
        if (arg0 == 0) {
            field6 = null;
        }
    }
}
