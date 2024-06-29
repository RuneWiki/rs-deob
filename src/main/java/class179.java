import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class179 {

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field3141 = -1;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field3143 = -1;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
    public static int[] field3139 = null;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "[I")
    public static int[] field3144 = null;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3140;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3145;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Z")
    public static boolean field3142;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V", line = 7)
    public static void method1220() {
        field3139 = null;
        field3144 = null;
        field3145 = null;
        field3140 = null;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V", line = 16)
    private static final void method1221() {
        GL var0 = class247.field4253;
        if (field3142) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3145.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3145);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3143 = var1[0];
            class274.field4744 += field3145.limit() * 2;
            return;
        }
        field3139 = new int[64];
        var0.glGenTextures(64, field3139, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class247.method1691(field3139[var2]);
            field3145.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3145);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class274.field4744 += field3145.limit() * 2;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V", line = 53)
    public static final void method1222() {
        if (field3145 == null) {
            class101 var0 = new class101();
            byte[] var1 = var0.method627(64, 64, 64);
            field3145 = ByteBuffer.allocateDirect(var1.length);
            field3145.position(0);
            field3145.put(var1);
            field3145.flip();
        }
        if (field3140 != null) {
            return;
        }
        class282 var2 = new class282();
        byte[] var3 = var2.method1963(64, 64, 64);
        field3140 = ByteBuffer.allocateDirect(var3.length);
        field3140.position(0);
        field3140.put(var3);
        field3140.flip();
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V", line = 79)
    public static final void method1223() {
        field3142 = class247.field4226;
        method1222();
        method1221();
        method1225();
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V", line = 94)
    public static final void method1224() {
        if (field3143 != -1) {
            GL var0 = class247.field4253;
            int[] var1 = new int[] { field3143 };
            var0.glDeleteTextures(1, var1, 0);
            field3143 = -1;
            class274.field4744 -= field3145.limit() * 2;
        }
        if (field3139 != null) {
            GL var2 = class247.field4253;
            var2.glDeleteTextures(64, field3139, 0);
            field3139 = null;
            class274.field4744 -= field3145.limit() * 2;
        }
        if (field3141 != -1) {
            GL var3 = class247.field4253;
            int[] var4 = new int[] { field3141 };
            var3.glDeleteTextures(1, var4, 0);
            field3141 = -1;
            class274.field4744 -= field3140.limit() * 2;
        }
        if (field3144 != null) {
            GL var5 = class247.field4253;
            var5.glDeleteTextures(64, field3144, 0);
            field3144 = null;
            class274.field4744 -= field3140.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V", line = 150)
    private static final void method1225() {
        GL var0 = class247.field4253;
        if (field3142) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3140.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3140);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3141 = var1[0];
            class274.field4744 += field3140.limit() * 2;
            return;
        }
        field3144 = new int[64];
        var0.glGenTextures(64, field3144, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class247.method1691(field3144[var2]);
            field3140.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3140);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class274.field4744 += field3140.limit() * 2;
    }
}
