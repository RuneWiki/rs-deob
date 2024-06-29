import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class275 extends class84 {

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    private static int field4208;

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 3)
    public class275() {
        new class298();
        new class55();
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 6)
    public static final void method1840(int arg0) {
        field4208 = arg0;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()V", line = 21)
    public static final void method1841() {
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "()I", line = 54)
    public static final int method1842() {
        return field4208;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "()V", line = 72)
    public static final void method1843() {
        GL var0 = class249.field3898;
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

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "()V", line = 158)
    public final void method1844() {
    }

    static {
        new class221(8);
        field4208 = 2;
        new class202(131056);
    }
}
