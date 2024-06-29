import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class188 extends class98 {

    @OriginalMember(owner = "client!cs", name = "N", descriptor = "I")
    public static int field2714 = -1;

    @OriginalMember(owner = "client!cs", name = "Q", descriptor = "I")
    public static int field2717 = 0;

    @OriginalMember(owner = "client!cs", name = "L", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!cs", name = "M", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!cs", name = "O", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!cs", name = "P", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!cs", name = "R", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(III)I")
    private final int method1284(int arg0, int arg1, int arg2) {
        ++field2718;
        if (arg2 != 10) {
            method1286(-3, -21, -93, 0, 73);
        }
        int var4 = arg1 * 57 + arg0;
        int var5 = var4 ^ var4 << 1;
        return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V")
    public class188() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        if (arg0 != 0) {
            field2717 = 108;
        }
        ++field2712;
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            int var4 = class163.field2285[arg1];
            for (int var5 = 0; ~class268.field3811 < ~var5; ++var5) {
                var3[var5] = this.method1284(class189.field2722[var5], var4, 10) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljj;IILae;Lnd;IILli;)V")
    public static final void method1285(class60 arg0, int arg1, int arg2, class134 arg3, class324 arg4, int arg5, int arg6, class246 arg7) {
        ++field2715;
        int var8 = -(arg6 / 2) + -5 + arg4.field4611;
        int var9 = arg2 + 2;
        int var10 = -99 % ((54 - arg1) / 46);
        if (arg7.field3499 != 0) {
            arg3.method827(var9, var8, -var9 + arg5 * arg0.method352() + arg2 + 1, -116, arg6 + 10, arg7.field3499);
        }
        if (~arg7.field3487 != -1) {
            arg3.method830(arg7.field3487, 1, arg2 + (arg0.method352() * arg5 - var9) + 1, arg6 + 10, var9, var8);
        }
        int var11 = arg7.field3513;
        if (arg4.field4617 && arg7.field3518 != -1) {
            var11 = arg7.field3518;
        }
        for (int var12 = 0; ~var12 > ~arg5; ++var12) {
            String var13 = class249.field3556[var12];
            if (~(arg5 + -1) < ~var12) {
                var13 = var13.substring(0, -4 + var13.length());
            }
            arg0.method350(arg3, var13, arg4.field4611, arg2, var11, true);
            arg2 += arg0.method352();
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIII)V")
    public static final void method1286(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class404.field5813 == 1) {
            class97.field1167[class412.field5924 / 100].method2446(class54.field632 - 8, class161.field2140 + -8);
        }
        ++field2713;
        if (~class404.field5813 == -3) {
            class97.field1167[class412.field5924 / 100 + 4].method2446(class54.field632 + -8, class161.field2140 + -8);
        }
        class11.method78(arg3 ^ arg3);
    }
}
