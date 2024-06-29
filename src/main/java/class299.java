import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class299 {

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "[I")
    private static int[] field4713 = new int[1];

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "[I")
    private static int[] field4715 = new int[4];

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    private static int field4714 = 0;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "[I")
    private static int[] field4712 = new int[4];

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(FFFFII)V", line = 4)
    public static final void method2126(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method2131(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 8)
    public static final void method2127(int arg0) {
        field4713[0] = arg0;
        class232.field3716.glDeleteFramebuffersEXT(1, field4713, 0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "()I", line = 13)
    public static final int method2128() {
        class232.field3716.glGenRenderbuffersEXT(1, field4713, 0);
        return field4713[0];
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V", line = 18)
    public static final void method2129(int arg0) {
        field4712[field4714++] = arg0;
        class232.field3716.glBindFramebufferEXT(36160, arg0);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "()V", line = 25)
    public static final void method2130() {
        class232.field3716.glBindFramebufferEXT(36160, --field4714 > 0 ? field4712[field4714 - 1] : 0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(FFFFFFII)V", line = 33)
    public static final void method2131(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class232.field3716;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field4715, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "()V", line = 49)
    public static void method2132() {
        field4713 = null;
        field4715 = null;
        field4712 = null;
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "()Z", line = 55)
    public static final boolean method2133() {
        GL var0 = class232.field3716;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V", line = 71)
    public static final void method2134(int arg0) {
        field4713[0] = arg0;
        class232.field3716.glDeleteRenderbuffersEXT(1, field4713, 0);
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "()V", line = 76)
    public static final void method2135() {
        GL var0 = class232.field3716;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field4715[0], field4715[1], field4715[2], field4715[3]);
    }

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "()I", line = 87)
    public static final int method2136() {
        class232.field3716.glGenFramebuffersEXT(1, field4713, 0);
        return field4713[0];
    }
}
