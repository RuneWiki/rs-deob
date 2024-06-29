import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class212 {

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field3498 = 0;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    private static int field3500 = 0;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field3501 = 0;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Lel;")
    public static class87 field3502 = null;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field3499 = 0;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)V", line = 8)
    public static final void method1491(int arg0, int arg1, int arg2, int arg3) {
        if (field3499 < arg0) {
            field3499 = arg0;
        }
        if (field3498 < arg1) {
            field3498 = arg1;
        }
        if (field3500 > arg2) {
            field3500 = arg2;
        }
        if (field3501 > arg3) {
            field3501 = arg3;
        }
        GL var4 = class99.field1682;
        var4.glEnable(3089);
        if (field3499 <= field3500 && field3498 <= field3501) {
            var4.glScissor(field3499, class99.field1685 - field3501, field3500 - field3499, field3501 - field3498);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1495();
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIII)V", line = 31)
    public static final void method1492(int arg0, int arg1, int arg2, int arg3) {
        class99.method744();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class99.field1685 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class99.field1682;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lel;)V", line = 47)
    public static final void method1493(class87 arg0) {
        if (field3501 - field3498 != arg0.field4786) {
            throw new IllegalArgumentException();
        }
        field3502 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII)V", line = 58)
    public static final void method1494(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class99.method744();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class99.field1685 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class99.field1682;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()V", line = 81)
    public static final void method1495() {
        field3502 = null;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(IIII)V", line = 85)
    public static final void method1496(int arg0, int arg1, int arg2, int arg3) {
        class99.method744();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class99.field1685 - ((float) arg1 + 0.3F);
        GL var7 = class99.field1682;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIIII)V", line = 104)
    public static final void method1497(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class99.method744();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class99.field1685 - ((float) arg1 + 0.3F);
        float var8 = (float) class99.field1685 - ((float) arg3 + 0.3F);
        GL var9 = class99.field1682;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "()V", line = 123)
    public static final void method1498() {
        field3499 = 0;
        field3498 = 0;
        field3500 = class99.field1680;
        field3501 = class99.field1685;
        GL var0 = class99.field1682;
        var0.glDisable(3089);
        method1495();
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIII)V", line = 134)
    public static final void method1499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class99.method744();
        GL var25 = class99.field1682;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class99.field1685 - var24));
            var25.glVertex2f((float) var19, (float) (class99.field1685 - var23));
            var25.glVertex2f((float) var18, (float) (class99.field1685 - var22));
            var25.glVertex2f((float) var17, (float) (class99.field1685 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class99.field1685 - var21));
            var25.glVertex2f((float) var18, (float) (class99.field1685 - var22));
            var25.glVertex2f((float) var19, (float) (class99.field1685 - var23));
            var25.glVertex2f((float) var20, (float) (class99.field1685 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "()V", line = 206)
    public static void method1500() {
        field3502 = null;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(IIIII)V", line = 220)
    public static final void method1501(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class99.method744();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class99.field1685 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class99.field1682;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(IIII)V", line = 240)
    public static final void method1502(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class99.field1680) {
            arg2 = class99.field1680;
        }
        if (arg3 > class99.field1685) {
            arg3 = class99.field1685;
        }
        field3499 = arg0;
        field3498 = arg1;
        field3500 = arg2;
        field3501 = arg3;
        GL var4 = class99.field1682;
        var4.glEnable(3089);
        if (field3499 <= field3500 && field3498 <= field3501) {
            var4.glScissor(field3499, class99.field1685 - field3501, field3500 - field3499, field3501 - field3498);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1495();
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIIIII)V", line = 267)
    public static final void method1503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class99.method744();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class99.field1685 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class99.field1682;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(IIIIII)V", line = 287)
    public static final void method1504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class99.method744();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class99.field1685 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class99.field1682;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "()V", line = 310)
    public static final void method1505() {
        class99.field1682.glClear(16640);
    }
}
