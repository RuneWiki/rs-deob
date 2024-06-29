import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class436 {

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lus;")
    public static class328 field6131 = new class328(61, -1);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 4)
    public static void method2576(int arg0) {
        field6131 = null;
        if (arg0 <= 110) {
            field6131 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Leq;IIIZIB[I)Lmba;", line = 20)
    public static final class77 method2577(class357 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, byte arg6, int[] arg7) {
        int var8 = -52 % ((-arg6 - 33) / 39);
        field6130++;
        if (!arg0.field5082 && (!class487.method2850((byte) 109, arg1) || !class487.method2850((byte) 113, arg3))) {
            return arg0.field5017 ? new class77(arg0, 34037, arg1, arg3, arg4, arg7, arg5, arg2) : new class77(arg0, arg1, arg3, class353.method2103(113, arg1), class353.method2103(58, arg3), arg7);
        } else {
            return new class77(arg0, 3553, arg1, arg3, arg4, arg7, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILem;)I", line = 38)
    public static final int method2578(int arg0, class610 arg1) {
        if (arg0 != 6145) {
            field6131 = null;
        }
        field6132++;
        if (class300.field3868 == arg1) {
            return 6407;
        } else if (class440.field6178 == arg1) {
            return 6408;
        } else if (class15.field215 == arg1) {
            return 6406;
        } else if (class750.field10490 == arg1) {
            return 6409;
        } else if (class332.field4276 == arg1) {
            return 6410;
        } else if (class590.field8226 == arg1) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III[B)[B", line = 82)
    public static final byte[] method2579(int arg0, int arg1, int arg2, byte[] arg3) {
        field6133++;
        byte[] var4;
        if (arg1 > ~arg0) {
            var4 = new byte[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                var4[var5] = arg3[arg0 + var5];
            }
        } else {
            var4 = arg3;
        }
        class720 var6 = new class720();
        var6.method3990(90);
        var6.method3985((long) (arg2 * 8), var4, 255);
        byte[] var7 = new byte[64];
        var6.method3986(0, 84, var7);
        return var7;
    }
}
