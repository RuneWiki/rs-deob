import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class265 extends class164 {

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    private static int field3864;

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 3)
    public class265() {
        new class140();
        new class192();
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()V", line = 19)
    public static final void method1800() {
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "()V", line = 41)
    public final void method1801() {
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 44)
    public static final void method1802(int arg0) {
        field3864 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "()I", line = 70)
    public static final int method1803() {
        return field3864;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "()V", line = 90)
    public static final void method1804() {
        GL var0 = class67.field899;
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
        new class6(8);
        field3864 = 2;
        new class316(131056);
    }
}
