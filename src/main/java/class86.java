import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class86 {

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1393 = -1;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "[I")
    public static int[] field1395 = null;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[I")
    public static int[] field1390 = null;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1394 = -1;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1392;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1396;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Z")
    public static boolean field1391;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V", line = 10)
    public static final void method597() {
        if (field1393 != -1) {
            GL var0 = class281.field4839;
            int[] var1 = new int[] { field1393 };
            var0.glDeleteTextures(1, var1, 0);
            field1393 = -1;
            class139.field2326 -= field1396.limit() * 2;
        }
        if (field1390 != null) {
            GL var2 = class281.field4839;
            var2.glDeleteTextures(64, field1390, 0);
            field1390 = null;
            class139.field2326 -= field1396.limit() * 2;
        }
        if (field1394 != -1) {
            GL var3 = class281.field4839;
            int[] var4 = new int[] { field1394 };
            var3.glDeleteTextures(1, var4, 0);
            field1394 = -1;
            class139.field2326 -= field1392.limit() * 2;
        }
        if (field1395 != null) {
            GL var5 = class281.field4839;
            var5.glDeleteTextures(64, field1395, 0);
            field1395 = null;
            class139.field2326 -= field1392.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()V", line = 53)
    public static final void method598() {
        if (field1396 == null) {
            class311 var0 = new class311();
            byte[] var1 = var0.method2160(64, 64, 64);
            field1396 = ByteBuffer.allocateDirect(var1.length);
            field1396.position(0);
            field1396.put(var1);
            field1396.flip();
        }
        if (field1392 != null) {
            return;
        }
        class110 var2 = new class110();
        byte[] var3 = var2.method845(64, 64, 64);
        field1392 = ByteBuffer.allocateDirect(var3.length);
        field1392.position(0);
        field1392.put(var3);
        field1392.flip();
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()V", line = 83)
    public static final void method599() {
        field1391 = class281.field4832;
        method598();
        method602();
        method601();
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()V", line = 93)
    public static void method600() {
        field1390 = null;
        field1395 = null;
        field1396 = null;
        field1392 = null;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "()V", line = 109)
    private static final void method601() {
        GL var0 = class281.field4839;
        if (field1391) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field1392.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field1392);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field1394 = var1[0];
            class139.field2326 += field1392.limit() * 2;
            return;
        }
        field1395 = new int[64];
        var0.glGenTextures(64, field1395, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class281.method1953(field1395[var2]);
            field1392.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field1392);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class139.field2326 += field1392.limit() * 2;
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "()V", line = 146)
    private static final void method602() {
        GL var0 = class281.field4839;
        if (field1391) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field1396.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field1396);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field1393 = var1[0];
            class139.field2326 += field1396.limit() * 2;
            return;
        }
        field1390 = new int[64];
        var0.glGenTextures(64, field1390, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class281.method1953(field1390[var2]);
            field1396.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field1396);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class139.field2326 += field1396.limit() * 2;
    }
}
