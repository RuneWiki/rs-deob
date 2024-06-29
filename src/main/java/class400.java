import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class400 {

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "Leh;")
    public static class246 field5633 = new class246(27, 3);

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "Leh;")
    public static class246 field5634 = new class246(47, -1);

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "Lkn;")
    public static class530 field5636 = new class530("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "[[[J")
    public static long[][][] field5635;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
    public static void method2315(boolean arg0) {
        field5635 = null;
        if (arg0) {
            field5634 = null;
            field5633 = null;
            field5636 = null;
        }
    }
}
