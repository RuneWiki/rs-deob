import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class6 {

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[I")
    public static int[] field84 = null;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "[I")
    public static int[] field82 = null;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field86 = -1;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field87 = -1;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field81;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field83;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Z")
    public static boolean field85;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()V", line = 10)
    private static final void method38() {
        GL var0 = class43.field651;
        if (field85) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field83.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field83);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field87 = var1[0];
            class151.field2671 += field83.limit() * 2;
            return;
        }
        field82 = new int[64];
        var0.glGenTextures(64, field82, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class43.method390(field82[var2]);
            field83.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field83);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class151.field2671 += field83.limit() * 2;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()V", line = 46)
    public static final void method39() {
        if (field81 == null) {
            class267 var0 = new class267();
            byte[] var1 = var0.method1837(64, 64, 64);
            field81 = ByteBuffer.allocateDirect(var1.length);
            field81.position(0);
            field81.put(var1);
            field81.flip();
        }
        if (field83 != null) {
            return;
        }
        class235 var2 = new class235();
        byte[] var3 = var2.method1677(64, 64, 64);
        field83 = ByteBuffer.allocateDirect(var3.length);
        field83.position(0);
        field83.put(var3);
        field83.flip();
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "()V", line = 72)
    public static void method40() {
        field84 = null;
        field82 = null;
        field81 = null;
        field83 = null;
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "()V", line = 80)
    public static final void method41() {
        if (field86 != -1) {
            GL var0 = class43.field651;
            int[] var1 = new int[] { field86 };
            var0.glDeleteTextures(1, var1, 0);
            field86 = -1;
            class151.field2671 -= field81.limit() * 2;
        }
        if (field84 != null) {
            GL var2 = class43.field651;
            var2.glDeleteTextures(64, field84, 0);
            field84 = null;
            class151.field2671 -= field81.limit() * 2;
        }
        if (field87 != -1) {
            GL var3 = class43.field651;
            int[] var4 = new int[] { field87 };
            var3.glDeleteTextures(1, var4, 0);
            field87 = -1;
            class151.field2671 -= field83.limit() * 2;
        }
        if (field82 != null) {
            GL var5 = class43.field651;
            var5.glDeleteTextures(64, field82, 0);
            field82 = null;
            class151.field2671 -= field83.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "()V", line = 127)
    private static final void method42() {
        GL var0 = class43.field651;
        if (field85) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field81.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field81);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field86 = var1[0];
            class151.field2671 += field81.limit() * 2;
            return;
        }
        field84 = new int[64];
        var0.glGenTextures(64, field84, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class43.method390(field84[var2]);
            field81.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field81);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class151.field2671 += field81.limit() * 2;
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "()V", line = 171)
    public static final void method43() {
        field85 = class43.field678;
        method39();
        method42();
        method38();
    }
}
