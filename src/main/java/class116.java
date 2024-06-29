import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class116 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    private static int field2052 = 0;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field2051 = 0;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field2053 = 0;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field2054 = 0;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lpi;")
    public static class210 field2055 = null;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method781(int arg0, int arg1, int arg2, int arg3) {
        class147.method996();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class147.field2495 - ((float) arg1 + 0.3F);
        GL var7 = class147.field2479;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V", line = 20)
    public static final void method782() {
        field2055 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V", line = 23)
    public static final void method783(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class147.method996();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class147.field2495 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class147.field2479;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)V", line = 43)
    public static final void method784(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class147.method996();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class147.field2495 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class147.field2479;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIIIII)V", line = 64)
    public static final void method785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class147.method996();
        GL var25 = class147.field2479;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class147.field2495 - var24));
            var25.glVertex2f((float) var19, (float) (class147.field2495 - var23));
            var25.glVertex2f((float) var18, (float) (class147.field2495 - var22));
            var25.glVertex2f((float) var17, (float) (class147.field2495 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class147.field2495 - var21));
            var25.glVertex2f((float) var18, (float) (class147.field2495 - var22));
            var25.glVertex2f((float) var19, (float) (class147.field2495 - var23));
            var25.glVertex2f((float) var20, (float) (class147.field2495 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIIII)V", line = 136)
    public static final void method786(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class147.method996();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class147.field2495 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class147.field2479;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIII)V", line = 157)
    public static final void method787(int arg0, int arg1, int arg2, int arg3) {
        if (field2053 < arg0) {
            field2053 = arg0;
        }
        if (field2051 < arg1) {
            field2051 = arg1;
        }
        if (field2052 > arg2) {
            field2052 = arg2;
        }
        if (field2054 > arg3) {
            field2054 = arg3;
        }
        GL var4 = class147.field2479;
        var4.glEnable(3089);
        if (field2053 <= field2052 && field2051 <= field2054) {
            var4.glScissor(field2053, class147.field2495 - field2054, field2052 - field2053, field2054 - field2051);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method782();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lpi;)V", line = 185)
    public static final void method788(class210 arg0) {
        if (field2054 - field2051 != arg0.field1533) {
            throw new IllegalArgumentException();
        }
        field2055 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(IIII)V", line = 195)
    public static final void method789(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class147.field2498) {
            arg2 = class147.field2498;
        }
        if (arg3 > class147.field2495) {
            arg3 = class147.field2495;
        }
        field2053 = arg0;
        field2051 = arg1;
        field2052 = arg2;
        field2054 = arg3;
        GL var4 = class147.field2479;
        var4.glEnable(3089);
        if (field2053 <= field2052 && field2051 <= field2054) {
            var4.glScissor(field2053, class147.field2495 - field2054, field2052 - field2053, field2054 - field2051);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method782();
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V", line = 222)
    public static final void method790() {
        field2053 = 0;
        field2051 = 0;
        field2052 = class147.field2498;
        field2054 = class147.field2495;
        GL var0 = class147.field2479;
        var0.glDisable(3089);
        method782();
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(IIIII)V", line = 236)
    public static final void method791(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class147.method996();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class147.field2495 - ((float) arg1 + 0.3F);
        float var8 = (float) class147.field2495 - ((float) arg3 + 0.3F);
        GL var9 = class147.field2479;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(IIII)V", line = 255)
    public static final void method792(int arg0, int arg1, int arg2, int arg3) {
        class147.method996();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class147.field2495 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class147.field2479;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "()V", line = 272)
    public static final void method793() {
        class147.field2479.glClear(16640);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "()V", line = 275)
    public static void method794() {
        field2055 = null;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(IIIIII)V", line = 290)
    public static final void method795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class147.method996();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class147.field2495 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class147.field2479;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }
}
