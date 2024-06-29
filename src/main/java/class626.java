import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class626 extends class297 {

    @OriginalMember(owner = "client!es", name = "Q", descriptor = "Ltt;")
    public static class338 field8671 = new class338(38, 7);

    @OriginalMember(owner = "client!es", name = "P", descriptor = "I")
    public static int field8670;

    @OriginalMember(owner = "client!es", name = "R", descriptor = "I")
    public static int field8672;

    @OriginalMember(owner = "client!es", name = "S", descriptor = "[I")
    public static int[] field8673;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(Z)V")
    public static void method3473(boolean arg0) {
        if (arg0) {
            method3473(true);
        }
        field8671 = null;
        field8673 = null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method3474(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field8670;
        int var8 = class496.method2826(arg2, (byte) 36, class6.field66, class151.field2071);
        int var9 = class496.method2826(arg1, (byte) 36, class6.field66, class151.field2071);
        int var10 = class496.method2826(arg7, (byte) 36, class281.field3703, class255.field3350);
        int var11 = class496.method2826(arg4, (byte) 36, class281.field3703, class255.field3350);
        int var12 = class496.method2826(arg2 + arg6, (byte) 36, class6.field66, class151.field2071);
        int var13 = class496.method2826(-arg6 + arg1, (byte) 36, class6.field66, class151.field2071);
        for (int var14 = var8; ~var14 > ~var12; ++var14) {
            class285.method1691(var11, class315.field4224[var14], -7, var10, arg5);
        }
        int var15 = var9;
        if (arg3) {
            method3473(false);
        }
        while (~var15 < ~var13) {
            class285.method1691(var11, class315.field4224[var15], -7, var10, arg5);
            --var15;
        }
        int var16 = class496.method2826(arg6 + arg7, (byte) 36, class281.field3703, class255.field3350);
        int var17 = class496.method2826(arg4 - arg6, (byte) 36, class281.field3703, class255.field3350);
        for (int var18 = var12; var18 <= var13; ++var18) {
            int[] var19 = class315.field4224[var18];
            class285.method1691(var16, var19, -7, var10, arg5);
            class285.method1691(var17, var19, -7, var16, arg0);
            class285.method1691(var11, var19, -7, var17, arg5);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method1(int arg0, boolean arg1) {
        ++field8672;
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (arg1) {
            field8671 = null;
        }
        if (super.field4527.field1468 && this.method1750(10184)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field3922 * super.field3922;
            for (int var8 = 0; var8 < class649.field8968; ++var8) {
                int var9 = super.field3930[var7 - -(var8 % super.field3928)];
                var6[var8] = class15.method97(var9, 255) << 4;
                var5[var8] = class15.method97(var9, 65280) >> 4;
                var4[var8] = class15.method97(var9 >> 12, 4080);
            }
        }
        return var3;
    }
}
