import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class228 {

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Lgb;")
    public static class228 field3320 = new class228();

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lgb;")
    public static class228 field3323 = new class228();

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Lgb;")
    public static class228 field3324 = new class228();

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lgb;")
    public static class228 field3325 = new class228();

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "B")
    public static byte field3328;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "F")
    public static float field3327;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Lsk;")
    public static class650 field3326;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 4)
    public static void method1553(int arg0) {
        field3324 = null;
        field3326 = null;
        if (arg0 == 12) {
            field3320 = null;
            field3325 = null;
            field3323 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V", line = 18)
    public static final void method1554(int arg0, int arg1) {
        class126.field2224 = -1;
        field3321++;
        class676.field9431 = null;
        if (arg0 != 2) {
            field3328 = -27;
        }
        class11.field180 = null;
        class469.field6348 = 1;
        class752.field10377 = 0;
        class234.field3371 = false;
        class171.field2733 = arg1;
        class457.field6220 = -1;
    }

    @OriginalMember(owner = "client!gb", name = "toString", descriptor = "()Ljava/lang/String;", line = 38)
    public final String toString() {
        field3318++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)V", line = 46)
    public static final void method1555(byte arg0, int arg1) {
        field3322++;
        if (arg0 != -71) {
            method1555((byte) 89, -53);
        }
        class281 var2 = class54.method395((byte) -53, (long) arg1, 12);
        var2.method1818((byte) 104);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[I[J)V", line = 63)
    public static final void method1556(int arg0, int arg1, int arg2, int[] arg3, long[] arg4) {
        if (arg2 != -12988) {
            return;
        }
        if (arg1 < arg0) {
            int var5 = (arg1 + arg0) / 2;
            int var6 = arg1;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var7;
            int var9 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg0; var11++) {
                if ((var7 + ((long) (var11 & var10))) > arg4[var11]) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    int var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg4[arg0] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var9;
            method1556(var6 - 1, arg1, -12988, arg3, arg4);
            method1556(arg0, var6 + 1, -12988, arg3, arg4);
        }
        field3319++;
    }
}
