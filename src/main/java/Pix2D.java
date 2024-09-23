import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AFCKELYG")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "AFCKELYG", name = "i", descriptor = "I")
    private static int _flowObfuscator4 = 1;

    @OriginalMember(owner = "AFCKELYG", name = "j", descriptor = "Z")
    private static boolean _flowObfuscator5 = true;

    @OriginalMember(owner = "AFCKELYG", name = "k", descriptor = "I")
    private static int _flowObfuscator6 = -12499;

    @OriginalMember(owner = "AFCKELYG", name = "q", descriptor = "I")
    public static int boundBottom;

    @OriginalMember(owner = "AFCKELYG", name = "r", descriptor = "I")
    public static int boundLeft;

    @OriginalMember(owner = "AFCKELYG", name = "s", descriptor = "I")
    public static int boundRight;

    @OriginalMember(owner = "AFCKELYG", name = "p", descriptor = "I")
    public static int boundTop;

    @OriginalMember(owner = "AFCKELYG", name = "v", descriptor = "I")
    public static int centerH2D;

    @OriginalMember(owner = "AFCKELYG", name = "u", descriptor = "I")
    public static int centerW2D;

    @OriginalMember(owner = "AFCKELYG", name = "o", descriptor = "I")
    public static int height2d;

    @OriginalMember(owner = "AFCKELYG", name = "t", descriptor = "I")
    public static int safeWidth;

    @OriginalMember(owner = "AFCKELYG", name = "n", descriptor = "I")
    public static int width2d;

    @OriginalMember(owner = "AFCKELYG", name = "l", descriptor = "Z")
    private static boolean _flowObfuscator7;

    @OriginalMember(owner = "AFCKELYG", name = "w", descriptor = "Z")
    public static boolean _flowObfuscator8;

    @OriginalMember(owner = "AFCKELYG", name = "m", descriptor = "[I")
    public static int[] data;

    @OriginalMember(owner = "AFCKELYG", name = "a", descriptor = "(III[I)V")
    public static void bind(int arg0, int arg1, int arg2, int[] arg3) {
        data = arg3;
        while (arg2 >= 0) {
            _flowObfuscator4 = 275;
        }
        width2d = arg1;
        height2d = arg0;
        setClipping(arg0, 0, false, arg1, 0);
    }

    @OriginalMember(owner = "AFCKELYG", name = "a", descriptor = "(I)V")
    public static void resetClipping(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            return;
        }
        boundLeft = 0;
        boundTop = 0;
        boundRight = width2d;
        boundBottom = height2d;
        safeWidth = boundRight - 1;
        centerW2D = boundRight / 2;
    }

    @OriginalMember(owner = "AFCKELYG", name = "a", descriptor = "(IIZII)V")
    public static void setClipping(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg3 > width2d) {
            arg3 = width2d;
        }
        if (arg0 > height2d) {
            arg0 = height2d;
        }
        boundLeft = arg1;
        boundTop = arg4;
        boundRight = arg3;
        boundBottom = arg0;
        safeWidth = boundRight - 1;
        if (arg2) {
            _flowObfuscator4 = 458;
        }
        centerW2D = boundRight / 2;
        centerH2D = boundBottom / 2;
    }

    @OriginalMember(owner = "AFCKELYG", name = "a", descriptor = "(Z)V")
    public static void clear(boolean arg0) {
        if (!arg0) {
            _flowObfuscator7 = !_flowObfuscator7;
        }
        int var1 = width2d * height2d;
        for (int var2 = 0; var2 < var1; var2++) {
            data[var2] = 0;
        }
    }

    @OriginalMember(owner = "AFCKELYG", name = "a", descriptor = "(IIIIIII)V")
    public static void fillRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 < boundLeft) {
            arg2 -= boundLeft - arg6;
            arg6 = boundLeft;
        }
        if (arg1 < boundTop) {
            arg3 -= boundTop - arg1;
            arg1 = boundTop;
        }
        if (arg2 + arg6 > boundRight) {
            arg2 = boundRight - arg6;
        }
        if (arg1 + arg3 > boundBottom) {
            arg3 = boundBottom - arg1;
        }
        int var7 = 256 - arg4;
        int var8 = (arg0 >> 16 & 0xFF) * arg4;
        int var9 = (arg0 >> 8 & 0xFF) * arg4;
        int var10 = (arg0 & 0xFF) * arg4;
        int var11 = width2d - arg2;
        int var12 = width2d * arg1 + arg6;
        for (int var13 = 0; var13 < arg3; var13++) {
            for (int var14 = -arg2; var14 < 0; var14++) {
                int var15 = (data[var12] >> 16 & 0xFF) * var7;
                int var16 = (data[var12] >> 8 & 0xFF) * var7;
                int var17 = (data[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                data[var12++] = var18;
            }
            var12 += var11;
        }
        if (arg5 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "AFCKELYG", name = "a", descriptor = "(IIIIII)V")
    public static void fillRect(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < boundLeft) {
            arg4 -= boundLeft - arg2;
            arg2 = boundLeft;
        }
        if (arg1 < boundTop) {
            arg0 -= boundTop - arg1;
            arg1 = boundTop;
        }
        if (arg2 + arg4 > boundRight) {
            arg4 = boundRight - arg2;
        }
        if (arg0 + arg1 > boundBottom) {
            arg0 = boundBottom - arg1;
        }
        int var6 = width2d - arg4;
        int var7 = width2d * arg1 + arg2;
        if (arg5 != 0) {
            _flowObfuscator4 = -374;
        }
        for (int var8 = -arg0; var8 < 0; var8++) {
            for (int var9 = -arg4; var9 < 0; var9++) {
                data[var7++] = arg3;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "AFCKELYG", name = "a", descriptor = "(IIIIIZ)V")
    public static void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        hline(arg4, arg3, arg1, arg0, (byte) 4);
        hline(arg2 + arg4 - 1, arg3, arg1, arg0, (byte) 4);
        vline(arg4, arg3, arg2, arg0, _flowObfuscator6);
        vline(arg4, arg3, arg2, arg0 + arg1 - 1, _flowObfuscator6);
        if (arg5) {
            ;
        }
    }

    @OriginalMember(owner = "AFCKELYG", name = "b", descriptor = "(IIIIIII)V")
    public static void drawRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        hlineTrans(arg3, arg4, arg0, true, arg2, arg5);
        if (arg6 != -17319) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        hlineTrans(arg3, arg4, arg0 + arg1 - 1, true, arg2, arg5);
        if (arg1 >= 3) {
            vlineTrans(arg3, arg5, arg2, arg0 + 1, (byte) 3, arg1 - 2);
            vlineTrans(arg3, arg4 + arg5 - 1, arg2, arg0 + 1, (byte) 3, arg1 - 2);
        }
    }

    @OriginalMember(owner = "AFCKELYG", name = "a", descriptor = "(IIIIB)V")
    public static void hline(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg0 < boundTop || arg0 >= boundBottom) {
            return;
        }
        if (arg3 < boundLeft) {
            arg2 -= boundLeft - arg3;
            arg3 = boundLeft;
        }
        if (arg2 + arg3 > boundRight) {
            arg2 = boundRight - arg3;
        }
        int var5 = width2d * arg0 + arg3;
        if (arg4 == 4) {
            for (int var6 = 0; var6 < arg2; var6++) {
                data[var5 + var6] = arg1;
            }
        }
    }

    @OriginalMember(owner = "AFCKELYG", name = "a", descriptor = "(IIIZII)V")
    public static void hlineTrans(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg2 < boundTop || arg2 >= boundBottom) {
            return;
        }
        if (arg5 < boundLeft) {
            arg1 -= boundLeft - arg5;
            arg5 = boundLeft;
        }
        if (arg1 + arg5 > boundRight) {
            arg1 = boundRight - arg5;
        }
        int var6 = 256 - arg4;
        int var7 = (arg0 >> 16 & 0xFF) * arg4;
        int var8 = (arg0 >> 8 & 0xFF) * arg4;
        int var9 = (arg0 & 0xFF) * arg4;
        int var10 = width2d * arg2 + arg5;
        if (!arg3) {
            _flowObfuscator4 = 86;
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            int var12 = (data[var10] >> 16 & 0xFF) * var6;
            int var13 = (data[var10] >> 8 & 0xFF) * var6;
            int var14 = (data[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            data[var10++] = var15;
        }
    }

    @OriginalMember(owner = "AFCKELYG", name = "a", descriptor = "(IIIII)V")
    public static void vline(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < boundLeft || arg3 >= boundRight) {
            return;
        }
        if (arg0 < boundTop) {
            arg2 -= boundTop - arg0;
            arg0 = boundTop;
        }
        if (arg0 + arg2 > boundBottom) {
            arg2 = boundBottom - arg0;
        }
        int var5 = width2d * arg0 + arg3;
        if (_flowObfuscator6 == arg4) {
            for (int var6 = 0; var6 < arg2; var6++) {
                data[width2d * var6 + var5] = arg1;
            }
        }
    }

    @OriginalMember(owner = "AFCKELYG", name = "a", descriptor = "(IIIIBI)V")
    public static void vlineTrans(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg1 < boundLeft || arg1 >= boundRight) {
            return;
        }
        if (arg3 < boundTop) {
            arg5 -= boundTop - arg3;
            arg3 = boundTop;
        }
        if (arg3 + arg5 > boundBottom) {
            arg5 = boundBottom - arg3;
        }
        int var6 = 256 - arg2;
        int var7 = (arg0 >> 16 & 0xFF) * arg2;
        int var8 = (arg0 >> 8 & 0xFF) * arg2;
        int var9 = (arg0 & 0xFF) * arg2;
        if (arg4 != 3) {
            return;
        }
        int var10 = width2d * arg3 + arg1;
        for (int var11 = 0; var11 < arg5; var11++) {
            int var12 = (data[var10] >> 16 & 0xFF) * var6;
            int var13 = (data[var10] >> 8 & 0xFF) * var6;
            int var14 = (data[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            data[var10] = var15;
            var10 += width2d;
        }
    }
}
