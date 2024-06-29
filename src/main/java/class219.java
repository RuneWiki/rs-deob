import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class219 {

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "Lgf;")
    public static class180 field3155 = new class180("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field3160 = 0;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "Liq;")
    public static class428 field3158 = new class428(0, 0);

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "Lgf;")
    public static class180 field3162 = new class180("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "Lvp;")
    public static class123 field3163 = new class123(61, -1);

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "Let;")
    public static class418 field3164;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
    public static void method1453(int arg0) {
        field3164 = null;
        field3163 = null;
        if (arg0 == 3685) {
            field3162 = null;
            field3158 = null;
            field3155 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BIII)V")
    public static final void method1454(byte arg0, int arg1, int arg2, int arg3) {
        class364.field5475 = new byte[arg1][arg3][arg2];
        field3161++;
        if (arg0 >= -8) {
            method1455(-97, -87);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)Z")
    public static final boolean method1455(int arg0, int arg1) {
        field3156++;
        if (arg0 == 4 || arg0 == 44 || arg0 == 10 || arg0 == 49 || arg0 == 22) {
            return true;
        } else if (arg0 == 8 || arg0 == 1006) {
            return true;
        } else {
            return arg1 >= -9;
        }
    }
}
