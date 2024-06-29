import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class396 extends class28 {

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "S")
    public short field5661;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "Lcb;")
    public static class318 field5663 = new class318(36, 10);

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "[I")
    public static int[] field5662;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIII)V", line = 4)
    public static final void method2349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5660++;
        if (arg0 == arg4) {
            class552.method3095(84, arg5, arg1, arg6, arg3, arg7, arg4);
            return;
        }
        if (arg2 != 14319) {
            field5663 = null;
        }
        if (class398.field5676 <= arg3 - arg4 && arg3 + arg4 <= class298.field3995 && (arg7 - arg0) >= class609.field8313 && class19.field169 >= arg7 + arg0) {
            class464.method2632(arg4, 82, arg0, arg3, arg7, arg1, arg5, arg6);
        } else {
            class47.method284(arg0, arg5, arg3, arg1, (byte) 121, arg4, arg7, arg6);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 29)
    public static void method2350(int arg0) {
        if (arg0 != 36) {
            field5662 = null;
        }
        field5662 = null;
        field5663 = null;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V", line = 44)
    public class396() {
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(S)V", line = 46)
    public class396(short arg0) {
        this.field5661 = arg0;
    }
}
