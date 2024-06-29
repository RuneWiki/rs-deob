import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class307 {

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public int field5003;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lnm;")
    public static class221 field5002;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Ljava/lang/String;")
    public String field5004;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Z")
    public static boolean field5005;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIBLnm;)Lle;", line = 8)
    public static final class137 method2143(int arg0, int arg1, byte arg2, class221 arg3) {
        if (arg2 != 44) {
            method2144(57);
        }
        field5006++;
        return class334.method2361(arg1, arg3, 16836, arg0) ? class177.method1245((byte) 32) : null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 28)
    public static void method2144(int arg0) {
        field5002 = null;
        if (arg0 != -1) {
            method2143(-115, -78, (byte) 124, (class221) null);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[[I[I[[FILhg;I[[FLni;I[[F)V", line = 43)
    public static final void method2145(int arg0, int[][] arg1, int[] arg2, float[][] arg3, int arg4, class330 arg5, int arg6, float[][] arg7, class241 arg8, int arg9, float[][] arg10) {
        field5008++;
        if (arg9 != -1) {
            method2145(0, (int[][]) ((int[][]) null), (int[]) null, (float[][]) ((float[][]) null), -34, (class330) null, 25, (float[][]) ((float[][]) null), (class241) null, 123, (float[][]) ((float[][]) null));
        }
        int[] var11 = new int[arg2.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg2[var12 + var12];
            int var14 = arg2[var12 + var12 + 1];
            if (arg4 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg4 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg4 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg7[arg0][arg6];
                var18 = arg10[arg0][arg6];
                var19 = arg3[arg0][arg6];
            } else if (var13 == 128 && var14 == 0) {
                var19 = arg3[arg0 + 1][arg6];
                var17 = arg7[arg0 + 1][arg6];
                var18 = arg10[arg0 + 1][arg6];
            } else if (var13 == 128 && var14 == 128) {
                var19 = arg3[arg0 + 1][arg6 + 1];
                var18 = arg10[arg0 + 1][arg6 + 1];
                var17 = arg7[arg0 + 1][arg6 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var18 = arg10[arg0][arg6 + 1];
                var19 = arg3[arg0][arg6 + 1];
                var17 = arg7[arg0][arg6 + 1];
            } else {
                float var20 = arg3[arg0][arg6];
                float var21 = arg7[arg0][arg6];
                float var22 = arg10[arg0][arg6];
                float var23 = (float) var14 / 128.0F;
                float var24 = (float) var13 / 128.0F;
                float var25 = (arg10[arg0 + 1][arg6] - var22) * var24 + var22;
                float var26 = (arg3[arg0 + 1][arg6] - var20) * var24 + var20;
                float var27 = (arg7[arg0 + 1][arg6] - var21) * var24 + var21;
                float var28 = arg3[arg0][arg6 + 1];
                float var29 = arg7[arg0][arg6 + 1];
                float var30 = (arg3[arg0 + 1][arg6 + 1] - var28) * var24 + var28;
                float var31 = arg10[arg0][arg6 + 1];
                float var32 = (arg10[arg0 + 1][arg6 + 1] - var31) * var24 + var31;
                var18 = (var32 - var25) * var23 + var25;
                var19 = (var30 - var26) * var23 + var26;
                float var33 = (arg7[arg0 + 1][arg6 + 1] - var29) * var24 + var29;
                var17 = (var33 - var27) * var23 + var27;
            }
            int var34 = (arg0 << 7) + var13;
            int var35 = (arg6 << 7) + var14;
            int var36 = class117.method760(arg6, var14, arg1, 1, var13, arg0);
            var11[var12] = arg5.method2356(arg8, var34, var36, var35, var17, var19, var18);
        }
        arg5.method2357(var11);
    }
}
