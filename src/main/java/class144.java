import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class144 {

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "[I")
    public static int[] field2299 = null;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field2300 = -1;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field2297 = -1;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "[I")
    public static int[] field2301 = null;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2298;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2302;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Z")
    public static boolean field2303;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()V", line = 8)
    public static final void method1067() {
        if (field2302 == null) {
            class320 var0 = new class320();
            byte[] var1 = var0.method2236(64, 64, 64);
            field2302 = ByteBuffer.allocateDirect(var1.length);
            field2302.position(0);
            field2302.put(var1);
            field2302.flip();
        }
        if (field2298 != null) {
            return;
        }
        class177 var2 = new class177();
        byte[] var3 = var2.method1228(64, 64, 64);
        field2298 = ByteBuffer.allocateDirect(var3.length);
        field2298.position(0);
        field2298.put(var3);
        field2298.flip();
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "()V", line = 41)
    public static final void method1068() {
        field2303 = class272.field4287;
        method1067();
        method1072();
        method1069();
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "()V", line = 56)
    private static final void method1069() {
        GL var0 = class272.field4310;
        if (field2303) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2298.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2298);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2297 = var1[0];
            class1.field2 += field2298.limit() * 2;
            return;
        }
        field2301 = new int[64];
        var0.glGenTextures(64, field2301, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class272.method1965(field2301[var2]);
            field2298.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2298);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class1.field2 += field2298.limit() * 2;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "()V", line = 94)
    public static void method1070() {
        field2299 = null;
        field2301 = null;
        field2302 = null;
        field2298 = null;
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "()V", line = 102)
    public static final void method1071() {
        if (field2300 != -1) {
            GL var0 = class272.field4310;
            int[] var1 = new int[] { field2300 };
            var0.glDeleteTextures(1, var1, 0);
            field2300 = -1;
            class1.field2 -= field2302.limit() * 2;
        }
        if (field2299 != null) {
            GL var2 = class272.field4310;
            var2.glDeleteTextures(64, field2299, 0);
            field2299 = null;
            class1.field2 -= field2302.limit() * 2;
        }
        if (field2297 != -1) {
            GL var3 = class272.field4310;
            int[] var4 = new int[] { field2297 };
            var3.glDeleteTextures(1, var4, 0);
            field2297 = -1;
            class1.field2 -= field2298.limit() * 2;
        }
        if (field2301 != null) {
            GL var5 = class272.field4310;
            var5.glDeleteTextures(64, field2301, 0);
            field2301 = null;
            class1.field2 -= field2298.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "()V", line = 145)
    private static final void method1072() {
        GL var0 = class272.field4310;
        if (field2303) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2302.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2302);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2300 = var1[0];
            class1.field2 += field2302.limit() * 2;
            return;
        }
        field2299 = new int[64];
        var0.glGenTextures(64, field2299, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class272.method1965(field2299[var2]);
            field2302.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2302);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class1.field2 += field2302.limit() * 2;
    }
}
