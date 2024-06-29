import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class501 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Lkca;")
    public static class73 field7288 = new class73(56, 3);

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field7291 = -1;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lea;")
    public static class474 field7289 = new class474("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Leea;")
    public static class114 field7292;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I")
    public static final int method2992(int arg0, int arg1) {
        field7290++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        if (arg1 != -785404980) {
            field7288 = null;
        }
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    public static void method2993(boolean arg0) {
        field7292 = null;
        if (!arg0) {
            field7289 = null;
            field7288 = null;
        }
    }
}
