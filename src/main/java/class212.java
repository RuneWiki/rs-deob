import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class212 {

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lnj;")
    public static class487 field3120 = new class487("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Z")
    public static boolean field3119;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "[I")
    public static int[] field3118;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method1373(int arg0) {
        field3118 = null;
        field3120 = null;
        if (arg0 != -8001) {
            field3120 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZBII)V")
    public static final void method1374(boolean arg0, byte arg1, int arg2, int arg3) {
        field3117++;
        if (arg1 != -1) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class36.field419 = arg3;
        class614.field9002 = arg0;
        class555.field8241 = arg2;
    }
}
