import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class184 {

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field2931 = -1;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "[I")
    public static int[] field2936 = null;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field2933 = -1;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "[I")
    public static int[] field2932 = null;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2934;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2935;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Z")
    public static boolean field2930;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()V", line = 15)
    private static final void method1380() {
        GL var0 = class265.field4099;
        if (field2930) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2934.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2934);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2933 = var1[0];
            class214.field3410 += field2934.limit() * 2;
            return;
        }
        field2936 = new int[64];
        var0.glGenTextures(64, field2936, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class265.method1889(field2936[var2]);
            field2934.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2934);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class214.field3410 += field2934.limit() * 2;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "()V", line = 53)
    public static void method1381() {
        field2932 = null;
        field2936 = null;
        field2935 = null;
        field2934 = null;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "()V", line = 60)
    public static final void method1382() {
        if (field2935 == null) {
            class286 var0 = new class286();
            byte[] var1 = var0.method2026(64, 64, 64);
            field2935 = ByteBuffer.allocateDirect(var1.length);
            field2935.position(0);
            field2935.put(var1);
            field2935.flip();
        }
        if (field2934 != null) {
            return;
        }
        class237 var2 = new class237();
        byte[] var3 = var2.method1688(64, 64, 64);
        field2934 = ByteBuffer.allocateDirect(var3.length);
        field2934.position(0);
        field2934.put(var3);
        field2934.flip();
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "()V", line = 87)
    private static final void method1383() {
        GL var0 = class265.field4099;
        if (field2930) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2935.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2935);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2931 = var1[0];
            class214.field3410 += field2935.limit() * 2;
            return;
        }
        field2932 = new int[64];
        var0.glGenTextures(64, field2932, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class265.method1889(field2932[var2]);
            field2935.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2935);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class214.field3410 += field2935.limit() * 2;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "()V", line = 125)
    public static final void method1384() {
        if (field2931 != -1) {
            GL var0 = class265.field4099;
            int[] var1 = new int[] { field2931 };
            var0.glDeleteTextures(1, var1, 0);
            field2931 = -1;
            class214.field3410 -= field2935.limit() * 2;
        }
        if (field2932 != null) {
            GL var2 = class265.field4099;
            var2.glDeleteTextures(64, field2932, 0);
            field2932 = null;
            class214.field3410 -= field2935.limit() * 2;
        }
        if (field2933 != -1) {
            GL var3 = class265.field4099;
            int[] var4 = new int[] { field2933 };
            var3.glDeleteTextures(1, var4, 0);
            field2933 = -1;
            class214.field3410 -= field2934.limit() * 2;
        }
        if (field2936 != null) {
            GL var5 = class265.field4099;
            var5.glDeleteTextures(64, field2936, 0);
            field2936 = null;
            class214.field3410 -= field2934.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "()V", line = 170)
    public static final void method1385() {
        field2930 = class265.field4105;
        method1382();
        method1383();
        method1380();
    }
}
