import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class320 {

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "Lhc;")
    public static class368 field4359 = new class368("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field4361 = 0;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4362 = new String[100];

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "[[B")
    public static byte[][] field4360;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 4)
    public static void method1951(byte arg0) {
        if (arg0 != 71) {
            field4359 = null;
        }
        field4362 = null;
        field4360 = null;
        field4359 = null;
    }
}
