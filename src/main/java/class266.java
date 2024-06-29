import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class266 {

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3373;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "[I")
    public static int[] field3374;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "[I")
    public static int[] field3379;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "[I")
    public static int[] field3375;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "[I")
    public static int[] field3376;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "[I")
    public static int[] field3378;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "[I")
    public static int[] field3372;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "[I")
    public static int[] field3371;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIZI)V")
    public static final void method1651(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            field3378 = null;
        }
        class319.field4112.method572(-124, arg3);
        field3370++;
        class319.field4112.method606(arg1, (byte) -72);
        class319.field4112.method606(arg0, (byte) -75);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
    public static void method1652(byte arg0) {
        if (arg0 >= -73) {
            return;
        }
        field3375 = null;
        field3373 = null;
        field3372 = null;
        field3371 = null;
        field3379 = null;
        field3376 = null;
        field3374 = null;
        field3378 = null;
    }

    static {
        new class169("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field3377 = 50;
        field3373 = new String[field3377];
        field3374 = new int[field3377];
        field3379 = new int[field3377];
        field3375 = new int[field3377];
        field3376 = new int[field3377];
        field3378 = new int[field3377];
        field3372 = new int[field3377];
        new class169("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
    }
}
