import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class479 {

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "Luc;")
    public static class27 field5959 = new class27(0, 4);

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "[I")
    public static int[] field5965 = new int[16];

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "Ldr;")
    public static class675 field5960 = new class675(70, -2);

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "F")
    public static float field5961;

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "Lgo;")
    public static class586 field5964;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lji;B)Lqi;")
    public static final class532 method2616(class572 arg0, byte arg1) {
        if (arg1 <= 16) {
            field5961 = -0.92132443F;
        }
        field5963++;
        class532 var2 = new class532();
        var2.field6720 = arg0.method3031(-1);
        var2.field6730 = class471.field5810.method3267(var2.field6720, 72);
        return var2;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "([FIIBIII)V")
    public static final void method2617(float[] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field5962++;
        if (arg2 > 0 && !class182.method1084((byte) 109, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg6 <= 0 || class182.method1084((byte) 80, arg6)) {
            int var7 = class285.method1717(1, arg1);
            int var8 = 0;
            int var9 = arg6 > arg2 ? arg2 : arg6;
            int var10 = arg2 >> 1;
            int var11 = arg6 >> 1;
            float[] var12 = arg0;
            if (arg3 >= -126) {
                method2617(null, 72, 106, (byte) 98, -114, -29, -108);
            }
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg5, var8, arg4, arg2, arg6, 0, arg1, 5126, var12, 0);
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
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
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
                var13 = var12;
                var12 = var15;
                arg6 = var11;
                arg2 = var10;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)V")
    public static void method2618(int arg0) {
        field5965 = null;
        if (arg0 != 16392) {
            method2616(null, (byte) 3);
        }
        field5959 = null;
        field5964 = null;
        field5960 = null;
    }
}
