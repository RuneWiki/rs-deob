import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class588 extends class328 {

    @OriginalMember(owner = "client!lk", name = "S", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!lk", name = "V", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!lk", name = "W", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!lk", name = "X", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!lk", name = "Y", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!lk", name = "U", descriptor = "Lhu;")
    public static class133 field7676;

    @OriginalMember(owner = "client!lk", name = "T", descriptor = "[Ls;")
    public static class282[] field7675;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7674;
        class592.method3220((byte) 0, arg0);
        if (arg5 != 18177) {
            method3211(40);
        }
        int var7 = 0;
        int var8 = -arg4 + arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class690.field9616[arg3];
        int var16 = -var8 + arg2;
        class717.method4012(arg6, arg5 ^ -18291, -arg0 + arg2, var15, var16);
        int var17 = arg2 + var8;
        class717.method4012(arg1, -49, var16, var15, var17);
        class717.method4012(arg6, -77, var17, var15, arg0 + arg2);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && ~var11 <= -2) {
                class480.field6584[var11] = var7;
                --var11;
                var12 -= var11 << 1;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                if (var8 <= var9) {
                    int[] var18 = class690.field9616[arg3 + var9];
                    int[] var19 = class690.field9616[-var9 + arg3];
                    int var20 = arg2 + var7;
                    int var21 = -var7 + arg2;
                    class717.method4012(arg6, arg5 ^ -18264, var21, var18, var20);
                    class717.method4012(arg6, -61, var21, var19, var20);
                } else {
                    int[] var22 = class690.field9616[arg3 - -var9];
                    int[] var23 = class690.field9616[-var9 + arg3];
                    int var24 = class480.field6584[var9];
                    int var25 = arg2 + var7;
                    int var26 = arg2 - var7;
                    int var27 = arg2 - -var24;
                    int var28 = arg2 - var24;
                    class717.method4012(arg6, -59, var26, var22, var28);
                    class717.method4012(arg1, -72, var28, var22, var27);
                    class717.method4012(arg6, -121, var27, var22, var25);
                    class717.method4012(arg6, arg5 + -18239, var26, var23, var28);
                    class717.method4012(arg1, -77, var28, var23, var27);
                    class717.method4012(arg6, -73, var27, var23, var25);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class690.field9616[arg3 - -var7];
            int[] var30 = class690.field9616[arg3 - var7];
            int var31 = arg2 + var9;
            int var32 = -var9 + arg2;
            if (~var8 < ~var7) {
                int var33 = var11 < var7 ? class480.field6584[var7] : var11;
                int var34 = arg2 + var33;
                int var35 = -var33 + arg2;
                class717.method4012(arg6, arg5 ^ -18277, var32, var29, var35);
                class717.method4012(arg1, arg5 + -18253, var35, var29, var34);
                class717.method4012(arg6, -51, var34, var29, var31);
                class717.method4012(arg6, arg5 + -18268, var32, var30, var35);
                class717.method4012(arg1, -52, var35, var30, var34);
                class717.method4012(arg6, arg5 ^ -18257, var34, var30, var31);
            } else {
                class717.method4012(arg6, -76, var32, var29, var31);
                class717.method4012(arg6, -53, var32, var30, var31);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)V")
    public static void method3211(int arg0) {
        field7675 = null;
        if (arg0 != -1378707903) {
            method3212(61);
        }
        field7676 = null;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(IZ)[[I")
    public final int[][] method7(int arg0, boolean arg1) {
        ++field7677;
        if (!arg1) {
            this.method7(42, true);
        }
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (super.field7890.field9769 && this.method1983(65280)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field4686 * super.field4686;
            for (int var8 = 0; ~var8 > ~class171.field2624; ++var8) {
                int var9 = super.field4683[var8 % super.field4682 + var7];
                var6[var8] = class48.method346(255, var9) << 4;
                var5[var8] = class48.method346(var9 >> 4, 4080);
                var4[var8] = class48.method346(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "(I)V")
    public static final void method3212(int arg0) {
        class411.field5711.method1677(class411.field5711.field3908, (byte) -71, 1);
        ++field7679;
        class411.field5711.method1677(class411.field5711.field3890, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3882, (byte) -71, 2);
        class411.field5711.method1677(class411.field5711.field3888, (byte) -71, 2);
        class411.field5711.method1677(class411.field5711.field3904, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3900, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3879, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3869, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3918, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3868, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3897, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3902, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3915, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3884, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3895, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3912, (byte) -71, arg0);
        class411.field5711.method1677(class411.field5711.field3911, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3891, (byte) -71, 0);
        class411.field5711.method1677(class411.field5711.field3876, (byte) -71, 0);
        class371.method2179(8583);
        class411.field5711.method1677(class411.field5711.field3874, (byte) -71, 1);
        class411.field5711.method1677(class411.field5711.field3903, (byte) -71, 3);
        class505.method2837((byte) 126);
        class320.method1940(1);
        class50.field641 = true;
    }
}
