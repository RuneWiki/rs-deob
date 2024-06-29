import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class346 extends class612 {

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/awt/Component;IIILpq;)Loba;")
    public static final class218 method1934(Component arg0, int arg1, int arg2, int arg3, class165 arg4) {
        field4465++;
        if (class90.field1101 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class218 var5 = (class218) Class.forName("aq").getDeclaredConstructor().newInstance();
                var5.field2669 = new int[(class197.field2383 ? 2 : 1) * 256];
                var5.field2697 = arg1;
                var5.method777(arg0);
                var5.field2691 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field2691 > 16384) {
                    var5.field2691 = 16384;
                }
                var5.method773(var5.field2691);
                if (class608.field8847 > 0 && class162.field1966 == null) {
                    class162.field1966 = new class150();
                    class162.field1966.field1789 = arg4;
                    arg4.method901((byte) -97, class608.field8847, class162.field1966);
                }
                if (class162.field1966 != null) {
                    if (class162.field1966.field1788[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class162.field1966.field1788[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class273 var6 = new class273(arg4, arg3);
                    var6.field2697 = arg1;
                    var6.field2669 = new int[(class197.field2383 ? 2 : 1) * 256];
                    var6.method777(arg0);
                    var6.field2691 = 16384;
                    if (arg2 != 1) {
                        return null;
                    }
                    var6.method773(var6.field2691);
                    if (class608.field8847 > 0 && class162.field1966 == null) {
                        class162.field1966 = new class150();
                        class162.field1966.field1789 = arg4;
                        arg4.method901((byte) -117, class608.field8847, class162.field1966);
                    }
                    if (class162.field1966 != null) {
                        if (class162.field1966.field1788[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class162.field1966.field1788[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class218();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    static {
        new class180("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
    }
}
