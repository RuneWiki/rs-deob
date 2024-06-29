import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class546 {

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "J")
    public long field7421;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "Lhk;")
    private class111 field7420;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "[I")
    public static int[] field7418 = new int[1000];

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public static void method3068(int arg0) {
        if (arg0 <= 71) {
            method3069(0.5283500099456269D, (byte) 52);
        }
        field7418 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(DB)V")
    public static final void method3069(double arg0, byte arg1) {
        class434.field5905.method1874(class282.field3918);
        field7419++;
        class434.field5905.method1860(0, 0, (int) arg0);
        class369.field5000.method503(class434.field5905);
        if (arg1 > 0) {
            method3068(-9);
        }
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lhk;JI)V")
    public class546(class111 arg0, long arg1, int arg2) {
        this.field7421 = arg1;
        this.field7420 = arg0;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(II[[[BLha;IIIIIIIII)V")
    public static final void method3070(int arg0, int arg1, byte[][][] arg2, class66 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field7422++;
        if (arg7 == 0 || arg10 == 0) {
            return;
        }
        if (arg0 != -2993) {
            field7418 = null;
        }
        if (arg7 == 9) {
            arg7 = 1;
            arg5 = arg5 + 1 & 0x3;
        }
        if (arg7 == 10) {
            arg5 = arg5 + 3 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 11) {
            arg7 = 8;
            arg5 = arg5 + 3 & 0x3;
        }
        arg3.method582(arg4, arg12, arg1, arg6, arg11, arg9, arg2[arg7 - 1][arg5], arg10, arg8);
    }

    @OriginalMember(owner = "client!hv", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field7420.method998(this.field7421, (byte) 108);
        field7417++;
        super.finalize();
    }
}
