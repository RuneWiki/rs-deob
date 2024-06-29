import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class130 extends class86 {

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public int field1652;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public int field1654;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "Lgn;")
    public static class475 field1653;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)V")
    public static void method718(byte arg0) {
        if (arg0 != 30) {
            field1653 = null;
        }
        field1653 = null;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(II)V")
    public class130(int arg0, int arg1) {
        this.field1652 = arg1;
        this.field1654 = arg0;
    }

    static {
        new class194("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field1653 = new class475(0, 4);
    }
}
