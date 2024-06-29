import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class21 {

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "Lbu;")
    public static class21 field347 = new class21(54, -2);

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "Lin;")
    public static class97 field350 = new class97();

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "Lfba;")
    public static class27 field354 = new class27(81, -1);

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "Lgn;")
    public static class729 field353;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field352;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)I")
    public final int method219(int arg0) {
        field344++;
        if (arg0 != 1) {
            method220(null, 38, -43, -96, null);
        }
        return this.field348;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "([IIII[J)V")
    public static final void method220(int[] arg0, int arg1, int arg2, int arg3, long[] arg4) {
        field346++;
        if (arg1 < arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg1;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var7;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg3; var11++) {
                if (arg4[var11] < ((long) (var10 & var11) + var7)) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    int var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg4[arg3] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var9;
            method220(arg0, arg1, arg2, var6 - 1, arg4);
            method220(arg0, var6 + 1, 1, arg3, arg4);
        }
        if (arg2 != 1) {
            field347 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V")
    public static void method221(int arg0) {
        field352 = null;
        if (arg0 >= -113) {
            field350 = null;
        }
        field347 = null;
        field350 = null;
        field354 = null;
        field353 = null;
    }

    @OriginalMember(owner = "client!bu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field351++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIB)V")
    public static final void method222(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (class618.field8645 <= arg2 && class463.field6533 >= arg1 && class734.field10153 <= arg0 && arg3 <= class407.field5535) {
            class529.method3192(arg3, arg1, arg0, arg4, (byte) -118, arg2);
        } else {
            class62.method411(arg3, arg0, arg1, arg4, arg2, false);
        }
        if (arg5 == 79) {
            field349++;
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(II)V")
    public class21(int arg0, int arg1) {
        this.field345 = arg1;
        this.field348 = arg0;
    }
}
