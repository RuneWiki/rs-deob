import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class433 {

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field6144 = 0;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field6146 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "[I")
    public static int[] field6147 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)V")
    public static final void method2683(int arg0, byte arg1) {
        field6143++;
        class450 var2 = class59.method540(10, arg0, 1000);
        int var3 = 33 % ((27 - arg1) / 34);
        var2.method2798(-664528978);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V")
    public static void method2684(boolean arg0) {
        field6147 = null;
        field6146 = null;
        if (arg0) {
            field6142 = -25;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIII)V")
    public static final void method2685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6145++;
        if (arg1 != 28) {
            field6146 = null;
        }
        int var9 = arg5 + 1;
        class396.method2436(-1070, arg3, arg0, class186.field2697[arg5], arg2);
        int var10000 = arg1 - 1098;
        int var8 = arg4 - 1;
        class396.method2436(var10000, arg3, arg0, class186.field2697[arg4], arg2);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class186.field2697[var6];
            var7[arg0] = var7[arg2] = arg3;
        }
    }
}
