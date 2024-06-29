import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class167 extends class3 {

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    private static int field2695;

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 3)
    public class167() {
        new class297();
        new class256();
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "()V", line = 8)
    public final void method1149() {
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "()V", line = 12)
    public static final void method1150() {
        GL var0 = class186.field2990;
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

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "()I", line = 55)
    public static final int method1151() {
        return field2695;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 62)
    public static final void method1152(int arg0) {
        field2695 = arg0;
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "()V", line = 143)
    public static final void method1153() {
    }

    static {
        new class121(8);
        field2695 = 2;
        new class192(131056);
    }
}
