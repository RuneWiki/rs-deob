import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class126 {

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Lji;")
    public static class98 field2088 = null;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    private static int field2086 = 0;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field2087 = 0;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field2090 = 0;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field2089 = 0;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method926(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class281.method1981();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class281.field4823 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class281.field4839;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()V", line = 25)
    public static final void method927() {
        field2089 = 0;
        field2090 = 0;
        field2086 = class281.field4818;
        field2087 = class281.field4823;
        GL var0 = class281.field4839;
        var0.glDisable(3089);
        method935();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lji;)V", line = 36)
    public static final void method928(class98 arg0) {
        if (field2087 - field2090 != arg0.field4628) {
            throw new IllegalArgumentException();
        }
        field2088 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIII)V", line = 48)
    public static final void method929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class281.method1981();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class281.field4823 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class281.field4839;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIII)V", line = 71)
    public static final void method930(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class281.method1981();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class281.field4823 - ((float) arg1 + 0.3F);
        float var8 = (float) class281.field4823 - ((float) arg3 + 0.3F);
        GL var9 = class281.field4839;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()V", line = 89)
    public static void method931() {
        field2088 = null;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIIII)V", line = 94)
    public static final void method932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class281.method1981();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class281.field4823 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class281.field4839;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "()V", line = 115)
    public static final void method933() {
        class281.field4839.glClear(16640);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)V", line = 118)
    public static final void method934(int arg0, int arg1, int arg2, int arg3) {
        if (field2089 < arg0) {
            field2089 = arg0;
        }
        if (field2090 < arg1) {
            field2090 = arg1;
        }
        if (field2086 > arg2) {
            field2086 = arg2;
        }
        if (field2087 > arg3) {
            field2087 = arg3;
        }
        GL var4 = class281.field4839;
        var4.glEnable(3089);
        if (field2089 <= field2086 && field2090 <= field2087) {
            var4.glScissor(field2089, class281.field4823 - field2087, field2086 - field2089, field2087 - field2090);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method935();
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "()V", line = 144)
    public static final void method935() {
        field2088 = null;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(IIIII)V", line = 150)
    public static final void method936(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class281.method1981();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class281.field4823 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class281.field4839;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIII)V", line = 170)
    public static final void method937(int arg0, int arg1, int arg2, int arg3) {
        class281.method1981();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class281.field4823 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class281.field4839;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(IIII)V", line = 188)
    public static final void method938(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class281.field4818) {
            arg2 = class281.field4818;
        }
        if (arg3 > class281.field4823) {
            arg3 = class281.field4823;
        }
        field2089 = arg0;
        field2090 = arg1;
        field2086 = arg2;
        field2087 = arg3;
        GL var4 = class281.field4839;
        var4.glEnable(3089);
        if (field2089 <= field2086 && field2090 <= field2087) {
            var4.glScissor(field2089, class281.field4823 - field2087, field2086 - field2089, field2087 - field2090);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method935();
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(IIII)V", line = 215)
    public static final void method939(int arg0, int arg1, int arg2, int arg3) {
        class281.method1981();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class281.field4823 - ((float) arg1 + 0.3F);
        GL var7 = class281.field4839;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(IIIIII)V", line = 236)
    public static final void method940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class281.method1981();
        GL var25 = class281.field4839;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class281.field4823 - var24));
            var25.glVertex2f((float) var19, (float) (class281.field4823 - var23));
            var25.glVertex2f((float) var18, (float) (class281.field4823 - var22));
            var25.glVertex2f((float) var17, (float) (class281.field4823 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class281.field4823 - var21));
            var25.glVertex2f((float) var18, (float) (class281.field4823 - var22));
            var25.glVertex2f((float) var19, (float) (class281.field4823 - var23));
            var25.glVertex2f((float) var20, (float) (class281.field4823 - var24));
        }
        var25.glEnd();
    }
}
