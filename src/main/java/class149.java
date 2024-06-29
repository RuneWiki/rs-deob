import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class149 {

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Lhb;")
    public static class318 field2244 = new class318(4);

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Z")
    public static volatile boolean field2245 = true;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Z")
    public static volatile boolean field2248 = false;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "[[[Lom;")
    public static class156[][][] field2246 = new class156[4][104][104];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Ldh;", line = 7)
    public static final class134 method1076(int arg0, int arg1) {
        if (arg1 != 1) {
            return (class134) null;
        }
        field2243++;
        class134 var2 = (class134) class42.field507.method2180((long) arg0, (byte) 31);
        if (var2 != null) {
            return var2;
        }
        class134 var3 = class135.method989(false, -71, class58.field724, class237.field3556, arg0);
        if (var3 != null) {
            class42.field507.method2175((long) arg0, var3, arg1 ^ 0xFFFFFFB3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 37)
    public static void method1077(byte arg0) {
        field2246 = (class156[][][]) null;
        if (arg0 != -59) {
            method1079(true, -95);
        }
        field2244 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([[IIZ[[F[III[[FZIZ[[F[ZLjf;I[[IZZIBII)V", line = 50)
    public static final void method1078(int[][] arg0, int arg1, boolean arg2, float[][] arg3, int[] arg4, int arg5, int arg6, float[][] arg7, boolean arg8, int arg9, boolean arg10, float[][] arg11, boolean[] arg12, class86 arg13, int arg14, int[][] arg15, boolean arg16, boolean arg17, int arg18, byte arg19, int arg20, int arg21) {
        int var22 = (arg6 << 8) + (arg10 ? 255 : 0);
        field2241++;
        int var23 = (arg2 ? 255 : 0) + (arg14 << 8);
        int var24 = (arg8 ? 255 : 0) + (arg9 << 8);
        int var25 = (arg16 ? 255 : 0) + (arg18 << 8);
        int[] var26 = new int[arg4.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg4[var27 + var27];
            int var29 = arg4[var27 + var27 + 1];
            int[][] var30 = arg15 == null || arg12 == null || !arg12[var27] ? arg0 : arg15;
            var26[var27] = class37.method254(arg13, (float) arg21, arg11, arg3, arg7, arg19, var25, var30, var28, arg17, arg20, false, arg1, var23, var29, var22, arg15, var24);
        }
        arg13.method597(arg5, arg20, arg1, var26, (int[]) null, arg17);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)V", line = 83)
    public static final void method1079(boolean arg0, int arg1) {
        field2240++;
        byte[][] var2;
        byte var3;
        if (class117.field1817 && arg0) {
            var2 = class21.field257;
            var3 = 1;
        } else {
            var2 = class73.field947;
            var3 = 4;
        }
        int var4 = var2.length;
        if (arg1 != -29213) {
            return;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (client.field1947[var5] >> 8) * 64 - class217.field3309;
            int var7 = (client.field1947[var5] & 0xFF) * 64 - class189.field2807;
            byte[] var8 = var2[var5];
            if (var8 != null) {
                class237.method1621(arg1 + 29323);
                class210.method1440(var8, var7, arg0, var6, (byte) -126, (class302.field4613 - 6) * 8, class325.field4896, (class66.field859 - 6) * 8);
            }
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (client.field1947[var9] >> 8) * 64 - class217.field3309;
            int var11 = (client.field1947[var9] & 0xFF) * 64 - class189.field2807;
            byte[] var12 = var2[var9];
            if (var12 == null && class302.field4613 < 800) {
                class237.method1621(arg1 + 29323);
                for (int var13 = 0; var13 < var3; var13++) {
                    class267.method1878(var11, var13, 0, 64, var10, 64);
                }
            }
        }
    }
}
