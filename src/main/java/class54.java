import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class54 {

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field458 = 0;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Lcea;")
    public static class180 field455 = new class180("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Lui;")
    public static class193 field461 = new class193();

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public int field460;

    static {
        new class180("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I", line = 11)
    public static final int method305(int arg0, int arg1) {
        if (arg0 < 75) {
            method307(55);
        }
        field453++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lqa;I)V", line = 24)
    public static final void method306(class206 arg0, int arg1) {
        if (arg1 == 28550) {
            for (class455 var2 = (class455) class388.field5129.method1987(true); var2 != null; var2 = (class455) class388.field5129.method1994(6408)) {
                var2.method2649(arg0);
            }
            field459++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 44)
    public static final void method307(int arg0) {
        class465.method2710();
        if (arg0 == 16568) {
            field456++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V", line = 55)
    public static void method308(int arg0) {
        field461 = null;
        if (arg0 != 255) {
            field458 = -15;
        }
        field455 = null;
    }
}
