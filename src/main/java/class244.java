import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class244 {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field4005 = 0;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field4007 = 0;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    private static int field4008 = 0;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lwe;")
    public static class58 field4006 = null;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field4009 = 0;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([IIIII)V", line = 5)
    public static final void method1854(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class42.method289();
        GL var5 = class42.field627;
        var5.glRasterPos2i(arg1, class42.field622 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class42.field625 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIII)V", line = 17)
    public static final void method1855(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class42.field627;
        var6.glLineWidth((float) arg5);
        method1858(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)V", line = 23)
    public static final void method1856(int arg0, int arg1, int arg2, int arg3) {
        class42.method289();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class42.field622 - ((float) arg1 + 0.3F);
        GL var7 = class42.field627;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IIII)V", line = 40)
    public static final void method1857(int arg0, int arg1, int arg2, int arg3) {
        class42.method289();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class42.field622 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class42.field627;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V", line = 59)
    public static final void method1858(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class42.method289();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class42.field622 - ((float) arg1 + 0.3F);
        float var8 = (float) class42.field622 - ((float) arg3 + 0.3F);
        GL var9 = class42.field627;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(IIII)V", line = 77)
    public static final void method1859(int arg0, int arg1, int arg2, int arg3) {
        if (field4009 < arg0) {
            field4009 = arg0;
        }
        if (field4005 < arg1) {
            field4005 = arg1;
        }
        if (field4008 > arg2) {
            field4008 = arg2;
        }
        if (field4007 > arg3) {
            field4007 = arg3;
        }
        GL var4 = class42.field627;
        var4.glEnable(3089);
        if (field4009 <= field4008 && field4005 <= field4007) {
            var4.glScissor(class42.field648 + field4009, class42.field622 - field4007 + class42.field602, field4008 - field4009, field4007 - field4005);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1867();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIILwe;)V", line = 101)
    public static final void method1860(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class58 arg6) {
        if (field4007 - field4005 != arg6.field199) {
            throw new IllegalStateException();
        }
        class42.method289();
        class42.method273(arg6.field1007);
        class42.method275(1);
        class42.method277(0);
        float var7 = (float) arg0 + 0.3F;
        float var8 = (float) arg2 + 0.3F;
        float var9 = (float) class42.field622 - ((float) arg1 + 0.3F);
        float var10 = (float) class42.field622 - ((float) arg3 + 0.3F);
        GL var11 = class42.field627;
        var11.glTexEnvi(8960, 34176, 34168);
        var11.glBegin(2);
        var11.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var11.glTexCoord2f((var7 - (float) field4009) / (float) arg6.field1004, ((float) class42.field622 - var9 - (float) field4005) / (float) arg6.field1001);
        var11.glVertex2f(var7, var9);
        var11.glTexCoord2f((var8 - (float) field4009) / (float) arg6.field1004, ((float) class42.field622 - var10 - (float) field4005) / (float) arg6.field1001);
        var11.glVertex2f(var8, var10);
        var11.glEnd();
        var11.glTexEnvi(8960, 34176, 5890);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([I)V", line = 130)
    public static final void method1861(int[] arg0) {
        method1871(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IIIII)V", line = 137)
    public static final void method1862(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class42.method289();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class42.field622 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class42.field627;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V", line = 157)
    public static final void method1863() {
        field4009 = 0;
        field4005 = 0;
        field4008 = class42.field616;
        field4007 = class42.field622;
        GL var0 = class42.field627;
        var0.glDisable(3089);
        method1867();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lwe;)V", line = 167)
    public static final void method1864(class58 arg0) {
        if (field4007 - field4005 != arg0.field199) {
            throw new IllegalArgumentException();
        }
        field4006 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(IIIII)V", line = 177)
    public static final void method1865(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class42.method289();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class42.field622 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class42.field627;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()V", line = 199)
    public static final void method1866() {
        class42.field627.glClear(16640);
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "()V", line = 208)
    public static final void method1867() {
        field4006 = null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "([I)V", line = 211)
    public static final void method1868(int[] arg0) {
        arg0[0] = field4009;
        arg0[1] = field4005;
        arg0[2] = field4008;
        arg0[3] = field4007;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IIIIII)V", line = 220)
    public static final void method1869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class42.method289();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class42.field622 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class42.field627;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "()V", line = 240)
    public static void method1870() {
        field4006 = null;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(IIII)V", line = 247)
    public static final void method1871(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class42.field616) {
            arg2 = class42.field616;
        }
        if (arg3 > class42.field622) {
            arg3 = class42.field622;
        }
        field4009 = arg0;
        field4005 = arg1;
        field4008 = arg2;
        field4007 = arg3;
        GL var4 = class42.field627;
        var4.glEnable(3089);
        if (field4009 <= field4008 && field4005 <= field4007) {
            var4.glScissor(class42.field648 + field4009, class42.field622 - field4007 + class42.field602, field4008 - field4009, field4007 - field4005);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1867();
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(IIIIII)V", line = 275)
    public static final void method1872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class42.method289();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class42.field622 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class42.field627;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(IIIII)V", line = 295)
    public static final void method1873(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class42.method289();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + var5;
        float var7 = (float) class42.field622 - ((float) arg1 + 0.3F);
        GL var8 = class42.field627;
        var8.glBegin(1);
        var8.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, arg4 > 255 ? -1 : (byte) arg4);
        var8.glVertex2f(var5, var7);
        var8.glVertex2f(var6, var7);
        var8.glEnd();
    }
}
