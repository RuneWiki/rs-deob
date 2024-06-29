import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class459 {

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field6467 = 0;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "D")
    public static double field6469;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "Lbt;")
    public static class48 field6468;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "Lbt;")
    public static class48 field6470;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[Ljava/lang/Object;I[JI)V", line = 8)
    public static final void method2777(int arg0, Object[] arg1, int arg2, long[] arg3, int arg4) {
        if (arg0 != -16090) {
            method2777(-79, null, -75, null, -116);
        }
        field6466++;
        if (arg4 >= arg2) {
            return;
        }
        int var5 = (arg2 + arg4) / 2;
        int var6 = arg4;
        long var7 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var7;
        Object var9 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var9;
        int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
        for (int var11 = arg4; var11 < arg2; var11++) {
            if (arg3[var11] < (var7 + ((long) (var10 & var11)))) {
                long var12 = arg3[var11];
                arg3[var11] = arg3[var6];
                arg3[var6] = var12;
                Object var14 = arg1[var11];
                arg1[var11] = arg1[var6];
                arg1[var6++] = var14;
            }
        }
        arg3[arg2] = arg3[var6];
        arg3[var6] = var7;
        arg1[arg2] = arg1[var6];
        arg1[var6] = var9;
        method2777(-16090, arg1, var6 - 1, arg3, arg4);
        method2777(-16090, arg1, arg2, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)V", line = 66)
    public static final void method2778(int arg0, int arg1, int arg2) {
        field6471++;
        if (class558.field7751 != 0) {
            if (arg0 < 0) {
                for (int var3 = 0; var3 < 16; var3++) {
                    class589.field8022[var3] = arg1;
                }
            } else {
                class589.field8022[arg0] = arg1;
            }
        }
        if (arg2 != 0) {
            field6470 = null;
        }
        class665.field9130.method3007(arg1, -12, arg0);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 99)
    public static void method2779(int arg0) {
        field6470 = null;
        field6468 = null;
        int var1 = 87 % ((34 - arg0) / 44);
    }
}
