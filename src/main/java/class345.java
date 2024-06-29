import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class345 {

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "[I")
    public static int[] field4477 = new int[3];

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "I")
    public static int field4478 = 0;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)V")
    public static void method2057(int arg0) {
        if (arg0 == 9) {
            field4477 = null;
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(BLdia;)Ldia;")
    public static final class233 method2058(byte arg0, class233 arg1) {
        field4476++;
        if (arg0 == -47) {
            class233 var2 = arg1 == null ? new class233() : new class233(arg1);
            var2.method1372(128, 9, arg0 ^ 0xAE);
            return var2;
        } else {
            return null;
        }
    }
}
