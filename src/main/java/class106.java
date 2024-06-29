import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class106 {

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1931 = -1;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field1929 = -1;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "[I")
    public static int[] field1932 = null;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "[I")
    public static int[] field1935 = null;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1930;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1933;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "Z")
    public static boolean field1934;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()V", line = 9)
    public static final void method785() {
        field1934 = class241.field4014;
        method790();
        method788();
        method787();
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "()V", line = 17)
    public static final void method786() {
        if (field1929 != -1) {
            GL var0 = class241.field4012;
            int[] var1 = new int[] { field1929 };
            var0.glDeleteTextures(1, var1, 0);
            field1929 = -1;
            class239.field3975 -= field1933.limit() * 2;
        }
        if (field1935 != null) {
            GL var2 = class241.field4012;
            var2.glDeleteTextures(64, field1935, 0);
            field1935 = null;
            class239.field3975 -= field1933.limit() * 2;
        }
        if (field1931 != -1) {
            GL var3 = class241.field4012;
            int[] var4 = new int[] { field1931 };
            var3.glDeleteTextures(1, var4, 0);
            field1931 = -1;
            class239.field3975 -= field1930.limit() * 2;
        }
        if (field1932 != null) {
            GL var5 = class241.field4012;
            var5.glDeleteTextures(64, field1932, 0);
            field1932 = null;
            class239.field3975 -= field1930.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "()V", line = 62)
    private static final void method787() {
        GL var0 = class241.field4012;
        if (field1934) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field1930.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field1930);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field1931 = var1[0];
            class239.field3975 += field1930.limit() * 2;
            return;
        }
        field1932 = new int[64];
        var0.glGenTextures(64, field1932, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class241.method1687(field1932[var2]);
            field1930.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field1930);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class239.field3975 += field1930.limit() * 2;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "()V", line = 110)
    private static final void method788() {
        GL var0 = class241.field4012;
        if (field1934) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field1933.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field1933);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field1929 = var1[0];
            class239.field3975 += field1933.limit() * 2;
            return;
        }
        field1935 = new int[64];
        var0.glGenTextures(64, field1935, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class241.method1687(field1935[var2]);
            field1933.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field1933);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class239.field3975 += field1933.limit() * 2;
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "()V", line = 146)
    public static void method789() {
        field1935 = null;
        field1932 = null;
        field1933 = null;
        field1930 = null;
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "()V", line = 152)
    public static final void method790() {
        if (field1933 == null) {
            class350 var0 = new class350();
            byte[] var1 = var0.method2497(64, 64, 64);
            field1933 = ByteBuffer.allocateDirect(var1.length);
            field1933.position(0);
            field1933.put(var1);
            field1933.flip();
        }
        if (field1930 != null) {
            return;
        }
        class243 var2 = new class243();
        byte[] var3 = var2.method1724(64, 64, 64);
        field1930 = ByteBuffer.allocateDirect(var3.length);
        field1930.position(0);
        field1930.put(var3);
        field1930.flip();
    }
}
