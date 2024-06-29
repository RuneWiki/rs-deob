import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class178 {

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "Lmc;")
    public static class78 field2412 = new class78(10, 8);

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Lgd;")
    public static class206 field2414 = new class206("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "Lh;")
    public static class434 field2415 = new class434(21, 3);

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field2416 = 0;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
    public static void method1015(byte arg0) {
        field2415 = null;
        field2414 = null;
        field2412 = null;
        if (arg0 >= -124) {
            field2415 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(CB)Z")
    public static final boolean method1016(char arg0, byte arg1) {
        field2413++;
        if (arg1 >= -116) {
            field2416 = -58;
        }
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class72.field985;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZIIZ)V")
    public static final void method1017(boolean arg0, int arg1, int arg2, boolean arg3) {
        if (!arg0) {
            method1015((byte) -68);
        }
        field2411++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class267.field3526 = arg3;
        class490.field6835 = arg1;
        class165.field2290 = arg2;
    }
}
