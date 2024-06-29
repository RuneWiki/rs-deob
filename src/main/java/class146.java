import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class146 extends class145 {

    @OriginalMember(owner = "client!wq", name = "E", descriptor = "Z")
    public static boolean field1797 = false;

    @OriginalMember(owner = "client!wq", name = "G", descriptor = "[I")
    public static int[] field1799 = new int[5];

    @OriginalMember(owner = "client!wq", name = "F", descriptor = "[I")
    public static int[] field1798 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!wq", name = "J", descriptor = "[[I")
    public static int[][] field1802;

    @OriginalMember(owner = "client!wq", name = "H", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!wq", name = "I", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(IIB)I")
    private final int method872(int arg0, int arg1, byte arg2) {
        ++field1801;
        int var4 = 74 % ((11 - arg2) / 62);
        int var5 = arg0 * 57 + arg1;
        int var6 = var5 << 1 ^ var5;
        return -(((var6 * 15731 * var6 + 789221) * var6 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V")
    public class146() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "(I)V")
    public static void method873(int arg0) {
        field1799 = null;
        field1798 = null;
        if (arg0 != -24573) {
            field1797 = false;
        }
        field1802 = null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field1800;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (arg0) {
            this.method872(120, 18, (byte) 86);
        }
        if (super.field1779.field4602) {
            int var4 = class573.field8270[arg1];
            for (int var5 = 0; ~var5 > ~class647.field9368; ++var5) {
                var3[var5] = this.method872(var4, class601.field8779[var5], (byte) -96) % 4096;
            }
        }
        return var3;
    }

    static {
        new class474("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field1802 = new int[6][];
    }
}
