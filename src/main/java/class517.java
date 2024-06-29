import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class517 {

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public int field7530 = -1;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "Lhp;")
    public static class277 field7523 = new class277(64);

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field7525 = 1;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "Z")
    public static boolean field7524 = false;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "Z")
    public static boolean field7528 = false;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7531 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!et", name = "l", descriptor = "[S")
    public static short[] field7533 = new short[256];

    @OriginalMember(owner = "client!et", name = "k", descriptor = "Lig;")
    public static class206 field7532 = new class206(52, 12);

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "Lka;")
    public class407 field7527;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "[I")
    public int[] field7529;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field7522;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V", line = 8)
    public static void method3065(int arg0) {
        if (arg0 != 64) {
            field7531 = null;
        }
        field7531 = null;
        field7532 = null;
        field7523 = null;
        field7533 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)Lrc;", line = 22)
    public static final class467 method3066(byte arg0) {
        field7526++;
        if (arg0 != -40) {
            method3065(126);
        }
        class467 var1 = (class467) class493.field7174.method1644((byte) -124);
        if (var1 != null) {
            var1.method2108(true);
            var1.method199(arg0 - 18);
            return var1;
        }
        class467 var2;
        do {
            var2 = (class467) class158.field1948.method1644((byte) -123);
            if (var2 == null) {
                return null;
            }
            if (var2.method2856(arg0 ^ 0xB) > class84.method550((byte) -99)) {
                return null;
            }
            var2.method2108(true);
            var2.method199(arg0 ^ 0x14);
        } while ((var2.field401 & Long.MIN_VALUE) == 0L);
        return var2;
    }
}
