import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class677 {

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "Ljd;")
    public static class216 field9226 = new class216(7, 2);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field9225;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field9228;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field9229;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field9230;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Lpfa;")
    public static class275 field9227;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIII)V", line = 3)
    public static final void method3746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9228++;
        if (arg1 == arg5) {
            class219.method1258(-99, arg4, arg1, arg3, arg2);
            return;
        }
        if (class292.field3700 <= arg3 - arg1 && class337.field4186 >= arg1 + arg3 && (arg2 - arg5) >= class125.field1524 && class377.field4848 >= (arg2 + arg5)) {
            class207.method1213(arg5, 1, arg4, arg2, arg3, arg1);
        } else {
            class72.method564(arg3, (byte) -82, arg1, arg5, arg2, arg4);
        }
        if (arg0 != -28431) {
            field9226 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILji;)Lfga;", line = 30)
    public static final class239 method3747(int arg0, class572 arg1) {
        if (arg0 != 2) {
            method3747(-12, null);
        }
        field9230++;
        return new class239(arg1.method3086(65280), arg1.method3086(65280), arg1.method3086(65280), arg1.method3086(arg0 ^ 0xFF02), arg1.method3086(65280), arg1.method3086(arg0 + 65278), arg1.method3086(65280), arg1.method3086(65280), arg1.method3059(1), arg1.method3097((byte) 12));
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 43)
    public static final void method3748(int arg0) {
        field9225++;
        class331.field4104.method1218(120);
        if (arg0 < 62) {
            field9229 = -66;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V", line = 54)
    public static void method3749(int arg0) {
        if (arg0 >= -23) {
            method3747(87, null);
        }
        field9227 = null;
        field9226 = null;
    }
}
