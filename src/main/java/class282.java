import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class282 {

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "S")
    public static short field3586;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Ldq;")
    public static class493 field3585;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lkg;Z)V")
    public static final void method1669(class179 arg0, boolean arg1) {
        class40.field511.method1206(0, arg0.method1143((byte) 125));
        if (!arg1) {
            field3584++;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static void method1670(int arg0) {
        if (arg0 > -19) {
            field3586 = 32;
        }
        field3585 = null;
    }

    static {
        new class335("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field3586 = 205;
        field3585 = new class493(107, 12);
        field3587 = -1;
    }
}
