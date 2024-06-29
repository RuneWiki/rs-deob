import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class684 extends class299 {

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    private int field9630;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
    private int field9641;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
    private int field9642;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "I")
    private int field9635;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
    private int field9640;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
    private int field9633;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "I")
    private int field9637;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
    private int field9639;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "Lcq;")
    public static class110 field9638 = new class110(62, -2);

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field9629;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field9631;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field9632;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
    public static int field9636;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "I")
    public static int field9644;

    @OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
    public static int field9646;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "Lvea;")
    public static class408 field9643;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "[I")
    public static int[] field9645;

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "[I")
    public static int[] field9647;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method3787(boolean arg0, Object arg1, int arg2) {
        ++field9632;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class556.method3152(var3, (byte) -29) : var3;
        } else if (arg1 instanceof class277) {
            class277 var4 = (class277) arg1;
            return var4.method1620((byte) 126);
        } else {
            if (arg2 <= 65) {
                field9638 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)V")
    public final void method1481(int arg0, int arg1, int arg2) {
        ++field9636;
        int var4 = this.field9640 * arg2 >> 12;
        int var5 = this.field9630 * arg1 >> 12;
        int var6 = this.field9637 * arg2 >> 12;
        int var7 = this.field9639 * arg1 >> 12;
        int var8 = this.field9642 * arg2 >> 12;
        if (arg0 == 0) {
            int var9 = this.field9635 * arg1 >> 12;
            int var10 = this.field9633 * arg2 >> 12;
            int var11 = this.field9641 * arg1 >> 12;
            class68.method358(var5, var7, false, var9, var11, var4, super.field3725, var6, var10, var8);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BII)V")
    public final void method1477(byte arg0, int arg1, int arg2) {
        ++field9629;
        if (arg0 >= -118) {
            this.field9642 = 31;
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(III)V")
    public final void method1480(int arg0, int arg1, int arg2) {
        if (arg0 != 4096) {
            method3790(-28);
        }
        ++field9631;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BII[FFIIIIIF)V")
    public static final void method3788(byte arg0, int arg1, int arg2, float[] arg3, float arg4, int arg5, int arg6, int arg7, int arg8, int arg9, float arg10) {
        int var11 = arg2 - arg7;
        ++field9634;
        int var12 = arg6 - arg9;
        if (arg0 != -91) {
            field9645 = null;
        }
        int var13 = arg1 - arg8;
        float var14 = arg3[2] * (float) var13 + arg3[1] * (float) var11 + arg3[0] * (float) var12;
        float var15 = arg3[5] * (float) var13 + arg3[4] * (float) var11 + arg3[3] * (float) var12;
        float var16 = arg3[8] * (float) var13 + arg3[7] * (float) var11 + arg3[6] * (float) var12;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg4 != 1.0F) {
            var17 = arg4 * var17;
        }
        float var18 = var15 + 0.5F + arg10;
        if (arg5 != 1) {
            if (arg5 != 2) {
                if (arg5 == 3) {
                    float var19 = var17;
                    var17 = var18;
                    var18 = -var19;
                }
            } else {
                var18 = -var18;
                var17 = -var17;
            }
        } else {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        }
        class465.field6644 = var18;
        class353.field4755 = var17;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class684(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field9630 = arg1;
        this.field9641 = arg7;
        this.field9642 = arg4;
        this.field9635 = arg5;
        this.field9640 = arg0;
        this.field9633 = arg6;
        this.field9637 = arg2;
        this.field9639 = arg3;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIII)I")
    public static final int method3789(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -22054) {
            return -68;
        } else {
            ++field9644;
            if (arg3 > 243) {
                arg0 >>= 4;
            } else if (arg3 > 217) {
                arg0 >>= 3;
            } else if (arg3 > 192) {
                arg0 >>= 2;
            } else if (~arg3 < -180) {
                arg0 >>= 1;
            }
            return (arg0 >> 5 << 7) + (((255 & arg1) >> 2 << 10) - -(arg3 >> 1));
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
    public static void method3790(int arg0) {
        field9643 = null;
        field9645 = null;
        field9647 = null;
        field9638 = null;
        if (arg0 <= 45) {
            method3789(-58, -110, 15, -95);
        }
    }
}
