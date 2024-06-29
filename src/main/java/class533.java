import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class533 {

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Z")
    public static boolean field7848;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Ljc;")
    public static class305 field7846;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lsr;")
    public static class167 field7849;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public int field7841;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public int field7842;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public int field7843;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public int field7844;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public int field7845;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public int field7847;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "Lfo;")
    public static class361 field7851;

    static {
        new class305("Player ", "Spieler ", "Joueur ", "Jogador ");
        field7848 = false;
        field7846 = new class305("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");
        field7849 = new class167();
        field7852 = 0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIBIII)Z", line = 19)
    public static final boolean method3164(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field7850++;
        int var6 = 85 / ((-arg2 - 34) / 61);
        for (int var7 = arg3; var7 <= arg4; var7++) {
            for (int var8 = arg5; var8 <= arg1; var8++) {
                if (class74.field937[var7][var8] == arg0 && class291.field3842[var7][var8] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 49)
    public static void method3165(int arg0) {
        field7846 = null;
        if (arg0 == -7406) {
            field7851 = null;
            field7849 = null;
        }
    }
}
