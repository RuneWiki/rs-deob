import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class22 {

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "[I")
    public static int[] field232;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public int field228;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public int field229;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "Z")
    public boolean field233;

    static {
        new class44("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field232 = new int[50];
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 8)
    public static void method121(int arg0) {
        if (arg0 != 50) {
            method121(-125);
        }
        field232 = null;
    }
}
