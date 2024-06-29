import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class186 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Lof;")
    public static class446 field2503 = new class446("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Lof;")
    public static class446 field2508 = new class446("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public int field2504;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Lwd;")
    public class182 field2507;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "[I")
    public int[] field2505;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
    public static void method1252(byte arg0) {
        field2508 = null;
        if (arg0 <= 120) {
            field2508 = null;
        }
        field2503 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIB)V")
    public static final void method1253(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = class203.field2716.field1157 * arg1 >> 8;
        if (arg3 != -2) {
            field2508 = null;
        }
        field2506++;
        if (var4 != 0 && arg2 != -1) {
            class448.method2736(0, arg2, 0, false, class41.field612, var4);
            class539.field7905 = true;
        }
    }
}
