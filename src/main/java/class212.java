import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class212 {

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    private static int field3385 = 0;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "[I")
    private static int[] field3387 = new int[4];

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "[I")
    private static int[] field3386 = new int[1];

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "[I")
    private static int[] field3388 = new int[4];

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1594(int arg0) {
        field3386[0] = arg0;
        class42.field627.glDeleteFramebuffersEXT(1, field3386, 0);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(FFFFII)V", line = 9)
    public static final void method1595(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method1598(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "()V", line = 12)
    public static final void method1596() {
        class42.field627.glBindFramebufferEXT(36160, --field3385 > 0 ? field3388[field3385 - 1] : 0);
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "()V", line = 19)
    public static void method1597() {
        field3386 = null;
        field3387 = null;
        field3388 = null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(FFFFFFII)V", line = 30)
    public static final void method1598(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class42.field627;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field3387, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "()I", line = 45)
    public static final int method1599() {
        class42.field627.glGenFramebuffersEXT(1, field3386, 0);
        return field3386[0];
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "()Z", line = 57)
    public static final boolean method1600() {
        GL var0 = class42.field627;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V", line = 70)
    public static final void method1601(int arg0) {
        field3386[0] = arg0;
        class42.field627.glDeleteRenderbuffersEXT(1, field3386, 0);
    }

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "()V", line = 75)
    public static final void method1602() {
        GL var0 = class42.field627;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field3387[0], field3387[1], field3387[2], field3387[3]);
    }

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "()I", line = 83)
    public static final int method1603() {
        class42.field627.glGenRenderbuffersEXT(1, field3386, 0);
        return field3386[0];
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)V", line = 87)
    public static final void method1604(int arg0) {
        field3388[field3385++] = arg0;
        class42.field627.glBindFramebufferEXT(36160, arg0);
    }
}
