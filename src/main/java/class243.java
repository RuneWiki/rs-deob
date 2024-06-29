import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class243 extends class29 {

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    private static int field3834;

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 3)
    public class243() {
        new class249();
        new class2();
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "()V", line = 10)
    public static final void method1651() {
        GL var0 = class333.field5160;
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

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V", line = 44)
    public static final void method1652(int arg0) {
        field3834 = arg0;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "()V", line = 58)
    public static final void method1653() {
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "()I", line = 64)
    public static final int method1654() {
        return field3834;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "()V", line = 125)
    public final void method1655() {
    }

    static {
        new class332(8);
        field3834 = 2;
        new class303(131056);
    }
}
