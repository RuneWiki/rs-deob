import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class212 {

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Z")
    public static boolean field2566 = false;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Lqv;")
    public static class406 field2567 = new class406(1, 1);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II[FIIII)V", line = 11)
    public static final void method1271(int arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field2564++;
        if (arg5 > 0 && !class644.method3612(false, arg5)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class644.method3612(false, arg3)) {
            int var7 = class488.method2824(arg6, 10807);
            int var8 = 0;
            int var9 = -63 % ((65 - arg1) / 45);
            int var10 = arg3 > arg5 ? arg5 : arg3;
            int var11 = arg5 >> 1;
            int var12 = arg3 >> 1;
            float[] var13 = arg2;
            float[] var14 = new float[var7 * var12 * var11];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var8, arg0, arg5, arg3, 0, arg6, 5126, var13, 0);
                if (var10 <= 1) {
                    return;
                }
                int var15 = arg5 * var7;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var18 = var16;
                    int var19 = var16;
                    int var20 = var15 + var16;
                    for (int var21 = 0; var21 < var12; var21++) {
                        for (int var22 = 0; var22 < var11; var22++) {
                            float var23 = var13[var19];
                            int var24 = var7 + var19;
                            float var25 = var13[var24] + var23;
                            var19 = var7 + var24;
                            float var26 = var13[var20] + var25;
                            int var27 = var7 + var20;
                            float var28 = var13[var27] + var26;
                            var14[var18] = var28 * 0.25F;
                            var20 = var7 + var27;
                            var18 += var7;
                        }
                        var19 += var15;
                        var20 += var15;
                    }
                }
                float[] var17 = var14;
                var14 = var13;
                var13 = var17;
                arg3 = var12;
                arg5 = var11;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var12 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 112)
    public static void method1272(int arg0) {
        field2567 = null;
        if (arg0 < 10) {
            method1271(18, 92, null, -42, -41, 44, 124);
        }
    }
}
