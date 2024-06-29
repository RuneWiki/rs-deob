import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class188 extends class326 {

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    private int field2575 = 4096;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "Lh;")
    public static class434 field2574 = new class434(58, 0);

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "[S")
    public static short[] field2577;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
    public static void method1082(byte arg0) {
        field2574 = null;
        field2577 = null;
        if (arg0 != -17) {
            field2577 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class188() {
        super(1, true);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 >= -6) {
            return null;
        } else {
            ++field2570;
            int[] var3 = super.field4344.method130(arg1, 39);
            if (super.field4344.field286) {
                int[] var4 = this.method1824(0, false, class266.field3509 & arg1 + -1);
                int[] var5 = this.method1824(0, false, arg1);
                int[] var6 = this.method1824(0, false, class266.field3509 & arg1 - -1);
                for (int var7 = 0; var7 < class181.field2495; ++var7) {
                    int var8 = (var6[var7] + -var4[var7]) * this.field2575;
                    int var9 = (var5[class459.field6226 & var7 + 1] + -var5[class459.field6226 & var7 + -1]) * this.field2575;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)));
                    int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBI)I")
    public static final int method1083(int arg0, byte arg1, int arg2) {
        int var3 = 56 / ((arg1 - 16) / 33);
        ++field2573;
        int var4 = 1;
        while (~arg0 < -2) {
            if ((arg0 & 1) != 0) {
                var4 = arg2 * var4;
            }
            arg0 >>= 1;
            arg2 *= arg2;
        }
        if (~arg0 == -2) {
            return arg2 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILbt;I)V")
    public final void method33(int arg0, class32 arg1, int arg2) {
        ++field2571;
        if (arg0 == 0) {
            this.field2575 = arg1.method215((byte) 119);
        }
        if (arg2 > -3) {
            method1085(-64, -96, -106);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V")
    public static final void method1084(int arg0, int arg1) {
        if (arg0 != 6143) {
            field2576 = 1;
        }
        class304.field4046 = arg1;
        ++field2572;
        class338.field4547.method495(-112);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(III)I")
    public static final int method1085(int arg0, int arg1, int arg2) {
        ++field2579;
        return arg1 != arg2 && ~arg1 != -4 ? class308.field4075[arg0 & 3] : class274.field3634[3 & arg0];
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1086(int arg0, int arg1, String arg2) {
        ++field2578;
        class106 var3 = class250.method1400(2, 103, arg1);
        if (arg0 == 1) {
            var3.method658(0);
            var3.field1583 = arg2;
        }
    }
}
