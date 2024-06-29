import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class249 extends class16 {

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    private static int field3763;

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V", line = 3)
    public class249() {
        new class132();
        new class281();
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V", line = 9)
    public static final void method1700(int arg0) {
        field3763 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()V", line = 65)
    public static final void method1701() {
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "()V", line = 72)
    public final void method1702() {
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "()V", line = 84)
    public static final void method1703() {
        GL var0 = class73.field1051;
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

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "()I", line = 134)
    public static final int method1704() {
        return field3763;
    }

    static {
        new class3(8);
        field3763 = 2;
        new class254(131056);
    }
}
