import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class297 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    private static int field4631 = 0;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[I")
    private static int[] field4630 = new int[1];

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "[I")
    private static int[] field4632 = new int[4];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "[I")
    private static int[] field4629 = new int[4];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()V", line = 5)
    public static final void method2096() {
        GL var0 = class250.field3818;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field4632[0], field4632[1], field4632[2], field4632[3]);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()I", line = 13)
    public static final int method2097() {
        class250.field3818.glGenRenderbuffersEXT(1, field4630, 0);
        return field4630[0];
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 17)
    public static final void method2098(int arg0) {
        field4630[0] = arg0;
        class250.field3818.glDeleteFramebuffersEXT(1, field4630, 0);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()Z", line = 25)
    public static final boolean method2099() {
        GL var0 = class250.field3818;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "()V", line = 38)
    public static final void method2100() {
        class250.field3818.glBindFramebufferEXT(36160, --field4631 > 0 ? field4629[field4631 - 1] : 0);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 41)
    public static final void method2101(int arg0) {
        field4629[field4631++] = arg0;
        class250.field3818.glBindFramebufferEXT(36160, arg0);
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "()I", line = 45)
    public static final int method2102() {
        class250.field3818.glGenFramebuffersEXT(1, field4630, 0);
        return field4630[0];
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(FFFFFFII)V", line = 50)
    public static final void method2103(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class250.field3818;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field4632, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V", line = 64)
    public static final void method2104(int arg0) {
        field4630[0] = arg0;
        class250.field3818.glDeleteRenderbuffersEXT(1, field4630, 0);
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "()V", line = 72)
    public static void method2105() {
        field4630 = null;
        field4632 = null;
        field4629 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(FFFFII)V", line = 86)
    public static final void method2106(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method2103(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }
}
