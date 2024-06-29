import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field41 = new String[100];

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "Lki;")
    public static class498 field36 = new class498(71, 18);

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "Z")
    public static boolean field43 = false;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "Llt;")
    public static class475 field44 = new class475("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "[Ljava/awt/Color;")
    public static Color[] field45 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "Lut;")
    public class80 field39;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "[I")
    public int[] field40;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)I")
    public static final int method21(int arg0, int arg1) {
        field38++;
        int var2 = 14 / ((arg1 + 35) / 55);
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static void method22(int arg0) {
        field41 = null;
        if (arg0 != 9179409) {
            field44 = null;
        }
        field36 = null;
        field44 = null;
        field45 = null;
    }
}
