import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class348 {

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "[B")
    public static byte[] field5171 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "[Lqr;")
    public static class15[] field5168 = new class15[14];

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public int field5174;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Lie;")
    public class53 field5169;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "[I")
    public int[] field5170;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "[I")
    public static int[] field5172;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([Ljava/lang/Object;I[J)V", line = 4)
    public static final void method2315(Object[] arg0, int arg1, long[] arg2) {
        field5173++;
        class410.method2669(arg0, arg2, arg2.length - 1, (byte) 117, arg1);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 12)
    public static void method2316(byte arg0) {
        field5168 = null;
        if (arg0 != 9) {
            field5171 = null;
        }
        field5172 = null;
        field5171 = null;
    }
}
