import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class212 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field3455 = -1;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field3457 = -1;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "[I")
    public static int[] field3458 = null;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
    public static int[] field3460 = null;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3456;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3459;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Z")
    public static boolean field3461;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()V", line = 6)
    private static final void method1545() {
        GL var0 = class186.field2990;
        if (field3461) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3459.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3459);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3455 = var1[0];
            class275.field4358 += field3459.limit() * 2;
            return;
        }
        field3458 = new int[64];
        var0.glGenTextures(64, field3458, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class186.method1288(field3458[var2]);
            field3459.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3459);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class275.field4358 += field3459.limit() * 2;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()V", line = 48)
    public static final void method1546() {
        if (field3459 == null) {
            class159 var0 = new class159();
            byte[] var1 = var0.method1096(64, 64, 64);
            field3459 = ByteBuffer.allocateDirect(var1.length);
            field3459.position(0);
            field3459.put(var1);
            field3459.flip();
        }
        if (field3456 != null) {
            return;
        }
        class171 var2 = new class171();
        byte[] var3 = var2.method1173(64, 64, 64);
        field3456 = ByteBuffer.allocateDirect(var3.length);
        field3456.position(0);
        field3456.put(var3);
        field3456.flip();
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "()V", line = 77)
    public static final void method1547() {
        if (field3455 != -1) {
            GL var0 = class186.field2990;
            int[] var1 = new int[] { field3455 };
            var0.glDeleteTextures(1, var1, 0);
            field3455 = -1;
            class275.field4358 -= field3459.limit() * 2;
        }
        if (field3458 != null) {
            GL var2 = class186.field2990;
            var2.glDeleteTextures(64, field3458, 0);
            field3458 = null;
            class275.field4358 -= field3459.limit() * 2;
        }
        if (field3457 != -1) {
            GL var3 = class186.field2990;
            int[] var4 = new int[] { field3457 };
            var3.glDeleteTextures(1, var4, 0);
            field3457 = -1;
            class275.field4358 -= field3456.limit() * 2;
        }
        if (field3460 != null) {
            GL var5 = class186.field2990;
            var5.glDeleteTextures(64, field3460, 0);
            field3460 = null;
            class275.field4358 -= field3456.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "()V", line = 119)
    public static final void method1548() {
        field3461 = class186.field3003;
        method1546();
        method1545();
        method1550();
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "()V", line = 131)
    public static void method1549() {
        field3458 = null;
        field3460 = null;
        field3459 = null;
        field3456 = null;
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "()V", line = 147)
    private static final void method1550() {
        GL var0 = class186.field2990;
        if (field3461) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3456.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3456);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3457 = var1[0];
            class275.field4358 += field3456.limit() * 2;
            return;
        }
        field3460 = new int[64];
        var0.glGenTextures(64, field3460, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class186.method1288(field3460[var2]);
            field3456.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3456);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class275.field4358 += field3456.limit() * 2;
    }
}
