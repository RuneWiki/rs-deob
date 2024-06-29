import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class337 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    private static int field5347 = 0;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field5348 = 0;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field5350 = 0;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field5349 = 0;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "Lof;")
    public static class265 field5351 = null;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIII)V", line = 6)
    public static final void method2368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class241.field4012;
        var6.glLineWidth((float) arg5);
        method2376(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()V", line = 12)
    public static final void method2369() {
        field5351 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V", line = 15)
    public static final void method2370(int arg0, int arg1, int arg2, int arg3) {
        if (field5348 < arg0) {
            field5348 = arg0;
        }
        if (field5350 < arg1) {
            field5350 = arg1;
        }
        if (field5347 > arg2) {
            field5347 = arg2;
        }
        if (field5349 > arg3) {
            field5349 = arg3;
        }
        GL var4 = class241.field4012;
        var4.glEnable(3089);
        if (field5348 <= field5347 && field5350 <= field5349) {
            var4.glScissor(field5348 + class241.field4019, class241.field3993 - field5349 + class241.field4015, field5347 - field5348, field5349 - field5350);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method2369();
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIII)V", line = 38)
    public static final void method2371(int arg0, int arg1, int arg2, int arg3) {
        class241.method1694();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class241.field3993 - ((float) arg1 + 0.3F);
        GL var7 = class241.field4012;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([IIIII)V", line = 55)
    public static final void method2372(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class241.method1694();
        GL var5 = class241.field4012;
        var5.glRasterPos2i(arg1, class241.field3993 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class241.field4007 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "()V", line = 68)
    public static final void method2373() {
        class241.field4012.glClear(16640);
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "()V", line = 71)
    public static final void method2374() {
        field5348 = 0;
        field5350 = 0;
        field5347 = class241.field4039;
        field5349 = class241.field3993;
        GL var0 = class241.field4012;
        var0.glDisable(3089);
        method2369();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([I)V", line = 81)
    public static final void method2375(int[] arg0) {
        method2385(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V", line = 84)
    public static final void method2376(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class241.method1694();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class241.field3993 - ((float) arg1 + 0.3F);
        float var8 = (float) class241.field3993 - ((float) arg3 + 0.3F);
        GL var9 = class241.field4012;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIIIII)V", line = 102)
    public static final void method2377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class241.method1694();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class241.field3993 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class241.field4012;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIIII)V", line = 122)
    public static final void method2378(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class241.method1694();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class241.field3993 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class241.field4012;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "([I)V", line = 143)
    public static final void method2379(int[] arg0) {
        arg0[0] = field5348;
        arg0[1] = field5350;
        arg0[2] = field5347;
        arg0[3] = field5349;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(IIIIII)V", line = 149)
    public static final void method2380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class241.method1694();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class241.field3993 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class241.field4012;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lof;)V", line = 173)
    public static final void method2381(class265 arg0) {
        if (field5349 - field5350 != arg0.field1356) {
            throw new IllegalArgumentException();
        }
        field5351 = arg0;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIILof;)V", line = 186)
    public static final void method2382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class265 arg6) {
        if (field5349 - field5350 != arg6.field1356) {
            throw new IllegalStateException();
        }
        class241.method1694();
        class241.method1687(arg6.field4336);
        class241.method1719(1);
        class241.method1718(0);
        float var7 = (float) arg0 + 0.3F;
        float var8 = (float) arg2 + 0.3F;
        float var9 = (float) class241.field3993 - ((float) arg1 + 0.3F);
        float var10 = (float) class241.field3993 - ((float) arg3 + 0.3F);
        GL var11 = class241.field4012;
        var11.glTexEnvi(8960, 34176, 34168);
        var11.glBegin(2);
        var11.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var11.glTexCoord2f((var7 - (float) field5348) / (float) arg6.field4339, ((float) class241.field3993 - var9 - (float) field5350) / (float) arg6.field4340);
        var11.glVertex2f(var7, var9);
        var11.glTexCoord2f((var8 - (float) field5348) / (float) arg6.field4339, ((float) class241.field3993 - var10 - (float) field5350) / (float) arg6.field4340);
        var11.glVertex2f(var8, var10);
        var11.glEnd();
        var11.glTexEnvi(8960, 34176, 5890);
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(IIIII)V", line = 215)
    public static final void method2383(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class241.method1694();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + var5;
        float var7 = (float) class241.field3993 - ((float) arg1 + 0.3F);
        GL var8 = class241.field4012;
        var8.glBegin(1);
        var8.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, arg4 > 255 ? -1 : (byte) arg4);
        var8.glVertex2f(var5, var7);
        var8.glVertex2f(var6, var7);
        var8.glEnd();
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(IIII)V", line = 234)
    public static final void method2384(int arg0, int arg1, int arg2, int arg3) {
        class241.method1694();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class241.field3993 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class241.field4012;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(IIII)V", line = 250)
    public static final void method2385(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class241.field4039) {
            arg2 = class241.field4039;
        }
        if (arg3 > class241.field3993) {
            arg3 = class241.field3993;
        }
        field5348 = arg0;
        field5350 = arg1;
        field5347 = arg2;
        field5349 = arg3;
        GL var4 = class241.field4012;
        var4.glEnable(3089);
        if (field5348 <= field5347 && field5350 <= field5349) {
            var4.glScissor(field5348 + class241.field4019, class241.field3993 - field5349 + class241.field4015, field5347 - field5348, field5349 - field5350);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method2369();
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "()V", line = 281)
    public static void method2386() {
        field5351 = null;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(IIIII)V", line = 284)
    public static final void method2387(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class241.method1694();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class241.field3993 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class241.field4012;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }
}
