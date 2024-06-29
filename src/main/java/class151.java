import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class151 extends class48 {

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    private static int field2358;

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 3)
    public class151() {
        new class64();
        new class5();
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()V", line = 26)
    public static final void method1101() {
        GL var0 = class109.field1456;
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

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "()V", line = 101)
    public final void method1102() {
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "()V", line = 151)
    public static final void method1103() {
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "()I", line = 155)
    public static final int method1104() {
        return field2358;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 158)
    public static final void method1105(int arg0) {
        field2358 = arg0;
    }

    static {
        new class273(8);
        field2358 = 2;
        new class6(131056);
    }
}
