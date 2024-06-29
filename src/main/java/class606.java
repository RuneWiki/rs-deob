import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class606 {

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "Z")
    public static boolean field9002 = false;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    public static int field9004 = 0;

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
    public static int field9007 = 999999;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
    public static int field9008;

    @OriginalMember(owner = "client!pw", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9006++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)I")
    public static final int method3565(int arg0, int arg1) {
        return class188.field2803 == null ? 0 : class188.field2803[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILkda;I)Lce;")
    public static final class259 method3566(int arg0, class328 arg1, int arg2) {
        field9008++;
        if (arg2 <= 7) {
            return null;
        } else {
            byte[] var3 = arg1.method1984(1670, arg0);
            return var3 == null ? null : new class259(var3);
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field9005++;
        class332 var10 = null;
        if (arg9 != -1) {
            return;
        }
        for (class332 var11 = (class332) class306.field4198.method124((byte) 42); var11 != null; var11 = (class332) class306.field4198.method120(arg9 ^ 0x5D)) {
            if (var11.field4588 == arg5 && var11.field4593 == arg6 && var11.field4584 == arg0 && var11.field4590 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class332();
            var10.field4584 = arg0;
            var10.field4590 = arg7;
            var10.field4593 = arg6;
            var10.field4588 = arg5;
            if (arg6 >= 0 && arg0 >= 0 && arg6 < class146.field2125 && class410.field5609 > arg0) {
                class62.method402(var10, 1);
            }
            class306.field4198.method131(var10, 0);
        }
        var10.field4589 = arg1;
        var10.field4583 = arg3;
        var10.field4581 = arg4;
        var10.field4595 = arg8;
        var10.field4592 = arg2;
    }
}
