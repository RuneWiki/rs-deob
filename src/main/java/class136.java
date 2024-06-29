import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class136 {

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2155 = -1;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2156 = -1;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "[I")
    public static int[] field2159 = null;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "[I")
    public static int[] field2160 = null;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2154;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2158;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "Z")
    public static boolean field2157;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()V", line = 7)
    private static final void method1010() {
        GL var0 = class232.field3716;
        if (field2157) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2158.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2158);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2156 = var1[0];
            class230.field3663 += field2158.limit() * 2;
            return;
        }
        field2160 = new int[64];
        var0.glGenTextures(64, field2160, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class232.method1662(field2160[var2]);
            field2158.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2158);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class230.field3663 += field2158.limit() * 2;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "()V", line = 45)
    public static final void method1011() {
        field2157 = class232.field3708;
        method1013();
        method1010();
        method1014();
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "()V", line = 56)
    public static final void method1012() {
        if (field2156 != -1) {
            GL var0 = class232.field3716;
            int[] var1 = new int[] { field2156 };
            var0.glDeleteTextures(1, var1, 0);
            field2156 = -1;
            class230.field3663 -= field2158.limit() * 2;
        }
        if (field2160 != null) {
            GL var2 = class232.field3716;
            var2.glDeleteTextures(64, field2160, 0);
            field2160 = null;
            class230.field3663 -= field2158.limit() * 2;
        }
        if (field2155 != -1) {
            GL var3 = class232.field3716;
            int[] var4 = new int[] { field2155 };
            var3.glDeleteTextures(1, var4, 0);
            field2155 = -1;
            class230.field3663 -= field2154.limit() * 2;
        }
        if (field2159 != null) {
            GL var5 = class232.field3716;
            var5.glDeleteTextures(64, field2159, 0);
            field2159 = null;
            class230.field3663 -= field2154.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "()V", line = 100)
    public static final void method1013() {
        if (field2158 == null) {
            class68 var0 = new class68();
            byte[] var1 = var0.method450(64, 64, 64);
            field2158 = ByteBuffer.allocateDirect(var1.length);
            field2158.position(0);
            field2158.put(var1);
            field2158.flip();
        }
        if (field2154 != null) {
            return;
        }
        class238 var2 = new class238();
        byte[] var3 = var2.method1711(64, 64, 64);
        field2154 = ByteBuffer.allocateDirect(var3.length);
        field2154.position(0);
        field2154.put(var3);
        field2154.flip();
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "()V", line = 127)
    private static final void method1014() {
        GL var0 = class232.field3716;
        if (field2157) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2154.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2154);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2155 = var1[0];
            class230.field3663 += field2154.limit() * 2;
            return;
        }
        field2159 = new int[64];
        var0.glGenTextures(64, field2159, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class232.method1662(field2159[var2]);
            field2154.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2154);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class230.field3663 += field2154.limit() * 2;
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "()V", line = 168)
    public static void method1015() {
        field2160 = null;
        field2159 = null;
        field2158 = null;
        field2154 = null;
    }
}
