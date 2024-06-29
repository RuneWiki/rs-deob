import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class413 extends class31 {

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public int field6008;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public int field6006;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "Lut;")
    public static class109 field6007 = new class109();

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "Leca;")
    public static class704 field6010 = new class704();

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "S")
    public static short field6012 = 32767;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)V", line = 5)
    public static void method2484(byte arg0) {
        int var1 = -123 / ((arg0 - 21) / 54);
        field6010 = null;
        field6007 = null;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lut;Lgi;IIIIIIIIII)V", line = 16)
    public class413(class109 arg0, class630 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field6008 = arg10;
        this.field6006 = arg11;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLjava/lang/String;ZJ)V", line = 30)
    public static final void method2485(boolean arg0, String arg1, boolean arg2, long arg3) {
        field6004++;
        if (arg2) {
            class7.method40((byte) -22);
            if (class103.field1615.equals("")) {
                class513.field7244 = 39;
                return;
            }
        }
        class695 var5 = new class695(576);
        var5.method3853((byte) 51, 10);
        var5.method3852(arg0, (int) (Math.random() * 65535.0D));
        var5.method3824(16384, arg3);
        var5.method3852(false, arg2 ? class697.field9865 : class40.field657);
        var5.method3837(4102, arg1);
        var5.method3824(16384, arg2 ? class328.field4855 : class254.field3901);
        if (arg2) {
            var5.method3824(16384, class273.method1801(class103.field1615, 123));
            try {
                var5.method3824(16384, Long.parseLong(class645.field9063));
            } catch (Exception var9) {
                class513.field7244 = 39;
                return;
            }
        } else {
            var5.method3868((int) (Math.random() * 9.9999999E7D), -318419336);
            var5.method3868((int) (Math.random() * 9.9999999E7D), -318419336);
            var5.method3868((int) (Math.random() * 9.9999999E7D), -318419336);
            var5.method3868((int) (Math.random() * 9.9999999E7D), -318419336);
        }
        var5.method3868((int) (Math.random() * 9.9999999E7D), -318419336);
        var5.method3823((byte) -119, class554.field7850, class668.field9445);
        class135 var6 = class262.method1721((byte) -20);
        var6.field1978.method3853((byte) 51, arg2 ? class370.field5292.field6777 : class370.field5289.field6777);
        int var7 = 1;
        if (class493.field7018 != null) {
            var7 += class493.field7018.length() + 1;
        }
        var6.field1978.method3852(arg0, var5.field9761 + var7 + 28);
        var6.field1978.method3852(false, 618);
        var6.field1978.method3853((byte) 51, class512.field7203);
        var6.field1978.method3853((byte) 51, class586.field8208.field9738);
        class436.method2596(4, var6.field1978);
        String var8 = arg2 ? class187.field2702 : class493.field7018;
        var6.field1978.method3853((byte) 51, var8 == null ? 0 : 1);
        if (var8 != null) {
            var6.field1978.method3837(4102, var8);
        }
        var6.field1978.method3857(7010, var5.field9761, var5.field9796, 0);
        class19.method223(var6, 0);
        class594.field8391 = 1;
        class513.field7244 = -3;
        class661.field9347 = 0;
        class619.field8637 = 0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)Lrw;", line = 109)
    public final class703 method351(byte arg0) {
        if (arg0 <= 73) {
            this.field6008 = 91;
        }
        field6009++;
        return class224.field3167;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(JI)V", line = 123)
    public static final void method2486(long arg0, int arg1) {
        field6005++;
        int var3 = class633.field8937 + class648.field9106.field3024;
        int var4 = class239.field3735 + class648.field9106.field3029;
        if (class391.field5796 - var3 < -2000 || class391.field5796 - var3 > 2000 || class564.field7963 - var4 < -2000 || (class564.field7963 - var4) > 2000) {
            class391.field5796 = var3;
            class564.field7963 = var4;
        }
        if (class391.field5796 != var3) {
            int var5 = var3 - class391.field5796;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class391.field5796 += var6;
        }
        if (arg1 != -8327) {
            method2484((byte) -33);
        }
        if (!class287.field4270.field3685) {
            class105.field1635 += (float) arg0 * class290.field4303 / 6.0F;
            class630.field8811 += (float) arg0 * class706.field9931 / 6.0F;
        }
        if (class564.field7963 != var4) {
            int var7 = var4 - class564.field7963;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class564.field7963 += var8;
        }
        class592.method3353(true);
    }
}
