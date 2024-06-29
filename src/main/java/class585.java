import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public abstract class class585 extends class483 {

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public static int field7757 = 0;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "[I")
    public static int[] field7755 = new int[13];

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)V")
    public static final void method3215(int arg0, int arg1, int arg2) {
        field7760++;
        class382 var3 = class396.method2276(-107, 6, arg0);
        int var4 = 70 % (arg1 / 33);
        var3.method2232(121);
        var3.field5099 = arg2;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Z")
    public static final boolean method3216(int arg0, int arg1) {
        field7756++;
        if (arg0 == -18) {
            return arg1 >= 12 && arg1 <= 17;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)Ljk;")
    public abstract class592 method963(int arg0);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method3217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7754++;
        if (arg5 >= -65) {
            method3219(16);
        }
        if (arg8 < 1 || arg3 < 1 || class34.field530 - 2 < arg8 || class34.field531 - 2 < arg3) {
            return;
        }
        int var9 = arg4;
        if (arg4 < 3 && class69.method541(0, arg3, arg8)) {
            var9 = arg4 + 1;
        }
        if (!class344.field4718.method1553(class571.field7587, -2058) && !class37.method291(class669.field9491, arg3, arg8, -1, var9)) {
            return;
        }
        if (class703.field9899 == null) {
            return;
        }
        class505.field6732.method712(arg3, class591.field7820[arg4], arg8, arg4, class10.field197, arg0, 0);
        if (arg7 < 0) {
            return;
        }
        boolean var10 = class344.field4718.field5446;
        class344.field4718.field5446 = true;
        class505.field6732.method711(arg3, class591.field7820[arg4], (byte) -111, class10.field197, arg2, arg1, arg4, arg8, var9, arg6, arg7);
        class344.field4718.field5446 = var10;
        return;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lgba;III)V")
    public static final void method3218(class625 arg0, int arg1, int arg2, int arg3) {
        class393.field5172 = arg1;
        class526.field7011 = arg0;
        if (arg2 != -2) {
            method3219(31);
        }
        class393.field5173 = arg3;
        field7758++;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
    public static final void method3219(int arg0) {
        class123.field2061 = -1;
        class476.field6353 = -1;
        field7759++;
        if (arg0 == -2) {
            class504.field6729 = 0;
        }
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V")
    public static void method3220(int arg0) {
        field7755 = null;
        if (arg0 != -1) {
            field7755 = null;
        }
    }
}
