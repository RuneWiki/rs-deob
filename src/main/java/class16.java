import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class16 {

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "S")
    public short field295;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "Z")
    public boolean field299;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "S")
    public short field290;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public int field293;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "B")
    public byte field292;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "S")
    public short field297;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "Lhj;")
    public static class596 field294 = new class596(60, 6);

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "Lhj;")
    public static class596 field301 = new class596(41, 2);

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "Lhj;")
    public static class596 field302 = new class596(51, -1);

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "Lpl;")
    public static class678 field300;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)Z", line = 5)
    public static final boolean method203(int arg0, byte arg1) {
        field298++;
        if (arg1 != 55) {
            field301 = null;
        }
        return arg0 != 1 && arg0 != 7;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V", line = 30)
    public static void method204(int arg0) {
        field301 = null;
        field300 = null;
        field302 = null;
        field294 = null;
        if (arg0 != 0) {
            method205(null, 122, -5, -125, 115, 116, 36);
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 44)
    public class16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field295 = (short) arg6;
        this.field299 = arg10;
        this.field290 = (short) arg5;
        this.field287 = arg3;
        this.field288 = arg0;
        this.field293 = arg1;
        this.field289 = arg2;
        this.field292 = (byte) arg8;
        this.field296 = arg11;
        this.field297 = (short) arg4;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "([FIIIIII)V", line = 66)
    public static final void method205(float[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field291++;
        if (arg5 > 0 && !class152.method1091(arg5, -31)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class152.method1091(arg4, -112)) {
            int var7 = class65.method546(arg3, (byte) -73);
            int var8 = 0;
            int var9 = arg5 >= arg4 ? arg4 : arg5;
            int var10 = arg5 >> 1;
            int var11 = arg4 >> 1;
            if (arg1 != 1769) {
                field300 = null;
            }
            float[] var12 = arg0;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg6, var8, arg2, arg5, arg4, 0, arg3, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg5 * var7;
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
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                arg4 = var11;
                arg5 = var10;
                var12 = var15;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
