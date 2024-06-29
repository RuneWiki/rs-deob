import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class115 {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    private static int field2029 = 0;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field2031 = 0;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Ldh;")
    public static class137 field2032 = null;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field2030 = 0;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field2033 = 0;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([I)V", line = 5)
    public static final void method746(int[] arg0) {
        arg0[0] = field2030;
        arg0[1] = field2033;
        arg0[2] = field2029;
        arg0[3] = field2031;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ldh;)V", line = 11)
    public static final void method747(class137 arg0) {
        if (field2031 - field2033 != arg0.field4383) {
            throw new IllegalArgumentException();
        }
        field2032 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIII)V", line = 21)
    public static final void method748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249.method1682();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class249.field3888 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class249.field3898;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "([I)V", line = 47)
    public static final void method749(int[] arg0) {
        method757(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)V", line = 50)
    public static final void method750(int arg0, int arg1, int arg2, int arg3) {
        class249.method1682();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class249.field3888 - ((float) arg1 + 0.3F);
        GL var7 = class249.field3898;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([IIIII)V", line = 66)
    public static final void method751(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class249.method1682();
        GL var5 = class249.field3898;
        var5.glRasterPos2i(arg1, class249.field3888 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class249.field3916 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(IIIIII)V", line = 78)
    public static final void method752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class249.field3898;
        var6.glLineWidth((float) arg5);
        method758(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()V", line = 84)
    public static final void method753() {
        field2030 = 0;
        field2033 = 0;
        field2029 = class249.field3901;
        field2031 = class249.field3888;
        GL var0 = class249.field3898;
        var0.glDisable(3089);
        method760();
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "()V", line = 94)
    public static final void method754() {
        class249.field3898.glClear(16640);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIII)V", line = 97)
    public static final void method755(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class249.method1682();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class249.field3888 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class249.field3898;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(IIIII)V", line = 122)
    public static final void method756(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class249.method1682();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class249.field3888 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class249.field3898;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(IIII)V", line = 145)
    public static final void method757(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class249.field3901) {
            arg2 = class249.field3901;
        }
        if (arg3 > class249.field3888) {
            arg3 = class249.field3888;
        }
        field2030 = arg0;
        field2033 = arg1;
        field2029 = arg2;
        field2031 = arg3;
        GL var4 = class249.field3898;
        var4.glEnable(3089);
        if (field2030 <= field2029 && field2033 <= field2031) {
            var4.glScissor(class249.field3878 + field2030, class249.field3888 - field2031 + class249.field3895, field2029 - field2030, field2031 - field2033);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method760();
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(IIIII)V", line = 172)
    public static final void method758(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class249.method1682();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class249.field3888 - ((float) arg1 + 0.3F);
        float var8 = (float) class249.field3888 - ((float) arg3 + 0.3F);
        GL var9 = class249.field3898;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(IIII)V", line = 195)
    public static final void method759(int arg0, int arg1, int arg2, int arg3) {
        class249.method1682();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class249.field3888 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class249.field3898;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "()V", line = 211)
    public static final void method760() {
        field2032 = null;
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "()V", line = 214)
    public static void method761() {
        field2032 = null;
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(IIII)V", line = 220)
    public static final void method762(int arg0, int arg1, int arg2, int arg3) {
        if (field2030 < arg0) {
            field2030 = arg0;
        }
        if (field2033 < arg1) {
            field2033 = arg1;
        }
        if (field2029 > arg2) {
            field2029 = arg2;
        }
        if (field2031 > arg3) {
            field2031 = arg3;
        }
        GL var4 = class249.field3898;
        var4.glEnable(3089);
        if (field2030 <= field2029 && field2033 <= field2031) {
            var4.glScissor(class249.field3878 + field2030, class249.field3888 - field2031 + class249.field3895, field2029 - field2030, field2031 - field2033);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method760();
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(IIIIII)V", line = 247)
    public static final void method763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249.method1682();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class249.field3888 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class249.field3898;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }
}
