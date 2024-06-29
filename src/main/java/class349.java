import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public abstract class class349 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field4776 = -1;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field4781;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "[I")
    public static int[] field4782;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Llu;")
    public static class610 field4780;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "[Lha;")
    public static class53[] field4779;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(JB)I")
    public final int method2116(long arg0, byte arg1) {
        if (arg1 != 75) {
            method2118((byte) -33);
        }
        field4777++;
        long var4 = this.method1718(-16722);
        if (var4 > 0L) {
            class236.method1513(true, var4);
        }
        return this.method1714(false, arg0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)J")
    public abstract long method1718(int arg0);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZJ)I")
    public abstract int method1714(boolean arg0, long arg1);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)Llo;")
    public static final class642 method2117(byte arg0) {
        if (arg0 != 71) {
            method2118((byte) 84);
        }
        field4778++;
        return class339.field4664;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)J")
    public abstract long method1715(boolean arg0);

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V")
    public static void method2118(byte arg0) {
        field4780 = null;
        field4779 = null;
        if (arg0 != 83) {
            field4782 = null;
        }
        field4782 = null;
        field4781 = null;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V")
    public abstract void method1717(int arg0);

    static {
        new class572("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field4781 = new String[200];
        field4782 = new int[] { 1, 0, -1, 0 };
        field4780 = new class610(39, 4);
    }
}
