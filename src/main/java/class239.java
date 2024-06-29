import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class239 {

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field3667 = 0;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field3665 = 0;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    private static int field3668 = 0;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Laf;")
    public static class200 field3669 = null;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field3666 = 0;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method1652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class272.method1930();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class272.field4311 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class272.field4310;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V", line = 25)
    public static final void method1653(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class272.method1930();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class272.field4311 - ((float) arg1 + 0.3F);
        float var8 = (float) class272.field4311 - ((float) arg3 + 0.3F);
        GL var9 = class272.field4310;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIII)V", line = 44)
    public static final void method1654(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class272.method1930();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + var5;
        float var7 = (float) class272.field4311 - ((float) arg1 + 0.3F);
        GL var8 = class272.field4310;
        var8.glBegin(1);
        var8.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, arg4 > 255 ? -1 : (byte) arg4);
        var8.glVertex2f(var5, var7);
        var8.glVertex2f(var6, var7);
        var8.glEnd();
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIII)V", line = 62)
    public static final void method1655(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class272.method1930();
        GL var5 = class272.field4310;
        var5.glRasterPos2i(arg1, class272.field4311 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class272.field4318 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()V", line = 73)
    public static final void method1656() {
        field3665 = 0;
        field3666 = 0;
        field3668 = class272.field4301;
        field3667 = class272.field4311;
        GL var0 = class272.field4310;
        var0.glDisable(3089);
        method1663();
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V", line = 83)
    public static final void method1657(int arg0, int arg1, int arg2, int arg3) {
        class272.method1930();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class272.field4311 - ((float) arg1 + 0.3F);
        GL var7 = class272.field4310;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Laf;)V", line = 99)
    public static final void method1658(class200 arg0) {
        if (field3667 - field3666 != arg0.field24) {
            throw new IllegalArgumentException();
        }
        field3669 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(IIIII)V", line = 110)
    public static final void method1659(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class272.method1930();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class272.field4311 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class272.field4310;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()V", line = 130)
    public static void method1660() {
        field3669 = null;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIII)V", line = 133)
    public static final void method1661(int arg0, int arg1, int arg2, int arg3) {
        if (field3665 < arg0) {
            field3665 = arg0;
        }
        if (field3666 < arg1) {
            field3666 = arg1;
        }
        if (field3668 > arg2) {
            field3668 = arg2;
        }
        if (field3667 > arg3) {
            field3667 = arg3;
        }
        GL var4 = class272.field4310;
        var4.glEnable(3089);
        if (field3665 <= field3668 && field3666 <= field3667) {
            var4.glScissor(class272.field4271 + field3665, class272.field4311 - field3667 + class272.field4313, field3668 - field3665, field3667 - field3666);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1663();
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIIII)V", line = 161)
    public static final void method1662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class272.field4310;
        var6.glLineWidth((float) arg5);
        method1653(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()V", line = 170)
    public static final void method1663() {
        field3669 = null;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "()V", line = 174)
    public static final void method1664() {
        class272.field4310.glClear(16640);
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(IIIII)V", line = 179)
    public static final void method1665(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class272.method1930();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class272.field4311 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class272.field4310;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(IIII)V", line = 200)
    public static final void method1666(int arg0, int arg1, int arg2, int arg3) {
        class272.method1930();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class272.field4311 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class272.field4310;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(IIIIII)V", line = 216)
    public static final void method1667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class272.method1930();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class272.field4311 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class272.field4310;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(IIII)V", line = 238)
    public static final void method1668(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class272.field4301) {
            arg2 = class272.field4301;
        }
        if (arg3 > class272.field4311) {
            arg3 = class272.field4311;
        }
        field3665 = arg0;
        field3666 = arg1;
        field3668 = arg2;
        field3667 = arg3;
        GL var4 = class272.field4310;
        var4.glEnable(3089);
        if (field3665 <= field3668 && field3666 <= field3667) {
            var4.glScissor(class272.field4271 + field3665, class272.field4311 - field3667 + class272.field4313, field3668 - field3665, field3667 - field3666);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1663();
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIILaf;)V", line = 265)
    public static final void method1669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class200 arg6) {
        if (field3667 - field3666 != arg6.field24) {
            throw new IllegalStateException();
        }
        class272.method1930();
        class272.method1965(arg6.field3034);
        class272.method1961(1);
        class272.method1947(0);
        float var7 = (float) arg0 + 0.3F;
        float var8 = (float) arg2 + 0.3F;
        float var9 = (float) class272.field4311 - ((float) arg1 + 0.3F);
        float var10 = (float) class272.field4311 - ((float) arg3 + 0.3F);
        GL var11 = class272.field4310;
        var11.glTexEnvi(8960, 34176, 34168);
        var11.glBegin(2);
        var11.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var11.glTexCoord2f((var7 - (float) field3665) / (float) arg6.field3028, ((float) class272.field4311 - var9 - (float) field3666) / (float) arg6.field3030);
        var11.glVertex2f(var7, var9);
        var11.glTexCoord2f((var8 - (float) field3665) / (float) arg6.field3028, ((float) class272.field4311 - var10 - (float) field3666) / (float) arg6.field3030);
        var11.glVertex2f(var8, var10);
        var11.glEnd();
        var11.glTexEnvi(8960, 34176, 5890);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([I)V", line = 293)
    public static final void method1670(int[] arg0) {
        arg0[0] = field3665;
        arg0[1] = field3666;
        arg0[2] = field3668;
        arg0[3] = field3667;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "([I)V", line = 299)
    public static final void method1671(int[] arg0) {
        method1668(arg0[0], arg0[1], arg0[2], arg0[3]);
    }
}
