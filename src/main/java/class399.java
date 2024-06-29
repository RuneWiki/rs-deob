import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class399 {

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "[I")
    public static int[] field5940;

    static {
        new class567(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)Z", line = 9)
    public static final boolean method2438(int arg0, int arg1, int arg2) {
        if (arg2 != 540800) {
            method2439(-128);
        }
        field5939++;
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V", line = 20)
    public static void method2439(int arg0) {
        field5940 = null;
        if (arg0 != 540800) {
            field5941 = -35;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BIIIIIII)V", line = 36)
    public static final void method2440(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != -35) {
            method2439(127);
        }
        field5938++;
        if (arg4 == arg5) {
            class303.method1891(arg1, arg4, -1, arg6, arg7, arg3, arg2);
        } else if (class183.field2638 <= arg3 - arg4 && class268.field3911 >= (arg3 + arg4) && class222.field3350 <= (arg7 - arg5) && arg5 + arg7 <= class409.field6071) {
            class54.method449(arg1, arg4, arg7, arg3, -1295904959, arg2, arg6, arg5);
        } else {
            class154.method1093(arg2, arg4, arg3, arg5, arg1, arg6, arg0 + 1793050789, arg7);
        }
    }
}
