import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class274 extends class529 {

    @OriginalMember(owner = "client!ro", name = "J", descriptor = "[I")
    public static int[] field3465 = new int[2048];

    @OriginalMember(owner = "client!ro", name = "E", descriptor = "Lsga;")
    public static class583 field3460 = new class583(4);

    @OriginalMember(owner = "client!ro", name = "N", descriptor = "I")
    public static int field3468 = 0;

    @OriginalMember(owner = "client!ro", name = "M", descriptor = "[I")
    public static int[] field3467 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!ro", name = "Q", descriptor = "B")
    public static byte field3471;

    @OriginalMember(owner = "client!ro", name = "D", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!ro", name = "F", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ro", name = "G", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!ro", name = "H", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!ro", name = "I", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!ro", name = "L", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!ro", name = "O", descriptor = "Lvm;")
    public static class208 field3469;

    @OriginalMember(owner = "client!ro", name = "P", descriptor = "Lkha;")
    public static class687 field3470;

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V", line = 3)
    public class274() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 9)
    public static final boolean method1640(byte arg0, String arg1) {
        ++field3463;
        return arg0 >= -102 ? true : class682.field9334.containsKey(arg1);
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(III)Z", line = 20)
    public static final boolean method1641(int arg0, int arg1, int arg2) {
        if (arg1 != -12345) {
            return false;
        } else {
            ++field3464;
            return (384 & arg2) != 0;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILlea;IIBLqg;ILdv;)V", line = 31)
    public static final void method1642(int arg0, class546 arg1, int arg2, int arg3, byte arg4, class290 arg5, int arg6, class124 arg7) {
        if (arg4 > -105) {
            field3466 = 119;
        }
        ++field3459;
        class389 var8 = new class389();
        var8.field5416 = arg2 << 9;
        var8.field5432 = arg3;
        var8.field5409 = arg0 << 9;
        if (arg5 == null) {
            if (arg7 != null) {
                var8.field5428 = arg7;
                class155 var9 = arg7.field1486;
                if (var9.field1929 != null) {
                    var8.field5420 = true;
                    var9 = var9.method968((byte) -76, class461.field6637);
                }
                if (var9 != null) {
                    var8.field5427 = arg2 - -var9.field1928 << 9;
                    var8.field5431 = var9.field1928 + arg0 << 9;
                    var8.field5425 = class519.method2982(arg7, -1);
                    var8.field5402 = var9.field1965 << 9;
                    var8.field5417 = var9.field1904;
                    var8.field5401 = var9.field1916;
                    var8.field5403 = var9.field1956;
                    var8.field5415 = var9.field1930;
                }
                class204.field2596.method3110(var8, 1);
                return;
            }
            if (arg1 != null) {
                var8.field5408 = arg1;
                var8.field5431 = arg1.method253((byte) -27) + arg0 << 9;
                var8.field5427 = arg2 + arg1.method253((byte) -27) << 9;
                var8.field5425 = class62.method478(arg1, -1);
                var8.field5417 = arg1.field7699;
                var8.field5402 = arg1.field7676 << 9;
                var8.field5415 = 256;
                var8.field5403 = arg1.field7672;
                var8.field5401 = 256;
                class297.field3854.method3249((long) arg1.field354, var8, (byte) -97);
                return;
            }
        } else {
            var8.field5426 = arg5;
            int var10 = arg5.field3724;
            int var11 = arg5.field3762;
            if (arg6 == 1 || arg6 == 3) {
                var10 = arg5.field3762;
                var11 = arg5.field3724;
            }
            var8.field5427 = arg2 + var11 << 9;
            var8.field5405 = arg5.field3709;
            var8.field5402 = arg5.field3704 << 9;
            var8.field5403 = arg5.field3717;
            var8.field5415 = arg5.field3697;
            var8.field5422 = arg5.field3683;
            var8.field5417 = arg5.field3729;
            var8.field5431 = arg0 - -var10 << 9;
            var8.field5401 = arg5.field3731;
            var8.field5407 = arg5.field3756;
            var8.field5414 = arg5.field3725;
            var8.field5425 = arg5.field3750;
            if (arg5.field3685 != null) {
                var8.field5420 = true;
                var8.method2322(102);
            }
            if (var8.field5422 != null) {
                var8.field5424 = (int) (Math.random() * (double) (var8.field5405 - var8.field5407)) + var8.field5407;
            }
            class326.field4157.method3110(var8, 1);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIB)I", line = 142)
    private final int method1643(int arg0, int arg1, byte arg2) {
        ++field3462;
        int var4 = arg0 - -(arg1 * 57);
        if (arg2 != -67) {
            method1644((byte) 51);
        }
        int var5 = var4 << 1 ^ var4;
        return 4096 - (Integer.MAX_VALUE & (var5 * 15731 * var5 - -789221) * var5 - -1376312589) / 262144;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IB)[I", line = 157)
    public final int[] method191(int arg0, byte arg1) {
        ++field3461;
        int[] var3 = super.field7456.method1635(arg0, -58);
        if (super.field7456.field3449) {
            int var4 = class310.field3960[arg0];
            for (int var5 = 0; var5 < class304.field3909; ++var5) {
                var3[var5] = this.method1643(class225.field2973[var5], var4, (byte) -67) % 4096;
            }
        }
        int var6 = 66 / ((arg1 - 27) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "(B)V", line = 189)
    public static void method1644(byte arg0) {
        field3469 = null;
        field3465 = null;
        field3467 = null;
        field3470 = null;
        field3460 = null;
        if (arg0 != -9) {
            field3465 = null;
        }
    }
}
