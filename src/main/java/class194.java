import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class194 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field3090 = 0;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field3092 = 0;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field3094 = 0;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Lrb;")
    public static class221 field3093 = null;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    private static int field3091 = 0;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "()V", line = 5)
    public static final void method1403() {
        class36.field518.glClear(16640);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)V", line = 8)
    public static final void method1404(int arg0, int arg1, int arg2, int arg3) {
        class36.method336();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class36.field522 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class36.field518;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "()V", line = 24)
    public static final void method1405() {
        field3092 = 0;
        field3090 = 0;
        field3091 = class36.field520;
        field3094 = class36.field522;
        GL var0 = class36.field518;
        var0.glDisable(3089);
        method1411();
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIII)V", line = 34)
    public static final void method1406(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class36.method336();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class36.field522 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class36.field518;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(IIIII)V", line = 62)
    public static final void method1407(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class36.method336();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class36.field522 - ((float) arg1 + 0.3F);
        float var8 = (float) class36.field522 - ((float) arg3 + 0.3F);
        GL var9 = class36.field518;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(IIII)V", line = 80)
    public static final void method1408(int arg0, int arg1, int arg2, int arg3) {
        class36.method336();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class36.field522 - ((float) arg1 + 0.3F);
        GL var7 = class36.field518;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIII)V", line = 97)
    public static final void method1409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        int var8 = var6 >= 0 ? var6 : -var6;
        int var9 = var7 >= 0 ? var7 : -var7;
        int var10 = var8;
        if (var8 < var9) {
            var10 = var9;
        }
        if (var10 == 0) {
            return;
        }
        int var11 = (var6 << 16) / var10;
        int var12 = (var7 << 16) / var10;
        if (var12 <= var11) {
            var11 = -var11;
        } else {
            var12 = -var12;
        }
        int var13 = arg5 * var12 >> 17;
        int var14 = arg5 * var12 + 1 >> 17;
        int var15 = arg5 * var11 >> 17;
        int var16 = arg5 * var11 + 1 >> 17;
        int var17 = arg0 + var13;
        int var18 = arg0 - var14;
        int var19 = arg0 + var6 - var14;
        int var20 = arg0 + var6 + var13;
        int var21 = arg1 + var15;
        int var22 = arg1 - var16;
        int var23 = arg1 + var7 - var16;
        int var24 = arg1 + var7 + var15;
        class36.method336();
        GL var25 = class36.field518;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class36.field522 - var24));
            var25.glVertex2f((float) var19, (float) (class36.field522 - var23));
            var25.glVertex2f((float) var18, (float) (class36.field522 - var22));
            var25.glVertex2f((float) var17, (float) (class36.field522 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class36.field522 - var21));
            var25.glVertex2f((float) var18, (float) (class36.field522 - var22));
            var25.glVertex2f((float) var19, (float) (class36.field522 - var23));
            var25.glVertex2f((float) var20, (float) (class36.field522 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lrb;)V", line = 168)
    public static final void method1410(class221 arg0) {
        if (field3094 - field3090 != arg0.field315) {
            throw new IllegalArgumentException();
        }
        field3093 = arg0;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "()V", line = 178)
    public static final void method1411() {
        field3093 = null;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(IIIIII)V", line = 182)
    public static final void method1412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class36.method336();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class36.field522 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class36.field518;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(IIIII)V", line = 208)
    public static final void method1413(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class36.method336();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class36.field522 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class36.field518;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(IIIIII)V", line = 228)
    public static final void method1414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class36.method336();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class36.field522 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class36.field518;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([IIIII)V", line = 248)
    public static final void method1415(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class36.method336();
        GL var5 = class36.field518;
        var5.glRasterPos2i(arg1, class36.field522 - arg2);
        var5.glPixelZoom(1.0F, -1.0F);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class36.field510 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
        var5.glPixelZoom(1.0F, 1.0F);
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(IIII)V", line = 267)
    public static final void method1416(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class36.field520) {
            arg2 = class36.field520;
        }
        if (arg3 > class36.field522) {
            arg3 = class36.field522;
        }
        field3092 = arg0;
        field3090 = arg1;
        field3091 = arg2;
        field3094 = arg3;
        GL var4 = class36.field518;
        var4.glEnable(3089);
        if (field3092 <= field3091 && field3090 <= field3094) {
            var4.glScissor(field3092, class36.field522 - field3094, field3091 - field3092, field3094 - field3090);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1411();
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "()V", line = 297)
    public static void method1417() {
        field3093 = null;
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(IIII)V", line = 301)
    public static final void method1418(int arg0, int arg1, int arg2, int arg3) {
        if (field3092 < arg0) {
            field3092 = arg0;
        }
        if (field3090 < arg1) {
            field3090 = arg1;
        }
        if (field3091 > arg2) {
            field3091 = arg2;
        }
        if (field3094 > arg3) {
            field3094 = arg3;
        }
        GL var4 = class36.field518;
        var4.glEnable(3089);
        if (field3092 <= field3091 && field3090 <= field3094) {
            var4.glScissor(field3092, class36.field522 - field3094, field3091 - field3092, field3094 - field3090);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1411();
    }
}
