import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
    public static int[] field222 = new int[14];

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Z")
    public static boolean field223;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 9)
    public static void method109(int arg0) {
        if (arg0 <= -29) {
            field222 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([IIIIIIII)V", line = 25)
    public static final void method110(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field221++;
        if (arg1 > 0 && !class627.method3619(2, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class627.method3619(2, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg2 == 32993) {
            int var8 = arg3;
            int var9 = arg4 > arg1 ? arg1 : arg4;
            int var10 = arg1 >> 1;
            int var11 = arg4 >> 1;
            int[] var12 = arg0;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg6, var8, arg5, arg1, arg4, 0, arg2, arg7, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg1 + var15;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var20 & 0xFF;
                        int var24 = var20 >> 24 & 0xFF;
                        int var25 = var20 >> 16 & 0xFF;
                        int var26 = var20 >> 8 & 0xFF;
                        int var27 = var12[var16++];
                        int var28 = (var21 >> 24 & 0xFF) + var24;
                        int var29 = (var21 >> 16 & 0xFF) + var25;
                        int var30 = (var21 & 0xFF) + var23;
                        int var31 = ((var21 & 0xFFE3) >> 8) + var26;
                        int var32 = (var22 >> 16 & 0xFF) + var29;
                        int var33 = ((var22 & 0xFF80) >> 8) + var31;
                        int var34 = (var22 & 0xFF) + var30;
                        int var35 = (var22 >> 24 & 0xFF) + var28;
                        int var36 = ((var27 & 0xFF1A) >> 8) + var33;
                        int var37 = (var27 >> 24 & 0xFF) + var35;
                        int var38 = (var27 & 0xFF) + var34;
                        int var39 = ((var27 & 0xFFBFA5) >> 16) + var32;
                        var13[var14++] = class625.method3600(class493.method2943(255, var38 >> 2), class625.method3600(class493.method2943(65280, var36 << 6), class625.method3600(class493.method2943(var37, 1020) << 22, class493.method2943(var39, 1020) << 14)));
                    }
                    var15 += arg1;
                    var16 += arg1;
                }
                int[] var18 = var13;
                var13 = var12;
                var12 = var18;
                arg1 = var10;
                arg4 = var11;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
