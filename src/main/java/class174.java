import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class174 extends class297 {

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Z")
    public boolean field2655 = false;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "Leb;")
    public static class253 field2664 = null;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "I")
    public static int field2666 = 0;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public int field2660;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    public int field2663;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "Lje;")
    public static class158 field2658;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "Lni;")
    public static class202 field2662;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "[[[Lek;")
    public static class198[][][] field2665;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([[FLke;[[IIILdm;I[I[[F[[FI)V", line = 16)
    public static final void method1143(float[][] arg0, class239 arg1, int[][] arg2, int arg3, int arg4, class22 arg5, int arg6, int[] arg7, float[][] arg8, float[][] arg9, int arg10) {
        if (arg3 >= -1) {
            field2658 = (class158) null;
        }
        field2654++;
        int[] var11 = new int[arg7.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg7[var12 + var12];
            int var14 = arg7[var12 + var12 + 1];
            if (arg10 == 1) {
                int var16 = var13;
                var13 = var14;
                var14 = 128 - var16;
            } else if (arg10 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg10 == 3) {
                int var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg9[arg6][arg4];
                var18 = arg8[arg6][arg4];
                var19 = arg0[arg6][arg4];
            } else if (var13 == 128 && var14 == 0) {
                var19 = arg0[arg6 + 1][arg4];
                var18 = arg8[arg6 + 1][arg4];
                var17 = arg9[arg6 + 1][arg4];
            } else if (var13 == 128 && var14 == 128) {
                var17 = arg9[arg6 + 1][arg4 + 1];
                var19 = arg0[arg6 + 1][arg4 + 1];
                var18 = arg8[arg6 + 1][arg4 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var17 = arg9[arg6][arg4 + 1];
                var18 = arg8[arg6][arg4 + 1];
                var19 = arg0[arg6][arg4 + 1];
            } else {
                float var20 = arg8[arg6][arg4];
                float var21 = (float) var13 / 128.0F;
                float var22 = (float) var14 / 128.0F;
                float var23 = arg0[arg6][arg4];
                float var24 = arg9[arg6][arg4];
                float var25 = (arg0[arg6 + 1][arg4] - var23) * var21 + var23;
                float var26 = arg0[arg6][arg4 + 1];
                float var27 = (arg0[arg6 + 1][arg4 + 1] - var26) * var21 + var26;
                float var28 = arg9[arg6][arg4 + 1];
                float var29 = (arg8[arg6 + 1][arg4] - var20) * var21 + var20;
                float var30 = arg8[arg6][arg4 + 1];
                float var31 = (arg8[arg6 + 1][arg4 + 1] - var30) * var21 + var30;
                float var32 = (arg9[arg6 + 1][arg4 + 1] - var28) * var21 + var28;
                var18 = (var31 - var29) * var22 + var29;
                float var33 = (arg9[arg6 + 1][arg4] - var24) * var21 + var24;
                var19 = (var27 - var25) * var22 + var25;
                var17 = (var32 - var33) * var22 + var33;
            }
            int var34 = (arg6 << 7) + var13;
            int var35 = (arg4 << 7) + var14;
            int var36 = class216.method1459(arg6, var14, (byte) 122, arg4, var13, arg2);
            var11[var12] = arg5.method179(arg1, var34, var36, var35, var19, var17, var18);
        }
        arg5.method178(var11);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V", line = 132)
    public static void method1144(int arg0) {
        field2664 = null;
        field2662 = null;
        field2665 = (class198[][][]) null;
        field2658 = null;
        if (arg0 > -72) {
            method1144(105);
        }
    }
}
