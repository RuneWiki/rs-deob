import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class210 {

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[S")
    public static short[] field2960 = new short[256];

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field2958 = 0;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lcba;")
    public static class471 field2959 = new class471(105, 3);

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field2962 = -1;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lej;")
    public static class104 field2961 = new class104("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "[I")
    public static int[] field2963 = new int[200];

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static final void method1380(int arg0) {
        field2956++;
        if (class310.field4181) {
            return;
        }
        if (class491.field6875.field3369) {
            class18.field224 = ((int) class18.field224 + 47 & 0xFFFFFFF0);
        } else {
            class301.field4121 += (12.0F - class301.field4121) / 2.0F;
        }
        class310.field4181 = true;
        if (arg0 != -16) {
            method1381(false);
        }
        class494.field6921 = true;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)Z")
    public static final boolean method1381(boolean arg0) {
        field2957++;
        if (!arg0) {
            method1381(true);
        }
        return class71.field1181 != class53.field988 || class258.field3599 >= 2;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    public static void method1382(int arg0) {
        field2959 = null;
        if (arg0 >= -111) {
            field2963 = null;
        }
        field2960 = null;
        field2963 = null;
        field2961 = null;
    }
}
