import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class58 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lho;")
    public static class102 field670 = new class102(10, 2, 2, 0);

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
    public static int[] field673 = new int[100];

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Lgk;")
    public static class331 field671 = new class331("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method530(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < arg3) {
            class531.method3136(arg0, -99, arg2, arg3, class141.field1996[arg1]);
        } else {
            class531.method3136(arg3, arg4 - 75, arg2, arg0, class141.field1996[arg1]);
        }
        field672++;
        if (arg4 != 10) {
            field670 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 31)
    public static void method531(byte arg0) {
        field671 = null;
        field670 = null;
        field673 = null;
        if (arg0 != -46) {
            field673 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLiv;)V", line = 43)
    public static final void method532(byte arg0, class65 arg1) {
        for (int var2 = 0; var2 < class75.field1021; var2++) {
            int var3 = arg1.method593((byte) 88);
            int var4 = arg1.method623((byte) -30);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class291.field4182[var3] != null) {
                class291.field4182[var3].field2013 = var4;
            }
        }
        if (arg0 != -47) {
            method530(85, 119, 68, 110, 126);
        }
        field669++;
    }
}
