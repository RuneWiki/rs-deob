import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class19 extends class68 {

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    private static int field265;

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V", line = 3)
    public class19() {
        new class192();
        new class32();
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()V", line = 12)
    public static final void method124() {
        GL var0 = class255.field4181;
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

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "()V", line = 72)
    public static final void method125() {
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "()I", line = 77)
    public static final int method126() {
        return field265;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 97)
    public static final void method127(int arg0) {
        field265 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "()V", line = 125)
    public final void method128() {
    }

    static {
        new class244(8);
        field265 = 2;
        new class82(131056);
    }
}
