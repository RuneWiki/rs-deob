import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class590 {

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "Lli;")
    public static class392 field8270 = new class392();

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "Z")
    public static boolean field8272 = false;

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "F")
    public static float field8271;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V")
    public static void method3338(int arg0) {
        if (arg0 != 0) {
            method3338(-92);
        }
        field8270 = null;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lpaa;[IIZ)V")
    public static final void method3339(class577 arg0, int[] arg1, int arg2, boolean arg3) {
        if (arg0.field6259 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field6259.length; var5++) {
                if (arg0.field6259[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field6218 != -1) {
                class30 var6 = class188.field2708.method2140(arg0.field6218, 126);
                int var7 = var6.field461;
                if (var7 == 1) {
                    arg0.field6222 = 1;
                    arg0.field6251 = 0;
                    arg0.field6175 = arg2;
                    arg0.field6194 = 0;
                    arg0.field6253 = 0;
                    class603.method3399(var6, arg0.field3024, arg0.field6194, false, -58, arg0.field3029, arg0.field3019);
                }
                if (var7 == 2) {
                    arg0.field6253 = 0;
                }
            }
        }
        field8269++;
        boolean var8 = arg3;
        for (int var9 = 0; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg0.field6259 == null || arg0.field6259[var9] == -1 || class188.field2708.method2140(arg1[var9], 127).field462 >= class188.field2708.method2140(arg0.field6259[var9], 123).field462) {
                arg0.field6268 = arg0.field6269;
                arg0.field6259 = arg1;
                arg0.field6175 = arg2;
            }
        }
        if (var8) {
            arg0.field6268 = arg0.field6269;
            arg0.field6175 = arg2;
            arg0.field6259 = arg1;
        }
    }
}
