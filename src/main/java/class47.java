import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class47 extends class323 {

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    private static int field738;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 3)
    public class47() {
        new class247();
        new class183();
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()I", line = 27)
    public static final int method323() {
        return field738;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 43)
    public static final void method324(int arg0) {
        field738 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "()V", line = 48)
    public static final void method325() {
        GL var0 = class217.field3551;
        if (var0.isExtensionAvailable("GL_ARB_point_parameters")) {
            float[] var1 = new float[] { 1.0F, 0.0F, 5.0E-4F };
            var0.glPointParameterfvARB(33065, var1, 0);
            FloatBuffer var2 = FloatBuffer.allocate(1);
            var0.glGetFloatv(33063, var2);
            float var3 = var2.get(0);
            if (var3 > 1024.0F) {
                var3 = 1024.0F;
            }
            var0.glPointParameterfARB(33062, 1.0F);
            var0.glPointParameterfARB(33063, var3);
        }
        if (var0.isExtensionAvailable("GL_ARB_point_sprite")) {
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "()V", line = 117)
    public final void method326() {
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "()V", line = 150)
    public static final void method327() {
    }

    static {
        new class302(8);
        field738 = 2;
        new class291(131056);
    }
}
