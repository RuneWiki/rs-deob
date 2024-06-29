import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class336 {

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "F")
    public static float field4261;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Lg;")
    public class158 field4260;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIII[I)V")
    public static final void method1932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        field4262++;
        if (arg0 > 0 && !class54.method400(5533, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class54.method400(arg1 + 5278, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg6 == 32993) {
            int var8 = 0;
            int var9 = arg2 <= arg0 ? arg2 : arg0;
            int var10 = arg0 >> 1;
            int var11 = arg2 >> 1;
            int[] var12 = arg7;
            if (arg1 != 255) {
                method1932(-112, -47, -78, -87, -59, 59, -8, null);
            }
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg5, var8, arg4, arg0, arg2, 0, arg6, arg3, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = var15 + arg0;
                int[] var17 = var13;
                for (int var18 = 0; var18 < var11; var18++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var12[var16++];
                        int var24 = var20 >> 24 & 0xFF;
                        int var25 = (var20 & 0xFF02) >> 8;
                        int var26 = var20 & 0xFF;
                        int var27 = (var20 & 0xFFFAF9) >> 16;
                        int var28 = (var21 >> 16 & 0xFF) + var27;
                        int var29 = (var21 >> 8 & 0xFF) + var25;
                        int var30 = (var21 >> 24 & 0xFF) + var24;
                        int var31 = (var21 & 0xFF) + var26;
                        int var32 = (var22 >> 24 & 0xFF) + var30;
                        int var33 = (var22 & 0xFF) + var31;
                        int var34 = (var22 >> 16 & 0xFF) + var28;
                        int var35 = ((var22 & 0xFFA7) >> 8) + var29;
                        int var36 = (var23 >> 24 & 0xFF) + var32;
                        int var37 = ((var23 & 0xFFCB) >> 8) + var35;
                        int var38 = ((var23 & 0xFF078C) >> 16) + var34;
                        int var39 = (var23 & 0xFF) + var33;
                        var13[var14++] = class683.method3840(class683.method3840(class683.method3840(class702.method3949(var36 << 22, -16777216), class702.method3949(16711680, var38 << 14)), class702.method3949(65280, var37 << 6)), class702.method3949(var39, 1020) >> 2);
                    }
                    var15 += arg0;
                    var16 += arg0;
                }
                var13 = var12;
                var12 = var17;
                arg0 = var10;
                arg2 = var11;
                var8++;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
