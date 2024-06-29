import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class131 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2221 = 0;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2223 = 0;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2222 = 0;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Laa;")
    public static class8 field2224 = null;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    private static int field2225 = 0;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method964(int arg0, int arg1, int arg2, int arg3) {
        if (field2223 < arg0) {
            field2223 = arg0;
        }
        if (field2221 < arg1) {
            field2221 = arg1;
        }
        if (field2225 > arg2) {
            field2225 = arg2;
        }
        if (field2222 > arg3) {
            field2222 = arg3;
        }
        GL var4 = class271.field4641;
        var4.glEnable(3089);
        if (field2223 <= field2225 && field2221 <= field2222) {
            var4.glScissor(field2223, class271.field4628 - field2222, field2225 - field2223, field2222 - field2221);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method977();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIII)V", line = 29)
    public static final void method965(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class271.method1984();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class271.field4628 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class271.field4641;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([IIIII)V", line = 49)
    public static final void method966(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class271.method1984();
        GL var5 = class271.field4641;
        var5.glRasterPos2i(arg1, class271.field4628 - arg2);
        var5.glPixelZoom(1.0F, -1.0F);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class271.field4657 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
        var5.glPixelZoom(1.0F, 1.0F);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIII)V", line = 70)
    public static final void method967(int arg0, int arg1, int arg2, int arg3) {
        class271.method1984();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class271.field4628 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class271.field4641;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Laa;)V", line = 86)
    public static final void method968(class8 arg0) {
        if (field2222 - field2221 != arg0.field1155) {
            throw new IllegalArgumentException();
        }
        field2224 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIII)V", line = 96)
    public static final void method969(int arg0, int arg1, int arg2, int arg3) {
        class271.method1984();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class271.field4628 - ((float) arg1 + 0.3F);
        GL var7 = class271.field4641;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()V", line = 112)
    public static void method970() {
        field2224 = null;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()V", line = 117)
    public static final void method971() {
        class271.field4641.glClear(16640);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIIII)V", line = 120)
    public static final void method972(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class271.method1984();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class271.field4628 - ((float) arg1 + 0.3F);
        float var8 = (float) class271.field4628 - ((float) arg3 + 0.3F);
        GL var9 = class271.field4641;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(IIII)V", line = 140)
    public static final void method973(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class271.field4654) {
            arg2 = class271.field4654;
        }
        if (arg3 > class271.field4628) {
            arg3 = class271.field4628;
        }
        field2223 = arg0;
        field2221 = arg1;
        field2225 = arg2;
        field2222 = arg3;
        GL var4 = class271.field4641;
        var4.glEnable(3089);
        if (field2223 <= field2225 && field2221 <= field2222) {
            var4.glScissor(field2223, class271.field4628 - field2222, field2225 - field2223, field2222 - field2221);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method977();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIII)V", line = 167)
    public static final void method974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class271.method1984();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class271.field4628 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class271.field4641;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIIIII)V", line = 187)
    public static final void method975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class271.method1984();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class271.field4628 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class271.field4641;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "()V", line = 211)
    public static final void method976() {
        field2223 = 0;
        field2221 = 0;
        field2225 = class271.field4654;
        field2222 = class271.field4628;
        GL var0 = class271.field4641;
        var0.glDisable(3089);
        method977();
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "()V", line = 221)
    public static final void method977() {
        field2224 = null;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIIII)V", line = 228)
    public static final void method978(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class271.method1984();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class271.field4628 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class271.field4641;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIIIII)V", line = 249)
    public static final void method979(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class271.method1984();
        GL var25 = class271.field4641;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class271.field4628 - var24));
            var25.glVertex2f((float) var19, (float) (class271.field4628 - var23));
            var25.glVertex2f((float) var18, (float) (class271.field4628 - var22));
            var25.glVertex2f((float) var17, (float) (class271.field4628 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class271.field4628 - var21));
            var25.glVertex2f((float) var18, (float) (class271.field4628 - var22));
            var25.glVertex2f((float) var19, (float) (class271.field4628 - var23));
            var25.glVertex2f((float) var20, (float) (class271.field4628 - var24));
        }
        var25.glEnd();
    }
}
