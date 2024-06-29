import java.awt.Canvas;
import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class554 {

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7850 = new BigInteger("8b2d20d561427fb823752476ff6ef68ff7141b4965073811be394d04baa93819fe158867f5f03aa6d8207a4d44593a7e7e521408af5e5363932a065ce569e11d", 16);

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lgm;")
    public static class108 field7853 = new class108();

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lf;")
    public static class702 field7854;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Ljava/awt/Frame;")
    public static Frame field7847;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[I")
    public static int[] field7852;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/awt/Canvas;Lfa;)Lr;", line = 3)
    public static final class166 method3143(int arg0, Canvas arg1, class209 arg2) {
        field7848++;
        if (arg0 != 16) {
            field7847 = null;
        }
        return new class18(arg1, arg2);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 16)
    public static void method3144(byte arg0) {
        field7854 = null;
        field7853 = null;
        if (arg0 != 70) {
            field7847 = null;
        }
        field7847 = null;
        field7850 = null;
        field7852 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 36)
    public static final void method3145(int arg0) {
        class373.method2252((byte) -93);
        if (arg0 != 16) {
            field7853 = null;
        }
        field7851++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ltk;FFIBIFFIFI)[B", line = 50)
    public static final byte[] method3146(class312 arg0, float arg1, float arg2, int arg3, byte arg4, int arg5, float arg6, float arg7, int arg8, float arg9, int arg10) {
        field7849++;
        if (arg4 < 7) {
            return null;
        } else {
            byte[] var11 = new byte[arg3 * arg8 * arg5];
            class243.method1649(arg1, 0, arg9, arg5, arg3, arg2, arg7, arg8, -90, arg10, arg6, var11, arg0);
            return var11;
        }
    }
}
