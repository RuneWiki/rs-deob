import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class69 {

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "[I")
    public static int[] field944 = null;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "[I")
    public static int[] field946 = null;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field942 = -1;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field948 = -1;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field945;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field947;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Z")
    public static boolean field943;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()V", line = 17)
    public static final void method506() {
        if (field947 == null) {
            class229 var0 = new class229();
            byte[] var1 = var0.method1594(64, 64, 64);
            field947 = ByteBuffer.allocateDirect(var1.length);
            field947.position(0);
            field947.put(var1);
            field947.flip();
        }
        if (field945 != null) {
            return;
        }
        class34 var2 = new class34();
        byte[] var3 = var2.method191(64, 64, 64);
        field945 = ByteBuffer.allocateDirect(var3.length);
        field945.position(0);
        field945.put(var3);
        field945.flip();
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()V", line = 44)
    public static final void method507() {
        if (field948 != -1) {
            GL var0 = class67.field899;
            int[] var1 = new int[] { field948 };
            var0.glDeleteTextures(1, var1, 0);
            field948 = -1;
            class180.field2412 -= field947.limit() * 2;
        }
        if (field944 != null) {
            GL var2 = class67.field899;
            var2.glDeleteTextures(64, field944, 0);
            field944 = null;
            class180.field2412 -= field947.limit() * 2;
        }
        if (field942 != -1) {
            GL var3 = class67.field899;
            int[] var4 = new int[] { field942 };
            var3.glDeleteTextures(1, var4, 0);
            field942 = -1;
            class180.field2412 -= field945.limit() * 2;
        }
        if (field946 != null) {
            GL var5 = class67.field899;
            var5.glDeleteTextures(64, field946, 0);
            field946 = null;
            class180.field2412 -= field945.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "()V", line = 93)
    private static final void method508() {
        GL var0 = class67.field899;
        if (field943) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field945.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field945);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field942 = var1[0];
            class180.field2412 += field945.limit() * 2;
            return;
        }
        field946 = new int[64];
        var0.glGenTextures(64, field946, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class67.method479(field946[var2]);
            field945.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field945);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class180.field2412 += field945.limit() * 2;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "()V", line = 129)
    public static void method509() {
        field944 = null;
        field946 = null;
        field947 = null;
        field945 = null;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "()V", line = 137)
    private static final void method510() {
        GL var0 = class67.field899;
        if (field943) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field947.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field947);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field948 = var1[0];
            class180.field2412 += field947.limit() * 2;
            return;
        }
        field944 = new int[64];
        var0.glGenTextures(64, field944, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class67.method479(field944[var2]);
            field947.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field947);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class180.field2412 += field947.limit() * 2;
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "()V", line = 180)
    public static final void method511() {
        field943 = class67.field912;
        method506();
        method510();
        method508();
    }
}
