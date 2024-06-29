import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class249 {

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "Lgd;")
    public static class206 field3322;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "[I")
    public static int[] field3323;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "[S")
    public static short[] field3324;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field3321;

    static {
        new class206("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field3322 = new class206("slide:", "gleiten:", "glissement:", "deslizamento:");
        field3323 = new int[50];
        field3324 = new short[256];
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V", line = 13)
    public static void method1393(int arg0) {
        field3324 = null;
        field3322 = null;
        if (arg0 != 17470) {
            field3324 = null;
        }
        field3323 = null;
    }
}
