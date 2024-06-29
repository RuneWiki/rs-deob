import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public abstract class class317 {

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "Lpj;")
    public static class132 field4707;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "Lpj;")
    public static class132 field4709;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1938(int arg0);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)[B")
    public abstract byte[] method1939(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[B)V")
    public abstract void method1940(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILxa;ILfa;ILfaa;II)V")
    public static final void method1941(int arg0, class461 arg1, int arg2, class212 arg3, int arg4, class140 arg5, int arg6, int arg7) {
        field4708++;
        if (arg1 == null) {
            return;
        }
        int var8;
        if (class670.field9445 == 4) {
            var8 = (int) class646.field9167 & 0x3FFF;
        } else {
            var8 = (int) class646.field9167 + class156.field2356 & 0x3FFF;
        }
        if (arg6 != 3265) {
            field4707 = null;
        }
        int var9 = Math.max(arg5.field2121 / 2, arg5.field2082 / 2) + 10;
        int var10 = arg2 * arg2 + arg4 * arg4;
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = class675.field9542[var8];
        int var12 = class675.field9541[var8];
        if (class670.field9445 != 4) {
            var12 = var12 * 256 / (class455.field6362 + 256);
            var11 = var11 * 256 / (class455.field6362 + 256);
        }
        int var13 = arg2 * var12 + arg4 * var11 >> 14;
        int var14 = arg4 * var12 - (arg2 * var11) >> 14;
        arg1.method23(arg0 + (arg5.field2121 / 2) + (var13 - arg1.method33() / 2), arg5.field2082 / 2 + arg7 + -var14 + -(arg1.method29() / 2), arg3, arg0, arg7);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
    public static void method1942(int arg0) {
        field4707 = null;
        if (arg0 != 10) {
            field4709 = null;
        }
        field4709 = null;
    }
}
