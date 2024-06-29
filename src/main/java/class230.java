import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class230 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V", line = 11)
    public static final void method1581(boolean arg0) {
        if (!arg0) {
            method1581(false);
        }
        field3278++;
        class527.field7496 = 0;
        class360.field5055 = 0;
        class78.field1465 = 0;
        class702.field9856 = 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIII)V", line = 23)
    public static final void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3277++;
        if (arg1 < ~arg6 || arg3 < 1 || (class174.field2540 - 2) < arg6 || (class716.field9999 - 2) < arg3) {
            return;
        }
        int var9 = arg2;
        if (arg2 < 3 && class634.method3647(-86, arg3, arg6)) {
            var9 = arg2 + 1;
        }
        if (class471.field6781.field6704.method2015(27669) == 0 && !class328.method2096(arg6, (byte) -73, var9, arg3, class569.field8104)) {
            return;
        }
        if (class390.field5454 == null) {
            return;
        }
        class274.field3909.method1233(arg6, (byte) 83, class630.field9041[arg2], class359.field5046, arg3, arg5, arg2);
        if (arg7 < 0) {
            return;
        }
        int var10 = class471.field6781.field6665.method3026(27669);
        class471.field6781.method2826(1, (byte) 126, class471.field6781.field6665);
        class274.field3909.method1235(class630.field9041[arg2], arg2, arg7, arg6, arg4, class359.field5046, arg3, arg8, var9, (byte) -128, arg0);
        class471.field6781.method2826(var10, (byte) 84, class471.field6781.field6665);
        return;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1578(int arg0);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)[B")
    public abstract byte[] method1579(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z[B)V")
    public abstract void method1580(boolean arg0, byte[] arg1);
}
