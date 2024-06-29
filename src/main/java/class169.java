import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class169 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    private static int field2936 = 0;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field2938 = 0;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field2940 = 0;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field2939 = 0;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Ld;")
    public static class157 field2937 = null;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method1321(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class43.method372();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class43.field665 - ((float) arg1 + 0.3F);
        float var8 = (float) class43.field665 - ((float) arg3 + 0.3F);
        GL var9 = class43.field651;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()V", line = 23)
    public static final void method1322() {
        field2937 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)V", line = 27)
    public static final void method1323(int arg0, int arg1, int arg2, int arg3) {
        class43.method372();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class43.field665 - ((float) arg1 + 0.3F);
        GL var7 = class43.field651;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()V", line = 43)
    public static void method1324() {
        field2937 = null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIIII)V", line = 47)
    public static final void method1325(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class43.method372();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class43.field665 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class43.field651;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([I)V", line = 67)
    public static final void method1326(int[] arg0) {
        arg0[0] = field2939;
        arg0[1] = field2940;
        arg0[2] = field2936;
        arg0[3] = field2938;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([IIIII)V", line = 73)
    public static final void method1327(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class43.method372();
        GL var5 = class43.field651;
        var5.glRasterPos2i(arg1, class43.field665 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class43.field639 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIII)V", line = 91)
    public static final void method1328(int arg0, int arg1, int arg2, int arg3) {
        class43.method372();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class43.field665 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class43.field651;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIII)V", line = 111)
    public static final void method1329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class43.method372();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class43.field665 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class43.field651;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(IIII)V", line = 132)
    public static final void method1330(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class43.field660) {
            arg2 = class43.field660;
        }
        if (arg3 > class43.field665) {
            arg3 = class43.field665;
        }
        field2939 = arg0;
        field2940 = arg1;
        field2936 = arg2;
        field2938 = arg3;
        GL var4 = class43.field651;
        var4.glEnable(3089);
        if (field2939 <= field2936 && field2940 <= field2938) {
            var4.glScissor(class43.field683 + field2939, class43.field665 - field2938 + class43.field644, field2936 - field2939, field2938 - field2940);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1322();
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(IIII)V", line = 159)
    public static final void method1331(int arg0, int arg1, int arg2, int arg3) {
        if (field2939 < arg0) {
            field2939 = arg0;
        }
        if (field2940 < arg1) {
            field2940 = arg1;
        }
        if (field2936 > arg2) {
            field2936 = arg2;
        }
        if (field2938 > arg3) {
            field2938 = arg3;
        }
        GL var4 = class43.field651;
        var4.glEnable(3089);
        if (field2939 <= field2936 && field2940 <= field2938) {
            var4.glScissor(class43.field683 + field2939, class43.field665 - field2938 + class43.field644, field2936 - field2939, field2938 - field2940);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1322();
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIIIII)V", line = 184)
    public static final void method1332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class43.field651;
        var6.glLineWidth((float) arg5);
        method1321(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "([I)V", line = 191)
    public static final void method1333(int[] arg0) {
        method1330(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(IIIIII)V", line = 194)
    public static final void method1334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class43.method372();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class43.field665 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class43.field651;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()V", line = 214)
    public static final void method1335() {
        field2939 = 0;
        field2940 = 0;
        field2936 = class43.field660;
        field2938 = class43.field665;
        GL var0 = class43.field651;
        var0.glDisable(3089);
        method1322();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ld;)V", line = 224)
    public static final void method1336(class157 arg0) {
        if (field2938 - field2940 != arg0.field2965) {
            throw new IllegalArgumentException();
        }
        field2937 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(IIIII)V", line = 241)
    public static final void method1337(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class43.method372();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class43.field665 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class43.field651;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "()V", line = 264)
    public static final void method1338() {
        class43.field651.glClear(16640);
    }
}
