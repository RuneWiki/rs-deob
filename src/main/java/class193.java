import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class193 {

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field2758 = 0;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field2759;

    static {
        new class466("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILie;Lie;)V", line = 19)
    public static final void method1206(int arg0, class6 arg1, class6 arg2) {
        field2757++;
        if (arg1.field106 != null) {
            arg1.method36(0);
        }
        arg1.field108 = arg2.field108;
        if (arg0 < 57) {
            field2758 = 74;
        }
        arg1.field106 = arg2;
        arg1.field106.field108 = arg1;
        arg1.field108.field106 = arg1;
    }
}
