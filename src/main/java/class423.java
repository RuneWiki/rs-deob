import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class423 extends class649 {

    @OriginalMember(owner = "client!br", name = "l", descriptor = "[I")
    public static int[] field6227 = new int[50];

    @OriginalMember(owner = "client!br", name = "m", descriptor = "Z")
    public static boolean field6228 = false;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(ILhs;)V", line = 8)
    public class423(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BILd;Ljava/awt/Canvas;)Lha;", line = 11)
    public static final class544 method2643(byte arg0, int arg1, class267 arg2, Canvas arg3) {
        ++field6220;
        int var4 = 44 / ((-50 - arg0) / 42);
        return new class166(arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)V", line = 21)
    public final void method129(int arg0, byte arg1) {
        if (arg1 > -120) {
            this.method135(97);
        }
        super.field9223 = arg0;
        ++field6226;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lhs;)V", line = 36)
    public class423(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)I", line = 39)
    public final int method133(int arg0, int arg1) {
        if (arg0 != 18648) {
            field6228 = false;
        }
        ++field6221;
        return 1;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lla;III)Lpha;", line = 51)
    public static final class553 method2644(class422 arg0, int arg1, int arg2, int arg3) {
        ++field6225;
        class301 var4 = new class301(arg0.method2624(0, arg1, arg2));
        class553 var5 = new class553(arg2, var4.method1958(arg3 ^ -14186), var4.method1958(-3438), var4.method1934(arg3 ^ -14854), var4.method1934(-2), ~var4.method1987(-38) == -2, var4.method1987(-53), var4.method1987(arg3 ^ -14924));
        int var6 = var4.method1987(-54);
        for (int var7 = 0; var6 > var7; ++var7) {
            var5.field7888.method3472(106, new class59(var4.method1987(-96), var4.method1989((byte) -127), var4.method1989((byte) -48), var4.method1989((byte) -44), var4.method1989((byte) -123), var4.method1989((byte) -56), var4.method1989((byte) -99), var4.method1989((byte) -104), var4.method1989((byte) -109)));
        }
        if (arg3 != 14852) {
            return null;
        } else {
            var5.method3229(12800);
            return var5;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V", line = 83)
    public static void method2645(boolean arg0) {
        field6227 = null;
        if (arg0) {
            method2646(85, 63, 79);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III)V", line = 93)
    public static final void method2646(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            ++field6223;
            if (class626.field8787 != arg1) {
                class592.field8328 = new int[arg1];
                for (int var3 = 0; arg1 > var3; ++var3) {
                    class592.field8328[var3] = (var3 << 12) / arg1;
                }
                class626.field8787 = arg1;
                class153.field2379 = arg1 * 32;
                class245.field3948 = arg1 + -1;
            }
            if (~class259.field4054 != ~arg2) {
                if (~class626.field8787 != ~arg2) {
                    class131.field2138 = new int[arg2];
                    for (int var4 = 0; arg2 > var4; ++var4) {
                        class131.field2138[var4] = (var4 << 12) / arg2;
                    }
                } else {
                    class131.field2138 = class592.field8328;
                }
                class259.field4054 = arg2;
                class580.field8203 = arg2 + -1;
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V", line = 141)
    public final void method134(int arg0) {
        if (arg0 != 1) {
            method2646(-101, 59, 27);
        }
        ++field6222;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)I", line = 154)
    public final int method135(int arg0) {
        int var2 = 99 % ((-18 - arg0) / 50);
        ++field6224;
        return 0;
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)I", line = 165)
    public final int method2647(int arg0) {
        ++field6229;
        if (arg0 != 3) {
            this.method135(-57);
        }
        return super.field9223;
    }
}
