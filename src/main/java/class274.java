import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class274 extends class26 {

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    private static int field4285;

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 3)
    public class274() {
        new class196();
        new class337();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()V", line = 50)
    public static final void method1975() {
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()I", line = 53)
    public static final int method1976() {
        return field4285;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "()V", line = 68)
    public final void method1977() {
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V", line = 77)
    public static final void method1978(int arg0) {
        field4285 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "()V", line = 91)
    public static final void method1979() {
        GL var0 = class250.field3818;
        if (var0.isExtensionAvailable("GL_ARB_point_parameters")) {
            float[] var1 = new float[] { 1.0F, 0.0F, 5.0E-7F };
            var0.glPointParameterfvARB(33065, var1, 0);
            FloatBuffer var2 = FloatBuffer.allocate(1);
            var0.glGetFloatv(33063, var2);
            float var3 = var2.get(0);
            if (var3 > 64.0F) {
                var3 = 64.0F;
            }
            var0.glPointParameterfARB(33062, 1.0F);
            var0.glPointParameterfARB(33063, var3);
        }
        if (var0.isExtensionAvailable("GL_ARB_point_sprite")) {
        }
    }

    static {
        new class158(8);
        field4285 = 2;
        new class107(131056);
    }
}
