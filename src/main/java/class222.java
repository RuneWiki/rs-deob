import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class222 extends class296 {

    @OriginalMember(owner = "client!pfa", name = "C", descriptor = "Lra;")
    public static class361 field2900 = new class361(98, -2);

    @OriginalMember(owner = "client!pfa", name = "G", descriptor = "I")
    public static int field2904 = 0;

    @OriginalMember(owner = "client!pfa", name = "H", descriptor = "Lnj;")
    public static class415 field2905 = new class415(27, -1);

    @OriginalMember(owner = "client!pfa", name = "I", descriptor = "I")
    public static int field2906 = -1;

    @OriginalMember(owner = "client!pfa", name = "B", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!pfa", name = "E", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!pfa", name = "F", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!pfa", name = "D", descriptor = "Loo;")
    public static class10 field2901;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(FI)V", line = 5)
    public final void method1308(float arg0, int arg1) {
        ++field2902;
        if (arg1 <= 35) {
            field2904 = 98;
        }
        super.field3873 = arg0;
    }

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "(B)V", line = 22)
    public static void method1407(byte arg0) {
        if (arg0 >= -11) {
            field2906 = 121;
        }
        field2900 = null;
        field2905 = null;
        field2901 = null;
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(IIIIIF)V", line = 35)
    public class222(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BII[FIII)V", line = 40)
    public static final void method1408(byte arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6) {
        ++field2899;
        if (arg5 > 0 && !class386.method2202(-98, arg5)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class386.method2202(-126, arg1)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class168.method1158(arg4, (byte) 67);
            int var8 = 0;
            int var9 = arg1 <= arg5 ? arg1 : arg5;
            int var10 = arg5 >> 1;
            int var11 = arg1 >> 1;
            float[] var12 = arg3;
            if (arg0 > 65) {
                float[] var13 = new float[var10 * var11 * var7];
                while (true) {
                    OpenGL.glTexImage2Df(arg2, var8, arg6, arg5, arg1, 0, arg4, 5126, var12, 0);
                    if (~var9 >= -2) {
                        return;
                    }
                    int var14 = arg5 * var7;
                    float[] var15 = var13;
                    for (int var16 = 0; var16 < var7; ++var16) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var14 + var16;
                        for (int var20 = 0; ~var11 < ~var20; ++var20) {
                            for (int var21 = 0; ~var10 < ~var21; ++var21) {
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
                            var18 += var14;
                            var19 += var14;
                        }
                    }
                    var13 = var12;
                    arg5 = var10;
                    arg1 = var11;
                    var12 = var15;
                    ++var8;
                    var9 >>= 1;
                    var11 >>= 1;
                    var10 >>= 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BIII)V", line = 138)
    public final void method1309(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 106) {
            ++field2903;
            super.field3880 = arg3;
            super.field3876 = arg2;
            super.field3878 = arg1;
        }
    }
}
