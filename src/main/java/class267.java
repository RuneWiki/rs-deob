import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class267 extends class377 {

    @OriginalMember(owner = "client!ao", name = "E", descriptor = "I")
    private int field3376 = 32768;

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "[Z")
    public static boolean[] field3373 = new boolean[200];

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "I")
    public static int field3377 = 0;

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!ao", name = "D", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method88(int arg0, int arg1) {
        ++field3374;
        int[] var3 = super.field4842.method2772(arg0, (byte) -121);
        if (super.field4842.field6354) {
            int[] var4 = this.method2174(1, arg0, (byte) 60);
            int[] var5 = this.method2174(2, arg0, (byte) -127);
            for (int var6 = 0; class528.field6661 > var6; ++var6) {
                int var7 = (var4[var6] & 4086) >> 4;
                int var8 = var5[var6] * this.field3376 >> 12;
                int var9 = class618.field8383[var7] * var8 >> 12;
                int var10 = class595.field7986[var7] * var8 >> 12;
                int var11 = var6 - -(var9 >> 12) & class376.field4836;
                int var12 = class251.field3236 & arg0 - -(var10 >> 12);
                int[] var13 = this.method2174(0, var12, (byte) -119);
                var3[var6] = var13[var11];
            }
        }
        int var14 = -82 % ((arg1 - 5) / 53);
        return var3;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V", line = 53)
    public final void method91(byte arg0) {
        if (arg0 < 52) {
            this.method27(122, 104, (class572) null);
        }
        class430.method2367(-10177);
        ++field3372;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILji;)V", line = 66)
    public final void method27(int arg0, int arg1, class572 arg2) {
        int var4 = 45 % ((13 - arg1) / 55);
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field4853 = ~arg2.method3097((byte) 12) == -2;
            }
        } else {
            this.field3376 = arg2.method3031(-1) << 4;
        }
        ++field3378;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V", line = 110)
    public class267() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)V", line = 117)
    public static void method1586(int arg0) {
        if (arg0 != 27954) {
            field3373 = null;
        }
        field3373 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)[[I", line = 130)
    public final int[][] method23(int arg0, byte arg1) {
        ++field3379;
        int var3 = -45 / ((31 - arg1) / 42);
        int[][] var4 = super.field4850.method2566(-27346, arg0);
        if (super.field4850.field5843) {
            int[] var5 = this.method2174(1, arg0, (byte) -119);
            int[] var6 = this.method2174(2, arg0, (byte) -126);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            for (int var10 = 0; var10 < class528.field6661; ++var10) {
                int var11 = (var5[var10] * 255 & 1046179) >> 12;
                int var12 = var6[var10] * this.field3376 >> 12;
                int var13 = class618.field8383[var11] * var12 >> 12;
                int var14 = class595.field7986[var11] * var12 >> 12;
                int var15 = (var13 >> 12) + var10 & class376.field4836;
                int var16 = arg0 - -(var14 >> 12) & class251.field3236;
                int[][] var17 = this.method2173(1, var16, 0);
                var7[var10] = var17[0][var15];
                var8[var10] = var17[1][var15];
                var9[var10] = var17[2][var15];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BILpfa;)Lub;", line = 186)
    public static final class20 method1587(byte arg0, int arg1, class275 arg2) {
        ++field3375;
        if (arg0 != -124) {
            field3373 = null;
        }
        byte[] var3 = arg2.method1648(arg0 + 76, arg1);
        return var3 == null ? null : new class20(var3);
    }
}
