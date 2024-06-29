import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class94 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "[I")
    public static int[] field1413 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field1415 = -1;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Ljk;")
    public static class446 field1412;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 6)
    public static void method673(byte arg0) {
        field1412 = null;
        if (arg0 > 92) {
            field1413 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(JI)V", line = 28)
    public static final void method674(long arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        field1414++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class443.method2556(arg1 - 126, arg0 + -1L);
            class443.method2556(-89, 1L);
        } else {
            class443.method2556(-121, arg0);
        }
    }
}
