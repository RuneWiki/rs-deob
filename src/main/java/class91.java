import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class91 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "[B")
    public static byte[] field1297 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Lak;")
    public static class234 field1299 = new class234("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lhn;")
    public static class509 field1300 = new class509(63, -1);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field1298;

    static {
        new class234("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        new class234("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)[Los;", line = 6)
    public static final class309[] method744(int arg0) {
        field1298++;
        return arg0 == -1 ? new class309[] { class318.field4802, class444.field6524, class380.field5731 } : null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 23)
    public static void method745(int arg0) {
        field1299 = null;
        int var1 = 39 / ((arg0 - 6) / 46);
        field1297 = null;
        field1300 = null;
    }
}
