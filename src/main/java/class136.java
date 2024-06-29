import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class136 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "[I")
    public static int[] field2199 = null;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "[I")
    public static int[] field2198 = null;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field2202 = -1;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field2203 = -1;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2200;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2201;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Z")
    public static boolean field2197;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()V", line = 15)
    public static final void method901() {
        field2197 = class264.field4322;
        if (field2201 == null) {
            class175 var0 = new class175();
            byte[] var1;
            if (field2197) {
                var1 = var0.method1123(128, 128, 32);
            } else {
                var1 = var0.method1123(64, 64, 64);
            }
            field2201 = ByteBuffer.allocateDirect(var1.length);
            field2201.position(0);
            field2201.put(var1);
            field2201.flip();
        }
        if (field2200 == null) {
            class80 var2 = new class80();
            byte[] var3;
            if (field2197) {
                var3 = var2.method553(128, 128, 32);
            } else {
                var3 = var2.method553(64, 64, 64);
            }
            field2200 = ByteBuffer.allocateDirect(var3.length);
            field2200.position(0);
            field2200.put(var3);
            field2200.flip();
        }
        method902();
        method905();
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "()V", line = 57)
    private static final void method902() {
        GL var0 = class264.field4313;
        if (field2197) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2201.position(0);
            var0.glTexImage3D(32879, 0, 6410, 128, 128, 32, 0, 6410, 5121, field2201);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2203 = var1[0];
            class143.field2279 += field2201.limit() * 2;
            return;
        }
        field2198 = new int[64];
        var0.glGenTextures(64, field2198, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class264.method1722(field2198[var2]);
            field2201.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2201);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class143.field2279 += field2201.limit() * 2;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "()V", line = 93)
    public static void method903() {
        field2198 = null;
        field2199 = null;
        field2201 = null;
        field2200 = null;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "()V", line = 99)
    public static final void method904() {
        if (field2203 != -1) {
            GL var0 = class264.field4313;
            int[] var1 = new int[] { field2203 };
            var0.glDeleteTextures(1, var1, 0);
            field2203 = -1;
            class143.field2279 -= field2201.limit() * 2;
        }
        if (field2198 != null) {
            GL var2 = class264.field4313;
            var2.glDeleteTextures(64, field2198, 0);
            field2198 = null;
            class143.field2279 -= field2201.limit() * 2;
        }
        if (field2202 != -1) {
            GL var3 = class264.field4313;
            int[] var4 = new int[] { field2202 };
            var3.glDeleteTextures(1, var4, 0);
            field2202 = -1;
            class143.field2279 -= field2200.limit() * 2;
        }
        if (field2199 != null) {
            GL var5 = class264.field4313;
            var5.glDeleteTextures(64, field2199, 0);
            field2199 = null;
            class143.field2279 -= field2200.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "()V", line = 145)
    private static final void method905() {
        GL var0 = class264.field4313;
        if (field2197) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2200.position(0);
            var0.glTexImage3D(32879, 0, 6410, 128, 128, 32, 0, 6410, 5121, field2200);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2202 = var1[0];
            class143.field2279 += field2200.limit() * 2;
            return;
        }
        field2199 = new int[64];
        var0.glGenTextures(64, field2199, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class264.method1722(field2199[var2]);
            field2200.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2200);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class143.field2279 += field2200.limit() * 2;
    }
}
