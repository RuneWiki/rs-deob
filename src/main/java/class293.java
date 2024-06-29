import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class293 extends class571 {

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "[I")
    public int[] field3828;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "[I")
    public int[] field3826;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "[Lbl;")
    public static class469[] field3827 = new class469[6];

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "[I")
    public static int[] field3829 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "[Lfda;")
    public static class362[] field3830 = new class362[50];

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIBI)V", line = 4)
    public static final void method1718(int arg0, int arg1, byte arg2, int arg3) {
        field3824++;
        class118 var4 = class126.method814(true, arg0, 9);
        var4.method771(-30559);
        var4.field1636 = arg3;
        var4.field1629 = arg1;
        if (arg2 < 124) {
            field3830 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[Ljava/lang/Object;ZI[J)V", line = 27)
    public static final void method1719(int arg0, Object[] arg1, boolean arg2, int arg3, long[] arg4) {
        if (!arg2) {
            return;
        }
        field3825++;
        if (arg3 <= arg0) {
            return;
        }
        int var5 = (arg0 + arg3) / 2;
        int var6 = arg0;
        long var7 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var7;
        Object var9 = arg1[var5];
        arg1[var5] = arg1[arg3];
        arg1[arg3] = var9;
        int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
        for (int var11 = arg0; var11 < arg3; var11++) {
            if ((long) (var10 & var11) + var7 > arg4[var11]) {
                long var12 = arg4[var11];
                arg4[var11] = arg4[var6];
                arg4[var6] = var12;
                Object var14 = arg1[var11];
                arg1[var11] = arg1[var6];
                arg1[var6++] = var14;
            }
        }
        arg4[arg3] = arg4[var6];
        arg4[var6] = var7;
        arg1[arg3] = arg1[var6];
        arg1[var6] = var9;
        method1719(arg0, arg1, arg2, var6 - 1, arg4);
        method1719(var6 + 1, arg1, true, arg3, arg4);
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(II[I[I)V", line = 83)
    public class293(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field3828 = arg3;
        this.field3826 = arg2;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)V", line = 98)
    public static void method1720(boolean arg0) {
        field3830 = null;
        if (!arg0) {
            field3831 = 71;
        }
        field3827 = null;
        field3829 = null;
    }
}
