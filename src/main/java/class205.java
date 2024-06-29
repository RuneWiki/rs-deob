import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class205 {

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    private static int field3005 = 0;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field3006 = 0;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field3003 = 0;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field3004 = 0;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Lbg;")
    public static class325 field3007 = null;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "()V", line = 5)
    public static void method1484() {
        field3007 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)V", line = 8)
    public static final void method1485(int arg0, int arg1, int arg2, int arg3) {
        class141.method1009();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class141.field2044 - ((float) arg1 + 0.3F);
        GL var7 = class141.field2025;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(IIII)V", line = 25)
    public static final void method1486(int arg0, int arg1, int arg2, int arg3) {
        if (field3004 < arg0) {
            field3004 = arg0;
        }
        if (field3006 < arg1) {
            field3006 = arg1;
        }
        if (field3005 > arg2) {
            field3005 = arg2;
        }
        if (field3003 > arg3) {
            field3003 = arg3;
        }
        GL var4 = class141.field2025;
        var4.glEnable(3089);
        if (field3004 <= field3005 && field3006 <= field3003) {
            var4.glScissor(field3004 + class141.field2057, class141.field2044 - field3003 + class141.field2041, field3005 - field3004, field3003 - field3006);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1494();
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIII)V", line = 48)
    public static final void method1487(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class141.method1009();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class141.field2044 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class141.field2025;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(IIIII)V", line = 69)
    public static final void method1488(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class141.method1009();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class141.field2044 - ((float) arg1 + 0.3F);
        float var8 = (float) class141.field2044 - ((float) arg3 + 0.3F);
        GL var9 = class141.field2025;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "()V", line = 87)
    public static final void method1489() {
        field3004 = 0;
        field3006 = 0;
        field3005 = class141.field2028;
        field3003 = class141.field2044;
        GL var0 = class141.field2025;
        var0.glDisable(3089);
        method1494();
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([I)V", line = 97)
    public static final void method1490(int[] arg0) {
        method1503(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIII)V", line = 101)
    public static final void method1491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class141.field2025;
        var6.glLineWidth((float) arg5);
        method1488(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "([I)V", line = 107)
    public static final void method1492(int[] arg0) {
        arg0[0] = field3004;
        arg0[1] = field3006;
        arg0[2] = field3005;
        arg0[3] = field3003;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(IIIIII)V", line = 115)
    public static final void method1493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class141.method1009();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class141.field2044 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class141.field2025;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "()V", line = 135)
    public static final void method1494() {
        field3007 = null;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(IIII)V", line = 141)
    public static final void method1495(int arg0, int arg1, int arg2, int arg3) {
        class141.method1009();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class141.field2044 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class141.field2025;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIILbg;)V", line = 160)
    public static final void method1496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class325 arg6) {
        if (field3003 - field3006 != arg6.field2553) {
            throw new IllegalStateException();
        }
        class141.method1009();
        class141.method1000(arg6.field4891);
        class141.method986(1);
        class141.method1013(0);
        float var7 = (float) arg0 + 0.3F;
        float var8 = (float) arg2 + 0.3F;
        float var9 = (float) class141.field2044 - ((float) arg1 + 0.3F);
        float var10 = (float) class141.field2044 - ((float) arg3 + 0.3F);
        GL var11 = class141.field2025;
        var11.glTexEnvi(8960, 34176, 34168);
        var11.glBegin(2);
        var11.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var11.glTexCoord2f((var7 - (float) field3004) / (float) arg6.field4889, ((float) class141.field2044 - var9 - (float) field3006) / (float) arg6.field4890);
        var11.glVertex2f(var7, var9);
        var11.glTexCoord2f((var8 - (float) field3004) / (float) arg6.field4889, ((float) class141.field2044 - var10 - (float) field3006) / (float) arg6.field4890);
        var11.glVertex2f(var8, var10);
        var11.glEnd();
        var11.glTexEnvi(8960, 34176, 5890);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([IIIII)V", line = 189)
    public static final void method1497(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class141.method1009();
        GL var5 = class141.field2025;
        var5.glRasterPos2i(arg1, class141.field2044 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class141.field2056 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(IIIII)V", line = 207)
    public static final void method1498(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class141.method1009();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + var5;
        float var7 = (float) class141.field2044 - ((float) arg1 + 0.3F);
        GL var8 = class141.field2025;
        var8.glBegin(1);
        var8.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, arg4 > 255 ? -1 : (byte) arg4);
        var8.glVertex2f(var5, var7);
        var8.glVertex2f(var6, var7);
        var8.glEnd();
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(IIIII)V", line = 223)
    public static final void method1499(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class141.method1009();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class141.field2044 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class141.field2025;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(IIIIII)V", line = 246)
    public static final void method1500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class141.method1009();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class141.field2044 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class141.field2025;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "()V", line = 269)
    public static final void method1501() {
        class141.field2025.glClear(16640);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lbg;)V", line = 272)
    public static final void method1502(class325 arg0) {
        if (field3003 - field3006 != arg0.field2553) {
            throw new IllegalArgumentException();
        }
        field3007 = arg0;
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(IIII)V", line = 284)
    public static final void method1503(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class141.field2028) {
            arg2 = class141.field2028;
        }
        if (arg3 > class141.field2044) {
            arg3 = class141.field2044;
        }
        field3004 = arg0;
        field3006 = arg1;
        field3005 = arg2;
        field3003 = arg3;
        GL var4 = class141.field2025;
        var4.glEnable(3089);
        if (field3004 <= field3005 && field3006 <= field3003) {
            var4.glScissor(field3004 + class141.field2057, class141.field2044 - field3003 + class141.field2041, field3005 - field3004, field3003 - field3006);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1494();
    }
}
