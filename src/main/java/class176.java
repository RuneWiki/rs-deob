import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class176 {

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "[I")
    public static int[] field2894 = null;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "[I")
    public static int[] field2895 = null;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field2896 = -1;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field2898 = -1;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2893;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2897;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Z")
    public static boolean field2899;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()V", line = 5)
    public static final void method1293() {
        field2899 = class21.field384;
        method1294();
        method1297();
        method1295();
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()V", line = 11)
    public static final void method1294() {
        if (field2897 == null) {
            class13 var0 = new class13();
            byte[] var1 = var0.method81(64, 64, 64);
            field2897 = ByteBuffer.allocateDirect(var1.length);
            field2897.position(0);
            field2897.put(var1);
            field2897.flip();
        }
        if (field2893 != null) {
            return;
        }
        class97 var2 = new class97();
        byte[] var3 = var2.method722(64, 64, 64);
        field2893 = ByteBuffer.allocateDirect(var3.length);
        field2893.position(0);
        field2893.put(var3);
        field2893.flip();
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "()V", line = 38)
    private static final void method1295() {
        GL var0 = class21.field377;
        if (field2899) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2893.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2893);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2898 = var1[0];
            class136.field2303 += field2893.limit() * 2;
            return;
        }
        field2894 = new int[64];
        var0.glGenTextures(64, field2894, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class21.method140(field2894[var2]);
            field2893.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2893);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class136.field2303 += field2893.limit() * 2;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "()V", line = 76)
    public static final void method1296() {
        if (field2896 != -1) {
            GL var0 = class21.field377;
            int[] var1 = new int[] { field2896 };
            var0.glDeleteTextures(1, var1, 0);
            field2896 = -1;
            class136.field2303 -= field2897.limit() * 2;
        }
        if (field2895 != null) {
            GL var2 = class21.field377;
            var2.glDeleteTextures(64, field2895, 0);
            field2895 = null;
            class136.field2303 -= field2897.limit() * 2;
        }
        if (field2898 != -1) {
            GL var3 = class21.field377;
            int[] var4 = new int[] { field2898 };
            var3.glDeleteTextures(1, var4, 0);
            field2898 = -1;
            class136.field2303 -= field2893.limit() * 2;
        }
        if (field2894 != null) {
            GL var5 = class21.field377;
            var5.glDeleteTextures(64, field2894, 0);
            field2894 = null;
            class136.field2303 -= field2893.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "()V", line = 120)
    private static final void method1297() {
        GL var0 = class21.field377;
        if (field2899) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2897.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2897);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2896 = var1[0];
            class136.field2303 += field2897.limit() * 2;
            return;
        }
        field2895 = new int[64];
        var0.glGenTextures(64, field2895, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class21.method140(field2895[var2]);
            field2897.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2897);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class136.field2303 += field2897.limit() * 2;
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "()V", line = 163)
    public static void method1298() {
        field2895 = null;
        field2894 = null;
        field2897 = null;
        field2893 = null;
    }
}
