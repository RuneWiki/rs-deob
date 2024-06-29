import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class160 {

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "Lsn;")
    public static class583 field2306 = new class583("LOCAL", 4);

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "J")
    public static long field2309 = -1L;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILhea;I[II[I)Lpl;")
    public static final class602 method1106(int arg0, class387 arg1, int arg2, int[] arg3, int arg4, int[] arg5) {
        if (arg2 != 29778) {
            field2306 = null;
        }
        field2308++;
        if (!arg1.method1895(class218.field3050, true, class87.field1467)) {
            int[] var10 = new int[arg0 * arg4];
            for (int var11 = 0; var11 < arg4; var11++) {
                int var12 = arg0 * var11 + arg3[var11];
                for (int var13 = 0; var13 < arg5[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class602(arg1, arg0, arg4, var10);
        }
        byte[] var6 = new byte[arg0 * arg4];
        for (int var7 = 0; var7 < arg4; var7++) {
            int var8 = arg0 * var7 + arg3[var7];
            for (int var9 = 0; var9 < arg5[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class602(arg1, arg0, arg4, var6);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V")
    public static void method1107(byte arg0) {
        field2306 = null;
        if (arg0 != 104) {
            field2306 = null;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZI)I")
    public static final int method1108(boolean arg0, int arg1) {
        field2307++;
        if (arg0) {
            method1106(-126, null, -107, null, -40, null);
        }
        return arg1 & 0xFF;
    }
}
