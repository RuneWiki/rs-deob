import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class345 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[I")
    private static int[] field5361 = new int[4];

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    private static int field5362 = 0;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
    private static int[] field5364 = new int[1];

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
    private static int[] field5363 = new int[4];

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()I", line = 6)
    public static final int method2387() {
        class186.field2990.glGenFramebuffersEXT(1, field5364, 0);
        return field5364[0];
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()V", line = 10)
    public static void method2388() {
        field5364 = null;
        field5361 = null;
        field5363 = null;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "()Z", line = 16)
    public static final boolean method2389() {
        GL var0 = class186.field2990;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "()V", line = 31)
    public static final void method2390() {
        class186.field2990.glBindFramebufferEXT(36160, --field5362 > 0 ? field5363[field5362 - 1] : 0);
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "()V", line = 40)
    public static final void method2391() {
        GL var0 = class186.field2990;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field5361[0], field5361[1], field5361[2], field5361[3]);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(FFFFII)V", line = 48)
    public static final void method2392(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method2396(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "()I", line = 51)
    public static final int method2393() {
        class186.field2990.glGenRenderbuffersEXT(1, field5364, 0);
        return field5364[0];
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 55)
    public static final void method2394(int arg0) {
        field5364[0] = arg0;
        class186.field2990.glDeleteFramebuffersEXT(1, field5364, 0);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 64)
    public static final void method2395(int arg0) {
        field5363[field5362++] = arg0;
        class186.field2990.glBindFramebufferEXT(36160, arg0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(FFFFFFII)V", line = 69)
    public static final void method2396(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class186.field2990;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field5361, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V", line = 87)
    public static final void method2397(int arg0) {
        field5364[0] = arg0;
        class186.field2990.glDeleteRenderbuffersEXT(1, field5364, 0);
    }
}
