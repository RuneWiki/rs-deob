import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class476 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field7047 = Boolean.FALSE;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field7049 = 0;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILnn;)Lbq;", line = 6)
    public static final class192 method2846(int arg0, class289 arg1) {
        if (arg0 == 22145) {
            field7048++;
            return new class192(arg1.method1848((byte) 109), arg1.method1848((byte) 106), arg1.method1848((byte) 116), arg1.method1848((byte) 117), arg1.method1863(-56), arg1.method1858(-3256));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZFIIIII)[I", line = 18)
    public static final int[] method2847(int arg0, boolean arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7050++;
        int[] var8 = new int[arg4];
        class150 var9 = new class150();
        var9.field2476 = arg0;
        var9.field2469 = arg1;
        var9.field2477 = arg3;
        var9.field2481 = arg7;
        if (arg6 != -6481) {
            field7049 = -24;
        }
        var9.field2466 = (int) (arg2 * 4096.0F);
        var9.field2474 = arg5;
        var9.method23(true);
        class287.method1800(arg4, 1, 0);
        var9.method1098(var8, -1760601748, 0);
        return var8;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 44)
    public static void method2848(int arg0) {
        if (arg0 != 0) {
            field7047 = null;
        }
        field7047 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)[B")
    public abstract byte[] method2799(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)[B")
    public abstract byte[] method2800(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([BB)V")
    public abstract void method2801(byte[] arg0, byte arg1);
}
