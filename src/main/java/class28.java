import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class28 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field352 = 1405;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII[FB)V")
    public static final void method161(int arg0, int arg1, int arg2, int arg3, int arg4, float[] arg5, byte arg6) {
        field353++;
        if (arg1 > 0 && !class88.method611(arg1, 2)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class88.method611(arg0, 2)) {
            int var7 = class284.method1887(arg2, false);
            int var8 = 0;
            int var9 = arg0 <= arg1 ? arg0 : arg1;
            int var10 = arg1 >> 1;
            int var11 = arg0 >> 1;
            float[] var12 = arg5;
            float[] var13 = new float[var7 * var10 * var11];
            if (arg6 != 123) {
                method161(111, 48, 119, -65, 19, null, (byte) 68);
            }
            while (true) {
                OpenGL.glTexImage2Df(arg3, var8, arg4, arg1, arg0, 0, arg2, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg1 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var15 + var14;
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
                        var19 += var14;
                        var18 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                arg0 = var11;
                arg1 = var10;
                var12 = var16;
                var8++;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
