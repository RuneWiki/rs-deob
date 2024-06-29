import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class213 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field3341 = 0;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    private static int field3343 = 0;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field3344 = 0;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field3342 = 0;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lml;")
    public static class2 field3340 = null;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([I)V", line = 7)
    public static final void method1583(int[] arg0) {
        method1595(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V", line = 10)
    public static void method1584() {
        field3340 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V", line = 13)
    public static final void method1585(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class240.method1800();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class240.field3749 - ((float) arg1 + 0.3F);
        float var8 = (float) class240.field3749 - ((float) arg3 + 0.3F);
        GL var9 = class240.field3771;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "([I)V", line = 31)
    public static final void method1586(int[] arg0) {
        arg0[0] = field3342;
        arg0[1] = field3344;
        arg0[2] = field3343;
        arg0[3] = field3341;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()V", line = 38)
    public static final void method1587() {
        field3340 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V", line = 42)
    public static final void method1588(int arg0, int arg1, int arg2, int arg3) {
        class240.method1800();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class240.field3749 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class240.field3771;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([IIIII)V", line = 61)
    public static final void method1589(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class240.method1800();
        GL var5 = class240.field3771;
        var5.glRasterPos2i(arg1, class240.field3749 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class240.field3757 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII)V", line = 73)
    public static final void method1590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class240.field3771;
        var6.glLineWidth((float) arg5);
        method1585(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIILml;)V", line = 80)
    public static final void method1591(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class2 arg6) {
        if (field3341 - field3344 != arg6.field3367) {
            throw new IllegalStateException();
        }
        class240.method1800();
        class240.method1786(arg6.field8);
        class240.method1814(1);
        class240.method1806(0);
        float var7 = (float) arg0 + 0.3F;
        float var8 = (float) arg2 + 0.3F;
        float var9 = (float) class240.field3749 - ((float) arg1 + 0.3F);
        float var10 = (float) class240.field3749 - ((float) arg3 + 0.3F);
        GL var11 = class240.field3771;
        var11.glTexEnvi(8960, 34176, 34168);
        var11.glBegin(2);
        var11.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var11.glTexCoord2f((var7 - (float) field3342) / (float) arg6.field12, ((float) class240.field3749 - var9 - (float) field3344) / (float) arg6.field7);
        var11.glVertex2f(var7, var9);
        var11.glTexCoord2f((var8 - (float) field3342) / (float) arg6.field12, ((float) class240.field3749 - var10 - (float) field3344) / (float) arg6.field7);
        var11.glVertex2f(var8, var10);
        var11.glEnd();
        var11.glTexEnvi(8960, 34176, 5890);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIIIII)V", line = 109)
    public static final void method1592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class240.method1800();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class240.field3749 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class240.field3771;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIIII)V", line = 136)
    public static final void method1593(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class240.method1800();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class240.field3749 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class240.field3771;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(IIIIII)V", line = 156)
    public static final void method1594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class240.method1800();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class240.field3749 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class240.field3771;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIII)V", line = 176)
    public static final void method1595(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class240.field3769) {
            arg2 = class240.field3769;
        }
        if (arg3 > class240.field3749) {
            arg3 = class240.field3749;
        }
        field3342 = arg0;
        field3344 = arg1;
        field3343 = arg2;
        field3341 = arg3;
        GL var4 = class240.field3771;
        var4.glEnable(3089);
        if (field3342 <= field3343 && field3344 <= field3341) {
            var4.glScissor(class240.field3725 + field3342, class240.field3749 - field3341 + class240.field3728, field3343 - field3342, field3341 - field3344);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1587();
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "()V", line = 203)
    public static final void method1596() {
        field3342 = 0;
        field3344 = 0;
        field3343 = class240.field3769;
        field3341 = class240.field3749;
        GL var0 = class240.field3771;
        var0.glDisable(3089);
        method1587();
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lml;)V", line = 213)
    public static final void method1597(class2 arg0) {
        if (field3341 - field3344 != arg0.field3367) {
            throw new IllegalArgumentException();
        }
        field3340 = arg0;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "()V", line = 223)
    public static final void method1598() {
        class240.field3771.glClear(16640);
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(IIIII)V", line = 226)
    public static final void method1599(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class240.method1800();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class240.field3749 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class240.field3771;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(IIII)V", line = 252)
    public static final void method1600(int arg0, int arg1, int arg2, int arg3) {
        if (field3342 < arg0) {
            field3342 = arg0;
        }
        if (field3344 < arg1) {
            field3344 = arg1;
        }
        if (field3343 > arg2) {
            field3343 = arg2;
        }
        if (field3341 > arg3) {
            field3341 = arg3;
        }
        GL var4 = class240.field3771;
        var4.glEnable(3089);
        if (field3342 <= field3343 && field3344 <= field3341) {
            var4.glScissor(class240.field3725 + field3342, class240.field3749 - field3341 + class240.field3728, field3343 - field3342, field3341 - field3344);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1587();
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(IIII)V", line = 278)
    public static final void method1601(int arg0, int arg1, int arg2, int arg3) {
        class240.method1800();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class240.field3749 - ((float) arg1 + 0.3F);
        GL var7 = class240.field3771;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(IIIII)V", line = 295)
    public static final void method1602(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class240.method1800();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + var5;
        float var7 = (float) class240.field3749 - ((float) arg1 + 0.3F);
        GL var8 = class240.field3771;
        var8.glBegin(1);
        var8.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, arg4 > 255 ? -1 : (byte) arg4);
        var8.glVertex2f(var5, var7);
        var8.glVertex2f(var6, var7);
        var8.glEnd();
    }
}
