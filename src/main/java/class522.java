import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class522 {

    @OriginalMember(owner = "client!us", name = "b", descriptor = "[I")
    public static int[] field7248 = new int[8];

    @OriginalMember(owner = "client!us", name = "c", descriptor = "Liu;")
    public static class517 field7249 = new class517(83, 8);

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "Lbw;")
    public static class410 field7247;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V", line = 5)
    public static void method2945(byte arg0) {
        field7248 = null;
        field7247 = null;
        int var1 = -37 % ((-arg0 - 12) / 53);
        field7249 = null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I[J[Ljava/lang/Object;)V", line = 29)
    public static final void method2946(int arg0, long[] arg1, Object[] arg2) {
        class635.method3667(0, (byte) -21, arg2, arg1, arg1.length - 1);
        if (arg0 != 83) {
            field7247 = null;
        }
        field7250++;
    }
}
