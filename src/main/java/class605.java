import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class605 {

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "[F")
    public static float[] field8499 = new float[4];

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "Lgk;")
    public static class616 field8500 = new class616();

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field8501;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I[FIIIII)V")
    public static final void method3380(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8498++;
        if (arg3 > 0 && !class483.method2792(arg3, arg6 ^ 0x3B7E)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class483.method2792(arg2, -3)) {
            if (arg6 != -15229) {
                field8502 = 85;
            }
            int var7 = class356.method2100((byte) -45, arg0);
            int var8 = 0;
            int var9 = arg3 >= arg2 ? arg2 : arg3;
            int var10 = arg3 >> 1;
            int var11 = arg2 >> 1;
            float[] var12 = arg1;
            float[] var13 = new float[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var8, arg5, arg3, arg2, 0, arg0, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg3 * var7;
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
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg3 = var10;
                arg2 = var11;
                var12 = var15;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public static void method3381(int arg0) {
        if (arg0 != 9402) {
            field8500 = null;
        }
        field8500 = null;
        field8499 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lr;B)V")
    public static final void method3382(class564 arg0, byte arg1) {
        if (class188.field2148) {
            class309.method1774(3, arg0);
        } else {
            class125.method715(arg0, (byte) 87);
        }
        if (arg1 < 92) {
            method3381(118);
        }
        field8501++;
    }
}
