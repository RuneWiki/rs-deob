import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class583 {

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "Lfc;")
    public static class235 field8120 = new class235(96, 12);

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
    public static int field8123 = 0;

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field8124 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "Lof;")
    public static class568 field8122 = new class568(14, 4);

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "Lfc;")
    public static class235 field8125 = new class235(84, 16);

    @OriginalMember(owner = "client!tda", name = "g", descriptor = "Lkf;")
    public static class229 field8126 = new class229(4);

    @OriginalMember(owner = "client!tda", name = "i", descriptor = "I")
    public static int field8128 = 0;

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!tda", name = "h", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(III[BIII)V", line = 5)
    public static final void method3257(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        if (arg6 >= -25) {
            return;
        }
        field8121++;
        if (arg2 > 0 && !class17.method89(arg2, 508337774)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class17.method89(arg1, 508337774)) {
            int var7 = class418.method2386(-6407, arg0);
            int var8 = 0;
            int var9 = arg1 > arg2 ? arg2 : arg1;
            int var10 = arg2 >> 1;
            int var11 = arg1 >> 1;
            byte[] var12 = arg3;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var8, arg5, arg2, arg1, 0, arg0, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg2 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var16 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                arg1 = var11;
                var12 = var15;
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

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V", line = 105)
    public static void method3258(int arg0) {
        field8120 = null;
        field8124 = null;
        field8126 = null;
        field8125 = null;
        field8122 = null;
        if (arg0 != 16) {
            method3258(126);
        }
    }
}
