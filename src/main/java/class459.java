import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class459 {

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field6672;

    static {
        new class157("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ldk;III)Lrg;", line = 3)
    public static final class465 method2677(class421 arg0, int arg1, int arg2, int arg3) {
        field6672++;
        class319 var4 = new class319(arg0.method2512(arg1, (byte) -93, arg3));
        class465 var5 = new class465(arg3, var4.method1871(118), var4.method1871(121), var4.method1863(-1), var4.method1863(arg2 ^ 0x1), arg2 == ~var4.method1869(arg2 - 87), var4.method1869(arg2 - 108), var4.method1869(-124));
        int var6 = var4.method1869(-75);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field6702.method3139(0, new class32(var4.method1869(arg2 - 97), var4.method1844(arg2 - 112), var4.method1844(-127), var4.method1844(-107), var4.method1844(-116), var4.method1844(-114), var4.method1844(-127), var4.method1844(-101), var4.method1844(-128)));
        }
        var5.method2692((byte) -90);
        return var5;
    }
}
