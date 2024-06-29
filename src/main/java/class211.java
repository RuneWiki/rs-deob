import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class211 extends class17 {

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    private static int field3609;

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 3)
    public class211() {
        new class35();
        new class129();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()V", line = 68)
    public final void method1472() {
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "()I", line = 75)
    public static final int method1473() {
        return field3609;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "()V", line = 97)
    public static final void method1474() {
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V", line = 109)
    public static final void method1475(int arg0) {
        field3609 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "()V", line = 120)
    public static final void method1476() {
        GL var0 = class56.field848;
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
        new class90(8);
        field3609 = 2;
        new class134(131056);
    }
}
