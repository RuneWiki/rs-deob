import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class135 {

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "[I")
    public static int[] field2052 = new int[100];

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "Lkc;")
    public static class157 field2050 = new class157("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field2054 = 20;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "Lkc;")
    public static class157 field2055 = new class157("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "Lkc;")
    public static class157 field2058 = new class157("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "Li;")
    public class197 field2053;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "Le;")
    public class285 field2051;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "Ldk;")
    public static class421 field2056;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "[I")
    public static int[] field2057;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
    public static void method973(int arg0) {
        field2055 = null;
        field2052 = null;
        field2058 = null;
        if (arg0 != 20) {
            method973(-120);
        }
        field2050 = null;
        field2057 = null;
        field2056 = null;
    }
}
