import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class142 {

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1904;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static final void method889(int arg0) {
        field1903++;
        class307.field4634 = 0;
        int var1 = 0;
        if (arg0 != -10753) {
            return;
        }
        while (var1 < 2048) {
            class359.field5309[var1] = null;
            class339.field5060[var1] = 1;
            var1++;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public static void method890(int arg0) {
        int var1 = 5 % ((-arg0 - 77) / 43);
        field1904 = null;
    }

    static {
        new class151("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field1904 = new Color[] { new Color(16777215), new Color(16777215) };
        field1905 = 0;
    }
}
