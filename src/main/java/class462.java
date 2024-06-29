import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class462 {

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public int field7101;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public int field7110;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    public int field7103;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public int field7106;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "[I")
    public static int[] field7104 = new int[1];

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field7107 = -1;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "Lsk;")
    public static class423 field7102 = new class423("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "Llp;")
    public static class256 field7100;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "Lwl;")
    public static class270 field7108;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "[I")
    public static int[] field7105;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V", line = 22)
    public static void method2758(int arg0) {
        field7100 = null;
        if (arg0 == -28859) {
            field7108 = null;
            field7104 = null;
            field7105 = null;
            field7102 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZI)Lar;", line = 36)
    public final class462 method2759(boolean arg0, int arg1) {
        field7109++;
        if (!arg0) {
            field7104 = null;
        }
        return new class462(this.field7103, arg1, this.field7110, this.field7101);
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(IIII)V", line = 47)
    public class462(int arg0, int arg1, int arg2, int arg3) {
        this.field7101 = arg3;
        this.field7110 = arg2;
        this.field7103 = arg0;
        this.field7106 = arg1;
    }
}
