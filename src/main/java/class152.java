import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class152 {

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "[I")
    public int[] field2316 = new int[3];

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "[Lni;")
    public class369[] field2314 = new class369[8];

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "[Lsv;")
    public class478[] field2315 = new class478[100];

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "[I")
    public int[] field2319 = new int[100];

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "Lgw;")
    public static class118 field2320 = new class118();

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "Lqv;")
    public static class316 field2321 = new class316(88, 1);

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "Lge;")
    public static class511 field2322 = new class511(4);

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public int field2311;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field2317;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "[Lvi;")
    public static class384[] field2323;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "([IILbt;I[II)Lse;", line = 3)
    public static final class173 method1078(int[] arg0, int arg1, class33 arg2, int arg3, int[] arg4, int arg5) {
        field2312++;
        byte[] var6 = new byte[arg1 * arg3];
        int var7 = 0;
        if (arg5 != 4144) {
            method1080(null, 49, false, -115, null, 118, -108, 73);
        }
        while (arg1 > var7) {
            int var8 = arg3 * var7 + arg0[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
            var7++;
        }
        return new class173(arg2, arg3, arg1, var6);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V", line = 36)
    public static void method1079(int arg0) {
        if (arg0 == 88) {
            field2323 = null;
            field2322 = null;
            field2321 = null;
            field2320 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "([BIZILbt;III)Lhf;", line = 78)
    public static final class277 method1080(byte[] arg0, int arg1, boolean arg2, int arg3, class33 arg4, int arg5, int arg6, int arg7) {
        if (arg1 < 109) {
            method1078(null, -18, null, 67, null, -62);
        }
        field2310++;
        if (!arg4.field712 && (!class494.method2900((byte) 101, arg6) || !class494.method2900((byte) -111, arg3))) {
            return arg4.field665 ? new class277(arg4, 34037, arg5, arg6, arg3, arg2, arg0, arg7) : new class277(arg4, arg5, arg6, arg3, class487.method2869(1366891568, arg6), class487.method2869(1366891568, arg3), arg0, arg7);
        } else {
            return new class277(arg4, 3553, arg5, arg6, arg3, arg2, arg0, arg7);
        }
    }
}
