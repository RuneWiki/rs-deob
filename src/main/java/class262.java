import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class262 {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    private static int field4063 = 0;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field4066 = 0;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field4067 = 0;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Lmb;")
    public static class105 field4064 = null;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field4065 = 0;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()V", line = 5)
    public static final void method1853() {
        class265.field4099.glClear(16640);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)V", line = 8)
    public static final void method1854(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class265.method1887();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class265.field4101 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class265.field4099;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IIIII)V", line = 28)
    public static final void method1855(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class265.method1887();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class265.field4101 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class265.field4099;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIII)V", line = 49)
    public static final void method1856(int arg0, int arg1, int arg2, int arg3) {
        class265.method1887();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class265.field4101 - ((float) arg1 + 0.3F);
        GL var7 = class265.field4099;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IIII)V", line = 65)
    public static final void method1857(int arg0, int arg1, int arg2, int arg3) {
        class265.method1887();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class265.field4101 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class265.field4099;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIII)V", line = 83)
    public static final void method1858(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class265.method1887();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class265.field4101 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class265.field4099;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "()V", line = 103)
    public static final void method1859() {
        field4064 = null;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IIIIII)V", line = 106)
    public static final void method1860(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class265.method1887();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class265.field4101 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class265.field4099;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(IIIIII)V", line = 128)
    public static final void method1861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class265.method1887();
        GL var25 = class265.field4099;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class265.field4101 - var24));
            var25.glVertex2f((float) var19, (float) (class265.field4101 - var23));
            var25.glVertex2f((float) var18, (float) (class265.field4101 - var22));
            var25.glVertex2f((float) var17, (float) (class265.field4101 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class265.field4101 - var21));
            var25.glVertex2f((float) var18, (float) (class265.field4101 - var22));
            var25.glVertex2f((float) var19, (float) (class265.field4101 - var23));
            var25.glVertex2f((float) var20, (float) (class265.field4101 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(IIII)V", line = 199)
    public static final void method1862(int arg0, int arg1, int arg2, int arg3) {
        if (field4066 < arg0) {
            field4066 = arg0;
        }
        if (field4065 < arg1) {
            field4065 = arg1;
        }
        if (field4063 > arg2) {
            field4063 = arg2;
        }
        if (field4067 > arg3) {
            field4067 = arg3;
        }
        GL var4 = class265.field4099;
        var4.glEnable(3089);
        if (field4066 <= field4063 && field4065 <= field4067) {
            var4.glScissor(field4066, class265.field4101 - field4067, field4063 - field4066, field4067 - field4065);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1859();
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(IIIII)V", line = 222)
    public static final void method1863(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class265.method1887();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class265.field4101 - ((float) arg1 + 0.3F);
        float var8 = (float) class265.field4101 - ((float) arg3 + 0.3F);
        GL var9 = class265.field4099;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "()V", line = 246)
    public static final void method1864() {
        field4066 = 0;
        field4065 = 0;
        field4063 = class265.field4095;
        field4067 = class265.field4101;
        GL var0 = class265.field4099;
        var0.glDisable(3089);
        method1859();
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(IIII)V", line = 260)
    public static final void method1865(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class265.field4095) {
            arg2 = class265.field4095;
        }
        if (arg3 > class265.field4101) {
            arg3 = class265.field4101;
        }
        field4066 = arg0;
        field4065 = arg1;
        field4063 = arg2;
        field4067 = arg3;
        GL var4 = class265.field4099;
        var4.glEnable(3089);
        if (field4066 <= field4063 && field4065 <= field4067) {
            var4.glScissor(field4066, class265.field4101 - field4067, field4063 - field4066, field4067 - field4065);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1859();
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([IIIII)V", line = 288)
    public static final void method1866(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class265.method1887();
        GL var5 = class265.field4099;
        var5.glRasterPos2i(arg1, class265.field4101 - arg2);
        var5.glPixelZoom(1.0F, -1.0F);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class265.field4109 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
        var5.glPixelZoom(1.0F, 1.0F);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lmb;)V", line = 304)
    public static final void method1867(class105 arg0) {
        if (field4067 - field4065 != arg0.field2011) {
            throw new IllegalArgumentException();
        }
        field4064 = arg0;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "()V", line = 315)
    public static void method1868() {
        field4064 = null;
    }
}
