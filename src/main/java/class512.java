import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class512 {

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Llt;")
    public static class475 field7490 = new class475("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lri;")
    public static class73 field7491 = new class73(16, 7);

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "F")
    public static float field7492;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lph;")
    public static class454 field7494;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
    public static final void method3025(boolean arg0, int arg1) {
        if (!arg0) {
            class117.field1774 = arg1;
            field7493++;
            class478.field7022.method1540(0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Z")
    public static final boolean method3026(int arg0) {
        field7489++;
        if (arg0 > -57) {
            field7494 = null;
        }
        if (class186.field2765) {
            try {
                class501.method2995("showVideoAd", (byte) 106, class483.field7077.field6462);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public static void method3027(int arg0) {
        if (arg0 < 40) {
            method3027(-33);
        }
        field7490 = null;
        field7491 = null;
        field7494 = null;
    }

    static {
        new class475("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
    }
}
