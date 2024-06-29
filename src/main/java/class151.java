import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public abstract class class151 {

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "Lwf;")
    public static class79 field2244 = new class79(34, 7);

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "Lvp;")
    public static class112 field2247;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)I")
    public abstract int method947(int arg0, int arg1);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
    public static void method948(int arg0) {
        field2247 = null;
        if (arg0 == 666285656) {
            field2244 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZI)[B")
    public abstract byte[] method949(boolean arg0, int arg1);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)Ldg;")
    public abstract class261 method950(byte arg0);

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(II)V")
    public abstract void method951(int arg0, int arg1);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method952(String arg0, int arg1) {
        field2243++;
        if (arg1 != 16046) {
            method953(-46, -125);
        }
        return class282.method1781(true, arg0, 10, true);
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(II)Ljava/lang/String;")
    public static final String method953(int arg0, int arg1) {
        if (arg1 != 16729301) {
            method948(83);
        }
        field2245++;
        return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFF44D5) >> 16) + "." + ((arg0 & 0xFFF7) >> 8) + "." + (arg0 & 0xFF);
    }

    static {
        new class326("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field2247 = new class112("", 17);
    }
}
