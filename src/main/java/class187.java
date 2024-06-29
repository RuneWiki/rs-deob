import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class187 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field2601;

    static {
        new class331("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Ljc;", line = 12)
    public static final class303 method1304(int arg0, int arg1) {
        field2601++;
        class303[] var2 = class330.method2027((byte) 109);
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class303 var4 = var2[var3];
            if (var4.field4322 == arg1) {
                return var4;
            }
        }
        return null;
    }
}
