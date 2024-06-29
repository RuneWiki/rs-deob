import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class207 {

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "[I")
    public static int[] field3356 = null;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "[I")
    public static int[] field3359 = null;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field3357 = -1;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field3360 = -1;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3355;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3358;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Z")
    public static boolean field3354;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()V", line = 5)
    public static final void method1401() {
        if (field3358 == null) {
            class320 var0 = new class320();
            byte[] var1 = var0.method2232(64, 64, 64);
            field3358 = ByteBuffer.allocateDirect(var1.length);
            field3358.position(0);
            field3358.put(var1);
            field3358.flip();
        }
        if (field3355 != null) {
            return;
        }
        class83 var2 = new class83();
        byte[] var3 = var2.method590(64, 64, 64);
        field3355 = ByteBuffer.allocateDirect(var3.length);
        field3355.position(0);
        field3355.put(var3);
        field3355.flip();
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()V", line = 31)
    public static final void method1402() {
        field3354 = class249.field3883;
        method1401();
        method1404();
        method1403();
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "()V", line = 38)
    private static final void method1403() {
        GL var0 = class249.field3898;
        if (field3354) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3355.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3355);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3357 = var1[0];
            class258.field4014 += field3355.limit() * 2;
            return;
        }
        field3359 = new int[64];
        var0.glGenTextures(64, field3359, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class249.method1689(field3359[var2]);
            field3355.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3355);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class258.field4014 += field3355.limit() * 2;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "()V", line = 85)
    private static final void method1404() {
        GL var0 = class249.field3898;
        if (field3354) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3358.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3358);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3360 = var1[0];
            class258.field4014 += field3358.limit() * 2;
            return;
        }
        field3356 = new int[64];
        var0.glGenTextures(64, field3356, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class249.method1689(field3356[var2]);
            field3358.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3358);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class258.field4014 += field3358.limit() * 2;
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "()V", line = 124)
    public static final void method1405() {
        if (field3360 != -1) {
            GL var0 = class249.field3898;
            int[] var1 = new int[] { field3360 };
            var0.glDeleteTextures(1, var1, 0);
            field3360 = -1;
            class258.field4014 -= field3358.limit() * 2;
        }
        if (field3356 != null) {
            GL var2 = class249.field3898;
            var2.glDeleteTextures(64, field3356, 0);
            field3356 = null;
            class258.field4014 -= field3358.limit() * 2;
        }
        if (field3357 != -1) {
            GL var3 = class249.field3898;
            int[] var4 = new int[] { field3357 };
            var3.glDeleteTextures(1, var4, 0);
            field3357 = -1;
            class258.field4014 -= field3355.limit() * 2;
        }
        if (field3359 != null) {
            GL var5 = class249.field3898;
            var5.glDeleteTextures(64, field3359, 0);
            field3359 = null;
            class258.field4014 -= field3355.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "()V", line = 166)
    public static void method1406() {
        field3356 = null;
        field3359 = null;
        field3358 = null;
        field3355 = null;
    }
}
