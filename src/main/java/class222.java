import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class222 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public int field3429;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Lqn;")
    public class33 field3432;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Z")
    public static boolean field3434;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "[I")
    public int[] field3430;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIBIIIIII)V", line = 8)
    public static final void method1520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field3428++;
        class238 var13 = new class238();
        var13.field3764 = arg3;
        var13.field3761 = arg9;
        var13.field3770 = arg1;
        var13.field3769 = arg0;
        var13.field3773 = arg11;
        var13.field3771 = arg12;
        var13.field3768 = arg4;
        var13.field3772 = arg8;
        var13.field3760 = arg10;
        var13.field3765 = arg7;
        var13.field3758 = arg5;
        var13.field3762 = arg2;
        if (arg6 <= 48) {
            method1520(46, -32, 120, -1, -72, 112, (byte) -45, 94, 97, -117, -105, -109, 97);
        }
        class227.field3564.method1077(16711935, var13);
    }
}
