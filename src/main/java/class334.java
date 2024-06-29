import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class334 {

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public int field5163;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public int field5159;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public int field5161;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public int field5164;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field5158 = 0;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "Lam;")
    public static class269 field5162;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "[I")
    public static int[] field5157;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 8)
    public static void method2304(byte arg0) {
        field5157 = null;
        if (arg0 != -76) {
            method2305((float[][]) ((float[][]) null), (int[][]) ((int[][]) null), (class111) null, 121, (class62) null, -60, (float[][]) ((float[][]) null), (byte) -79, (float[][]) ((float[][]) null), (int[]) null, -56);
        }
        field5162 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([[F[[ILwc;ILsj;I[[FB[[F[II)V", line = 28)
    public static final void method2305(float[][] arg0, int[][] arg1, class111 arg2, int arg3, class62 arg4, int arg5, float[][] arg6, byte arg7, float[][] arg8, int[] arg9, int arg10) {
        field5160++;
        int[] var11 = new int[arg9.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg9[var12 + var12];
            int var14 = arg9[var12 + var12 + 1];
            if (arg3 == 1) {
                int var16 = var13;
                var13 = var14;
                var14 = 128 - var16;
            } else if (arg3 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg3 == 3) {
                int var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg6[arg5][arg10];
                var18 = arg8[arg5][arg10];
                var19 = arg0[arg5][arg10];
            } else if (var13 == 128 && var14 == 0) {
                var17 = arg6[arg5 + 1][arg10];
                var18 = arg8[arg5 + 1][arg10];
                var19 = arg0[arg5 + 1][arg10];
            } else if (var13 == 128 && var14 == 128) {
                var19 = arg0[arg5 + 1][arg10 + 1];
                var17 = arg6[arg5 + 1][arg10 + 1];
                var18 = arg8[arg5 + 1][arg10 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var19 = arg0[arg5][arg10 + 1];
                var18 = arg8[arg5][arg10 + 1];
                var17 = arg6[arg5][arg10 + 1];
            } else {
                float var20 = arg8[arg5][arg10];
                float var21 = arg0[arg5][arg10];
                float var22 = (float) var13 / 128.0F;
                float var23 = arg0[arg5][arg10 + 1];
                float var24 = arg6[arg5][arg10];
                float var25 = (arg8[arg5 + 1][arg10] - var20) * var22 + var20;
                float var26 = arg6[arg5][arg10 + 1];
                float var27 = arg8[arg5][arg10 + 1];
                float var28 = (arg6[arg5 + 1][arg10 + 1] - var26) * var22 + var26;
                float var29 = (float) var14 / 128.0F;
                float var30 = (arg6[arg5 + 1][arg10] - var24) * var22 + var24;
                float var31 = (arg8[arg5 + 1][arg10 + 1] - var27) * var22 + var27;
                var18 = (var31 - var25) * var29 + var25;
                float var32 = (arg0[arg5 + 1][arg10] - var21) * var22 + var21;
                var17 = (var28 - var30) * var29 + var30;
                float var33 = (arg0[arg5 + 1][arg10 + 1] - var23) * var22 + var23;
                var19 = (var33 - var32) * var29 + var32;
            }
            int var34 = (arg5 << 7) + var13;
            int var35 = class225.method1550(arg5, false, var13, arg10, arg1, var14);
            int var36 = (arg10 << 7) + var14;
            var11[var12] = arg2.method762(arg4, var34, var35, var36, var19, var18, var17);
        }
        arg2.method760(var11);
        if (arg7 <= 103) {
            method2305((float[][]) ((float[][]) null), (int[][]) ((int[][]) null), (class111) null, -69, (class62) null, -38, (float[][]) ((float[][]) null), (byte) 29, (float[][]) ((float[][]) null), (int[]) null, 23);
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V", line = 143)
    public class334() {
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Loi;)V", line = 145)
    public class334(class334 arg0) {
        this.field5163 = arg0.field5163;
        this.field5159 = arg0.field5159;
        this.field5161 = arg0.field5161;
        this.field5164 = arg0.field5164;
    }
}
