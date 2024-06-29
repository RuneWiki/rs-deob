import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class62 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
    public static final String method754(int arg0, int arg1, boolean arg2) {
        field1418++;
        if (arg1 != -2) {
            method754(-46, 58, false);
        }
        return arg2 && arg0 >= 0 ? class699.method3905(10, arg0, arg2, -116) : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIII[FI)V")
    public static final void method755(int arg0, int arg1, int arg2, int arg3, int arg4, float[] arg5, int arg6) {
        field1419++;
        if (arg4 > 0 && !class141.method1144(0, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class141.method1144(0, arg0)) {
            int var7 = class680.method3826(-99, arg1);
            int var8 = 0;
            if (arg6 < -46) {
                int var9 = arg0 <= arg4 ? arg0 : arg4;
                int var10 = arg4 >> 1;
                int var11 = arg0 >> 1;
                float[] var12 = arg5;
                float[] var13 = new float[var7 * var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Df(arg3, var8, arg2, arg4, arg0, 0, arg1, 5126, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg4 * var7;
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
                                var19 = var7 + var26;
                                var13[var17] = var27 * 0.25F;
                                var17 += var7;
                            }
                            var19 += var14;
                            var18 += var14;
                        }
                    }
                    float[] var16 = var13;
                    var13 = var12;
                    arg0 = var11;
                    var12 = var16;
                    arg4 = var10;
                    var11 >>= 0x1;
                    var10 >>= 0x1;
                    var9 >>= 0x1;
                    var8++;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!sh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1417++;
        throw new IllegalStateException();
    }
}
