import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class class472 {

    @OriginalMember(owner = "client!es", name = "c", descriptor = "Lpi;")
    public static class340 field6895 = new class340(104, 3);

    @OriginalMember(owner = "client!es", name = "h", descriptor = "[I")
    public static int[] field6900 = new int[14];

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    public static int field6898 = 0;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "I")
    public static int field6899 = 64;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "Loi;")
    public static class169 field6896 = new class169("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Lgv;")
    public static class235 field6897;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)Z")
    public abstract boolean method1488(byte arg0, int arg1);

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
    public static void method2832(byte arg0) {
        field6896 = null;
        field6897 = null;
        field6900 = null;
        int var1 = 43 / ((-arg0 - 32) / 41);
        field6895 = null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILqa;)V")
    public static final void method2833(int arg0, class129 arg1) {
        field6893++;
        if (class202.field2648 != class37.field573.field6220 && class470.field6877 != null && arg0 == 518 && class254.method1585(arg1, false, class37.field573.field6220)) {
            class202.field2648 = class37.field573.field6220;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
    public static final void method2834(int arg0) {
        class405.field5433 = 0;
        if (arg0 < -75) {
            class46.field673 = new class449[50];
            field6894++;
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)Lkc;")
    public abstract class156 method1481(int arg0);

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V")
    public abstract void method1487(int arg0);

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(I)V")
    public abstract void method1480(int arg0);
}
