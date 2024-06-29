import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class230 {

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field3966 = -1;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "[I")
    public static int[] field3964 = null;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "[I")
    public static int[] field3961 = null;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field3960 = -1;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3962;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3965;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "Z")
    public static boolean field3963;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()V", line = 6)
    private static final void method1532() {
        GL var0 = class257.field4409;
        if (field3963) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3965.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3965);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3966 = var1[0];
            class196.field3442 += field3965.limit() * 2;
            return;
        }
        field3964 = new int[64];
        var0.glGenTextures(64, field3964, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class257.method1736(field3964[var2]);
            field3965.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3965);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class196.field3442 += field3965.limit() * 2;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "()V", line = 46)
    public static final void method1533() {
        if (field3960 != -1) {
            GL var0 = class257.field4409;
            int[] var1 = new int[] { field3960 };
            var0.glDeleteTextures(1, var1, 0);
            field3960 = -1;
            class196.field3442 -= field3962.limit() * 2;
        }
        if (field3961 != null) {
            GL var2 = class257.field4409;
            var2.glDeleteTextures(64, field3961, 0);
            field3961 = null;
            class196.field3442 -= field3962.limit() * 2;
        }
        if (field3966 != -1) {
            GL var3 = class257.field4409;
            int[] var4 = new int[] { field3966 };
            var3.glDeleteTextures(1, var4, 0);
            field3966 = -1;
            class196.field3442 -= field3965.limit() * 2;
        }
        if (field3964 != null) {
            GL var5 = class257.field4409;
            var5.glDeleteTextures(64, field3964, 0);
            field3964 = null;
            class196.field3442 -= field3965.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "()V", line = 92)
    public static final void method1534() {
        if (field3962 == null) {
            class150 var0 = new class150();
            byte[] var1 = var0.method1027(64, 64, 64);
            field3962 = ByteBuffer.allocateDirect(var1.length);
            field3962.position(0);
            field3962.put(var1);
            field3962.flip();
        }
        if (field3965 != null) {
            return;
        }
        class273 var2 = new class273();
        byte[] var3 = var2.method1927(64, 64, 64);
        field3965 = ByteBuffer.allocateDirect(var3.length);
        field3965.position(0);
        field3965.put(var3);
        field3965.flip();
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "()V", line = 118)
    public static final void method1535() {
        field3963 = class257.field4399;
        method1534();
        method1537();
        method1532();
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "()V", line = 124)
    public static void method1536() {
        field3961 = null;
        field3964 = null;
        field3962 = null;
        field3965 = null;
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "()V", line = 133)
    private static final void method1537() {
        GL var0 = class257.field4409;
        if (field3963) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3962.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3962);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3960 = var1[0];
            class196.field3442 += field3962.limit() * 2;
            return;
        }
        field3961 = new int[64];
        var0.glGenTextures(64, field3961, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class257.method1736(field3961[var2]);
            field3962.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3962);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class196.field3442 += field3962.limit() * 2;
    }
}
