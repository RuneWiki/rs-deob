import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class412 extends class646 {

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "Z")
    private boolean field5877 = true;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    private int field5876 = 4096;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "[Z")
    public static boolean[] field5874 = new boolean[200];

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "Z")
    public static boolean field5868 = true;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "[I")
    public static int[] field5871 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIBII)V")
    public static final void method2457(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field5875;
        if (arg2 <= 92) {
            method2458(-77);
        }
        class449 var5 = class611.method3463(arg0, (byte) -125, 10);
        var5.method2615((byte) -107);
        var5.field6479 = arg4;
        var5.field6480 = arg1;
        var5.field6472 = arg3;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V")
    public static void method2458(int arg0) {
        if (arg0 == 0) {
            field5874 = null;
            field5871 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[[I")
    public final int[][] method298(int arg0, int arg1) {
        if (arg0 != -12424) {
            this.method295((class465) null, -115, (byte) -60);
        }
        ++field5869;
        int[][] var3 = super.field9164.method1002(80, arg1);
        if (super.field9164.field2082) {
            int[] var4 = this.method3628(false, 0, arg1 + -1 & class453.field6525);
            int[] var5 = this.method3628(false, 0, arg1);
            int[] var6 = this.method3628(false, 0, arg1 + 1 & class453.field6525);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class89.field1330; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field5876;
                int var12 = (var5[class156.field2572 & var10 - -1] + -var5[class156.field2572 & var10 - 1]) * this.field5876;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + 4096 - -var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = 16777216 / var17;
                    var19 = var12 / var17;
                    var18 = var11 / var17;
                }
                if (this.field5877) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lek;IB)V")
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field5872;
        if (arg2 > 7) {
            if (~arg1 != -1) {
                if (arg1 == 1) {
                    this.field5877 = ~arg0.method2705(-21) == -2;
                }
            } else {
                this.field5876 = arg0.method2755((byte) -111);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)I")
    public static final int method2459(int arg0, int arg1) {
        ++field5878;
        int var2 = 57 % ((-2 - arg1) / 62);
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZI)V")
    public static final void method2460(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method2461((byte) -2, -75);
        }
        ++field5873;
        class449 var3 = class611.method3463(arg0, (byte) -112, 16);
        var3.method2615((byte) -89);
        var3.field6472 = arg2;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class412() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)I")
    public static final int method2461(byte arg0, int arg1) {
        ++field5870;
        if (arg0 <= 13) {
            field5871 = null;
        }
        return arg1 == 16711935 ? -1 : class70.method575((byte) 55, arg1);
    }
}
