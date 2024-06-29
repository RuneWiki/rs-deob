import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class454 {

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Z")
    public static boolean field6633;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Lff;")
    public static class9 field6634;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Lvh;")
    public static class240 field6636;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "[I")
    public static int[] field6637;

    static {
        new class83("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field6633 = false;
        field6634 = new class9(10);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 13)
    public static final void method2678(byte arg0) {
        class504.field7413.method65(false);
        field6631++;
        if (arg0 != -19) {
            field6636 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V", line = 40)
    public static void method2679(byte arg0) {
        if (arg0 != -32) {
            field6635 = -91;
        }
        field6637 = null;
        field6634 = null;
        field6636 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)I", line = 58)
    public static final int method2680(int arg0, int arg1, int arg2) {
        field6632++;
        if (arg2 != 6135) {
            method2680(38, 58, -56);
        }
        int var3 = class244.method1447(arg1 + 45365, arg0 + 91923, 5000, 4) - ((-(class244.method1447(arg1 + 10294, arg0 + 37821, 5000, 2) - 128 >> 1) - (class244.method1447(arg1, arg0, 5000, 1) - 128 >> 2)) + 128);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}
