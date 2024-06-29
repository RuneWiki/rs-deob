import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class239 extends class314 {

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    public static int field3785 = 0;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "Lpca;")
    public static class665 field3780 = null;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "Z")
    public static boolean field3789 = false;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "J")
    public static long field3783 = -1L;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "F")
    public static float field3778;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    private int field3779;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    private int field3782;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    private int field3787;

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "[I")
    public static int[] field3788;

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
    public class239() {
        this(0);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(JJ)J")
    public static long method1718(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V")
    public static void method1719(byte arg0) {
        if (arg0 != -67) {
            method1719((byte) 82);
        }
        field3780 = null;
        field3788 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method4(int arg0, byte arg1) {
        ++field3784;
        if (arg1 <= 68) {
            return null;
        } else {
            int[][] var3 = super.field4931.method1345(arg0, 0);
            if (super.field4931.field2799) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~var7 > ~class81.field1009; ++var7) {
                    var4[var7] = this.field3779;
                    var5[var7] = this.field3782;
                    var6[var7] = this.field3787;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLie;I)V")
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (arg0 >= -1) {
            method1719((byte) 0);
        }
        ++field3786;
        if (arg2 == 0) {
            this.method1720(arg1.method86(-83), -1);
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)V")
    private final void method1720(int arg0, int arg1) {
        ++field3790;
        this.field3779 = arg0 >> 12 & 4080;
        this.field3787 = 4080 & arg0 << 4;
        if (arg1 != -1) {
            field3780 = null;
        }
        this.field3782 = (arg0 & 65280) >> 4;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I)V")
    private class239(int arg0) {
        super(0, false);
        this.method1720(arg0, -1);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIII)V")
    public static final void method1721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3781;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg2 * arg2;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = -((arg1 + var12) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class367.method2427(3803, arg0, arg5 - -arg2, class39.field527[arg3], arg5 - arg2);
        int var20 = (arg4 + -1) * var15;
        while (~var7 < -1) {
            if (~var13 > -1) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    var17 += var16;
                    ++var6;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                ++var6;
            }
            var13 += -var20;
            var14 += -var18;
            --var7;
            var20 -= var15;
            var18 -= var15;
            int var21 = -var7 + arg3;
            int var22 = arg3 - -var7;
            int var23 = arg5 - -var6;
            int var24 = -var6 + arg5;
            class367.method2427(3803, arg0, var23, class39.field527[var21], var24);
            class367.method2427(3803, arg0, var23, class39.field527[var22], var24);
        }
    }
}
