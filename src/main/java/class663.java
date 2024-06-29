import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class663 extends class192 {

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "[I")
    public static int[] field9214 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public static int field9216;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        ++field9213;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (super.field2448.field7266) {
            class443.method2511(var3, 0, class561.field7319, class221.field2895[arg0]);
        }
        if (arg1 > -123) {
            method3630(true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V")
    public static void method3630(boolean arg0) {
        field9214 = null;
        if (arg0) {
            method3631((byte) -89, -114, -22);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(BII)Z")
    public static final boolean method3631(byte arg0, int arg1, int arg2) {
        if (arg0 >= -95) {
            method3631((byte) 72, -110, -75);
        }
        ++field9216;
        return ~(2048 & arg2) != -1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBIIIIIII)Z")
    public static final boolean method3632(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field9215;
        if (arg4 < arg5 + arg6 && ~arg6 > ~(arg2 + arg4)) {
            if (arg1 < 113) {
                return false;
            } else {
                return ~(arg7 + arg8) < ~arg0 && ~arg8 > ~(arg0 + arg3);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class663() {
        super(0, true);
    }
}
