import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class344 {

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "Lnk;")
    public static class14 field5357 = null;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field5358 = 0;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field5356 = 0;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    private static int field5360 = 0;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field5359 = 0;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([I)V", line = 5)
    public static final void method2369(int[] arg0) {
        arg0[0] = field5359;
        arg0[1] = field5356;
        arg0[2] = field5360;
        arg0[3] = field5358;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "([I)V", line = 11)
    public static final void method2370(int[] arg0) {
        method2376(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIII)V", line = 16)
    public static final void method2371(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class186.method1311();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class186.field2980 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class186.field2990;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "()V", line = 37)
    public static final void method2372() {
        field5359 = 0;
        field5356 = 0;
        field5360 = class186.field2986;
        field5358 = class186.field2980;
        GL var0 = class186.field2990;
        var0.glDisable(3089);
        method2386();
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIII)V", line = 47)
    public static final void method2373(int arg0, int arg1, int arg2, int arg3) {
        class186.method1311();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class186.field2980 - ((float) arg1 + 0.3F);
        GL var7 = class186.field2990;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIII)V", line = 66)
    public static final void method2374(int arg0, int arg1, int arg2, int arg3) {
        class186.method1311();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class186.field2980 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class186.field2990;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIIII)V", line = 82)
    public static final void method2375(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class186.method1311();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class186.field2980 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class186.field2990;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(IIII)V", line = 105)
    public static final void method2376(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class186.field2986) {
            arg2 = class186.field2986;
        }
        if (arg3 > class186.field2980) {
            arg3 = class186.field2980;
        }
        field5359 = arg0;
        field5356 = arg1;
        field5360 = arg2;
        field5358 = arg3;
        GL var4 = class186.field2990;
        var4.glEnable(3089);
        if (field5359 <= field5360 && field5356 <= field5358) {
            var4.glScissor(field5359 + class186.field3018, class186.field2980 - field5358 + class186.field3012, field5360 - field5359, field5358 - field5356);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method2386();
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "()V", line = 132)
    public static final void method2377() {
        class186.field2990.glClear(16640);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIII)V", line = 135)
    public static final void method2378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class186.method1311();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class186.field2980 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class186.field2990;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(IIII)V", line = 155)
    public static final void method2379(int arg0, int arg1, int arg2, int arg3) {
        if (field5359 < arg0) {
            field5359 = arg0;
        }
        if (field5356 < arg1) {
            field5356 = arg1;
        }
        if (field5360 > arg2) {
            field5360 = arg2;
        }
        if (field5358 > arg3) {
            field5358 = arg3;
        }
        GL var4 = class186.field2990;
        var4.glEnable(3089);
        if (field5359 <= field5360 && field5356 <= field5358) {
            var4.glScissor(field5359 + class186.field3018, class186.field2980 - field5358 + class186.field3012, field5360 - field5359, field5358 - field5356);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method2386();
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(IIIII)V", line = 178)
    public static final void method2380(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class186.method1311();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class186.field2980 - ((float) arg1 + 0.3F);
        float var8 = (float) class186.field2980 - ((float) arg3 + 0.3F);
        GL var9 = class186.field2990;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([IIIII)V", line = 199)
    public static final void method2381(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class186.method1311();
        GL var5 = class186.field2990;
        var5.glRasterPos2i(arg1, class186.field2980 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class186.field3014 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIIIII)V", line = 212)
    public static final void method2382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class186.field2990;
        var6.glLineWidth((float) arg5);
        method2380(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lnk;)V", line = 218)
    public static final void method2383(class14 arg0) {
        if (field5358 - field5356 != arg0.field5030) {
            throw new IllegalArgumentException();
        }
        field5357 = arg0;
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "()V", line = 228)
    public static void method2384() {
        field5357 = null;
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(IIIIII)V", line = 234)
    public static final void method2385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class186.method1311();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class186.field2980 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class186.field2990;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "()V", line = 254)
    public static final void method2386() {
        field5357 = null;
    }
}
