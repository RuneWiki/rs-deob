import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class129 {

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Loa;")
    public static class361 field1764 = null;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1762 = 0;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field1763 = 0;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1766 = 0;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    private static int field1765 = 0;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method979(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class47.method342();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class47.field621 - ((float) arg1 + 0.3F);
        float var8 = (float) class47.field621 - ((float) arg3 + 0.3F);
        GL var9 = class47.field592;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIII)V", line = 23)
    public static final void method980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class47.method342();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class47.field621 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class47.field592;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIII)V", line = 44)
    public static final void method981(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class47.method342();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + var5;
        float var7 = (float) class47.field621 - ((float) arg1 + 0.3F);
        GL var8 = class47.field592;
        var8.glBegin(1);
        var8.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, arg4 > 255 ? -1 : (byte) arg4);
        var8.glVertex2f(var5, var7);
        var8.glVertex2f(var6, var7);
        var8.glEnd();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([I)V", line = 61)
    public static final void method982(int[] arg0) {
        arg0[0] = field1763;
        arg0[1] = field1766;
        arg0[2] = field1765;
        arg0[3] = field1762;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIIII)V", line = 68)
    public static final void method983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class47.field592;
        var6.glLineWidth((float) arg5);
        method979(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)V", line = 81)
    public static final void method984(int arg0, int arg1, int arg2, int arg3) {
        class47.method342();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class47.field621 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class47.field592;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIILoa;)V", line = 100)
    public static final void method985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class361 arg6) {
        if (field1762 - field1766 != arg6.field2250) {
            throw new IllegalStateException();
        }
        class47.method342();
        class47.method357(arg6.field5639);
        class47.method354(1);
        class47.method364(0);
        float var7 = (float) arg0 + 0.3F;
        float var8 = (float) arg2 + 0.3F;
        float var9 = (float) class47.field621 - ((float) arg1 + 0.3F);
        float var10 = (float) class47.field621 - ((float) arg3 + 0.3F);
        GL var11 = class47.field592;
        var11.glTexEnvi(8960, 34176, 34168);
        var11.glBegin(2);
        var11.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var11.glTexCoord2f((var7 - (float) field1763) / (float) arg6.field5642, ((float) class47.field621 - var9 - (float) field1766) / (float) arg6.field5645);
        var11.glVertex2f(var7, var9);
        var11.glTexCoord2f((var8 - (float) field1763) / (float) arg6.field5642, ((float) class47.field621 - var10 - (float) field1766) / (float) arg6.field5645);
        var11.glVertex2f(var8, var10);
        var11.glEnd();
        var11.glTexEnvi(8960, 34176, 5890);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(IIIII)V", line = 128)
    public static final void method986(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class47.method342();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class47.field621 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class47.field592;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(IIIIII)V", line = 148)
    public static final void method987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class47.method342();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class47.field621 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class47.field592;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIII)V", line = 168)
    public static final void method988(int arg0, int arg1, int arg2, int arg3) {
        if (field1763 < arg0) {
            field1763 = arg0;
        }
        if (field1766 < arg1) {
            field1766 = arg1;
        }
        if (field1765 > arg2) {
            field1765 = arg2;
        }
        if (field1762 > arg3) {
            field1762 = arg3;
        }
        GL var4 = class47.field592;
        var4.glEnable(3089);
        if (field1763 <= field1765 && field1766 <= field1762) {
            var4.glScissor(class47.field626 + field1763, class47.field621 - field1762 + class47.field599, field1765 - field1763, field1762 - field1766);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method998();
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(IIII)V", line = 191)
    public static final void method989(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class47.field607) {
            arg2 = class47.field607;
        }
        if (arg3 > class47.field621) {
            arg3 = class47.field621;
        }
        field1763 = arg0;
        field1766 = arg1;
        field1765 = arg2;
        field1762 = arg3;
        GL var4 = class47.field592;
        var4.glEnable(3089);
        if (field1763 <= field1765 && field1766 <= field1762) {
            var4.glScissor(class47.field626 + field1763, class47.field621 - field1762 + class47.field599, field1765 - field1763, field1762 - field1766);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method998();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()V", line = 219)
    public static void method990() {
        field1764 = null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "([I)V", line = 222)
    public static final void method991(int[] arg0) {
        method989(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Loa;)V", line = 225)
    public static final void method992(class361 arg0) {
        if (field1762 - field1766 != arg0.field2250) {
            throw new IllegalArgumentException();
        }
        field1764 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([IIIII)V", line = 238)
    public static final void method993(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class47.method342();
        GL var5 = class47.field592;
        var5.glRasterPos2i(arg1, class47.field621 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class47.field593 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "()V", line = 249)
    public static final void method994() {
        field1763 = 0;
        field1766 = 0;
        field1765 = class47.field607;
        field1762 = class47.field621;
        GL var0 = class47.field592;
        var0.glDisable(3089);
        method998();
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(IIII)V", line = 260)
    public static final void method995(int arg0, int arg1, int arg2, int arg3) {
        class47.method342();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class47.field621 - ((float) arg1 + 0.3F);
        GL var7 = class47.field592;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "()V", line = 276)
    public static final void method996() {
        class47.field592.glClear(16640);
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(IIIII)V", line = 285)
    public static final void method997(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class47.method342();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class47.field621 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class47.field592;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "()V", line = 305)
    public static final void method998() {
        field1764 = null;
    }
}
