import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class111 {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field1937 = 0;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    private static int field1935 = 0;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field1938 = 0;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1936 = 0;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Lji;")
    public static class100 field1934 = null;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method833(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class21.method132();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class21.field361 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class21.field377;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()V", line = 24)
    public static final void method834() {
        field1936 = 0;
        field1937 = 0;
        field1935 = class21.field351;
        field1938 = class21.field361;
        GL var0 = class21.field377;
        var0.glDisable(3089);
        method843();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V", line = 38)
    public static final void method835(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class21.method132();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class21.field361 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class21.field377;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V", line = 58)
    public static final void method836(int arg0, int arg1, int arg2, int arg3) {
        class21.method132();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class21.field361 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class21.field377;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "()V", line = 77)
    public static void method837() {
        field1934 = null;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIII)V", line = 82)
    public static final void method838(int arg0, int arg1, int arg2, int arg3) {
        if (field1936 < arg0) {
            field1936 = arg0;
        }
        if (field1937 < arg1) {
            field1937 = arg1;
        }
        if (field1935 > arg2) {
            field1935 = arg2;
        }
        if (field1938 > arg3) {
            field1938 = arg3;
        }
        GL var4 = class21.field377;
        var4.glEnable(3089);
        if (field1936 <= field1935 && field1937 <= field1938) {
            var4.glScissor(field1936, class21.field361 - field1938, field1935 - field1936, field1938 - field1937);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method843();
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIIIII)V", line = 106)
    public static final void method839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class21.method132();
        GL var25 = class21.field377;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class21.field361 - var24));
            var25.glVertex2f((float) var19, (float) (class21.field361 - var23));
            var25.glVertex2f((float) var18, (float) (class21.field361 - var22));
            var25.glVertex2f((float) var17, (float) (class21.field361 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class21.field361 - var21));
            var25.glVertex2f((float) var18, (float) (class21.field361 - var22));
            var25.glVertex2f((float) var19, (float) (class21.field361 - var23));
            var25.glVertex2f((float) var20, (float) (class21.field361 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lji;)V", line = 177)
    public static final void method840(class100 arg0) {
        if (field1938 - field1937 != arg0.field2981) {
            throw new IllegalArgumentException();
        }
        field1934 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(IIII)V", line = 193)
    public static final void method841(int arg0, int arg1, int arg2, int arg3) {
        class21.method132();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class21.field361 - ((float) arg1 + 0.3F);
        GL var7 = class21.field377;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(IIIIII)V", line = 210)
    public static final void method842(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class21.method132();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class21.field361 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class21.field377;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "()V", line = 230)
    public static final void method843() {
        field1934 = null;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "()V", line = 233)
    public static final void method844() {
        class21.field377.glClear(16640);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIIII)V", line = 242)
    public static final void method845(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class21.method132();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class21.field361 - ((float) arg1 + 0.3F);
        float var8 = (float) class21.field361 - ((float) arg3 + 0.3F);
        GL var9 = class21.field377;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(IIIII)V", line = 264)
    public static final void method846(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class21.method132();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class21.field361 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class21.field377;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(IIII)V", line = 286)
    public static final void method847(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class21.field351) {
            arg2 = class21.field351;
        }
        if (arg3 > class21.field361) {
            arg3 = class21.field361;
        }
        field1936 = arg0;
        field1937 = arg1;
        field1935 = arg2;
        field1938 = arg3;
        GL var4 = class21.field377;
        var4.glEnable(3089);
        if (field1936 <= field1935 && field1937 <= field1938) {
            var4.glScissor(field1936, class21.field361 - field1938, field1935 - field1936, field1938 - field1937);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method843();
    }
}
