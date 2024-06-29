import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class237 extends class508 {

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "Ltu;")
    public class7 field3082 = new class7();

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "Lhb;")
    public static class250 field3084 = new class250(71, 2);

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "Lhb;")
    public static class250 field3086 = new class250(11, 3);

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "[I")
    public static int[] field3087 = new int[1];

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "Z")
    public static boolean field3088 = false;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field3089 = 0;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 3)
    public static void method1504(int arg0) {
        field3086 = null;
        field3087 = null;
        field3084 = null;
        if (arg0 != 1) {
            field3084 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([Ljava/lang/Object;II[JI)V", line = 16)
    public static final void method1505(Object[] arg0, int arg1, int arg2, long[] arg3, int arg4) {
        int var5 = -79 / ((-arg2 - 56) / 51);
        field3081++;
        if (arg4 <= arg1) {
            return;
        }
        int var6 = (arg1 + arg4) / 2;
        int var7 = arg1;
        long var8 = arg3[var6];
        arg3[var6] = arg3[arg4];
        arg3[arg4] = var8;
        Object var10 = arg0[var6];
        arg0[var6] = arg0[arg4];
        arg0[arg4] = var10;
        int var11 = var8 == Long.MAX_VALUE ? 0 : 1;
        for (int var12 = arg1; var12 < arg4; var12++) {
            if (arg3[var12] < ((long) (var11 & var12) + var8)) {
                long var13 = arg3[var12];
                arg3[var12] = arg3[var7];
                arg3[var7] = var13;
                Object var15 = arg0[var12];
                arg0[var12] = arg0[var7];
                arg0[var7++] = var15;
            }
        }
        arg3[arg4] = arg3[var7];
        arg3[var7] = var8;
        arg0[arg4] = arg0[var7];
        arg0[var7] = var10;
        method1505(arg0, arg1, -113, arg3, var7 - 1);
        method1505(arg0, var7 + 1, -113, arg3, arg4);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIZ)V", line = 71)
    public static final void method1506(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3083++;
        class436 var5 = class459.method2712(8, arg3, -1759243680);
        var5.method2574((byte) 64);
        if (!arg4) {
            var5.field5979 = arg2;
            var5.field5977 = arg0;
            var5.field5980 = arg1;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Z", line = 93)
    public static final boolean method1507(int arg0, int arg1, int arg2) {
        field3085++;
        int var3 = 41 % ((arg0 - 21) / 53);
        return (arg2 & 0x180) != 0;
    }
}
