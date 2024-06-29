import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class236 extends class56 {

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    private static int field3553;

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 3)
    public class236() {
        new class152();
        new class30();
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()I", line = 22)
    public static final int method1686() {
        return field3553;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()V", line = 37)
    public final void method1687() {
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V", line = 65)
    public static final void method1688(int arg0) {
        field3553 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "()V", line = 114)
    public static final void method1689() {
        GL var0 = class162.field2654;
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
        new class207(8);
        field3553 = 2;
        new class1(131056);
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "()V", line = 177)
    public static final void method1690() {
    }
}
