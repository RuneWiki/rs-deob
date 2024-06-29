import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class17 {

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    private static int field260 = 0;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "[I")
    private static int[] field259 = new int[4];

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "[I")
    private static int[] field258 = new int[4];

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "[I")
    private static int[] field261 = new int[1];

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()V", line = 4)
    public static void method172() {
        field261 = null;
        field259 = null;
        field258 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 9)
    public static final void method173(int arg0) {
        field261[0] = arg0;
        class240.field3771.glDeleteFramebuffersEXT(1, field261, 0);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 15)
    public static final void method174(int arg0) {
        field261[0] = arg0;
        class240.field3771.glDeleteRenderbuffersEXT(1, field261, 0);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()Z", line = 22)
    public static final boolean method175() {
        GL var0 = class240.field3771;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "()I", line = 35)
    public static final int method176() {
        class240.field3771.glGenRenderbuffersEXT(1, field261, 0);
        return field261[0];
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "()V", line = 42)
    public static final void method177() {
        class240.field3771.glBindFramebufferEXT(36160, --field260 > 0 ? field258[field260 - 1] : 0);
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "()V", line = 46)
    public static final void method178() {
        GL var0 = class240.field3771;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field259[0], field259[1], field259[2], field259[3]);
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "()I", line = 60)
    public static final int method179() {
        class240.field3771.glGenFramebuffersEXT(1, field261, 0);
        return field261[0];
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFII)V", line = 64)
    public static final void method180(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method182(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V", line = 74)
    public static final void method181(int arg0) {
        field258[field260++] = arg0;
        class240.field3771.glBindFramebufferEXT(36160, arg0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFFII)V", line = 79)
    public static final void method182(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class240.field3771;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field259, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }
}
