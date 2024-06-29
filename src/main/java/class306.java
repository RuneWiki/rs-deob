import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class306 {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field4737 = 0;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lvc;")
    public static class202 field4736 = null;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field4738 = 0;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field4739 = 0;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    private static int field4740 = 0;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([IIIII)V", line = 5)
    public static final void method2139(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class250.method1828();
        GL var5 = class250.field3818;
        var5.glRasterPos2i(arg1, class250.field3820 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class250.field3825 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIII)V", line = 18)
    public static final void method2140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class250.method1828();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class250.field3820 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class250.field3818;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIIIII)V", line = 38)
    public static final void method2141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class250.method1828();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class250.field3820 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class250.field3818;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([I)V", line = 58)
    public static final void method2142(int[] arg0) {
        method2149(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()V", line = 61)
    public static final void method2143() {
        field4737 = 0;
        field4738 = 0;
        field4740 = class250.field3810;
        field4739 = class250.field3820;
        GL var0 = class250.field3818;
        var0.glDisable(3089);
        method2155();
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(IIIIII)V", line = 72)
    public static final void method2144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class250.field3818;
        var6.glLineWidth((float) arg5);
        method2145(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII)V", line = 86)
    public static final void method2145(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class250.method1828();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class250.field3820 - ((float) arg1 + 0.3F);
        float var8 = (float) class250.field3820 - ((float) arg3 + 0.3F);
        GL var9 = class250.field3818;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)V", line = 104)
    public static final void method2146(int arg0, int arg1, int arg2, int arg3) {
        class250.method1828();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class250.field3820 - ((float) arg1 + 0.3F);
        GL var7 = class250.field3818;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "([I)V", line = 120)
    public static final void method2147(int[] arg0) {
        arg0[0] = field4737;
        arg0[1] = field4738;
        arg0[2] = field4740;
        arg0[3] = field4739;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIII)V", line = 127)
    public static final void method2148(int arg0, int arg1, int arg2, int arg3) {
        class250.method1828();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class250.field3820 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class250.field3818;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(IIII)V", line = 146)
    public static final void method2149(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class250.field3810) {
            arg2 = class250.field3810;
        }
        if (arg3 > class250.field3820) {
            arg3 = class250.field3820;
        }
        field4737 = arg0;
        field4738 = arg1;
        field4740 = arg2;
        field4739 = arg3;
        GL var4 = class250.field3818;
        var4.glEnable(3089);
        if (field4737 <= field4740 && field4738 <= field4739) {
            var4.glScissor(field4737 + class250.field3785, class250.field3820 - field4739 + class250.field3806, field4740 - field4737, field4739 - field4738);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method2155();
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(IIII)V", line = 177)
    public static final void method2150(int arg0, int arg1, int arg2, int arg3) {
        if (field4737 < arg0) {
            field4737 = arg0;
        }
        if (field4738 < arg1) {
            field4738 = arg1;
        }
        if (field4740 > arg2) {
            field4740 = arg2;
        }
        if (field4739 > arg3) {
            field4739 = arg3;
        }
        GL var4 = class250.field3818;
        var4.glEnable(3089);
        if (field4737 <= field4740 && field4738 <= field4739) {
            var4.glScissor(field4737 + class250.field3785, class250.field3820 - field4739 + class250.field3806, field4740 - field4737, field4739 - field4738);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method2155();
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "()V", line = 200)
    public static void method2151() {
        field4736 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lvc;)V", line = 203)
    public static final void method2152(class202 arg0) {
        if (field4739 - field4738 != arg0.field1144) {
            throw new IllegalArgumentException();
        }
        field4736 = arg0;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "()V", line = 213)
    public static final void method2153() {
        class250.field3818.glClear(16640);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIIII)V", line = 216)
    public static final void method2154(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class250.method1828();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class250.field3820 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class250.field3818;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "()V", line = 241)
    public static final void method2155() {
        field4736 = null;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(IIIII)V", line = 244)
    public static final void method2156(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class250.method1828();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class250.field3820 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class250.field3818;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }
}
