import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class176 {

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field2147 = 0;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field2148 = -1;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Lea;")
    public static class474 field2146 = new class474("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lxa;")
    public static class433 field2149;

    static {
        new class474("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIBLqf;)V", line = 3)
    public static final void method998(int arg0, int arg1, byte arg2, class593 arg3) {
        field2144++;
        if (class39.field425 != null || class600.field8764 || arg3 == null || class522.method3083(arg3, (byte) 108) == null) {
            return;
        }
        class39.field425 = arg3;
        class273.field3821 = class522.method3083(arg3, (byte) 108);
        int var4 = 8 / ((arg2 - 1) / 44);
        class556.field7893 = arg0;
        class538.field7748 = false;
        class87.field994 = arg1;
        class509.field7459 = 0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 25)
    public static void method999(int arg0) {
        if (arg0 != -1) {
            field2147 = 15;
        }
        field2146 = null;
        field2149 = null;
    }
}
