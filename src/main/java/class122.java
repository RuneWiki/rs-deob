import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public abstract class class122 extends class334 {

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "I")
    public int field1658;

    @OriginalMember(owner = "client!cr", name = "u", descriptor = "Lof;")
    public static class328 field1660 = new class328(4);

    @OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
    public static int field1663 = -1;

    @OriginalMember(owner = "client!cr", name = "t", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!cr", name = "v", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!cr", name = "y", descriptor = "Lmn;")
    public static class162 field1664;

    @OriginalMember(owner = "client!cr", name = "A", descriptor = "[I")
    public static int[] field1666;

    @OriginalMember(owner = "client!cr", name = "w", descriptor = "[[[I")
    public static int[][][] field1662;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(FILbl;FFIFIIFI)[B")
    public static final byte[] method766(float arg0, int arg1, class268 arg2, float arg3, float arg4, int arg5, float arg6, int arg7, int arg8, float arg9, int arg10) {
        field1661++;
        byte[] var11 = new byte[arg8 * arg10 * arg5];
        class88.method607(arg8, arg0, arg10, arg2, var11, (byte) 123, arg1, arg6, arg5, arg3, arg7, arg4, arg9);
        return var11;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(IB)Lcg;")
    public static final class10 method767(int arg0, byte arg1) {
        if (arg1 >= -46) {
            method766(-0.11867565F, 90, null, 0.35540256F, -0.8508029F, 77, -0.39979452F, -28, -118, 0.6790816F, -32);
        }
        field1659++;
        class10[] var2 = class274.method1850(64);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field107 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(I)V")
    public class122(int arg0) {
        this.field1658 = arg0;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method768(byte arg0);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)Z")
    public abstract boolean method769(int arg0);

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V")
    public static void method770(int arg0) {
        field1664 = null;
        field1666 = null;
        if (arg0 != -28480) {
            field1665 = 127;
        }
        field1660 = null;
        field1662 = null;
    }
}
