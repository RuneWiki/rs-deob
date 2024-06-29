import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class49 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "[I")
    public static int[] field803 = null;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field809 = -1;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
    public static int[] field804 = null;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field808 = -1;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field806;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field807;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "Z")
    public static boolean field805;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()V", line = 5)
    public static final void method350() {
        if (field807 == null) {
            class58 var0 = new class58();
            byte[] var1 = var0.method392(64, 64, 64);
            field807 = ByteBuffer.allocateDirect(var1.length);
            field807.position(0);
            field807.put(var1);
            field807.flip();
        }
        if (field806 != null) {
            return;
        }
        class188 var2 = new class188();
        byte[] var3 = var2.method1297(64, 64, 64);
        field806 = ByteBuffer.allocateDirect(var3.length);
        field806.position(0);
        field806.put(var3);
        field806.flip();
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()V", line = 33)
    private static final void method351() {
        GL var0 = class147.field2479;
        if (field805) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field807.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field807);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field809 = var1[0];
            class6.field50 += field807.limit() * 2;
            return;
        }
        field803 = new int[64];
        var0.glGenTextures(64, field803, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class147.method1002(field803[var2]);
            field807.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field807);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class6.field50 += field807.limit() * 2;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()V", line = 77)
    public static final void method352() {
        field805 = class147.field2500;
        method350();
        method351();
        method355();
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()V", line = 87)
    public static void method353() {
        field803 = null;
        field804 = null;
        field807 = null;
        field806 = null;
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "()V", line = 104)
    public static final void method354() {
        if (field809 != -1) {
            GL var0 = class147.field2479;
            int[] var1 = new int[] { field809 };
            var0.glDeleteTextures(1, var1, 0);
            field809 = -1;
            class6.field50 -= field807.limit() * 2;
        }
        if (field803 != null) {
            GL var2 = class147.field2479;
            var2.glDeleteTextures(64, field803, 0);
            field803 = null;
            class6.field50 -= field807.limit() * 2;
        }
        if (field808 != -1) {
            GL var3 = class147.field2479;
            int[] var4 = new int[] { field808 };
            var3.glDeleteTextures(1, var4, 0);
            field808 = -1;
            class6.field50 -= field806.limit() * 2;
        }
        if (field804 != null) {
            GL var5 = class147.field2479;
            var5.glDeleteTextures(64, field804, 0);
            field804 = null;
            class6.field50 -= field806.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "()V", line = 148)
    private static final void method355() {
        GL var0 = class147.field2479;
        if (field805) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field806.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field806);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field808 = var1[0];
            class6.field50 += field806.limit() * 2;
            return;
        }
        field804 = new int[64];
        var0.glGenTextures(64, field804, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class147.method1002(field804[var2]);
            field806.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field806);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class6.field50 += field806.limit() * 2;
    }
}
