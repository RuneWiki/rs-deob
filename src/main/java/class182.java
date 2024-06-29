import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class182 extends class561 {

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public int field2334 = 0;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field2335 = -1;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILge;I)V")
    private final void method1119(int arg0, class551 arg1, int arg2) {
        if (~arg0 == arg2) {
            this.field2334 = arg1.method3090(-101);
        }
        field2336++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLge;)V")
    public final void method1120(boolean arg0, class551 arg1) {
        field2333++;
        if (arg0) {
            this.field2334 = -77;
        }
        while (true) {
            int var3 = arg1.method3045(-127);
            if (var3 == 0) {
                return;
            }
            this.method1119(var3, arg1, -3);
        }
    }

    static {
        new class344("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
    }
}
