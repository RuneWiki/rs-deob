import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class290 extends class147 {

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
    public volatile int field4324 = -1;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "Ljava/lang/String;")
    public volatile String field4321;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(B)V")
    public static final void method1826(byte arg0) {
        field4323++;
        if (arg0 < -1) {
            class127.field1559 = true;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ZLjava/lang/String;ILkd;Z)V")
    public static final void method1827(boolean arg0, String arg1, int arg2, class355 arg3, boolean arg4) {
        field4322++;
        if (arg2 != 1) {
            return;
        }
        if (!arg4) {
            class334.method2024(arg1, arg3, 3, arg2 ^ 0x3C);
            return;
        }
        if (class355.field5105.startsWith("win") && class355.field5092 != 3) {
            String var5 = null;
            if (arg3.field5106 != null) {
                var5 = arg3.field5106.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class405 var6 = class334.method2024(arg1, arg3, 0, 49);
                class37.field464 = arg1;
                class482.field6811 = var6;
                class28.field370 = arg3;
                return;
            }
        }
        if (class355.field5105.startsWith("mac")) {
            String var7 = null;
            if (arg3.field5106 != null) {
                var7 = arg3.field5106.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg0) {
                class334.method2024(arg1, arg3, 1, 77);
                return;
            }
        }
        class334.method2024(arg1, arg3, 2, 120);
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class290(String arg0) {
        this.field4321 = arg0;
    }

    static {
        new class40("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
    }
}
