import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class111 {

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public static int field1561 = 0;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "[I")
    public static int[] field1557 = new int[50];

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "Z")
    public static boolean field1560 = false;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "Lui;")
    public static class375 field1562 = new class375("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)Z", line = 3)
    public static final boolean method730(int arg0, byte arg1) {
        if (arg1 != -40) {
            method733(-75, 124, -1, null, (byte) -24, -96, 76);
        }
        field1559++;
        if (arg0 == 50 || arg0 == 47 || arg0 == 8 || arg0 == 12 || arg0 == 23) {
            return true;
        } else {
            return arg0 == 30 || arg0 == 1009;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V", line = 26)
    public static void method731(int arg0) {
        if (arg0 < -25) {
            field1562 = null;
            field1557 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIII)V", line = 41)
    public static final void method732(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 19083) {
            method733(-95, -31, 44, null, (byte) 2, 8, 27);
        }
        for (int var6 = arg0; var6 <= arg2; var6++) {
            class271.method1736(arg5, arg1, arg4, -11, class23.field356[var6]);
        }
        field1556++;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(III[FBII)V", line = 62)
    public static final void method733(int arg0, int arg1, int arg2, float[] arg3, byte arg4, int arg5, int arg6) {
        field1558++;
        if (arg4 != -39) {
            field1557 = null;
        }
        if (arg1 > 0 && !class124.method799(true, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class124.method799(true, arg0)) {
            int var7 = class519.method3091(arg4 + 9949, arg6);
            int var8 = 0;
            int var9 = arg0 > arg1 ? arg1 : arg0;
            int var10 = arg1 >> 1;
            int var11 = arg0 >> 1;
            float[] var12 = arg3;
            float[] var13 = new float[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg2, var8, arg5, arg1, arg0, 0, arg6, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg1 * var7;
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
                arg1 = var10;
                arg0 = var11;
                var12 = var15;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
