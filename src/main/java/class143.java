import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class143 extends class89 {

    @OriginalMember(owner = "client!a", name = "V", descriptor = "I")
    public static int field2607 = 0;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!a", name = "W", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        ++field2603;
        int[] var3 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            int[] var4 = this.method685(-109, arg0, 0);
            for (int var5 = 0; class241.field4284 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        int var6 = 9 / ((51 - arg1) / 44);
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            super.field1683 = ~arg0.method558(arg1 ^ -641641491) == -2;
        }
        if (arg1 == -641641492) {
            ++field2604;
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
    public static final void method1074(int arg0) {
        ++field2608;
        int var1 = class109.field2062;
        int var2 = class187.field3345;
        int var3 = 6116423;
        if (arg0 >= -26) {
            field2607 = -21;
        }
        int var4 = class248.field4378;
        int var5 = class270.field4707;
        class262.method1762(var2, var1, var4, var5, var3);
        class262.method1762(var2 - -1, var1 + 1, var4 - 2, 16, 0);
        class262.method1769(var2 + 1, var1 - -18, var4 + -2, var5 + -19, 0);
        class190.field3384.method148(class196.field3506, var2 - -3, var1 + 14, var3, -1);
        int var6 = class7.field116;
        int var7 = class208.field3735;
        for (int var8 = 0; var8 < class242.field4290; ++var8) {
            int var9 = 16777215;
            int var10 = (class242.field4290 + -1 + -var8) * 15 + var1 + 31;
            if (~var2 > ~var6 && ~(var2 + var4) < ~var6 && var10 + -13 < var7 && ~(var10 + 3) < ~var7) {
                var9 = 16776960;
            }
            class190.field3384.method148(class155.method1147((byte) 105, var8), var2 + 3, var10, var9, 0);
        }
        class76.method606(class187.field3345, class109.field2062, class270.field4707, class248.field4378, (byte) -117);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class143() {
        super(1, false);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        if (arg1 != 25) {
            field2607 = 52;
        }
        ++field2606;
        int[][] var3 = super.field1695.method843((byte) -25, arg0);
        if (super.field1695.field2028) {
            int[][] var4 = this.method689((byte) 95, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class241.field4284 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }
}
