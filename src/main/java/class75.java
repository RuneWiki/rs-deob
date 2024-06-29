import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class75 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    private static int field1052 = 0;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field1055 = 0;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Loh;")
    public static class314 field1053 = null;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field1054 = 0;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field1056 = 0;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method496(int arg0, int arg1, int arg2, int arg3) {
        class232.method1651();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class232.field3731 - ((float) arg1 + 0.3F);
        GL var7 = class232.field3716;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(IIII)V", line = 21)
    public static final void method497(int arg0, int arg1, int arg2, int arg3) {
        if (field1056 < arg0) {
            field1056 = arg0;
        }
        if (field1054 < arg1) {
            field1054 = arg1;
        }
        if (field1052 > arg2) {
            field1052 = arg2;
        }
        if (field1055 > arg3) {
            field1055 = arg3;
        }
        GL var4 = class232.field3716;
        var4.glEnable(3089);
        if (field1056 <= field1052 && field1054 <= field1055) {
            var4.glScissor(field1056 + class232.field3693, class232.field3731 - field1055 + class232.field3727, field1052 - field1056, field1055 - field1054);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method503();
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIII)V", line = 45)
    public static final void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class232.field3716;
        var6.glLineWidth((float) arg5);
        method509(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(IIII)V", line = 51)
    public static final void method499(int arg0, int arg1, int arg2, int arg3) {
        class232.method1651();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class232.field3731 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class232.field3716;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()V", line = 67)
    public static final void method500() {
        class232.field3716.glClear(16640);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(IIIIII)V", line = 70)
    public static final void method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class232.method1651();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class232.field3731 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class232.field3716;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "()V", line = 90)
    public static void method502() {
        field1053 = null;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "()V", line = 94)
    public static final void method503() {
        field1053 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Loh;)V", line = 100)
    public static final void method504(class314 arg0) {
        if (field1055 - field1054 != arg0.field816) {
            throw new IllegalArgumentException();
        }
        field1053 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V", line = 120)
    public static final void method505(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class232.method1651();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class232.field3731 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class232.field3716;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(IIII)V", line = 143)
    public static final void method506(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class232.field3699) {
            arg2 = class232.field3699;
        }
        if (arg3 > class232.field3731) {
            arg3 = class232.field3731;
        }
        field1056 = arg0;
        field1054 = arg1;
        field1052 = arg2;
        field1055 = arg3;
        GL var4 = class232.field3716;
        var4.glEnable(3089);
        if (field1056 <= field1052 && field1054 <= field1055) {
            var4.glScissor(field1056 + class232.field3693, class232.field3731 - field1055 + class232.field3727, field1052 - field1056, field1055 - field1054);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method503();
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(IIIII)V", line = 170)
    public static final void method507(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class232.method1651();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class232.field3731 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class232.field3716;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "()V", line = 195)
    public static final void method508() {
        field1056 = 0;
        field1054 = 0;
        field1052 = class232.field3699;
        field1055 = class232.field3731;
        GL var0 = class232.field3716;
        var0.glDisable(3089);
        method503();
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(IIIII)V", line = 205)
    public static final void method509(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class232.method1651();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class232.field3731 - ((float) arg1 + 0.3F);
        float var8 = (float) class232.field3731 - ((float) arg3 + 0.3F);
        GL var9 = class232.field3716;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(IIIIII)V", line = 223)
    public static final void method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class232.method1651();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class232.field3731 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class232.field3716;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([I)V", line = 243)
    public static final void method511(int[] arg0) {
        method506(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([IIIII)V", line = 247)
    public static final void method512(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class232.method1651();
        GL var5 = class232.field3716;
        var5.glRasterPos2i(arg1, class232.field3731 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class232.field3718 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "([I)V", line = 258)
    public static final void method513(int[] arg0) {
        arg0[0] = field1056;
        arg0[1] = field1054;
        arg0[2] = field1052;
        arg0[3] = field1055;
    }
}
