import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class519 extends class100 {

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "[I")
    public static int[] field7663 = new int[32];

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "Llo;")
    public static class306 field7664 = new class306("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "Lui;")
    public static class378 field7666 = new class378("WTRC", 1);

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "[I")
    public static int[] field7668 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "Lsp;")
    public class519 field7660;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "Lsp;")
    public class519 field7661;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BII)V", line = 4)
    public static final void method3067(byte arg0, int arg1, int arg2) {
        field7665++;
        class284 var3 = class412.field6247[arg1][arg2];
        if (var3 != null) {
            class280.field4590 = var3.field4643;
            class52.field846 = var3.field4646;
            class379.field5882 = var3.field4648;
        }
        class282.method1845((byte) -98);
        if (arg0 != -99) {
            method3067((byte) 8, -9, 107);
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)V", line = 27)
    public final void method3068(byte arg0) {
        if (arg0 >= -6) {
            return;
        }
        field7662++;
        if (this.field7661 != null) {
            this.field7661.field7660 = this.field7660;
            this.field7660.field7661 = this.field7661;
            this.field7660 = null;
            this.field7661 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(Z)V", line = 51)
    public static void method3069(boolean arg0) {
        if (arg0) {
            method3067((byte) 59, -112, 62);
        }
        field7663 = null;
        field7666 = null;
        field7664 = null;
        field7668 = null;
    }
}
