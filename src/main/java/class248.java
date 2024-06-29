import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class248 {

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "[Z")
    public static boolean[] field3704 = new boolean[5];

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "Lcb;")
    public static class304 field3705 = new class304(5000);

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)V")
    public static final void method1729(int arg0, int arg1) {
        field3706++;
        if (arg1 == -1 || !class189.field2713[arg1]) {
            return;
        }
        class438.field6255.method650((byte) -71, arg1);
        if (class186.field2657[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class186.field2657[arg1].length; var3++) {
            if (class186.field2657[arg1][var3] != null) {
                if (class186.field2657[arg1][var3].field3208 == 2) {
                    var2 = false;
                } else {
                    class186.field2657[arg1][var3] = null;
                }
            }
        }
        if (arg0 < 33) {
            method1729(24, -99);
        }
        if (var2) {
            class186.field2657[arg1] = null;
        }
        class189.field2713[arg1] = false;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
    public static void method1730(byte arg0) {
        field3705 = null;
        if (arg0 != -54) {
            method1729(-119, -20);
        }
        field3704 = null;
    }

    static {
        new class349("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
    }
}
