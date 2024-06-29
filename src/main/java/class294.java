import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class294 extends class286 {

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    private static int field4668;

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V", line = 3)
    public class294() {
        new class160();
        new class169();
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V", line = 20)
    public static final void method2101(int arg0) {
        field4668 = arg0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()V", line = 36)
    public static final void method2102() {
        GL var0 = class232.field3716;
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

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "()V", line = 107)
    public static final void method2103() {
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "()I", line = 133)
    public static final int method2104() {
        return field4668;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "()V", line = 147)
    public final void method2105() {
    }

    static {
        new class221(8);
        field4668 = 2;
        new class44(131056);
    }
}
