import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class621 extends Exception {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Z")
    public static boolean field8658 = false;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z[FIIIII)V", line = 11)
    public static final void method3452(boolean arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8659++;
        if (arg2 > 0 && !class284.method1835(arg2, 49)) {
            throw new IllegalArgumentException("");
        } else if (arg6 <= 0 || class284.method1835(arg6, 94)) {
            int var7 = class385.method2304(-15499, arg3);
            int var8 = 0;
            int var9 = arg2 < arg6 ? arg2 : arg6;
            int var10 = arg2 >> 1;
            int var11 = arg6 >> 1;
            float[] var12 = arg1;
            if (!arg0) {
                field8658 = true;
            }
            float[] var13 = new float[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var8, arg5, arg2, arg6, 0, arg3, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg2 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg6 = var11;
                arg2 = var10;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
