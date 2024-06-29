import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class254 extends class308 {

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    private static int field3802;

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V", line = 3)
    public class254() {
        new class55();
        new class128();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V", line = 51)
    public static final void method1775() {
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V", line = 70)
    public final void method1776() {
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()I", line = 103)
    public static final int method1777() {
        return field3802;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()V", line = 126)
    public static final void method1778() {
        GL var0 = class36.field518;
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

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 158)
    public static final void method1779(int arg0) {
        field3802 = arg0;
    }

    static {
        new class224(8);
        field3802 = 2;
        new class35(131056);
    }
}
