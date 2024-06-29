import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class44 {

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public int field627;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "[I")
    public static int[] field631;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "[Lha;")
    public static class116[] field632;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZI)Z")
    public static final boolean method240(int arg0, boolean arg1, int arg2) {
        field626++;
        if (arg1) {
            field631 = null;
        }
        return (arg2 & 0x800) != 0 | class410.method2449(arg0, arg2, -24892) || class211.method1343(arg2, 0, arg0);
    }

    @OriginalMember(owner = "client!rh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field629++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method241(byte arg0) {
        field631 = null;
        field632 = null;
        if (arg0 != 53) {
            field630 = -91;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I)V")
    public class44(int arg0) {
        this.field627 = arg0;
    }

    static {
        new class344("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field630 = 0;
        field633 = 0;
    }
}
