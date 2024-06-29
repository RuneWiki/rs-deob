import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class114 {

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    private static int field1834 = 0;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field1835 = 0;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field1836 = 0;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field1837 = 0;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "Lek;")
    public static class196 field1838 = null;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V", line = 5)
    public static final void method881() {
        field1838 = null;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "()V", line = 8)
    public static void method882() {
        field1838 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V", line = 11)
    public static final void method883(int arg0, int arg1, int arg2, int arg3) {
        class162.method1218();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class162.field2618 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class162.field2654;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "()V", line = 27)
    public static final void method884() {
        class162.field2654.glClear(16640);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V", line = 32)
    public static final void method885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class162.field2654;
        var6.glLineWidth((float) arg5);
        method890(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIII)V", line = 40)
    public static final void method886(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class162.field2619) {
            arg2 = class162.field2619;
        }
        if (arg3 > class162.field2618) {
            arg3 = class162.field2618;
        }
        field1836 = arg0;
        field1835 = arg1;
        field1834 = arg2;
        field1837 = arg3;
        GL var4 = class162.field2654;
        var4.glEnable(3089);
        if (field1836 <= field1834 && field1835 <= field1837) {
            var4.glScissor(class162.field2645 + field1836, class162.field2618 - field1837 + class162.field2646, field1834 - field1836, field1837 - field1835);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method881();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)V", line = 68)
    public static final void method887(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class162.method1218();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class162.field2618 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class162.field2654;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lek;)V", line = 88)
    public static final void method888(class196 arg0) {
        if (field1837 - field1835 != arg0.field1413) {
            throw new IllegalArgumentException();
        }
        field1838 = arg0;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(IIII)V", line = 100)
    public static final void method889(int arg0, int arg1, int arg2, int arg3) {
        class162.method1218();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class162.field2618 - ((float) arg1 + 0.3F);
        GL var7 = class162.field2654;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIII)V", line = 116)
    public static final void method890(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class162.method1218();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class162.field2618 - ((float) arg1 + 0.3F);
        float var8 = (float) class162.field2618 - ((float) arg3 + 0.3F);
        GL var9 = class162.field2654;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([IIIII)V", line = 135)
    public static final void method891(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class162.method1218();
        GL var5 = class162.field2654;
        var5.glRasterPos2i(arg1, class162.field2618 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class162.field2624 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "()V", line = 146)
    public static final void method892() {
        field1836 = 0;
        field1835 = 0;
        field1834 = class162.field2619;
        field1837 = class162.field2618;
        GL var0 = class162.field2654;
        var0.glDisable(3089);
        method881();
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIIII)V", line = 156)
    public static final void method893(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class162.method1218();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class162.field2618 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class162.field2654;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(IIII)V", line = 176)
    public static final void method894(int arg0, int arg1, int arg2, int arg3) {
        if (field1836 < arg0) {
            field1836 = arg0;
        }
        if (field1835 < arg1) {
            field1835 = arg1;
        }
        if (field1834 > arg2) {
            field1834 = arg2;
        }
        if (field1837 > arg3) {
            field1837 = arg3;
        }
        GL var4 = class162.field2654;
        var4.glEnable(3089);
        if (field1836 <= field1834 && field1835 <= field1837) {
            var4.glScissor(class162.field2645 + field1836, class162.field2618 - field1837 + class162.field2646, field1834 - field1836, field1837 - field1835);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method881();
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(IIIIII)V", line = 203)
    public static final void method895(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class162.method1218();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class162.field2618 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class162.field2654;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([I)V", line = 224)
    public static final void method896(int[] arg0) {
        method886(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(IIIII)V", line = 227)
    public static final void method897(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class162.method1218();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class162.field2618 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class162.field2654;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "([I)V", line = 247)
    public static final void method898(int[] arg0) {
        arg0[0] = field1836;
        arg0[1] = field1835;
        arg0[2] = field1834;
        arg0[3] = field1837;
    }
}
