import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class55 extends class168 {

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "Z")
    public static boolean field1000 = true;

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "I")
    public static int field1003 = 0;

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "F")
    public static float field1002;

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "Lth;")
    public static class431 field1004;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(III)V", line = 4)
    public static final void method475(int arg0, int arg1, int arg2) {
        class188 var3 = class461.field6675[arg0][arg1][arg2];
        if (var3 != null && var3.field2756 != null) {
            var3.field2756 = null;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIIIIIII)V", line = 14)
    public static final void method476(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1001++;
        if (arg8 >= 1 && arg4 >= 1 && arg8 <= class69.field1139 - 2 && (class255.field3763 - 2) >= arg4) {
            int var9 = arg1;
            if (arg1 < 3 && class195.method1322(arg8, arg4, 28946)) {
                var9 = arg1 + 1;
            }
            if (!class220.field3371.method1048(class74.field1211, 49) && !class380.method2312(arg8, var9, arg4, (byte) -85, class10.field95)) {
                return;
            }
            if (class461.field6675 == null) {
                return;
            }
            class41.field848.method2553(arg5, (byte) -15, class19.field213[arg1], arg4, arg8, arg1, class76.field1256);
            if (arg3 >= 0) {
                boolean var10 = class220.field3371.field2577;
                class220.field3371.field2577 = true;
                class41.field848.method2554(arg1, arg3, class19.field213[arg1], arg8, (byte) -113, var9, arg6, arg2, arg7, class76.field1256, arg4);
                class220.field3371.field2577 = var10;
            }
        }
        if (arg0 <= 47) {
            method475(17, -60, -8);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V", line = 54)
    public static void method477(byte arg0) {
        if (arg0 <= 45) {
            method475(-10, -13, 62);
        }
        field1004 = null;
    }
}
