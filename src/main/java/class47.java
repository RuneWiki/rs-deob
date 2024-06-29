import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public abstract class class47 {

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field551 = -1;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "[I")
    public static int[] field548 = new int[14];

    @OriginalMember(owner = "client!en", name = "i", descriptor = "Z")
    public static boolean field555 = false;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "()Z", line = 4)
    public boolean method274() {
        field553++;
        return false;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZII)Ljava/lang/String;", line = 15)
    public static final String method275(boolean arg0, int arg1, int arg2) {
        if (arg1 != 10) {
            method276(false, -111, true, 51, 50, true, -35, -52, (float[][]) ((float[][]) null), -124, (float[][]) ((float[][]) null), (class245) null, (int[][]) ((int[][]) null), (int[][]) ((int[][]) null), 48, (boolean[]) null, (float[][]) ((float[][]) null), (int[]) null, (byte) 4, false, -116, -98);
        }
        field549++;
        return arg0 && arg2 >= 0 ? class222.method1524(arg0, 10, arg2, -50) : Integer.toString(arg2);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZIZIIZII[[FI[[FLgj;[[I[[II[Z[[F[IBZII)V", line = 47)
    public static final void method276(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, float[][] arg8, int arg9, float[][] arg10, class245 arg11, int[][] arg12, int[][] arg13, int arg14, boolean[] arg15, float[][] arg16, int[] arg17, byte arg18, boolean arg19, int arg20, int arg21) {
        field550++;
        int var22 = (arg7 << 8) + (arg19 ? 255 : 0);
        int var23 = (arg6 << 8) + (arg0 ? 255 : 0);
        int var24 = (arg21 << 8) + (arg5 ? 255 : 0);
        int var25 = (arg2 ? 255 : 0) + (arg4 << 8);
        int[] var26 = new int[arg17.length / 2];
        for (int var27 = arg9; var27 < var26.length; var27++) {
            int var28 = arg17[var27 + var27];
            int[][] var29 = arg13 == null || arg15 == null || !arg15[var27] ? arg12 : arg13;
            int var30 = arg17[var27 + var27 + 1];
            var26[var27] = class309.method2173(var23, arg16, var24, arg1, (byte) 103, arg11, var28, arg14, var29, var25, arg8, false, (float) arg3, arg10, var22, arg13, var30, arg18);
        }
        arg11.method1761(arg20, arg1, arg14, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Len;IIIZ)V", line = 81)
    public void method277(class47 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field547++;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)V", line = 90)
    public static final void method278(int arg0, int arg1) {
        class208.field2951.method1236(-495037017, arg0);
        field554++;
        class291.field4573.method1236(-495037017, arg0);
        if (arg1 != 255) {
            field548 = (int[]) null;
        }
        class319.field4897.method1236(-495037017, arg0);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(III)Len;", line = 103)
    public class47 method279(int arg0, int arg1, int arg2) {
        field552++;
        return this;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V", line = 111)
    public static void method280(byte arg0) {
        field548 = null;
        if (arg0 <= 99) {
            method278(33, 53);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIII)V")
    public abstract void method12(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!en", name = "b", descriptor = "()I")
    public abstract int method11();

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIIIJILid;)V")
    public abstract void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class274 arg10);
}
