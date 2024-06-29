import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class127 extends class219 {

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2101 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "S")
    public static short field2105 = 32767;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public static int field2107 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "Z")
    public static boolean field2108 = true;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "Lsc;")
    private static class181 field2110 = class149.method967(255, "Close");

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "Lsc;")
    public static class181 field2109 = field2110;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "[I")
    public static int[] field2103;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
    public static void method821(int arg0) {
        field2103 = null;
        field2110 = null;
        field2101 = null;
        field2109 = null;
        if (arg0 != 0) {
            field2104 = 10;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)I")
    public static final int method822(int arg0, byte arg1) {
        if (arg1 == 78) {
            field2102++;
            return arg0 >>> 8;
        } else {
            return -105;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIB)I")
    public static final int method823(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 & 0x3;
        field2106++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            if (arg3 != -30) {
                method821(91);
            }
            return arg2;
        }
    }
}
