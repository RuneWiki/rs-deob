import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class368 {

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "Z")
    public static boolean field5315 = false;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "Ljb;")
    public static class519 field5314 = new class519(87, -1);

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "[[Z")
    public static boolean[][] field5311;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lmfa;B)V", line = 4)
    public static final void method2306(class641 arg0, byte arg1) {
        field5313++;
        boolean var2 = false;
        arg0.method3659(1);
        if (arg1 < 95) {
            field5315 = true;
        }
        for (class641 var3 = (class641) class716.field9763.method152((byte) -13); var3 != null; var3 = (class641) class716.field9763.method146((byte) 97)) {
            if (class318.method2063(arg0.method3529((byte) 126), var3.method3529((byte) 126), 17229)) {
                class532.method3076(true, arg0, var3);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class716.field9763.method150(0, arg0);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "([IIIIIIII)V", line = 39)
    public static final void method2307(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5312++;
        if (arg5 > 0 && !class439.method2627(0, arg5)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class439.method2627(0, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg3 == 32993) {
            int var8 = 0;
            int var9 = arg2 > arg5 ? arg5 : arg2;
            int var10 = arg5 >> 1;
            int var11 = arg2 >> 1;
            int[] var12 = arg0;
            if (arg6 >= -77) {
                field5311 = null;
            }
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg4, var8, arg1, arg5, arg2, 0, arg3, arg7, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg5 + var15;
                int[] var17 = var13;
                for (int var18 = 0; var18 < var11; var18++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = var20 >> 24 & 0xFF;
                        int var24 = (var20 & 0xFF761C) >> 16;
                        int var25 = var12[var16++];
                        int var26 = (var20 & 0xFF39) >> 8;
                        int var27 = var20 & 0xFF;
                        int var28 = (var22 & 0xFF) + var27;
                        int var29 = (var22 >> 8 & 0xFF) + var26;
                        int var30 = ((var22 & 0xFF3287) >> 16) + var24;
                        int var31 = (var22 >> 24 & 0xFF) + var23;
                        int var32 = (var21 & 0xFF) + var28;
                        int var33 = ((var21 & 0xFF0C84) >> 16) + var30;
                        int var34 = (var21 >> 8 & 0xFF) + var29;
                        int var35 = (var21 >> 24 & 0xFF) + var31;
                        int var36 = (var25 >> 24 & 0xFF) + var35;
                        int var37 = (var25 >> 16 & 0xFF) + var33;
                        int var38 = ((var25 & 0xFF03) >> 8) + var34;
                        int var39 = (var25 & 0xFF) + var32;
                        var13[var14++] = class670.method3699(class519.method3018(255, var39 >> 2), class670.method3699(class519.method3018(var38, 1020) << 6, class670.method3699(class519.method3018(var36, 1020) << 22, class519.method3018(var37 << 14, 16711680))));
                    }
                    var16 += arg5;
                    var15 += arg5;
                }
                var13 = var12;
                var12 = var17;
                arg2 = var11;
                arg5 = var10;
                var10 >>= 0x1;
                var8++;
                var11 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V", line = 146)
    public static void method2308(byte arg0) {
        field5314 = null;
        if (arg0 < -88) {
            field5311 = null;
        }
    }
}
