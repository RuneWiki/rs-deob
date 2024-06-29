import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public abstract class class213 extends class405 {

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public int field3044;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "[Lwg;")
    public static class41[] field3046;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "[I")
    public static int[] field3049;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "J")
    public static long field3047;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "[Lta;")
    public static class337[] field3048;

    static {
        new class347("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field3045 = -1;
        field3046 = new class41[14];
        new class347("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field3049 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
        field3047 = -1L;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V", line = 7)
    public static void method1371(byte arg0) {
        field3049 = null;
        field3046 = null;
        if (arg0 > 14) {
            field3048 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I)V", line = 20)
    public class213(int arg0) {
        this.field3044 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method462(int arg0);

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)Z")
    public abstract boolean method463(byte arg0);
}
