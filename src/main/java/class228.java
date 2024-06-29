import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class228 {

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    private static int field3691 = 0;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lsf;")
    public static class258 field3689 = null;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field3692 = 0;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field3690 = 0;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field3693 = 0;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method1550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class90.method613();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class90.field1379 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class90.field1390;
        var10.glBegin(6);
        var10.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var10.glVertex2f(var7, var8);
        var10.glVertex2f(var6, var8);
        var10.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()V", line = 25)
    public static final void method1551() {
        class90.field1390.glClear(16640);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lsf;)V", line = 30)
    public static final void method1552(class258 arg0) {
        if (field3690 - field3693 != arg0.field4808) {
            throw new IllegalArgumentException();
        }
        field3689 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()V", line = 40)
    public static final void method1553() {
        field3689 = null;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(IIIIII)V", line = 43)
    public static final void method1554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class90.method613();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class90.field1379 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class90.field1390;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "()V", line = 63)
    public static void method1555() {
        field3689 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIII)V", line = 66)
    public static final void method1556(int arg0, int arg1, int arg2, int arg3) {
        class90.method613();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class90.field1379 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class90.field1390;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V", line = 85)
    public static final void method1557(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class90.method613();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class90.field1379 - ((float) arg1 + 0.3F);
        float var8 = (float) class90.field1379 - ((float) arg3 + 0.3F);
        GL var9 = class90.field1390;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(IIIII)V", line = 104)
    public static final void method1558(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class90.method613();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class90.field1379 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class90.field1390;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "()V", line = 130)
    public static final void method1559() {
        field3692 = 0;
        field3693 = 0;
        field3691 = class90.field1363;
        field3690 = class90.field1379;
        GL var0 = class90.field1390;
        var0.glDisable(3089);
        method1553();
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(IIIII)V", line = 141)
    public static final void method1560(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class90.method613();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class90.field1379 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class90.field1390;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(IIIIII)V", line = 165)
    public static final void method1561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class90.method613();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class90.field1379 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class90.field1390;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(IIII)V", line = 185)
    public static final void method1562(int arg0, int arg1, int arg2, int arg3) {
        if (field3692 < arg0) {
            field3692 = arg0;
        }
        if (field3693 < arg1) {
            field3693 = arg1;
        }
        if (field3691 > arg2) {
            field3691 = arg2;
        }
        if (field3690 > arg3) {
            field3690 = arg3;
        }
        GL var4 = class90.field1390;
        var4.glEnable(3089);
        if (field3692 <= field3691 && field3693 <= field3690) {
            var4.glScissor(field3692, class90.field1379 - field3690, field3691 - field3692, field3690 - field3693);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1553();
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(IIII)V", line = 208)
    public static final void method1563(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class90.field1363) {
            arg2 = class90.field1363;
        }
        if (arg3 > class90.field1379) {
            arg3 = class90.field1379;
        }
        field3692 = arg0;
        field3693 = arg1;
        field3691 = arg2;
        field3690 = arg3;
        GL var4 = class90.field1390;
        var4.glEnable(3089);
        if (field3692 <= field3691 && field3693 <= field3690) {
            var4.glScissor(field3692, class90.field1379 - field3690, field3691 - field3692, field3690 - field3693);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1553();
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(IIII)V", line = 236)
    public static final void method1564(int arg0, int arg1, int arg2, int arg3) {
        class90.method613();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class90.field1379 - ((float) arg1 + 0.3F);
        GL var7 = class90.field1390;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(IIIIII)V", line = 256)
    public static final void method1565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class90.method613();
        GL var25 = class90.field1390;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class90.field1379 - var24));
            var25.glVertex2f((float) var19, (float) (class90.field1379 - var23));
            var25.glVertex2f((float) var18, (float) (class90.field1379 - var22));
            var25.glVertex2f((float) var17, (float) (class90.field1379 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class90.field1379 - var21));
            var25.glVertex2f((float) var18, (float) (class90.field1379 - var22));
            var25.glVertex2f((float) var19, (float) (class90.field1379 - var23));
            var25.glVertex2f((float) var20, (float) (class90.field1379 - var24));
        }
        var25.glEnd();
    }
}
