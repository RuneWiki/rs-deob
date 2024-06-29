import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class614 {

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "[I")
    public static int[] field8665 = new int[64];

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "I")
    public static int field8661;

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "Ljava/lang/String;")
    public static String field8662;

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "[Lvs;")
    public static class593[] field8664;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V")
    public static void method3552(int arg0) {
        int var1 = -50 / ((-arg0 - 48) / 48);
        field8665 = null;
        field8664 = null;
        field8662 = null;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IZILjn;)J")
    public static final long method3553(int arg0, boolean arg1, int arg2, class721 arg3) {
        field8661++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class211 var8 = class239.field3470.method388(arg3.method317(121), 100);
        long var9 = (long) (arg2 | 0x800000 << 7 | arg0 | arg3.method309((byte) -53) << 14 | arg3.method327(-125) << 20);
        if (var8.field3113 == 0) {
            var9 |= var6;
        }
        if (var8.field3123 == 1) {
            var9 |= var4;
        }
        long var11 = var9 | (long) arg3.method317(113) << 32;
        if (arg1) {
            field8662 = null;
        }
        return var11;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I[FIIIII)V")
    public static final void method3554(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8663++;
        if (arg6 > 0 && !class627.method3619(2, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class627.method3619(arg5 - 1057731166, arg4)) {
            int var7 = class157.method1158(false, arg3);
            int var8 = 0;
            int var9 = arg6 < arg4 ? arg6 : arg4;
            int var10 = arg6 >> 1;
            int var11 = arg4 >> 1;
            float[] var12 = arg1;
            if (arg5 != 1057731168) {
                method3552(-57);
            }
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg0, var8, arg2, arg6, arg4, 0, arg3, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg6 * var7;
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
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
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
                arg4 = var11;
                arg6 = var10;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
