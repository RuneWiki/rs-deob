import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class243 {

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "[I")
    public static int[] field4036 = null;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "[I")
    public static int[] field4034 = null;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field4037 = -1;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field4038 = -1;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4033;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4035;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Z")
    public static boolean field4032;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "()V", line = 8)
    public static void method1757() {
        field4036 = null;
        field4034 = null;
        field4033 = null;
        field4035 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "()V", line = 15)
    private static final void method1758() {
        GL var0 = class271.field4641;
        if (field4032) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field4035.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field4035);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field4037 = var1[0];
            class68.field1130 += field4035.limit() * 2;
            return;
        }
        field4034 = new int[64];
        var0.glGenTextures(64, field4034, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class271.method1978(field4034[var2]);
            field4035.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field4035);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class68.field1130 += field4035.limit() * 2;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "()V", line = 61)
    public static final void method1759() {
        if (field4038 != -1) {
            GL var0 = class271.field4641;
            int[] var1 = new int[] { field4038 };
            var0.glDeleteTextures(1, var1, 0);
            field4038 = -1;
            class68.field1130 -= field4033.limit() * 2;
        }
        if (field4036 != null) {
            GL var2 = class271.field4641;
            var2.glDeleteTextures(64, field4036, 0);
            field4036 = null;
            class68.field1130 -= field4033.limit() * 2;
        }
        if (field4037 != -1) {
            GL var3 = class271.field4641;
            int[] var4 = new int[] { field4037 };
            var3.glDeleteTextures(1, var4, 0);
            field4037 = -1;
            class68.field1130 -= field4035.limit() * 2;
        }
        if (field4034 != null) {
            GL var5 = class271.field4641;
            var5.glDeleteTextures(64, field4034, 0);
            field4034 = null;
            class68.field1130 -= field4035.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "()V", line = 111)
    public static final void method1760() {
        if (field4033 == null) {
            class193 var0 = new class193();
            byte[] var1 = var0.method1492(64, 64, 64);
            field4033 = ByteBuffer.allocateDirect(var1.length);
            field4033.position(0);
            field4033.put(var1);
            field4033.flip();
        }
        if (field4035 != null) {
            return;
        }
        class314 var2 = new class314();
        byte[] var3 = var2.method2198(64, 64, 64);
        field4035 = ByteBuffer.allocateDirect(var3.length);
        field4035.position(0);
        field4035.put(var3);
        field4035.flip();
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "()V", line = 140)
    public static final void method1761() {
        field4032 = class271.field4649;
        method1760();
        method1762();
        method1758();
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "()V", line = 150)
    private static final void method1762() {
        GL var0 = class271.field4641;
        if (field4032) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field4033.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field4033);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field4038 = var1[0];
            class68.field1130 += field4033.limit() * 2;
            return;
        }
        field4036 = new int[64];
        var0.glGenTextures(64, field4036, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class271.method1978(field4036[var2]);
            field4033.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field4033);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class68.field1130 += field4033.limit() * 2;
    }
}
