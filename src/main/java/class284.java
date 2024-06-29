import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class284 extends class137 {

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    private static int field4857;

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V", line = 3)
    public class284() {
        new class265();
        new class160();
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "()I", line = 11)
    public static final int method2049() {
        return field4857;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "()V", line = 26)
    public static final void method2050() {
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V", line = 34)
    public static final void method2051(int arg0) {
        field4857 = arg0;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "()V", line = 66)
    public final void method2052() {
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "()V", line = 91)
    public static final void method2053() {
        GL var0 = class271.field4641;
        if (var0.isExtensionAvailable("GL_ARB_point_parameters")) {
            float[] var1 = new float[] { 1.0F, 0.0F, 5.0E-7F };
            var0.glPointParameterfvARB(33065, var1, 0);
            FloatBuffer var2 = FloatBuffer.allocate(1);
            var0.glGetFloatv(33063, var2);
            float var3 = var2.get(0);
            if (var3 > 128.0F) {
                var3 = 128.0F;
            }
            var0.glPointParameterfARB(33062, 1.0F);
            var0.glPointParameterfARB(33063, var3);
        }
        if (var0.isExtensionAvailable("GL_ARB_point_sprite")) {
        }
    }

    static {
        new class76(8);
        field4857 = 2;
        new class47(131056);
    }
}
