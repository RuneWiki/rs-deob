import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class208 extends class159 {

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    private static int field3675;

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 3)
    public class208() {
        new class268();
        new class317();
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()V", line = 78)
    public static final void method1529() {
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V", line = 86)
    public static final void method1530(int arg0) {
        field3675 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()V", line = 101)
    public final void method1531() {
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "()V", line = 105)
    public static final void method1532() {
        GL var0 = class97.field1801;
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

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "()I", line = 138)
    public static final int method1533() {
        return field3675;
    }

    static {
        new class140(8);
        field3675 = 2;
        new class53(131056);
    }
}
