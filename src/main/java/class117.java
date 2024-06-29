import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class117 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field1829 = -1;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "[I")
    public static int[] field1834 = null;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field1835 = -1;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "[I")
    public static int[] field1831 = null;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1830;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1833;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Z")
    public static boolean field1832;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()V", line = 7)
    public static final void method893() {
        if (field1833 == null) {
            class119 var0 = new class119();
            byte[] var1 = var0.method905(64, 64, 64);
            field1833 = ByteBuffer.allocateDirect(var1.length);
            field1833.position(0);
            field1833.put(var1);
            field1833.flip();
        }
        if (field1830 != null) {
            return;
        }
        class50 var2 = new class50();
        byte[] var3 = var2.method378(64, 64, 64);
        field1830 = ByteBuffer.allocateDirect(var3.length);
        field1830.position(0);
        field1830.put(var3);
        field1830.flip();
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "()V", line = 38)
    public static void method894() {
        field1834 = null;
        field1831 = null;
        field1833 = null;
        field1830 = null;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "()V", line = 46)
    private static final void method895() {
        GL var0 = class73.field1051;
        if (field1832) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field1833.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field1833);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field1835 = var1[0];
            class80.field1186 += field1833.limit() * 2;
            return;
        }
        field1834 = new int[64];
        var0.glGenTextures(64, field1834, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class73.method537(field1834[var2]);
            field1833.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field1833);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class80.field1186 += field1833.limit() * 2;
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "()V", line = 82)
    public static final void method896() {
        if (field1835 != -1) {
            GL var0 = class73.field1051;
            int[] var1 = new int[] { field1835 };
            var0.glDeleteTextures(1, var1, 0);
            field1835 = -1;
            class80.field1186 -= field1833.limit() * 2;
        }
        if (field1834 != null) {
            GL var2 = class73.field1051;
            var2.glDeleteTextures(64, field1834, 0);
            field1834 = null;
            class80.field1186 -= field1833.limit() * 2;
        }
        if (field1829 != -1) {
            GL var3 = class73.field1051;
            int[] var4 = new int[] { field1829 };
            var3.glDeleteTextures(1, var4, 0);
            field1829 = -1;
            class80.field1186 -= field1830.limit() * 2;
        }
        if (field1831 != null) {
            GL var5 = class73.field1051;
            var5.glDeleteTextures(64, field1831, 0);
            field1831 = null;
            class80.field1186 -= field1830.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "()V", line = 129)
    private static final void method897() {
        GL var0 = class73.field1051;
        if (field1832) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field1830.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field1830);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field1829 = var1[0];
            class80.field1186 += field1830.limit() * 2;
            return;
        }
        field1831 = new int[64];
        var0.glGenTextures(64, field1831, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class73.method537(field1831[var2]);
            field1830.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field1830);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class80.field1186 += field1830.limit() * 2;
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "()V", line = 174)
    public static final void method898() {
        field1832 = class73.field1045;
        method893();
        method895();
        method897();
    }
}
