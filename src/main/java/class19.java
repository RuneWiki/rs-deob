import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class19 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[I")
    public static int[] field213 = null;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "[I")
    public static int[] field215 = null;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field212 = -1;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field217 = -1;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field214;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field216;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Z")
    public static boolean field211;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()V", line = 14)
    public static final void method133() {
        if (field214 == null) {
            class2 var0 = new class2();
            byte[] var1 = var0.method34(64, 64, 64);
            field214 = ByteBuffer.allocateDirect(var1.length);
            field214.position(0);
            field214.put(var1);
            field214.flip();
        }
        if (field216 != null) {
            return;
        }
        class237 var2 = new class237();
        byte[] var3 = var2.method1657(64, 64, 64);
        field216 = ByteBuffer.allocateDirect(var3.length);
        field216.position(0);
        field216.put(var3);
        field216.flip();
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "()V", line = 45)
    private static final void method134() {
        GL var0 = class36.field518;
        if (field211) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field216.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field216);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field217 = var1[0];
            class166.field2499 += field216.limit() * 2;
            return;
        }
        field213 = new int[64];
        var0.glGenTextures(64, field213, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class36.method310(field213[var2]);
            field216.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field216);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class166.field2499 += field216.limit() * 2;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "()V", line = 84)
    public static final void method135() {
        field211 = class36.field523;
        method133();
        method137();
        method134();
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "()V", line = 93)
    public static final void method136() {
        if (field212 != -1) {
            GL var0 = class36.field518;
            int[] var1 = new int[] { field212 };
            var0.glDeleteTextures(1, var1, 0);
            field212 = -1;
            class166.field2499 -= field214.limit() * 2;
        }
        if (field215 != null) {
            GL var2 = class36.field518;
            var2.glDeleteTextures(64, field215, 0);
            field215 = null;
            class166.field2499 -= field214.limit() * 2;
        }
        if (field217 != -1) {
            GL var3 = class36.field518;
            int[] var4 = new int[] { field217 };
            var3.glDeleteTextures(1, var4, 0);
            field217 = -1;
            class166.field2499 -= field216.limit() * 2;
        }
        if (field213 != null) {
            GL var5 = class36.field518;
            var5.glDeleteTextures(64, field213, 0);
            field213 = null;
            class166.field2499 -= field216.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "()V", line = 143)
    private static final void method137() {
        GL var0 = class36.field518;
        if (field211) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field214.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field214);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field212 = var1[0];
            class166.field2499 += field214.limit() * 2;
            return;
        }
        field215 = new int[64];
        var0.glGenTextures(64, field215, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class36.method310(field215[var2]);
            field214.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field214);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class166.field2499 += field214.limit() * 2;
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "()V", line = 180)
    public static void method138() {
        field215 = null;
        field213 = null;
        field214 = null;
        field216 = null;
    }
}
