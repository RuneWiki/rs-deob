import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class183 extends class5 {

    @OriginalMember(owner = "client!up", name = "n", descriptor = "Lla;")
    public static class319 field2478 = new class319(8, 3);

    @OriginalMember(owner = "client!up", name = "o", descriptor = "[[I")
    public static int[][] field2479 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!up", name = "u", descriptor = "J")
    public static long field2485 = -1L;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!up", name = "r", descriptor = "I")
    public int field2482;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!up", name = "w", descriptor = "Laj;")
    public static class208 field2487;

    @OriginalMember(owner = "client!up", name = "j", descriptor = "[I")
    public int[] field2474;

    @OriginalMember(owner = "client!up", name = "l", descriptor = "[I")
    public int[] field2476;

    @OriginalMember(owner = "client!up", name = "s", descriptor = "[I")
    public int[] field2483;

    @OriginalMember(owner = "client!up", name = "p", descriptor = "[Low;")
    public class234[] field2480;

    @OriginalMember(owner = "client!up", name = "t", descriptor = "[Low;")
    public class234[] field2484;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "[[[B")
    public byte[][][] field2477;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "([Ljava/lang/Object;IIZ[J)V", line = 6)
    public static final void method1241(Object[] arg0, int arg1, int arg2, boolean arg3, long[] arg4) {
        if (!arg3) {
            method1242(117);
        }
        if (arg2 < arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg2;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg2; var11 < arg1; var11++) {
                if (var7 + ((long) (var11 & var10)) > arg4[var11]) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    Object var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var9;
            method1241(arg0, var6 - 1, arg2, true, arg4);
            method1241(arg0, arg1, var6 + 1, arg3, arg4);
        }
        field2486++;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V", line = 62)
    public static void method1242(int arg0) {
        field2479 = null;
        field2487 = null;
        field2478 = null;
        if (arg0 > -47) {
            field2481 = -63;
        }
    }
}
