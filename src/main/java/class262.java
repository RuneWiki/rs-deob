import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class262 extends class264 {

    @OriginalMember(owner = "client!vh", name = "qb", descriptor = "[[S")
    public static short[][] field4661 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!vh", name = "sb", descriptor = "Leb;")
    public static class230 field4663 = class68.method589(0, "welle2:");

    @OriginalMember(owner = "client!vh", name = "wb", descriptor = "[[B")
    public static byte[][] field4667 = new byte[50][];

    @OriginalMember(owner = "client!vh", name = "rb", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!vh", name = "tb", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!vh", name = "ub", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!vh", name = "vb", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "(I)V")
    public static void method1821(int arg0) {
        field4663 = null;
        field4661 = null;
        if (arg0 >= -74) {
            field4663 = null;
        }
        field4667 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1822(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 >= -42) {
            method1821(-20);
        }
        int var6 = 0;
        ++field4666;
        int var7 = arg1;
        int var8 = arg5 * arg5;
        int var9 = arg1 * arg1;
        int var10 = arg1 << 1;
        int var11 = var9 << 1;
        int var12 = (1 - var10) * var8 + var11;
        int var13 = var9 << 2;
        int var14 = ((var6 << 1) + 3) * var11;
        int var15 = var8 << 1;
        int var16 = var8 << 2;
        int var17 = (var6 - -1) * var13;
        int var18 = -((var10 - 1) * var15) + var9;
        int var19 = ((arg1 << 1) + -3) * var15;
        if (~class15.field345 >= ~arg3 && ~class259.field4587 <= ~arg3) {
            int var20 = class106.method882(class78.field1404, 1, class42.field769, arg0 - -arg5);
            int var21 = class106.method882(class78.field1404, 1, class42.field769, -arg5 + arg0);
            class182.method1311(arg2, var20, true, class66.field1254[arg3], var21);
        }
        int var22 = (arg1 + -1) * var16;
        while (~var7 < -1) {
            if (~var12 > -1) {
                while (var12 < 0) {
                    ++var6;
                    var18 += var17;
                    var17 += var13;
                    var12 += var14;
                    var14 += var13;
                }
            }
            if (~var18 > -1) {
                ++var6;
                var12 += var14;
                var18 += var17;
                var14 += var13;
                var17 += var13;
            }
            --var7;
            var12 += -var22;
            var18 += -var19;
            var19 -= var16;
            int var23 = -var7 + arg3;
            int var24 = arg3 + var7;
            var22 -= var16;
            if (~class15.field345 >= ~var24 && ~var23 >= ~class259.field4587) {
                int var25 = class106.method882(class78.field1404, 1, class42.field769, arg0 + var6);
                int var26 = class106.method882(class78.field1404, 1, class42.field769, -var6 + arg0);
                if (~var23 <= ~class15.field345) {
                    class182.method1311(arg2, var25, true, class66.field1254[var23], var26);
                }
                if (~class259.field4587 <= ~var24) {
                    class182.method1311(arg2, var25, true, class66.field1254[var24], var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method1823(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4662;
        int var8 = arg6 + arg7;
        int var9 = arg5 - arg7;
        int var10 = arg0 + arg7;
        int var11 = -arg7 + arg1;
        if (!arg3) {
            field4667 = null;
        }
        for (int var12 = arg6; ~var8 < ~var12; ++var12) {
            class182.method1311(arg4, arg1, arg3, class66.field1254[var12], arg0);
        }
        for (int var13 = arg5; var13 > var9; --var13) {
            class182.method1311(arg4, arg1, true, class66.field1254[var13], arg0);
        }
        for (int var14 = var8; var9 >= var14; ++var14) {
            int[] var15 = class66.field1254[var14];
            class182.method1311(arg4, var10, true, var15, arg0);
            class182.method1311(arg2, var11, true, var15, var10);
            class182.method1311(arg4, arg1, true, var15, var11);
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field4664;
        if (arg1 != 26080) {
            return null;
        } else {
            int[][] var3 = super.field2152.method1106(arg0, -7034);
            if (super.field2152.field2616 && this.method1829(true)) {
                int[] var4 = var3[2];
                int var5 = arg0 % super.field4696 * super.field4696;
                int[] var6 = var3[1];
                int[] var7 = var3[0];
                for (int var8 = 0; var8 < class140.field2505; ++var8) {
                    int var9 = super.field4697[var8 % super.field4683 + var5];
                    var4[var8] = class189.method1350(4080, var9 << 4);
                    var6[var8] = class189.method1350(4080, var9 >> 4);
                    var7[var8] = class189.method1350(16711680, var9) >> 12;
                }
            }
            return var3;
        }
    }
}
