import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class11 implements class271 {

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field195 = -1;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field194 = 0;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lwi;")
    public static class23 field193;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 5)
    public static void method106(byte arg0) {
        if (arg0 != 39) {
            field193 = (class23) null;
        }
        field193 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(JB[II)Lck;", line = 16)
    public final class119 method107(long arg0, byte arg1, int[] arg2, int arg3) {
        field196++;
        if (arg3 == 0) {
            class295 var6 = class124.method826((byte) -36, arg2[0]);
            return var6.method1964(arg1 ^ 0xFFFFFFB5, (int) arg0);
        }
        if (arg1 != -56) {
            field195 = -53;
        }
        if (arg3 == 1 || arg3 == 10) {
            class262 var7 = class205.method1296((byte) -113, (int) arg0);
            return var7.field4212;
        } else if (arg3 == 6 || arg3 == 7) {
            return class124.method826((byte) -50, arg2[0]).method1964(4, (int) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[Ljava/lang/Object;I[IZ)V", line = 62)
    public static final void method108(int arg0, Object[] arg1, int arg2, int[] arg3, boolean arg4) {
        if (!arg4) {
            method106((byte) -76);
        }
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if (arg3[var9] < (var7 + (var9 & 0x1))) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    Object var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method108(arg0, arg1, var6 - 1, arg3, true);
            method108(var6 + 1, arg1, arg2, arg3, arg4);
        }
        field197++;
    }
}
