import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class177 extends class224 {

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "Lok;")
    public static class41 field2870 = class137.method956(" )2> <col=00ffff>", 45);

    @OriginalMember(owner = "client!uf", name = "cb", descriptor = "Lok;")
    public static class41 field2881 = class137.method956("Card:", 45);

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "Z")
    public static boolean field2880 = false;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "I")
    public int field2875;

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!uf", name = "db", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "Lal;")
    public class134 field2879;

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "Lclient;")
    public static client field2878;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2872;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "[B")
    public byte[] field2869;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V", line = 7)
    public static void method1263(int arg0) {
        if (arg0 != -19234) {
            field2870 = (class41) null;
        }
        field2870 = null;
        field2881 = null;
        field2872 = null;
        field2878 = null;
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(B)I", line = 28)
    public final int method1264(byte arg0) {
        field2871++;
        if (this.field3590) {
            return 0;
        } else if (arg0 >= -65) {
            return 42;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)V", line = 45)
    public static final void method1265(byte arg0, int arg1) {
        if (arg0 != 7) {
            method1263(-22);
        }
        field2873++;
        class285.field4632.method138(arg1, 0);
        class111.field1576.method138(arg1, 0);
        class217.field3480.method138(arg1, 0);
        class158.field2484.method138(arg1, 0);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Z)[B", line = 62)
    public final byte[] method1266(boolean arg0) {
        if (arg0) {
            return (byte[]) null;
        }
        field2874++;
        if (this.field3590) {
            throw new RuntimeException();
        }
        return this.field2869;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILdg;Z[[I[I[[FIIZZZIII[[FBI[Z[[III[[F)V", line = 98)
    public static final void method1267(int arg0, class6 arg1, boolean arg2, int[][] arg3, int[] arg4, float[][] arg5, int arg6, int arg7, boolean arg8, boolean arg9, boolean arg10, int arg11, int arg12, int arg13, float[][] arg14, byte arg15, int arg16, boolean[] arg17, int[][] arg18, int arg19, int arg20, float[][] arg21) {
        field2882++;
        int var22 = (arg20 << 8) + (arg2 ? 255 : 0);
        int var23 = (arg10 ? 255 : 0) + (arg7 << 8);
        int var24 = (arg19 << 8) + (arg8 ? 255 : 0);
        if (arg11 != 255) {
            method1265((byte) 126, 10);
        }
        int var25 = (arg9 ? 255 : 0) + (arg13 << 8);
        int[] var26 = new int[arg4.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg4[var27 + var27];
            int[][] var29 = arg18 == null || arg17 == null || !arg17[var27] ? arg3 : arg18;
            int var30 = arg4[var27 + var27 + 1];
            var26[var27] = class149.method1035(arg0, arg21, arg18, arg5, var22, var23, (byte) -95, arg15, arg6, false, arg14, (float) arg16, var29, var25, var24, arg1, var28, var30);
        }
        arg1.method25(arg12, arg0, arg6, var26, (int[]) null, false);
    }
}
