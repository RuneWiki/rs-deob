import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class class379 extends class544 {

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Z")
    public static boolean field5037;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "[[S")
    public static short[][] field5035;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I")
    public abstract int method701(int arg0);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)[Ljs;")
    public static final class275[] method2199(boolean arg0) {
        if (arg0) {
            field5036++;
            return new class275[] { class62.field618, class295.field3805, class41.field328, class40.field309, class263.field3384, class197.field2380, class51.field432, class334.field4325, class519.field7301, class209.field2505, class483.field6755, class164.field2007, class429.field5825, class418.field5431 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)I")
    public abstract int method705(int arg0);

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)I")
    public abstract int method703(int arg0);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)I")
    public abstract int method700(byte arg0);

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V")
    public static void method2200(int arg0) {
        field5035 = null;
        if (arg0 < 113) {
            method2199(true);
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)J")
    public abstract long method704(byte arg0);

    static {
        new class180("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        new class180("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field5037 = false;
    }
}
