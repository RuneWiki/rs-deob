import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class129 {

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "[I")
    public static int[] field2356 = null;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "[I")
    public static int[] field2360 = null;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field2357 = -1;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field2359 = -1;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2354;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2355;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Z")
    public static boolean field2358;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()V", line = 5)
    public static final void method1018() {
        if (field2355 == null) {
            class267 var0 = new class267();
            byte[] var1 = var0.method1910(64, 64, 64);
            field2355 = ByteBuffer.allocateDirect(var1.length);
            field2355.position(0);
            field2355.put(var1);
            field2355.flip();
        }
        if (field2354 != null) {
            return;
        }
        class65 var2 = new class65();
        byte[] var3 = var2.method564(64, 64, 64);
        field2354 = ByteBuffer.allocateDirect(var3.length);
        field2354.position(0);
        field2354.put(var3);
        field2354.flip();
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "()V", line = 32)
    public static final void method1019() {
        if (field2357 != -1) {
            GL var0 = class97.field1801;
            int[] var1 = new int[] { field2357 };
            var0.glDeleteTextures(1, var1, 0);
            field2357 = -1;
            class308.field5471 -= field2355.limit() * 2;
        }
        if (field2356 != null) {
            GL var2 = class97.field1801;
            var2.glDeleteTextures(64, field2356, 0);
            field2356 = null;
            class308.field5471 -= field2355.limit() * 2;
        }
        if (field2359 != -1) {
            GL var3 = class97.field1801;
            int[] var4 = new int[] { field2359 };
            var3.glDeleteTextures(1, var4, 0);
            field2359 = -1;
            class308.field5471 -= field2354.limit() * 2;
        }
        if (field2360 != null) {
            GL var5 = class97.field1801;
            var5.glDeleteTextures(64, field2360, 0);
            field2360 = null;
            class308.field5471 -= field2354.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "()V", line = 79)
    private static final void method1020() {
        GL var0 = class97.field1801;
        if (field2358) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2355.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2355);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2357 = var1[0];
            class308.field5471 += field2355.limit() * 2;
            return;
        }
        field2356 = new int[64];
        var0.glGenTextures(64, field2356, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class97.method803(field2356[var2]);
            field2355.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2355);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class308.field5471 += field2355.limit() * 2;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "()V", line = 119)
    public static final void method1021() {
        field2358 = class97.field1799;
        method1018();
        method1020();
        method1022();
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "()V", line = 132)
    private static final void method1022() {
        GL var0 = class97.field1801;
        if (field2358) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2354.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2354);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2359 = var1[0];
            class308.field5471 += field2354.limit() * 2;
            return;
        }
        field2360 = new int[64];
        var0.glGenTextures(64, field2360, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class97.method803(field2360[var2]);
            field2354.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2354);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class308.field5471 += field2354.limit() * 2;
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "()V", line = 169)
    public static void method1023() {
        field2356 = null;
        field2360 = null;
        field2355 = null;
        field2354 = null;
    }
}
