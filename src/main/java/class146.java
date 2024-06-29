import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class146 extends class248 {

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    private final int field2435;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    private final int field2440;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    private final int field2432;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    private final int field2433;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "Z")
    public static boolean field2434 = false;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "Ldf;")
    public static class51 field2430 = class46.method233(")1 ", 100);

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "I")
    public static int field2439 = 0;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "Lqh;")
    public static class189 field2437 = new class189(50);

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "[Ljg;")
    public static class158[] field2441;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
    public static void method1042(boolean arg0) {
        if (!arg0) {
            field2441 = null;
            field2437 = null;
            field2430 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIII)V")
    public class146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2435 = arg3;
        this.field2440 = arg0;
        this.field2432 = arg1;
        this.field2433 = arg2;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(III)V")
    public final void method152(int arg0, int arg1, int arg2) {
        ++field2436;
        int var4 = -29 / ((arg2 - 66) / 40);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIILkb;Lkb;IIIIJ)V")
    public static final void method1043(int arg0, int arg1, int arg2, int arg3, class49 arg4, class49 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 != null) {
            class195 var12 = new class195();
            var12.field3273 = arg10;
            var12.field3266 = arg1 * 128 + 64;
            var12.field3271 = arg2 * 128 + 64;
            var12.field3254 = arg3;
            var12.field3252 = arg4;
            var12.field3268 = arg5;
            var12.field3259 = arg6;
            var12.field3253 = arg7;
            var12.field3272 = arg8;
            var12.field3251 = arg9;
            for (int var13 = arg0; var13 >= 0; --var13) {
                if (class27.field395[var13][arg1][arg2] == null) {
                    class27.field395[var13][arg1][arg2] = new class97(var13, arg1, arg2);
                }
            }
            class27.field395[arg0][arg1][arg2].field1616 = var12;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IBI)V")
    public final void method153(int arg0, byte arg1, int arg2) {
        if (arg1 != 98) {
            method1044(29, (class51[]) null, -13, true);
        }
        ++field2428;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[Ldf;IZ)Ldf;")
    public static final class51 method1044(int arg0, class51[] arg1, int arg2, boolean arg3) {
        ++field2438;
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; ++var5) {
            if (arg1[arg0 + var5] == null) {
                arg1[arg0 + var5] = class168.field2737;
            }
            var4 += arg1[arg0 - -var5].field855;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        if (!arg3) {
            method1043(-67, 60, 75, -91, (class49) null, (class49) null, -112, -5, -40, 66, -31L);
        }
        for (int var8 = 0; ~var8 > ~arg2; ++var8) {
            class51 var10 = arg1[arg0 + var8];
            class256.method1746(var10.field813, 0, var6, var7, var10.field855);
            var7 += var10.field855;
        }
        class51 var9 = new class51();
        var9.field855 = var4;
        var9.field813 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIILkb;JLkb;Lkb;)V")
    public static final void method1045(int arg0, int arg1, int arg2, int arg3, class49 arg4, long arg5, class49 arg6, class49 arg7) {
        class105 var9 = new class105();
        var9.field1739 = arg4;
        var9.field1736 = arg1 * 128 + 64;
        var9.field1740 = arg2 * 128 + 64;
        var9.field1737 = arg3;
        var9.field1741 = arg5;
        var9.field1735 = arg6;
        var9.field1731 = arg7;
        int var10 = 0;
        class97 var11 = class27.field395[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1620; ++var12) {
                class33 var13 = var11.field1632[var12];
                if ((var13.field477 & 4194304L) == 4194304L) {
                    int var14 = var13.field488.method94();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1730 = -var10;
        if (class27.field395[arg0][arg1][arg2] == null) {
            class27.field395[arg0][arg1][arg2] = new class97(arg0, arg1, arg2);
        }
        class27.field395[arg0][arg1][arg2].field1611 = var9;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)V")
    public final void method154(int arg0, int arg1, int arg2) {
        ++field2431;
        int var4 = -53 / ((arg1 - 20) / 59);
        int var5 = this.field2435 * arg0 >> 12;
        int var6 = this.field2433 * arg2 >> 12;
        int var7 = this.field2440 * arg2 >> 12;
        int var8 = this.field2432 * arg0 >> 12;
        class10.method50(-4208, var8, var6, super.field4372, var5, var7);
    }
}
