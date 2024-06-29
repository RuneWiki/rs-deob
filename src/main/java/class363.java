import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class363 extends class149 {

    @OriginalMember(owner = "client!mo", name = "J", descriptor = "Lcm;")
    public static class449 field5621 = new class449(58, 6);

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "[B")
    public static byte[] field5624 = new byte[2048];

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "Lpg;")
    public static class492 field5625 = new class492(67, 12);

    @OriginalMember(owner = "client!mo", name = "I", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!mo", name = "K", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
    public static int field5623;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mo", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field5626;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(B)V")
    public static final void method2292(byte arg0) {
        if (arg0 != 57) {
            field5623 = -2;
        }
        ++field5620;
        if (~class469.field6854 == -3) {
            class455.field6684 = 96;
        } else {
            try {
                Method var1 = (field5626 != null ? field5626 : (field5626 = method2294("java.lang.Runtime"))).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class455.field6684 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)[I")
    public final int[] method92(int arg0, int arg1) {
        ++field5622;
        if (arg0 != -10835) {
            method2292((byte) 84);
        }
        int[] var3 = super.field2152.method2891(arg1, (byte) 76);
        if (super.field2152.field7051) {
            class361.method2283(var3, 0, class316.field4838, class185.field2613[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "(B)V")
    public static void method2293(byte arg0) {
        if (arg0 != -101) {
            method2292((byte) -25);
        }
        field5624 = null;
        field5625 = null;
        field5621 = null;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
    public class363() {
        super(0, true);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2294(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class375("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
    }
}
