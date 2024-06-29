import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class518 {

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field7496 = 2;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "Lkg;")
    public static class179 field7497 = new class179(24, 3);

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field7498 = 0;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "Lcw;")
    public static class121 field7494;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "[I")
    public static int[] field7499;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public static void method3088(int arg0) {
        if (arg0 != 48) {
            field7498 = -88;
        }
        field7497 = null;
        field7494 = null;
        field7499 = null;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
    public static final void method3089(int arg0) {
        field7495++;
        int var1 = -38 % ((29 - arg0) / 32);
        if (!class304.field3897) {
            return;
        }
        while (true) {
            while (class387.field5104 < class62.field808.length) {
                class254 var2 = class62.field808[class387.field5104];
                if (var2 != null && var2.field3244 == -1) {
                    if (class251.field3213 == null) {
                        class251.field3213 = class361.field4658.method2978(true, var2.field3237);
                    }
                    int var3 = class251.field3213.field7310;
                    if (var3 == -1) {
                        return;
                    }
                    class251.field3213 = null;
                    class387.field5104++;
                    var2.field3244 = var3;
                } else {
                    class387.field5104++;
                }
            }
            return;
        }
    }
}
