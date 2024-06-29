import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class610 {

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "Z")
    public static boolean field8828 = false;

    @OriginalMember(owner = "client!cia", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8832 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!cia", name = "c", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!cia", name = "d", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!cia", name = "e", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "[I")
    public static int[] field8827;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(IBI)Z", line = 15)
    public static final boolean method3518(int arg0, byte arg1, int arg2) {
        field8831++;
        if (arg1 >= -103) {
            return true;
        } else {
            return class494.method2973(-118, arg2, arg0) | (arg0 & 0x70000) != 0 || class260.method1772(76, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)V", line = 27)
    public static void method3519(int arg0) {
        if (arg0 == 11455) {
            field8832 = null;
            field8827 = null;
        }
    }
}
