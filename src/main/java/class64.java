import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class64 extends class184 {

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    private static int field1014;

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V", line = 3)
    public class64() {
        new class276();
        new class87();
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()I", line = 19)
    public static final int method488() {
        return field1014;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "()V", line = 31)
    public static final void method489() {
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V", line = 72)
    public static final void method490(int arg0) {
        field1014 = arg0;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "()V", line = 116)
    public final void method491() {
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "()V", line = 129)
    public static final void method492() {
        GL var0 = class94.field1473;
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
        new class99(8);
        field1014 = 2;
        new class166(131056);
    }
}
