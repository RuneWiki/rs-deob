import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class122 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lrc;")
    public static class239 field1755 = null;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    private static int field1756 = 0;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field1757 = 0;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field1758 = 0;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field1759 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([I)V", line = 5)
    public static final void method881(int[] arg0) {
        arg0[0] = field1759;
        arg0[1] = field1758;
        arg0[2] = field1756;
        arg0[3] = field1757;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V", line = 12)
    public static final void method882(int arg0, int arg1, int arg2, int arg3) {
        class109.method780();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class109.field1499 - ((float) arg1 + 0.3F);
        GL var7 = class109.field1456;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "([I)V", line = 28)
    public static final void method883(int[] arg0) {
        method885(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(IIII)V", line = 31)
    public static final void method884(int arg0, int arg1, int arg2, int arg3) {
        if (field1759 < arg0) {
            field1759 = arg0;
        }
        if (field1758 < arg1) {
            field1758 = arg1;
        }
        if (field1756 > arg2) {
            field1756 = arg2;
        }
        if (field1757 > arg3) {
            field1757 = arg3;
        }
        GL var4 = class109.field1456;
        var4.glEnable(3089);
        if (field1759 <= field1756 && field1758 <= field1757) {
            var4.glScissor(field1759 + class109.field1474, class109.field1499 - field1757 + class109.field1468, field1756 - field1759, field1757 - field1758);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method892();
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(IIII)V", line = 58)
    public static final void method885(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class109.field1482) {
            arg2 = class109.field1482;
        }
        if (arg3 > class109.field1499) {
            arg3 = class109.field1499;
        }
        field1759 = arg0;
        field1758 = arg1;
        field1756 = arg2;
        field1757 = arg3;
        GL var4 = class109.field1456;
        var4.glEnable(3089);
        if (field1759 <= field1756 && field1758 <= field1757) {
            var4.glScissor(field1759 + class109.field1474, class109.field1499 - field1757 + class109.field1468, field1756 - field1759, field1757 - field1758);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method892();
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([IIIII)V", line = 85)
    public static final void method886(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class109.method780();
        GL var5 = class109.field1456;
        var5.glRasterPos2i(arg1, class109.field1499 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class109.field1464 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()V", line = 100)
    public static final void method887() {
        class109.field1456.glClear(16640);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIII)V", line = 104)
    public static final void method888(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class109.method780();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class109.field1499 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class109.field1456;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lrc;)V", line = 128)
    public static final void method889(class239 arg0) {
        if (field1757 - field1758 != arg0.field2791) {
            throw new IllegalArgumentException();
        }
        field1755 = arg0;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "()V", line = 143)
    public static void method890() {
        field1755 = null;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(IIIII)V", line = 146)
    public static final void method891(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class109.method780();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class109.field1499 - ((float) arg1 + 0.3F);
        float var8 = (float) class109.field1499 - ((float) arg3 + 0.3F);
        GL var9 = class109.field1456;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "()V", line = 165)
    public static final void method892() {
        field1755 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII)V", line = 168)
    public static final void method893(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class109.method780();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class109.field1499 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class109.field1456;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(IIII)V", line = 189)
    public static final void method894(int arg0, int arg1, int arg2, int arg3) {
        class109.method780();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class109.field1499 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class109.field1456;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(IIIIII)V", line = 206)
    public static final void method895(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class109.field1456;
        var6.glLineWidth((float) arg5);
        method891(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(IIIIII)V", line = 212)
    public static final void method896(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class109.method780();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class109.field1499 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class109.field1456;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(IIIII)V", line = 237)
    public static final void method897(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class109.method780();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class109.field1499 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class109.field1456;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "()V", line = 257)
    public static final void method898() {
        field1759 = 0;
        field1758 = 0;
        field1756 = class109.field1482;
        field1757 = class109.field1499;
        GL var0 = class109.field1456;
        var0.glDisable(3089);
        method892();
    }
}
