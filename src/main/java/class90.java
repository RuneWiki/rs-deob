import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class90 {

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Ltm;")
    public static class112 field1341 = new class112("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[I")
    public static int[] field1343 = new int[2048];

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Lmq;")
    public static class104 field1345 = new class104(8);

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Lfn;")
    public static class52 field1347;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field1344;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1342;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method610(byte arg0) {
        field1347 = null;
        if (arg0 != 96) {
            field1345 = null;
        }
        field1342 = null;
        field1345 = null;
        field1344 = null;
        field1341 = null;
        field1343 = null;
    }

    static {
        new class112("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        new class112("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field1347 = new class52(33, 6);
        new class112("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }
}
