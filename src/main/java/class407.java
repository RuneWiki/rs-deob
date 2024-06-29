import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class407 {

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "Z")
    public static boolean field5848 = false;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "[I")
    public static int[] field5847 = new int[2048];

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZIZ)I")
    public static final int method2494(int arg0, boolean arg1, int arg2, boolean arg3) {
        field5846++;
        if (!arg1) {
            method2495(107);
        }
        class327 var4 = class457.method2813(arg0, arg3, -37);
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && var4.field4346.length > arg2) {
            return var4.field4346[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public static void method2495(int arg0) {
        field5847 = null;
        if (arg0 != 27810) {
            method2494(-69, false, 68, false);
        }
    }
}
