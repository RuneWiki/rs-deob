import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class701 extends class631 {

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "Leba;")
    public static class550 field9867 = new class550(72, -1);

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "Leba;")
    public static class550 field9868 = new class550(38, 2);

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "Ltt;")
    public static class338 field9870 = new class338(7, 2);

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    public static int field9864;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public static int field9866;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    public static int field9872;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "Laq;")
    public class701 field9865;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "Laq;")
    public class701 field9869;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V")
    public static void method3939(boolean arg0) {
        field9867 = null;
        field9868 = null;
        field9870 = null;
        if (arg0) {
            method3939(false);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
    public final void method3940(int arg0) {
        field9866++;
        int var2 = -37 % ((-arg0 - 59) / 62);
        if (this.field9869 != null) {
            this.field9869.field9865 = this.field9865;
            this.field9865.field9869 = this.field9869;
            this.field9865 = null;
            this.field9869 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIII[F)V")
    public static final void method3941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        field9864++;
        if (arg4 > 0 && !class355.method2093(arg4, 1)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class355.method2093(arg2, 1)) {
            int var7 = class409.method2320(arg1, false);
            int var8 = 0;
            int var9 = arg4 < arg2 ? arg4 : arg2;
            int var10 = arg4 >> 1;
            int var11 = 7 / ((-arg3 - 39) / 50);
            int var12 = arg2 >> 1;
            float[] var13 = arg6;
            float[] var14 = new float[var10 * var12 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg5, var8, arg0, arg4, arg2, 0, arg1, 5126, var13, 0);
                if (var9 <= 1) {
                    return;
                }
                int var15 = arg4 * var7;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var18 = var16;
                    int var19 = var16;
                    int var20 = var16 + var15;
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
                arg2 = var12;
                arg4 = var10;
                var13 = var17;
                var12 >>= 0x1;
                var8++;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
