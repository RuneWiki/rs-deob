import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class238 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field3805 = 0;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Lrn;")
    public static class186 field3807 = null;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field3808 = 0;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    private static int field3806 = 0;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field3809 = 0;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([I)V", line = 6)
    public static final void method1620(int[] arg0) {
        method1633(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V", line = 13)
    public static final void method1621(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class333.method2307();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class333.field5182 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class333.field5160;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V", line = 34)
    public static void method1622() {
        field3807 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([IIIII)V", line = 37)
    public static final void method1623(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class333.method2307();
        GL var5 = class333.field5160;
        var5.glRasterPos2i(arg1, class333.field5182 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class333.field5170 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()V", line = 52)
    public static final void method1624() {
        class333.field5160.glClear(16640);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lrn;)V", line = 56)
    public static final void method1625(class186 arg0) {
        if (field3809 - field3805 != arg0.field3844) {
            throw new IllegalArgumentException();
        }
        field3807 = arg0;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)V", line = 66)
    public static final void method1626(int arg0, int arg1, int arg2, int arg3) {
        class333.method2307();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class333.field5182 - ((float) arg1 + 0.3F);
        GL var7 = class333.field5160;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIII)V", line = 83)
    public static final void method1627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class333.method2307();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class333.field5182 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class333.field5160;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(IIIIII)V", line = 103)
    public static final void method1628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class333.method2307();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class333.field5182 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class333.field5160;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()V", line = 127)
    public static final void method1629() {
        field3808 = 0;
        field3805 = 0;
        field3806 = class333.field5165;
        field3809 = class333.field5182;
        GL var0 = class333.field5160;
        var0.glDisable(3089);
        method1631();
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "([I)V", line = 137)
    public static final void method1630(int[] arg0) {
        arg0[0] = field3808;
        arg0[1] = field3805;
        arg0[2] = field3806;
        arg0[3] = field3809;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "()V", line = 143)
    public static final void method1631() {
        field3807 = null;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(IIII)V", line = 150)
    public static final void method1632(int arg0, int arg1, int arg2, int arg3) {
        if (field3808 < arg0) {
            field3808 = arg0;
        }
        if (field3805 < arg1) {
            field3805 = arg1;
        }
        if (field3806 > arg2) {
            field3806 = arg2;
        }
        if (field3809 > arg3) {
            field3809 = arg3;
        }
        GL var4 = class333.field5160;
        var4.glEnable(3089);
        if (field3808 <= field3806 && field3805 <= field3809) {
            var4.glScissor(class333.field5175 + field3808, class333.field5182 - field3809 + class333.field5162, field3806 - field3808, field3809 - field3805);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1631();
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(IIII)V", line = 179)
    public static final void method1633(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class333.field5165) {
            arg2 = class333.field5165;
        }
        if (arg3 > class333.field5182) {
            arg3 = class333.field5182;
        }
        field3808 = arg0;
        field3805 = arg1;
        field3806 = arg2;
        field3809 = arg3;
        GL var4 = class333.field5160;
        var4.glEnable(3089);
        if (field3808 <= field3806 && field3805 <= field3809) {
            var4.glScissor(class333.field5175 + field3808, class333.field5182 - field3809 + class333.field5162, field3806 - field3808, field3809 - field3805);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1631();
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(IIIIII)V", line = 207)
    public static final void method1634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class333.field5160;
        var6.glLineWidth((float) arg5);
        method1635(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(IIIII)V", line = 213)
    public static final void method1635(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class333.method2307();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class333.field5182 - ((float) arg1 + 0.3F);
        float var8 = (float) class333.field5182 - ((float) arg3 + 0.3F);
        GL var9 = class333.field5160;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(IIIII)V", line = 231)
    public static final void method1636(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class333.method2307();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class333.field5182 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class333.field5160;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(IIII)V", line = 251)
    public static final void method1637(int arg0, int arg1, int arg2, int arg3) {
        class333.method2307();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class333.field5182 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class333.field5160;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }
}
