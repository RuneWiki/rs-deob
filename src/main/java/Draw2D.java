import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class Draw2D extends DoublyLinkable {

    @OriginalMember(owner = "mapview!t", name = "r", descriptor = "I")
    public static int left = 0;

    @OriginalMember(owner = "mapview!t", name = "p", descriptor = "I")
    public static int right = 0;

    @OriginalMember(owner = "mapview!t", name = "t", descriptor = "I")
    public static int top = 0;

    @OriginalMember(owner = "mapview!t", name = "v", descriptor = "I")
    public static int bottom = 0;

    @OriginalMember(owner = "mapview!t", name = "s", descriptor = "I")
    private static int height;

    @OriginalMember(owner = "mapview!t", name = "q", descriptor = "I")
    public static int width;

    @OriginalMember(owner = "mapview!t", name = "u", descriptor = "[I")
    public static int[] data;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(III)V", line = 5)
    private static final void setPixel(int arg0, int arg1, int arg2) {
        if (arg0 >= left && arg1 >= top && arg0 < right && arg1 < bottom) {
            data[width * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "([III)V", line = 11)
    public static final void bind(int[] arg0, int arg1, int arg2) {
        data = arg0;
        width = arg1;
        height = arg2;
        setBounds(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IIII)V", line = 21)
    private static final void setBounds(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > width) {
            arg2 = width;
        }
        if (arg3 > height) {
            arg3 = height;
        }
        left = arg0;
        top = arg1;
        right = arg2;
        bottom = arg3;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IIIII)V", line = 39)
    public static final void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
        drawHorizontalLine(arg0, arg1, arg2, arg4);
        drawHorizontalLine(arg0, arg1 + arg3 - 1, arg2, arg4);
        drawVerticalLine(arg0, arg1, arg3, arg4);
        drawVerticalLine(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(IIIII)V", line = 45)
    public static final void fillCircle(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method219(arg0, arg1, arg2, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = arg1 - arg2;
        if (var9 < top) {
            var9 = top;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > bottom) {
            var10 = bottom;
        }
        int var11 = var9;
        int var12 = arg2 * arg2;
        int var13 = 0;
        int var14 = arg1 - var9;
        int var15 = var14 * var14;
        int var16 = var15 - var14;
        if (arg1 > var10) {
            arg1 = var10;
        }
        while (var11 < arg1) {
            while (var16 <= var12 || var15 <= var12) {
                var15 += var13 + var13;
                var16 += var13++ + var13;
            }
            int var17 = arg0 + 1 - var13;
            if (var17 < left) {
                var17 = left;
            }
            int var18 = arg0 + var13;
            if (var18 > right) {
                var18 = right;
            }
            int var19 = width * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (data[var19] >> 16 & 0xFF) * var5;
                int var22 = (data[var19] >> 8 & 0xFF) * var5;
                int var23 = (data[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                data[var19++] = var24;
            }
            var11++;
            var15 -= var14-- + var14;
            var16 -= var14 + var14;
        }
        int var25 = arg2;
        int var26 = -var14;
        int var27 = var26 * var26 + var12;
        int var28 = var27 - arg2;
        int var29 = var27 - var26;
        while (var11 < var10) {
            while (var29 > var12 && var28 > var12) {
                var29 -= var25-- + var25;
                var28 -= var25 + var25;
            }
            int var30 = arg0 - var25;
            if (var30 < left) {
                var30 = left;
            }
            int var31 = arg0 + var25;
            if (var31 > right - 1) {
                var31 = right - 1;
            }
            int var32 = width * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (data[var32] >> 16 & 0xFF) * var5;
                int var35 = (data[var32] >> 8 & 0xFF) * var5;
                int var36 = (data[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                data[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(IIII)V", line = 194)
    public static final void drawHorizontalLine(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < top || arg1 >= bottom) {
            return;
        }
        if (arg0 < left) {
            arg2 -= left - arg0;
            arg0 = left;
        }
        if (arg0 + arg2 > right) {
            arg2 = right - arg0;
        }
        int var4 = width * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            data[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "(IIII)V", line = 219)
    public static final void drawVerticalLine(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < left || arg0 >= right) {
            return;
        }
        if (arg1 < top) {
            arg2 -= top - arg1;
            arg1 = top;
        }
        if (arg1 + arg2 > bottom) {
            arg2 = bottom - arg1;
        }
        int var4 = width * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            data[width * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "()V", line = 247)
    public static final void clear() {
        int var0 = 0;
        int var1 = width * height - 7;
        while (var0 < var1) {
            data[var0++] = 0;
            data[var0++] = 0;
            data[var0++] = 0;
            data[var0++] = 0;
            data[var0++] = 0;
            data[var0++] = 0;
            data[var0++] = 0;
            data[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            data[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "(IIIII)V", line = 268)
    public static final void fillRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < left) {
            arg2 -= left - arg0;
            arg0 = left;
        }
        if (arg1 < top) {
            arg3 -= top - arg1;
            arg1 = top;
        }
        if (arg0 + arg2 > right) {
            arg2 = right - arg0;
        }
        if (arg1 + arg3 > bottom) {
            arg3 = bottom - arg1;
        }
        int var5 = width - arg2;
        int var6 = width * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                data[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IIIIII)V", line = 310)
    public static final void fillRectAlpha(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < left) {
            arg2 -= left - arg0;
            arg0 = left;
        }
        if (arg1 < top) {
            arg3 -= top - arg1;
            arg1 = top;
        }
        if (arg0 + arg2 > right) {
            arg2 = right - arg0;
        }
        if (arg1 + arg3 > bottom) {
            arg3 = bottom - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = width - arg2;
        int var9 = width * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = data[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                data[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "(IIII)V", line = 362)
    private static final void method219(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            setPixel(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < top) {
            var4 = top;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > bottom) {
            var5 = bottom;
        }
        int var6 = var4;
        int var7 = arg2 * arg2;
        int var8 = 0;
        int var9 = arg1 - var4;
        int var10 = var9 * var9;
        int var11 = var10 - var9;
        if (arg1 > var5) {
            arg1 = var5;
        }
        while (var6 < arg1) {
            while (var11 <= var7 || var10 <= var7) {
                var10 += var8 + var8;
                var11 += var8++ + var8;
            }
            int var12 = arg0 + 1 - var8;
            if (var12 < left) {
                var12 = left;
            }
            int var13 = arg0 + var8;
            if (var13 > right) {
                var13 = right;
            }
            int var14 = width * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                data[var14++] = arg3;
            }
            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
        }
        int var16 = arg2;
        int var17 = var6 - arg1;
        int var18 = var17 * var17 + var7;
        int var19 = var18 - arg2;
        int var20 = var18 - var17;
        while (var6 < var5) {
            while (var20 > var7 && var19 > var7) {
                var20 -= var16-- + var16;
                var19 -= var16 + var16;
            }
            int var21 = arg0 - var16;
            if (var21 < left) {
                var21 = left;
            }
            int var22 = arg0 + var16;
            if (var22 > right - 1) {
                var22 = right - 1;
            }
            int var23 = width * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                data[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "()V", line = 469)
    public static void method220() {
        data = null;
    }
}
