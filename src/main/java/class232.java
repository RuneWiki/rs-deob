import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class232 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[B")
    public static byte[] field3233 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lwt;")
    public static class194 field3234 = new class194("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "F")
    public static float field3235;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method1408(int arg0) {
        if (arg0 >= 28) {
            field3234 = null;
            field3233 = null;
        }
    }

    static {
        new class194("Select", "Auswählen", "Sélectionner", "Selecionar");
        field3237 = -1;
    }
}
