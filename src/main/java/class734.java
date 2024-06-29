import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class734 {

    @OriginalMember(owner = "client!au", name = "b", descriptor = "Ldh;")
    public static class320 field10266 = new class320(100, 6);

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public static int field10265;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field10267;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V", line = 3)
    public static void method4088(byte arg0) {
        if (arg0 != -68) {
            method4090(21, null, null, null);
        }
        field10266 = null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "([JIII[Ljava/lang/Object;)V", line = 13)
    public static final void method4089(long[] arg0, int arg1, int arg2, int arg3, Object[] arg4) {
        field10267++;
        if (arg2 < arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            Object var9 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg2; var11 < arg3; var11++) {
                if ((long) (var11 & var10) + var7 > arg0[var11]) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    Object var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var9;
            method4089(arg0, -98, arg2, var6 - 1, arg4);
            method4089(arg0, 6, var6 + 1, arg3, arg4);
        }
        int var15 = -26 / ((arg1 + 48) / 36);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ILoh;[ILoh;)V", line = 73)
    public static final void method4090(int arg0, class404 arg1, int[] arg2, class404 arg3) {
        if (arg0 != 9260) {
            return;
        }
        class586.field8270 = arg1;
        class278.field3417 = arg3;
        field10265++;
        if (arg2 != null) {
            class7.field55 = arg2;
        }
    }
}
