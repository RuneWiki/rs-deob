import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public abstract class class241 {

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "[[I")
    public static int[][] field3385 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public static int field3387 = 0;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "[I")
    public static int[] field3388 = new int[2];

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "D")
    public static double field3386;

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)Z")
    public static final boolean method1510(int arg0, int arg1, int arg2) {
        field3389++;
        if (arg1 != 28466) {
            field3387 = -51;
        }
        return (arg0 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(II[FIIZI)V")
    public static final void method1511(int arg0, int arg1, float[] arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3390++;
        if (arg1 > 0 && !class538.method2993(arg1, -31218)) {
            throw new IllegalArgumentException("");
        }
        if (!arg5) {
            method1510(-100, -12, 11);
        }
        if (arg3 > 0 && !class538.method2993(arg3, -31218)) {
            throw new IllegalArgumentException("");
        }
        int var7 = class131.method1023(arg6, (byte) -68);
        int var8 = 0;
        int var9 = arg3 <= arg1 ? arg3 : arg1;
        int var10 = arg1 >> 1;
        int var11 = arg3 >> 1;
        float[] var12 = arg2;
        float[] var13 = new float[var7 * var10 * var11];
        while (true) {
            OpenGL.glTexImage2Df(arg0, var8, arg4, arg1, arg3, 0, arg6, 5126, var12, 0);
            if (var9 <= 1) {
                return;
            }
            int var14 = arg1 * var7;
            for (int var15 = 0; var15 < var7; var15++) {
                int var17 = var15;
                int var18 = var15;
                int var19 = var14 + var15;
                for (int var20 = 0; var20 < var11; var20++) {
                    for (int var21 = 0; var21 < var10; var21++) {
                        float var22 = var12[var18];
                        int var23 = var7 + var18;
                        float var24 = var12[var23] + var22;
                        float var25 = var12[var19] + var24;
                        var18 = var7 + var23;
                        int var26 = var7 + var19;
                        float var27 = var12[var26] + var25;
                        var19 = var7 + var26;
                        var13[var17] = var27 * 0.25F;
                        var17 += var7;
                    }
                    var19 += var14;
                    var18 += var14;
                }
            }
            float[] var16 = var13;
            var13 = var12;
            arg1 = var10;
            var12 = var16;
            arg3 = var11;
            var10 >>= 0x1;
            var9 >>= 0x1;
            var8++;
            var11 >>= 0x1;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V")
    public static void method1512(byte arg0) {
        field3388 = null;
        if (arg0 >= -59) {
            method1510(-91, -37, 77);
        }
        field3385 = null;
    }
}
