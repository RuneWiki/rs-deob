import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class212 {

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "[I")
    public static int[] field3571 = null;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3574 = -1;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "[I")
    public static int[] field3575 = null;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field3573 = -1;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3572;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3576;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Z")
    public static boolean field3570;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()V", line = 5)
    public static final void method1493() {
        if (field3572 == null) {
            class300 var0 = new class300();
            byte[] var1 = var0.method2094(64, 64, 64);
            field3572 = ByteBuffer.allocateDirect(var1.length);
            field3572.position(0);
            field3572.put(var1);
            field3572.flip();
        }
        if (field3576 != null) {
            return;
        }
        class303 var2 = new class303();
        byte[] var3 = var2.method2121(64, 64, 64);
        field3576 = ByteBuffer.allocateDirect(var3.length);
        field3576.position(0);
        field3576.put(var3);
        field3576.flip();
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "()V", line = 31)
    public static final void method1494() {
        if (field3573 != -1) {
            GL var0 = class123.field2212;
            int[] var1 = new int[] { field3573 };
            var0.glDeleteTextures(1, var1, 0);
            field3573 = -1;
            class285.field4891 -= field3572.limit() * 2;
        }
        if (field3575 != null) {
            GL var2 = class123.field2212;
            var2.glDeleteTextures(64, field3575, 0);
            field3575 = null;
            class285.field4891 -= field3572.limit() * 2;
        }
        if (field3574 != -1) {
            GL var3 = class123.field2212;
            int[] var4 = new int[] { field3574 };
            var3.glDeleteTextures(1, var4, 0);
            field3574 = -1;
            class285.field4891 -= field3576.limit() * 2;
        }
        if (field3571 != null) {
            GL var5 = class123.field2212;
            var5.glDeleteTextures(64, field3571, 0);
            field3571 = null;
            class285.field4891 -= field3576.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "()V", line = 73)
    public static final void method1495() {
        field3570 = class123.field2236;
        method1493();
        method1496();
        method1498();
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "()V", line = 80)
    private static final void method1496() {
        GL var0 = class123.field2212;
        if (field3570) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3572.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3572);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3573 = var1[0];
            class285.field4891 += field3572.limit() * 2;
            return;
        }
        field3575 = new int[64];
        var0.glGenTextures(64, field3575, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class123.method867(field3575[var2]);
            field3572.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3572);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class285.field4891 += field3572.limit() * 2;
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "()V", line = 138)
    public static void method1497() {
        field3575 = null;
        field3571 = null;
        field3572 = null;
        field3576 = null;
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "()V", line = 149)
    private static final void method1498() {
        GL var0 = class123.field2212;
        if (field3570) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3576.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3576);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3574 = var1[0];
            class285.field4891 += field3576.limit() * 2;
            return;
        }
        field3571 = new int[64];
        var0.glGenTextures(64, field3571, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class123.method867(field3571[var2]);
            field3576.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3576);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class285.field4891 += field3576.limit() * 2;
    }
}
