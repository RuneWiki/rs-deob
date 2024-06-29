import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class470 extends class269 {

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
    public static int field6885 = 1;

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "[I")
    public static int[] field6884 = new int[13];

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method2784(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field6883++;
        class22 var10 = null;
        if (arg8 >= -3) {
            return;
        }
        for (class22 var11 = (class22) class110.field1644.method2957(-95); var11 != null; var11 = (class22) class110.field1644.method2947(125)) {
            if (var11.field327 == arg5 && var11.field326 == arg3 && var11.field321 == arg4 && var11.field317 == arg0) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class22();
            var10.field327 = arg5;
            var10.field317 = arg0;
            var10.field326 = arg3;
            var10.field321 = arg4;
            if (arg3 >= 0 && arg4 >= 0 && arg3 < class50.field640 && class448.field6611 > arg4) {
                class303.method1887((byte) 83, var10);
            }
            class110.field1644.method2958(var10, (byte) 70);
        }
        var10.field325 = arg9;
        var10.field319 = arg1;
        var10.field322 = arg7;
        var10.field318 = arg6;
        var10.field320 = arg2;
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(B)V")
    public static void method2785(byte arg0) {
        field6884 = null;
        if (arg0 < 29) {
            field6885 = -19;
        }
    }
}
