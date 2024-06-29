import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class184 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2946 = -1;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2949 = -1;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "[I")
    public static int[] field2948 = null;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "[I")
    public static int[] field2952 = null;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2947;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2950;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Z")
    public static boolean field2951;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()V", line = 5)
    public static void method1303() {
        field2952 = null;
        field2948 = null;
        field2947 = null;
        field2950 = null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()V", line = 13)
    private static final void method1304() {
        GL var0 = class90.field1390;
        if (field2951) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2950.position(0);
            var0.glTexImage3D(32879, 0, 6410, 128, 128, 32, 0, 6410, 5121, field2950);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2946 = var1[0];
            class7.field89 += field2950.limit() * 2;
            return;
        }
        field2948 = new int[64];
        var0.glGenTextures(64, field2948, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class90.method617(field2948[var2]);
            field2950.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2950);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class7.field89 += field2950.limit() * 2;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "()V", line = 50)
    private static final void method1305() {
        GL var0 = class90.field1390;
        if (field2951) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2947.position(0);
            var0.glTexImage3D(32879, 0, 6410, 128, 128, 32, 0, 6410, 5121, field2947);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2949 = var1[0];
            class7.field89 += field2947.limit() * 2;
            return;
        }
        field2952 = new int[64];
        var0.glGenTextures(64, field2952, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class90.method617(field2952[var2]);
            field2947.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2947);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class7.field89 += field2947.limit() * 2;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "()V", line = 86)
    public static final void method1306() {
        if (field2949 != -1) {
            GL var0 = class90.field1390;
            int[] var1 = new int[] { field2949 };
            var0.glDeleteTextures(1, var1, 0);
            field2949 = -1;
            class7.field89 -= field2947.limit() * 2;
        }
        if (field2952 != null) {
            GL var2 = class90.field1390;
            var2.glDeleteTextures(64, field2952, 0);
            field2952 = null;
            class7.field89 -= field2947.limit() * 2;
        }
        if (field2946 != -1) {
            GL var3 = class90.field1390;
            int[] var4 = new int[] { field2946 };
            var3.glDeleteTextures(1, var4, 0);
            field2946 = -1;
            class7.field89 -= field2950.limit() * 2;
        }
        if (field2948 != null) {
            GL var5 = class90.field1390;
            var5.glDeleteTextures(64, field2948, 0);
            field2948 = null;
            class7.field89 -= field2950.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "()V", line = 145)
    public static final void method1307() {
        field2951 = class90.field1358;
        if (field2947 == null) {
            class137 var0 = new class137();
            byte[] var1;
            if (field2951) {
                var1 = var0.method951(128, 128, 32);
            } else {
                var1 = var0.method951(64, 64, 64);
            }
            field2947 = ByteBuffer.allocateDirect(var1.length);
            field2947.position(0);
            field2947.put(var1);
            field2947.flip();
        }
        if (field2950 == null) {
            class176 var2 = new class176();
            byte[] var3;
            if (field2951) {
                var3 = var2.method1268(128, 128, 32);
            } else {
                var3 = var2.method1268(64, 64, 64);
            }
            field2950 = ByteBuffer.allocateDirect(var3.length);
            field2950.position(0);
            field2950.put(var3);
            field2950.flip();
        }
        method1305();
        method1304();
    }
}
