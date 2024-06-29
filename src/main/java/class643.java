import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class643 extends class1 {

    @OriginalMember(owner = "client!lca", name = "O", descriptor = "Ljb;")
    public static class493 field8813 = null;

    @OriginalMember(owner = "client!lca", name = "K", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!lca", name = "R", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!lca", name = "T", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!lca", name = "U", descriptor = "I")
    public static int field8817;

    @OriginalMember(owner = "client!lca", name = "V", descriptor = "I")
    public static int field8818;

    @OriginalMember(owner = "client!lca", name = "S", descriptor = "Lgd;")
    public static class339 field8815;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IBILjb;)V", line = 4)
    public static final void method3553(int arg0, byte arg1, int arg2, class493 arg3) {
        ++field8812;
        if (class124.field1491) {
            class82 var4 = ~class273.field3902 != 0 ? class605.field8497.method154(class273.field3902, (byte) -125) : null;
            if (client.method1950(arg3).method2853(127) && (class351.field4969 & 32) != 0 && (var4 == null || arg3.method2932(var4.field1025, class273.field3902, (byte) 30) != var4.field1025)) {
                class635.method3531(false, arg3.field6956, arg3.field6952, class291.field4101, false, class580.field8185, true, 30, (long) (arg3.field6944 << 0 | arg3.field6956), 0L, class701.field9774 + " -> " + arg3.field6991, arg3.field6944, 0);
                ++class383.field5472;
            }
        }
        if (arg1 < 94) {
            field8813 = null;
        }
        for (int var5 = 9; ~var5 <= -6; --var5) {
            String var9 = class123.method836(var5, (byte) 113, arg3);
            if (var9 != null) {
                class635.method3531(false, arg3.field6956, arg3.field6952, var9, false, class505.method2991(arg3, 19161, var5), true, 1002, (long) (arg3.field6944 << 0 | arg3.field6956), (long) (var5 + 1), arg3.field6991, arg3.field6944, 0);
                ++class598.field8410;
            }
        }
        String var6 = class713.method4011(arg3, -10402);
        if (var6 != null) {
            class635.method3531(false, arg3.field6956, arg3.field6952, var6, false, arg3.field7107, true, 15, (long) (arg3.field6956 | arg3.field6944 << 0), 0L, arg3.field6991, arg3.field6944, 0);
            ++class464.field6568;
        }
        for (int var7 = 4; var7 >= 0; --var7) {
            String var8 = class123.method836(var7, (byte) 113, arg3);
            if (var8 != null) {
                ++class598.field8410;
                class635.method3531(false, arg3.field6956, arg3.field6952, var8, false, class505.method2991(arg3, 19161, var7), true, 25, (long) (arg3.field6944 << 0 | arg3.field6956), (long) (var7 + 1), arg3.field6991, arg3.field6944, 0);
            }
        }
        if (client.method1950(arg3).method2857(-124)) {
            if (arg3.field6989 == null) {
                class635.method3531(false, arg3.field6956, arg3.field6952, class71.field905.method588((byte) 88, class549.field7669), false, -1, true, 12, (long) (arg3.field6956 | arg3.field6944 << 0), 0L, "", arg3.field6944, 0);
            } else {
                class635.method3531(false, arg3.field6956, arg3.field6952, arg3.field6989, false, -1, true, 12, (long) (arg3.field6944 << 0 | arg3.field6956), 0L, "", arg3.field6944, 0);
            }
            ++class228.field3067;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(II)[[I", line = 80)
    public final int[][] method5(int arg0, int arg1) {
        ++field8817;
        int[][] var3 = super.field668.method3009(0, arg0);
        if (super.field668.field7292 && this.method1(2250)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field3 * super.field3;
            for (int var8 = 0; ~class328.field4576 < ~var8; ++var8) {
                int var9 = super.field12[var8 % super.field11 + var7];
                var6[var8] = class286.method1877(255, var9) << 4;
                var5[var8] = class286.method1877(65280, var9) >> 4;
                var4[var8] = class286.method1877(4080, var9 >> 12);
            }
        }
        if (arg1 != 1) {
            method3553(93, (byte) -47, 112, (class493) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "(I)V", line = 136)
    public static void method3554(int arg0) {
        if (arg0 > -72) {
            field8813 = null;
        }
        field8815 = null;
        field8813 = null;
    }

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "(I)V", line = 149)
    public static final void method3555(int arg0) {
        class557.field7812.method2755(249682952, 1, class557.field7812.field6543);
        ++field8814;
        class557.field7812.method2755(249682952, 1, class557.field7812.field6532);
        class557.field7812.method2755(249682952, 2, class557.field7812.field6507);
        class557.field7812.method2755(249682952, 2, class557.field7812.field6509);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6528);
        class557.field7812.method2755(arg0 ^ -249682953, 1, class557.field7812.field6546);
        class557.field7812.method2755(arg0 ^ -249682953, 1, class557.field7812.field6511);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6512);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6525);
        class557.field7812.method2755(arg0 + 249682953, 1, class557.field7812.field6522);
        class557.field7812.method2755(arg0 + 249682953, 2, class557.field7812.field6542);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6548);
        class557.field7812.method2755(249682952, 2, class557.field7812.field6520);
        if (arg0 == -1) {
            class557.field7812.method2755(249682952, 1, class557.field7812.field6557);
            class557.field7812.method2755(249682952, 0, class557.field7812.field6537);
            class557.field7812.method2755(249682952, 0, class557.field7812.field6553);
            class557.field7812.method2755(249682952, 2, class557.field7812.field6516);
            class557.field7812.method2755(249682952, 0, class557.field7812.field6514);
            class557.field7812.method2755(249682952, 0, class557.field7812.field6524);
            class203.method1234(15);
            class557.field7812.method2755(249682952, 0, class557.field7812.field6552);
            class557.field7812.method2755(249682952, 4, class557.field7812.field6508);
            class43.method289((byte) -109);
            class661.method3626(16711680);
            class64.field792 = true;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIZIII)V", line = 189)
    public static final void method3556(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        ++field8818;
        int var7 = class24.method150(arg5, class143.field2050, false, class461.field6495);
        int var8 = class24.method150(arg1, class143.field2050, !arg3, class461.field6495);
        int var9 = class24.method150(arg6, class71.field960, false, class549.field7665);
        int var10 = class24.method150(arg2, class71.field960, false, class549.field7665);
        int var11 = class24.method150(arg0 + arg5, class143.field2050, !arg3, class461.field6495);
        int var12 = class24.method150(arg1 - arg0, class143.field2050, false, class461.field6495);
        for (int var13 = var7; var13 < var11; ++var13) {
            method3557(var9, class445.field6320[var13], (byte) 116, arg4, var10);
        }
        for (int var14 = var8; var14 > var12; --var14) {
            method3557(var9, class445.field6320[var14], (byte) 85, arg4, var10);
        }
        if (arg3) {
            int var15 = class24.method150(arg0 + arg6, class71.field960, false, class549.field7665);
            int var16 = class24.method150(-arg0 + arg2, class71.field960, false, class549.field7665);
            for (int var17 = var11; ~var12 <= ~var17; ++var17) {
                int[] var18 = class445.field6320[var17];
                method3557(var9, var18, (byte) 127, arg4, var15);
                method3557(var16, var18, (byte) 123, arg4, var10);
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I[IBII)V", line = 241)
    public static final void method3557(int arg0, int[] arg1, byte arg2, int arg3, int arg4) {
        --arg0;
        ++field8816;
        int var13 = arg4 - 1;
        int var5 = var13 + -7;
        while (~var5 < ~arg0) {
            int var6 = arg0 + 1;
            arg1[var6] = arg3;
            int var7 = var6 + 1;
            arg1[var7] = arg3;
            int var8 = var7 + 1;
            arg1[var8] = arg3;
            int var9 = var8 + 1;
            arg1[var9] = arg3;
            int var10 = var9 + 1;
            arg1[var10] = arg3;
            int var11 = var10 + 1;
            arg1[var11] = arg3;
            int var12 = var11 + 1;
            arg1[var12] = arg3;
            arg0 = var12 + 1;
            arg1[arg0] = arg3;
        }
        while (~var13 < ~arg0) {
            ++arg0;
            arg1[arg0] = arg3;
        }
        if (arg2 < 47) {
            method3553(59, (byte) 109, 62, (class493) null);
        }
    }
}
