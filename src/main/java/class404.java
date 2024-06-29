import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class404 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field5692 = 2;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5693;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "Ldm;")
    public static class36 field5695;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method2405(int arg0) {
        field5693 = null;
        field5695 = null;
        if (arg0 != -3) {
            field5692 = 117;
        }
    }

    static {
        new class326("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field5694 = 0;
        field5693 = new String[100];
        field5695 = new class36(8);
        new class326((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field5696 = 0;
        field5697 = 1;
        new class326(" days.", " Tage.", " jours.", " dias.");
    }
}
