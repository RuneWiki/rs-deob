import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class283 extends class85 {

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    private static int field4911;

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V", line = 3)
    public class283() {
        new class255();
        new class175();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()I", line = 23)
    public static final int method1978() {
        return field4911;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 39)
    public static final void method1979(int arg0) {
        field4911 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "()V", line = 46)
    public static final void method1980() {
        GL var0 = class253.field4319;
        var0.glEnable(34913);
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
        if (var0.isExtensionAvailable("GL_ARB_point_sprite")) {
            var0.glTexEnvi(34913, 34914, 1);
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "()V", line = 112)
    public final void method1981() {
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "()V", line = 127)
    public static final void method1982() {
    }

    static {
        new class72(8);
        field4911 = 2;
        new class41(131056);
    }
}
