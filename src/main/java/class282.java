import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class282 {

    @OriginalMember(owner = "client!li", name = "b", descriptor = "Lvu;")
    public static class213 field4025 = new class213();

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "[I")
    public static int[] field4029;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "Lwt;")
    public static class194 field4027;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "[I")
    public static int[] field4032;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "[I")
    public static int[] field4030;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)I")
    public static final int method1715(int arg0, int arg1, int arg2, int arg3) {
        field4024++;
        if ((class379.field5661[arg1][arg2][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg1 <= 0 || (class379.field5661[1][arg2][arg3] & 0x2) == 0) {
            if (arg0 != 2) {
                method1716((byte) -31);
            }
            return arg1;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public static void method1716(byte arg0) {
        field4029 = null;
        field4032 = null;
        field4025 = null;
        field4027 = null;
        if (arg0 != 40) {
            field4032 = null;
        }
        field4030 = null;
    }

    static {
        new class194("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field4028 = 0;
        field4029 = new int[1000];
        field4027 = new class194("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");
        field4032 = new int[100];
        field4030 = new int[13];
        new class194("Use", "Benutzen", "Utiliser", "Usar");
    }
}
