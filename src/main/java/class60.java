import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class60 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field1081 = 0;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field1083 = 0;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    private static int field1084 = 0;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Lqb;")
    public static class87 field1082 = null;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field1085 = 0;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class253.method1732();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class253.field4329 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class253.field4319;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V", line = 26)
    public static final void method468(int arg0, int arg1, int arg2, int arg3) {
        if (field1081 < arg0) {
            field1081 = arg0;
        }
        if (field1085 < arg1) {
            field1085 = arg1;
        }
        if (field1084 > arg2) {
            field1084 = arg2;
        }
        if (field1083 > arg3) {
            field1083 = arg3;
        }
        GL var4 = class253.field4319;
        var4.glEnable(3089);
        if (field1081 <= field1084 && field1085 <= field1083) {
            var4.glScissor(field1081, class253.field4329 - field1083, field1084 - field1081, field1083 - field1085);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method469();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "()V", line = 50)
    public static final void method469() {
        field1082 = null;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IIII)V", line = 53)
    public static final void method470(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class253.field4297) {
            arg2 = class253.field4297;
        }
        if (arg3 > class253.field4329) {
            arg3 = class253.field4329;
        }
        field1081 = arg0;
        field1085 = arg1;
        field1084 = arg2;
        field1083 = arg3;
        GL var4 = class253.field4319;
        var4.glEnable(3089);
        if (field1081 <= field1084 && field1085 <= field1083) {
            var4.glScissor(field1081, class253.field4329 - field1083, field1084 - field1081, field1083 - field1085);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method469();
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "()V", line = 83)
    public static void method471() {
        field1082 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V", line = 87)
    public static final void method472(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class253.method1732();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class253.field4329 - ((float) arg1 + 0.3F);
        float var8 = (float) class253.field4329 - ((float) arg3 + 0.3F);
        GL var9 = class253.field4319;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IIIIII)V", line = 106)
    public static final void method473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class253.method1732();
        GL var25 = class253.field4319;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class253.field4329 - var24));
            var25.glVertex2f((float) var19, (float) (class253.field4329 - var23));
            var25.glVertex2f((float) var18, (float) (class253.field4329 - var22));
            var25.glVertex2f((float) var17, (float) (class253.field4329 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class253.field4329 - var21));
            var25.glVertex2f((float) var18, (float) (class253.field4329 - var22));
            var25.glVertex2f((float) var19, (float) (class253.field4329 - var23));
            var25.glVertex2f((float) var20, (float) (class253.field4329 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IIIII)V", line = 177)
    public static final void method474(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class253.method1732();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class253.field4329 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class253.field4319;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(IIII)V", line = 197)
    public static final void method475(int arg0, int arg1, int arg2, int arg3) {
        class253.method1732();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class253.field4329 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class253.field4319;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([IIIII)V", line = 216)
    public static final void method476(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class253.method1732();
        GL var5 = class253.field4319;
        var5.glRasterPos2i(arg1, class253.field4329 - arg2);
        var5.glPixelZoom(1.0F, -1.0F);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class253.field4331 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
        var5.glPixelZoom(1.0F, 1.0F);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lqb;)V", line = 232)
    public static final void method477(class87 arg0) {
        if (field1083 - field1085 != arg0.field2348) {
            throw new IllegalArgumentException();
        }
        field1082 = arg0;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(IIII)V", line = 247)
    public static final void method478(int arg0, int arg1, int arg2, int arg3) {
        class253.method1732();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class253.field4329 - ((float) arg1 + 0.3F);
        GL var7 = class253.field4319;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "()V", line = 263)
    public static final void method479() {
        field1081 = 0;
        field1085 = 0;
        field1084 = class253.field4297;
        field1083 = class253.field4329;
        GL var0 = class253.field4319;
        var0.glDisable(3089);
        method469();
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(IIIIII)V", line = 273)
    public static final void method480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class253.method1732();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class253.field4329 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class253.field4319;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "()V", line = 300)
    public static final void method481() {
        class253.field4319.glClear(16640);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(IIIII)V", line = 307)
    public static final void method482(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class253.method1732();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class253.field4329 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class253.field4319;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }
}
