import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class671 extends class349 {

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    public static int field9522;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field9523;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field9524;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    public static int field9525;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "[I")
    public static int[] field9526;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        int var3 = -37 % ((56 - arg0) / 41);
        ++field9525;
        int[] var4 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            int[] var5 = this.method2181(0, -1090477337, arg1);
            for (int var6 = 0; class39.field497 > var6; ++var6) {
                var4[var6] = -var5[var6] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method9(int arg0, byte arg1) {
        ++field9522;
        int[][] var3 = super.field5103.method2268(true, arg0);
        int var4 = 6 % ((-32 - arg1) / 47);
        if (super.field5103.field5314) {
            int[][] var5 = this.method2180(0, 113, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~class39.field497 < ~var12; ++var12) {
                var9[var12] = -var6[var12] + 4096;
                var10[var12] = -var7[var12] + 4096;
                var11[var12] = -var8[var12] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg0 != 4095) {
            this.method9(37, (byte) 9);
        }
        if (arg1 == 0) {
            super.field5100 = ~arg2.method957((byte) -118) == -2;
        }
        ++field9524;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class671() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V")
    public static void method3716(int arg0) {
        if (arg0 != 1) {
            field9526 = null;
        }
        field9526 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILoa;Le;III)V")
    public static final void method3717(int arg0, int arg1, class689 arg2, class479 arg3, int arg4, int arg5, int arg6) {
        if (class143.field1820 < 100) {
            class456.method2582((byte) -107, arg2, arg3);
        }
        ++field9523;
        arg2.method1908(arg0, arg6, arg0 + arg1, arg5 + arg6);
        if (~class143.field1820 > -101) {
            byte var7 = 20;
            int var8 = arg1 / 2 + arg0;
            arg2.method1926(arg0, arg6, arg1, arg5, -16777216, 0);
            int var9 = -var7 + arg6 - (-(arg5 / 2) - -18);
            arg2.method1975(var8 - 152, var9, 304, 34, class401.field5694[class138.field1716].getRGB(), 0);
            arg2.method1926(var8 - 150, var9 + 2, class143.field1820 * 3, 30, class140.field1788[class138.field1716].getRGB(), 0);
            class622.field8452.method1802(var8, -1, class243.field3229.method1491(class350.field5121, (byte) 126), var9 - -var7, class644.field9132[class138.field1716].getRGB(), -28812);
        } else {
            int var10 = class52.field677 - (int) ((float) arg1 / class561.field7651);
            int var11 = class351.field5122 - -((int) ((float) arg5 / class561.field7651));
            int var12 = (int) ((float) arg1 / class561.field7651) + class52.field677;
            int var13 = -((int) ((float) arg5 / class561.field7651)) + class351.field5122;
            class327.field4754 = (int) ((float) (arg1 * 2) / class561.field7651);
            class564.field7725 = (int) ((float) (arg5 * 2) / class561.field7651);
            class407.field5736 = -((int) ((float) arg5 / class561.field7651)) + class351.field5122;
            class520.field7207 = class52.field677 - (int) ((float) arg1 / class561.field7651);
            class561.method3152(class561.field7661 + var10, class561.field7675 + var11, class561.field7661 + var12, class561.field7675 + var13, arg0, arg6, arg0 - -arg1, arg5 + 1 + arg6);
            class561.method3162(arg2);
            class59 var14 = class561.method3150(arg2);
            class690.method3820(arg2, 0, arg4 + -4097, var14, 0);
            if (arg4 != 4096) {
                method3717(95, -98, (class689) null, (class479) null, 79, -99, 75);
            }
            if (~class235.field3067 < -1) {
                --class514.field7002;
                if (class514.field7002 == 0) {
                    --class235.field3067;
                    class514.field7002 = 20;
                }
            }
            if (class150.field1885) {
                int var15 = arg0 - -arg1 + -5;
                int var16 = arg5 + arg6 + -8;
                class395.field5658.method1803("Fps:" + class59.field826, -1, var16, var15, (byte) 127, 16776960);
                int var20 = var16 - 15;
                Runtime var17 = Runtime.getRuntime();
                int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
                int var19 = 16776960;
                if (~var18 < -65537) {
                    var19 = 16711680;
                }
                class395.field5658.method1803("Mem:" + var18 + "k", -1, var20, var15, (byte) -59, var19);
                var16 = var20 - 15;
            }
        }
    }
}
