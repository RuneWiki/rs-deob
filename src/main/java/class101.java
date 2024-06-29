import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class101 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    private static int field1626 = 0;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field1627 = 0;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field1628 = 0;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Lka;")
    public static class198 field1630 = null;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1629 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([IIIII)V", line = 6)
    public static final void method680(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class56.method363();
        GL var5 = class56.field848;
        var5.glRasterPos2i(arg1, class56.field870 - arg2);
        var5.glPixelZoom(1.0F, -1.0F);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class56.field845 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
        var5.glPixelZoom(1.0F, 1.0F);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)V", line = 19)
    public static final void method681(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class56.method363();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class56.field870 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class56.field848;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V", line = 39)
    public static final void method682() {
        field1627 = 0;
        field1629 = 0;
        field1626 = class56.field842;
        field1628 = class56.field870;
        GL var0 = class56.field848;
        var0.glDisable(3089);
        method691();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIII)V", line = 51)
    public static final void method683(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class56.method363();
        GL var25 = class56.field848;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class56.field870 - var24));
            var25.glVertex2f((float) var19, (float) (class56.field870 - var23));
            var25.glVertex2f((float) var18, (float) (class56.field870 - var22));
            var25.glVertex2f((float) var17, (float) (class56.field870 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class56.field870 - var21));
            var25.glVertex2f((float) var18, (float) (class56.field870 - var22));
            var25.glVertex2f((float) var19, (float) (class56.field870 - var23));
            var25.glVertex2f((float) var20, (float) (class56.field870 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIII)V", line = 122)
    public static final void method684(int arg0, int arg1, int arg2, int arg3) {
        class56.method363();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class56.field870 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class56.field848;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()V", line = 140)
    public static final void method685() {
        class56.field848.glClear(16640);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IIIIII)V", line = 148)
    public static final void method686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class56.method363();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class56.field870 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class56.field848;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IIII)V", line = 168)
    public static final void method687(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class56.field842) {
            arg2 = class56.field842;
        }
        if (arg3 > class56.field870) {
            arg3 = class56.field870;
        }
        field1627 = arg0;
        field1629 = arg1;
        field1626 = arg2;
        field1628 = arg3;
        GL var4 = class56.field848;
        var4.glEnable(3089);
        if (field1627 <= field1626 && field1629 <= field1628) {
            var4.glScissor(field1627, class56.field870 - field1628, field1626 - field1627, field1628 - field1629);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method691();
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IIIII)V", line = 204)
    public static final void method688(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class56.method363();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class56.field870 - ((float) arg1 + 0.3F);
        float var8 = (float) class56.field870 - ((float) arg3 + 0.3F);
        GL var9 = class56.field848;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(IIIII)V", line = 224)
    public static final void method689(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class56.method363();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class56.field870 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class56.field848;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lka;)V", line = 244)
    public static final void method690(class198 arg0) {
        if (field1628 - field1629 != arg0.field4601) {
            throw new IllegalArgumentException();
        }
        field1630 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "()V", line = 254)
    public static final void method691() {
        field1630 = null;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(IIII)V", line = 257)
    public static final void method692(int arg0, int arg1, int arg2, int arg3) {
        if (field1627 < arg0) {
            field1627 = arg0;
        }
        if (field1629 < arg1) {
            field1629 = arg1;
        }
        if (field1626 > arg2) {
            field1626 = arg2;
        }
        if (field1628 > arg3) {
            field1628 = arg3;
        }
        GL var4 = class56.field848;
        var4.glEnable(3089);
        if (field1627 <= field1626 && field1629 <= field1628) {
            var4.glScissor(field1627, class56.field870 - field1628, field1626 - field1627, field1628 - field1629);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method691();
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "()V", line = 282)
    public static void method693() {
        field1630 = null;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(IIII)V", line = 285)
    public static final void method694(int arg0, int arg1, int arg2, int arg3) {
        class56.method363();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class56.field870 - ((float) arg1 + 0.3F);
        GL var7 = class56.field848;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(IIIIII)V", line = 304)
    public static final void method695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class56.method363();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class56.field870 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class56.field848;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }
}
