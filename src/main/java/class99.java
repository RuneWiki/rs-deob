import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class99 {

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "[I")
    public static int[] field1756 = null;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field1754 = -1;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "[I")
    public static int[] field1758 = null;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field1757 = -1;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1753;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1759;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Z")
    public static boolean field1755;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "()V", line = 7)
    public static final void method674() {
        if (field1757 != -1) {
            GL var0 = class108.field1899;
            int[] var1 = new int[] { field1757 };
            var0.glDeleteTextures(1, var1, 0);
            field1757 = -1;
            class263.field4549 -= field1753.limit() * 2;
        }
        if (field1756 != null) {
            GL var2 = class108.field1899;
            var2.glDeleteTextures(64, field1756, 0);
            field1756 = null;
            class263.field4549 -= field1753.limit() * 2;
        }
        if (field1754 != -1) {
            GL var3 = class108.field1899;
            int[] var4 = new int[] { field1754 };
            var3.glDeleteTextures(1, var4, 0);
            field1754 = -1;
            class263.field4549 -= field1759.limit() * 2;
        }
        if (field1758 != null) {
            GL var5 = class108.field1899;
            var5.glDeleteTextures(64, field1758, 0);
            field1758 = null;
            class263.field4549 -= field1759.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "()V", line = 50)
    public static void method675() {
        field1756 = null;
        field1758 = null;
        field1753 = null;
        field1759 = null;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "()V", line = 57)
    private static final void method676() {
        GL var0 = class108.field1899;
        if (field1755) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field1753.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field1753);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field1757 = var1[0];
            class263.field4549 += field1753.limit() * 2;
            return;
        }
        field1756 = new int[64];
        var0.glGenTextures(64, field1756, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class108.method736(field1756[var2]);
            field1753.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field1753);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class263.field4549 += field1753.limit() * 2;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "()V", line = 99)
    public static final void method677() {
        field1755 = class108.field1897;
        method679();
        method676();
        method678();
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "()V", line = 110)
    private static final void method678() {
        GL var0 = class108.field1899;
        if (field1755) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field1759.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field1759);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field1754 = var1[0];
            class263.field4549 += field1759.limit() * 2;
            return;
        }
        field1758 = new int[64];
        var0.glGenTextures(64, field1758, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class108.method736(field1758[var2]);
            field1759.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field1759);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class263.field4549 += field1759.limit() * 2;
    }

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "()V", line = 146)
    public static final void method679() {
        if (field1753 == null) {
            class116 var0 = new class116();
            byte[] var1 = var0.method830(64, 64, 64);
            field1753 = ByteBuffer.allocateDirect(var1.length);
            field1753.position(0);
            field1753.put(var1);
            field1753.flip();
        }
        if (field1759 != null) {
            return;
        }
        class40 var2 = new class40();
        byte[] var3 = var2.method349(64, 64, 64);
        field1759 = ByteBuffer.allocateDirect(var3.length);
        field1759.position(0);
        field1759.put(var3);
        field1759.flip();
    }
}
