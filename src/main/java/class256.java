import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class256 {

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field4559 = 0;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field4555 = 0;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    private static int field4558 = 0;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field4557 = 0;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Lah;")
    public static class203 field4556 = null;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lah;)V", line = 5)
    public static final void method1825(class203 arg0) {
        if (field4559 - field4557 != arg0.field1375) {
            throw new IllegalArgumentException();
        }
        field4556 = arg0;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()V", line = 16)
    public static final void method1826() {
        field4556 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V", line = 19)
    public static final void method1827(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class97.method833();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class97.field1809 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class97.field1801;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIII)V", line = 39)
    public static final void method1828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class97.method833();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class97.field1809 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class97.field1801;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()V", line = 60)
    public static void method1829() {
        field4556 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII)V", line = 63)
    public static final void method1830(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class97.field1831) {
            arg2 = class97.field1831;
        }
        if (arg3 > class97.field1809) {
            arg3 = class97.field1809;
        }
        field4555 = arg0;
        field4557 = arg1;
        field4558 = arg2;
        field4559 = arg3;
        GL var4 = class97.field1801;
        var4.glEnable(3089);
        if (field4555 <= field4558 && field4557 <= field4559) {
            var4.glScissor(field4555, class97.field1809 - field4559, field4558 - field4555, field4559 - field4557);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1826();
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIII)V", line = 90)
    public static final void method1831(int arg0, int arg1, int arg2, int arg3) {
        class97.method833();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class97.field1809 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class97.field1801;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([IIIII)V", line = 107)
    public static final void method1832(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class97.method833();
        GL var5 = class97.field1801;
        var5.glRasterPos2i(arg1, class97.field1809 - arg2);
        var5.glPixelZoom(1.0F, -1.0F);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class97.field1808 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
        var5.glPixelZoom(1.0F, 1.0F);
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "()V", line = 120)
    public static final void method1833() {
        class97.field1801.glClear(16640);
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(IIII)V", line = 123)
    public static final void method1834(int arg0, int arg1, int arg2, int arg3) {
        class97.method833();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class97.field1809 - ((float) arg1 + 0.3F);
        GL var7 = class97.field1801;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(IIII)V", line = 139)
    public static final void method1835(int arg0, int arg1, int arg2, int arg3) {
        if (field4555 < arg0) {
            field4555 = arg0;
        }
        if (field4557 < arg1) {
            field4557 = arg1;
        }
        if (field4558 > arg2) {
            field4558 = arg2;
        }
        if (field4559 > arg3) {
            field4559 = arg3;
        }
        GL var4 = class97.field1801;
        var4.glEnable(3089);
        if (field4555 <= field4558 && field4557 <= field4559) {
            var4.glScissor(field4555, class97.field1809 - field4559, field4558 - field4555, field4559 - field4557);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1826();
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIIIII)V", line = 162)
    public static final void method1836(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class97.method833();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class97.field1809 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class97.field1801;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(IIIIII)V", line = 183)
    public static final void method1837(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class97.method833();
        GL var25 = class97.field1801;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class97.field1809 - var24));
            var25.glVertex2f((float) var19, (float) (class97.field1809 - var23));
            var25.glVertex2f((float) var18, (float) (class97.field1809 - var22));
            var25.glVertex2f((float) var17, (float) (class97.field1809 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class97.field1809 - var21));
            var25.glVertex2f((float) var18, (float) (class97.field1809 - var22));
            var25.glVertex2f((float) var19, (float) (class97.field1809 - var23));
            var25.glVertex2f((float) var20, (float) (class97.field1809 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "()V", line = 255)
    public static final void method1838() {
        field4555 = 0;
        field4557 = 0;
        field4558 = class97.field1831;
        field4559 = class97.field1809;
        GL var0 = class97.field1801;
        var0.glDisable(3089);
        method1826();
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIIII)V", line = 286)
    public static final void method1839(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class97.method833();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class97.field1809 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class97.field1801;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(IIIII)V", line = 309)
    public static final void method1840(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class97.method833();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class97.field1809 - ((float) arg1 + 0.3F);
        float var8 = (float) class97.field1809 - ((float) arg3 + 0.3F);
        GL var9 = class97.field1801;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }
}
