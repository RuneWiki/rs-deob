import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class641 extends class5 {

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    private int field9029 = 4096;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    private int field9028 = 4096;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    private int field9034 = 4096;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "Lrf;")
    public static class112 field9035 = new class112("stellardawn", 1);

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field9030;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Llo;III)V", line = 6)
    public static final void method3582(class488 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class429.field5383) {
            class75 var4 = class270.field3423[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1031 != null && var4.field1031.method79((byte) -50)) {
                arg0.method77(true, class702.field9928, (byte) 14, class590.field8291, var4.field1031, 0, 0);
            }
        }
        if (arg3 < class429.field5383) {
            class75 var5 = class270.field3423[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1031 != null && var5.field1031.method79((byte) -95)) {
                arg0.method77(true, 0, (byte) -109, class590.field8291, var5.field1031, 0, class702.field9928);
            }
        }
        if (arg2 < class429.field5383 && arg3 < class37.field508) {
            class75 var6 = class270.field3423[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1031 != null && var6.field1031.method79((byte) -46)) {
                arg0.method77(true, class702.field9928, (byte) 32, class590.field8291, var6.field1031, 0, class702.field9928);
            }
        }
        if (arg2 < class429.field5383 && arg3 > 0) {
            class75 var7 = class270.field3423[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1031 != null && var7.field1031.method79((byte) -117)) {
                arg0.method77(true, class702.field9928, (byte) 34, class590.field8291, var7.field1031, 0, -class702.field9928);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V", line = 249)
    public class641() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)[[I", line = 60)
    public final int[][] method44(int arg0, boolean arg1) {
        ++field9032;
        int[][] var3 = super.field135.method2706(arg0, -71);
        if (super.field135.field6667) {
            int[][] var4 = this.method45(0, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class657.field9287 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field9028 * var12 >> 12;
                    var9[var11] = this.field9034 * var13 >> 12;
                    var10[var11] = this.field9029 * var14 >> 12;
                } else {
                    var8[var11] = this.field9028;
                    var9[var11] = this.field9034;
                    var10[var11] = this.field9029;
                }
            }
        }
        if (!arg1) {
            method3584(88);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 123)
    public static final void method3583(int arg0, byte arg1, String arg2) {
        class449.method2402(21074);
        ++field9030;
        class32.method214(-4);
        class71.method420(true);
        class602.method3303(arg0, false, arg2);
        class327.method1867(true);
        class608.method3321(8, class32.field452);
        class410.method2170(class32.field452, -27346);
        if (arg1 >= -122) {
            field9035 = null;
        }
        class111.method622(class631.field8846, class32.field452, 0);
        class27.method184(17381);
        class130.method687(true, class677.field9502);
        class544.method2941(0);
        class309.method1785((byte) 86);
        if (class504.field6675 == 3) {
            class361.method1987(4, 75);
        } else if (~class504.field6675 == -8) {
            class361.method1987(8, 44);
        } else if (class504.field6675 == 10) {
            class361.method1987(11, -116);
        } else {
            if (class504.field6675 == 1 || class504.field6675 == 2) {
                class9.method76((byte) 55);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "(I)V", line = 162)
    public static void method3584(int arg0) {
        if (arg0 >= -117) {
            field9035 = null;
        }
        field9035 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILes;I)V", line = 172)
    public final void method47(int arg0, class630 arg1, int arg2) {
        ++field9031;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field9029 = arg1.method3470(13111);
                }
            } else {
                this.field9034 = arg1.method3470(13111);
            }
        } else {
            this.field9028 = arg1.method3470(13111);
        }
        if (arg0 != 1) {
            this.field9028 = -122;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILnw;)I", line = 219)
    public static final int method3585(int arg0, class347 arg1) {
        ++field9033;
        if (class538.field7226 == arg1) {
            return 7681;
        } else if (class112.field1466 != arg1) {
            if (class542.field7243 == arg1) {
                return 34165;
            } else if (class88.field1235 == arg1) {
                return 260;
            } else if (class224.field2806 == arg1) {
                return 34023;
            } else {
                if (arg0 != 260) {
                    field9035 = null;
                }
                throw new IllegalArgumentException();
            }
        } else {
            return 8448;
        }
    }
}
