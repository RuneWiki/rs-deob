import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class210 {

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "[I")
    public static int[] field3544 = null;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "[I")
    public static int[] field3547 = null;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field3545 = -1;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field3549 = -1;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3543;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3546;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "Z")
    public static boolean field3548;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()V", line = 6)
    private static final void method1542() {
        GL var0 = class117.field2143;
        if (field3548) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3543.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3543);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3545 = var1[0];
            class41.field658 += field3543.limit() * 2;
            return;
        }
        field3544 = new int[64];
        var0.glGenTextures(64, field3544, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class117.method939(field3544[var2]);
            field3543.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3543);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class41.field658 += field3543.limit() * 2;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "()V", line = 44)
    public static void method1543() {
        field3547 = null;
        field3544 = null;
        field3546 = null;
        field3543 = null;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "()V", line = 53)
    public static final void method1544() {
        if (field3549 != -1) {
            GL var0 = class117.field2143;
            int[] var1 = new int[] { field3549 };
            var0.glDeleteTextures(1, var1, 0);
            field3549 = -1;
            class41.field658 -= field3546.limit() * 2;
        }
        if (field3547 != null) {
            GL var2 = class117.field2143;
            var2.glDeleteTextures(64, field3547, 0);
            field3547 = null;
            class41.field658 -= field3546.limit() * 2;
        }
        if (field3545 != -1) {
            GL var3 = class117.field2143;
            int[] var4 = new int[] { field3545 };
            var3.glDeleteTextures(1, var4, 0);
            field3545 = -1;
            class41.field658 -= field3543.limit() * 2;
        }
        if (field3544 != null) {
            GL var5 = class117.field2143;
            var5.glDeleteTextures(64, field3544, 0);
            field3544 = null;
            class41.field658 -= field3543.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "()V", line = 95)
    public static final void method1545() {
        if (field3546 == null) {
            class236 var0 = new class236();
            byte[] var1 = var0.method1677(64, 64, 64);
            field3546 = ByteBuffer.allocateDirect(var1.length);
            field3546.position(0);
            field3546.put(var1);
            field3546.flip();
        }
        if (field3543 != null) {
            return;
        }
        class309 var2 = new class309();
        byte[] var3 = var2.method2093(64, 64, 64);
        field3543 = ByteBuffer.allocateDirect(var3.length);
        field3543.position(0);
        field3543.put(var3);
        field3543.flip();
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "()V", line = 122)
    public static final void method1546() {
        field3548 = class117.field2132;
        method1545();
        method1547();
        method1542();
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "()V", line = 137)
    private static final void method1547() {
        GL var0 = class117.field2143;
        if (field3548) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3546.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3546);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3549 = var1[0];
            class41.field658 += field3546.limit() * 2;
            return;
        }
        field3547 = new int[64];
        var0.glGenTextures(64, field3547, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class117.method939(field3547[var2]);
            field3546.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3546);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class41.field658 += field3546.limit() * 2;
    }
}
