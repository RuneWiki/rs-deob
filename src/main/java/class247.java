import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class247 {

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "S")
    public static short field3435 = 32767;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Lkaa;")
    public static class47 field3432 = new class47(58, 4);

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "[Laba;")
    public static class177[] field3434;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIB[III)V", line = 3)
    public static final void method1526(int arg0, int arg1, int arg2, int arg3, byte arg4, int[] arg5, int arg6, int arg7) {
        field3433++;
        if (arg0 > 0 && !class538.method2993(arg0, -31218)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class538.method2993(arg2, -31218)) {
            int var8 = -51 % ((arg4 + 13) / 42);
            if (arg6 != 32993) {
                throw new IllegalArgumentException("");
            }
            int var9 = 0;
            int var10 = arg0 >= arg2 ? arg2 : arg0;
            int var11 = arg0 >> 1;
            int var12 = arg2 >> 1;
            int[] var13 = arg5;
            int[] var14 = new int[var11 * var12];
            while (true) {
                OpenGL.glTexImage2Di(arg1, var9, arg3, arg0, arg2, 0, arg6, arg7, var13, 0);
                if (var10 <= 1) {
                    return;
                }
                int var15 = 0;
                int var16 = 0;
                int var17 = var16 + arg0;
                int[] var18 = var14;
                for (int var19 = 0; var19 < var12; var19++) {
                    for (int var20 = 0; var20 < var11; var20++) {
                        int var21 = var13[var16++];
                        int var22 = var13[var17++];
                        int var23 = var13[var16++];
                        int var24 = var13[var17++];
                        int var25 = var21 >> 24 & 0xFF;
                        int var26 = (var21 & 0xFFAE) >> 8;
                        int var27 = (var21 & 0xFF08CD) >> 16;
                        int var28 = var21 & 0xFF;
                        int var29 = (var23 >> 24 & 0xFF) + var25;
                        int var30 = (var23 & 0xFF) + var28;
                        int var31 = ((var23 & 0xFF32) >> 8) + var26;
                        int var32 = (var23 >> 16 & 0xFF) + var27;
                        int var33 = ((var22 & 0xFFA2) >> 8) + var31;
                        int var34 = (var22 & 0xFF) + var30;
                        int var35 = ((var22 & 0xFF2D35) >> 16) + var32;
                        int var36 = (var22 >> 24 & 0xFF) + var29;
                        int var37 = (var24 >> 16 & 0xFF) + var35;
                        int var38 = (var24 >> 24 & 0xFF) + var36;
                        int var39 = (var24 >> 8 & 0xFF) + var33;
                        int var40 = (var24 & 0xFF) + var34;
                        var14[var15++] = class446.method2556(class446.method2556(class48.method346(var39 << 6, 65280), class446.method2556(class48.method346(var37 << 14, 16711680), class48.method346(var38, 1020) << 22)), class48.method346(var40, 1020) >> 2);
                    }
                    var16 += arg0;
                    var17 += arg0;
                }
                var14 = var13;
                arg0 = var11;
                arg2 = var12;
                var13 = var18;
                var12 >>= 0x1;
                var9++;
                var10 >>= 0x1;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V", line = 112)
    public static void method1527(byte arg0) {
        if (arg0 <= 4) {
            method1526(-76, -110, 71, -4, (byte) -7, null, 78, -110);
        }
        field3434 = null;
        field3432 = null;
    }
}
