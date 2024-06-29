import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class339 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "J")
    public static volatile long field4327 = 0L;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4329 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field4335 = 0;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Luc;")
    public static class27 field4333 = new class27(10, 3);

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "Ldf;")
    public static class372 field4336;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 6)
    public static void method1945(int arg0) {
        field4333 = null;
        if (arg0 != -10255) {
            field4327 = -4L;
        }
        field4336 = null;
        field4329 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIB)Z", line = 19)
    public static final boolean method1946(int arg0, int arg1, byte arg2) {
        if (arg2 != -42) {
            field4333 = null;
        }
        field4334++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 32)
    public static final void method1947(byte arg0) {
        field4331++;
        int[] var1 = new int[class504.field6287.field3445];
        int var2 = 0;
        if (arg0 != -49) {
            field4335 = -2;
        }
        for (int var3 = 0; var3 < class504.field6287.field3445; var3++) {
            class68 var5 = class504.field6287.method1628(var3, (byte) -98);
            if (var5.field831 >= 0 || var5.field859 >= 0) {
                var1[var2++] = var3;
            }
        }
        class176.field2067 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class176.field2067[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lnba;I)I", line = 70)
    public static final int method1948(class278 arg0, int arg1) {
        if (arg1 != -29319) {
            field4335 = 73;
        }
        field4332++;
        if (class472.field5838 == arg0) {
            return 9216;
        } else if (class449.field5650 == arg0) {
            return 34065;
        } else if (class319.field3989 == arg0) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)I", line = 93)
    public static final int method1949(int arg0, int arg1, int arg2) {
        field4330++;
        if (arg2 < 69) {
            return 106;
        } else if (arg1 == 4 || arg1 == 5) {
            return class439.field5530[arg0 & 0x3];
        } else {
            return 256;
        }
    }
}
