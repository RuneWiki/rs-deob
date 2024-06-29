import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class269 {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field4665 = 0;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field4664 = 0;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    private static int field4666 = 0;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field4667 = 0;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Lqd;")
    public static class40 field4668 = null;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method1871(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class247.method1683();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class247.field4246 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class247.field4253;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()V", line = 27)
    public static final void method1872() {
        field4668 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII)V", line = 31)
    public static final void method1873(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class247.method1683();
        GL var25 = class247.field4253;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class247.field4246 - var24));
            var25.glVertex2f((float) var19, (float) (class247.field4246 - var23));
            var25.glVertex2f((float) var18, (float) (class247.field4246 - var22));
            var25.glVertex2f((float) var17, (float) (class247.field4246 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class247.field4246 - var21));
            var25.glVertex2f((float) var18, (float) (class247.field4246 - var22));
            var25.glVertex2f((float) var19, (float) (class247.field4246 - var23));
            var25.glVertex2f((float) var20, (float) (class247.field4246 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V", line = 102)
    public static final void method1874(int arg0, int arg1, int arg2, int arg3) {
        if (field4667 < arg0) {
            field4667 = arg0;
        }
        if (field4665 < arg1) {
            field4665 = arg1;
        }
        if (field4666 > arg2) {
            field4666 = arg2;
        }
        if (field4664 > arg3) {
            field4664 = arg3;
        }
        GL var4 = class247.field4253;
        var4.glEnable(3089);
        if (field4667 <= field4666 && field4665 <= field4664) {
            var4.glScissor(field4667, class247.field4246 - field4664, field4666 - field4667, field4664 - field4665);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1872();
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIII)V", line = 125)
    public static final void method1875(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class247.field4260) {
            arg2 = class247.field4260;
        }
        if (arg3 > class247.field4246) {
            arg3 = class247.field4246;
        }
        field4667 = arg0;
        field4665 = arg1;
        field4666 = arg2;
        field4664 = arg3;
        GL var4 = class247.field4253;
        var4.glEnable(3089);
        if (field4667 <= field4666 && field4665 <= field4664) {
            var4.glScissor(field4667, class247.field4246 - field4664, field4666 - field4667, field4664 - field4665);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1872();
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIIIII)V", line = 152)
    public static final void method1876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class247.method1683();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class247.field4246 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class247.field4253;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lqd;)V", line = 172)
    public static final void method1877(class40 arg0) {
        if (field4664 - field4665 != arg0.field1060) {
            throw new IllegalArgumentException();
        }
        field4668 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIIII)V", line = 188)
    public static final void method1878(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class247.method1683();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class247.field4246 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class247.field4253;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "()V", line = 218)
    public static final void method1879() {
        field4667 = 0;
        field4665 = 0;
        field4666 = class247.field4260;
        field4664 = class247.field4246;
        GL var0 = class247.field4253;
        var0.glDisable(3089);
        method1872();
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(IIIIII)V", line = 228)
    public static final void method1880(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class247.method1683();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class247.field4246 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class247.field4253;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(IIIII)V", line = 252)
    public static final void method1881(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class247.method1683();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class247.field4246 - ((float) arg1 + 0.3F);
        float var8 = (float) class247.field4246 - ((float) arg3 + 0.3F);
        GL var9 = class247.field4253;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(IIII)V", line = 270)
    public static final void method1882(int arg0, int arg1, int arg2, int arg3) {
        class247.method1683();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class247.field4246 - ((float) arg1 + 0.3F);
        GL var7 = class247.field4253;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "()V", line = 286)
    public static void method1883() {
        field4668 = null;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "()V", line = 289)
    public static final void method1884() {
        class247.field4253.glClear(16640);
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(IIII)V", line = 294)
    public static final void method1885(int arg0, int arg1, int arg2, int arg3) {
        class247.method1683();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class247.field4246 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class247.field4253;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }
}
