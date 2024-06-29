import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class301 extends class499 {

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "I")
    public int field4133;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
    public int field4132;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(II)V")
    public class301(int arg0, int arg1) {
        this.field4133 = arg0;
        this.field4132 = arg1;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILlh;)Lsn;")
    public static final class444 method1718(int arg0, class365 arg1) {
        int var2 = 11 % ((-arg0 - 39) / 49);
        field4134++;
        return new class444(arg1.method2069(-127), arg1.method2069(-121), arg1.method2069(-126), arg1.method2069(-121), arg1.method2069(-122), arg1.method2069(-124), arg1.method2069(-128), arg1.method2069(-124), arg1.method2111(-2), arg1.method2099(255));
    }

    static {
        new class83("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        new class83("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
    }
}
