import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class16 {

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field239 = 0;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field241 = 0;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    private static int field242 = 0;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Lhg;")
    public static class140 field238 = null;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field240 = 0;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()V", line = 4)
    public static final void method122() {
        field240 = 0;
        field239 = 0;
        field242 = class117.field2142;
        field241 = class117.field2126;
        GL var0 = class117.field2143;
        var0.glDisable(3089);
        method134();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)V", line = 16)
    public static final void method123(int arg0, int arg1, int arg2, int arg3) {
        class117.method938();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class117.field2126 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class117.field2143;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIII)V", line = 32)
    public static final void method124(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class117.method938();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class117.field2126 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class117.field2143;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIII)V", line = 52)
    public static final void method125(int arg0, int arg1, int arg2, int arg3) {
        if (field240 < arg0) {
            field240 = arg0;
        }
        if (field239 < arg1) {
            field239 = arg1;
        }
        if (field242 > arg2) {
            field242 = arg2;
        }
        if (field241 > arg3) {
            field241 = arg3;
        }
        GL var4 = class117.field2143;
        var4.glEnable(3089);
        if (field240 <= field242 && field239 <= field241) {
            var4.glScissor(field240, class117.field2126 - field241, field242 - field240, field241 - field239);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method134();
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()V", line = 75)
    public static final void method126() {
        class117.field2143.glClear(16640);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lhg;)V", line = 79)
    public static final void method127(class140 arg0) {
        if (field241 - field239 != arg0.field1135) {
            throw new IllegalArgumentException();
        }
        field238 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIIII)V", line = 89)
    public static final void method128(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class117.method938();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class117.field2126 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class117.field2143;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIII)V", line = 110)
    public static final void method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class117.method938();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class117.field2126 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class117.field2143;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIIIII)V", line = 131)
    public static final void method130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class117.method938();
        GL var25 = class117.field2143;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class117.field2126 - var24));
            var25.glVertex2f((float) var19, (float) (class117.field2126 - var23));
            var25.glVertex2f((float) var18, (float) (class117.field2126 - var22));
            var25.glVertex2f((float) var17, (float) (class117.field2126 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class117.field2126 - var21));
            var25.glVertex2f((float) var18, (float) (class117.field2126 - var22));
            var25.glVertex2f((float) var19, (float) (class117.field2126 - var23));
            var25.glVertex2f((float) var20, (float) (class117.field2126 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIII)V", line = 203)
    public static final void method131(int arg0, int arg1, int arg2, int arg3) {
        class117.method938();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class117.field2126 - ((float) arg1 + 0.3F);
        GL var7 = class117.field2143;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIIII)V", line = 219)
    public static final void method132(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class117.method938();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class117.field2126 - ((float) arg1 + 0.3F);
        float var8 = (float) class117.field2126 - ((float) arg3 + 0.3F);
        GL var9 = class117.field2143;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(IIII)V", line = 237)
    public static final void method133(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class117.field2142) {
            arg2 = class117.field2142;
        }
        if (arg3 > class117.field2126) {
            arg3 = class117.field2126;
        }
        field240 = arg0;
        field239 = arg1;
        field242 = arg2;
        field241 = arg3;
        GL var4 = class117.field2143;
        var4.glEnable(3089);
        if (field240 <= field242 && field239 <= field241) {
            var4.glScissor(field240, class117.field2126 - field241, field242 - field240, field241 - field239);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method134();
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "()V", line = 265)
    public static final void method134() {
        field238 = null;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIIIII)V", line = 276)
    public static final void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class117.method938();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class117.field2126 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class117.field2143;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "()V", line = 304)
    public static void method136() {
        field238 = null;
    }
}
