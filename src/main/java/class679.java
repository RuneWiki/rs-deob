import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class679 implements class4 {

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Ljava/lang/String;")
    private String field9665;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Lvo;")
    private class345 field9666;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Leda;")
    public static class116 field9673 = new class116(48, 0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field9667;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field9669;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field9670;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field9671;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field9672;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field9668;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIII)V", line = 6)
    public static final void method3841(int arg0, int arg1, int arg2, int arg3) {
        field9667++;
        class63 var4 = class119.field1958[arg0][arg2];
        if (arg1 <= 56) {
            method3844(-32, 16, null, -99, -79, 42, 69);
        }
        class475.method2783((byte) 88, var4 == null ? class521.field7682 : var4, arg3);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V", line = 20)
    public static void method3842(byte arg0) {
        if (arg0 >= -86) {
            method3845((byte) 66);
        }
        field9673 = null;
        field9668 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)Z", line = 32)
    public static final boolean method3843(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field9673 = null;
        }
        field9669++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)Lsba;", line = 43)
    public final class387 method21(byte arg0) {
        field9671++;
        if (arg0 != -44) {
            this.field9666 = null;
        }
        return class387.field5669;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[FIIII)V", line = 55)
    public static final void method3844(int arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field9664++;
        if (arg4 > 0 && !class452.method2633(arg4, (byte) 127)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class452.method2633(arg3, (byte) 127)) {
            int var7 = class312.method1891(-105, arg5);
            int var8 = 0;
            if (arg0 > 104) {
                int var9 = arg3 <= arg4 ? arg3 : arg4;
                int var10 = arg4 >> 1;
                int var11 = arg3 >> 1;
                float[] var12 = arg2;
                float[] var13 = new float[var7 * var11 * var10];
                while (true) {
                    OpenGL.glTexImage2Df(arg1, var8, arg6, arg4, arg3, 0, arg5, 5126, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg4 * var7;
                    for (int var15 = 0; var15 < var7; var15++) {
                        int var17 = var15;
                        int var18 = var15;
                        int var19 = var14 + var15;
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
                    float[] var16 = var13;
                    var13 = var12;
                    arg3 = var11;
                    arg4 = var10;
                    var12 = var16;
                    var10 >>= 0x1;
                    var9 >>= 0x1;
                    var8++;
                    var11 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V", line = 153)
    public static final void method3845(byte arg0) {
        field9672++;
        int var1 = 84 % ((arg0 - 25) / 55);
        class43.field585.method1812(-1);
        class484.field6903 = null;
        class586.field8566 = null;
        class568.field8311 = 1;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lvo;Ljava/lang/String;)V", line = 169)
    public class679(class345 arg0, String arg1) {
        this.field9665 = arg1;
        this.field9666 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)I", line = 180)
    public final int method20(int arg0) {
        int var2 = 124 % ((arg0 + 32) / 59);
        field9670++;
        return this.field9666.method2072(this.field9665, -6257) ? 100 : this.field9666.method2084(false, this.field9665);
    }
}
