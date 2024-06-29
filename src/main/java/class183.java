import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class183 {

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field2335 = 0;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZBI)Lhg;", line = 7)
    public static final class492 method1141(boolean arg0, byte arg1, int arg2) {
        if (arg1 <= 4) {
            field2335 = 116;
        }
        field2332++;
        long var3 = (long) (arg2 | (arg0 ? Integer.MIN_VALUE : 0));
        return (class492) class422.field5307.method399(-32748, var3);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I", line = 21)
    public static final int method1142(int arg0) {
        field2333++;
        return arg0 == 1818 ? class612.field8581 : -36;
    }
}
