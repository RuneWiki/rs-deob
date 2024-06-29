import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class730 {

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field10125 = 0;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field10129 = 13156520;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field10126 = 0;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field10127;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field10128;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Lqn;")
    public static class70 field10124;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 9)
    public static void method4053(int arg0) {
        field10124 = null;
        if (arg0 != -28474) {
            field10124 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIII[F)V", line = 21)
    public static final void method4054(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        field10127++;
        if (arg0 > 0 && !class117.method957(-6602, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class117.method957(-6602, arg2)) {
            int var7 = class639.method3561(arg1, false);
            int var8 = 0;
            int var9 = arg0 >= arg2 ? arg2 : arg0;
            int var10 = arg0 >> 1;
            int var11 = arg2 >> 1;
            int var12 = 96 % ((arg5 + 27) / 48);
            float[] var13 = arg6;
            float[] var14 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg3, var8, arg4, arg0, arg2, 0, arg1, 5126, var13, 0);
                if (var9 <= 1) {
                    return;
                }
                int var15 = arg0 * var7;
                float[] var16 = var14;
                for (int var17 = 0; var17 < var7; var17++) {
                    int var18 = var17;
                    int var19 = var17;
                    int var20 = var15 + var17;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var10; var22++) {
                            float var23 = var13[var19];
                            int var24 = var7 + var19;
                            float var25 = var13[var24] + var23;
                            float var26 = var13[var20] + var25;
                            var19 = var7 + var24;
                            int var27 = var7 + var20;
                            float var28 = var13[var27] + var26;
                            var14[var18] = var28 * 0.25F;
                            var20 = var7 + var27;
                            var18 += var7;
                        }
                        var20 += var15;
                        var19 += var15;
                    }
                }
                var14 = var13;
                arg2 = var11;
                var13 = var16;
                arg0 = var10;
                var8++;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)V", line = 121)
    public static final void method4055(int arg0, byte arg1) {
        class354.field5196 = -1;
        class653.field9062 = 3;
        field10128++;
        if (arg1 != 51) {
            field10124 = null;
        }
        class526.field7210 = 100;
        class258.field3853 = arg0;
    }
}
