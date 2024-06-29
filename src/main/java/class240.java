import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class240 {

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field3997 = 0;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field4000 = 0;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field3999 = 0;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    private static int field3998 = 0;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Lrk;")
    public static class122 field4001 = null;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "()V", line = 5)
    public static final void method1678() {
        class55.field812.glClear(16640);
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "()V", line = 8)
    public static void method1679() {
        field4001 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V", line = 14)
    public static final void method1680(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class55.method409();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class55.field806 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class55.field812;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "()V", line = 35)
    public static final void method1681() {
        field3999 = 0;
        field3997 = 0;
        field3998 = class55.field808;
        field4000 = class55.field806;
        GL var0 = class55.field812;
        var0.glDisable(3089);
        method1683();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)V", line = 52)
    public static final void method1682(int arg0, int arg1, int arg2, int arg3) {
        class55.method409();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class55.field806 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class55.field812;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "()V", line = 74)
    public static final void method1683() {
        field4001 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIII)V", line = 78)
    public static final void method1684(int arg0, int arg1, int arg2, int arg3) {
        if (field3999 < arg0) {
            field3999 = arg0;
        }
        if (field3997 < arg1) {
            field3997 = arg1;
        }
        if (field3998 > arg2) {
            field3998 = arg2;
        }
        if (field4000 > arg3) {
            field4000 = arg3;
        }
        GL var4 = class55.field812;
        var4.glEnable(3089);
        if (field3999 <= field3998 && field3997 <= field4000) {
            var4.glScissor(field3999, class55.field806 - field4000, field3998 - field3999, field4000 - field3997);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1683();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIII)V", line = 102)
    public static final void method1685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class55.method409();
        GL var25 = class55.field812;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class55.field806 - var24));
            var25.glVertex2f((float) var19, (float) (class55.field806 - var23));
            var25.glVertex2f((float) var18, (float) (class55.field806 - var22));
            var25.glVertex2f((float) var17, (float) (class55.field806 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class55.field806 - var21));
            var25.glVertex2f((float) var18, (float) (class55.field806 - var22));
            var25.glVertex2f((float) var19, (float) (class55.field806 - var23));
            var25.glVertex2f((float) var20, (float) (class55.field806 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIIIII)V", line = 173)
    public static final void method1686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class55.method409();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class55.field806 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class55.field812;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(IIIIII)V", line = 195)
    public static final void method1687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class55.method409();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class55.field806 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class55.field812;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIIII)V", line = 215)
    public static final void method1688(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class55.method409();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class55.field806 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class55.field812;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(IIII)V", line = 235)
    public static final void method1689(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class55.field808) {
            arg2 = class55.field808;
        }
        if (arg3 > class55.field806) {
            arg3 = class55.field806;
        }
        field3999 = arg0;
        field3997 = arg1;
        field3998 = arg2;
        field4000 = arg3;
        GL var4 = class55.field812;
        var4.glEnable(3089);
        if (field3999 <= field3998 && field3997 <= field4000) {
            var4.glScissor(field3999, class55.field806 - field4000, field3998 - field3999, field4000 - field3997);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1683();
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(IIII)V", line = 263)
    public static final void method1690(int arg0, int arg1, int arg2, int arg3) {
        class55.method409();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class55.field806 - ((float) arg1 + 0.3F);
        GL var7 = class55.field812;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lrk;)V", line = 279)
    public static final void method1691(class122 arg0) {
        if (field4000 - field3997 != arg0.field4337) {
            throw new IllegalArgumentException();
        }
        field4001 = arg0;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(IIIII)V", line = 289)
    public static final void method1692(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class55.method409();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class55.field806 - ((float) arg1 + 0.3F);
        float var8 = (float) class55.field806 - ((float) arg3 + 0.3F);
        GL var9 = class55.field812;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }
}
