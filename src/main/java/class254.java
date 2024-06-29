import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class254 {

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public int field3324;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public int field3327;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public int field3328;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public int field3322;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3326 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "Ltt;")
    public static class338 field3329 = new class338(61, 8);

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "Lsj;")
    public static class666 field3330 = new class666();

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "J")
    public static long field3331 = -1L;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "Laga;")
    public static class658 field3332;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1536(boolean arg0) {
        field3332 = null;
        field3329 = null;
        field3330 = null;
        if (arg0) {
            field3329 = null;
        }
        field3326 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V", line = 21)
    public static final void method1537(byte arg0) {
        field3325++;
        int var1 = class602.field8408.method3567(class618.field8566, (byte) -98);
        if (var1 == 0) {
            class614.field8511 = null;
            class390.method2252(-1, 0);
        } else if (var1 == 1) {
            class308.method1814((byte) 0, 1);
            class390.method2252(-1, 512);
            if (class31.field440 != null) {
                class311.method1830((byte) -85);
            }
        } else {
            class308.method1814((byte) (class647.field8940 - 4 & 0xFF), 1);
            class390.method2252(-1, 2);
        }
        int var2 = -86 % ((62 - arg0) / 38);
        class250.field3297 = class298.field3942;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIB)I", line = 54)
    public static final int method1538(int arg0, int arg1, byte arg2) {
        field3323++;
        int var3 = arg0 * 57 + arg1;
        if (arg2 >= -26) {
            field3326 = null;
        }
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)Lvr;", line = 78)
    public final class254 method1539(int arg0, int arg1) {
        field3321++;
        return arg0 > -103 ? null : new class254(this.field3322, arg1, this.field3324, this.field3328);
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(IIII)V", line = 88)
    public class254(int arg0, int arg1, int arg2, int arg3) {
        this.field3324 = arg2;
        this.field3327 = arg1;
        this.field3328 = arg3;
        this.field3322 = arg0;
    }
}
