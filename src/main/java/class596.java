import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class596 {

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "F")
    public static float field8166;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field8165;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "Lcr;")
    public static class112 field8163;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "Lud;")
    public static class519 field8164;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 8)
    public static void method3304(int arg0) {
        field8164 = null;
        if (arg0 == 255) {
            field8163 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BIIIIII[I)V", line = 24)
    public static final void method3305(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        field8165++;
        if (arg1 > 0 && !class144.method986(arg1, (byte) -124)) {
            throw new IllegalArgumentException("");
        } else if (arg6 > 0 && !class144.method986(arg6, (byte) -112)) {
            throw new IllegalArgumentException("");
        } else if (arg5 == 32993) {
            int var8 = 0;
            int var9 = arg1 < arg6 ? arg1 : arg6;
            if (arg0 != 67) {
                field8166 = 1.4360183F;
            }
            int var10 = arg1 >> 1;
            int var11 = arg6 >> 1;
            int[] var12 = arg7;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg3, var8, arg2, arg1, arg6, 0, arg5, arg4, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = var15 + arg1;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = var20 >> 8 & 0xFF;
                        int var24 = var12[var16++];
                        int var25 = var20 & 0xFF;
                        int var26 = var20 >> 24 & 0xFF;
                        int var27 = (var20 & 0xFFC3A8) >> 16;
                        int var28 = ((var22 & 0xFF25DD) >> 16) + var27;
                        int var29 = (var22 >> 8 & 0xFF) + var23;
                        int var30 = (var22 & 0xFF) + var25;
                        int var31 = (var22 >> 24 & 0xFF) + var26;
                        int var32 = (var21 >> 24 & 0xFF) + var31;
                        int var33 = (var21 >> 16 & 0xFF) + var28;
                        int var34 = (var21 >> 8 & 0xFF) + var29;
                        int var35 = (var21 & 0xFF) + var30;
                        int var36 = (var24 >> 8 & 0xFF) + var34;
                        int var37 = (var24 & 0xFF) + var35;
                        int var38 = (var24 >> 24 & 0xFF) + var32;
                        int var39 = (var24 >> 16 & 0xFF) + var33;
                        var13[var14++] = class288.method1722(class288.method1722(class230.method1424(var36 << 6, 65280), class288.method1722(class230.method1424(var39, 1020) << 14, class230.method1424(var38 << 22, -16777216))), class230.method1424(1020, var37) >> 2);
                    }
                    var16 += arg1;
                    var15 += arg1;
                }
                int[] var18 = var13;
                var13 = var12;
                arg6 = var11;
                var12 = var18;
                arg1 = var10;
                var10 >>= 0x1;
                var8++;
                var11 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
