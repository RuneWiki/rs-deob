import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class71 {

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "[I")
    public static int[] field1066 = null;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "[I")
    public static int[] field1065 = null;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field1063 = -1;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field1064 = -1;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1068;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1069;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "Z")
    public static boolean field1067;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()V", line = 11)
    public static final void method515() {
        if (field1063 != -1) {
            GL var0 = class166.field2648;
            int[] var1 = new int[] { field1063 };
            var0.glDeleteTextures(1, var1, 0);
            field1063 = -1;
            class103.field1457 -= field1068.limit() * 2;
        }
        if (field1066 != null) {
            GL var2 = class166.field2648;
            var2.glDeleteTextures(64, field1066, 0);
            field1066 = null;
            class103.field1457 -= field1068.limit() * 2;
        }
        if (field1064 != -1) {
            GL var3 = class166.field2648;
            int[] var4 = new int[] { field1064 };
            var3.glDeleteTextures(1, var4, 0);
            field1064 = -1;
            class103.field1457 -= field1069.limit() * 2;
        }
        if (field1065 != null) {
            GL var5 = class166.field2648;
            var5.glDeleteTextures(64, field1065, 0);
            field1065 = null;
            class103.field1457 -= field1069.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "()V", line = 58)
    public static final void method516() {
        field1067 = class166.field2623;
        method518();
        method519();
        method517();
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "()V", line = 70)
    private static final void method517() {
        GL var0 = class166.field2648;
        if (field1067) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field1069.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field1069);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field1064 = var1[0];
            class103.field1457 += field1069.limit() * 2;
            return;
        }
        field1065 = new int[64];
        var0.glGenTextures(64, field1065, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class166.method1182(field1065[var2]);
            field1069.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field1069);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class103.field1457 += field1069.limit() * 2;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "()V", line = 114)
    public static final void method518() {
        if (field1068 == null) {
            class114 var0 = new class114();
            byte[] var1 = var0.method822(64, 64, 64);
            field1068 = ByteBuffer.allocateDirect(var1.length);
            field1068.position(0);
            field1068.put(var1);
            field1068.flip();
        }
        if (field1069 != null) {
            return;
        }
        class227 var2 = new class227();
        byte[] var3 = var2.method1629(64, 64, 64);
        field1069 = ByteBuffer.allocateDirect(var3.length);
        field1069.position(0);
        field1069.put(var3);
        field1069.flip();
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "()V", line = 141)
    private static final void method519() {
        GL var0 = class166.field2648;
        if (field1067) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field1068.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field1068);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field1063 = var1[0];
            class103.field1457 += field1068.limit() * 2;
            return;
        }
        field1066 = new int[64];
        var0.glGenTextures(64, field1066, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class166.method1182(field1066[var2]);
            field1068.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field1068);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class103.field1457 += field1068.limit() * 2;
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "()V", line = 180)
    public static void method520() {
        field1066 = null;
        field1065 = null;
        field1068 = null;
        field1069 = null;
    }
}
