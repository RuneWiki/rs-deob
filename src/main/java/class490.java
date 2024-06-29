import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class490 {

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "Lpg;")
    public static class492 field7164;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Lui;")
    public static class375 field7166;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public static void method2914(byte arg0) {
        field7166 = null;
        field7164 = null;
        if (arg0 != -109) {
            method2914((byte) -24);
        }
    }

    static {
        new class375("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field7165 = 0;
        field7164 = new class492(54, 6);
        field7166 = new class375("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");
    }
}
