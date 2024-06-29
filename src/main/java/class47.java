import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class47 extends class43 {

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    private static int field792;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 3)
    public class47() {
        new class200();
        new class204();
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()V", line = 15)
    public static final void method367() {
        GL var0 = class265.field4099;
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

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "()I", line = 74)
    public static final int method368() {
        return field792;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "()V", line = 89)
    public final void method369() {
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 113)
    public static final void method370(int arg0) {
        field792 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "()V", line = 154)
    public static final void method371() {
    }

    static {
        new class243(8);
        field792 = 2;
        new class101(131056);
    }
}
