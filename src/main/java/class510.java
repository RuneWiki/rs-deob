import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class510 {

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "[I")
    public static int[] field7461;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Lip;")
    public static class501 field7458;

    static {
        new class234("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field7460 = 0;
        field7461 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BII)V", line = 13)
    public static final void method3035(byte arg0, int arg1, int arg2) {
        field7459++;
        class211 var3 = class452.method2749(1, -50, arg2);
        var3.method1463(0);
        if (arg0 == 1) {
            var3.field3441 = arg1;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 37)
    public static void method3036(int arg0) {
        field7458 = null;
        field7461 = null;
        if (arg0 >= -10) {
            method3036(-44);
        }
    }
}
