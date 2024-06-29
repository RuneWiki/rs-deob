import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class44 {

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "[I")
    public static int[] field761 = new int[2];

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "[I")
    public static int[] field760 = new int[2048];

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field766 = 0;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "[Ljf;")
    public static class86[] field762;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "[[[B")
    public static byte[][][] field767;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 4)
    public static final void method326(int arg0) {
        class175.field3038.method2168(arg0 ^ arg0);
        field763++;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIII)V", line = 15)
    public static final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field764++;
        int var9 = arg1 + 1;
        class114.method780(79, arg5, arg4, arg0, class73.field1117[arg1]);
        int var10 = arg3 - 1;
        class114.method780(-116, arg5, arg4, arg0, class73.field1117[arg3]);
        int var6 = var9;
        if (arg2 >= -12) {
            method328(-19, -19, -72, -43, -17, -98, -65, -124);
        }
        while (var6 <= var10) {
            int[] var7 = class73.field1117[var6];
            var7[arg5] = var7[arg4] = arg0;
            var6++;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIII)Z", line = 43)
    public static final boolean method328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)Luh;", line = 78)
    public static final class67 method329(int arg0, int arg1) {
        if (arg0 == 3283) {
            field765++;
            return class35.field572 && arg1 >= class126.field2210 && class51.field833 >= arg1 ? class112.field2016[arg1 - class126.field2210] : null;
        } else {
            return (class67) null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V", line = 96)
    public static void method330(int arg0) {
        if (arg0 != -2190) {
            method326(-81);
        }
        field767 = (byte[][][]) null;
        field760 = null;
        field762 = null;
        field761 = null;
    }
}
