import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class308 {

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field4691 = 0;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field4689 = 0;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    private static int field4688 = 0;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Lkb;")
    public static class303 field4687 = null;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field4690 = 0;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([IIIII)V", line = 6)
    public static final void method2120(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class117.method815();
        GL var5 = class117.field1801;
        var5.glRasterPos2i(arg1, class117.field1807 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class117.field1811 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIII)V", line = 20)
    public static final void method2121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class117.method815();
        GL var25 = class117.field1801;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class117.field1807 - var24));
            var25.glVertex2f((float) var19, (float) (class117.field1807 - var23));
            var25.glVertex2f((float) var18, (float) (class117.field1807 - var22));
            var25.glVertex2f((float) var17, (float) (class117.field1807 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class117.field1807 - var21));
            var25.glVertex2f((float) var18, (float) (class117.field1807 - var22));
            var25.glVertex2f((float) var19, (float) (class117.field1807 - var23));
            var25.glVertex2f((float) var20, (float) (class117.field1807 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIIIII)V", line = 92)
    public static final void method2122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class117.method815();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class117.field1807 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class117.field1801;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V", line = 120)
    public static final void method2123(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class117.field1791) {
            arg2 = class117.field1791;
        }
        if (arg3 > class117.field1807) {
            arg3 = class117.field1807;
        }
        field4690 = arg0;
        field4691 = arg1;
        field4688 = arg2;
        field4689 = arg3;
        GL var4 = class117.field1801;
        var4.glEnable(3089);
        if (field4690 <= field4688 && field4691 <= field4689) {
            var4.glScissor(field4690, class117.field1807 - field4689, field4688 - field4690, field4689 - field4691);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method2134();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lkb;)V", line = 147)
    public static final void method2124(class303 arg0) {
        if (field4689 - field4691 != arg0.field3537) {
            throw new IllegalArgumentException();
        }
        field4687 = arg0;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIIIII)V", line = 158)
    public static final void method2125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class117.method815();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class117.field1807 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class117.field1801;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)V", line = 186)
    public static final void method2126(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class117.method815();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class117.field1807 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class117.field1801;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIIII)V", line = 206)
    public static final void method2127(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class117.method815();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class117.field1807 - ((float) arg1 + 0.3F);
        float var8 = (float) class117.field1807 - ((float) arg3 + 0.3F);
        GL var9 = class117.field1801;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIIII)V", line = 224)
    public static final void method2128(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class117.method815();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class117.field1807 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class117.field1801;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIII)V", line = 244)
    public static final void method2129(int arg0, int arg1, int arg2, int arg3) {
        if (field4690 < arg0) {
            field4690 = arg0;
        }
        if (field4691 < arg1) {
            field4691 = arg1;
        }
        if (field4688 > arg2) {
            field4688 = arg2;
        }
        if (field4689 > arg3) {
            field4689 = arg3;
        }
        GL var4 = class117.field1801;
        var4.glEnable(3089);
        if (field4690 <= field4688 && field4691 <= field4689) {
            var4.glScissor(field4690, class117.field1807 - field4689, field4688 - field4690, field4689 - field4691);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method2134();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()V", line = 267)
    public static final void method2130() {
        class117.field1801.glClear(16640);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "()V", line = 271)
    public static void method2131() {
        field4687 = null;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIII)V", line = 274)
    public static final void method2132(int arg0, int arg1, int arg2, int arg3) {
        class117.method815();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class117.field1807 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class117.field1801;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "()V", line = 290)
    public static final void method2133() {
        field4690 = 0;
        field4691 = 0;
        field4688 = class117.field1791;
        field4689 = class117.field1807;
        GL var0 = class117.field1801;
        var0.glDisable(3089);
        method2134();
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "()V", line = 300)
    public static final void method2134() {
        field4687 = null;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(IIII)V", line = 303)
    public static final void method2135(int arg0, int arg1, int arg2, int arg3) {
        class117.method815();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class117.field1807 - ((float) arg1 + 0.3F);
        GL var7 = class117.field1801;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }
}
