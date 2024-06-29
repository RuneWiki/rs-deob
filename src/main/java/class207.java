import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class207 extends class168 {

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Lvj;")
    public static class304 field2852;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "Lan;")
    public static class20 field2855;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "F")
    public static float field2853;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public static void method1324(byte arg0) {
        if (arg0 < 32) {
            method1324((byte) 93);
        }
        field2855 = null;
        field2852 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1325(String arg0, int arg1) {
        field2851++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = arg1; var2 < class267.field3528; var2++) {
            if (arg0.equalsIgnoreCase(class471.field6485[var2])) {
                return var2;
            }
        }
        return -1;
    }

    static {
        new class304("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field2852 = new class304(" ", ": ", " ", " ");
        field2855 = new class20();
    }
}
