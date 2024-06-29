import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class453 extends class452 {

    @OriginalMember(owner = "client!qt", name = "v", descriptor = "Ldc;")
    public class5 field6605;

    @OriginalMember(owner = "client!qt", name = "w", descriptor = "Lak;")
    public static class234 field6606;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
    public static void method2756(byte arg0) {
        field6606 = null;
        if (arg0 > -54) {
            method2756((byte) 22);
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Ldc;)V")
    public class453(class5 arg0) {
        this.field6605 = arg0;
    }

    static {
        new class234("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field6606 = new class234(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");
    }
}
