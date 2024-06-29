import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class32 implements class210 {

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field373 = 0;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "Ltn;")
    public static class60 field371 = new class60(69, 0);

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "Lkn;")
    public static class530 field376 = new class530("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V", line = 5)
    public static void method193(byte arg0) {
        field371 = null;
        field376 = null;
        int var1 = -42 % ((arg0 + 3) / 42);
    }

    @OriginalMember(owner = "client!vo", name = "toString", descriptor = "()Ljava/lang/String;", line = 27)
    public final String toString() {
        field375++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V", line = 46)
    public static final void method194(boolean arg0) {
        if (class430.method2546(!arg0, class488.field6832) || class311.method1886(-25866, class488.field6832)) {
            class50.method394(5000, class515.field7596 >> 10, 0, class478.field6654 >> 10);
        } else {
            int var1 = class246.field3587.field3368[0] >> 3;
            int var2 = class246.field3587.field3378[0] >> 3;
            if (var1 >= 0 && var1 < class43.field494 >> 3 && var2 >= 0 && var2 < class500.field7068 >> 3) {
                class50.method394(5000, var2, 0, var1);
            } else {
                class50.method394(0, class500.field7068 >> 4, 0, class43.field494 >> 4);
            }
        }
        if (!arg0) {
            method193((byte) -28);
        }
        field374++;
        class356.method2102((byte) 34);
        class453.method2644(0);
        class76.method592(-71);
        class97.method689((byte) 126);
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 78)
    public class32(String arg0, int arg1) {
        this.field377 = arg1;
    }
}
