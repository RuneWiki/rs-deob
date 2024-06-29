import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class18 extends class269 {

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    private static int field226;

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V", line = 3)
    public class18() {
        new class78();
        new class156();
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()V", line = 19)
    public static final void method116() {
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "()I", line = 40)
    public static final int method117() {
        return field226;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V", line = 78)
    public static final void method118(int arg0) {
        field226 = arg0;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "()V", line = 107)
    public static final void method119() {
        GL var0 = class117.field1801;
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

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "()V", line = 153)
    public final void method120() {
    }

    static {
        new class316(8);
        field226 = 2;
        new class263(131056);
    }
}
