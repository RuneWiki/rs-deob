import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class455 {

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "[I")
    public static int[] field6203 = new int[1];

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "I")
    public static int field6207 = 64;

    @OriginalMember(owner = "client!uba", name = "f", descriptor = "[I")
    public static int[] field6208 = new int[3];

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "I")
    public static int field6206 = 0;

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V", line = 8)
    public static void method2626(int arg0) {
        field6208 = null;
        if (arg0 == 8468) {
            field6203 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)I", line = 23)
    public static final int method2627(int arg0, int arg1) {
        field6204++;
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            if (arg0 >= -85) {
                field6206 = 28;
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BI[I[IILhk;)Lpc;", line = 44)
    public static final class699 method2628(byte arg0, int arg1, int[] arg2, int[] arg3, int arg4, class111 arg5) {
        field6205++;
        byte[] var6 = new byte[arg1 * arg4];
        for (int var7 = 0; var7 < arg1; var7++) {
            int var8 = arg4 * var7 + arg2[var7];
            for (int var9 = 0; var9 < arg3[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg0 == 114) {
            return new class699(arg5, arg4, arg1, var6);
        } else {
            return null;
        }
    }
}
