import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class133 {

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field2040 = -1;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field2037 = -1;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "[I")
    public static int[] field2041 = null;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "[I")
    public static int[] field2043 = null;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2038;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2042;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "Z")
    public static boolean field2039;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "()V", line = 9)
    private static final void method976() {
        GL var0 = class117.field1801;
        if (field2039) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2038.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2038);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2040 = var1[0];
            class174.field2592 += field2038.limit() * 2;
            return;
        }
        field2041 = new int[64];
        var0.glGenTextures(64, field2041, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class117.method814(field2041[var2]);
            field2038.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2038);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class174.field2592 += field2038.limit() * 2;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "()V", line = 51)
    private static final void method977() {
        GL var0 = class117.field1801;
        if (field2039) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2042.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2042);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2037 = var1[0];
            class174.field2592 += field2042.limit() * 2;
            return;
        }
        field2043 = new int[64];
        var0.glGenTextures(64, field2043, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class117.method814(field2043[var2]);
            field2042.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2042);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class174.field2592 += field2042.limit() * 2;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "()V", line = 87)
    public static final void method978() {
        field2039 = class117.field1803;
        method980();
        method976();
        method977();
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "()V", line = 93)
    public static final void method979() {
        if (field2040 != -1) {
            GL var0 = class117.field1801;
            int[] var1 = new int[] { field2040 };
            var0.glDeleteTextures(1, var1, 0);
            field2040 = -1;
            class174.field2592 -= field2038.limit() * 2;
        }
        if (field2041 != null) {
            GL var2 = class117.field1801;
            var2.glDeleteTextures(64, field2041, 0);
            field2041 = null;
            class174.field2592 -= field2038.limit() * 2;
        }
        if (field2037 != -1) {
            GL var3 = class117.field1801;
            int[] var4 = new int[] { field2037 };
            var3.glDeleteTextures(1, var4, 0);
            field2037 = -1;
            class174.field2592 -= field2042.limit() * 2;
        }
        if (field2043 != null) {
            GL var5 = class117.field1801;
            var5.glDeleteTextures(64, field2043, 0);
            field2043 = null;
            class174.field2592 -= field2042.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "()V", line = 150)
    public static final void method980() {
        if (field2038 == null) {
            class254 var0 = new class254();
            byte[] var1 = var0.method1724(64, 64, 64);
            field2038 = ByteBuffer.allocateDirect(var1.length);
            field2038.position(0);
            field2038.put(var1);
            field2038.flip();
        }
        if (field2042 != null) {
            return;
        }
        class175 var2 = new class175();
        byte[] var3 = var2.method1215(64, 64, 64);
        field2042 = ByteBuffer.allocateDirect(var3.length);
        field2042.position(0);
        field2042.put(var3);
        field2042.flip();
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "()V", line = 177)
    public static void method981() {
        field2041 = null;
        field2043 = null;
        field2038 = null;
        field2042 = null;
    }
}
