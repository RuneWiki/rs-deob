import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class46 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
    private static int[] field708 = new int[4];

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "[I")
    private static int[] field709 = new int[1];

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    private static int field710 = 0;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "[I")
    private static int[] field711 = new int[4];

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()Z", line = 5)
    public static final boolean method392() {
        GL var0 = class162.field2654;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()V", line = 18)
    public static void method393() {
        field709 = null;
        field708 = null;
        field711 = null;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "()I", line = 24)
    public static final int method394() {
        class162.field2654.glGenFramebuffersEXT(1, field709, 0);
        return field709[0];
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "()V", line = 29)
    public static final void method395() {
        GL var0 = class162.field2654;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field708[0], field708[1], field708[2], field708[3]);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(FFFFII)V", line = 37)
    public static final void method396(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method399(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 41)
    public static final void method397(int arg0) {
        field711[field710++] = arg0;
        class162.field2654.glBindFramebufferEXT(36160, arg0);
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "()V", line = 45)
    public static final void method398() {
        class162.field2654.glBindFramebufferEXT(36160, --field710 > 0 ? field711[field710 - 1] : 0);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(FFFFFFII)V", line = 52)
    public static final void method399(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class162.field2654;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field708, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 64)
    public static final void method400(int arg0) {
        field709[0] = arg0;
        class162.field2654.glDeleteRenderbuffersEXT(1, field709, 0);
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "()I", line = 68)
    public static final int method401() {
        class162.field2654.glGenRenderbuffersEXT(1, field709, 0);
        return field709[0];
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V", line = 83)
    public static final void method402(int arg0) {
        field709[0] = arg0;
        class162.field2654.glDeleteFramebuffersEXT(1, field709, 0);
    }
}
