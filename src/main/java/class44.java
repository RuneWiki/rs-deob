import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class44 {

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lkn;")
    public static class530 field502 = new class530("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public static final void method253(boolean arg0) {
        class263.field3871 = null;
        class92.field1162 = null;
        if (!arg0) {
            field502 = null;
        }
        class141.field1848 = false;
        class468.field6537 = null;
        class64.field814 = null;
        class117.field1634 = null;
        field500++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method254(int arg0) {
        if (arg0 != -18155) {
            field502 = null;
        }
        field502 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIB)V")
    public static final void method255(int arg0, int arg1, int arg2, byte arg3) {
        class368.field5253 = new byte[arg2][arg1][arg0];
        field501++;
        if (arg3 != -78) {
            method253(true);
        }
    }
}
