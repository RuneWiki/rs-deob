import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class204 {

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "[I")
    private static int[] field3095 = new int[4];

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "[I")
    private static int[] field3097 = new int[4];

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    private static int field3098 = 0;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "[I")
    private static int[] field3096 = new int[1];

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(FFFFFFII)V", line = 6)
    public static final void method1422(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class272.field4310;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field3097, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "()V", line = 18)
    public static void method1423() {
        field3096 = null;
        field3097 = null;
        field3095 = null;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "()I", line = 23)
    public static final int method1424() {
        class272.field4310.glGenFramebuffersEXT(1, field3096, 0);
        return field3096[0];
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 28)
    public static final void method1425(int arg0) {
        field3096[0] = arg0;
        class272.field4310.glDeleteFramebuffersEXT(1, field3096, 0);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(FFFFII)V", line = 34)
    public static final void method1426(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method1422(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "()Z", line = 39)
    public static final boolean method1427() {
        GL var0 = class272.field4310;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V", line = 59)
    public static final void method1428(int arg0) {
        field3096[0] = arg0;
        class272.field4310.glDeleteRenderbuffersEXT(1, field3096, 0);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V", line = 64)
    public static final void method1429(int arg0) {
        field3095[field3098++] = arg0;
        class272.field4310.glBindFramebufferEXT(36160, arg0);
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "()I", line = 74)
    public static final int method1430() {
        class272.field4310.glGenRenderbuffersEXT(1, field3096, 0);
        return field3096[0];
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "()V", line = 80)
    public static final void method1431() {
        GL var0 = class272.field4310;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field3097[0], field3097[1], field3097[2], field3097[3]);
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "()V", line = 88)
    public static final void method1432() {
        class272.field4310.glBindFramebufferEXT(36160, --field3098 > 0 ? field3095[field3098 - 1] : 0);
    }
}
