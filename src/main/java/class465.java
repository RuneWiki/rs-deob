import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class465 extends class11 {

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
    private int field6825 = 32768;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "Lkl;")
    public static class55 field6829 = new class55(13, 0, 1, 0);

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(II)[I", line = 4)
    public final int[] method44(int arg0, int arg1) {
        ++field6824;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (arg0 > -42) {
            field6829 = null;
        }
        if (super.field158.field2966) {
            int[] var4 = this.method48(arg1, 1, (byte) -41);
            int[] var5 = this.method48(arg1, 2, (byte) -72);
            for (int var6 = 0; ~var6 > ~class90.field1316; ++var6) {
                int var7 = (var4[var6] & 4091) >> 4;
                int var8 = var5[var6] * this.field6825 >> 12;
                int var9 = class150.field2284[var7] * var8 >> 12;
                int var10 = class132.field1928[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class99.field1490;
                int var12 = arg1 - -(var10 >> 12) & class183.field2683;
                int[] var13 = this.method48(var12, 0, (byte) -94);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[[I", line = 56)
    public final int[][] method41(int arg0, int arg1) {
        ++field6826;
        int[][] var3 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int[] var4 = this.method48(arg1, 1, (byte) -86);
            int[] var5 = this.method48(arg1, 2, (byte) -77);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class90.field1316; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field6825 >> 12;
                int var12 = class150.field2284[var10] * var11 >> 12;
                int var13 = class132.field1928[var10] * var11 >> 12;
                int var14 = class99.field1490 & var9 - -(var12 >> 12);
                int var15 = class183.field2683 & (var13 >> 12) + arg1;
                int[][] var16 = this.method49(var15, 0, 108);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        int var17 = -9 % ((arg0 - -75) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V", line = 112)
    public class465() {
        super(3, false);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lsi;B)Lro;", line = 116)
    public static final class2 method2729(class391 arg0, byte arg1) {
        ++field6830;
        if (arg1 != -12) {
            method2729((class391) null, (byte) -87);
        }
        return new class2(arg0.method2311((byte) -119), arg0.method2311((byte) 127), arg0.method2311((byte) -46), arg0.method2311((byte) 126), arg0.method2338(true), arg0.method2338(true), arg0.method2348(arg1 + 10));
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V", line = 133)
    public static void method2730(int arg0) {
        field6829 = null;
        if (arg0 != 547404172) {
            field6831 = 95;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lsi;II)V", line = 143)
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field6827;
        if (arg1 <= -40) {
            if (~arg2 != -1) {
                if (~arg2 == -2) {
                    super.field167 = ~arg0.method2348(-2) == -2;
                }
            } else {
                this.field6825 = arg0.method2353((byte) 92) << 4;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V", line = 185)
    public final void method42(boolean arg0) {
        ++field6828;
        class144.method971((byte) 26);
        if (!arg0) {
            this.method42(false);
        }
    }
}
