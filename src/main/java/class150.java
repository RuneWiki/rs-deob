import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class150 {

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "[I")
    public static int[] field2388 = null;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[I")
    public static int[] field2393 = null;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2389 = -1;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2390 = -1;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2391;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2392;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Z")
    public static boolean field2394;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()V", line = 7)
    private static final void method1156() {
        GL var0 = class42.field627;
        if (field2394) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2392.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2392);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2389 = var1[0];
            class199.field3173 += field2392.limit() * 2;
            return;
        }
        field2393 = new int[64];
        var0.glGenTextures(64, field2393, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class42.method273(field2393[var2]);
            field2392.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2392);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class199.field3173 += field2392.limit() * 2;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "()V", line = 50)
    public static final void method1157() {
        field2394 = class42.field617;
        method1158();
        method1156();
        method1159();
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "()V", line = 60)
    public static final void method1158() {
        if (field2392 == null) {
            class132 var0 = new class132();
            byte[] var1 = var0.method1017(64, 64, 64);
            field2392 = ByteBuffer.allocateDirect(var1.length);
            field2392.position(0);
            field2392.put(var1);
            field2392.flip();
        }
        if (field2391 != null) {
            return;
        }
        class346 var2 = new class346();
        byte[] var3 = var2.method2431(64, 64, 64);
        field2391 = ByteBuffer.allocateDirect(var3.length);
        field2391.position(0);
        field2391.put(var3);
        field2391.flip();
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "()V", line = 87)
    private static final void method1159() {
        GL var0 = class42.field627;
        if (field2394) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2391.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2391);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2390 = var1[0];
            class199.field3173 += field2391.limit() * 2;
            return;
        }
        field2388 = new int[64];
        var0.glGenTextures(64, field2388, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class42.method273(field2388[var2]);
            field2391.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2391);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class199.field3173 += field2391.limit() * 2;
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "()V", line = 130)
    public static void method1160() {
        field2393 = null;
        field2388 = null;
        field2392 = null;
        field2391 = null;
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "()V", line = 144)
    public static final void method1161() {
        if (field2389 != -1) {
            GL var0 = class42.field627;
            int[] var1 = new int[] { field2389 };
            var0.glDeleteTextures(1, var1, 0);
            field2389 = -1;
            class199.field3173 -= field2392.limit() * 2;
        }
        if (field2393 != null) {
            GL var2 = class42.field627;
            var2.glDeleteTextures(64, field2393, 0);
            field2393 = null;
            class199.field3173 -= field2392.limit() * 2;
        }
        if (field2390 != -1) {
            GL var3 = class42.field627;
            int[] var4 = new int[] { field2390 };
            var3.glDeleteTextures(1, var4, 0);
            field2390 = -1;
            class199.field3173 -= field2391.limit() * 2;
        }
        if (field2388 != null) {
            GL var5 = class42.field627;
            var5.glDeleteTextures(64, field2388, 0);
            field2388 = null;
            class199.field3173 -= field2391.limit() * 2;
        }
    }
}
