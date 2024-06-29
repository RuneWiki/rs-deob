import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class326 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field5649 = 0;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Lcf;")
    public static class130 field5648 = null;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field5650 = 0;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field5652 = 0;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    private static int field5651 = 0;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "()V", line = 5)
    public static final void method2265() {
        field5648 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)V", line = 8)
    public static final void method2266(int arg0, int arg1, int arg2, int arg3) {
        class255.method1775();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class255.field4188 - ((float) arg1 + 0.3F);
        GL var7 = class255.field4181;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "()V", line = 24)
    public static void method2267() {
        field5648 = null;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(IIII)V", line = 27)
    public static final void method2268(int arg0, int arg1, int arg2, int arg3) {
        class255.method1775();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class255.field4188 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class255.field4181;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "()V", line = 46)
    public static final void method2269() {
        field5650 = 0;
        field5649 = 0;
        field5651 = class255.field4197;
        field5652 = class255.field4188;
        GL var0 = class255.field4181;
        var0.glDisable(3089);
        method2265();
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([IIIII)V", line = 56)
    public static final void method2270(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class255.method1775();
        GL var5 = class255.field4181;
        var5.glRasterPos2i(arg1, class255.field4188 - arg2);
        var5.glPixelZoom(1.0F, -1.0F);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class255.field4167 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
        var5.glPixelZoom(1.0F, 1.0F);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V", line = 69)
    public static final void method2271(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class255.method1775();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class255.field4188 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class255.field4181;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIII)V", line = 90)
    public static final void method2272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class255.method1775();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class255.field4188 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class255.field4181;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(IIIIII)V", line = 111)
    public static final void method2273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class255.method1775();
        GL var25 = class255.field4181;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class255.field4188 - var24));
            var25.glVertex2f((float) var19, (float) (class255.field4188 - var23));
            var25.glVertex2f((float) var18, (float) (class255.field4188 - var22));
            var25.glVertex2f((float) var17, (float) (class255.field4188 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class255.field4188 - var21));
            var25.glVertex2f((float) var18, (float) (class255.field4188 - var22));
            var25.glVertex2f((float) var19, (float) (class255.field4188 - var23));
            var25.glVertex2f((float) var20, (float) (class255.field4188 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(IIIIII)V", line = 185)
    public static final void method2274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class255.method1775();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class255.field4188 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class255.field4181;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(IIII)V", line = 205)
    public static final void method2275(int arg0, int arg1, int arg2, int arg3) {
        if (field5650 < arg0) {
            field5650 = arg0;
        }
        if (field5649 < arg1) {
            field5649 = arg1;
        }
        if (field5651 > arg2) {
            field5651 = arg2;
        }
        if (field5652 > arg3) {
            field5652 = arg3;
        }
        GL var4 = class255.field4181;
        var4.glEnable(3089);
        if (field5650 <= field5651 && field5649 <= field5652) {
            var4.glScissor(field5650, class255.field4188 - field5652, field5651 - field5650, field5652 - field5649);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method2265();
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "()V", line = 231)
    public static final void method2276() {
        class255.field4181.glClear(16640);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(IIIII)V", line = 235)
    public static final void method2277(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class255.method1775();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class255.field4188 - ((float) arg1 + 0.3F);
        float var8 = (float) class255.field4188 - ((float) arg3 + 0.3F);
        GL var9 = class255.field4181;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(IIIII)V", line = 253)
    public static final void method2278(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class255.method1775();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class255.field4188 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class255.field4181;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(IIII)V", line = 279)
    public static final void method2279(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class255.field4197) {
            arg2 = class255.field4197;
        }
        if (arg3 > class255.field4188) {
            arg3 = class255.field4188;
        }
        field5650 = arg0;
        field5649 = arg1;
        field5651 = arg2;
        field5652 = arg3;
        GL var4 = class255.field4181;
        var4.glEnable(3089);
        if (field5650 <= field5651 && field5649 <= field5652) {
            var4.glScissor(field5650, class255.field4188 - field5652, field5651 - field5650, field5652 - field5649);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method2265();
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lcf;)V", line = 308)
    public static final void method2280(class130 arg0) {
        if (field5652 - field5649 != arg0.field2308) {
            throw new IllegalArgumentException();
        }
        field5648 = arg0;
    }
}
