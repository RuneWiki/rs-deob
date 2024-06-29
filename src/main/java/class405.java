import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class405 extends class270 {

    @OriginalMember(owner = "client!gn", name = "H", descriptor = "Lvv;")
    public static class313 field6152;

    @OriginalMember(owner = "client!gn", name = "J", descriptor = "Llo;")
    public static class306 field6154;

    @OriginalMember(owner = "client!gn", name = "K", descriptor = "[S")
    public static short[] field6155;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
    public int field6143;

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "I")
    public int field6145;

    @OriginalMember(owner = "client!gn", name = "E", descriptor = "I")
    public int field6149;

    @OriginalMember(owner = "client!gn", name = "F", descriptor = "I")
    public int field6150;

    @OriginalMember(owner = "client!gn", name = "L", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "Ldw;")
    public class403 field6151;

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "Ljava/lang/String;")
    public String field6144;

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "[I")
    public int[] field6147;

    @OriginalMember(owner = "client!gn", name = "D", descriptor = "[I")
    public int[] field6148;

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "[Lbu;")
    public class407[] field6146;

    @OriginalMember(owner = "client!gn", name = "I", descriptor = "[Ljava/lang/String;")
    public String[] field6153;

    static {
        new class306("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field6152 = new class313(104, 6);
        field6154 = new class306("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");
        new class306("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field6155 = new short[] { 960, 957, -21568, -21571, 22464 };
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 20)
    public static void method2509(int arg0) {
        if (arg0 != 14363) {
            field6156 = 52;
        }
        field6155 = null;
        field6152 = null;
        field6154 = null;
    }
}
