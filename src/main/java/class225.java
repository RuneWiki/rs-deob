import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class225 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field3800 = -1;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field3802 = -1;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "[I")
    public static int[] field3805 = null;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "[I")
    public static int[] field3806 = null;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3803;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3804;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Z")
    public static boolean field3801;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()V", line = 8)
    public static void method1653() {
        field3805 = null;
        field3806 = null;
        field3803 = null;
        field3804 = null;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "()V", line = 16)
    private static final void method1654() {
        GL var0 = class47.field739;
        if (field3801) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3803.position(0);
            var0.glTexImage3D(32879, 0, 6410, 128, 128, 32, 0, 6410, 5121, field3803);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3802 = var1[0];
            class119.field2008 += field3803.limit() * 2;
            return;
        }
        field3805 = new int[64];
        var0.glGenTextures(64, field3805, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class47.method317(field3805[var2]);
            field3803.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3803);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class119.field2008 += field3803.limit() * 2;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "()V", line = 55)
    public static final void method1655() {
        if (field3802 != -1) {
            GL var0 = class47.field739;
            int[] var1 = new int[] { field3802 };
            var0.glDeleteTextures(1, var1, 0);
            field3802 = -1;
            class119.field2008 -= field3803.limit() * 2;
        }
        if (field3805 != null) {
            GL var2 = class47.field739;
            var2.glDeleteTextures(64, field3805, 0);
            field3805 = null;
            class119.field2008 -= field3803.limit() * 2;
        }
        if (field3800 != -1) {
            GL var3 = class47.field739;
            int[] var4 = new int[] { field3800 };
            var3.glDeleteTextures(1, var4, 0);
            field3800 = -1;
            class119.field2008 -= field3804.limit() * 2;
        }
        if (field3806 != null) {
            GL var5 = class47.field739;
            var5.glDeleteTextures(64, field3806, 0);
            field3806 = null;
            class119.field2008 -= field3804.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "()V", line = 102)
    public static final void method1656() {
        field3801 = class47.field754;
        if (field3803 == null) {
            class280 var0 = new class280();
            byte[] var1;
            if (field3801) {
                var1 = var0.method1992(128, 128, 32);
            } else {
                var1 = var0.method1992(64, 64, 64);
            }
            field3803 = ByteBuffer.allocateDirect(var1.length);
            field3803.position(0);
            field3803.put(var1);
            field3803.flip();
        }
        if (field3804 == null) {
            class105 var2 = new class105();
            byte[] var3;
            if (field3801) {
                var3 = var2.method826(128, 128, 32);
            } else {
                var3 = var2.method826(64, 64, 64);
            }
            field3804 = ByteBuffer.allocateDirect(var3.length);
            field3804.position(0);
            field3804.put(var3);
            field3804.flip();
        }
        method1654();
        method1657();
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "()V", line = 145)
    private static final void method1657() {
        GL var0 = class47.field739;
        if (field3801) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3804.position(0);
            var0.glTexImage3D(32879, 0, 6410, 128, 128, 32, 0, 6410, 5121, field3804);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3800 = var1[0];
            class119.field2008 += field3804.limit() * 2;
            return;
        }
        field3806 = new int[64];
        var0.glGenTextures(64, field3806, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class47.method317(field3806[var2]);
            field3804.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3804);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class119.field2008 += field3804.limit() * 2;
    }
}
