import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class335 {

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "Lko;")
    public static class232 field5428 = null;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field5427 = 0;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    private static int field5426 = 0;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field5429 = 0;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field5430 = 0;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method2363(int arg0, int arg1, int arg2, int arg3) {
        class245.method1745();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class245.field3862 - ((float) arg1 + 0.3F);
        GL var7 = class245.field3884;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "()V", line = 22)
    public static final void method2364() {
        class245.field3884.glClear(16640);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIII)V", line = 26)
    public static final void method2365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class245.method1745();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class245.field3862 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class245.field3884;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lko;)V", line = 46)
    public static final void method2366(class232 arg0) {
        if (field5429 - field5427 != arg0.field4811) {
            throw new IllegalArgumentException();
        }
        field5428 = arg0;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([I)V", line = 56)
    public static final void method2367(int[] arg0) {
        method2375(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "()V", line = 59)
    public static final void method2368() {
        field5428 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIILko;)V", line = 62)
    public static final void method2369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class232 arg6) {
        if (field5429 - field5427 != arg6.field4811) {
            throw new IllegalStateException();
        }
        class245.method1745();
        class245.method1729(arg6.field3695);
        class245.method1721(1);
        class245.method1709(0);
        float var7 = (float) arg0 + 0.3F;
        float var8 = (float) arg2 + 0.3F;
        float var9 = (float) class245.field3862 - ((float) arg1 + 0.3F);
        float var10 = (float) class245.field3862 - ((float) arg3 + 0.3F);
        GL var11 = class245.field3884;
        var11.glTexEnvi(8960, 34176, 34168);
        var11.glBegin(2);
        var11.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var11.glTexCoord2f((var7 - (float) field5430) / (float) arg6.field3693, ((float) class245.field3862 - var9 - (float) field5427) / (float) arg6.field3697);
        var11.glVertex2f(var7, var9);
        var11.glTexCoord2f((var8 - (float) field5430) / (float) arg6.field3693, ((float) class245.field3862 - var10 - (float) field5427) / (float) arg6.field3697);
        var11.glVertex2f(var8, var10);
        var11.glEnd();
        var11.glTexEnvi(8960, 34176, 5890);
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(IIII)V", line = 90)
    public static final void method2370(int arg0, int arg1, int arg2, int arg3) {
        if (field5430 < arg0) {
            field5430 = arg0;
        }
        if (field5427 < arg1) {
            field5427 = arg1;
        }
        if (field5426 > arg2) {
            field5426 = arg2;
        }
        if (field5429 > arg3) {
            field5429 = arg3;
        }
        GL var4 = class245.field3884;
        var4.glEnable(3089);
        if (field5430 <= field5426 && field5427 <= field5429) {
            var4.glScissor(field5430 + class245.field3857, class245.field3862 - field5429 + class245.field3887, field5426 - field5430, field5429 - field5427);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method2368();
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIII)V", line = 113)
    public static final void method2371(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class245.method1745();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class245.field3862 - ((float) arg1 + 0.3F);
        float var8 = (float) class245.field3862 - ((float) arg3 + 0.3F);
        GL var9 = class245.field3884;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "([I)V", line = 131)
    public static final void method2372(int[] arg0) {
        arg0[0] = field5430;
        arg0[1] = field5427;
        arg0[2] = field5426;
        arg0[3] = field5429;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([IIIII)V", line = 137)
    public static final void method2373(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class245.method1745();
        GL var5 = class245.field3884;
        var5.glRasterPos2i(arg1, class245.field3862 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class245.field3895 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(IIIII)V", line = 150)
    public static final void method2374(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class245.method1745();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + var5;
        float var7 = (float) class245.field3862 - ((float) arg1 + 0.3F);
        GL var8 = class245.field3884;
        var8.glBegin(1);
        var8.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, arg4 > 255 ? -1 : (byte) arg4);
        var8.glVertex2f(var5, var7);
        var8.glVertex2f(var6, var7);
        var8.glEnd();
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(IIII)V", line = 170)
    public static final void method2375(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class245.field3872) {
            arg2 = class245.field3872;
        }
        if (arg3 > class245.field3862) {
            arg3 = class245.field3862;
        }
        field5430 = arg0;
        field5427 = arg1;
        field5426 = arg2;
        field5429 = arg3;
        GL var4 = class245.field3884;
        var4.glEnable(3089);
        if (field5430 <= field5426 && field5427 <= field5429) {
            var4.glScissor(field5430 + class245.field3857, class245.field3862 - field5429 + class245.field3887, field5426 - field5430, field5429 - field5427);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method2368();
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(IIIII)V", line = 197)
    public static final void method2376(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class245.method1745();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class245.field3862 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class245.field3884;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(IIII)V", line = 228)
    public static final void method2377(int arg0, int arg1, int arg2, int arg3) {
        class245.method1745();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class245.field3862 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class245.field3884;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(IIIIII)V", line = 244)
    public static final void method2378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class245.method1745();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class245.field3862 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class245.field3884;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "()V", line = 264)
    public static final void method2379() {
        field5430 = 0;
        field5427 = 0;
        field5426 = class245.field3872;
        field5429 = class245.field3862;
        GL var0 = class245.field3884;
        var0.glDisable(3089);
        method2368();
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(IIIII)V", line = 275)
    public static final void method2380(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class245.method1745();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class245.field3862 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class245.field3884;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(IIIIII)V", line = 296)
    public static final void method2381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class245.field3884;
        var6.glLineWidth((float) arg5);
        method2371(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "()V", line = 302)
    public static void method2382() {
        field5428 = null;
    }
}
