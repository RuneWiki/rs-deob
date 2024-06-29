import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class373 {

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public int field4897;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    private int field4900;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Lcea;")
    public static class180 field4896 = new class180("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "[I")
    public static int[] field4903 = new int[32];

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "[I")
    public static int[] field4898;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)I")
    public static final int method2079(byte arg0, int arg1) {
        if (arg0 >= -77) {
            field4898 = null;
        }
        field4899++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!vj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4902++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIBI[BIII[B)V")
    public static final void method2080(int arg0, int arg1, byte arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field4901++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg4[var10001] = (byte) (arg4[var10001] - arg8[arg1++]);
                int var14 = arg0++;
                arg4[var14] = (byte) (arg4[var14] - arg8[arg1++]);
                int var15 = arg0++;
                arg4[var15] = (byte) (arg4[var15] - arg8[arg1++]);
                int var16 = arg0++;
                arg4[var16] = (byte) (arg4[var16] - arg8[arg1++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg4[var10001] = (byte) (arg4[var10001] - arg8[arg1++]);
            }
            arg1 += arg5;
            arg0 += arg6;
        }
        if (arg2 != 4) {
            method2080(13, 113, (byte) 116, 119, null, 100, 100, -86, null);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(II)V")
    public class373(int arg0, int arg1) {
        this.field4897 = arg1;
        this.field4900 = arg0;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method2081(int arg0) {
        if (arg0 != 3) {
            method2079((byte) -11, -122);
        }
        field4898 = null;
        field4896 = null;
        field4903 = null;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)I")
    public final int method2082(int arg0) {
        if (arg0 < 69) {
            method2079((byte) 70, 99);
        }
        field4904++;
        return this.field4900;
    }
}
