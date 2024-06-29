import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class449 {

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Z")
    public static boolean field6358;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static final void method2648(byte arg0) {
        int var1 = 74 / ((23 - arg0) / 60);
        class210.field2958 = 0;
        field6359++;
        class448.field6352.method465(true);
        class448.field6352.method463(class10.field110, -112);
        class210.field2958++;
    }

    static {
        new class104("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field6358 = false;
    }
}
