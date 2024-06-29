import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class427 {

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lafa;")
    public static class348 field6029 = new class348("LIVE", 0);

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field6032 = 0;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "[I")
    public static int[] field6031 = null;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Lsga;")
    public static class70 field6034;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "[Lufa;")
    public static class680[] field6033;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII[FII)V", line = 3)
    public static final void method2446(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        field6028++;
        if (arg0 > 0 && !class143.method891(arg0, 0)) {
            throw new IllegalArgumentException("");
        } else if (arg5 <= 0 || class143.method891(arg5, 0)) {
            int var7 = class719.method4044(1, arg2);
            int var8 = 0;
            int var9 = arg0 >= arg5 ? arg5 : arg0;
            int var10 = arg0 >> 1;
            int var11 = -86 % ((-arg6 - 30) / 38);
            int var12 = arg5 >> 1;
            float[] var13 = arg4;
            float[] var14 = new float[var7 * var10 * var12];
            while (true) {
                OpenGL.glTexImage2Df(arg1, var8, arg3, arg0, arg5, 0, arg2, 5126, var13, 0);
                if (var9 <= 1) {
                    return;
                }
                int var15 = arg0 * var7;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var18 = var16;
                    int var19 = var16;
                    int var20 = var15 + var16;
                    for (int var21 = 0; var21 < var12; var21++) {
                        for (int var22 = 0; var22 < var10; var22++) {
                            float var23 = var13[var19];
                            int var24 = var7 + var19;
                            float var25 = var13[var24] + var23;
                            float var26 = var13[var20] + var25;
                            var19 = var7 + var24;
                            int var27 = var7 + var20;
                            float var28 = var13[var27] + var26;
                            var20 = var7 + var27;
                            var14[var18] = var28 * 0.25F;
                            var18 += var7;
                        }
                        var19 += var15;
                        var20 += var15;
                    }
                }
                float[] var17 = var14;
                var14 = var13;
                arg0 = var10;
                arg5 = var12;
                var13 = var17;
                var8++;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var12 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZII)Z", line = 103)
    public static final boolean method2447(boolean arg0, int arg1, int arg2) {
        field6027++;
        if (arg0) {
            return true;
        } else {
            return (arg1 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 117)
    public static void method2448(byte arg0) {
        field6034 = null;
        field6033 = null;
        if (arg0 < 5) {
            field6033 = null;
        }
        field6029 = null;
        field6031 = null;
    }
}
