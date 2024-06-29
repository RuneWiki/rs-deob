import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class221 extends class192 {

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "[I")
    public static int[] field2895;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLtc;)V")
    public static final void method1402(byte arg0, class477 arg1) {
        ++field2893;
        if (class499.field6560) {
            ++class30.field454;
            if (arg1.field6280 != null) {
                class477 var2 = class386.method2203(class634.field8832, 0, class34.field499);
                if (var2 != null) {
                    class155 var3 = new class155();
                    var3.field1968 = arg1;
                    var3.field1962 = arg1.field6280;
                    var3.field1967 = var2;
                    class709.method3885(var3);
                }
            }
            class11 var4 = class130.method931(class649.field9035, (byte) 54, class136.field1792);
            var4.field114.method2353(arg1.field6234, (byte) -36);
            var4.field114.method2386(arg1.field6221, 1103587288);
            var4.field114.method2414(false, class34.field499);
            var4.field114.method2385(class467.field6103, -1540);
            var4.field114.method2416(class634.field8832, 127);
            var4.field114.method2385(arg1.field6321, -1540);
            class100.method760(var4, 83);
            if (arg0 <= 2) {
                field2895 = null;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(B)V")
    public static void method1403(byte arg0) {
        if (arg0 == -41) {
            field2895 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(IBI)V")
    private final void method1404(int arg0, byte arg1, int arg2) {
        if (arg1 > -11) {
            field2895 = null;
        }
        ++field2898;
        int var4 = class183.field2359[arg0];
        int var5 = field2895[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class141.field1861 = arg0;
            class345.field4407 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class141.field1861 = arg2;
            class345.field4407 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class141.field1861 = class561.field7319 - arg2;
            class345.field4407 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class141.field1861 = arg0;
            class345.field4407 = -arg2 + class505.field6643;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class141.field1861 = -arg0 + class561.field7319;
            class345.field4407 = -arg2 + class505.field6643;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class141.field1861 = -arg2 + class561.field7319;
            class345.field4407 = class505.field6643 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class141.field1861 = arg2;
            class345.field4407 = -arg0 + class505.field6643;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class141.field1861 = -arg0 + class561.field7319;
            class345.field4407 = arg2;
        }
        class345.field4407 &= class95.field1247;
        class141.field1861 &= class337.field4356;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class221() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        ++field2896;
        if (arg1 >= -123) {
            field2895 = null;
        }
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (super.field2448.field7266) {
            for (int var4 = 0; var4 < class561.field7319; ++var4) {
                this.method1404(var4, (byte) -75, arg0);
                int[] var5 = this.method1253(0, class345.field4407, 0);
                var3[var4] = var5[class141.field1861];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(B)I")
    public static final int method1405(byte arg0) {
        ++field2894;
        int var1 = class266.field3564.method2595(19);
        if (var1 < class94.field1239.length + -1) {
            class266.field3564 = class94.field1239[var1 + 1];
        }
        return arg0 < 47 ? 65 : 100;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILfd;I)V")
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (arg2 != -12160) {
            this.method1404(56, (byte) 64, 21);
        }
        ++field2890;
        if (~arg0 == -1) {
            super.field2449 = arg1.method2396(-21) == 1;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILtc;)Ltc;")
    public static final class477 method1406(int arg0, class477 arg1) {
        if (arg0 > -55) {
            field2897 = -118;
        }
        ++field2891;
        if (~arg1.field6292 != 0) {
            return class600.method3268(122, arg1.field6292);
        } else {
            int var2 = arg1.field6234 >>> 16;
            class45 var3 = new class45(class700.field9763);
            for (class270 var4 = (class270) var3.method420(0); var4 != null; var4 = (class270) var3.method421(113)) {
                if (~var4.field3588 == ~var2) {
                    return class600.method3268(109, (int) var4.field5499);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(IB)[[I")
    public final int[][] method107(int arg0, byte arg1) {
        ++field2892;
        int[][] var3 = super.field2467.method2466(arg0, 0);
        int var4 = -28 % ((arg1 - -14) / 34);
        if (super.field2467.field5565) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class561.field7319 < ~var8; ++var8) {
                this.method1404(var8, (byte) -71, arg0);
                int[][] var9 = this.method1251(0, class345.field4407, (byte) -114);
                var5[var8] = var9[0][class141.field1861];
                var6[var8] = var9[1][class141.field1861];
                var7[var8] = var9[2][class141.field1861];
            }
        }
        return var3;
    }
}
