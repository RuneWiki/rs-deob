import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class201 {

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "Lek;")
    public static class352 field2614 = new class352(64);

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "[[Z")
    public static boolean[][] field2615 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "Lub;")
    public static class18 field2616;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "Lur;")
    public static class376 field2619;

    static {
        new class335("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field2618 = 0;
        field2616 = new class18();
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V", line = 12)
    public static void method1267(int arg0) {
        if (arg0 == 64) {
            field2615 = null;
            field2616 = null;
            field2619 = null;
            field2614 = null;
        }
    }
}
