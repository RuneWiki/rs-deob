import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class467 {

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "[Z")
    public static boolean[] field6893 = new boolean[200];

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "D")
    public static double field6894 = -1.0D;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "[[Z")
    public static boolean[][] field6892;

    static {
        new class475("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V", line = 11)
    public static void method2794(byte arg0) {
        field6892 = null;
        if (arg0 == 109) {
            field6893 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V", line = 24)
    public static final void method2795(int arg0) {
        if (arg0 == 39) {
            field6895++;
            class33.field345.method1040(class293.field4194, class43.field677, class169.field2506);
        }
    }
}
