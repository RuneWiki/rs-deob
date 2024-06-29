import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class216 {

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "[I")
    public int[] field3060 = new int[100];

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "[I")
    public int[] field3065 = new int[3];

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "[Ltq;")
    public class478[] field3066 = new class478[100];

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[Lgb;")
    public class270[] field3059 = new class270[8];

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lfn;")
    public static class52 field3064;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "Z")
    public static boolean field3068;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Z")
    public static boolean field3069;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Z")
    public static boolean field3070;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public int field3067;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field3062;

    static {
        new class112("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field3064 = new class52(38, -2);
        field3068 = true;
        field3069 = true;
        field3070 = false;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 17)
    public static final void method1366(int arg0, int arg1) {
        class460.field6479.method666(arg0, false);
        field3063++;
        class9.field184.method666(arg0, false);
        class118.field1651.method666(arg0, false);
        if (arg1 != 100) {
            method1366(10, 43);
        }
        class285.field3901.method666(arg0, false);
        class343.field4670.method666(arg0, false);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V", line = 33)
    public static void method1367(boolean arg0) {
        if (!arg0) {
            method1367(true);
        }
        field3064 = null;
    }
}
